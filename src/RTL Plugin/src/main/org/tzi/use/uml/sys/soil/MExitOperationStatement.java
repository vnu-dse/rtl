/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2010 Mark Richters, University of Bremen
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

// $Id: MExitOperationStatement.java 3330 2012-05-09 15:07:22Z green $

package org.tzi.use.uml.sys.soil;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.tzi.use.uml.ocl.expr.Expression;
import org.tzi.use.uml.ocl.expr.ExpressionWithValue;
import org.tzi.use.uml.ocl.value.Value;
import org.tzi.use.uml.sys.MOperationCall;
import org.tzi.use.uml.sys.MSystemException;
import org.tzi.use.uml.sys.StatementEvaluationResult;
import org.tzi.use.uml.sys.ppcHandling.DoNothingPPCHandler;
import org.tzi.use.uml.sys.ppcHandling.OpEnterOpExitPPCHandler;
import org.tzi.use.uml.sys.ppcHandling.PPCHandler;
import org.tzi.use.util.soil.exceptions.EvaluationFailedException;


/**
 * TODO
 * @author Daniel Gent
 *
 */
public class MExitOperationStatement extends MStatement {
	/** TODO */
	private Expression fOperationResult;
	/** TODO */
	private PPCHandler fCustomPPCHandler;
	
	private MOperationCall operationCall;
	
	/**
	 * TODO
	 * @param result
	 */
	public MExitOperationStatement(Expression operationResult) {
		fOperationResult = operationResult;
	}
	
	
	/**
	 * TODO
	 * @param result
	 * @param customPPCHandler
	 */
	public MExitOperationStatement(
			Expression operationResult, 
			PPCHandler customPPCHandler) {
		
		this(operationResult);
		fCustomPPCHandler = customPPCHandler;
	}
	

	@Override
    public void execute(SoilEvaluationContext context,
			StatementEvaluationResult result) throws EvaluationFailedException {
		
		Value vresult = (fOperationResult == null) ? 
				null : EvalUtil.evaluateExpression(this, context, result, fOperationResult, false);

		// to be able to undo this statement, we need to capture the current
		// variable mappings
		Map<String, Value> currentMappings = 
			context.getVarEnv().getCurrentMappings();

		if (vresult != null) {
			context.getVarEnv().assign("result", vresult);
		}

		operationCall = context.getSystem().getCurrentOperation();
		
		EvaluationFailedException caughtException = null;
		try {
			PPCHandler preferredPPCHandler = fCustomPPCHandler == null ? 
					OpEnterOpExitPPCHandler.getDefaultOutputHandler() : fCustomPPCHandler;
			MOperationCall currentOperation = context.getSystem().getCurrentOperation();
			
			if (currentOperation == null) {
				throw new EvaluationFailedException(this, "No current operation");
			}
			
			if (preferredPPCHandler != null) {
				currentOperation.setPreferredPPCHandler(preferredPPCHandler);
			}
			
			try {
				context.getSystem().exitNonQueryOperation(context,result,vresult);
			} catch (MSystemException e) {
				throw new EvaluationFailedException(this, e);
			}
			context.getSystem().setLastOperationCall(operationCall);
		} catch (EvaluationFailedException e) {
			caughtException = e;
		}
		
		// build the inverse statement if necessary
		
		if (operationCall == null || !operationCall.exited()) {
			if (caughtException != null) {
				throw caughtException;
			} else {
				return;
			}
		}
		
		// restore variable mappings
		for (Entry<String, Value> entry : currentMappings.entrySet()) {
			result.prependToInverseStatement(
					new MVariableAssignmentStatement(
							entry.getKey(), 
							entry.getValue()));
		}
		
		// operation must be reentered
		Map<String, Expression> wrappedArguments = 
			new HashMap<String, Expression>(operationCall.getArguments().length);
		
		for (int i = 0; i < operationCall.getOperation().paramNames().size();++i) {
			String n = operationCall.getOperation().paramNames().get(i);
			wrappedArguments.put(n , new ExpressionWithValue(operationCall.getArguments()[i]));
		}
			
		result.prependToInverseStatement(
				new MEnterOperationStatement(
						new ExpressionWithValue(operationCall.getSelf().value()),
						operationCall.getOperation(),
						wrappedArguments,
						DoNothingPPCHandler.getInstance()));
		
		if (caughtException != null) {
			throw caughtException;
		}
	}

	
	@Override
	protected String shellCommand() {
		return 
		"opexit" + 
		((fOperationResult == null) ? "" : " " + fOperationResult);
	}

	
	public MOperationCall getOperationCall() {
		return operationCall;
	}

	@Override
	public String toString() {
		return shellCommand();
	}
}
