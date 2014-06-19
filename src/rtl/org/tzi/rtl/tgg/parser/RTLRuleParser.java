// $ANTLR 3.4 RTLRule.g 2014-05-29 14:33:31

/*
 *  @author Duc-Hanh Dang, Khoa-Hai Nguyen, Xuan-Loi Vu
 */

package org.tzi.rtl.tgg.parser;

import org.tzi.use.parser.base.BaseParser;
import org.tzi.rtl.tgg.parser.ast.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class RTLRuleParser extends BaseParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "BAR", "COLON", "COLON_COLON", "COLON_EQUAL", "COMMA", "COND_EXPR", "DOT", "DOTDOT", "EQUAL", "ESC", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "INT", "LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MINUS", "ML_COMMENT", "NEWLINE", "NON_OCL_STRING", "NOT_EQUAL", "PLUS", "RANGE_OR_INT", "RBRACE", "RBRACK", "REAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "STRING", "VOCAB", "WS", "'EXPLICIT'", "'apply'", "'as'", "'backward'", "'checkCorr'", "'checkSource'", "'checkTarget'", "'co-evolution'", "'direction'", "'do'", "'end'", "'forward'", "'if'", "'in'", "'integration'", "'mode'", "'rule'", "'synchronization'", "'transformation'", "'while'"
    };

    public static final int EOF=-1;
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
    public static final int ARROW=4;
    public static final int AT=5;
    public static final int BAR=6;
    public static final int COLON=7;
    public static final int COLON_COLON=8;
    public static final int COLON_EQUAL=9;
    public static final int COMMA=10;
    public static final int COND_EXPR=11;
    public static final int DOT=12;
    public static final int DOTDOT=13;
    public static final int EQUAL=14;
    public static final int ESC=15;
    public static final int GREATER=16;
    public static final int GREATER_EQUAL=17;
    public static final int HASH=18;
    public static final int HEX_DIGIT=19;
    public static final int IDENT=20;
    public static final int INT=21;
    public static final int LBRACE=22;
    public static final int LBRACK=23;
    public static final int LESS=24;
    public static final int LESS_EQUAL=25;
    public static final int LPAREN=26;
    public static final int MINUS=27;
    public static final int ML_COMMENT=28;
    public static final int NEWLINE=29;
    public static final int NON_OCL_STRING=30;
    public static final int NOT_EQUAL=31;
    public static final int PLUS=32;
    public static final int RANGE_OR_INT=33;
    public static final int RBRACE=34;
    public static final int RBRACK=35;
    public static final int REAL=36;
    public static final int RPAREN=37;
    public static final int SEMI=38;
    public static final int SLASH=39;
    public static final int SL_COMMENT=40;
    public static final int STAR=41;
    public static final int STRING=42;
    public static final int VOCAB=43;
    public static final int WS=44;

    // delegates
    public BaseParser[] getDelegates() {
        return new BaseParser[] {};
    }

    // delegators


    public RTLRuleParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public RTLRuleParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return RTLRuleParser.tokenNames; }
    public String getGrammarFileName() { return "RTLRule.g"; }



    // $ANTLR start "tggRuleCollection"
    // RTLRule.g:45:1: tggRuleCollection returns [ASTTggRuleCollection n] : 'transformation' name= IDENT 'direction' direction= ( 'forward' | 'backward' | 'integration' | 'co-evolution' | 'synchronization' ) ( (matchID= IDENT ':=' )? ruleApplication SEMI )* (tggRule= tggRuleDefinition )* EOF ;
    public final ASTTggRuleCollection tggRuleCollection() throws RecognitionException {
        ASTTggRuleCollection n = null;


        Token name=null;
        Token direction=null;
        Token matchID=null;
        ASTTggRule tggRule =null;

        ASTTggRuleApplication ruleApplication1 =null;



        	ASTTggRuleMatch match = null;

        try {
            // RTLRule.g:49:5: ( 'transformation' name= IDENT 'direction' direction= ( 'forward' | 'backward' | 'integration' | 'co-evolution' | 'synchronization' ) ( (matchID= IDENT ':=' )? ruleApplication SEMI )* (tggRule= tggRuleDefinition )* EOF )
            // RTLRule.g:50:5: 'transformation' name= IDENT 'direction' direction= ( 'forward' | 'backward' | 'integration' | 'co-evolution' | 'synchronization' ) ( (matchID= IDENT ':=' )? ruleApplication SEMI )* (tggRule= tggRuleDefinition )* EOF
            {
            match(input,63,FOLLOW_63_in_tggRuleCollection62); 

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tggRuleCollection66); 

             n = new ASTTggRuleCollection(name); 

            match(input,53,FOLLOW_53_in_tggRuleCollection74); 

            direction=(Token)input.LT(1);

            if ( input.LA(1)==48||input.LA(1)==52||input.LA(1)==56||input.LA(1)==59||input.LA(1)==62 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // RTLRule.g:52:5: ( (matchID= IDENT ':=' )? ruleApplication SEMI )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==COND_EXPR||LA2_0==IDENT||LA2_0==46||LA2_0==54||LA2_0==57) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // RTLRule.g:52:6: (matchID= IDENT ':=' )? ruleApplication SEMI
            	    {
            	    // RTLRule.g:52:6: (matchID= IDENT ':=' )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==IDENT) ) {
            	        int LA1_1 = input.LA(2);

            	        if ( (LA1_1==COLON_EQUAL) ) {
            	            alt1=1;
            	        }
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // RTLRule.g:52:7: matchID= IDENT ':='
            	            {
            	            matchID=(Token)match(input,IDENT,FOLLOW_IDENT_in_tggRuleCollection98); 

            	            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_tggRuleCollection100); 

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_ruleApplication_in_tggRuleCollection104);
            	    ruleApplication1=ruleApplication();

            	    state._fsp--;


            	    match(input,SEMI,FOLLOW_SEMI_in_tggRuleCollection106); 

            	    match = new ASTTggRuleMatch(matchID,ruleApplication1);

            	    n.addTggRuleMatch(match);

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // RTLRule.g:55:5: (tggRule= tggRuleDefinition )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==61) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // RTLRule.g:55:7: tggRule= tggRuleDefinition
            	    {
            	    pushFollow(FOLLOW_tggRuleDefinition_in_tggRuleCollection133);
            	    tggRule=tggRuleDefinition();

            	    state._fsp--;


            	     n.addTggRule(tggRule); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match(input,EOF,FOLLOW_EOF_in_tggRuleCollection144); 

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
    // $ANTLR end "tggRuleCollection"



    // $ANTLR start "ruleApplication"
    // RTLRule.g:64:1: ruleApplication returns [ASTTggRuleApplication n] : (simpleApp= simpleApplication |multiApp= multiApplication |restrictedApp= restrictedApplication |selectedApp= selectedApplication );
    public final ASTTggRuleApplication ruleApplication() throws RecognitionException {
        ASTTggRuleApplication n = null;


        ASTTggRuleSimpleApplication simpleApp =null;

        ASTTggRuleMultiApplication multiApp =null;

        ASTTggRuleRestrictedApplication restrictedApp =null;

        ASTTggRuleSelectedApplication selectedApp =null;


        try {
            // RTLRule.g:64:25: (simpleApp= simpleApplication |multiApp= multiApplication |restrictedApp= restrictedApplication |selectedApp= selectedApplication )
            int alt4=4;
            switch ( input.LA(1) ) {
            case IDENT:
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
            case COND_EXPR:
            case 46:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // RTLRule.g:65:2: simpleApp= simpleApplication
                    {
                    pushFollow(FOLLOW_simpleApplication_in_ruleApplication165);
                    simpleApp=simpleApplication();

                    state._fsp--;


                    n = simpleApp;

                    }
                    break;
                case 2 :
                    // RTLRule.g:66:3: multiApp= multiApplication
                    {
                    pushFollow(FOLLOW_multiApplication_in_ruleApplication172);
                    multiApp=multiApplication();

                    state._fsp--;


                    n = multiApp;

                    }
                    break;
                case 3 :
                    // RTLRule.g:67:3: restrictedApp= restrictedApplication
                    {
                    pushFollow(FOLLOW_restrictedApplication_in_ruleApplication180);
                    restrictedApp=restrictedApplication();

                    state._fsp--;


                    n = restrictedApp;

                    }
                    break;
                case 4 :
                    // RTLRule.g:68:3: selectedApp= selectedApplication
                    {
                    pushFollow(FOLLOW_selectedApplication_in_ruleApplication188);
                    selectedApp=selectedApplication();

                    state._fsp--;


                    n = selectedApp;

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
    // $ANTLR end "ruleApplication"



    // $ANTLR start "simpleApplication"
    // RTLRule.g:77:1: simpleApplication returns [ASTTggRuleSimpleApplication n] : name= IDENT LPAREN RPAREN ;
    public final ASTTggRuleSimpleApplication simpleApplication() throws RecognitionException {
        ASTTggRuleSimpleApplication n = null;


        Token name=null;

        try {
            // RTLRule.g:77:27: (name= IDENT LPAREN RPAREN )
            // RTLRule.g:78:2: name= IDENT LPAREN RPAREN
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleApplication209); 

            match(input,LPAREN,FOLLOW_LPAREN_in_simpleApplication211); 

            match(input,RPAREN,FOLLOW_RPAREN_in_simpleApplication213); 

            n = new ASTTggRuleSimpleApplication(name);

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
    // $ANTLR end "simpleApplication"



    // $ANTLR start "multiApplication"
    // RTLRule.g:87:1: multiApplication returns [ASTTggRuleMultiApplication n] : 'do' (ruleApp= ruleApplication SEMI )* 'while' cond= COND_EXPR ;
    public final ASTTggRuleMultiApplication multiApplication() throws RecognitionException {
        ASTTggRuleMultiApplication n = null;


        Token cond=null;
        ASTTggRuleApplication ruleApp =null;



        	ASTCondition nCon = null;
        	n = new ASTTggRuleMultiApplication();

        try {
            // RTLRule.g:92:2: ( 'do' (ruleApp= ruleApplication SEMI )* 'while' cond= COND_EXPR )
            // RTLRule.g:93:2: 'do' (ruleApp= ruleApplication SEMI )* 'while' cond= COND_EXPR
            {
            match(input,54,FOLLOW_54_in_multiApplication237); 

            // RTLRule.g:94:2: (ruleApp= ruleApplication SEMI )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COND_EXPR||LA5_0==IDENT||LA5_0==46||LA5_0==54||LA5_0==57) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // RTLRule.g:94:3: ruleApp= ruleApplication SEMI
            	    {
            	    pushFollow(FOLLOW_ruleApplication_in_multiApplication245);
            	    ruleApp=ruleApplication();

            	    state._fsp--;


            	    match(input,SEMI,FOLLOW_SEMI_in_multiApplication247); 

            	    n.addRuleMultiApplication(ruleApp);

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match(input,64,FOLLOW_64_in_multiApplication254); 

            cond=(Token)match(input,COND_EXPR,FOLLOW_COND_EXPR_in_multiApplication259); 

            nCon = new ASTCondition(cond);
            	n.setCond(nCon);

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
    // $ANTLR end "multiApplication"



    // $ANTLR start "restrictedApplication"
    // RTLRule.g:106:1: restrictedApplication returns [ASTTggRuleRestrictedApplication n] : 'if' cond= COND_EXPR LBRACE (ruleApp= ruleApplication SEMI )* RBRACE ;
    public final ASTTggRuleRestrictedApplication restrictedApplication() throws RecognitionException {
        ASTTggRuleRestrictedApplication n = null;


        Token cond=null;
        ASTTggRuleApplication ruleApp =null;



        	ASTCondition nCon = null;
        	n = new ASTTggRuleRestrictedApplication();

        try {
            // RTLRule.g:111:2: ( 'if' cond= COND_EXPR LBRACE (ruleApp= ruleApplication SEMI )* RBRACE )
            // RTLRule.g:112:2: 'if' cond= COND_EXPR LBRACE (ruleApp= ruleApplication SEMI )* RBRACE
            {
            match(input,57,FOLLOW_57_in_restrictedApplication283); 

            cond=(Token)match(input,COND_EXPR,FOLLOW_COND_EXPR_in_restrictedApplication288); 

            match(input,LBRACE,FOLLOW_LBRACE_in_restrictedApplication291); 

            // RTLRule.g:115:2: (ruleApp= ruleApplication SEMI )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==COND_EXPR||LA6_0==IDENT||LA6_0==46||LA6_0==54||LA6_0==57) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // RTLRule.g:115:3: ruleApp= ruleApplication SEMI
            	    {
            	    pushFollow(FOLLOW_ruleApplication_in_restrictedApplication299);
            	    ruleApp=ruleApplication();

            	    state._fsp--;


            	    match(input,SEMI,FOLLOW_SEMI_in_restrictedApplication301); 

            	    n.addRuleRestrictedApplication(ruleApp);

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_restrictedApplication308); 

            nCon = new ASTCondition(cond);
            	n.setCond(nCon);

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
    // $ANTLR end "restrictedApplication"



    // $ANTLR start "selectedApplication"
    // RTLRule.g:126:1: selectedApplication returns [ASTTggRuleSelectedApplication n] : ( 'apply' (name= IDENT ) |cond= COND_EXPR );
    public final ASTTggRuleSelectedApplication selectedApplication() throws RecognitionException {
        ASTTggRuleSelectedApplication n = null;


        Token name=null;
        Token cond=null;


        	ASTCondition nCon = null;

        try {
            // RTLRule.g:130:2: ( 'apply' (name= IDENT ) |cond= COND_EXPR )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==46) ) {
                alt7=1;
            }
            else if ( (LA7_0==COND_EXPR) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // RTLRule.g:131:2: 'apply' (name= IDENT )
                    {
                    match(input,46,FOLLOW_46_in_selectedApplication333); 

                    // RTLRule.g:132:2: (name= IDENT )
                    // RTLRule.g:132:3: name= IDENT
                    {
                    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_selectedApplication339); 

                    }


                    }
                    break;
                case 2 :
                    // RTLRule.g:133:3: cond= COND_EXPR
                    {
                    cond=(Token)match(input,COND_EXPR,FOLLOW_COND_EXPR_in_selectedApplication346); 

                    nCon = new ASTCondition(cond);

                    n = new ASTTggRuleSelectedApplication(name, nCon);

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
    // $ANTLR end "selectedApplication"



    // $ANTLR start "tggRuleDefinition"
    // RTLRule.g:143:1: tggRuleDefinition returns [ASTTggRule n] : 'rule' name= IDENT ( 'mode' 'EXPLICIT' )? 'checkSource' sourceRule= ruleDefinition 'checkTarget' targetRule= ruleDefinition 'checkCorr' corrRule= corrRuleDefinition 'end' ;
    public final ASTTggRule tggRuleDefinition() throws RecognitionException {
        ASTTggRule n = null;


        Token name=null;
        ASTRule sourceRule =null;

        ASTRule targetRule =null;

        ASTCorrRule corrRule =null;



          boolean isDeletingRule = false;

        try {
            // RTLRule.g:147:5: ( 'rule' name= IDENT ( 'mode' 'EXPLICIT' )? 'checkSource' sourceRule= ruleDefinition 'checkTarget' targetRule= ruleDefinition 'checkCorr' corrRule= corrRuleDefinition 'end' )
            // RTLRule.g:148:5: 'rule' name= IDENT ( 'mode' 'EXPLICIT' )? 'checkSource' sourceRule= ruleDefinition 'checkTarget' targetRule= ruleDefinition 'checkCorr' corrRule= corrRuleDefinition 'end'
            {
            match(input,61,FOLLOW_61_in_tggRuleDefinition376); 

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tggRuleDefinition380); 

            // RTLRule.g:149:5: ( 'mode' 'EXPLICIT' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==60) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // RTLRule.g:149:6: 'mode' 'EXPLICIT'
                    {
                    match(input,60,FOLLOW_60_in_tggRuleDefinition387); 

                    match(input,45,FOLLOW_45_in_tggRuleDefinition389); 

                    isDeletingRule = true;

                    }
                    break;

            }


            match(input,50,FOLLOW_50_in_tggRuleDefinition398); 

            pushFollow(FOLLOW_ruleDefinition_in_tggRuleDefinition408);
            sourceRule=ruleDefinition();

            state._fsp--;


            match(input,51,FOLLOW_51_in_tggRuleDefinition414); 

            pushFollow(FOLLOW_ruleDefinition_in_tggRuleDefinition424);
            targetRule=ruleDefinition();

            state._fsp--;


            match(input,49,FOLLOW_49_in_tggRuleDefinition430); 

            pushFollow(FOLLOW_corrRuleDefinition_in_tggRuleDefinition440);
            corrRule=corrRuleDefinition();

            state._fsp--;


            match(input,55,FOLLOW_55_in_tggRuleDefinition446); 

            n = new ASTTggRule(name,sourceRule,targetRule,corrRule,isDeletingRule);

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
    // $ANTLR end "tggRuleDefinition"



    // $ANTLR start "ruleDefinition"
    // RTLRule.g:164:1: ruleDefinition returns [ASTRule n] : LPAREN lhs= patternDefinition RPAREN LBRACE rhs= patternDefinition RBRACE ;
    public final ASTRule ruleDefinition() throws RecognitionException {
        ASTRule n = null;


        ASTPattern lhs =null;

        ASTPattern rhs =null;


        try {
            // RTLRule.g:165:5: ( LPAREN lhs= patternDefinition RPAREN LBRACE rhs= patternDefinition RBRACE )
            // RTLRule.g:166:5: LPAREN lhs= patternDefinition RPAREN LBRACE rhs= patternDefinition RBRACE
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_ruleDefinition472); 

            pushFollow(FOLLOW_patternDefinition_in_ruleDefinition484);
            lhs=patternDefinition();

            state._fsp--;


            match(input,RPAREN,FOLLOW_RPAREN_in_ruleDefinition490); 

            match(input,LBRACE,FOLLOW_LBRACE_in_ruleDefinition493); 

            pushFollow(FOLLOW_patternDefinition_in_ruleDefinition505);
            rhs=patternDefinition();

            state._fsp--;


            match(input,RBRACE,FOLLOW_RBRACE_in_ruleDefinition511); 

            n = new ASTRule(lhs,rhs);

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
    // $ANTLR end "ruleDefinition"



    // $ANTLR start "corrRuleDefinition"
    // RTLRule.g:177:1: corrRuleDefinition returns [ASTCorrRule n] : LPAREN lhs= corrPatternDefinition RPAREN LBRACE rhs= corrPatternDefinition RBRACE ;
    public final ASTCorrRule corrRuleDefinition() throws RecognitionException {
        ASTCorrRule n = null;


        ASTExtPattern lhs =null;

        ASTExtPattern rhs =null;


        try {
            // RTLRule.g:178:5: ( LPAREN lhs= corrPatternDefinition RPAREN LBRACE rhs= corrPatternDefinition RBRACE )
            // RTLRule.g:179:5: LPAREN lhs= corrPatternDefinition RPAREN LBRACE rhs= corrPatternDefinition RBRACE
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_corrRuleDefinition533); 

            pushFollow(FOLLOW_corrPatternDefinition_in_corrRuleDefinition545);
            lhs=corrPatternDefinition();

            state._fsp--;


            match(input,RPAREN,FOLLOW_RPAREN_in_corrRuleDefinition551); 

            match(input,LBRACE,FOLLOW_LBRACE_in_corrRuleDefinition554); 

            pushFollow(FOLLOW_corrPatternDefinition_in_corrRuleDefinition566);
            rhs=corrPatternDefinition();

            state._fsp--;


            match(input,RBRACE,FOLLOW_RBRACE_in_corrRuleDefinition572); 

            n = new ASTCorrRule(lhs,rhs);

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
    // $ANTLR end "corrRuleDefinition"



    // $ANTLR start "patternDefinition"
    // RTLRule.g:191:1: patternDefinition returns [ASTPattern n] : (object= objectDefinition )* (link= linkDefinition )* (condition= conditionDefinition )* ;
    public final ASTPattern patternDefinition() throws RecognitionException {
        ASTPattern n = null;


        ASTObject object =null;

        ASTLink link =null;

        ASTCondition condition =null;



          n = new ASTPattern();

        try {
            // RTLRule.g:195:5: ( (object= objectDefinition )* (link= linkDefinition )* (condition= conditionDefinition )* )
            // RTLRule.g:196:5: (object= objectDefinition )* (link= linkDefinition )* (condition= conditionDefinition )*
            {
            // RTLRule.g:196:5: (object= objectDefinition )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==IDENT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // RTLRule.g:196:6: object= objectDefinition
            	    {
            	    pushFollow(FOLLOW_objectDefinition_in_patternDefinition609);
            	    object=objectDefinition();

            	    state._fsp--;


            	    n.addObject(object);

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            // RTLRule.g:197:5: (link= linkDefinition )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==LPAREN) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // RTLRule.g:197:6: link= linkDefinition
            	    {
            	    pushFollow(FOLLOW_linkDefinition_in_patternDefinition623);
            	    link=linkDefinition();

            	    state._fsp--;


            	    n.addLink(link);

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            // RTLRule.g:198:5: (condition= conditionDefinition )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==COND_EXPR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // RTLRule.g:198:6: condition= conditionDefinition
            	    {
            	    pushFollow(FOLLOW_conditionDefinition_in_patternDefinition637);
            	    condition=conditionDefinition();

            	    state._fsp--;


            	    n.addCondition(condition);

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "patternDefinition"



    // $ANTLR start "corrPatternDefinition"
    // RTLRule.g:205:1: corrPatternDefinition returns [ASTExtPattern n] : (object= objectDefinition )* (corrLink= corrLinkDefinition )* (link= linkDefinition )* (inv= invariantTGG )* (condition= conditionDefinition )* ;
    public final ASTExtPattern corrPatternDefinition() throws RecognitionException {
        ASTExtPattern n = null;


        ASTObject object =null;

        ASTCorrLink corrLink =null;

        ASTLink link =null;

        ASTCorrInvariant inv =null;

        ASTCondition condition =null;



          n = new ASTExtPattern();

        try {
            // RTLRule.g:209:5: ( (object= objectDefinition )* (corrLink= corrLinkDefinition )* (link= linkDefinition )* (inv= invariantTGG )* (condition= conditionDefinition )* )
            // RTLRule.g:210:5: (object= objectDefinition )* (corrLink= corrLinkDefinition )* (link= linkDefinition )* (inv= invariantTGG )* (condition= conditionDefinition )*
            {
            // RTLRule.g:210:5: (object= objectDefinition )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==IDENT) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==COLON) ) {
                        int LA12_3 = input.LA(3);

                        if ( (LA12_3==IDENT) ) {
                            alt12=1;
                        }


                    }


                }


                switch (alt12) {
            	case 1 :
            	    // RTLRule.g:210:6: object= objectDefinition
            	    {
            	    pushFollow(FOLLOW_objectDefinition_in_corrPatternDefinition669);
            	    object=objectDefinition();

            	    state._fsp--;


            	    n.addObject(object);

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            // RTLRule.g:211:5: (corrLink= corrLinkDefinition )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==LPAREN) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==IDENT) ) {
                        int LA13_3 = input.LA(3);

                        if ( (LA13_3==COMMA) ) {
                            int LA13_5 = input.LA(4);

                            if ( (LA13_5==IDENT) ) {
                                int LA13_6 = input.LA(5);

                                if ( (LA13_6==RPAREN) ) {
                                    int LA13_7 = input.LA(6);

                                    if ( (LA13_7==47||LA13_7==58) ) {
                                        alt13=1;
                                    }


                                }


                            }
                            else if ( (LA13_5==LPAREN) ) {
                                alt13=1;
                            }


                        }


                    }
                    else if ( (LA13_1==LPAREN) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // RTLRule.g:211:6: corrLink= corrLinkDefinition
            	    {
            	    pushFollow(FOLLOW_corrLinkDefinition_in_corrPatternDefinition683);
            	    corrLink=corrLinkDefinition();

            	    state._fsp--;


            	    n.addCorrLink(corrLink);

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            // RTLRule.g:212:5: (link= linkDefinition )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==LPAREN) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // RTLRule.g:212:6: link= linkDefinition
            	    {
            	    pushFollow(FOLLOW_linkDefinition_in_corrPatternDefinition697);
            	    link=linkDefinition();

            	    state._fsp--;


            	    n.addLink(link);

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            // RTLRule.g:213:5: (inv= invariantTGG )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==IDENT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // RTLRule.g:213:6: inv= invariantTGG
            	    {
            	    pushFollow(FOLLOW_invariantTGG_in_corrPatternDefinition711);
            	    inv=invariantTGG();

            	    state._fsp--;


            	    n.addInvariant(inv);

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            // RTLRule.g:214:5: (condition= conditionDefinition )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==COND_EXPR) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // RTLRule.g:214:6: condition= conditionDefinition
            	    {
            	    pushFollow(FOLLOW_conditionDefinition_in_corrPatternDefinition725);
            	    condition=conditionDefinition();

            	    state._fsp--;


            	    n.addCondition(condition);

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
        return n;
    }
    // $ANTLR end "corrPatternDefinition"



    // $ANTLR start "invariantTGG"
    // RTLRule.g:221:1: invariantTGG returns [ASTCorrInvariant n] : className= IDENT COLON conditionDefinition ;
    public final ASTCorrInvariant invariantTGG() throws RecognitionException {
        ASTCorrInvariant n = null;


        Token className=null;
        ASTCondition conditionDefinition2 =null;


        try {
            // RTLRule.g:222:2: (className= IDENT COLON conditionDefinition )
            // RTLRule.g:223:2: className= IDENT COLON conditionDefinition
            {
            className=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantTGG747); 

            match(input,COLON,FOLLOW_COLON_in_invariantTGG749); 

            pushFollow(FOLLOW_conditionDefinition_in_invariantTGG751);
            conditionDefinition2=conditionDefinition();

            state._fsp--;


             n = new ASTCorrInvariant(className, conditionDefinition2); 

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
    // $ANTLR end "invariantTGG"



    // $ANTLR start "objectDefinition"
    // RTLRule.g:232:1: objectDefinition returns [ASTObject n] : objectName= IDENT COLON className= IDENT ;
    public final ASTObject objectDefinition() throws RecognitionException {
        ASTObject n = null;


        Token objectName=null;
        Token className=null;

        try {
            // RTLRule.g:233:2: (objectName= IDENT COLON className= IDENT )
            // RTLRule.g:234:2: objectName= IDENT COLON className= IDENT
            {
            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectDefinition774); 

            match(input,COLON,FOLLOW_COLON_in_objectDefinition776); 

            className=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectDefinition781); 

            n = new ASTObject(objectName, className);

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
    // $ANTLR end "objectDefinition"



    // $ANTLR start "linkDefinition"
    // RTLRule.g:242:1: linkDefinition returns [ASTLink n] : LPAREN obj1= IDENT COMMA obj2= IDENT RPAREN COLON assocName= IDENT ;
    public final ASTLink linkDefinition() throws RecognitionException {
        ASTLink n = null;


        Token obj1=null;
        Token obj2=null;
        Token assocName=null;

        try {
            // RTLRule.g:243:2: ( LPAREN obj1= IDENT COMMA obj2= IDENT RPAREN COLON assocName= IDENT )
            // RTLRule.g:244:2: LPAREN obj1= IDENT COMMA obj2= IDENT RPAREN COLON assocName= IDENT
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_linkDefinition800); 

            obj1=(Token)match(input,IDENT,FOLLOW_IDENT_in_linkDefinition804); 

            match(input,COMMA,FOLLOW_COMMA_in_linkDefinition806); 

            obj2=(Token)match(input,IDENT,FOLLOW_IDENT_in_linkDefinition810); 

            match(input,RPAREN,FOLLOW_RPAREN_in_linkDefinition812); 

            match(input,COLON,FOLLOW_COLON_in_linkDefinition814); 

            assocName=(Token)match(input,IDENT,FOLLOW_IDENT_in_linkDefinition819); 

            n = new ASTLink(obj1, obj2, assocName);

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
    // $ANTLR end "linkDefinition"



    // $ANTLR start "conditionDefinition"
    // RTLRule.g:252:1: conditionDefinition returns [ASTCondition n] : cond= COND_EXPR ;
    public final ASTCondition conditionDefinition() throws RecognitionException {
        ASTCondition n = null;


        Token cond=null;

        try {
            // RTLRule.g:253:2: (cond= COND_EXPR )
            // RTLRule.g:254:2: cond= COND_EXPR
            {
            cond=(Token)match(input,COND_EXPR,FOLLOW_COND_EXPR_in_conditionDefinition840); 

            n = new ASTCondition(cond);

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
    // $ANTLR end "conditionDefinition"



    // $ANTLR start "corrLinkDefinition"
    // RTLRule.g:263:1: corrLinkDefinition returns [ASTCorrLink n] : LPAREN ( LPAREN clsName1= IDENT RPAREN )? objS= IDENT COMMA ( LPAREN clsName2= IDENT RPAREN )? objT= IDENT RPAREN ( 'as' LPAREN role1= IDENT COMMA role2= IDENT RPAREN )? 'in' objCorr= IDENT COLON corrClass= IDENT ;
    public final ASTCorrLink corrLinkDefinition() throws RecognitionException {
        ASTCorrLink n = null;


        Token clsName1=null;
        Token objS=null;
        Token clsName2=null;
        Token objT=null;
        Token role1=null;
        Token role2=null;
        Token objCorr=null;
        Token corrClass=null;


          Token newSourceClass=null;
          Token newTargetClass=null;
          Token sourceRole=null;
          Token targetRole=null;

        try {
            // RTLRule.g:270:2: ( LPAREN ( LPAREN clsName1= IDENT RPAREN )? objS= IDENT COMMA ( LPAREN clsName2= IDENT RPAREN )? objT= IDENT RPAREN ( 'as' LPAREN role1= IDENT COMMA role2= IDENT RPAREN )? 'in' objCorr= IDENT COLON corrClass= IDENT )
            // RTLRule.g:271:2: LPAREN ( LPAREN clsName1= IDENT RPAREN )? objS= IDENT COMMA ( LPAREN clsName2= IDENT RPAREN )? objT= IDENT RPAREN ( 'as' LPAREN role1= IDENT COMMA role2= IDENT RPAREN )? 'in' objCorr= IDENT COLON corrClass= IDENT
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_corrLinkDefinition863); 

            // RTLRule.g:272:2: ( LPAREN clsName1= IDENT RPAREN )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==LPAREN) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // RTLRule.g:272:3: LPAREN clsName1= IDENT RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_corrLinkDefinition867); 

                    clsName1=(Token)match(input,IDENT,FOLLOW_IDENT_in_corrLinkDefinition871); 

                    match(input,RPAREN,FOLLOW_RPAREN_in_corrLinkDefinition873); 

                    newSourceClass = clsName1;

                    }
                    break;

            }


            objS=(Token)match(input,IDENT,FOLLOW_IDENT_in_corrLinkDefinition883); 

            match(input,COMMA,FOLLOW_COMMA_in_corrLinkDefinition885); 

            // RTLRule.g:274:2: ( LPAREN clsName2= IDENT RPAREN )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==LPAREN) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // RTLRule.g:274:3: LPAREN clsName2= IDENT RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_corrLinkDefinition889); 

                    clsName2=(Token)match(input,IDENT,FOLLOW_IDENT_in_corrLinkDefinition893); 

                    match(input,RPAREN,FOLLOW_RPAREN_in_corrLinkDefinition895); 

                    newTargetClass = clsName2;

                    }
                    break;

            }


            objT=(Token)match(input,IDENT,FOLLOW_IDENT_in_corrLinkDefinition905); 

            match(input,RPAREN,FOLLOW_RPAREN_in_corrLinkDefinition907); 

            // RTLRule.g:275:20: ( 'as' LPAREN role1= IDENT COMMA role2= IDENT RPAREN )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==47) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // RTLRule.g:275:21: 'as' LPAREN role1= IDENT COMMA role2= IDENT RPAREN
                    {
                    match(input,47,FOLLOW_47_in_corrLinkDefinition910); 

                    match(input,LPAREN,FOLLOW_LPAREN_in_corrLinkDefinition912); 

                    role1=(Token)match(input,IDENT,FOLLOW_IDENT_in_corrLinkDefinition916); 

                    match(input,COMMA,FOLLOW_COMMA_in_corrLinkDefinition918); 

                    role2=(Token)match(input,IDENT,FOLLOW_IDENT_in_corrLinkDefinition922); 

                    match(input,RPAREN,FOLLOW_RPAREN_in_corrLinkDefinition924); 

                    sourceRole = role1;targetRole = role2;

                    }
                    break;

            }


            match(input,58,FOLLOW_58_in_corrLinkDefinition931); 

            objCorr=(Token)match(input,IDENT,FOLLOW_IDENT_in_corrLinkDefinition935); 

            match(input,COLON,FOLLOW_COLON_in_corrLinkDefinition937); 

            corrClass=(Token)match(input,IDENT,FOLLOW_IDENT_in_corrLinkDefinition941); 


            		n = new ASTCorrLink(objS, objT, objCorr, corrClass);
            		if(newSourceClass != null){
            		    n.addNewSourceClass(newSourceClass);
            		}
            		if(newTargetClass != null){
            			n.addNewTargetClass(newTargetClass);
            		}
            		if(sourceRole != null){
            			n.addSourceRole(sourceRole);
            		}
            		if(targetRole != null){
            			n.addTargetRole(targetRole);
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
    // $ANTLR end "corrLinkDefinition"

    // Delegated rules


 

    public static final BitSet FOLLOW_63_in_tggRuleCollection62 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_tggRuleCollection66 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_tggRuleCollection74 = new BitSet(new long[]{0x4911000000000000L});
    public static final BitSet FOLLOW_set_in_tggRuleCollection78 = new BitSet(new long[]{0x2240400000100800L});
    public static final BitSet FOLLOW_IDENT_in_tggRuleCollection98 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_tggRuleCollection100 = new BitSet(new long[]{0x0240400000100800L});
    public static final BitSet FOLLOW_ruleApplication_in_tggRuleCollection104 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_SEMI_in_tggRuleCollection106 = new BitSet(new long[]{0x2240400000100800L});
    public static final BitSet FOLLOW_tggRuleDefinition_in_tggRuleCollection133 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_EOF_in_tggRuleCollection144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleApplication_in_ruleApplication165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiApplication_in_ruleApplication172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_restrictedApplication_in_ruleApplication180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectedApplication_in_ruleApplication188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleApplication209 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_simpleApplication211 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_simpleApplication213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_multiApplication237 = new BitSet(new long[]{0x0240400000100800L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleApplication_in_multiApplication245 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_SEMI_in_multiApplication247 = new BitSet(new long[]{0x0240400000100800L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_multiApplication254 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COND_EXPR_in_multiApplication259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_restrictedApplication283 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COND_EXPR_in_restrictedApplication288 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_LBRACE_in_restrictedApplication291 = new BitSet(new long[]{0x0240400400100800L});
    public static final BitSet FOLLOW_ruleApplication_in_restrictedApplication299 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_SEMI_in_restrictedApplication301 = new BitSet(new long[]{0x0240400400100800L});
    public static final BitSet FOLLOW_RBRACE_in_restrictedApplication308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_selectedApplication333 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_selectedApplication339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COND_EXPR_in_selectedApplication346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_tggRuleDefinition376 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_tggRuleDefinition380 = new BitSet(new long[]{0x1004000000000000L});
    public static final BitSet FOLLOW_60_in_tggRuleDefinition387 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_tggRuleDefinition389 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_tggRuleDefinition398 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleDefinition_in_tggRuleDefinition408 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_tggRuleDefinition414 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleDefinition_in_tggRuleDefinition424 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_tggRuleDefinition430 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_corrRuleDefinition_in_tggRuleDefinition440 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_tggRuleDefinition446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_ruleDefinition472 = new BitSet(new long[]{0x0000002004100800L});
    public static final BitSet FOLLOW_patternDefinition_in_ruleDefinition484 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_ruleDefinition490 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_LBRACE_in_ruleDefinition493 = new BitSet(new long[]{0x0000000404100800L});
    public static final BitSet FOLLOW_patternDefinition_in_ruleDefinition505 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACE_in_ruleDefinition511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_corrRuleDefinition533 = new BitSet(new long[]{0x0000002004100800L});
    public static final BitSet FOLLOW_corrPatternDefinition_in_corrRuleDefinition545 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_corrRuleDefinition551 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_LBRACE_in_corrRuleDefinition554 = new BitSet(new long[]{0x0000000404100800L});
    public static final BitSet FOLLOW_corrPatternDefinition_in_corrRuleDefinition566 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACE_in_corrRuleDefinition572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectDefinition_in_patternDefinition609 = new BitSet(new long[]{0x0000000004100802L});
    public static final BitSet FOLLOW_linkDefinition_in_patternDefinition623 = new BitSet(new long[]{0x0000000004000802L});
    public static final BitSet FOLLOW_conditionDefinition_in_patternDefinition637 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_objectDefinition_in_corrPatternDefinition669 = new BitSet(new long[]{0x0000000004100802L});
    public static final BitSet FOLLOW_corrLinkDefinition_in_corrPatternDefinition683 = new BitSet(new long[]{0x0000000004100802L});
    public static final BitSet FOLLOW_linkDefinition_in_corrPatternDefinition697 = new BitSet(new long[]{0x0000000004100802L});
    public static final BitSet FOLLOW_invariantTGG_in_corrPatternDefinition711 = new BitSet(new long[]{0x0000000000100802L});
    public static final BitSet FOLLOW_conditionDefinition_in_corrPatternDefinition725 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_IDENT_in_invariantTGG747 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_invariantTGG749 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_conditionDefinition_in_invariantTGG751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_objectDefinition774 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_objectDefinition776 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_objectDefinition781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_linkDefinition800 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_linkDefinition804 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_linkDefinition806 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_linkDefinition810 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_linkDefinition812 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_linkDefinition814 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_linkDefinition819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COND_EXPR_in_conditionDefinition840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_corrLinkDefinition863 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_LPAREN_in_corrLinkDefinition867 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_corrLinkDefinition871 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_corrLinkDefinition873 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_corrLinkDefinition883 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_corrLinkDefinition885 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_LPAREN_in_corrLinkDefinition889 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_corrLinkDefinition893 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_corrLinkDefinition895 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_corrLinkDefinition905 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_corrLinkDefinition907 = new BitSet(new long[]{0x0400800000000000L});
    public static final BitSet FOLLOW_47_in_corrLinkDefinition910 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_corrLinkDefinition912 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_corrLinkDefinition916 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_corrLinkDefinition918 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_corrLinkDefinition922 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_corrLinkDefinition924 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_corrLinkDefinition931 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_corrLinkDefinition935 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_corrLinkDefinition937 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_corrLinkDefinition941 = new BitSet(new long[]{0x0000000000000002L});

}