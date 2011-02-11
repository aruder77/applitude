lexer grammar InternalApplauseDsl;
@header {
package org.applause.applausedsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'returns' ;
T12 : 'XML' ;
T13 : 'JSON' ;
T14 : 'Plain' ;
T15 : 'Grouped' ;
T16 : 'Default' ;
T17 : 'Value1' ;
T18 : 'Value2' ;
T19 : 'Subtitle' ;
T20 : 'None' ;
T21 : 'Link' ;
T22 : 'Detail' ;
T23 : 'Check' ;
T24 : 'application' ;
T25 : '{' ;
T26 : '}' ;
T27 : 'background:' ;
T28 : 'view:' ;
T29 : 'type' ;
T30 : 'mapsTo' ;
T31 : 'entity' ;
T32 : 'extends' ;
T33 : 'class' ;
T34 : '.' ;
T35 : '(' ;
T36 : ')' ;
T37 : 'replace(' ;
T38 : ',' ;
T39 : 'urlconform(' ;
T40 : 'bind(' ;
T41 : '[' ;
T42 : ']' ;
T43 : 'split(' ;
T44 : 'for' ;
T45 : 'in' ;
T46 : 'contentprovider' ;
T47 : 'fetches' ;
T48 : 'from' ;
T49 : 'selects' ;
T50 : '=' ;
T51 : 'tabview' ;
T52 : 'tab' ;
T53 : 'title:' ;
T54 : 'icon:' ;
T55 : 'tableview' ;
T56 : 'titleImage:' ;
T57 : 'style:' ;
T58 : 'section' ;
T59 : 'cell' ;
T60 : 'text:' ;
T61 : 'detailText:' ;
T62 : 'image:' ;
T63 : 'action:' ;
T64 : 'accessory:' ;
T65 : 'customview' ;
T66 : '@selector' ;
T67 : ':' ;
T68 : '[]' ;
T69 : 'stores' ;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9386
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9388
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9390
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9392
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9394
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9396
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9398
RULE_ANY_OTHER : .;


