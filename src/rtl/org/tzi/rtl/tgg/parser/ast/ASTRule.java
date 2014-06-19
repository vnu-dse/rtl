package org.tzi.rtl.tgg.parser.ast;

import org.tzi.rtl.tgg.mm.MRule;
import org.tzi.rtl.tgg.mm.MTggPattern;
import org.tzi.rtl.tgg.parser.Context;

import org.tzi.use.parser.SemanticException;
import org.tzi.use.uml.mm.MAssociation;
import org.tzi.use.uml.sys.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("unchecked")
public class ASTRule {
	/**
	 * @uml.property  name="fLhs"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	ASTPattern fLhs;
	/**
	 * @uml.property  name="fRhs"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	ASTPattern fRhs;
	
	public ASTRule(ASTPattern lhs, ASTPattern rhs) {
		// TODO Auto-generated constructor stub
		fLhs = lhs;
		fRhs = rhs;
	}

	public MRule gen(Context ctx) throws SemanticException{
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

    public String toString() {
        String description = "";

        description += fLhs.toString() + "\n";
        description += fRhs.toString() + "\n";

        return description;
    }

}