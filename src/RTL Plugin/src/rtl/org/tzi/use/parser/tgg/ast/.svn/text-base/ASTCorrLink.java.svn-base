package org.tzi.use.parser.tgg.ast;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.antlr.runtime.Token;
import org.tzi.use.parser.SemanticException;
import org.tzi.use.parser.tgg.Context;

import org.tzi.use.tgg.MCorrLink;
import org.tzi.use.uml.mm.MAssociation;
import org.tzi.use.uml.mm.MClass;
import org.tzi.use.uml.sys.MLink;
import org.tzi.use.uml.sys.MObject;
import org.tzi.use.uml.sys.MSystemException;

@SuppressWarnings({"unused", "unchecked", "rawtypes"})
public class ASTCorrLink {		
	/**
	 * @uml.property  name="fSourceObject"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Token fSourceObject;
	/**
	 * @uml.property  name="fTargetObject"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Token fTargetObject;
	/**
	 * @uml.property  name="fCorrObject"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Token fCorrObject;
	/**
	 * @uml.property  name="fCorrClass"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Token fCorrClass;
	/**
	 * @uml.property  name="fSourceRole"
	 * @uml.associationEnd  
	 */
	private Token fSourceRole;
	/**
	 * @uml.property  name="fTargetRole"
	 * @uml.associationEnd  
	 */
	private Token fTargetRole;
	/**
	 * @uml.property  name="fNewSourceClass"
	 * @uml.associationEnd  
	 */
	private Token fNewSourceClass;
	/**
	 * @uml.property  name="fNewTargetClass"
	 * @uml.associationEnd  
	 */
	private Token fNewTargetClass;
	public ASTCorrLink(Token objS, Token objT, Token objCorr, Token corrClass){
		fSourceObject = objS;
		fTargetObject = objT;
		fCorrObject = objCorr;
		fCorrClass = corrClass;
	}	

	public void addSourceRole(Token sourceRole) {
		// TODO Auto-generated method stub
		fSourceRole = sourceRole;
	}
	
	public void addTargetRole(Token targetRole) {
		// TODO Auto-generated method stub
		fTargetRole = targetRole;
	}

	public void addNewSourceClass(Token newSourceClass) {
		// TODO Auto-generated method stub
		fNewSourceClass = newSourceClass;
	}

	public void addNewTargetClass(Token newTargetClass) {
		// TODO Auto-generated method stub
		fNewTargetClass = newTargetClass;
	}

	public MCorrLink gen(Context ctx)  throws SemanticException, MSystemException {
		// TODO Auto-generated method stub
		MCorrLink mCorrLink = null;	
		// Define the link between the source object and the corr object
		MLink sourceLink = null;		
		MAssociation sourceMAssoc;			
		MObject sourceObject;	
		String sourceClassName = "";			
		sourceObject = ctx.systemState().objectByName(fSourceObject.getText());
		
		if (fNewSourceClass != null){
			sourceClassName = fNewSourceClass.getText();
		}else{			
			sourceClassName = sourceObject.cls().name();
		}			
		MClass sourceClass = ctx.model().getClass(sourceClassName);
		MClass corrClass = ctx.model().getClass(fCorrClass.getText());
		MObject corrObject = ctx.systemState().objectByName(fCorrObject.getText());			
		if ( corrObject == null){
			corrObject = ctx.systemState().createObject(corrClass, fCorrObject.getText());
		}					
		sourceLink = createMLink(ctx, corrObject, sourceClass, sourceObject);
		// Define the link between the source object and the corr object		
		MLink targetLink = null;	
		MAssociation targetMAssoc;			
		MObject targetObject;	
		String targetClassName = "";	
		targetObject = ctx.systemState().objectByName(fTargetObject.getText());	
		if (fNewTargetClass != null){
			targetClassName = fNewTargetClass.getText();
		}else{			
			targetClassName = targetObject.cls().name();
		}		
		MClass targetClass = ctx.model().getClass(targetClassName);		
		
		targetLink = createMLink(ctx, corrObject, targetClass, targetObject);
		
		mCorrLink = new MCorrLink(corrObject,sourceLink,targetLink);		
		return mCorrLink;
	}
	/**
     * Create a new link between the (source or target) domain and the corr object
	 * @throws MSystemException 
     */
	public MLink createMLink(Context ctx, MObject corrObject, MClass domainClass, MObject domainObject) throws MSystemException {
		MLink link = null;		
		MAssociation assoc;		
		MClass corrClass = ctx.model().getClass(corrObject.cls().name());		
		Set tmpClasses =  new HashSet();
		tmpClasses.add(corrClass);
		tmpClasses.add(domainClass);
		
		Iterator it = ctx.model().getAssociationsBetweenClasses(tmpClasses).iterator();
		if (! it.hasNext()) throw new MSystemException();
		assoc = (MAssociation) it.next();
		
		List tmpList = new ArrayList<MObject>();
		tmpList.add(corrObject);
		tmpList.add(domainObject);
		if(! ctx.systemState().hasLink(assoc, tmpList,null) ){
			link = ctx.systemState().createLink(assoc, tmpList,null);		
		}else{
			link = ctx.systemState().linkBetweenObjects(assoc, tmpList).iterator().next();
		}
		return link;
	}

}

