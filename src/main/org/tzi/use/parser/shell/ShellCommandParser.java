// $ANTLR 3.4 ShellCommand.g 2013-03-09 16:24:47

/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2010 University of Bremen
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
 
 
package org.tzi.use.parser.shell;

import org.tzi.use.parser.base.BaseParser;
import org.tzi.use.parser.ocl.*;
import org.tzi.use.parser.soil.ast.*;
import java.util.Collections;
import java.util.Arrays;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ShellCommandParser extends BaseParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "BAR", "COLON", "COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "EQUAL", "ESC", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "INT", "LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MINUS", "ML_COMMENT", "NEWLINE", "NON_OCL_STRING", "NOT_EQUAL", "PLUS", "RANGE_OR_INT", "RBRACE", "RBRACK", "REAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "STRING", "VOCAB", "WS", "'Bag'", "'Collection'", "'OrderedSet'", "'Sequence'", "'Set'", "'Tuple'", "'Undefined'", "'allInstances'", "'and'", "'assign'", "'begin'", "'between'", "'create'", "'declare'", "'delete'", "'destroy'", "'div'", "'do'", "'else'", "'end'", "'endif'", "'execute'", "'false'", "'for'", "'from'", "'if'", "'implies'", "'in'", "'insert'", "'into'", "'iterate'", "'let'", "'new'", "'not'", "'null'", "'oclAsType'", "'oclEmpty'", "'oclIsKindOf'", "'oclIsTypeOf'", "'oclUndefined'", "'openter'", "'opexit'", "'or'", "'pre'", "'set'", "'then'", "'true'", "'while'", "'xor'"
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


    public ShellCommandParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ShellCommandParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return ShellCommandParser.tokenNames; }
    public String getGrammarFileName() { return "ShellCommand.g"; }



    // $ANTLR start "shellCommandOnly"
    // ShellCommand.g:85:1: shellCommandOnly returns [ASTStatement n] : ( ( stat )=>s= stat | ( legacyStat )=>l= legacyStat );
    public final ASTStatement shellCommandOnly() throws RecognitionException {
        ASTStatement n = null;


        ShellCommandParser.stat_return s =null;

        ShellCommandParser.legacyStat_return l =null;


        try {
            // ShellCommand.g:86:3: ( ( stat )=>s= stat | ( legacyStat )=>l= legacyStat )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==SEMI) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==EOF) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==75) ) {
                int LA1_3 = input.LA(2);

                if ( (synpred1_ShellCommand()) ) {
                    alt1=1;
                }
                else if ( (synpred2_ShellCommand()) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;

                }
            }
            else if ( (LA1_0==MINUS||LA1_0==PLUS||LA1_0==77) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==90) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==66) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==INT) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==REAL) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==STRING) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==HASH) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==IDENT) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==44||(LA1_0 >= 46 && LA1_0 <= 48)) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==80) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==45) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==83) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==50) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==78) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==49) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==AT) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==74) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==79||(LA1_0 >= 81 && LA1_0 <= 82)) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==LPAREN) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==69) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==76) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==59) ) {
                int LA1_25 = input.LA(2);

                if ( (synpred1_ShellCommand()) ) {
                    alt1=1;
                }
                else if ( (synpred2_ShellCommand()) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 25, input);

                    throw nvae;

                }
            }
            else if ( (LA1_0==72) ) {
                int LA1_26 = input.LA(2);

                if ( (synpred1_ShellCommand()) ) {
                    alt1=1;
                }
                else if ( (synpred2_ShellCommand()) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 26, input);

                    throw nvae;

                }
            }
            else if ( (LA1_0==58) ) {
                int LA1_27 = input.LA(2);

                if ( (synpred1_ShellCommand()) ) {
                    alt1=1;
                }
                else if ( (synpred2_ShellCommand()) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 27, input);

                    throw nvae;

                }
            }
            else if ( (LA1_0==67) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==91) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==54) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==84) && (synpred2_ShellCommand())) {
                alt1=2;
            }
            else if ( (LA1_0==85) && (synpred2_ShellCommand())) {
                alt1=2;
            }
            else if ( (LA1_0==56) && (synpred2_ShellCommand())) {
                alt1=2;
            }
            else if ( (LA1_0==53) && (synpred2_ShellCommand())) {
                alt1=2;
            }
            else if ( (LA1_0==65) && (synpred2_ShellCommand())) {
                alt1=2;
            }
            else if ( (LA1_0==88) && (synpred2_ShellCommand())) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // ShellCommand.g:87:3: ( stat )=>s= stat
                    {
                    pushFollow(FOLLOW_stat_in_shellCommandOnly65);
                    s=stat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (s!=null?s.n:null); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:90:3: ( legacyStat )=>l= legacyStat
                    {
                    pushFollow(FOLLOW_legacyStat_in_shellCommandOnly86);
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
    // ShellCommand.g:98:1: shellCommand returns [ASTStatement n] : ( ( legacyStat )=>l= legacyStat EOF | ( stat )=>s= stat EOF );
    public final ASTStatement shellCommand() throws RecognitionException {
        ASTStatement n = null;


        ShellCommandParser.legacyStat_return l =null;

        ShellCommandParser.stat_return s =null;


        try {
            // ShellCommand.g:99:3: ( ( legacyStat )=>l= legacyStat EOF | ( stat )=>s= stat EOF )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==84) && (synpred3_ShellCommand())) {
                alt2=1;
            }
            else if ( (LA2_0==85) && (synpred3_ShellCommand())) {
                alt2=1;
            }
            else if ( (LA2_0==56) && (synpred3_ShellCommand())) {
                alt2=1;
            }
            else if ( (LA2_0==53) && (synpred3_ShellCommand())) {
                alt2=1;
            }
            else if ( (LA2_0==75) ) {
                int LA2_5 = input.LA(2);

                if ( (synpred3_ShellCommand()) ) {
                    alt2=1;
                }
                else if ( (synpred4_ShellCommand()) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 5, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==65) && (synpred3_ShellCommand())) {
                alt2=1;
            }
            else if ( (LA2_0==59) ) {
                int LA2_7 = input.LA(2);

                if ( (synpred3_ShellCommand()) ) {
                    alt2=1;
                }
                else if ( (synpred4_ShellCommand()) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 7, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==88) && (synpred3_ShellCommand())) {
                alt2=1;
            }
            else if ( (LA2_0==72) ) {
                int LA2_9 = input.LA(2);

                if ( (synpred3_ShellCommand()) ) {
                    alt2=1;
                }
                else if ( (synpred4_ShellCommand()) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 9, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==58) ) {
                int LA2_10 = input.LA(2);

                if ( (synpred3_ShellCommand()) ) {
                    alt2=1;
                }
                else if ( (synpred4_ShellCommand()) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 10, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==SEMI) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==EOF) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==MINUS||LA2_0==PLUS||LA2_0==77) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==90) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==66) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==INT) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==REAL) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==STRING) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==HASH) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==IDENT) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==44||(LA2_0 >= 46 && LA2_0 <= 48)) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==80) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==45) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==83) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==50) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==78) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==49) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==AT) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==74) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==79||(LA2_0 >= 81 && LA2_0 <= 82)) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==LPAREN) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==69) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==76) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==67) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==91) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==54) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // ShellCommand.g:100:3: ( legacyStat )=>l= legacyStat EOF
                    {
                    pushFollow(FOLLOW_legacyStat_in_shellCommand118);
                    l=legacyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EOF,FOLLOW_EOF_in_shellCommand120); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (l!=null?l.n:null); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:103:3: ( stat )=>s= stat EOF
                    {
                    pushFollow(FOLLOW_stat_in_shellCommand141);
                    s=stat();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EOF,FOLLOW_EOF_in_shellCommand143); if (state.failed) return n;

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
    // ShellCommand.g:113:1: legacyStat returns [ASTStatement n] : (loe= legacyOpEnter |lox= legacyOpExit | nextLegacyStat[seq] ( nextLegacyStat[seq] )* );
    public final ShellCommandParser.legacyStat_return legacyStat() throws RecognitionException {
        ShellCommandParser.legacyStat_return retval = new ShellCommandParser.legacyStat_return();
        retval.start = input.LT(1);


        ASTEnterOperationStatement loe =null;

        ASTStatement lox =null;



          ASTSequenceStatement seq = new ASTSequenceStatement();

        try {
            // ShellCommand.g:117:3: (loe= legacyOpEnter |lox= legacyOpExit | nextLegacyStat[seq] ( nextLegacyStat[seq] )* )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt4=1;
                }
                break;
            case 85:
                {
                alt4=2;
                }
                break;
            case 53:
            case 56:
            case 58:
            case 59:
            case 65:
            case 72:
            case 75:
            case 88:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // ShellCommand.g:118:3: loe= legacyOpEnter
                    {
                    pushFollow(FOLLOW_legacyOpEnter_in_legacyStat177);
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
                    // ShellCommand.g:126:3: lox= legacyOpExit
                    {
                    pushFollow(FOLLOW_legacyOpExit_in_legacyStat193);
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
                    // ShellCommand.g:134:3: nextLegacyStat[seq] ( nextLegacyStat[seq] )*
                    {
                    pushFollow(FOLLOW_nextLegacyStat_in_legacyStat206);
                    nextLegacyStat(seq);

                    state._fsp--;
                    if (state.failed) return retval;

                    // ShellCommand.g:135:3: ( nextLegacyStat[seq] )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==53||LA3_0==56||(LA3_0 >= 58 && LA3_0 <= 59)||LA3_0==65||LA3_0==72||LA3_0==75||LA3_0==88) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ShellCommand.g:136:5: nextLegacyStat[seq]
                    	    {
                    	    pushFollow(FOLLOW_nextLegacyStat_in_legacyStat217);
                    	    nextLegacyStat(seq);

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
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
    // ShellCommand.g:149:1: nextLegacyStat[ASTSequenceStatement seq] : s= singleLegacyStat ( SEMI )? ;
    public final ShellCommandParser.nextLegacyStat_return nextLegacyStat(ASTSequenceStatement seq) throws RecognitionException {
        ShellCommandParser.nextLegacyStat_return retval = new ShellCommandParser.nextLegacyStat_return();
        retval.start = input.LT(1);


        ASTStatement s =null;


        try {
            // ShellCommand.g:150:3: (s= singleLegacyStat ( SEMI )? )
            // ShellCommand.g:151:3: s= singleLegacyStat ( SEMI )?
            {
            pushFollow(FOLLOW_singleLegacyStat_in_nextLegacyStat251);
            s=singleLegacyStat();

            state._fsp--;
            if (state.failed) return retval;

            // ShellCommand.g:152:3: ( SEMI )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==SEMI) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ShellCommand.g:152:3: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_nextLegacyStat255); if (state.failed) return retval;

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
    // ShellCommand.g:165:1: singleLegacyStat returns [ASTStatement n] : (lcr= legacyCreate |lca= legacyCreateAssign |lci= legacyCreateInsert |llt= legacyLet |lex= legacyExecute |ods= objDestroyStat | 'set' e= expression aas= attAssignStat[$e.n] |lis= lnkInsStat |lds= lnkDelStat );
    public final ASTStatement singleLegacyStat() throws RecognitionException {
        ASTStatement n = null;


        ShellCommandParser.legacyCreate_return lcr =null;

        ShellCommandParser.legacyCreateAssign_return lca =null;

        ShellCommandParser.legacyCreateInsert_return lci =null;

        ASTVariableAssignmentStatement llt =null;

        ASTStatement lex =null;

        ShellCommandParser.objDestroyStat_return ods =null;

        ShellCommandParser.expression_return e =null;

        ASTAttributeAssignmentStatement aas =null;

        ASTLinkInsertionStatement lis =null;

        ASTLinkDeletionStatement lds =null;


        try {
            // ShellCommand.g:166:5: (lcr= legacyCreate |lca= legacyCreateAssign |lci= legacyCreateInsert |llt= legacyLet |lex= legacyExecute |ods= objDestroyStat | 'set' e= expression aas= attAssignStat[$e.n] |lis= lnkInsStat |lds= lnkDelStat )
            int alt6=9;
            switch ( input.LA(1) ) {
            case 56:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==IDENT) ) {
                    int LA6_9 = input.LA(3);

                    if ( (LA6_9==COLON) ) {
                        int LA6_10 = input.LA(4);

                        if ( (LA6_10==IDENT) ) {
                            int LA6_12 = input.LA(5);

                            if ( (LA6_12==55) ) {
                                alt6=3;
                            }
                            else if ( (LA6_12==EOF||LA6_12==SEMI||LA6_12==53||LA6_12==56||(LA6_12 >= 58 && LA6_12 <= 59)||LA6_12==65||LA6_12==72||LA6_12==75||LA6_12==88) ) {
                                alt6=1;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return n;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 12, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return n;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 10, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA6_9==COMMA) ) {
                        alt6=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 9, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
                }
                break;
            case 53:
                {
                alt6=2;
                }
                break;
            case 75:
                {
                alt6=4;
                }
                break;
            case 65:
                {
                alt6=5;
                }
                break;
            case 59:
                {
                alt6=6;
                }
                break;
            case 88:
                {
                alt6=7;
                }
                break;
            case 72:
                {
                alt6=8;
                }
                break;
            case 58:
                {
                alt6=9;
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
                    // ShellCommand.g:167:5: lcr= legacyCreate
                    {
                    pushFollow(FOLLOW_legacyCreate_in_singleLegacyStat288);
                    lcr=legacyCreate();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lcr!=null?lcr.n:null); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:168:5: lca= legacyCreateAssign
                    {
                    pushFollow(FOLLOW_legacyCreateAssign_in_singleLegacyStat307);
                    lca=legacyCreateAssign();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lca!=null?lca.n:null); }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:169:5: lci= legacyCreateInsert
                    {
                    pushFollow(FOLLOW_legacyCreateInsert_in_singleLegacyStat320);
                    lci=legacyCreateInsert();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lci!=null?lci.n:null); }

                    }
                    break;
                case 4 :
                    // ShellCommand.g:170:5: llt= legacyLet
                    {
                    pushFollow(FOLLOW_legacyLet_in_singleLegacyStat333);
                    llt=legacyLet();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = llt; }

                    }
                    break;
                case 5 :
                    // ShellCommand.g:173:5: lex= legacyExecute
                    {
                    pushFollow(FOLLOW_legacyExecute_in_singleLegacyStat361);
                    lex=legacyExecute();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = lex; }

                    }
                    break;
                case 6 :
                    // ShellCommand.g:174:5: ods= objDestroyStat
                    {
                    pushFollow(FOLLOW_objDestroyStat_in_singleLegacyStat379);
                    ods=objDestroyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ods!=null?ods.n:null); }

                    }
                    break;
                case 7 :
                    // ShellCommand.g:175:5: 'set' e= expression aas= attAssignStat[$e.n]
                    {
                    match(input,88,FOLLOW_88_in_singleLegacyStat392); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_singleLegacyStat396);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    pushFollow(FOLLOW_attAssignStat_in_singleLegacyStat402);
                    aas=attAssignStat((e!=null?e.n:null));

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = aas; }

                    }
                    break;
                case 8 :
                    // ShellCommand.g:176:5: lis= lnkInsStat
                    {
                    pushFollow(FOLLOW_lnkInsStat_in_singleLegacyStat415);
                    lis=lnkInsStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = lis; }

                    }
                    break;
                case 9 :
                    // ShellCommand.g:177:5: lds= lnkDelStat
                    {
                    pushFollow(FOLLOW_lnkDelStat_in_singleLegacyStat436);
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
    // ShellCommand.g:190:1: legacyCreate returns [ASTStatement n] : 'create' objNames= identListMin1 COLON objType= simpleType ;
    public final ShellCommandParser.legacyCreate_return legacyCreate() throws RecognitionException {
        ShellCommandParser.legacyCreate_return retval = new ShellCommandParser.legacyCreate_return();
        retval.start = input.LT(1);


        List<String> objNames =null;

        ASTSimpleType objType =null;


        try {
            // ShellCommand.g:191:3: ( 'create' objNames= identListMin1 COLON objType= simpleType )
            // ShellCommand.g:192:3: 'create' objNames= identListMin1 COLON objType= simpleType
            {
            match(input,56,FOLLOW_56_in_legacyCreate472); if (state.failed) return retval;

            pushFollow(FOLLOW_identListMin1_in_legacyCreate480);
            objNames=identListMin1();

            state._fsp--;
            if (state.failed) return retval;

            match(input,COLON,FOLLOW_COLON_in_legacyCreate484); if (state.failed) return retval;

            pushFollow(FOLLOW_simpleType_in_legacyCreate492);
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
    // ShellCommand.g:224:1: legacyCreateAssign returns [ASTStatement n] : 'assign' varNames= identListMin1 COLON_EQUAL 'create' objType= simpleType ;
    public final ShellCommandParser.legacyCreateAssign_return legacyCreateAssign() throws RecognitionException {
        ShellCommandParser.legacyCreateAssign_return retval = new ShellCommandParser.legacyCreateAssign_return();
        retval.start = input.LT(1);


        List<String> varNames =null;

        ASTSimpleType objType =null;


        try {
            // ShellCommand.g:225:3: ( 'assign' varNames= identListMin1 COLON_EQUAL 'create' objType= simpleType )
            // ShellCommand.g:226:3: 'assign' varNames= identListMin1 COLON_EQUAL 'create' objType= simpleType
            {
            match(input,53,FOLLOW_53_in_legacyCreateAssign529); if (state.failed) return retval;

            pushFollow(FOLLOW_identListMin1_in_legacyCreateAssign537);
            varNames=identListMin1();

            state._fsp--;
            if (state.failed) return retval;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_legacyCreateAssign541); if (state.failed) return retval;

            match(input,56,FOLLOW_56_in_legacyCreateAssign545); if (state.failed) return retval;

            pushFollow(FOLLOW_simpleType_in_legacyCreateAssign553);
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
    // ShellCommand.g:260:1: legacyCreateInsert returns [ASTVariableAssignmentStatement n] : 'create' name= IDENT COLON asClassName= simpleType 'between' LPAREN participants= rValListMin2WithOptionalQualifiers RPAREN ;
    public final ShellCommandParser.legacyCreateInsert_return legacyCreateInsert() throws RecognitionException {
        ShellCommandParser.legacyCreateInsert_return retval = new ShellCommandParser.legacyCreateInsert_return();
        retval.start = input.LT(1);


        Token name=null;
        ASTSimpleType asClassName =null;

        ShellCommandParser.rValListMin2WithOptionalQualifiers_return participants =null;


        try {
            // ShellCommand.g:261:3: ( 'create' name= IDENT COLON asClassName= simpleType 'between' LPAREN participants= rValListMin2WithOptionalQualifiers RPAREN )
            // ShellCommand.g:262:3: 'create' name= IDENT COLON asClassName= simpleType 'between' LPAREN participants= rValListMin2WithOptionalQualifiers RPAREN
            {
            match(input,56,FOLLOW_56_in_legacyCreateInsert587); if (state.failed) return retval;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_legacyCreateInsert595); if (state.failed) return retval;

            match(input,COLON,FOLLOW_COLON_in_legacyCreateInsert599); if (state.failed) return retval;

            pushFollow(FOLLOW_simpleType_in_legacyCreateInsert607);
            asClassName=simpleType();

            state._fsp--;
            if (state.failed) return retval;

            match(input,55,FOLLOW_55_in_legacyCreateInsert611); if (state.failed) return retval;

            match(input,LPAREN,FOLLOW_LPAREN_in_legacyCreateInsert615); if (state.failed) return retval;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_legacyCreateInsert625);
            participants=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return retval;

            match(input,RPAREN,FOLLOW_RPAREN_in_legacyCreateInsert629); if (state.failed) return retval;

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
    // ShellCommand.g:298:1: legacyLet returns [ASTVariableAssignmentStatement n] : 'let' varName= IDENT ( COLON varType= type )? EQUAL e= inSoilExpression ;
    public final ASTVariableAssignmentStatement legacyLet() throws RecognitionException {
        ASTVariableAssignmentStatement n = null;


        Token varName=null;
        ASTType varType =null;

        ASTExpression e =null;


        try {
            // ShellCommand.g:299:3: ( 'let' varName= IDENT ( COLON varType= type )? EQUAL e= inSoilExpression )
            // ShellCommand.g:300:3: 'let' varName= IDENT ( COLON varType= type )? EQUAL e= inSoilExpression
            {
            match(input,75,FOLLOW_75_in_legacyLet662); if (state.failed) return n;

            varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_legacyLet670); if (state.failed) return n;

            // ShellCommand.g:302:3: ( COLON varType= type )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==COLON) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ShellCommand.g:303:5: COLON varType= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_legacyLet680); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_legacyLet690);
                    varType=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            match(input,EQUAL,FOLLOW_EQUAL_in_legacyLet699); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_legacyLet707);
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
    // ShellCommand.g:324:1: legacyOpEnter returns [ASTEnterOperationStatement n] : 'openter' obj= inSoilExpression op= IDENT LPAREN args= exprList RPAREN ;
    public final ASTEnterOperationStatement legacyOpEnter() throws RecognitionException {
        ASTEnterOperationStatement n = null;


        Token op=null;
        ASTExpression obj =null;

        List<ASTExpression> args =null;


        try {
            // ShellCommand.g:325:3: ( 'openter' obj= inSoilExpression op= IDENT LPAREN args= exprList RPAREN )
            // ShellCommand.g:326:3: 'openter' obj= inSoilExpression op= IDENT LPAREN args= exprList RPAREN
            {
            match(input,84,FOLLOW_84_in_legacyOpEnter740); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_legacyOpEnter748);
            obj=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_legacyOpEnter756); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_legacyOpEnter760); if (state.failed) return n;

            pushFollow(FOLLOW_exprList_in_legacyOpEnter770);
            args=exprList();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_legacyOpEnter774); if (state.failed) return n;

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
    // ShellCommand.g:349:1: legacyOpExit returns [ASTStatement n] : 'opexit' ( ( inSoilExpression )=>retVal= inSoilExpression | nothing ) ;
    public final ASTStatement legacyOpExit() throws RecognitionException {
        ASTStatement n = null;


        ASTExpression retVal =null;


        try {
            // ShellCommand.g:350:3: ( 'opexit' ( ( inSoilExpression )=>retVal= inSoilExpression | nothing ) )
            // ShellCommand.g:351:3: 'opexit' ( ( inSoilExpression )=>retVal= inSoilExpression | nothing )
            {
            match(input,85,FOLLOW_85_in_legacyOpExit809); if (state.failed) return n;

            // ShellCommand.g:351:12: ( ( inSoilExpression )=>retVal= inSoilExpression | nothing )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==75) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==MINUS||LA8_0==PLUS||LA8_0==77) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==90) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==66) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==INT) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==REAL) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==STRING) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==HASH) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==IDENT) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==44||(LA8_0 >= 46 && LA8_0 <= 48)) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==80) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==45) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==83) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==50) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==78) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==49) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==AT) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==74) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==79||(LA8_0 >= 81 && LA8_0 <= 82)) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==LPAREN) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==69) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==EOF) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // ShellCommand.g:351:13: ( inSoilExpression )=>retVal= inSoilExpression
                    {
                    pushFollow(FOLLOW_inSoilExpression_in_legacyOpExit821);
                    retVal=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 2 :
                    // ShellCommand.g:351:62: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_legacyOpExit825);
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
    // ShellCommand.g:366:1: legacyExecute returns [ASTStatement n] : 'execute' expression ;
    public final ASTStatement legacyExecute() throws RecognitionException {
        ASTStatement n = null;


        try {
            // ShellCommand.g:367:3: ( 'execute' expression )
            // ShellCommand.g:368:3: 'execute' expression
            {
            match(input,65,FOLLOW_65_in_legacyExecute858); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_legacyExecute862);
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



    // $ANTLR start "expressionOnly"
    // ShellCommand.g:404:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
    public final ASTExpression expressionOnly() throws RecognitionException {
        ASTExpression n = null;


        ShellCommandParser.expression_return nExp =null;


        try {
            // ShellCommand.g:405:5: (nExp= expression EOF )
            // ShellCommand.g:406:5: nExp= expression EOF
            {
            pushFollow(FOLLOW_expression_in_expressionOnly896);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_expressionOnly898); if (state.failed) return n;

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
    // ShellCommand.g:413:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression ;
    public final ShellCommandParser.expression_return expression() throws RecognitionException {
        ShellCommandParser.expression_return retval = new ShellCommandParser.expression_return();
        retval.start = input.LT(1);


        Token name=null;
        ASTType t =null;

        ShellCommandParser.expression_return e1 =null;

        ASTExpression nCndImplies =null;


         
          ASTLetExpression prevLet = null, firstLet = null;
          ASTExpression e2;
          Token tok = null;

        try {
            // ShellCommand.g:419:5: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression )
            // ShellCommand.g:420:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of expression */ }

            // ShellCommand.g:421:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==75) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ShellCommand.g:422:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in'
            	    {
            	    match(input,75,FOLLOW_75_in_expression946); if (state.failed) return retval;

            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression950); if (state.failed) return retval;

            	    // ShellCommand.g:422:24: ( COLON t= type )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==COLON) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // ShellCommand.g:422:26: COLON t= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expression954); if (state.failed) return retval;

            	            pushFollow(FOLLOW_type_in_expression958);
            	            t=type();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_expression963); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expression_in_expression967);
            	    e1=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    match(input,71,FOLLOW_71_in_expression969); if (state.failed) return retval;

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
            	    break loop10;
                }
            } while (true);


            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression994);
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
    // ShellCommand.g:450:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
    public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
        List<ASTVariableDeclaration> paramList = null;


        ASTVariableDeclaration v =null;


         paramList = new ArrayList<ASTVariableDeclaration>(); 
        try {
            // ShellCommand.g:452:5: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
            // ShellCommand.g:453:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_paramList1027); if (state.failed) return paramList;

            // ShellCommand.g:454:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==IDENT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ShellCommand.g:455:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_paramList1044);
                    v=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return paramList;

                    if ( state.backtracking==0 ) { paramList.add(v); }

                    // ShellCommand.g:456:7: ( COMMA v= variableDeclaration )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==COMMA) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ShellCommand.g:456:9: COMMA v= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_paramList1056); if (state.failed) return paramList;

                    	    pushFollow(FOLLOW_variableDeclaration_in_paramList1060);
                    	    v=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return paramList;

                    	    if ( state.backtracking==0 ) { paramList.add(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_paramList1080); if (state.failed) return paramList;

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
    // ShellCommand.g:464:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
    public final List idList() throws RecognitionException {
        List idList = null;


        Token id0=null;
        Token idn=null;

         idList = new ArrayList(); 
        try {
            // ShellCommand.g:466:5: (id0= IDENT ( COMMA idn= IDENT )* )
            // ShellCommand.g:467:5: id0= IDENT ( COMMA idn= IDENT )*
            {
            id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList1109); if (state.failed) return idList;

            if ( state.backtracking==0 ) { idList.add(id0); }

            // ShellCommand.g:468:5: ( COMMA idn= IDENT )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ShellCommand.g:468:7: COMMA idn= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_idList1119); if (state.failed) return idList;

            	    idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList1123); if (state.failed) return idList;

            	    if ( state.backtracking==0 ) { idList.add(idn); }

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ShellCommand.g:476:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
    public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
        ASTVariableDeclaration n = null;


        Token name=null;
        ASTType t =null;


        try {
            // ShellCommand.g:477:5: (name= IDENT COLON t= type )
            // ShellCommand.g:478:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration1154); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableDeclaration1156); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableDeclaration1160);
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
    // ShellCommand.g:486:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndOrExp =null;

        ASTExpression n1 =null;


        try {
            // ShellCommand.g:487:5: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
            // ShellCommand.g:488:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1196);
            nCndOrExp=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndOrExp;}

            // ShellCommand.g:489:5: (op= 'implies' n1= conditionalOrExpression )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==70) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ShellCommand.g:489:7: op= 'implies' n1= conditionalOrExpression
            	    {
            	    op=(Token)match(input,70,FOLLOW_70_in_conditionalImpliesExpression1209); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1213);
            	    n1=conditionalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ShellCommand.g:498:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndXorExp =null;

        ASTExpression n1 =null;


        try {
            // ShellCommand.g:499:5: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
            // ShellCommand.g:500:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
            {
            pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1258);
            nCndXorExp=conditionalXOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndXorExp;}

            // ShellCommand.g:501:5: (op= 'or' n1= conditionalXOrExpression )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==86) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ShellCommand.g:501:7: op= 'or' n1= conditionalXOrExpression
            	    {
            	    op=(Token)match(input,86,FOLLOW_86_in_conditionalOrExpression1271); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1275);
            	    n1=conditionalXOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ShellCommand.g:510:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalXOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndAndExp =null;

        ASTExpression n1 =null;


        try {
            // ShellCommand.g:511:5: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
            // ShellCommand.g:512:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1319);
            nCndAndExp=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndAndExp;}

            // ShellCommand.g:513:5: (op= 'xor' n1= conditionalAndExpression )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==92) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ShellCommand.g:513:7: op= 'xor' n1= conditionalAndExpression
            	    {
            	    op=(Token)match(input,92,FOLLOW_92_in_conditionalXOrExpression1332); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1336);
            	    n1=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

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
    // $ANTLR end "conditionalXOrExpression"



    // $ANTLR start "conditionalAndExpression"
    // ShellCommand.g:522:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nEqExp =null;

        ASTExpression n1 =null;


        try {
            // ShellCommand.g:523:5: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
            // ShellCommand.g:524:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression1380);
            nEqExp=equalityExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nEqExp;}

            // ShellCommand.g:525:5: (op= 'and' n1= equalityExpression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==52) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ShellCommand.g:525:7: op= 'and' n1= equalityExpression
            	    {
            	    op=(Token)match(input,52,FOLLOW_52_in_conditionalAndExpression1393); if (state.failed) return n;

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression1397);
            	    n1=equalityExpression();

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
    // $ANTLR end "conditionalAndExpression"



    // $ANTLR start "equalityExpression"
    // ShellCommand.g:534:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nRelExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // ShellCommand.g:536:5: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
            // ShellCommand.g:537:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1445);
            nRelExp=relationalExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nRelExp;}

            // ShellCommand.g:538:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==EQUAL||LA18_0==NOT_EQUAL) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ShellCommand.g:538:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
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


            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1474);
            	    n1=relationalExpression();

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
    // $ANTLR end "equalityExpression"



    // $ANTLR start "relationalExpression"
    // ShellCommand.g:548:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nAddiExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // ShellCommand.g:550:5: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
            // ShellCommand.g:551:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1523);
            nAddiExp=additiveExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nAddiExp;}

            // ShellCommand.g:552:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0 >= GREATER && LA19_0 <= GREATER_EQUAL)||(LA19_0 >= LESS && LA19_0 <= LESS_EQUAL)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ShellCommand.g:552:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
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


            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1559);
            	    n1=additiveExpression();

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
    // $ANTLR end "relationalExpression"



    // $ANTLR start "additiveExpression"
    // ShellCommand.g:562:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nMulExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // ShellCommand.g:564:5: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
            // ShellCommand.g:565:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1609);
            nMulExp=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nMulExp;}

            // ShellCommand.g:566:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==MINUS||LA20_0==PLUS) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ShellCommand.g:566:7: ( PLUS | MINUS ) n1= multiplicativeExpression
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


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1637);
            	    n1=multiplicativeExpression();

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
    // $ANTLR end "additiveExpression"



    // $ANTLR start "multiplicativeExpression"
    // ShellCommand.g:577:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // ShellCommand.g:579:5: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
            // ShellCommand.g:580:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1687);
            nUnExp=unaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nUnExp;}

            // ShellCommand.g:581:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==SLASH||LA21_0==STAR||LA21_0==60) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ShellCommand.g:581:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==60 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1719);
            	    n1=unaryExpression();

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
    // $ANTLR end "multiplicativeExpression"



    // $ANTLR start "unaryExpression"
    // ShellCommand.g:593:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression nPosExp =null;


         Token op = null; 
        try {
            // ShellCommand.g:595:7: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==MINUS||LA22_0==PLUS||LA22_0==77) ) {
                alt22=1;
            }
            else if ( (LA22_0==AT||LA22_0==HASH||(LA22_0 >= IDENT && LA22_0 <= INT)||LA22_0==LPAREN||LA22_0==REAL||LA22_0==STRING||(LA22_0 >= 44 && LA22_0 <= 50)||LA22_0==66||LA22_0==69||LA22_0==74||(LA22_0 >= 78 && LA22_0 <= 83)||LA22_0==90) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // ShellCommand.g:596:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    {
                    // ShellCommand.g:596:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    // ShellCommand.g:596:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
                    {
                    if ( state.backtracking==0 ) { op = input.LT(1); }

                    if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==77 ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1805);
                    nUnExp=unaryExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUnaryExpression(op, nUnExp); }

                    }


                    }
                    break;
                case 2 :
                    // ShellCommand.g:600:7: nPosExp= postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression1825);
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
    // ShellCommand.g:608:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
    public final ASTExpression postfixExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nPrimExp =null;

        ASTExpression nPc =null;


         boolean arrow = false; 
        try {
            // ShellCommand.g:610:5: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
            // ShellCommand.g:611:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression1858);
            nPrimExp=primaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nPrimExp; }

            // ShellCommand.g:612:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==DOT) ) {
                    int LA24_2 = input.LA(2);

                    if ( (LA24_2==IDENT) ) {
                        int LA24_4 = input.LA(3);

                        if ( (LA24_4==EOF||(LA24_4 >= ARROW && LA24_4 <= BAR)||(LA24_4 >= COMMA && LA24_4 <= EQUAL)||(LA24_4 >= GREATER && LA24_4 <= GREATER_EQUAL)||LA24_4==IDENT||(LA24_4 >= LBRACE && LA24_4 <= MINUS)||(LA24_4 >= NOT_EQUAL && LA24_4 <= PLUS)||(LA24_4 >= RBRACE && LA24_4 <= RBRACK)||(LA24_4 >= RPAREN && LA24_4 <= SLASH)||LA24_4==STAR||(LA24_4 >= 52 && LA24_4 <= 53)||LA24_4==56||(LA24_4 >= 58 && LA24_4 <= 65)||(LA24_4 >= 70 && LA24_4 <= 72)||LA24_4==75||LA24_4==86||(LA24_4 >= 88 && LA24_4 <= 89)||LA24_4==92) ) {
                            alt24=1;
                        }


                    }
                    else if ( (LA24_2==74||LA24_2==79||(LA24_2 >= 81 && LA24_2 <= 82)) ) {
                        alt24=1;
                    }


                }
                else if ( (LA24_0==ARROW) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ShellCommand.g:613:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
            	    {
            	    // ShellCommand.g:613:6: ( ARROW | DOT )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==ARROW) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==DOT) ) {
            	        alt23=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // ShellCommand.g:613:8: ARROW
            	            {
            	            match(input,ARROW,FOLLOW_ARROW_in_postfixExpression1876); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = true; }

            	            }
            	            break;
            	        case 2 :
            	            // ShellCommand.g:613:34: DOT
            	            {
            	            match(input,DOT,FOLLOW_DOT_in_postfixExpression1882); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = false; }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_propertyCall_in_postfixExpression1893);
            	    nPc=propertyCall(n, arrow);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = nPc; }

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
    // $ANTLR end "postfixExpression"



    // $ANTLR start "primaryExpression"
    // ShellCommand.g:629:1: primaryExpression returns [ASTExpression n] : (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )? );
    public final ASTExpression primaryExpression() throws RecognitionException {
        ASTExpression n = null;


        Token id1=null;
        ASTExpression nLit =null;

        ASTExpression nOr =null;

        ASTExpression nPc =null;

        ShellCommandParser.expression_return nExp =null;

        ASTExpression nIfExp =null;


        try {
            // ShellCommand.g:630:7: (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )? )
            int alt27=6;
            switch ( input.LA(1) ) {
            case HASH:
            case INT:
            case REAL:
            case STRING:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 66:
            case 78:
            case 80:
            case 83:
            case 90:
                {
                alt27=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case COLON_COLON:
                    {
                    alt27=1;
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
                case 52:
                case 53:
                case 56:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 70:
                case 71:
                case 72:
                case 75:
                case 86:
                case 88:
                case 89:
                case 92:
                    {
                    alt27=3;
                    }
                    break;
                case DOT:
                    {
                    int LA27_7 = input.LA(3);

                    if ( (LA27_7==51) ) {
                        alt27=6;
                    }
                    else if ( (LA27_7==IDENT||LA27_7==74||LA27_7==79||(LA27_7 >= 81 && LA27_7 <= 82)) ) {
                        alt27=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 7, input);

                        throw nvae;

                    }
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;

                }

                }
                break;
            case AT:
                {
                alt27=2;
                }
                break;
            case 74:
            case 79:
            case 81:
            case 82:
                {
                alt27=3;
                }
                break;
            case LPAREN:
                {
                alt27=4;
                }
                break;
            case 69:
                {
                alt27=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // ShellCommand.g:631:7: nLit= literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression1933);
                    nLit=literal();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nLit; }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:632:7: nOr= objectReference
                    {
                    pushFollow(FOLLOW_objectReference_in_primaryExpression1947);
                    nOr=objectReference();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nOr; }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:633:7: nPc= propertyCall[null, false]
                    {
                    pushFollow(FOLLOW_propertyCall_in_primaryExpression1959);
                    nPc=propertyCall(null, false);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nPc; }

                    }
                    break;
                case 4 :
                    // ShellCommand.g:634:7: LPAREN nExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression1970); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression1974);
                    nExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression1976); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExp!=null?nExp.n:null); }

                    }
                    break;
                case 5 :
                    // ShellCommand.g:635:7: nIfExp= ifExpression
                    {
                    pushFollow(FOLLOW_ifExpression_in_primaryExpression1988);
                    nIfExp=ifExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nIfExp; }

                    }
                    break;
                case 6 :
                    // ShellCommand.g:636:7: id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )?
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression2000); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression2002); if (state.failed) return n;

                    match(input,51,FOLLOW_51_in_primaryExpression2004); if (state.failed) return n;

                    // ShellCommand.g:636:36: ( LPAREN RPAREN )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==LPAREN) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ShellCommand.g:636:38: LPAREN RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression2008); if (state.failed) return n;

                            match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression2010); if (state.failed) return n;

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) { n = new ASTAllInstancesExpression(id1); }

                    // ShellCommand.g:638:7: ( AT 'pre' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==AT) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ShellCommand.g:638:9: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression2031); if (state.failed) return n;

                            match(input,87,FOLLOW_87_in_primaryExpression2033); if (state.failed) return n;

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
    // ShellCommand.g:642:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
    public final ASTExpression objectReference() throws RecognitionException {
        ASTExpression n = null;


        Token objectName=null;

        try {
            // ShellCommand.g:643:3: ( AT objectName= IDENT )
            // ShellCommand.g:644:3: AT objectName= IDENT
            {
            match(input,AT,FOLLOW_AT_in_objectReference2060); if (state.failed) return n;

            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference2068); if (state.failed) return n;

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
    // ShellCommand.g:658:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] );
    public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nExpQuery =null;

        ASTExpression nExpIterate =null;

        ShellCommandParser.operationExpression_return nExpOperation =null;

        ASTTypeArgExpression nExpType =null;


        try {
            // ShellCommand.g:659:7: ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] )
            int alt28=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA28_1 = input.LA(2);

                if ( (((( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )&&( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ))&&( input.LA(2) == LPAREN ))) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;

                }
                }
                break;
            case 74:
                {
                alt28=2;
                }
                break;
            case 79:
            case 81:
            case 82:
                {
                alt28=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }

            switch (alt28) {
                case 1 :
                    // ShellCommand.g:663:7: {...}?{...}?nExpQuery= queryExpression[source]
                    {
                    if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
                    }

                    if ( !(( input.LA(2) == LPAREN )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
                    }

                    pushFollow(FOLLOW_queryExpression_in_propertyCall2133);
                    nExpQuery=queryExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpQuery; }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:666:7: nExpIterate= iterateExpression[source]
                    {
                    pushFollow(FOLLOW_iterateExpression_in_propertyCall2146);
                    nExpIterate=iterateExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpIterate; }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:667:7: nExpOperation= operationExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_operationExpression_in_propertyCall2159);
                    nExpOperation=operationExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExpOperation!=null?nExpOperation.n:null); }

                    }
                    break;
                case 4 :
                    // ShellCommand.g:668:7: nExpType= typeExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_typeExpression_in_propertyCall2172);
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
    // ShellCommand.g:677:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
    public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTElemVarsDeclaration decls =null;

        ShellCommandParser.expression_return nExp =null;


        ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
        try {
            // ShellCommand.g:678:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
            // ShellCommand.g:679:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
            {
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression2207); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression2214); if (state.failed) return n;

            // ShellCommand.g:681:5: (decls= elemVarsDeclaration BAR )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==IDENT) ) {
                int LA29_1 = input.LA(2);

                if ( ((LA29_1 >= BAR && LA29_1 <= COLON)||LA29_1==COMMA) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // ShellCommand.g:681:7: decls= elemVarsDeclaration BAR
                    {
                    pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression2225);
                    decls=elemVarsDeclaration();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {decl = decls;}

                    match(input,BAR,FOLLOW_BAR_in_queryExpression2229); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_expression_in_queryExpression2240);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression2246); if (state.failed) return n;

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
    // ShellCommand.g:695:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
    public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ASTElemVarsDeclaration decls =null;

        ASTVariableInitialization init =null;

        ShellCommandParser.expression_return nExp =null;


        try {
            // ShellCommand.g:695:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
            // ShellCommand.g:696:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
            {
            i=(Token)match(input,74,FOLLOW_74_in_iterateExpression2278); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression2284); if (state.failed) return n;

            pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression2292);
            decls=elemVarsDeclaration();

            state._fsp--;
            if (state.failed) return n;

            match(input,SEMI,FOLLOW_SEMI_in_iterateExpression2294); if (state.failed) return n;

            pushFollow(FOLLOW_variableInitialization_in_iterateExpression2302);
            init=variableInitialization();

            state._fsp--;
            if (state.failed) return n;

            match(input,BAR,FOLLOW_BAR_in_iterateExpression2304); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_iterateExpression2312);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression2318); if (state.failed) return n;

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
    // ShellCommand.g:717:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
    public final ShellCommandParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ShellCommandParser.operationExpression_return retval = new ShellCommandParser.operationExpression_return();
        retval.start = input.LT(1);


        Token name=null;
        ShellCommandParser.expression_return rolename =null;

        ShellCommandParser.expression_return e =null;


        try {
            // ShellCommand.g:719:5: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
            // ShellCommand.g:720:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression2362); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTOperationExpression(name, source, followsArrow); }

            // ShellCommand.g:726:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==LBRACK) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ShellCommand.g:726:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression2384); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_operationExpression2397);
                    rolename=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    // ShellCommand.g:728:9: ( COMMA rolename= expression )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==COMMA) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ShellCommand.g:728:10: COMMA rolename= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2410); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_expression_in_operationExpression2414);
                    	    rolename=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression2426); if (state.failed) return retval;

                    // ShellCommand.g:731:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==LBRACK) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ShellCommand.g:731:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression2443); if (state.failed) return retval;

                            pushFollow(FOLLOW_expression_in_operationExpression2458);
                            rolename=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            // ShellCommand.g:733:11: ( COMMA rolename= expression )*
                            loop31:
                            do {
                                int alt31=2;
                                int LA31_0 = input.LA(1);

                                if ( (LA31_0==COMMA) ) {
                                    alt31=1;
                                }


                                switch (alt31) {
                            	case 1 :
                            	    // ShellCommand.g:733:12: COMMA rolename= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2473); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression2477);
                            	    rolename=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop31;
                                }
                            } while (true);


                            match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression2491); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }


            // ShellCommand.g:738:5: ( AT 'pre' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==AT) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ShellCommand.g:738:7: AT 'pre'
                    {
                    match(input,AT,FOLLOW_AT_in_operationExpression2516); if (state.failed) return retval;

                    match(input,87,FOLLOW_87_in_operationExpression2518); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.setIsPre(); }

                    }
                    break;

            }


            // ShellCommand.g:740:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==LPAREN) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ShellCommand.g:741:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression2543); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.hasParentheses(); }

                    // ShellCommand.g:742:7: (e= expression ( COMMA e= expression )* )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==AT||LA36_0==HASH||(LA36_0 >= IDENT && LA36_0 <= INT)||(LA36_0 >= LPAREN && LA36_0 <= MINUS)||LA36_0==PLUS||LA36_0==REAL||LA36_0==STRING||(LA36_0 >= 44 && LA36_0 <= 50)||LA36_0==66||LA36_0==69||(LA36_0 >= 74 && LA36_0 <= 75)||(LA36_0 >= 77 && LA36_0 <= 83)||LA36_0==90) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ShellCommand.g:743:7: e= expression ( COMMA e= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_operationExpression2564);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            // ShellCommand.g:744:7: ( COMMA e= expression )*
                            loop35:
                            do {
                                int alt35=2;
                                int LA35_0 = input.LA(1);

                                if ( (LA35_0==COMMA) ) {
                                    alt35=1;
                                }


                                switch (alt35) {
                            	case 1 :
                            	    // ShellCommand.g:744:9: COMMA e= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2576); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression2580);
                            	    e=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop35;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression2600); if (state.failed) return retval;

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
    // ShellCommand.g:757:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN ;
    public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTTypeArgExpression n = null;


        ASTType t =null;


         Token opToken = null; 
        try {
            // ShellCommand.g:760:2: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN )
            // ShellCommand.g:761:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN
            {
            if ( state.backtracking==0 ) { opToken = input.LT(1); }

            if ( input.LA(1)==79||(input.LA(1) >= 81 && input.LA(1) <= 82) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression2665); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_typeExpression2669);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression2671); if (state.failed) return n;

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
    // ShellCommand.g:772:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] :var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
    public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
        ASTElemVarsDeclaration n = null;


        Token var1=null;
        Token varN=null;
        ASTType t =null;

        ASTType tN =null;


        try {
            // ShellCommand.g:773:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
            // ShellCommand.g:774:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
            {
            if ( state.backtracking==0 ) { n = new ASTElemVarsDeclaration(); }

            var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration2709); if (state.failed) return n;

            // ShellCommand.g:775:17: ( COLON t= type )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==COLON) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ShellCommand.g:775:18: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration2712); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_elemVarsDeclaration2716);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {n.addDeclaration(var1, t);}

            // ShellCommand.g:776:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==COMMA) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ShellCommand.g:776:5: COMMA varN= IDENT ( COLON tN= type )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration2726); if (state.failed) return n;

            	    varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration2732); if (state.failed) return n;

            	    // ShellCommand.g:776:24: ( COLON tN= type )?
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==COLON) ) {
            	        alt39=1;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // ShellCommand.g:776:25: COLON tN= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration2735); if (state.failed) return n;

            	            pushFollow(FOLLOW_type_in_elemVarsDeclaration2741);
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
            	    break loop40;
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
    // ShellCommand.g:784:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
    public final ASTVariableInitialization variableInitialization() throws RecognitionException {
        ASTVariableInitialization n = null;


        Token name=null;
        ASTType t =null;

        ShellCommandParser.expression_return e =null;


        try {
            // ShellCommand.g:785:5: (name= IDENT COLON t= type EQUAL e= expression )
            // ShellCommand.g:786:5: name= IDENT COLON t= type EQUAL e= expression
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization2769); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableInitialization2771); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableInitialization2775);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization2777); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_variableInitialization2781);
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
    // ShellCommand.g:795:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
    public final ASTExpression ifExpression() throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ShellCommandParser.expression_return cond =null;

        ShellCommandParser.expression_return t =null;

        ShellCommandParser.expression_return e =null;


        try {
            // ShellCommand.g:796:5: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
            // ShellCommand.g:797:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
            {
            i=(Token)match(input,69,FOLLOW_69_in_ifExpression2813); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression2817);
            cond=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,89,FOLLOW_89_in_ifExpression2819); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression2823);
            t=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,62,FOLLOW_62_in_ifExpression2825); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression2829);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,64,FOLLOW_64_in_ifExpression2831); if (state.failed) return n;

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
    // ShellCommand.g:816:1: literal returns [ASTExpression n] : (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral );
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
            // ShellCommand.g:817:7: (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral )
            int alt41=11;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt41=1;
                }
                break;
            case 66:
                {
                alt41=2;
                }
                break;
            case INT:
                {
                alt41=3;
                }
                break;
            case REAL:
                {
                alt41=4;
                }
                break;
            case STRING:
                {
                alt41=5;
                }
                break;
            case HASH:
                {
                alt41=6;
                }
                break;
            case IDENT:
                {
                alt41=7;
                }
                break;
            case 44:
            case 46:
            case 47:
            case 48:
                {
                int LA41_8 = input.LA(2);

                if ( (LA41_8==LPAREN) ) {
                    alt41=9;
                }
                else if ( (LA41_8==LBRACE) ) {
                    alt41=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 8, input);

                    throw nvae;

                }
                }
                break;
            case 45:
            case 80:
                {
                alt41=9;
                }
                break;
            case 50:
            case 78:
            case 83:
                {
                alt41=10;
                }
                break;
            case 49:
                {
                alt41=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }

            switch (alt41) {
                case 1 :
                    // ShellCommand.g:818:7: t= 'true'
                    {
                    t=(Token)match(input,90,FOLLOW_90_in_literal2870); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(true); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:819:7: f= 'false'
                    {
                    f=(Token)match(input,66,FOLLOW_66_in_literal2884); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(false); }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:820:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_literal2897); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTIntegerLiteral(i); }

                    }
                    break;
                case 4 :
                    // ShellCommand.g:821:7: r= REAL
                    {
                    r=(Token)match(input,REAL,FOLLOW_REAL_in_literal2912); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRealLiteral(r); }

                    }
                    break;
                case 5 :
                    // ShellCommand.g:822:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_literal2926); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTStringLiteral(s); }

                    }
                    break;
                case 6 :
                    // ShellCommand.g:823:7: HASH enumLit= IDENT
                    {
                    match(input,HASH,FOLLOW_HASH_in_literal2936); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2940); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumLit);}

                    }
                    break;
                case 7 :
                    // ShellCommand.g:824:7: enumName= IDENT '::' enumLit= IDENT
                    {
                    enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2952); if (state.failed) return n;

                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal2954); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2958); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumName, enumLit); }

                    }
                    break;
                case 8 :
                    // ShellCommand.g:825:7: nColIt= collectionLiteral
                    {
                    pushFollow(FOLLOW_collectionLiteral_in_literal2970);
                    nColIt=collectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nColIt; }

                    }
                    break;
                case 9 :
                    // ShellCommand.g:826:7: nEColIt= emptyCollectionLiteral
                    {
                    pushFollow(FOLLOW_emptyCollectionLiteral_in_literal2982);
                    nEColIt=emptyCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nEColIt; }

                    }
                    break;
                case 10 :
                    // ShellCommand.g:827:7: nUndLit= undefinedLiteral
                    {
                    pushFollow(FOLLOW_undefinedLiteral_in_literal2994);
                    nUndLit=undefinedLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nUndLit; }

                    }
                    break;
                case 11 :
                    // ShellCommand.g:828:7: nTupleLit= tupleLiteral
                    {
                    pushFollow(FOLLOW_tupleLiteral_in_literal3006);
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
    // ShellCommand.g:836:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
    public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
        ASTCollectionLiteral n = null;


        ASTCollectionItem ci =null;


         Token op = null; 
        try {
            // ShellCommand.g:838:5: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
            // ShellCommand.g:839:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( input.LA(1)==44||(input.LA(1) >= 46 && input.LA(1) <= 48) ) {
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

            match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral3073); if (state.failed) return n;

            // ShellCommand.g:843:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==AT||LA43_0==HASH||(LA43_0 >= IDENT && LA43_0 <= INT)||(LA43_0 >= LPAREN && LA43_0 <= MINUS)||LA43_0==PLUS||LA43_0==REAL||LA43_0==STRING||(LA43_0 >= 44 && LA43_0 <= 50)||LA43_0==66||LA43_0==69||(LA43_0 >= 74 && LA43_0 <= 75)||(LA43_0 >= 77 && LA43_0 <= 83)||LA43_0==90) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ShellCommand.g:844:7: ci= collectionItem ( COMMA ci= collectionItem )*
                    {
                    pushFollow(FOLLOW_collectionItem_in_collectionLiteral3090);
                    ci=collectionItem();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addItem(ci); }

                    // ShellCommand.g:845:7: ( COMMA ci= collectionItem )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==COMMA) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ShellCommand.g:845:9: COMMA ci= collectionItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral3103); if (state.failed) return n;

                    	    pushFollow(FOLLOW_collectionItem_in_collectionLiteral3107);
                    	    ci=collectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addItem(ci); }

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral3126); if (state.failed) return n;

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
    // ShellCommand.g:854:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
    public final ASTCollectionItem collectionItem() throws RecognitionException {
        ASTCollectionItem n = null;


        ShellCommandParser.expression_return e =null;


         n = new ASTCollectionItem(); 
        try {
            // ShellCommand.g:856:5: (e= expression ( DOTDOT e= expression )? )
            // ShellCommand.g:857:5: e= expression ( DOTDOT e= expression )?
            {
            pushFollow(FOLLOW_expression_in_collectionItem3155);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setFirst((e!=null?e.n:null)); }

            // ShellCommand.g:858:5: ( DOTDOT e= expression )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==DOTDOT) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ShellCommand.g:858:7: DOTDOT e= expression
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem3166); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_collectionItem3170);
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
    // ShellCommand.g:868:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE );
    public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
        ASTEmptyCollectionLiteral n = null;


        ASTCollectionType t =null;


        try {
            // ShellCommand.g:869:5: ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==80) ) {
                alt45=1;
            }
            else if ( ((LA45_0 >= 44 && LA45_0 <= 48)) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;

            }
            switch (alt45) {
                case 1 :
                    // ShellCommand.g:870:5: 'oclEmpty' LPAREN t= collectionType RPAREN
                    {
                    match(input,80,FOLLOW_80_in_emptyCollectionLiteral3199); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral3201); if (state.failed) return n;

                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral3205);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral3207); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:873:5: t= collectionType LBRACE RBRACE
                    {
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral3223);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral3225); if (state.failed) return n;

                    match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral3227); if (state.failed) return n;

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
    // ShellCommand.g:884:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
    public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
        ASTUndefinedLiteral n = null;


        ASTType t =null;


        try {
            // ShellCommand.g:885:5: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
            int alt46=4;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt46=1;
                }
                break;
            case 50:
                {
                alt46=2;
                }
                break;
            case 78:
                {
                int LA46_3 = input.LA(2);

                if ( (LA46_3==LPAREN) ) {
                    alt46=3;
                }
                else if ( (LA46_3==EOF||LA46_3==ARROW||LA46_3==BAR||(LA46_3 >= COMMA && LA46_3 <= EQUAL)||(LA46_3 >= GREATER && LA46_3 <= GREATER_EQUAL)||LA46_3==IDENT||LA46_3==LBRACE||(LA46_3 >= LESS && LA46_3 <= LESS_EQUAL)||LA46_3==MINUS||(LA46_3 >= NOT_EQUAL && LA46_3 <= PLUS)||(LA46_3 >= RBRACE && LA46_3 <= RBRACK)||(LA46_3 >= RPAREN && LA46_3 <= SLASH)||LA46_3==STAR||(LA46_3 >= 52 && LA46_3 <= 53)||LA46_3==56||(LA46_3 >= 58 && LA46_3 <= 65)||(LA46_3 >= 70 && LA46_3 <= 72)||LA46_3==75||LA46_3==86||(LA46_3 >= 88 && LA46_3 <= 89)||LA46_3==92) ) {
                    alt46=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }

            switch (alt46) {
                case 1 :
                    // ShellCommand.g:886:5: 'oclUndefined' LPAREN t= type RPAREN
                    {
                    match(input,83,FOLLOW_83_in_undefinedLiteral3257); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral3259); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral3263);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral3265); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:889:5: 'Undefined'
                    {
                    match(input,50,FOLLOW_50_in_undefinedLiteral3279); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:892:5: 'null' LPAREN t= type RPAREN
                    {
                    match(input,78,FOLLOW_78_in_undefinedLiteral3293); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral3295); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral3299);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral3301); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 4 :
                    // ShellCommand.g:895:5: 'null'
                    {
                    match(input,78,FOLLOW_78_in_undefinedLiteral3315); if (state.failed) return n;

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
    // ShellCommand.g:905:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
    public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
        ASTTupleLiteral n = null;


        ASTTupleItem ti =null;


         List tiList = new ArrayList(); 
        try {
            // ShellCommand.g:907:5: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
            // ShellCommand.g:908:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
            {
            match(input,49,FOLLOW_49_in_tupleLiteral3354); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral3360); if (state.failed) return n;

            pushFollow(FOLLOW_tupleItem_in_tupleLiteral3368);
            ti=tupleItem();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tiList.add(ti); }

            // ShellCommand.g:911:5: ( COMMA ti= tupleItem )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==COMMA) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ShellCommand.g:911:7: COMMA ti= tupleItem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral3379); if (state.failed) return n;

            	    pushFollow(FOLLOW_tupleItem_in_tupleLiteral3383);
            	    ti=tupleItem();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tiList.add(ti); }

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral3394); if (state.failed) return n;

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
    // ShellCommand.g:919:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
    public final ASTTupleItem tupleItem() throws RecognitionException {
        ASTTupleItem n = null;


        Token name=null;
        ASTType t =null;

        ShellCommandParser.expression_return e =null;


        try {
            // ShellCommand.g:920:5: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
            // ShellCommand.g:921:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem3425); if (state.failed) return n;

            // ShellCommand.g:922:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==COLON) ) {
                int LA48_1 = input.LA(2);

                if ( (synpred6_ShellCommand()) ) {
                    alt48=1;
                }
                else if ( (true) ) {
                    alt48=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA48_0==EQUAL) ) {
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
                    // ShellCommand.g:925:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
                    {
                    match(input,COLON,FOLLOW_COLON_in_tupleItem3464); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_tupleItem3468);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem3470); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_tupleItem3474);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTTupleItem(name, t, (e!=null?e.n:null)); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:928:7: ( COLON | EQUAL ) e= expression
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


                    pushFollow(FOLLOW_expression_in_tupleItem3506);
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
    // ShellCommand.g:939:1: type returns [ASTType n] : (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) ;
    public final ASTType type() throws RecognitionException {
        ASTType n = null;


        ASTSimpleType nTSimple =null;

        ASTCollectionType nTCollection =null;

        ASTTupleType nTTuple =null;


         Token tok = null; 
        try {
            // ShellCommand.g:941:5: ( (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) )
            // ShellCommand.g:942:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of type */ }

            // ShellCommand.g:943:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            int alt49=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt49=1;
                }
                break;
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
                {
                alt49=2;
                }
                break;
            case 49:
                {
                alt49=3;
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
                    // ShellCommand.g:944:7: nTSimple= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type3572);
                    nTSimple=simpleType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTSimple; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:945:7: nTCollection= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type3584);
                    nTCollection=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTCollection; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:946:7: nTTuple= tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_type3596);
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
    // ShellCommand.g:951:1: typeOnly returns [ASTType n] : nT= type EOF ;
    public final ASTType typeOnly() throws RecognitionException {
        ASTType n = null;


        ASTType nT =null;


        try {
            // ShellCommand.g:952:5: (nT= type EOF )
            // ShellCommand.g:953:5: nT= type EOF
            {
            pushFollow(FOLLOW_type_in_typeOnly3628);
            nT=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_typeOnly3630); if (state.failed) return n;

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
    // ShellCommand.g:963:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
    public final ASTSimpleType simpleType() throws RecognitionException {
        ASTSimpleType n = null;


        Token name=null;

        try {
            // ShellCommand.g:964:5: (name= IDENT )
            // ShellCommand.g:965:5: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType3658); if (state.failed) return n;

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
    // ShellCommand.g:973:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
    public final ASTCollectionType collectionType() throws RecognitionException {
        ASTCollectionType n = null;


        ASTType elemType =null;


         Token op = null; 
        try {
            // ShellCommand.g:975:5: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
            // ShellCommand.g:976:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( (input.LA(1) >= 44 && input.LA(1) <= 48) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_collectionType3723); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_collectionType3727);
            elemType=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_collectionType3729); if (state.failed) return n;

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
    // ShellCommand.g:986:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
    public final ASTTupleType tupleType() throws RecognitionException {
        ASTTupleType n = null;


        ASTTuplePart tp =null;


         List tpList = new ArrayList(); 
        try {
            // ShellCommand.g:988:5: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
            // ShellCommand.g:989:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
            {
            match(input,49,FOLLOW_49_in_tupleType3763); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_tupleType3765); if (state.failed) return n;

            pushFollow(FOLLOW_tuplePart_in_tupleType3774);
            tp=tuplePart();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tpList.add(tp); }

            // ShellCommand.g:991:5: ( COMMA tp= tuplePart )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==COMMA) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ShellCommand.g:991:7: COMMA tp= tuplePart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleType3785); if (state.failed) return n;

            	    pushFollow(FOLLOW_tuplePart_in_tupleType3789);
            	    tp=tuplePart();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tpList.add(tp); }

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            match(input,RPAREN,FOLLOW_RPAREN_in_tupleType3801); if (state.failed) return n;

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
    // ShellCommand.g:1000:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
    public final ASTTuplePart tuplePart() throws RecognitionException {
        ASTTuplePart n = null;


        Token name=null;
        ASTType t =null;


        try {
            // ShellCommand.g:1001:5: (name= IDENT COLON t= type )
            // ShellCommand.g:1002:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart3833); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_tuplePart3835); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_tuplePart3839);
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



    // $ANTLR start "statOnly"
    // ShellCommand.g:1041:1: statOnly returns [ASTStatement n] : s= stat EOF ;
    public final ASTStatement statOnly() throws RecognitionException {
        ASTStatement n = null;


        ShellCommandParser.stat_return s =null;


        try {
            // ShellCommand.g:1042:3: (s= stat EOF )
            // ShellCommand.g:1043:3: s= stat EOF
            {
            pushFollow(FOLLOW_stat_in_statOnly3888);
            s=stat();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_statOnly3892); if (state.failed) return n;

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
    // ShellCommand.g:1053:1: stat returns [ASTStatement n] : nextStat[seq] ( SEMI nextStat[seq] )* ;
    public final ShellCommandParser.stat_return stat() throws RecognitionException {
        ShellCommandParser.stat_return retval = new ShellCommandParser.stat_return();
        retval.start = input.LT(1);



          ASTSequenceStatement seq = new ASTSequenceStatement();

        try {
            // ShellCommand.g:1057:3: ( nextStat[seq] ( SEMI nextStat[seq] )* )
            // ShellCommand.g:1058:3: nextStat[seq] ( SEMI nextStat[seq] )*
            {
            pushFollow(FOLLOW_nextStat_in_stat3923);
            nextStat(seq);

            state._fsp--;
            if (state.failed) return retval;

            // ShellCommand.g:1059:3: ( SEMI nextStat[seq] )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==SEMI) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ShellCommand.g:1060:5: SEMI nextStat[seq]
            	    {
            	    match(input,SEMI,FOLLOW_SEMI_in_stat3934); if (state.failed) return retval;

            	    pushFollow(FOLLOW_nextStat_in_stat3940);
            	    nextStat(seq);

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // ShellCommand.g:1076:1: nextStat[ASTSequenceStatement seq] : s= singleStat ;
    public final ShellCommandParser.nextStat_return nextStat(ASTSequenceStatement seq) throws RecognitionException {
        ShellCommandParser.nextStat_return retval = new ShellCommandParser.nextStat_return();
        retval.start = input.LT(1);


        ASTStatement s =null;


        try {
            // ShellCommand.g:1077:3: (s= singleStat )
            // ShellCommand.g:1078:3: s= singleStat
            {
            pushFollow(FOLLOW_singleStat_in_nextStat3974);
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
    // ShellCommand.g:1090:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat );
    public final ASTStatement singleStat() throws RecognitionException {
        ASTStatement n = null;


        ASTEmptyStatement emp =null;

        ASTStatement sse =null;

        ASTStatement vas =null;

        ASTStatement ocs =null;

        ShellCommandParser.objDestroyStat_return ods =null;

        ASTLinkInsertionStatement lis =null;

        ASTLinkDeletionStatement lds =null;

        ASTConditionalExecutionStatement ces =null;

        ASTIterationStatement its =null;

        ASTWhileStatement whs =null;

        ASTBlockStatement blk =null;


        try {
            // ShellCommand.g:1094:5: (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat )
            int alt52=11;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==EOF||LA52_0==SEMI||(LA52_0 >= 62 && LA52_0 <= 63)) ) {
                alt52=1;
            }
            else if ( (LA52_0==75) && (synpred7_ShellCommand())) {
                alt52=2;
            }
            else if ( (LA52_0==MINUS||LA52_0==PLUS||LA52_0==77) && (synpred7_ShellCommand())) {
                alt52=2;
            }
            else if ( (LA52_0==90) && (synpred7_ShellCommand())) {
                alt52=2;
            }
            else if ( (LA52_0==66) && (synpred7_ShellCommand())) {
                alt52=2;
            }
            else if ( (LA52_0==INT) && (synpred7_ShellCommand())) {
                alt52=2;
            }
            else if ( (LA52_0==REAL) && (synpred7_ShellCommand())) {
                alt52=2;
            }
            else if ( (LA52_0==STRING) && (synpred7_ShellCommand())) {
                alt52=2;
            }
            else if ( (LA52_0==HASH) && (synpred7_ShellCommand())) {
                alt52=2;
            }
            else if ( (LA52_0==IDENT) ) {
                int LA52_13 = input.LA(2);

                if ( (synpred7_ShellCommand()) ) {
                    alt52=2;
                }
                else if ( (true) ) {
                    alt52=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 13, input);

                    throw nvae;

                }
            }
            else if ( (LA52_0==44||(LA52_0 >= 46 && LA52_0 <= 48)) && (synpred7_ShellCommand())) {
                alt52=2;
            }
            else if ( (LA52_0==80) && (synpred7_ShellCommand())) {
                alt52=2;
            }
            else if ( (LA52_0==45) && (synpred7_ShellCommand())) {
                alt52=2;
            }
            else if ( (LA52_0==83) && (synpred7_ShellCommand())) {
                alt52=2;
            }
            else if ( (LA52_0==50) && (synpred7_ShellCommand())) {
                alt52=2;
            }
            else if ( (LA52_0==78) && (synpred7_ShellCommand())) {
                alt52=2;
            }
            else if ( (LA52_0==49) && (synpred7_ShellCommand())) {
                alt52=2;
            }
            else if ( (LA52_0==AT) && (synpred7_ShellCommand())) {
                alt52=2;
            }
            else if ( (LA52_0==74) && (synpred7_ShellCommand())) {
                alt52=2;
            }
            else if ( (LA52_0==79||(LA52_0 >= 81 && LA52_0 <= 82)) && (synpred7_ShellCommand())) {
                alt52=2;
            }
            else if ( (LA52_0==LPAREN) && (synpred7_ShellCommand())) {
                alt52=2;
            }
            else if ( (LA52_0==69) ) {
                int LA52_25 = input.LA(2);

                if ( (synpred7_ShellCommand()) ) {
                    alt52=2;
                }
                else if ( (true) ) {
                    alt52=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 25, input);

                    throw nvae;

                }
            }
            else if ( (LA52_0==76) ) {
                alt52=4;
            }
            else if ( (LA52_0==59) ) {
                alt52=5;
            }
            else if ( (LA52_0==72) ) {
                alt52=6;
            }
            else if ( (LA52_0==58) ) {
                alt52=7;
            }
            else if ( (LA52_0==67) ) {
                alt52=9;
            }
            else if ( (LA52_0==91) ) {
                alt52=10;
            }
            else if ( (LA52_0==54) ) {
                alt52=11;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;

            }
            switch (alt52) {
                case 1 :
                    // ShellCommand.g:1095:5: emp= emptyStat
                    {
                    pushFollow(FOLLOW_emptyStat_in_singleStat4011);
                    emp=emptyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = emp; }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:1097:5: ( statStartingWithExpr )=>sse= statStartingWithExpr
                    {
                    pushFollow(FOLLOW_statStartingWithExpr_in_singleStat4037);
                    sse=statStartingWithExpr();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = sse; }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:1098:5: vas= varAssignStat
                    {
                    pushFollow(FOLLOW_varAssignStat_in_singleStat4049);
                    vas=varAssignStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = vas; }

                    }
                    break;
                case 4 :
                    // ShellCommand.g:1099:5: ocs= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_singleStat4063);
                    ocs=objCreateStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = ocs; }

                    }
                    break;
                case 5 :
                    // ShellCommand.g:1100:5: ods= objDestroyStat
                    {
                    pushFollow(FOLLOW_objDestroyStat_in_singleStat4077);
                    ods=objDestroyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ods!=null?ods.n:null); }

                    }
                    break;
                case 6 :
                    // ShellCommand.g:1101:5: lis= lnkInsStat
                    {
                    pushFollow(FOLLOW_lnkInsStat_in_singleStat4090);
                    lis=lnkInsStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = lis; }

                    }
                    break;
                case 7 :
                    // ShellCommand.g:1102:5: lds= lnkDelStat
                    {
                    pushFollow(FOLLOW_lnkDelStat_in_singleStat4107);
                    lds=lnkDelStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = lds; }

                    }
                    break;
                case 8 :
                    // ShellCommand.g:1103:5: ces= condExStat
                    {
                    pushFollow(FOLLOW_condExStat_in_singleStat4124);
                    ces=condExStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = ces; }

                    }
                    break;
                case 9 :
                    // ShellCommand.g:1104:5: its= iterStat
                    {
                    pushFollow(FOLLOW_iterStat_in_singleStat4141);
                    its=iterStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = its; }

                    }
                    break;
                case 10 :
                    // ShellCommand.g:1106:5: whs= whileStat
                    {
                    pushFollow(FOLLOW_whileStat_in_singleStat4163);
                    whs=whileStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = whs; }

                    }
                    break;
                case 11 :
                    // ShellCommand.g:1107:5: blk= blockStat
                    {
                    pushFollow(FOLLOW_blockStat_in_singleStat4181);
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
    // ShellCommand.g:1114:1: emptyStat returns [ASTEmptyStatement n] : nothing ;
    public final ASTEmptyStatement emptyStat() throws RecognitionException {
        ASTEmptyStatement n = null;


        try {
            // ShellCommand.g:1115:3: ( nothing )
            // ShellCommand.g:1116:3: nothing
            {
            pushFollow(FOLLOW_nothing_in_emptyStat4208);
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
    // ShellCommand.g:1121:1: statStartingWithExpr returns [ASTStatement n] : expr= inSoilExpression (aas= attAssignStat[$expr.n] )? ;
    public final ASTStatement statStartingWithExpr() throws RecognitionException {
        ASTStatement n = null;


        ASTExpression expr =null;

        ASTAttributeAssignmentStatement aas =null;


        try {
            // ShellCommand.g:1122:3: (expr= inSoilExpression (aas= attAssignStat[$expr.n] )? )
            // ShellCommand.g:1123:3: expr= inSoilExpression (aas= attAssignStat[$expr.n] )?
            {
            pushFollow(FOLLOW_inSoilExpression_in_statStartingWithExpr4234);
            expr=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            // ShellCommand.g:1124:3: (aas= attAssignStat[$expr.n] )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==DOT) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ShellCommand.g:1125:5: aas= attAssignStat[$expr.n]
                    {
                    pushFollow(FOLLOW_attAssignStat_in_statStartingWithExpr4248);
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
    // ShellCommand.g:1137:1: varAssignStat returns [ASTStatement n] : varName= IDENT COLON_EQUAL rVal= rValue ;
    public final ASTStatement varAssignStat() throws RecognitionException {
        ASTStatement n = null;


        Token varName=null;
        ShellCommandParser.rValue_return rVal =null;


        try {
            // ShellCommand.g:1138:3: (varName= IDENT COLON_EQUAL rVal= rValue )
            // ShellCommand.g:1139:3: varName= IDENT COLON_EQUAL rVal= rValue
            {
            varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_varAssignStat4286); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_varAssignStat4290); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_varAssignStat4298);
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
    // ShellCommand.g:1207:1: attAssignStat[ASTExpression exp] returns [ASTAttributeAssignmentStatement n] : DOT attName= IDENT COLON_EQUAL r= rValue ;
    public final ASTAttributeAssignmentStatement attAssignStat(ASTExpression exp) throws RecognitionException {
        ASTAttributeAssignmentStatement n = null;


        Token attName=null;
        ShellCommandParser.rValue_return r =null;


        try {
            // ShellCommand.g:1208:3: ( DOT attName= IDENT COLON_EQUAL r= rValue )
            // ShellCommand.g:1209:3: DOT attName= IDENT COLON_EQUAL r= rValue
            {
            match(input,DOT,FOLLOW_DOT_in_attAssignStat4329); if (state.failed) return n;

            attName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attAssignStat4338); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attAssignStat4342); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_attAssignStat4350);
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
    // ShellCommand.g:1221:1: objCreateStat returns [ASTStatement n] : 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? ;
    public final ASTStatement objCreateStat() throws RecognitionException {
        ASTStatement n = null;


        ASTSimpleType ident =null;

        ASTExpression objName =null;

        ShellCommandParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // ShellCommand.g:1222:3: ( 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? )
            // ShellCommand.g:1223:3: 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            {
            match(input,76,FOLLOW_76_in_objCreateStat4376); if (state.failed) return n;

            pushFollow(FOLLOW_simpleType_in_objCreateStat4384);
            ident=simpleType();

            state._fsp--;
            if (state.failed) return n;

            // ShellCommand.g:1225:3: ( LPAREN objName= inSoilExpression RPAREN )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==LPAREN) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ShellCommand.g:1226:5: LPAREN objName= inSoilExpression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat4394); if (state.failed) return n;

                    pushFollow(FOLLOW_inSoilExpression_in_objCreateStat4406);
                    objName=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat4412); if (state.failed) return n;

                    }
                    break;

            }


            // ShellCommand.g:1231:3: ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==55) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ShellCommand.g:1232:5: 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN
                    {
                    match(input,55,FOLLOW_55_in_objCreateStat4430); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat4438); if (state.failed) return n;

                    pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat4452);
                    p=rValListMin2WithOptionalQualifiers();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat4460); if (state.failed) return n;

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
    // ShellCommand.g:1251:1: objDestroyStat returns [ASTStatement n] : 'destroy' el= exprListMin1 ;
    public final ShellCommandParser.objDestroyStat_return objDestroyStat() throws RecognitionException {
        ShellCommandParser.objDestroyStat_return retval = new ShellCommandParser.objDestroyStat_return();
        retval.start = input.LT(1);


        List<ASTExpression> el =null;


        try {
            // ShellCommand.g:1252:3: ( 'destroy' el= exprListMin1 )
            // ShellCommand.g:1253:3: 'destroy' el= exprListMin1
            {
            match(input,59,FOLLOW_59_in_objDestroyStat4496); if (state.failed) return retval;

            pushFollow(FOLLOW_exprListMin1_in_objDestroyStat4504);
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
    // ShellCommand.g:1274:1: lnkInsStat returns [ASTLinkInsertionStatement n] : 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT ;
    public final ASTLinkInsertionStatement lnkInsStat() throws RecognitionException {
        ASTLinkInsertionStatement n = null;


        Token ass=null;
        ShellCommandParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // ShellCommand.g:1275:3: ( 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT )
            // ShellCommand.g:1276:3: 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT
            {
            match(input,72,FOLLOW_72_in_lnkInsStat4530); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkInsStat4534); if (state.failed) return n;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat4544);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkInsStat4548); if (state.failed) return n;

            match(input,73,FOLLOW_73_in_lnkInsStat4552); if (state.failed) return n;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkInsStat4560); if (state.failed) return n;

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
    // ShellCommand.g:1286:1: rValListMin2WithOptionalQualifiers returns [List<ASTRValue> participans, List<List<ASTRValue>> qualifiers] : r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* ;
    public final ShellCommandParser.rValListMin2WithOptionalQualifiers_return rValListMin2WithOptionalQualifiers() throws RecognitionException {
        ShellCommandParser.rValListMin2WithOptionalQualifiers_return retval = new ShellCommandParser.rValListMin2WithOptionalQualifiers_return();
        retval.start = input.LT(1);


        ShellCommandParser.rValue_return r =null;

        List<ASTRValue> qualifierValues =null;



          retval.participans = new ArrayList<ASTRValue>();
          retval.qualifiers = new ArrayList<List<ASTRValue>>();
          List<ASTRValue> currentQualifiers = Collections.emptyList();

        try {
            // ShellCommand.g:1292:3: (r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* )
            // ShellCommand.g:1293:3: r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers4589);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add((r!=null?r.n:null)); }

            // ShellCommand.g:1294:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==LBRACE) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ShellCommand.g:1295:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers4600); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers4609);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers4616); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers4632); if (state.failed) return retval;

            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers4643);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add((r!=null?r.n:null)); }

            // ShellCommand.g:1307:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==LBRACE) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ShellCommand.g:1308:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers4654); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers4663);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers4670); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            // ShellCommand.g:1317:3: ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==COMMA) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ShellCommand.g:1318:5: COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers4692); if (state.failed) return retval;

            	    pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers4707);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) { retval.participans.add((r!=null?r.n:null)); }

            	    // ShellCommand.g:1322:5: ( LBRACE qualifierValues= rValList RBRACE )?
            	    int alt58=2;
            	    int LA58_0 = input.LA(1);

            	    if ( (LA58_0==LBRACE) ) {
            	        alt58=1;
            	    }
            	    switch (alt58) {
            	        case 1 :
            	            // ShellCommand.g:1323:6: LBRACE qualifierValues= rValList RBRACE
            	            {
            	            match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers4727); if (state.failed) return retval;

            	            pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers4738);
            	            qualifierValues=rValList();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

            	            match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers4747); if (state.failed) return retval;

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
            	    break loop59;
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
    // ShellCommand.g:1338:1: lnkDelStat returns [ASTLinkDeletionStatement n] : 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT ;
    public final ASTLinkDeletionStatement lnkDelStat() throws RecognitionException {
        ASTLinkDeletionStatement n = null;


        Token ass=null;
        ShellCommandParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // ShellCommand.g:1339:3: ( 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT )
            // ShellCommand.g:1340:3: 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT
            {
            match(input,58,FOLLOW_58_in_lnkDelStat4788); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkDelStat4792); if (state.failed) return n;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat4802);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkDelStat4806); if (state.failed) return n;

            match(input,68,FOLLOW_68_in_lnkDelStat4810); if (state.failed) return n;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkDelStat4819); if (state.failed) return n;

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
    // ShellCommand.g:1354:1: condExStat returns [ASTConditionalExecutionStatement n] : 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' ;
    public final ASTConditionalExecutionStatement condExStat() throws RecognitionException {
        ASTConditionalExecutionStatement n = null;


        ASTExpression con =null;

        ASTStatement ts =null;

        ASTStatement es =null;



          ASTStatement elseStat = new ASTEmptyStatement();

        try {
            // ShellCommand.g:1358:3: ( 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' )
            // ShellCommand.g:1359:3: 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end'
            {
            match(input,69,FOLLOW_69_in_condExStat4850); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_condExStat4859);
            con=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            match(input,89,FOLLOW_89_in_condExStat4863); if (state.failed) return n;

            pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat4872);
            ts=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return n;

            // ShellCommand.g:1363:3: ( 'else' es= statOrImplicitBlock )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==62) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ShellCommand.g:1364:5: 'else' es= statOrImplicitBlock
                    {
                    match(input,62,FOLLOW_62_in_condExStat4883); if (state.failed) return n;

                    pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat4895);
                    es=statOrImplicitBlock();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { elseStat = es; }

                    }
                    break;

            }


            match(input,63,FOLLOW_63_in_condExStat4907); if (state.failed) return n;

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
    // ShellCommand.g:1375:1: iterStat returns [ASTIterationStatement n] : 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final ASTIterationStatement iterStat() throws RecognitionException {
        ASTIterationStatement n = null;


        Token var=null;
        ASTExpression set =null;

        ASTStatement s =null;


        try {
            // ShellCommand.g:1376:3: ( 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // ShellCommand.g:1377:3: 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,67,FOLLOW_67_in_iterStat4932); if (state.failed) return n;

            var=(Token)match(input,IDENT,FOLLOW_IDENT_in_iterStat4940); if (state.failed) return n;

            match(input,71,FOLLOW_71_in_iterStat4944); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_iterStat4952);
            set=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            match(input,61,FOLLOW_61_in_iterStat4956); if (state.failed) return n;

            pushFollow(FOLLOW_statOrImplicitBlock_in_iterStat4964);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return n;

            match(input,63,FOLLOW_63_in_iterStat4969); if (state.failed) return n;

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
    // ShellCommand.g:1392:1: whileStat returns [ASTWhileStatement n] : 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final ASTWhileStatement whileStat() throws RecognitionException {
        ASTWhileStatement n = null;


        ASTExpression cond =null;

        ASTStatement s =null;


        try {
            // ShellCommand.g:1393:3: ( 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // ShellCommand.g:1394:3: 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,91,FOLLOW_91_in_whileStat4995); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_whileStat5003);
            cond=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            match(input,61,FOLLOW_61_in_whileStat5007); if (state.failed) return n;

            pushFollow(FOLLOW_statOrImplicitBlock_in_whileStat5015);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return n;

            match(input,63,FOLLOW_63_in_whileStat5020); if (state.failed) return n;

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
    // ShellCommand.g:1406:1: blockStat returns [ASTBlockStatement n] : 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' ;
    public final ASTBlockStatement blockStat() throws RecognitionException {
        ASTBlockStatement n = null;


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        ShellCommandParser.stat_return s =null;



          n = new ASTBlockStatement(org.tzi.use.config.Options.explicitVariableDeclarations);

        try {
            // ShellCommand.g:1410:2: ( 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' )
            // ShellCommand.g:1411:2: 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end'
            {
            match(input,54,FOLLOW_54_in_blockStat5050); if (state.failed) return n;

            // ShellCommand.g:1412:2: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==57) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ShellCommand.g:1412:4: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI
                    {
                    match(input,57,FOLLOW_57_in_blockStat5055); if (state.failed) return n;

                    pushFollow(FOLLOW_variableDeclaration_in_blockStat5061);
                    vd=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addVariableDeclaration(vd);}

                    // ShellCommand.g:1412:72: ( COMMA vd1= variableDeclaration )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==COMMA) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ShellCommand.g:1412:74: COMMA vd1= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_blockStat5067); if (state.failed) return n;

                    	    pushFollow(FOLLOW_variableDeclaration_in_blockStat5073);
                    	    vd1=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addVariableDeclaration(vd1);}

                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);


                    match(input,SEMI,FOLLOW_SEMI_in_blockStat5080); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_stat_in_blockStat5090);
            s=stat();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setBody((s!=null?s.n:null)); }

            match(input,63,FOLLOW_63_in_blockStat5095); if (state.failed) return n;

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
    // ShellCommand.g:1421:1: implicitBlockStat returns [ASTBlockStatement n] : 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat ;
    public final ASTBlockStatement implicitBlockStat() throws RecognitionException {
        ASTBlockStatement n = null;


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        ShellCommandParser.stat_return s =null;



          n = new ASTBlockStatement(false);

        try {
            // ShellCommand.g:1425:3: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat )
            // ShellCommand.g:1426:3: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat
            {
            match(input,57,FOLLOW_57_in_implicitBlockStat5121); if (state.failed) return n;

            pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat5127);
            vd=variableDeclaration();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.addVariableDeclaration(vd);}

            // ShellCommand.g:1426:71: ( COMMA vd1= variableDeclaration )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==COMMA) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ShellCommand.g:1426:73: COMMA vd1= variableDeclaration
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_implicitBlockStat5133); if (state.failed) return n;

            	    pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat5139);
            	    vd1=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addVariableDeclaration(vd1);}

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


            match(input,SEMI,FOLLOW_SEMI_in_implicitBlockStat5146); if (state.failed) return n;

            pushFollow(FOLLOW_stat_in_implicitBlockStat5154);
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
    // ShellCommand.g:1430:1: statOrImplicitBlock returns [ASTStatement n] : (s1= stat |s2= implicitBlockStat ) ;
    public final ASTStatement statOrImplicitBlock() throws RecognitionException {
        ASTStatement n = null;


        ShellCommandParser.stat_return s1 =null;

        ASTBlockStatement s2 =null;


        try {
            // ShellCommand.g:1431:3: ( (s1= stat |s2= implicitBlockStat ) )
            // ShellCommand.g:1432:3: (s1= stat |s2= implicitBlockStat )
            {
            // ShellCommand.g:1432:3: (s1= stat |s2= implicitBlockStat )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==AT||LA64_0==HASH||(LA64_0 >= IDENT && LA64_0 <= INT)||(LA64_0 >= LPAREN && LA64_0 <= MINUS)||LA64_0==PLUS||LA64_0==REAL||LA64_0==SEMI||LA64_0==STRING||(LA64_0 >= 44 && LA64_0 <= 50)||LA64_0==54||(LA64_0 >= 58 && LA64_0 <= 59)||(LA64_0 >= 62 && LA64_0 <= 63)||(LA64_0 >= 66 && LA64_0 <= 67)||LA64_0==69||LA64_0==72||(LA64_0 >= 74 && LA64_0 <= 83)||(LA64_0 >= 90 && LA64_0 <= 91)) ) {
                alt64=1;
            }
            else if ( (LA64_0==57) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;

            }
            switch (alt64) {
                case 1 :
                    // ShellCommand.g:1432:4: s1= stat
                    {
                    pushFollow(FOLLOW_stat_in_statOrImplicitBlock5177);
                    s1=stat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (s1!=null?s1.n:null); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:1432:31: s2= implicitBlockStat
                    {
                    pushFollow(FOLLOW_implicitBlockStat_in_statOrImplicitBlock5187);
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
    // ShellCommand.g:1446:1: nothing :;
    public final void nothing() throws RecognitionException {
        try {
            // ShellCommand.g:1447:1: ()
            // ShellCommand.g:1448:1: 
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
    // ShellCommand.g:1454:1: rValue returns [ASTRValue n] : (e= inSoilExpression |oc= objCreateStat );
    public final ShellCommandParser.rValue_return rValue() throws RecognitionException {
        ShellCommandParser.rValue_return retval = new ShellCommandParser.rValue_return();
        retval.start = input.LT(1);


        ASTExpression e =null;

        ASTStatement oc =null;


        try {
            // ShellCommand.g:1455:5: (e= inSoilExpression |oc= objCreateStat )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==AT||LA65_0==HASH||(LA65_0 >= IDENT && LA65_0 <= INT)||(LA65_0 >= LPAREN && LA65_0 <= MINUS)||LA65_0==PLUS||LA65_0==REAL||LA65_0==STRING||(LA65_0 >= 44 && LA65_0 <= 50)||LA65_0==66||LA65_0==69||(LA65_0 >= 74 && LA65_0 <= 75)||(LA65_0 >= 77 && LA65_0 <= 83)||LA65_0==90) ) {
                alt65=1;
            }
            else if ( (LA65_0==76) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;

            }
            switch (alt65) {
                case 1 :
                    // ShellCommand.g:1456:5: e= inSoilExpression
                    {
                    pushFollow(FOLLOW_inSoilExpression_in_rValue5233);
                    e=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n = new ASTRValueExpressionOrOpCall(e); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:1457:5: oc= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_rValue5245);
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
    // ShellCommand.g:1471:1: rValList returns [List<ASTRValue> n] : ( nothing |rl= rValListMin1 );
    public final List<ASTRValue> rValList() throws RecognitionException {
        List<ASTRValue> n = null;


        List<ASTRValue> rl =null;


        try {
            // ShellCommand.g:1472:3: ( nothing |rl= rValListMin1 )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RBRACE) ) {
                alt66=1;
            }
            else if ( (LA66_0==AT||LA66_0==HASH||(LA66_0 >= IDENT && LA66_0 <= INT)||(LA66_0 >= LPAREN && LA66_0 <= MINUS)||LA66_0==PLUS||LA66_0==REAL||LA66_0==STRING||(LA66_0 >= 44 && LA66_0 <= 50)||LA66_0==66||LA66_0==69||(LA66_0 >= 74 && LA66_0 <= 83)||LA66_0==90) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;

            }
            switch (alt66) {
                case 1 :
                    // ShellCommand.g:1473:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_rValList5268);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = Collections.<ASTRValue>emptyList(); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:1476:3: rl= rValListMin1
                    {
                    pushFollow(FOLLOW_rValListMin1_in_rValList5295);
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
    // ShellCommand.g:1484:1: rValListMin1 returns [List<ASTRValue> n] : r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin1() throws RecognitionException {
        List<ASTRValue> n = null;


        ShellCommandParser.rValue_return r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // ShellCommand.g:1488:3: (r= rValue ( COMMA r= rValue )* )
            // ShellCommand.g:1489:3: r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin15328);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            // ShellCommand.g:1491:3: ( COMMA r= rValue )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==COMMA) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ShellCommand.g:1492:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin15342); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin15352);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            	    }
            	    break;

            	default :
            	    break loop67;
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
    // ShellCommand.g:1502:1: rValListMin2 returns [List<ASTRValue> n] : r= rValue COMMA r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin2() throws RecognitionException {
        List<ASTRValue> n = null;


        ShellCommandParser.rValue_return r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // ShellCommand.g:1506:3: (r= rValue COMMA r= rValue ( COMMA r= rValue )* )
            // ShellCommand.g:1507:3: r= rValue COMMA r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin25391);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin25399); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_rValListMin25407);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            // ShellCommand.g:1512:3: ( COMMA r= rValue )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==COMMA) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ShellCommand.g:1513:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin25421); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin25431);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            	    }
            	    break;

            	default :
            	    break loop68;
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
    // ShellCommand.g:1523:1: inSoilExpression returns [ASTExpression n] : e= expression ;
    public final ASTExpression inSoilExpression() throws RecognitionException {
        ASTExpression n = null;


        ShellCommandParser.expression_return e =null;


        try {
            // ShellCommand.g:1524:3: (e= expression )
            // ShellCommand.g:1525:3: e= expression
            {
            pushFollow(FOLLOW_expression_in_inSoilExpression5465);
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
    // ShellCommand.g:1534:1: exprList returns [List<ASTExpression> n] : ( nothing |el= exprListMin1 );
    public final List<ASTExpression> exprList() throws RecognitionException {
        List<ASTExpression> n = null;


        List<ASTExpression> el =null;


        try {
            // ShellCommand.g:1535:3: ( nothing |el= exprListMin1 )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RPAREN) ) {
                alt69=1;
            }
            else if ( (LA69_0==AT||LA69_0==HASH||(LA69_0 >= IDENT && LA69_0 <= INT)||(LA69_0 >= LPAREN && LA69_0 <= MINUS)||LA69_0==PLUS||LA69_0==REAL||LA69_0==STRING||(LA69_0 >= 44 && LA69_0 <= 50)||LA69_0==66||LA69_0==69||(LA69_0 >= 74 && LA69_0 <= 75)||(LA69_0 >= 77 && LA69_0 <= 83)||LA69_0==90) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;

            }
            switch (alt69) {
                case 1 :
                    // ShellCommand.g:1536:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_exprList5494);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<ASTExpression>(); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:1539:3: el= exprListMin1
                    {
                    pushFollow(FOLLOW_exprListMin1_in_exprList5512);
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
    // ShellCommand.g:1547:1: exprListMin1 returns [List<ASTExpression> n] : e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin1() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // ShellCommand.g:1551:3: (e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // ShellCommand.g:1552:3: e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin15545);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // ShellCommand.g:1554:3: ( COMMA e= inSoilExpression )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==COMMA) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ShellCommand.g:1555:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin15560); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin15570);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            	    }
            	    break;

            	default :
            	    break loop70;
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
    // ShellCommand.g:1565:1: exprListMin2 returns [List<ASTExpression> n] : e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin2() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // ShellCommand.g:1569:3: (e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // ShellCommand.g:1570:3: e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin25610);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            match(input,COMMA,FOLLOW_COMMA_in_exprListMin25618); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_exprListMin25626);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // ShellCommand.g:1575:3: ( COMMA e= inSoilExpression )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==COMMA) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ShellCommand.g:1576:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin25640); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin25650);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            	    }
            	    break;

            	default :
            	    break loop71;
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
    // ShellCommand.g:1586:1: identList returns [List<String> n] : ( nothing |il= identListMin1 );
    public final List<String> identList() throws RecognitionException {
        List<String> n = null;


        List<String> il =null;


        try {
            // ShellCommand.g:1587:3: ( nothing |il= identListMin1 )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==EOF||LA72_0==RBRACE||(LA72_0 >= RPAREN && LA72_0 <= SEMI)||(LA72_0 >= 62 && LA72_0 <= 63)) ) {
                alt72=1;
            }
            else if ( (LA72_0==IDENT) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;

            }
            switch (alt72) {
                case 1 :
                    // ShellCommand.g:1588:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_identList5680);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<String>(); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:1591:3: il= identListMin1
                    {
                    pushFollow(FOLLOW_identListMin1_in_identList5697);
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
    // ShellCommand.g:1599:1: identListMin1 returns [List<String> n] : id= IDENT ( COMMA id= IDENT )* ;
    public final List<String> identListMin1() throws RecognitionException {
        List<String> n = null;


        Token id=null;


          n = new ArrayList<String>();

        try {
            // ShellCommand.g:1603:3: (id= IDENT ( COMMA id= IDENT )* )
            // ShellCommand.g:1604:3: id= IDENT ( COMMA id= IDENT )*
            {
            id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin15731); if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((id!=null?id.getText():null)); }

            // ShellCommand.g:1606:3: ( COMMA id= IDENT )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==COMMA) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ShellCommand.g:1607:5: COMMA id= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_identListMin15745); if (state.failed) return n;

            	    id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin15755); if (state.failed) return n;

            	    if ( state.backtracking==0 ) {
            	        n.add((id!=null?id.getText():null)); }

            	    }
            	    break;

            	default :
            	    break loop73;
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

    // $ANTLR start synpred1_ShellCommand
    public final void synpred1_ShellCommand_fragment() throws RecognitionException {
        // ShellCommand.g:87:3: ( stat )
        // ShellCommand.g:87:4: stat
        {
        pushFollow(FOLLOW_stat_in_synpred1_ShellCommand57);
        stat();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_ShellCommand

    // $ANTLR start synpred2_ShellCommand
    public final void synpred2_ShellCommand_fragment() throws RecognitionException {
        // ShellCommand.g:90:3: ( legacyStat )
        // ShellCommand.g:90:4: legacyStat
        {
        pushFollow(FOLLOW_legacyStat_in_synpred2_ShellCommand78);
        legacyStat();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_ShellCommand

    // $ANTLR start synpred3_ShellCommand
    public final void synpred3_ShellCommand_fragment() throws RecognitionException {
        // ShellCommand.g:100:3: ( legacyStat )
        // ShellCommand.g:100:4: legacyStat
        {
        pushFollow(FOLLOW_legacyStat_in_synpred3_ShellCommand110);
        legacyStat();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_ShellCommand

    // $ANTLR start synpred4_ShellCommand
    public final void synpred4_ShellCommand_fragment() throws RecognitionException {
        // ShellCommand.g:103:3: ( stat )
        // ShellCommand.g:103:4: stat
        {
        pushFollow(FOLLOW_stat_in_synpred4_ShellCommand133);
        stat();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_ShellCommand

    // $ANTLR start synpred5_ShellCommand
    public final void synpred5_ShellCommand_fragment() throws RecognitionException {
        // ShellCommand.g:351:13: ( inSoilExpression )
        // ShellCommand.g:351:14: inSoilExpression
        {
        pushFollow(FOLLOW_inSoilExpression_in_synpred5_ShellCommand813);
        inSoilExpression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_ShellCommand

    // $ANTLR start synpred6_ShellCommand
    public final void synpred6_ShellCommand_fragment() throws RecognitionException {
        // ShellCommand.g:925:7: ( COLON type EQUAL )
        // ShellCommand.g:925:8: COLON type EQUAL
        {
        match(input,COLON,FOLLOW_COLON_in_synpred6_ShellCommand3455); if (state.failed) return ;

        pushFollow(FOLLOW_type_in_synpred6_ShellCommand3457);
        type();

        state._fsp--;
        if (state.failed) return ;

        match(input,EQUAL,FOLLOW_EQUAL_in_synpred6_ShellCommand3459); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_ShellCommand

    // $ANTLR start synpred7_ShellCommand
    public final void synpred7_ShellCommand_fragment() throws RecognitionException {
        // ShellCommand.g:1097:5: ( statStartingWithExpr )
        // ShellCommand.g:1097:6: statStartingWithExpr
        {
        pushFollow(FOLLOW_statStartingWithExpr_in_synpred7_ShellCommand4029);
        statStartingWithExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_ShellCommand

    // Delegated rules

    public final boolean synpred7_ShellCommand() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_ShellCommand_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_ShellCommand() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_ShellCommand_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_ShellCommand() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_ShellCommand_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_ShellCommand() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_ShellCommand_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_ShellCommand() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_ShellCommand_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_ShellCommand() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_ShellCommand_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_ShellCommand() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_ShellCommand_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_stat_in_shellCommandOnly65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyStat_in_shellCommandOnly86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyStat_in_shellCommand118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_shellCommand120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_shellCommand141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_shellCommand143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyOpEnter_in_legacyStat177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyOpExit_in_legacyStat193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nextLegacyStat_in_legacyStat206 = new BitSet(new long[]{0x0D20000000000002L,0x0000000001000902L});
    public static final BitSet FOLLOW_nextLegacyStat_in_legacyStat217 = new BitSet(new long[]{0x0D20000000000002L,0x0000000001000902L});
    public static final BitSet FOLLOW_singleLegacyStat_in_nextLegacyStat251 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_nextLegacyStat255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyCreate_in_singleLegacyStat288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyCreateAssign_in_singleLegacyStat307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyCreateInsert_in_singleLegacyStat320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyLet_in_singleLegacyStat333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyExecute_in_singleLegacyStat361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objDestroyStat_in_singleLegacyStat379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_singleLegacyStat392 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_singleLegacyStat396 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_attAssignStat_in_singleLegacyStat402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkInsStat_in_singleLegacyStat415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkDelStat_in_singleLegacyStat436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_legacyCreate472 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_identListMin1_in_legacyCreate480 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_legacyCreate484 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_legacyCreate492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_legacyCreateAssign529 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_identListMin1_in_legacyCreateAssign537 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_legacyCreateAssign541 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_legacyCreateAssign545 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_legacyCreateAssign553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_legacyCreateInsert587 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_legacyCreateInsert595 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_legacyCreateInsert599 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_legacyCreateInsert607 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_legacyCreateInsert611 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_legacyCreateInsert615 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FFC24L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_legacyCreateInsert625 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_legacyCreateInsert629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_legacyLet662 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_legacyLet670 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_legacyLet680 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_legacyLet690 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_legacyLet699 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_inSoilExpression_in_legacyLet707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_legacyOpEnter740 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_inSoilExpression_in_legacyOpEnter748 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_legacyOpEnter756 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_legacyOpEnter760 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_exprList_in_legacyOpEnter770 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_legacyOpEnter774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_legacyOpExit809 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_inSoilExpression_in_legacyOpExit821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_legacyOpExit825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_legacyExecute858 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_legacyExecute862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionOnly896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expressionOnly898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_expression946 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression950 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression954 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_expression958 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression963 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_expression967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_expression969 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_paramList1027 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList1044 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_paramList1056 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList1060 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_paramList1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList1109 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_idList1119 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_idList1123 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaration1154 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration1156 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1196 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_conditionalImpliesExpression1209 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FE424L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1213 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1258 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_conditionalOrExpression1271 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FE424L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1275 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1319 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_conditionalXOrExpression1332 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FE424L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1336 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression1380 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_conditionalAndExpression1393 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FE424L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression1397 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1445 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_set_in_equalityExpression1464 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FE424L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1474 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1523 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_set_in_relationalExpression1541 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FE424L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1559 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1609 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression1627 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FE424L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1637 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1687 = new BitSet(new long[]{0x1000014000000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1705 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FE424L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1719 = new BitSet(new long[]{0x1000014000000002L});
    public static final BitSet FOLLOW_set_in_unaryExpression1781 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FE424L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression1858 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_ARROW_in_postfixExpression1876 = new BitSet(new long[]{0x0000000000080000L,0x0000000000068400L});
    public static final BitSet FOLLOW_DOT_in_postfixExpression1882 = new BitSet(new long[]{0x0000000000080000L,0x0000000000068400L});
    public static final BitSet FOLLOW_propertyCall_in_postfixExpression1893 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_literal_in_primaryExpression1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectReference_in_primaryExpression1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_primaryExpression1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression1970 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_primaryExpression1974 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_primaryExpression1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression2000 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression2002 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_primaryExpression2004 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression2008 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression2010 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression2031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_primaryExpression2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_objectReference2060 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_objectReference2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpression_in_propertyCall2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpression_in_propertyCall2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationExpression_in_propertyCall2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeExpression_in_propertyCall2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpression2207 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_queryExpression2214 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression2225 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_queryExpression2229 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_queryExpression2240 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_queryExpression2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_iterateExpression2278 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpression2284 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression2292 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_iterateExpression2294 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableInitialization_in_iterateExpression2302 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_iterateExpression2304 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_iterateExpression2312 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpression2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_operationExpression2362 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression2384 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_operationExpression2397 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2410 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_operationExpression2414 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression2426 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression2443 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_operationExpression2458 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2473 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_operationExpression2477 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression2491 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_operationExpression2516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_operationExpression2518 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_operationExpression2543 = new BitSet(new long[]{0x0007F218861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_operationExpression2564 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2576 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_operationExpression2580 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_operationExpression2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeExpression2649 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeExpression2665 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_typeExpression2669 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeExpression2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration2709 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration2712 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration2716 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration2726 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration2732 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration2735 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration2741 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableInitialization2769 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableInitialization2771 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_variableInitialization2775 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_variableInitialization2777 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_variableInitialization2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ifExpression2813 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_ifExpression2817 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ifExpression2819 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_ifExpression2823 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ifExpression2825 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_ifExpression2829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ifExpression2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_literal2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_literal2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_literal2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal2936 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_literal2952 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_literal2954 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteral_in_literal2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefinedLiteral_in_literal2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleLiteral_in_literal3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionLiteral3044 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_collectionLiteral3073 = new BitSet(new long[]{0x0007F20A861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral3090 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_collectionLiteral3103 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral3107 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_collectionLiteral3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_collectionItem3155 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_DOTDOT_in_collectionItem3166 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_collectionItem3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_emptyCollectionLiteral3199 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral3201 = new BitSet(new long[]{0x0001F00000000000L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral3205 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral3207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral3223 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral3225 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_undefinedLiteral3257 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral3259 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral3263 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_undefinedLiteral3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_undefinedLiteral3293 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral3295 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral3299 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_undefinedLiteral3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_tupleLiteral3354 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_tupleLiteral3360 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral3368 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleLiteral3379 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral3383 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_tupleLiteral3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tupleItem3425 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_tupleItem3464 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_tupleItem3468 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_tupleItem3470 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_tupleItem3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tupleItem3496 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_tupleItem3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type3572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleType_in_type3596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeOnly3628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_typeOnly3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleType3658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType3696 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType3723 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_collectionType3727 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_tupleType3763 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_tupleType3765 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType3774 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleType3785 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType3789 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_tupleType3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tuplePart3833 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_tuplePart3835 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_tuplePart3839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOnly3888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_statOnly3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nextStat_in_stat3923 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_stat3934 = new BitSet(new long[]{0x0C47F208861A0020L,0x000000000C0FFD2CL});
    public static final BitSet FOLLOW_nextStat_in_stat3940 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_singleStat_in_nextStat3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStat_in_singleStat4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_singleStat4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAssignStat_in_singleStat4049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_singleStat4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objDestroyStat_in_singleStat4077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkInsStat_in_singleStat4090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkDelStat_in_singleStat4107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExStat_in_singleStat4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterStat_in_singleStat4141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStat_in_singleStat4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStat_in_singleStat4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_emptyStat4208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_statStartingWithExpr4234 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attAssignStat_in_statStartingWithExpr4248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varAssignStat4286 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_varAssignStat4290 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FFC24L});
    public static final BitSet FOLLOW_rValue_in_varAssignStat4298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_attAssignStat4329 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_attAssignStat4338 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_attAssignStat4342 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FFC24L});
    public static final BitSet FOLLOW_rValue_in_attAssignStat4350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_objCreateStat4376 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_objCreateStat4384 = new BitSet(new long[]{0x0080000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat4394 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_inSoilExpression_in_objCreateStat4406 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat4412 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_objCreateStat4430 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat4438 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FFC24L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat4452 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_objDestroyStat4496 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_exprListMin1_in_objDestroyStat4504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_lnkInsStat4530 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkInsStat4534 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FFC24L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat4544 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkInsStat4548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_lnkInsStat4552 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_lnkInsStat4560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers4589 = new BitSet(new long[]{0x0000000000200400L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers4600 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FFC24L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers4609 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers4616 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers4632 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FFC24L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers4643 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers4654 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FFC24L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers4663 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers4670 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers4692 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FFC24L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers4707 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers4727 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FFC24L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers4738 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers4747 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_58_in_lnkDelStat4788 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkDelStat4792 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FFC24L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat4802 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkDelStat4806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_lnkDelStat4810 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_lnkDelStat4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_condExStat4850 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_inSoilExpression_in_condExStat4859 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_condExStat4863 = new BitSet(new long[]{0x0E47F208861A0020L,0x000000000C0FFD2CL});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat4872 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_62_in_condExStat4883 = new BitSet(new long[]{0x0E47F208861A0020L,0x000000000C0FFD2CL});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat4895 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_condExStat4907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_iterStat4932 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_iterStat4940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_iterStat4944 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_inSoilExpression_in_iterStat4952 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_iterStat4956 = new BitSet(new long[]{0x0E47F208861A0020L,0x000000000C0FFD2CL});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_iterStat4964 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_iterStat4969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_whileStat4995 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_inSoilExpression_in_whileStat5003 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_whileStat5007 = new BitSet(new long[]{0x0E47F208861A0020L,0x000000000C0FFD2CL});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_whileStat5015 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_whileStat5020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_blockStat5050 = new BitSet(new long[]{0x0E47F208861A0020L,0x000000000C0FFD2CL});
    public static final BitSet FOLLOW_57_in_blockStat5055 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat5061 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_blockStat5067 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat5073 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_SEMI_in_blockStat5080 = new BitSet(new long[]{0x0C47F208861A0020L,0x000000000C0FFD2CL});
    public static final BitSet FOLLOW_stat_in_blockStat5090 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_blockStat5095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_implicitBlockStat5121 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat5127 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_implicitBlockStat5133 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat5139 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_SEMI_in_implicitBlockStat5146 = new BitSet(new long[]{0x0C47F208861A0020L,0x000000000C0FFD2CL});
    public static final BitSet FOLLOW_stat_in_implicitBlockStat5154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOrImplicitBlock5177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicitBlockStat_in_statOrImplicitBlock5187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_rValue5233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_rValue5245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_rValList5268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValListMin1_in_rValList5295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin15328 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin15342 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FFC24L});
    public static final BitSet FOLLOW_rValue_in_rValListMin15352 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rValue_in_rValListMin25391 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin25399 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FFC24L});
    public static final BitSet FOLLOW_rValue_in_rValListMin25407 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin25421 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FFC24L});
    public static final BitSet FOLLOW_rValue_in_rValListMin25431 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_expression_in_inSoilExpression5465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_exprList5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprListMin1_in_exprList5512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin15545 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin15560 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin15570 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin25610 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin25618 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin25626 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin25640 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin25650 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_nothing_in_identList5680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identListMin1_in_identList5697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identListMin15731 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_identListMin15745 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_identListMin15755 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_stat_in_synpred1_ShellCommand57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyStat_in_synpred2_ShellCommand78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyStat_in_synpred3_ShellCommand110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_synpred4_ShellCommand133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_synpred5_ShellCommand813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_synpred6_ShellCommand3455 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_synpred6_ShellCommand3457 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_synpred6_ShellCommand3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_synpred7_ShellCommand4029 = new BitSet(new long[]{0x0000000000000002L});

}