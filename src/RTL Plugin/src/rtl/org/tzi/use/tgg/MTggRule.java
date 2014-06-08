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
import org.tzi.use.uml.mm.MModel;
import org.tzi.use.uml.mm.MModelElement;
import org.tzi.use.uml.sys.MSystemState;

/**
 * ...
 *
 * @version     $ProjectVersion: 0.393 $
 * @author      hanhdd 
 */
@SuppressWarnings({"rawtypes", "unchecked" })
public class MTggRule implements MModelElement{
	/**
	 * @uml.property  name="fSourceRule"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private MRule fSourceRule;//the source side
	/**
	 * @uml.property  name="fTargetRule"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private MRule fTargetRule;//the target side
	/**
	 * @uml.property  name="fCorrRule"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private MRule fCorrRule;//the corr side
	/**
	 * @uml.property  name="fName"
	 */
	private String fName;
	/**
	 * @uml.property  name="fIsDeletingRule"
	 */
	boolean fIsDeletingRule = false;
	/**
	 * We need save HTML file for TGGRule
	 */
	private String fHTMLFile;
	
	public MTggRule(String name, MRule sourceRule, MRule targetRule,MRule corrRule, boolean isDeletingRule){
		fName = name;
		fSourceRule = sourceRule;
		fTargetRule = targetRule;
		fCorrRule = corrRule;
		fIsDeletingRule = isDeletingRule;
		fHTMLFile = "";
	}
	public MRule getSourceRule(){
		return fSourceRule;
	}
	public MRule getTargetRule(){
		return fTargetRule;
	}
	public MRule getCorrRule(){
		return fCorrRule;
	}
	public MSystemState getSystemState_LHS(){		
		return fSourceRule.getLHS().getMSystemState();
	}
	public MSystemState getSystemState_RHS(){
		return fSourceRule.getRHS().getMSystemState(); 
	}
	public MModel getModel(){
		return fSourceRule.getLHS().getMSystemState().system().model();
	}
	public boolean isDeletingRule(){
		return fIsDeletingRule;
	}

	public List getNewLinks(){
		List links = new ArrayList();
		links.addAll(fSourceRule.getNewLinks());
		links.addAll(fTargetRule.getNewLinks());
		links.addAll(fCorrRule.getNewLinks());
		return links;
	}
	public List getNonDeletingLinks(){
		List links = new ArrayList();
		links.addAll(fSourceRule.getNonDeletingLinks());
		links.addAll(fTargetRule.getNonDeletingLinks());
		links.addAll(fCorrRule.getNonDeletingLinks());
		return links;
	}
	public List getDeletingLinks(){
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
	public String toString(){
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
}

