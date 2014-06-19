package org.tzi.rtl.tgg.mm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.tzi.rtl.tgg.parser.RTLKeyword;
import org.tzi.use.uml.mm.MAssociation;
import org.tzi.use.uml.mm.MAssociationEnd;
import org.tzi.use.uml.sys.MLink;
import org.tzi.use.uml.sys.MObject;
import org.tzi.use.uml.sys.MSystemState;
import org.tzi.use.util.UniqueNameGenerator;

@SuppressWarnings( { "unchecked" })
public class MTggPattern {
	/**
	 * @uml.property name="fSystemState"
	 * @uml.associationEnd multiplicity="(1 1)"
	 */
	MSystemState fSystemState;
	/**
	 * @uml.property name="fObjects"
	 * @uml.associationEnd multiplicity="(0 -1)"
	 *                     elementType="org.tzi.use.uml.sys.MLink"
	 */
	List fObjects; // MObject
	/**
	 * @uml.property name="fLinks"
	 * @uml.associationEnd multiplicity="(0 -1)"
	 *                     elementType="org.tzi.use.uml.sys.MLink"
	 */
	List fLinks; // MLink
	/**
	 * @uml.property name="fConditions"
	 */
	List fConditions; // String

	Map<String, Object> fInvariants;

	public MTggPattern(MSystemState systemState, List objects, List links,
			List conditions) {
		// TODO Auto-generated constructor stub
		fSystemState = systemState;
		fObjects = objects;
		fLinks = links;
		fConditions = conditions;
	}

	public MTggPattern(MSystemState systemState, List objects, List links,
			List conditions, Map<String, Object> invariants) {
		// TODO Auto-generated constructor stub
		fSystemState = systemState;
		fObjects = objects;
		fLinks = links;
		fConditions = conditions;
		fInvariants = invariants;
	}

	public MSystemState getMSystemState() {
		return fSystemState;
	}

	public List getObjects() {
		List res = new ArrayList();
		res.addAll(fObjects);
		return res;
	}

	public List getLinks() {
		List res = new ArrayList();
		res.addAll(fLinks);
		return res;
	}

	public List getConditions() {
		// TODO Auto-generated method stub
		List res = new ArrayList();
		res.addAll(fConditions);
		return res;
	}

	public Map<String, Object> genCorrInvariants() {
		Map<String, Object> res = new HashMap<String, Object>();
		res.putAll(fInvariants);
		return res;
	}

	public String buildLinkCondition(int indent) {
		String ocl = "";
		for (Iterator iter = fLinks.iterator(); iter.hasNext();) {
			MLink mLink = (MLink) iter.next();
			MAssociation assoc = mLink.association();
			MAssociationEnd end1, end2;
			end1 = assoc.associationEnds().get(0);
			end2 = assoc.associationEnds().get(1);
			String mul1 = end1.multiplicity().toString();
			String mul2 = end2.multiplicity().toString();
			if (mul1.equals("0..1") || mul1.equals("1") || mul1.equals("1..1")) {
				ocl += "\n" + RTLKeyword.indent(indent)
						+ mLink.linkedObjects().get(0).name() + "."
						+ end2.nameAsRolename() + "->includesAll(Set{"
						+ mLink.linkedObjects().get(1).name() + "})"
						+ RTLKeyword.and;
			} else if (mul2.equals("0..1") || mul2.equals("1")
					|| mul2.equals("1..1")) {
				ocl += "\n" + RTLKeyword.indent(indent)
						+ mLink.linkedObjects().get(1).name() + "."
						+ end1.nameAsRolename() + "->includesAll(Set{"
						+ mLink.linkedObjects().get(0).name() + "})"
						+ RTLKeyword.and;
			} else {
				ocl += "\n" + RTLKeyword.indent(indent)
						+ mLink.linkedObjects().get(1).name() + "."
						+ end1.nameAsRolename() + "->includesAll(Set{"
						+ mLink.linkedObjects().get(0).name() + "})"
						+ RTLKeyword.and;
			}

		}
		if (!ocl.equals(""))
			ocl = ocl.substring(0, ocl.length() - RTLKeyword.and.length());
		return ocl;
	}

	public String buildOCLCondition(int indent) {
		String ocl = "";
		for (Iterator iter = fConditions.iterator(); iter.hasNext();) {
			String cond = (String) iter.next();
			ocl += "\n" + RTLKeyword.indent(indent)
					+ cond.substring(1, cond.length() - 1) + RTLKeyword.and;
		}
		if (!ocl.equals(""))
			ocl = ocl.substring(0, ocl.length() - RTLKeyword.and.length());
		return ocl;
	}

	public String genOCLForCreateObject(UniqueNameGenerator fUniqueNameGenerator) {
		String ocl = "";
		// Objects
		for (Iterator iter = fObjects.iterator(); iter.hasNext();) {
			MObject obj = (MObject) iter.next();
			String objNewName = fUniqueNameGenerator.generate("N_" + obj.cls().name());
			//ocl += "\n assign " + obj.name() + ":= create " + obj.cls().name();
			ocl += "\n create " + objNewName + ":" + obj.cls().name();
			ocl += "\n let " + obj.name() + "=" + objNewName;
		}
		return ocl;
	}
	
	public String genOCLForCreateLink(UniqueNameGenerator fUniqueNameGenerator) {
		String ocl = "";
		// Links
		for (Iterator iter = fLinks.iterator(); iter.hasNext();) {
			MLink link = (MLink) iter.next();
			ocl += "\n insert (" + link.linkedObjects().get(0) + ","
					+ link.linkedObjects().get(1);
			ocl += ") into " + link.association().name();
		}
		return ocl;
	}
}
