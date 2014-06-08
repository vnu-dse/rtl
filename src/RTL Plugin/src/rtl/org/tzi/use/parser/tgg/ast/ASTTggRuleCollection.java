package org.tzi.use.parser.tgg.ast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.tzi.use.parser.SemanticException;
import org.tzi.use.parser.tgg.Context;
import org.tzi.use.tgg.MTggRule;
import org.tzi.use.tgg.TggRuleCollection;
import org.tzi.use.uml.sys.MSystemException;

@SuppressWarnings({"unchecked", "rawtypes"})
public class ASTTggRuleCollection {
	/**
	 * @uml.property  name="fTggRules"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="org.tzi.use.parser.gratra.ASTTggRule"
	 */
	private List fTggRules; // (ASTTggRule)
	public ASTTggRuleCollection() {        
        fTggRules = new ArrayList();
    }
	public void addTggRule(ASTTggRule tggRule) {
		// TODO Auto-generated method stub
		fTggRules.add(tggRule);
	}
	public TggRuleCollection gen(Context ctx) throws MSystemException{
		TggRuleCollection tggRules = new TggRuleCollection();
		// add user-defined tgg rules to tggRuleCollection
        Iterator it = fTggRules.iterator();
        while (it.hasNext() ) {
        	ASTTggRule tggRuleDef = (ASTTggRule) it.next();
            MTggRule tggRule;
            try {
            	tggRule = tggRuleDef.gen(ctx);
            	tggRules.addTggRule(tggRule);
            } catch (SemanticException ex) {
                ctx.reportError(ex);
            } 
        }
		return tggRules;
	}
}
