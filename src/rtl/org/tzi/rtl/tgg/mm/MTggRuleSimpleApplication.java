package org.tzi.rtl.tgg.mm;

public class MTggRuleSimpleApplication extends MTggRuleApplication {
	private String ruleID;
	public MTggRuleSimpleApplication(){
		
	}
	public MTggRuleSimpleApplication(String _ruleID){
		ruleID = _ruleID;
	}
	public void setRuleID(String ruleID) {
		this.ruleID = ruleID;
	}

	public String getRuleID() {
		return ruleID;
	}
	
}
