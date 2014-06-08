package rtl.parser.element;

import rtl.parser.regex.RTLKeyword;
import rtl.parser.regex.RTLRegex;

public class TGGCorrLink {
	TGGObject source;
	String roleSource;
	TGGObject target;
	String roleTarget;
	TGGObject corr;

	public TGGCorrLink() {
		source = null;
		target = null;
		corr = null;
		roleSource = "";
		roleTarget = "";
	}
	
	public TGGCorrLink(TGGObject source, String roleSource, TGGObject target, String roleTarget,
			TGGObject corr) {
		this.source = source;
		this.target = target;
		this.corr = corr;
		this.roleSource = roleSource;
		this.roleTarget = roleTarget;
	}

	public TGGObject getSource() {
		return source;
	}

	public void setSource(TGGObject source) {
		this.source = source;
	}

	public String getRoleSource() {
		return roleSource;
	}

	public void setRoleSource(String roleSource) {
		this.roleSource = roleSource;
	}

	public TGGObject getTarget() {
		return target;
	}

	public void setTarget(TGGObject target) {
		this.target = target;
	}

	public String getRoleTarget() {
		return roleTarget;
	}

	public void setRoleTarget(String roleTarget) {
		this.roleTarget = roleTarget;
	}

	public TGGObject getCorr() {
		return corr;
	}

	public void setCorr(TGGObject corr) {
		this.corr = corr;
	}
	
	/**
	Generate
		association L_Process_F2P between
			F2P[0..*] role cp_L_Process_F2P
			Process[1..1] role p
		end
	 */
	public USEAssociation generateLeftAssociation() {
		if(source == null || target == null || corr == null)
			return null;
		USEAssociation a = new USEAssociation();
		String des;
		String name;
		name = "L_" + source.type + "_" + corr.type;
		des = RTLKeyword.startAssociation + " " + name + " " + RTLKeyword.between;
		a.appendDescription(des);
		des = RTLRegex.indent(2) + corr.type + RTLKeyword.multipliciry0n + " role cp_" + name;
		a.appendDescription(des);
		des = RTLRegex.indent(2) + source.type + RTLKeyword.multiplicity11 + " role " + roleSource;
		a.appendDescription(des);
		des = RTLKeyword.endAssociation;
		a.appendDescription(des);
		a.parser();
		return a;
	}
	
	/**
	Generate
		association R_Process_F2P between
			F2P[0..*] role cp_R_Process_F2P
			Process[1..1] role p
		end
	 */
	
	public USEAssociation generateRightAssociation() {
		if(source == null || target == null || corr == null)
			return null;
		USEAssociation a = new USEAssociation();
		String des;
		String name;
		name = "R_" + target.type + "_" + corr.type;
		des = RTLKeyword.startAssociation + " " + name + " " + RTLKeyword.between;
		a.appendDescription(des);
		des = RTLRegex.indent(2) + corr.type + RTLKeyword.multipliciry0n + " role cp_" + name;
		a.appendDescription(des);
		des = RTLRegex.indent(2) + target.type + RTLKeyword.multiplicity11 + " role " + roleTarget;
		a.appendDescription(des);
		des = RTLKeyword.endAssociation;
		a.appendDescription(des);
		a.parser();
		return a;
	}

	/**
	Generate
		Set{ae2p.ae}->includesAll(Set{theActivityEdgeA}) and
		Set{ae2p.p}->includesAll(Set{theProcessA})
	 */
	public String generateOCLCondition(int indent) {
		// TODO Auto-generated method stub
		String condition = RTLRegex.indent(indent+2) + "Set{" + corr.name + "." + roleSource + 
		"}->includesAll(Set{" + source.name + "}) and\n" +
		RTLRegex.indent(indent+2) + "Set{" + corr.name + "." + roleTarget +
		"}->includesAll(Set{" + target.name + "})";
		return condition;
	}
}
