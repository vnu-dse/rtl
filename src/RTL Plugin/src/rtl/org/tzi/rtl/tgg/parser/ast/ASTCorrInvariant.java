package org.tzi.rtl.tgg.parser.ast;

import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.Token;

public class ASTCorrInvariant {
	private Token className;
	private ASTCondition condition;
	
	public ASTCorrInvariant(){
	}
	
	public ASTCorrInvariant(Token className2, ASTCondition _cond){
		className = className2;
		condition = _cond;
	}
	
	/**
	 * @return the className
	 */
	public String getClassName() {
		return className.toString();
	}
	
	public Map<String, Object> gen() {
		Map<String, Object> invs = new HashMap<String, Object>();
		invs.put(className.getText(), condition.gen());
		return invs;
	}
}
