// $ANTLR 3.4 RTL.g 2013-03-11 17:59:45

/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2004 Mark Richters, University of Bremen
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
 /* @author hanhdd*/

package org.tzi.use.parser.tgg;

import org.tzi.use.parser.base.BaseParser;
import org.tzi.use.parser.ocl.*;
import org.tzi.use.parser.use.*;
import org.tzi.use.parser.tgg.ast.*;
import org.tzi.use.parser.soil.ast.*;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Collections;
import java.util.Set;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class RTLParser extends BaseParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "BAR", "COLON", "COLON_COLON", "COLON_EQUAL", "COMMA", "COND_EXPR", "DOT", "DOTDOT", "EQUAL", "ESC", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "INT", "LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MINUS", "ML_COMMENT", "NEWLINE", "NON_OCL_STRING", "NOT_EQUAL", "PLUS", "RANGE_OR_INT", "RBRACE", "RBRACK", "REAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "STRING", "VOCAB", "WS", "'Bag'", "'Collection'", "'EXPLICIT'", "'OrderedSet'", "'Sequence'", "'Set'", "'Tuple'", "'Undefined'", "'abstract'", "'allInstances'", "'and'", "'as'", "'associationClass'", "'associationclass'", "'attributes'", "'begin'", "'between'", "'checkCorr'", "'checkSource'", "'checkTarget'", "'constraints'", "'context'", "'declare'", "'delete'", "'destroy'", "'div'", "'do'", "'else'", "'end'", "'endif'", "'enum'", "'existential'", "'false'", "'for'", "'from'", "'if'", "'implies'", "'in'", "'insert'", "'into'", "'inv'", "'iterate'", "'let'", "'mode'", "'model'", "'new'", "'not'", "'null'", "'oclAsType'", "'oclEmpty'", "'oclIsKindOf'", "'oclIsTypeOf'", "'oclUndefined'", "'operations'", "'or'", "'ordered'", "'post'", "'pre'", "'redefines'", "'rule'", "'subsets'", "'then'", "'transformation'", "'true'", "'while'", "'xor'"
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
    public static final int T__106=106;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__110=110;
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


    public RTLParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public RTLParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return RTLParser.tokenNames; }
    public String getGrammarFileName() { return "RTL.g"; }



    // $ANTLR start "tggRuleCollection"
    // RTL.g:76:1: tggRuleCollection returns [ASTTggRuleCollection n] : 'transformation' name= IDENT (tggRule= tggRuleDefinition )* EOF ;
    public final ASTTggRuleCollection tggRuleCollection() throws RecognitionException {
        ASTTggRuleCollection n = null;


        Token name=null;
        ASTTggRule tggRule =null;


        try {
            // RTL.g:77:5: ( 'transformation' name= IDENT (tggRule= tggRuleDefinition )* EOF )
            // RTL.g:78:5: 'transformation' name= IDENT (tggRule= tggRuleDefinition )* EOF
            {
            match(input,107,FOLLOW_107_in_tggRuleCollection65); if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tggRuleCollection69); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTTggRuleCollection(); }

            // RTL.g:79:5: (tggRule= tggRuleDefinition )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==104) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // RTL.g:79:7: tggRule= tggRuleDefinition
            	    {
            	    pushFollow(FOLLOW_tggRuleDefinition_in_tggRuleCollection81);
            	    tggRule=tggRuleDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addTggRule(tggRule); }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match(input,EOF,FOLLOW_EOF_in_tggRuleCollection92); if (state.failed) return n;

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



    // $ANTLR start "tggRuleDefinition"
    // RTL.g:88:1: tggRuleDefinition returns [ASTTggRule n] : 'rule' name= IDENT ( 'mode' 'EXPLICIT' )? 'checkSource' sourceRule= ruleDefinition 'checkTarget' targetRule= ruleDefinition 'checkCorr' corrRule= corrRuleDefinition 'end' ;
    public final ASTTggRule tggRuleDefinition() throws RecognitionException {
        ASTTggRule n = null;


        Token name=null;
        ASTRule sourceRule =null;

        ASTRule targetRule =null;

        ASTCorrRule corrRule =null;


         
          boolean isDeletingRule = false;

        try {
            // RTL.g:92:5: ( 'rule' name= IDENT ( 'mode' 'EXPLICIT' )? 'checkSource' sourceRule= ruleDefinition 'checkTarget' targetRule= ruleDefinition 'checkCorr' corrRule= corrRuleDefinition 'end' )
            // RTL.g:93:5: 'rule' name= IDENT ( 'mode' 'EXPLICIT' )? 'checkSource' sourceRule= ruleDefinition 'checkTarget' targetRule= ruleDefinition 'checkCorr' corrRule= corrRuleDefinition 'end'
            {
            match(input,104,FOLLOW_104_in_tggRuleDefinition120); if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tggRuleDefinition124); if (state.failed) return n;

            // RTL.g:94:5: ( 'mode' 'EXPLICIT' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==88) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // RTL.g:94:6: 'mode' 'EXPLICIT'
                    {
                    match(input,88,FOLLOW_88_in_tggRuleDefinition131); if (state.failed) return n;

                    match(input,47,FOLLOW_47_in_tggRuleDefinition133); if (state.failed) return n;

                    if ( state.backtracking==0 ) {isDeletingRule = true;}

                    }
                    break;

            }


            match(input,63,FOLLOW_63_in_tggRuleDefinition142); if (state.failed) return n;

            pushFollow(FOLLOW_ruleDefinition_in_tggRuleDefinition152);
            sourceRule=ruleDefinition();

            state._fsp--;
            if (state.failed) return n;

            match(input,64,FOLLOW_64_in_tggRuleDefinition158); if (state.failed) return n;

            pushFollow(FOLLOW_ruleDefinition_in_tggRuleDefinition168);
            targetRule=ruleDefinition();

            state._fsp--;
            if (state.failed) return n;

            match(input,62,FOLLOW_62_in_tggRuleDefinition174); if (state.failed) return n;

            pushFollow(FOLLOW_corrRuleDefinition_in_tggRuleDefinition184);
            corrRule=corrRuleDefinition();

            state._fsp--;
            if (state.failed) return n;

            match(input,73,FOLLOW_73_in_tggRuleDefinition190); if (state.failed) return n;

            if ( state.backtracking==0 ) {n = new ASTTggRule(name,sourceRule,targetRule,corrRule,isDeletingRule);}

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
    // RTL.g:109:1: ruleDefinition returns [ASTRule n] : LPAREN lhs= patternDefinition RPAREN LBRACE rhs= patternDefinition RBRACE ;
    public final ASTRule ruleDefinition() throws RecognitionException {
        ASTRule n = null;


        ASTPattern lhs =null;

        ASTPattern rhs =null;


        try {
            // RTL.g:110:5: ( LPAREN lhs= patternDefinition RPAREN LBRACE rhs= patternDefinition RBRACE )
            // RTL.g:111:5: LPAREN lhs= patternDefinition RPAREN LBRACE rhs= patternDefinition RBRACE
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_ruleDefinition217); if (state.failed) return n;

            pushFollow(FOLLOW_patternDefinition_in_ruleDefinition229);
            lhs=patternDefinition();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_ruleDefinition235); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_ruleDefinition238); if (state.failed) return n;

            pushFollow(FOLLOW_patternDefinition_in_ruleDefinition250);
            rhs=patternDefinition();

            state._fsp--;
            if (state.failed) return n;

            match(input,RBRACE,FOLLOW_RBRACE_in_ruleDefinition256); if (state.failed) return n;

            if ( state.backtracking==0 ) {n = new ASTRule(lhs,rhs);}

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
    // RTL.g:122:1: corrRuleDefinition returns [ASTCorrRule n] : LPAREN lhs= corrPatternDefinition RPAREN LBRACE rhs= corrPatternDefinition RBRACE ;
    public final ASTCorrRule corrRuleDefinition() throws RecognitionException {
        ASTCorrRule n = null;


        ASTExtPattern lhs =null;

        ASTExtPattern rhs =null;


        try {
            // RTL.g:123:5: ( LPAREN lhs= corrPatternDefinition RPAREN LBRACE rhs= corrPatternDefinition RBRACE )
            // RTL.g:124:5: LPAREN lhs= corrPatternDefinition RPAREN LBRACE rhs= corrPatternDefinition RBRACE
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_corrRuleDefinition278); if (state.failed) return n;

            pushFollow(FOLLOW_corrPatternDefinition_in_corrRuleDefinition290);
            lhs=corrPatternDefinition();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_corrRuleDefinition296); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_corrRuleDefinition299); if (state.failed) return n;

            pushFollow(FOLLOW_corrPatternDefinition_in_corrRuleDefinition311);
            rhs=corrPatternDefinition();

            state._fsp--;
            if (state.failed) return n;

            match(input,RBRACE,FOLLOW_RBRACE_in_corrRuleDefinition317); if (state.failed) return n;

            if ( state.backtracking==0 ) {n = new ASTCorrRule(lhs,rhs);}

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
    // RTL.g:136:1: patternDefinition returns [ASTPattern n] : (object= objectDefinition )* (link= linkDefinition )* (condition= conditionDefinition )* ;
    public final ASTPattern patternDefinition() throws RecognitionException {
        ASTPattern n = null;


        ASTObject object =null;

        ASTLink link =null;

        ASTCondition condition =null;



          n = new ASTPattern();

        try {
            // RTL.g:140:5: ( (object= objectDefinition )* (link= linkDefinition )* (condition= conditionDefinition )* )
            // RTL.g:141:5: (object= objectDefinition )* (link= linkDefinition )* (condition= conditionDefinition )*
            {
            // RTL.g:141:5: (object= objectDefinition )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==IDENT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // RTL.g:141:6: object= objectDefinition
            	    {
            	    pushFollow(FOLLOW_objectDefinition_in_patternDefinition355);
            	    object=objectDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) {n.addObject(object);}

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // RTL.g:142:5: (link= linkDefinition )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==LPAREN) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // RTL.g:142:6: link= linkDefinition
            	    {
            	    pushFollow(FOLLOW_linkDefinition_in_patternDefinition369);
            	    link=linkDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) {n.addLink(link);}

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            // RTL.g:143:5: (condition= conditionDefinition )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COND_EXPR) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // RTL.g:143:6: condition= conditionDefinition
            	    {
            	    pushFollow(FOLLOW_conditionDefinition_in_patternDefinition383);
            	    condition=conditionDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) {n.addCondition(condition);}

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // RTL.g:150:1: corrPatternDefinition returns [ASTExtPattern n] : (object= objectDefinition )* (corrLink= corrLinkDefinition )* (link= linkDefinition )* (className= IDENT COLON COND_EXPR )* (condition= conditionDefinition )* ;
    public final ASTExtPattern corrPatternDefinition() throws RecognitionException {
        ASTExtPattern n = null;


        Token className=null;
        ASTObject object =null;

        ASTCorrLink corrLink =null;

        ASTLink link =null;

        ASTCondition condition =null;



          n = new ASTExtPattern();

        try {
            // RTL.g:154:5: ( (object= objectDefinition )* (corrLink= corrLinkDefinition )* (link= linkDefinition )* (className= IDENT COLON COND_EXPR )* (condition= conditionDefinition )* )
            // RTL.g:155:5: (object= objectDefinition )* (corrLink= corrLinkDefinition )* (link= linkDefinition )* (className= IDENT COLON COND_EXPR )* (condition= conditionDefinition )*
            {
            // RTL.g:155:5: (object= objectDefinition )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==IDENT) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==COLON) ) {
                        int LA6_3 = input.LA(3);

                        if ( (LA6_3==IDENT) ) {
                            alt6=1;
                        }


                    }


                }


                switch (alt6) {
            	case 1 :
            	    // RTL.g:155:6: object= objectDefinition
            	    {
            	    pushFollow(FOLLOW_objectDefinition_in_corrPatternDefinition417);
            	    object=objectDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) {n.addObject(object);}

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            // RTL.g:156:5: (corrLink= corrLinkDefinition )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==LPAREN) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==IDENT) ) {
                        int LA7_3 = input.LA(3);

                        if ( (LA7_3==COMMA) ) {
                            int LA7_5 = input.LA(4);

                            if ( (LA7_5==IDENT) ) {
                                int LA7_6 = input.LA(5);

                                if ( (LA7_6==RPAREN) ) {
                                    int LA7_7 = input.LA(6);

                                    if ( (LA7_7==56||LA7_7==82) ) {
                                        alt7=1;
                                    }


                                }


                            }
                            else if ( (LA7_5==LPAREN) ) {
                                alt7=1;
                            }


                        }


                    }
                    else if ( (LA7_1==LPAREN) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // RTL.g:156:6: corrLink= corrLinkDefinition
            	    {
            	    pushFollow(FOLLOW_corrLinkDefinition_in_corrPatternDefinition431);
            	    corrLink=corrLinkDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) {n.addCorrLink(corrLink);}

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // RTL.g:157:5: (link= linkDefinition )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==LPAREN) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // RTL.g:157:6: link= linkDefinition
            	    {
            	    pushFollow(FOLLOW_linkDefinition_in_corrPatternDefinition445);
            	    link=linkDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) {n.addLink(link);}

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            // RTL.g:158:5: (className= IDENT COLON COND_EXPR )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==IDENT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // RTL.g:158:6: className= IDENT COLON COND_EXPR
            	    {
            	    className=(Token)match(input,IDENT,FOLLOW_IDENT_in_corrPatternDefinition457); if (state.failed) return n;

            	    match(input,COLON,FOLLOW_COLON_in_corrPatternDefinition459); if (state.failed) return n;

            	    match(input,COND_EXPR,FOLLOW_COND_EXPR_in_corrPatternDefinition461); if (state.failed) return n;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            // RTL.g:159:5: (condition= conditionDefinition )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==COND_EXPR) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // RTL.g:159:6: condition= conditionDefinition
            	    {
            	    pushFollow(FOLLOW_conditionDefinition_in_corrPatternDefinition474);
            	    condition=conditionDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) {n.addCondition(condition);}

            	    }
            	    break;

            	default :
            	    break loop10;
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



    // $ANTLR start "objectDefinition"
    // RTL.g:166:1: objectDefinition returns [ASTObject n] : objectName= IDENT COLON className= IDENT ;
    public final ASTObject objectDefinition() throws RecognitionException {
        ASTObject n = null;


        Token objectName=null;
        Token className=null;

        try {
            // RTL.g:167:2: (objectName= IDENT COLON className= IDENT )
            // RTL.g:168:2: objectName= IDENT COLON className= IDENT
            {
            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectDefinition497); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_objectDefinition499); if (state.failed) return n;

            className=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectDefinition504); if (state.failed) return n;

            if ( state.backtracking==0 ) {n = new ASTObject(objectName, className);}

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
    // RTL.g:176:1: linkDefinition returns [ASTLink n] : LPAREN obj1= IDENT COMMA obj2= IDENT RPAREN COLON assocName= IDENT ;
    public final ASTLink linkDefinition() throws RecognitionException {
        ASTLink n = null;


        Token obj1=null;
        Token obj2=null;
        Token assocName=null;

        try {
            // RTL.g:177:2: ( LPAREN obj1= IDENT COMMA obj2= IDENT RPAREN COLON assocName= IDENT )
            // RTL.g:178:2: LPAREN obj1= IDENT COMMA obj2= IDENT RPAREN COLON assocName= IDENT
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_linkDefinition523); if (state.failed) return n;

            obj1=(Token)match(input,IDENT,FOLLOW_IDENT_in_linkDefinition527); if (state.failed) return n;

            match(input,COMMA,FOLLOW_COMMA_in_linkDefinition529); if (state.failed) return n;

            obj2=(Token)match(input,IDENT,FOLLOW_IDENT_in_linkDefinition533); if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_linkDefinition535); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_linkDefinition537); if (state.failed) return n;

            assocName=(Token)match(input,IDENT,FOLLOW_IDENT_in_linkDefinition542); if (state.failed) return n;

            if ( state.backtracking==0 ) {n = new ASTLink(obj1, obj2, assocName);}

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
    // RTL.g:186:1: conditionDefinition returns [ASTCondition n] : cond= COND_EXPR ;
    public final ASTCondition conditionDefinition() throws RecognitionException {
        ASTCondition n = null;


        Token cond=null;

        try {
            // RTL.g:187:2: (cond= COND_EXPR )
            // RTL.g:188:2: cond= COND_EXPR
            {
            cond=(Token)match(input,COND_EXPR,FOLLOW_COND_EXPR_in_conditionDefinition564); if (state.failed) return n;

            if ( state.backtracking==0 ) {n = new ASTCondition(cond);}

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
    // RTL.g:197:1: corrLinkDefinition returns [ASTCorrLink n] : LPAREN ( LPAREN clsName1= IDENT RPAREN )? objS= IDENT COMMA ( LPAREN clsName2= IDENT RPAREN )? objT= IDENT RPAREN ( 'as' LPAREN role1= IDENT COMMA role2= IDENT RPAREN )? 'in' objCorr= IDENT COLON corrClass= IDENT ;
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
            // RTL.g:204:2: ( LPAREN ( LPAREN clsName1= IDENT RPAREN )? objS= IDENT COMMA ( LPAREN clsName2= IDENT RPAREN )? objT= IDENT RPAREN ( 'as' LPAREN role1= IDENT COMMA role2= IDENT RPAREN )? 'in' objCorr= IDENT COLON corrClass= IDENT )
            // RTL.g:205:2: LPAREN ( LPAREN clsName1= IDENT RPAREN )? objS= IDENT COMMA ( LPAREN clsName2= IDENT RPAREN )? objT= IDENT RPAREN ( 'as' LPAREN role1= IDENT COMMA role2= IDENT RPAREN )? 'in' objCorr= IDENT COLON corrClass= IDENT
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_corrLinkDefinition587); if (state.failed) return n;

            // RTL.g:206:2: ( LPAREN clsName1= IDENT RPAREN )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==LPAREN) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // RTL.g:206:3: LPAREN clsName1= IDENT RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_corrLinkDefinition592); if (state.failed) return n;

                    clsName1=(Token)match(input,IDENT,FOLLOW_IDENT_in_corrLinkDefinition596); if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_corrLinkDefinition598); if (state.failed) return n;

                    if ( state.backtracking==0 ) {newSourceClass = clsName1;}

                    }
                    break;

            }


            objS=(Token)match(input,IDENT,FOLLOW_IDENT_in_corrLinkDefinition608); if (state.failed) return n;

            match(input,COMMA,FOLLOW_COMMA_in_corrLinkDefinition610); if (state.failed) return n;

            // RTL.g:208:2: ( LPAREN clsName2= IDENT RPAREN )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==LPAREN) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // RTL.g:208:3: LPAREN clsName2= IDENT RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_corrLinkDefinition614); if (state.failed) return n;

                    clsName2=(Token)match(input,IDENT,FOLLOW_IDENT_in_corrLinkDefinition618); if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_corrLinkDefinition620); if (state.failed) return n;

                    if ( state.backtracking==0 ) {newTargetClass = clsName2;}

                    }
                    break;

            }


            objT=(Token)match(input,IDENT,FOLLOW_IDENT_in_corrLinkDefinition630); if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_corrLinkDefinition632); if (state.failed) return n;

            // RTL.g:209:20: ( 'as' LPAREN role1= IDENT COMMA role2= IDENT RPAREN )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==56) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // RTL.g:209:21: 'as' LPAREN role1= IDENT COMMA role2= IDENT RPAREN
                    {
                    match(input,56,FOLLOW_56_in_corrLinkDefinition635); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_corrLinkDefinition637); if (state.failed) return n;

                    role1=(Token)match(input,IDENT,FOLLOW_IDENT_in_corrLinkDefinition641); if (state.failed) return n;

                    match(input,COMMA,FOLLOW_COMMA_in_corrLinkDefinition643); if (state.failed) return n;

                    role2=(Token)match(input,IDENT,FOLLOW_IDENT_in_corrLinkDefinition647); if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_corrLinkDefinition649); if (state.failed) return n;

                    if ( state.backtracking==0 ) {sourceRole = role1;targetRole = role2;}

                    }
                    break;

            }


            match(input,82,FOLLOW_82_in_corrLinkDefinition656); if (state.failed) return n;

            objCorr=(Token)match(input,IDENT,FOLLOW_IDENT_in_corrLinkDefinition660); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_corrLinkDefinition662); if (state.failed) return n;

            corrClass=(Token)match(input,IDENT,FOLLOW_IDENT_in_corrLinkDefinition666); if (state.failed) return n;

            if ( state.backtracking==0 ) { 	
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



    // $ANTLR start "model"
    // RTL.g:245:1: model returns [ASTModel n] : as= annotationSet 'model' modelName= IDENT (e= enumTypeDefinition )* ( ( generalClassDefinition[$n] ) | (a= associationDefinition ) | ( 'constraints' (cons= invariant |ppc= prePost )* ) )* EOF ;
    public final ASTModel model() throws RecognitionException {
        ASTModel n = null;


        Token modelName=null;
        Set<ASTAnnotation> as =null;

        ASTEnumTypeDefinition e =null;

        ASTAssociation a =null;

        ASTConstraintDefinition cons =null;

        ASTPrePost ppc =null;


        try {
            // RTL.g:246:2: (as= annotationSet 'model' modelName= IDENT (e= enumTypeDefinition )* ( ( generalClassDefinition[$n] ) | (a= associationDefinition ) | ( 'constraints' (cons= invariant |ppc= prePost )* ) )* EOF )
            // RTL.g:247:2: as= annotationSet 'model' modelName= IDENT (e= enumTypeDefinition )* ( ( generalClassDefinition[$n] ) | (a= associationDefinition ) | ( 'constraints' (cons= invariant |ppc= prePost )* ) )* EOF
            {
            pushFollow(FOLLOW_annotationSet_in_model697);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            match(input,89,FOLLOW_89_in_model703); if (state.failed) return n;

            modelName=(Token)match(input,IDENT,FOLLOW_IDENT_in_model707); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTModel(modelName); n.setAnnotations(as); }

            // RTL.g:249:5: (e= enumTypeDefinition )*
            loop14:
            do {
                int alt14=2;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // RTL.g:249:7: e= enumTypeDefinition
            	    {
            	    pushFollow(FOLLOW_enumTypeDefinition_in_model719);
            	    e=enumTypeDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addEnumTypeDef(e); }

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            // RTL.g:250:5: ( ( generalClassDefinition[$n] ) | (a= associationDefinition ) | ( 'constraints' (cons= invariant |ppc= prePost )* ) )*
            loop16:
            do {
                int alt16=4;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // RTL.g:250:9: ( generalClassDefinition[$n] )
            	    {
            	    // RTL.g:250:9: ( generalClassDefinition[$n] )
            	    // RTL.g:250:11: generalClassDefinition[$n]
            	    {
            	    pushFollow(FOLLOW_generalClassDefinition_in_model736);
            	    generalClassDefinition(n);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    }


            	    }
            	    break;
            	case 2 :
            	    // RTL.g:251:9: (a= associationDefinition )
            	    {
            	    // RTL.g:251:9: (a= associationDefinition )
            	    // RTL.g:251:11: a= associationDefinition
            	    {
            	    pushFollow(FOLLOW_associationDefinition_in_model753);
            	    a=associationDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addAssociation(a); }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // RTL.g:252:9: ( 'constraints' (cons= invariant |ppc= prePost )* )
            	    {
            	    // RTL.g:252:9: ( 'constraints' (cons= invariant |ppc= prePost )* )
            	    // RTL.g:252:11: 'constraints' (cons= invariant |ppc= prePost )*
            	    {
            	    match(input,65,FOLLOW_65_in_model769); if (state.failed) return n;

            	    // RTL.g:253:11: (cons= invariant |ppc= prePost )*
            	    loop15:
            	    do {
            	        int alt15=3;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==66) ) {
            	            int LA15_2 = input.LA(2);

            	            if ( (LA15_2==IDENT) ) {
            	                int LA15_3 = input.LA(3);

            	                if ( (LA15_3==COLON_COLON) ) {
            	                    alt15=2;
            	                }
            	                else if ( (LA15_3==EOF||LA15_3==AT||LA15_3==COLON||LA15_3==COMMA||LA15_3==IDENT||LA15_3==53||(LA15_3 >= 57 && LA15_3 <= 58)||(LA15_3 >= 65 && LA15_3 <= 66)||LA15_3==76||LA15_3==85) ) {
            	                    alt15=1;
            	                }


            	            }


            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // RTL.g:253:15: cons= invariant
            	    	    {
            	    	    pushFollow(FOLLOW_invariant_in_model787);
            	    	    cons=invariant();

            	    	    state._fsp--;
            	    	    if (state.failed) return n;

            	    	    if ( state.backtracking==0 ) { n.addConstraint(cons); }

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // RTL.g:254:15: ppc= prePost
            	    	    {
            	    	    pushFollow(FOLLOW_prePost_in_model808);
            	    	    ppc=prePost();

            	    	    state._fsp--;
            	    	    if (state.failed) return n;

            	    	    if ( state.backtracking==0 ) { n.addPrePost(ppc); }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop15;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            match(input,EOF,FOLLOW_EOF_in_model849); if (state.failed) return n;

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
    // $ANTLR end "model"



    // $ANTLR start "enumTypeDefinition"
    // RTL.g:265:1: enumTypeDefinition returns [ASTEnumTypeDefinition n] : as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )? ;
    public final ASTEnumTypeDefinition enumTypeDefinition() throws RecognitionException {
        ASTEnumTypeDefinition n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        List idListRes =null;


        try {
            // RTL.g:266:2: (as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )? )
            // RTL.g:267:2: as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_enumTypeDefinition877);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            match(input,75,FOLLOW_75_in_enumTypeDefinition883); if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumTypeDefinition887); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_enumTypeDefinition889); if (state.failed) return n;

            pushFollow(FOLLOW_idList_in_enumTypeDefinition893);
            idListRes=idList();

            state._fsp--;
            if (state.failed) return n;

            match(input,RBRACE,FOLLOW_RBRACE_in_enumTypeDefinition895); if (state.failed) return n;

            // RTL.g:268:54: ( SEMI )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==SEMI) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // RTL.g:268:56: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_enumTypeDefinition899); if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { n = new ASTEnumTypeDefinition(name, idListRes); n.setAnnotations(as); }

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
    // $ANTLR end "enumTypeDefinition"



    // $ANTLR start "generalClassDefinition"
    // RTL.g:277:1: generalClassDefinition[ASTModel n] : as= annotationSet ( 'abstract' )? ( (c= classDefinition[isAbstract] ) | (ac= associationClassDefinition[isAbstract] ) ) ;
    public final void generalClassDefinition(ASTModel n) throws RecognitionException {
        Set<ASTAnnotation> as =null;

        ASTClass c =null;

        ASTAssociationClass ac =null;


         
          boolean isAbstract = false;

        try {
            // RTL.g:281:2: (as= annotationSet ( 'abstract' )? ( (c= classDefinition[isAbstract] ) | (ac= associationClassDefinition[isAbstract] ) ) )
            // RTL.g:282:2: as= annotationSet ( 'abstract' )? ( (c= classDefinition[isAbstract] ) | (ac= associationClassDefinition[isAbstract] ) )
            {
            pushFollow(FOLLOW_annotationSet_in_generalClassDefinition937);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return ;

            // RTL.g:283:5: ( 'abstract' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==53) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // RTL.g:283:7: 'abstract'
                    {
                    match(input,53,FOLLOW_53_in_generalClassDefinition945); if (state.failed) return ;

                    if ( state.backtracking==0 ) { isAbstract = true; }

                    }
                    break;

            }


            // RTL.g:284:5: ( (c= classDefinition[isAbstract] ) | (ac= associationClassDefinition[isAbstract] ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==IDENT) ) {
                alt19=1;
            }
            else if ( ((LA19_0 >= 57 && LA19_0 <= 58)) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // RTL.g:284:7: (c= classDefinition[isAbstract] )
                    {
                    // RTL.g:284:7: (c= classDefinition[isAbstract] )
                    // RTL.g:284:9: c= classDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_classDefinition_in_generalClassDefinition963);
                    c=classDefinition(isAbstract);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { n.addClass(c); c.setAnnotations(as); }

                    }


                    }
                    break;
                case 2 :
                    // RTL.g:285:7: (ac= associationClassDefinition[isAbstract] )
                    {
                    // RTL.g:285:7: (ac= associationClassDefinition[isAbstract] )
                    // RTL.g:285:9: ac= associationClassDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_associationClassDefinition_in_generalClassDefinition983);
                    ac=associationClassDefinition(isAbstract);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { n.addAssociationClass(ac); ac.setAnnotations(as); }

                    }


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
        return ;
    }
    // $ANTLR end "generalClassDefinition"



    // $ANTLR start "classDefinition"
    // RTL.g:302:1: classDefinition[boolean isAbstract] returns [ASTClass n] : keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end' ;
    public final ASTClass classDefinition(boolean isAbstract) throws RecognitionException {
        ASTClass n = null;


        Token name=null;
        List idListRes =null;

        ASTAttribute a =null;

        ASTOperation op =null;

        ASTInvariantClause inv =null;


         List idList; 
        try {
            // RTL.g:304:5: ( keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end' )
            // RTL.g:305:5: keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end'
            {
            pushFollow(FOLLOW_keyClass_in_classDefinition1022);
            keyClass();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_classDefinition1026); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTClass(name, isAbstract); }

            // RTL.g:306:5: ( LESS idListRes= idList )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==LESS) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // RTL.g:306:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_classDefinition1036); if (state.failed) return n;

                    pushFollow(FOLLOW_idList_in_classDefinition1040);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addSuperClasses(idListRes); }

                    }
                    break;

            }


            // RTL.g:307:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==59) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // RTL.g:307:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,59,FOLLOW_59_in_classDefinition1053); if (state.failed) return n;

                    // RTL.g:308:7: (a= attributeDefinition )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==AT||LA21_0==IDENT||LA21_0==53||(LA21_0 >= 57 && LA21_0 <= 58)||LA21_0==75||LA21_0==85||LA21_0==89||(LA21_0 >= 101 && LA21_0 <= 102)) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // RTL.g:308:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_classDefinition1066);
                    	    a=attributeDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addAttribute(a); }

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }


            // RTL.g:310:5: ( 'operations' (op= operationDefinition )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==98) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // RTL.g:310:7: 'operations' (op= operationDefinition )*
                    {
                    match(input,98,FOLLOW_98_in_classDefinition1087); if (state.failed) return n;

                    // RTL.g:311:7: (op= operationDefinition )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==AT||LA23_0==IDENT||LA23_0==53||(LA23_0 >= 57 && LA23_0 <= 58)||LA23_0==75||LA23_0==85||LA23_0==89||(LA23_0 >= 101 && LA23_0 <= 102)) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // RTL.g:311:9: op= operationDefinition
                    	    {
                    	    pushFollow(FOLLOW_operationDefinition_in_classDefinition1100);
                    	    op=operationDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addOperation(op); }

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }


            // RTL.g:313:5: ( 'constraints' (inv= invariantClause )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==65) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // RTL.g:313:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,65,FOLLOW_65_in_classDefinition1121); if (state.failed) return n;

                    // RTL.g:314:7: (inv= invariantClause )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==AT||LA25_0==IDENT||LA25_0==53||(LA25_0 >= 57 && LA25_0 <= 58)||(LA25_0 >= 75 && LA25_0 <= 76)||LA25_0==85||LA25_0==89||(LA25_0 >= 101 && LA25_0 <= 102)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // RTL.g:315:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_classDefinition1141);
                    	    inv=invariantClause();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,73,FOLLOW_73_in_classDefinition1165); if (state.failed) return n;

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
    // $ANTLR end "classDefinition"



    // $ANTLR start "associationClassDefinition"
    // RTL.g:336:1: associationClassDefinition[boolean isAbstract] returns [ASTAssociationClass n] : classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( ( keyAggregation | keyComposition ) )? 'end' ;
    public final ASTAssociationClass associationClassDefinition(boolean isAbstract) throws RecognitionException {
        ASTAssociationClass n = null;


        Token classKW=null;
        Token name=null;
        List idListRes =null;

        ASTAssociationEnd ae =null;

        ASTAttribute a =null;

        ASTOperation op =null;

        ASTInvariantClause inv =null;


        List idList; Token t = null;
        try {
            // RTL.g:338:5: (classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( ( keyAggregation | keyComposition ) )? 'end' )
            // RTL.g:339:5: classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( ( keyAggregation | keyComposition ) )? 'end'
            {
            classKW=(Token)input.LT(1);

            if ( (input.LA(1) >= 57 && input.LA(1) <= 58) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            if ( state.backtracking==0 ) { 
                	if ((classKW!=null?classKW.getText():null).equals("associationClass")) {
                           reportWarning("the 'associationClass' keyword is deprecated and will " +
                                         "not be supported in the future, use 'associationclass' instead");
                        }  
                }

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationClassDefinition1224); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssociationClass(name, isAbstract); }

            // RTL.g:348:5: ( LESS idListRes= idList )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==LESS) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // RTL.g:348:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_associationClassDefinition1234); if (state.failed) return n;

                    pushFollow(FOLLOW_idList_in_associationClassDefinition1238);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addSuperClasses(idListRes); }

                    }
                    break;

            }


            // RTL.g:349:5: ( 'between' ae= associationEnd (ae= associationEnd )+ )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==61) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // RTL.g:349:6: 'between' ae= associationEnd (ae= associationEnd )+
                    {
                    match(input,61,FOLLOW_61_in_associationClassDefinition1250); if (state.failed) return n;

                    pushFollow(FOLLOW_associationEnd_in_associationClassDefinition1258);
                    ae=associationEnd();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addEnd(ae); }

                    // RTL.g:351:5: (ae= associationEnd )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==IDENT) ) {
                            int LA28_2 = input.LA(2);

                            if ( (LA28_2==LBRACK) ) {
                                alt28=1;
                            }


                        }
                        else if ( (LA28_0==AT) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // RTL.g:351:7: ae= associationEnd
                    	    {
                    	    pushFollow(FOLLOW_associationEnd_in_associationClassDefinition1270);
                    	    ae=associationEnd();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addEnd(ae); }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt28 >= 1 ) break loop28;
                    	    if (state.backtracking>0) {state.failed=true; return n;}
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);


                    }
                    break;

            }


            // RTL.g:353:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==59) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // RTL.g:353:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,59,FOLLOW_59_in_associationClassDefinition1290); if (state.failed) return n;

                    // RTL.g:354:7: (a= attributeDefinition )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==IDENT) ) {
                            int LA30_2 = input.LA(2);

                            if ( (LA30_2==COLON) ) {
                                alt30=1;
                            }


                        }
                        else if ( (LA30_0==AT) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // RTL.g:354:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_associationClassDefinition1303);
                    	    a=attributeDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addAttribute(a); }

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }


            // RTL.g:356:5: ( 'operations' (op= operationDefinition )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==98) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // RTL.g:356:7: 'operations' (op= operationDefinition )*
                    {
                    match(input,98,FOLLOW_98_in_associationClassDefinition1324); if (state.failed) return n;

                    // RTL.g:357:7: (op= operationDefinition )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==IDENT) ) {
                            int LA32_2 = input.LA(2);

                            if ( (LA32_2==LPAREN) ) {
                                alt32=1;
                            }


                        }
                        else if ( (LA32_0==AT) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // RTL.g:357:9: op= operationDefinition
                    	    {
                    	    pushFollow(FOLLOW_operationDefinition_in_associationClassDefinition1337);
                    	    op=operationDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addOperation(op); }

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }


            // RTL.g:359:5: ( 'constraints' (inv= invariantClause )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==65) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // RTL.g:359:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,65,FOLLOW_65_in_associationClassDefinition1358); if (state.failed) return n;

                    // RTL.g:360:7: (inv= invariantClause )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==AT||LA34_0==76||LA34_0==85) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // RTL.g:361:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_associationClassDefinition1378);
                    	    inv=invariantClause();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }


            // RTL.g:364:5: ( ( keyAggregation | keyComposition ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==IDENT) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // RTL.g:364:7: ( keyAggregation | keyComposition )
                    {
                    if ( state.backtracking==0 ) { t = input.LT(1); }

                    // RTL.g:365:7: ( keyAggregation | keyComposition )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==IDENT) ) {
                        int LA36_1 = input.LA(2);

                        if ( ((input.LT(1).getText().equals("aggregation"))) ) {
                            alt36=1;
                        }
                        else if ( ((input.LT(1).getText().equals("composition"))) ) {
                            alt36=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return n;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 36, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;

                    }
                    switch (alt36) {
                        case 1 :
                            // RTL.g:365:9: keyAggregation
                            {
                            pushFollow(FOLLOW_keyAggregation_in_associationClassDefinition1414);
                            keyAggregation();

                            state._fsp--;
                            if (state.failed) return n;

                            }
                            break;
                        case 2 :
                            // RTL.g:365:26: keyComposition
                            {
                            pushFollow(FOLLOW_keyComposition_in_associationClassDefinition1418);
                            keyComposition();

                            state._fsp--;
                            if (state.failed) return n;

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) { n.setKind(t); }

                    }
                    break;

            }


            match(input,73,FOLLOW_73_in_associationClassDefinition1441); if (state.failed) return n;

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
    // $ANTLR end "associationClassDefinition"



    // $ANTLR start "attributeDefinition"
    // RTL.g:375:1: attributeDefinition returns [ASTAttribute n] : as= annotationSet name= IDENT COLON t= type ( SEMI )? ;
    public final ASTAttribute attributeDefinition() throws RecognitionException {
        ASTAttribute n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        ASTType t =null;


        try {
            // RTL.g:376:2: (as= annotationSet name= IDENT COLON t= type ( SEMI )? )
            // RTL.g:377:2: as= annotationSet name= IDENT COLON t= type ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_attributeDefinition1469);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_attributeDefinition1477); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_attributeDefinition1479); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_attributeDefinition1483);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            // RTL.g:378:29: ( SEMI )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==SEMI) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // RTL.g:378:31: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_attributeDefinition1487); if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { n = new ASTAttribute(name, t); n.setAnnotations(as); }

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
    // $ANTLR end "attributeDefinition"



    // $ANTLR start "operationDefinition"
    // RTL.g:387:1: operationDefinition returns [ASTOperation n] : as= annotationSet name= IDENT pl= paramList ( COLON t= type )? ( ( EQUAL e= expression ) | (s= blockStat ) )? (ppc= prePostClause )* ( SEMI )? ;
    public final ASTOperation operationDefinition() throws RecognitionException {
        ASTOperation n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        List<ASTVariableDeclaration> pl =null;

        ASTType t =null;

        RTLParser.expression_return e =null;

        ASTBlockStatement s =null;

        ASTPrePostClause ppc =null;


        try {
            // RTL.g:388:2: (as= annotationSet name= IDENT pl= paramList ( COLON t= type )? ( ( EQUAL e= expression ) | (s= blockStat ) )? (ppc= prePostClause )* ( SEMI )? )
            // RTL.g:389:2: as= annotationSet name= IDENT pl= paramList ( COLON t= type )? ( ( EQUAL e= expression ) | (s= blockStat ) )? (ppc= prePostClause )* ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_operationDefinition1524);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationDefinition1534); if (state.failed) return n;

            pushFollow(FOLLOW_paramList_in_operationDefinition1544);
            pl=paramList();

            state._fsp--;
            if (state.failed) return n;

            // RTL.g:395:5: ( COLON t= type )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==COLON) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // RTL.g:395:7: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_operationDefinition1558); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_operationDefinition1564);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { n = new ASTOperation(name, pl, t); n.setAnnotations(as); }

            // RTL.g:397:5: ( ( EQUAL e= expression ) | (s= blockStat ) )?
            int alt40=3;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==EQUAL) ) {
                alt40=1;
            }
            else if ( (LA40_0==60) ) {
                alt40=2;
            }
            switch (alt40) {
                case 1 :
                    // RTL.g:398:9: ( EQUAL e= expression )
                    {
                    // RTL.g:398:9: ( EQUAL e= expression )
                    // RTL.g:398:11: EQUAL e= expression
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_operationDefinition1592); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_operationDefinition1598);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setExpression((e!=null?e.n:null)); }

                    }


                    }
                    break;
                case 2 :
                    // RTL.g:399:9: (s= blockStat )
                    {
                    // RTL.g:399:9: (s= blockStat )
                    // RTL.g:399:11: s= blockStat
                    {
                    pushFollow(FOLLOW_blockStat_in_operationDefinition1620);
                    s=blockStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setStatement(s);  }

                    }


                    }
                    break;

            }


            // RTL.g:401:5: (ppc= prePostClause )*
            loop41:
            do {
                int alt41=2;
                alt41 = dfa41.predict(input);
                switch (alt41) {
            	case 1 :
            	    // RTL.g:401:7: ppc= prePostClause
            	    {
            	    pushFollow(FOLLOW_prePostClause_in_operationDefinition1642);
            	    ppc=prePostClause();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addPrePostClause(ppc); }

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            // RTL.g:402:5: ( SEMI )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==SEMI) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // RTL.g:402:7: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_operationDefinition1655); if (state.failed) return n;

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
    // $ANTLR end "operationDefinition"



    // $ANTLR start "associationDefinition"
    // RTL.g:412:1: associationDefinition returns [ASTAssociation n] : as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end' ;
    public final ASTAssociation associationDefinition() throws RecognitionException {
        ASTAssociation n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        ASTAssociationEnd ae =null;


         Token t = null; 
        try {
            // RTL.g:414:2: (as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end' )
            // RTL.g:415:2: as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end'
            {
            pushFollow(FOLLOW_annotationSet_in_associationDefinition1686);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { t = input.LT(1); }

            // RTL.g:417:5: ( keyAssociation | keyAggregation | keyComposition )
            int alt43=3;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==IDENT) ) {
                int LA43_1 = input.LA(2);

                if ( ((input.LT(1).getText().equals("association"))) ) {
                    alt43=1;
                }
                else if ( ((input.LT(1).getText().equals("aggregation"))) ) {
                    alt43=2;
                }
                else if ( ((input.LT(1).getText().equals("composition"))) ) {
                    alt43=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }
            switch (alt43) {
                case 1 :
                    // RTL.g:417:7: keyAssociation
                    {
                    pushFollow(FOLLOW_keyAssociation_in_associationDefinition1700);
                    keyAssociation();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 2 :
                    // RTL.g:417:24: keyAggregation
                    {
                    pushFollow(FOLLOW_keyAggregation_in_associationDefinition1704);
                    keyAggregation();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 3 :
                    // RTL.g:417:41: keyComposition
                    {
                    pushFollow(FOLLOW_keyComposition_in_associationDefinition1708);
                    keyComposition();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationDefinition1718); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssociation(t, name); n.setAnnotations(as); }

            match(input,61,FOLLOW_61_in_associationDefinition1726); if (state.failed) return n;

            pushFollow(FOLLOW_associationEnd_in_associationDefinition1734);
            ae=associationEnd();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.addEnd(ae); }

            // RTL.g:421:5: (ae= associationEnd )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==AT||LA44_0==IDENT||LA44_0==53||(LA44_0 >= 57 && LA44_0 <= 58)||LA44_0==75||LA44_0==85||LA44_0==89||(LA44_0 >= 101 && LA44_0 <= 102)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // RTL.g:421:7: ae= associationEnd
            	    {
            	    pushFollow(FOLLOW_associationEnd_in_associationDefinition1746);
            	    ae=associationEnd();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addEnd(ae); }

            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);


            match(input,73,FOLLOW_73_in_associationDefinition1757); if (state.failed) return n;

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
    // $ANTLR end "associationDefinition"



    // $ANTLR start "associationEnd"
    // RTL.g:430:1: associationEnd returns [ASTAssociationEnd n] : as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | keyDerived EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )? ;
    public final ASTAssociationEnd associationEnd() throws RecognitionException {
        ASTAssociationEnd n = null;


        Token name=null;
        Token rn=null;
        Token sr=null;
        Token rd=null;
        Set<ASTAnnotation> as =null;

        ASTMultiplicity m =null;

        RTLParser.expression_return exp =null;

        List<ASTVariableDeclaration> qualifiers =null;


        try {
            // RTL.g:431:2: (as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | keyDerived EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )? )
            // RTL.g:432:2: as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | keyDerived EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_associationEnd1782);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd1790); if (state.failed) return n;

            match(input,LBRACK,FOLLOW_LBRACK_in_associationEnd1792); if (state.failed) return n;

            pushFollow(FOLLOW_multiplicity_in_associationEnd1796);
            m=multiplicity();

            state._fsp--;
            if (state.failed) return n;

            match(input,RBRACK,FOLLOW_RBRACK_in_associationEnd1798); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssociationEnd(name, m); n.setAnnotations(as); }

            // RTL.g:434:5: ( keyRole rn= IDENT )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==IDENT) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==IDENT) ) {
                    int LA45_3 = input.LA(3);

                    if ( ((input.LT(1).getText().equals("role"))) ) {
                        alt45=1;
                    }
                }
            }
            switch (alt45) {
                case 1 :
                    // RTL.g:434:7: keyRole rn= IDENT
                    {
                    pushFollow(FOLLOW_keyRole_in_associationEnd1809);
                    keyRole();

                    state._fsp--;
                    if (state.failed) return n;

                    rn=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd1813); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setRolename(rn); }

                    }
                    break;

            }


            // RTL.g:435:5: ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | keyDerived EQUAL exp= expression | keyQualifier qualifiers= paramList )*
            loop46:
            do {
                int alt46=7;
                switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA46_2 = input.LA(2);

                    if ( (LA46_2==EQUAL) ) {
                        alt46=5;
                    }
                    else if ( (LA46_2==LPAREN) ) {
                        alt46=6;
                    }
                    else if ( ((input.LT(1).getText().equals("union"))) ) {
                        alt46=3;
                    }


                    }
                    break;
                case 100:
                    {
                    alt46=1;
                    }
                    break;
                case 105:
                    {
                    alt46=2;
                    }
                    break;
                case 103:
                    {
                    alt46=4;
                    }
                    break;

                }

                switch (alt46) {
            	case 1 :
            	    // RTL.g:436:9: 'ordered'
            	    {
            	    match(input,100,FOLLOW_100_in_associationEnd1834); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.setOrdered(); }

            	    }
            	    break;
            	case 2 :
            	    // RTL.g:437:9: 'subsets' sr= IDENT
            	    {
            	    match(input,105,FOLLOW_105_in_associationEnd1846); if (state.failed) return n;

            	    sr=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd1850); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addSubsetsRolename(sr); }

            	    }
            	    break;
            	case 3 :
            	    // RTL.g:438:9: keyUnion
            	    {
            	    pushFollow(FOLLOW_keyUnion_in_associationEnd1862);
            	    keyUnion();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.setUnion(true); }

            	    }
            	    break;
            	case 4 :
            	    // RTL.g:439:9: 'redefines' rd= IDENT
            	    {
            	    match(input,103,FOLLOW_103_in_associationEnd1874); if (state.failed) return n;

            	    rd=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd1878); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addRedefinesRolename(rd); }

            	    }
            	    break;
            	case 5 :
            	    // RTL.g:440:9: keyDerived EQUAL exp= expression
            	    {
            	    pushFollow(FOLLOW_keyDerived_in_associationEnd1890);
            	    keyDerived();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    match(input,EQUAL,FOLLOW_EQUAL_in_associationEnd1892); if (state.failed) return n;

            	    pushFollow(FOLLOW_expression_in_associationEnd1896);
            	    exp=expression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.setDerived((exp!=null?exp.n:null)); }

            	    }
            	    break;
            	case 6 :
            	    // RTL.g:441:9: keyQualifier qualifiers= paramList
            	    {
            	    pushFollow(FOLLOW_keyQualifier_in_associationEnd1908);
            	    keyQualifier();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    pushFollow(FOLLOW_paramList_in_associationEnd1914);
            	    qualifiers=paramList();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) {n.setQualifiers(qualifiers); }

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            // RTL.g:443:5: ( SEMI )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==SEMI) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // RTL.g:443:7: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_associationEnd1931); if (state.failed) return n;

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
    // $ANTLR end "associationEnd"



    // $ANTLR start "multiplicity"
    // RTL.g:457:1: multiplicity returns [ASTMultiplicity n] :mr= multiplicityRange ( COMMA mr= multiplicityRange )* ;
    public final ASTMultiplicity multiplicity() throws RecognitionException {
        ASTMultiplicity n = null;


        ASTMultiplicityRange mr =null;


        try {
            // RTL.g:458:5: (mr= multiplicityRange ( COMMA mr= multiplicityRange )* )
            // RTL.g:459:5: mr= multiplicityRange ( COMMA mr= multiplicityRange )*
            {
            if ( state.backtracking==0 ) { 
            	Token t = input.LT(1); // remember start position of expression
            	n = new ASTMultiplicity(t);
                }

            pushFollow(FOLLOW_multiplicityRange_in_multiplicity1966);
            mr=multiplicityRange();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.addRange(mr); }

            // RTL.g:464:5: ( COMMA mr= multiplicityRange )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==COMMA) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // RTL.g:464:7: COMMA mr= multiplicityRange
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_multiplicity1976); if (state.failed) return n;

            	    pushFollow(FOLLOW_multiplicityRange_in_multiplicity1980);
            	    mr=multiplicityRange();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addRange(mr); }

            	    }
            	    break;

            	default :
            	    break loop48;
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
    // $ANTLR end "multiplicity"



    // $ANTLR start "multiplicityRange"
    // RTL.g:467:1: multiplicityRange returns [ASTMultiplicityRange n] : ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )? ;
    public final ASTMultiplicityRange multiplicityRange() throws RecognitionException {
        ASTMultiplicityRange n = null;


        int ms1 =0;

        int ms2 =0;


        try {
            // RTL.g:468:5: (ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )? )
            // RTL.g:469:5: ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )?
            {
            pushFollow(FOLLOW_multiplicitySpec_in_multiplicityRange2009);
            ms1=multiplicitySpec();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTMultiplicityRange(ms1); }

            // RTL.g:470:5: ( DOTDOT ms2= multiplicitySpec )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==DOTDOT) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // RTL.g:470:7: DOTDOT ms2= multiplicitySpec
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_multiplicityRange2019); if (state.failed) return n;

                    pushFollow(FOLLOW_multiplicitySpec_in_multiplicityRange2023);
                    ms2=multiplicitySpec();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setHigh(ms2); }

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
    // $ANTLR end "multiplicityRange"



    // $ANTLR start "multiplicitySpec"
    // RTL.g:473:1: multiplicitySpec returns [int m] : (i= INT | STAR );
    public final int multiplicitySpec() throws RecognitionException {
        int m = 0;


        Token i=null;

         m = -1; 
        try {
            // RTL.g:475:7: (i= INT | STAR )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==INT) ) {
                alt50=1;
            }
            else if ( (LA50_0==STAR) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return m;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;

            }
            switch (alt50) {
                case 1 :
                    // RTL.g:476:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_multiplicitySpec2057); if (state.failed) return m;

                    if ( state.backtracking==0 ) { m = Integer.parseInt((i!=null?i.getText():null)); }

                    }
                    break;
                case 2 :
                    // RTL.g:477:7: STAR
                    {
                    match(input,STAR,FOLLOW_STAR_in_multiplicitySpec2067); if (state.failed) return m;

                    if ( state.backtracking==0 ) { m = -1; }

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
        return m;
    }
    // $ANTLR end "multiplicitySpec"



    // $ANTLR start "invariant"
    // RTL.g:498:1: invariant returns [ASTConstraintDefinition n] : 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )* ;
    public final ASTConstraintDefinition invariant() throws RecognitionException {
        ASTConstraintDefinition n = null;


        Token v=null;
        ASTSimpleType t =null;

        ASTInvariantClause inv =null;


        try {
            // RTL.g:499:5: ( 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )* )
            // RTL.g:500:5: 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )*
            {
            if ( state.backtracking==0 ) { n = new ASTConstraintDefinition(); }

            match(input,66,FOLLOW_66_in_invariant2108); if (state.failed) return n;

            // RTL.g:502:5: (v= IDENT ( ',' v= IDENT )* COLON )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==IDENT) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==COLON||LA52_1==COMMA) ) {
                    alt52=1;
                }
            }
            switch (alt52) {
                case 1 :
                    // RTL.g:502:7: v= IDENT ( ',' v= IDENT )* COLON
                    {
                    v=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariant2118); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addVarName(v); }

                    // RTL.g:503:8: ( ',' v= IDENT )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==COMMA) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // RTL.g:503:9: ',' v= IDENT
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_invariant2131); if (state.failed) return n;

                    	    v=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariant2135); if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addVarName(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);


                    match(input,COLON,FOLLOW_COLON_in_invariant2143); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_simpleType_in_invariant2155);
            t=simpleType();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setType(t); }

            // RTL.g:505:5: (inv= invariantClause )*
            loop53:
            do {
                int alt53=2;
                alt53 = dfa53.predict(input);
                switch (alt53) {
            	case 1 :
            	    // RTL.g:505:7: inv= invariantClause
            	    {
            	    pushFollow(FOLLOW_invariantClause_in_invariant2167);
            	    inv=invariantClause();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

            	    }
            	    break;

            	default :
            	    break loop53;
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
    // $ANTLR end "invariant"



    // $ANTLR start "invariantClause"
    // RTL.g:512:1: invariantClause returns [ASTInvariantClause n] : (as= annotationSet 'inv' (name= IDENT )? COLON e= expression | 'existential' 'inv' (name= IDENT )? COLON e= expression );
    public final ASTInvariantClause invariantClause() throws RecognitionException {
        ASTInvariantClause n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        RTLParser.expression_return e =null;


        try {
            // RTL.g:513:2: (as= annotationSet 'inv' (name= IDENT )? COLON e= expression | 'existential' 'inv' (name= IDENT )? COLON e= expression )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==AT||LA56_0==IDENT||LA56_0==53||(LA56_0 >= 57 && LA56_0 <= 58)||LA56_0==75||LA56_0==85||LA56_0==89||(LA56_0 >= 101 && LA56_0 <= 102)) ) {
                alt56=1;
            }
            else if ( (LA56_0==76) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }
            switch (alt56) {
                case 1 :
                    // RTL.g:514:2: as= annotationSet 'inv' (name= IDENT )? COLON e= expression
                    {
                    pushFollow(FOLLOW_annotationSet_in_invariantClause2197);
                    as=annotationSet();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,85,FOLLOW_85_in_invariantClause2205); if (state.failed) return n;

                    // RTL.g:515:13: (name= IDENT )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==IDENT) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // RTL.g:515:15: name= IDENT
                            {
                            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantClause2211); if (state.failed) return n;

                            }
                            break;

                    }


                    match(input,COLON,FOLLOW_COLON_in_invariantClause2216); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_invariantClause2220);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTInvariantClause(name, (e!=null?e.n:null)); n.setAnnotations(as); }

                    }
                    break;
                case 2 :
                    // RTL.g:517:7: 'existential' 'inv' (name= IDENT )? COLON e= expression
                    {
                    match(input,76,FOLLOW_76_in_invariantClause2237); if (state.failed) return n;

                    match(input,85,FOLLOW_85_in_invariantClause2239); if (state.failed) return n;

                    // RTL.g:517:27: (name= IDENT )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==IDENT) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // RTL.g:517:29: name= IDENT
                            {
                            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantClause2245); if (state.failed) return n;

                            }
                            break;

                    }


                    match(input,COLON,FOLLOW_COLON_in_invariantClause2250); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_invariantClause2254);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTExistentialInvariantClause(name, (e!=null?e.n:null)); n.setAnnotations(as); }

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
    // $ANTLR end "invariantClause"



    // $ANTLR start "prePost"
    // RTL.g:529:1: prePost returns [ASTPrePost n] : 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+ ;
    public final ASTPrePost prePost() throws RecognitionException {
        ASTPrePost n = null;


        Token classname=null;
        Token opname=null;
        List<ASTVariableDeclaration> pl =null;

        ASTType rt =null;

        ASTPrePostClause ppc =null;


        try {
            // RTL.g:530:5: ( 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+ )
            // RTL.g:531:5: 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+
            {
            match(input,66,FOLLOW_66_in_prePost2287); if (state.failed) return n;

            classname=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePost2291); if (state.failed) return n;

            match(input,COLON_COLON,FOLLOW_COLON_COLON_in_prePost2293); if (state.failed) return n;

            opname=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePost2297); if (state.failed) return n;

            pushFollow(FOLLOW_paramList_in_prePost2301);
            pl=paramList();

            state._fsp--;
            if (state.failed) return n;

            // RTL.g:531:69: ( COLON rt= type )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==COLON) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // RTL.g:531:71: COLON rt= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_prePost2305); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_prePost2309);
                    rt=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { n = new ASTPrePost(classname, opname, pl, rt); }

            // RTL.g:533:5: (ppc= prePostClause )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                alt58 = dfa58.predict(input);
                switch (alt58) {
            	case 1 :
            	    // RTL.g:533:7: ppc= prePostClause
            	    {
            	    pushFollow(FOLLOW_prePostClause_in_prePost2328);
            	    ppc=prePostClause();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addPrePostClause(ppc); }

            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
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
    // $ANTLR end "prePost"



    // $ANTLR start "prePostClause"
    // RTL.g:540:1: prePostClause returns [ASTPrePostClause n] : as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression ;
    public final ASTPrePostClause prePostClause() throws RecognitionException {
        ASTPrePostClause n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        RTLParser.expression_return e =null;


         Token t = null; 
        try {
            // RTL.g:542:2: (as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression )
            // RTL.g:543:2: as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression
            {
            pushFollow(FOLLOW_annotationSet_in_prePostClause2362);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { t = input.LT(1); }

            if ( (input.LA(1) >= 101 && input.LA(1) <= 102) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // RTL.g:545:25: (name= IDENT )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==IDENT) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // RTL.g:545:27: name= IDENT
                    {
                    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePostClause2389); if (state.failed) return n;

                    }
                    break;

            }


            match(input,COLON,FOLLOW_COLON_in_prePostClause2394); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_prePostClause2398);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTPrePostClause(t, name, (e!=null?e.n:null)); n.setAnnotations(as); }

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
    // $ANTLR end "prePostClause"



    // $ANTLR start "annotationSet"
    // RTL.g:549:1: annotationSet returns [Set<ASTAnnotation> annotations] : (an= annotation )* ;
    public final Set<ASTAnnotation> annotationSet() throws RecognitionException {
        Set<ASTAnnotation> annotations = null;


        ASTAnnotation an =null;


         annotations = new HashSet<ASTAnnotation>(); 
        try {
            // RTL.g:551:2: ( (an= annotation )* )
            // RTL.g:552:2: (an= annotation )*
            {
            // RTL.g:552:2: (an= annotation )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==AT) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // RTL.g:552:3: an= annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_annotationSet2425);
            	    an=annotation();

            	    state._fsp--;
            	    if (state.failed) return annotations;

            	    if ( state.backtracking==0 ) { annotations.add(an); }

            	    }
            	    break;

            	default :
            	    break loop60;
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
        return annotations;
    }
    // $ANTLR end "annotationSet"



    // $ANTLR start "annotation"
    // RTL.g:555:1: annotation returns [ASTAnnotation n] : AT name= IDENT LPAREN values= annotationValues RPAREN ;
    public final ASTAnnotation annotation() throws RecognitionException {
        ASTAnnotation n = null;


        Token name=null;
        Map<Token, Token> values =null;


        try {
            // RTL.g:555:37: ( AT name= IDENT LPAREN values= annotationValues RPAREN )
            // RTL.g:556:2: AT name= IDENT LPAREN values= annotationValues RPAREN
            {
            match(input,AT,FOLLOW_AT_in_annotation2444); if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotation2448); if (state.failed) return n;

            if ( state.backtracking==0 ) {n = new ASTAnnotation(name);}

            match(input,LPAREN,FOLLOW_LPAREN_in_annotation2454); if (state.failed) return n;

            pushFollow(FOLLOW_annotationValues_in_annotation2463);
            values=annotationValues();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setValues(values); }

            match(input,RPAREN,FOLLOW_RPAREN_in_annotation2468); if (state.failed) return n;

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
    // $ANTLR end "annotation"



    // $ANTLR start "annotationValues"
    // RTL.g:562:1: annotationValues returns [Map<Token, Token> values] : (firstVal= annotationValue )? ( COMMA val= annotationValue )* ;
    public final Map<Token, Token> annotationValues() throws RecognitionException {
        Map<Token, Token> values = null;


        RTLParser.annotationValue_return firstVal =null;

        RTLParser.annotationValue_return val =null;


         values = new HashMap<Token, Token>(); 
        try {
            // RTL.g:564:2: ( (firstVal= annotationValue )? ( COMMA val= annotationValue )* )
            // RTL.g:565:2: (firstVal= annotationValue )? ( COMMA val= annotationValue )*
            {
            // RTL.g:565:2: (firstVal= annotationValue )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==IDENT) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // RTL.g:565:3: firstVal= annotationValue
                    {
                    pushFollow(FOLLOW_annotationValue_in_annotationValues2491);
                    firstVal=annotationValue();

                    state._fsp--;
                    if (state.failed) return values;

                    if ( state.backtracking==0 ) { values.put((firstVal!=null?firstVal.name:null), (firstVal!=null?firstVal.value:null)); }

                    }
                    break;

            }


            // RTL.g:566:2: ( COMMA val= annotationValue )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==COMMA) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // RTL.g:566:3: COMMA val= annotationValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_annotationValues2499); if (state.failed) return values;

            	    pushFollow(FOLLOW_annotationValue_in_annotationValues2503);
            	    val=annotationValue();

            	    state._fsp--;
            	    if (state.failed) return values;

            	    if ( state.backtracking==0 ) { values.put((val!=null?val.name:null), (val!=null?val.value:null)); }

            	    }
            	    break;

            	default :
            	    break loop62;
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
        return values;
    }
    // $ANTLR end "annotationValues"


    public static class annotationValue_return extends ParserRuleReturnScope {
        public Token name;
        public Token value;
    };


    // $ANTLR start "annotationValue"
    // RTL.g:569:1: annotationValue returns [Token name, Token value] : aName= IDENT EQUAL aValue= NON_OCL_STRING ;
    public final RTLParser.annotationValue_return annotationValue() throws RecognitionException {
        RTLParser.annotationValue_return retval = new RTLParser.annotationValue_return();
        retval.start = input.LT(1);


        Token aName=null;
        Token aValue=null;

        try {
            // RTL.g:569:50: (aName= IDENT EQUAL aValue= NON_OCL_STRING )
            // RTL.g:570:2: aName= IDENT EQUAL aValue= NON_OCL_STRING
            {
            aName=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotationValue2522); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.name = aName; }

            match(input,EQUAL,FOLLOW_EQUAL_in_annotationValue2527); if (state.failed) return retval;

            aValue=(Token)match(input,NON_OCL_STRING,FOLLOW_NON_OCL_STRING_in_annotationValue2533); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.value = aValue; }

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
    // $ANTLR end "annotationValue"



    // $ANTLR start "keyUnion"
    // RTL.g:575:1: keyUnion :{...}? IDENT ;
    public final void keyUnion() throws RecognitionException {
        try {
            // RTL.g:575:9: ({...}? IDENT )
            // RTL.g:576:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("union"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyUnion", "input.LT(1).getText().equals(\"union\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyUnion2547); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "keyUnion"



    // $ANTLR start "keyAssociation"
    // RTL.g:578:1: keyAssociation :{...}? IDENT ;
    public final void keyAssociation() throws RecognitionException {
        try {
            // RTL.g:578:15: ({...}? IDENT )
            // RTL.g:579:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("association"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyAssociation", "input.LT(1).getText().equals(\"association\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyAssociation2561); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "keyAssociation"



    // $ANTLR start "keyRole"
    // RTL.g:581:1: keyRole :{...}? IDENT ;
    public final void keyRole() throws RecognitionException {
        try {
            // RTL.g:581:8: ({...}? IDENT )
            // RTL.g:582:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("role"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyRole", "input.LT(1).getText().equals(\"role\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyRole2575); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "keyRole"



    // $ANTLR start "keyComposition"
    // RTL.g:584:1: keyComposition :{...}? IDENT ;
    public final void keyComposition() throws RecognitionException {
        try {
            // RTL.g:584:15: ({...}? IDENT )
            // RTL.g:585:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("composition"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyComposition", "input.LT(1).getText().equals(\"composition\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyComposition2587); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "keyComposition"



    // $ANTLR start "keyAggregation"
    // RTL.g:587:1: keyAggregation :{...}? IDENT ;
    public final void keyAggregation() throws RecognitionException {
        try {
            // RTL.g:587:15: ({...}? IDENT )
            // RTL.g:588:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("aggregation"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyAggregation", "input.LT(1).getText().equals(\"aggregation\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyAggregation2599); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "keyAggregation"



    // $ANTLR start "keyClass"
    // RTL.g:590:1: keyClass :{...}? IDENT ;
    public final void keyClass() throws RecognitionException {
        try {
            // RTL.g:590:9: ({...}? IDENT )
            // RTL.g:591:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("class"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyClass", "input.LT(1).getText().equals(\"class\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyClass2613); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "keyClass"



    // $ANTLR start "keyDerived"
    // RTL.g:593:1: keyDerived :{...}? IDENT ;
    public final void keyDerived() throws RecognitionException {
        try {
            // RTL.g:593:11: ({...}? IDENT )
            // RTL.g:594:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("derived"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyDerived", "input.LT(1).getText().equals(\"derived\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyDerived2625); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "keyDerived"



    // $ANTLR start "keyQualifier"
    // RTL.g:596:1: keyQualifier :{...}? IDENT ;
    public final void keyQualifier() throws RecognitionException {
        try {
            // RTL.g:596:13: ({...}? IDENT )
            // RTL.g:597:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("qualifier"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyQualifier", "input.LT(1).getText().equals(\"qualifier\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyQualifier2639); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "keyQualifier"



    // $ANTLR start "expressionOnly"
    // RTL.g:625:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
    public final ASTExpression expressionOnly() throws RecognitionException {
        ASTExpression n = null;


        RTLParser.expression_return nExp =null;


        try {
            // RTL.g:626:5: (nExp= expression EOF )
            // RTL.g:627:5: nExp= expression EOF
            {
            pushFollow(FOLLOW_expression_in_expressionOnly2665);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_expressionOnly2667); if (state.failed) return n;

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
    // RTL.g:634:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression ;
    public final RTLParser.expression_return expression() throws RecognitionException {
        RTLParser.expression_return retval = new RTLParser.expression_return();
        retval.start = input.LT(1);


        Token name=null;
        ASTType t =null;

        RTLParser.expression_return e1 =null;

        ASTExpression nCndImplies =null;


         
          ASTLetExpression prevLet = null, firstLet = null;
          ASTExpression e2;
          Token tok = null;

        try {
            // RTL.g:640:5: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression )
            // RTL.g:641:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of expression */ }

            // RTL.g:642:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==87) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // RTL.g:643:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in'
            	    {
            	    match(input,87,FOLLOW_87_in_expression2715); if (state.failed) return retval;

            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression2719); if (state.failed) return retval;

            	    // RTL.g:643:24: ( COLON t= type )?
            	    int alt63=2;
            	    int LA63_0 = input.LA(1);

            	    if ( (LA63_0==COLON) ) {
            	        alt63=1;
            	    }
            	    switch (alt63) {
            	        case 1 :
            	            // RTL.g:643:26: COLON t= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expression2723); if (state.failed) return retval;

            	            pushFollow(FOLLOW_type_in_expression2727);
            	            t=type();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_expression2732); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expression_in_expression2736);
            	    e1=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    match(input,82,FOLLOW_82_in_expression2738); if (state.failed) return retval;

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
            	    break loop64;
                }
            } while (true);


            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression2763);
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
    // RTL.g:671:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
    public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
        List<ASTVariableDeclaration> paramList = null;


        ASTVariableDeclaration v =null;


         paramList = new ArrayList<ASTVariableDeclaration>(); 
        try {
            // RTL.g:673:5: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
            // RTL.g:674:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_paramList2796); if (state.failed) return paramList;

            // RTL.g:675:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==IDENT) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // RTL.g:676:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_paramList2813);
                    v=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return paramList;

                    if ( state.backtracking==0 ) { paramList.add(v); }

                    // RTL.g:677:7: ( COMMA v= variableDeclaration )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==COMMA) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // RTL.g:677:9: COMMA v= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_paramList2825); if (state.failed) return paramList;

                    	    pushFollow(FOLLOW_variableDeclaration_in_paramList2829);
                    	    v=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return paramList;

                    	    if ( state.backtracking==0 ) { paramList.add(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_paramList2849); if (state.failed) return paramList;

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
    // RTL.g:685:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
    public final List idList() throws RecognitionException {
        List idList = null;


        Token id0=null;
        Token idn=null;

         idList = new ArrayList(); 
        try {
            // RTL.g:687:5: (id0= IDENT ( COMMA idn= IDENT )* )
            // RTL.g:688:5: id0= IDENT ( COMMA idn= IDENT )*
            {
            id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList2878); if (state.failed) return idList;

            if ( state.backtracking==0 ) { idList.add(id0); }

            // RTL.g:689:5: ( COMMA idn= IDENT )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==COMMA) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // RTL.g:689:7: COMMA idn= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_idList2888); if (state.failed) return idList;

            	    idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList2892); if (state.failed) return idList;

            	    if ( state.backtracking==0 ) { idList.add(idn); }

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
        return idList;
    }
    // $ANTLR end "idList"



    // $ANTLR start "variableDeclaration"
    // RTL.g:697:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
    public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
        ASTVariableDeclaration n = null;


        Token name=null;
        ASTType t =null;


        try {
            // RTL.g:698:5: (name= IDENT COLON t= type )
            // RTL.g:699:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration2923); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableDeclaration2925); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableDeclaration2929);
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
    // RTL.g:707:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndOrExp =null;

        ASTExpression n1 =null;


        try {
            // RTL.g:708:5: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
            // RTL.g:709:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression2965);
            nCndOrExp=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndOrExp;}

            // RTL.g:710:5: (op= 'implies' n1= conditionalOrExpression )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==81) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // RTL.g:710:7: op= 'implies' n1= conditionalOrExpression
            	    {
            	    op=(Token)match(input,81,FOLLOW_81_in_conditionalImpliesExpression2978); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression2982);
            	    n1=conditionalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

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
    // $ANTLR end "conditionalImpliesExpression"



    // $ANTLR start "conditionalOrExpression"
    // RTL.g:719:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndXorExp =null;

        ASTExpression n1 =null;


        try {
            // RTL.g:720:5: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
            // RTL.g:721:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
            {
            pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression3027);
            nCndXorExp=conditionalXOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndXorExp;}

            // RTL.g:722:5: (op= 'or' n1= conditionalXOrExpression )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==99) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // RTL.g:722:7: op= 'or' n1= conditionalXOrExpression
            	    {
            	    op=(Token)match(input,99,FOLLOW_99_in_conditionalOrExpression3040); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression3044);
            	    n1=conditionalXOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop69;
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
    // RTL.g:731:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalXOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndAndExp =null;

        ASTExpression n1 =null;


        try {
            // RTL.g:732:5: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
            // RTL.g:733:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression3088);
            nCndAndExp=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndAndExp;}

            // RTL.g:734:5: (op= 'xor' n1= conditionalAndExpression )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==110) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // RTL.g:734:7: op= 'xor' n1= conditionalAndExpression
            	    {
            	    op=(Token)match(input,110,FOLLOW_110_in_conditionalXOrExpression3101); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression3105);
            	    n1=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

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
    // $ANTLR end "conditionalXOrExpression"



    // $ANTLR start "conditionalAndExpression"
    // RTL.g:743:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nEqExp =null;

        ASTExpression n1 =null;


        try {
            // RTL.g:744:5: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
            // RTL.g:745:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression3149);
            nEqExp=equalityExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nEqExp;}

            // RTL.g:746:5: (op= 'and' n1= equalityExpression )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==55) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // RTL.g:746:7: op= 'and' n1= equalityExpression
            	    {
            	    op=(Token)match(input,55,FOLLOW_55_in_conditionalAndExpression3162); if (state.failed) return n;

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression3166);
            	    n1=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

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
    // $ANTLR end "conditionalAndExpression"



    // $ANTLR start "equalityExpression"
    // RTL.g:755:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nRelExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // RTL.g:757:5: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
            // RTL.g:758:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression3214);
            nRelExp=relationalExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nRelExp;}

            // RTL.g:759:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==EQUAL||LA72_0==NOT_EQUAL) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // RTL.g:759:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
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


            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression3243);
            	    n1=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop72;
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
    // RTL.g:769:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nAddiExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // RTL.g:771:5: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
            // RTL.g:772:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression3292);
            nAddiExp=additiveExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nAddiExp;}

            // RTL.g:773:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( ((LA73_0 >= GREATER && LA73_0 <= GREATER_EQUAL)||(LA73_0 >= LESS && LA73_0 <= LESS_EQUAL)) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // RTL.g:773:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
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


            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression3328);
            	    n1=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

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
    // $ANTLR end "relationalExpression"



    // $ANTLR start "additiveExpression"
    // RTL.g:783:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nMulExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // RTL.g:785:5: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
            // RTL.g:786:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression3378);
            nMulExp=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nMulExp;}

            // RTL.g:787:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==MINUS||LA74_0==PLUS) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // RTL.g:787:7: ( PLUS | MINUS ) n1= multiplicativeExpression
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


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression3406);
            	    n1=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop74;
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
    // RTL.g:798:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // RTL.g:800:5: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
            // RTL.g:801:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression3456);
            nUnExp=unaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nUnExp;}

            // RTL.g:802:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==SLASH||LA75_0==STAR||LA75_0==70) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // RTL.g:802:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==70 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression3488);
            	    n1=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop75;
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
    // RTL.g:814:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression nPosExp =null;


         Token op = null; 
        try {
            // RTL.g:816:7: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==MINUS||LA76_0==PLUS||LA76_0==91) ) {
                alt76=1;
            }
            else if ( (LA76_0==AT||LA76_0==HASH||(LA76_0 >= IDENT && LA76_0 <= INT)||LA76_0==LPAREN||LA76_0==REAL||LA76_0==STRING||(LA76_0 >= 45 && LA76_0 <= 46)||(LA76_0 >= 48 && LA76_0 <= 52)||LA76_0==77||LA76_0==80||LA76_0==86||(LA76_0 >= 92 && LA76_0 <= 97)||LA76_0==108) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;

            }
            switch (alt76) {
                case 1 :
                    // RTL.g:817:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    {
                    // RTL.g:817:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    // RTL.g:817:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
                    {
                    if ( state.backtracking==0 ) { op = input.LT(1); }

                    if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==91 ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression3574);
                    nUnExp=unaryExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUnaryExpression(op, nUnExp); }

                    }


                    }
                    break;
                case 2 :
                    // RTL.g:821:7: nPosExp= postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression3594);
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
    // RTL.g:829:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
    public final ASTExpression postfixExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nPrimExp =null;

        ASTExpression nPc =null;


         boolean arrow = false; 
        try {
            // RTL.g:831:5: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
            // RTL.g:832:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression3627);
            nPrimExp=primaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nPrimExp; }

            // RTL.g:833:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==DOT) ) {
                    int LA78_2 = input.LA(2);

                    if ( (LA78_2==IDENT) ) {
                        int LA78_4 = input.LA(3);

                        if ( (LA78_4==EOF||(LA78_4 >= ARROW && LA78_4 <= BAR)||LA78_4==COMMA||(LA78_4 >= DOT && LA78_4 <= EQUAL)||(LA78_4 >= GREATER && LA78_4 <= GREATER_EQUAL)||LA78_4==IDENT||(LA78_4 >= LBRACE && LA78_4 <= MINUS)||(LA78_4 >= NOT_EQUAL && LA78_4 <= PLUS)||(LA78_4 >= RBRACE && LA78_4 <= RBRACK)||(LA78_4 >= RPAREN && LA78_4 <= SLASH)||LA78_4==STAR||LA78_4==53||LA78_4==55||(LA78_4 >= 57 && LA78_4 <= 59)||(LA78_4 >= 65 && LA78_4 <= 66)||(LA78_4 >= 70 && LA78_4 <= 74)||LA78_4==76||(LA78_4 >= 81 && LA78_4 <= 82)||LA78_4==85||(LA78_4 >= 98 && LA78_4 <= 103)||(LA78_4 >= 105 && LA78_4 <= 106)||LA78_4==110) ) {
                            alt78=1;
                        }


                    }
                    else if ( (LA78_2==86||LA78_2==93||(LA78_2 >= 95 && LA78_2 <= 96)) ) {
                        alt78=1;
                    }


                }
                else if ( (LA78_0==ARROW) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // RTL.g:834:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
            	    {
            	    // RTL.g:834:6: ( ARROW | DOT )
            	    int alt77=2;
            	    int LA77_0 = input.LA(1);

            	    if ( (LA77_0==ARROW) ) {
            	        alt77=1;
            	    }
            	    else if ( (LA77_0==DOT) ) {
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
            	            // RTL.g:834:8: ARROW
            	            {
            	            match(input,ARROW,FOLLOW_ARROW_in_postfixExpression3645); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = true; }

            	            }
            	            break;
            	        case 2 :
            	            // RTL.g:834:34: DOT
            	            {
            	            match(input,DOT,FOLLOW_DOT_in_postfixExpression3651); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = false; }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_propertyCall_in_postfixExpression3662);
            	    nPc=propertyCall(n, arrow);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = nPc; }

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
    // $ANTLR end "postfixExpression"



    // $ANTLR start "primaryExpression"
    // RTL.g:850:1: primaryExpression returns [ASTExpression n] : (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )? );
    public final ASTExpression primaryExpression() throws RecognitionException {
        ASTExpression n = null;


        Token id1=null;
        ASTExpression nLit =null;

        ASTExpression nOr =null;

        ASTExpression nPc =null;

        RTLParser.expression_return nExp =null;

        ASTExpression nIfExp =null;


        try {
            // RTL.g:851:7: (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )? )
            int alt81=6;
            switch ( input.LA(1) ) {
            case HASH:
            case INT:
            case REAL:
            case STRING:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 77:
            case 92:
            case 94:
            case 97:
            case 108:
                {
                alt81=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case COLON_COLON:
                    {
                    alt81=1;
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
                case 53:
                case 55:
                case 57:
                case 58:
                case 59:
                case 65:
                case 66:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 76:
                case 81:
                case 82:
                case 85:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                case 105:
                case 106:
                case 110:
                    {
                    alt81=3;
                    }
                    break;
                case DOT:
                    {
                    int LA81_7 = input.LA(3);

                    if ( (LA81_7==54) ) {
                        alt81=6;
                    }
                    else if ( (LA81_7==IDENT||LA81_7==86||LA81_7==93||(LA81_7 >= 95 && LA81_7 <= 96)) ) {
                        alt81=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 81, 7, input);

                        throw nvae;

                    }
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 81, 2, input);

                    throw nvae;

                }

                }
                break;
            case AT:
                {
                alt81=2;
                }
                break;
            case 86:
            case 93:
            case 95:
            case 96:
                {
                alt81=3;
                }
                break;
            case LPAREN:
                {
                alt81=4;
                }
                break;
            case 80:
                {
                alt81=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;

            }

            switch (alt81) {
                case 1 :
                    // RTL.g:852:7: nLit= literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression3702);
                    nLit=literal();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nLit; }

                    }
                    break;
                case 2 :
                    // RTL.g:853:7: nOr= objectReference
                    {
                    pushFollow(FOLLOW_objectReference_in_primaryExpression3716);
                    nOr=objectReference();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nOr; }

                    }
                    break;
                case 3 :
                    // RTL.g:854:7: nPc= propertyCall[null, false]
                    {
                    pushFollow(FOLLOW_propertyCall_in_primaryExpression3728);
                    nPc=propertyCall(null, false);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nPc; }

                    }
                    break;
                case 4 :
                    // RTL.g:855:7: LPAREN nExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression3739); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression3743);
                    nExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression3745); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExp!=null?nExp.n:null); }

                    }
                    break;
                case 5 :
                    // RTL.g:856:7: nIfExp= ifExpression
                    {
                    pushFollow(FOLLOW_ifExpression_in_primaryExpression3757);
                    nIfExp=ifExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nIfExp; }

                    }
                    break;
                case 6 :
                    // RTL.g:857:7: id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )?
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression3769); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression3771); if (state.failed) return n;

                    match(input,54,FOLLOW_54_in_primaryExpression3773); if (state.failed) return n;

                    // RTL.g:857:36: ( LPAREN RPAREN )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==LPAREN) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // RTL.g:857:38: LPAREN RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression3777); if (state.failed) return n;

                            match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression3779); if (state.failed) return n;

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) { n = new ASTAllInstancesExpression(id1); }

                    // RTL.g:859:7: ( AT 'pre' )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==AT) ) {
                        int LA80_1 = input.LA(2);

                        if ( (LA80_1==102) ) {
                            alt80=1;
                        }
                    }
                    switch (alt80) {
                        case 1 :
                            // RTL.g:859:9: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression3800); if (state.failed) return n;

                            match(input,102,FOLLOW_102_in_primaryExpression3802); if (state.failed) return n;

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
    // RTL.g:863:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
    public final ASTExpression objectReference() throws RecognitionException {
        ASTExpression n = null;


        Token objectName=null;

        try {
            // RTL.g:864:3: ( AT objectName= IDENT )
            // RTL.g:865:3: AT objectName= IDENT
            {
            match(input,AT,FOLLOW_AT_in_objectReference3829); if (state.failed) return n;

            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference3837); if (state.failed) return n;

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
    // RTL.g:879:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] );
    public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nExpQuery =null;

        ASTExpression nExpIterate =null;

        RTLParser.operationExpression_return nExpOperation =null;

        ASTTypeArgExpression nExpType =null;


        try {
            // RTL.g:880:7: ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] )
            int alt82=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA82_1 = input.LA(2);

                if ( (((( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )&&( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ))&&( input.LA(2) == LPAREN ))) ) {
                    alt82=1;
                }
                else if ( (true) ) {
                    alt82=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 1, input);

                    throw nvae;

                }
                }
                break;
            case 86:
                {
                alt82=2;
                }
                break;
            case 93:
            case 95:
            case 96:
                {
                alt82=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;

            }

            switch (alt82) {
                case 1 :
                    // RTL.g:884:7: {...}?{...}?nExpQuery= queryExpression[source]
                    {
                    if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
                    }

                    if ( !(( input.LA(2) == LPAREN )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
                    }

                    pushFollow(FOLLOW_queryExpression_in_propertyCall3902);
                    nExpQuery=queryExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpQuery; }

                    }
                    break;
                case 2 :
                    // RTL.g:887:7: nExpIterate= iterateExpression[source]
                    {
                    pushFollow(FOLLOW_iterateExpression_in_propertyCall3915);
                    nExpIterate=iterateExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpIterate; }

                    }
                    break;
                case 3 :
                    // RTL.g:888:7: nExpOperation= operationExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_operationExpression_in_propertyCall3928);
                    nExpOperation=operationExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExpOperation!=null?nExpOperation.n:null); }

                    }
                    break;
                case 4 :
                    // RTL.g:889:7: nExpType= typeExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_typeExpression_in_propertyCall3941);
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
    // RTL.g:898:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
    public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTElemVarsDeclaration decls =null;

        RTLParser.expression_return nExp =null;


        ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
        try {
            // RTL.g:899:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
            // RTL.g:900:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
            {
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression3976); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression3983); if (state.failed) return n;

            // RTL.g:902:5: (decls= elemVarsDeclaration BAR )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==IDENT) ) {
                int LA83_1 = input.LA(2);

                if ( ((LA83_1 >= BAR && LA83_1 <= COLON)||LA83_1==COMMA) ) {
                    alt83=1;
                }
            }
            switch (alt83) {
                case 1 :
                    // RTL.g:902:7: decls= elemVarsDeclaration BAR
                    {
                    pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression3994);
                    decls=elemVarsDeclaration();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {decl = decls;}

                    match(input,BAR,FOLLOW_BAR_in_queryExpression3998); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_expression_in_queryExpression4009);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression4015); if (state.failed) return n;

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
    // RTL.g:916:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
    public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ASTElemVarsDeclaration decls =null;

        ASTVariableInitialization init =null;

        RTLParser.expression_return nExp =null;


        try {
            // RTL.g:916:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
            // RTL.g:917:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
            {
            i=(Token)match(input,86,FOLLOW_86_in_iterateExpression4047); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression4053); if (state.failed) return n;

            pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression4061);
            decls=elemVarsDeclaration();

            state._fsp--;
            if (state.failed) return n;

            match(input,SEMI,FOLLOW_SEMI_in_iterateExpression4063); if (state.failed) return n;

            pushFollow(FOLLOW_variableInitialization_in_iterateExpression4071);
            init=variableInitialization();

            state._fsp--;
            if (state.failed) return n;

            match(input,BAR,FOLLOW_BAR_in_iterateExpression4073); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_iterateExpression4081);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression4087); if (state.failed) return n;

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
    // RTL.g:938:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
    public final RTLParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        RTLParser.operationExpression_return retval = new RTLParser.operationExpression_return();
        retval.start = input.LT(1);


        Token name=null;
        RTLParser.expression_return rolename =null;

        RTLParser.expression_return e =null;


        try {
            // RTL.g:940:5: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
            // RTL.g:941:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression4131); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTOperationExpression(name, source, followsArrow); }

            // RTL.g:947:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==LBRACK) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // RTL.g:947:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression4153); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_operationExpression4166);
                    rolename=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    // RTL.g:949:9: ( COMMA rolename= expression )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==COMMA) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // RTL.g:949:10: COMMA rolename= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression4179); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_expression_in_operationExpression4183);
                    	    rolename=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);


                    match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression4195); if (state.failed) return retval;

                    // RTL.g:952:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==LBRACK) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // RTL.g:952:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression4212); if (state.failed) return retval;

                            pushFollow(FOLLOW_expression_in_operationExpression4227);
                            rolename=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            // RTL.g:954:11: ( COMMA rolename= expression )*
                            loop85:
                            do {
                                int alt85=2;
                                int LA85_0 = input.LA(1);

                                if ( (LA85_0==COMMA) ) {
                                    alt85=1;
                                }


                                switch (alt85) {
                            	case 1 :
                            	    // RTL.g:954:12: COMMA rolename= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression4242); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression4246);
                            	    rolename=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop85;
                                }
                            } while (true);


                            match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression4260); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }


            // RTL.g:959:5: ( AT 'pre' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==AT) ) {
                int LA88_1 = input.LA(2);

                if ( (LA88_1==102) ) {
                    alt88=1;
                }
            }
            switch (alt88) {
                case 1 :
                    // RTL.g:959:7: AT 'pre'
                    {
                    match(input,AT,FOLLOW_AT_in_operationExpression4285); if (state.failed) return retval;

                    match(input,102,FOLLOW_102_in_operationExpression4287); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.setIsPre(); }

                    }
                    break;

            }


            // RTL.g:961:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==LPAREN) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // RTL.g:962:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression4312); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.hasParentheses(); }

                    // RTL.g:963:7: (e= expression ( COMMA e= expression )* )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==AT||LA90_0==HASH||(LA90_0 >= IDENT && LA90_0 <= INT)||(LA90_0 >= LPAREN && LA90_0 <= MINUS)||LA90_0==PLUS||LA90_0==REAL||LA90_0==STRING||(LA90_0 >= 45 && LA90_0 <= 46)||(LA90_0 >= 48 && LA90_0 <= 52)||LA90_0==77||LA90_0==80||(LA90_0 >= 86 && LA90_0 <= 87)||(LA90_0 >= 91 && LA90_0 <= 97)||LA90_0==108) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // RTL.g:964:7: e= expression ( COMMA e= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_operationExpression4333);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            // RTL.g:965:7: ( COMMA e= expression )*
                            loop89:
                            do {
                                int alt89=2;
                                int LA89_0 = input.LA(1);

                                if ( (LA89_0==COMMA) ) {
                                    alt89=1;
                                }


                                switch (alt89) {
                            	case 1 :
                            	    // RTL.g:965:9: COMMA e= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression4345); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression4349);
                            	    e=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop89;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression4369); if (state.failed) return retval;

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
    // RTL.g:978:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN ;
    public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTTypeArgExpression n = null;


        ASTType t =null;


         Token opToken = null; 
        try {
            // RTL.g:981:2: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN )
            // RTL.g:982:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN
            {
            if ( state.backtracking==0 ) { opToken = input.LT(1); }

            if ( input.LA(1)==93||(input.LA(1) >= 95 && input.LA(1) <= 96) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression4434); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_typeExpression4438);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression4440); if (state.failed) return n;

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
    // RTL.g:993:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] :var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
    public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
        ASTElemVarsDeclaration n = null;


        Token var1=null;
        Token varN=null;
        ASTType t =null;

        ASTType tN =null;


        try {
            // RTL.g:994:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
            // RTL.g:995:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
            {
            if ( state.backtracking==0 ) { n = new ASTElemVarsDeclaration(); }

            var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration4478); if (state.failed) return n;

            // RTL.g:996:17: ( COLON t= type )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==COLON) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // RTL.g:996:18: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration4481); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_elemVarsDeclaration4485);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {n.addDeclaration(var1, t);}

            // RTL.g:997:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==COMMA) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // RTL.g:997:5: COMMA varN= IDENT ( COLON tN= type )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration4495); if (state.failed) return n;

            	    varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration4501); if (state.failed) return n;

            	    // RTL.g:997:24: ( COLON tN= type )?
            	    int alt93=2;
            	    int LA93_0 = input.LA(1);

            	    if ( (LA93_0==COLON) ) {
            	        alt93=1;
            	    }
            	    switch (alt93) {
            	        case 1 :
            	            // RTL.g:997:25: COLON tN= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration4504); if (state.failed) return n;

            	            pushFollow(FOLLOW_type_in_elemVarsDeclaration4510);
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
            	    break loop94;
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
    // RTL.g:1005:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
    public final ASTVariableInitialization variableInitialization() throws RecognitionException {
        ASTVariableInitialization n = null;


        Token name=null;
        ASTType t =null;

        RTLParser.expression_return e =null;


        try {
            // RTL.g:1006:5: (name= IDENT COLON t= type EQUAL e= expression )
            // RTL.g:1007:5: name= IDENT COLON t= type EQUAL e= expression
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization4538); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableInitialization4540); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableInitialization4544);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization4546); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_variableInitialization4550);
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
    // RTL.g:1016:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
    public final ASTExpression ifExpression() throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        RTLParser.expression_return cond =null;

        RTLParser.expression_return t =null;

        RTLParser.expression_return e =null;


        try {
            // RTL.g:1017:5: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
            // RTL.g:1018:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
            {
            i=(Token)match(input,80,FOLLOW_80_in_ifExpression4582); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression4586);
            cond=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,106,FOLLOW_106_in_ifExpression4588); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression4592);
            t=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,72,FOLLOW_72_in_ifExpression4594); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression4598);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,74,FOLLOW_74_in_ifExpression4600); if (state.failed) return n;

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
    // RTL.g:1037:1: literal returns [ASTExpression n] : (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral );
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
            // RTL.g:1038:7: (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral )
            int alt95=11;
            switch ( input.LA(1) ) {
            case 108:
                {
                alt95=1;
                }
                break;
            case 77:
                {
                alt95=2;
                }
                break;
            case INT:
                {
                alt95=3;
                }
                break;
            case REAL:
                {
                alt95=4;
                }
                break;
            case STRING:
                {
                alt95=5;
                }
                break;
            case HASH:
                {
                alt95=6;
                }
                break;
            case IDENT:
                {
                alt95=7;
                }
                break;
            case 45:
            case 48:
            case 49:
            case 50:
                {
                int LA95_8 = input.LA(2);

                if ( (LA95_8==LPAREN) ) {
                    alt95=9;
                }
                else if ( (LA95_8==LBRACE) ) {
                    alt95=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 8, input);

                    throw nvae;

                }
                }
                break;
            case 46:
            case 94:
                {
                alt95=9;
                }
                break;
            case 52:
            case 92:
            case 97:
                {
                alt95=10;
                }
                break;
            case 51:
                {
                alt95=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;

            }

            switch (alt95) {
                case 1 :
                    // RTL.g:1039:7: t= 'true'
                    {
                    t=(Token)match(input,108,FOLLOW_108_in_literal4639); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(true); }

                    }
                    break;
                case 2 :
                    // RTL.g:1040:7: f= 'false'
                    {
                    f=(Token)match(input,77,FOLLOW_77_in_literal4653); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(false); }

                    }
                    break;
                case 3 :
                    // RTL.g:1041:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_literal4666); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTIntegerLiteral(i); }

                    }
                    break;
                case 4 :
                    // RTL.g:1042:7: r= REAL
                    {
                    r=(Token)match(input,REAL,FOLLOW_REAL_in_literal4681); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRealLiteral(r); }

                    }
                    break;
                case 5 :
                    // RTL.g:1043:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_literal4695); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTStringLiteral(s); }

                    }
                    break;
                case 6 :
                    // RTL.g:1044:7: HASH enumLit= IDENT
                    {
                    match(input,HASH,FOLLOW_HASH_in_literal4705); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal4709); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumLit);}

                    }
                    break;
                case 7 :
                    // RTL.g:1045:7: enumName= IDENT '::' enumLit= IDENT
                    {
                    enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal4721); if (state.failed) return n;

                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal4723); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal4727); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumName, enumLit); }

                    }
                    break;
                case 8 :
                    // RTL.g:1046:7: nColIt= collectionLiteral
                    {
                    pushFollow(FOLLOW_collectionLiteral_in_literal4739);
                    nColIt=collectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nColIt; }

                    }
                    break;
                case 9 :
                    // RTL.g:1047:7: nEColIt= emptyCollectionLiteral
                    {
                    pushFollow(FOLLOW_emptyCollectionLiteral_in_literal4751);
                    nEColIt=emptyCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nEColIt; }

                    }
                    break;
                case 10 :
                    // RTL.g:1048:7: nUndLit= undefinedLiteral
                    {
                    pushFollow(FOLLOW_undefinedLiteral_in_literal4763);
                    nUndLit=undefinedLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nUndLit; }

                    }
                    break;
                case 11 :
                    // RTL.g:1049:7: nTupleLit= tupleLiteral
                    {
                    pushFollow(FOLLOW_tupleLiteral_in_literal4775);
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
    // RTL.g:1057:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
    public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
        ASTCollectionLiteral n = null;


        ASTCollectionItem ci =null;


         Token op = null; 
        try {
            // RTL.g:1059:5: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
            // RTL.g:1060:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( input.LA(1)==45||(input.LA(1) >= 48 && input.LA(1) <= 50) ) {
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

            match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral4842); if (state.failed) return n;

            // RTL.g:1064:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==AT||LA97_0==HASH||(LA97_0 >= IDENT && LA97_0 <= INT)||(LA97_0 >= LPAREN && LA97_0 <= MINUS)||LA97_0==PLUS||LA97_0==REAL||LA97_0==STRING||(LA97_0 >= 45 && LA97_0 <= 46)||(LA97_0 >= 48 && LA97_0 <= 52)||LA97_0==77||LA97_0==80||(LA97_0 >= 86 && LA97_0 <= 87)||(LA97_0 >= 91 && LA97_0 <= 97)||LA97_0==108) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // RTL.g:1065:7: ci= collectionItem ( COMMA ci= collectionItem )*
                    {
                    pushFollow(FOLLOW_collectionItem_in_collectionLiteral4859);
                    ci=collectionItem();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addItem(ci); }

                    // RTL.g:1066:7: ( COMMA ci= collectionItem )*
                    loop96:
                    do {
                        int alt96=2;
                        int LA96_0 = input.LA(1);

                        if ( (LA96_0==COMMA) ) {
                            alt96=1;
                        }


                        switch (alt96) {
                    	case 1 :
                    	    // RTL.g:1066:9: COMMA ci= collectionItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral4872); if (state.failed) return n;

                    	    pushFollow(FOLLOW_collectionItem_in_collectionLiteral4876);
                    	    ci=collectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addItem(ci); }

                    	    }
                    	    break;

                    	default :
                    	    break loop96;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral4895); if (state.failed) return n;

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
    // RTL.g:1075:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
    public final ASTCollectionItem collectionItem() throws RecognitionException {
        ASTCollectionItem n = null;


        RTLParser.expression_return e =null;


         n = new ASTCollectionItem(); 
        try {
            // RTL.g:1077:5: (e= expression ( DOTDOT e= expression )? )
            // RTL.g:1078:5: e= expression ( DOTDOT e= expression )?
            {
            pushFollow(FOLLOW_expression_in_collectionItem4924);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setFirst((e!=null?e.n:null)); }

            // RTL.g:1079:5: ( DOTDOT e= expression )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==DOTDOT) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // RTL.g:1079:7: DOTDOT e= expression
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem4935); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_collectionItem4939);
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
    // RTL.g:1089:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE );
    public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
        ASTEmptyCollectionLiteral n = null;


        ASTCollectionType t =null;


        try {
            // RTL.g:1090:5: ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==94) ) {
                alt99=1;
            }
            else if ( ((LA99_0 >= 45 && LA99_0 <= 46)||(LA99_0 >= 48 && LA99_0 <= 50)) ) {
                alt99=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;

            }
            switch (alt99) {
                case 1 :
                    // RTL.g:1091:5: 'oclEmpty' LPAREN t= collectionType RPAREN
                    {
                    match(input,94,FOLLOW_94_in_emptyCollectionLiteral4968); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral4970); if (state.failed) return n;

                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral4974);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral4976); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }

                    }
                    break;
                case 2 :
                    // RTL.g:1094:5: t= collectionType LBRACE RBRACE
                    {
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral4992);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral4994); if (state.failed) return n;

                    match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral4996); if (state.failed) return n;

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
    // RTL.g:1105:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
    public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
        ASTUndefinedLiteral n = null;


        ASTType t =null;


        try {
            // RTL.g:1106:5: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
            int alt100=4;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt100=1;
                }
                break;
            case 52:
                {
                alt100=2;
                }
                break;
            case 92:
                {
                int LA100_3 = input.LA(2);

                if ( (LA100_3==LPAREN) ) {
                    alt100=3;
                }
                else if ( (LA100_3==EOF||(LA100_3 >= ARROW && LA100_3 <= BAR)||LA100_3==COMMA||(LA100_3 >= DOT && LA100_3 <= EQUAL)||(LA100_3 >= GREATER && LA100_3 <= GREATER_EQUAL)||LA100_3==IDENT||LA100_3==LBRACE||(LA100_3 >= LESS && LA100_3 <= LESS_EQUAL)||LA100_3==MINUS||(LA100_3 >= NOT_EQUAL && LA100_3 <= PLUS)||(LA100_3 >= RBRACE && LA100_3 <= RBRACK)||(LA100_3 >= RPAREN && LA100_3 <= SLASH)||LA100_3==STAR||LA100_3==53||LA100_3==55||(LA100_3 >= 57 && LA100_3 <= 59)||(LA100_3 >= 65 && LA100_3 <= 66)||(LA100_3 >= 70 && LA100_3 <= 74)||LA100_3==76||(LA100_3 >= 81 && LA100_3 <= 82)||LA100_3==85||(LA100_3 >= 98 && LA100_3 <= 103)||(LA100_3 >= 105 && LA100_3 <= 106)||LA100_3==110) ) {
                    alt100=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;

            }

            switch (alt100) {
                case 1 :
                    // RTL.g:1107:5: 'oclUndefined' LPAREN t= type RPAREN
                    {
                    match(input,97,FOLLOW_97_in_undefinedLiteral5026); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral5028); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral5032);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral5034); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 2 :
                    // RTL.g:1110:5: 'Undefined'
                    {
                    match(input,52,FOLLOW_52_in_undefinedLiteral5048); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }

                    }
                    break;
                case 3 :
                    // RTL.g:1113:5: 'null' LPAREN t= type RPAREN
                    {
                    match(input,92,FOLLOW_92_in_undefinedLiteral5062); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral5064); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral5068);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral5070); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 4 :
                    // RTL.g:1116:5: 'null'
                    {
                    match(input,92,FOLLOW_92_in_undefinedLiteral5084); if (state.failed) return n;

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
    // RTL.g:1126:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
    public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
        ASTTupleLiteral n = null;


        ASTTupleItem ti =null;


         List tiList = new ArrayList(); 
        try {
            // RTL.g:1128:5: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
            // RTL.g:1129:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
            {
            match(input,51,FOLLOW_51_in_tupleLiteral5123); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral5129); if (state.failed) return n;

            pushFollow(FOLLOW_tupleItem_in_tupleLiteral5137);
            ti=tupleItem();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tiList.add(ti); }

            // RTL.g:1132:5: ( COMMA ti= tupleItem )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==COMMA) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // RTL.g:1132:7: COMMA ti= tupleItem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral5148); if (state.failed) return n;

            	    pushFollow(FOLLOW_tupleItem_in_tupleLiteral5152);
            	    ti=tupleItem();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tiList.add(ti); }

            	    }
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral5163); if (state.failed) return n;

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
    // RTL.g:1140:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
    public final ASTTupleItem tupleItem() throws RecognitionException {
        ASTTupleItem n = null;


        Token name=null;
        ASTType t =null;

        RTLParser.expression_return e =null;


        try {
            // RTL.g:1141:5: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
            // RTL.g:1142:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem5194); if (state.failed) return n;

            // RTL.g:1143:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==COLON) ) {
                int LA102_1 = input.LA(2);

                if ( (synpred1_RTL()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA102_0==EQUAL) ) {
                alt102=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;

            }
            switch (alt102) {
                case 1 :
                    // RTL.g:1146:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
                    {
                    match(input,COLON,FOLLOW_COLON_in_tupleItem5233); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_tupleItem5237);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem5239); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_tupleItem5243);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTTupleItem(name, t, (e!=null?e.n:null)); }

                    }
                    break;
                case 2 :
                    // RTL.g:1149:7: ( COLON | EQUAL ) e= expression
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


                    pushFollow(FOLLOW_expression_in_tupleItem5275);
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
    // RTL.g:1160:1: type returns [ASTType n] : (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) ;
    public final ASTType type() throws RecognitionException {
        ASTType n = null;


        ASTSimpleType nTSimple =null;

        ASTCollectionType nTCollection =null;

        ASTTupleType nTTuple =null;


         Token tok = null; 
        try {
            // RTL.g:1162:5: ( (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) )
            // RTL.g:1163:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of type */ }

            // RTL.g:1164:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            int alt103=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt103=1;
                }
                break;
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
                {
                alt103=2;
                }
                break;
            case 51:
                {
                alt103=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;

            }

            switch (alt103) {
                case 1 :
                    // RTL.g:1165:7: nTSimple= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type5341);
                    nTSimple=simpleType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTSimple; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 2 :
                    // RTL.g:1166:7: nTCollection= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type5353);
                    nTCollection=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTCollection; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 3 :
                    // RTL.g:1167:7: nTTuple= tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_type5365);
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
    // RTL.g:1172:1: typeOnly returns [ASTType n] : nT= type EOF ;
    public final ASTType typeOnly() throws RecognitionException {
        ASTType n = null;


        ASTType nT =null;


        try {
            // RTL.g:1173:5: (nT= type EOF )
            // RTL.g:1174:5: nT= type EOF
            {
            pushFollow(FOLLOW_type_in_typeOnly5397);
            nT=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_typeOnly5399); if (state.failed) return n;

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
    // RTL.g:1184:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
    public final ASTSimpleType simpleType() throws RecognitionException {
        ASTSimpleType n = null;


        Token name=null;

        try {
            // RTL.g:1185:5: (name= IDENT )
            // RTL.g:1186:5: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType5427); if (state.failed) return n;

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
    // RTL.g:1194:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
    public final ASTCollectionType collectionType() throws RecognitionException {
        ASTCollectionType n = null;


        ASTType elemType =null;


         Token op = null; 
        try {
            // RTL.g:1196:5: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
            // RTL.g:1197:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( (input.LA(1) >= 45 && input.LA(1) <= 46)||(input.LA(1) >= 48 && input.LA(1) <= 50) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_collectionType5492); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_collectionType5496);
            elemType=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_collectionType5498); if (state.failed) return n;

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
    // RTL.g:1207:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
    public final ASTTupleType tupleType() throws RecognitionException {
        ASTTupleType n = null;


        ASTTuplePart tp =null;


         List tpList = new ArrayList(); 
        try {
            // RTL.g:1209:5: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
            // RTL.g:1210:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
            {
            match(input,51,FOLLOW_51_in_tupleType5532); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_tupleType5534); if (state.failed) return n;

            pushFollow(FOLLOW_tuplePart_in_tupleType5543);
            tp=tuplePart();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tpList.add(tp); }

            // RTL.g:1212:5: ( COMMA tp= tuplePart )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==COMMA) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // RTL.g:1212:7: COMMA tp= tuplePart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleType5554); if (state.failed) return n;

            	    pushFollow(FOLLOW_tuplePart_in_tupleType5558);
            	    tp=tuplePart();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tpList.add(tp); }

            	    }
            	    break;

            	default :
            	    break loop104;
                }
            } while (true);


            match(input,RPAREN,FOLLOW_RPAREN_in_tupleType5570); if (state.failed) return n;

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
    // RTL.g:1221:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
    public final ASTTuplePart tuplePart() throws RecognitionException {
        ASTTuplePart n = null;


        Token name=null;
        ASTType t =null;


        try {
            // RTL.g:1222:5: (name= IDENT COLON t= type )
            // RTL.g:1223:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart5602); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_tuplePart5604); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_tuplePart5608);
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
    // RTL.g:1262:1: statOnly returns [ASTStatement n] : s= stat EOF ;
    public final ASTStatement statOnly() throws RecognitionException {
        ASTStatement n = null;


        RTLParser.stat_return s =null;


        try {
            // RTL.g:1263:3: (s= stat EOF )
            // RTL.g:1264:3: s= stat EOF
            {
            pushFollow(FOLLOW_stat_in_statOnly5657);
            s=stat();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_statOnly5661); if (state.failed) return n;

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
    // RTL.g:1274:1: stat returns [ASTStatement n] : nextStat[seq] ( SEMI nextStat[seq] )* ;
    public final RTLParser.stat_return stat() throws RecognitionException {
        RTLParser.stat_return retval = new RTLParser.stat_return();
        retval.start = input.LT(1);



          ASTSequenceStatement seq = new ASTSequenceStatement();

        try {
            // RTL.g:1278:3: ( nextStat[seq] ( SEMI nextStat[seq] )* )
            // RTL.g:1279:3: nextStat[seq] ( SEMI nextStat[seq] )*
            {
            pushFollow(FOLLOW_nextStat_in_stat5692);
            nextStat(seq);

            state._fsp--;
            if (state.failed) return retval;

            // RTL.g:1280:3: ( SEMI nextStat[seq] )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==SEMI) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // RTL.g:1281:5: SEMI nextStat[seq]
            	    {
            	    match(input,SEMI,FOLLOW_SEMI_in_stat5703); if (state.failed) return retval;

            	    pushFollow(FOLLOW_nextStat_in_stat5709);
            	    nextStat(seq);

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop105;
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
    // RTL.g:1297:1: nextStat[ASTSequenceStatement seq] : s= singleStat ;
    public final RTLParser.nextStat_return nextStat(ASTSequenceStatement seq) throws RecognitionException {
        RTLParser.nextStat_return retval = new RTLParser.nextStat_return();
        retval.start = input.LT(1);


        ASTStatement s =null;


        try {
            // RTL.g:1298:3: (s= singleStat )
            // RTL.g:1299:3: s= singleStat
            {
            pushFollow(FOLLOW_singleStat_in_nextStat5743);
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
    // RTL.g:1311:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat );
    public final ASTStatement singleStat() throws RecognitionException {
        ASTStatement n = null;


        ASTEmptyStatement emp =null;

        ASTStatement sse =null;

        ASTStatement vas =null;

        ASTStatement ocs =null;

        RTLParser.objDestroyStat_return ods =null;

        ASTLinkInsertionStatement lis =null;

        ASTLinkDeletionStatement lds =null;

        ASTConditionalExecutionStatement ces =null;

        ASTIterationStatement its =null;

        ASTWhileStatement whs =null;

        ASTBlockStatement blk =null;


        try {
            // RTL.g:1315:5: (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat )
            int alt106=11;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==EOF||LA106_0==SEMI||(LA106_0 >= 72 && LA106_0 <= 73)) ) {
                alt106=1;
            }
            else if ( (LA106_0==87) && (synpred2_RTL())) {
                alt106=2;
            }
            else if ( (LA106_0==MINUS||LA106_0==PLUS||LA106_0==91) && (synpred2_RTL())) {
                alt106=2;
            }
            else if ( (LA106_0==108) && (synpred2_RTL())) {
                alt106=2;
            }
            else if ( (LA106_0==77) && (synpred2_RTL())) {
                alt106=2;
            }
            else if ( (LA106_0==INT) && (synpred2_RTL())) {
                alt106=2;
            }
            else if ( (LA106_0==REAL) && (synpred2_RTL())) {
                alt106=2;
            }
            else if ( (LA106_0==STRING) && (synpred2_RTL())) {
                alt106=2;
            }
            else if ( (LA106_0==HASH) && (synpred2_RTL())) {
                alt106=2;
            }
            else if ( (LA106_0==IDENT) ) {
                int LA106_13 = input.LA(2);

                if ( (synpred2_RTL()) ) {
                    alt106=2;
                }
                else if ( (true) ) {
                    alt106=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 106, 13, input);

                    throw nvae;

                }
            }
            else if ( (LA106_0==45||(LA106_0 >= 48 && LA106_0 <= 50)) && (synpred2_RTL())) {
                alt106=2;
            }
            else if ( (LA106_0==94) && (synpred2_RTL())) {
                alt106=2;
            }
            else if ( (LA106_0==46) && (synpred2_RTL())) {
                alt106=2;
            }
            else if ( (LA106_0==97) && (synpred2_RTL())) {
                alt106=2;
            }
            else if ( (LA106_0==52) && (synpred2_RTL())) {
                alt106=2;
            }
            else if ( (LA106_0==92) && (synpred2_RTL())) {
                alt106=2;
            }
            else if ( (LA106_0==51) && (synpred2_RTL())) {
                alt106=2;
            }
            else if ( (LA106_0==AT) && (synpred2_RTL())) {
                alt106=2;
            }
            else if ( (LA106_0==86) && (synpred2_RTL())) {
                alt106=2;
            }
            else if ( (LA106_0==93||(LA106_0 >= 95 && LA106_0 <= 96)) && (synpred2_RTL())) {
                alt106=2;
            }
            else if ( (LA106_0==LPAREN) && (synpred2_RTL())) {
                alt106=2;
            }
            else if ( (LA106_0==80) ) {
                int LA106_25 = input.LA(2);

                if ( (synpred2_RTL()) ) {
                    alt106=2;
                }
                else if ( (true) ) {
                    alt106=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 106, 25, input);

                    throw nvae;

                }
            }
            else if ( (LA106_0==90) ) {
                alt106=4;
            }
            else if ( (LA106_0==69) ) {
                alt106=5;
            }
            else if ( (LA106_0==83) ) {
                alt106=6;
            }
            else if ( (LA106_0==68) ) {
                alt106=7;
            }
            else if ( (LA106_0==78) ) {
                alt106=9;
            }
            else if ( (LA106_0==109) ) {
                alt106=10;
            }
            else if ( (LA106_0==60) ) {
                alt106=11;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;

            }
            switch (alt106) {
                case 1 :
                    // RTL.g:1316:5: emp= emptyStat
                    {
                    pushFollow(FOLLOW_emptyStat_in_singleStat5780);
                    emp=emptyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = emp; }

                    }
                    break;
                case 2 :
                    // RTL.g:1318:5: ( statStartingWithExpr )=>sse= statStartingWithExpr
                    {
                    pushFollow(FOLLOW_statStartingWithExpr_in_singleStat5806);
                    sse=statStartingWithExpr();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = sse; }

                    }
                    break;
                case 3 :
                    // RTL.g:1319:5: vas= varAssignStat
                    {
                    pushFollow(FOLLOW_varAssignStat_in_singleStat5818);
                    vas=varAssignStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = vas; }

                    }
                    break;
                case 4 :
                    // RTL.g:1320:5: ocs= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_singleStat5832);
                    ocs=objCreateStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = ocs; }

                    }
                    break;
                case 5 :
                    // RTL.g:1321:5: ods= objDestroyStat
                    {
                    pushFollow(FOLLOW_objDestroyStat_in_singleStat5846);
                    ods=objDestroyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ods!=null?ods.n:null); }

                    }
                    break;
                case 6 :
                    // RTL.g:1322:5: lis= lnkInsStat
                    {
                    pushFollow(FOLLOW_lnkInsStat_in_singleStat5859);
                    lis=lnkInsStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = lis; }

                    }
                    break;
                case 7 :
                    // RTL.g:1323:5: lds= lnkDelStat
                    {
                    pushFollow(FOLLOW_lnkDelStat_in_singleStat5876);
                    lds=lnkDelStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = lds; }

                    }
                    break;
                case 8 :
                    // RTL.g:1324:5: ces= condExStat
                    {
                    pushFollow(FOLLOW_condExStat_in_singleStat5893);
                    ces=condExStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = ces; }

                    }
                    break;
                case 9 :
                    // RTL.g:1325:5: its= iterStat
                    {
                    pushFollow(FOLLOW_iterStat_in_singleStat5910);
                    its=iterStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = its; }

                    }
                    break;
                case 10 :
                    // RTL.g:1327:5: whs= whileStat
                    {
                    pushFollow(FOLLOW_whileStat_in_singleStat5932);
                    whs=whileStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = whs; }

                    }
                    break;
                case 11 :
                    // RTL.g:1328:5: blk= blockStat
                    {
                    pushFollow(FOLLOW_blockStat_in_singleStat5950);
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
    // RTL.g:1335:1: emptyStat returns [ASTEmptyStatement n] : nothing ;
    public final ASTEmptyStatement emptyStat() throws RecognitionException {
        ASTEmptyStatement n = null;


        try {
            // RTL.g:1336:3: ( nothing )
            // RTL.g:1337:3: nothing
            {
            pushFollow(FOLLOW_nothing_in_emptyStat5977);
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
    // RTL.g:1342:1: statStartingWithExpr returns [ASTStatement n] : expr= inSoilExpression (aas= attAssignStat[$expr.n] )? ;
    public final ASTStatement statStartingWithExpr() throws RecognitionException {
        ASTStatement n = null;


        ASTExpression expr =null;

        ASTAttributeAssignmentStatement aas =null;


        try {
            // RTL.g:1343:3: (expr= inSoilExpression (aas= attAssignStat[$expr.n] )? )
            // RTL.g:1344:3: expr= inSoilExpression (aas= attAssignStat[$expr.n] )?
            {
            pushFollow(FOLLOW_inSoilExpression_in_statStartingWithExpr6003);
            expr=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            // RTL.g:1345:3: (aas= attAssignStat[$expr.n] )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==DOT) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // RTL.g:1346:5: aas= attAssignStat[$expr.n]
                    {
                    pushFollow(FOLLOW_attAssignStat_in_statStartingWithExpr6017);
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
    // RTL.g:1358:1: varAssignStat returns [ASTStatement n] : varName= IDENT COLON_EQUAL rVal= rValue ;
    public final ASTStatement varAssignStat() throws RecognitionException {
        ASTStatement n = null;


        Token varName=null;
        RTLParser.rValue_return rVal =null;


        try {
            // RTL.g:1359:3: (varName= IDENT COLON_EQUAL rVal= rValue )
            // RTL.g:1360:3: varName= IDENT COLON_EQUAL rVal= rValue
            {
            varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_varAssignStat6055); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_varAssignStat6059); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_varAssignStat6067);
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
    // RTL.g:1428:1: attAssignStat[ASTExpression exp] returns [ASTAttributeAssignmentStatement n] : DOT attName= IDENT COLON_EQUAL r= rValue ;
    public final ASTAttributeAssignmentStatement attAssignStat(ASTExpression exp) throws RecognitionException {
        ASTAttributeAssignmentStatement n = null;


        Token attName=null;
        RTLParser.rValue_return r =null;


        try {
            // RTL.g:1429:3: ( DOT attName= IDENT COLON_EQUAL r= rValue )
            // RTL.g:1430:3: DOT attName= IDENT COLON_EQUAL r= rValue
            {
            match(input,DOT,FOLLOW_DOT_in_attAssignStat6098); if (state.failed) return n;

            attName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attAssignStat6107); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attAssignStat6111); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_attAssignStat6119);
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
    // RTL.g:1442:1: objCreateStat returns [ASTStatement n] : 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? ;
    public final ASTStatement objCreateStat() throws RecognitionException {
        ASTStatement n = null;


        ASTSimpleType ident =null;

        ASTExpression objName =null;

        RTLParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // RTL.g:1443:3: ( 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? )
            // RTL.g:1444:3: 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            {
            match(input,90,FOLLOW_90_in_objCreateStat6145); if (state.failed) return n;

            pushFollow(FOLLOW_simpleType_in_objCreateStat6153);
            ident=simpleType();

            state._fsp--;
            if (state.failed) return n;

            // RTL.g:1446:3: ( LPAREN objName= inSoilExpression RPAREN )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==LPAREN) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // RTL.g:1447:5: LPAREN objName= inSoilExpression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat6163); if (state.failed) return n;

                    pushFollow(FOLLOW_inSoilExpression_in_objCreateStat6175);
                    objName=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat6181); if (state.failed) return n;

                    }
                    break;

            }


            // RTL.g:1452:3: ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==61) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // RTL.g:1453:5: 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN
                    {
                    match(input,61,FOLLOW_61_in_objCreateStat6199); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat6207); if (state.failed) return n;

                    pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat6221);
                    p=rValListMin2WithOptionalQualifiers();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat6229); if (state.failed) return n;

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
    // RTL.g:1472:1: objDestroyStat returns [ASTStatement n] : 'destroy' el= exprListMin1 ;
    public final RTLParser.objDestroyStat_return objDestroyStat() throws RecognitionException {
        RTLParser.objDestroyStat_return retval = new RTLParser.objDestroyStat_return();
        retval.start = input.LT(1);


        List<ASTExpression> el =null;


        try {
            // RTL.g:1473:3: ( 'destroy' el= exprListMin1 )
            // RTL.g:1474:3: 'destroy' el= exprListMin1
            {
            match(input,69,FOLLOW_69_in_objDestroyStat6265); if (state.failed) return retval;

            pushFollow(FOLLOW_exprListMin1_in_objDestroyStat6273);
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
    // RTL.g:1495:1: lnkInsStat returns [ASTLinkInsertionStatement n] : 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT ;
    public final ASTLinkInsertionStatement lnkInsStat() throws RecognitionException {
        ASTLinkInsertionStatement n = null;


        Token ass=null;
        RTLParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // RTL.g:1496:3: ( 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT )
            // RTL.g:1497:3: 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT
            {
            match(input,83,FOLLOW_83_in_lnkInsStat6299); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkInsStat6303); if (state.failed) return n;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat6313);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkInsStat6317); if (state.failed) return n;

            match(input,84,FOLLOW_84_in_lnkInsStat6321); if (state.failed) return n;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkInsStat6329); if (state.failed) return n;

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
    // RTL.g:1507:1: rValListMin2WithOptionalQualifiers returns [List<ASTRValue> participans, List<List<ASTRValue>> qualifiers] : r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* ;
    public final RTLParser.rValListMin2WithOptionalQualifiers_return rValListMin2WithOptionalQualifiers() throws RecognitionException {
        RTLParser.rValListMin2WithOptionalQualifiers_return retval = new RTLParser.rValListMin2WithOptionalQualifiers_return();
        retval.start = input.LT(1);


        RTLParser.rValue_return r =null;

        List<ASTRValue> qualifierValues =null;



          retval.participans = new ArrayList<ASTRValue>();
          retval.qualifiers = new ArrayList<List<ASTRValue>>();
          List<ASTRValue> currentQualifiers = Collections.emptyList();

        try {
            // RTL.g:1513:3: (r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* )
            // RTL.g:1514:3: r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers6358);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add((r!=null?r.n:null)); }

            // RTL.g:1515:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==LBRACE) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // RTL.g:1516:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers6369); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers6378);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers6385); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers6401); if (state.failed) return retval;

            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers6412);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add((r!=null?r.n:null)); }

            // RTL.g:1528:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==LBRACE) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // RTL.g:1529:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers6423); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers6432);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers6439); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            // RTL.g:1538:3: ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==COMMA) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // RTL.g:1539:5: COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers6461); if (state.failed) return retval;

            	    pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers6476);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) { retval.participans.add((r!=null?r.n:null)); }

            	    // RTL.g:1543:5: ( LBRACE qualifierValues= rValList RBRACE )?
            	    int alt112=2;
            	    int LA112_0 = input.LA(1);

            	    if ( (LA112_0==LBRACE) ) {
            	        alt112=1;
            	    }
            	    switch (alt112) {
            	        case 1 :
            	            // RTL.g:1544:6: LBRACE qualifierValues= rValList RBRACE
            	            {
            	            match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers6496); if (state.failed) return retval;

            	            pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers6507);
            	            qualifierValues=rValList();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

            	            match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers6516); if (state.failed) return retval;

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
            	    break loop113;
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
    // RTL.g:1559:1: lnkDelStat returns [ASTLinkDeletionStatement n] : 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT ;
    public final ASTLinkDeletionStatement lnkDelStat() throws RecognitionException {
        ASTLinkDeletionStatement n = null;


        Token ass=null;
        RTLParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // RTL.g:1560:3: ( 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT )
            // RTL.g:1561:3: 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT
            {
            match(input,68,FOLLOW_68_in_lnkDelStat6557); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkDelStat6561); if (state.failed) return n;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat6571);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkDelStat6575); if (state.failed) return n;

            match(input,79,FOLLOW_79_in_lnkDelStat6579); if (state.failed) return n;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkDelStat6588); if (state.failed) return n;

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
    // RTL.g:1575:1: condExStat returns [ASTConditionalExecutionStatement n] : 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' ;
    public final ASTConditionalExecutionStatement condExStat() throws RecognitionException {
        ASTConditionalExecutionStatement n = null;


        ASTExpression con =null;

        ASTStatement ts =null;

        ASTStatement es =null;



          ASTStatement elseStat = new ASTEmptyStatement();

        try {
            // RTL.g:1579:3: ( 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' )
            // RTL.g:1580:3: 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end'
            {
            match(input,80,FOLLOW_80_in_condExStat6619); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_condExStat6628);
            con=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            match(input,106,FOLLOW_106_in_condExStat6632); if (state.failed) return n;

            pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat6641);
            ts=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return n;

            // RTL.g:1584:3: ( 'else' es= statOrImplicitBlock )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==72) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // RTL.g:1585:5: 'else' es= statOrImplicitBlock
                    {
                    match(input,72,FOLLOW_72_in_condExStat6652); if (state.failed) return n;

                    pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat6664);
                    es=statOrImplicitBlock();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { elseStat = es; }

                    }
                    break;

            }


            match(input,73,FOLLOW_73_in_condExStat6676); if (state.failed) return n;

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
    // RTL.g:1596:1: iterStat returns [ASTIterationStatement n] : 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final ASTIterationStatement iterStat() throws RecognitionException {
        ASTIterationStatement n = null;


        Token var=null;
        ASTExpression set =null;

        ASTStatement s =null;


        try {
            // RTL.g:1597:3: ( 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // RTL.g:1598:3: 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,78,FOLLOW_78_in_iterStat6701); if (state.failed) return n;

            var=(Token)match(input,IDENT,FOLLOW_IDENT_in_iterStat6709); if (state.failed) return n;

            match(input,82,FOLLOW_82_in_iterStat6713); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_iterStat6721);
            set=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            match(input,71,FOLLOW_71_in_iterStat6725); if (state.failed) return n;

            pushFollow(FOLLOW_statOrImplicitBlock_in_iterStat6733);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return n;

            match(input,73,FOLLOW_73_in_iterStat6738); if (state.failed) return n;

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
    // RTL.g:1613:1: whileStat returns [ASTWhileStatement n] : 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final ASTWhileStatement whileStat() throws RecognitionException {
        ASTWhileStatement n = null;


        ASTExpression cond =null;

        ASTStatement s =null;


        try {
            // RTL.g:1614:3: ( 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // RTL.g:1615:3: 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,109,FOLLOW_109_in_whileStat6764); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_whileStat6772);
            cond=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            match(input,71,FOLLOW_71_in_whileStat6776); if (state.failed) return n;

            pushFollow(FOLLOW_statOrImplicitBlock_in_whileStat6784);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return n;

            match(input,73,FOLLOW_73_in_whileStat6789); if (state.failed) return n;

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
    // RTL.g:1627:1: blockStat returns [ASTBlockStatement n] : 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' ;
    public final ASTBlockStatement blockStat() throws RecognitionException {
        ASTBlockStatement n = null;


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        RTLParser.stat_return s =null;



          n = new ASTBlockStatement(org.tzi.use.config.Options.explicitVariableDeclarations);

        try {
            // RTL.g:1631:2: ( 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' )
            // RTL.g:1632:2: 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end'
            {
            match(input,60,FOLLOW_60_in_blockStat6819); if (state.failed) return n;

            // RTL.g:1633:2: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==67) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // RTL.g:1633:4: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI
                    {
                    match(input,67,FOLLOW_67_in_blockStat6824); if (state.failed) return n;

                    pushFollow(FOLLOW_variableDeclaration_in_blockStat6830);
                    vd=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addVariableDeclaration(vd);}

                    // RTL.g:1633:72: ( COMMA vd1= variableDeclaration )*
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==COMMA) ) {
                            alt115=1;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // RTL.g:1633:74: COMMA vd1= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_blockStat6836); if (state.failed) return n;

                    	    pushFollow(FOLLOW_variableDeclaration_in_blockStat6842);
                    	    vd1=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addVariableDeclaration(vd1);}

                    	    }
                    	    break;

                    	default :
                    	    break loop115;
                        }
                    } while (true);


                    match(input,SEMI,FOLLOW_SEMI_in_blockStat6849); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_stat_in_blockStat6859);
            s=stat();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setBody((s!=null?s.n:null)); }

            match(input,73,FOLLOW_73_in_blockStat6864); if (state.failed) return n;

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
    // RTL.g:1642:1: implicitBlockStat returns [ASTBlockStatement n] : 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat ;
    public final ASTBlockStatement implicitBlockStat() throws RecognitionException {
        ASTBlockStatement n = null;


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        RTLParser.stat_return s =null;



          n = new ASTBlockStatement(false);

        try {
            // RTL.g:1646:3: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat )
            // RTL.g:1647:3: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat
            {
            match(input,67,FOLLOW_67_in_implicitBlockStat6890); if (state.failed) return n;

            pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat6896);
            vd=variableDeclaration();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.addVariableDeclaration(vd);}

            // RTL.g:1647:71: ( COMMA vd1= variableDeclaration )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==COMMA) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // RTL.g:1647:73: COMMA vd1= variableDeclaration
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_implicitBlockStat6902); if (state.failed) return n;

            	    pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat6908);
            	    vd1=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addVariableDeclaration(vd1);}

            	    }
            	    break;

            	default :
            	    break loop117;
                }
            } while (true);


            match(input,SEMI,FOLLOW_SEMI_in_implicitBlockStat6915); if (state.failed) return n;

            pushFollow(FOLLOW_stat_in_implicitBlockStat6923);
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
    // RTL.g:1651:1: statOrImplicitBlock returns [ASTStatement n] : (s1= stat |s2= implicitBlockStat ) ;
    public final ASTStatement statOrImplicitBlock() throws RecognitionException {
        ASTStatement n = null;


        RTLParser.stat_return s1 =null;

        ASTBlockStatement s2 =null;


        try {
            // RTL.g:1652:3: ( (s1= stat |s2= implicitBlockStat ) )
            // RTL.g:1653:3: (s1= stat |s2= implicitBlockStat )
            {
            // RTL.g:1653:3: (s1= stat |s2= implicitBlockStat )
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==AT||LA118_0==HASH||(LA118_0 >= IDENT && LA118_0 <= INT)||(LA118_0 >= LPAREN && LA118_0 <= MINUS)||LA118_0==PLUS||LA118_0==REAL||LA118_0==SEMI||LA118_0==STRING||(LA118_0 >= 45 && LA118_0 <= 46)||(LA118_0 >= 48 && LA118_0 <= 52)||LA118_0==60||(LA118_0 >= 68 && LA118_0 <= 69)||(LA118_0 >= 72 && LA118_0 <= 73)||(LA118_0 >= 77 && LA118_0 <= 78)||LA118_0==80||LA118_0==83||(LA118_0 >= 86 && LA118_0 <= 87)||(LA118_0 >= 90 && LA118_0 <= 97)||(LA118_0 >= 108 && LA118_0 <= 109)) ) {
                alt118=1;
            }
            else if ( (LA118_0==67) ) {
                alt118=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;

            }
            switch (alt118) {
                case 1 :
                    // RTL.g:1653:4: s1= stat
                    {
                    pushFollow(FOLLOW_stat_in_statOrImplicitBlock6946);
                    s1=stat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (s1!=null?s1.n:null); }

                    }
                    break;
                case 2 :
                    // RTL.g:1653:31: s2= implicitBlockStat
                    {
                    pushFollow(FOLLOW_implicitBlockStat_in_statOrImplicitBlock6956);
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
    // RTL.g:1667:1: nothing :;
    public final void nothing() throws RecognitionException {
        try {
            // RTL.g:1668:1: ()
            // RTL.g:1669:1: 
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
    // RTL.g:1675:1: rValue returns [ASTRValue n] : (e= inSoilExpression |oc= objCreateStat );
    public final RTLParser.rValue_return rValue() throws RecognitionException {
        RTLParser.rValue_return retval = new RTLParser.rValue_return();
        retval.start = input.LT(1);


        ASTExpression e =null;

        ASTStatement oc =null;


        try {
            // RTL.g:1676:5: (e= inSoilExpression |oc= objCreateStat )
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==AT||LA119_0==HASH||(LA119_0 >= IDENT && LA119_0 <= INT)||(LA119_0 >= LPAREN && LA119_0 <= MINUS)||LA119_0==PLUS||LA119_0==REAL||LA119_0==STRING||(LA119_0 >= 45 && LA119_0 <= 46)||(LA119_0 >= 48 && LA119_0 <= 52)||LA119_0==77||LA119_0==80||(LA119_0 >= 86 && LA119_0 <= 87)||(LA119_0 >= 91 && LA119_0 <= 97)||LA119_0==108) ) {
                alt119=1;
            }
            else if ( (LA119_0==90) ) {
                alt119=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;

            }
            switch (alt119) {
                case 1 :
                    // RTL.g:1677:5: e= inSoilExpression
                    {
                    pushFollow(FOLLOW_inSoilExpression_in_rValue7002);
                    e=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n = new ASTRValueExpressionOrOpCall(e); }

                    }
                    break;
                case 2 :
                    // RTL.g:1678:5: oc= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_rValue7014);
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
    // RTL.g:1692:1: rValList returns [List<ASTRValue> n] : ( nothing |rl= rValListMin1 );
    public final List<ASTRValue> rValList() throws RecognitionException {
        List<ASTRValue> n = null;


        List<ASTRValue> rl =null;


        try {
            // RTL.g:1693:3: ( nothing |rl= rValListMin1 )
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==RBRACE) ) {
                alt120=1;
            }
            else if ( (LA120_0==AT||LA120_0==HASH||(LA120_0 >= IDENT && LA120_0 <= INT)||(LA120_0 >= LPAREN && LA120_0 <= MINUS)||LA120_0==PLUS||LA120_0==REAL||LA120_0==STRING||(LA120_0 >= 45 && LA120_0 <= 46)||(LA120_0 >= 48 && LA120_0 <= 52)||LA120_0==77||LA120_0==80||(LA120_0 >= 86 && LA120_0 <= 87)||(LA120_0 >= 90 && LA120_0 <= 97)||LA120_0==108) ) {
                alt120=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;

            }
            switch (alt120) {
                case 1 :
                    // RTL.g:1694:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_rValList7037);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = Collections.<ASTRValue>emptyList(); }

                    }
                    break;
                case 2 :
                    // RTL.g:1697:3: rl= rValListMin1
                    {
                    pushFollow(FOLLOW_rValListMin1_in_rValList7064);
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
    // RTL.g:1705:1: rValListMin1 returns [List<ASTRValue> n] : r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin1() throws RecognitionException {
        List<ASTRValue> n = null;


        RTLParser.rValue_return r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // RTL.g:1709:3: (r= rValue ( COMMA r= rValue )* )
            // RTL.g:1710:3: r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin17097);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            // RTL.g:1712:3: ( COMMA r= rValue )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( (LA121_0==COMMA) ) {
                    alt121=1;
                }


                switch (alt121) {
            	case 1 :
            	    // RTL.g:1713:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin17111); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin17121);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            	    }
            	    break;

            	default :
            	    break loop121;
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
    // RTL.g:1723:1: rValListMin2 returns [List<ASTRValue> n] : r= rValue COMMA r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin2() throws RecognitionException {
        List<ASTRValue> n = null;


        RTLParser.rValue_return r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // RTL.g:1727:3: (r= rValue COMMA r= rValue ( COMMA r= rValue )* )
            // RTL.g:1728:3: r= rValue COMMA r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin27160);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin27168); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_rValListMin27176);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            // RTL.g:1733:3: ( COMMA r= rValue )*
            loop122:
            do {
                int alt122=2;
                int LA122_0 = input.LA(1);

                if ( (LA122_0==COMMA) ) {
                    alt122=1;
                }


                switch (alt122) {
            	case 1 :
            	    // RTL.g:1734:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin27190); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin27200);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            	    }
            	    break;

            	default :
            	    break loop122;
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
    // RTL.g:1744:1: inSoilExpression returns [ASTExpression n] : e= expression ;
    public final ASTExpression inSoilExpression() throws RecognitionException {
        ASTExpression n = null;


        RTLParser.expression_return e =null;


        try {
            // RTL.g:1745:3: (e= expression )
            // RTL.g:1746:3: e= expression
            {
            pushFollow(FOLLOW_expression_in_inSoilExpression7234);
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
    // RTL.g:1755:1: exprList returns [List<ASTExpression> n] : ( nothing |el= exprListMin1 );
    public final List<ASTExpression> exprList() throws RecognitionException {
        List<ASTExpression> n = null;


        List<ASTExpression> el =null;


        try {
            // RTL.g:1756:3: ( nothing |el= exprListMin1 )
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==EOF) ) {
                alt123=1;
            }
            else if ( (LA123_0==AT||LA123_0==HASH||(LA123_0 >= IDENT && LA123_0 <= INT)||(LA123_0 >= LPAREN && LA123_0 <= MINUS)||LA123_0==PLUS||LA123_0==REAL||LA123_0==STRING||(LA123_0 >= 45 && LA123_0 <= 46)||(LA123_0 >= 48 && LA123_0 <= 52)||LA123_0==77||LA123_0==80||(LA123_0 >= 86 && LA123_0 <= 87)||(LA123_0 >= 91 && LA123_0 <= 97)||LA123_0==108) ) {
                alt123=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;

            }
            switch (alt123) {
                case 1 :
                    // RTL.g:1757:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_exprList7263);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<ASTExpression>(); }

                    }
                    break;
                case 2 :
                    // RTL.g:1760:3: el= exprListMin1
                    {
                    pushFollow(FOLLOW_exprListMin1_in_exprList7281);
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
    // RTL.g:1768:1: exprListMin1 returns [List<ASTExpression> n] : e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin1() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // RTL.g:1772:3: (e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // RTL.g:1773:3: e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin17314);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // RTL.g:1775:3: ( COMMA e= inSoilExpression )*
            loop124:
            do {
                int alt124=2;
                int LA124_0 = input.LA(1);

                if ( (LA124_0==COMMA) ) {
                    alt124=1;
                }


                switch (alt124) {
            	case 1 :
            	    // RTL.g:1776:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin17329); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin17339);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            	    }
            	    break;

            	default :
            	    break loop124;
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
    // RTL.g:1786:1: exprListMin2 returns [List<ASTExpression> n] : e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin2() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // RTL.g:1790:3: (e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // RTL.g:1791:3: e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin27379);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            match(input,COMMA,FOLLOW_COMMA_in_exprListMin27387); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_exprListMin27395);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // RTL.g:1796:3: ( COMMA e= inSoilExpression )*
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==COMMA) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // RTL.g:1797:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin27409); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin27419);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            	    }
            	    break;

            	default :
            	    break loop125;
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
    // RTL.g:1807:1: identList returns [List<String> n] : ( nothing |il= identListMin1 );
    public final List<String> identList() throws RecognitionException {
        List<String> n = null;


        List<String> il =null;


        try {
            // RTL.g:1808:3: ( nothing |il= identListMin1 )
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==EOF||LA126_0==RBRACE||LA126_0==SEMI||(LA126_0 >= 72 && LA126_0 <= 73)) ) {
                alt126=1;
            }
            else if ( (LA126_0==IDENT) ) {
                alt126=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;

            }
            switch (alt126) {
                case 1 :
                    // RTL.g:1809:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_identList7449);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<String>(); }

                    }
                    break;
                case 2 :
                    // RTL.g:1812:3: il= identListMin1
                    {
                    pushFollow(FOLLOW_identListMin1_in_identList7466);
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
    // RTL.g:1820:1: identListMin1 returns [List<String> n] : id= IDENT ( COMMA id= IDENT )* ;
    public final List<String> identListMin1() throws RecognitionException {
        List<String> n = null;


        Token id=null;


          n = new ArrayList<String>();

        try {
            // RTL.g:1824:3: (id= IDENT ( COMMA id= IDENT )* )
            // RTL.g:1825:3: id= IDENT ( COMMA id= IDENT )*
            {
            id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin17500); if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((id!=null?id.getText():null)); }

            // RTL.g:1827:3: ( COMMA id= IDENT )*
            loop127:
            do {
                int alt127=2;
                int LA127_0 = input.LA(1);

                if ( (LA127_0==COMMA) ) {
                    alt127=1;
                }


                switch (alt127) {
            	case 1 :
            	    // RTL.g:1828:5: COMMA id= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_identListMin17514); if (state.failed) return n;

            	    id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin17524); if (state.failed) return n;

            	    if ( state.backtracking==0 ) {
            	        n.add((id!=null?id.getText():null)); }

            	    }
            	    break;

            	default :
            	    break loop127;
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

    // $ANTLR start synpred1_RTL
    public final void synpred1_RTL_fragment() throws RecognitionException {
        // RTL.g:1146:7: ( COLON type EQUAL )
        // RTL.g:1146:8: COLON type EQUAL
        {
        match(input,COLON,FOLLOW_COLON_in_synpred1_RTL5224); if (state.failed) return ;

        pushFollow(FOLLOW_type_in_synpred1_RTL5226);
        type();

        state._fsp--;
        if (state.failed) return ;

        match(input,EQUAL,FOLLOW_EQUAL_in_synpred1_RTL5228); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_RTL

    // $ANTLR start synpred2_RTL
    public final void synpred2_RTL_fragment() throws RecognitionException {
        // RTL.g:1318:5: ( statStartingWithExpr )
        // RTL.g:1318:6: statStartingWithExpr
        {
        pushFollow(FOLLOW_statStartingWithExpr_in_synpred2_RTL5798);
        statStartingWithExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_RTL

    // Delegated rules

    public final boolean synpred1_RTL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_RTL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_RTL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_RTL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA58 dfa58 = new DFA58(this);
    static final String DFA14_eotS =
        "\16\uffff";
    static final String DFA14_eofS =
        "\1\2\15\uffff";
    static final String DFA14_minS =
        "\1\5\1\24\2\uffff\1\32\1\12\1\16\1\24\1\5\1\36\1\16\1\12\1\36\1"+
        "\12";
    static final String DFA14_maxS =
        "\1\113\1\24\2\uffff\1\32\1\45\1\16\1\24\1\113\1\36\1\16\1\45\1\36"+
        "\1\45";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\1\12\uffff";
    static final String DFA14_specialS =
        "\16\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1\16\uffff\1\2\40\uffff\1\2\3\uffff\2\2\6\uffff\1\2\11\uffff"+
            "\1\3",
            "\1\4",
            "",
            "",
            "\1\5",
            "\1\7\11\uffff\1\6\20\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\1\16\uffff\1\2\40\uffff\1\2\3\uffff\2\2\20\uffff\1\3",
            "\1\13",
            "\1\14",
            "\1\7\32\uffff\1\10",
            "\1\15",
            "\1\7\32\uffff\1\10"
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "()* loopback of 249:5: (e= enumTypeDefinition )*";
        }
    }
    static final String DFA16_eotS =
        "\24\uffff";
    static final String DFA16_eofS =
        "\1\1\23\uffff";
    static final String DFA16_minS =
        "\1\5\1\uffff\1\24\1\uffff\1\24\1\uffff\1\32\1\30\1\12\1\uffff\1"+
        "\16\1\24\1\5\1\36\1\16\1\24\1\12\1\36\1\30\1\12";
    static final String DFA16_maxS =
        "\1\101\1\uffff\1\24\1\uffff\1\24\1\uffff\1\32\1\142\1\45\1\uffff"+
        "\1\16\1\24\1\72\1\36\1\16\1\24\1\45\1\36\1\142\1\45";
    static final String DFA16_acceptS =
        "\1\uffff\1\4\1\uffff\1\1\1\uffff\1\3\3\uffff\1\2\12\uffff";
    static final String DFA16_specialS =
        "\24\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\2\16\uffff\1\4\40\uffff\1\3\3\uffff\2\3\6\uffff\1\5",
            "",
            "\1\6",
            "",
            "\1\7",
            "",
            "\1\10",
            "\1\3\42\uffff\1\3\1\uffff\1\11\3\uffff\1\3\7\uffff\1\3\30\uffff"+
            "\1\3",
            "\1\13\11\uffff\1\12\20\uffff\1\14",
            "",
            "\1\15",
            "\1\16",
            "\1\2\16\uffff\1\17\40\uffff\1\3\3\uffff\2\3",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\13\32\uffff\1\14",
            "\1\23",
            "\1\3\42\uffff\1\3\1\uffff\1\11\3\uffff\1\3\7\uffff\1\3\30\uffff"+
            "\1\3",
            "\1\13\32\uffff\1\14"
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "()* loopback of 250:5: ( ( generalClassDefinition[$n] ) | (a= associationDefinition ) | ( 'constraints' (cons= invariant |ppc= prePost )* ) )*";
        }
    }
    static final String DFA41_eotS =
        "\16\uffff";
    static final String DFA41_eofS =
        "\16\uffff";
    static final String DFA41_minS =
        "\1\5\1\uffff\1\24\1\uffff\1\32\1\12\1\16\1\24\1\5\1\36\1\16\1\12"+
        "\1\36\1\12";
    static final String DFA41_maxS =
        "\1\146\1\uffff\1\24\1\uffff\1\32\1\45\1\16\1\24\1\146\1\36\1\16"+
        "\1\45\1\36\1\45";
    static final String DFA41_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\12\uffff";
    static final String DFA41_specialS =
        "\16\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\2\16\uffff\1\1\21\uffff\1\1\32\uffff\1\1\7\uffff\1\1\33\uffff"+
            "\2\3",
            "",
            "\1\4",
            "",
            "\1\5",
            "\1\7\11\uffff\1\6\20\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\2\16\uffff\1\1\120\uffff\2\3",
            "\1\13",
            "\1\14",
            "\1\7\32\uffff\1\10",
            "\1\15",
            "\1\7\32\uffff\1\10"
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "()* loopback of 401:5: (ppc= prePostClause )*";
        }
    }
    static final String DFA53_eotS =
        "\16\uffff";
    static final String DFA53_eofS =
        "\1\1\15\uffff";
    static final String DFA53_minS =
        "\1\5\1\uffff\1\24\1\uffff\1\32\1\12\1\16\1\24\1\5\1\36\1\16\1\12"+
        "\1\36\1\12";
    static final String DFA53_maxS =
        "\1\125\1\uffff\1\24\1\uffff\1\32\1\45\1\16\1\24\1\125\1\36\1\16"+
        "\1\45\1\36\1\45";
    static final String DFA53_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\12\uffff";
    static final String DFA53_specialS =
        "\16\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\2\16\uffff\1\1\40\uffff\1\1\3\uffff\2\1\6\uffff\2\1\11\uffff"+
            "\1\3\10\uffff\1\3",
            "",
            "\1\4",
            "",
            "\1\5",
            "\1\7\11\uffff\1\6\20\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\2\16\uffff\1\1\40\uffff\1\1\3\uffff\2\1\32\uffff\1\3",
            "\1\13",
            "\1\14",
            "\1\7\32\uffff\1\10",
            "\1\15",
            "\1\7\32\uffff\1\10"
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "()* loopback of 505:5: (inv= invariantClause )*";
        }
    }
    static final String DFA58_eotS =
        "\16\uffff";
    static final String DFA58_eofS =
        "\1\1\15\uffff";
    static final String DFA58_minS =
        "\1\5\1\uffff\1\24\1\uffff\1\32\1\12\1\16\1\24\1\5\1\36\1\16\1\12"+
        "\1\36\1\12";
    static final String DFA58_maxS =
        "\1\146\1\uffff\1\24\1\uffff\1\32\1\45\1\16\1\24\1\146\1\36\1\16"+
        "\1\45\1\36\1\45";
    static final String DFA58_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\12\uffff";
    static final String DFA58_specialS =
        "\16\uffff}>";
    static final String[] DFA58_transitionS = {
            "\1\2\16\uffff\1\1\40\uffff\1\1\3\uffff\2\1\6\uffff\2\1\42\uffff"+
            "\2\3",
            "",
            "\1\4",
            "",
            "\1\5",
            "\1\7\11\uffff\1\6\20\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\2\16\uffff\1\1\40\uffff\1\1\3\uffff\2\1\52\uffff\2\3",
            "\1\13",
            "\1\14",
            "\1\7\32\uffff\1\10",
            "\1\15",
            "\1\7\32\uffff\1\10"
    };

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "()+ loopback of 533:5: (ppc= prePostClause )+";
        }
    }
 

    public static final BitSet FOLLOW_107_in_tggRuleCollection65 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_tggRuleCollection69 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_tggRuleDefinition_in_tggRuleCollection81 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_EOF_in_tggRuleCollection92 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_tggRuleDefinition120 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_tggRuleDefinition124 = new BitSet(new long[]{0x8000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_tggRuleDefinition131 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_tggRuleDefinition133 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_tggRuleDefinition142 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleDefinition_in_tggRuleDefinition152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_tggRuleDefinition158 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleDefinition_in_tggRuleDefinition168 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_tggRuleDefinition174 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_corrRuleDefinition_in_tggRuleDefinition184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_tggRuleDefinition190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_ruleDefinition217 = new BitSet(new long[]{0x0000002004100800L});
    public static final BitSet FOLLOW_patternDefinition_in_ruleDefinition229 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_ruleDefinition235 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_LBRACE_in_ruleDefinition238 = new BitSet(new long[]{0x0000000404100800L});
    public static final BitSet FOLLOW_patternDefinition_in_ruleDefinition250 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACE_in_ruleDefinition256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_corrRuleDefinition278 = new BitSet(new long[]{0x0000002004100800L});
    public static final BitSet FOLLOW_corrPatternDefinition_in_corrRuleDefinition290 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_corrRuleDefinition296 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_LBRACE_in_corrRuleDefinition299 = new BitSet(new long[]{0x0000000404100800L});
    public static final BitSet FOLLOW_corrPatternDefinition_in_corrRuleDefinition311 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACE_in_corrRuleDefinition317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectDefinition_in_patternDefinition355 = new BitSet(new long[]{0x0000000004100802L});
    public static final BitSet FOLLOW_linkDefinition_in_patternDefinition369 = new BitSet(new long[]{0x0000000004000802L});
    public static final BitSet FOLLOW_conditionDefinition_in_patternDefinition383 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_objectDefinition_in_corrPatternDefinition417 = new BitSet(new long[]{0x0000000004100802L});
    public static final BitSet FOLLOW_corrLinkDefinition_in_corrPatternDefinition431 = new BitSet(new long[]{0x0000000004100802L});
    public static final BitSet FOLLOW_linkDefinition_in_corrPatternDefinition445 = new BitSet(new long[]{0x0000000004100802L});
    public static final BitSet FOLLOW_IDENT_in_corrPatternDefinition457 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_corrPatternDefinition459 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COND_EXPR_in_corrPatternDefinition461 = new BitSet(new long[]{0x0000000000100802L});
    public static final BitSet FOLLOW_conditionDefinition_in_corrPatternDefinition474 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_IDENT_in_objectDefinition497 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_objectDefinition499 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_objectDefinition504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_linkDefinition523 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_linkDefinition527 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_linkDefinition529 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_linkDefinition533 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_linkDefinition535 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_linkDefinition537 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_linkDefinition542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COND_EXPR_in_conditionDefinition564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_corrLinkDefinition587 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_LPAREN_in_corrLinkDefinition592 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_corrLinkDefinition596 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_corrLinkDefinition598 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_corrLinkDefinition608 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_corrLinkDefinition610 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_LPAREN_in_corrLinkDefinition614 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_corrLinkDefinition618 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_corrLinkDefinition620 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_corrLinkDefinition630 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_corrLinkDefinition632 = new BitSet(new long[]{0x0100000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_56_in_corrLinkDefinition635 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_corrLinkDefinition637 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_corrLinkDefinition641 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_corrLinkDefinition643 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_corrLinkDefinition647 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_corrLinkDefinition649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_corrLinkDefinition656 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_corrLinkDefinition660 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_corrLinkDefinition662 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_corrLinkDefinition666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_model697 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_model703 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_model707 = new BitSet(new long[]{0x0620000000100020L,0x0000000000000802L});
    public static final BitSet FOLLOW_enumTypeDefinition_in_model719 = new BitSet(new long[]{0x0620000000100020L,0x0000000000000802L});
    public static final BitSet FOLLOW_generalClassDefinition_in_model736 = new BitSet(new long[]{0x0620000000100020L,0x0000000000000002L});
    public static final BitSet FOLLOW_associationDefinition_in_model753 = new BitSet(new long[]{0x0620000000100020L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_model769 = new BitSet(new long[]{0x0620000000100020L,0x0000000000000006L});
    public static final BitSet FOLLOW_invariant_in_model787 = new BitSet(new long[]{0x0620000000100020L,0x0000000000000006L});
    public static final BitSet FOLLOW_prePost_in_model808 = new BitSet(new long[]{0x0620000000100020L,0x0000000000000006L});
    public static final BitSet FOLLOW_EOF_in_model849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_enumTypeDefinition877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_enumTypeDefinition883 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_enumTypeDefinition887 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_LBRACE_in_enumTypeDefinition889 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_idList_in_enumTypeDefinition893 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACE_in_enumTypeDefinition895 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_SEMI_in_enumTypeDefinition899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_generalClassDefinition937 = new BitSet(new long[]{0x0620000000100000L});
    public static final BitSet FOLLOW_53_in_generalClassDefinition945 = new BitSet(new long[]{0x0600000000100000L});
    public static final BitSet FOLLOW_classDefinition_in_generalClassDefinition963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_associationClassDefinition_in_generalClassDefinition983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyClass_in_classDefinition1022 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_classDefinition1026 = new BitSet(new long[]{0x0800000001000000L,0x0000000400000202L});
    public static final BitSet FOLLOW_LESS_in_classDefinition1036 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_idList_in_classDefinition1040 = new BitSet(new long[]{0x0800000000000000L,0x0000000400000202L});
    public static final BitSet FOLLOW_59_in_classDefinition1053 = new BitSet(new long[]{0x0000000000100020L,0x0000000400000202L});
    public static final BitSet FOLLOW_attributeDefinition_in_classDefinition1066 = new BitSet(new long[]{0x0000000000100020L,0x0000000400000202L});
    public static final BitSet FOLLOW_98_in_classDefinition1087 = new BitSet(new long[]{0x0000000000100020L,0x0000000000000202L});
    public static final BitSet FOLLOW_operationDefinition_in_classDefinition1100 = new BitSet(new long[]{0x0000000000100020L,0x0000000000000202L});
    public static final BitSet FOLLOW_65_in_classDefinition1121 = new BitSet(new long[]{0x0000000000000020L,0x0000000000201200L});
    public static final BitSet FOLLOW_invariantClause_in_classDefinition1141 = new BitSet(new long[]{0x0000000000000020L,0x0000000000201200L});
    public static final BitSet FOLLOW_73_in_classDefinition1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_associationClassDefinition1198 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_associationClassDefinition1224 = new BitSet(new long[]{0x2800000001100000L,0x0000000400000202L});
    public static final BitSet FOLLOW_LESS_in_associationClassDefinition1234 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_idList_in_associationClassDefinition1238 = new BitSet(new long[]{0x2800000000100000L,0x0000000400000202L});
    public static final BitSet FOLLOW_61_in_associationClassDefinition1250 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_associationEnd_in_associationClassDefinition1258 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_associationEnd_in_associationClassDefinition1270 = new BitSet(new long[]{0x0800000000100020L,0x0000000400000202L});
    public static final BitSet FOLLOW_59_in_associationClassDefinition1290 = new BitSet(new long[]{0x0000000000100020L,0x0000000400000202L});
    public static final BitSet FOLLOW_attributeDefinition_in_associationClassDefinition1303 = new BitSet(new long[]{0x0000000000100020L,0x0000000400000202L});
    public static final BitSet FOLLOW_98_in_associationClassDefinition1324 = new BitSet(new long[]{0x0000000000100020L,0x0000000000000202L});
    public static final BitSet FOLLOW_operationDefinition_in_associationClassDefinition1337 = new BitSet(new long[]{0x0000000000100020L,0x0000000000000202L});
    public static final BitSet FOLLOW_65_in_associationClassDefinition1358 = new BitSet(new long[]{0x0000000000100020L,0x0000000000201200L});
    public static final BitSet FOLLOW_invariantClause_in_associationClassDefinition1378 = new BitSet(new long[]{0x0000000000100020L,0x0000000000201200L});
    public static final BitSet FOLLOW_keyAggregation_in_associationClassDefinition1414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_keyComposition_in_associationClassDefinition1418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_associationClassDefinition1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_attributeDefinition1469 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_attributeDefinition1477 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_attributeDefinition1479 = new BitSet(new long[]{0x000F600000100000L});
    public static final BitSet FOLLOW_type_in_attributeDefinition1483 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_SEMI_in_attributeDefinition1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_operationDefinition1524 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_operationDefinition1534 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_paramList_in_operationDefinition1544 = new BitSet(new long[]{0x10000040000040A2L,0x0000006000000000L});
    public static final BitSet FOLLOW_COLON_in_operationDefinition1558 = new BitSet(new long[]{0x000F600000100000L});
    public static final BitSet FOLLOW_type_in_operationDefinition1564 = new BitSet(new long[]{0x1000004000004022L,0x0000006000000000L});
    public static final BitSet FOLLOW_EQUAL_in_operationDefinition1592 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_expression_in_operationDefinition1598 = new BitSet(new long[]{0x0000004000000022L,0x0000006000000000L});
    public static final BitSet FOLLOW_blockStat_in_operationDefinition1620 = new BitSet(new long[]{0x0000004000000022L,0x0000006000000000L});
    public static final BitSet FOLLOW_prePostClause_in_operationDefinition1642 = new BitSet(new long[]{0x0000004000000022L,0x0000006000000000L});
    public static final BitSet FOLLOW_SEMI_in_operationDefinition1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_associationDefinition1686 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_keyAssociation_in_associationDefinition1700 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_keyAggregation_in_associationDefinition1704 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_keyComposition_in_associationDefinition1708 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_associationDefinition1718 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_associationDefinition1726 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_associationEnd_in_associationDefinition1734 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_associationEnd_in_associationDefinition1746 = new BitSet(new long[]{0x0000000000100020L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_associationDefinition1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_associationEnd1782 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd1790 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LBRACK_in_associationEnd1792 = new BitSet(new long[]{0x0000020000200000L});
    public static final BitSet FOLLOW_multiplicity_in_associationEnd1796 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RBRACK_in_associationEnd1798 = new BitSet(new long[]{0x0000004000100002L,0x0000029000000000L});
    public static final BitSet FOLLOW_keyRole_in_associationEnd1809 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd1813 = new BitSet(new long[]{0x0000004000100002L,0x0000029000000000L});
    public static final BitSet FOLLOW_100_in_associationEnd1834 = new BitSet(new long[]{0x0000004000100002L,0x0000029000000000L});
    public static final BitSet FOLLOW_105_in_associationEnd1846 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd1850 = new BitSet(new long[]{0x0000004000100002L,0x0000029000000000L});
    public static final BitSet FOLLOW_keyUnion_in_associationEnd1862 = new BitSet(new long[]{0x0000004000100002L,0x0000029000000000L});
    public static final BitSet FOLLOW_103_in_associationEnd1874 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd1878 = new BitSet(new long[]{0x0000004000100002L,0x0000029000000000L});
    public static final BitSet FOLLOW_keyDerived_in_associationEnd1890 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_EQUAL_in_associationEnd1892 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_expression_in_associationEnd1896 = new BitSet(new long[]{0x0000004000100002L,0x0000029000000000L});
    public static final BitSet FOLLOW_keyQualifier_in_associationEnd1908 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_paramList_in_associationEnd1914 = new BitSet(new long[]{0x0000004000100002L,0x0000029000000000L});
    public static final BitSet FOLLOW_SEMI_in_associationEnd1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicityRange_in_multiplicity1966 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_multiplicity1976 = new BitSet(new long[]{0x0000020000200000L});
    public static final BitSet FOLLOW_multiplicityRange_in_multiplicity1980 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_multiplicitySpec_in_multiplicityRange2009 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_DOTDOT_in_multiplicityRange2019 = new BitSet(new long[]{0x0000020000200000L});
    public static final BitSet FOLLOW_multiplicitySpec_in_multiplicityRange2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_multiplicitySpec2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_multiplicitySpec2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_invariant2108 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_invariant2118 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_COMMA_in_invariant2131 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_invariant2135 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_COLON_in_invariant2143 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_simpleType_in_invariant2155 = new BitSet(new long[]{0x0000000000000022L,0x0000000000201000L});
    public static final BitSet FOLLOW_invariantClause_in_invariant2167 = new BitSet(new long[]{0x0000000000000022L,0x0000000000201000L});
    public static final BitSet FOLLOW_annotationSet_in_invariantClause2197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_invariantClause2205 = new BitSet(new long[]{0x0000000000100080L});
    public static final BitSet FOLLOW_IDENT_in_invariantClause2211 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_invariantClause2216 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_expression_in_invariantClause2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_invariantClause2237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_invariantClause2239 = new BitSet(new long[]{0x0000000000100080L});
    public static final BitSet FOLLOW_IDENT_in_invariantClause2245 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_invariantClause2250 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_expression_in_invariantClause2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_prePost2287 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_prePost2291 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_prePost2293 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_prePost2297 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_paramList_in_prePost2301 = new BitSet(new long[]{0x00000000000000A0L,0x0000006000000000L});
    public static final BitSet FOLLOW_COLON_in_prePost2305 = new BitSet(new long[]{0x000F600000100000L});
    public static final BitSet FOLLOW_type_in_prePost2309 = new BitSet(new long[]{0x0000000000000020L,0x0000006000000000L});
    public static final BitSet FOLLOW_prePostClause_in_prePost2328 = new BitSet(new long[]{0x0000000000000022L,0x0000006000000000L});
    public static final BitSet FOLLOW_annotationSet_in_prePostClause2362 = new BitSet(new long[]{0x0000000000000000L,0x0000006000000000L});
    public static final BitSet FOLLOW_set_in_prePostClause2374 = new BitSet(new long[]{0x0000000000100080L});
    public static final BitSet FOLLOW_IDENT_in_prePostClause2389 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_prePostClause2394 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_expression_in_prePostClause2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_annotationSet2425 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_annotation2444 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_annotation2448 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_annotation2454 = new BitSet(new long[]{0x0000002000100400L});
    public static final BitSet FOLLOW_annotationValues_in_annotation2463 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_annotation2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationValue_in_annotationValues2491 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_annotationValues2499 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_annotationValue_in_annotationValues2503 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_annotationValue2522 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_EQUAL_in_annotationValue2527 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_NON_OCL_STRING_in_annotationValue2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyUnion2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyAssociation2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyRole2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyComposition2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyAggregation2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyClass2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyDerived2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyQualifier2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionOnly2665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expressionOnly2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_expression2715 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_expression2719 = new BitSet(new long[]{0x0000000000004080L});
    public static final BitSet FOLLOW_COLON_in_expression2723 = new BitSet(new long[]{0x000F600000100000L});
    public static final BitSet FOLLOW_type_in_expression2727 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_EQUAL_in_expression2732 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_expression_in_expression2736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_expression2738 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_paramList2796 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList2813 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_paramList2825 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList2829 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_RPAREN_in_paramList2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList2878 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_idList2888 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_idList2892 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaration2923 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration2925 = new BitSet(new long[]{0x000F600000100000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression2965 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_conditionalImpliesExpression2978 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8412000L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression2982 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression3027 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_conditionalOrExpression3040 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8412000L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression3044 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression3088 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_conditionalXOrExpression3101 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8412000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression3105 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression3149 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_conditionalAndExpression3162 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8412000L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression3166 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression3214 = new BitSet(new long[]{0x0000000080004002L});
    public static final BitSet FOLLOW_set_in_equalityExpression3233 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8412000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression3243 = new BitSet(new long[]{0x0000000080004002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression3292 = new BitSet(new long[]{0x0000000003030002L});
    public static final BitSet FOLLOW_set_in_relationalExpression3310 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8412000L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression3328 = new BitSet(new long[]{0x0000000003030002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression3378 = new BitSet(new long[]{0x0000000108000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression3396 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8412000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression3406 = new BitSet(new long[]{0x0000000108000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression3456 = new BitSet(new long[]{0x0000028000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression3474 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8412000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression3488 = new BitSet(new long[]{0x0000028000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_set_in_unaryExpression3550 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8412000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression3594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression3627 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_ARROW_in_postfixExpression3645 = new BitSet(new long[]{0x0000000000100000L,0x00000001A0400000L});
    public static final BitSet FOLLOW_DOT_in_postfixExpression3651 = new BitSet(new long[]{0x0000000000100000L,0x00000001A0400000L});
    public static final BitSet FOLLOW_propertyCall_in_postfixExpression3662 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_literal_in_primaryExpression3702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectReference_in_primaryExpression3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_primaryExpression3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression3739 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_expression_in_primaryExpression3743 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_primaryExpression3757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression3769 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression3771 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_primaryExpression3773 = new BitSet(new long[]{0x0000000004000022L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression3777 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression3779 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression3800 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_primaryExpression3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_objectReference3829 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_objectReference3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpression_in_propertyCall3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpression_in_propertyCall3915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationExpression_in_propertyCall3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeExpression_in_propertyCall3941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpression3976 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_queryExpression3983 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression3994 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_queryExpression3998 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_expression_in_queryExpression4009 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_queryExpression4015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_iterateExpression4047 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpression4053 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression4061 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_SEMI_in_iterateExpression4063 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_variableInitialization_in_iterateExpression4071 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_iterateExpression4073 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_expression_in_iterateExpression4081 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpression4087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_operationExpression4131 = new BitSet(new long[]{0x0000000004800022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression4153 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_expression_in_operationExpression4166 = new BitSet(new long[]{0x0000000800000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression4179 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_expression_in_operationExpression4183 = new BitSet(new long[]{0x0000000800000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression4195 = new BitSet(new long[]{0x0000000004800022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression4212 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_expression_in_operationExpression4227 = new BitSet(new long[]{0x0000000800000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression4242 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_expression_in_operationExpression4246 = new BitSet(new long[]{0x0000000800000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression4260 = new BitSet(new long[]{0x0000000004000022L});
    public static final BitSet FOLLOW_AT_in_operationExpression4285 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_operationExpression4287 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_LPAREN_in_operationExpression4312 = new BitSet(new long[]{0x001F64310C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_expression_in_operationExpression4333 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression4345 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_expression_in_operationExpression4349 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_RPAREN_in_operationExpression4369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeExpression4418 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeExpression4434 = new BitSet(new long[]{0x000F600000100000L});
    public static final BitSet FOLLOW_type_in_typeExpression4438 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeExpression4440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration4478 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration4481 = new BitSet(new long[]{0x000F600000100000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration4485 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration4495 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration4501 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration4504 = new BitSet(new long[]{0x000F600000100000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration4510 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableInitialization4538 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableInitialization4540 = new BitSet(new long[]{0x000F600000100000L});
    public static final BitSet FOLLOW_type_in_variableInitialization4544 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_EQUAL_in_variableInitialization4546 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_expression_in_variableInitialization4550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ifExpression4582 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_expression_in_ifExpression4586 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_ifExpression4588 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_expression_in_ifExpression4592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ifExpression4594 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_expression_in_ifExpression4598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ifExpression4600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_literal4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_literal4653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal4666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_literal4681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal4705 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_literal4709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_literal4721 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_literal4723 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_literal4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteral_in_literal4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal4751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefinedLiteral_in_literal4763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleLiteral_in_literal4775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionLiteral4813 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_LBRACE_in_collectionLiteral4842 = new BitSet(new long[]{0x001F64150C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral4859 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_collectionLiteral4872 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral4876 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACE_in_collectionLiteral4895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_collectionItem4924 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_DOTDOT_in_collectionItem4935 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_expression_in_collectionItem4939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_emptyCollectionLiteral4968 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral4970 = new BitSet(new long[]{0x0007600000000000L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral4974 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral4976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral4992 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral4994 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral4996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_undefinedLiteral5026 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral5028 = new BitSet(new long[]{0x000F600000100000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral5032 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral5034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_undefinedLiteral5048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_undefinedLiteral5062 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral5064 = new BitSet(new long[]{0x000F600000100000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral5068 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral5070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_undefinedLiteral5084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_tupleLiteral5123 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_LBRACE_in_tupleLiteral5129 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral5137 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleLiteral5148 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral5152 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACE_in_tupleLiteral5163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tupleItem5194 = new BitSet(new long[]{0x0000000000004080L});
    public static final BitSet FOLLOW_COLON_in_tupleItem5233 = new BitSet(new long[]{0x000F600000100000L});
    public static final BitSet FOLLOW_type_in_tupleItem5237 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_EQUAL_in_tupleItem5239 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_expression_in_tupleItem5243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tupleItem5265 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_expression_in_tupleItem5275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type5341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type5353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleType_in_type5365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeOnly5397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_typeOnly5399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleType5427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType5465 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType5492 = new BitSet(new long[]{0x000F600000100000L});
    public static final BitSet FOLLOW_type_in_collectionType5496 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType5498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_tupleType5532 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_tupleType5534 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType5543 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleType5554 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType5558 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_RPAREN_in_tupleType5570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tuplePart5602 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_tuplePart5604 = new BitSet(new long[]{0x000F600000100000L});
    public static final BitSet FOLLOW_type_in_tuplePart5608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOnly5657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_statOnly5661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nextStat_in_stat5692 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_SEMI_in_stat5703 = new BitSet(new long[]{0x101F64110C340020L,0x00003003FCC96030L});
    public static final BitSet FOLLOW_nextStat_in_stat5709 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_singleStat_in_nextStat5743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStat_in_singleStat5780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_singleStat5806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAssignStat_in_singleStat5818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_singleStat5832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objDestroyStat_in_singleStat5846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkInsStat_in_singleStat5859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkDelStat_in_singleStat5876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExStat_in_singleStat5893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterStat_in_singleStat5910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStat_in_singleStat5932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStat_in_singleStat5950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_emptyStat5977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_statStartingWithExpr6003 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_attAssignStat_in_statStartingWithExpr6017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varAssignStat6055 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_varAssignStat6059 = new BitSet(new long[]{0x001F64110C340020L,0x00001003FCC12000L});
    public static final BitSet FOLLOW_rValue_in_varAssignStat6067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_attAssignStat6098 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_attAssignStat6107 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_attAssignStat6111 = new BitSet(new long[]{0x001F64110C340020L,0x00001003FCC12000L});
    public static final BitSet FOLLOW_rValue_in_attAssignStat6119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_objCreateStat6145 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_simpleType_in_objCreateStat6153 = new BitSet(new long[]{0x2000000004000002L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat6163 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_inSoilExpression_in_objCreateStat6175 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat6181 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_objCreateStat6199 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat6207 = new BitSet(new long[]{0x001F64110C340020L,0x00001003FCC12000L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat6221 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat6229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_objDestroyStat6265 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_exprListMin1_in_objDestroyStat6273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_lnkInsStat6299 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkInsStat6303 = new BitSet(new long[]{0x001F64110C340020L,0x00001003FCC12000L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat6313 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkInsStat6317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_lnkInsStat6321 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_lnkInsStat6329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers6358 = new BitSet(new long[]{0x0000000000400400L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers6369 = new BitSet(new long[]{0x001F64110C340020L,0x00001003FCC12000L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers6378 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers6385 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers6401 = new BitSet(new long[]{0x001F64110C340020L,0x00001003FCC12000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers6412 = new BitSet(new long[]{0x0000000000400402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers6423 = new BitSet(new long[]{0x001F64110C340020L,0x00001003FCC12000L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers6432 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers6439 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers6461 = new BitSet(new long[]{0x001F64110C340020L,0x00001003FCC12000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers6476 = new BitSet(new long[]{0x0000000000400402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers6496 = new BitSet(new long[]{0x001F64110C340020L,0x00001003FCC12000L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers6507 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers6516 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_68_in_lnkDelStat6557 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkDelStat6561 = new BitSet(new long[]{0x001F64110C340020L,0x00001003FCC12000L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat6571 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkDelStat6575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_lnkDelStat6579 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_lnkDelStat6588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_condExStat6619 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_inSoilExpression_in_condExStat6628 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_condExStat6632 = new BitSet(new long[]{0x101F64110C340020L,0x00003003FCC96038L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat6641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_72_in_condExStat6652 = new BitSet(new long[]{0x101F64110C340020L,0x00003003FCC96038L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat6664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_condExStat6676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_iterStat6701 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_iterStat6709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_iterStat6713 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_inSoilExpression_in_iterStat6721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_iterStat6725 = new BitSet(new long[]{0x101F64110C340020L,0x00003003FCC96038L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_iterStat6733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_iterStat6738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_whileStat6764 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_inSoilExpression_in_whileStat6772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_whileStat6776 = new BitSet(new long[]{0x101F64110C340020L,0x00003003FCC96038L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_whileStat6784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_whileStat6789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_blockStat6819 = new BitSet(new long[]{0x101F64110C340020L,0x00003003FCC96038L});
    public static final BitSet FOLLOW_67_in_blockStat6824 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat6830 = new BitSet(new long[]{0x0000004000000400L});
    public static final BitSet FOLLOW_COMMA_in_blockStat6836 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat6842 = new BitSet(new long[]{0x0000004000000400L});
    public static final BitSet FOLLOW_SEMI_in_blockStat6849 = new BitSet(new long[]{0x101F64110C340020L,0x00003003FCC96030L});
    public static final BitSet FOLLOW_stat_in_blockStat6859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_blockStat6864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_implicitBlockStat6890 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat6896 = new BitSet(new long[]{0x0000004000000400L});
    public static final BitSet FOLLOW_COMMA_in_implicitBlockStat6902 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat6908 = new BitSet(new long[]{0x0000004000000400L});
    public static final BitSet FOLLOW_SEMI_in_implicitBlockStat6915 = new BitSet(new long[]{0x101F64110C340020L,0x00003003FCC96030L});
    public static final BitSet FOLLOW_stat_in_implicitBlockStat6923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOrImplicitBlock6946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicitBlockStat_in_statOrImplicitBlock6956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_rValue7002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_rValue7014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_rValList7037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValListMin1_in_rValList7064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin17097 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin17111 = new BitSet(new long[]{0x001F64110C340020L,0x00001003FCC12000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin17121 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rValue_in_rValListMin27160 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin27168 = new BitSet(new long[]{0x001F64110C340020L,0x00001003FCC12000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin27176 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin27190 = new BitSet(new long[]{0x001F64110C340020L,0x00001003FCC12000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin27200 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_expression_in_inSoilExpression7234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_exprList7263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprListMin1_in_exprList7281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin17314 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin17329 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin17339 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin27379 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin27387 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin27395 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin27409 = new BitSet(new long[]{0x001F64110C340020L,0x00001003F8C12000L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin27419 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_nothing_in_identList7449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identListMin1_in_identList7466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identListMin17500 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_identListMin17514 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDENT_in_identListMin17524 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COLON_in_synpred1_RTL5224 = new BitSet(new long[]{0x000F600000100000L});
    public static final BitSet FOLLOW_type_in_synpred1_RTL5226 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_EQUAL_in_synpred1_RTL5228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_synpred2_RTL5798 = new BitSet(new long[]{0x0000000000000002L});

}