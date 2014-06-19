grammar RTLRule;

options {
  superClass = BaseParser;
}

@header {
/*
 *  @author Duc-Hanh Dang, Khoa-Hai Nguyen, Xuan-Loi Vu
 */

package org.tzi.rtl.tgg.parser;

import org.tzi.use.parser.base.BaseParser;
import org.tzi.rtl.tgg.parser.ast.*;
}

@lexer::header {
package org.tzi.rtl.tgg.parser;

import org.tzi.use.parser.ParseErrorHandler;
}

@lexer::members {
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
}

/* ------------------------------------
  tggRuleCollection ::=
    ["transformation" id]
    {tggRuleDefinition}
*/
tggRuleCollection returns [ASTTggRuleCollection n]
@init{
	ASTTggRuleMatch match = null;
}
:
    'transformation' name=IDENT { $n = new ASTTggRuleCollection($name); }
    'direction' direction=('forward'|'backward'|'integration'|'co-evolution'|'synchronization')
    ((matchID=IDENT ':=')? ruleApplication SEMI 
    	{match = new ASTTggRuleMatch($matchID,$ruleApplication.n);}
    	{$n.addTggRuleMatch(match);})*
    ( tggRule=tggRuleDefinition { $n.addTggRule($tggRule.n); } )*
    EOF
    ;

/* ------------------------------------
  ruleApplication ::=

*/

ruleApplication returns [ASTTggRuleApplication n]
	simpleApp=simpleApplication{n = $simpleApp.n;}
	|multiApp=multiApplication {n = $multiApp.n;}
	|restrictedApp=restrictedApplication {n = $restrictedApp.n;}
	|selectedApp=selectedApplication {n = $selectedApp.n;}
	
;

/* ------------------------------------
  simpleApplication ::=

*/

simpleApplication returns [ASTTggRuleSimpleApplication n]
	name=IDENT LPAREN RPAREN
	{n = new ASTTggRuleSimpleApplication($name);}
;

/* ------------------------------------
  multiApplication ::=

*/

multiApplication returns [ASTTggRuleMultiApplication n]
@init{
	ASTCondition nCon = null;
	n = new ASTTggRuleMultiApplication();
}
:
	'do'
	(ruleApp = ruleApplication SEMI {n.addRuleMultiApplication($ruleApp.n);})*
	'while'
	cond=COND_EXPR
	{nCon = new ASTCondition($cond);
	n.setCond(nCon);}
;

/* ------------------------------------
  restrictedApplication ::=

*/

restrictedApplication returns [ASTTggRuleRestrictedApplication n]
@init{
	ASTCondition nCon = null;
	n = new ASTTggRuleRestrictedApplication();
}
:
	'if'
	cond=COND_EXPR
	LBRACE
	(ruleApp = ruleApplication SEMI {n.addRuleRestrictedApplication($ruleApp.n);})*
	RBRACE
	{nCon = new ASTCondition($cond);
	n.setCond(nCon);}
	
;
/* ------------------------------------
  selectedApplication ::=

*/

selectedApplication returns [ASTTggRuleSelectedApplication n]
@init{
	ASTCondition nCon = null;
}
:
	'apply'
	(name=IDENT)
	|cond=COND_EXPR
	{nCon = new ASTCondition($cond);}
	{n = new ASTTggRuleSelectedApplication($name, nCon);}
;

/* ------------------------------------
  tggRuleDefinition ::=

*/

tggRuleDefinition returns [ASTTggRule n]
@init{
  boolean isDeletingRule = false;
}
:
    'rule' name=IDENT
    ('mode' 'EXPLICIT'{isDeletingRule = true;})?
    'checkSource'
    sourceRule = ruleDefinition
    'checkTarget'
    targetRule = ruleDefinition
    'checkCorr'
    corrRule = corrRuleDefinition
    'end'
    {n = new ASTTggRule($name,$sourceRule.n,$targetRule.n,$corrRule.n,isDeletingRule);}
;

/* ------------------------------------
  ruleDefinition ::=
*/

ruleDefinition returns [ASTRule n]
:
    LPAREN
      lhs = patternDefinition
    RPAREN  LBRACE
      rhs = patternDefinition
    RBRACE {n = new ASTRule($lhs.n,$rhs.n);}
;

/* ------------------------------------
  corrRuleDefinition ::= "mode" "NONDELETING"|"EXPLICIT"
*/

corrRuleDefinition returns [ASTCorrRule n]
:
    LPAREN
      lhs = corrPatternDefinition
    RPAREN  LBRACE
      rhs = corrPatternDefinition
    RBRACE
      {n = new ASTCorrRule($lhs.n,$rhs.n);}
;

/* ------------------------------------
   patternDefinition ::=
*/

patternDefinition returns [ASTPattern n]
@init{
  $n= new ASTPattern();
}
:
    (object = objectDefinition{$n.addObject($object.n);})*
    (link = linkDefinition{$n.addLink($link.n);})*
    (condition = conditionDefinition{$n.addCondition($condition.n);})*
;

/* ------------------------------------
  corrPatternDefinition ::=
*/

corrPatternDefinition returns [ASTExtPattern n]
@init{
  $n = new ASTExtPattern();
}
:
    (object = objectDefinition{$n.addObject($object.n);})*
    (corrLink = corrLinkDefinition{$n.addCorrLink($corrLink.n);})*
    (link = linkDefinition{$n.addLink($link.n);})*
    (inv = invariantTGG{$n.addInvariant($inv.n);})*
    (condition = conditionDefinition{$n.addCondition($condition.n);})*
;

/* ------------------------------------
  invariant ::=
*/

invariantTGG returns [ASTCorrInvariant n]
:
	className=IDENT COLON conditionDefinition
	{ $n = new ASTCorrInvariant($className, $conditionDefinition.n); }
;


/* ------------------------------------
  objectDefinition ::=
*/

objectDefinition returns [ASTObject n]
:
	objectName=IDENT COLON
	className=IDENT {$n = new ASTObject($objectName, $className);}
;

/* ------------------------------------
  linkDefinition ::=
*/

linkDefinition returns [ASTLink n]
:
	LPAREN obj1=IDENT COMMA obj2=IDENT RPAREN COLON
	assocName=IDENT {$n = new ASTLink($obj1, $obj2, $assocName);}
;

/* ------------------------------------
  conditionDefinition ::=
*/

conditionDefinition returns [ASTCondition n]
:
	cond=COND_EXPR{n = new ASTCondition($cond);}
;

/* ------------------------------------
  corrLinkDefinition ::=  sequence('(', zero_or_one(sequence('(',ident,')')), ident, ',',zero_or_one(sequence('(',ident,')')),ident, ')',
					zero_or_one(sequence('as','(',ident, ',', ident,')')),
					'in', ident, ':', ident )
*/

corrLinkDefinition returns [ASTCorrLink n]
@init {
  Token newSourceClass=null;
  Token newTargetClass=null;
  Token sourceRole=null;
  Token targetRole=null;
}
:
	LPAREN
	(LPAREN clsName1=IDENT RPAREN {newSourceClass = $clsName1;} )?
	objS=IDENT COMMA
	(LPAREN clsName2=IDENT RPAREN {newTargetClass = $clsName2;} )?
	objT=IDENT RPAREN ('as' LPAREN role1=IDENT COMMA role2=IDENT RPAREN {sourceRole = $role1;targetRole = $role2;})?
	'in' objCorr=IDENT COLON corrClass=IDENT
	{
		$n = new ASTCorrLink($objS, $objT, $objCorr, $corrClass);
		if(newSourceClass != null){
		    $n.addNewSourceClass(newSourceClass);
		}
		if(newTargetClass != null){
			$n.addNewTargetClass(newTargetClass);
		}
		if(sourceRole != null){
			$n.addSourceRole(sourceRole);
		}
		if(targetRole != null){
			$n.addTargetRole(targetRole);
		}
	}
;

/*
--------- Start of file OCLLexerRules.gpart --------------------
*/

// Whitespace -- ignored
WS:
    ( ' '
    | '\t'
    | '\f'
    | NEWLINE
    )
    { $channel=HIDDEN; }
    ;

// Single-line comments
SL_COMMENT:
    ('//' | '--')
    (~('\n'|'\r'))* NEWLINE
    { $channel=HIDDEN; }
    ;

// multiple-line comments
ML_COMMENT:
    '/*' ( options {greedy=false;} : . )* '*/' { $channel=HIDDEN; };

fragment
NEWLINE	:
    '\r\n' | '\r' | '\n';

// Use paraphrases for nice error messages
ARROW 		 : '->';
AT     		 : '@';
BAR 		 : '|';
COLON 		 : ':';
COLON_COLON	 : '::';
COLON_EQUAL	 : ':=';
COMMA 		 : ',';
DOT 		 : '.';
DOTDOT 		 : '..';
EQUAL 		 : '=';
GREATER 	 : '>';
GREATER_EQUAL : '>=';
HASH 		 : '#';
LBRACE 		 : '{';
LBRACK 		 : '[';
LESS 		 : '<';
LESS_EQUAL 	 : '<=';
LPAREN 		 : '(';
MINUS 		 : '-';
NOT_EQUAL 	 : '<>';
PLUS 		 : '+';
RBRACE 		 : '}';
RBRACK 		 : ']';
RPAREN		 : ')';
SEMI		 : ';';
SLASH 		 : '/';
STAR 		 : '*';

fragment
INT:
    ('0'..'9')+
    ;

fragment
REAL:
    INT ('.' INT (('e' | 'E') ('+' | '-')? INT)? | ('e' | 'E') ('+' | '-')? INT)
    ;

RANGE_OR_INT:
      ( INT '..' )      => INT    { $type=INT; }
    | ( REAL )          => REAL   { $type=REAL; }
    |   INT                       { $type=INT; }
    ;

// String literals
STRING:
    '\'' ( ~('\''|'\\') | ESC)* '\'';

NON_OCL_STRING:
    '"' ( ~('"'|'\\') | ESC)* '"';

// escape sequence -- note that this is protected; it can only be called
//   from another lexer rule -- it will not ever directly return a token to
//   the parser
// There are various ambiguities hushed in this rule.  The optional
// '0'...'7' digit matches should be matched here rather than letting
// them go back to STRING_LITERAL to be matched.  ANTLR does the
// right thing by matching immediately; hence, it's ok to shut off
// the FOLLOW ambig warnings.
fragment
ESC
:
    '\\'
     ( 'n'
     | 'r'
     | 't'
     | 'b'
     | 'f'
     | '"'
     | '\''
     | '\\'
     | 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
     | '0'..'3' ('0'..'7' ('0'..'7')? )?  | '4'..'7' ('0'..'7')?
     )
     ;

// hexadecimal digit (again, note it's protected!)
fragment
HEX_DIGIT:
    ( '0'..'9' | 'A'..'F' | 'a'..'f' );


// An identifier.  Note that testLiterals is set to true!  This means
// that after we match the rule, we look in the literals table to see
// if it's a literal or really an identifer.

IDENT:
    ('$' | 'a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*
    ;

// A dummy rule to force vocabulary to be all characters (except
// special ones that ANTLR uses internally (0 to 2)

fragment
VOCAB:
    '\U0003'..'\U0377'
    ;

/*
--------- Start of file RTLLexerRules.gpart --------------------
*/
COND_EXPR
:
    ('[') (~(']'))* (']')
    ;