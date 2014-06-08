package org.tzi.rtl.tgg.parser.ast;
import org.antlr.runtime.Token;
import org.tzi.rtl.tgg.mm.MTggRuleApplication;
import org.tzi.rtl.tgg.mm.MTggRuleSelectedApplication;
import org.tzi.rtl.tgg.parser.Context;

public class ASTTggRuleSelectedApplication  extends ASTTggRuleApplication{
	private Token ruleID;
	private ASTCondition fConditions;
	
	public ASTTggRuleSelectedApplication(){
		
	}
	public ASTTggRuleSelectedApplication(Token _ruleID, ASTCondition _cond){
		setCond(_cond);
		setRuleID(_ruleID);
	}
	
	public void setRuleID(Token ruleID) {
		this.ruleID = ruleID;
	}
	public Token getRuleID() {
		return ruleID;
	}
	public void setCond(ASTCondition cond) {
		this.fConditions = cond;
	}
	public ASTCondition getCond() {
		return fConditions;
	}
	@Override
	public MTggRuleApplication gen(Context ctx) {
		Object cond = fConditions.gen();
		MTggRuleSelectedApplication ruleApp = null;
		if (ruleID != null && cond != null){
			ruleApp = new MTggRuleSelectedApplication(ruleID.getText(), cond);
		}
		
		return ruleApp;
	}
	
}
