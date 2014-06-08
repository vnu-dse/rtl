package org.tzi.rtl.tgg.mm;

import org.tzi.use.uml.sys.MLink;
import org.tzi.use.uml.sys.MObject;

public class MCorrLink {
	/**
	 * @uml.property  name="fCorrObject"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private MObject fCorrObject;
	/**
	 * @uml.property  name="fSourceLink"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private MLink fSourceLink;
	/**
	 * @uml.property  name="fTargetLink"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private MLink fTargetLink;
	public MCorrLink(MObject corrObject, MLink sourceLink, MLink targetLink) {
		// TODO Auto-generated constructor stub
		fCorrObject = corrObject;
		fSourceLink = sourceLink;
		fTargetLink = targetLink;
	}
	public Object getCorrObject() {
		// TODO Auto-generated method stub
		return fCorrObject;
	}
	public Object getSourceLink() {
		// TODO Auto-generated method stub
		return fSourceLink;
	}
	public Object getTargetLink() {
		// TODO Auto-generated method stub
		return fTargetLink;
	}

}
