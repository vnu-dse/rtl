package org.tzi.rtl.tgg.parser.ast;

import org.antlr.runtime.Token;
import org.tzi.rtl.tgg.parser.Context;
import org.tzi.use.parser.SemanticException;
import org.tzi.use.uml.mm.MAssociation;
import org.tzi.use.uml.sys.MLink;
import org.tzi.use.uml.sys.MObject;
import org.tzi.use.uml.sys.MSystemException;
import org.tzi.use.uml.sys.MSystemState;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class ASTLink {
	/**
	 * @uml.property  name="fObject1"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	Token fObject1;
	/**
	 * @uml.property  name="fObject2"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	Token fObject2;
	/**
	 * @uml.property  name="fAssocName"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	Token fAssocName;
	public ASTLink(Token object1, Token object2, Token assocName) {
		// TODO Auto-generated constructor stub
		fObject1 = object1;
		fObject2 = object2;
		fAssocName = assocName;
	}

	public MLink gen(Context ctx) throws SemanticException {
		// TODO Auto-generated method stub
		MLink link = null;
		MSystemState systemState = ctx.systemState();
		MObject mObject1 = systemState.objectByName(fObject1.getText());
		MObject mObject2 = systemState.objectByName(fObject2.getText());
		MAssociation mAssoc = ctx.model().getAssociation(fAssocName.getText());
		List<MObject> mObjects = new ArrayList();
		mObjects.add(mObject1);
		mObjects.add(mObject2);
		try {
			if(systemState.hasLink(mAssoc,mObjects,null)){
				return systemState.linkBetweenObjects(mAssoc, mObjects).iterator().next();
			}
			link = systemState.createLink(mAssoc, mObjects, null);
		} catch (MSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return link;
	}

    public String toString() {
        String description = "";

        description += "(" + fObject1.getText() + ",";
        description += fObject2.getText() + ") in ";
        description += fAssocName.getText();

        return description;
    }

}
