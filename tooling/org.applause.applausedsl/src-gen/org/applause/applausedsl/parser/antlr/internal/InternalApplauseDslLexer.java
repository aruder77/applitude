package org.applause.applausedsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalApplauseDslLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int T62=62;
    public static final int T63=63;
    public static final int T64=64;
    public static final int T65=65;
    public static final int T66=66;
    public static final int T67=67;
    public static final int T68=68;
    public static final int T69=69;
    public static final int RULE_INT=6;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T61=61;
    public static final int T32=32;
    public static final int T60=60;
    public static final int T31=31;
    public static final int T49=49;
    public static final int T48=48;
    public static final int T43=43;
    public static final int Tokens=70;
    public static final int RULE_SL_COMMENT=8;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=7;
    public static final int T44=44;
    public static final int RULE_STRING=5;
    public static final int T50=50;
    public static final int T59=59;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T52=52;
    public static final int T15=15;
    public static final int RULE_WS=9;
    public static final int T51=51;
    public static final int T16=16;
    public static final int T54=54;
    public static final int T17=17;
    public static final int T53=53;
    public static final int T18=18;
    public static final int T56=56;
    public static final int T19=19;
    public static final int T55=55;
    public static final int T58=58;
    public static final int T57=57;
    public InternalApplauseDslLexer() {;} 
    public InternalApplauseDslLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:10:5: ( 'application' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:10:7: 'application'
            {
            match("application"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:11:5: ( '{' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:11:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:12:5: ( 'background:' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:12:7: 'background:'
            {
            match("background:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:13:5: ( 'view:' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:13:7: 'view:'
            {
            match("view:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:14:5: ( '}' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:14:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:15:5: ( 'type' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:15:7: 'type'
            {
            match("type"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:16:5: ( 'mapsTo' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:16:7: 'mapsTo'
            {
            match("mapsTo"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:17:5: ( 'entity' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:17:7: 'entity'
            {
            match("entity"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:18:5: ( 'class' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:18:7: 'class'
            {
            match("class"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:19:5: ( 'extends' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:19:7: 'extends'
            {
            match("extends"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:20:5: ( '[]' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:20:7: '[]'
            {
            match("[]"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:21:5: ( '.' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:21:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:22:5: ( '(' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:22:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:23:5: ( ')' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:23:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:24:5: ( 'replace(' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:24:7: 'replace('
            {
            match("replace("); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:25:5: ( ',' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:25:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:26:5: ( 'urlconform(' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:26:7: 'urlconform('
            {
            match("urlconform("); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:27:5: ( 'bind(' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:27:7: 'bind('
            {
            match("bind("); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:28:5: ( '[' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:28:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:29:5: ( ']' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:29:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:30:5: ( 'split(' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:30:7: 'split('
            {
            match("split("); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:31:5: ( 'for' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:31:7: 'for'
            {
            match("for"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:32:5: ( 'in' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:32:7: 'in'
            {
            match("in"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:33:5: ( 'contentprovider' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:33:7: 'contentprovider'
            {
            match("contentprovider"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:34:5: ( 'returns' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:34:7: 'returns'
            {
            match("returns"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:35:5: ( 'stores' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:35:7: 'stores'
            {
            match("stores"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:36:5: ( 'fetches' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:36:7: 'fetches'
            {
            match("fetches"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:37:5: ( 'from' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:37:7: 'from'
            {
            match("from"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:38:5: ( 'selects' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:38:7: 'selects'
            {
            match("selects"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:39:5: ( '=' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:39:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:40:5: ( 'tabview' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:40:7: 'tabview'
            {
            match("tabview"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:41:5: ( 'tab' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:41:7: 'tab'
            {
            match("tab"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:42:5: ( 'title:' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:42:7: 'title:'
            {
            match("title:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:43:5: ( 'icon:' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:43:7: 'icon:'
            {
            match("icon:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:44:5: ( 'tableview' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:44:7: 'tableview'
            {
            match("tableview"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:45:5: ( 'titleImage:' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:45:7: 'titleImage:'
            {
            match("titleImage:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:46:5: ( 'style:' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:46:7: 'style:'
            {
            match("style:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:47:5: ( 'section' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:47:7: 'section'
            {
            match("section"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:48:5: ( 'cell' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:48:7: 'cell'
            {
            match("cell"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:49:5: ( 'text:' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:49:7: 'text:'
            {
            match("text:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:50:5: ( 'detailText:' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:50:7: 'detailText:'
            {
            match("detailText:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:51:5: ( 'image:' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:51:7: 'image:'
            {
            match("image:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:52:5: ( 'action:' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:52:7: 'action:'
            {
            match("action:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:53:5: ( 'accessory:' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:53:7: 'accessory:'
            {
            match("accessory:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:54:5: ( 'customview' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:54:7: 'customview'
            {
            match("customview"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:55:5: ( '@selector' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:55:7: '@selector'
            {
            match("@selector"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:56:5: ( ':' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:56:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:57:5: ( 'XML' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:57:7: 'XML'
            {
            match("XML"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:58:5: ( 'JSON' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:58:7: 'JSON'
            {
            match("JSON"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60
    public final void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:59:5: ( 'Plain' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:59:7: 'Plain'
            {
            match("Plain"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61
    public final void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:60:5: ( 'Grouped' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:60:7: 'Grouped'
            {
            match("Grouped"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start T62
    public final void mT62() throws RecognitionException {
        try {
            int _type = T62;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:61:5: ( 'Default' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:61:7: 'Default'
            {
            match("Default"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start T63
    public final void mT63() throws RecognitionException {
        try {
            int _type = T63;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:62:5: ( 'Value1' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:62:7: 'Value1'
            {
            match("Value1"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start T64
    public final void mT64() throws RecognitionException {
        try {
            int _type = T64;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:63:5: ( 'Value2' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:63:7: 'Value2'
            {
            match("Value2"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T64

    // $ANTLR start T65
    public final void mT65() throws RecognitionException {
        try {
            int _type = T65;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:64:5: ( 'Subtitle' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:64:7: 'Subtitle'
            {
            match("Subtitle"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T65

    // $ANTLR start T66
    public final void mT66() throws RecognitionException {
        try {
            int _type = T66;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:65:5: ( 'None' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:65:7: 'None'
            {
            match("None"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start T67
    public final void mT67() throws RecognitionException {
        try {
            int _type = T67;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:66:5: ( 'Link' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:66:7: 'Link'
            {
            match("Link"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T67

    // $ANTLR start T68
    public final void mT68() throws RecognitionException {
        try {
            int _type = T68;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:67:5: ( 'Detail' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:67:7: 'Detail'
            {
            match("Detail"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T68

    // $ANTLR start T69
    public final void mT69() throws RecognitionException {
        try {
            int _type = T69;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:68:5: ( 'Check' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:68:7: 'Check'
            {
            match("Check"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T69

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4080:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4080:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4080:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4080:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4080:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4082:10: ( ( '0' .. '9' )+ )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4082:12: ( '0' .. '9' )+
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4082:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4082:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4084:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4084:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4084:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4084:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4084:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4084:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4084:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4084:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4084:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4084:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4084:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4084:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4086:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4086:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4086:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4086:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4088:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4088:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4088:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4088:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4088:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4088:41: ( '\\r' )? '\\n'
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4088:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4088:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4090:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4090:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4090:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4092:16: ( . )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4092:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=66;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='a') ) {
            switch ( input.LA(2) ) {
            case 'c':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA12_99 = input.LA(4);

                    if ( (LA12_99=='i') ) {
                        int LA12_142 = input.LA(5);

                        if ( (LA12_142=='o') ) {
                            int LA12_186 = input.LA(6);

                            if ( (LA12_186=='n') ) {
                                int LA12_227 = input.LA(7);

                                if ( (LA12_227==':') ) {
                                    alt12=43;
                                }
                                else {
                                    alt12=60;}
                            }
                            else {
                                alt12=60;}
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                    }
                    break;
                case 'c':
                    {
                    int LA12_100 = input.LA(4);

                    if ( (LA12_100=='e') ) {
                        int LA12_143 = input.LA(5);

                        if ( (LA12_143=='s') ) {
                            int LA12_187 = input.LA(6);

                            if ( (LA12_187=='s') ) {
                                int LA12_228 = input.LA(7);

                                if ( (LA12_228=='o') ) {
                                    int LA12_261 = input.LA(8);

                                    if ( (LA12_261=='r') ) {
                                        int LA12_286 = input.LA(9);

                                        if ( (LA12_286=='y') ) {
                                            int LA12_305 = input.LA(10);

                                            if ( (LA12_305==':') ) {
                                                alt12=44;
                                            }
                                            else {
                                                alt12=60;}
                                        }
                                        else {
                                            alt12=60;}
                                    }
                                    else {
                                        alt12=60;}
                                }
                                else {
                                    alt12=60;}
                            }
                            else {
                                alt12=60;}
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                    }
                    break;
                default:
                    alt12=60;}

                }
                break;
            case 'p':
                {
                int LA12_44 = input.LA(3);

                if ( (LA12_44=='p') ) {
                    int LA12_101 = input.LA(4);

                    if ( (LA12_101=='l') ) {
                        int LA12_144 = input.LA(5);

                        if ( (LA12_144=='i') ) {
                            int LA12_188 = input.LA(6);

                            if ( (LA12_188=='c') ) {
                                int LA12_229 = input.LA(7);

                                if ( (LA12_229=='a') ) {
                                    int LA12_262 = input.LA(8);

                                    if ( (LA12_262=='t') ) {
                                        int LA12_287 = input.LA(9);

                                        if ( (LA12_287=='i') ) {
                                            int LA12_306 = input.LA(10);

                                            if ( (LA12_306=='o') ) {
                                                int LA12_316 = input.LA(11);

                                                if ( (LA12_316=='n') ) {
                                                    int LA12_324 = input.LA(12);

                                                    if ( ((LA12_324>='0' && LA12_324<='9')||(LA12_324>='A' && LA12_324<='Z')||LA12_324=='_'||(LA12_324>='a' && LA12_324<='z')) ) {
                                                        alt12=60;
                                                    }
                                                    else {
                                                        alt12=1;}
                                                }
                                                else {
                                                    alt12=60;}
                                            }
                                            else {
                                                alt12=60;}
                                        }
                                        else {
                                            alt12=60;}
                                    }
                                    else {
                                        alt12=60;}
                                }
                                else {
                                    alt12=60;}
                            }
                            else {
                                alt12=60;}
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                }
                else {
                    alt12=60;}
                }
                break;
            default:
                alt12=60;}

        }
        else if ( (LA12_0=='{') ) {
            alt12=2;
        }
        else if ( (LA12_0=='b') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA12_47 = input.LA(3);

                if ( (LA12_47=='c') ) {
                    int LA12_102 = input.LA(4);

                    if ( (LA12_102=='k') ) {
                        int LA12_145 = input.LA(5);

                        if ( (LA12_145=='g') ) {
                            int LA12_189 = input.LA(6);

                            if ( (LA12_189=='r') ) {
                                int LA12_230 = input.LA(7);

                                if ( (LA12_230=='o') ) {
                                    int LA12_263 = input.LA(8);

                                    if ( (LA12_263=='u') ) {
                                        int LA12_288 = input.LA(9);

                                        if ( (LA12_288=='n') ) {
                                            int LA12_307 = input.LA(10);

                                            if ( (LA12_307=='d') ) {
                                                int LA12_317 = input.LA(11);

                                                if ( (LA12_317==':') ) {
                                                    alt12=3;
                                                }
                                                else {
                                                    alt12=60;}
                                            }
                                            else {
                                                alt12=60;}
                                        }
                                        else {
                                            alt12=60;}
                                    }
                                    else {
                                        alt12=60;}
                                }
                                else {
                                    alt12=60;}
                            }
                            else {
                                alt12=60;}
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                }
                else {
                    alt12=60;}
                }
                break;
            case 'i':
                {
                int LA12_48 = input.LA(3);

                if ( (LA12_48=='n') ) {
                    int LA12_103 = input.LA(4);

                    if ( (LA12_103=='d') ) {
                        int LA12_146 = input.LA(5);

                        if ( (LA12_146=='(') ) {
                            alt12=18;
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                }
                else {
                    alt12=60;}
                }
                break;
            default:
                alt12=60;}

        }
        else if ( (LA12_0=='v') ) {
            int LA12_4 = input.LA(2);

            if ( (LA12_4=='i') ) {
                int LA12_49 = input.LA(3);

                if ( (LA12_49=='e') ) {
                    int LA12_104 = input.LA(4);

                    if ( (LA12_104=='w') ) {
                        int LA12_147 = input.LA(5);

                        if ( (LA12_147==':') ) {
                            alt12=4;
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                }
                else {
                    alt12=60;}
            }
            else {
                alt12=60;}
        }
        else if ( (LA12_0=='}') ) {
            alt12=5;
        }
        else if ( (LA12_0=='t') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA12_51 = input.LA(3);

                if ( (LA12_51=='b') ) {
                    switch ( input.LA(4) ) {
                    case 'v':
                        {
                        int LA12_148 = input.LA(5);

                        if ( (LA12_148=='i') ) {
                            int LA12_192 = input.LA(6);

                            if ( (LA12_192=='e') ) {
                                int LA12_231 = input.LA(7);

                                if ( (LA12_231=='w') ) {
                                    int LA12_264 = input.LA(8);

                                    if ( ((LA12_264>='0' && LA12_264<='9')||(LA12_264>='A' && LA12_264<='Z')||LA12_264=='_'||(LA12_264>='a' && LA12_264<='z')) ) {
                                        alt12=60;
                                    }
                                    else {
                                        alt12=31;}
                                }
                                else {
                                    alt12=60;}
                            }
                            else {
                                alt12=60;}
                        }
                        else {
                            alt12=60;}
                        }
                        break;
                    case 'l':
                        {
                        int LA12_149 = input.LA(5);

                        if ( (LA12_149=='e') ) {
                            int LA12_193 = input.LA(6);

                            if ( (LA12_193=='v') ) {
                                int LA12_232 = input.LA(7);

                                if ( (LA12_232=='i') ) {
                                    int LA12_265 = input.LA(8);

                                    if ( (LA12_265=='e') ) {
                                        int LA12_290 = input.LA(9);

                                        if ( (LA12_290=='w') ) {
                                            int LA12_308 = input.LA(10);

                                            if ( ((LA12_308>='0' && LA12_308<='9')||(LA12_308>='A' && LA12_308<='Z')||LA12_308=='_'||(LA12_308>='a' && LA12_308<='z')) ) {
                                                alt12=60;
                                            }
                                            else {
                                                alt12=35;}
                                        }
                                        else {
                                            alt12=60;}
                                    }
                                    else {
                                        alt12=60;}
                                }
                                else {
                                    alt12=60;}
                            }
                            else {
                                alt12=60;}
                        }
                        else {
                            alt12=60;}
                        }
                        break;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                        {
                        alt12=60;
                        }
                        break;
                    default:
                        alt12=32;}

                }
                else {
                    alt12=60;}
                }
                break;
            case 'i':
                {
                int LA12_52 = input.LA(3);

                if ( (LA12_52=='t') ) {
                    int LA12_106 = input.LA(4);

                    if ( (LA12_106=='l') ) {
                        int LA12_151 = input.LA(5);

                        if ( (LA12_151=='e') ) {
                            switch ( input.LA(6) ) {
                            case ':':
                                {
                                alt12=33;
                                }
                                break;
                            case 'I':
                                {
                                int LA12_234 = input.LA(7);

                                if ( (LA12_234=='m') ) {
                                    int LA12_266 = input.LA(8);

                                    if ( (LA12_266=='a') ) {
                                        int LA12_291 = input.LA(9);

                                        if ( (LA12_291=='g') ) {
                                            int LA12_309 = input.LA(10);

                                            if ( (LA12_309=='e') ) {
                                                int LA12_319 = input.LA(11);

                                                if ( (LA12_319==':') ) {
                                                    alt12=36;
                                                }
                                                else {
                                                    alt12=60;}
                                            }
                                            else {
                                                alt12=60;}
                                        }
                                        else {
                                            alt12=60;}
                                    }
                                    else {
                                        alt12=60;}
                                }
                                else {
                                    alt12=60;}
                                }
                                break;
                            default:
                                alt12=60;}

                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                }
                else {
                    alt12=60;}
                }
                break;
            case 'e':
                {
                int LA12_53 = input.LA(3);

                if ( (LA12_53=='x') ) {
                    int LA12_107 = input.LA(4);

                    if ( (LA12_107=='t') ) {
                        int LA12_152 = input.LA(5);

                        if ( (LA12_152==':') ) {
                            alt12=40;
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                }
                else {
                    alt12=60;}
                }
                break;
            case 'y':
                {
                int LA12_54 = input.LA(3);

                if ( (LA12_54=='p') ) {
                    int LA12_108 = input.LA(4);

                    if ( (LA12_108=='e') ) {
                        int LA12_153 = input.LA(5);

                        if ( ((LA12_153>='0' && LA12_153<='9')||(LA12_153>='A' && LA12_153<='Z')||LA12_153=='_'||(LA12_153>='a' && LA12_153<='z')) ) {
                            alt12=60;
                        }
                        else {
                            alt12=6;}
                    }
                    else {
                        alt12=60;}
                }
                else {
                    alt12=60;}
                }
                break;
            default:
                alt12=60;}

        }
        else if ( (LA12_0=='m') ) {
            int LA12_7 = input.LA(2);

            if ( (LA12_7=='a') ) {
                int LA12_55 = input.LA(3);

                if ( (LA12_55=='p') ) {
                    int LA12_109 = input.LA(4);

                    if ( (LA12_109=='s') ) {
                        int LA12_154 = input.LA(5);

                        if ( (LA12_154=='T') ) {
                            int LA12_197 = input.LA(6);

                            if ( (LA12_197=='o') ) {
                                int LA12_235 = input.LA(7);

                                if ( ((LA12_235>='0' && LA12_235<='9')||(LA12_235>='A' && LA12_235<='Z')||LA12_235=='_'||(LA12_235>='a' && LA12_235<='z')) ) {
                                    alt12=60;
                                }
                                else {
                                    alt12=7;}
                            }
                            else {
                                alt12=60;}
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                }
                else {
                    alt12=60;}
            }
            else {
                alt12=60;}
        }
        else if ( (LA12_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'x':
                {
                int LA12_56 = input.LA(3);

                if ( (LA12_56=='t') ) {
                    int LA12_110 = input.LA(4);

                    if ( (LA12_110=='e') ) {
                        int LA12_155 = input.LA(5);

                        if ( (LA12_155=='n') ) {
                            int LA12_198 = input.LA(6);

                            if ( (LA12_198=='d') ) {
                                int LA12_236 = input.LA(7);

                                if ( (LA12_236=='s') ) {
                                    int LA12_268 = input.LA(8);

                                    if ( ((LA12_268>='0' && LA12_268<='9')||(LA12_268>='A' && LA12_268<='Z')||LA12_268=='_'||(LA12_268>='a' && LA12_268<='z')) ) {
                                        alt12=60;
                                    }
                                    else {
                                        alt12=10;}
                                }
                                else {
                                    alt12=60;}
                            }
                            else {
                                alt12=60;}
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                }
                else {
                    alt12=60;}
                }
                break;
            case 'n':
                {
                int LA12_57 = input.LA(3);

                if ( (LA12_57=='t') ) {
                    int LA12_111 = input.LA(4);

                    if ( (LA12_111=='i') ) {
                        int LA12_156 = input.LA(5);

                        if ( (LA12_156=='t') ) {
                            int LA12_199 = input.LA(6);

                            if ( (LA12_199=='y') ) {
                                int LA12_237 = input.LA(7);

                                if ( ((LA12_237>='0' && LA12_237<='9')||(LA12_237>='A' && LA12_237<='Z')||LA12_237=='_'||(LA12_237>='a' && LA12_237<='z')) ) {
                                    alt12=60;
                                }
                                else {
                                    alt12=8;}
                            }
                            else {
                                alt12=60;}
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                }
                else {
                    alt12=60;}
                }
                break;
            default:
                alt12=60;}

        }
        else if ( (LA12_0=='c') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_58 = input.LA(3);

                if ( (LA12_58=='n') ) {
                    int LA12_112 = input.LA(4);

                    if ( (LA12_112=='t') ) {
                        int LA12_157 = input.LA(5);

                        if ( (LA12_157=='e') ) {
                            int LA12_200 = input.LA(6);

                            if ( (LA12_200=='n') ) {
                                int LA12_238 = input.LA(7);

                                if ( (LA12_238=='t') ) {
                                    int LA12_270 = input.LA(8);

                                    if ( (LA12_270=='p') ) {
                                        int LA12_293 = input.LA(9);

                                        if ( (LA12_293=='r') ) {
                                            int LA12_310 = input.LA(10);

                                            if ( (LA12_310=='o') ) {
                                                int LA12_320 = input.LA(11);

                                                if ( (LA12_320=='v') ) {
                                                    int LA12_327 = input.LA(12);

                                                    if ( (LA12_327=='i') ) {
                                                        int LA12_332 = input.LA(13);

                                                        if ( (LA12_332=='d') ) {
                                                            int LA12_333 = input.LA(14);

                                                            if ( (LA12_333=='e') ) {
                                                                int LA12_334 = input.LA(15);

                                                                if ( (LA12_334=='r') ) {
                                                                    int LA12_335 = input.LA(16);

                                                                    if ( ((LA12_335>='0' && LA12_335<='9')||(LA12_335>='A' && LA12_335<='Z')||LA12_335=='_'||(LA12_335>='a' && LA12_335<='z')) ) {
                                                                        alt12=60;
                                                                    }
                                                                    else {
                                                                        alt12=24;}
                                                                }
                                                                else {
                                                                    alt12=60;}
                                                            }
                                                            else {
                                                                alt12=60;}
                                                        }
                                                        else {
                                                            alt12=60;}
                                                    }
                                                    else {
                                                        alt12=60;}
                                                }
                                                else {
                                                    alt12=60;}
                                            }
                                            else {
                                                alt12=60;}
                                        }
                                        else {
                                            alt12=60;}
                                    }
                                    else {
                                        alt12=60;}
                                }
                                else {
                                    alt12=60;}
                            }
                            else {
                                alt12=60;}
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                }
                else {
                    alt12=60;}
                }
                break;
            case 'e':
                {
                int LA12_59 = input.LA(3);

                if ( (LA12_59=='l') ) {
                    int LA12_113 = input.LA(4);

                    if ( (LA12_113=='l') ) {
                        int LA12_158 = input.LA(5);

                        if ( ((LA12_158>='0' && LA12_158<='9')||(LA12_158>='A' && LA12_158<='Z')||LA12_158=='_'||(LA12_158>='a' && LA12_158<='z')) ) {
                            alt12=60;
                        }
                        else {
                            alt12=39;}
                    }
                    else {
                        alt12=60;}
                }
                else {
                    alt12=60;}
                }
                break;
            case 'u':
                {
                int LA12_60 = input.LA(3);

                if ( (LA12_60=='s') ) {
                    int LA12_114 = input.LA(4);

                    if ( (LA12_114=='t') ) {
                        int LA12_159 = input.LA(5);

                        if ( (LA12_159=='o') ) {
                            int LA12_202 = input.LA(6);

                            if ( (LA12_202=='m') ) {
                                int LA12_239 = input.LA(7);

                                if ( (LA12_239=='v') ) {
                                    int LA12_271 = input.LA(8);

                                    if ( (LA12_271=='i') ) {
                                        int LA12_294 = input.LA(9);

                                        if ( (LA12_294=='e') ) {
                                            int LA12_311 = input.LA(10);

                                            if ( (LA12_311=='w') ) {
                                                int LA12_321 = input.LA(11);

                                                if ( ((LA12_321>='0' && LA12_321<='9')||(LA12_321>='A' && LA12_321<='Z')||LA12_321=='_'||(LA12_321>='a' && LA12_321<='z')) ) {
                                                    alt12=60;
                                                }
                                                else {
                                                    alt12=45;}
                                            }
                                            else {
                                                alt12=60;}
                                        }
                                        else {
                                            alt12=60;}
                                    }
                                    else {
                                        alt12=60;}
                                }
                                else {
                                    alt12=60;}
                            }
                            else {
                                alt12=60;}
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                }
                else {
                    alt12=60;}
                }
                break;
            case 'l':
                {
                int LA12_61 = input.LA(3);

                if ( (LA12_61=='a') ) {
                    int LA12_115 = input.LA(4);

                    if ( (LA12_115=='s') ) {
                        int LA12_160 = input.LA(5);

                        if ( (LA12_160=='s') ) {
                            int LA12_203 = input.LA(6);

                            if ( ((LA12_203>='0' && LA12_203<='9')||(LA12_203>='A' && LA12_203<='Z')||LA12_203=='_'||(LA12_203>='a' && LA12_203<='z')) ) {
                                alt12=60;
                            }
                            else {
                                alt12=9;}
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                }
                else {
                    alt12=60;}
                }
                break;
            default:
                alt12=60;}

        }
        else if ( (LA12_0=='[') ) {
            int LA12_10 = input.LA(2);

            if ( (LA12_10==']') ) {
                alt12=11;
            }
            else {
                alt12=19;}
        }
        else if ( (LA12_0=='.') ) {
            alt12=12;
        }
        else if ( (LA12_0=='(') ) {
            alt12=13;
        }
        else if ( (LA12_0==')') ) {
            alt12=14;
        }
        else if ( (LA12_0=='r') ) {
            int LA12_14 = input.LA(2);

            if ( (LA12_14=='e') ) {
                switch ( input.LA(3) ) {
                case 'p':
                    {
                    int LA12_116 = input.LA(4);

                    if ( (LA12_116=='l') ) {
                        int LA12_161 = input.LA(5);

                        if ( (LA12_161=='a') ) {
                            int LA12_204 = input.LA(6);

                            if ( (LA12_204=='c') ) {
                                int LA12_241 = input.LA(7);

                                if ( (LA12_241=='e') ) {
                                    int LA12_272 = input.LA(8);

                                    if ( (LA12_272=='(') ) {
                                        alt12=15;
                                    }
                                    else {
                                        alt12=60;}
                                }
                                else {
                                    alt12=60;}
                            }
                            else {
                                alt12=60;}
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                    }
                    break;
                case 't':
                    {
                    int LA12_117 = input.LA(4);

                    if ( (LA12_117=='u') ) {
                        int LA12_162 = input.LA(5);

                        if ( (LA12_162=='r') ) {
                            int LA12_205 = input.LA(6);

                            if ( (LA12_205=='n') ) {
                                int LA12_242 = input.LA(7);

                                if ( (LA12_242=='s') ) {
                                    int LA12_273 = input.LA(8);

                                    if ( ((LA12_273>='0' && LA12_273<='9')||(LA12_273>='A' && LA12_273<='Z')||LA12_273=='_'||(LA12_273>='a' && LA12_273<='z')) ) {
                                        alt12=60;
                                    }
                                    else {
                                        alt12=25;}
                                }
                                else {
                                    alt12=60;}
                            }
                            else {
                                alt12=60;}
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                    }
                    break;
                default:
                    alt12=60;}

            }
            else {
                alt12=60;}
        }
        else if ( (LA12_0==',') ) {
            alt12=16;
        }
        else if ( (LA12_0=='u') ) {
            int LA12_16 = input.LA(2);

            if ( (LA12_16=='r') ) {
                int LA12_69 = input.LA(3);

                if ( (LA12_69=='l') ) {
                    int LA12_118 = input.LA(4);

                    if ( (LA12_118=='c') ) {
                        int LA12_163 = input.LA(5);

                        if ( (LA12_163=='o') ) {
                            int LA12_206 = input.LA(6);

                            if ( (LA12_206=='n') ) {
                                int LA12_243 = input.LA(7);

                                if ( (LA12_243=='f') ) {
                                    int LA12_274 = input.LA(8);

                                    if ( (LA12_274=='o') ) {
                                        int LA12_297 = input.LA(9);

                                        if ( (LA12_297=='r') ) {
                                            int LA12_312 = input.LA(10);

                                            if ( (LA12_312=='m') ) {
                                                int LA12_322 = input.LA(11);

                                                if ( (LA12_322=='(') ) {
                                                    alt12=17;
                                                }
                                                else {
                                                    alt12=60;}
                                            }
                                            else {
                                                alt12=60;}
                                        }
                                        else {
                                            alt12=60;}
                                    }
                                    else {
                                        alt12=60;}
                                }
                                else {
                                    alt12=60;}
                            }
                            else {
                                alt12=60;}
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                }
                else {
                    alt12=60;}
            }
            else {
                alt12=60;}
        }
        else if ( (LA12_0==']') ) {
            alt12=20;
        }
        else if ( (LA12_0=='s') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 'c':
                    {
                    int LA12_119 = input.LA(4);

                    if ( (LA12_119=='t') ) {
                        int LA12_164 = input.LA(5);

                        if ( (LA12_164=='i') ) {
                            int LA12_207 = input.LA(6);

                            if ( (LA12_207=='o') ) {
                                int LA12_244 = input.LA(7);

                                if ( (LA12_244=='n') ) {
                                    int LA12_275 = input.LA(8);

                                    if ( ((LA12_275>='0' && LA12_275<='9')||(LA12_275>='A' && LA12_275<='Z')||LA12_275=='_'||(LA12_275>='a' && LA12_275<='z')) ) {
                                        alt12=60;
                                    }
                                    else {
                                        alt12=38;}
                                }
                                else {
                                    alt12=60;}
                            }
                            else {
                                alt12=60;}
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                    }
                    break;
                case 'l':
                    {
                    int LA12_120 = input.LA(4);

                    if ( (LA12_120=='e') ) {
                        int LA12_165 = input.LA(5);

                        if ( (LA12_165=='c') ) {
                            int LA12_208 = input.LA(6);

                            if ( (LA12_208=='t') ) {
                                int LA12_245 = input.LA(7);

                                if ( (LA12_245=='s') ) {
                                    int LA12_276 = input.LA(8);

                                    if ( ((LA12_276>='0' && LA12_276<='9')||(LA12_276>='A' && LA12_276<='Z')||LA12_276=='_'||(LA12_276>='a' && LA12_276<='z')) ) {
                                        alt12=60;
                                    }
                                    else {
                                        alt12=29;}
                                }
                                else {
                                    alt12=60;}
                            }
                            else {
                                alt12=60;}
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                    }
                    break;
                default:
                    alt12=60;}

                }
                break;
            case 't':
                {
                switch ( input.LA(3) ) {
                case 'y':
                    {
                    int LA12_121 = input.LA(4);

                    if ( (LA12_121=='l') ) {
                        int LA12_166 = input.LA(5);

                        if ( (LA12_166=='e') ) {
                            int LA12_209 = input.LA(6);

                            if ( (LA12_209==':') ) {
                                alt12=37;
                            }
                            else {
                                alt12=60;}
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                    }
                    break;
                case 'o':
                    {
                    int LA12_122 = input.LA(4);

                    if ( (LA12_122=='r') ) {
                        int LA12_167 = input.LA(5);

                        if ( (LA12_167=='e') ) {
                            int LA12_210 = input.LA(6);

                            if ( (LA12_210=='s') ) {
                                int LA12_247 = input.LA(7);

                                if ( ((LA12_247>='0' && LA12_247<='9')||(LA12_247>='A' && LA12_247<='Z')||LA12_247=='_'||(LA12_247>='a' && LA12_247<='z')) ) {
                                    alt12=60;
                                }
                                else {
                                    alt12=26;}
                            }
                            else {
                                alt12=60;}
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                    }
                    break;
                default:
                    alt12=60;}

                }
                break;
            case 'p':
                {
                int LA12_73 = input.LA(3);

                if ( (LA12_73=='l') ) {
                    int LA12_123 = input.LA(4);

                    if ( (LA12_123=='i') ) {
                        int LA12_168 = input.LA(5);

                        if ( (LA12_168=='t') ) {
                            int LA12_211 = input.LA(6);

                            if ( (LA12_211=='(') ) {
                                alt12=21;
                            }
                            else {
                                alt12=60;}
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                }
                else {
                    alt12=60;}
                }
                break;
            default:
                alt12=60;}

        }
        else if ( (LA12_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA12_74 = input.LA(3);

                if ( (LA12_74=='o') ) {
                    int LA12_124 = input.LA(4);

                    if ( (LA12_124=='m') ) {
                        int LA12_169 = input.LA(5);

                        if ( ((LA12_169>='0' && LA12_169<='9')||(LA12_169>='A' && LA12_169<='Z')||LA12_169=='_'||(LA12_169>='a' && LA12_169<='z')) ) {
                            alt12=60;
                        }
                        else {
                            alt12=28;}
                    }
                    else {
                        alt12=60;}
                }
                else {
                    alt12=60;}
                }
                break;
            case 'o':
                {
                int LA12_75 = input.LA(3);

                if ( (LA12_75=='r') ) {
                    int LA12_125 = input.LA(4);

                    if ( ((LA12_125>='0' && LA12_125<='9')||(LA12_125>='A' && LA12_125<='Z')||LA12_125=='_'||(LA12_125>='a' && LA12_125<='z')) ) {
                        alt12=60;
                    }
                    else {
                        alt12=22;}
                }
                else {
                    alt12=60;}
                }
                break;
            case 'e':
                {
                int LA12_76 = input.LA(3);

                if ( (LA12_76=='t') ) {
                    int LA12_126 = input.LA(4);

                    if ( (LA12_126=='c') ) {
                        int LA12_171 = input.LA(5);

                        if ( (LA12_171=='h') ) {
                            int LA12_213 = input.LA(6);

                            if ( (LA12_213=='e') ) {
                                int LA12_249 = input.LA(7);

                                if ( (LA12_249=='s') ) {
                                    int LA12_278 = input.LA(8);

                                    if ( ((LA12_278>='0' && LA12_278<='9')||(LA12_278>='A' && LA12_278<='Z')||LA12_278=='_'||(LA12_278>='a' && LA12_278<='z')) ) {
                                        alt12=60;
                                    }
                                    else {
                                        alt12=27;}
                                }
                                else {
                                    alt12=60;}
                            }
                            else {
                                alt12=60;}
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                }
                else {
                    alt12=60;}
                }
                break;
            default:
                alt12=60;}

        }
        else if ( (LA12_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA12_77 = input.LA(3);

                if ( ((LA12_77>='0' && LA12_77<='9')||(LA12_77>='A' && LA12_77<='Z')||LA12_77=='_'||(LA12_77>='a' && LA12_77<='z')) ) {
                    alt12=60;
                }
                else {
                    alt12=23;}
                }
                break;
            case 'm':
                {
                int LA12_78 = input.LA(3);

                if ( (LA12_78=='a') ) {
                    int LA12_128 = input.LA(4);

                    if ( (LA12_128=='g') ) {
                        int LA12_172 = input.LA(5);

                        if ( (LA12_172=='e') ) {
                            int LA12_214 = input.LA(6);

                            if ( (LA12_214==':') ) {
                                alt12=42;
                            }
                            else {
                                alt12=60;}
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                }
                else {
                    alt12=60;}
                }
                break;
            case 'c':
                {
                int LA12_79 = input.LA(3);

                if ( (LA12_79=='o') ) {
                    int LA12_129 = input.LA(4);

                    if ( (LA12_129=='n') ) {
                        int LA12_173 = input.LA(5);

                        if ( (LA12_173==':') ) {
                            alt12=34;
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                }
                else {
                    alt12=60;}
                }
                break;
            default:
                alt12=60;}

        }
        else if ( (LA12_0=='=') ) {
            alt12=30;
        }
        else if ( (LA12_0=='d') ) {
            int LA12_22 = input.LA(2);

            if ( (LA12_22=='e') ) {
                int LA12_81 = input.LA(3);

                if ( (LA12_81=='t') ) {
                    int LA12_130 = input.LA(4);

                    if ( (LA12_130=='a') ) {
                        int LA12_174 = input.LA(5);

                        if ( (LA12_174=='i') ) {
                            int LA12_216 = input.LA(6);

                            if ( (LA12_216=='l') ) {
                                int LA12_251 = input.LA(7);

                                if ( (LA12_251=='T') ) {
                                    int LA12_279 = input.LA(8);

                                    if ( (LA12_279=='e') ) {
                                        int LA12_301 = input.LA(9);

                                        if ( (LA12_301=='x') ) {
                                            int LA12_313 = input.LA(10);

                                            if ( (LA12_313=='t') ) {
                                                int LA12_323 = input.LA(11);

                                                if ( (LA12_323==':') ) {
                                                    alt12=41;
                                                }
                                                else {
                                                    alt12=60;}
                                            }
                                            else {
                                                alt12=60;}
                                        }
                                        else {
                                            alt12=60;}
                                    }
                                    else {
                                        alt12=60;}
                                }
                                else {
                                    alt12=60;}
                            }
                            else {
                                alt12=60;}
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                }
                else {
                    alt12=60;}
            }
            else {
                alt12=60;}
        }
        else if ( (LA12_0=='@') ) {
            int LA12_23 = input.LA(2);

            if ( (LA12_23=='s') ) {
                alt12=46;
            }
            else {
                alt12=66;}
        }
        else if ( (LA12_0==':') ) {
            alt12=47;
        }
        else if ( (LA12_0=='X') ) {
            int LA12_25 = input.LA(2);

            if ( (LA12_25=='M') ) {
                int LA12_84 = input.LA(3);

                if ( (LA12_84=='L') ) {
                    int LA12_131 = input.LA(4);

                    if ( ((LA12_131>='0' && LA12_131<='9')||(LA12_131>='A' && LA12_131<='Z')||LA12_131=='_'||(LA12_131>='a' && LA12_131<='z')) ) {
                        alt12=60;
                    }
                    else {
                        alt12=48;}
                }
                else {
                    alt12=60;}
            }
            else {
                alt12=60;}
        }
        else if ( (LA12_0=='J') ) {
            int LA12_26 = input.LA(2);

            if ( (LA12_26=='S') ) {
                int LA12_85 = input.LA(3);

                if ( (LA12_85=='O') ) {
                    int LA12_132 = input.LA(4);

                    if ( (LA12_132=='N') ) {
                        int LA12_176 = input.LA(5);

                        if ( ((LA12_176>='0' && LA12_176<='9')||(LA12_176>='A' && LA12_176<='Z')||LA12_176=='_'||(LA12_176>='a' && LA12_176<='z')) ) {
                            alt12=60;
                        }
                        else {
                            alt12=49;}
                    }
                    else {
                        alt12=60;}
                }
                else {
                    alt12=60;}
            }
            else {
                alt12=60;}
        }
        else if ( (LA12_0=='P') ) {
            int LA12_27 = input.LA(2);

            if ( (LA12_27=='l') ) {
                int LA12_86 = input.LA(3);

                if ( (LA12_86=='a') ) {
                    int LA12_133 = input.LA(4);

                    if ( (LA12_133=='i') ) {
                        int LA12_177 = input.LA(5);

                        if ( (LA12_177=='n') ) {
                            int LA12_218 = input.LA(6);

                            if ( ((LA12_218>='0' && LA12_218<='9')||(LA12_218>='A' && LA12_218<='Z')||LA12_218=='_'||(LA12_218>='a' && LA12_218<='z')) ) {
                                alt12=60;
                            }
                            else {
                                alt12=50;}
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                }
                else {
                    alt12=60;}
            }
            else {
                alt12=60;}
        }
        else if ( (LA12_0=='G') ) {
            int LA12_28 = input.LA(2);

            if ( (LA12_28=='r') ) {
                int LA12_87 = input.LA(3);

                if ( (LA12_87=='o') ) {
                    int LA12_134 = input.LA(4);

                    if ( (LA12_134=='u') ) {
                        int LA12_178 = input.LA(5);

                        if ( (LA12_178=='p') ) {
                            int LA12_219 = input.LA(6);

                            if ( (LA12_219=='e') ) {
                                int LA12_253 = input.LA(7);

                                if ( (LA12_253=='d') ) {
                                    int LA12_280 = input.LA(8);

                                    if ( ((LA12_280>='0' && LA12_280<='9')||(LA12_280>='A' && LA12_280<='Z')||LA12_280=='_'||(LA12_280>='a' && LA12_280<='z')) ) {
                                        alt12=60;
                                    }
                                    else {
                                        alt12=51;}
                                }
                                else {
                                    alt12=60;}
                            }
                            else {
                                alt12=60;}
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                }
                else {
                    alt12=60;}
            }
            else {
                alt12=60;}
        }
        else if ( (LA12_0=='D') ) {
            int LA12_29 = input.LA(2);

            if ( (LA12_29=='e') ) {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA12_135 = input.LA(4);

                    if ( (LA12_135=='a') ) {
                        int LA12_179 = input.LA(5);

                        if ( (LA12_179=='i') ) {
                            int LA12_220 = input.LA(6);

                            if ( (LA12_220=='l') ) {
                                int LA12_254 = input.LA(7);

                                if ( ((LA12_254>='0' && LA12_254<='9')||(LA12_254>='A' && LA12_254<='Z')||LA12_254=='_'||(LA12_254>='a' && LA12_254<='z')) ) {
                                    alt12=60;
                                }
                                else {
                                    alt12=58;}
                            }
                            else {
                                alt12=60;}
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                    }
                    break;
                case 'f':
                    {
                    int LA12_136 = input.LA(4);

                    if ( (LA12_136=='a') ) {
                        int LA12_180 = input.LA(5);

                        if ( (LA12_180=='u') ) {
                            int LA12_221 = input.LA(6);

                            if ( (LA12_221=='l') ) {
                                int LA12_255 = input.LA(7);

                                if ( (LA12_255=='t') ) {
                                    int LA12_282 = input.LA(8);

                                    if ( ((LA12_282>='0' && LA12_282<='9')||(LA12_282>='A' && LA12_282<='Z')||LA12_282=='_'||(LA12_282>='a' && LA12_282<='z')) ) {
                                        alt12=60;
                                    }
                                    else {
                                        alt12=52;}
                                }
                                else {
                                    alt12=60;}
                            }
                            else {
                                alt12=60;}
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                    }
                    break;
                default:
                    alt12=60;}

            }
            else {
                alt12=60;}
        }
        else if ( (LA12_0=='V') ) {
            int LA12_30 = input.LA(2);

            if ( (LA12_30=='a') ) {
                int LA12_89 = input.LA(3);

                if ( (LA12_89=='l') ) {
                    int LA12_137 = input.LA(4);

                    if ( (LA12_137=='u') ) {
                        int LA12_181 = input.LA(5);

                        if ( (LA12_181=='e') ) {
                            switch ( input.LA(6) ) {
                            case '2':
                                {
                                int LA12_256 = input.LA(7);

                                if ( ((LA12_256>='0' && LA12_256<='9')||(LA12_256>='A' && LA12_256<='Z')||LA12_256=='_'||(LA12_256>='a' && LA12_256<='z')) ) {
                                    alt12=60;
                                }
                                else {
                                    alt12=54;}
                                }
                                break;
                            case '1':
                                {
                                int LA12_257 = input.LA(7);

                                if ( ((LA12_257>='0' && LA12_257<='9')||(LA12_257>='A' && LA12_257<='Z')||LA12_257=='_'||(LA12_257>='a' && LA12_257<='z')) ) {
                                    alt12=60;
                                }
                                else {
                                    alt12=53;}
                                }
                                break;
                            default:
                                alt12=60;}

                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                }
                else {
                    alt12=60;}
            }
            else {
                alt12=60;}
        }
        else if ( (LA12_0=='S') ) {
            int LA12_31 = input.LA(2);

            if ( (LA12_31=='u') ) {
                int LA12_90 = input.LA(3);

                if ( (LA12_90=='b') ) {
                    int LA12_138 = input.LA(4);

                    if ( (LA12_138=='t') ) {
                        int LA12_182 = input.LA(5);

                        if ( (LA12_182=='i') ) {
                            int LA12_223 = input.LA(6);

                            if ( (LA12_223=='t') ) {
                                int LA12_258 = input.LA(7);

                                if ( (LA12_258=='l') ) {
                                    int LA12_285 = input.LA(8);

                                    if ( (LA12_285=='e') ) {
                                        int LA12_304 = input.LA(9);

                                        if ( ((LA12_304>='0' && LA12_304<='9')||(LA12_304>='A' && LA12_304<='Z')||LA12_304=='_'||(LA12_304>='a' && LA12_304<='z')) ) {
                                            alt12=60;
                                        }
                                        else {
                                            alt12=55;}
                                    }
                                    else {
                                        alt12=60;}
                                }
                                else {
                                    alt12=60;}
                            }
                            else {
                                alt12=60;}
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                }
                else {
                    alt12=60;}
            }
            else {
                alt12=60;}
        }
        else if ( (LA12_0=='N') ) {
            int LA12_32 = input.LA(2);

            if ( (LA12_32=='o') ) {
                int LA12_91 = input.LA(3);

                if ( (LA12_91=='n') ) {
                    int LA12_139 = input.LA(4);

                    if ( (LA12_139=='e') ) {
                        int LA12_183 = input.LA(5);

                        if ( ((LA12_183>='0' && LA12_183<='9')||(LA12_183>='A' && LA12_183<='Z')||LA12_183=='_'||(LA12_183>='a' && LA12_183<='z')) ) {
                            alt12=60;
                        }
                        else {
                            alt12=56;}
                    }
                    else {
                        alt12=60;}
                }
                else {
                    alt12=60;}
            }
            else {
                alt12=60;}
        }
        else if ( (LA12_0=='L') ) {
            int LA12_33 = input.LA(2);

            if ( (LA12_33=='i') ) {
                int LA12_92 = input.LA(3);

                if ( (LA12_92=='n') ) {
                    int LA12_140 = input.LA(4);

                    if ( (LA12_140=='k') ) {
                        int LA12_184 = input.LA(5);

                        if ( ((LA12_184>='0' && LA12_184<='9')||(LA12_184>='A' && LA12_184<='Z')||LA12_184=='_'||(LA12_184>='a' && LA12_184<='z')) ) {
                            alt12=60;
                        }
                        else {
                            alt12=57;}
                    }
                    else {
                        alt12=60;}
                }
                else {
                    alt12=60;}
            }
            else {
                alt12=60;}
        }
        else if ( (LA12_0=='C') ) {
            int LA12_34 = input.LA(2);

            if ( (LA12_34=='h') ) {
                int LA12_93 = input.LA(3);

                if ( (LA12_93=='e') ) {
                    int LA12_141 = input.LA(4);

                    if ( (LA12_141=='c') ) {
                        int LA12_185 = input.LA(5);

                        if ( (LA12_185=='k') ) {
                            int LA12_226 = input.LA(6);

                            if ( ((LA12_226>='0' && LA12_226<='9')||(LA12_226>='A' && LA12_226<='Z')||LA12_226=='_'||(LA12_226>='a' && LA12_226<='z')) ) {
                                alt12=60;
                            }
                            else {
                                alt12=59;}
                        }
                        else {
                            alt12=60;}
                    }
                    else {
                        alt12=60;}
                }
                else {
                    alt12=60;}
            }
            else {
                alt12=60;}
        }
        else if ( (LA12_0=='^') ) {
            int LA12_35 = input.LA(2);

            if ( ((LA12_35>='A' && LA12_35<='Z')||LA12_35=='_'||(LA12_35>='a' && LA12_35<='z')) ) {
                alt12=60;
            }
            else {
                alt12=66;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='B')||(LA12_0>='E' && LA12_0<='F')||(LA12_0>='H' && LA12_0<='I')||LA12_0=='K'||LA12_0=='M'||LA12_0=='O'||(LA12_0>='Q' && LA12_0<='R')||(LA12_0>='T' && LA12_0<='U')||LA12_0=='W'||(LA12_0>='Y' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='l')||(LA12_0>='n' && LA12_0<='q')||(LA12_0>='w' && LA12_0<='z')) ) {
            alt12=60;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=61;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_38 = input.LA(2);

            if ( ((LA12_38>='\u0000' && LA12_38<='\uFFFE')) ) {
                alt12=62;
            }
            else {
                alt12=66;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_39 = input.LA(2);

            if ( ((LA12_39>='\u0000' && LA12_39<='\uFFFE')) ) {
                alt12=62;
            }
            else {
                alt12=66;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt12=64;
                }
                break;
            case '*':
                {
                alt12=63;
                }
                break;
            default:
                alt12=66;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=65;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||LA12_0=='-'||(LA12_0>=';' && LA12_0<='<')||(LA12_0>='>' && LA12_0<='?')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12=66;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:122: T39
                {
                mT39(); 

                }
                break;
            case 30 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:126: T40
                {
                mT40(); 

                }
                break;
            case 31 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:130: T41
                {
                mT41(); 

                }
                break;
            case 32 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:134: T42
                {
                mT42(); 

                }
                break;
            case 33 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:138: T43
                {
                mT43(); 

                }
                break;
            case 34 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:142: T44
                {
                mT44(); 

                }
                break;
            case 35 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:146: T45
                {
                mT45(); 

                }
                break;
            case 36 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:150: T46
                {
                mT46(); 

                }
                break;
            case 37 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:154: T47
                {
                mT47(); 

                }
                break;
            case 38 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:158: T48
                {
                mT48(); 

                }
                break;
            case 39 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:162: T49
                {
                mT49(); 

                }
                break;
            case 40 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:166: T50
                {
                mT50(); 

                }
                break;
            case 41 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:170: T51
                {
                mT51(); 

                }
                break;
            case 42 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:174: T52
                {
                mT52(); 

                }
                break;
            case 43 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:178: T53
                {
                mT53(); 

                }
                break;
            case 44 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:182: T54
                {
                mT54(); 

                }
                break;
            case 45 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:186: T55
                {
                mT55(); 

                }
                break;
            case 46 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:190: T56
                {
                mT56(); 

                }
                break;
            case 47 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:194: T57
                {
                mT57(); 

                }
                break;
            case 48 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:198: T58
                {
                mT58(); 

                }
                break;
            case 49 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:202: T59
                {
                mT59(); 

                }
                break;
            case 50 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:206: T60
                {
                mT60(); 

                }
                break;
            case 51 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:210: T61
                {
                mT61(); 

                }
                break;
            case 52 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:214: T62
                {
                mT62(); 

                }
                break;
            case 53 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:218: T63
                {
                mT63(); 

                }
                break;
            case 54 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:222: T64
                {
                mT64(); 

                }
                break;
            case 55 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:226: T65
                {
                mT65(); 

                }
                break;
            case 56 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:230: T66
                {
                mT66(); 

                }
                break;
            case 57 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:234: T67
                {
                mT67(); 

                }
                break;
            case 58 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:238: T68
                {
                mT68(); 

                }
                break;
            case 59 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:242: T69
                {
                mT69(); 

                }
                break;
            case 60 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:246: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 61 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:254: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 62 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:263: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 63 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:275: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 64 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:291: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 65 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:307: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 66 :
                // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1:315: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}