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
T40 : 'tabview' ;
T41 : 'tab' ;
T42 : 'title:' ;
T43 : 'icon:' ;
T44 : 'tableview' ;
T45 : 'titleImage:' ;
T46 : 'style:' ;
T47 : 'section' ;
T48 : 'cell' ;
T49 : 'text:' ;
T50 : 'detailText:' ;
T51 : 'image:' ;
T52 : 'action:' ;
T53 : 'accessory:' ;
T54 : 'customview' ;
T55 : '@selector' ;
T56 : ':' ;
T57 : 'XML' ;
T58 : 'JSON' ;
T59 : 'Plain' ;
T60 : 'Grouped' ;
T61 : 'Default' ;
T62 : 'Value1' ;
T63 : 'Value2' ;
T64 : 'Subtitle' ;
T65 : 'None' ;
T66 : 'Link' ;
T67 : 'Detail' ;
T68 : 'Check' ;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3735
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3737
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3739
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3741
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3743
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3745
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3747
RULE_ANY_OTHER : .;


