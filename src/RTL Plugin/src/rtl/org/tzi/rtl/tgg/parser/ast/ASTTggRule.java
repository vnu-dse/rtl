package org.tzi.rtl.tgg.parser.ast;


import org.antlr.runtime.Token;
import org.tzi.rtl.tgg.mm.MRule;
import org.tzi.rtl.tgg.mm.MTggRule;
import org.tzi.rtl.tgg.parser.Context;

import org.tzi.use.parser.SemanticException;
import org.tzi.use.uml.mm.MModel;
import org.tzi.use.uml.sys.MSystem;
import org.tzi.use.uml.sys.MSystemException;

public class ASTTggRule {
	/**
	 * @uml.property  name="fName"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	Token fName;
	/**
	 * @uml.property  name="fSourceRule"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	ASTRule fSourceRule;
	/**
	 * @uml.property  name="fTargetRule"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	ASTRule fTargetRule;
	/**
	 * @uml.property  name="fCorrRule"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	ASTCorrRule fCorrRule;
	/**
	 * @uml.property  name="fIsDeletingRule"
	 */
	boolean fIsDeletingRule = false;
	public ASTTggRule(Token name, ASTRule sourceRule, ASTRule targetRule, ASTCorrRule corrRule, boolean isDeletingRule) {
		// TODO Auto-generated constructor stub
		fName = name;
		fSourceRule = sourceRule;
		fTargetRule = targetRule;
		fCorrRule = corrRule;
		fIsDeletingRule = isDeletingRule;
	}

	public MTggRule gen(Context ctx) throws SemanticException, MSystemException {
		// TODO Auto-generated method stub
		ctx.setIsDeletingRule(fIsDeletingRule);
		MTggRule tggRule = null;		
		try {
			MModel model = ctx.model();
			MSystem system_LHS = new MSystem(model);		
			ctx.setSystemState_LHS(system_LHS.state());
			MSystem system_RHS = new MSystem(model);		
			ctx.setSystemState_RHS(system_RHS.state());

        	MRule sourceRule = fSourceRule.gen(ctx);
        	MRule targetRule = fTargetRule.gen(ctx);
        	MRule corrRule = fCorrRule.gen(ctx);

        	tggRule = new MTggRule(fName.getText(),sourceRule,targetRule,corrRule,fIsDeletingRule);     
        } catch (SemanticException ex) {
            ctx.reportError(ex);
        } 
		
		return tggRule;
	}

    public String getFName() {
        return fName.getText();
    }

    public String toString() {
        String ruleDefinition = "";

        ruleDefinition += "rule " + getFName() + "\n";

        ruleDefinition += "checkSource {\n";
        ruleDefinition += fSourceRule.toString() + "\n";
        ruleDefinition += "}\n";

        ruleDefinition += "checkCorr {\n";
        ruleDefinition += fCorrRule.toString() + "\n";
        ruleDefinition += "}\n";

        ruleDefinition += "checkTarget {\n";
        ruleDefinition += fTargetRule.toString() + "\n";
        ruleDefinition += "}\n";

        return ruleDefinition;
    }

}
