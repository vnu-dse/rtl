package rtl.parser.tggrule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import rtl.parser.element.MCorrTGGRule;
import rtl.parser.element.MTGGRule;
import rtl.parser.element.TGGInvariant;
import rtl.parser.element.USEAssociation;
import rtl.parser.element.USEClass;
import rtl.parser.regex.RTLKeyword;
import rtl.parser.regex.RTLRegex;

public class TGGRule {
	String description;
	String name;
	MTGGRule fSourceRule;
	MTGGRule fTargetRule;
	MCorrTGGRule fCorrRule;
	
	public TGGRule(String name) {
		this.name = name;
		this.description = "";
		fSourceRule = new MTGGRule();
		fTargetRule = new MTGGRule();
		fCorrRule = new MCorrTGGRule(fSourceRule, fTargetRule);
	}
	
	public TGGRule(String name, String description) {
		this.name = name;
		this.description = description;
		fSourceRule = new MTGGRule();
		fTargetRule = new MTGGRule();
		fCorrRule = new MCorrTGGRule(fSourceRule, fTargetRule);
	}
	
	/**
	When we read an TGG rule line by line, we need to add this line at the end of description
	 */
	public void appendDescription(String append) {
		this.description = this.description.concat(append + "\n");
	}
	
	public String toString() {
		return "rule " + this.name + this.description
				+ "\n" + generateCommentLine(50);
	}
	
	/**
	This method will create new line with '-' character, such as: --------------
	 */
	public String generateCommentLine(int number) {
		char[] comment = new char[number];
		Arrays.fill(comment, '-');
		return new String(comment);
	}
	
	/**
	 * This method will start parser description.
	 */
	public void parser() {
		/**
		 * We need to search with keyword: checkSource, checkTarget, checkCorr
		 * We also use region to mark if we are parsing one of them
		 * 0:	sourceRule
		 * 1:	targetRule
		 * 2:	corrRule
		 */
		String[] keyword = {"checkSource", "}checkTarget", "}checkCorr" };
		String[] rules = { "(", "(", "(" };
		int region = -1;
		BufferedReader br = new BufferedReader(new StringReader(description));
		String line;
		try {
			while ((line = br.readLine()) != null) {
				if(line.startsWith(keyword[0]))
					region = 0;
				else if(line.startsWith(keyword[1]))
					region = 1;
				else if(line.startsWith(keyword[2]))
					region = 2;
				else if(! line.endsWith("}end")){
					rules[region] = rules[region] + "\n" + line;
				}
			}
			for(int i = 0; i < rules.length; i++)
				if(! rules[i].endsWith("}"))
					rules[i] += "\n}";
			fSourceRule.parser(rules[0]);
			fTargetRule.parser(rules[1]);
			fCorrRule.parser(rules[2]);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	Generate
		trafoActionNode_coEvol(
    		matchSL:Tuple(theActivityEdgeA:ActivityEdge,_action_name:String),
    		matchTL:Tuple(theProcessA:Process),
    		matchCL:Tuple(ae2p1:AE2P))
	 */
	public String coEvolutionTuple(int indent) {
		String s, t, c;
		s = fSourceRule.getTupleForCoEvolution();
		t = fTargetRule.getTupleForCoEvolution();
		c = fCorrRule.getTupleForCoEvolution();
		if(s == null && t == null && c == null)
			return null;
		else {
			String coEvolution = RTLRegex.indent(indent) + this.name + RTLKeyword.coEvolution + "(\n";
			if(s != null)
				coEvolution += RTLRegex.indent(indent+2) + RTLKeyword.matchSL + s + "*";
			if(t != null)
				coEvolution += RTLRegex.indent(indent+2) + RTLKeyword.matchTL + t + "*";
			if(c != null)
				coEvolution += RTLRegex.indent(indent+2) + RTLKeyword.matchCL + c + "*";
			while(coEvolution.endsWith("*"))
				coEvolution = coEvolution.substring(0, coEvolution.length()-1);
			coEvolution = coEvolution.replace("*", ",\n");
			coEvolution += ")";
			return coEvolution;
		}
	}
	
	/**
	Generate
		pre trafoActionNode_coEvol_pre:
		------------------------------
		--matchSL: Tuple(theActivityEdgeA:ActivityEdge,_action_name:String)
			let theActivityEdgeA: ActivityEdge = matchSL.theActivityEdgeA in
			let _action_name: String = matchSL._action_name in
		------------------------------
		--matchTL: Tuple(theProcessA:Process)
			let theProcessA: Process = matchTL.theProcessA in
		------------------------------
		--matchCL: Tuple(ae2p1:AE2P)
  			let ae2p1: AE2P = matchCL.ae2p1 in
			--S_precondition
    			theActivityEdgeA.cp_L_ActivityEdge_AE2P->notEmpty() and
    			theActivityEdgeA.name<>oclUndefined(String) and
  			--T_precondition
  			--C_precondition
    			Set{ae2p1.ae}->includesAll(Set{theActivityEdgeA}) and
    			Set{ae2p1.p}->includesAll(Set{theProcessA})
	 */
	public String preCoEvolutionTuple(int indent) {
		String s, t, c;
		s = fSourceRule.getTupleForCoEvolution();
		t = fTargetRule.getTupleForCoEvolution();
		c = fCorrRule.getTupleForCoEvolution();
		if(s == null || t == null || c == null)
			return null;
		else {
			String preCoEvol = "";
			//	Display: match Tuple
			preCoEvol += "pre " + name + RTLKeyword.coEvolution + RTLKeyword.pre + "\n";
			preCoEvol += RTLRegex.comment(30, '-') + "\n";
			preCoEvol += "--matchSL:" + s + "\n";
			preCoEvol += parserTupleString(s, indent, "matchSL");
			preCoEvol += RTLRegex.comment(30, '-') + "\n";
			preCoEvol += "--matchTL:" + t + "\n";
			preCoEvol += parserTupleString(t, indent, "matchTL");
			preCoEvol += RTLRegex.comment(30, '-') + "\n";
			preCoEvol += "--matchCL:" + c + "\n";
			preCoEvol += parserTupleString(c, indent, "matchCL");
			//	Display Pre OCL Conditions
			s = fSourceRule.preOCLForCoEvol(indent+2);
			t = fTargetRule.preOCLForCoEvol(indent+2);
			c = fCorrRule.preOCLForCoEvol(indent+2);
			preCoEvol += RTLRegex.indent(indent + 2) + RTLKeyword.S_pre + "\n";
			if( s!= null && (t != null || c != null))
				preCoEvol += s + RTLKeyword.and + "\n";
			preCoEvol += RTLRegex.indent(indent + 2) + RTLKeyword.T_pre + "\n";
			if(t != null && c != null)
			preCoEvol += t + RTLKeyword.and + "\n";
			preCoEvol += RTLRegex.indent(indent + 2) + RTLKeyword.C_pre + "\n";
			preCoEvol += c + "\n";
			return preCoEvol;
		}
	}
	
	/**
	Generate
		post trafoFinalNode_coEvol_post:
		------------------------------------------------
		--matchSL:Tuple(theActivityEdgeA:ActivityEdge)
  		  let theActivityEdgeA: ActivityEdge = matchSL.theActivityEdgeA in
		------------------------------------------------
		--matchTL:Tuple(theProcessA:Process)
  		  let theProcessA: Process = matchTL.theProcessA in
		------------------------------------------------
		--matchCL:Tuple(ae2p:AE2P)
  		  let ae2p: AE2P = matchCL.ae2p in
  		  --S_postcondition
    	    ActivityEdge.allInstances->includesAll(Set{theActivityEdgeA}) and
    	    (FinalNode.allInstances - FinalNode.allInstances@pre)->exists( finalNode |--
      		  Set{theActivityEdgeA.target}->includesAll(Set{finalNode}) and
    		--T_postcondition
      		  Process.allInstances->includesAll(Set{theProcessA}) and
      		  (ProcessAssignment.allInstances - ProcessAssignment.allInstances@pre)->exists( assignment |--
        		(Process.allInstances - Process.allInstances@pre)->exists( SKIP |--
          		  Set{assignment,SKIP}->size = 2 and
          		  Set{assignment.right}->includesAll(Set{SKIP}) and
          		  Set{assignment.left}->includesAll(Set{theProcessA}) and
          		  SKIP.name = 'SKIP' and
        		--C_postcondition
          		  AE2P.allInstances->includesAll(Set{ae2p}) and
          		  (F2P.allInstances - F2P.allInstances@pre)->exists( f2p |--
            		Set{f2p.f}->includesAll(Set{finalNode}) and
            		Set{f2p.p}->includesAll(Set{SKIP}) and
            		Set{ae2p.ae}->includesAll(Set{theActivityEdgeA}) and
            		Set{ae2p.p}->includesAll(Set{theProcessA})
            		)
          		  )
        		)
      		  )
	 */
	public String postCoEvolutionTuple(int indent) {
		String s, t, c;
		s = fSourceRule.getTupleForCoEvolution();
		t = fTargetRule.getTupleForCoEvolution();
		c = fCorrRule.getTupleForCoEvolution();
		String postCoEvol = "";
		postCoEvol += "post " + name + RTLKeyword.coEvolution + RTLKeyword.post + "\n";
		if(s != null) {
			postCoEvol += RTLRegex.comment(30, '-') + "\n";
			postCoEvol += "--matchSL:" + s + "\n";
			postCoEvol += parserTupleString(s, indent, "matchSL");
		}
		if(t != null) {
			postCoEvol += RTLRegex.comment(30, '-') + "\n";
			postCoEvol += "--matchTL:" + t + "\n";
			postCoEvol += parserTupleString(t, indent, "matchTL");
		}
		if(c != null) {
			postCoEvol += RTLRegex.comment(30, '-') + "\n";
			postCoEvol += "--matchCL:" + c + "\n";
			postCoEvol += parserTupleString(c, indent, "matchCL");
		}
		return postCoEvol;
	}
	
	/**
	Generate
		context RuleCollection::trafoFinalNode_coEvol(
  			matchSL:Tuple(theActivityEdgeA:ActivityEdge),
  			matchTL:Tuple(theProcessA:Process),
  			matchCL:Tuple(ae2p:AE2P))
	 */
	public String contextCoEvolution(String classrule, int indent) {
		String context = "context " + classrule + "::" + coEvolutionTuple(indent) + "\n\n";
		String p;
		p = preCoEvolutionTuple(indent);
		if(p != null)
			context += preCoEvolutionTuple(indent) + "\n";
		context += postCoEvolutionTuple(indent);
		context += generateCoEvolutionPostCondition();
		return context;
	}
	
	/**
	Generate
		trafoActionNode_forwTrafo(
    		matchSR:Tuple(action:Action,theActivityEdgeB:ActivityEdge,theActivityEdgeA:ActivityEdge),
    		matchTL:Tuple(theProcessA:Process),
    		matchCL:Tuple(ae2p1:AE2P))
	 */
	public String forwardTraformTuple(int indent) {
		String s, t, c;
		s = fSourceRule.getTupleForForwardTransform();
		t = fTargetRule.getTupleForCoEvolution();
		c = fCorrRule.getTupleForCoEvolution();
		if(s == null && t == null && c == null)
			return null;
		else {
			String forward = RTLRegex.indent(indent) + this.name + RTLKeyword.forwardTransform + "(\n";
			if(s != null)
				forward += RTLRegex.indent(indent+2) + RTLKeyword.matchSR + s + "*";
			if(t != null)
				forward += RTLRegex.indent(indent+2) + RTLKeyword.matchTL + t + "*";
			if(c != null)
				forward += RTLRegex.indent(indent+2) + RTLKeyword.matchCL + c + "*";
			while(forward.endsWith("*"))
				forward = forward.substring(0, forward.length()-1);
			forward = forward.replace("*", ",\n");
			forward += ")";
			return forward;
		}
	}
	
	/**
	Generate
		context RuleCollection::trafoForkNode_forwTrafo(
  			matchSL:Tuple(theActivityEdgeA:ActivityEdge,_theActivityEdgeB_name:String,
  			matchTL:Tuple(theProcessA:Process),
  			matchCL:Tuple(ae2p1:AE2P))
	 */
	public String contextForwardTransform(String classrule, int indent) {
		String context = "context " + classrule + "::" + forwardTraformTuple(indent) + "\n\n";
		String p;
		p = preCoEvolutionTuple(indent);
		if(p != null)
			context += preForwardTransformTuple(indent) + "\n";
		context += postForwardTransformTuple(indent);
		context += generateForwardTransformPostCondition();
		return context;
	}
	
	/**
	Generate
		pre trafoFinalNode_forwTrafo_pre:
		------------------------------------------------
		--matchSR:Tuple(finalNode:FinalNode,theActivityEdgeA:ActivityEdge)
		  let finalNode: FinalNode = matchSR.finalNode in
  		  let theActivityEdgeA: ActivityEdge = matchSR.theActivityEdgeA in
		------------------------------------------------
		--matchTL:Tuple(theProcessA:Process)
  		  let theProcessA: Process = matchTL.theProcessA in
		------------------------------------------------
		--matchCL:Tuple(ae2p:AE2P)
  		  let ae2p: AE2P = matchCL.ae2p in
  		  --S_precondition
    		theActivityEdgeA.name<>oclUndefined(String) and
  		  --T_precondition
  		  --C_precondition
    		Set{ae2p.ae}->includesAll(Set{theActivityEdgeA}) and
    		Set{ae2p.p}->includesAll(Set{theProcessA})
	 */
	public String preForwardTransformTuple(int indent) {
		String s, t, c;
		s = fSourceRule.getTupleForForwardTransform();
		t = fTargetRule.getTupleForCoEvolution();
		c = fCorrRule.getTupleForCoEvolution();
		if(s == null || t == null || c == null)
			return null;
		else {
			String preForward = "";
			//	Display: match Tuple
			preForward += "pre " + name + RTLKeyword.forwardTransform + RTLKeyword.pre + "\n";
			preForward += RTLRegex.comment(30, '-') + "\n";
			preForward += "--matchSR:" + s + "\n";
			preForward += parserTupleString(s, indent, "matchSR");
			preForward += RTLRegex.comment(30, '-') + "\n";
			preForward += "--matchTL:" + t + "\n";
			preForward += parserTupleString(t, indent, "matchTL");
			preForward += RTLRegex.comment(30, '-') + "\n";
			preForward += "--matchCL:" + c + "\n";
			preForward += parserTupleString(c, indent, "matchCL");
			//	Display Pre OCL Conditions
			s = fSourceRule.preOCLForCoEvol(indent+2);
			t = fTargetRule.preOCLForCoEvol(indent+2);
			c = fCorrRule.preOCLForCoEvol(indent+2);
			preForward += RTLRegex.indent(indent + 2) + RTLKeyword.S_pre + "\n";
			if( s!= null && (t != null || c != null))
				preForward += s + RTLKeyword.and + "\n";
			preForward += RTLRegex.indent(indent + 2) + RTLKeyword.T_pre + "\n";
			if(t != null && c != null)
			preForward += t + RTLKeyword.and + "\n";
			preForward += RTLRegex.indent(indent + 2) + RTLKeyword.C_pre + "\n";
			preForward += c + "\n";
			return preForward;
		}
	}
	
	/**
	Generate
		post trafoInitialNode_forwTrafo_post:
		------------------------------------------------
		--matchSR:Tuple(theActivityEdgeA:ActivityEdge,init:InitialNode)
  		  let theActivityEdgeA: ActivityEdge = matchSR.theActivityEdgeA in
  		  let init: InitialNode = matchSR.init in
  		  --T_postcondition
    		(Process.allInstances - Process.allInstances@pre)->exists( theProcessA |--
    		--C_postcondition
      		  (AE2P.allInstances - AE2P.allInstances@pre)->exists( ae2p |--
        		Set{ae2p.ae}->includesAll(Set{theActivityEdgeA}) and
        		Set{ae2p.p}->includesAll(Set{theProcessA})
        		)
      		  )
	 */
	public String postForwardTransformTuple(int indent) {
		String s, t, c;
		s = fSourceRule.getTupleForForwardTransform();
		t = fTargetRule.getTupleForCoEvolution();
		c = fCorrRule.getTupleForCoEvolution();
		String postForward = "";
		postForward += "post " + name + RTLKeyword.forwardTransform + RTLKeyword.post + "\n";
		if(s != null) {
			postForward += RTLRegex.comment(30, '-') + "\n";
			postForward += "--matchSR:" + s + "\n";
			postForward += parserTupleString(s, indent, "matchSR");
		}
		if(t != null) {
			postForward += RTLRegex.comment(30, '-') + "\n";
			postForward += "--matchTL:" + t + "\n";
			postForward += parserTupleString(t, indent, "matchTL");
		}
		if(c != null) {
			postForward += RTLRegex.comment(30, '-') + "\n";
			postForward += "--matchCL:" + c + "\n";
			postForward += parserTupleString(c, indent, "matchCL");
		}
		return postForward;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public ArrayList<TGGInvariant> getInvariants() {
		return fCorrRule.getInvariants();
	}
	
	/**
	 * Input:	Tuple(theActivityEdgeA:ActivityEdge,_action_name:String)
	 */
	public static String parserTupleString(String input, int indent, String match) {
		input = input.substring(6, input.length()-1);
		String[] objects = input.split(",");
		int l = objects.length;
		String parser = "";
		if(l == 0)
			return null;
		else {
			Pattern p = Pattern.compile(RTLRegex.ObjectRegex);
			Matcher m;
			for(int i = 0; i < l; i++) {
				m = p.matcher(objects[i].trim());
				if(m.find())
					parser += RTLRegex.indent(indent+2) + "let " + m.group(1) + ": " + m.group(2) +
					" = " + match + "." + m.group(1) + " in\n";
			}
			return parser;
		}
	}
	
	/**
	 * This function rewrites this TGGRule
	 */
	public String commandForCoEvolution(String model) {
		String command = "";
		command += "-- " + model + "_" + name + RTLKeyword.coEvolution + ".cmd\n";
		String s, t, c;
		s = fSourceRule.getTupleForCoEvolution();
		String match = "";
		String parserTuple = "";
		String tmp;
		if(s != null) {
			tmp = "--matchSL:" + s + "\n";
			command += tmp;
			parserTuple += RTLRegex.comment(50, '-') + "\n";
			parserTuple += tmp;
			parserTuple += parserTupleForCommand(s, 0, "matchSL");
			match += "matchSL,";
		}
		t = fTargetRule.getTupleForCoEvolution();
		if(t != null) {
			tmp = "--matchTL:" + t + "\n";
			command += tmp;
			parserTuple += RTLRegex.comment(50, '-') + "\n";
			parserTuple += tmp;
			parserTuple += parserTupleForCommand(t, 0, "matchTL");
			match += "matchTL,";
		}
		c = fCorrRule.getTupleForCoEvolution();
		if(c != null) {
			tmp = "--matchCL:" + c + "\n";
			command += tmp;
			parserTuple += RTLRegex.comment(50, '-') + "\n";
			parserTuple += tmp; 
			parserTuple += parserTupleForCommand(c, 0, "matchCL");
			match += "matchCL,";
		}
		while(match.endsWith(","))
			match = match.substring(0, match.length()-1);
		match = "(" + match + ")";
		
		match = "\n!openter rc " + name + RTLKeyword.coEvolution + match + "\n\n";
		command += match;
		command += parserTuple;
		s = fSourceRule.generateCommandForMatch("Create for matchS");
		if(s != null)
			command += s;
		t = fTargetRule.generateCommandForMatch("Create for matchT");
		if(t != null)
			command += t;
		c = fCorrRule.gerenateCommandForMatch("Create for matchC");
		if(c != null)
			command += c;
		command += RTLRegex.comment(50, '-') + "\n";
		command += "!opexit";
		return command;
	}
	
	/**
	 * This function rewrites this TGGRule
	 */
	public String commandForForwardTransform(String model) {
		String command = "";
		command += "-- " + model + "_" + name + RTLKeyword.forwardTransform + ".cmd\n";
		String s, t, c;
		s = fSourceRule.getTupleForForwardTransform();
		String match = "";
		String parserTuple = "";
		String tmp;
		if(s != null) {
			tmp = "--matchSR:" + s + "\n";
			command += tmp;
			parserTuple += RTLRegex.comment(50, '-') + "\n";
			parserTuple += tmp;
			parserTuple += parserTupleForCommand(s, 0, "matchSR");
			match += "matchSR,";
		}
		t = fTargetRule.getTupleForCoEvolution();
		if(t != null) {
			tmp = "--matchTL:" + t + "\n";
			command += tmp;
			parserTuple += RTLRegex.comment(50, '-') + "\n";
			parserTuple += tmp;
			parserTuple += parserTupleForCommand(t, 0, "matchTL");
			match += "matchTL,";
		}
		c = fCorrRule.getTupleForCoEvolution();
		if(c != null) {
			tmp = "--matchCL:" + c + "\n";
			command += tmp;
			parserTuple += RTLRegex.comment(50, '-') + "\n";
			parserTuple += tmp; 
			parserTuple += parserTupleForCommand(c, 0, "matchCL");
			match += "matchCL,";
		}
		s = fSourceRule.getTupleForCoEvolution();
		if(s != null) 
			command += "\n--matchSL:" + s +"\n";
		
		while(match.endsWith(","))
			match = match.substring(0, match.length()-1);
		match = "(" + match + ")";
		
		match = "\n!openter rc " + name + RTLKeyword.forwardTransform + match + "\n\n";
		command += match;
		command += parserTuple;
		
		t = fTargetRule.generateCommandForMatch("Create for matchT");
		if(t != null)
			command += t;
		c = fCorrRule.gerenateCommandForMatch("Create for matchC");
		if(c != null)
			command += c;
		command += RTLRegex.comment(50, '-') + "\n";
		command += "!opexit";
		return command;
	}
	
	/**
	Generate
		--matchTL:Tuple(theProcessA:Process)
		!let _theProcessA = matchTL.theProcessA
	From
		Tuple(theProcessA:Process)
	 */
	public static String parserTupleForCommand(String input, int indent, String match) {
		input = input.substring(6, input.length()-1);
		String[] objects = input.split(",");
		int l = objects.length;
		String parser = "";
		if(l == 0)
			return null;
		else {
			Pattern p = Pattern.compile(RTLRegex.ObjectRegex);
			Matcher m;
			String g1, g2;
			for(int i = 0; i < l; i++) {
				m = p.matcher(objects[i].trim());
				if(m.find()) {
					g1 = m.group(1).trim();
					if(!g1.startsWith("_"))
						g2 = "_" + g1;
					else
						g2 = g1;
					parser += RTLRegex.indent(indent) + "!let " + g2 + " = " + match + "." + g1 + "\n";
				}
			}
			return parser;
		}
	}
	
	public ArrayList<USEClass> generateUSEClasses() {
		return fCorrRule.generateUSEClasses();
	}
	
	public ArrayList<USEAssociation> generateUSEAssociations() {
		return fCorrRule.generateUSEAssociations();
	}
	
	/**
	Generate
		--S_postcondition
    	  ActivityEdge.allInstances->includesAll(Set{theActivityEdgeA}) and
    	  (Action.allInstances - Action.allInstances@pre)->exists( action |--
      		(ActivityEdge.allInstances - ActivityEdge.allInstances@pre)->exists( theActivityEdgeB |--
        	  Set{action,theActivityEdgeB}->size = 2 and
        	  Set{theActivityEdgeB.source}->includesAll(Set{action}) and
        	  Set{theActivityEdgeA.target}->includesAll(Set{action}) and
        	  action.name<>oclUndefined(String) and
      		--T_postcondition
        	  Process.allInstances->includesAll(Set{theProcessA}) and
        	  (Process.allInstances - Process.allInstances@pre)->exists( theProcessB |--
          		(ProcessAssignment.allInstances - ProcessAssignment.allInstances@pre)->exists( assignment |--
            	  (Prefix.allInstances - Prefix.allInstances@pre)->exists( prefix |--
              		(Event.allInstances - Event.allInstances@pre)->exists( theEvent |--
                	  Set{theProcessB,assignment,prefix,theEvent}->size = 4 and
                	  Set{assignment.left}->includesAll(Set{theProcessA}) and
                	  Set{assignment.right}->includesAll(Set{prefix}) and
                	  Set{prefix.event}->includesAll(Set{theEvent}) and
                	  Set{prefix.processExpression}->includesAll(Set{theProcessB}) and
              		--C_postcondition
                	  AE2P.allInstances->includesAll(Set{ae2p1}) and
                	  (AE2P.allInstances - AE2P.allInstances@pre)->exists( ae2p2 |--
                  		(AC2E.allInstances - AC2E.allInstances@pre)->exists( ac2e |--
                    	  Set{ae2p2,ac2e}->size = 2 and
                    	  Set{ae2p2.ae}->includesAll(Set{theActivityEdgeB}) and
                    	  Set{ae2p2.p}->includesAll(Set{theProcessB}) and
                    	  Set{ac2e.act}->includesAll(Set{action}) and
                    	  Set{ac2e.event}->includesAll(Set{theEvent}) and
                    	  Set{ae2p1.ae}->includesAll(Set{theActivityEdgeA}) and
                    	  Set{ae2p1.p}->includesAll(Set{theProcessA})
                    	  )
                  		)
                	  )
              		)
            	  )
          		)
        	  )
      		)
	 */
	public String generateCoEvolutionPostCondition() {
		String s, t, c;
		int i, j, k;
		i = 2;
		j = fSourceRule.numberOfRHSObject()*2 + i;
		k = j + fTargetRule.numberOfRHSObject()*2;
		c = fCorrRule.generatePostCondition("C_postcondition", k);
		t = fTargetRule.generatePostCondition("T_postcondition", j, c);
		s = fSourceRule.generatePostCondition("S_postcondition", i, t);
		return s;
	}
	
	
	/**
	Generate
		--T_postcondition
        	  Process.allInstances->includesAll(Set{theProcessA}) and
        	  (Process.allInstances - Process.allInstances@pre)->exists( theProcessB |--
          		(ProcessAssignment.allInstances - ProcessAssignment.allInstances@pre)->exists( assignment |--
            	  (Prefix.allInstances - Prefix.allInstances@pre)->exists( prefix |--
              		(Event.allInstances - Event.allInstances@pre)->exists( theEvent |--
                	  Set{theProcessB,assignment,prefix,theEvent}->size = 4 and
                	  Set{assignment.left}->includesAll(Set{theProcessA}) and
                	  Set{assignment.right}->includesAll(Set{prefix}) and
                	  Set{prefix.event}->includesAll(Set{theEvent}) and
                	  Set{prefix.processExpression}->includesAll(Set{theProcessB}) and
              		--C_postcondition
                	  AE2P.allInstances->includesAll(Set{ae2p1}) and
                	  (AE2P.allInstances - AE2P.allInstances@pre)->exists( ae2p2 |--
                  		(AC2E.allInstances - AC2E.allInstances@pre)->exists( ac2e |--
                    	  Set{ae2p2,ac2e}->size = 2 and
                    	  Set{ae2p2.ae}->includesAll(Set{theActivityEdgeB}) and
                    	  Set{ae2p2.p}->includesAll(Set{theProcessB}) and
                    	  Set{ac2e.act}->includesAll(Set{action}) and
                    	  Set{ac2e.event}->includesAll(Set{theEvent}) and
                    	  Set{ae2p1.ae}->includesAll(Set{theActivityEdgeA}) and
                    	  Set{ae2p1.p}->includesAll(Set{theProcessA})
                    	  )
                  		)
                	  )
              		)
            	  )
          		)
	 */
	public String generateForwardTransformPostCondition() {
		String t, c;
		int i, j;
		i = 2;
		j = fTargetRule.numberOfRHSObject()*2 + i;
		c = fCorrRule.generatePostCondition("C_postcondition", j);
		t = fTargetRule.generatePostCondition("T_postcondition", i, c);
		return t;
	}
}
