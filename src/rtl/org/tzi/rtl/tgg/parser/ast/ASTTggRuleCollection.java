package org.tzi.rtl.tgg.parser.ast;

import org.antlr.runtime.Token;
import org.tzi.rtl.tgg.mm.MTggRule;
import org.tzi.rtl.tgg.mm.MTggRuleMatch;
import org.tzi.rtl.tgg.mm.TggRuleCollection;
import org.tzi.rtl.tgg.parser.Context;
import org.tzi.use.parser.SemanticException;
import org.tzi.use.uml.sys.MObject;
import org.tzi.use.uml.sys.MSystemException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@SuppressWarnings({"unchecked"})
public class ASTTggRuleCollection {
	/**
	 * @uml.property  name="fTggRules"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="org.tzi.use.parser.gratra.ASTTggRule"
	 */
    private Token fName; // Transformation name
	private List fTggRules; // (ASTTggRule)
	private List fTggRuleMatches; // (ASTTggRuleMatch)

    public ASTTggRuleCollection(Token fName) {
        this.fName = fName;
        fTggRules = new ArrayList();
        fTggRuleMatches = new ArrayList();
    }

	public ASTTggRuleCollection() {        
        fTggRules = new ArrayList();
        fTggRuleMatches = new ArrayList();
        this.fName = null;
    }

	public void addTggRule(ASTTggRule tggRule) {
		// TODO Auto-generated method stub
		fTggRules.add(tggRule);
	}
	
	public void addTggRuleMatch(ASTTggRuleMatch tggRuleMatch) {
		// TODO Auto-generated method stub
		fTggRuleMatches.add(tggRuleMatch);
	}

	public TggRuleCollection gen(Context ctx) throws MSystemException{

		TggRuleCollection tggRules = new TggRuleCollection();
		// add user-defined tggdiagram rules to tggRuleCollection
        Iterator it = fTggRules.iterator();
        while (it.hasNext() ) {
        	ASTTggRule tggRuleDef = (ASTTggRule) it.next();
            //  Only for debugging
            //System.out.println(tggRuleDef.toString());

            MTggRule tggRule;
            try {
            	tggRule = tggRuleDef.gen(ctx);
            	tggRules.addTggRule(tggRule);
            } catch (SemanticException ex) {
                ctx.reportError(ex);
            } 
        }
        // rule application
        Iterator it1 = fTggRuleMatches.iterator();
        while (it1.hasNext() ) {
        	ASTTggRuleMatch tggRuleDef = (ASTTggRuleMatch) it1.next();
            MTggRuleMatch tggRuleMatch;
            tggRuleMatch = tggRuleDef.gen(ctx);
			tggRules.addTggRuleApplication(tggRuleMatch); 
        }
        // update invariant corr to all rule
        Map<String, Object> invs = tggRules.genAllCorrInvariant();
        for (Iterator iter = invs.keySet().iterator(); iter.hasNext();) {
			String className = (String) iter.next();
			for (Iterator iter1 = tggRules.getTggRules().iterator(); iter1.hasNext();) {
				MTggRule rule = (MTggRule) iter1.next();
				List<MObject> objs = rule.getCorrRule().getAllObjects();
				for (Iterator iter2 = objs.iterator(); iter2.hasNext();) {
					MObject mObject = (MObject) iter2.next();
					if (mObject.cls().name().equals(className)){
						rule.addCorrInvariant(className, invs.get(className));
						break;
					}
				}
			}
		}
		return tggRules;
	}

    public String getFName() {
        return fName.getText();
    }

    public List getfTggRules() {
        return fTggRules;
    }
}
