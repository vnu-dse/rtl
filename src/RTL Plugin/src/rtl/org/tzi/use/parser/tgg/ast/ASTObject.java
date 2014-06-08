package org.tzi.use.parser.tgg.ast;

import java.util.Iterator;

import org.tzi.use.parser.tgg.Context;
import org.antlr.runtime.Token;
import org.tzi.use.parser.SemanticException;
import org.tzi.use.uml.mm.MClass;
import org.tzi.use.uml.sys.MObject;
import org.tzi.use.uml.sys.MObjectState;
import org.tzi.use.uml.sys.MSystemException;
import org.tzi.use.uml.sys.MSystemState;

@SuppressWarnings({"rawtypes"})
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

}
