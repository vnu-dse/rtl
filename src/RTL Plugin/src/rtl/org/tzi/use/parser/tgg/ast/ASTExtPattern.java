package org.tzi.use.parser.tgg.ast;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.tzi.use.parser.tgg.Context;
import org.tzi.use.parser.SemanticException;
import org.tzi.use.tgg.MCorrLink;
import org.tzi.use.tgg.MTggPattern;
import org.tzi.use.uml.sys.MLink;
import org.tzi.use.uml.sys.MObject;
import org.tzi.use.uml.sys.MSystemException;

@SuppressWarnings({"unchecked", "rawtypes"})
public class ASTExtPattern {
	/**
	 * @uml.property  name="fObjects"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="org.tzi.use.parser.gratra.ASTObject"
	 */
	private List fObjects; // (ASTObject)
	/**
	 * @uml.property  name="fLinks"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="org.tzi.use.parser.gratra.ASTLink"
	 */
	private List fLinks; // (ASTLink)
	/**
	 * @uml.property  name="fCorrLinks"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="org.tzi.use.parser.gratra.ASTCondition"
	 */
	private List fCorrLinks; // (ASTCorrLink)
	/**
	 * @uml.property  name="fConditions"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="org.tzi.use.parser.gratra.ASTCondition"
	 */
	private List fConditions; // (ASTCondition)
	
	public ASTExtPattern(){
		fObjects = new ArrayList();
		fLinks = new ArrayList();
		fCorrLinks = new ArrayList();
		fConditions = new ArrayList();
	}
	
	public void addObject(ASTObject object) {
		// TODO Auto-generated method stub
		fObjects.add(object);
	}

	public void addLink(ASTLink link) {
		// TODO Auto-generated method stub
		fLinks.add(link);
	}	

	public void addCorrLink(ASTCorrLink corrLink) {
		// TODO Auto-generated method stub
		fCorrLinks.add(corrLink);
	}
	
	public void addCondition(ASTCondition condition) {
		// TODO Auto-generated method stub
		fConditions.add(condition);
	}

	public MTggPattern gen(Context ctx) throws SemanticException, MSystemException {
		// TODO Auto-generated method stub
		MTggPattern tggPattern = null;
		MCorrLink mCorrLink = null;
		List corrObjects = addObjects(ctx);		
		List corrLinks = new ArrayList();
		Iterator it = fCorrLinks.iterator();		
		Set tmpObjects = new HashSet();
		Set tmpLinks = new HashSet();
		while (it.hasNext() ) {			
			ASTCorrLink corrLinkDef = (ASTCorrLink) it.next();			
			//MLink sourLink, targetLink;
			try {
				mCorrLink = corrLinkDef.gen(ctx);				
				tmpObjects.add(mCorrLink.getCorrObject());				
				tmpLinks.add(mCorrLink.getSourceLink());
				tmpLinks.add(mCorrLink.getTargetLink());
			} catch (SemanticException ex) {
				ctx.reportError(ex);
			} 
		}
		corrObjects.addAll(tmpObjects);
		corrLinks.addAll(tmpLinks);
		corrLinks.addAll( addLinks(ctx) );
		
		List conditions = new ArrayList();
		it = fConditions.iterator();
		while(it.hasNext()){
			ASTCondition conditionDef = (ASTCondition) it.next();
			conditions.add(conditionDef.gen());
		}		
		tggPattern = new MTggPattern(ctx.systemState(), corrObjects, corrLinks, conditions);
		return tggPattern;
	}
	
	public List addObjects(Context ctx){
		List mObjects = new ArrayList();
		Iterator it = fObjects.iterator();
		while (it.hasNext() ) {
			ASTObject objectDef = (ASTObject) it.next();
			MObject mObject;
			try {
				mObject = objectDef.gen(ctx);
				mObjects.add(mObject);
			} catch (SemanticException ex) {
				ctx.reportError(ex);
			} catch (MSystemException e) {
				e.printStackTrace();
			} 
		}
		return mObjects;
	}
	
	private List addLinks(Context ctx) {
		
		List mLinks = new ArrayList();
		Iterator it = fLinks.iterator();
		while (it.hasNext() ) {
			ASTLink linkDef = (ASTLink) it.next();
			MLink mLink;
			try {				
				mLink = linkDef.gen(ctx);
				mLinks.add(mLink);
			} catch (SemanticException ex) {
				ctx.reportError(ex);
			} 
		}
		return mLinks;
	}

	

	public List getObjects() {
		return fObjects;
	}

}
