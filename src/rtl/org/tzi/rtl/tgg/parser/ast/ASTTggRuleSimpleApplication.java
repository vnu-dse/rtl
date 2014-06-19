package org.tzi.rtl.tgg.parser.ast;

import org.antlr.runtime.Token;
import org.tzi.rtl.tgg.mm.MTggRuleApplication;
import org.tzi.rtl.tgg.mm.MTggRuleSimpleApplication;
import org.tzi.rtl.tgg.parser.Context;

public class ASTTggRuleSimpleApplication  extends ASTTggRuleApplication{
	private Token ruleID;
	
	public ASTTggRuleSimpleApplication(){
		
	}
	public ASTTggRuleSimpleApplication(Token _ruleID){
		ruleID = _ruleID;
	}
	public void setRuleID(Token ruleID) {
		this.ruleID = ruleID;
	}

	public Token getRuleID() {
		return ruleID;
	}
	@Override
	public MTggRuleApplication gen(Context ctx) {
		MTggRuleSimpleApplication ruleApp = new MTggRuleSimpleApplication(ruleID.getText());
		return ruleApp;
	}
}
