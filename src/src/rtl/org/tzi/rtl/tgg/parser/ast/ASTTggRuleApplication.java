package org.tzi.rtl.tgg.parser.ast;

import org.tzi.rtl.tgg.mm.MTggRuleApplication;
import org.tzi.rtl.tgg.parser.Context;

public abstract class ASTTggRuleApplication {
	public ASTTggRuleApplication(){
		
	}
	public abstract MTggRuleApplication gen(Context ctx);
}
