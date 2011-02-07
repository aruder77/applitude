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
T22 : '=' ;
T23 : '.' ;
T24 : '(' ;
T25 : ')' ;
T26 : 'replace(' ;
T27 : ',' ;
T28 : 'urlconform(' ;
T29 : 'bind(' ;
T30 : '[' ;
T31 : ']' ;
T32 : 'split(' ;
T33 : 'for' ;
T34 : 'in' ;
T35 : 'contentprovider' ;
T36 : 'returns' ;
T37 : 'stores' ;
T38 : 'fetches' ;
T39 : 'from' ;
T40 : 'selects' ;
T41 : 'tabview' ;
T42 : 'tab' ;
T43 : 'title:' ;
T44 : 'icon:' ;
T45 : 'tableview' ;
T46 : 'titleImage:' ;
T47 : 'style:' ;
T48 : 'section' ;
T49 : 'cell' ;
T50 : 'text:' ;
T51 : 'detailText:' ;
T52 : 'image:' ;
T53 : 'action:' ;
T54 : 'accessory:' ;
T55 : 'customview' ;
T56 : '@selector' ;
T57 : ':' ;
T58 : 'XML' ;
T59 : 'JSON' ;
T60 : 'Plain' ;
T61 : 'Grouped' ;
T62 : 'Default' ;
T63 : 'Value1' ;
T64 : 'Value2' ;
T65 : 'Subtitle' ;
T66 : 'None' ;
T67 : 'Link' ;
T68 : 'Detail' ;
T69 : 'Check' ;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3893
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3895
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3897
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3899
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3901
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3903
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3905
RULE_ANY_OTHER : .;


