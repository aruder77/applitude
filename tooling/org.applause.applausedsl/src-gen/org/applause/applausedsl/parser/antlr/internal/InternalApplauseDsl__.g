lexer grammar InternalApplauseDsl;
@header {
package org.applause.applausedsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'application' ;
T12 : '{' ;
T13 : 'background:' ;
T14 : 'view:' ;
T15 : '}' ;
T16 : 'type' ;
T17 : 'mapsTo' ;
T18 : 'entity' ;
T19 : 'class' ;
T20 : 'extends' ;
T21 : '[]' ;
T22 : '.' ;
T23 : '(' ;
T24 : ')' ;
T25 : 'replace(' ;
T26 : ',' ;
T27 : 'urlconform(' ;
T28 : 'bind(' ;
T29 : '[' ;
T30 : ']' ;
T31 : 'split(' ;
T32 : 'for' ;
T33 : 'in' ;
T34 : 'contentprovider' ;
T35 : 'returns' ;
T36 : 'stores' ;
T37 : 'fetches' ;
T38 : 'from' ;
T39 : 'selects' ;
T40 : 'new' ;
T41 : '=' ;
T42 : 'tabview' ;
T43 : 'tab' ;
T44 : 'title:' ;
T45 : 'icon:' ;
T46 : 'tableview' ;
T47 : 'titleImage:' ;
T48 : 'style:' ;
T49 : 'section' ;
T50 : 'cell' ;
T51 : 'text:' ;
T52 : 'detailText:' ;
T53 : 'image:' ;
T54 : 'action:' ;
T55 : 'accessory:' ;
T56 : 'customview' ;
T57 : '@selector' ;
T58 : ':' ;
T59 : 'XML' ;
T60 : 'JSON' ;
T61 : 'Plain' ;
T62 : 'Grouped' ;
T63 : 'Default' ;
T64 : 'Value1' ;
T65 : 'Value2' ;
T66 : 'Subtitle' ;
T67 : 'None' ;
T68 : 'Link' ;
T69 : 'Detail' ;
T70 : 'Check' ;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 4070
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 4072
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 4074
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 4076
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 4078
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 4080
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 4082
RULE_ANY_OTHER : .;


