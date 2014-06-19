package org.tzi.rtl.tgg.mm;

public class MTggRuleSelectedApplication extends MTggRuleApplication {
	private String ruleID;
	private Object fCondition;
	
	public MTggRuleSelectedApplication(){
		
	}
	public MTggRuleSelectedApplication(String _ruleID, Object _cond){
		ruleID = _ruleID;
		fCondition = _cond;
	}
	public void setRuleID(String ruleID) {
		this.ruleID = ruleID;
	}

	public String getRuleID() {
		return ruleID;
	}
	public void setfCondition(Object fCondition) {
		this.fCondition = fCondition;
	}
	public Object getfCondition() {
		return fCondition;
	}
	
}
