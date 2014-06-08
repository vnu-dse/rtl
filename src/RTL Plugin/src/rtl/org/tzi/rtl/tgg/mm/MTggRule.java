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

package org.tzi.rtl.tgg.mm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.tzi.rtl.tgg.parser.RTLKeyword;
import org.tzi.use.uml.mm.MElementAnnotation;
import org.tzi.use.uml.mm.MMVisitor;
import org.tzi.use.uml.mm.MModel;
import org.tzi.use.uml.mm.MModelElement;
import org.tzi.use.uml.mm.MOperation;
import org.tzi.use.uml.ocl.expr.VarDecl;
import org.tzi.use.uml.ocl.type.TupleType;
import org.tzi.use.uml.ocl.type.TupleType.Part;
import org.tzi.use.uml.sys.MObject;
import org.tzi.use.uml.sys.MSystemState;

/**
 * ...
 * 
 * @version $ProjectVersion: 0.393 $
 * @author hanhdd
 */
@SuppressWarnings( { "unchecked" })
public class MTggRule implements MModelElement {
	/**
	 * @uml.property name="fSourceRule"
	 * @uml.associationEnd multiplicity="(1 1)"
	 */
	private MRule fSourceRule;// the source side
	/**
	 * @uml.property name="fTargetRule"
	 * @uml.associationEnd multiplicity="(1 1)"
	 */
	private MRule fTargetRule;// the target side
	/**
	 * @uml.property name="fCorrRule"
	 * @uml.associationEnd multiplicity="(1 1)"
	 */
	private MRule fCorrRule;// the corr side
	/**
	 * @uml.property name="fName"
	 */
	private String fName;
	/**
	 * @uml.property name="fIsDeletingRule"
	 */
	boolean fIsDeletingRule = false;
	/**
	 * We need save HTML file for TGGRule
	 */
	private String fHTMLFile;
	
	private Map<String, Object> fInvariants;

	public MTggRule(String name, MRule sourceRule, MRule targetRule,
			MRule corrRule, boolean isDeletingRule) {
		fName = name;
		fSourceRule = sourceRule;
		fTargetRule = targetRule;
		fCorrRule = corrRule;
		fIsDeletingRule = isDeletingRule;
		fHTMLFile = "";
		fInvariants = new HashMap<String, Object>();
	}

	public MRule getSourceRule() {
		return fSourceRule;
	}

	public MRule getTargetRule() {
		return fTargetRule;
	}

	public MRule getCorrRule() {
		return fCorrRule;
	}

	public MSystemState getSystemState_LHS() {
		return fSourceRule.getLHS().getMSystemState();
	}

	public MSystemState getSystemState_RHS() {
		return fSourceRule.getRHS().getMSystemState();
	}

	public MModel getModel() {
		return fSourceRule.getLHS().getMSystemState().system().model();
	}

	public boolean isDeletingRule() {
		return fIsDeletingRule;
	}

	public List getNewLinks() {
		List links = new ArrayList();
		links.addAll(fSourceRule.getNewLinks());
		links.addAll(fTargetRule.getNewLinks());
		links.addAll(fCorrRule.getNewLinks());
		return links;
	}

	public List getNonDeletingLinks() {
		List links = new ArrayList();
		links.addAll(fSourceRule.getNonDeletingLinks());
		links.addAll(fTargetRule.getNonDeletingLinks());
		links.addAll(fCorrRule.getNonDeletingLinks());
		return links;
	}

	public List getDeletingLinks() {
		List links = new ArrayList();
		links.addAll(fSourceRule.getDeletingLinks());
		links.addAll(fTargetRule.getDeletingLinks());
		links.addAll(fCorrRule.getDeletingLinks());
		return links;
	}

	public String name() {
		// TODO Auto-generated method stub
		return fName;
	}

	public void processWithVisitor(MMVisitor v) {
		// TODO Auto-generated method stub

	}

	public String toString() {
		return fName;
	}

	public int compareTo(MModelElement o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addAnnotation(MElementAnnotation arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, MElementAnnotation> getAllAnnotations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MElementAnnotation getAnnotation(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAnnotationValue(String arg0, String arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAnnotatable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAnnotated() {
		// TODO Auto-generated method stub
		return false;
	}

	public String htmlFile() {
		return fHTMLFile;
	}

	public void setfHTMLFile(String fHTMLFile) {
		this.fHTMLFile = fHTMLFile;
	}
	
	public void addCorrInvariant(String className, Object inv){
		fInvariants.put(className, inv);
	}

	public Map<String, Object> genCorrInvariant() {
		Map<String, Object> result = new HashMap<String, Object>();
		result.putAll(fCorrRule.getCorrInvariants());
		return result;
	}

	/**
	 * @return the fInvariants
	 */
	public Map<String, Object> getfInvariants() {
		return fInvariants;
	}

	/**
	 * Build parameter string for co-evolution transformation
	 * 
	 * @param sys
	 * @param indent
	 * @return
	 */
	public String buildParamsForCoEvol(int indent) {
		String params = RTLKeyword.indent(indent) + name()
				+ RTLKeyword.coEvolution + "(";
		String matchSL, matchCL, matchTL;
		// matchSL
		matchSL = fSourceRule.buildParamsForLeft(indent);
		if (!matchSL.equals(""))
			params += "\n" + RTLKeyword.indent(indent + 2) + RTLKeyword.matchSL
					+ ":" + matchSL + ",";
		// matchCL
		matchCL = fCorrRule.buildParamsForLeft(indent);
		if (!matchCL.equals(""))
			params += "\n" + RTLKeyword.indent(indent + 2) + RTLKeyword.matchCL
					+ ":" + matchCL + ",";
		// matchTL
		matchTL = fTargetRule.buildParamsForLeft(indent);
		if (!matchTL.equals(""))
			params += "\n" + RTLKeyword.indent(indent + 2) + RTLKeyword.matchTL
					+ ":" + matchTL + ",";
		return params.substring(0, params.length() - 1)
				+ RTLKeyword.indent(indent) + ")\n";
	}

	/**
	 * Build parameter string for forward transformation
	 * 
	 * @param sys
	 * @param indent
	 * @return
	 */
	public String buildParamsForFwdTrafo(int indent) {
		String params = RTLKeyword.indent(indent) + name()
				+ RTLKeyword.forwardTransform + "(";
		String matchSR, matchCL, matchTL;
		// matchSL
		matchSR = fSourceRule.buildParamsForLeftRight(indent);
		if (!matchSR.equals(""))
			params += "\n" + RTLKeyword.indent(indent + 2) + RTLKeyword.matchSR
					+ ":" + matchSR + ",";
		// matchCL
		matchCL = fCorrRule.buildParamsForLeft(indent);
		if (!matchCL.equals(""))
			params += "\n" + RTLKeyword.indent(indent + 2) + RTLKeyword.matchCL
					+ ":" + matchCL + ",";
		// matchTL
		matchTL = fTargetRule.buildParamsForLeft(indent);
		if (!matchTL.equals(""))
			params += "\n" + RTLKeyword.indent(indent + 2) + RTLKeyword.matchTL
					+ ":" + matchTL + ",";
		return params.substring(0, params.length() - 1)
				+ RTLKeyword.indent(indent) + ")\n";
	}

	/**
	 * Build parameter string for integration
	 * 
	 * @param sys
	 * @param indent
	 * @return
	 */
	public String buildParamsForIntegration(int indent) {
		String params = RTLKeyword.indent(indent) + name()
				+ RTLKeyword.integration + "(";
		String matchSR, matchCL, matchTR;
		// matchSL
		matchSR = fSourceRule.buildParamsForLeftRight(indent);
		if (!matchSR.equals(""))
			params += "\n" + RTLKeyword.indent(indent + 2) + RTLKeyword.matchSR
					+ ":" + matchSR + ",";
		// matchCL
		matchCL = fCorrRule.buildParamsForLeft(indent);
		if (!matchCL.equals(""))
			params += "\n" + RTLKeyword.indent(indent + 2) + RTLKeyword.matchCL
					+ ":" + matchCL + ",";
		// matchTL
		matchTR = fTargetRule.buildParamsForLeftRight(indent);
		if (!matchTR.equals(""))
			params += "\n" + RTLKeyword.indent(indent + 2) + RTLKeyword.matchTR
					+ ":" + matchTR + ",";
		return params.substring(0, params.length() - 1)
				+ RTLKeyword.indent(indent) + ")\n";
	}

	/**
	 * Build pre condition for forward transformation operation
	 * 
	 * @param indent
	 * @return
	 */
	public String buildPreConditionForCoEvol(MOperation operation, int indent) {
		String pre = "", s = "", c = "", t = "", var = "", inv = "";
		var = buildVariableForCondition(operation, indent);
		s = fSourceRule.buildPreConditionLeft(indent);
		c = fCorrRule.buildPreConditionLeft(indent);
		t = fTargetRule.buildPreConditionLeft(indent);
		inv = buildInvariantCondition(indent + 2, fCorrRule.getLHS());
		if (!s.equals("") || !c.equals("") || !t.equals("") || !inv.equals("")) {
			pre += "\npre " + operation.name() + "_pre:";
			pre += var;
			pre += "\n" + RTLKeyword.indent(indent + 2) + RTLKeyword.S_pre + s;
			if (!c.equals("") || !t.equals("") || !inv.equals(""))
				pre += RTLKeyword.and;
			pre += "\n" + RTLKeyword.indent(indent + 2) + RTLKeyword.T_pre + t;
			if (!c.equals("") || !inv.equals(""))
				pre += RTLKeyword.and;
			pre += "\n" + RTLKeyword.indent(indent + 2) + RTLKeyword.C_pre + c;
			if (!inv.equals(""))
				pre += RTLKeyword.and;
			pre += RTLKeyword.indent(indent + 2) + inv;
		}
		return pre;
	}

	/**
	 * Build post condition for forward transformation operation
	 * 
	 * @param indent
	 * @return
	 */
	public String buildPostConditionForCoEvol(MOperation operation, int indent) {
		String post = "", s = "", c = "", t = "", var = "", inv = "";
		var += buildVariableForCondition(operation, indent);
		s = fSourceRule.buildPostConditionRight(indent);
		t = fTargetRule.buildPostConditionRight(indent
				+ fSourceRule.getIndentNum() * 2);
		c = fCorrRule
				.buildPostConditionRight(indent
						+ (fSourceRule.getIndentNum() + fTargetRule
								.getIndentNum()) * 2);
		if (!s.equals("") || !c.equals("") || !t.equals("")) {
			post += "\npost " + operation.name() + "_post:";
			post += var;
		}

		post += "\n" + RTLKeyword.indent(indent) + RTLKeyword.S_post + s;
		if ((!t.equals("") || !c.equals("")) && !s.equals("")
				&& !post.endsWith("|"))
			post += RTLKeyword.and;
		post += "\n"
				+ RTLKeyword.indent(indent + fSourceRule.getIndentNum() * 2)
				+ RTLKeyword.T_post + t;
		if (!c.equals("") && (!s.equals("") || !t.equals(""))
				&& !post.endsWith("|"))
			post += RTLKeyword.and;
		post += "\n"
				+ RTLKeyword.indent(indent
						+ (fSourceRule.getIndentNum() + fTargetRule
								.getIndentNum()) * 2) + RTLKeyword.C_post + c;
		inv = buildInvariantCondition(indent + (fSourceRule.getIndentNum()
								+ fTargetRule.getIndentNum() + fCorrRule
								.getIndentNum()) * 2, fCorrRule.getRHS());
		if (!inv.equals("")
				&& (!c.equals("") || !t.equals("") || !s.equals("")))
			post += RTLKeyword.and + inv;
		// insert RPAREN missing
		for (int i = fTargetRule.getIndentNum() + fCorrRule.getIndentNum()
				+ fSourceRule.getIndentNum(); i > 0; i--) {
			post += "\n" + RTLKeyword.indent(i * 2) + ")";
		}
		return post;
	}

	/**
	 * Build pre condition for forward transformation operation
	 * 
	 * @param indent
	 * @return
	 */
	public String buildPreConditionForFwdTrafo(MOperation operation, int indent) {
		String pre = "", s = "", c = "", t = "", var = "", inv = "";
		var = buildVariableForCondition(operation, indent);
		s = fSourceRule.buildPreConditionLeftRight(indent);
		c = fCorrRule.buildPreConditionLeft(indent);
		t = fTargetRule.buildPreConditionLeft(indent);
		inv = buildInvariantCondition(indent + 2, fCorrRule.getLHS());
		if (!s.equals("") || !c.equals("") || !t.equals("") || !inv.equals("")) {
			pre += "\npre " + operation.name() + "_pre:";
			pre += var;
			pre += "\n" + RTLKeyword.indent(indent + 2) + RTLKeyword.S_pre + s;
			if (!c.equals("") || !t.equals("") || !inv.equals(""))
				pre += RTLKeyword.and;
			pre += "\n" + RTLKeyword.indent(indent + 2) + RTLKeyword.T_pre + t;
			if (!c.equals("") || !inv.equals(""))
				pre += RTLKeyword.and;
			pre += "\n" + RTLKeyword.indent(indent + 2) + RTLKeyword.C_pre + c;
			if (!inv.equals(""))
				pre += RTLKeyword.and;
			pre += RTLKeyword.indent(indent + 2) + inv;
		}
		return pre;
	}

	/**
	 * Build post condition for forward transformation operation
	 * 
	 * @param indent
	 * @return
	 */
	public String buildPostConditionForFwdTrafo(MOperation operation, int indent) {
		String post = "", c = "", t = "", var = "", inv = "";
		var += buildVariableForCondition(operation, indent);
		t = fTargetRule.buildPostConditionRight(indent);
		c = fCorrRule.buildPostConditionRight(indent
				+ fTargetRule.getIndentNum() * 2);
		if (!c.equals("") || !t.equals("")) {
			post += "\npost " + operation.name() + "_post:";
			post += var;
		}
		post += "\n" + RTLKeyword.indent(indent) + RTLKeyword.T_post + t;

		if (!t.equals("") && !c.equals("") && !post.endsWith("|"))
			post += RTLKeyword.and;
		post += "\n"
				+ RTLKeyword.indent(indent + fTargetRule.getIndentNum() * 2)
				+ RTLKeyword.C_post + c;
		inv = buildInvariantCondition(indent + fTargetRule.getIndentNum() * 2
						+ fCorrRule.getIndentNum() * 2, fCorrRule.getRHS());
		if (!inv.equals("") && (!c.equals("") || !t.equals("")))
			post += RTLKeyword.and + inv;
		// insert RPAREN missing
		for (int i = fTargetRule.getIndentNum() + fCorrRule.getIndentNum(); i > 0; i--) {
			post += "\n" + RTLKeyword.indent(i * 2) + ")";
		}
		return post;
	}

	/**
	 * Build pre condition for forward transformation operation
	 * 
	 * @param indent
	 * @return
	 */
	public String buildPreConditionForIntegration(MOperation operation, int indent) {
		String pre = "", s = "", c = "", t = "", var = "", inv = "";
		var = buildVariableForCondition(operation, indent);
		s = fSourceRule.buildPreConditionLeftRight(indent);
		c = fCorrRule.buildPreConditionLeft(indent);
		t = fTargetRule.buildPreConditionLeftRight(indent);
		inv = buildInvariantCondition(indent + 2, fCorrRule.getLHS());
		if (!s.equals("") || !c.equals("") || !t.equals("") || !inv.equals("")) {
			pre += "\npre " + operation.name() + "_pre:";
			pre += var;
			pre += "\n" + RTLKeyword.indent(indent + 2) + RTLKeyword.S_pre + s;
			if (!c.equals("") || !t.equals("") || !inv.equals(""))
				pre += RTLKeyword.and;
			pre += "\n" + RTLKeyword.indent(indent + 2) + RTLKeyword.T_pre + t;
			if (!c.equals("") || !inv.equals(""))
				pre += RTLKeyword.and;
			pre += "\n" + RTLKeyword.indent(indent + 2) + RTLKeyword.C_pre + c;
			if (!inv.equals(""))
				pre += RTLKeyword.and;
			pre += RTLKeyword.indent(indent + 2) + inv;
		}
		return pre;
	}

	/**
	 * Build post condition for forward transformation operation
	 * 
	 * @param indent
	 * @return
	 */
	public String buildPostConditionForIntegration(MOperation operation, int indent) {
		String post = "", c = "", var = "", inv = "";
		var += buildVariableForCondition(operation, indent);
		c = fCorrRule.buildPostConditionRight(indent);
		if (!c.equals("")) {
			post += "\npost " + operation.name() + "_post:";
			post += var;
			post += "\n" + RTLKeyword.indent(indent) + RTLKeyword.C_post + c;
		}
		inv = buildInvariantCondition(indent + fCorrRule.getIndentNum() * 2, fCorrRule.getRHS());
		if (!inv.equals(""))
			post += RTLKeyword.and + inv;
		// insert RPAREN are missing
		for (int i = fCorrRule.getIndentNum(); i > 0; i--) {
			post += "\n" + RTLKeyword.indent(i * 2) + ")";
		}
		return post;
	}

	public String buildVariableForCondition(MOperation operation, int indent) {
		String ocl = "";
		for (Iterator iter = operation.paramList().iterator(); iter.hasNext();) {
			VarDecl mVarDecl = (VarDecl) iter.next();
			ocl += "\n" + RTLKeyword.comment(20, '-');
			ocl += "\n--" + mVarDecl.toString();
			TupleType mTupleType = (TupleType) mVarDecl.type();
			for (Iterator iter1 = mTupleType.getParts().keySet().iterator(); iter1
					.hasNext();) {
				String key = (String) iter1.next();
				Part mPart = mTupleType.getPart(key);
				ocl += "\n" + RTLKeyword.indent(indent) + "let " + mPart.name()
						+ ":" + mPart.type().toString() + " = "
						+ mVarDecl.name() + "." + mPart.name() + " in";

			}
		}
		return ocl;
	}

	public String buildInvariantCondition(int indent, MTggPattern part) {
		String ocl = "", tmp = "";
		for (Iterator iter = part.getObjects().iterator(); iter.hasNext();) {
			MObject obj = (MObject) iter.next();
			for (Iterator iter1 = fInvariants.keySet().iterator(); iter1.hasNext();) {
				String key = (String) iter1.next();
				if (key.equals(obj.cls().name())) {
					tmp = fInvariants.get(key).toString().replace(RTLKeyword.self,
							obj.name());
					ocl += "\n" + RTLKeyword.indent(indent)
							+ tmp.substring(1, tmp.length() - 1)
							+ RTLKeyword.and;
				}
			}

		}
		if (!ocl.equals(""))
			ocl = ocl.substring(0, ocl.length() - RTLKeyword.and.length());
		return ocl;
	}
	
	public String oclForUpdateAttributeForward(){
		String ocl = "";
		for (Iterator iter = fCorrRule.getRHS().getObjects().iterator(); iter.hasNext();) {
			MObject obj = (MObject) iter.next();
			for (Iterator iter1 = fInvariants.keySet().iterator(); iter1.hasNext();) {
				String className = (String) iter1.next();
				if (obj.cls().name().equals(className)){
					String inv = (String)fInvariants.get(className);
					if (inv.startsWith("["))
						inv = inv.substring(1, inv.length()-1);
					ocl += "\nset " + inv.replace(RTLKeyword.self, obj.name()).replace("=", ":=");
				}
			}
		}
		return ocl;
	}
}
