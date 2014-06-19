package org.tzi.rtl.tgg.parser.ast;

import org.tzi.rtl.tgg.mm.MTggPattern;
import org.tzi.rtl.tgg.parser.Context;

import org.tzi.use.parser.SemanticException;
import org.tzi.use.uml.sys.MLink;
import org.tzi.use.uml.sys.MObject;
import org.tzi.use.uml.sys.MSystemException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("unchecked")
public class ASTPattern {
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
	 * @uml.property  name="fConditions"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="org.tzi.use.parser.gratra.ASTCondition"
	 */
	private List fConditions; // (ASTCondition)
	
	public ASTPattern(){
		fObjects = new ArrayList();
		fLinks = new ArrayList();
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

	public void addCondition(ASTCondition condition) {
		// TODO Auto-generated method stub
		fConditions.add(condition);
	}

	public MTggPattern gen(Context ctx) throws SemanticException {
		// TODO Auto-generated method stub
		MTggPattern tggPattern = null;
		List objects = addObjects(ctx);
		List links = addLinks(ctx);
		List conditions = new ArrayList();
		Iterator it = fConditions.iterator();
		while(it.hasNext()){
			ASTCondition conditionDef = (ASTCondition) it.next();
			conditions.add(conditionDef.gen());
		}
		tggPattern = new MTggPattern(ctx.systemState(), objects, links, conditions);
		return tggPattern;
	}

	private List addLinks(Context ctx) {
		// TODO Auto-generated method stub
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		return mObjects;
	}

    public String toString() {
        String description = "";

        for(int i = 0; i < fObjects.size(); i++) {
            ASTObject object = (ASTObject) fObjects.get(i);
            description += object.toString() + "\n";
        }

        for(int i = 0; i < fLinks.size(); i++) {
            ASTLink link = (ASTLink) fLinks.get(i);
            description += link.toString() + "\n";
        }

        for(int i = 0; i < fConditions.size(); i++) {
            ASTCondition condition = (ASTCondition) fConditions.get(i);
            description += condition.toString() + "\n";
        }

        return description;
    }
}
