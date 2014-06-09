package org.tzi.rtl.gui.plugins.tgg;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.tzi.rtl.tgg.mm.MTggRule;
import org.tzi.rtl.tgg.mm.TggRuleCollection;
import org.tzi.rtl.tgg.parser.RTLKeyword;
import org.tzi.rtl.trafo.matching.Matching;
import org.tzi.rtl.trafo.matching.MatchingEachPart;
import org.tzi.use.gui.main.MainWindow;
import org.tzi.use.main.Session;
import org.tzi.use.runtime.gui.IPluginAction;
import org.tzi.use.runtime.gui.IPluginActionDelegate;
import org.tzi.use.uml.mm.MClass;
import org.tzi.use.uml.mm.MOperation;
import org.tzi.use.uml.sys.MSystemState;

public class ActionFindAllMatchForward  implements IPluginActionDelegate {
	static TggRuleCollection fTggRuleCollection;
	static List<Matching> result;
	static Matching currentMatch;
	static int size = 0;
	static int step = 0;
	static boolean mustRematch = true; // after state changed, we have to re-find matches
	public ActionFindAllMatchForward(){
		
	}

	@Override
	public void performAction(IPluginAction pluginAction) {
		Session fSession = pluginAction.getSession();
		MainWindow fMainWindow = pluginAction.getParent();
		PrintWriter fLogWriter = fMainWindow.logWriter();
		findAllMatch(fLogWriter, fSession);
    	step = -1;
    	nextStep(fLogWriter, fSession);
	}
	@SuppressWarnings("unchecked")
	public static void findAllMatch(PrintWriter fLogWriter, Session fSession){
    	fTggRuleCollection = MainWindow.instance().getModelBrowser().getTggRuleCollection();
    	MatchingEachPart.setListMatch(null);
    	MatchingEachPart.getMatchHasRun().clear();
    	Matching firstMatch = new MatchingEachPart();
    	firstMatch.setfSystemState(fSession.system().state());
		List<Matching> matches = new ArrayList<Matching>();
    	// find all match with current state
    	for (Iterator iterator = fTggRuleCollection.getTggRules().iterator(); iterator.hasNext();) {
    		MTggRule rule = (MTggRule) iterator.next();
    		matches.addAll(findMatching(firstMatch.getfSystemState(), rule, fSession));
    	}
    	result = matches;
    	size = result.size();
    	if (size==0)
    		fLogWriter.println("No match has found.");
    	else{
    		fLogWriter.println("Found " + size + " matches.");
        	currentMatch = result.get(0);
        	//fLogWriter.print("Select match 1: ");
        	//fLogWriter.println(currentMatch.getRule().name() + ": " + currentMatch.getObjectList4LHS() );
    	}
    	setMustRematch(false);
    	
	}
	
	public static List<Matching> findMatching(MSystemState fSystemState, MTggRule rule, Session fSession){
		MClass cls = fSession.system().model().getClass("RuleCollection");
		MOperation op = cls.operation(rule.name() + RTLKeyword.forwardTransform, true);
		System.out.println("Checking " + rule.name() + "..............");
		MatchingEachPart matching = new MatchingEachPart(op);
		matching.setRule(rule);
		return matching.findMatching(fSystemState);
	}
	
	public static Matching nextStep(PrintWriter fLogWriter, Session fSession){
		if (isMustRematch()){
    		findAllMatch(fLogWriter, fSession);
    		step = -1;
    	}
		if (size > 0){
			step++;
			if (step != size){
				currentMatch = result.get(step); 
				fLogWriter.print("Select match " + (step + 1) + ": ");
	        	fLogWriter.println(currentMatch.getRule().name() + ": " + currentMatch.getObjectList4LHS());
			}
			else
				step--;
			return currentMatch;
		}
		return null;
	}
	
	public static Matching previousStep(PrintWriter fLogWriter, Session fSession){
		if (isMustRematch()){
    		findAllMatch(fLogWriter, fSession);
    		step = size;
    	}
		if (size > 0){
			step--;
			if (step != -1){
				currentMatch = result.get(step); 
				fLogWriter.print("Select match " + (step + 1) + ": ");
	        	fLogWriter.println(currentMatch.getRule().name() + ": " + currentMatch.getObjectList4LHS());
			}
			else
				step++;
			return currentMatch;
		}
		return null;
	}

	public static void runMatch(PrintWriter fLogWriter){
		if (currentMatch != null){
    		setMustRematch(true);
    		currentMatch.runOperation(fLogWriter);
    		if (currentMatch.isHasFailed())
    			fLogWriter.println("Run match fail.");
    		else
    			fLogWriter.println("Run match success.");
    		currentMatch = null;
    	}
    	else
    		fLogWriter.println("No match selected.");
	}
	
	/**
	 * @return the mustRematch
	 */
	public static boolean isMustRematch() {
		return mustRematch;
	}

	/**
	 * @param mustRematch the mustRematch to set
	 */
	public static void setMustRematch(boolean _mustRematch) {
		mustRematch = _mustRematch;
	}
}
