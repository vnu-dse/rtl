// $ANTLR 3.4 RTLRule.g 2014-05-29 14:33:31

package org.tzi.rtl.tgg.parser;

import org.tzi.use.parser.ParseErrorHandler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class RTLRuleLexer extends Lexer {
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

        private ParseErrorHandler fParseErrorHandler;

        public String getFilename() {
            return fParseErrorHandler.getFileName();
        }

        public void emitErrorMessage(String msg) {
           	fParseErrorHandler.reportError(msg);
    	}

        public void init(ParseErrorHandler handler) {
            fParseErrorHandler = handler;
        }


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public RTLRuleLexer() {} 
    public RTLRuleLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public RTLRuleLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "RTLRule.g"; }

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:23:7: ( 'EXPLICIT' )
            // RTLRule.g:23:9: 'EXPLICIT'
            {
            match("EXPLICIT"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:24:7: ( 'apply' )
            // RTLRule.g:24:9: 'apply'
            {
            match("apply"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:25:7: ( 'as' )
            // RTLRule.g:25:9: 'as'
            {
            match("as"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:26:7: ( 'backward' )
            // RTLRule.g:26:9: 'backward'
            {
            match("backward"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:27:7: ( 'checkCorr' )
            // RTLRule.g:27:9: 'checkCorr'
            {
            match("checkCorr"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:28:7: ( 'checkSource' )
            // RTLRule.g:28:9: 'checkSource'
            {
            match("checkSource"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:29:7: ( 'checkTarget' )
            // RTLRule.g:29:9: 'checkTarget'
            {
            match("checkTarget"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:30:7: ( 'co-evolution' )
            // RTLRule.g:30:9: 'co-evolution'
            {
            match("co-evolution"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:31:7: ( 'direction' )
            // RTLRule.g:31:9: 'direction'
            {
            match("direction"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:32:7: ( 'do' )
            // RTLRule.g:32:9: 'do'
            {
            match("do"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:33:7: ( 'end' )
            // RTLRule.g:33:9: 'end'
            {
            match("end"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:34:7: ( 'forward' )
            // RTLRule.g:34:9: 'forward'
            {
            match("forward"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:35:7: ( 'if' )
            // RTLRule.g:35:9: 'if'
            {
            match("if"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:36:7: ( 'in' )
            // RTLRule.g:36:9: 'in'
            {
            match("in"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:37:7: ( 'integration' )
            // RTLRule.g:37:9: 'integration'
            {
            match("integration"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:38:7: ( 'mode' )
            // RTLRule.g:38:9: 'mode'
            {
            match("mode"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:39:7: ( 'rule' )
            // RTLRule.g:39:9: 'rule'
            {
            match("rule"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:40:7: ( 'synchronization' )
            // RTLRule.g:40:9: 'synchronization'
            {
            match("synchronization"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:41:7: ( 'transformation' )
            // RTLRule.g:41:9: 'transformation'
            {
            match("transformation"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:42:7: ( 'while' )
            // RTLRule.g:42:9: 'while'
            {
            match("while"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:299:3: ( ( ' ' | '\\t' | '\\f' | NEWLINE ) )
            // RTLRule.g:300:5: ( ' ' | '\\t' | '\\f' | NEWLINE )
            {
            // RTLRule.g:300:5: ( ' ' | '\\t' | '\\f' | NEWLINE )
            int alt1=4;
            switch ( input.LA(1) ) {
            case ' ':
                {
                alt1=1;
                }
                break;
            case '\t':
                {
                alt1=2;
                }
                break;
            case '\f':
                {
                alt1=3;
                }
                break;
            case '\n':
            case '\r':
                {
                alt1=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // RTLRule.g:300:7: ' '
                    {
                    match(' '); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // RTLRule.g:301:7: '\\t'
                    {
                    match('\t'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // RTLRule.g:302:7: '\\f'
                    {
                    match('\f'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // RTLRule.g:303:7: NEWLINE
                    {
                    mNEWLINE(); if (state.failed) return ;


                    }
                    break;

            }


            if ( state.backtracking==0 ) { _channel=HIDDEN; }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:309:11: ( ( '//' | '--' ) (~ ( '\\n' | '\\r' ) )* NEWLINE )
            // RTLRule.g:310:5: ( '//' | '--' ) (~ ( '\\n' | '\\r' ) )* NEWLINE
            {
            // RTLRule.g:310:5: ( '//' | '--' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='/') ) {
                alt2=1;
            }
            else if ( (LA2_0=='-') ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // RTLRule.g:310:6: '//'
                    {
                    match("//"); if (state.failed) return ;



                    }
                    break;
                case 2 :
                    // RTLRule.g:310:13: '--'
                    {
                    match("--"); if (state.failed) return ;



                    }
                    break;

            }


            // RTLRule.g:311:5: (~ ( '\\n' | '\\r' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // RTLRule.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            mNEWLINE(); if (state.failed) return ;


            if ( state.backtracking==0 ) { _channel=HIDDEN; }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:316:11: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // RTLRule.g:317:5: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); if (state.failed) return ;



            // RTLRule.g:317:10: ( options {greedy=false; } : . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='*') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='/') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_1 >= '\u0000' && LA4_1 <= '.')||(LA4_1 >= '0' && LA4_1 <= '\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0 >= '\u0000' && LA4_0 <= ')')||(LA4_0 >= '+' && LA4_0 <= '\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // RTLRule.g:317:38: .
            	    {
            	    matchAny(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match("*/"); if (state.failed) return ;



            if ( state.backtracking==0 ) { _channel=HIDDEN; }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            // RTLRule.g:321:9: ( '\\r\\n' | '\\r' | '\\n' )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\r') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='\n') ) {
                    alt5=1;
                }
                else {
                    alt5=2;
                }
            }
            else if ( (LA5_0=='\n') ) {
                alt5=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // RTLRule.g:322:5: '\\r\\n'
                    {
                    match("\r\n"); if (state.failed) return ;



                    }
                    break;
                case 2 :
                    // RTLRule.g:322:14: '\\r'
                    {
                    match('\r'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // RTLRule.g:322:21: '\\n'
                    {
                    match('\n'); if (state.failed) return ;

                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "ARROW"
    public final void mARROW() throws RecognitionException {
        try {
            int _type = ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:324:10: ( '->' )
            // RTLRule.g:324:12: '->'
            {
            match("->"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ARROW"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:325:11: ( '@' )
            // RTLRule.g:325:13: '@'
            {
            match('@'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "BAR"
    public final void mBAR() throws RecognitionException {
        try {
            int _type = BAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:326:8: ( '|' )
            // RTLRule.g:326:10: '|'
            {
            match('|'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BAR"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:327:10: ( ':' )
            // RTLRule.g:327:12: ':'
            {
            match(':'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "COLON_COLON"
    public final void mCOLON_COLON() throws RecognitionException {
        try {
            int _type = COLON_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:328:14: ( '::' )
            // RTLRule.g:328:16: '::'
            {
            match("::"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON_COLON"

    // $ANTLR start "COLON_EQUAL"
    public final void mCOLON_EQUAL() throws RecognitionException {
        try {
            int _type = COLON_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:329:14: ( ':=' )
            // RTLRule.g:329:16: ':='
            {
            match(":="); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON_EQUAL"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:330:10: ( ',' )
            // RTLRule.g:330:12: ','
            {
            match(','); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:331:8: ( '.' )
            // RTLRule.g:331:10: '.'
            {
            match('.'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "DOTDOT"
    public final void mDOTDOT() throws RecognitionException {
        try {
            int _type = DOTDOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:332:11: ( '..' )
            // RTLRule.g:332:13: '..'
            {
            match(".."); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOTDOT"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:333:10: ( '=' )
            // RTLRule.g:333:12: '='
            {
            match('='); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "GREATER"
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:334:11: ( '>' )
            // RTLRule.g:334:13: '>'
            {
            match('>'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATER"

    // $ANTLR start "GREATER_EQUAL"
    public final void mGREATER_EQUAL() throws RecognitionException {
        try {
            int _type = GREATER_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:335:15: ( '>=' )
            // RTLRule.g:335:17: '>='
            {
            match(">="); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATER_EQUAL"

    // $ANTLR start "HASH"
    public final void mHASH() throws RecognitionException {
        try {
            int _type = HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:336:9: ( '#' )
            // RTLRule.g:336:11: '#'
            {
            match('#'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HASH"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
        try {
            int _type = LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:337:11: ( '{' )
            // RTLRule.g:337:13: '{'
            {
            match('{'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBRACE"

    // $ANTLR start "LBRACK"
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:338:11: ( '[' )
            // RTLRule.g:338:13: '['
            {
            match('['); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBRACK"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:339:9: ( '<' )
            // RTLRule.g:339:11: '<'
            {
            match('<'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "LESS_EQUAL"
    public final void mLESS_EQUAL() throws RecognitionException {
        try {
            int _type = LESS_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:340:14: ( '<=' )
            // RTLRule.g:340:16: '<='
            {
            match("<="); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESS_EQUAL"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:341:11: ( '(' )
            // RTLRule.g:341:13: '('
            {
            match('('); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:342:10: ( '-' )
            // RTLRule.g:342:12: '-'
            {
            match('-'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:343:13: ( '<>' )
            // RTLRule.g:343:15: '<>'
            {
            match("<>"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:344:9: ( '+' )
            // RTLRule.g:344:11: '+'
            {
            match('+'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "RBRACE"
    public final void mRBRACE() throws RecognitionException {
        try {
            int _type = RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:345:11: ( '}' )
            // RTLRule.g:345:13: '}'
            {
            match('}'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRACE"

    // $ANTLR start "RBRACK"
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:346:11: ( ']' )
            // RTLRule.g:346:13: ']'
            {
            match(']'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRACK"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:347:10: ( ')' )
            // RTLRule.g:347:12: ')'
            {
            match(')'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:348:8: ( ';' )
            // RTLRule.g:348:10: ';'
            {
            match(';'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:349:10: ( '/' )
            // RTLRule.g:349:12: '/'
            {
            match('/'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:350:9: ( '*' )
            // RTLRule.g:350:11: '*'
            {
            match('*'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            // RTLRule.g:354:4: ( ( '0' .. '9' )+ )
            // RTLRule.g:355:5: ( '0' .. '9' )+
            {
            // RTLRule.g:355:5: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // RTLRule.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "REAL"
    public final void mREAL() throws RecognitionException {
        try {
            // RTLRule.g:359:5: ( INT ( '.' INT ( ( 'e' | 'E' ) ( '+' | '-' )? INT )? | ( 'e' | 'E' ) ( '+' | '-' )? INT ) )
            // RTLRule.g:360:5: INT ( '.' INT ( ( 'e' | 'E' ) ( '+' | '-' )? INT )? | ( 'e' | 'E' ) ( '+' | '-' )? INT )
            {
            mINT(); if (state.failed) return ;


            // RTLRule.g:360:9: ( '.' INT ( ( 'e' | 'E' ) ( '+' | '-' )? INT )? | ( 'e' | 'E' ) ( '+' | '-' )? INT )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='.') ) {
                alt10=1;
            }
            else if ( (LA10_0=='E'||LA10_0=='e') ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // RTLRule.g:360:10: '.' INT ( ( 'e' | 'E' ) ( '+' | '-' )? INT )?
                    {
                    match('.'); if (state.failed) return ;

                    mINT(); if (state.failed) return ;


                    // RTLRule.g:360:18: ( ( 'e' | 'E' ) ( '+' | '-' )? INT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // RTLRule.g:360:19: ( 'e' | 'E' ) ( '+' | '-' )? INT
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();
                                state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            // RTLRule.g:360:31: ( '+' | '-' )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0=='+'||LA7_0=='-') ) {
                                alt7=1;
                            }
                            switch (alt7) {
                                case 1 :
                                    // RTLRule.g:
                                    {
                                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                        input.consume();
                                        state.failed=false;
                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return ;}
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;
                                    }


                                    }
                                    break;

                            }


                            mINT(); if (state.failed) return ;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // RTLRule.g:360:52: ( 'e' | 'E' ) ( '+' | '-' )? INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // RTLRule.g:360:64: ( '+' | '-' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='+'||LA9_0=='-') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // RTLRule.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();
                                state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    mINT(); if (state.failed) return ;


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REAL"

    // $ANTLR start "RANGE_OR_INT"
    public final void mRANGE_OR_INT() throws RecognitionException {
        try {
            int _type = RANGE_OR_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:362:13: ( ( INT '..' )=> INT | ( REAL )=> REAL | INT )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
                int LA11_1 = input.LA(2);

                if ( ((LA11_1 >= '0' && LA11_1 <= '9')) && (synpred2_RTLRule())) {
                    alt11=2;
                }
                else if ( (LA11_1=='.') && (synpred2_RTLRule())) {
                    alt11=2;
                }
                else if ( (LA11_1=='E'||LA11_1=='e') && (synpred2_RTLRule())) {
                    alt11=2;
                }
                else if ( (synpred1_RTLRule()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // RTLRule.g:363:7: ( INT '..' )=> INT
                    {
                    mINT(); if (state.failed) return ;


                    if ( state.backtracking==0 ) { _type=INT; }

                    }
                    break;
                case 2 :
                    // RTLRule.g:364:7: ( REAL )=> REAL
                    {
                    mREAL(); if (state.failed) return ;


                    if ( state.backtracking==0 ) { _type=REAL; }

                    }
                    break;
                case 3 :
                    // RTLRule.g:365:9: INT
                    {
                    mINT(); if (state.failed) return ;


                    if ( state.backtracking==0 ) { _type=INT; }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RANGE_OR_INT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:369:7: ( '\\'' (~ ( '\\'' | '\\\\' ) | ESC )* '\\'' )
            // RTLRule.g:370:5: '\\'' (~ ( '\\'' | '\\\\' ) | ESC )* '\\''
            {
            match('\''); if (state.failed) return ;

            // RTLRule.g:370:10: (~ ( '\\'' | '\\\\' ) | ESC )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= '\u0000' && LA12_0 <= '&')||(LA12_0 >= '(' && LA12_0 <= '[')||(LA12_0 >= ']' && LA12_0 <= '\uFFFF')) ) {
                    alt12=1;
                }
                else if ( (LA12_0=='\\') ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // RTLRule.g:370:12: ~ ( '\\'' | '\\\\' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // RTLRule.g:370:27: ESC
            	    {
            	    mESC(); if (state.failed) return ;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            match('\''); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "NON_OCL_STRING"
    public final void mNON_OCL_STRING() throws RecognitionException {
        try {
            int _type = NON_OCL_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:372:15: ( '\"' (~ ( '\"' | '\\\\' ) | ESC )* '\"' )
            // RTLRule.g:373:5: '\"' (~ ( '\"' | '\\\\' ) | ESC )* '\"'
            {
            match('\"'); if (state.failed) return ;

            // RTLRule.g:373:9: (~ ( '\"' | '\\\\' ) | ESC )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0 >= '\u0000' && LA13_0 <= '!')||(LA13_0 >= '#' && LA13_0 <= '[')||(LA13_0 >= ']' && LA13_0 <= '\uFFFF')) ) {
                    alt13=1;
                }
                else if ( (LA13_0=='\\') ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // RTLRule.g:373:11: ~ ( '\"' | '\\\\' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // RTLRule.g:373:25: ESC
            	    {
            	    mESC(); if (state.failed) return ;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            match('\"'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NON_OCL_STRING"

    // $ANTLR start "ESC"
    public final void mESC() throws RecognitionException {
        try {
            // RTLRule.g:386:5: ( '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT | '0' .. '3' ( '0' .. '7' ( '0' .. '7' )? )? | '4' .. '7' ( '0' .. '7' )? ) )
            // RTLRule.g:387:5: '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT | '0' .. '3' ( '0' .. '7' ( '0' .. '7' )? )? | '4' .. '7' ( '0' .. '7' )? )
            {
            match('\\'); if (state.failed) return ;

            // RTLRule.g:388:6: ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT | '0' .. '3' ( '0' .. '7' ( '0' .. '7' )? )? | '4' .. '7' ( '0' .. '7' )? )
            int alt17=11;
            switch ( input.LA(1) ) {
            case 'n':
                {
                alt17=1;
                }
                break;
            case 'r':
                {
                alt17=2;
                }
                break;
            case 't':
                {
                alt17=3;
                }
                break;
            case 'b':
                {
                alt17=4;
                }
                break;
            case 'f':
                {
                alt17=5;
                }
                break;
            case '\"':
                {
                alt17=6;
                }
                break;
            case '\'':
                {
                alt17=7;
                }
                break;
            case '\\':
                {
                alt17=8;
                }
                break;
            case 'u':
                {
                alt17=9;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
                {
                alt17=10;
                }
                break;
            case '4':
            case '5':
            case '6':
            case '7':
                {
                alt17=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // RTLRule.g:388:8: 'n'
                    {
                    match('n'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // RTLRule.g:389:8: 'r'
                    {
                    match('r'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // RTLRule.g:390:8: 't'
                    {
                    match('t'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // RTLRule.g:391:8: 'b'
                    {
                    match('b'); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // RTLRule.g:392:8: 'f'
                    {
                    match('f'); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // RTLRule.g:393:8: '\"'
                    {
                    match('\"'); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // RTLRule.g:394:8: '\\''
                    {
                    match('\''); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // RTLRule.g:395:8: '\\\\'
                    {
                    match('\\'); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // RTLRule.g:396:8: 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
                    {
                    match('u'); if (state.failed) return ;

                    mHEX_DIGIT(); if (state.failed) return ;


                    mHEX_DIGIT(); if (state.failed) return ;


                    mHEX_DIGIT(); if (state.failed) return ;


                    mHEX_DIGIT(); if (state.failed) return ;


                    }
                    break;
                case 10 :
                    // RTLRule.g:397:8: '0' .. '3' ( '0' .. '7' ( '0' .. '7' )? )?
                    {
                    matchRange('0','3'); if (state.failed) return ;

                    // RTLRule.g:397:17: ( '0' .. '7' ( '0' .. '7' )? )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0 >= '0' && LA15_0 <= '7')) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // RTLRule.g:397:18: '0' .. '7' ( '0' .. '7' )?
                            {
                            matchRange('0','7'); if (state.failed) return ;

                            // RTLRule.g:397:27: ( '0' .. '7' )?
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( ((LA14_0 >= '0' && LA14_0 <= '7')) ) {
                                alt14=1;
                            }
                            switch (alt14) {
                                case 1 :
                                    // RTLRule.g:
                                    {
                                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                                        input.consume();
                                        state.failed=false;
                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return ;}
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;
                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 11 :
                    // RTLRule.g:397:45: '4' .. '7' ( '0' .. '7' )?
                    {
                    matchRange('4','7'); if (state.failed) return ;

                    // RTLRule.g:397:54: ( '0' .. '7' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0 >= '0' && LA16_0 <= '7')) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // RTLRule.g:
                            {
                            if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                                input.consume();
                                state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // RTLRule.g:403:10: ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )
            // RTLRule.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:410:6: ( ( '$' | 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // RTLRule.g:411:5: ( '$' | 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // RTLRule.g:411:39: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0 >= '0' && LA18_0 <= '9')||(LA18_0 >= 'A' && LA18_0 <= 'Z')||LA18_0=='_'||(LA18_0 >= 'a' && LA18_0 <= 'z')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // RTLRule.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "VOCAB"
    public final void mVOCAB() throws RecognitionException {
        try {
            // RTLRule.g:419:6: ( '\\U0003' .. '\\U0377' )
            // RTLRule.g:
            {
            if ( (input.LA(1) >= '\u0003' && input.LA(1) <= '\u0377') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOCAB"

    // $ANTLR start "COND_EXPR"
    public final void mCOND_EXPR() throws RecognitionException {
        try {
            int _type = COND_EXPR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RTLRule.g:426:5: ( ( '[' ) (~ ( ']' ) )* ( ']' ) )
            // RTLRule.g:427:5: ( '[' ) (~ ( ']' ) )* ( ']' )
            {
            // RTLRule.g:427:5: ( '[' )
            // RTLRule.g:427:6: '['
            {
            match('['); if (state.failed) return ;

            }


            // RTLRule.g:427:11: (~ ( ']' ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0 >= '\u0000' && LA19_0 <= '\\')||(LA19_0 >= '^' && LA19_0 <= '\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // RTLRule.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\\')||(input.LA(1) >= '^' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            // RTLRule.g:427:21: ( ']' )
            // RTLRule.g:427:22: ']'
            {
            match(']'); if (state.failed) return ;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COND_EXPR"

    public void mTokens() throws RecognitionException {
        // RTLRule.g:1:8: ( T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | WS | SL_COMMENT | ML_COMMENT | ARROW | AT | BAR | COLON | COLON_COLON | COLON_EQUAL | COMMA | DOT | DOTDOT | EQUAL | GREATER | GREATER_EQUAL | HASH | LBRACE | LBRACK | LESS | LESS_EQUAL | LPAREN | MINUS | NOT_EQUAL | PLUS | RBRACE | RBRACK | RPAREN | SEMI | SLASH | STAR | RANGE_OR_INT | STRING | NON_OCL_STRING | IDENT | COND_EXPR )
        int alt20=55;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // RTLRule.g:1:10: T__45
                {
                mT__45(); if (state.failed) return ;


                }
                break;
            case 2 :
                // RTLRule.g:1:16: T__46
                {
                mT__46(); if (state.failed) return ;


                }
                break;
            case 3 :
                // RTLRule.g:1:22: T__47
                {
                mT__47(); if (state.failed) return ;


                }
                break;
            case 4 :
                // RTLRule.g:1:28: T__48
                {
                mT__48(); if (state.failed) return ;


                }
                break;
            case 5 :
                // RTLRule.g:1:34: T__49
                {
                mT__49(); if (state.failed) return ;


                }
                break;
            case 6 :
                // RTLRule.g:1:40: T__50
                {
                mT__50(); if (state.failed) return ;


                }
                break;
            case 7 :
                // RTLRule.g:1:46: T__51
                {
                mT__51(); if (state.failed) return ;


                }
                break;
            case 8 :
                // RTLRule.g:1:52: T__52
                {
                mT__52(); if (state.failed) return ;


                }
                break;
            case 9 :
                // RTLRule.g:1:58: T__53
                {
                mT__53(); if (state.failed) return ;


                }
                break;
            case 10 :
                // RTLRule.g:1:64: T__54
                {
                mT__54(); if (state.failed) return ;


                }
                break;
            case 11 :
                // RTLRule.g:1:70: T__55
                {
                mT__55(); if (state.failed) return ;


                }
                break;
            case 12 :
                // RTLRule.g:1:76: T__56
                {
                mT__56(); if (state.failed) return ;


                }
                break;
            case 13 :
                // RTLRule.g:1:82: T__57
                {
                mT__57(); if (state.failed) return ;


                }
                break;
            case 14 :
                // RTLRule.g:1:88: T__58
                {
                mT__58(); if (state.failed) return ;


                }
                break;
            case 15 :
                // RTLRule.g:1:94: T__59
                {
                mT__59(); if (state.failed) return ;


                }
                break;
            case 16 :
                // RTLRule.g:1:100: T__60
                {
                mT__60(); if (state.failed) return ;


                }
                break;
            case 17 :
                // RTLRule.g:1:106: T__61
                {
                mT__61(); if (state.failed) return ;


                }
                break;
            case 18 :
                // RTLRule.g:1:112: T__62
                {
                mT__62(); if (state.failed) return ;


                }
                break;
            case 19 :
                // RTLRule.g:1:118: T__63
                {
                mT__63(); if (state.failed) return ;


                }
                break;
            case 20 :
                // RTLRule.g:1:124: T__64
                {
                mT__64(); if (state.failed) return ;


                }
                break;
            case 21 :
                // RTLRule.g:1:130: WS
                {
                mWS(); if (state.failed) return ;


                }
                break;
            case 22 :
                // RTLRule.g:1:133: SL_COMMENT
                {
                mSL_COMMENT(); if (state.failed) return ;


                }
                break;
            case 23 :
                // RTLRule.g:1:144: ML_COMMENT
                {
                mML_COMMENT(); if (state.failed) return ;


                }
                break;
            case 24 :
                // RTLRule.g:1:155: ARROW
                {
                mARROW(); if (state.failed) return ;


                }
                break;
            case 25 :
                // RTLRule.g:1:161: AT
                {
                mAT(); if (state.failed) return ;


                }
                break;
            case 26 :
                // RTLRule.g:1:164: BAR
                {
                mBAR(); if (state.failed) return ;


                }
                break;
            case 27 :
                // RTLRule.g:1:168: COLON
                {
                mCOLON(); if (state.failed) return ;


                }
                break;
            case 28 :
                // RTLRule.g:1:174: COLON_COLON
                {
                mCOLON_COLON(); if (state.failed) return ;


                }
                break;
            case 29 :
                // RTLRule.g:1:186: COLON_EQUAL
                {
                mCOLON_EQUAL(); if (state.failed) return ;


                }
                break;
            case 30 :
                // RTLRule.g:1:198: COMMA
                {
                mCOMMA(); if (state.failed) return ;


                }
                break;
            case 31 :
                // RTLRule.g:1:204: DOT
                {
                mDOT(); if (state.failed) return ;


                }
                break;
            case 32 :
                // RTLRule.g:1:208: DOTDOT
                {
                mDOTDOT(); if (state.failed) return ;


                }
                break;
            case 33 :
                // RTLRule.g:1:215: EQUAL
                {
                mEQUAL(); if (state.failed) return ;


                }
                break;
            case 34 :
                // RTLRule.g:1:221: GREATER
                {
                mGREATER(); if (state.failed) return ;


                }
                break;
            case 35 :
                // RTLRule.g:1:229: GREATER_EQUAL
                {
                mGREATER_EQUAL(); if (state.failed) return ;


                }
                break;
            case 36 :
                // RTLRule.g:1:243: HASH
                {
                mHASH(); if (state.failed) return ;


                }
                break;
            case 37 :
                // RTLRule.g:1:248: LBRACE
                {
                mLBRACE(); if (state.failed) return ;


                }
                break;
            case 38 :
                // RTLRule.g:1:255: LBRACK
                {
                mLBRACK(); if (state.failed) return ;


                }
                break;
            case 39 :
                // RTLRule.g:1:262: LESS
                {
                mLESS(); if (state.failed) return ;


                }
                break;
            case 40 :
                // RTLRule.g:1:267: LESS_EQUAL
                {
                mLESS_EQUAL(); if (state.failed) return ;


                }
                break;
            case 41 :
                // RTLRule.g:1:278: LPAREN
                {
                mLPAREN(); if (state.failed) return ;


                }
                break;
            case 42 :
                // RTLRule.g:1:285: MINUS
                {
                mMINUS(); if (state.failed) return ;


                }
                break;
            case 43 :
                // RTLRule.g:1:291: NOT_EQUAL
                {
                mNOT_EQUAL(); if (state.failed) return ;


                }
                break;
            case 44 :
                // RTLRule.g:1:301: PLUS
                {
                mPLUS(); if (state.failed) return ;


                }
                break;
            case 45 :
                // RTLRule.g:1:306: RBRACE
                {
                mRBRACE(); if (state.failed) return ;


                }
                break;
            case 46 :
                // RTLRule.g:1:313: RBRACK
                {
                mRBRACK(); if (state.failed) return ;


                }
                break;
            case 47 :
                // RTLRule.g:1:320: RPAREN
                {
                mRPAREN(); if (state.failed) return ;


                }
                break;
            case 48 :
                // RTLRule.g:1:327: SEMI
                {
                mSEMI(); if (state.failed) return ;


                }
                break;
            case 49 :
                // RTLRule.g:1:332: SLASH
                {
                mSLASH(); if (state.failed) return ;


                }
                break;
            case 50 :
                // RTLRule.g:1:338: STAR
                {
                mSTAR(); if (state.failed) return ;


                }
                break;
            case 51 :
                // RTLRule.g:1:343: RANGE_OR_INT
                {
                mRANGE_OR_INT(); if (state.failed) return ;


                }
                break;
            case 52 :
                // RTLRule.g:1:356: STRING
                {
                mSTRING(); if (state.failed) return ;


                }
                break;
            case 53 :
                // RTLRule.g:1:363: NON_OCL_STRING
                {
                mNON_OCL_STRING(); if (state.failed) return ;


                }
                break;
            case 54 :
                // RTLRule.g:1:378: IDENT
                {
                mIDENT(); if (state.failed) return ;


                }
                break;
            case 55 :
                // RTLRule.g:1:384: COND_EXPR
                {
                mCOND_EXPR(); if (state.failed) return ;


                }
                break;

        }

    }

    // $ANTLR start synpred1_RTLRule
    public final void synpred1_RTLRule_fragment() throws RecognitionException {
        // RTLRule.g:363:7: ( INT '..' )
        // RTLRule.g:363:9: INT '..'
        {
        mINT(); if (state.failed) return ;


        match(".."); if (state.failed) return ;



        }

    }
    // $ANTLR end synpred1_RTLRule

    // $ANTLR start synpred2_RTLRule
    public final void synpred2_RTLRule_fragment() throws RecognitionException {
        // RTLRule.g:364:7: ( REAL )
        // RTLRule.g:364:9: REAL
        {
        mREAL(); if (state.failed) return ;


        }

    }
    // $ANTLR end synpred2_RTLRule

    public final boolean synpred1_RTLRule() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_RTLRule_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_RTLRule() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_RTLRule_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\1\uffff\15\46\1\uffff\1\72\1\74\2\uffff\1\77\1\uffff\1\101\1\uffff"+
        "\1\103\2\uffff\1\104\1\110\13\uffff\2\46\1\113\4\46\1\120\2\46\1"+
        "\123\1\125\5\46\21\uffff\2\46\1\uffff\2\46\1\uffff\1\46\1\uffff"+
        "\1\140\1\46\1\uffff\1\46\1\uffff\12\46\1\uffff\2\46\1\157\1\160"+
        "\4\46\1\165\5\46\2\uffff\2\46\1\177\1\46\1\uffff\11\46\1\uffff\6"+
        "\46\1\u0090\3\46\1\u0094\1\u0095\4\46\1\uffff\3\46\2\uffff\1\u009d"+
        "\2\46\1\u00a0\3\46\1\uffff\2\46\1\uffff\3\46\1\u00a9\1\u00aa\1\u00ab"+
        "\2\46\3\uffff\5\46\1\u00b3\1\u00b4\2\uffff";
    static final String DFA20_eofS =
        "\u00b5\uffff";
    static final String DFA20_minS =
        "\1\11\1\130\1\160\1\141\1\150\1\151\1\156\1\157\1\146\1\157\1\165"+
        "\1\171\1\162\1\150\1\uffff\1\52\1\55\2\uffff\1\72\1\uffff\1\56\1"+
        "\uffff\1\75\2\uffff\1\0\1\75\13\uffff\1\120\1\160\1\60\1\143\1\145"+
        "\1\55\1\162\1\60\1\144\1\162\2\60\1\144\1\154\1\156\1\141\1\151"+
        "\21\uffff\1\114\1\154\1\uffff\1\153\1\143\1\uffff\1\145\1\uffff"+
        "\1\60\1\167\1\uffff\1\145\1\uffff\2\145\1\143\1\156\1\154\1\111"+
        "\1\171\1\167\1\153\1\143\1\uffff\1\141\1\147\2\60\1\150\1\163\1"+
        "\145\1\103\1\60\1\141\1\103\1\164\2\162\2\uffff\1\162\1\146\1\60"+
        "\1\111\1\uffff\1\162\2\157\1\141\1\151\1\144\1\141\2\157\1\uffff"+
        "\1\124\1\144\1\162\1\165\1\162\1\157\1\60\1\164\1\156\1\162\2\60"+
        "\2\162\1\147\1\156\1\uffff\2\151\1\155\2\uffff\1\60\1\143\1\145"+
        "\1\60\1\157\1\172\1\141\1\uffff\1\145\1\164\1\uffff\1\156\1\141"+
        "\1\164\3\60\1\164\1\151\3\uffff\1\151\2\157\2\156\2\60\2\uffff";
    static final String DFA20_maxS =
        "\1\175\1\130\1\163\1\141\2\157\1\156\1\157\1\156\1\157\1\165\1\171"+
        "\1\162\1\150\1\uffff\1\57\1\76\2\uffff\1\75\1\uffff\1\56\1\uffff"+
        "\1\75\2\uffff\1\uffff\1\76\13\uffff\1\120\1\160\1\172\1\143\1\145"+
        "\1\55\1\162\1\172\1\144\1\162\2\172\1\144\1\154\1\156\1\141\1\151"+
        "\21\uffff\1\114\1\154\1\uffff\1\153\1\143\1\uffff\1\145\1\uffff"+
        "\1\172\1\167\1\uffff\1\145\1\uffff\2\145\1\143\1\156\1\154\1\111"+
        "\1\171\1\167\1\153\1\143\1\uffff\1\141\1\147\2\172\1\150\1\163\1"+
        "\145\1\103\1\172\1\141\1\124\1\164\2\162\2\uffff\1\162\1\146\1\172"+
        "\1\111\1\uffff\1\162\2\157\1\141\1\151\1\144\1\141\2\157\1\uffff"+
        "\1\124\1\144\1\162\1\165\1\162\1\157\1\172\1\164\1\156\1\162\2\172"+
        "\2\162\1\147\1\156\1\uffff\2\151\1\155\2\uffff\1\172\1\143\1\145"+
        "\1\172\1\157\1\172\1\141\1\uffff\1\145\1\164\1\uffff\1\156\1\141"+
        "\1\164\3\172\1\164\1\151\3\uffff\1\151\2\157\2\156\2\172\2\uffff";
    static final String DFA20_acceptS =
        "\16\uffff\1\25\2\uffff\1\31\1\32\1\uffff\1\36\1\uffff\1\41\1\uffff"+
        "\1\44\1\45\2\uffff\1\51\1\54\1\55\1\56\1\57\1\60\1\62\1\63\1\64"+
        "\1\65\1\66\21\uffff\1\26\1\27\1\61\1\30\1\52\1\34\1\35\1\33\1\40"+
        "\1\37\1\43\1\42\1\46\1\67\1\50\1\53\1\47\2\uffff\1\3\2\uffff\1\10"+
        "\1\uffff\1\12\2\uffff\1\15\1\uffff\1\16\12\uffff\1\13\16\uffff\1"+
        "\20\1\21\4\uffff\1\2\11\uffff\1\24\20\uffff\1\14\3\uffff\1\1\1\4"+
        "\7\uffff\1\5\2\uffff\1\11\10\uffff\1\6\1\7\1\17\7\uffff\1\23\1\22";
    static final String DFA20_specialS =
        "\32\uffff\1\0\u009a\uffff}>";
    static final String[] DFA20_transitionS = {
            "\2\16\1\uffff\2\16\22\uffff\1\16\1\uffff\1\45\1\30\1\46\2\uffff"+
            "\1\44\1\34\1\40\1\42\1\35\1\24\1\20\1\25\1\17\12\43\1\23\1\41"+
            "\1\33\1\26\1\27\1\uffff\1\21\4\46\1\1\25\46\1\32\1\uffff\1\37"+
            "\1\uffff\1\46\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\2\46\1\10\3\46"+
            "\1\11\4\46\1\12\1\13\1\14\2\46\1\15\3\46\1\31\1\22\1\36",
            "\1\47",
            "\1\50\2\uffff\1\51",
            "\1\52",
            "\1\53\6\uffff\1\54",
            "\1\55\5\uffff\1\56",
            "\1\57",
            "\1\60",
            "\1\61\7\uffff\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "",
            "\1\71\4\uffff\1\70",
            "\1\70\20\uffff\1\73",
            "",
            "",
            "\1\75\2\uffff\1\76",
            "",
            "\1\100",
            "",
            "\1\102",
            "",
            "",
            "\0\105",
            "\1\106\1\107",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\111",
            "\1\112",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\121",
            "\1\122",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46\1\124\6\46",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\133",
            "\1\134",
            "",
            "\1\135",
            "\1\136",
            "",
            "\1\137",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\141",
            "",
            "\1\142",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "",
            "\1\155",
            "\1\156",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\166",
            "\1\167\17\uffff\1\170\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "",
            "",
            "\1\175",
            "\1\176",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0080",
            "",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u009e",
            "\1\u009f",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00ac",
            "\1\u00ad",
            "",
            "",
            "",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | WS | SL_COMMENT | ML_COMMENT | ARROW | AT | BAR | COLON | COLON_COLON | COLON_EQUAL | COMMA | DOT | DOTDOT | EQUAL | GREATER | GREATER_EQUAL | HASH | LBRACE | LBRACK | LESS | LESS_EQUAL | LPAREN | MINUS | NOT_EQUAL | PLUS | RBRACE | RBRACK | RPAREN | SEMI | SLASH | STAR | RANGE_OR_INT | STRING | NON_OCL_STRING | IDENT | COND_EXPR );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_26 = input.LA(1);

                        s = -1;
                        if ( ((LA20_26 >= '\u0000' && LA20_26 <= '\uFFFF')) ) {s = 69;}

                        else s = 68;

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}