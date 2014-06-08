package org.tzi.rtl.tgg.parser.ast;

import org.antlr.runtime.Token;

public class ASTCondition {
	/**
	 * @uml.property  name="fToken"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Token fToken = null;
	public ASTCondition(Token token) {
		fToken = token;
	}

	public Object gen() {
		// TODO Auto-generated method stub
		if (fToken == null){
			return "";
		}
		return fToken.getText();
	}

    public String toString() {
        return fToken.getText();
    }

}
