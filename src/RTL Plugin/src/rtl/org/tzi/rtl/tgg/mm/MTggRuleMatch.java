package org.tzi.rtl.tgg.mm;

public class MTggRuleMatch {
	private String matchID;
	private MTggRuleApplication ruleApp;
	
	public MTggRuleMatch(){
		
	}
	
	public MTggRuleMatch(String _matchID, MTggRuleApplication _ruleApp){
		setRuleApp(_ruleApp);
		setMatchID(_matchID);
	}
	public void setMatchID(String ruleID) {
		this.matchID = ruleID;
	}
	public String getMatchID() {
		return matchID;
	}
	public void setRuleApp(MTggRuleApplication ruleApp) {
		this.ruleApp = ruleApp;
	}
	public MTggRuleApplication getRuleApp() {
		return ruleApp;
	}

}
