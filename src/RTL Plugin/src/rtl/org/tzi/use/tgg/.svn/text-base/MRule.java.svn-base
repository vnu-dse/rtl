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

package org.tzi.use.tgg;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.tzi.use.uml.mm.MElementAnnotation;
import org.tzi.use.uml.mm.MMVisitor;
import org.tzi.use.uml.mm.MModelElement;

/**
 * ...
 *
 * @version     $ProjectVersion: 0.393 $
 * @author      hanhdd 
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class MRule implements MModelElement{
	/**
	 * @uml.property  name="fLhs"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private MTggPattern fLhs;//LHS of the rule
	/**
	 * @uml.property  name="fRhs"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private MTggPattern fRhs;//RHS of the delting rule or (RHS\LHS of the nondeling rule)
	/**
	 * @uml.property  name="fIsDeletingRule"
	 */
	private boolean fIsDeletingRule;
	/**
	 * @uml.property  name="fName"
	 */
	private String fName;
	public MRule(String name, MTggPattern lhs, MTggPattern rhs, boolean isDeletingRule){
		fName = name;
		fLhs = lhs;
		fRhs = rhs;
		fIsDeletingRule = isDeletingRule;    	
	}
	public MTggPattern getLHS(){
		return fLhs;
	}
	public MTggPattern getRHS(){
		return fRhs;
	}
	public List getAllObjects(){
		List objects = new ArrayList();
		List lhsObjects = fLhs.getObjects();
		List rhsObjects = fRhs.getObjects();
		objects.addAll(lhsObjects);
		objects.addAll(rhsObjects);
		return objects;
	}
	public List getDeletingObjects(){//MObject
		if(!fIsDeletingRule){
			return new ArrayList();
		}			
		List objects = fLhs.getObjects();
		List rhsObjects = fRhs.getObjects();
		objects.removeAll(rhsObjects);
		return objects;
	}
	public List getNonDeletingObjects(){		
		List objects = fLhs.getObjects();
		List rhsObjects = fRhs.getObjects();
		if(!fIsDeletingRule) return objects;
		objects.retainAll(rhsObjects);
		return objects;
	}
	public List getNewObjects(){
		List objects = fRhs.getObjects();
		List lhsObjects = fLhs.getObjects();
		if(!fIsDeletingRule) return objects;
		objects.removeAll(lhsObjects);	
		return objects;
	}
	public List getNewLinks(){
		List links = fRhs.getLinks();//MLink
		if(fIsDeletingRule){
			links.removeAll(fLhs.getLinks());
		}
		return links;
	}
	public List getNonDeletingLinks(){
		List links = new ArrayList();
		if(fIsDeletingRule){
			links = fLhs.getLinks();
			links.retainAll(fRhs.getLinks());			
		}else{
			links = fLhs.getLinks();
		}
		return links;
	}
	public List getDeletingLinks(){
		List links = new ArrayList();
		if(fIsDeletingRule){
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
	public List postconditions(){
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
}