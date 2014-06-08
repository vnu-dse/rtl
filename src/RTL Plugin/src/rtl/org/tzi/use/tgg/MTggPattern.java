package org.tzi.use.tgg;

import java.util.ArrayList;
import java.util.List;

import org.tzi.use.uml.sys.MSystemState;

@SuppressWarnings({"unchecked", "rawtypes"})
public class MTggPattern {
	/**
	 * @uml.property  name="fSystemState"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	MSystemState fSystemState;
	/**
	 * @uml.property  name="fObjects"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="org.tzi.use.uml.sys.MLink"
	 */
	List fObjects; //MObject
	/**
	 * @uml.property  name="fLinks"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="org.tzi.use.uml.sys.MLink"
	 */
	List fLinks; //MLink
	/**
	 * @uml.property  name="fConditions"
	 */
	List fConditions; //String	
	
	public MTggPattern(MSystemState systemState, List objects, List links, List conditions) {
		// TODO Auto-generated constructor stub
		fSystemState = systemState;
		fObjects = objects;
		fLinks = links;
		fConditions = conditions;    	
	}

	public MSystemState getMSystemState(){
		return fSystemState;
	}	
	public List getObjects(){
		List res = new ArrayList();
		res.addAll(fObjects);
		return res;
	}
	public List getLinks(){
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
}
