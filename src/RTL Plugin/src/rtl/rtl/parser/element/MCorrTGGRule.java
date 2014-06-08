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

public class MCorrTGGRule {
	/**
	 * MTGGRule fSource, fTarget and match between fSource and fTarget
	 */
	MTGGRule fSource, fTarget;
	ArrayList<TGGCorrLink> lhsCorrLinks;
	ArrayList<TGGCorrLink> rhsCorrLinks;
	
	ArrayList<TGGInvariant> invariants;
	
	//	Contain LHS (RHS) description
	ArrayList<String> ruleLHS, ruleRHS;
	
	
	public MCorrTGGRule(MTGGRule fSource, MTGGRule fTarget) {
		ruleLHS = new ArrayList<String>();
		ruleRHS = new ArrayList<String>();
		
		this.fSource = fSource;
		this.fTarget = fTarget;
		lhsCorrLinks = new ArrayList<TGGCorrLink>();
		rhsCorrLinks = new ArrayList<TGGCorrLink>();
		invariants = new ArrayList<TGGInvariant>();
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
		Pattern p = Pattern.compile(RTLRegex.CorrLinkRegex);
		Matcher m;
		for(int i = 0; i < ruleLHS.size(); i++) {
			line = ruleLHS.get(i);
			match = matchRTLRegex(line);
			if(match == -1) {
				System.out.println("Error: " + line);
				return false;
			} else if(match == 0) {
				m = p.matcher(line);
				if(m.find()) {
					String g1, g2, g3, g4, g5, g6;
					g1 = m.group(1);
					g2 = m.group(2);
					g3 = m.group(3);
					g4 = m.group(4);
					g5 = m.group(5);
					g6 = m.group(6);
					TGGObject corr = new TGGObject(g5, g6);
					TGGObject source = fSource.searchObjectInLHS(g1);
					TGGObject target = fTarget.searchObjectInLHS(g2);
					if(source == null || target == null) {
						System.out.println(g1 + " or " + g2 + " is not defined.");
						System.out.println("Error: " + line);
						System.exit(0);
					} else {
						TGGCorrLink link = new TGGCorrLink(source, g3, target, g4, corr);
						lhsCorrLinks.add(link);
					}
				}
			} else {
				TGGInvariant inv = TGGInvariant.parser(line);
				invariants.add(inv);
			}
		}
		return true;
	}
	
	private boolean parserRHS() {
		String line;
		int match;
		Pattern p = Pattern.compile(RTLRegex.CorrLinkRegex);
		Matcher m;
		for(int i = 0; i < ruleRHS.size(); i++) {
			line = ruleRHS.get(i);
			match = matchRTLRegex(line);
			if(match == -1) {
				System.out.println("Error: " + line);
				return false;
			} else if(match == 0) {
				m = p.matcher(line);
				if(m.find()) {
					String g1, g2, g3, g4, g5, g6;
					g1 = m.group(1);
					g2 = m.group(2);
					g3 = m.group(3);
					g4 = m.group(4);
					g5 = m.group(5);
					g6 = m.group(6);
					TGGObject corr = new TGGObject(g5, g6);
					TGGObject source = fSource.searchObjectInRHS(g1);
					TGGObject target = fTarget.searchObjectInRHS(g2);
					if(source == null || target == null) {
						System.out.println(g1 + " or " + g2 + " is not defined.");
						System.out.println("Error: " + line);
						System.exit(0);
					} else {
						TGGCorrLink link = new TGGCorrLink(source, g3, target, g4, corr);
						rhsCorrLinks.add(link);
					}
				}
			} else {
				TGGInvariant inv = TGGInvariant.parser(line);
				invariants.add(inv);
			}
		}
		return true;
	}
	
	/**
	Generate
		matchCL:Tuple(ae2p1:AE2P,ae2p2:AE2P))
	 */
	public String getTupleForCoEvolution() {
		int l = lhsCorrLinks.size();
		if(l <= 0)
			return null;
		String tuple = "Tuple(";
		TGGCorrLink link;
		TGGObject corrObject;
		for(int i = 0; i < l - 1; i++) {
			link = lhsCorrLinks.get(i);
			corrObject = link.getCorr();
			tuple += corrObject.name + ":" + corrObject.type + ",";
		}
		link = lhsCorrLinks.get(l-1);
		corrObject = link.getCorr();
		tuple += corrObject.name + ":" + corrObject.type;
		tuple += ")";
		return tuple;
	}
	
	public String getTupleForForwardTransform() {
		String tuple = "Tuple(";
		tuple += ")";
		return tuple;
	}
	
	public static int matchRTLRegex(String line) {
		if(line.matches(RTLRegex.CorrLinkRegex))
			return 0;
		else if(line.matches(RTLRegex.InvariantRegex))
			return 1;
		else
			return -1;
	}

	public ArrayList<TGGCorrLink> getLhsCorrLinks() {
		return lhsCorrLinks;
	}

	public ArrayList<TGGCorrLink> getRhsCorrLinks() {
		return rhsCorrLinks;
	}

	public ArrayList<TGGInvariant> getInvariants() {
		return invariants;
	}

	/**
	Generate
		Set{ae2p1.ae}->includesAll(Set{theActivityEdgeA}) and
		Set{ae2p1.p}->includesAll(Set{theProcessA}) and
		Set{ae2p2.ae}->includesAll(Set{theActivityEdgeB}) and
		Set{ae2p2.p}->includesAll(Set{theProcessB}) and
		Set{ac2e.act}->includesAll(Set{action}) and
		Set{ac2e.event}->includesAll(Set{theEvent})
	 */
	public String preOCLForCoEvol(int indent) {
		int l = lhsCorrLinks.size();
		String preOCL = "";
		TGGCorrLink link;
		TGGObject source, target, corr;
		String sRole, tRole;
		if(l == 0)
			return null;
		for(int i = 0; i < l-1; i++) {
			link = lhsCorrLinks.get(i);
			sRole = link.getRoleSource();
			tRole = link.getRoleTarget();
			source = link.getSource();
			target = link.getTarget();
			corr = link.getCorr();
			preOCL += RTLRegex.indent(indent+2) + "Set{" + corr.name + "." + sRole + 
					"}->includesAll(Set{" + source.name + "}) and\n" +
					RTLRegex.indent(indent+2) + "Set{" + corr.name + "." + tRole +
					"}->includesAll(Set{" + target.name + "}) and\n";
		}
		link = lhsCorrLinks.get(l-1);
		sRole = link.getRoleSource();
		tRole = link.getRoleTarget();
		source = link.getSource();
		target = link.getTarget();
		corr = link.getCorr();
		preOCL += RTLRegex.indent(indent+2) + "Set{" + corr.name + "." + sRole + 
				"}->includesAll(Set{" + source.name + "}) and\n" +
				RTLRegex.indent(indent+2) + "Set{" + corr.name + "." + tRole +
				"}->includesAll(Set{" + target.name + "})";
		return preOCL;
	}
	
	/**
	Generate
		!assign _ae2p2 := create AE2P
		!insert(_ae2p2,_theActivityEdgeB) into L_ActivityEdge_AE2P
		!insert(_ae2p2,_theProcessB) into R_Process_AE2P
		!assign _ac2e := create AC2E
		!insert(_ac2e,_action) into L_Action_AC2E
		!insert(_ac2e,_theEvent) into R_Event_AC2E
	 */
	public String gerenateCommandForMatch(String match) {
		String command = RTLRegex.comment(20, '-') + match + "\n";
		TGGCorrLink link;
		TGGObject source, target, corr;
		String nameS, nameT, nameC;
		String type;
		int l = rhsCorrLinks.size();
		if(l == 0)
			return null;
		for(int i = 0; i < l; i++) {
			link = rhsCorrLinks.get(i);
			corr = link.getCorr();
			source = link.getSource();
			target = link.getTarget();
			nameC = corr.name;
			nameC = RTLRegex.insertUnderscore(nameC);
			type = corr.type;
			command += "!assign " + nameC + " := create " + type + "\n";
			nameS = source.name;
			nameS = RTLRegex.insertUnderscore(nameS);
			nameT = target.name;
			nameT = RTLRegex.insertUnderscore(nameT);
			command += "!insert(" + nameC + "," + nameS + ") into L_" + source.type + "_" + type + "\n";
			command += "!insert(" + nameC + "," + nameT + ") into R_" + target.type + "_" + type + "\n";
		}
		command += RTLRegex.comment(20, '-') + RTLKeyword.updatemap + "\n";
		l = rhsCorrLinks.size();
		ArrayList<TGGInvariant> invariants = TGGParser.USEInvariants();
		TGGInvariant inv;
		int sizeInv = invariants.size();
		String mapInv;
		for(int i = 0; i < l; i++) {
			link = rhsCorrLinks.get(i);
			corr = link.getCorr();
			nameC = corr.name;
			type = corr.type;
			nameC = RTLRegex.insertUnderscore(nameC);
			for(int j = 0; j < sizeInv; j++) {
				inv = invariants.get(j);
				if(inv.name.equals(type)) {
					mapInv = inv.invariant.replaceAll(RTLKeyword.self, nameC);
					mapInv = mapInv.replace("=", ":=");
					mapInv = "!set " + mapInv + "\n";
					command += mapInv;
					break;
				}
			} 
		}
		return command;
	}
	
	public ArrayList<TGGCorrLink> getTGGCorrLinkType() {
		ArrayList<TGGCorrLink> links = new ArrayList<TGGCorrLink>();
		TGGCorrLink link;
		for(int i = 0; i < lhsCorrLinks.size(); i++) {
			link = lhsCorrLinks.get(i);
			links.add(link);
		}
		for(int i = 0; i < rhsCorrLinks.size(); i++) {
			link = rhsCorrLinks.get(i);
			links.add(link);
		}
		return links;
	}
	
	/**
	For new list classes such as
		class AE2CON
		end
	 */
	public ArrayList<USEClass> generateUSEClasses() {
		if(rhsCorrLinks.size() == 0 && lhsCorrLinks.size() == 0)
			return null;
		ArrayList<USEClass> uc = new ArrayList<USEClass>();
		TGGCorrLink link;
		for(int i = 0; i < rhsCorrLinks.size(); i++) {
			link = rhsCorrLinks.get(i);
			USEClass c = new USEClass(link.getCorr().type);
			uc.add(c);
		}
		for(int i = 0; i < lhsCorrLinks.size(); i++) {
			link = lhsCorrLinks.get(i);
			USEClass c = new USEClass(link.getCorr().type);
			uc.add(c);
		}
		return uc;
	}
	
	/**
	For new list associations
		association R_Condition_AE2CON between
			AE2CON[0..*] role cp_R_Condition_AE2CON
			Condition[1..1] role con
		end
	 */
	
	public ArrayList<USEAssociation> generateUSEAssociations() {
		if(rhsCorrLinks.size() == 0 && lhsCorrLinks.size() == 0)
			return null;
		ArrayList<USEAssociation> associations = new ArrayList<USEAssociation>();
		USEAssociation a;
		for(int i = 0; i < lhsCorrLinks.size(); i++) {
			a = lhsCorrLinks.get(i).generateLeftAssociation();
			if(a != null)
				associations.add(a);
			a = lhsCorrLinks.get(i).generateRightAssociation();
			if(a != null)
				associations.add(a);
		}
		for(int i = 0; i < rhsCorrLinks.size(); i++) {
			a = rhsCorrLinks.get(i).generateLeftAssociation();
			if(a != null)
				associations.add(a);
			a = rhsCorrLinks.get(i).generateRightAssociation();
			if(a != null)
				associations.add(a);
		}
		return associations;
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
	public String generatePostCondition(String match, int indent) {
		String condition = RTLRegex.indent(indent) + "--" + match + "\n";
		int l;
		String setOCL = "";
		TGGCorrLink link;
		TGGObject corr;
		ArrayList<TGGCorrLink> list = new ArrayList<TGGCorrLink>();
		list.addAll(rhsCorrLinks);
		list.addAll(lhsCorrLinks);
		l = lhsCorrLinks.size();
		ArrayList<TGGCorrLink> tmp = new ArrayList<TGGCorrLink>();
		for(int i = 0; i < l; i++)
			tmp.add(lhsCorrLinks.get(i));
		for(int i = 0; i < tmp.size(); i++) {
			link = lhsCorrLinks.get(i);
			corr = link.getCorr();
			String type = corr.type;
			String setObject = corr.name;
			for(int j = i+1; j < tmp.size(); j++) {
				link = tmp.get(j);
				corr = link.getCorr();
				if(corr.type.equals(type)) {
					setObject += "," + corr.name;
					tmp.remove(j);
					j = j - 1;
				}
			}
			//	ActivityEdge.allInstances->includesAll(Set{theActivityEdgeA})
			condition += RTLRegex.indent(indent+2) + corr.getType() +
					".allInstances->includesAll(Set{" + setObject + "}) and\n";
		}
		l = rhsCorrLinks.size();
		for(int i = 0; i < l; i++) {
			link = rhsCorrLinks.get(i);
			corr = link.getCorr();
			condition += RTLRegex.indent(indent + (i+1)*2) + "(" + corr.type + ".allInstances - " +
					corr.type + ".allInstances@pre)->exists( " + corr.name + " |--\n";
		}
		if(l > 1) {
			for(int i = 0; i < l - 1; i++) {
				setOCL += rhsCorrLinks.get(i).corr.name + ",";
			}
			setOCL += rhsCorrLinks.get(l-1).corr.name;
			setOCL = RTLRegex.indent(indent + (l+1)*2) + "Set{" + setOCL + "}->size = " + l + " and";
		}
		if(setOCL.length() > 0)
			condition += setOCL + "\n";
		for(int i = 0; i < list.size() - 1; i++) {
			condition += list.get(i).generateOCLCondition(indent+rhsCorrLinks.size()*2) + " and\n";
		}
		condition += list.get(list.size()-1).generateOCLCondition(indent+rhsCorrLinks.size()*2) + "\n";
		for(int i = rhsCorrLinks.size(); i > 0; i--)
			condition += RTLRegex.indent(indent + (1 + i)*2) + ")\n";
		return condition;
	}
}
