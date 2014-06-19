// $ANTLR 3.4 Soil.g 2013-03-09 16:24:44

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
 
package org.tzi.use.parser.soil;

import org.tzi.use.parser.base.BaseParser;
import org.tzi.use.parser.use.*;
import org.tzi.use.parser.ocl.*;
import org.tzi.use.parser.soil.ast.*;

import java.util.Collections;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SoilParser extends BaseParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "BAR", "COLON", "COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "EQUAL", "ESC", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "INT", "LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MINUS", "ML_COMMENT", "NEWLINE", "NON_OCL_STRING", "NOT_EQUAL", "PLUS", "RANGE_OR_INT", "RBRACE", "RBRACK", "REAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "STRING", "VOCAB", "WS", "'Bag'", "'Collection'", "'OrderedSet'", "'Sequence'", "'Set'", "'Tuple'", "'Undefined'", "'allInstances'", "'and'", "'begin'", "'between'", "'declare'", "'delete'", "'destroy'", "'div'", "'do'", "'else'", "'end'", "'endif'", "'false'", "'for'", "'from'", "'if'", "'implies'", "'in'", "'insert'", "'into'", "'iterate'", "'let'", "'new'", "'not'", "'null'", "'oclAsType'", "'oclEmpty'", "'oclIsKindOf'", "'oclIsTypeOf'", "'oclUndefined'", "'or'", "'pre'", "'then'", "'true'", "'while'", "'xor'"
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


    public SoilParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SoilParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return SoilParser.tokenNames; }
    public String getGrammarFileName() { return "Soil.g"; }



    // $ANTLR start "statOnly"
    // Soil.g:116:1: statOnly returns [ASTStatement n] : s= stat EOF ;
    public final ASTStatement statOnly() throws RecognitionException {
        ASTStatement n = null;


        SoilParser.stat_return s =null;


        try {
            // Soil.g:117:3: (s= stat EOF )
            // Soil.g:118:3: s= stat EOF
            {
            pushFollow(FOLLOW_stat_in_statOnly76);
            s=stat();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_statOnly80); if (state.failed) return n;

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
    // Soil.g:128:1: stat returns [ASTStatement n] : nextStat[seq] ( SEMI nextStat[seq] )* ;
    public final SoilParser.stat_return stat() throws RecognitionException {
        SoilParser.stat_return retval = new SoilParser.stat_return();
        retval.start = input.LT(1);



          ASTSequenceStatement seq = new ASTSequenceStatement();

        try {
            // Soil.g:132:3: ( nextStat[seq] ( SEMI nextStat[seq] )* )
            // Soil.g:133:3: nextStat[seq] ( SEMI nextStat[seq] )*
            {
            pushFollow(FOLLOW_nextStat_in_stat111);
            nextStat(seq);

            state._fsp--;
            if (state.failed) return retval;

            // Soil.g:134:3: ( SEMI nextStat[seq] )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==SEMI) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Soil.g:135:5: SEMI nextStat[seq]
            	    {
            	    match(input,SEMI,FOLLOW_SEMI_in_stat122); if (state.failed) return retval;

            	    pushFollow(FOLLOW_nextStat_in_stat128);
            	    nextStat(seq);

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop1;
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
    // Soil.g:151:1: nextStat[ASTSequenceStatement seq] : s= singleStat ;
    public final SoilParser.nextStat_return nextStat(ASTSequenceStatement seq) throws RecognitionException {
        SoilParser.nextStat_return retval = new SoilParser.nextStat_return();
        retval.start = input.LT(1);


        ASTStatement s =null;


        try {
            // Soil.g:152:3: (s= singleStat )
            // Soil.g:153:3: s= singleStat
            {
            pushFollow(FOLLOW_singleStat_in_nextStat162);
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
    // Soil.g:165:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat );
    public final ASTStatement singleStat() throws RecognitionException {
        ASTStatement n = null;


        ASTEmptyStatement emp =null;

        ASTStatement sse =null;

        ASTStatement vas =null;

        ASTStatement ocs =null;

        SoilParser.objDestroyStat_return ods =null;

        ASTLinkInsertionStatement lis =null;

        ASTLinkDeletionStatement lds =null;

        ASTConditionalExecutionStatement ces =null;

        ASTIterationStatement its =null;

        ASTWhileStatement whs =null;

        ASTBlockStatement blk =null;


        try {
            // Soil.g:169:5: (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat )
            int alt2=11;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==EOF||LA2_0==SEMI||(LA2_0 >= 60 && LA2_0 <= 61)) ) {
                alt2=1;
            }
            else if ( (LA2_0==72) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==MINUS||LA2_0==PLUS||LA2_0==74) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==84) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==63) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==INT) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==REAL) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==STRING) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==HASH) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==IDENT) ) {
                int LA2_13 = input.LA(2);

                if ( (synpred1_Soil()) ) {
                    alt2=2;
                }
                else if ( (true) ) {
                    alt2=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 13, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==44||(LA2_0 >= 46 && LA2_0 <= 48)) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==77) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==45) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==80) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==50) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==75) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==49) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==AT) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==71) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==76||(LA2_0 >= 78 && LA2_0 <= 79)) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==LPAREN) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==66) ) {
                int LA2_25 = input.LA(2);

                if ( (synpred1_Soil()) ) {
                    alt2=2;
                }
                else if ( (true) ) {
                    alt2=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 25, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==73) ) {
                alt2=4;
            }
            else if ( (LA2_0==57) ) {
                alt2=5;
            }
            else if ( (LA2_0==69) ) {
                alt2=6;
            }
            else if ( (LA2_0==56) ) {
                alt2=7;
            }
            else if ( (LA2_0==64) ) {
                alt2=9;
            }
            else if ( (LA2_0==85) ) {
                alt2=10;
            }
            else if ( (LA2_0==53) ) {
                alt2=11;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // Soil.g:170:5: emp= emptyStat
                    {
                    pushFollow(FOLLOW_emptyStat_in_singleStat199);
                    emp=emptyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = emp; }

                    }
                    break;
                case 2 :
                    // Soil.g:172:5: ( statStartingWithExpr )=>sse= statStartingWithExpr
                    {
                    pushFollow(FOLLOW_statStartingWithExpr_in_singleStat225);
                    sse=statStartingWithExpr();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = sse; }

                    }
                    break;
                case 3 :
                    // Soil.g:173:5: vas= varAssignStat
                    {
                    pushFollow(FOLLOW_varAssignStat_in_singleStat237);
                    vas=varAssignStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = vas; }

                    }
                    break;
                case 4 :
                    // Soil.g:174:5: ocs= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_singleStat251);
                    ocs=objCreateStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = ocs; }

                    }
                    break;
                case 5 :
                    // Soil.g:175:5: ods= objDestroyStat
                    {
                    pushFollow(FOLLOW_objDestroyStat_in_singleStat265);
                    ods=objDestroyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ods!=null?ods.n:null); }

                    }
                    break;
                case 6 :
                    // Soil.g:176:5: lis= lnkInsStat
                    {
                    pushFollow(FOLLOW_lnkInsStat_in_singleStat278);
                    lis=lnkInsStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = lis; }

                    }
                    break;
                case 7 :
                    // Soil.g:177:5: lds= lnkDelStat
                    {
                    pushFollow(FOLLOW_lnkDelStat_in_singleStat295);
                    lds=lnkDelStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = lds; }

                    }
                    break;
                case 8 :
                    // Soil.g:178:5: ces= condExStat
                    {
                    pushFollow(FOLLOW_condExStat_in_singleStat312);
                    ces=condExStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = ces; }

                    }
                    break;
                case 9 :
                    // Soil.g:179:5: its= iterStat
                    {
                    pushFollow(FOLLOW_iterStat_in_singleStat329);
                    its=iterStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = its; }

                    }
                    break;
                case 10 :
                    // Soil.g:181:5: whs= whileStat
                    {
                    pushFollow(FOLLOW_whileStat_in_singleStat351);
                    whs=whileStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = whs; }

                    }
                    break;
                case 11 :
                    // Soil.g:182:5: blk= blockStat
                    {
                    pushFollow(FOLLOW_blockStat_in_singleStat369);
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
    // Soil.g:189:1: emptyStat returns [ASTEmptyStatement n] : nothing ;
    public final ASTEmptyStatement emptyStat() throws RecognitionException {
        ASTEmptyStatement n = null;


        try {
            // Soil.g:190:3: ( nothing )
            // Soil.g:191:3: nothing
            {
            pushFollow(FOLLOW_nothing_in_emptyStat396);
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
    // Soil.g:196:1: statStartingWithExpr returns [ASTStatement n] : expr= inSoilExpression (aas= attAssignStat[$expr.n] )? ;
    public final ASTStatement statStartingWithExpr() throws RecognitionException {
        ASTStatement n = null;


        ASTExpression expr =null;

        ASTAttributeAssignmentStatement aas =null;


        try {
            // Soil.g:197:3: (expr= inSoilExpression (aas= attAssignStat[$expr.n] )? )
            // Soil.g:198:3: expr= inSoilExpression (aas= attAssignStat[$expr.n] )?
            {
            pushFollow(FOLLOW_inSoilExpression_in_statStartingWithExpr422);
            expr=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            // Soil.g:199:3: (aas= attAssignStat[$expr.n] )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==DOT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // Soil.g:200:5: aas= attAssignStat[$expr.n]
                    {
                    pushFollow(FOLLOW_attAssignStat_in_statStartingWithExpr436);
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
    // Soil.g:212:1: varAssignStat returns [ASTStatement n] : varName= IDENT COLON_EQUAL rVal= rValue ;
    public final ASTStatement varAssignStat() throws RecognitionException {
        ASTStatement n = null;


        Token varName=null;
        SoilParser.rValue_return rVal =null;


        try {
            // Soil.g:213:3: (varName= IDENT COLON_EQUAL rVal= rValue )
            // Soil.g:214:3: varName= IDENT COLON_EQUAL rVal= rValue
            {
            varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_varAssignStat474); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_varAssignStat478); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_varAssignStat486);
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
    // Soil.g:282:1: attAssignStat[ASTExpression exp] returns [ASTAttributeAssignmentStatement n] : DOT attName= IDENT COLON_EQUAL r= rValue ;
    public final ASTAttributeAssignmentStatement attAssignStat(ASTExpression exp) throws RecognitionException {
        ASTAttributeAssignmentStatement n = null;


        Token attName=null;
        SoilParser.rValue_return r =null;


        try {
            // Soil.g:283:3: ( DOT attName= IDENT COLON_EQUAL r= rValue )
            // Soil.g:284:3: DOT attName= IDENT COLON_EQUAL r= rValue
            {
            match(input,DOT,FOLLOW_DOT_in_attAssignStat517); if (state.failed) return n;

            attName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attAssignStat526); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attAssignStat530); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_attAssignStat538);
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
    // Soil.g:296:1: objCreateStat returns [ASTStatement n] : 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? ;
    public final ASTStatement objCreateStat() throws RecognitionException {
        ASTStatement n = null;


        ASTSimpleType ident =null;

        ASTExpression objName =null;

        SoilParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // Soil.g:297:3: ( 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? )
            // Soil.g:298:3: 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            {
            match(input,73,FOLLOW_73_in_objCreateStat564); if (state.failed) return n;

            pushFollow(FOLLOW_simpleType_in_objCreateStat572);
            ident=simpleType();

            state._fsp--;
            if (state.failed) return n;

            // Soil.g:300:3: ( LPAREN objName= inSoilExpression RPAREN )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==LPAREN) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Soil.g:301:5: LPAREN objName= inSoilExpression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat582); if (state.failed) return n;

                    pushFollow(FOLLOW_inSoilExpression_in_objCreateStat594);
                    objName=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat600); if (state.failed) return n;

                    }
                    break;

            }


            // Soil.g:306:3: ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==54) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Soil.g:307:5: 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN
                    {
                    match(input,54,FOLLOW_54_in_objCreateStat618); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat626); if (state.failed) return n;

                    pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat640);
                    p=rValListMin2WithOptionalQualifiers();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat648); if (state.failed) return n;

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
    // Soil.g:326:1: objDestroyStat returns [ASTStatement n] : 'destroy' el= exprListMin1 ;
    public final SoilParser.objDestroyStat_return objDestroyStat() throws RecognitionException {
        SoilParser.objDestroyStat_return retval = new SoilParser.objDestroyStat_return();
        retval.start = input.LT(1);


        List<ASTExpression> el =null;


        try {
            // Soil.g:327:3: ( 'destroy' el= exprListMin1 )
            // Soil.g:328:3: 'destroy' el= exprListMin1
            {
            match(input,57,FOLLOW_57_in_objDestroyStat684); if (state.failed) return retval;

            pushFollow(FOLLOW_exprListMin1_in_objDestroyStat692);
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
    // Soil.g:349:1: lnkInsStat returns [ASTLinkInsertionStatement n] : 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT ;
    public final ASTLinkInsertionStatement lnkInsStat() throws RecognitionException {
        ASTLinkInsertionStatement n = null;


        Token ass=null;
        SoilParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // Soil.g:350:3: ( 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT )
            // Soil.g:351:3: 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT
            {
            match(input,69,FOLLOW_69_in_lnkInsStat718); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkInsStat722); if (state.failed) return n;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat732);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkInsStat736); if (state.failed) return n;

            match(input,70,FOLLOW_70_in_lnkInsStat740); if (state.failed) return n;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkInsStat748); if (state.failed) return n;

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
    // Soil.g:361:1: rValListMin2WithOptionalQualifiers returns [List<ASTRValue> participans, List<List<ASTRValue>> qualifiers] : r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* ;
    public final SoilParser.rValListMin2WithOptionalQualifiers_return rValListMin2WithOptionalQualifiers() throws RecognitionException {
        SoilParser.rValListMin2WithOptionalQualifiers_return retval = new SoilParser.rValListMin2WithOptionalQualifiers_return();
        retval.start = input.LT(1);


        SoilParser.rValue_return r =null;

        List<ASTRValue> qualifierValues =null;



          retval.participans = new ArrayList<ASTRValue>();
          retval.qualifiers = new ArrayList<List<ASTRValue>>();
          List<ASTRValue> currentQualifiers = Collections.emptyList();

        try {
            // Soil.g:367:3: (r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* )
            // Soil.g:368:3: r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers777);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add((r!=null?r.n:null)); }

            // Soil.g:369:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==LBRACE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Soil.g:370:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers788); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers797);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers804); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers820); if (state.failed) return retval;

            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers831);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add((r!=null?r.n:null)); }

            // Soil.g:382:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LBRACE) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Soil.g:383:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers842); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers851);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers858); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            // Soil.g:392:3: ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==COMMA) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Soil.g:393:5: COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers880); if (state.failed) return retval;

            	    pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers895);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) { retval.participans.add((r!=null?r.n:null)); }

            	    // Soil.g:397:5: ( LBRACE qualifierValues= rValList RBRACE )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==LBRACE) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // Soil.g:398:6: LBRACE qualifierValues= rValList RBRACE
            	            {
            	            match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers915); if (state.failed) return retval;

            	            pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers926);
            	            qualifierValues=rValList();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

            	            match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers935); if (state.failed) return retval;

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
            	    break loop9;
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
    // Soil.g:413:1: lnkDelStat returns [ASTLinkDeletionStatement n] : 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT ;
    public final ASTLinkDeletionStatement lnkDelStat() throws RecognitionException {
        ASTLinkDeletionStatement n = null;


        Token ass=null;
        SoilParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // Soil.g:414:3: ( 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT )
            // Soil.g:415:3: 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT
            {
            match(input,56,FOLLOW_56_in_lnkDelStat976); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkDelStat980); if (state.failed) return n;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat990);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkDelStat994); if (state.failed) return n;

            match(input,65,FOLLOW_65_in_lnkDelStat998); if (state.failed) return n;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkDelStat1007); if (state.failed) return n;

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
    // Soil.g:429:1: condExStat returns [ASTConditionalExecutionStatement n] : 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' ;
    public final ASTConditionalExecutionStatement condExStat() throws RecognitionException {
        ASTConditionalExecutionStatement n = null;


        ASTExpression con =null;

        ASTStatement ts =null;

        ASTStatement es =null;



          ASTStatement elseStat = new ASTEmptyStatement();

        try {
            // Soil.g:433:3: ( 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' )
            // Soil.g:434:3: 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end'
            {
            match(input,66,FOLLOW_66_in_condExStat1038); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_condExStat1047);
            con=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            match(input,83,FOLLOW_83_in_condExStat1051); if (state.failed) return n;

            pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat1060);
            ts=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return n;

            // Soil.g:438:3: ( 'else' es= statOrImplicitBlock )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==60) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // Soil.g:439:5: 'else' es= statOrImplicitBlock
                    {
                    match(input,60,FOLLOW_60_in_condExStat1071); if (state.failed) return n;

                    pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat1083);
                    es=statOrImplicitBlock();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { elseStat = es; }

                    }
                    break;

            }


            match(input,61,FOLLOW_61_in_condExStat1095); if (state.failed) return n;

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
    // Soil.g:450:1: iterStat returns [ASTIterationStatement n] : 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final ASTIterationStatement iterStat() throws RecognitionException {
        ASTIterationStatement n = null;


        Token var=null;
        ASTExpression set =null;

        ASTStatement s =null;


        try {
            // Soil.g:451:3: ( 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // Soil.g:452:3: 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,64,FOLLOW_64_in_iterStat1120); if (state.failed) return n;

            var=(Token)match(input,IDENT,FOLLOW_IDENT_in_iterStat1128); if (state.failed) return n;

            match(input,68,FOLLOW_68_in_iterStat1132); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_iterStat1140);
            set=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            match(input,59,FOLLOW_59_in_iterStat1144); if (state.failed) return n;

            pushFollow(FOLLOW_statOrImplicitBlock_in_iterStat1152);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return n;

            match(input,61,FOLLOW_61_in_iterStat1157); if (state.failed) return n;

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
    // Soil.g:467:1: whileStat returns [ASTWhileStatement n] : 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final ASTWhileStatement whileStat() throws RecognitionException {
        ASTWhileStatement n = null;


        ASTExpression cond =null;

        ASTStatement s =null;


        try {
            // Soil.g:468:3: ( 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // Soil.g:469:3: 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,85,FOLLOW_85_in_whileStat1183); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_whileStat1191);
            cond=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            match(input,59,FOLLOW_59_in_whileStat1195); if (state.failed) return n;

            pushFollow(FOLLOW_statOrImplicitBlock_in_whileStat1203);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return n;

            match(input,61,FOLLOW_61_in_whileStat1208); if (state.failed) return n;

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
    // Soil.g:481:1: blockStat returns [ASTBlockStatement n] : 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' ;
    public final ASTBlockStatement blockStat() throws RecognitionException {
        ASTBlockStatement n = null;


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        SoilParser.stat_return s =null;



          n = new ASTBlockStatement(org.tzi.use.config.Options.explicitVariableDeclarations);

        try {
            // Soil.g:485:2: ( 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' )
            // Soil.g:486:2: 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end'
            {
            match(input,53,FOLLOW_53_in_blockStat1238); if (state.failed) return n;

            // Soil.g:487:2: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==55) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Soil.g:487:4: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI
                    {
                    match(input,55,FOLLOW_55_in_blockStat1243); if (state.failed) return n;

                    pushFollow(FOLLOW_variableDeclaration_in_blockStat1249);
                    vd=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addVariableDeclaration(vd);}

                    // Soil.g:487:72: ( COMMA vd1= variableDeclaration )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==COMMA) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // Soil.g:487:74: COMMA vd1= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_blockStat1255); if (state.failed) return n;

                    	    pushFollow(FOLLOW_variableDeclaration_in_blockStat1261);
                    	    vd1=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addVariableDeclaration(vd1);}

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    match(input,SEMI,FOLLOW_SEMI_in_blockStat1268); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_stat_in_blockStat1278);
            s=stat();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setBody((s!=null?s.n:null)); }

            match(input,61,FOLLOW_61_in_blockStat1283); if (state.failed) return n;

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
    // Soil.g:496:1: implicitBlockStat returns [ASTBlockStatement n] : 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat ;
    public final ASTBlockStatement implicitBlockStat() throws RecognitionException {
        ASTBlockStatement n = null;


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        SoilParser.stat_return s =null;



          n = new ASTBlockStatement(false);

        try {
            // Soil.g:500:3: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat )
            // Soil.g:501:3: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat
            {
            match(input,55,FOLLOW_55_in_implicitBlockStat1309); if (state.failed) return n;

            pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat1315);
            vd=variableDeclaration();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.addVariableDeclaration(vd);}

            // Soil.g:501:71: ( COMMA vd1= variableDeclaration )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Soil.g:501:73: COMMA vd1= variableDeclaration
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_implicitBlockStat1321); if (state.failed) return n;

            	    pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat1327);
            	    vd1=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addVariableDeclaration(vd1);}

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            match(input,SEMI,FOLLOW_SEMI_in_implicitBlockStat1334); if (state.failed) return n;

            pushFollow(FOLLOW_stat_in_implicitBlockStat1342);
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
    // Soil.g:505:1: statOrImplicitBlock returns [ASTStatement n] : (s1= stat |s2= implicitBlockStat ) ;
    public final ASTStatement statOrImplicitBlock() throws RecognitionException {
        ASTStatement n = null;


        SoilParser.stat_return s1 =null;

        ASTBlockStatement s2 =null;


        try {
            // Soil.g:506:3: ( (s1= stat |s2= implicitBlockStat ) )
            // Soil.g:507:3: (s1= stat |s2= implicitBlockStat )
            {
            // Soil.g:507:3: (s1= stat |s2= implicitBlockStat )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==AT||LA14_0==HASH||(LA14_0 >= IDENT && LA14_0 <= INT)||(LA14_0 >= LPAREN && LA14_0 <= MINUS)||LA14_0==PLUS||LA14_0==REAL||LA14_0==SEMI||LA14_0==STRING||(LA14_0 >= 44 && LA14_0 <= 50)||LA14_0==53||(LA14_0 >= 56 && LA14_0 <= 57)||(LA14_0 >= 60 && LA14_0 <= 61)||(LA14_0 >= 63 && LA14_0 <= 64)||LA14_0==66||LA14_0==69||(LA14_0 >= 71 && LA14_0 <= 80)||(LA14_0 >= 84 && LA14_0 <= 85)) ) {
                alt14=1;
            }
            else if ( (LA14_0==55) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // Soil.g:507:4: s1= stat
                    {
                    pushFollow(FOLLOW_stat_in_statOrImplicitBlock1365);
                    s1=stat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (s1!=null?s1.n:null); }

                    }
                    break;
                case 2 :
                    // Soil.g:507:31: s2= implicitBlockStat
                    {
                    pushFollow(FOLLOW_implicitBlockStat_in_statOrImplicitBlock1375);
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
    // Soil.g:521:1: nothing :;
    public final void nothing() throws RecognitionException {
        try {
            // Soil.g:522:1: ()
            // Soil.g:523:1: 
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
    // Soil.g:529:1: rValue returns [ASTRValue n] : (e= inSoilExpression |oc= objCreateStat );
    public final SoilParser.rValue_return rValue() throws RecognitionException {
        SoilParser.rValue_return retval = new SoilParser.rValue_return();
        retval.start = input.LT(1);


        ASTExpression e =null;

        ASTStatement oc =null;


        try {
            // Soil.g:530:5: (e= inSoilExpression |oc= objCreateStat )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==AT||LA15_0==HASH||(LA15_0 >= IDENT && LA15_0 <= INT)||(LA15_0 >= LPAREN && LA15_0 <= MINUS)||LA15_0==PLUS||LA15_0==REAL||LA15_0==STRING||(LA15_0 >= 44 && LA15_0 <= 50)||LA15_0==63||LA15_0==66||(LA15_0 >= 71 && LA15_0 <= 72)||(LA15_0 >= 74 && LA15_0 <= 80)||LA15_0==84) ) {
                alt15=1;
            }
            else if ( (LA15_0==73) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // Soil.g:531:5: e= inSoilExpression
                    {
                    pushFollow(FOLLOW_inSoilExpression_in_rValue1421);
                    e=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n = new ASTRValueExpressionOrOpCall(e); }

                    }
                    break;
                case 2 :
                    // Soil.g:532:5: oc= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_rValue1433);
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
    // Soil.g:546:1: rValList returns [List<ASTRValue> n] : ( nothing |rl= rValListMin1 );
    public final List<ASTRValue> rValList() throws RecognitionException {
        List<ASTRValue> n = null;


        List<ASTRValue> rl =null;


        try {
            // Soil.g:547:3: ( nothing |rl= rValListMin1 )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RBRACE) ) {
                alt16=1;
            }
            else if ( (LA16_0==AT||LA16_0==HASH||(LA16_0 >= IDENT && LA16_0 <= INT)||(LA16_0 >= LPAREN && LA16_0 <= MINUS)||LA16_0==PLUS||LA16_0==REAL||LA16_0==STRING||(LA16_0 >= 44 && LA16_0 <= 50)||LA16_0==63||LA16_0==66||(LA16_0 >= 71 && LA16_0 <= 80)||LA16_0==84) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // Soil.g:548:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_rValList1456);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = Collections.<ASTRValue>emptyList(); }

                    }
                    break;
                case 2 :
                    // Soil.g:551:3: rl= rValListMin1
                    {
                    pushFollow(FOLLOW_rValListMin1_in_rValList1483);
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
    // Soil.g:559:1: rValListMin1 returns [List<ASTRValue> n] : r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin1() throws RecognitionException {
        List<ASTRValue> n = null;


        SoilParser.rValue_return r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // Soil.g:563:3: (r= rValue ( COMMA r= rValue )* )
            // Soil.g:564:3: r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin11516);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            // Soil.g:566:3: ( COMMA r= rValue )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // Soil.g:567:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin11530); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin11540);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

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
    // $ANTLR end "rValListMin1"



    // $ANTLR start "rValListMin2"
    // Soil.g:577:1: rValListMin2 returns [List<ASTRValue> n] : r= rValue COMMA r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin2() throws RecognitionException {
        List<ASTRValue> n = null;


        SoilParser.rValue_return r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // Soil.g:581:3: (r= rValue COMMA r= rValue ( COMMA r= rValue )* )
            // Soil.g:582:3: r= rValue COMMA r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin21579);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin21587); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_rValListMin21595);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            // Soil.g:587:3: ( COMMA r= rValue )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==COMMA) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // Soil.g:588:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin21609); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin21619);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

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
    // $ANTLR end "rValListMin2"



    // $ANTLR start "inSoilExpression"
    // Soil.g:598:1: inSoilExpression returns [ASTExpression n] : e= expression ;
    public final ASTExpression inSoilExpression() throws RecognitionException {
        ASTExpression n = null;


        SoilParser.expression_return e =null;


        try {
            // Soil.g:599:3: (e= expression )
            // Soil.g:600:3: e= expression
            {
            pushFollow(FOLLOW_expression_in_inSoilExpression1653);
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
    // Soil.g:609:1: exprList returns [List<ASTExpression> n] : ( nothing |el= exprListMin1 );
    public final List<ASTExpression> exprList() throws RecognitionException {
        List<ASTExpression> n = null;


        List<ASTExpression> el =null;


        try {
            // Soil.g:610:3: ( nothing |el= exprListMin1 )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==EOF) ) {
                alt19=1;
            }
            else if ( (LA19_0==AT||LA19_0==HASH||(LA19_0 >= IDENT && LA19_0 <= INT)||(LA19_0 >= LPAREN && LA19_0 <= MINUS)||LA19_0==PLUS||LA19_0==REAL||LA19_0==STRING||(LA19_0 >= 44 && LA19_0 <= 50)||LA19_0==63||LA19_0==66||(LA19_0 >= 71 && LA19_0 <= 72)||(LA19_0 >= 74 && LA19_0 <= 80)||LA19_0==84) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // Soil.g:611:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_exprList1682);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<ASTExpression>(); }

                    }
                    break;
                case 2 :
                    // Soil.g:614:3: el= exprListMin1
                    {
                    pushFollow(FOLLOW_exprListMin1_in_exprList1700);
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
    // Soil.g:622:1: exprListMin1 returns [List<ASTExpression> n] : e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin1() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // Soil.g:626:3: (e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // Soil.g:627:3: e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin11733);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // Soil.g:629:3: ( COMMA e= inSoilExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==COMMA) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Soil.g:630:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin11748); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin11758);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

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
    // $ANTLR end "exprListMin1"



    // $ANTLR start "exprListMin2"
    // Soil.g:640:1: exprListMin2 returns [List<ASTExpression> n] : e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin2() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // Soil.g:644:3: (e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // Soil.g:645:3: e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin21798);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            match(input,COMMA,FOLLOW_COMMA_in_exprListMin21806); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_exprListMin21814);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // Soil.g:650:3: ( COMMA e= inSoilExpression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==COMMA) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Soil.g:651:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin21828); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin21838);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

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
    // $ANTLR end "exprListMin2"



    // $ANTLR start "identList"
    // Soil.g:661:1: identList returns [List<String> n] : ( nothing |il= identListMin1 );
    public final List<String> identList() throws RecognitionException {
        List<String> n = null;


        List<String> il =null;


        try {
            // Soil.g:662:3: ( nothing |il= identListMin1 )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==EOF||LA22_0==RBRACE||LA22_0==SEMI||(LA22_0 >= 60 && LA22_0 <= 61)) ) {
                alt22=1;
            }
            else if ( (LA22_0==IDENT) ) {
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
                    // Soil.g:663:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_identList1868);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<String>(); }

                    }
                    break;
                case 2 :
                    // Soil.g:666:3: il= identListMin1
                    {
                    pushFollow(FOLLOW_identListMin1_in_identList1885);
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
    // Soil.g:674:1: identListMin1 returns [List<String> n] : id= IDENT ( COMMA id= IDENT )* ;
    public final List<String> identListMin1() throws RecognitionException {
        List<String> n = null;


        Token id=null;


          n = new ArrayList<String>();

        try {
            // Soil.g:678:3: (id= IDENT ( COMMA id= IDENT )* )
            // Soil.g:679:3: id= IDENT ( COMMA id= IDENT )*
            {
            id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin11919); if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((id!=null?id.getText():null)); }

            // Soil.g:681:3: ( COMMA id= IDENT )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==COMMA) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Soil.g:682:5: COMMA id= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_identListMin11933); if (state.failed) return n;

            	    id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin11943); if (state.failed) return n;

            	    if ( state.backtracking==0 ) {
            	        n.add((id!=null?id.getText():null)); }

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
    // $ANTLR end "identListMin1"



    // $ANTLR start "expressionOnly"
    // Soil.g:719:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
    public final ASTExpression expressionOnly() throws RecognitionException {
        ASTExpression n = null;


        SoilParser.expression_return nExp =null;


        try {
            // Soil.g:720:5: (nExp= expression EOF )
            // Soil.g:721:5: nExp= expression EOF
            {
            pushFollow(FOLLOW_expression_in_expressionOnly1982);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_expressionOnly1984); if (state.failed) return n;

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
    // Soil.g:728:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression ;
    public final SoilParser.expression_return expression() throws RecognitionException {
        SoilParser.expression_return retval = new SoilParser.expression_return();
        retval.start = input.LT(1);


        Token name=null;
        ASTType t =null;

        SoilParser.expression_return e1 =null;

        ASTExpression nCndImplies =null;


         
          ASTLetExpression prevLet = null, firstLet = null;
          ASTExpression e2;
          Token tok = null;

        try {
            // Soil.g:734:5: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression )
            // Soil.g:735:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of expression */ }

            // Soil.g:736:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==72) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Soil.g:737:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in'
            	    {
            	    match(input,72,FOLLOW_72_in_expression2032); if (state.failed) return retval;

            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression2036); if (state.failed) return retval;

            	    // Soil.g:737:24: ( COLON t= type )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==COLON) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // Soil.g:737:26: COLON t= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expression2040); if (state.failed) return retval;

            	            pushFollow(FOLLOW_type_in_expression2044);
            	            t=type();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_expression2049); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expression_in_expression2053);
            	    e1=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    match(input,68,FOLLOW_68_in_expression2055); if (state.failed) return retval;

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
            	    break loop25;
                }
            } while (true);


            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression2080);
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
    // Soil.g:765:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
    public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
        List<ASTVariableDeclaration> paramList = null;


        ASTVariableDeclaration v =null;


         paramList = new ArrayList<ASTVariableDeclaration>(); 
        try {
            // Soil.g:767:5: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
            // Soil.g:768:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_paramList2113); if (state.failed) return paramList;

            // Soil.g:769:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==IDENT) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // Soil.g:770:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_paramList2130);
                    v=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return paramList;

                    if ( state.backtracking==0 ) { paramList.add(v); }

                    // Soil.g:771:7: ( COMMA v= variableDeclaration )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==COMMA) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // Soil.g:771:9: COMMA v= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_paramList2142); if (state.failed) return paramList;

                    	    pushFollow(FOLLOW_variableDeclaration_in_paramList2146);
                    	    v=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return paramList;

                    	    if ( state.backtracking==0 ) { paramList.add(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_paramList2166); if (state.failed) return paramList;

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
    // Soil.g:779:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
    public final List idList() throws RecognitionException {
        List idList = null;


        Token id0=null;
        Token idn=null;

         idList = new ArrayList(); 
        try {
            // Soil.g:781:5: (id0= IDENT ( COMMA idn= IDENT )* )
            // Soil.g:782:5: id0= IDENT ( COMMA idn= IDENT )*
            {
            id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList2195); if (state.failed) return idList;

            if ( state.backtracking==0 ) { idList.add(id0); }

            // Soil.g:783:5: ( COMMA idn= IDENT )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==COMMA) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // Soil.g:783:7: COMMA idn= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_idList2205); if (state.failed) return idList;

            	    idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList2209); if (state.failed) return idList;

            	    if ( state.backtracking==0 ) { idList.add(idn); }

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // Soil.g:791:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
    public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
        ASTVariableDeclaration n = null;


        Token name=null;
        ASTType t =null;


        try {
            // Soil.g:792:5: (name= IDENT COLON t= type )
            // Soil.g:793:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration2240); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableDeclaration2242); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableDeclaration2246);
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
    // Soil.g:801:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndOrExp =null;

        ASTExpression n1 =null;


        try {
            // Soil.g:802:5: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
            // Soil.g:803:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression2282);
            nCndOrExp=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndOrExp;}

            // Soil.g:804:5: (op= 'implies' n1= conditionalOrExpression )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==67) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // Soil.g:804:7: op= 'implies' n1= conditionalOrExpression
            	    {
            	    op=(Token)match(input,67,FOLLOW_67_in_conditionalImpliesExpression2295); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression2299);
            	    n1=conditionalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // Soil.g:813:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndXorExp =null;

        ASTExpression n1 =null;


        try {
            // Soil.g:814:5: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
            // Soil.g:815:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
            {
            pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression2344);
            nCndXorExp=conditionalXOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndXorExp;}

            // Soil.g:816:5: (op= 'or' n1= conditionalXOrExpression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==81) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // Soil.g:816:7: op= 'or' n1= conditionalXOrExpression
            	    {
            	    op=(Token)match(input,81,FOLLOW_81_in_conditionalOrExpression2357); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression2361);
            	    n1=conditionalXOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // Soil.g:825:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalXOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndAndExp =null;

        ASTExpression n1 =null;


        try {
            // Soil.g:826:5: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
            // Soil.g:827:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression2405);
            nCndAndExp=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndAndExp;}

            // Soil.g:828:5: (op= 'xor' n1= conditionalAndExpression )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==86) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // Soil.g:828:7: op= 'xor' n1= conditionalAndExpression
            	    {
            	    op=(Token)match(input,86,FOLLOW_86_in_conditionalXOrExpression2418); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression2422);
            	    n1=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // Soil.g:837:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nEqExp =null;

        ASTExpression n1 =null;


        try {
            // Soil.g:838:5: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
            // Soil.g:839:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression2466);
            nEqExp=equalityExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nEqExp;}

            // Soil.g:840:5: (op= 'and' n1= equalityExpression )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==52) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // Soil.g:840:7: op= 'and' n1= equalityExpression
            	    {
            	    op=(Token)match(input,52,FOLLOW_52_in_conditionalAndExpression2479); if (state.failed) return n;

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression2483);
            	    n1=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // Soil.g:849:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nRelExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Soil.g:851:5: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
            // Soil.g:852:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression2531);
            nRelExp=relationalExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nRelExp;}

            // Soil.g:853:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==EQUAL||LA33_0==NOT_EQUAL) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // Soil.g:853:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
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


            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression2560);
            	    n1=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // Soil.g:863:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nAddiExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Soil.g:865:5: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
            // Soil.g:866:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression2609);
            nAddiExp=additiveExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nAddiExp;}

            // Soil.g:867:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0 >= GREATER && LA34_0 <= GREATER_EQUAL)||(LA34_0 >= LESS && LA34_0 <= LESS_EQUAL)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // Soil.g:867:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
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


            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression2645);
            	    n1=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // Soil.g:877:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nMulExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Soil.g:879:5: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
            // Soil.g:880:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2695);
            nMulExp=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nMulExp;}

            // Soil.g:881:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==MINUS||LA35_0==PLUS) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // Soil.g:881:7: ( PLUS | MINUS ) n1= multiplicativeExpression
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


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2723);
            	    n1=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // Soil.g:892:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Soil.g:894:5: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
            // Soil.g:895:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2773);
            nUnExp=unaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nUnExp;}

            // Soil.g:896:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==SLASH||LA36_0==STAR||LA36_0==58) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // Soil.g:896:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==58 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2805);
            	    n1=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // Soil.g:908:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression nPosExp =null;


         Token op = null; 
        try {
            // Soil.g:910:7: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==MINUS||LA37_0==PLUS||LA37_0==74) ) {
                alt37=1;
            }
            else if ( (LA37_0==AT||LA37_0==HASH||(LA37_0 >= IDENT && LA37_0 <= INT)||LA37_0==LPAREN||LA37_0==REAL||LA37_0==STRING||(LA37_0 >= 44 && LA37_0 <= 50)||LA37_0==63||LA37_0==66||LA37_0==71||(LA37_0 >= 75 && LA37_0 <= 80)||LA37_0==84) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }
            switch (alt37) {
                case 1 :
                    // Soil.g:911:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    {
                    // Soil.g:911:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    // Soil.g:911:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
                    {
                    if ( state.backtracking==0 ) { op = input.LT(1); }

                    if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==74 ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2891);
                    nUnExp=unaryExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUnaryExpression(op, nUnExp); }

                    }


                    }
                    break;
                case 2 :
                    // Soil.g:915:7: nPosExp= postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression2911);
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
    // Soil.g:923:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
    public final ASTExpression postfixExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nPrimExp =null;

        ASTExpression nPc =null;


         boolean arrow = false; 
        try {
            // Soil.g:925:5: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
            // Soil.g:926:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression2944);
            nPrimExp=primaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nPrimExp; }

            // Soil.g:927:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==DOT) ) {
                    int LA39_2 = input.LA(2);

                    if ( (LA39_2==IDENT) ) {
                        int LA39_4 = input.LA(3);

                        if ( (LA39_4==EOF||(LA39_4 >= ARROW && LA39_4 <= BAR)||(LA39_4 >= COMMA && LA39_4 <= EQUAL)||(LA39_4 >= GREATER && LA39_4 <= GREATER_EQUAL)||(LA39_4 >= LBRACE && LA39_4 <= MINUS)||(LA39_4 >= NOT_EQUAL && LA39_4 <= PLUS)||(LA39_4 >= RBRACE && LA39_4 <= RBRACK)||(LA39_4 >= RPAREN && LA39_4 <= SLASH)||LA39_4==STAR||LA39_4==52||(LA39_4 >= 58 && LA39_4 <= 62)||(LA39_4 >= 67 && LA39_4 <= 68)||LA39_4==81||LA39_4==83||LA39_4==86) ) {
                            alt39=1;
                        }


                    }
                    else if ( (LA39_2==71||LA39_2==76||(LA39_2 >= 78 && LA39_2 <= 79)) ) {
                        alt39=1;
                    }


                }
                else if ( (LA39_0==ARROW) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // Soil.g:928:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
            	    {
            	    // Soil.g:928:6: ( ARROW | DOT )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==ARROW) ) {
            	        alt38=1;
            	    }
            	    else if ( (LA38_0==DOT) ) {
            	        alt38=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 38, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // Soil.g:928:8: ARROW
            	            {
            	            match(input,ARROW,FOLLOW_ARROW_in_postfixExpression2962); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = true; }

            	            }
            	            break;
            	        case 2 :
            	            // Soil.g:928:34: DOT
            	            {
            	            match(input,DOT,FOLLOW_DOT_in_postfixExpression2968); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = false; }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_propertyCall_in_postfixExpression2979);
            	    nPc=propertyCall(n, arrow);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = nPc; }

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // Soil.g:944:1: primaryExpression returns [ASTExpression n] : (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )? );
    public final ASTExpression primaryExpression() throws RecognitionException {
        ASTExpression n = null;


        Token id1=null;
        ASTExpression nLit =null;

        ASTExpression nOr =null;

        ASTExpression nPc =null;

        SoilParser.expression_return nExp =null;

        ASTExpression nIfExp =null;


        try {
            // Soil.g:945:7: (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )? )
            int alt42=6;
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
            case 63:
            case 75:
            case 77:
            case 80:
            case 84:
                {
                alt42=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case COLON_COLON:
                    {
                    alt42=1;
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
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 67:
                case 68:
                case 81:
                case 83:
                case 86:
                    {
                    alt42=3;
                    }
                    break;
                case DOT:
                    {
                    int LA42_7 = input.LA(3);

                    if ( (LA42_7==51) ) {
                        alt42=6;
                    }
                    else if ( (LA42_7==IDENT||LA42_7==71||LA42_7==76||(LA42_7 >= 78 && LA42_7 <= 79)) ) {
                        alt42=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 7, input);

                        throw nvae;

                    }
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 2, input);

                    throw nvae;

                }

                }
                break;
            case AT:
                {
                alt42=2;
                }
                break;
            case 71:
            case 76:
            case 78:
            case 79:
                {
                alt42=3;
                }
                break;
            case LPAREN:
                {
                alt42=4;
                }
                break;
            case 66:
                {
                alt42=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }

            switch (alt42) {
                case 1 :
                    // Soil.g:946:7: nLit= literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression3019);
                    nLit=literal();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nLit; }

                    }
                    break;
                case 2 :
                    // Soil.g:947:7: nOr= objectReference
                    {
                    pushFollow(FOLLOW_objectReference_in_primaryExpression3033);
                    nOr=objectReference();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nOr; }

                    }
                    break;
                case 3 :
                    // Soil.g:948:7: nPc= propertyCall[null, false]
                    {
                    pushFollow(FOLLOW_propertyCall_in_primaryExpression3045);
                    nPc=propertyCall(null, false);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nPc; }

                    }
                    break;
                case 4 :
                    // Soil.g:949:7: LPAREN nExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression3056); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression3060);
                    nExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression3062); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExp!=null?nExp.n:null); }

                    }
                    break;
                case 5 :
                    // Soil.g:950:7: nIfExp= ifExpression
                    {
                    pushFollow(FOLLOW_ifExpression_in_primaryExpression3074);
                    nIfExp=ifExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nIfExp; }

                    }
                    break;
                case 6 :
                    // Soil.g:951:7: id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )?
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression3086); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression3088); if (state.failed) return n;

                    match(input,51,FOLLOW_51_in_primaryExpression3090); if (state.failed) return n;

                    // Soil.g:951:36: ( LPAREN RPAREN )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==LPAREN) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // Soil.g:951:38: LPAREN RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression3094); if (state.failed) return n;

                            match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression3096); if (state.failed) return n;

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) { n = new ASTAllInstancesExpression(id1); }

                    // Soil.g:953:7: ( AT 'pre' )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==AT) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // Soil.g:953:9: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression3117); if (state.failed) return n;

                            match(input,82,FOLLOW_82_in_primaryExpression3119); if (state.failed) return n;

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
    // Soil.g:957:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
    public final ASTExpression objectReference() throws RecognitionException {
        ASTExpression n = null;


        Token objectName=null;

        try {
            // Soil.g:958:3: ( AT objectName= IDENT )
            // Soil.g:959:3: AT objectName= IDENT
            {
            match(input,AT,FOLLOW_AT_in_objectReference3146); if (state.failed) return n;

            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference3154); if (state.failed) return n;

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
    // Soil.g:973:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] );
    public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nExpQuery =null;

        ASTExpression nExpIterate =null;

        SoilParser.operationExpression_return nExpOperation =null;

        ASTTypeArgExpression nExpType =null;


        try {
            // Soil.g:974:7: ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] )
            int alt43=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA43_1 = input.LA(2);

                if ( (((( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )&&( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ))&&( input.LA(2) == LPAREN ))) ) {
                    alt43=1;
                }
                else if ( (true) ) {
                    alt43=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;

                }
                }
                break;
            case 71:
                {
                alt43=2;
                }
                break;
            case 76:
            case 78:
            case 79:
                {
                alt43=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }

            switch (alt43) {
                case 1 :
                    // Soil.g:978:7: {...}?{...}?nExpQuery= queryExpression[source]
                    {
                    if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
                    }

                    if ( !(( input.LA(2) == LPAREN )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
                    }

                    pushFollow(FOLLOW_queryExpression_in_propertyCall3219);
                    nExpQuery=queryExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpQuery; }

                    }
                    break;
                case 2 :
                    // Soil.g:981:7: nExpIterate= iterateExpression[source]
                    {
                    pushFollow(FOLLOW_iterateExpression_in_propertyCall3232);
                    nExpIterate=iterateExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpIterate; }

                    }
                    break;
                case 3 :
                    // Soil.g:982:7: nExpOperation= operationExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_operationExpression_in_propertyCall3245);
                    nExpOperation=operationExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExpOperation!=null?nExpOperation.n:null); }

                    }
                    break;
                case 4 :
                    // Soil.g:983:7: nExpType= typeExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_typeExpression_in_propertyCall3258);
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
    // Soil.g:992:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
    public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTElemVarsDeclaration decls =null;

        SoilParser.expression_return nExp =null;


        ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
        try {
            // Soil.g:993:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
            // Soil.g:994:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
            {
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression3293); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression3300); if (state.failed) return n;

            // Soil.g:996:5: (decls= elemVarsDeclaration BAR )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==IDENT) ) {
                int LA44_1 = input.LA(2);

                if ( ((LA44_1 >= BAR && LA44_1 <= COLON)||LA44_1==COMMA) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // Soil.g:996:7: decls= elemVarsDeclaration BAR
                    {
                    pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression3311);
                    decls=elemVarsDeclaration();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {decl = decls;}

                    match(input,BAR,FOLLOW_BAR_in_queryExpression3315); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_expression_in_queryExpression3326);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression3332); if (state.failed) return n;

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
    // Soil.g:1010:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
    public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ASTElemVarsDeclaration decls =null;

        ASTVariableInitialization init =null;

        SoilParser.expression_return nExp =null;


        try {
            // Soil.g:1010:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
            // Soil.g:1011:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
            {
            i=(Token)match(input,71,FOLLOW_71_in_iterateExpression3364); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression3370); if (state.failed) return n;

            pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression3378);
            decls=elemVarsDeclaration();

            state._fsp--;
            if (state.failed) return n;

            match(input,SEMI,FOLLOW_SEMI_in_iterateExpression3380); if (state.failed) return n;

            pushFollow(FOLLOW_variableInitialization_in_iterateExpression3388);
            init=variableInitialization();

            state._fsp--;
            if (state.failed) return n;

            match(input,BAR,FOLLOW_BAR_in_iterateExpression3390); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_iterateExpression3398);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression3404); if (state.failed) return n;

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
    // Soil.g:1032:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
    public final SoilParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        SoilParser.operationExpression_return retval = new SoilParser.operationExpression_return();
        retval.start = input.LT(1);


        Token name=null;
        SoilParser.expression_return rolename =null;

        SoilParser.expression_return e =null;


        try {
            // Soil.g:1034:5: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
            // Soil.g:1035:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression3448); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTOperationExpression(name, source, followsArrow); }

            // Soil.g:1041:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==LBRACK) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // Soil.g:1041:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression3470); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_operationExpression3483);
                    rolename=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    // Soil.g:1043:9: ( COMMA rolename= expression )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==COMMA) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // Soil.g:1043:10: COMMA rolename= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression3496); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_expression_in_operationExpression3500);
                    	    rolename=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression3512); if (state.failed) return retval;

                    // Soil.g:1046:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==LBRACK) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // Soil.g:1046:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression3529); if (state.failed) return retval;

                            pushFollow(FOLLOW_expression_in_operationExpression3544);
                            rolename=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            // Soil.g:1048:11: ( COMMA rolename= expression )*
                            loop46:
                            do {
                                int alt46=2;
                                int LA46_0 = input.LA(1);

                                if ( (LA46_0==COMMA) ) {
                                    alt46=1;
                                }


                                switch (alt46) {
                            	case 1 :
                            	    // Soil.g:1048:12: COMMA rolename= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression3559); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression3563);
                            	    rolename=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop46;
                                }
                            } while (true);


                            match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression3577); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }


            // Soil.g:1053:5: ( AT 'pre' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==AT) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // Soil.g:1053:7: AT 'pre'
                    {
                    match(input,AT,FOLLOW_AT_in_operationExpression3602); if (state.failed) return retval;

                    match(input,82,FOLLOW_82_in_operationExpression3604); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.setIsPre(); }

                    }
                    break;

            }


            // Soil.g:1055:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==LPAREN) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // Soil.g:1056:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression3629); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.hasParentheses(); }

                    // Soil.g:1057:7: (e= expression ( COMMA e= expression )* )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==AT||LA51_0==HASH||(LA51_0 >= IDENT && LA51_0 <= INT)||(LA51_0 >= LPAREN && LA51_0 <= MINUS)||LA51_0==PLUS||LA51_0==REAL||LA51_0==STRING||(LA51_0 >= 44 && LA51_0 <= 50)||LA51_0==63||LA51_0==66||(LA51_0 >= 71 && LA51_0 <= 72)||(LA51_0 >= 74 && LA51_0 <= 80)||LA51_0==84) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // Soil.g:1058:7: e= expression ( COMMA e= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_operationExpression3650);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            // Soil.g:1059:7: ( COMMA e= expression )*
                            loop50:
                            do {
                                int alt50=2;
                                int LA50_0 = input.LA(1);

                                if ( (LA50_0==COMMA) ) {
                                    alt50=1;
                                }


                                switch (alt50) {
                            	case 1 :
                            	    // Soil.g:1059:9: COMMA e= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression3662); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression3666);
                            	    e=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop50;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression3686); if (state.failed) return retval;

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
    // Soil.g:1072:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN ;
    public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTTypeArgExpression n = null;


        ASTType t =null;


         Token opToken = null; 
        try {
            // Soil.g:1075:2: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN )
            // Soil.g:1076:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN
            {
            if ( state.backtracking==0 ) { opToken = input.LT(1); }

            if ( input.LA(1)==76||(input.LA(1) >= 78 && input.LA(1) <= 79) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression3751); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_typeExpression3755);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression3757); if (state.failed) return n;

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
    // Soil.g:1087:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] :var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
    public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
        ASTElemVarsDeclaration n = null;


        Token var1=null;
        Token varN=null;
        ASTType t =null;

        ASTType tN =null;


        try {
            // Soil.g:1088:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
            // Soil.g:1089:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
            {
            if ( state.backtracking==0 ) { n = new ASTElemVarsDeclaration(); }

            var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration3795); if (state.failed) return n;

            // Soil.g:1090:17: ( COLON t= type )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==COLON) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // Soil.g:1090:18: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration3798); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_elemVarsDeclaration3802);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {n.addDeclaration(var1, t);}

            // Soil.g:1091:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==COMMA) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // Soil.g:1091:5: COMMA varN= IDENT ( COLON tN= type )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration3812); if (state.failed) return n;

            	    varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration3818); if (state.failed) return n;

            	    // Soil.g:1091:24: ( COLON tN= type )?
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==COLON) ) {
            	        alt54=1;
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // Soil.g:1091:25: COLON tN= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration3821); if (state.failed) return n;

            	            pushFollow(FOLLOW_type_in_elemVarsDeclaration3827);
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
            	    break loop55;
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
    // Soil.g:1099:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
    public final ASTVariableInitialization variableInitialization() throws RecognitionException {
        ASTVariableInitialization n = null;


        Token name=null;
        ASTType t =null;

        SoilParser.expression_return e =null;


        try {
            // Soil.g:1100:5: (name= IDENT COLON t= type EQUAL e= expression )
            // Soil.g:1101:5: name= IDENT COLON t= type EQUAL e= expression
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization3855); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableInitialization3857); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableInitialization3861);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization3863); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_variableInitialization3867);
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
    // Soil.g:1110:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
    public final ASTExpression ifExpression() throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        SoilParser.expression_return cond =null;

        SoilParser.expression_return t =null;

        SoilParser.expression_return e =null;


        try {
            // Soil.g:1111:5: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
            // Soil.g:1112:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
            {
            i=(Token)match(input,66,FOLLOW_66_in_ifExpression3899); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression3903);
            cond=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,83,FOLLOW_83_in_ifExpression3905); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression3909);
            t=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,60,FOLLOW_60_in_ifExpression3911); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression3915);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,62,FOLLOW_62_in_ifExpression3917); if (state.failed) return n;

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
    // Soil.g:1131:1: literal returns [ASTExpression n] : (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral );
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
            // Soil.g:1132:7: (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral )
            int alt56=11;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt56=1;
                }
                break;
            case 63:
                {
                alt56=2;
                }
                break;
            case INT:
                {
                alt56=3;
                }
                break;
            case REAL:
                {
                alt56=4;
                }
                break;
            case STRING:
                {
                alt56=5;
                }
                break;
            case HASH:
                {
                alt56=6;
                }
                break;
            case IDENT:
                {
                alt56=7;
                }
                break;
            case 44:
            case 46:
            case 47:
            case 48:
                {
                int LA56_8 = input.LA(2);

                if ( (LA56_8==LPAREN) ) {
                    alt56=9;
                }
                else if ( (LA56_8==LBRACE) ) {
                    alt56=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 8, input);

                    throw nvae;

                }
                }
                break;
            case 45:
            case 77:
                {
                alt56=9;
                }
                break;
            case 50:
            case 75:
            case 80:
                {
                alt56=10;
                }
                break;
            case 49:
                {
                alt56=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }

            switch (alt56) {
                case 1 :
                    // Soil.g:1133:7: t= 'true'
                    {
                    t=(Token)match(input,84,FOLLOW_84_in_literal3956); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(true); }

                    }
                    break;
                case 2 :
                    // Soil.g:1134:7: f= 'false'
                    {
                    f=(Token)match(input,63,FOLLOW_63_in_literal3970); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(false); }

                    }
                    break;
                case 3 :
                    // Soil.g:1135:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_literal3983); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTIntegerLiteral(i); }

                    }
                    break;
                case 4 :
                    // Soil.g:1136:7: r= REAL
                    {
                    r=(Token)match(input,REAL,FOLLOW_REAL_in_literal3998); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRealLiteral(r); }

                    }
                    break;
                case 5 :
                    // Soil.g:1137:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_literal4012); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTStringLiteral(s); }

                    }
                    break;
                case 6 :
                    // Soil.g:1138:7: HASH enumLit= IDENT
                    {
                    match(input,HASH,FOLLOW_HASH_in_literal4022); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal4026); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumLit);}

                    }
                    break;
                case 7 :
                    // Soil.g:1139:7: enumName= IDENT '::' enumLit= IDENT
                    {
                    enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal4038); if (state.failed) return n;

                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal4040); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal4044); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumName, enumLit); }

                    }
                    break;
                case 8 :
                    // Soil.g:1140:7: nColIt= collectionLiteral
                    {
                    pushFollow(FOLLOW_collectionLiteral_in_literal4056);
                    nColIt=collectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nColIt; }

                    }
                    break;
                case 9 :
                    // Soil.g:1141:7: nEColIt= emptyCollectionLiteral
                    {
                    pushFollow(FOLLOW_emptyCollectionLiteral_in_literal4068);
                    nEColIt=emptyCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nEColIt; }

                    }
                    break;
                case 10 :
                    // Soil.g:1142:7: nUndLit= undefinedLiteral
                    {
                    pushFollow(FOLLOW_undefinedLiteral_in_literal4080);
                    nUndLit=undefinedLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nUndLit; }

                    }
                    break;
                case 11 :
                    // Soil.g:1143:7: nTupleLit= tupleLiteral
                    {
                    pushFollow(FOLLOW_tupleLiteral_in_literal4092);
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
    // Soil.g:1151:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
    public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
        ASTCollectionLiteral n = null;


        ASTCollectionItem ci =null;


         Token op = null; 
        try {
            // Soil.g:1153:5: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
            // Soil.g:1154:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
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

            match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral4159); if (state.failed) return n;

            // Soil.g:1158:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==AT||LA58_0==HASH||(LA58_0 >= IDENT && LA58_0 <= INT)||(LA58_0 >= LPAREN && LA58_0 <= MINUS)||LA58_0==PLUS||LA58_0==REAL||LA58_0==STRING||(LA58_0 >= 44 && LA58_0 <= 50)||LA58_0==63||LA58_0==66||(LA58_0 >= 71 && LA58_0 <= 72)||(LA58_0 >= 74 && LA58_0 <= 80)||LA58_0==84) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // Soil.g:1159:7: ci= collectionItem ( COMMA ci= collectionItem )*
                    {
                    pushFollow(FOLLOW_collectionItem_in_collectionLiteral4176);
                    ci=collectionItem();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addItem(ci); }

                    // Soil.g:1160:7: ( COMMA ci= collectionItem )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==COMMA) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // Soil.g:1160:9: COMMA ci= collectionItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral4189); if (state.failed) return n;

                    	    pushFollow(FOLLOW_collectionItem_in_collectionLiteral4193);
                    	    ci=collectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addItem(ci); }

                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral4212); if (state.failed) return n;

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
    // Soil.g:1169:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
    public final ASTCollectionItem collectionItem() throws RecognitionException {
        ASTCollectionItem n = null;


        SoilParser.expression_return e =null;


         n = new ASTCollectionItem(); 
        try {
            // Soil.g:1171:5: (e= expression ( DOTDOT e= expression )? )
            // Soil.g:1172:5: e= expression ( DOTDOT e= expression )?
            {
            pushFollow(FOLLOW_expression_in_collectionItem4241);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setFirst((e!=null?e.n:null)); }

            // Soil.g:1173:5: ( DOTDOT e= expression )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==DOTDOT) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // Soil.g:1173:7: DOTDOT e= expression
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem4252); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_collectionItem4256);
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
    // Soil.g:1183:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE );
    public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
        ASTEmptyCollectionLiteral n = null;


        ASTCollectionType t =null;


        try {
            // Soil.g:1184:5: ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==77) ) {
                alt60=1;
            }
            else if ( ((LA60_0 >= 44 && LA60_0 <= 48)) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;

            }
            switch (alt60) {
                case 1 :
                    // Soil.g:1185:5: 'oclEmpty' LPAREN t= collectionType RPAREN
                    {
                    match(input,77,FOLLOW_77_in_emptyCollectionLiteral4285); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral4287); if (state.failed) return n;

                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral4291);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral4293); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }

                    }
                    break;
                case 2 :
                    // Soil.g:1188:5: t= collectionType LBRACE RBRACE
                    {
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral4309);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral4311); if (state.failed) return n;

                    match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral4313); if (state.failed) return n;

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
    // Soil.g:1199:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
    public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
        ASTUndefinedLiteral n = null;


        ASTType t =null;


        try {
            // Soil.g:1200:5: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
            int alt61=4;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt61=1;
                }
                break;
            case 50:
                {
                alt61=2;
                }
                break;
            case 75:
                {
                int LA61_3 = input.LA(2);

                if ( (LA61_3==LPAREN) ) {
                    alt61=3;
                }
                else if ( (LA61_3==EOF||LA61_3==ARROW||LA61_3==BAR||(LA61_3 >= COMMA && LA61_3 <= EQUAL)||(LA61_3 >= GREATER && LA61_3 <= GREATER_EQUAL)||LA61_3==LBRACE||(LA61_3 >= LESS && LA61_3 <= LESS_EQUAL)||LA61_3==MINUS||(LA61_3 >= NOT_EQUAL && LA61_3 <= PLUS)||(LA61_3 >= RBRACE && LA61_3 <= RBRACK)||(LA61_3 >= RPAREN && LA61_3 <= SLASH)||LA61_3==STAR||LA61_3==52||(LA61_3 >= 58 && LA61_3 <= 62)||(LA61_3 >= 67 && LA61_3 <= 68)||LA61_3==81||LA61_3==83||LA61_3==86) ) {
                    alt61=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;

            }

            switch (alt61) {
                case 1 :
                    // Soil.g:1201:5: 'oclUndefined' LPAREN t= type RPAREN
                    {
                    match(input,80,FOLLOW_80_in_undefinedLiteral4343); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral4345); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral4349);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral4351); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 2 :
                    // Soil.g:1204:5: 'Undefined'
                    {
                    match(input,50,FOLLOW_50_in_undefinedLiteral4365); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }

                    }
                    break;
                case 3 :
                    // Soil.g:1207:5: 'null' LPAREN t= type RPAREN
                    {
                    match(input,75,FOLLOW_75_in_undefinedLiteral4379); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral4381); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral4385);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral4387); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 4 :
                    // Soil.g:1210:5: 'null'
                    {
                    match(input,75,FOLLOW_75_in_undefinedLiteral4401); if (state.failed) return n;

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
    // Soil.g:1220:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
    public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
        ASTTupleLiteral n = null;


        ASTTupleItem ti =null;


         List tiList = new ArrayList(); 
        try {
            // Soil.g:1222:5: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
            // Soil.g:1223:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
            {
            match(input,49,FOLLOW_49_in_tupleLiteral4440); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral4446); if (state.failed) return n;

            pushFollow(FOLLOW_tupleItem_in_tupleLiteral4454);
            ti=tupleItem();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tiList.add(ti); }

            // Soil.g:1226:5: ( COMMA ti= tupleItem )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==COMMA) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // Soil.g:1226:7: COMMA ti= tupleItem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral4465); if (state.failed) return n;

            	    pushFollow(FOLLOW_tupleItem_in_tupleLiteral4469);
            	    ti=tupleItem();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tiList.add(ti); }

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral4480); if (state.failed) return n;

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
    // Soil.g:1234:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
    public final ASTTupleItem tupleItem() throws RecognitionException {
        ASTTupleItem n = null;


        Token name=null;
        ASTType t =null;

        SoilParser.expression_return e =null;


        try {
            // Soil.g:1235:5: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
            // Soil.g:1236:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem4511); if (state.failed) return n;

            // Soil.g:1237:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==COLON) ) {
                int LA63_1 = input.LA(2);

                if ( (synpred2_Soil()) ) {
                    alt63=1;
                }
                else if ( (true) ) {
                    alt63=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA63_0==EQUAL) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;

            }
            switch (alt63) {
                case 1 :
                    // Soil.g:1240:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
                    {
                    match(input,COLON,FOLLOW_COLON_in_tupleItem4550); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_tupleItem4554);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem4556); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_tupleItem4560);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTTupleItem(name, t, (e!=null?e.n:null)); }

                    }
                    break;
                case 2 :
                    // Soil.g:1243:7: ( COLON | EQUAL ) e= expression
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


                    pushFollow(FOLLOW_expression_in_tupleItem4592);
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
    // Soil.g:1254:1: type returns [ASTType n] : (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) ;
    public final ASTType type() throws RecognitionException {
        ASTType n = null;


        ASTSimpleType nTSimple =null;

        ASTCollectionType nTCollection =null;

        ASTTupleType nTTuple =null;


         Token tok = null; 
        try {
            // Soil.g:1256:5: ( (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) )
            // Soil.g:1257:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of type */ }

            // Soil.g:1258:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            int alt64=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt64=1;
                }
                break;
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
                {
                alt64=2;
                }
                break;
            case 49:
                {
                alt64=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;

            }

            switch (alt64) {
                case 1 :
                    // Soil.g:1259:7: nTSimple= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type4658);
                    nTSimple=simpleType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTSimple; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 2 :
                    // Soil.g:1260:7: nTCollection= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type4670);
                    nTCollection=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTCollection; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 3 :
                    // Soil.g:1261:7: nTTuple= tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_type4682);
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
    // Soil.g:1266:1: typeOnly returns [ASTType n] : nT= type EOF ;
    public final ASTType typeOnly() throws RecognitionException {
        ASTType n = null;


        ASTType nT =null;


        try {
            // Soil.g:1267:5: (nT= type EOF )
            // Soil.g:1268:5: nT= type EOF
            {
            pushFollow(FOLLOW_type_in_typeOnly4714);
            nT=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_typeOnly4716); if (state.failed) return n;

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
    // Soil.g:1278:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
    public final ASTSimpleType simpleType() throws RecognitionException {
        ASTSimpleType n = null;


        Token name=null;

        try {
            // Soil.g:1279:5: (name= IDENT )
            // Soil.g:1280:5: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType4744); if (state.failed) return n;

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
    // Soil.g:1288:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
    public final ASTCollectionType collectionType() throws RecognitionException {
        ASTCollectionType n = null;


        ASTType elemType =null;


         Token op = null; 
        try {
            // Soil.g:1290:5: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
            // Soil.g:1291:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
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


            match(input,LPAREN,FOLLOW_LPAREN_in_collectionType4809); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_collectionType4813);
            elemType=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_collectionType4815); if (state.failed) return n;

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
    // Soil.g:1301:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
    public final ASTTupleType tupleType() throws RecognitionException {
        ASTTupleType n = null;


        ASTTuplePart tp =null;


         List tpList = new ArrayList(); 
        try {
            // Soil.g:1303:5: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
            // Soil.g:1304:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
            {
            match(input,49,FOLLOW_49_in_tupleType4849); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_tupleType4851); if (state.failed) return n;

            pushFollow(FOLLOW_tuplePart_in_tupleType4860);
            tp=tuplePart();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tpList.add(tp); }

            // Soil.g:1306:5: ( COMMA tp= tuplePart )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==COMMA) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // Soil.g:1306:7: COMMA tp= tuplePart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleType4871); if (state.failed) return n;

            	    pushFollow(FOLLOW_tuplePart_in_tupleType4875);
            	    tp=tuplePart();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tpList.add(tp); }

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            match(input,RPAREN,FOLLOW_RPAREN_in_tupleType4887); if (state.failed) return n;

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
    // Soil.g:1315:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
    public final ASTTuplePart tuplePart() throws RecognitionException {
        ASTTuplePart n = null;


        Token name=null;
        ASTType t =null;


        try {
            // Soil.g:1316:5: (name= IDENT COLON t= type )
            // Soil.g:1317:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart4919); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_tuplePart4921); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_tuplePart4925);
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

    // $ANTLR start synpred1_Soil
    public final void synpred1_Soil_fragment() throws RecognitionException {
        // Soil.g:172:5: ( statStartingWithExpr )
        // Soil.g:172:6: statStartingWithExpr
        {
        pushFollow(FOLLOW_statStartingWithExpr_in_synpred1_Soil217);
        statStartingWithExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Soil

    // $ANTLR start synpred2_Soil
    public final void synpred2_Soil_fragment() throws RecognitionException {
        // Soil.g:1240:7: ( COLON type EQUAL )
        // Soil.g:1240:8: COLON type EQUAL
        {
        match(input,COLON,FOLLOW_COLON_in_synpred2_Soil4541); if (state.failed) return ;

        pushFollow(FOLLOW_type_in_synpred2_Soil4543);
        type();

        state._fsp--;
        if (state.failed) return ;

        match(input,EQUAL,FOLLOW_EQUAL_in_synpred2_Soil4545); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Soil

    // Delegated rules

    public final boolean synpred1_Soil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Soil_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Soil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Soil_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_stat_in_statOnly76 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_statOnly80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nextStat_in_stat111 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_stat122 = new BitSet(new long[]{0x8327F208861A0020L,0x000000000031FFA5L});
    public static final BitSet FOLLOW_nextStat_in_stat128 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_singleStat_in_nextStat162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStat_in_singleStat199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_singleStat225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAssignStat_in_singleStat237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_singleStat251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objDestroyStat_in_singleStat265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkInsStat_in_singleStat278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkDelStat_in_singleStat295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExStat_in_singleStat312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterStat_in_singleStat329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStat_in_singleStat351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStat_in_singleStat369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_emptyStat396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_statStartingWithExpr422 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attAssignStat_in_statStartingWithExpr436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varAssignStat474 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_varAssignStat478 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FF84L});
    public static final BitSet FOLLOW_rValue_in_varAssignStat486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_attAssignStat517 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_attAssignStat526 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_attAssignStat530 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FF84L});
    public static final BitSet FOLLOW_rValue_in_attAssignStat538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_objCreateStat564 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_objCreateStat572 = new BitSet(new long[]{0x0040000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat582 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_inSoilExpression_in_objCreateStat594 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat600 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_objCreateStat618 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat626 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FF84L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat640 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_objDestroyStat684 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_exprListMin1_in_objDestroyStat692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_lnkInsStat718 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkInsStat722 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FF84L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat732 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkInsStat736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_lnkInsStat740 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_lnkInsStat748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers777 = new BitSet(new long[]{0x0000000000200400L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers788 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FF84L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers797 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers804 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers820 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FF84L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers831 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers842 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FF84L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers851 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers858 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers880 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FF84L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers895 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers915 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FF84L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers926 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers935 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_56_in_lnkDelStat976 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkDelStat980 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FF84L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat990 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkDelStat994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_lnkDelStat998 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_lnkDelStat1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_condExStat1038 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_inSoilExpression_in_condExStat1047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_condExStat1051 = new BitSet(new long[]{0x83A7F208861A0020L,0x000000000031FFA5L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat1060 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_60_in_condExStat1071 = new BitSet(new long[]{0x83A7F208861A0020L,0x000000000031FFA5L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat1083 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_condExStat1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_iterStat1120 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_iterStat1128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_iterStat1132 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_inSoilExpression_in_iterStat1140 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_iterStat1144 = new BitSet(new long[]{0x83A7F208861A0020L,0x000000000031FFA5L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_iterStat1152 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_iterStat1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_whileStat1183 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_inSoilExpression_in_whileStat1191 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_whileStat1195 = new BitSet(new long[]{0x83A7F208861A0020L,0x000000000031FFA5L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_whileStat1203 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_whileStat1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_blockStat1238 = new BitSet(new long[]{0x83A7F208861A0020L,0x000000000031FFA5L});
    public static final BitSet FOLLOW_55_in_blockStat1243 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat1249 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_blockStat1255 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat1261 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_SEMI_in_blockStat1268 = new BitSet(new long[]{0x8327F208861A0020L,0x000000000031FFA5L});
    public static final BitSet FOLLOW_stat_in_blockStat1278 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_blockStat1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_implicitBlockStat1309 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat1315 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_implicitBlockStat1321 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat1327 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_SEMI_in_implicitBlockStat1334 = new BitSet(new long[]{0x8327F208861A0020L,0x000000000031FFA5L});
    public static final BitSet FOLLOW_stat_in_implicitBlockStat1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOrImplicitBlock1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicitBlockStat_in_statOrImplicitBlock1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_rValue1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_rValue1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_rValList1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValListMin1_in_rValList1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin11516 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin11530 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FF84L});
    public static final BitSet FOLLOW_rValue_in_rValListMin11540 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rValue_in_rValListMin21579 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin21587 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FF84L});
    public static final BitSet FOLLOW_rValue_in_rValListMin21595 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin21609 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FF84L});
    public static final BitSet FOLLOW_rValue_in_rValListMin21619 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_expression_in_inSoilExpression1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_exprList1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprListMin1_in_exprList1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin11733 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin11748 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin11758 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin21798 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin21806 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin21814 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin21828 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin21838 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_nothing_in_identList1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identListMin1_in_identList1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identListMin11919 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_identListMin11933 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_identListMin11943 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_expression_in_expressionOnly1982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expressionOnly1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_expression2032 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression2036 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression2040 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_expression2044 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression2049 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_expression2053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_expression2055 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_paramList2113 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList2130 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_paramList2142 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList2146 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_paramList2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList2195 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_idList2205 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_idList2209 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaration2240 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration2242 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression2282 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_conditionalImpliesExpression2295 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FC84L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression2299 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression2344 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_conditionalOrExpression2357 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FC84L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression2361 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression2405 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_conditionalXOrExpression2418 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FC84L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression2422 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression2466 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_conditionalAndExpression2479 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FC84L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression2483 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression2531 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_set_in_equalityExpression2550 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FC84L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression2560 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2609 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_set_in_relationalExpression2627 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FC84L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2645 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2695 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression2713 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FC84L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2723 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2773 = new BitSet(new long[]{0x0400014000000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression2791 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FC84L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2805 = new BitSet(new long[]{0x0400014000000002L});
    public static final BitSet FOLLOW_set_in_unaryExpression2867 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FC84L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression2944 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_ARROW_in_postfixExpression2962 = new BitSet(new long[]{0x0000000000080000L,0x000000000000D080L});
    public static final BitSet FOLLOW_DOT_in_postfixExpression2968 = new BitSet(new long[]{0x0000000000080000L,0x000000000000D080L});
    public static final BitSet FOLLOW_propertyCall_in_postfixExpression2979 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_literal_in_primaryExpression3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectReference_in_primaryExpression3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_primaryExpression3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression3056 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_primaryExpression3060 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_primaryExpression3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression3086 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression3088 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_primaryExpression3090 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression3094 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression3096 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression3117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_primaryExpression3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_objectReference3146 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_objectReference3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpression_in_propertyCall3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpression_in_propertyCall3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationExpression_in_propertyCall3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeExpression_in_propertyCall3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpression3293 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_queryExpression3300 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression3311 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_queryExpression3315 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_queryExpression3326 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_queryExpression3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_iterateExpression3364 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpression3370 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression3378 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_iterateExpression3380 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableInitialization_in_iterateExpression3388 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_iterateExpression3390 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_iterateExpression3398 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpression3404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_operationExpression3448 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression3470 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_operationExpression3483 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression3496 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_operationExpression3500 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression3512 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression3529 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_operationExpression3544 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression3559 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_operationExpression3563 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression3577 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_operationExpression3602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_operationExpression3604 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_operationExpression3629 = new BitSet(new long[]{0x8007F218861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_operationExpression3650 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression3662 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_operationExpression3666 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_operationExpression3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeExpression3735 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeExpression3751 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_typeExpression3755 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeExpression3757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration3795 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration3798 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration3802 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration3812 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration3818 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration3821 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration3827 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableInitialization3855 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableInitialization3857 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_variableInitialization3861 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_variableInitialization3863 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_variableInitialization3867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ifExpression3899 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_ifExpression3903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ifExpression3905 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_ifExpression3909 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ifExpression3911 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_ifExpression3915 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ifExpression3917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_literal3956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_literal3970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_literal3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal4012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal4022 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_literal4038 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_literal4040 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal4044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteral_in_literal4056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal4068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefinedLiteral_in_literal4080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleLiteral_in_literal4092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionLiteral4130 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_collectionLiteral4159 = new BitSet(new long[]{0x8007F20A861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral4176 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_collectionLiteral4189 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral4193 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_collectionLiteral4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_collectionItem4241 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_DOTDOT_in_collectionItem4252 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_collectionItem4256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_emptyCollectionLiteral4285 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral4287 = new BitSet(new long[]{0x0001F00000000000L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral4291 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral4309 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral4311 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_undefinedLiteral4343 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral4345 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral4349 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral4351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_undefinedLiteral4365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_undefinedLiteral4379 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral4381 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral4385 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_undefinedLiteral4401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_tupleLiteral4440 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_tupleLiteral4446 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral4454 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleLiteral4465 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral4469 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_tupleLiteral4480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tupleItem4511 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_tupleItem4550 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_tupleItem4554 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_tupleItem4556 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_tupleItem4560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tupleItem4582 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_tupleItem4592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type4658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type4670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleType_in_type4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeOnly4714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_typeOnly4716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleType4744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType4782 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType4809 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_collectionType4813 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType4815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_tupleType4849 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_tupleType4851 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType4860 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleType4871 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType4875 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_tupleType4887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tuplePart4919 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_tuplePart4921 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_tuplePart4925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_synpred1_Soil217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_synpred2_Soil4541 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_synpred2_Soil4543 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_synpred2_Soil4545 = new BitSet(new long[]{0x0000000000000002L});

}