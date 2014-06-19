package org.tzi.rtl.tgg.parser.ast;

import org.antlr.runtime.Token;
import org.tzi.rtl.tgg.mm.MCorrLink;
import org.tzi.rtl.tgg.parser.Context;
import org.tzi.use.parser.SemanticException;
import org.tzi.use.uml.mm.MAggregationKind;
import org.tzi.use.uml.mm.MAssociation;
import org.tzi.use.uml.mm.MClass;
import org.tzi.use.uml.mm.MClassImpl;
import org.tzi.use.uml.mm.MInvalidModelException;
import org.tzi.use.uml.mm.MMultiplicity;
import org.tzi.use.uml.mm.ModelFactory;
import org.tzi.use.uml.ocl.expr.VarDecl;
import org.tzi.use.uml.sys.MLink;
import org.tzi.use.uml.sys.MObject;
import org.tzi.use.uml.sys.MSystem;
import org.tzi.use.uml.sys.MSystemException;
import org.tzi.use.uml.sys.MSystemState;

import java.util.*;

@SuppressWarnings({"unused", "unchecked"})
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
		if (corrClass == null){
			ModelFactory mf = new ModelFactory();
			corrClass = mf.createClass(fCorrClass.getText(), false);
			try {
				ctx.model().addClass(corrClass);
			} catch (MInvalidModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		MObject corrObject = ctx.systemState().objectByName(fCorrObject.getText());			
		if ( corrObject == null){
			corrObject = ctx.systemState().createObject(corrClass, fCorrObject.getText());
		}
		
		sourceLink = createMLink(ctx, corrObject, sourceClass, sourceObject);
		
		// Define the link between the target object and the corr object		
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
	 * @throws org.tzi.use.uml.sys.MSystemException
     */
	public MLink createMLink(Context ctx, MObject corrObject, MClass domainClass, MObject domainObject) throws MSystemException {
		MLink link = null;		
		MAssociation assoc = null;
		String roleName = "";
		MClass corrClass = ctx.model().getClass(corrObject.cls().name());
		Set tmpClasses =  new HashSet();
		if (domainObject.name().equals(fSourceObject.getText()))
			if (fSourceRole != null)
				roleName = fSourceRole.getText();
			else
				roleName = fSourceObject.getClass().getName().toLowerCase();
		else
			if (fTargetRole != null)
				roleName = fTargetRole.getText();
			else
				roleName = fTargetObject.getClass().getName().toLowerCase();
		tmpClasses.add(corrClass);
		tmpClasses.add(domainClass);
		Set <MAssociation> assocs = ctx.model().getAssociationsBetweenClasses(tmpClasses);
		if (assocs.size() == 0){
			ModelFactory mf = new ModelFactory();
			List<VarDecl> emptyQualifiers = Collections.emptyList();
			
			try {
				assoc = mf.createAssociation(domainClass.name() + "_" + corrClass.name());
				assoc.addAssociationEnd(
						mf.createAssociationEnd(
								domainClass, 
								roleName, 
								new MMultiplicity(1, 1),
								MAggregationKind.NONE, 
								false, emptyQualifiers));
				assoc.addAssociationEnd(
						mf.createAssociationEnd(
								corrClass, 
								"cp" + "_" + assoc.name(), 
								MMultiplicity.ZERO_MANY, 
								MAggregationKind.NONE, 
								false, emptyQualifiers));
				ctx.model().addAssociation(assoc);
				MSystem system = new MSystem(ctx.model());
				MSystemState temp = system.state();
				// copy object, link from ctx.systemState -> temp
				// Objects
				for (Iterator iter = ctx.systemState().allObjects().iterator(); iter
						.hasNext();) {
					MObject obj = (MObject) iter.next();
					temp.createObject(obj.cls(), obj.name());
				}
				// Links
				for (Iterator iter = ctx.systemState().allLinks().iterator(); iter
						.hasNext();) {
					MLink obj = (MLink) iter.next();
					temp.insertLink(obj);
				}
				ctx.setfCurrentSystemState(system.state());
				
			} catch (MInvalidModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else{
			Iterator it = assocs.iterator();
			if (! it.hasNext()) throw new MSystemException();
				assoc = (MAssociation) it.next();
		}
		List tmpList = new ArrayList<MObject>();
		
		tmpList.add(domainObject);
		tmpList.add(corrObject);
		if(! ctx.systemState().hasLink(assoc, tmpList,null) ){
			link = ctx.systemState().createLink(assoc, tmpList,null);		
		}else{
			link = ctx.systemState().linkBetweenObjects(assoc, tmpList).iterator().next();
		}
		return link;
	}

    public String toString() {
        String description = "";

        description += "(" + fSourceObject.getText() + ",";
        description += fTargetObject.getText() + ") in ";
        description += fCorrObject.getText() + ":";
        description += fCorrClass.getText();

        return description;
    }

}

