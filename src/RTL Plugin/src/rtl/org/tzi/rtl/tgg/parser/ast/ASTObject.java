package org.tzi.rtl.tgg.parser.ast;

import org.antlr.runtime.Token;
import org.tzi.rtl.tgg.parser.Context;
import org.tzi.use.parser.SemanticException;
import org.tzi.use.uml.mm.MClass;
import org.tzi.use.uml.sys.MObject;
import org.tzi.use.uml.sys.MObjectState;
import org.tzi.use.uml.sys.MSystemException;
import org.tzi.use.uml.sys.MSystemState;

import java.util.Iterator;

public class ASTObject {
	/**
	 * @uml.property  name="fObjectName"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Token fObjectName;
	/**
	 * @uml.property  name="fClassName"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Token fClassName;
	
	public ASTObject(Token objectName, Token className) {
		// TODO Auto-generated constructor stub
		fObjectName = objectName;
		fClassName = className;
	}

	@SuppressWarnings("unchecked")
	public MObject gen(Context ctx) throws SemanticException, MSystemException {
		// TODO Auto-generated method stub
		MObject mObject = null;
		MSystemState systemState = ctx.systemState();
		MClass mCls = ctx.model().getClass( fClassName.getText() );
		boolean isCreatedObject = false;
		Iterator it = systemState.allObjects().iterator();
		while(it.hasNext()){
			MObject tmp = (MObject) it.next();
			if(tmp.name().equals(fObjectName.getText()) 
			   && tmp.cls().name().equals(mCls.name()) )
				isCreatedObject = true;
		}
		if(isCreatedObject){
			MObjectState objState = new MObjectState(mObject);
			systemState.restoreObject(objState);
			mObject = objState.object();
		}else{	
			mObject = systemState.createObject(mCls, fObjectName.getText());
		}
		return mObject;
	}

    public String toString() {
        return fObjectName.getText() + ":" + fClassName.getText();
    }

}
