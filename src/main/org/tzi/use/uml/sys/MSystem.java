/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2004 Mark Richters, University of Bremen
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */

// $Id: MSystem.java 3950 2012-10-31 18:27:29Z lhamann $

package org.tzi.use.uml.sys;

import static org.tzi.use.util.StringUtil.inQuotes;

import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import javax.swing.event.EventListenerList;

import org.tzi.use.gen.tool.GGenerator;
import org.tzi.use.uml.mm.MAssociation;
import org.tzi.use.uml.mm.MAssociationClass;
import org.tzi.use.uml.mm.MAttribute;
import org.tzi.use.uml.mm.MClass;
import org.tzi.use.uml.mm.MModel;
import org.tzi.use.uml.mm.MOperation;
import org.tzi.use.uml.mm.MPrePostCondition;
import org.tzi.use.uml.ocl.expr.EvalContext;
import org.tzi.use.uml.ocl.expr.Evaluator;
import org.tzi.use.uml.ocl.expr.MultiplicityViolationException;
import org.tzi.use.uml.ocl.expr.VarDecl;
import org.tzi.use.uml.ocl.type.Type;
import org.tzi.use.uml.ocl.value.BooleanValue;
import org.tzi.use.uml.ocl.value.Value;
import org.tzi.use.uml.ocl.value.VarBindings;
import org.tzi.use.uml.sys.MSystemState.DeleteObjectResult;
import org.tzi.use.uml.sys.events.AttributeAssignedEvent;
import org.tzi.use.uml.sys.events.Event;
import org.tzi.use.uml.sys.events.LinkDeletedEvent;
import org.tzi.use.uml.sys.events.LinkInsertedEvent;
import org.tzi.use.uml.sys.events.ObjectCreatedEvent;
import org.tzi.use.uml.sys.events.ObjectDestroyedEvent;
import org.tzi.use.uml.sys.events.OperationEnteredEvent;
import org.tzi.use.uml.sys.events.OperationExitedEvent;
import org.tzi.use.uml.sys.ppcHandling.PPCHandler;
import org.tzi.use.uml.sys.ppcHandling.PostConditionCheckFailedException;
import org.tzi.use.uml.sys.ppcHandling.PreConditionCheckFailedException;
import org.tzi.use.uml.sys.soil.MAttributeAssignmentStatement;
import org.tzi.use.uml.sys.soil.MLinkDeletionStatement;
import org.tzi.use.uml.sys.soil.MLinkInsertionStatement;
import org.tzi.use.uml.sys.soil.MObjectDestructionStatement;
import org.tzi.use.uml.sys.soil.MObjectRestorationStatement;
import org.tzi.use.uml.sys.soil.MRValue;
import org.tzi.use.uml.sys.soil.MRValueExpression;
import org.tzi.use.uml.sys.soil.MStatement;
import org.tzi.use.uml.sys.soil.MVariableAssignmentStatement;
import org.tzi.use.uml.sys.soil.MVariableDestructionStatement;
import org.tzi.use.uml.sys.soil.SoilEvaluationContext;
import org.tzi.use.util.Log;
import org.tzi.use.util.StringUtil;
import org.tzi.use.util.UniqueNameGenerator;
import org.tzi.use.util.soil.StateDifference;
import org.tzi.use.util.soil.VariableEnvironment;
import org.tzi.use.util.soil.exceptions.EvaluationFailedException;

/**
 * A system maintains a system state and provides functionality for
 * doing state transitions.
 *
 * @version     $ProjectVersion: 0.393 $
 * @author      Fabian Buettner 
 * @author      Mark Richters 
 */
public final class MSystem {
    private MModel fModel;  // The model of this system. 
    private MSystemState fCurrentState; // The current system state. 
    private Map<String, MObject> fObjects;   // The set of all objects
    private UniqueNameGenerator fUniqueNameGenerator; // creation of object names
    protected EventListenerList fListenerList = new EventListenerList();
    private MOperationCall lastOperationCall; // last called operation (used by test suite)
    private GGenerator fGenerator;    // snapshot generator
    /** the variables of this system */
    private VariableEnvironment fVariableEnvironment;
    /** TODO */
    private PPCHandler fPPCHandlerOverride;
    /** the stack of evaluation results of statements */
    private Deque<StatementEvaluationResult> fStatementEvaluationResults;
    /** the operation-call stack */
    private Deque<MOperationCall> fCallStack;
    /** TODO */
    private Deque<MStatement> fRedoStack;
    /** TODO */
    private Deque<StatementEvaluationResult> fCurrentlyEvaluatedStatements;

    /**
     * True, if this system is used inside a test suite.
     * Some operations need this information, e.g., the pre state
     * has to be saved when there is no post condition  
     */
    private boolean isRunningTestSuite;
    
    private Stack<MSystemState> variationPointsStates = new Stack<MSystemState>();
    
    private Stack<VariableEnvironment> variationPointsVars = new Stack<VariableEnvironment>();
    
    /**
     * constructs a new MSystem
     * @param model the model of this system
     */
    public MSystem(MModel model) {
        fModel = model;
        init();
    }

    private void init() {
        fObjects = new HashMap<String, MObject>();
        fUniqueNameGenerator = new UniqueNameGenerator();
        fCurrentState = new MSystemState(fUniqueNameGenerator.generate("state#"), this);
        fGenerator = new GGenerator(this);
        fVariableEnvironment = new VariableEnvironment(fCurrentState);
        fStatementEvaluationResults = new ArrayDeque<StatementEvaluationResult>();
        fCallStack = new ArrayDeque<MOperationCall>();
        fRedoStack = new ArrayDeque<MStatement>();
        fCurrentlyEvaluatedStatements = new ArrayDeque<StatementEvaluationResult>();
    }

    /**
	 * Resets the system to its initial state.
	 */
	public void reset() {
	    init();
	}

	/**
     * Returns the current system state.
     */
    public MSystemState state() {
        return fCurrentState;
    }

    /**
     * Returns the system's model.
     */
    public MModel model() {
        return fModel;
    }

    /**
     * Returns the system's instance generator.
     */
    public GGenerator generator() {
        return fGenerator;
    }
    
    public VarBindings varBindings() {
		return fVariableEnvironment.constructVarBindings();
	}

	public VariableEnvironment getVariableEnvironment() {
    	return fVariableEnvironment;
    }
    
    
    public void addChangeListener(StateChangeListener l) {
        fListenerList.add(StateChangeListener.class, l);
    }
    
    public void removeChangeListener(StateChangeListener l) {
        fListenerList.remove(StateChangeListener.class, l);
    }
    
    public void registerPPCHandlerOverride(PPCHandler ppcHandlerOverride) {
    	fPPCHandlerOverride = ppcHandlerOverride;
    }
    
    public UniqueNameGenerator getUniqueNameGenerator() {
    	return this.fUniqueNameGenerator;
    }
    
    /**
     * Creates and adds a new object to the system. The name of the
     * object may be null in which case a unique name is automatically
     * generated.
     *
     * @return the created object.  
     */
    MObject createObject(MClass cls, String name) throws MSystemException {
        if (cls.isAbstract() )
            throw new MSystemException("The abstract class `" + cls.name() + 
                                       "' cannot be instantiated.");
    
        // create new object and initial state
        if (name == null ) {
            name = uniqueObjectNameForClass(cls.name());
        } else if (fObjects.containsKey(name) )
            throw new MSystemException("An object with name `" + name + 
                                       "' already exists.");
        
        MObject obj = new MObjectImpl(cls, name);
        addObject(obj);
        return obj;
    }

    void addObject(MObject obj) {
        fObjects.put(obj.name(), obj);
    }

    void deleteObject(MObject obj) {
        fObjects.remove(obj.name());
    }
    
    /**
     * TODO
     * 
     * @param operationCall
     */
    private void evaluatePreConditions(EvalContext ctx, MOperationCall operationCall) {

        List<MPrePostCondition> preConditions = operationCall.getOperation().preConditions();

        LinkedHashMap<MPrePostCondition, Boolean> results = new LinkedHashMap<MPrePostCondition, Boolean>(
                preConditions.size());

        for (MPrePostCondition preCondition : preConditions) {
            Evaluator oclEvaluator = new Evaluator();

            VarBindings b = (operationCall.requiresVariableFrameInEnvironment() ? fVariableEnvironment
                    .constructVarBindings() : ctx.varBindings());

            Value evalResult = oclEvaluator.eval(preCondition.expression(), fCurrentState, b);

            boolean conditionPassed = (evalResult.isDefined() && evalResult.type().isBoolean() && ((BooleanValue) evalResult)
                    .isTrue());

            results.put(preCondition, conditionPassed);
        }

        operationCall.setPreConditionsCheckResult(results);
    }
    
    /**
     * TODO
     * @param operationCall
     */
    private void evaluatePostConditions(EvalContext ctx, MOperationCall operationCall) {
    	
    	List<MPrePostCondition> postConditions = 
			operationCall.getOperation().postConditions();
    	
    	LinkedHashMap<MPrePostCondition, Boolean> results = 
    		new LinkedHashMap<MPrePostCondition, Boolean>(postConditions.size());
    	
		VarBindings b = (operationCall.requiresVariableFrameInEnvironment() ? fVariableEnvironment
				.constructVarBindings() : ctx.varBindings());
		
		if (!operationCall.requiresVariableFrameInEnvironment() && operationCall.getResultValue() != null) {
			b.push("result", operationCall.getResultValue());
		}
		
    	operationCall.setVarBindings(b);
    	boolean conditionPassed;
    	
    	for (MPrePostCondition postCondition : postConditions) {
			Evaluator oclEvaluator = new Evaluator();
			
			try {
				Value evalResult = 
					oclEvaluator.eval(
							postCondition.expression(), 
							operationCall.getPreState(),
							fCurrentState,
							operationCall.getVarBindings());
				
				conditionPassed = 
					(evalResult.isDefined() && 
							evalResult.type().isBoolean() &&
							((BooleanValue)evalResult).isTrue());
			} catch (MultiplicityViolationException e) {
				conditionPassed = false;
			}
			results.put(postCondition, conditionPassed);
    	}
    	
    	if (!operationCall.requiresVariableFrameInEnvironment() && operationCall.getResultValue() != null) {
			b.pop();
		}
    	
    	operationCall.setPostConditionsCheckResult(results);
    }
    
    
    /**
     * TODO
     * @return
     */
    public MOperationCall getCurrentOperation() {
    	return fCallStack.peek();
    }
    

    /**
	 * TODO
	 * @param self
	 * @param operation
	 * @param arguments
	 * @param ppcHandler
	 * @param output
	 * @throws MSystemException 
	 */
	public void enterQueryOperation(EvalContext ctx, MOperationCall operationCall, boolean isOpenter) throws MSystemException {
						
		assertParametersValid(operationCall);
	
		fCallStack.push(operationCall);
		
		assertPreConditions(ctx, operationCall);
		
		copyPreStateIfNeccessary(operationCall);
		operationCall.setEnteredSuccessfully(true);
	}

	/**
	 * TODO
	 * @param self
	 * @param operation
	 * @param arguments
	 * @param ppcHandler
	 * @param output
	 * @throws MSystemException 
	 */
	public void enterNonQueryOperation(
			SoilEvaluationContext context,
			StatementEvaluationResult result,
			MOperationCall operationCall, 
			boolean isOpenter) throws MSystemException {
						
		assertParametersValid(operationCall);
		
		// set up variable environment
        fVariableEnvironment.pushFrame(isOpenter);
        fVariableEnvironment.assign("self", operationCall.getSelf().value());
        for (int i = 0; i < operationCall.getOperation().paramList().size();++i) {
        	fVariableEnvironment.assign(operationCall.getOperation().paramList().varDecl(i).name(), operationCall.getArguments()[i]);
        }
		
		if (getCurrentStatement() != null) {
			result.appendEvent(new OperationEnteredEvent(operationCall));
		}
	
		fCallStack.push(operationCall);
		
		EvalContext ctx = new EvalContext(
				fCurrentState, 
				fCurrentState, 
				fVariableEnvironment.constructVarBindings(), null, "");
		assertPreConditions(ctx, operationCall);
		
		copyPreStateIfNeccessary(operationCall);
		operationCall.setEnteredSuccessfully(true);
	}
	
	public MOperationCall exitQueryOperation(EvalContext ctx, Value resultValue) throws MSystemException {
		
		MOperationCall operationCall = getCurrentOperation();
		if (operationCall == null) {
			throw new MSystemException("Call stack is empty.");
		}
		
		if (operationCall.executionHasFailed()) {
			MOperationCall currentOperation = getCurrentOperation();
            if (currentOperation == null) throw new RuntimeException("Cannot exit without a current operation!");
            currentOperation.setExited(true);
            fCallStack.pop();
			return operationCall;
		}
		
		try {
			assertResultValueValid(resultValue, operationCall.getOperation());
			if (resultValue != null) operationCall.setResultValue(resultValue);	
		
			assertPostConditions(ctx, operationCall);
		
			operationCall.setExitedSuccessfully(true);
		
			return operationCall;
		} finally {
			MOperationCall currentOperation = getCurrentOperation();
            if (currentOperation == null) throw new RuntimeException("Cannot exit without a current operation!");
            currentOperation.setExited(true);
            fCallStack.pop();
		}
	}

	public MOperationCall exitNonQueryOperation(
			SoilEvaluationContext context,
			StatementEvaluationResult result,
			Value resultValue) throws MSystemException {
		
		MOperationCall operationCall = getCurrentOperation();
		if (operationCall == null) {
			throw new MSystemException("Call stack is empty.");
		}
		
		if (operationCall.executionHasFailed()) {
			exitCurrentNonQueryOperation(context, result);
			return operationCall;
		}
		
		try {
			assertResultValueValid(resultValue, operationCall.getOperation());
			if (resultValue != null) operationCall.setResultValue(resultValue);	
		
			EvalContext ctx = new EvalContext(
					fCurrentState, 
					fCurrentState,
					fVariableEnvironment.constructVarBindings(), null, "");
			assertPostConditions(ctx, operationCall);
		
			operationCall.setExitedSuccessfully(true);
		
			return operationCall;
		} finally {
			exitCurrentNonQueryOperation(context, result);
		}
	}

	
	/**
	 * Evaluate and check all preconditions of an operation call. 
	 * If any is not fulfilled, an exception is raised.
	 * Before the exception is raised, the PPC handler (if any) is invoked.
	 * @param operationCall
	 * @throws MSystemException
	 */
	private void assertPreConditions(EvalContext ctx, MOperationCall operationCall)
			throws MSystemException {
		evaluatePreConditions(ctx, operationCall);
		
		PPCHandler ppcHandler = determinePPCHandler(operationCall);
		try {
			ppcHandler.handlePreConditions(this, operationCall);
		} catch (PreConditionCheckFailedException e) {
			fCallStack.pop();
			if (operationCall.requiresVariableFrameInEnvironment()) {
				fVariableEnvironment.popFrame();
			}
			throw new MSystemException(e.getMessage(), e);
		}
	}

	private PPCHandler determinePPCHandler(MOperationCall operationCall) {
		// make sure we have a ppc handler
		PPCHandler ppcHandler;
		if (fPPCHandlerOverride != null) {
			ppcHandler = fPPCHandlerOverride;
		} else if (operationCall.hasPreferredPPCHandler()) {
			ppcHandler = operationCall.getPreferredPPCHandler();
		} else {
			ppcHandler = operationCall.getDefaultPPCHandler();
		}
		return ppcHandler;
	}

	/**
	 * Creates a copy of the current system state, if there are any postconditions for this operation or
	 * if currently a test suite is executed.
	 * @param operationCall
	 */
	private void copyPreStateIfNeccessary(MOperationCall operationCall) {
		// if the post conditions of this operations require a pre state 
		// require a state copy, create it
		if (isRunningTestSuite 
			|| operationCall.hasPostConditions()
			&& operationCall.getOperation().postConditionsRequirePreState()) {
			
			operationCall.setPreState(
					new MSystemState(
							fUniqueNameGenerator.generate("state#"), 
							fCurrentState));
		} else {
			operationCall.setPreState(fCurrentState);
		}
	}

	
	/**
	 * Assert that the actual parameter values in this opcall are consistent with the operation.
	 * @param operationCall
	 * @throws MSystemException
	 */
	private void assertParametersValid(MOperationCall operationCall)
			throws MSystemException {
		if (operationCall.getArguments().length != operationCall.getOperation().paramList().size()) {
			throw new MSystemException(
					"Number of arguments does not match declaration of " +
					" operation " +
					StringUtil.inQuotes(operationCall.getOperation().name()) +
					" in class " +
					StringUtil.inQuotes(operationCall.getSelf().cls().name()) +
					". Expected " +
					operationCall.getOperation().paramList().size() +
					" arguments" + ((operationCall.getArguments().length == 1) ? "" : "s") +
					", found " +
					operationCall.getArguments().length +
					".");
		}
		
		for (int i = 0; i < operationCall.getOperation().paramList().size(); ++i) {
			
			VarDecl parameter = operationCall.getOperation().paramList().varDecl(i);
			Value argument = operationCall.getArguments()[i];
			
			Type expectedType = parameter.type();
			Type foundType = argument.type();
			
			if (!foundType.isSubtypeOf(expectedType)) {
	
				throw new MSystemException(
						"Type mismatch in argument " +
						i +
						". Expected type " +
						StringUtil.inQuotes(expectedType) +
						", found " +
						StringUtil.inQuotes(foundType) +
						".");
			}				
		}
	}


	/** 
	 * Assert that the result value of this operation call is consistent with the operation.
	 * @param resultValue
	 * @param forceExit
	 * @param operation
	 * @throws MSystemException
	 */
	private void assertResultValueValid(Value resultValue, MOperation operation) throws MSystemException {
		if (operation.hasResultType()) {
			if (resultValue == null) {
				throw new MSystemException(
	            		"Result value of type " +
	            		inQuotes(operation.resultType()) +
	            		" required on exit of operation " +
	            		inQuotes(operation) +
	            		"." );
				
			// result value has incompatible type
	        } else if (!resultValue.type().isSubtypeOf(operation.resultType())) {
	        	throw new MSystemException(
	        			"Result value type " +
	        			inQuotes(resultValue.type()) +
	        			" does not match operation result type " +
	        			inQuotes(operation.resultType()) +
	        			"." );
	        // result value is of correct type
	        } 
		// operation has no return value
	    } else {
	    	// redundant result value, just give a warning
	    	if (resultValue != null) {
	    		Log.out().println(
	    				"Warning: Result value " + 
	    				inQuotes(resultValue) + 
	    				" is ignored, since operation " + 
	    				inQuotes(operation) +
	    				" is not defined to return a value.");
	    	}
	    }
	}

	/**
	 * Evaluate and check all postconditions of an operation call. 
	 * If any is not fulfilled, an exception is raised.
	 * Before the exception is raised, the PPC handler (if any) is invoked.
	 * @param operationCall
	 * @throws MSystemException
	 */
	private void assertPostConditions(EvalContext ctx, MOperationCall operationCall)
			throws MSystemException {
		evaluatePostConditions(ctx, operationCall);
		PPCHandler ppcHandler = determinePPCHandler(operationCall);
		try {
			ppcHandler.handlePostConditions(this, operationCall);
		} catch (PostConditionCheckFailedException e) {
			throw(new MSystemException(e.getMessage()));
		}
	}
	
	
	/**
	 * TODO
	 */
	private void exitCurrentNonQueryOperation(SoilEvaluationContext context,
			StatementEvaluationResult result) {
		MOperationCall currentOperation = getCurrentOperation();
		if (currentOperation == null) throw new RuntimeException("Cannot exit without a current operation!");
		currentOperation.setExited(true);
		fCallStack.pop();
		MStatement currentStatement = getCurrentStatement();
		if (currentStatement != null) {
			result.appendEvent(new OperationExitedEvent(currentOperation));
		}
		fVariableEnvironment.popFrame();
	}

	
	/**
     * Returns a unique name that can be used for a new object of the
     * given class.  
     */
    public String uniqueObjectNameForClass(String clsName) {
        return fUniqueNameGenerator.generate(clsName);
    }
    
    /**
     * Creates an object in the current system state, captures additional
     * information about the execution.
     * 
     * @param objectClass
     * @param objectName
     * @throws MSystemException
     */
    public MObject createObject(StatementEvaluationResult result, MClass objectClass,
            String objectName) throws MSystemException {

        MObject newObject = fCurrentState.createObject(objectClass, objectName);
        result.getStateDifference().addNewObject(newObject);
        result.prependToInverseStatement(new MObjectDestructionStatement(newObject.value()));
        result.appendEvent(new ObjectCreatedEvent(newObject));
        return newObject;
    }

    /**
     * Destroys an object in the current system state and keeps track of the changes.
     * @throws MSystemException
     */
    public void destroyObject(StatementEvaluationResult result, MObject object)
            throws MSystemException {

        // we cannot destroy an object with an active operation. we need to
        // check whether this object, or any of the link objects possibly
        // connected to this object have an active operation
        Set<MObject> objectsAffectedByDeletion = fCurrentState
                .getObjectsAffectedByDestruction(object);

        for (MObject affectedObject : objectsAffectedByDeletion) {
            if (hasActiveOperation(affectedObject)) {
                throw new MSystemException("Object " + StringUtil.inQuotes(affectedObject)
                        + " has an active operation and thus cannot be deleted.");
            }
        }

        // .deleteObject() also takes care of the links this
        // object has been participating in
        DeleteObjectResult deleteResult = fCurrentState.deleteObject(object);
        result.getStateDifference().addDeleteResult(deleteResult);

        Map<MObject, List<String>> undefinedTopLevelReferences = new HashMap<MObject, List<String>>();

        for (MObject destroyedObject : deleteResult.getRemovedObjects()) {
            List<String> topLevelReferences = fVariableEnvironment
                    .getTopLevelReferencesTo(destroyedObject);

            if (!topLevelReferences.isEmpty()) {
                undefinedTopLevelReferences.put(destroyedObject, topLevelReferences);
            }

            fVariableEnvironment.undefineReferencesTo(destroyedObject);
        }

        result.prependToInverseStatement(new MObjectRestorationStatement(deleteResult,
                undefinedTopLevelReferences));

        if (object instanceof MLink) {
            MLink link = (MLink) object;
            result.appendEvent(new LinkDeletedEvent(link.association(), Arrays.asList(link
                    .linkedObjectsAsArray())));
        } else {
            result.appendEvent(new ObjectDestroyedEvent(object));
        }

        Set<MLink> deletedLinks = new HashSet<MLink>(deleteResult.getRemovedLinks());
        Set<MObject> deletedObjects = new HashSet<MObject>(deleteResult.getRemovedObjects());

        deletedLinks.remove(object);
        deletedObjects.remove(object);

        for (MObject o : deletedObjects) {
            if (o instanceof MLink) {
                deletedLinks.add((MLink) o);
            }
        }

        deletedObjects.removeAll(deletedLinks);

        for (MLink l : deletedLinks) {
            result.appendEvent(new LinkDeletedEvent(l.association(), Arrays.asList(l
                    .linkedObjectsAsArray())));
        }

        for (MObject o : deletedObjects) {
            result.appendEvent(new ObjectDestroyedEvent(o));
        }
    }

    /**
     * Inserts a link between objects to the current state and keeps track of
     * the changes.
     * 
     * @param association
     * @param participants
     * @param qualifierValues
     * @throws EvaluationFailedException
     */
    public MLink createLink(StatementEvaluationResult result, MAssociation association,
            List<MObject> participants, List<List<Value>> qualifierValues) throws MSystemException {

        MLink newLink = fCurrentState.createLink(association, participants, qualifierValues);

        result.getStateDifference().addNewLink(newLink);

        List<MRValue> wrappedParticipants = new ArrayList<MRValue>(participants.size());

        for (MObject participant : participants) {
            wrappedParticipants.add(new MRValueExpression(participant));
        }

        List<List<MRValue>> wrappedQualifier = new LinkedList<List<MRValue>>();

        for (List<Value> qValues : qualifierValues) {
            List<MRValue> wrappedQValues;
            if (qValues.size() == 0) {
                wrappedQValues = Collections.emptyList();
            } else {
                wrappedQValues = new LinkedList<MRValue>();
                for (Value qValue : qValues) {
                    wrappedQValues.add(new MRValueExpression(qValue));
                }
            }
            wrappedQualifier.add(wrappedQValues);
        }

        result.prependToInverseStatement(new MLinkDeletionStatement(association,
                wrappedParticipants, wrappedQualifier));

        result.appendEvent(new LinkInsertedEvent(association, participants));

        return newLink;
    }

    /**
     * Deletes a link in the current system state and keeps track of the changes.
     * 
     * @param association
     * @param participants
     * @throws MSystemException
     * @throws EvaluationFailedException
     */
    public void deleteLink(StatementEvaluationResult result, MAssociation association,
            List<MObject> participants, List<List<Value>> qualifierValues) throws MSystemException {

        // we need to find out if this is actually a link object, since we need
        // to call destroyObject in that case to get the correct undo
        // statement
        MLink link = fCurrentState.linkBetweenObjects(association, participants, qualifierValues);

        if ((link != null) && (link instanceof MLinkObject)) {
            destroyObject(result, (MLinkObject) link);
            return;
        }

        result.getStateDifference().addDeleteResult(
                fCurrentState.deleteLink(association, participants, qualifierValues));

        List<MRValue> wrappedParticipants = new ArrayList<MRValue>(participants.size());

        for (MObject participant : participants) {
            wrappedParticipants.add(new MRValueExpression(participant));
        }

        List<List<MRValue>> wrappedQualifier;
        if (qualifierValues == null || qualifierValues.isEmpty()) {
            wrappedQualifier = Collections.emptyList();
        } else {
            wrappedQualifier = new ArrayList<List<MRValue>>(qualifierValues.size());

            for (List<Value> endQualifier : qualifierValues) {
                List<MRValue> endQualifierValues;

                if (endQualifier == null || endQualifier.isEmpty()) {
                    endQualifierValues = Collections.emptyList();
                } else {
                    endQualifierValues = new ArrayList<MRValue>();
                    for (Value v : endQualifier) {
                        endQualifierValues.add(new MRValueExpression(v));
                    }
                }

                wrappedQualifier.add(endQualifierValues);
            }
        }
        result.prependToInverseStatement(new MLinkInsertionStatement(association,
                wrappedParticipants, wrappedQualifier));

        result.appendEvent(new LinkDeletedEvent(association, participants));
    }

    /**
     * Creates a link object in the current system state and keeps track of the changes.
     * 
     * @param associationClass
     * @param linkObjectName
     * @param participants
     * @return
     * @throws MSystemException
     * @throws EvaluationFailedException
     */
    public MLinkObject createLinkObject(StatementEvaluationResult result,
            MAssociationClass associationClass, String linkObjectName, List<MObject> participants,
            List<List<Value>> qualifierValues) throws MSystemException {

        MLinkObject newLinkObject;
        newLinkObject = fCurrentState.createLinkObject(associationClass, linkObjectName,
                participants, qualifierValues);

        result.getStateDifference().addNewLinkObject(newLinkObject);

        result.prependToInverseStatement(new MObjectDestructionStatement(newLinkObject.value()));

        result.appendEvent(new LinkInsertedEvent(associationClass, participants));

        return newLinkObject;
    }

    /**
     * Assigns an attribute value of an object in the current system state and keeps track of the changes.
     * 
     * @param object
     * @param attribute
     * @param value
     * @throws MSystemException
     * @throws EvaluationFailedException
     */
    public void assignAttribute(StatementEvaluationResult result, MObject object,
            MAttribute attribute, Value value) throws MSystemException {

        Value oldValue;

        try {
            oldValue = object.state(fCurrentState).attributeValue(attribute);
            object.state(fCurrentState).setAttributeValue(attribute, value);
        } catch (IllegalArgumentException e) {
            throw new MSystemException(e.getMessage());
        }

        result.getStateDifference().addModifiedObject(object);

        result.prependToInverseStatement(new MAttributeAssignmentStatement(object, attribute,
                oldValue));

        result.appendEvent(new AttributeAssignedEvent(object, attribute, value));
    }

    /**
     * TODO
     * 
     * @param variableName
     * @param value
     */
    public void assignVariable(StatementEvaluationResult result, String variableName, Value value) {

        Value oldValue = fVariableEnvironment.lookUp(variableName);

        if (oldValue != null) {
            result.prependToInverseStatement(new MVariableAssignmentStatement(variableName,
                    oldValue));
        } else {
            result.prependToInverseStatement(new MVariableDestructionStatement(variableName));
        }

        fVariableEnvironment.assign(variableName, value);
    }

   	/**
	 * TODO
	 * @param differences
	 */
	private void fireStateChanged(StateDifference differences) {
		Object[] listeners = fListenerList.getListenerList();
		StateChangeEvent sce = null;
		
		for (int i = listeners.length-2; i >= 0; i -= 2) {
	        if (listeners[i] == StateChangeListener.class) {
	        	try {
	        		if (sce == null) {
	        			sce = new StateChangeEvent(this);
	        			differences.fillStateChangeEvent(sce);
	        		}
	        		
	        		((StateChangeListener)listeners[i+1]).stateChanged(sce);
	        	} catch (Exception ex) { }
	        }          
	    }
	}

	/**
     * TODO
     * @param statement
     * @throws EvaluationFailedException
     */
    public StatementEvaluationResult execute(
    		MStatement statement) throws MSystemException {
    	    	   	
    	return execute(statement, true, true, true);
    }
    
    /**
     * TODO
     * @param statement
     * @throws EvaluationFailedException
     */
    public StatementEvaluationResult execute(
    		MStatement statement, boolean notifyUpdateStateListeners) throws MSystemException {
    	    	   	
    	return execute(statement, true, true, notifyUpdateStateListeners);
    }
    
    /**
     * TODO
     * @param statement
     * @param undoOnFailure
     * @param storeResult
     * @return
     * @throws EvaluationFailedException
     */
    public StatementEvaluationResult execute(
    		MStatement statement,
    		boolean undoOnFailure,
    		boolean storeResult,
    		boolean notifyUpdateStateListeners) throws MSystemException {
    	
    	fRedoStack.clear();
    	
    	StatementEvaluationResult result = 
    		execute(statement, new SoilEvaluationContext(this), undoOnFailure, storeResult,
        notifyUpdateStateListeners);
    	
    	return result;
    }
    
    /**
     * Executes a statement.
     * 
     * @param statement The statement to execute
     * @param context The evaluation context
     * @param undoOnFailure Undo the statement on failure in sub-statements
     * @throws EvaluationFailedException
     */
    private StatementEvaluationResult execute(MStatement statement, SoilEvaluationContext context,
            boolean undoOnFailure, boolean storeResult, boolean notifyUpdateStateListeners)
            throws MSystemException {

        StatementEvaluationResult result = new StatementEvaluationResult(statement);

        fCurrentlyEvaluatedStatements.push(result);

        if (context.isUndo()) {
            fUniqueNameGenerator.popState();
        } else {
            fUniqueNameGenerator.pushState();
        }

        try {
            statement.execute(context, result);
        } catch (EvaluationFailedException e) {
            result.setException(e);
        }

        fCurrentlyEvaluatedStatements.pop();

        if (storeResult) {
            fStatementEvaluationResults.push(result);
        }

        if (result.wasSuccessfull() && notifyUpdateStateListeners)
            fireStateChanged(result.getStateDifference());

        if (!result.wasSuccessfull()) {
            if (undoOnFailure) {
                if (storeResult)
                    fStatementEvaluationResults.pop();
                execute(result.getInverseStatement(), new SoilEvaluationContext(this), false,
                        false, notifyUpdateStateListeners);
            }

            throw new MSystemException(result.getException().getMessage(), result.getException());
        }

        return result;
    }

    /**
     * TODO
     * @return
     * @throws MSystemException
     * @throws EvaluationFailedException
     */
    public StatementEvaluationResult undoLastStatement() 
    throws MSystemException {
    	
    	if (fStatementEvaluationResults.isEmpty()) {
    		throw new MSystemException("nothing to undo");
    	}
    	
    	StatementEvaluationResult lastResult = 
    		fStatementEvaluationResults.pop();
    	
    	MStatement lastStatement = lastResult.getEvaluatedStatement();
    	MStatement inverseStatement = lastResult.getInverseStatement();
    	
    	fRedoStack.push(lastStatement);
    	
    	if (Log.isTracing())
    		Log.trace(this, "undoing a statement");
    	
    	SoilEvaluationContext context = new SoilEvaluationContext(this);
    	context.setIsUndo(true);
    	
    	return execute(inverseStatement, context, false, false, true);
    }
    
    
    /**
	 * TODO
	 * @throws MSystemException
	 * @throws EvaluationFailedException
	 */
	public StatementEvaluationResult redoStatement() throws MSystemException {
		
		if (fRedoStack.isEmpty()) {
			throw new MSystemException("nothing to redo");
		}
		
		MStatement redoStatement = fRedoStack.pop();
		
		if (Log.isTracing())
			Log.trace(this, "redoing a statement");
		
		SoilEvaluationContext context = new SoilEvaluationContext(this);
		context.setIsRedo(true);
		
		StatementEvaluationResult result = 
			execute(
					redoStatement, 
					context, 
					false, 
					true,
					true);
		
		return result;
	}

	/**
     * TODO
     * @return
     */
    public String getUndoDescription() {
    	if (fStatementEvaluationResults.isEmpty()) {
    		return null;
    	} else {
    		StatementEvaluationResult lastResult = 
    			fStatementEvaluationResults.peek();
    		
    		MStatement lastEvaluatedStatement = 
    			lastResult.getEvaluatedStatement();
    		
    		return lastEvaluatedStatement.getShellCommand();
    	}
    }
    
    
    public MStatement nextToRedo() {
    	return fRedoStack.peek();
    }
    
    public void setLastOperationCall(MOperationCall lastCall) {
    	this.lastOperationCall = lastCall;
    }
    
    public MOperationCall getLastOperationCall() {
    	return lastOperationCall;
    }
    
    public boolean isRunningTestSuite() {
		return isRunningTestSuite;
	}

	public void setRunningTestSuite(boolean isRunningTestSuite) {
		this.isRunningTestSuite = isRunningTestSuite;
	}

	/**
     * TODO
     * @return
     */
    public String getRedoDescription() {
    	
    	if (fRedoStack.isEmpty()) {
    		return null;
    	}
    	
    	return fRedoStack.peek().getShellCommand();
    }

	
	/**
     * TODO
     * @param out
     */
    public void writeSoilStatements(PrintWriter out) {
    	for (MStatement statement : getEvaluatedStatements()) {
    		out.println(statement.getShellCommand());
    	}
    }

    /**
     * TODO
     * @return
     */
    public int numEvaluatedStatements() {
    	return fStatementEvaluationResults.size();
    }
    
    /**
     * TODO
     * @return
     */
    public List<MStatement> getEvaluatedStatements() {
    	List<MStatement> evaluatedStatements = 
    		new ArrayList<MStatement>(fStatementEvaluationResults.size());
    	
    	for (StatementEvaluationResult result : fStatementEvaluationResults) {
    		evaluatedStatements.add(0, result.getEvaluatedStatement());
    	}
    	
    	return evaluatedStatements;
    }
    
    
    /**
     * Returns the currently executed statement.
     * @return The executed statement.
     */
    private MStatement getCurrentStatement() {
    	return fCurrentlyEvaluatedStatements.peek().getEvaluatedStatement();
    }
    
    
    /**
	 * The current call stack of the system.
	 * @return The current call stack of the system.
	 */
	public Deque<MOperationCall> getCallStack() {
		return fCallStack;
	}
	
	
	/**
	 * Queries the current call stack for an operation
	 * call event with <code>object</code> as the receiving instance.
	 * @param object The object to check an active operation call for.
	 * @return <code>true</code> if the provided object has an active operation.
	 */
	public boolean hasActiveOperation(MObject object) {
		
		for (MOperationCall operationCall : fCallStack) {
			if (operationCall.getSelf() == object) {
				return true;
			}
		}
		
		return false;
	}
	

	/**
     * TODO
     * @return
     */
    public List<Event> getAllEvents() {
    	List<Event> result = new ArrayList<Event>();
    	
    	Iterator<StatementEvaluationResult> it = 
    		fStatementEvaluationResults.descendingIterator();
    	while (it.hasNext()) {
    		result.addAll(it.next().getEvents());
    	}
    	
    	StatementEvaluationResult currentResult = fCurrentlyEvaluatedStatements.peek();
    	if (currentResult != null) {
    		result.addAll(currentResult.getEvents());
    	}
    	
    	return result;
    }
    
    public void updateListeners() {
    	StatementEvaluationResult currentResult = fCurrentlyEvaluatedStatements.peek();
    	if (currentResult != null) {
    		fireStateChanged(
					currentResult.getStateDifference());
		}
    }
    
    /**
     * Starts a new variation in a test case
     */
    public void beginVariation() {
		
    	// Store current system state on stack
		variationPointsStates.push(this.fCurrentState);
		variationPointsVars.push(this.fVariableEnvironment);
		
		this.fCurrentState = new MSystemState(new UniqueNameGenerator().generate("variation#"), this.fCurrentState);
		this.fVariableEnvironment = new VariableEnvironment(this.fVariableEnvironment, this.fCurrentState);
	}
	
    /**
     * Ends a variation in a test case
     */
	public void endVariation() throws MSystemException {
		if (variationPointsStates.isEmpty()) {
			throw new MSystemException("No Variation to end!");
		}
		
		this.fCurrentState = variationPointsStates.pop();
		this.fVariableEnvironment = variationPointsVars.pop();
	}
}
