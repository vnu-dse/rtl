package org.tzi.use.parser.tgg.ast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.tzi.use.parser.tgg.Context;
import org.tzi.use.parser.SemanticException;
import org.tzi.use.tgg.MRule;
import org.tzi.use.tgg.MTggPattern;
import org.tzi.use.uml.mm.MAssociation;
import org.tzi.use.uml.sys.MLink;
import org.tzi.use.uml.sys.MObject;
import org.tzi.use.uml.sys.MObjectState;
import org.tzi.use.uml.sys.MSystemException;
import org.tzi.use.uml.sys.MSystemState;

@SuppressWarnings({"unchecked", "rawtypes"})
public class ASTCorrRule {

	/**
	 * @uml.property  name="fLhs"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	ASTExtPattern fLhs;
	/**
	 * @uml.property  name="fRhs"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	ASTExtPattern fRhs;
	
	public ASTCorrRule(ASTExtPattern lhs, ASTExtPattern rhs) {
		// TODO Auto-generated constructor stub
		fLhs = lhs;
		fRhs = rhs;
	}

	public MRule gen(Context ctx) throws SemanticException, MSystemException{
		// TODO Auto-generated method stub
		MRule rule = null;
		try {
			ctx.setLHS_CurrentSystemState();
        	MTggPattern lhs = fLhs.gen(ctx);
        	ctx.setRHS_CurrentSystemState();
        	// Defining that the RHS systemstate includes the LHS systemstate, i.e., 
        	// The two sides share the same system.        	
        	if(! ctx.isDeletingRule()){
        		MSystemState systemState_RHS = ctx.systemState();
        		Iterator it = lhs.getObjects().iterator();   		
        		while (it.hasNext()){
        			MObject mObject = (MObject) it.next();
        			try {        				
        				MObjectState objState = new MObjectState(mObject);
        				systemState_RHS.restoreObject(objState);
        			} catch (MSystemException e) {
        				// TODO Auto-generated catch block
        				e.printStackTrace();
        			}
        		}
        		it = lhs.getLinks().iterator();
        		while (it.hasNext()){
        			MLink mLink = (MLink) it.next();
        			try {
        				MAssociation assoc = mLink.association();
        				MObject[] objects = mLink.linkedObjectsAsArray();
        				List tmp = new ArrayList();
        				for(int i = 0; i< objects.length;i++ ){
        					tmp.add(objects[i]);
        				}
        				systemState_RHS.createLink(assoc, tmp, null);
        			} catch (MSystemException e) {
        				// TODO Auto-generated catch block
        				e.printStackTrace();
        			}
        		}
        	}
        	
        	MTggPattern rhs = fRhs.gen(ctx);
        	rule = new MRule(null,lhs,rhs,ctx.isDeletingRule());
        } catch (SemanticException ex) {
            ctx.reportError(ex);
        } 
		return rule;
	}	

}
