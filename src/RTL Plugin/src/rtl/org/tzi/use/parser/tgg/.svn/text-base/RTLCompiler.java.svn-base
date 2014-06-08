package org.tzi.use.parser.tgg;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.tzi.use.parser.ParseErrorHandler;
import org.tzi.use.parser.tgg.Context;
import org.tzi.use.parser.tgg.ast.*;
import org.tzi.use.tgg.TggRuleCollection;
import org.tzi.use.uml.mm.MModel;
import org.tzi.use.uml.sys.MSystemException;

public class RTLCompiler {
	//	 utility class
    private RTLCompiler() {}
    
    /**
     * Compiles a specification.
     *
     * @param  in the source to be compiled
     * @param  inName name of the source stream
     * @param  err output stream for error messages
     * @return MModel null if there were any errors
     * @throws MSystemException 
     */
    public static TggRuleCollection compileSpecification(String in, 
                                              String inName,
                                              PrintWriter err,
                                              MModel model) throws MSystemException {
    	InputStream inStream = new ByteArrayInputStream(in.getBytes());
    	return RTLCompiler.compileSpecification(inStream, inName, err, model);
    }

    /**
     * Compiles a specification.
     *
     * @param  in the source to be compiled
     * @param  inName name of the source stream
     * @param  err output stream for error messages
     * @return MModel null if there were any errors
     * @throws MSystemException 
     */
    public static TggRuleCollection compileSpecification(InputStream in, 
                                              String inName,
                                              PrintWriter err,
                                              MModel model) throws MSystemException {
    	TggRuleCollection tggRules = null;
        ParseErrorHandler errHandler = new ParseErrorHandler(inName, err);
        
        ANTLRInputStream aInput;
		try {
			aInput = new ANTLRInputStream(in);
			aInput.name = inName;
		} catch (IOException e1) {
			err.println(e1.getMessage());
			return null;
		}
		
        RTLLexer lexer = new RTLLexer(aInput);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        RTLParser parser = new RTLParser(tokenStream);
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
}
