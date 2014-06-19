package org.tzi.rtl.tgg.parser.ast;

import java.util.UUID;

import org.antlr.runtime.Token;
import org.tzi.rtl.tgg.mm.MTggRuleApplication;
import org.tzi.rtl.tgg.mm.MTggRuleMatch;
import org.tzi.rtl.tgg.parser.Context;

public class ASTTggRuleMatch {
	private Token matchID;
	private ASTTggRuleApplication ruleApp;
	
	public ASTTggRuleMatch(){
		
	}
	
	public ASTTggRuleMatch(Token _matchID, ASTTggRuleApplication _ruleApp){
		setRuleApp(_ruleApp);
		setMatchID(_matchID);
	}
	public void setMatchID(Token ruleID) {
		this.matchID = ruleID;
	}
	public Token getMatchID() {
		return matchID;
	}
	public void setRuleApp(ASTTggRuleApplication ruleApp) {
		this.ruleApp = ruleApp;
	}
	public ASTTggRuleApplication getRuleApp() {
		return ruleApp;
	}
	
	public MTggRuleMatch gen(Context ctx){
		MTggRuleApplication _ruleApp = ruleApp.gen(ctx);
		String _matchID = "";
		if (matchID == null || matchID.equals(""))
			_matchID = UUID.randomUUID().toString();
		else
			_matchID = matchID.getText();
		MTggRuleMatch match = new MTggRuleMatch(_matchID, _ruleApp);
		return match;
	}

}
