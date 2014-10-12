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

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.tzi.rtl.tgg.parser.RTLKeyword;
import org.tzi.use.parser.ocl.OCLCompiler;
import org.tzi.use.uml.mm.MClass;
import org.tzi.use.uml.mm.MElementAnnotation;
import org.tzi.use.uml.mm.MMVisitor;
import org.tzi.use.uml.mm.MModelElement;
import org.tzi.use.uml.ocl.expr.ExpAttrOp;
import org.tzi.use.uml.ocl.expr.ExpStdOp;
import org.tzi.use.uml.ocl.expr.ExpUndefined;
import org.tzi.use.uml.ocl.expr.Expression;
import org.tzi.use.uml.sys.MObject;
import org.tzi.use.uml.sys.MSystem;
import org.tzi.use.util.UniqueNameGenerator;

/**
 * ...
 * 
 * @version $ProjectVersion: 0.393 $
 * @author hanhdd
 */
@SuppressWarnings( { "unchecked" })
public class MRule implements MModelElement {
	/**
	 * @uml.property name="fLhs"
	 * @uml.associationEnd multiplicity="(1 1)"
	 */
	private MTggPattern fLhs;// LHS of the rule
	/**
	 * @uml.property name="fRhs"
	 * @uml.associationEnd multiplicity="(1 1)"
	 */
	private MTggPattern fRhs;// RHS of the delting rule or (RHS\LHS of the
								// nondeling rule)
	/**
	 * @uml.property name="fIsDeletingRule"
	 */
	private boolean fIsDeletingRule;
	/**
	 * @uml.property name="fName"
	 */
	private String fName;

	private int indentNum = 0;

	public MRule(String name, MTggPattern lhs, MTggPattern rhs,
			boolean isDeletingRule) {
		fName = name;
		fLhs = lhs;
		fRhs = rhs;
		fIsDeletingRule = isDeletingRule;
	}

	public MTggPattern getLHS() {
		return fLhs;
	}

	public MTggPattern getRHS() {
		return fRhs;
	}

	public List getAllObjects() {
		List objects = new ArrayList();
		List lhsObjects = fLhs.getObjects();
		List rhsObjects = fRhs.getObjects();
		objects.addAll(lhsObjects);
		objects.addAll(rhsObjects);
		return objects;
	}

	public List getDeletingObjects() {// MObject
		if (!fIsDeletingRule) {
			return new ArrayList();
		}
		List objects = fLhs.getObjects();
		List rhsObjects = fRhs.getObjects();
		objects.removeAll(rhsObjects);
		return objects;
	}

	public List getNonDeletingObjects() {
		List objects = fLhs.getObjects();
		List rhsObjects = fRhs.getObjects();
		if (!fIsDeletingRule)
			return objects;
		objects.retainAll(rhsObjects);
		return objects;
	}

	public List getNewObjects() {
		List objects = fRhs.getObjects();
		List lhsObjects = fLhs.getObjects();
		if (!fIsDeletingRule)
			return objects;
		objects.removeAll(lhsObjects);
		return objects;
	}

	public List getNewLinks() {
		List links = fRhs.getLinks();// MLink
		if (fIsDeletingRule) {
			links.removeAll(fLhs.getLinks());
		}
		return links;
	}

	public List getNonDeletingLinks() {
		List links = new ArrayList();
		if (fIsDeletingRule) {
			links = fLhs.getLinks();
			links.retainAll(fRhs.getLinks());
		} else {
			links = fLhs.getLinks();
		}
		return links;
	}

	public List getDeletingLinks() {
		List links = new ArrayList();
		if (fIsDeletingRule) {
			links = fLhs.getLinks();
			links.removeAll(fRhs.getLinks());
		}
		return links;
	}

	public String name() {
		// TODO Auto-generated method stub
		return fName;
	}

	public void processWithVisitor(MMVisitor v) {
		// TODO Auto-generated method stub

	}

	public List preconditions() {
		// TODO Auto-generated method stub
		return fLhs.getConditions();
	}

	public List postconditions() {
		return fRhs.getConditions();
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

	public Map<String, Object> getCorrInvariants() {
		Map<String, Object> result = new HashMap<String, Object>();
		result.putAll(fLhs.genCorrInvariants());
		result.putAll(fRhs.genCorrInvariants());
		return result;
	}

	/**
	 * @return the indentNum
	 */
	public int getIndentNum() {
		return indentNum;
	}

	private String buildParamsFromCondition(MTggPattern tgg) {
		String params = "";
		MSystem fSystem;
		fSystem = tgg.getMSystemState().system();
		List conditions = tgg.getConditions();
		for (Iterator iter = conditions.iterator(); iter.hasNext();) {
			String cond = (String) iter.next();
			StringWriter errorOutput = new StringWriter();

			Expression expr = OCLCompiler.compileExpression(fSystem.model(),
					fSystem.state(), cond.substring(1, cond.length() - 1),
					"Error", new PrintWriter(errorOutput, true), fSystem
							.varBindings());
			if (expr != null && expr instanceof ExpStdOp) {
				ExpStdOp exp = (ExpStdOp) expr;
				if (exp.args()[1] instanceof ExpUndefined
						&& exp.args()[0] instanceof ExpAttrOp) {
					ExpAttrOp x1 = (ExpAttrOp) exp.args()[0];
					ExpUndefined x2 = (ExpUndefined) exp.args()[1];
					if (!fLhs.getObjects().contains(
							fSystem.state()
									.objectByName(x1.objExp().toString()))) {
						params += "_" + x1.objExp().toString() + "_"
								+ x1.attr().name() + ":" + x2.type().toString()
								+ ",";
					}
				}
			}

		}
		return params;
	}

	/**
	 * Build parameter for left side
	 * 
	 * @param indent
	 * @return
	 */
	public String buildParamsForLeft(int indent) {
		String params = "", cond = "";
		boolean flag = true;
		// class in left
		for (Iterator iter = fLhs.getObjects().iterator(); iter.hasNext();) {
			MObject obj = (MObject) iter.next();
			if (flag) {
				params += "Tuple(";
				flag = false;
			}
			params += obj.name() + ":" + obj.cls().name() + ",";
		}
		// condition in right
		cond = buildParamsFromCondition(fLhs);
		cond += buildParamsFromCondition(fRhs);
		if (!cond.equals("")) {
			if (flag) {
				params += "Tuple(";
				flag = false;
			}
			params += cond;
		}
		if (params.equals(""))
			return "";
		return params.substring(0, params.length() - 1) + ")";
	}

	/**
	 * Build precondition for left side
	 * 
	 * @param indent
	 * @return
	 */
	public String buildParamsForLeftRight(int indent) {
		String params = "";
		boolean flag = true;
		// class in left + right
		for (Iterator iter = fLhs.getObjects().iterator(); iter.hasNext();) {
			MObject obj = (MObject) iter.next();
			if (flag) {
				params += "Tuple(";
				flag = false;
			}
			params += obj.name() + ":" + obj.cls().name() + ",";
		}
		for (Iterator iter = fRhs.getObjects().iterator(); iter.hasNext();) {
			MObject obj = (MObject) iter.next();
			if (flag) {
				params += "Tuple(";
				flag = false;
			}
			params += obj.name() + ":" + obj.cls().name() + ",";
		}
		if (params.equals(""))
			return "";
		return params.substring(0, params.length() - 1) + ")";
	}

	/**
	 * Build precondition for left side
	 * 
	 * @param indent
	 * @return
	 */
	public String buildPreConditionLeft(int indent) {
		String pre = "", links, ocls;
		links = buildLinkConditionLeft(indent + 2);
		// atts = buildAttrConditionLeft(indent + 2);
		ocls = buildOCLConditionLeft(indent + 2);
		if (!links.equals(""))
			pre = links;
		if (!links.equals("") && !ocls.equals(""))
			pre += RTLKeyword.and + ocls;
		else
			pre += ocls;
		return pre;
	}

	/**
	 * Build precondition for left + right side
	 * 
	 * @param indent
	 * @return
	 */
	public String buildPreConditionLeftRight(int indent) {
		String pre = "", links, ocls;
		links = buildLinkConditionLeftRight(indent + 2);
		ocls = buildOCLConditionLeftRight(indent + 2);
		if (!links.equals(""))
			pre = links;
		if (!links.equals("") && !ocls.equals(""))
			pre += RTLKeyword.and + ocls;
		else
			pre += ocls;
		return pre;
	}

	/**
	 * Build postcondition for left side
	 * 
	 * @param indent
	 * @return
	 */
	public String buildPostConditionRight(int indent) {
		String post = "", ocl = "";
		// Maintain object in left
		List<MClass> classes = new ArrayList<MClass>();
		for (Iterator iter = fLhs.getObjects().iterator(); iter.hasNext();) {
			MObject obj = (MObject) iter.next();
			MClass cls = obj.cls();
			if (!classes.contains(cls))
				classes.add(cls);
		}
		for (Iterator iter = classes.iterator(); iter.hasNext();) {
			MClass mClass = (MClass) iter.next();
			post += "\n" + RTLKeyword.indent(indent) + mClass.name()
					+ ".allInstances->includesAll(Set{";
			for (Iterator iter1 = fLhs.getObjects().iterator(); iter1.hasNext();) {
				MObject mObj = (MObject) iter1.next();
				if (mObj.cls().name().equals(mClass.name())) {
					post += mObj.name() + ",";
				}
			}
			post = post.substring(0, post.length() - 1) + "})" + RTLKeyword.and;
		}
		// Exist new object in right
		indentNum = 0;
		for (Iterator iter = fRhs.getObjects().iterator(); iter.hasNext();) {
			MObject mObj = (MObject) iter.next();
			post += "\n" + RTLKeyword.indent(indent + 2 * indentNum) + "("
					+ mObj.cls().name() + ".allInstances - "
					+ mObj.cls().name() + ".allInstances@pre)->exists("
					+ mObj.name() + "|";
			indentNum++;
		}
		// Exist Link between objects
		post += fRhs.buildLinkCondition(indent + indentNum * 2);
		// OCL condition
		ocl = buildOCLConditionRight(indent + indentNum * 2);
		if (!ocl.equals(""))
			if (post.endsWith("|"))
				post += ocl;
			else
				post += RTLKeyword.and + ocl;
		
		if (post.endsWith(RTLKeyword.and))
			post = post.substring(0, post.length() - RTLKeyword.and.length());
		return post;
	}

	/**
	 * Build link condition for left side
	 * 
	 * @param indent
	 * @return
	 */
	public String buildOCLConditionLeft(int indent) {
		String pre = "";
		pre = fLhs.buildOCLCondition(indent);
		return pre;
	}

	/**
	 * Build link condition for right side
	 * 
	 * @param indent
	 * @return
	 */
	public String buildOCLConditionRight(int indent) {
		String pre = "";
		pre = fRhs.buildOCLCondition(indent);
		return pre;
	}

	/**
	 * Build link condition for left + right side
	 * 
	 * @param indent
	 * @return
	 */
	public String buildOCLConditionLeftRight(int indent) {
		String left = "", right = "";
		left = fLhs.buildOCLCondition(indent);
		right = fRhs.buildOCLCondition(indent);
		if (!left.equals("") && !right.equals(""))
			left += " " + RTLKeyword.and + right;
		else
			left = right;
		return left;
	}

	/**
	 * Build link condition for left side
	 * 
	 * @param indent
	 * @return
	 */
	public String buildLinkConditionLeft(int indent) {
		String pre = "";
		pre += fLhs.buildLinkCondition(indent);
		return pre;
	}

	/**
	 * Build link condition for left + right side
	 * 
	 * @param indent
	 * @return
	 */
	public String buildLinkConditionLeftRight(int indent) {
		String left = "", right = "";
		left = fLhs.buildLinkCondition(indent);
		right = fRhs.buildLinkCondition(indent);
		if (!left.equals("") && !right.equals(""))
			left += RTLKeyword.and + right;
		else
			left = right;
		return left;
	}

	public String genOCLForCreateObjectAndLinkInRight(UniqueNameGenerator fUniqueNameGenerator) {
		return fRhs.genOCLForCreateObject(fUniqueNameGenerator) + fRhs.genOCLForCreateLink(fUniqueNameGenerator);
	}
	
	public String genOCLForCreateObjectAndLinkInLeft(UniqueNameGenerator fUniqueNameGenerator) {
		return fLhs.genOCLForCreateObject(fUniqueNameGenerator);
	}
}