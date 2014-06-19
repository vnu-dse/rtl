// $ANTLR 3.4 TestSuite.g 2013-03-09 16:24:50
 
/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2010 Mark Richters, University of Bremen
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.  
 */
 
package org.tzi.use.parser.testsuite;

import org.tzi.use.parser.base.BaseParser;
import org.tzi.use.parser.soil.*;
import org.tzi.use.parser.soil.ast.*;
import org.tzi.use.parser.ocl.*;
import java.util.Collections;
import java.util.Arrays;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TestSuiteParser extends BaseParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "BAR", "COLON", "COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "EQUAL", "ESC", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "INT", "LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MINUS", "ML_COMMENT", "NEWLINE", "NON_OCL_STRING", "NOT_EQUAL", "PLUS", "RANGE_OR_INT", "RBRACE", "RBRACK", "REAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "STRING", "VOCAB", "WS", "'!'", "'Bag'", "'Collection'", "'OrderedSet'", "'Sequence'", "'Set'", "'Tuple'", "'Undefined'", "'allInstances'", "'and'", "'assert'", "'assign'", "'begin'", "'beginVariation'", "'between'", "'create'", "'declare'", "'delete'", "'destroy'", "'div'", "'do'", "'else'", "'end'", "'endVariation'", "'endif'", "'execute'", "'false'", "'for'", "'from'", "'if'", "'implies'", "'in'", "'insert'", "'into'", "'inv'", "'invalid'", "'invs'", "'iterate'", "'let'", "'model'", "'new'", "'not'", "'null'", "'oclAsType'", "'oclEmpty'", "'oclIsKindOf'", "'oclIsTypeOf'", "'oclUndefined'", "'openter'", "'opexit'", "'or'", "'post'", "'pre'", "'set'", "'setup'", "'testcase'", "'testsuite'", "'then'", "'true'", "'valid'", "'while'", "'xor'"
    };

    public static final int EOF=-1;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int ARROW=4;
    public static final int AT=5;
    public static final int BAR=6;
    public static final int COLON=7;
    public static final int COLON_COLON=8;
    public static final int COLON_EQUAL=9;
    public static final int COMMA=10;
    public static final int DOT=11;
    public static final int DOTDOT=12;
    public static final int EQUAL=13;
    public static final int ESC=14;
    public static final int GREATER=15;
    public static final int GREATER_EQUAL=16;
    public static final int HASH=17;
    public static final int HEX_DIGIT=18;
    public static final int IDENT=19;
    public static final int INT=20;
    public static final int LBRACE=21;
    public static final int LBRACK=22;
    public static final int LESS=23;
    public static final int LESS_EQUAL=24;
    public static final int LPAREN=25;
    public static final int MINUS=26;
    public static final int ML_COMMENT=27;
    public static final int NEWLINE=28;
    public static final int NON_OCL_STRING=29;
    public static final int NOT_EQUAL=30;
    public static final int PLUS=31;
    public static final int RANGE_OR_INT=32;
    public static final int RBRACE=33;
    public static final int RBRACK=34;
    public static final int REAL=35;
    public static final int RPAREN=36;
    public static final int SEMI=37;
    public static final int SLASH=38;
    public static final int SL_COMMENT=39;
    public static final int STAR=40;
    public static final int STRING=41;
    public static final int VOCAB=42;
    public static final int WS=43;

    // delegates
    public BaseParser[] getDelegates() {
        return new BaseParser[] {};
    }

    // delegators


    public TestSuiteParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public TestSuiteParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return TestSuiteParser.tokenNames; }
    public String getGrammarFileName() { return "TestSuite.g"; }



    // $ANTLR start "testSuite"
    // TestSuite.g:90:1: testSuite returns [ASTTestSuite suite] : 'testsuite' suiteName= IDENT 'for' 'model' modelFile= filename ( 'setup' ( '!' c= shellCommandOnly )* 'end' )? tests= testCases EOF ;
    public final ASTTestSuite testSuite() throws RecognitionException {
        ASTTestSuite suite = null;


        Token suiteName=null;
        String modelFile =null;

        ASTStatement c =null;

        List tests =null;



          List setupStatements = new ArrayList();

        try {
            // TestSuite.g:94:3: ( 'testsuite' suiteName= IDENT 'for' 'model' modelFile= filename ( 'setup' ( '!' c= shellCommandOnly )* 'end' )? tests= testCases EOF )
            // TestSuite.g:95:3: 'testsuite' suiteName= IDENT 'for' 'model' modelFile= filename ( 'setup' ( '!' c= shellCommandOnly )* 'end' )? tests= testCases EOF
            {
            match(input,100,FOLLOW_100_in_testSuite61); if (state.failed) return suite;

            suiteName=(Token)match(input,IDENT,FOLLOW_IDENT_in_testSuite71); if (state.failed) return suite;

            if ( state.backtracking==0 ) { suite = new ASTTestSuite(suiteName); }

            match(input,71,FOLLOW_71_in_testSuite82); if (state.failed) return suite;

            match(input,83,FOLLOW_83_in_testSuite84); if (state.failed) return suite;

            pushFollow(FOLLOW_filename_in_testSuite93);
            modelFile=filename();

            state._fsp--;
            if (state.failed) return suite;

            if ( state.backtracking==0 ) { suite.setModelFile(suiteName); }

            // TestSuite.g:101:3: ( 'setup' ( '!' c= shellCommandOnly )* 'end' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==98) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // TestSuite.g:101:4: 'setup' ( '!' c= shellCommandOnly )* 'end'
                    {
                    match(input,98,FOLLOW_98_in_testSuite105); if (state.failed) return suite;

                    // TestSuite.g:102:4: ( '!' c= shellCommandOnly )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==44) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // TestSuite.g:102:5: '!' c= shellCommandOnly
                    	    {
                    	    match(input,44,FOLLOW_44_in_testSuite112); if (state.failed) return suite;

                    	    pushFollow(FOLLOW_shellCommandOnly_in_testSuite118);
                    	    c=shellCommandOnly();

                    	    state._fsp--;
                    	    if (state.failed) return suite;

                    	    if ( state.backtracking==0 ) { setupStatements.add(c); }

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    match(input,66,FOLLOW_66_in_testSuite124); if (state.failed) return suite;

                    if ( state.backtracking==0 ) { suite.setSetupStatements(setupStatements); }

                    }
                    break;

            }


            pushFollow(FOLLOW_testCases_in_testSuite145);
            tests=testCases();

            state._fsp--;
            if (state.failed) return suite;

            if ( state.backtracking==0 ) { suite.setTestCases(tests); }

            match(input,EOF,FOLLOW_EOF_in_testSuite154); if (state.failed) return suite;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return suite;
    }
    // $ANTLR end "testSuite"



    // $ANTLR start "filename"
    // TestSuite.g:110:1: filename returns [String filename] : name= IDENT '.' suffix= IDENT ;
    public final String filename() throws RecognitionException {
        String filename = null;


        Token name=null;
        Token suffix=null;

        try {
            // TestSuite.g:111:4: (name= IDENT '.' suffix= IDENT )
            // TestSuite.g:112:4: name= IDENT '.' suffix= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_filename172); if (state.failed) return filename;

            match(input,DOT,FOLLOW_DOT_in_filename174); if (state.failed) return filename;

            suffix=(Token)match(input,IDENT,FOLLOW_IDENT_in_filename178); if (state.failed) return filename;

            if ( state.backtracking==0 ) {filename = (name!=null?name.getText():null) + "." + (suffix!=null?suffix.getText():null);}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return filename;
    }
    // $ANTLR end "filename"



    // $ANTLR start "testCases"
    // TestSuite.g:115:1: testCases returns [List testCases] : (test= testCase )+ ;
    public final List testCases() throws RecognitionException {
        List testCases = null;


        ASTTestCase test =null;


         testCases = new ArrayList(); 
        try {
            // TestSuite.g:117:3: ( (test= testCase )+ )
            // TestSuite.g:118:3: (test= testCase )+
            {
            // TestSuite.g:118:3: (test= testCase )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==99) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // TestSuite.g:118:4: test= testCase
            	    {
            	    pushFollow(FOLLOW_testCase_in_testCases205);
            	    test=testCase();

            	    state._fsp--;
            	    if (state.failed) return testCases;

            	    if ( state.backtracking==0 ) { testCases.add(test); }

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return testCases;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return testCases;
    }
    // $ANTLR end "testCases"



    // $ANTLR start "testCase"
    // TestSuite.g:121:1: testCase returns [ASTTestCase n] : 'testcase' name= IDENT ( '!' c= shellCommandOnly |a= assertStatement |b= 'beginVariation' |e= 'endVariation' )* 'end' ;
    public final ASTTestCase testCase() throws RecognitionException {
        ASTTestCase n = null;


        Token name=null;
        Token b=null;
        Token e=null;
        ASTStatement c =null;

        ASTAssert a =null;


        try {
            // TestSuite.g:122:3: ( 'testcase' name= IDENT ( '!' c= shellCommandOnly |a= assertStatement |b= 'beginVariation' |e= 'endVariation' )* 'end' )
            // TestSuite.g:123:3: 'testcase' name= IDENT ( '!' c= shellCommandOnly |a= assertStatement |b= 'beginVariation' |e= 'endVariation' )* 'end'
            {
            match(input,99,FOLLOW_99_in_testCase224); if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_testCase228); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTTestCase(name); }

            // TestSuite.g:124:3: ( '!' c= shellCommandOnly |a= assertStatement |b= 'beginVariation' |e= 'endVariation' )*
            loop4:
            do {
                int alt4=5;
                switch ( input.LA(1) ) {
                case 44:
                    {
                    alt4=1;
                    }
                    break;
                case 54:
                    {
                    alt4=2;
                    }
                    break;
                case 57:
                    {
                    alt4=3;
                    }
                    break;
                case 67:
                    {
                    alt4=4;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // TestSuite.g:125:7: '!' c= shellCommandOnly
            	    {
            	    match(input,44,FOLLOW_44_in_testCase242); if (state.failed) return n;

            	    pushFollow(FOLLOW_shellCommandOnly_in_testCase248);
            	    c=shellCommandOnly();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addStatement(c); }

            	    }
            	    break;
            	case 2 :
            	    // TestSuite.g:127:7: a= assertStatement
            	    {
            	    pushFollow(FOLLOW_assertStatement_in_testCase267);
            	    a=assertStatement();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addStatement(a); }

            	    }
            	    break;
            	case 3 :
            	    // TestSuite.g:129:7: b= 'beginVariation'
            	    {
            	    b=(Token)match(input,57,FOLLOW_57_in_testCase285); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addStatement(new ASTVariationStart(b)); }

            	    }
            	    break;
            	case 4 :
            	    // TestSuite.g:131:7: e= 'endVariation'
            	    {
            	    e=(Token)match(input,67,FOLLOW_67_in_testCase303); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addStatement(new ASTVariationEnd(e)); }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input,66,FOLLOW_66_in_testCase315); if (state.failed) return n;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "testCase"



    // $ANTLR start "assertStatement"
    // TestSuite.g:136:1: assertStatement returns [ASTAssert n] : s= 'assert' ( 'valid' | 'invalid' ) (exp= expression | 'invs' | 'invs' classname= IDENT | 'inv' classname= IDENT COLON_COLON invname= IDENT |pre= assertionStatementPre[s=$s, valid=valid] |post= assertionStatementPost[s=$s, valid=valid] ) ( COMMA msg= STRING )? ;
    public final ASTAssert assertStatement() throws RecognitionException {
        ASTAssert n = null;


        Token s=null;
        Token classname=null;
        Token invname=null;
        Token msg=null;
        TestSuiteParser.expression_return exp =null;

        ASTAssertPre pre =null;

        ASTAssertPost post =null;


         boolean valid = true; 
        try {
            // TestSuite.g:138:3: (s= 'assert' ( 'valid' | 'invalid' ) (exp= expression | 'invs' | 'invs' classname= IDENT | 'inv' classname= IDENT COLON_COLON invname= IDENT |pre= assertionStatementPre[s=$s, valid=valid] |post= assertionStatementPost[s=$s, valid=valid] ) ( COMMA msg= STRING )? )
            // TestSuite.g:139:3: s= 'assert' ( 'valid' | 'invalid' ) (exp= expression | 'invs' | 'invs' classname= IDENT | 'inv' classname= IDENT COLON_COLON invname= IDENT |pre= assertionStatementPre[s=$s, valid=valid] |post= assertionStatementPost[s=$s, valid=valid] ) ( COMMA msg= STRING )?
            {
            s=(Token)match(input,54,FOLLOW_54_in_assertStatement336); if (state.failed) return n;

            // TestSuite.g:140:3: ( 'valid' | 'invalid' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==103) ) {
                alt5=1;
            }
            else if ( (LA5_0==79) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // TestSuite.g:140:4: 'valid'
                    {
                    match(input,103,FOLLOW_103_in_assertStatement341); if (state.failed) return n;

                    if ( state.backtracking==0 ) { valid = true; }

                    }
                    break;
                case 2 :
                    // TestSuite.g:140:32: 'invalid'
                    {
                    match(input,79,FOLLOW_79_in_assertStatement347); if (state.failed) return n;

                    if ( state.backtracking==0 ) {valid = false; }

                    }
                    break;

            }


            // TestSuite.g:141:3: (exp= expression | 'invs' | 'invs' classname= IDENT | 'inv' classname= IDENT COLON_COLON invname= IDENT |pre= assertionStatementPre[s=$s, valid=valid] |post= assertionStatementPost[s=$s, valid=valid] )
            int alt6=6;
            switch ( input.LA(1) ) {
            case AT:
            case HASH:
            case IDENT:
            case INT:
            case LPAREN:
            case MINUS:
            case PLUS:
            case REAL:
            case STRING:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 70:
            case 73:
            case 81:
            case 82:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 102:
                {
                alt6=1;
                }
                break;
            case 80:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==IDENT) ) {
                    alt6=3;
                }
                else if ( (LA6_2==COMMA||LA6_2==44||LA6_2==54||LA6_2==57||(LA6_2 >= 66 && LA6_2 <= 67)) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;

                }
                }
                break;
            case 78:
                {
                alt6=4;
                }
                break;
            case 96:
                {
                alt6=5;
                }
                break;
            case 95:
                {
                alt6=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // TestSuite.g:142:7: exp= expression
                    {
                    pushFollow(FOLLOW_expression_in_assertStatement366);
                    exp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTAssertOclExpression((exp!=null?exp.n:null).getStartToken(), input.LT(-1), valid, (exp!=null?exp.n:null)); }

                    }
                    break;
                case 2 :
                    // TestSuite.g:144:7: 'invs'
                    {
                    match(input,80,FOLLOW_80_in_assertStatement382); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTAssertGlobalInvariants(s, input.LT(-1), valid); }

                    }
                    break;
                case 3 :
                    // TestSuite.g:146:7: 'invs' classname= IDENT
                    {
                    match(input,80,FOLLOW_80_in_assertStatement398); if (state.failed) return n;

                    classname=(Token)match(input,IDENT,FOLLOW_IDENT_in_assertStatement402); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTAssertClassInvariants(s, input.LT(-1), valid, classname); }

                    }
                    break;
                case 4 :
                    // TestSuite.g:148:7: 'inv' classname= IDENT COLON_COLON invname= IDENT
                    {
                    match(input,78,FOLLOW_78_in_assertStatement418); if (state.failed) return n;

                    classname=(Token)match(input,IDENT,FOLLOW_IDENT_in_assertStatement422); if (state.failed) return n;

                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_assertStatement424); if (state.failed) return n;

                    invname=(Token)match(input,IDENT,FOLLOW_IDENT_in_assertStatement428); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTAssertSingleInvariant(s, input.LT(-1), valid, classname, invname); }

                    }
                    break;
                case 5 :
                    // TestSuite.g:150:7: pre= assertionStatementPre[s=$s, valid=valid]
                    {
                    pushFollow(FOLLOW_assertionStatementPre_in_assertStatement448);
                    pre=assertionStatementPre(s=s, valid=valid);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = pre; }

                    }
                    break;
                case 6 :
                    // TestSuite.g:152:7: post= assertionStatementPost[s=$s, valid=valid]
                    {
                    pushFollow(FOLLOW_assertionStatementPost_in_assertStatement469);
                    post=assertionStatementPost(s=s, valid=valid);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = post; }

                    }
                    break;

            }


            // TestSuite.g:154:3: ( COMMA msg= STRING )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==COMMA) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // TestSuite.g:155:5: COMMA msg= STRING
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_assertStatement486); if (state.failed) return n;

                    msg=(Token)match(input,STRING,FOLLOW_STRING_in_assertStatement490); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setMessage(msg); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "assertStatement"



    // $ANTLR start "assertionStatementPre"
    // TestSuite.g:159:1: assertionStatementPre[Token s, boolean valid] returns [ASTAssertPre n] : 'pre' objExp= expression opName= IDENT LPAREN (e= expression ( COMMA e= expression )* )? RPAREN ( COLON_COLON name= IDENT )? ;
    public final ASTAssertPre assertionStatementPre(Token s, boolean valid) throws RecognitionException {
        ASTAssertPre n = null;


        Token opName=null;
        Token name=null;
        TestSuiteParser.expression_return objExp =null;

        TestSuiteParser.expression_return e =null;


        try {
            // TestSuite.g:160:3: ( 'pre' objExp= expression opName= IDENT LPAREN (e= expression ( COMMA e= expression )* )? RPAREN ( COLON_COLON name= IDENT )? )
            // TestSuite.g:161:3: 'pre' objExp= expression opName= IDENT LPAREN (e= expression ( COMMA e= expression )* )? RPAREN ( COLON_COLON name= IDENT )?
            {
            match(input,96,FOLLOW_96_in_assertionStatementPre513); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_assertionStatementPre517);
            objExp=expression();

            state._fsp--;
            if (state.failed) return n;

            opName=(Token)match(input,IDENT,FOLLOW_IDENT_in_assertionStatementPre521); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssertPre(s, null, valid, (objExp!=null?objExp.n:null), opName); }

            match(input,LPAREN,FOLLOW_LPAREN_in_assertionStatementPre527); if (state.failed) return n;

            // TestSuite.g:163:5: (e= expression ( COMMA e= expression )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==AT||LA9_0==HASH||(LA9_0 >= IDENT && LA9_0 <= INT)||(LA9_0 >= LPAREN && LA9_0 <= MINUS)||LA9_0==PLUS||LA9_0==REAL||LA9_0==STRING||(LA9_0 >= 45 && LA9_0 <= 51)||LA9_0==70||LA9_0==73||(LA9_0 >= 81 && LA9_0 <= 82)||(LA9_0 >= 85 && LA9_0 <= 91)||LA9_0==102) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // TestSuite.g:163:7: e= expression ( COMMA e= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_assertionStatementPre538);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addArg((e!=null?e.n:null)); }

                    // TestSuite.g:163:41: ( COMMA e= expression )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==COMMA) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // TestSuite.g:163:43: COMMA e= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_assertionStatementPre544); if (state.failed) return n;

                    	    pushFollow(FOLLOW_expression_in_assertionStatementPre548);
                    	    e=expression();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addArg((e!=null?e.n:null)); }

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_assertionStatementPre561); if (state.failed) return n;

            // TestSuite.g:164:10: ( COLON_COLON name= IDENT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==COLON_COLON) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // TestSuite.g:164:11: COLON_COLON name= IDENT
                    {
                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_assertionStatementPre564); if (state.failed) return n;

                    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_assertionStatementPre568); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setConditionName(name); }

                    }
                    break;

            }


            if ( state.backtracking==0 ) { n.setEnd(input.LT(-1)); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "assertionStatementPre"



    // $ANTLR start "assertionStatementPost"
    // TestSuite.g:168:1: assertionStatementPost[Token s, boolean valid] returns [ASTAssertPost n] : 'post' (name= IDENT )? ;
    public final ASTAssertPost assertionStatementPost(Token s, boolean valid) throws RecognitionException {
        ASTAssertPost n = null;


        Token name=null;

        try {
            // TestSuite.g:169:3: ( 'post' (name= IDENT )? )
            // TestSuite.g:170:3: 'post' (name= IDENT )?
            {
            match(input,95,FOLLOW_95_in_assertionStatementPost593); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssertPost(s, null, valid); }

            // TestSuite.g:171:3: (name= IDENT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IDENT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // TestSuite.g:171:4: name= IDENT
                    {
                    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_assertionStatementPost602); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setConditionName(name); }

                    }
                    break;

            }


            if ( state.backtracking==0 ) { n.setEnd(input.LT(-1)); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "assertionStatementPost"



    // $ANTLR start "expressionOnly"
    // TestSuite.g:201:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
    public final ASTExpression expressionOnly() throws RecognitionException {
        ASTExpression n = null;


        TestSuiteParser.expression_return nExp =null;


        try {
            // TestSuite.g:202:5: (nExp= expression EOF )
            // TestSuite.g:203:5: nExp= expression EOF
            {
            pushFollow(FOLLOW_expression_in_expressionOnly637);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_expressionOnly639); if (state.failed) return n;

            if ( state.backtracking==0 ) {n = (nExp!=null?nExp.n:null);}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "expressionOnly"


    public static class expression_return extends ParserRuleReturnScope {
        public ASTExpression n;
    };


    // $ANTLR start "expression"
    // TestSuite.g:210:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression ;
    public final TestSuiteParser.expression_return expression() throws RecognitionException {
        TestSuiteParser.expression_return retval = new TestSuiteParser.expression_return();
        retval.start = input.LT(1);


        Token name=null;
        ASTType t =null;

        TestSuiteParser.expression_return e1 =null;

        ASTExpression nCndImplies =null;


         
          ASTLetExpression prevLet = null, firstLet = null;
          ASTExpression e2;
          Token tok = null;

        try {
            // TestSuite.g:216:5: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression )
            // TestSuite.g:217:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of expression */ }

            // TestSuite.g:218:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==82) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // TestSuite.g:219:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in'
            	    {
            	    match(input,82,FOLLOW_82_in_expression687); if (state.failed) return retval;

            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression691); if (state.failed) return retval;

            	    // TestSuite.g:219:24: ( COLON t= type )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==COLON) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // TestSuite.g:219:26: COLON t= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expression695); if (state.failed) return retval;

            	            pushFollow(FOLLOW_type_in_expression699);
            	            t=type();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_expression704); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expression_in_expression708);
            	    e1=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    match(input,75,FOLLOW_75_in_expression710); if (state.failed) return retval;

            	    if ( state.backtracking==0 ) { ASTLetExpression nextLet = new ASTLetExpression(name, t, (e1!=null?e1.n:null));
            	             if ( firstLet == null ) 
            	                 firstLet = nextLet;
            	             if ( prevLet != null ) 
            	                 prevLet.setInExpr(nextLet);
            	             prevLet = nextLet;
            	           }

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression735);
            nCndImplies=conditionalImpliesExpression();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { if ( nCndImplies != null ) {
                	 retval.n = nCndImplies;
                     retval.n.setStartToken(tok);
                  }
                  
                  if ( prevLet != null ) { 
                     prevLet.setInExpr(retval.n);
                     retval.n = firstLet;
                     retval.n.setStartToken(tok);
                  }
                }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"



    // $ANTLR start "paramList"
    // TestSuite.g:247:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
    public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
        List<ASTVariableDeclaration> paramList = null;


        ASTVariableDeclaration v =null;


         paramList = new ArrayList<ASTVariableDeclaration>(); 
        try {
            // TestSuite.g:249:5: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
            // TestSuite.g:250:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_paramList768); if (state.failed) return paramList;

            // TestSuite.g:251:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDENT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // TestSuite.g:252:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_paramList785);
                    v=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return paramList;

                    if ( state.backtracking==0 ) { paramList.add(v); }

                    // TestSuite.g:253:7: ( COMMA v= variableDeclaration )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==COMMA) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // TestSuite.g:253:9: COMMA v= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_paramList797); if (state.failed) return paramList;

                    	    pushFollow(FOLLOW_variableDeclaration_in_paramList801);
                    	    v=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return paramList;

                    	    if ( state.backtracking==0 ) { paramList.add(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_paramList821); if (state.failed) return paramList;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return paramList;
    }
    // $ANTLR end "paramList"



    // $ANTLR start "idList"
    // TestSuite.g:261:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
    public final List idList() throws RecognitionException {
        List idList = null;


        Token id0=null;
        Token idn=null;

         idList = new ArrayList(); 
        try {
            // TestSuite.g:263:5: (id0= IDENT ( COMMA idn= IDENT )* )
            // TestSuite.g:264:5: id0= IDENT ( COMMA idn= IDENT )*
            {
            id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList850); if (state.failed) return idList;

            if ( state.backtracking==0 ) { idList.add(id0); }

            // TestSuite.g:265:5: ( COMMA idn= IDENT )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // TestSuite.g:265:7: COMMA idn= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_idList860); if (state.failed) return idList;

            	    idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList864); if (state.failed) return idList;

            	    if ( state.backtracking==0 ) { idList.add(idn); }

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return idList;
    }
    // $ANTLR end "idList"



    // $ANTLR start "variableDeclaration"
    // TestSuite.g:273:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
    public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
        ASTVariableDeclaration n = null;


        Token name=null;
        ASTType t =null;


        try {
            // TestSuite.g:274:5: (name= IDENT COLON t= type )
            // TestSuite.g:275:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration895); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableDeclaration897); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableDeclaration901);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTVariableDeclaration(name, t); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "variableDeclaration"



    // $ANTLR start "conditionalImpliesExpression"
    // TestSuite.g:283:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndOrExp =null;

        ASTExpression n1 =null;


        try {
            // TestSuite.g:284:5: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
            // TestSuite.g:285:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression937);
            nCndOrExp=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndOrExp;}

            // TestSuite.g:286:5: (op= 'implies' n1= conditionalOrExpression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==74) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // TestSuite.g:286:7: op= 'implies' n1= conditionalOrExpression
            	    {
            	    op=(Token)match(input,74,FOLLOW_74_in_conditionalImpliesExpression950); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression954);
            	    n1=conditionalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "conditionalImpliesExpression"



    // $ANTLR start "conditionalOrExpression"
    // TestSuite.g:295:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndXorExp =null;

        ASTExpression n1 =null;


        try {
            // TestSuite.g:296:5: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
            // TestSuite.g:297:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
            {
            pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression999);
            nCndXorExp=conditionalXOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndXorExp;}

            // TestSuite.g:298:5: (op= 'or' n1= conditionalXOrExpression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==94) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // TestSuite.g:298:7: op= 'or' n1= conditionalXOrExpression
            	    {
            	    op=(Token)match(input,94,FOLLOW_94_in_conditionalOrExpression1012); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1016);
            	    n1=conditionalXOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "conditionalOrExpression"



    // $ANTLR start "conditionalXOrExpression"
    // TestSuite.g:307:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalXOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndAndExp =null;

        ASTExpression n1 =null;


        try {
            // TestSuite.g:308:5: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
            // TestSuite.g:309:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1060);
            nCndAndExp=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndAndExp;}

            // TestSuite.g:310:5: (op= 'xor' n1= conditionalAndExpression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==105) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // TestSuite.g:310:7: op= 'xor' n1= conditionalAndExpression
            	    {
            	    op=(Token)match(input,105,FOLLOW_105_in_conditionalXOrExpression1073); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1077);
            	    n1=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "conditionalXOrExpression"



    // $ANTLR start "conditionalAndExpression"
    // TestSuite.g:319:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nEqExp =null;

        ASTExpression n1 =null;


        try {
            // TestSuite.g:320:5: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
            // TestSuite.g:321:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression1121);
            nEqExp=equalityExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nEqExp;}

            // TestSuite.g:322:5: (op= 'and' n1= equalityExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==53) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // TestSuite.g:322:7: op= 'and' n1= equalityExpression
            	    {
            	    op=(Token)match(input,53,FOLLOW_53_in_conditionalAndExpression1134); if (state.failed) return n;

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression1138);
            	    n1=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "conditionalAndExpression"



    // $ANTLR start "equalityExpression"
    // TestSuite.g:331:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nRelExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // TestSuite.g:333:5: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
            // TestSuite.g:334:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1186);
            nRelExp=relationalExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nRelExp;}

            // TestSuite.g:335:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==EQUAL||LA21_0==NOT_EQUAL) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // TestSuite.g:335:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( input.LA(1)==EQUAL||input.LA(1)==NOT_EQUAL ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1215);
            	    n1=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "equalityExpression"



    // $ANTLR start "relationalExpression"
    // TestSuite.g:345:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nAddiExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // TestSuite.g:347:5: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
            // TestSuite.g:348:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1264);
            nAddiExp=additiveExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nAddiExp;}

            // TestSuite.g:349:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0 >= GREATER && LA22_0 <= GREATER_EQUAL)||(LA22_0 >= LESS && LA22_0 <= LESS_EQUAL)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // TestSuite.g:349:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( (input.LA(1) >= GREATER && input.LA(1) <= GREATER_EQUAL)||(input.LA(1) >= LESS && input.LA(1) <= LESS_EQUAL) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1300);
            	    n1=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "relationalExpression"



    // $ANTLR start "additiveExpression"
    // TestSuite.g:359:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nMulExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // TestSuite.g:361:5: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
            // TestSuite.g:362:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1350);
            nMulExp=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nMulExp;}

            // TestSuite.g:363:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==MINUS||LA23_0==PLUS) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // TestSuite.g:363:7: ( PLUS | MINUS ) n1= multiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1378);
            	    n1=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "additiveExpression"



    // $ANTLR start "multiplicativeExpression"
    // TestSuite.g:374:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // TestSuite.g:376:5: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
            // TestSuite.g:377:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1428);
            nUnExp=unaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nUnExp;}

            // TestSuite.g:378:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==SLASH||LA24_0==STAR||LA24_0==63) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // TestSuite.g:378:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==63 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1460);
            	    n1=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "multiplicativeExpression"



    // $ANTLR start "unaryExpression"
    // TestSuite.g:390:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression nPosExp =null;


         Token op = null; 
        try {
            // TestSuite.g:392:7: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==MINUS||LA25_0==PLUS||LA25_0==85) ) {
                alt25=1;
            }
            else if ( (LA25_0==AT||LA25_0==HASH||(LA25_0 >= IDENT && LA25_0 <= INT)||LA25_0==LPAREN||LA25_0==REAL||LA25_0==STRING||(LA25_0 >= 45 && LA25_0 <= 51)||LA25_0==70||LA25_0==73||LA25_0==81||(LA25_0 >= 86 && LA25_0 <= 91)||LA25_0==102) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // TestSuite.g:393:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    {
                    // TestSuite.g:393:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    // TestSuite.g:393:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
                    {
                    if ( state.backtracking==0 ) { op = input.LT(1); }

                    if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==85 ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1546);
                    nUnExp=unaryExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUnaryExpression(op, nUnExp); }

                    }


                    }
                    break;
                case 2 :
                    // TestSuite.g:397:7: nPosExp= postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression1566);
                    nPosExp=postfixExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nPosExp; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "unaryExpression"



    // $ANTLR start "postfixExpression"
    // TestSuite.g:405:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
    public final ASTExpression postfixExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nPrimExp =null;

        ASTExpression nPc =null;


         boolean arrow = false; 
        try {
            // TestSuite.g:407:5: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
            // TestSuite.g:408:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression1599);
            nPrimExp=primaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nPrimExp; }

            // TestSuite.g:409:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==DOT) ) {
                    int LA27_2 = input.LA(2);

                    if ( (LA27_2==IDENT) ) {
                        int LA27_4 = input.LA(3);

                        if ( (LA27_4==EOF||(LA27_4 >= ARROW && LA27_4 <= BAR)||(LA27_4 >= COMMA && LA27_4 <= EQUAL)||(LA27_4 >= GREATER && LA27_4 <= GREATER_EQUAL)||LA27_4==IDENT||(LA27_4 >= LBRACE && LA27_4 <= MINUS)||(LA27_4 >= NOT_EQUAL && LA27_4 <= PLUS)||(LA27_4 >= RBRACE && LA27_4 <= RBRACK)||(LA27_4 >= RPAREN && LA27_4 <= SLASH)||LA27_4==STAR||LA27_4==44||(LA27_4 >= 53 && LA27_4 <= 55)||LA27_4==57||LA27_4==59||(LA27_4 >= 61 && LA27_4 <= 69)||(LA27_4 >= 74 && LA27_4 <= 76)||LA27_4==82||LA27_4==94||LA27_4==97||LA27_4==101||LA27_4==105) ) {
                            alt27=1;
                        }


                    }
                    else if ( (LA27_2==81||LA27_2==87||(LA27_2 >= 89 && LA27_2 <= 90)) ) {
                        alt27=1;
                    }


                }
                else if ( (LA27_0==ARROW) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // TestSuite.g:410:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
            	    {
            	    // TestSuite.g:410:6: ( ARROW | DOT )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==ARROW) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==DOT) ) {
            	        alt26=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // TestSuite.g:410:8: ARROW
            	            {
            	            match(input,ARROW,FOLLOW_ARROW_in_postfixExpression1617); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = true; }

            	            }
            	            break;
            	        case 2 :
            	            // TestSuite.g:410:34: DOT
            	            {
            	            match(input,DOT,FOLLOW_DOT_in_postfixExpression1623); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = false; }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_propertyCall_in_postfixExpression1634);
            	    nPc=propertyCall(n, arrow);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = nPc; }

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "postfixExpression"



    // $ANTLR start "primaryExpression"
    // TestSuite.g:426:1: primaryExpression returns [ASTExpression n] : (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )? );
    public final ASTExpression primaryExpression() throws RecognitionException {
        ASTExpression n = null;


        Token id1=null;
        ASTExpression nLit =null;

        ASTExpression nOr =null;

        ASTExpression nPc =null;

        TestSuiteParser.expression_return nExp =null;

        ASTExpression nIfExp =null;


        try {
            // TestSuite.g:427:7: (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )? )
            int alt30=6;
            switch ( input.LA(1) ) {
            case HASH:
            case INT:
            case REAL:
            case STRING:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 70:
            case 86:
            case 88:
            case 91:
            case 102:
                {
                alt30=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case COLON_COLON:
                    {
                    alt30=1;
                    }
                    break;
                case EOF:
                case ARROW:
                case AT:
                case BAR:
                case COMMA:
                case DOTDOT:
                case EQUAL:
                case GREATER:
                case GREATER_EQUAL:
                case IDENT:
                case LBRACE:
                case LBRACK:
                case LESS:
                case LESS_EQUAL:
                case LPAREN:
                case MINUS:
                case NOT_EQUAL:
                case PLUS:
                case RBRACE:
                case RBRACK:
                case RPAREN:
                case SEMI:
                case SLASH:
                case STAR:
                case 44:
                case 53:
                case 54:
                case 55:
                case 57:
                case 59:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 74:
                case 75:
                case 76:
                case 82:
                case 94:
                case 97:
                case 101:
                case 105:
                    {
                    alt30=3;
                    }
                    break;
                case DOT:
                    {
                    int LA30_7 = input.LA(3);

                    if ( (LA30_7==52) ) {
                        alt30=6;
                    }
                    else if ( (LA30_7==IDENT||LA30_7==81||LA30_7==87||(LA30_7 >= 89 && LA30_7 <= 90)) ) {
                        alt30=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 7, input);

                        throw nvae;

                    }
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;

                }

                }
                break;
            case AT:
                {
                alt30=2;
                }
                break;
            case 81:
            case 87:
            case 89:
            case 90:
                {
                alt30=3;
                }
                break;
            case LPAREN:
                {
                alt30=4;
                }
                break;
            case 73:
                {
                alt30=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // TestSuite.g:428:7: nLit= literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression1674);
                    nLit=literal();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nLit; }

                    }
                    break;
                case 2 :
                    // TestSuite.g:429:7: nOr= objectReference
                    {
                    pushFollow(FOLLOW_objectReference_in_primaryExpression1688);
                    nOr=objectReference();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nOr; }

                    }
                    break;
                case 3 :
                    // TestSuite.g:430:7: nPc= propertyCall[null, false]
                    {
                    pushFollow(FOLLOW_propertyCall_in_primaryExpression1700);
                    nPc=propertyCall(null, false);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nPc; }

                    }
                    break;
                case 4 :
                    // TestSuite.g:431:7: LPAREN nExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression1711); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression1715);
                    nExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression1717); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExp!=null?nExp.n:null); }

                    }
                    break;
                case 5 :
                    // TestSuite.g:432:7: nIfExp= ifExpression
                    {
                    pushFollow(FOLLOW_ifExpression_in_primaryExpression1729);
                    nIfExp=ifExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nIfExp; }

                    }
                    break;
                case 6 :
                    // TestSuite.g:433:7: id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )?
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression1741); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression1743); if (state.failed) return n;

                    match(input,52,FOLLOW_52_in_primaryExpression1745); if (state.failed) return n;

                    // TestSuite.g:433:36: ( LPAREN RPAREN )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==LPAREN) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // TestSuite.g:433:38: LPAREN RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression1749); if (state.failed) return n;

                            match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression1751); if (state.failed) return n;

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) { n = new ASTAllInstancesExpression(id1); }

                    // TestSuite.g:435:7: ( AT 'pre' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==AT) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // TestSuite.g:435:9: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression1772); if (state.failed) return n;

                            match(input,96,FOLLOW_96_in_primaryExpression1774); if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setIsPre(); }

                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "primaryExpression"



    // $ANTLR start "objectReference"
    // TestSuite.g:439:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
    public final ASTExpression objectReference() throws RecognitionException {
        ASTExpression n = null;


        Token objectName=null;

        try {
            // TestSuite.g:440:3: ( AT objectName= IDENT )
            // TestSuite.g:441:3: AT objectName= IDENT
            {
            match(input,AT,FOLLOW_AT_in_objectReference1801); if (state.failed) return n;

            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference1809); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTObjectReferenceExpression(objectName); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "objectReference"



    // $ANTLR start "propertyCall"
    // TestSuite.g:455:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] );
    public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nExpQuery =null;

        ASTExpression nExpIterate =null;

        TestSuiteParser.operationExpression_return nExpOperation =null;

        ASTTypeArgExpression nExpType =null;


        try {
            // TestSuite.g:456:7: ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] )
            int alt31=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA31_1 = input.LA(2);

                if ( (((( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )&&( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ))&&( input.LA(2) == LPAREN ))) ) {
                    alt31=1;
                }
                else if ( (true) ) {
                    alt31=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;

                }
                }
                break;
            case 81:
                {
                alt31=2;
                }
                break;
            case 87:
            case 89:
            case 90:
                {
                alt31=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }

            switch (alt31) {
                case 1 :
                    // TestSuite.g:460:7: {...}?{...}?nExpQuery= queryExpression[source]
                    {
                    if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
                    }

                    if ( !(( input.LA(2) == LPAREN )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
                    }

                    pushFollow(FOLLOW_queryExpression_in_propertyCall1874);
                    nExpQuery=queryExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpQuery; }

                    }
                    break;
                case 2 :
                    // TestSuite.g:463:7: nExpIterate= iterateExpression[source]
                    {
                    pushFollow(FOLLOW_iterateExpression_in_propertyCall1887);
                    nExpIterate=iterateExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpIterate; }

                    }
                    break;
                case 3 :
                    // TestSuite.g:464:7: nExpOperation= operationExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_operationExpression_in_propertyCall1900);
                    nExpOperation=operationExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExpOperation!=null?nExpOperation.n:null); }

                    }
                    break;
                case 4 :
                    // TestSuite.g:465:7: nExpType= typeExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_typeExpression_in_propertyCall1913);
                    nExpType=typeExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpType; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "propertyCall"



    // $ANTLR start "queryExpression"
    // TestSuite.g:474:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
    public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTElemVarsDeclaration decls =null;

        TestSuiteParser.expression_return nExp =null;


        ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
        try {
            // TestSuite.g:475:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
            // TestSuite.g:476:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
            {
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression1948); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression1955); if (state.failed) return n;

            // TestSuite.g:478:5: (decls= elemVarsDeclaration BAR )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==IDENT) ) {
                int LA32_1 = input.LA(2);

                if ( ((LA32_1 >= BAR && LA32_1 <= COLON)||LA32_1==COMMA) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // TestSuite.g:478:7: decls= elemVarsDeclaration BAR
                    {
                    pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression1966);
                    decls=elemVarsDeclaration();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {decl = decls;}

                    match(input,BAR,FOLLOW_BAR_in_queryExpression1970); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_expression_in_queryExpression1981);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression1987); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTQueryExpression(op, range, decl, (nExp!=null?nExp.n:null)); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "queryExpression"



    // $ANTLR start "iterateExpression"
    // TestSuite.g:492:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
    public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ASTElemVarsDeclaration decls =null;

        ASTVariableInitialization init =null;

        TestSuiteParser.expression_return nExp =null;


        try {
            // TestSuite.g:492:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
            // TestSuite.g:493:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
            {
            i=(Token)match(input,81,FOLLOW_81_in_iterateExpression2019); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression2025); if (state.failed) return n;

            pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression2033);
            decls=elemVarsDeclaration();

            state._fsp--;
            if (state.failed) return n;

            match(input,SEMI,FOLLOW_SEMI_in_iterateExpression2035); if (state.failed) return n;

            pushFollow(FOLLOW_variableInitialization_in_iterateExpression2043);
            init=variableInitialization();

            state._fsp--;
            if (state.failed) return n;

            match(input,BAR,FOLLOW_BAR_in_iterateExpression2045); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_iterateExpression2053);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression2059); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTIterateExpression(i, range, decls, init, (nExp!=null?nExp.n:null)); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "iterateExpression"


    public static class operationExpression_return extends ParserRuleReturnScope {
        public ASTOperationExpression n;
    };


    // $ANTLR start "operationExpression"
    // TestSuite.g:514:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
    public final TestSuiteParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        TestSuiteParser.operationExpression_return retval = new TestSuiteParser.operationExpression_return();
        retval.start = input.LT(1);


        Token name=null;
        TestSuiteParser.expression_return rolename =null;

        TestSuiteParser.expression_return e =null;


        try {
            // TestSuite.g:516:5: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
            // TestSuite.g:517:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression2103); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTOperationExpression(name, source, followsArrow); }

            // TestSuite.g:523:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==LBRACK) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // TestSuite.g:523:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression2125); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_operationExpression2138);
                    rolename=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    // TestSuite.g:525:9: ( COMMA rolename= expression )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==COMMA) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // TestSuite.g:525:10: COMMA rolename= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2151); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_expression_in_operationExpression2155);
                    	    rolename=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression2167); if (state.failed) return retval;

                    // TestSuite.g:528:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==LBRACK) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // TestSuite.g:528:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression2184); if (state.failed) return retval;

                            pushFollow(FOLLOW_expression_in_operationExpression2199);
                            rolename=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            // TestSuite.g:530:11: ( COMMA rolename= expression )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==COMMA) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // TestSuite.g:530:12: COMMA rolename= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2214); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression2218);
                            	    rolename=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop34;
                                }
                            } while (true);


                            match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression2232); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }


            // TestSuite.g:535:5: ( AT 'pre' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==AT) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // TestSuite.g:535:7: AT 'pre'
                    {
                    match(input,AT,FOLLOW_AT_in_operationExpression2257); if (state.failed) return retval;

                    match(input,96,FOLLOW_96_in_operationExpression2259); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.setIsPre(); }

                    }
                    break;

            }


            // TestSuite.g:537:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==LPAREN) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // TestSuite.g:538:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression2284); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.hasParentheses(); }

                    // TestSuite.g:539:7: (e= expression ( COMMA e= expression )* )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==AT||LA39_0==HASH||(LA39_0 >= IDENT && LA39_0 <= INT)||(LA39_0 >= LPAREN && LA39_0 <= MINUS)||LA39_0==PLUS||LA39_0==REAL||LA39_0==STRING||(LA39_0 >= 45 && LA39_0 <= 51)||LA39_0==70||LA39_0==73||(LA39_0 >= 81 && LA39_0 <= 82)||(LA39_0 >= 85 && LA39_0 <= 91)||LA39_0==102) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // TestSuite.g:540:7: e= expression ( COMMA e= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_operationExpression2305);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            // TestSuite.g:541:7: ( COMMA e= expression )*
                            loop38:
                            do {
                                int alt38=2;
                                int LA38_0 = input.LA(1);

                                if ( (LA38_0==COMMA) ) {
                                    alt38=1;
                                }


                                switch (alt38) {
                            	case 1 :
                            	    // TestSuite.g:541:9: COMMA e= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2317); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression2321);
                            	    e=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop38;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression2341); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { retval.n.setStartToken(((Token)retval.start)); }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "operationExpression"



    // $ANTLR start "typeExpression"
    // TestSuite.g:554:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN ;
    public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTTypeArgExpression n = null;


        ASTType t =null;


         Token opToken = null; 
        try {
            // TestSuite.g:557:2: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN )
            // TestSuite.g:558:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN
            {
            if ( state.backtracking==0 ) { opToken = input.LT(1); }

            if ( input.LA(1)==87||(input.LA(1) >= 89 && input.LA(1) <= 90) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression2406); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_typeExpression2410);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression2412); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTTypeArgExpression(opToken, source, t, followsArrow); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "typeExpression"



    // $ANTLR start "elemVarsDeclaration"
    // TestSuite.g:569:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] :var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
    public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
        ASTElemVarsDeclaration n = null;


        Token var1=null;
        Token varN=null;
        ASTType t =null;

        ASTType tN =null;


        try {
            // TestSuite.g:570:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
            // TestSuite.g:571:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
            {
            if ( state.backtracking==0 ) { n = new ASTElemVarsDeclaration(); }

            var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration2450); if (state.failed) return n;

            // TestSuite.g:572:17: ( COLON t= type )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==COLON) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // TestSuite.g:572:18: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration2453); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_elemVarsDeclaration2457);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {n.addDeclaration(var1, t);}

            // TestSuite.g:573:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==COMMA) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // TestSuite.g:573:5: COMMA varN= IDENT ( COLON tN= type )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration2467); if (state.failed) return n;

            	    varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration2473); if (state.failed) return n;

            	    // TestSuite.g:573:24: ( COLON tN= type )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==COLON) ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // TestSuite.g:573:25: COLON tN= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration2476); if (state.failed) return n;

            	            pushFollow(FOLLOW_type_in_elemVarsDeclaration2482);
            	            tN=type();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            }
            	            break;

            	    }


            	    if ( state.backtracking==0 ) {n.addDeclaration(varN, tN); }

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "elemVarsDeclaration"



    // $ANTLR start "variableInitialization"
    // TestSuite.g:581:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
    public final ASTVariableInitialization variableInitialization() throws RecognitionException {
        ASTVariableInitialization n = null;


        Token name=null;
        ASTType t =null;

        TestSuiteParser.expression_return e =null;


        try {
            // TestSuite.g:582:5: (name= IDENT COLON t= type EQUAL e= expression )
            // TestSuite.g:583:5: name= IDENT COLON t= type EQUAL e= expression
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization2510); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableInitialization2512); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableInitialization2516);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization2518); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_variableInitialization2522);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTVariableInitialization(name, t, (e!=null?e.n:null)); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "variableInitialization"



    // $ANTLR start "ifExpression"
    // TestSuite.g:592:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
    public final ASTExpression ifExpression() throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        TestSuiteParser.expression_return cond =null;

        TestSuiteParser.expression_return t =null;

        TestSuiteParser.expression_return e =null;


        try {
            // TestSuite.g:593:5: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
            // TestSuite.g:594:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
            {
            i=(Token)match(input,73,FOLLOW_73_in_ifExpression2554); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression2558);
            cond=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,101,FOLLOW_101_in_ifExpression2560); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression2564);
            t=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,65,FOLLOW_65_in_ifExpression2566); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression2570);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,68,FOLLOW_68_in_ifExpression2572); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTIfExpression(i, (cond!=null?cond.n:null), (t!=null?t.n:null), (e!=null?e.n:null)); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "ifExpression"



    // $ANTLR start "literal"
    // TestSuite.g:613:1: literal returns [ASTExpression n] : (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral );
    public final ASTExpression literal() throws RecognitionException {
        ASTExpression n = null;


        Token t=null;
        Token f=null;
        Token i=null;
        Token r=null;
        Token s=null;
        Token enumLit=null;
        Token enumName=null;
        ASTCollectionLiteral nColIt =null;

        ASTEmptyCollectionLiteral nEColIt =null;

        ASTUndefinedLiteral nUndLit =null;

        ASTTupleLiteral nTupleLit =null;


        try {
            // TestSuite.g:614:7: (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral )
            int alt44=11;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt44=1;
                }
                break;
            case 70:
                {
                alt44=2;
                }
                break;
            case INT:
                {
                alt44=3;
                }
                break;
            case REAL:
                {
                alt44=4;
                }
                break;
            case STRING:
                {
                alt44=5;
                }
                break;
            case HASH:
                {
                alt44=6;
                }
                break;
            case IDENT:
                {
                alt44=7;
                }
                break;
            case 45:
            case 47:
            case 48:
            case 49:
                {
                int LA44_8 = input.LA(2);

                if ( (LA44_8==LPAREN) ) {
                    alt44=9;
                }
                else if ( (LA44_8==LBRACE) ) {
                    alt44=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 8, input);

                    throw nvae;

                }
                }
                break;
            case 46:
            case 88:
                {
                alt44=9;
                }
                break;
            case 51:
            case 86:
            case 91:
                {
                alt44=10;
                }
                break;
            case 50:
                {
                alt44=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }

            switch (alt44) {
                case 1 :
                    // TestSuite.g:615:7: t= 'true'
                    {
                    t=(Token)match(input,102,FOLLOW_102_in_literal2611); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(true); }

                    }
                    break;
                case 2 :
                    // TestSuite.g:616:7: f= 'false'
                    {
                    f=(Token)match(input,70,FOLLOW_70_in_literal2625); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(false); }

                    }
                    break;
                case 3 :
                    // TestSuite.g:617:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_literal2638); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTIntegerLiteral(i); }

                    }
                    break;
                case 4 :
                    // TestSuite.g:618:7: r= REAL
                    {
                    r=(Token)match(input,REAL,FOLLOW_REAL_in_literal2653); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRealLiteral(r); }

                    }
                    break;
                case 5 :
                    // TestSuite.g:619:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_literal2667); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTStringLiteral(s); }

                    }
                    break;
                case 6 :
                    // TestSuite.g:620:7: HASH enumLit= IDENT
                    {
                    match(input,HASH,FOLLOW_HASH_in_literal2677); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2681); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumLit);}

                    }
                    break;
                case 7 :
                    // TestSuite.g:621:7: enumName= IDENT '::' enumLit= IDENT
                    {
                    enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2693); if (state.failed) return n;

                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal2695); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2699); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumName, enumLit); }

                    }
                    break;
                case 8 :
                    // TestSuite.g:622:7: nColIt= collectionLiteral
                    {
                    pushFollow(FOLLOW_collectionLiteral_in_literal2711);
                    nColIt=collectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nColIt; }

                    }
                    break;
                case 9 :
                    // TestSuite.g:623:7: nEColIt= emptyCollectionLiteral
                    {
                    pushFollow(FOLLOW_emptyCollectionLiteral_in_literal2723);
                    nEColIt=emptyCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nEColIt; }

                    }
                    break;
                case 10 :
                    // TestSuite.g:624:7: nUndLit= undefinedLiteral
                    {
                    pushFollow(FOLLOW_undefinedLiteral_in_literal2735);
                    nUndLit=undefinedLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nUndLit; }

                    }
                    break;
                case 11 :
                    // TestSuite.g:625:7: nTupleLit= tupleLiteral
                    {
                    pushFollow(FOLLOW_tupleLiteral_in_literal2747);
                    nTupleLit=tupleLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nTupleLit; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "literal"



    // $ANTLR start "collectionLiteral"
    // TestSuite.g:633:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
    public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
        ASTCollectionLiteral n = null;


        ASTCollectionItem ci =null;


         Token op = null; 
        try {
            // TestSuite.g:635:5: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
            // TestSuite.g:636:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( input.LA(1)==45||(input.LA(1) >= 47 && input.LA(1) <= 49) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            if ( state.backtracking==0 ) { n = new ASTCollectionLiteral(op); }

            match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral2814); if (state.failed) return n;

            // TestSuite.g:640:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==AT||LA46_0==HASH||(LA46_0 >= IDENT && LA46_0 <= INT)||(LA46_0 >= LPAREN && LA46_0 <= MINUS)||LA46_0==PLUS||LA46_0==REAL||LA46_0==STRING||(LA46_0 >= 45 && LA46_0 <= 51)||LA46_0==70||LA46_0==73||(LA46_0 >= 81 && LA46_0 <= 82)||(LA46_0 >= 85 && LA46_0 <= 91)||LA46_0==102) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // TestSuite.g:641:7: ci= collectionItem ( COMMA ci= collectionItem )*
                    {
                    pushFollow(FOLLOW_collectionItem_in_collectionLiteral2831);
                    ci=collectionItem();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addItem(ci); }

                    // TestSuite.g:642:7: ( COMMA ci= collectionItem )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==COMMA) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // TestSuite.g:642:9: COMMA ci= collectionItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral2844); if (state.failed) return n;

                    	    pushFollow(FOLLOW_collectionItem_in_collectionLiteral2848);
                    	    ci=collectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addItem(ci); }

                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral2867); if (state.failed) return n;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "collectionLiteral"



    // $ANTLR start "collectionItem"
    // TestSuite.g:651:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
    public final ASTCollectionItem collectionItem() throws RecognitionException {
        ASTCollectionItem n = null;


        TestSuiteParser.expression_return e =null;


         n = new ASTCollectionItem(); 
        try {
            // TestSuite.g:653:5: (e= expression ( DOTDOT e= expression )? )
            // TestSuite.g:654:5: e= expression ( DOTDOT e= expression )?
            {
            pushFollow(FOLLOW_expression_in_collectionItem2896);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setFirst((e!=null?e.n:null)); }

            // TestSuite.g:655:5: ( DOTDOT e= expression )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==DOTDOT) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // TestSuite.g:655:7: DOTDOT e= expression
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem2907); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_collectionItem2911);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setSecond((e!=null?e.n:null)); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "collectionItem"



    // $ANTLR start "emptyCollectionLiteral"
    // TestSuite.g:665:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE );
    public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
        ASTEmptyCollectionLiteral n = null;


        ASTCollectionType t =null;


        try {
            // TestSuite.g:666:5: ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==88) ) {
                alt48=1;
            }
            else if ( ((LA48_0 >= 45 && LA48_0 <= 49)) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;

            }
            switch (alt48) {
                case 1 :
                    // TestSuite.g:667:5: 'oclEmpty' LPAREN t= collectionType RPAREN
                    {
                    match(input,88,FOLLOW_88_in_emptyCollectionLiteral2940); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral2942); if (state.failed) return n;

                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral2946);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral2948); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }

                    }
                    break;
                case 2 :
                    // TestSuite.g:670:5: t= collectionType LBRACE RBRACE
                    {
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral2964);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral2966); if (state.failed) return n;

                    match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral2968); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "emptyCollectionLiteral"



    // $ANTLR start "undefinedLiteral"
    // TestSuite.g:681:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
    public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
        ASTUndefinedLiteral n = null;


        ASTType t =null;


        try {
            // TestSuite.g:682:5: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
            int alt49=4;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt49=1;
                }
                break;
            case 51:
                {
                alt49=2;
                }
                break;
            case 86:
                {
                int LA49_3 = input.LA(2);

                if ( (LA49_3==LPAREN) ) {
                    alt49=3;
                }
                else if ( (LA49_3==EOF||LA49_3==ARROW||LA49_3==BAR||(LA49_3 >= COMMA && LA49_3 <= EQUAL)||(LA49_3 >= GREATER && LA49_3 <= GREATER_EQUAL)||LA49_3==IDENT||LA49_3==LBRACE||(LA49_3 >= LESS && LA49_3 <= LESS_EQUAL)||LA49_3==MINUS||(LA49_3 >= NOT_EQUAL && LA49_3 <= PLUS)||(LA49_3 >= RBRACE && LA49_3 <= RBRACK)||(LA49_3 >= RPAREN && LA49_3 <= SLASH)||LA49_3==STAR||LA49_3==44||(LA49_3 >= 53 && LA49_3 <= 55)||LA49_3==57||LA49_3==59||(LA49_3 >= 61 && LA49_3 <= 69)||(LA49_3 >= 74 && LA49_3 <= 76)||LA49_3==82||LA49_3==94||LA49_3==97||LA49_3==101||LA49_3==105) ) {
                    alt49=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;

            }

            switch (alt49) {
                case 1 :
                    // TestSuite.g:683:5: 'oclUndefined' LPAREN t= type RPAREN
                    {
                    match(input,91,FOLLOW_91_in_undefinedLiteral2998); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral3000); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral3004);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral3006); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 2 :
                    // TestSuite.g:686:5: 'Undefined'
                    {
                    match(input,51,FOLLOW_51_in_undefinedLiteral3020); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }

                    }
                    break;
                case 3 :
                    // TestSuite.g:689:5: 'null' LPAREN t= type RPAREN
                    {
                    match(input,86,FOLLOW_86_in_undefinedLiteral3034); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral3036); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral3040);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral3042); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 4 :
                    // TestSuite.g:692:5: 'null'
                    {
                    match(input,86,FOLLOW_86_in_undefinedLiteral3056); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "undefinedLiteral"



    // $ANTLR start "tupleLiteral"
    // TestSuite.g:702:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
    public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
        ASTTupleLiteral n = null;


        ASTTupleItem ti =null;


         List tiList = new ArrayList(); 
        try {
            // TestSuite.g:704:5: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
            // TestSuite.g:705:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
            {
            match(input,50,FOLLOW_50_in_tupleLiteral3095); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral3101); if (state.failed) return n;

            pushFollow(FOLLOW_tupleItem_in_tupleLiteral3109);
            ti=tupleItem();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tiList.add(ti); }

            // TestSuite.g:708:5: ( COMMA ti= tupleItem )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==COMMA) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // TestSuite.g:708:7: COMMA ti= tupleItem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral3120); if (state.failed) return n;

            	    pushFollow(FOLLOW_tupleItem_in_tupleLiteral3124);
            	    ti=tupleItem();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tiList.add(ti); }

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral3135); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTTupleLiteral(tiList); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "tupleLiteral"



    // $ANTLR start "tupleItem"
    // TestSuite.g:716:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
    public final ASTTupleItem tupleItem() throws RecognitionException {
        ASTTupleItem n = null;


        Token name=null;
        ASTType t =null;

        TestSuiteParser.expression_return e =null;


        try {
            // TestSuite.g:717:5: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
            // TestSuite.g:718:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem3166); if (state.failed) return n;

            // TestSuite.g:719:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==COLON) ) {
                int LA51_1 = input.LA(2);

                if ( (synpred1_TestSuite()) ) {
                    alt51=1;
                }
                else if ( (true) ) {
                    alt51=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA51_0==EQUAL) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;

            }
            switch (alt51) {
                case 1 :
                    // TestSuite.g:722:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
                    {
                    match(input,COLON,FOLLOW_COLON_in_tupleItem3205); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_tupleItem3209);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem3211); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_tupleItem3215);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTTupleItem(name, t, (e!=null?e.n:null)); }

                    }
                    break;
                case 2 :
                    // TestSuite.g:725:7: ( COLON | EQUAL ) e= expression
                    {
                    if ( input.LA(1)==COLON||input.LA(1)==EQUAL ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_expression_in_tupleItem3247);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTTupleItem(name, (e!=null?e.n:null)); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "tupleItem"



    // $ANTLR start "type"
    // TestSuite.g:736:1: type returns [ASTType n] : (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) ;
    public final ASTType type() throws RecognitionException {
        ASTType n = null;


        ASTSimpleType nTSimple =null;

        ASTCollectionType nTCollection =null;

        ASTTupleType nTTuple =null;


         Token tok = null; 
        try {
            // TestSuite.g:738:5: ( (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) )
            // TestSuite.g:739:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of type */ }

            // TestSuite.g:740:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            int alt52=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt52=1;
                }
                break;
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                {
                alt52=2;
                }
                break;
            case 50:
                {
                alt52=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;

            }

            switch (alt52) {
                case 1 :
                    // TestSuite.g:741:7: nTSimple= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type3313);
                    nTSimple=simpleType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTSimple; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 2 :
                    // TestSuite.g:742:7: nTCollection= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type3325);
                    nTCollection=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTCollection; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 3 :
                    // TestSuite.g:743:7: nTTuple= tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_type3337);
                    nTTuple=tupleType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTTuple; if (n != null) n.setStartToken(tok); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "type"



    // $ANTLR start "typeOnly"
    // TestSuite.g:748:1: typeOnly returns [ASTType n] : nT= type EOF ;
    public final ASTType typeOnly() throws RecognitionException {
        ASTType n = null;


        ASTType nT =null;


        try {
            // TestSuite.g:749:5: (nT= type EOF )
            // TestSuite.g:750:5: nT= type EOF
            {
            pushFollow(FOLLOW_type_in_typeOnly3369);
            nT=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_typeOnly3371); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nT; }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "typeOnly"



    // $ANTLR start "simpleType"
    // TestSuite.g:760:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
    public final ASTSimpleType simpleType() throws RecognitionException {
        ASTSimpleType n = null;


        Token name=null;

        try {
            // TestSuite.g:761:5: (name= IDENT )
            // TestSuite.g:762:5: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType3399); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTSimpleType(name); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "simpleType"



    // $ANTLR start "collectionType"
    // TestSuite.g:770:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
    public final ASTCollectionType collectionType() throws RecognitionException {
        ASTCollectionType n = null;


        ASTType elemType =null;


         Token op = null; 
        try {
            // TestSuite.g:772:5: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
            // TestSuite.g:773:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( (input.LA(1) >= 45 && input.LA(1) <= 49) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_collectionType3464); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_collectionType3468);
            elemType=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_collectionType3470); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTCollectionType(op, elemType); if (n != null) n.setStartToken(op);}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "collectionType"



    // $ANTLR start "tupleType"
    // TestSuite.g:783:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
    public final ASTTupleType tupleType() throws RecognitionException {
        ASTTupleType n = null;


        ASTTuplePart tp =null;


         List tpList = new ArrayList(); 
        try {
            // TestSuite.g:785:5: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
            // TestSuite.g:786:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
            {
            match(input,50,FOLLOW_50_in_tupleType3504); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_tupleType3506); if (state.failed) return n;

            pushFollow(FOLLOW_tuplePart_in_tupleType3515);
            tp=tuplePart();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tpList.add(tp); }

            // TestSuite.g:788:5: ( COMMA tp= tuplePart )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==COMMA) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // TestSuite.g:788:7: COMMA tp= tuplePart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleType3526); if (state.failed) return n;

            	    pushFollow(FOLLOW_tuplePart_in_tupleType3530);
            	    tp=tuplePart();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tpList.add(tp); }

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            match(input,RPAREN,FOLLOW_RPAREN_in_tupleType3542); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTTupleType(tpList); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "tupleType"



    // $ANTLR start "tuplePart"
    // TestSuite.g:797:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
    public final ASTTuplePart tuplePart() throws RecognitionException {
        ASTTuplePart n = null;


        Token name=null;
        ASTType t =null;


        try {
            // TestSuite.g:798:5: (name= IDENT COLON t= type )
            // TestSuite.g:799:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart3574); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_tuplePart3576); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_tuplePart3580);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTTuplePart(name, t); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "tuplePart"



    // $ANTLR start "shellCommandOnly"
    // TestSuite.g:806:1: shellCommandOnly returns [ASTStatement n] : ( ( stat )=>s= stat | ( legacyStat )=>l= legacyStat );
    public final ASTStatement shellCommandOnly() throws RecognitionException {
        ASTStatement n = null;


        TestSuiteParser.stat_return s =null;

        TestSuiteParser.legacyStat_return l =null;


        try {
            // TestSuite.g:807:3: ( ( stat )=>s= stat | ( legacyStat )=>l= legacyStat )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==SEMI) && (synpred2_TestSuite())) {
                alt54=1;
            }
            else if ( (LA54_0==66) && (synpred2_TestSuite())) {
                alt54=1;
            }
            else if ( (LA54_0==44) && (synpred2_TestSuite())) {
                alt54=1;
            }
            else if ( (LA54_0==54) && (synpred2_TestSuite())) {
                alt54=1;
            }
            else if ( (LA54_0==57) && (synpred2_TestSuite())) {
                alt54=1;
            }
            else if ( (LA54_0==67) && (synpred2_TestSuite())) {
                alt54=1;
            }
            else if ( (LA54_0==82) ) {
                int LA54_7 = input.LA(2);

                if ( (synpred2_TestSuite()) ) {
                    alt54=1;
                }
                else if ( (synpred3_TestSuite()) ) {
                    alt54=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 7, input);

                    throw nvae;

                }
            }
            else if ( (LA54_0==MINUS||LA54_0==PLUS||LA54_0==85) && (synpred2_TestSuite())) {
                alt54=1;
            }
            else if ( (LA54_0==102) && (synpred2_TestSuite())) {
                alt54=1;
            }
            else if ( (LA54_0==70) && (synpred2_TestSuite())) {
                alt54=1;
            }
            else if ( (LA54_0==INT) && (synpred2_TestSuite())) {
                alt54=1;
            }
            else if ( (LA54_0==REAL) && (synpred2_TestSuite())) {
                alt54=1;
            }
            else if ( (LA54_0==STRING) && (synpred2_TestSuite())) {
                alt54=1;
            }
            else if ( (LA54_0==HASH) && (synpred2_TestSuite())) {
                alt54=1;
            }
            else if ( (LA54_0==IDENT) && (synpred2_TestSuite())) {
                alt54=1;
            }
            else if ( (LA54_0==45||(LA54_0 >= 47 && LA54_0 <= 49)) && (synpred2_TestSuite())) {
                alt54=1;
            }
            else if ( (LA54_0==88) && (synpred2_TestSuite())) {
                alt54=1;
            }
            else if ( (LA54_0==46) && (synpred2_TestSuite())) {
                alt54=1;
            }
            else if ( (LA54_0==91) && (synpred2_TestSuite())) {
                alt54=1;
            }
            else if ( (LA54_0==51) && (synpred2_TestSuite())) {
                alt54=1;
            }
            else if ( (LA54_0==86) && (synpred2_TestSuite())) {
                alt54=1;
            }
            else if ( (LA54_0==50) && (synpred2_TestSuite())) {
                alt54=1;
            }
            else if ( (LA54_0==AT) && (synpred2_TestSuite())) {
                alt54=1;
            }
            else if ( (LA54_0==81) && (synpred2_TestSuite())) {
                alt54=1;
            }
            else if ( (LA54_0==87||(LA54_0 >= 89 && LA54_0 <= 90)) && (synpred2_TestSuite())) {
                alt54=1;
            }
            else if ( (LA54_0==LPAREN) && (synpred2_TestSuite())) {
                alt54=1;
            }
            else if ( (LA54_0==73) && (synpred2_TestSuite())) {
                alt54=1;
            }
            else if ( (LA54_0==84) && (synpred2_TestSuite())) {
                alt54=1;
            }
            else if ( (LA54_0==62) ) {
                int LA54_29 = input.LA(2);

                if ( (synpred2_TestSuite()) ) {
                    alt54=1;
                }
                else if ( (synpred3_TestSuite()) ) {
                    alt54=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 29, input);

                    throw nvae;

                }
            }
            else if ( (LA54_0==76) ) {
                int LA54_30 = input.LA(2);

                if ( (synpred2_TestSuite()) ) {
                    alt54=1;
                }
                else if ( (synpred3_TestSuite()) ) {
                    alt54=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 30, input);

                    throw nvae;

                }
            }
            else if ( (LA54_0==61) ) {
                int LA54_31 = input.LA(2);

                if ( (synpred2_TestSuite()) ) {
                    alt54=1;
                }
                else if ( (synpred3_TestSuite()) ) {
                    alt54=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 31, input);

                    throw nvae;

                }
            }
            else if ( (LA54_0==71) && (synpred2_TestSuite())) {
                alt54=1;
            }
            else if ( (LA54_0==104) && (synpred2_TestSuite())) {
                alt54=1;
            }
            else if ( (LA54_0==56) && (synpred2_TestSuite())) {
                alt54=1;
            }
            else if ( (LA54_0==92) && (synpred3_TestSuite())) {
                alt54=2;
            }
            else if ( (LA54_0==93) && (synpred3_TestSuite())) {
                alt54=2;
            }
            else if ( (LA54_0==59) && (synpred3_TestSuite())) {
                alt54=2;
            }
            else if ( (LA54_0==55) && (synpred3_TestSuite())) {
                alt54=2;
            }
            else if ( (LA54_0==69) && (synpred3_TestSuite())) {
                alt54=2;
            }
            else if ( (LA54_0==97) && (synpred3_TestSuite())) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;

            }
            switch (alt54) {
                case 1 :
                    // TestSuite.g:808:3: ( stat )=>s= stat
                    {
                    pushFollow(FOLLOW_stat_in_shellCommandOnly3617);
                    s=stat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (s!=null?s.n:null); }

                    }
                    break;
                case 2 :
                    // TestSuite.g:811:3: ( legacyStat )=>l= legacyStat
                    {
                    pushFollow(FOLLOW_legacyStat_in_shellCommandOnly3638);
                    l=legacyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (l!=null?l.n:null); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "shellCommandOnly"



    // $ANTLR start "shellCommand"
    // TestSuite.g:819:1: shellCommand returns [ASTStatement n] : ( ( legacyStat )=>l= legacyStat EOF | ( stat )=>s= stat EOF );
    public final ASTStatement shellCommand() throws RecognitionException {
        ASTStatement n = null;


        TestSuiteParser.legacyStat_return l =null;

        TestSuiteParser.stat_return s =null;


        try {
            // TestSuite.g:820:3: ( ( legacyStat )=>l= legacyStat EOF | ( stat )=>s= stat EOF )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==92) && (synpred4_TestSuite())) {
                alt55=1;
            }
            else if ( (LA55_0==93) && (synpred4_TestSuite())) {
                alt55=1;
            }
            else if ( (LA55_0==59) && (synpred4_TestSuite())) {
                alt55=1;
            }
            else if ( (LA55_0==55) && (synpred4_TestSuite())) {
                alt55=1;
            }
            else if ( (LA55_0==82) ) {
                int LA55_5 = input.LA(2);

                if ( (synpred4_TestSuite()) ) {
                    alt55=1;
                }
                else if ( (synpred5_TestSuite()) ) {
                    alt55=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 5, input);

                    throw nvae;

                }
            }
            else if ( (LA55_0==69) && (synpred4_TestSuite())) {
                alt55=1;
            }
            else if ( (LA55_0==62) ) {
                int LA55_7 = input.LA(2);

                if ( (synpred4_TestSuite()) ) {
                    alt55=1;
                }
                else if ( (synpred5_TestSuite()) ) {
                    alt55=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 7, input);

                    throw nvae;

                }
            }
            else if ( (LA55_0==97) && (synpred4_TestSuite())) {
                alt55=1;
            }
            else if ( (LA55_0==76) ) {
                int LA55_9 = input.LA(2);

                if ( (synpred4_TestSuite()) ) {
                    alt55=1;
                }
                else if ( (synpred5_TestSuite()) ) {
                    alt55=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 9, input);

                    throw nvae;

                }
            }
            else if ( (LA55_0==61) ) {
                int LA55_10 = input.LA(2);

                if ( (synpred4_TestSuite()) ) {
                    alt55=1;
                }
                else if ( (synpred5_TestSuite()) ) {
                    alt55=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 10, input);

                    throw nvae;

                }
            }
            else if ( (LA55_0==SEMI) && (synpred5_TestSuite())) {
                alt55=2;
            }
            else if ( (LA55_0==EOF) && (synpred5_TestSuite())) {
                alt55=2;
            }
            else if ( (LA55_0==MINUS||LA55_0==PLUS||LA55_0==85) && (synpred5_TestSuite())) {
                alt55=2;
            }
            else if ( (LA55_0==102) && (synpred5_TestSuite())) {
                alt55=2;
            }
            else if ( (LA55_0==70) && (synpred5_TestSuite())) {
                alt55=2;
            }
            else if ( (LA55_0==INT) && (synpred5_TestSuite())) {
                alt55=2;
            }
            else if ( (LA55_0==REAL) && (synpred5_TestSuite())) {
                alt55=2;
            }
            else if ( (LA55_0==STRING) && (synpred5_TestSuite())) {
                alt55=2;
            }
            else if ( (LA55_0==HASH) && (synpred5_TestSuite())) {
                alt55=2;
            }
            else if ( (LA55_0==IDENT) && (synpred5_TestSuite())) {
                alt55=2;
            }
            else if ( (LA55_0==45||(LA55_0 >= 47 && LA55_0 <= 49)) && (synpred5_TestSuite())) {
                alt55=2;
            }
            else if ( (LA55_0==88) && (synpred5_TestSuite())) {
                alt55=2;
            }
            else if ( (LA55_0==46) && (synpred5_TestSuite())) {
                alt55=2;
            }
            else if ( (LA55_0==91) && (synpred5_TestSuite())) {
                alt55=2;
            }
            else if ( (LA55_0==51) && (synpred5_TestSuite())) {
                alt55=2;
            }
            else if ( (LA55_0==86) && (synpred5_TestSuite())) {
                alt55=2;
            }
            else if ( (LA55_0==50) && (synpred5_TestSuite())) {
                alt55=2;
            }
            else if ( (LA55_0==AT) && (synpred5_TestSuite())) {
                alt55=2;
            }
            else if ( (LA55_0==81) && (synpred5_TestSuite())) {
                alt55=2;
            }
            else if ( (LA55_0==87||(LA55_0 >= 89 && LA55_0 <= 90)) && (synpred5_TestSuite())) {
                alt55=2;
            }
            else if ( (LA55_0==LPAREN) && (synpred5_TestSuite())) {
                alt55=2;
            }
            else if ( (LA55_0==73) && (synpred5_TestSuite())) {
                alt55=2;
            }
            else if ( (LA55_0==84) && (synpred5_TestSuite())) {
                alt55=2;
            }
            else if ( (LA55_0==71) && (synpred5_TestSuite())) {
                alt55=2;
            }
            else if ( (LA55_0==104) && (synpred5_TestSuite())) {
                alt55=2;
            }
            else if ( (LA55_0==56) && (synpred5_TestSuite())) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;

            }
            switch (alt55) {
                case 1 :
                    // TestSuite.g:821:3: ( legacyStat )=>l= legacyStat EOF
                    {
                    pushFollow(FOLLOW_legacyStat_in_shellCommand3670);
                    l=legacyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EOF,FOLLOW_EOF_in_shellCommand3672); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (l!=null?l.n:null); }

                    }
                    break;
                case 2 :
                    // TestSuite.g:824:3: ( stat )=>s= stat EOF
                    {
                    pushFollow(FOLLOW_stat_in_shellCommand3693);
                    s=stat();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EOF,FOLLOW_EOF_in_shellCommand3695); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (s!=null?s.n:null); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "shellCommand"


    public static class legacyStat_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };


    // $ANTLR start "legacyStat"
    // TestSuite.g:834:1: legacyStat returns [ASTStatement n] : (loe= legacyOpEnter |lox= legacyOpExit | nextLegacyStat[seq] ( nextLegacyStat[seq] )* );
    public final TestSuiteParser.legacyStat_return legacyStat() throws RecognitionException {
        TestSuiteParser.legacyStat_return retval = new TestSuiteParser.legacyStat_return();
        retval.start = input.LT(1);


        ASTEnterOperationStatement loe =null;

        ASTStatement lox =null;



          ASTSequenceStatement seq = new ASTSequenceStatement();

        try {
            // TestSuite.g:838:3: (loe= legacyOpEnter |lox= legacyOpExit | nextLegacyStat[seq] ( nextLegacyStat[seq] )* )
            int alt57=3;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt57=1;
                }
                break;
            case 93:
                {
                alt57=2;
                }
                break;
            case 55:
            case 59:
            case 61:
            case 62:
            case 69:
            case 76:
            case 82:
            case 97:
                {
                alt57=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;

            }

            switch (alt57) {
                case 1 :
                    // TestSuite.g:839:3: loe= legacyOpEnter
                    {
                    pushFollow(FOLLOW_legacyOpEnter_in_legacyStat3729);
                    loe=legacyOpEnter();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { 
                        retval.n = loe;
                        if (retval.n != null) {
                          retval.n.setSourcePosition(((Token)retval.start));
                        }
                      }

                    }
                    break;
                case 2 :
                    // TestSuite.g:847:3: lox= legacyOpExit
                    {
                    pushFollow(FOLLOW_legacyOpExit_in_legacyStat3745);
                    lox=legacyOpExit();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { 
                        retval.n = lox; 
                        if (retval.n != null) {
                          retval.n.setSourcePosition(((Token)retval.start));
                        }
                      }

                    }
                    break;
                case 3 :
                    // TestSuite.g:855:3: nextLegacyStat[seq] ( nextLegacyStat[seq] )*
                    {
                    pushFollow(FOLLOW_nextLegacyStat_in_legacyStat3758);
                    nextLegacyStat(seq);

                    state._fsp--;
                    if (state.failed) return retval;

                    // TestSuite.g:856:3: ( nextLegacyStat[seq] )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==55||LA56_0==59||(LA56_0 >= 61 && LA56_0 <= 62)||LA56_0==69||LA56_0==76||LA56_0==82||LA56_0==97) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // TestSuite.g:857:5: nextLegacyStat[seq]
                    	    {
                    	    pushFollow(FOLLOW_nextLegacyStat_in_legacyStat3769);
                    	    nextLegacyStat(seq);

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) { 
                        retval.n = seq.simplify();
                        retval.n.setSourcePosition(((Token)retval.start));
                      }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "legacyStat"


    public static class nextLegacyStat_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "nextLegacyStat"
    // TestSuite.g:870:1: nextLegacyStat[ASTSequenceStatement seq] : s= singleLegacyStat ( SEMI )? ;
    public final TestSuiteParser.nextLegacyStat_return nextLegacyStat(ASTSequenceStatement seq) throws RecognitionException {
        TestSuiteParser.nextLegacyStat_return retval = new TestSuiteParser.nextLegacyStat_return();
        retval.start = input.LT(1);


        ASTStatement s =null;


        try {
            // TestSuite.g:871:3: (s= singleLegacyStat ( SEMI )? )
            // TestSuite.g:872:3: s= singleLegacyStat ( SEMI )?
            {
            pushFollow(FOLLOW_singleLegacyStat_in_nextLegacyStat3803);
            s=singleLegacyStat();

            state._fsp--;
            if (state.failed) return retval;

            // TestSuite.g:873:3: ( SEMI )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==SEMI) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // TestSuite.g:873:3: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_nextLegacyStat3807); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                if ((s != null) && (!s.isEmptyStatement())) { 
                  seq.addStatement(s, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
                }
              }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nextLegacyStat"



    // $ANTLR start "singleLegacyStat"
    // TestSuite.g:886:1: singleLegacyStat returns [ASTStatement n] : (lcr= legacyCreate |lca= legacyCreateAssign |lci= legacyCreateInsert |llt= legacyLet |lex= legacyExecute |ods= objDestroyStat | 'set' e= expression aas= attAssignStat[$e.n] |lis= lnkInsStat |lds= lnkDelStat );
    public final ASTStatement singleLegacyStat() throws RecognitionException {
        ASTStatement n = null;


        TestSuiteParser.legacyCreate_return lcr =null;

        TestSuiteParser.legacyCreateAssign_return lca =null;

        TestSuiteParser.legacyCreateInsert_return lci =null;

        ASTVariableAssignmentStatement llt =null;

        ASTStatement lex =null;

        TestSuiteParser.objDestroyStat_return ods =null;

        TestSuiteParser.expression_return e =null;

        ASTAttributeAssignmentStatement aas =null;

        ASTLinkInsertionStatement lis =null;

        ASTLinkDeletionStatement lds =null;


        try {
            // TestSuite.g:887:5: (lcr= legacyCreate |lca= legacyCreateAssign |lci= legacyCreateInsert |llt= legacyLet |lex= legacyExecute |ods= objDestroyStat | 'set' e= expression aas= attAssignStat[$e.n] |lis= lnkInsStat |lds= lnkDelStat )
            int alt59=9;
            switch ( input.LA(1) ) {
            case 59:
                {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==IDENT) ) {
                    int LA59_9 = input.LA(3);

                    if ( (LA59_9==COLON) ) {
                        int LA59_10 = input.LA(4);

                        if ( (LA59_10==IDENT) ) {
                            int LA59_12 = input.LA(5);

                            if ( (LA59_12==58) ) {
                                alt59=3;
                            }
                            else if ( (LA59_12==EOF||LA59_12==SEMI||LA59_12==44||(LA59_12 >= 54 && LA59_12 <= 55)||LA59_12==57||LA59_12==59||(LA59_12 >= 61 && LA59_12 <= 62)||(LA59_12 >= 66 && LA59_12 <= 67)||LA59_12==69||LA59_12==76||LA59_12==82||LA59_12==97) ) {
                                alt59=1;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return n;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 59, 12, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return n;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 59, 10, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA59_9==COMMA) ) {
                        alt59=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 9, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 1, input);

                    throw nvae;

                }
                }
                break;
            case 55:
                {
                alt59=2;
                }
                break;
            case 82:
                {
                alt59=4;
                }
                break;
            case 69:
                {
                alt59=5;
                }
                break;
            case 62:
                {
                alt59=6;
                }
                break;
            case 97:
                {
                alt59=7;
                }
                break;
            case 76:
                {
                alt59=8;
                }
                break;
            case 61:
                {
                alt59=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;

            }

            switch (alt59) {
                case 1 :
                    // TestSuite.g:888:5: lcr= legacyCreate
                    {
                    pushFollow(FOLLOW_legacyCreate_in_singleLegacyStat3840);
                    lcr=legacyCreate();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lcr!=null?lcr.n:null); }

                    }
                    break;
                case 2 :
                    // TestSuite.g:889:5: lca= legacyCreateAssign
                    {
                    pushFollow(FOLLOW_legacyCreateAssign_in_singleLegacyStat3859);
                    lca=legacyCreateAssign();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lca!=null?lca.n:null); }

                    }
                    break;
                case 3 :
                    // TestSuite.g:890:5: lci= legacyCreateInsert
                    {
                    pushFollow(FOLLOW_legacyCreateInsert_in_singleLegacyStat3872);
                    lci=legacyCreateInsert();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lci!=null?lci.n:null); }

                    }
                    break;
                case 4 :
                    // TestSuite.g:891:5: llt= legacyLet
                    {
                    pushFollow(FOLLOW_legacyLet_in_singleLegacyStat3885);
                    llt=legacyLet();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = llt; }

                    }
                    break;
                case 5 :
                    // TestSuite.g:894:5: lex= legacyExecute
                    {
                    pushFollow(FOLLOW_legacyExecute_in_singleLegacyStat3913);
                    lex=legacyExecute();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = lex; }

                    }
                    break;
                case 6 :
                    // TestSuite.g:895:5: ods= objDestroyStat
                    {
                    pushFollow(FOLLOW_objDestroyStat_in_singleLegacyStat3931);
                    ods=objDestroyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ods!=null?ods.n:null); }

                    }
                    break;
                case 7 :
                    // TestSuite.g:896:5: 'set' e= expression aas= attAssignStat[$e.n]
                    {
                    match(input,97,FOLLOW_97_in_singleLegacyStat3944); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_singleLegacyStat3948);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    pushFollow(FOLLOW_attAssignStat_in_singleLegacyStat3954);
                    aas=attAssignStat((e!=null?e.n:null));

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = aas; }

                    }
                    break;
                case 8 :
                    // TestSuite.g:897:5: lis= lnkInsStat
                    {
                    pushFollow(FOLLOW_lnkInsStat_in_singleLegacyStat3967);
                    lis=lnkInsStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = lis; }

                    }
                    break;
                case 9 :
                    // TestSuite.g:898:5: lds= lnkDelStat
                    {
                    pushFollow(FOLLOW_lnkDelStat_in_singleLegacyStat3988);
                    lds=lnkDelStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = lds; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "singleLegacyStat"


    public static class legacyCreate_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };


    // $ANTLR start "legacyCreate"
    // TestSuite.g:911:1: legacyCreate returns [ASTStatement n] : 'create' objNames= identListMin1 COLON objType= simpleType ;
    public final TestSuiteParser.legacyCreate_return legacyCreate() throws RecognitionException {
        TestSuiteParser.legacyCreate_return retval = new TestSuiteParser.legacyCreate_return();
        retval.start = input.LT(1);


        List<String> objNames =null;

        ASTSimpleType objType =null;


        try {
            // TestSuite.g:912:3: ( 'create' objNames= identListMin1 COLON objType= simpleType )
            // TestSuite.g:913:3: 'create' objNames= identListMin1 COLON objType= simpleType
            {
            match(input,59,FOLLOW_59_in_legacyCreate4024); if (state.failed) return retval;

            pushFollow(FOLLOW_identListMin1_in_legacyCreate4032);
            objNames=identListMin1();

            state._fsp--;
            if (state.failed) return retval;

            match(input,COLON,FOLLOW_COLON_in_legacyCreate4036); if (state.failed) return retval;

            pushFollow(FOLLOW_simpleType_in_legacyCreate4044);
            objType=simpleType();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { 
                ASTSequenceStatement seq = new ASTSequenceStatement();
                
                for (String objName : objNames) {
                  seq.addStatement(
                    new ASTNewObjectStatement(
                      objType, 
                      new ASTStringLiteral(objName)), 
                    ((Token)retval.start),
                    input.toString(retval.start,input.LT(-1)));
                }
                
                retval.n = seq.simplify();
              }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "legacyCreate"


    public static class legacyCreateAssign_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };


    // $ANTLR start "legacyCreateAssign"
    // TestSuite.g:945:1: legacyCreateAssign returns [ASTStatement n] : 'assign' varNames= identListMin1 COLON_EQUAL 'create' objType= simpleType ;
    public final TestSuiteParser.legacyCreateAssign_return legacyCreateAssign() throws RecognitionException {
        TestSuiteParser.legacyCreateAssign_return retval = new TestSuiteParser.legacyCreateAssign_return();
        retval.start = input.LT(1);


        List<String> varNames =null;

        ASTSimpleType objType =null;


        try {
            // TestSuite.g:946:3: ( 'assign' varNames= identListMin1 COLON_EQUAL 'create' objType= simpleType )
            // TestSuite.g:947:3: 'assign' varNames= identListMin1 COLON_EQUAL 'create' objType= simpleType
            {
            match(input,55,FOLLOW_55_in_legacyCreateAssign4081); if (state.failed) return retval;

            pushFollow(FOLLOW_identListMin1_in_legacyCreateAssign4089);
            varNames=identListMin1();

            state._fsp--;
            if (state.failed) return retval;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_legacyCreateAssign4093); if (state.failed) return retval;

            match(input,59,FOLLOW_59_in_legacyCreateAssign4097); if (state.failed) return retval;

            pushFollow(FOLLOW_simpleType_in_legacyCreateAssign4105);
            objType=simpleType();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {
                ASTSequenceStatement seq = new ASTSequenceStatement();
                
                for (String varName : varNames) {
                  seq.addStatement(
                    new ASTVariableAssignmentStatement(
                      varName, 
                      new ASTRValueNewObject(objType)),
                    ((Token)retval.start),
                    input.toString(retval.start,input.LT(-1)));
                }
                
                retval.n = seq.simplify();
              }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "legacyCreateAssign"


    public static class legacyCreateInsert_return extends ParserRuleReturnScope {
        public ASTVariableAssignmentStatement n;
    };


    // $ANTLR start "legacyCreateInsert"
    // TestSuite.g:981:1: legacyCreateInsert returns [ASTVariableAssignmentStatement n] : 'create' name= IDENT COLON asClassName= simpleType 'between' LPAREN participants= rValListMin2WithOptionalQualifiers RPAREN ;
    public final TestSuiteParser.legacyCreateInsert_return legacyCreateInsert() throws RecognitionException {
        TestSuiteParser.legacyCreateInsert_return retval = new TestSuiteParser.legacyCreateInsert_return();
        retval.start = input.LT(1);


        Token name=null;
        ASTSimpleType asClassName =null;

        TestSuiteParser.rValListMin2WithOptionalQualifiers_return participants =null;


        try {
            // TestSuite.g:982:3: ( 'create' name= IDENT COLON asClassName= simpleType 'between' LPAREN participants= rValListMin2WithOptionalQualifiers RPAREN )
            // TestSuite.g:983:3: 'create' name= IDENT COLON asClassName= simpleType 'between' LPAREN participants= rValListMin2WithOptionalQualifiers RPAREN
            {
            match(input,59,FOLLOW_59_in_legacyCreateInsert4139); if (state.failed) return retval;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_legacyCreateInsert4147); if (state.failed) return retval;

            match(input,COLON,FOLLOW_COLON_in_legacyCreateInsert4151); if (state.failed) return retval;

            pushFollow(FOLLOW_simpleType_in_legacyCreateInsert4159);
            asClassName=simpleType();

            state._fsp--;
            if (state.failed) return retval;

            match(input,58,FOLLOW_58_in_legacyCreateInsert4163); if (state.failed) return retval;

            match(input,LPAREN,FOLLOW_LPAREN_in_legacyCreateInsert4167); if (state.failed) return retval;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_legacyCreateInsert4177);
            participants=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return retval;

            match(input,RPAREN,FOLLOW_RPAREN_in_legacyCreateInsert4181); if (state.failed) return retval;

            if ( state.backtracking==0 ) {
                ASTNewLinkObjectStatement nlo = 
                  new ASTNewLinkObjectStatement(
                    asClassName, 
                    (participants!=null?participants.participans:null),
                    (participants!=null?participants.qualifiers:null),
                    new ASTStringLiteral(name));
                    
                nlo.setSourcePosition(((Token)retval.start));
              
                retval.n = new ASTVariableAssignmentStatement(
                  (name!=null?name.getText():null),
                  new ASTRValueNewLinkObject(nlo));
              }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "legacyCreateInsert"



    // $ANTLR start "legacyLet"
    // TestSuite.g:1019:1: legacyLet returns [ASTVariableAssignmentStatement n] : 'let' varName= IDENT ( COLON varType= type )? EQUAL e= inSoilExpression ;
    public final ASTVariableAssignmentStatement legacyLet() throws RecognitionException {
        ASTVariableAssignmentStatement n = null;


        Token varName=null;
        ASTType varType =null;

        ASTExpression e =null;


        try {
            // TestSuite.g:1020:3: ( 'let' varName= IDENT ( COLON varType= type )? EQUAL e= inSoilExpression )
            // TestSuite.g:1021:3: 'let' varName= IDENT ( COLON varType= type )? EQUAL e= inSoilExpression
            {
            match(input,82,FOLLOW_82_in_legacyLet4214); if (state.failed) return n;

            varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_legacyLet4222); if (state.failed) return n;

            // TestSuite.g:1023:3: ( COLON varType= type )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==COLON) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // TestSuite.g:1024:5: COLON varType= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_legacyLet4232); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_legacyLet4242);
                    varType=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            match(input,EQUAL,FOLLOW_EQUAL_in_legacyLet4251); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_legacyLet4259);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTVariableAssignmentStatement((varName!=null?varName.getText():null), e, varType); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "legacyLet"



    // $ANTLR start "legacyOpEnter"
    // TestSuite.g:1045:1: legacyOpEnter returns [ASTEnterOperationStatement n] : 'openter' obj= inSoilExpression op= IDENT LPAREN args= exprList RPAREN ;
    public final ASTEnterOperationStatement legacyOpEnter() throws RecognitionException {
        ASTEnterOperationStatement n = null;


        Token op=null;
        ASTExpression obj =null;

        List<ASTExpression> args =null;


        try {
            // TestSuite.g:1046:3: ( 'openter' obj= inSoilExpression op= IDENT LPAREN args= exprList RPAREN )
            // TestSuite.g:1047:3: 'openter' obj= inSoilExpression op= IDENT LPAREN args= exprList RPAREN
            {
            match(input,92,FOLLOW_92_in_legacyOpEnter4292); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_legacyOpEnter4300);
            obj=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_legacyOpEnter4308); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_legacyOpEnter4312); if (state.failed) return n;

            pushFollow(FOLLOW_exprList_in_legacyOpEnter4322);
            args=exprList();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_legacyOpEnter4326); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTEnterOperationStatement(obj, (op!=null?op.getText():null), args); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "legacyOpEnter"



    // $ANTLR start "legacyOpExit"
    // TestSuite.g:1070:1: legacyOpExit returns [ASTStatement n] : 'opexit' ( ( inSoilExpression )=>retVal= inSoilExpression | nothing ) ;
    public final ASTStatement legacyOpExit() throws RecognitionException {
        ASTStatement n = null;


        ASTExpression retVal =null;


        try {
            // TestSuite.g:1071:3: ( 'opexit' ( ( inSoilExpression )=>retVal= inSoilExpression | nothing ) )
            // TestSuite.g:1072:3: 'opexit' ( ( inSoilExpression )=>retVal= inSoilExpression | nothing )
            {
            match(input,93,FOLLOW_93_in_legacyOpExit4361); if (state.failed) return n;

            // TestSuite.g:1072:12: ( ( inSoilExpression )=>retVal= inSoilExpression | nothing )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==82) && (synpred6_TestSuite())) {
                alt61=1;
            }
            else if ( (LA61_0==MINUS||LA61_0==PLUS||LA61_0==85) && (synpred6_TestSuite())) {
                alt61=1;
            }
            else if ( (LA61_0==102) && (synpred6_TestSuite())) {
                alt61=1;
            }
            else if ( (LA61_0==70) && (synpred6_TestSuite())) {
                alt61=1;
            }
            else if ( (LA61_0==INT) && (synpred6_TestSuite())) {
                alt61=1;
            }
            else if ( (LA61_0==REAL) && (synpred6_TestSuite())) {
                alt61=1;
            }
            else if ( (LA61_0==STRING) && (synpred6_TestSuite())) {
                alt61=1;
            }
            else if ( (LA61_0==HASH) && (synpred6_TestSuite())) {
                alt61=1;
            }
            else if ( (LA61_0==IDENT) && (synpred6_TestSuite())) {
                alt61=1;
            }
            else if ( (LA61_0==45||(LA61_0 >= 47 && LA61_0 <= 49)) && (synpred6_TestSuite())) {
                alt61=1;
            }
            else if ( (LA61_0==88) && (synpred6_TestSuite())) {
                alt61=1;
            }
            else if ( (LA61_0==46) && (synpred6_TestSuite())) {
                alt61=1;
            }
            else if ( (LA61_0==91) && (synpred6_TestSuite())) {
                alt61=1;
            }
            else if ( (LA61_0==51) && (synpred6_TestSuite())) {
                alt61=1;
            }
            else if ( (LA61_0==86) && (synpred6_TestSuite())) {
                alt61=1;
            }
            else if ( (LA61_0==50) && (synpred6_TestSuite())) {
                alt61=1;
            }
            else if ( (LA61_0==AT) && (synpred6_TestSuite())) {
                alt61=1;
            }
            else if ( (LA61_0==81) && (synpred6_TestSuite())) {
                alt61=1;
            }
            else if ( (LA61_0==87||(LA61_0 >= 89 && LA61_0 <= 90)) && (synpred6_TestSuite())) {
                alt61=1;
            }
            else if ( (LA61_0==LPAREN) && (synpred6_TestSuite())) {
                alt61=1;
            }
            else if ( (LA61_0==73) && (synpred6_TestSuite())) {
                alt61=1;
            }
            else if ( (LA61_0==EOF||LA61_0==44||LA61_0==54||LA61_0==57||(LA61_0 >= 66 && LA61_0 <= 67)) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;

            }
            switch (alt61) {
                case 1 :
                    // TestSuite.g:1072:13: ( inSoilExpression )=>retVal= inSoilExpression
                    {
                    pushFollow(FOLLOW_inSoilExpression_in_legacyOpExit4373);
                    retVal=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 2 :
                    // TestSuite.g:1072:62: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_legacyOpExit4377);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { n = new ASTExitOperationStatement(retVal); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "legacyOpExit"



    // $ANTLR start "legacyExecute"
    // TestSuite.g:1087:1: legacyExecute returns [ASTStatement n] : 'execute' expression ;
    public final ASTStatement legacyExecute() throws RecognitionException {
        ASTStatement n = null;


        try {
            // TestSuite.g:1088:3: ( 'execute' expression )
            // TestSuite.g:1089:3: 'execute' expression
            {
            match(input,69,FOLLOW_69_in_legacyExecute4410); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_legacyExecute4414);
            expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { 
                reportWarning("the execute command is not supported in this version"); 
                n = new ASTEmptyStatement();
              }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "legacyExecute"



    // $ANTLR start "statOnly"
    // TestSuite.g:1133:1: statOnly returns [ASTStatement n] : s= stat EOF ;
    public final ASTStatement statOnly() throws RecognitionException {
        ASTStatement n = null;


        TestSuiteParser.stat_return s =null;


        try {
            // TestSuite.g:1134:3: (s= stat EOF )
            // TestSuite.g:1135:3: s= stat EOF
            {
            pushFollow(FOLLOW_stat_in_statOnly4460);
            s=stat();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_statOnly4464); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = (s!=null?s.n:null); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "statOnly"


    public static class stat_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };


    // $ANTLR start "stat"
    // TestSuite.g:1145:1: stat returns [ASTStatement n] : nextStat[seq] ( SEMI nextStat[seq] )* ;
    public final TestSuiteParser.stat_return stat() throws RecognitionException {
        TestSuiteParser.stat_return retval = new TestSuiteParser.stat_return();
        retval.start = input.LT(1);



          ASTSequenceStatement seq = new ASTSequenceStatement();

        try {
            // TestSuite.g:1149:3: ( nextStat[seq] ( SEMI nextStat[seq] )* )
            // TestSuite.g:1150:3: nextStat[seq] ( SEMI nextStat[seq] )*
            {
            pushFollow(FOLLOW_nextStat_in_stat4495);
            nextStat(seq);

            state._fsp--;
            if (state.failed) return retval;

            // TestSuite.g:1151:3: ( SEMI nextStat[seq] )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==SEMI) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // TestSuite.g:1152:5: SEMI nextStat[seq]
            	    {
            	    match(input,SEMI,FOLLOW_SEMI_in_stat4506); if (state.failed) return retval;

            	    pushFollow(FOLLOW_nextStat_in_stat4512);
            	    nextStat(seq);

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            if ( state.backtracking==0 ) { 
                retval.n = seq.simplify();
                if ((retval.n != null) && (!retval.n.isEmptyStatement())) {
                  retval.n.setSourcePosition(((Token)retval.start));
                }
              }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stat"


    public static class nextStat_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "nextStat"
    // TestSuite.g:1168:1: nextStat[ASTSequenceStatement seq] : s= singleStat ;
    public final TestSuiteParser.nextStat_return nextStat(ASTSequenceStatement seq) throws RecognitionException {
        TestSuiteParser.nextStat_return retval = new TestSuiteParser.nextStat_return();
        retval.start = input.LT(1);


        ASTStatement s =null;


        try {
            // TestSuite.g:1169:3: (s= singleStat )
            // TestSuite.g:1170:3: s= singleStat
            {
            pushFollow(FOLLOW_singleStat_in_nextStat4546);
            s=singleStat();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {
                if ((s != null) && (!s.isEmptyStatement())) {
                  seq.addStatement(s, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
                }
              }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nextStat"



    // $ANTLR start "singleStat"
    // TestSuite.g:1182:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat );
    public final ASTStatement singleStat() throws RecognitionException {
        ASTStatement n = null;


        ASTEmptyStatement emp =null;

        ASTStatement sse =null;

        ASTStatement vas =null;

        ASTStatement ocs =null;

        TestSuiteParser.objDestroyStat_return ods =null;

        ASTLinkInsertionStatement lis =null;

        ASTLinkDeletionStatement lds =null;

        ASTConditionalExecutionStatement ces =null;

        ASTIterationStatement its =null;

        ASTWhileStatement whs =null;

        ASTBlockStatement blk =null;


        try {
            // TestSuite.g:1186:5: (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat )
            int alt63=11;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==EOF||LA63_0==SEMI||LA63_0==44||LA63_0==54||LA63_0==57||(LA63_0 >= 65 && LA63_0 <= 67)) ) {
                alt63=1;
            }
            else if ( (LA63_0==82) && (synpred7_TestSuite())) {
                alt63=2;
            }
            else if ( (LA63_0==MINUS||LA63_0==PLUS||LA63_0==85) && (synpred7_TestSuite())) {
                alt63=2;
            }
            else if ( (LA63_0==102) && (synpred7_TestSuite())) {
                alt63=2;
            }
            else if ( (LA63_0==70) && (synpred7_TestSuite())) {
                alt63=2;
            }
            else if ( (LA63_0==INT) && (synpred7_TestSuite())) {
                alt63=2;
            }
            else if ( (LA63_0==REAL) && (synpred7_TestSuite())) {
                alt63=2;
            }
            else if ( (LA63_0==STRING) && (synpred7_TestSuite())) {
                alt63=2;
            }
            else if ( (LA63_0==HASH) && (synpred7_TestSuite())) {
                alt63=2;
            }
            else if ( (LA63_0==IDENT) ) {
                int LA63_17 = input.LA(2);

                if ( (synpred7_TestSuite()) ) {
                    alt63=2;
                }
                else if ( (true) ) {
                    alt63=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 17, input);

                    throw nvae;

                }
            }
            else if ( (LA63_0==45||(LA63_0 >= 47 && LA63_0 <= 49)) && (synpred7_TestSuite())) {
                alt63=2;
            }
            else if ( (LA63_0==88) && (synpred7_TestSuite())) {
                alt63=2;
            }
            else if ( (LA63_0==46) && (synpred7_TestSuite())) {
                alt63=2;
            }
            else if ( (LA63_0==91) && (synpred7_TestSuite())) {
                alt63=2;
            }
            else if ( (LA63_0==51) && (synpred7_TestSuite())) {
                alt63=2;
            }
            else if ( (LA63_0==86) && (synpred7_TestSuite())) {
                alt63=2;
            }
            else if ( (LA63_0==50) && (synpred7_TestSuite())) {
                alt63=2;
            }
            else if ( (LA63_0==AT) && (synpred7_TestSuite())) {
                alt63=2;
            }
            else if ( (LA63_0==81) && (synpred7_TestSuite())) {
                alt63=2;
            }
            else if ( (LA63_0==87||(LA63_0 >= 89 && LA63_0 <= 90)) && (synpred7_TestSuite())) {
                alt63=2;
            }
            else if ( (LA63_0==LPAREN) && (synpred7_TestSuite())) {
                alt63=2;
            }
            else if ( (LA63_0==73) ) {
                int LA63_29 = input.LA(2);

                if ( (synpred7_TestSuite()) ) {
                    alt63=2;
                }
                else if ( (true) ) {
                    alt63=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 29, input);

                    throw nvae;

                }
            }
            else if ( (LA63_0==84) ) {
                alt63=4;
            }
            else if ( (LA63_0==62) ) {
                alt63=5;
            }
            else if ( (LA63_0==76) ) {
                alt63=6;
            }
            else if ( (LA63_0==61) ) {
                alt63=7;
            }
            else if ( (LA63_0==71) ) {
                alt63=9;
            }
            else if ( (LA63_0==104) ) {
                alt63=10;
            }
            else if ( (LA63_0==56) ) {
                alt63=11;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;

            }
            switch (alt63) {
                case 1 :
                    // TestSuite.g:1187:5: emp= emptyStat
                    {
                    pushFollow(FOLLOW_emptyStat_in_singleStat4583);
                    emp=emptyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = emp; }

                    }
                    break;
                case 2 :
                    // TestSuite.g:1189:5: ( statStartingWithExpr )=>sse= statStartingWithExpr
                    {
                    pushFollow(FOLLOW_statStartingWithExpr_in_singleStat4609);
                    sse=statStartingWithExpr();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = sse; }

                    }
                    break;
                case 3 :
                    // TestSuite.g:1190:5: vas= varAssignStat
                    {
                    pushFollow(FOLLOW_varAssignStat_in_singleStat4621);
                    vas=varAssignStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = vas; }

                    }
                    break;
                case 4 :
                    // TestSuite.g:1191:5: ocs= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_singleStat4635);
                    ocs=objCreateStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = ocs; }

                    }
                    break;
                case 5 :
                    // TestSuite.g:1192:5: ods= objDestroyStat
                    {
                    pushFollow(FOLLOW_objDestroyStat_in_singleStat4649);
                    ods=objDestroyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ods!=null?ods.n:null); }

                    }
                    break;
                case 6 :
                    // TestSuite.g:1193:5: lis= lnkInsStat
                    {
                    pushFollow(FOLLOW_lnkInsStat_in_singleStat4662);
                    lis=lnkInsStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = lis; }

                    }
                    break;
                case 7 :
                    // TestSuite.g:1194:5: lds= lnkDelStat
                    {
                    pushFollow(FOLLOW_lnkDelStat_in_singleStat4679);
                    lds=lnkDelStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = lds; }

                    }
                    break;
                case 8 :
                    // TestSuite.g:1195:5: ces= condExStat
                    {
                    pushFollow(FOLLOW_condExStat_in_singleStat4696);
                    ces=condExStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = ces; }

                    }
                    break;
                case 9 :
                    // TestSuite.g:1196:5: its= iterStat
                    {
                    pushFollow(FOLLOW_iterStat_in_singleStat4713);
                    its=iterStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = its; }

                    }
                    break;
                case 10 :
                    // TestSuite.g:1198:5: whs= whileStat
                    {
                    pushFollow(FOLLOW_whileStat_in_singleStat4735);
                    whs=whileStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = whs; }

                    }
                    break;
                case 11 :
                    // TestSuite.g:1199:5: blk= blockStat
                    {
                    pushFollow(FOLLOW_blockStat_in_singleStat4753);
                    blk=blockStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = blk; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "singleStat"



    // $ANTLR start "emptyStat"
    // TestSuite.g:1206:1: emptyStat returns [ASTEmptyStatement n] : nothing ;
    public final ASTEmptyStatement emptyStat() throws RecognitionException {
        ASTEmptyStatement n = null;


        try {
            // TestSuite.g:1207:3: ( nothing )
            // TestSuite.g:1208:3: nothing
            {
            pushFollow(FOLLOW_nothing_in_emptyStat4780);
            nothing();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTEmptyStatement(); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "emptyStat"



    // $ANTLR start "statStartingWithExpr"
    // TestSuite.g:1213:1: statStartingWithExpr returns [ASTStatement n] : expr= inSoilExpression (aas= attAssignStat[$expr.n] )? ;
    public final ASTStatement statStartingWithExpr() throws RecognitionException {
        ASTStatement n = null;


        ASTExpression expr =null;

        ASTAttributeAssignmentStatement aas =null;


        try {
            // TestSuite.g:1214:3: (expr= inSoilExpression (aas= attAssignStat[$expr.n] )? )
            // TestSuite.g:1215:3: expr= inSoilExpression (aas= attAssignStat[$expr.n] )?
            {
            pushFollow(FOLLOW_inSoilExpression_in_statStartingWithExpr4806);
            expr=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            // TestSuite.g:1216:3: (aas= attAssignStat[$expr.n] )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==DOT) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // TestSuite.g:1217:5: aas= attAssignStat[$expr.n]
                    {
                    pushFollow(FOLLOW_attAssignStat_in_statStartingWithExpr4820);
                    aas=attAssignStat(expr);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = aas; }

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                if (aas == null) {
                  n = new ASTOperationCallStatement(expr); 
                }
              }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "statStartingWithExpr"



    // $ANTLR start "varAssignStat"
    // TestSuite.g:1229:1: varAssignStat returns [ASTStatement n] : varName= IDENT COLON_EQUAL rVal= rValue ;
    public final ASTStatement varAssignStat() throws RecognitionException {
        ASTStatement n = null;


        Token varName=null;
        TestSuiteParser.rValue_return rVal =null;


        try {
            // TestSuite.g:1230:3: (varName= IDENT COLON_EQUAL rVal= rValue )
            // TestSuite.g:1231:3: varName= IDENT COLON_EQUAL rVal= rValue
            {
            varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_varAssignStat4858); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_varAssignStat4862); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_varAssignStat4870);
            rVal=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {
                n = new ASTVariableAssignmentStatement((varName!=null?varName.getText():null), (rVal!=null?rVal.n:null));
              }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "varAssignStat"



    // $ANTLR start "attAssignStat"
    // TestSuite.g:1299:1: attAssignStat[ASTExpression exp] returns [ASTAttributeAssignmentStatement n] : DOT attName= IDENT COLON_EQUAL r= rValue ;
    public final ASTAttributeAssignmentStatement attAssignStat(ASTExpression exp) throws RecognitionException {
        ASTAttributeAssignmentStatement n = null;


        Token attName=null;
        TestSuiteParser.rValue_return r =null;


        try {
            // TestSuite.g:1300:3: ( DOT attName= IDENT COLON_EQUAL r= rValue )
            // TestSuite.g:1301:3: DOT attName= IDENT COLON_EQUAL r= rValue
            {
            match(input,DOT,FOLLOW_DOT_in_attAssignStat4901); if (state.failed) return n;

            attName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attAssignStat4910); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attAssignStat4914); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_attAssignStat4922);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAttributeAssignmentStatement(exp, (attName!=null?attName.getText():null), (r!=null?r.n:null)); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "attAssignStat"



    // $ANTLR start "objCreateStat"
    // TestSuite.g:1313:1: objCreateStat returns [ASTStatement n] : 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? ;
    public final ASTStatement objCreateStat() throws RecognitionException {
        ASTStatement n = null;


        ASTSimpleType ident =null;

        ASTExpression objName =null;

        TestSuiteParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // TestSuite.g:1314:3: ( 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? )
            // TestSuite.g:1315:3: 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            {
            match(input,84,FOLLOW_84_in_objCreateStat4948); if (state.failed) return n;

            pushFollow(FOLLOW_simpleType_in_objCreateStat4956);
            ident=simpleType();

            state._fsp--;
            if (state.failed) return n;

            // TestSuite.g:1317:3: ( LPAREN objName= inSoilExpression RPAREN )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==LPAREN) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // TestSuite.g:1318:5: LPAREN objName= inSoilExpression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat4966); if (state.failed) return n;

                    pushFollow(FOLLOW_inSoilExpression_in_objCreateStat4978);
                    objName=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat4984); if (state.failed) return n;

                    }
                    break;

            }


            // TestSuite.g:1323:3: ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==58) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // TestSuite.g:1324:5: 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN
                    {
                    match(input,58,FOLLOW_58_in_objCreateStat5002); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat5010); if (state.failed) return n;

                    pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat5024);
                    p=rValListMin2WithOptionalQualifiers();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat5032); if (state.failed) return n;

                    if ( state.backtracking==0 ) { 
                        n = new ASTNewLinkObjectStatement(ident, (p!=null?p.participans:null), (p!=null?p.qualifiers:null), objName);
                        }

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                if (n == null) {
                  n = new ASTNewObjectStatement(ident, objName);
                }
              }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "objCreateStat"


    public static class objDestroyStat_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };


    // $ANTLR start "objDestroyStat"
    // TestSuite.g:1343:1: objDestroyStat returns [ASTStatement n] : 'destroy' el= exprListMin1 ;
    public final TestSuiteParser.objDestroyStat_return objDestroyStat() throws RecognitionException {
        TestSuiteParser.objDestroyStat_return retval = new TestSuiteParser.objDestroyStat_return();
        retval.start = input.LT(1);


        List<ASTExpression> el =null;


        try {
            // TestSuite.g:1344:3: ( 'destroy' el= exprListMin1 )
            // TestSuite.g:1345:3: 'destroy' el= exprListMin1
            {
            match(input,62,FOLLOW_62_in_objDestroyStat5068); if (state.failed) return retval;

            pushFollow(FOLLOW_exprListMin1_in_objDestroyStat5076);
            el=exprListMin1();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {
                ASTSequenceStatement seq = new ASTSequenceStatement();
                
                for (ASTExpression expression : el) {
                  seq.addStatement(
                    new ASTObjectDestructionStatement(expression),
                    ((Token)retval.start),
                    input.toString(retval.start,input.LT(-1)));
                }
                
                retval.n = seq.simplify();
              }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "objDestroyStat"



    // $ANTLR start "lnkInsStat"
    // TestSuite.g:1366:1: lnkInsStat returns [ASTLinkInsertionStatement n] : 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT ;
    public final ASTLinkInsertionStatement lnkInsStat() throws RecognitionException {
        ASTLinkInsertionStatement n = null;


        Token ass=null;
        TestSuiteParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // TestSuite.g:1367:3: ( 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT )
            // TestSuite.g:1368:3: 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT
            {
            match(input,76,FOLLOW_76_in_lnkInsStat5102); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkInsStat5106); if (state.failed) return n;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat5116);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkInsStat5120); if (state.failed) return n;

            match(input,77,FOLLOW_77_in_lnkInsStat5124); if (state.failed) return n;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkInsStat5132); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTLinkInsertionStatement((ass!=null?ass.getText():null), (p!=null?p.participans:null), (p!=null?p.qualifiers:null)); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "lnkInsStat"


    public static class rValListMin2WithOptionalQualifiers_return extends ParserRuleReturnScope {
        public List<ASTRValue> participans;
        public List<List<ASTRValue>> qualifiers;
    };


    // $ANTLR start "rValListMin2WithOptionalQualifiers"
    // TestSuite.g:1378:1: rValListMin2WithOptionalQualifiers returns [List<ASTRValue> participans, List<List<ASTRValue>> qualifiers] : r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* ;
    public final TestSuiteParser.rValListMin2WithOptionalQualifiers_return rValListMin2WithOptionalQualifiers() throws RecognitionException {
        TestSuiteParser.rValListMin2WithOptionalQualifiers_return retval = new TestSuiteParser.rValListMin2WithOptionalQualifiers_return();
        retval.start = input.LT(1);


        TestSuiteParser.rValue_return r =null;

        List<ASTRValue> qualifierValues =null;



          retval.participans = new ArrayList<ASTRValue>();
          retval.qualifiers = new ArrayList<List<ASTRValue>>();
          List<ASTRValue> currentQualifiers = Collections.emptyList();

        try {
            // TestSuite.g:1384:3: (r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* )
            // TestSuite.g:1385:3: r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers5161);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add((r!=null?r.n:null)); }

            // TestSuite.g:1386:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==LBRACE) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // TestSuite.g:1387:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers5172); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers5181);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers5188); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers5204); if (state.failed) return retval;

            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers5215);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add((r!=null?r.n:null)); }

            // TestSuite.g:1399:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==LBRACE) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // TestSuite.g:1400:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers5226); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers5235);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers5242); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            // TestSuite.g:1409:3: ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==COMMA) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // TestSuite.g:1410:5: COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers5264); if (state.failed) return retval;

            	    pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers5279);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) { retval.participans.add((r!=null?r.n:null)); }

            	    // TestSuite.g:1414:5: ( LBRACE qualifierValues= rValList RBRACE )?
            	    int alt69=2;
            	    int LA69_0 = input.LA(1);

            	    if ( (LA69_0==LBRACE) ) {
            	        alt69=1;
            	    }
            	    switch (alt69) {
            	        case 1 :
            	            // TestSuite.g:1415:6: LBRACE qualifierValues= rValList RBRACE
            	            {
            	            match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers5299); if (state.failed) return retval;

            	            pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers5310);
            	            qualifierValues=rValList();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

            	            match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers5319); if (state.failed) return retval;

            	            }
            	            break;

            	    }


            	    if ( state.backtracking==0 ) {
            	          retval.qualifiers.add(currentQualifiers);
            	          currentQualifiers = Collections.emptyList();
            	        }

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rValListMin2WithOptionalQualifiers"



    // $ANTLR start "lnkDelStat"
    // TestSuite.g:1430:1: lnkDelStat returns [ASTLinkDeletionStatement n] : 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT ;
    public final ASTLinkDeletionStatement lnkDelStat() throws RecognitionException {
        ASTLinkDeletionStatement n = null;


        Token ass=null;
        TestSuiteParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // TestSuite.g:1431:3: ( 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT )
            // TestSuite.g:1432:3: 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT
            {
            match(input,61,FOLLOW_61_in_lnkDelStat5360); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkDelStat5364); if (state.failed) return n;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat5374);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkDelStat5378); if (state.failed) return n;

            match(input,72,FOLLOW_72_in_lnkDelStat5382); if (state.failed) return n;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkDelStat5391); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTLinkDeletionStatement((ass!=null?ass.getText():null), (p!=null?p.participans:null), (p!=null?p.qualifiers:null)); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "lnkDelStat"



    // $ANTLR start "condExStat"
    // TestSuite.g:1446:1: condExStat returns [ASTConditionalExecutionStatement n] : 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' ;
    public final ASTConditionalExecutionStatement condExStat() throws RecognitionException {
        ASTConditionalExecutionStatement n = null;


        ASTExpression con =null;

        ASTStatement ts =null;

        ASTStatement es =null;



          ASTStatement elseStat = new ASTEmptyStatement();

        try {
            // TestSuite.g:1450:3: ( 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' )
            // TestSuite.g:1451:3: 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end'
            {
            match(input,73,FOLLOW_73_in_condExStat5422); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_condExStat5431);
            con=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            match(input,101,FOLLOW_101_in_condExStat5435); if (state.failed) return n;

            pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat5444);
            ts=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return n;

            // TestSuite.g:1455:3: ( 'else' es= statOrImplicitBlock )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==65) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // TestSuite.g:1456:5: 'else' es= statOrImplicitBlock
                    {
                    match(input,65,FOLLOW_65_in_condExStat5455); if (state.failed) return n;

                    pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat5467);
                    es=statOrImplicitBlock();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { elseStat = es; }

                    }
                    break;

            }


            match(input,66,FOLLOW_66_in_condExStat5479); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTConditionalExecutionStatement(con, ts, elseStat); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "condExStat"



    // $ANTLR start "iterStat"
    // TestSuite.g:1467:1: iterStat returns [ASTIterationStatement n] : 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final ASTIterationStatement iterStat() throws RecognitionException {
        ASTIterationStatement n = null;


        Token var=null;
        ASTExpression set =null;

        ASTStatement s =null;


        try {
            // TestSuite.g:1468:3: ( 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // TestSuite.g:1469:3: 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,71,FOLLOW_71_in_iterStat5504); if (state.failed) return n;

            var=(Token)match(input,IDENT,FOLLOW_IDENT_in_iterStat5512); if (state.failed) return n;

            match(input,75,FOLLOW_75_in_iterStat5516); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_iterStat5524);
            set=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            match(input,64,FOLLOW_64_in_iterStat5528); if (state.failed) return n;

            pushFollow(FOLLOW_statOrImplicitBlock_in_iterStat5536);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return n;

            match(input,66,FOLLOW_66_in_iterStat5541); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTIterationStatement((var!=null?var.getText():null), set, s); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "iterStat"



    // $ANTLR start "whileStat"
    // TestSuite.g:1484:1: whileStat returns [ASTWhileStatement n] : 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final ASTWhileStatement whileStat() throws RecognitionException {
        ASTWhileStatement n = null;


        ASTExpression cond =null;

        ASTStatement s =null;


        try {
            // TestSuite.g:1485:3: ( 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // TestSuite.g:1486:3: 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,104,FOLLOW_104_in_whileStat5567); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_whileStat5575);
            cond=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            match(input,64,FOLLOW_64_in_whileStat5579); if (state.failed) return n;

            pushFollow(FOLLOW_statOrImplicitBlock_in_whileStat5587);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return n;

            match(input,66,FOLLOW_66_in_whileStat5592); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTWhileStatement(cond, s); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "whileStat"



    // $ANTLR start "blockStat"
    // TestSuite.g:1498:1: blockStat returns [ASTBlockStatement n] : 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' ;
    public final ASTBlockStatement blockStat() throws RecognitionException {
        ASTBlockStatement n = null;


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        TestSuiteParser.stat_return s =null;



          n = new ASTBlockStatement(org.tzi.use.config.Options.explicitVariableDeclarations);

        try {
            // TestSuite.g:1502:2: ( 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' )
            // TestSuite.g:1503:2: 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end'
            {
            match(input,56,FOLLOW_56_in_blockStat5622); if (state.failed) return n;

            // TestSuite.g:1504:2: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==60) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // TestSuite.g:1504:4: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI
                    {
                    match(input,60,FOLLOW_60_in_blockStat5627); if (state.failed) return n;

                    pushFollow(FOLLOW_variableDeclaration_in_blockStat5633);
                    vd=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addVariableDeclaration(vd);}

                    // TestSuite.g:1504:72: ( COMMA vd1= variableDeclaration )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==COMMA) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // TestSuite.g:1504:74: COMMA vd1= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_blockStat5639); if (state.failed) return n;

                    	    pushFollow(FOLLOW_variableDeclaration_in_blockStat5645);
                    	    vd1=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addVariableDeclaration(vd1);}

                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);


                    match(input,SEMI,FOLLOW_SEMI_in_blockStat5652); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_stat_in_blockStat5662);
            s=stat();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setBody((s!=null?s.n:null)); }

            match(input,66,FOLLOW_66_in_blockStat5667); if (state.failed) return n;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "blockStat"



    // $ANTLR start "implicitBlockStat"
    // TestSuite.g:1513:1: implicitBlockStat returns [ASTBlockStatement n] : 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat ;
    public final ASTBlockStatement implicitBlockStat() throws RecognitionException {
        ASTBlockStatement n = null;


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        TestSuiteParser.stat_return s =null;



          n = new ASTBlockStatement(false);

        try {
            // TestSuite.g:1517:3: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat )
            // TestSuite.g:1518:3: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat
            {
            match(input,60,FOLLOW_60_in_implicitBlockStat5693); if (state.failed) return n;

            pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat5699);
            vd=variableDeclaration();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.addVariableDeclaration(vd);}

            // TestSuite.g:1518:71: ( COMMA vd1= variableDeclaration )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==COMMA) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // TestSuite.g:1518:73: COMMA vd1= variableDeclaration
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_implicitBlockStat5705); if (state.failed) return n;

            	    pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat5711);
            	    vd1=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addVariableDeclaration(vd1);}

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            match(input,SEMI,FOLLOW_SEMI_in_implicitBlockStat5718); if (state.failed) return n;

            pushFollow(FOLLOW_stat_in_implicitBlockStat5726);
            s=stat();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setBody((s!=null?s.n:null)); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "implicitBlockStat"



    // $ANTLR start "statOrImplicitBlock"
    // TestSuite.g:1522:1: statOrImplicitBlock returns [ASTStatement n] : (s1= stat |s2= implicitBlockStat ) ;
    public final ASTStatement statOrImplicitBlock() throws RecognitionException {
        ASTStatement n = null;


        TestSuiteParser.stat_return s1 =null;

        ASTBlockStatement s2 =null;


        try {
            // TestSuite.g:1523:3: ( (s1= stat |s2= implicitBlockStat ) )
            // TestSuite.g:1524:3: (s1= stat |s2= implicitBlockStat )
            {
            // TestSuite.g:1524:3: (s1= stat |s2= implicitBlockStat )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==AT||LA75_0==HASH||(LA75_0 >= IDENT && LA75_0 <= INT)||(LA75_0 >= LPAREN && LA75_0 <= MINUS)||LA75_0==PLUS||LA75_0==REAL||LA75_0==SEMI||LA75_0==STRING||(LA75_0 >= 45 && LA75_0 <= 51)||LA75_0==56||(LA75_0 >= 61 && LA75_0 <= 62)||(LA75_0 >= 65 && LA75_0 <= 66)||(LA75_0 >= 70 && LA75_0 <= 71)||LA75_0==73||LA75_0==76||(LA75_0 >= 81 && LA75_0 <= 82)||(LA75_0 >= 84 && LA75_0 <= 91)||LA75_0==102||LA75_0==104) ) {
                alt75=1;
            }
            else if ( (LA75_0==60) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;

            }
            switch (alt75) {
                case 1 :
                    // TestSuite.g:1524:4: s1= stat
                    {
                    pushFollow(FOLLOW_stat_in_statOrImplicitBlock5749);
                    s1=stat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (s1!=null?s1.n:null); }

                    }
                    break;
                case 2 :
                    // TestSuite.g:1524:31: s2= implicitBlockStat
                    {
                    pushFollow(FOLLOW_implicitBlockStat_in_statOrImplicitBlock5759);
                    s2=implicitBlockStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = s2; }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "statOrImplicitBlock"



    // $ANTLR start "nothing"
    // TestSuite.g:1538:1: nothing :;
    public final void nothing() throws RecognitionException {
        try {
            // TestSuite.g:1539:1: ()
            // TestSuite.g:1540:1: 
            {
            }

        }
        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "nothing"


    public static class rValue_return extends ParserRuleReturnScope {
        public ASTRValue n;
    };


    // $ANTLR start "rValue"
    // TestSuite.g:1546:1: rValue returns [ASTRValue n] : (e= inSoilExpression |oc= objCreateStat );
    public final TestSuiteParser.rValue_return rValue() throws RecognitionException {
        TestSuiteParser.rValue_return retval = new TestSuiteParser.rValue_return();
        retval.start = input.LT(1);


        ASTExpression e =null;

        ASTStatement oc =null;


        try {
            // TestSuite.g:1547:5: (e= inSoilExpression |oc= objCreateStat )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==AT||LA76_0==HASH||(LA76_0 >= IDENT && LA76_0 <= INT)||(LA76_0 >= LPAREN && LA76_0 <= MINUS)||LA76_0==PLUS||LA76_0==REAL||LA76_0==STRING||(LA76_0 >= 45 && LA76_0 <= 51)||LA76_0==70||LA76_0==73||(LA76_0 >= 81 && LA76_0 <= 82)||(LA76_0 >= 85 && LA76_0 <= 91)||LA76_0==102) ) {
                alt76=1;
            }
            else if ( (LA76_0==84) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;

            }
            switch (alt76) {
                case 1 :
                    // TestSuite.g:1548:5: e= inSoilExpression
                    {
                    pushFollow(FOLLOW_inSoilExpression_in_rValue5805);
                    e=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n = new ASTRValueExpressionOrOpCall(e); }

                    }
                    break;
                case 2 :
                    // TestSuite.g:1549:5: oc= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_rValue5817);
                    oc=objCreateStat();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { 
                        oc.setSourcePosition(((Token)retval.start));
                        if (oc instanceof ASTNewLinkObjectStatement)
                        	retval.n = new ASTRValueNewLinkObject((ASTNewLinkObjectStatement)oc);
                        else
                        	retval.n = new ASTRValueNewObject((ASTNewObjectStatement)oc);
                      }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rValue"



    // $ANTLR start "rValList"
    // TestSuite.g:1563:1: rValList returns [List<ASTRValue> n] : ( nothing |rl= rValListMin1 );
    public final List<ASTRValue> rValList() throws RecognitionException {
        List<ASTRValue> n = null;


        List<ASTRValue> rl =null;


        try {
            // TestSuite.g:1564:3: ( nothing |rl= rValListMin1 )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RBRACE) ) {
                alt77=1;
            }
            else if ( (LA77_0==AT||LA77_0==HASH||(LA77_0 >= IDENT && LA77_0 <= INT)||(LA77_0 >= LPAREN && LA77_0 <= MINUS)||LA77_0==PLUS||LA77_0==REAL||LA77_0==STRING||(LA77_0 >= 45 && LA77_0 <= 51)||LA77_0==70||LA77_0==73||(LA77_0 >= 81 && LA77_0 <= 82)||(LA77_0 >= 84 && LA77_0 <= 91)||LA77_0==102) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;

            }
            switch (alt77) {
                case 1 :
                    // TestSuite.g:1565:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_rValList5840);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = Collections.<ASTRValue>emptyList(); }

                    }
                    break;
                case 2 :
                    // TestSuite.g:1568:3: rl= rValListMin1
                    {
                    pushFollow(FOLLOW_rValListMin1_in_rValList5867);
                    rl=rValListMin1();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = rl; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "rValList"



    // $ANTLR start "rValListMin1"
    // TestSuite.g:1576:1: rValListMin1 returns [List<ASTRValue> n] : r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin1() throws RecognitionException {
        List<ASTRValue> n = null;


        TestSuiteParser.rValue_return r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // TestSuite.g:1580:3: (r= rValue ( COMMA r= rValue )* )
            // TestSuite.g:1581:3: r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin15900);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            // TestSuite.g:1583:3: ( COMMA r= rValue )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==COMMA) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // TestSuite.g:1584:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin15914); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin15924);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "rValListMin1"



    // $ANTLR start "rValListMin2"
    // TestSuite.g:1594:1: rValListMin2 returns [List<ASTRValue> n] : r= rValue COMMA r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin2() throws RecognitionException {
        List<ASTRValue> n = null;


        TestSuiteParser.rValue_return r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // TestSuite.g:1598:3: (r= rValue COMMA r= rValue ( COMMA r= rValue )* )
            // TestSuite.g:1599:3: r= rValue COMMA r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin25963);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin25971); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_rValListMin25979);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            // TestSuite.g:1604:3: ( COMMA r= rValue )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==COMMA) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // TestSuite.g:1605:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin25993); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin26003);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "rValListMin2"



    // $ANTLR start "inSoilExpression"
    // TestSuite.g:1615:1: inSoilExpression returns [ASTExpression n] : e= expression ;
    public final ASTExpression inSoilExpression() throws RecognitionException {
        ASTExpression n = null;


        TestSuiteParser.expression_return e =null;


        try {
            // TestSuite.g:1616:3: (e= expression )
            // TestSuite.g:1617:3: e= expression
            {
            pushFollow(FOLLOW_expression_in_inSoilExpression6037);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if ((e!=null?e.n:null) != null) (e!=null?e.n:null).setStringRep((e!=null?input.toString(e.start,e.stop):null)); }

            if ( state.backtracking==0 ) { n = (e!=null?e.n:null); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "inSoilExpression"



    // $ANTLR start "exprList"
    // TestSuite.g:1626:1: exprList returns [List<ASTExpression> n] : ( nothing |el= exprListMin1 );
    public final List<ASTExpression> exprList() throws RecognitionException {
        List<ASTExpression> n = null;


        List<ASTExpression> el =null;


        try {
            // TestSuite.g:1627:3: ( nothing |el= exprListMin1 )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RPAREN) ) {
                alt80=1;
            }
            else if ( (LA80_0==AT||LA80_0==HASH||(LA80_0 >= IDENT && LA80_0 <= INT)||(LA80_0 >= LPAREN && LA80_0 <= MINUS)||LA80_0==PLUS||LA80_0==REAL||LA80_0==STRING||(LA80_0 >= 45 && LA80_0 <= 51)||LA80_0==70||LA80_0==73||(LA80_0 >= 81 && LA80_0 <= 82)||(LA80_0 >= 85 && LA80_0 <= 91)||LA80_0==102) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;

            }
            switch (alt80) {
                case 1 :
                    // TestSuite.g:1628:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_exprList6066);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<ASTExpression>(); }

                    }
                    break;
                case 2 :
                    // TestSuite.g:1631:3: el= exprListMin1
                    {
                    pushFollow(FOLLOW_exprListMin1_in_exprList6084);
                    el=exprListMin1();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = el; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "exprList"



    // $ANTLR start "exprListMin1"
    // TestSuite.g:1639:1: exprListMin1 returns [List<ASTExpression> n] : e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin1() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // TestSuite.g:1643:3: (e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // TestSuite.g:1644:3: e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin16117);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // TestSuite.g:1646:3: ( COMMA e= inSoilExpression )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==COMMA) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // TestSuite.g:1647:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin16132); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin16142);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "exprListMin1"



    // $ANTLR start "exprListMin2"
    // TestSuite.g:1657:1: exprListMin2 returns [List<ASTExpression> n] : e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin2() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // TestSuite.g:1661:3: (e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // TestSuite.g:1662:3: e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin26182);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            match(input,COMMA,FOLLOW_COMMA_in_exprListMin26190); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_exprListMin26198);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // TestSuite.g:1667:3: ( COMMA e= inSoilExpression )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==COMMA) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // TestSuite.g:1668:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin26212); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin26222);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "exprListMin2"



    // $ANTLR start "identList"
    // TestSuite.g:1678:1: identList returns [List<String> n] : ( nothing |il= identListMin1 );
    public final List<String> identList() throws RecognitionException {
        List<String> n = null;


        List<String> il =null;


        try {
            // TestSuite.g:1679:3: ( nothing |il= identListMin1 )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==EOF||LA83_0==RBRACE||(LA83_0 >= RPAREN && LA83_0 <= SEMI)||LA83_0==44||LA83_0==54||LA83_0==57||(LA83_0 >= 65 && LA83_0 <= 67)) ) {
                alt83=1;
            }
            else if ( (LA83_0==IDENT) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;

            }
            switch (alt83) {
                case 1 :
                    // TestSuite.g:1680:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_identList6252);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<String>(); }

                    }
                    break;
                case 2 :
                    // TestSuite.g:1683:3: il= identListMin1
                    {
                    pushFollow(FOLLOW_identListMin1_in_identList6269);
                    il=identListMin1();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = il; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "identList"



    // $ANTLR start "identListMin1"
    // TestSuite.g:1691:1: identListMin1 returns [List<String> n] : id= IDENT ( COMMA id= IDENT )* ;
    public final List<String> identListMin1() throws RecognitionException {
        List<String> n = null;


        Token id=null;


          n = new ArrayList<String>();

        try {
            // TestSuite.g:1695:3: (id= IDENT ( COMMA id= IDENT )* )
            // TestSuite.g:1696:3: id= IDENT ( COMMA id= IDENT )*
            {
            id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin16303); if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((id!=null?id.getText():null)); }

            // TestSuite.g:1698:3: ( COMMA id= IDENT )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==COMMA) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // TestSuite.g:1699:5: COMMA id= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_identListMin16317); if (state.failed) return n;

            	    id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin16327); if (state.failed) return n;

            	    if ( state.backtracking==0 ) {
            	        n.add((id!=null?id.getText():null)); }

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "identListMin1"

    // $ANTLR start synpred1_TestSuite
    public final void synpred1_TestSuite_fragment() throws RecognitionException {
        // TestSuite.g:722:7: ( COLON type EQUAL )
        // TestSuite.g:722:8: COLON type EQUAL
        {
        match(input,COLON,FOLLOW_COLON_in_synpred1_TestSuite3196); if (state.failed) return ;

        pushFollow(FOLLOW_type_in_synpred1_TestSuite3198);
        type();

        state._fsp--;
        if (state.failed) return ;

        match(input,EQUAL,FOLLOW_EQUAL_in_synpred1_TestSuite3200); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_TestSuite

    // $ANTLR start synpred2_TestSuite
    public final void synpred2_TestSuite_fragment() throws RecognitionException {
        // TestSuite.g:808:3: ( stat )
        // TestSuite.g:808:4: stat
        {
        pushFollow(FOLLOW_stat_in_synpred2_TestSuite3609);
        stat();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_TestSuite

    // $ANTLR start synpred3_TestSuite
    public final void synpred3_TestSuite_fragment() throws RecognitionException {
        // TestSuite.g:811:3: ( legacyStat )
        // TestSuite.g:811:4: legacyStat
        {
        pushFollow(FOLLOW_legacyStat_in_synpred3_TestSuite3630);
        legacyStat();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_TestSuite

    // $ANTLR start synpred4_TestSuite
    public final void synpred4_TestSuite_fragment() throws RecognitionException {
        // TestSuite.g:821:3: ( legacyStat )
        // TestSuite.g:821:4: legacyStat
        {
        pushFollow(FOLLOW_legacyStat_in_synpred4_TestSuite3662);
        legacyStat();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_TestSuite

    // $ANTLR start synpred5_TestSuite
    public final void synpred5_TestSuite_fragment() throws RecognitionException {
        // TestSuite.g:824:3: ( stat )
        // TestSuite.g:824:4: stat
        {
        pushFollow(FOLLOW_stat_in_synpred5_TestSuite3685);
        stat();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_TestSuite

    // $ANTLR start synpred6_TestSuite
    public final void synpred6_TestSuite_fragment() throws RecognitionException {
        // TestSuite.g:1072:13: ( inSoilExpression )
        // TestSuite.g:1072:14: inSoilExpression
        {
        pushFollow(FOLLOW_inSoilExpression_in_synpred6_TestSuite4365);
        inSoilExpression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_TestSuite

    // $ANTLR start synpred7_TestSuite
    public final void synpred7_TestSuite_fragment() throws RecognitionException {
        // TestSuite.g:1189:5: ( statStartingWithExpr )
        // TestSuite.g:1189:6: statStartingWithExpr
        {
        pushFollow(FOLLOW_statStartingWithExpr_in_synpred7_TestSuite4601);
        statStartingWithExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_TestSuite

    // Delegated rules

    public final boolean synpred2_TestSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_TestSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_TestSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_TestSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_TestSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_TestSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_TestSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_TestSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_TestSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_TestSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_TestSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_TestSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_TestSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_TestSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_100_in_testSuite61 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_testSuite71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_testSuite82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_testSuite84 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_filename_in_testSuite93 = new BitSet(new long[]{0x0000000000000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_98_in_testSuite105 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_44_in_testSuite112 = new BitSet(new long[]{0x698FE208861A0020L,0x000001423FF612E0L});
    public static final BitSet FOLLOW_shellCommandOnly_in_testSuite118 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_testSuite124 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_testCases_in_testSuite145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_testSuite154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_filename172 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_filename174 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_filename178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testCase_in_testCases205 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_testCase224 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_testCase228 = new BitSet(new long[]{0x0240100000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_44_in_testCase242 = new BitSet(new long[]{0x698FE208861A0020L,0x000001423FF612E0L});
    public static final BitSet FOLLOW_shellCommandOnly_in_testCase248 = new BitSet(new long[]{0x0240100000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_assertStatement_in_testCase267 = new BitSet(new long[]{0x0240100000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_57_in_testCase285 = new BitSet(new long[]{0x0240100000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_67_in_testCase303 = new BitSet(new long[]{0x0240100000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_66_in_testCase315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_assertStatement336 = new BitSet(new long[]{0x0000000000000000L,0x0000008000008000L});
    public static final BitSet FOLLOW_103_in_assertStatement341 = new BitSet(new long[]{0x000FE208861A0020L,0x000000418FE74240L});
    public static final BitSet FOLLOW_79_in_assertStatement347 = new BitSet(new long[]{0x000FE208861A0020L,0x000000418FE74240L});
    public static final BitSet FOLLOW_expression_in_assertStatement366 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_80_in_assertStatement382 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_80_in_assertStatement398 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_assertStatement402 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_78_in_assertStatement418 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_assertStatement422 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_assertStatement424 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_assertStatement428 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_assertionStatementPre_in_assertStatement448 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_assertionStatementPost_in_assertStatement469 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_assertStatement486 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_STRING_in_assertStatement490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_assertionStatementPre513 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_assertionStatementPre517 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_assertionStatementPre521 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_assertionStatementPre527 = new BitSet(new long[]{0x000FE218861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_assertionStatementPre538 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_assertionStatementPre544 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_assertionStatementPre548 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_assertionStatementPre561 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COLON_COLON_in_assertionStatementPre564 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_assertionStatementPre568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_assertionStatementPost593 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_IDENT_in_assertionStatementPost602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionOnly637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expressionOnly639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_expression687 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression691 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression695 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_expression699 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression704 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_expression708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_expression710 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_paramList768 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList785 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_paramList797 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList801 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_paramList821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList850 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_idList860 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_idList864 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaration895 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration897 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression937 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_conditionalImpliesExpression950 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE20240L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression954 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression999 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_conditionalOrExpression1012 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE20240L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1016 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1060 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_conditionalXOrExpression1073 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE20240L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1077 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression1121 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_conditionalAndExpression1134 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE20240L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression1138 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1186 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_set_in_equalityExpression1205 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE20240L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1215 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1264 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_set_in_relationalExpression1282 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE20240L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1300 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1350 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression1368 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE20240L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1378 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1428 = new BitSet(new long[]{0x8000014000000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1446 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE20240L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1460 = new BitSet(new long[]{0x8000014000000002L});
    public static final BitSet FOLLOW_set_in_unaryExpression1522 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE20240L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression1599 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_ARROW_in_postfixExpression1617 = new BitSet(new long[]{0x0000000000080000L,0x0000000006820000L});
    public static final BitSet FOLLOW_DOT_in_postfixExpression1623 = new BitSet(new long[]{0x0000000000080000L,0x0000000006820000L});
    public static final BitSet FOLLOW_propertyCall_in_postfixExpression1634 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_literal_in_primaryExpression1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectReference_in_primaryExpression1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_primaryExpression1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression1711 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_primaryExpression1715 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_primaryExpression1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression1741 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression1743 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_primaryExpression1745 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression1749 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression1751 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression1772 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_primaryExpression1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_objectReference1801 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_objectReference1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpression_in_propertyCall1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpression_in_propertyCall1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationExpression_in_propertyCall1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeExpression_in_propertyCall1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpression1948 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_queryExpression1955 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression1966 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_queryExpression1970 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_queryExpression1981 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_queryExpression1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_iterateExpression2019 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpression2025 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression2033 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_iterateExpression2035 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableInitialization_in_iterateExpression2043 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_iterateExpression2045 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_iterateExpression2053 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpression2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_operationExpression2103 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression2125 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_operationExpression2138 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2151 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_operationExpression2155 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression2167 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression2184 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_operationExpression2199 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2214 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_operationExpression2218 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression2232 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_operationExpression2257 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_operationExpression2259 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_operationExpression2284 = new BitSet(new long[]{0x000FE218861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_operationExpression2305 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2317 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_operationExpression2321 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_operationExpression2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeExpression2390 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeExpression2406 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_typeExpression2410 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeExpression2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration2450 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration2453 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration2457 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration2467 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration2473 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration2476 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration2482 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableInitialization2510 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableInitialization2512 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_variableInitialization2516 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_variableInitialization2518 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_variableInitialization2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ifExpression2554 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_ifExpression2558 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_ifExpression2560 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_ifExpression2564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ifExpression2566 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_ifExpression2570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ifExpression2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_literal2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_literal2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_literal2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal2677 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_literal2693 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_literal2695 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteral_in_literal2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefinedLiteral_in_literal2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleLiteral_in_literal2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionLiteral2785 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_collectionLiteral2814 = new BitSet(new long[]{0x000FE20A861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral2831 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_collectionLiteral2844 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral2848 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_collectionLiteral2867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_collectionItem2896 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_DOTDOT_in_collectionItem2907 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_collectionItem2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_emptyCollectionLiteral2940 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral2942 = new BitSet(new long[]{0x0003E00000000000L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral2946 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral2964 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral2966 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_undefinedLiteral2998 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral3000 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral3004 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_undefinedLiteral3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_undefinedLiteral3034 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral3036 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral3040 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_undefinedLiteral3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_tupleLiteral3095 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_tupleLiteral3101 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral3109 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleLiteral3120 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral3124 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_tupleLiteral3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tupleItem3166 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_tupleItem3205 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_tupleItem3209 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_tupleItem3211 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_tupleItem3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tupleItem3237 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_tupleItem3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleType_in_type3337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeOnly3369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_typeOnly3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleType3399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType3437 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType3464 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_collectionType3468 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_tupleType3504 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_tupleType3506 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType3515 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleType3526 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType3530 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_tupleType3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tuplePart3574 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_tuplePart3576 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_tuplePart3580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_shellCommandOnly3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyStat_in_shellCommandOnly3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyStat_in_shellCommand3670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_shellCommand3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_shellCommand3693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_shellCommand3695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyOpEnter_in_legacyStat3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyOpExit_in_legacyStat3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nextLegacyStat_in_legacyStat3758 = new BitSet(new long[]{0x6880000000000002L,0x0000000200041020L});
    public static final BitSet FOLLOW_nextLegacyStat_in_legacyStat3769 = new BitSet(new long[]{0x6880000000000002L,0x0000000200041020L});
    public static final BitSet FOLLOW_singleLegacyStat_in_nextLegacyStat3803 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_nextLegacyStat3807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyCreate_in_singleLegacyStat3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyCreateAssign_in_singleLegacyStat3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyCreateInsert_in_singleLegacyStat3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyLet_in_singleLegacyStat3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyExecute_in_singleLegacyStat3913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objDestroyStat_in_singleLegacyStat3931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_singleLegacyStat3944 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_singleLegacyStat3948 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_attAssignStat_in_singleLegacyStat3954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkInsStat_in_singleLegacyStat3967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkDelStat_in_singleLegacyStat3988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_legacyCreate4024 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_identListMin1_in_legacyCreate4032 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_legacyCreate4036 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_legacyCreate4044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_legacyCreateAssign4081 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_identListMin1_in_legacyCreateAssign4089 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_legacyCreateAssign4093 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_legacyCreateAssign4097 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_legacyCreateAssign4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_legacyCreateInsert4139 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_legacyCreateInsert4147 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_legacyCreateInsert4151 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_legacyCreateInsert4159 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_legacyCreateInsert4163 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_legacyCreateInsert4167 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FF60240L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_legacyCreateInsert4177 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_legacyCreateInsert4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_legacyLet4214 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_legacyLet4222 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_legacyLet4232 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_legacyLet4242 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_legacyLet4251 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_inSoilExpression_in_legacyLet4259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_legacyOpEnter4292 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_inSoilExpression_in_legacyOpEnter4300 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_legacyOpEnter4308 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_legacyOpEnter4312 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_exprList_in_legacyOpEnter4322 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_legacyOpEnter4326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_legacyOpExit4361 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_inSoilExpression_in_legacyOpExit4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_legacyOpExit4377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_legacyExecute4410 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_legacyExecute4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOnly4460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_statOnly4464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nextStat_in_stat4495 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_stat4506 = new BitSet(new long[]{0x610FE208861A0020L,0x000001400FF612C0L});
    public static final BitSet FOLLOW_nextStat_in_stat4512 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_singleStat_in_nextStat4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStat_in_singleStat4583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_singleStat4609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAssignStat_in_singleStat4621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_singleStat4635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objDestroyStat_in_singleStat4649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkInsStat_in_singleStat4662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkDelStat_in_singleStat4679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExStat_in_singleStat4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterStat_in_singleStat4713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStat_in_singleStat4735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStat_in_singleStat4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_emptyStat4780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_statStartingWithExpr4806 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attAssignStat_in_statStartingWithExpr4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varAssignStat4858 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_varAssignStat4862 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FF60240L});
    public static final BitSet FOLLOW_rValue_in_varAssignStat4870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_attAssignStat4901 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_attAssignStat4910 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_attAssignStat4914 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FF60240L});
    public static final BitSet FOLLOW_rValue_in_attAssignStat4922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_objCreateStat4948 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_objCreateStat4956 = new BitSet(new long[]{0x0400000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat4966 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_inSoilExpression_in_objCreateStat4978 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat4984 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_objCreateStat5002 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat5010 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FF60240L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat5024 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_objDestroyStat5068 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_exprListMin1_in_objDestroyStat5076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_lnkInsStat5102 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkInsStat5106 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FF60240L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat5116 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkInsStat5120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_lnkInsStat5124 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_lnkInsStat5132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers5161 = new BitSet(new long[]{0x0000000000200400L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers5172 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FF60240L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers5181 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers5188 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers5204 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FF60240L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers5215 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers5226 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FF60240L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers5235 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers5242 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers5264 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FF60240L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers5279 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers5299 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FF60240L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers5310 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers5319 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_61_in_lnkDelStat5360 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkDelStat5364 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FF60240L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat5374 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkDelStat5378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_lnkDelStat5382 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_lnkDelStat5391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_condExStat5422 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_inSoilExpression_in_condExStat5431 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_condExStat5435 = new BitSet(new long[]{0x710FE208861A0020L,0x000001400FF612C0L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat5444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_65_in_condExStat5455 = new BitSet(new long[]{0x710FE208861A0020L,0x000001400FF612C0L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat5467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_condExStat5479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_iterStat5504 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_iterStat5512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_iterStat5516 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_inSoilExpression_in_iterStat5524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_iterStat5528 = new BitSet(new long[]{0x710FE208861A0020L,0x000001400FF612C0L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_iterStat5536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_iterStat5541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_whileStat5567 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_inSoilExpression_in_whileStat5575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_whileStat5579 = new BitSet(new long[]{0x710FE208861A0020L,0x000001400FF612C0L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_whileStat5587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_whileStat5592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_blockStat5622 = new BitSet(new long[]{0x710FE208861A0020L,0x000001400FF612C0L});
    public static final BitSet FOLLOW_60_in_blockStat5627 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat5633 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_blockStat5639 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat5645 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_SEMI_in_blockStat5652 = new BitSet(new long[]{0x610FE208861A0020L,0x000001400FF612C0L});
    public static final BitSet FOLLOW_stat_in_blockStat5662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_blockStat5667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_implicitBlockStat5693 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat5699 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_implicitBlockStat5705 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat5711 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_SEMI_in_implicitBlockStat5718 = new BitSet(new long[]{0x610FE208861A0020L,0x000001400FF612C0L});
    public static final BitSet FOLLOW_stat_in_implicitBlockStat5726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOrImplicitBlock5749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicitBlockStat_in_statOrImplicitBlock5759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_rValue5805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_rValue5817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_rValList5840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValListMin1_in_rValList5867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin15900 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin15914 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FF60240L});
    public static final BitSet FOLLOW_rValue_in_rValListMin15924 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rValue_in_rValListMin25963 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin25971 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FF60240L});
    public static final BitSet FOLLOW_rValue_in_rValListMin25979 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin25993 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FF60240L});
    public static final BitSet FOLLOW_rValue_in_rValListMin26003 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_expression_in_inSoilExpression6037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_exprList6066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprListMin1_in_exprList6084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin16117 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin16132 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin16142 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin26182 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin26190 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin26198 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin26212 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin26222 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_nothing_in_identList6252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identListMin1_in_identList6269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identListMin16303 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_identListMin16317 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_identListMin16327 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COLON_in_synpred1_TestSuite3196 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_synpred1_TestSuite3198 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_synpred1_TestSuite3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_synpred2_TestSuite3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyStat_in_synpred3_TestSuite3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyStat_in_synpred4_TestSuite3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_synpred5_TestSuite3685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_synpred6_TestSuite4365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_synpred7_TestSuite4601 = new BitSet(new long[]{0x0000000000000002L});

}