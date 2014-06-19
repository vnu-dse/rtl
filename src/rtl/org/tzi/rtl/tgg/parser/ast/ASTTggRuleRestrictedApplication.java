package org.tzi.rtl.tgg.parser.ast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.tzi.rtl.tgg.mm.MTggRuleApplication;
import org.tzi.rtl.tgg.mm.MTggRuleRestrictedApplication;
import org.tzi.rtl.tgg.parser.Context;
@SuppressWarnings("unchecked")
public class ASTTggRuleRestrictedApplication  extends ASTTggRuleApplication{
	
	private ArrayList ruleApplications;
	private ASTCondition fConditions;
	

	public ASTTggRuleRestrictedApplication(){
		setRuleApplications(new ArrayList());
	}
	
	public ASTTggRuleRestrictedApplication(ASTCondition _cond){
		setCond(_cond);
		setRuleApplications(new ArrayList());
	}
	
	public void addRuleRestrictedApplication(ASTTggRuleApplication _rule){
		getRuleApplications().add(_rule);
	}

	public void setCond(ASTCondition cond) {
		this.fConditions = cond;
	}

	public ASTCondition getCond() {
		return fConditions;
	}

	private void setRuleApplications(ArrayList ruleApplications) {
		this.ruleApplications = ruleApplications;
	}

	private ArrayList getRuleApplications() {
		return ruleApplications;
	}

	@Override
	public MTggRuleApplication gen(Context ctx) {
		// rule
		List ruleApps = new ArrayList();
		for (Iterator iter = ruleApplications.iterator(); iter.hasNext();) {
			ASTTggRuleApplication astRule = (ASTTggRuleApplication) iter.next();
			MTggRuleApplication mRule = astRule.gen(ctx);
			ruleApps.add(mRule);
		}
		// cond
		Object cond = fConditions.gen();
		MTggRuleRestrictedApplication ruleApp = null;
		if (ruleApps.size() > 0 && cond != null){
			ruleApp = new MTggRuleRestrictedApplication(ruleApps, cond);
		}
		
		return ruleApp;
	}
}
