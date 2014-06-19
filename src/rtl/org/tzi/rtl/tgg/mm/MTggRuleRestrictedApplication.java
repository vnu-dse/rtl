package org.tzi.rtl.tgg.mm;

import java.util.List;
@SuppressWarnings("unchecked")
public class MTggRuleRestrictedApplication extends MTggRuleApplication {
	
	private List ruleApplications;
	private Object fConditions; // String
	
	public MTggRuleRestrictedApplication(){
		
	}
	public MTggRuleRestrictedApplication(List _ruleApps, Object _cond){
		setRuleApplications(_ruleApps);
		setfConditions(_cond);
	}
	public void setfConditions(Object fConditions) {
		this.fConditions = fConditions;
	}
	public Object getfConditions() {
		return fConditions;
	}
	public void setRuleApplications(List ruleApplications) {
		this.ruleApplications = ruleApplications;
	}
	public List getRuleApplications() {
		return ruleApplications;
	}
}
