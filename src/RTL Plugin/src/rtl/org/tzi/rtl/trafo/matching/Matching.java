package org.tzi.rtl.trafo.matching;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.tzi.rtl.tgg.mm.MTggRule;
import org.tzi.rtl.tgg.parser.RTLKeyword;
import org.tzi.use.parser.ocl.OCLCompiler;
import org.tzi.use.parser.shell.ShellCommandCompiler;
import org.tzi.use.uml.mm.MAssociation;
import org.tzi.use.uml.mm.MOperation;
import org.tzi.use.uml.mm.MPrePostCondition;
import org.tzi.use.uml.ocl.expr.Evaluator;
import org.tzi.use.uml.ocl.expr.Expression;
import org.tzi.use.uml.ocl.expr.VarDecl;
import org.tzi.use.uml.ocl.type.TupleType;
import org.tzi.use.uml.ocl.type.TupleType.Part;
import org.tzi.use.uml.ocl.value.TupleValue;
import org.tzi.use.uml.ocl.value.Value;
import org.tzi.use.uml.sys.MLink;
import org.tzi.use.uml.sys.MObject;
import org.tzi.use.uml.sys.MSystem;
import org.tzi.use.uml.sys.MSystemException;
import org.tzi.use.uml.sys.MSystemState;
import org.tzi.use.uml.sys.soil.MEnterOperationStatement;
import org.tzi.use.uml.sys.soil.MExitOperationStatement;
import org.tzi.use.uml.sys.soil.MStatement;
import org.tzi.use.util.Log;
import org.tzi.use.util.UniqueNameGenerator;
import org.tzi.use.util.soil.VariableEnvironment;
import org.tzi.use.util.soil.exceptions.EvaluationFailedException;

@SuppressWarnings("unchecked")
public abstract class Matching {
	static List<Map<String, MObject>> matchHasRun = new ArrayList<Map<String,MObject>>();
	protected MOperation operation; // current operation
	//protected List<Matching> next; // Next match
	protected Matching previous; //previous match
	protected MSystemState fSystemState; // current state
	protected MTggRule rule; // current rule
	private boolean hasFailed = false;
	protected Map<String, MObject> objectList4LHS; // List object for a match
	protected Map<String, MObject> objectList4RHS; // List object result
	protected Part[] paramS = null; // Type param in source
	protected Part[] paramC = null; // Type param in corr
	protected Part[] paramT = null; // Type param in target
	protected static UniqueNameGenerator fUniqueNameGenerator;
	
	public Matching(){
		setOperation(null);
		setParameters();
	}

	public Matching(MOperation _operation){
		setOperation(_operation);
		setParameters();
	}

	/**
	 * Find all matching in current state
	 * @param curMatch: current match
	 * @param systemState: current state
	 * @return List all matches
	 */
	public List<Matching> findMatching(MSystemState systemState){
		//fSystemState = new MSystemState(fUniqueNameGenerator.generate("tggState#"), systemState);
		fSystemState = systemState;
		if (operation.name().endsWith(RTLKeyword.forwardTransform))
			return findMatchForward();
		else if (operation.name().endsWith(RTLKeyword.integration))
			return findMatchIntegration();
		return null;
	}
	
	/**
	 * Find match for forward transformation
	 * @param currMatch: current match
	 * @return List all Matches
	 */
	public abstract List<Matching> findMatchForward();
	
	/**
	 * Find match for integration scenario
	 * @param curMatch: current match
	 * @return List all Matches
	 */
	public abstract List<Matching> findMatchIntegration();

	/**
	 * Execute operation: forward/backward transformation, integration 	
	 * @param fSession
	 * @return MSystemState after execute operation transformation
	 */
	public MSystemState runOperation(PrintWriter fLogWriter) {
		//System.err.println("*****************************" + objectList4LHS);
		
		//if (!checkExistInPreviousMatch(firstMatch)){
		if (!matchHasRun.contains(objectList4LHS)){
			matchHasRun.add(objectList4LHS);
			System.out.println(getObjectList4LHS());
			assignVariableEnvironment();
			assignTupleValue();
			String line = "openter rc ";
			line += operation.name() + "(";
			for (Iterator iter = operation.paramNames().iterator(); iter.hasNext();) {
				String name = (String) iter.next();
				line += name + ",";
			}
			line = line.substring(0, line.length()-1) + ")";
			cmdExec(line, false, fLogWriter);
			if (hasFailed){
				fSystemState = null;
				return null;
			}
			if (operation.name().contains(RTLKeyword.forwardTransform)){
				assignVariableEnvironment();
				createTargetNode(fLogWriter);
			}
			assignVariableEnvironment();
			createCorrespondenceNode(fLogWriter);
			if (operation.name().contains(RTLKeyword.forwardTransform)){
				assignVariableEnvironment();
				updateMappedAttributes(fLogWriter);
			}
			cmdExec("opexit", false, fLogWriter);
			if (hasFailed){
				fSystemState = null;
				return null;
			}
			fSystemState = new MSystemState(fUniqueNameGenerator.generate("tggState#"), fSystemState.system().state());
			return fSystemState;
		}
		else{
			hasFailed = true;
			return null;
		}
	}
	
	/**
	 * Check a match existed in previous matches
	 * 
	 * @param firstMatch
	 * @return
	 */
	protected boolean checkExistInPreviousMatch() {
		if (matchHasRun.contains(objectList4LHS))
			return true;
		return false;
		/*boolean exist = false;
		if (firstMatch == null || firstMatch.objectList4LHS == null
				|| firstMatch.next == null || firstMatch.next.size() == 0)
			return false;

		for (Iterator iter = firstMatch.next.iterator(); iter.hasNext();) {
			Matching matching = (Matching) iter.next();
			if (matching.objectList4LHS != null && !exist) {
				if (matching.objectList4LHS.size() != objectList4LHS.size())
					exist = checkExistInPreviousMatch(matching);
				else {
					exist = true;
					Iterator iter1 = matching.objectList4LHS.keySet()
							.iterator();
					while (iter1.hasNext()) {
						String key = (String) iter1.next();
						if (matching.objectList4LHS.get(key) != null
								&& objectList4LHS.get(key) != null
								&& !matching.objectList4LHS.get(key).equals(
										objectList4LHS.get(key))) {
							exist = checkExistInPreviousMatch(matching);
							break;
						}
					}
				}
				if (exist)
					return true;
			}
		}
		return exist;*/
	}

	/**
	 * set up variable
	 */
	protected void setParameters(){
		if (fUniqueNameGenerator == null)
			fUniqueNameGenerator = new UniqueNameGenerator();
		objectList4LHS = new HashMap<String, MObject>();
		objectList4RHS = new HashMap<String, MObject>();
		//next = new ArrayList<Matching>();
		List<VarDecl> paramNames = new ArrayList<VarDecl>();
    	if (operation != null){
	    	int numVarDecls = operation.paramList().size();
	    	for (int i = 0; i < numVarDecls; ++i) {
	    		paramNames.add(operation.paramList().varDecl(i));
	    	}
	    	// Compile parameter
	    	int i = 0;
			Iterator iter = paramNames.iterator();
			while (iter.hasNext()){
				VarDecl var = (VarDecl) iter.next();
				TupleType varTuple = (TupleType) var.type();
				Map<String, Part> varParts = varTuple.getParts();
				Iterator iter2 = varParts.keySet().iterator();
				// Source
				if (var.name().startsWith(RTLKeyword.matchS)){
					if (paramS == null)
						paramS = new Part [varParts.keySet().size()];
					i = 0;
					while (iter2.hasNext()){
						String key = iter2.next().toString();
						Part p = varParts.get(key);
						paramS[i++] = p;
					}
				}
				// Corr
				else if (var.name().startsWith(RTLKeyword.matchC)){
					if (paramC == null)
						paramC = new Part [varParts.keySet().size()];
					i = 0;
					while (iter2.hasNext()){
						String key = iter2.next().toString();
						Part p = varParts.get(key);
						paramC[i++] = p;
					}
				}
				else if (var.name().startsWith(RTLKeyword.matchT)){
					if (paramT == null)
						paramT = new Part [varParts.keySet().size()];
					i = 0;
					while (iter2.hasNext()){
						String key = iter2.next().toString();
						Part p = varParts.get(key);
						paramT[i++] = p;
					}
				}
			}
    	}
	}
	
	/**
	 * Assign variable environment
	 */
	protected void assignVariableEnvironment(){
		VariableEnvironment varEnv = fSystemState.system().getVariableEnvironment();
		Iterator iter = objectList4LHS.keySet().iterator();
		while (iter.hasNext()){
			String key = (String)iter.next();
			varEnv.assign(key, objectList4LHS.get(key).value());
		}
	}
	
	/**
	 * Execute each command line
	 * @param line
	 * @param verbose
	 */
	public void cmdExec(String line, boolean verbose, PrintWriter fLogWriter) {
    	
    	if (line.length() == 0) {
    		Log.error("ERROR: Statement expected.");
    		return;
    	}
    	InputStream input = new ByteArrayInputStream(line.getBytes());
    	MStatement statement = ShellCommandCompiler.compileShellCommand(
    			fSystemState.system().model(),
    			fSystemState,
    			fSystemState.system().getVariableEnvironment(),
    			input,
    			"<input>",
    			fLogWriter,
    			verbose);
    	
    	if (statement == null) {
    		return;
    	}
    	
		Log.trace(this, "--- Executing shell command: " + statement.getShellCommand());
		
            
		try {
			if ((statement instanceof MEnterOperationStatement)
					|| (statement instanceof MExitOperationStatement)) {
				
				fSystemState.system().execute(statement, false, true, true);
			} else {
				fSystemState.system().execute(statement);
			}
			
		} catch (MSystemException e) {
			String message = e.getMessage();
			setHasFailed(true);
			if ((e.getCause() != null) && 
					(e.getCause() instanceof EvaluationFailedException)) {
				
				EvaluationFailedException exception = 
					(EvaluationFailedException)e.getCause();
			
				message = exception.getMessage(statement);
			}
			
			Log.error(message);
		} finally {
			//fSession.evaluatedStatement(statement);
		}
    }
	
	/**
	 * Create target nodes and links
	 */
	public void createTargetNode(PrintWriter fLogWriter){
		String cmd = rule.getTargetRule().genOCLForCreateObjectAndLinkInRight(fUniqueNameGenerator);
		String tmp[] = cmd.split("\n");
		for (int i = 0; i < tmp.length; i++) {
			if (!tmp[i].trim().equals(""))
				cmdExec(tmp[i], false, fLogWriter);
		}
	}
	
	/**
	 * Create correspondence node
	 */
	public void createCorrespondenceNode(PrintWriter fLogWriter){
		String cmd = rule.getCorrRule().genOCLForCreateObjectAndLinkInRight(fUniqueNameGenerator);
		String tmp[] = cmd.split("\n");
		for (int i = 0; i < tmp.length; i++) {
			if (!tmp[i].trim().equals(""))
				cmdExec(tmp[i], false, fLogWriter);
		}
		
	}
	
	/**
	 * Update mapped attributes
	 */
	public void updateMappedAttributes(PrintWriter fLogWriter){
		String ocl = "";
		ocl += rule.oclForUpdateAttributeForward();
		// OCL in RHS: only for forward transformation
		if (operation.name().contains(RTLKeyword.forwardTransform)){
			List fConditions = rule.getTargetRule().getRHS().getConditions();
			for (Iterator iter = fConditions.iterator(); iter.hasNext();) {
				String obj = (String) iter.next();
				String ocl1 = obj.substring(1, obj.length()-1).replace("=", ":=");
				ocl += "\n set " + ocl1;
			}
		}
		String tmp[] = ocl.split("\n");
		for (int i = 0; i < tmp.length; i++) {
			if (!tmp[i].trim().equals(""))
				cmdExec(tmp[i], false, fLogWriter);
		}
	}
	
	/**
	 * Build ocl condition for each part
	 * @param pos
	 * @return
	 */
	public Expression buildOCLPreconditionForPart(int pos){
		String ocl = ""; 
		Expression expr = null;
		if (pos == 0){
			ocl = rule.getSourceRule().buildLinkConditionLeftRight(0);
		}
		else if (pos == 2){
			if (operation.name().contains(RTLKeyword.integration))
				ocl = rule.getTargetRule().buildLinkConditionLeftRight(0);
			else
				ocl = rule.getTargetRule().buildLinkConditionLeft(0);
		}
		if (!ocl.equals("")){
			ocl += "\n";
			//System.err.println(ocl + "------------");
			
			MSystem fSystem = fSystemState.system();
			PrintWriter out = new PrintWriter(System.out);
			expr = OCLCompiler.compileExpression(
					fSystem.model(),
					fSystem.state(),
			        ocl, 
			        "Error", 
			        out, 
			        fSystem.varBindings());
			out.flush();
		}
		return expr; 
	}

	/**
	 * Check precondition
	 * @return boolean
	 */
	public boolean checkPreCondition(){
		Value valid = null;
		//System.err.println(count + "***" + operation.name() + ":" + objectList4LHS);
		assignVariableEnvironment();
		assignTupleValue();
		Expression condition = null;
		List<MPrePostCondition> preconditions = operation.preConditions();
		Iterator iter = preconditions.iterator();
		while (iter.hasNext()){
			MPrePostCondition pre = (MPrePostCondition)iter.next();
			condition = pre.expression();
			Evaluator eval;
			eval = new Evaluator();
			MSystem system = fSystemState.system();
			//ystem.err.println(pre.expression().toString());
			try{
				valid = eval.eval(condition, fSystemState, system.varBindings());
			}catch (Exception e) {
				return false;
				// TODO: handle exception
			}
			if (valid.isBoolean() && valid.toString().equals("false"))
				return false;
		}
		return true;
	}
	
	/**
	 * Assign value for Tuple
	 */
	private void assignTupleValue() {
		List<VarDecl> paramNames = new ArrayList<VarDecl>();
		int numVarDecls = operation.paramList().size();
		VariableEnvironment varEnv = fSystemState.system()
				.getVariableEnvironment();
		for (int i = 0; i < numVarDecls; ++i) {
			paramNames.add(operation.paramList().varDecl(i));
		}

		Iterator iter = paramNames.iterator();
		while (iter.hasNext()) {
			VarDecl var = (VarDecl) iter.next();
			TupleType varTuple = (TupleType) var.type();
			Map<String, Part> varParts = varTuple.getParts();
			Map<String, Value> values = new HashMap<String, Value>();
			Set<String> varKeys = null;
			varKeys = varParts.keySet();
			Iterator iter2 = varKeys.iterator();
			while (iter2.hasNext()) {
				String key = iter2.next().toString();
				values.put(key, varEnv.lookUp(key));
			}
			TupleValue tuple = new TupleValue(varTuple, values);
			varEnv.assign(var.name(), tuple);
		}
	}

	/**
	 * Check pre-condition for each part
	 * @param posTuple
	 * @return
	 */
	protected boolean checkPreconditionForPart(int posTuple){
		// Don't check corr link
		if (posTuple == 1)
			return true;
		if (!hasLinkInPart(posTuple))
			return false;
		return true;
	}
	
	/**
	 * Check link in each part
	 * @param posTuple
	 * @return
	 */
	protected boolean hasLinkInPart(int posTuple){
		List links = null;
		MObject obj1, obj2 = null;
		MObject[] objs = new MObject[2];
		MAssociation assoc = null;
		if (posTuple == 0){
			links = rule.getSourceRule().getLHS().getLinks();
			links.addAll(rule.getSourceRule().getRHS().getLinks());
		}
		else if (posTuple == 2){
			links = rule.getTargetRule().getLHS().getLinks();
			if (operation.name().contains(RTLKeyword.integration))
				links.addAll(rule.getTargetRule().getRHS().getLinks());
		}
		
		if (links.size() == 0)
			return true;
		Iterator iter = links.iterator();
		while (iter.hasNext()){
			MLink link = (MLink)iter.next();
			assoc = link.association();
			List<MObject> linkedObjects = link.linkedObjects();
			obj1 = objectList4LHS.get(linkedObjects.get(0).name());
			obj2 = objectList4LHS.get(linkedObjects.get(1).name());
			objs[0] = obj1;
			objs[1] = obj2;
			if (!fSystemState.hasLinkBetweenObjects(assoc, objs)){
				return false;
			}
		}
		return true;
	}
	
	protected boolean hasLinkInPart(int posTuple, int pos) {
		Part[] params = null;
		List<MLink> links = null;
		MObject mObj1, mObj2 = null;
		MObject[] objs = new MObject[2];
		if (posTuple == 0) {
			params = paramS;
			links = rule.getSourceRule().getLHS().getLinks();
			links.addAll(rule.getSourceRule().getRHS().getLinks());
		}
		else if (posTuple == 2) {
			params = paramT;
			links = rule.getTargetRule().getLHS().getLinks();
			if (operation.name().contains(RTLKeyword.integration))
				links.addAll(rule.getTargetRule().getRHS().getLinks());
		}
		else if(posTuple == 1){
			params = paramC;
			links = rule.getCorrRule().getLHS().getLinks();
			return hasLinkWithCorr(pos);
		}
		
		if (links == null)
			return true;
		for (MLink mLink : links) {
			for (int i = 0; i < pos; i++) {
				if ((mLink.linkedObjects().get(1).name().equals(
						params[i].name()) && mLink.linkedObjects().get(0)
						.name().equals(params[pos].name()))
						|| (mLink.linkedObjects().get(0).name().equals(
								params[i].name()) && mLink.linkedObjects().get(
								1).name().equals(params[pos].name()))) {
					mObj1 = objectList4LHS.get(params[pos].name());
					mObj2 = objectList4LHS.get(params[i].name());
					objs[0] = mObj1;
					objs[1] = mObj2;
					if (!fSystemState.hasLinkBetweenObjects(
							mLink.association(), objs)) {
						objs[0] = mObj2;
						objs[1] = mObj1;
						if (!fSystemState.hasLinkBetweenObjects(
								mLink.association(), objs)) {
							return false;
						}
					}
				}
			}
		}
		return true;
	}
	
	/**
	 * a part (source or target) has link with correspondence
	 * @param posTuple
	 * @return
	 */
	protected boolean hasLinkWithCorr(int pos){
		MObject obj1, obj2 = null;
		List<MLink> links;
		MObject[] objs = new MObject[2];
		MAssociation assoc = null;
		links = rule.getCorrRule().getLHS().getLinks();
		if (links.size() == 0)
			return true;
		Iterator iter = links.iterator();
		while (iter.hasNext()){
			MLink link = (MLink)iter.next();
			assoc = link.association();
			List<MObject> linkedObjects = link.linkedObjects();
			if (linkedObjects.get(1).name().equals(
					paramC[pos].name()) || linkedObjects.get(0)
					.name().equals(paramC[pos].name())){
				obj1 = objectList4LHS.get(linkedObjects.get(0).name());
				obj2 = objectList4LHS.get(linkedObjects.get(1).name());
				objs[0] = obj1;
				objs[1] = obj2;
				if (!fSystemState.hasLinkBetweenObjects(assoc, objs)){
					objs[0] = obj2;
					objs[1] = obj1;
					if (!fSystemState.hasLinkBetweenObjects(assoc, objs)){
						return false;
					}
				}
			}
		}
		return true;
	}
	
	/**
	 * @param operation the operation to set
	 */
	public void setOperation(MOperation operation) {
		this.operation = operation;
	}

	/**
	 * @return the operation
	 */
	public MOperation getOperation() {
		return operation;
	}

	public Matching getPrevious() {
		return previous;
	}

	public void setPrevious(Matching previous) {
		this.previous = previous;
	}

	/**
	 * @return the rule
	 */
	public MTggRule getRule() {
		return rule;
	}

	/**
	 * @param rule the rule to set
	 */
	public void setRule(MTggRule rule) {
		this.rule = rule;
	}

	/**
	 * @return the hasFailed
	 */
	public boolean isHasFailed() {
		return hasFailed;
	}

	/**
	 * @param hasFailed the hasFailed to set
	 */
	public void setHasFailed(boolean hasFailed) {
		this.hasFailed = hasFailed;
	}

	/**
	 * @return the objectList4LHS
	 */
	public Map<String, MObject> getObjectList4LHS() {
		return objectList4LHS;
	}

	/**
	 * @param objectList4LHS the objectList4LHS to set
	 */
	public void setObjectList4LHS(Map<String, MObject> objectList4LHS) {
		this.objectList4LHS = objectList4LHS;
	}

	/**
	 * @return the fSystemState
	 */
	public MSystemState getfSystemState() {
		return fSystemState;
	}

	/**
	 * @param fSystemState the fSystemState to set
	 */
	public void setfSystemState(MSystemState fSystemState) {
		this.fSystemState = fSystemState;
	}

	/**
	 * @return the matchHasRun
	 */
	public static List<Map<String, MObject>> getMatchHasRun() {
		return matchHasRun;
	}

	/**
	 * @param matchHasRun the matchHasRun to set
	 */
	public static void setMatchHasRun(List<Map<String, MObject>> matchHasRun) {
		Matching.matchHasRun = matchHasRun;
	}
	

}
