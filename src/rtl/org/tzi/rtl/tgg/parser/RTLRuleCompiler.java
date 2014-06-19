package org.tzi.rtl.tgg.parser;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import org.tzi.rtl.tgg.parser.ast.ASTTggRuleCollection;
import org.tzi.rtl.tgg.mm.TggRuleCollection;

import org.tzi.use.parser.ParseErrorHandler;
import org.tzi.use.uml.mm.MModel;
import org.tzi.use.uml.sys.MSystemException;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class RTLRuleCompiler {

	//	 utility class
    private RTLRuleCompiler() {}
    
    /**
     * Compiles a specification.
     *
     * @param  in the source to be compiled
     * @param  inName name of the source stream
     * @param  err output stream for error messages
     * @return MModel null if there were any errors
     * @throws org.tzi.use.uml.sys.MSystemException
     */

    public static TggRuleCollection compileSpecification(String in,
                                              String inName,
                                              PrintWriter err,
                                              MModel model) throws MSystemException {
    	InputStream inStream = new ByteArrayInputStream(in.getBytes());
    	return RTLRuleCompiler.compileSpecification(inStream, inName, err, model);
    }
    
    /**
     * Compiles a specification.
     *
     * @param  in the source to be compiled
     * @param  inName name of the source stream
     * @param  err output stream for error messages
     * @return MModel null if there were any errors
     * @throws org.tzi.use.uml.sys.MSystemException
     */
    public static TggRuleCollection compileSpecification(InputStream in, 
                                              String inName,
                                              PrintWriter err,
                                              MModel model) throws MSystemException {
    	TggRuleCollection tggRules = new TggRuleCollection();
        ParseErrorHandler errHandler = new ParseErrorHandler(inName, err);
        
        ANTLRInputStream aInput;
		try {
			aInput = new ANTLRInputStream(in);
			aInput.name = inName;
		} catch (IOException e1) {
			err.println(e1.getMessage());
			return null;
		}
		
        RTLRuleLexer lexer = new RTLRuleLexer(aInput);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        RTLRuleParser parser = new RTLRuleParser(tokenStream);
        lexer.init(errHandler);
        parser.init(errHandler);
        try {
            // Parse the specification
            //Log.verbose("Parsing...");
            ASTTggRuleCollection astTggRules = parser.tggRuleCollection();
            if (errHandler.errorCount() == 0 ) {
                // Generate code
                //Log.verbose("Translating...");
                Context ctx = new Context(inName, err, null, null);
                ctx.setModel(model);
                tggRules = astTggRules.gen(ctx);
                tggRules.setfName(astTggRules.getFName());
            }
        } catch (RecognitionException e) {
            err.println(parser.getSourceName() +":" + 
                        e.line + ":" +
                        e.charPositionInLine + ": " + 
                        e.getMessage());
        } 
        err.flush();
        return tggRules;
    }

    public static ASTTggRuleCollection getASTTggRuleCollection(InputStream in,
                                                               String inName,
                                                               PrintWriter err) {

        ParseErrorHandler errHandler = new ParseErrorHandler(inName, err);

        ANTLRInputStream aInput;
        try {
            aInput = new ANTLRInputStream(in);
            aInput.name = inName;
        } catch (IOException e1) {
            err.println(e1.getMessage());
            return null;
        }

        RTLRuleLexer lexer = new RTLRuleLexer(aInput);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        RTLRuleParser parser = new RTLRuleParser(tokenStream);
        lexer.init(errHandler);
        parser.init(errHandler);

        ASTTggRuleCollection astTggRules = null;
        try {
            astTggRules = parser.tggRuleCollection();
        } catch (RecognitionException e) {
            System.out.println(e.getMessage());
            return null;
        }

        return astTggRules;
    }


}
