package rtl.parser.element;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import rtl.parser.main.TGGParser;
import rtl.parser.regex.RTLKeyword;
import rtl.parser.regex.RTLRegex;

public class MTGGRule {
	/**
	 * Object, Link, OCL Condition: set attribute, or '<>' condition
	 */
	//	For LHS
	ArrayList<TGGObject> lhsObjects;
	ArrayList<TGGLink> lhsLinks;
	ArrayList<String> lhsOCLCondition;
	ArrayList<String> lhsOCLAttribute;
	
	//	For RHS
	ArrayList<TGGObject> rhsObjects;
	ArrayList<TGGLink> rhsLinks;
	ArrayList<String> rhsOCLCondition;
	ArrayList<String> rhsOCLAttribute;
	
	//	Contain LHS (RHS) description
	ArrayList<String> ruleLHS, ruleRHS;
	
	public MTGGRule() {
		ruleLHS = new ArrayList<String>();
		ruleRHS = new ArrayList<String>();
		
		//		For LHS
		lhsObjects = new ArrayList<TGGObject>();
		lhsLinks = new ArrayList<TGGLink>();
		lhsOCLCondition = new ArrayList<String>();
		lhsOCLAttribute = new ArrayList<String>();
		
		//	For RHS
		rhsObjects = new ArrayList<TGGObject>();
		rhsLinks = new ArrayList<TGGLink>();
		rhsOCLCondition = new ArrayList<String>();
		rhsOCLAttribute = new ArrayList<String>();
	}
	
	/**
	Generate
		Tuple(theActivityEdgeA:ActivityEdge,_action_name:String)
	 */
	public String getTupleForCoEvolution() {
		String tuple = "Tuple(";
		TGGObject object;
		String oclCondition, g1, g2;
		Pattern p = Pattern.compile(RTLRegex.OCLCoditionRegex);
		Matcher m;
		int l = rhsOCLCondition.size();
		int k = lhsObjects.size();
		if(l == 0 && k == 0)
			return null;
		if(l > 0){
			for(int i = 0; i < k; i++) {
				object = lhsObjects.get(i);
				tuple += object.getName() + ":" + object.getType() + ",";
			}
			for(int i = 0; i < l - 1; i++) {
				oclCondition = rhsOCLCondition.get(i);
				m = p.matcher(oclCondition);
				if(m.find()) {
					g1 = m.group(1);
					g1 = "_" + g1.replace(".", "_"); 
					g2 = m.group(2);
					tuple += g1 + ":" + g2 + ",";
				}
			}
			oclCondition = rhsOCLCondition.get(l-1);
			m = p.matcher(oclCondition);
			if(m.find()) {
				g1 = m.group(1);
				g1 = "_" + g1.replace(".", "_"); 
				g2 = m.group(2);
				tuple += g1 + ":" + g2;
			}
		} else if(k > 0) {
			for(int i = 0; i < k - 1; i++) {
				object = lhsObjects.get(i);
				tuple += object.getName() + ":" + object.getType() + ",";
			}
			object = lhsObjects.get(k - 1);
			tuple += object.getName() + ":" + object.getType();
		}
		tuple += ")";
		return tuple;
	}
	
	/**
	Generate
		Tuple(theActivityEdgeA:ActivityEdge,_action_name:String)
	 */
	public String getTupleForForwardTransform() {
		int l1 = rhsObjects.size();
		int l2 = lhsObjects.size();
		if(l1 == 0 && l2 == 0)
			return null;
		String tuple = "Tuple(";
		TGGObject object;
		if(l1 > 0) {
			for(int i = 0; i < l1 - 1; i++){
				object = rhsObjects.get(i);
				tuple += object.name + ":" + object.type + ",";
			}
			object = rhsObjects.get(l1-1);
			tuple += object.name + ":" + object.type;
		}
		if(l2 > 0) {
			for(int i = 0; i < l2; i++) {
				object = lhsObjects.get(i);
				tuple += "," + object.name + ":" + object.type;
			}
		}
		tuple += ")";
		return tuple;
	}
	
	/**
	Generate
		--------------------------Create for matchS
		!assign _action := create Action
		!set _action.name := _action_name
		!assign _theActivityEdgeB := create ActivityEdge
		!insert(_theActivityEdgeA,_action) into ConnectsTo
		!insert(_theActivityEdgeB,_action) into ConnectsFrom
	 */
	public String generateCommandForMatch(String match) {
		String command = RTLRegex.comment(20, '-') + match + "\n";
		int l = rhsObjects.size();
		if(l == 0)
			return null;
		TGGObject object;
		String name, type;
		for(int i = 0; i < l; i++) {
			object = rhsObjects.get(i);
			name = object.name;
			name = RTLRegex.insertUnderscore(name);
			type = object.type;
			command += "!assign " + name + " := create " + type + "\n";
		}
		l = rhsOCLCondition.size();
		Pattern p = Pattern.compile(RTLRegex.OCLCoditionRegex);
		Matcher m;
		for(int i = 0; i < l; i++) {
			String condition = rhsOCLCondition.get(i);
			m = p.matcher(condition);
			if(m.find()) {
				name = m.group(1);
				name = RTLRegex.insertUnderscore(name);
				type = name;
				type = type.replace(".", "_");
				command += "!set " + name + " := " + type + "\n";
			}
		}
		
		String objectA, objectB;
		l = rhsLinks.size();
		for(int i = 0; i < l; i++) {
			TGGLink link = rhsLinks.get(i);
			type = link.getType();
			objectA = link.getObjectA();
			objectA = RTLRegex.insertUnderscore(objectA);
			objectB = link.getObjectB();
			objectB = RTLRegex.insertUnderscore(objectB);
			command += "!insert(" + objectA + "," + objectB + ") into " + type + "\n";
		}
		l = rhsOCLAttribute.size();
		for(int i = 0; i < l; i++) {
			String attribute = rhsOCLAttribute.get(i);
			if(attribute.contains("=")) {
				attribute = attribute.substring(1, attribute.length() - 1).trim();
				attribute = RTLRegex.insertUnderscore(attribute);
				attribute = attribute.replace("=", ":=");
				command += "!set " + attribute + "\n";
			}
		}
		return command;
	}
	
	/**
	Generate
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
	 */
	public String generatePostCondition(String match, int indent, String addon) {
		String condition = RTLRegex.indent(indent) + "--" + match + "\n";
		String setOCL = "";
		TGGObject object;
		int l;
		l = lhsObjects.size();
		ArrayList<TGGObject> tmp = new ArrayList<TGGObject>();
		for(int i = 0; i < l; i++)
			tmp.add(lhsObjects.get(i));
		for(int i = 0; i < tmp.size(); i++) {
			object = tmp.get(i);
			String type = object.type;
			String setObject = object.name;
			for(int j = i+1; j < tmp.size(); j++) {
				object = tmp.get(j);
				if(object.type.equals(type)) {
					setObject += "," + object.name;
					tmp.remove(j);
					j = j - 1;
				}
			}
			//	ActivityEdge.allInstances->includesAll(Set{theActivityEdgeA}) and
			condition += RTLRegex.indent(indent+2) + object.type + ".allInstances->includesAll(Set{" +
					setObject + "}) and\n";
		}
		l = rhsObjects.size();
		for(int i = 0; i < l; i++) {
			object = rhsObjects.get(i);
			condition += RTLRegex.indent(indent + (i+1)*2) + "(" + object.type + ".allInstances - " +
					object.type + ".allInstances@pre)->exists( " + object.name + " |--\n";
		}
		if(l > 1) {
			for(int i = 0; i < l - 1; i++) {
				setOCL += rhsObjects.get(i).name + ",";
			}
			setOCL += rhsObjects.get(l-1).name;
			setOCL = RTLRegex.indent(indent + (l+1)*2) + "Set{" + setOCL + "}->size = " + l + " and";
		}
		if(setOCL.length() > 0)
			condition += setOCL + "\n";
		
		ArrayList<TGGLink> links = new ArrayList<TGGLink>();
		TGGLink link;
		links.addAll(rhsLinks);
		links.addAll(lhsLinks);
		for(int i = 0; i < links.size(); i++) {
			link = links.get(i);
			setOCL = generateOCLConditionForLink(link, indent + (l+1)*2);
			if(setOCL != null)
				condition += setOCL + "\n";
		}
		
		for(int i = 0; i < rhsOCLCondition.size(); i++) {
			int l2 = rhsOCLCondition.get(i).length();
			condition += RTLRegex.indent(indent + (l+1)*2) + rhsOCLCondition.get(i).substring(1, l2-1) + " and\n";
		}
		
		for(int i = 0; i < rhsOCLAttribute.size(); i++) {
			int l2 = rhsOCLAttribute.get(i).length();
			condition += RTLRegex.indent(indent + (l+1)*2) + rhsOCLAttribute.get(i).substring(1, l2-1) + " and\n";
		}
		if(addon != null)
			condition += addon;
		else
			condition += "(1=1)";
		for(int i = rhsObjects.size(); i > 0; i--)
			condition += RTLRegex.indent(indent + (1 + i)*2) + ")\n";
		return condition;
	}
	
	/**
	Generate
		Set{assignment.left}->includesAll(Set{theProcessA}) and
	 */
	public String generateOCLConditionForLink(TGGLink link, int indent) {
		String nameA, nameB, typeLink;
		TGGObject objectB, objectA;
		String roleB;
		USEClass classB;
		USEAssociation association;
		
		nameA = link.objectA;
		nameB = link.objectB;
		typeLink = link.type;
		objectB = searchObjectInLHS(nameB);
		if(objectB == null)
			objectB = searchObjectInRHS(nameB);
		objectA = searchObjectInLHS(nameA);
		if(objectA == null)
			objectA = searchObjectInRHS(nameA);
		association = TGGParser.searchUSEAssociation(typeLink);
		classB = TGGParser.searchUSEClass(objectB.type);
		if(classB == null || objectA == null || association == null)
			return null;
		if(objectB.type.equals(objectA.type))
			roleB = association.getRoleName(objectB.type, true);
		else
			roleB = association.getRoleName(objectB.type, false);
		if(roleB == null)
			return null;
		
		String ocl = RTLRegex.indent(indent);
		ocl += "Set{" + nameA + "." + roleB + "}->includesAll(Set{" + nameB + "}) and";
		return ocl;
	}

	/**
	 * We need to check if line is match with expression in RTLRegex.java
	 * @return
	 * ObjectRegrex			:	0
	 * LinkRegrex			:	1
	 * OCLAttributeRegrex	:	2
	 * OCLCoditionRegrex	:	3
	 * Fail					:	-1
	 */
	public static int matchRTLRegex(String line) {
		if(line.matches(RTLRegex.ObjectRegex))
			return 0;
		else if(line.matches(RTLRegex.LinkRegex))
			return 1;
		else if(line.matches(RTLRegex.OCLAttributeRegex))
			return 2;
		else if(line.matches(RTLRegex.OCLCoditionRegex))
			return 3;
		else
			return -1;
	}

	public int numberOfRHSObject() {
		return rhsObjects.size();
	}

	/**
	 * We need to parser. Example
	 * 	(
	 * 		(theActivityEdgeA,theProcessA) as (ae,p) in ae2p1:AE2P
	 * 	){
	 * 		(theActivityEdgeB,theProcessB) as (ae,p) in ae2p2:AE2P
	 * 		(action,theEvent) as (act,event) in ac2e:AC2E
	 * 		AC2E:[self.event.name=self.act.name]
	 * 	}
	 */
	public boolean parser(String input) {
		input = input.trim();
		if(! input.startsWith("(") && ! input.endsWith("}")) {
			System.out.println("Rule is wrong syntax");
			return false;
		}
		
		BufferedReader br = new BufferedReader(new StringReader(input));
		String line;
		boolean isLHS = true;
		try {
			while ((line = br.readLine()) != null) {
				if(! line.startsWith("(") && ! line.startsWith("}")) {
					if(line.startsWith("){")) {
						isLHS = false;
						line = line.substring(2).trim();
						if(line.length() > 0)
							ruleRHS.add(line);
					} else if(line.trim().length() > 0) {
						if(isLHS)
							ruleLHS.add(line.trim());
						else
							ruleRHS.add(line.trim());
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		if(parserLHS() && parserRHS())
			return true;
		else
			return false;
	}

	/**
	 * Parser ruleLHS and ruleRHS
	 * @return
	 */
	private boolean parserLHS() {
		String line;
		int match;
		for(int i = 0; i < ruleLHS.size(); i++) {
			line = ruleLHS.get(i);
			match = matchRTLRegex(line);
			if(match == -1) {
				System.out.println("Error: " + line);
				return false;
			} else if(match == 0) {
				TGGObject object = TGGObject.parser(line);
				lhsObjects.add(object);
			} else if(match == 1) {
				TGGLink link = TGGLink.parser(line);
				lhsLinks.add(link);
			} else if(match == 2) {
				lhsOCLAttribute.add(line);
			} else if(match == 3) {
				lhsOCLCondition.add(line);
			}
		}
		return true;
	}

	private boolean parserRHS() {
		String line;
		int match;
		for(int i = 0; i < ruleRHS.size(); i++) {
			line = ruleRHS.get(i);
			match = matchRTLRegex(line);
			if(match == -1) {
				System.out.println("Error: " + line);
				return false;
			} else if(match == 0) {
				TGGObject object = TGGObject.parser(line);
				rhsObjects.add(object);
			} else if(match == 1) {
				TGGLink link = TGGLink.parser(line);
				rhsLinks.add(link);
			} else if(match == 2) {
				rhsOCLAttribute.add(line);
			} else if(match == 3) {
				rhsOCLCondition.add(line);
			}
		}
		return true;
	}

	/**
	Generate
		Set{ae2p1.ae}->includesAll(Set{theActivityEdgeA}) and
		Set{ae2p1.p}->includesAll(Set{theProcessA})
	 */
	public String preOCLForCoEvol(int indent) {
		String preOCL1 = "";
		String preOCL2 = "";
		int l1, l2;
		l1 = lhsOCLAttribute.size();
		l2 = lhsOCLCondition.size();
		if(l1 == 0 && l2 == 0)
			return null;
		String line;
		//	Get OCL For OCL Attribute
		for(int i = 0; i < l1 - 1; i ++) {
			line = lhsOCLAttribute.get(i);
			preOCL1 +=  RTLRegex.indent(indent+2) + line.substring(1, line.length()-1) + RTLKeyword.and + "\n";
		}
		if(l1 > 0) {
			line = lhsOCLAttribute.get(l1-1);
			preOCL1 += RTLRegex.indent(indent+2) + line.substring(1, line.length()-1);
		}
		//	Get OCL For OCL Condition
		for(int i = 0; i < l2 - 1; i ++) {
			line = lhsOCLCondition.get(i);
			preOCL2 +=  RTLRegex.indent(indent+2) + line.substring(1,line.length()-1) + RTLKeyword.and + "\n";
		}
		if(l2 > 0) {
			line = lhsOCLCondition.get(l2-1);
			preOCL2 += RTLRegex.indent(indent+2) + line.substring(1,line.length()-1);
		}
		if(preOCL1.length() > 0) {
			if(preOCL2.length() > 0)
				return preOCL1 + RTLKeyword.and + "\n" + preOCL2;
			else
				return preOCL1;
		} else if(preOCL2.length() > 0) {
			return preOCL2;
		} else {
			return null;
		}
	}

	public TGGObject searchObjectInLHS(String name) {
		TGGObject object;
		for(int i = 0; i < lhsObjects.size(); i++){
			object = lhsObjects.get(i);
			if(object.getName().equals(name))
				return object;
		}
		return null;
	}

	public TGGObject searchObjectInRHS(String name) {
		TGGObject object;
		for(int i = 0; i < rhsObjects.size(); i++){
			object = rhsObjects.get(i);
			if(object.getName().equals(name))
				return object;
		}
		return null;
	}
}
