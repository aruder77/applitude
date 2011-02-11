package org.applause.applausedsl.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.applause.applausedsl.services.ApplauseDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalApplauseDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'application'", "'{'", "'background:'", "'view:'", "'}'", "'type'", "'mapsTo'", "'entity'", "'class'", "'extends'", "'[]'", "'.'", "'('", "')'", "'replace('", "','", "'urlconform('", "'bind('", "'['", "']'", "'split('", "'for'", "'in'", "'contentprovider'", "'returns'", "'stores'", "'fetches'", "'from'", "'selects'", "'='", "'tabview'", "'tab'", "'title:'", "'icon:'", "'tableview'", "'titleImage:'", "'style:'", "'section'", "'cell'", "'text:'", "'detailText:'", "'image:'", "'action:'", "'accessory:'", "'customview'", "'@selector'", "':'", "'XML'", "'JSON'", "'Plain'", "'Grouped'", "'Default'", "'Value1'", "'Value2'", "'Subtitle'", "'None'", "'Link'", "'Detail'", "'Check'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalApplauseDslParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g"; }



     	private ApplauseDslGrammarAccess grammarAccess;
     	
        public InternalApplauseDslParser(TokenStream input, IAstFactory factory, ApplauseDslGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ApplauseDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleModel
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:78:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:79:2: (iv_ruleModel= ruleModel EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:80:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();
            _fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:87:1: ruleModel returns [EObject current=null] : ( ( (lv_application_0_0= ruleApplication ) ) ( (lv_elements_1_0= ruleModelElement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_application_0_0 = null;

        EObject lv_elements_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:92:6: ( ( ( (lv_application_0_0= ruleApplication ) ) ( (lv_elements_1_0= ruleModelElement ) )* ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:93:1: ( ( (lv_application_0_0= ruleApplication ) ) ( (lv_elements_1_0= ruleModelElement ) )* )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:93:1: ( ( (lv_application_0_0= ruleApplication ) ) ( (lv_elements_1_0= ruleModelElement ) )* )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:93:2: ( (lv_application_0_0= ruleApplication ) ) ( (lv_elements_1_0= ruleModelElement ) )*
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:93:2: ( (lv_application_0_0= ruleApplication ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:94:1: (lv_application_0_0= ruleApplication )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:94:1: (lv_application_0_0= ruleApplication )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:95:3: lv_application_0_0= ruleApplication
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getApplicationApplicationParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleApplication_in_ruleModel131);
            lv_application_0_0=ruleApplication();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"application",
            	        		lv_application_0_0, 
            	        		"Application", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:117:2: ( (lv_elements_1_0= ruleModelElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16||LA1_0==18||LA1_0==34||LA1_0==41||LA1_0==45||LA1_0==55) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:118:1: (lv_elements_1_0= ruleModelElement )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:118:1: (lv_elements_1_0= ruleModelElement )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:119:3: lv_elements_1_0= ruleModelElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleModelElement_in_ruleModel152);
            	    lv_elements_1_0=ruleModelElement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"elements",
            	    	        		lv_elements_1_0, 
            	    	        		"ModelElement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleApplication
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:149:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:150:2: (iv_ruleApplication= ruleApplication EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:151:2: iv_ruleApplication= ruleApplication EOF
            {
             currentNode = createCompositeNode(grammarAccess.getApplicationRule(), currentNode); 
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication189);
            iv_ruleApplication=ruleApplication();
            _fsp--;

             current =iv_ruleApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication199); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleApplication


    // $ANTLR start ruleApplication
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:158:1: ruleApplication returns [EObject current=null] : ( 'application' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( ( ( ({...}? => ( ( 'background:' ( (lv_background_5_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_startView_7_0= ruleViewCall ) ) ) ) ) )+ {...}?) ) ) '}' ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_background_5_0 = null;

        EObject lv_startView_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:163:6: ( ( 'application' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( ( ( ({...}? => ( ( 'background:' ( (lv_background_5_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_startView_7_0= ruleViewCall ) ) ) ) ) )+ {...}?) ) ) '}' ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:164:1: ( 'application' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( ( ( ({...}? => ( ( 'background:' ( (lv_background_5_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_startView_7_0= ruleViewCall ) ) ) ) ) )+ {...}?) ) ) '}' )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:164:1: ( 'application' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( ( ( ({...}? => ( ( 'background:' ( (lv_background_5_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_startView_7_0= ruleViewCall ) ) ) ) ) )+ {...}?) ) ) '}' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:164:3: 'application' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( ( ( ({...}? => ( ( 'background:' ( (lv_background_5_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_startView_7_0= ruleViewCall ) ) ) ) ) )+ {...}?) ) ) '}'
            {
            match(input,11,FOLLOW_11_in_ruleApplication234); 

                    createLeafNode(grammarAccess.getApplicationAccess().getApplicationKeyword_0(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:168:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:169:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:169:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:170:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplication251); 

            			createLeafNode(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleApplication266); 

                    createLeafNode(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:196:1: ( ( ( ( ({...}? => ( ( 'background:' ( (lv_background_5_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_startView_7_0= ruleViewCall ) ) ) ) ) )+ {...}?) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:198:1: ( ( ( ({...}? => ( ( 'background:' ( (lv_background_5_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_startView_7_0= ruleViewCall ) ) ) ) ) )+ {...}?) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:198:1: ( ( ( ({...}? => ( ( 'background:' ( (lv_background_5_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_startView_7_0= ruleViewCall ) ) ) ) ) )+ {...}?) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:199:2: ( ( ({...}? => ( ( 'background:' ( (lv_background_5_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_startView_7_0= ruleViewCall ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getApplicationAccess().getUnorderedGroup_3());
            	
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:202:2: ( ( ({...}? => ( ( 'background:' ( (lv_background_5_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_startView_7_0= ruleViewCall ) ) ) ) ) )+ {...}?)
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:203:3: ( ({...}? => ( ( 'background:' ( (lv_background_5_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_startView_7_0= ruleViewCall ) ) ) ) ) )+ {...}?
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:203:3: ( ({...}? => ( ( 'background:' ( (lv_background_5_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_startView_7_0= ruleViewCall ) ) ) ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( LA2_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getApplicationAccess().getUnorderedGroup_3(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getApplicationAccess().getUnorderedGroup_3(), 1) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:205:4: ({...}? => ( ( 'background:' ( (lv_background_5_0= ruleScalarExpression ) ) ) ) )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:205:4: ({...}? => ( ( 'background:' ( (lv_background_5_0= ruleScalarExpression ) ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:206:5: {...}? => ( ( 'background:' ( (lv_background_5_0= ruleScalarExpression ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getApplicationAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleApplication", "getUnorderedGroupHelper().canSelect(grammarAccess.getApplicationAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:206:108: ( ( 'background:' ( (lv_background_5_0= ruleScalarExpression ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:207:6: ( 'background:' ( (lv_background_5_0= ruleScalarExpression ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getApplicationAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:210:6: ( 'background:' ( (lv_background_5_0= ruleScalarExpression ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:210:8: 'background:' ( (lv_background_5_0= ruleScalarExpression ) )
            	    {
            	    match(input,13,FOLLOW_13_in_ruleApplication319); 

            	            createLeafNode(grammarAccess.getApplicationAccess().getBackgroundKeyword_3_0_0(), null); 
            	        
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:214:1: ( (lv_background_5_0= ruleScalarExpression ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:215:1: (lv_background_5_0= ruleScalarExpression )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:215:1: (lv_background_5_0= ruleScalarExpression )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:216:3: lv_background_5_0= ruleScalarExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getApplicationAccess().getBackgroundScalarExpressionParserRuleCall_3_0_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleScalarExpression_in_ruleApplication340);
            	    lv_background_5_0=ruleScalarExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"background",
            	    	        		lv_background_5_0, 
            	    	        		"ScalarExpression", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getApplicationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:245:4: ({...}? => ( ( 'view:' ( (lv_startView_7_0= ruleViewCall ) ) ) ) )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:245:4: ({...}? => ( ( 'view:' ( (lv_startView_7_0= ruleViewCall ) ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:246:5: {...}? => ( ( 'view:' ( (lv_startView_7_0= ruleViewCall ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getApplicationAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleApplication", "getUnorderedGroupHelper().canSelect(grammarAccess.getApplicationAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:246:108: ( ( 'view:' ( (lv_startView_7_0= ruleViewCall ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:247:6: ( 'view:' ( (lv_startView_7_0= ruleViewCall ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getApplicationAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:250:6: ( 'view:' ( (lv_startView_7_0= ruleViewCall ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:250:8: 'view:' ( (lv_startView_7_0= ruleViewCall ) )
            	    {
            	    match(input,14,FOLLOW_14_in_ruleApplication402); 

            	            createLeafNode(grammarAccess.getApplicationAccess().getViewKeyword_3_1_0(), null); 
            	        
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:254:1: ( (lv_startView_7_0= ruleViewCall ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:255:1: (lv_startView_7_0= ruleViewCall )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:255:1: (lv_startView_7_0= ruleViewCall )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:256:3: lv_startView_7_0= ruleViewCall
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getApplicationAccess().getStartViewViewCallParserRuleCall_3_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleViewCall_in_ruleApplication423);
            	    lv_startView_7_0=ruleViewCall();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"startView",
            	    	        		lv_startView_7_0, 
            	    	        		"ViewCall", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getApplicationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getApplicationAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleApplication", "getUnorderedGroupHelper().canLeave(grammarAccess.getApplicationAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getApplicationAccess().getUnorderedGroup_3());
            	

            }

            match(input,15,FOLLOW_15_in_ruleApplication479); 

                    createLeafNode(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleApplication


    // $ANTLR start entryRuleModelElement
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:305:1: entryRuleModelElement returns [EObject current=null] : iv_ruleModelElement= ruleModelElement EOF ;
    public final EObject entryRuleModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElement = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:306:2: (iv_ruleModelElement= ruleModelElement EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:307:2: iv_ruleModelElement= ruleModelElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleModelElement_in_entryRuleModelElement515);
            iv_ruleModelElement=ruleModelElement();
            _fsp--;

             current =iv_ruleModelElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelElement525); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModelElement


    // $ANTLR start ruleModelElement
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:314:1: ruleModelElement returns [EObject current=null] : (this_Type_0= ruleType | this_ParameterizedModelElement_1= ruleParameterizedModelElement ) ;
    public final EObject ruleModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_Type_0 = null;

        EObject this_ParameterizedModelElement_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:319:6: ( (this_Type_0= ruleType | this_ParameterizedModelElement_1= ruleParameterizedModelElement ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:320:1: (this_Type_0= ruleType | this_ParameterizedModelElement_1= ruleParameterizedModelElement )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:320:1: (this_Type_0= ruleType | this_ParameterizedModelElement_1= ruleParameterizedModelElement )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16||LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==34||LA3_0==41||LA3_0==45||LA3_0==55) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("320:1: (this_Type_0= ruleType | this_ParameterizedModelElement_1= ruleParameterizedModelElement )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:321:5: this_Type_0= ruleType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModelElementAccess().getTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleModelElement572);
                    this_Type_0=ruleType();
                    _fsp--;

                     
                            current = this_Type_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:331:5: this_ParameterizedModelElement_1= ruleParameterizedModelElement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModelElementAccess().getParameterizedModelElementParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleParameterizedModelElement_in_ruleModelElement599);
                    this_ParameterizedModelElement_1=ruleParameterizedModelElement();
                    _fsp--;

                     
                            current = this_ParameterizedModelElement_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModelElement


    // $ANTLR start entryRuleType
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:347:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:348:2: (iv_ruleType= ruleType EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:349:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType634);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType644); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:356:1: ruleType returns [EObject current=null] : (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleType_0 = null;

        EObject this_Entity_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:361:6: ( (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:362:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:362:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("362:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:363:5: this_SimpleType_0= ruleSimpleType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSimpleType_in_ruleType691);
                    this_SimpleType_0=ruleSimpleType();
                    _fsp--;

                     
                            current = this_SimpleType_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:373:5: this_Entity_1= ruleEntity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleType718);
                    this_Entity_1=ruleEntity();
                    _fsp--;

                     
                            current = this_Entity_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRuleSimpleType
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:389:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:390:2: (iv_ruleSimpleType= ruleSimpleType EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:391:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSimpleTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType753);
            iv_ruleSimpleType=ruleSimpleType();
            _fsp--;

             current =iv_ruleSimpleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType763); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSimpleType


    // $ANTLR start ruleSimpleType
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:398:1: ruleSimpleType returns [EObject current=null] : ( 'type' ( (lv_name_1_0= RULE_ID ) ) 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_platformType_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:403:6: ( ( 'type' ( (lv_name_1_0= RULE_ID ) ) 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:404:1: ( 'type' ( (lv_name_1_0= RULE_ID ) ) 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:404:1: ( 'type' ( (lv_name_1_0= RULE_ID ) ) 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:404:3: 'type' ( (lv_name_1_0= RULE_ID ) ) 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) )
            {
            match(input,16,FOLLOW_16_in_ruleSimpleType798); 

                    createLeafNode(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:408:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:409:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:409:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:410:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleType815); 

            			createLeafNode(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSimpleTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,17,FOLLOW_17_in_ruleSimpleType830); 

                    createLeafNode(grammarAccess.getSimpleTypeAccess().getMapsToKeyword_2(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:436:1: ( (lv_platformType_3_0= RULE_STRING ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:437:1: (lv_platformType_3_0= RULE_STRING )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:437:1: (lv_platformType_3_0= RULE_STRING )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:438:3: lv_platformType_3_0= RULE_STRING
            {
            lv_platformType_3_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleType847); 

            			createLeafNode(grammarAccess.getSimpleTypeAccess().getPlatformTypeSTRINGTerminalRuleCall_3_0(), "platformType"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSimpleTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"platformType",
            	        		lv_platformType_3_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSimpleType


    // $ANTLR start entryRuleEntity
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:468:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:469:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:470:2: iv_ruleEntity= ruleEntity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity888);
            iv_ruleEntity=ruleEntity();
            _fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity898); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:477:1: ruleEntity returns [EObject current=null] : ( 'entity' ( (lv_runtimeType_1_0= 'class' ) )? ( (lv_name_2_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_properties_6_0= ruleProperty ) )* '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_runtimeType_1_0=null;
        Token lv_name_2_0=null;
        EObject lv_properties_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:482:6: ( ( 'entity' ( (lv_runtimeType_1_0= 'class' ) )? ( (lv_name_2_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_properties_6_0= ruleProperty ) )* '}' ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:483:1: ( 'entity' ( (lv_runtimeType_1_0= 'class' ) )? ( (lv_name_2_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_properties_6_0= ruleProperty ) )* '}' )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:483:1: ( 'entity' ( (lv_runtimeType_1_0= 'class' ) )? ( (lv_name_2_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_properties_6_0= ruleProperty ) )* '}' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:483:3: 'entity' ( (lv_runtimeType_1_0= 'class' ) )? ( (lv_name_2_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_properties_6_0= ruleProperty ) )* '}'
            {
            match(input,18,FOLLOW_18_in_ruleEntity933); 

                    createLeafNode(grammarAccess.getEntityAccess().getEntityKeyword_0(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:487:1: ( (lv_runtimeType_1_0= 'class' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:488:1: (lv_runtimeType_1_0= 'class' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:488:1: (lv_runtimeType_1_0= 'class' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:489:3: lv_runtimeType_1_0= 'class'
                    {
                    lv_runtimeType_1_0=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruleEntity951); 

                            createLeafNode(grammarAccess.getEntityAccess().getRuntimeTypeClassKeyword_1_0(), "runtimeType"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "runtimeType", true, "class", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:508:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:509:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:509:1: (lv_name_2_0= RULE_ID )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:510:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity982); 

            			createLeafNode(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:532:2: ( 'extends' ( ( RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:532:4: 'extends' ( ( RULE_ID ) )
                    {
                    match(input,20,FOLLOW_20_in_ruleEntity998); 

                            createLeafNode(grammarAccess.getEntityAccess().getExtendsKeyword_3_0(), null); 
                        
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:536:1: ( ( RULE_ID ) )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:537:1: ( RULE_ID )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:537:1: ( RULE_ID )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:538:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity1016); 

                    		createLeafNode(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_3_1_0(), "extends"); 
                    	

                    }


                    }


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleEntity1028); 

                    createLeafNode(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:554:1: ( (lv_properties_6_0= ruleProperty ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:555:1: (lv_properties_6_0= ruleProperty )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:555:1: (lv_properties_6_0= ruleProperty )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:556:3: lv_properties_6_0= ruleProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleEntity1049);
            	    lv_properties_6_0=ruleProperty();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"properties",
            	    	        		lv_properties_6_0, 
            	    	        		"Property", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(input,15,FOLLOW_15_in_ruleEntity1060); 

                    createLeafNode(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleProperty
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:590:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:591:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:592:2: iv_ruleProperty= ruleProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1096);
            iv_ruleProperty=ruleProperty();
            _fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1106); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleProperty


    // $ANTLR start ruleProperty
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:599:1: ruleProperty returns [EObject current=null] : ( ( (lv_typeRef_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_typeRef_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:604:6: ( ( ( (lv_typeRef_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:605:1: ( ( (lv_typeRef_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:605:1: ( ( (lv_typeRef_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:605:2: ( (lv_typeRef_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:605:2: ( (lv_typeRef_0_0= ruleTypeReference ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:606:1: (lv_typeRef_0_0= ruleTypeReference )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:606:1: (lv_typeRef_0_0= ruleTypeReference )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:607:3: lv_typeRef_0_0= ruleTypeReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getTypeRefTypeReferenceParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeReference_in_ruleProperty1152);
            lv_typeRef_0_0=ruleTypeReference();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"typeRef",
            	        		lv_typeRef_0_0, 
            	        		"TypeReference", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:629:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:630:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:630:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:631:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty1169); 

            			createLeafNode(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProperty


    // $ANTLR start entryRuleTypeReference
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:661:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:662:2: (iv_ruleTypeReference= ruleTypeReference EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:663:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeReference_in_entryRuleTypeReference1210);
            iv_ruleTypeReference=ruleTypeReference();
            _fsp--;

             current =iv_ruleTypeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeReference1220); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeReference


    // $ANTLR start ruleTypeReference
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:670:1: ruleTypeReference returns [EObject current=null] : ( ( ( RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        Token lv_many_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:675:6: ( ( ( ( RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:676:1: ( ( ( RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:676:1: ( ( ( RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:676:2: ( ( RULE_ID ) ) ( (lv_many_1_0= '[]' ) )?
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:676:2: ( ( RULE_ID ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:677:1: ( RULE_ID )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:677:1: ( RULE_ID )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:678:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTypeReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeReference1263); 

            		createLeafNode(grammarAccess.getTypeReferenceAccess().getTypeTypeCrossReference_0_0(), "type"); 
            	

            }


            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:690:2: ( (lv_many_1_0= '[]' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:691:1: (lv_many_1_0= '[]' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:691:1: (lv_many_1_0= '[]' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:692:3: lv_many_1_0= '[]'
                    {
                    lv_many_1_0=(Token)input.LT(1);
                    match(input,21,FOLLOW_21_in_ruleTypeReference1281); 

                            createLeafNode(grammarAccess.getTypeReferenceAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0(), "many"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTypeReferenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "many", true, "[]", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTypeReference


    // $ANTLR start entryRuleProjectClass
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:719:1: entryRuleProjectClass returns [EObject current=null] : iv_ruleProjectClass= ruleProjectClass EOF ;
    public final EObject entryRuleProjectClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectClass = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:720:2: (iv_ruleProjectClass= ruleProjectClass EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:721:2: iv_ruleProjectClass= ruleProjectClass EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProjectClassRule(), currentNode); 
            pushFollow(FOLLOW_ruleProjectClass_in_entryRuleProjectClass1331);
            iv_ruleProjectClass=ruleProjectClass();
            _fsp--;

             current =iv_ruleProjectClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjectClass1341); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleProjectClass


    // $ANTLR start ruleProjectClass
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:728:1: ruleProjectClass returns [EObject current=null] : ( 'class' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleProjectClass() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:733:6: ( ( 'class' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:734:1: ( 'class' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:734:1: ( 'class' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:734:3: 'class' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,19,FOLLOW_19_in_ruleProjectClass1376); 

                    createLeafNode(grammarAccess.getProjectClassAccess().getClassKeyword_0(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:738:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:739:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:739:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:740:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProjectClass1393); 

            			createLeafNode(grammarAccess.getProjectClassAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProjectClassRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProjectClass


    // $ANTLR start entryRuleDeclaration
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:770:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:771:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:772:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDeclarationRule(), currentNode); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration1434);
            iv_ruleDeclaration=ruleDeclaration();
            _fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration1444); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDeclaration


    // $ANTLR start ruleDeclaration
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:779:1: ruleDeclaration returns [EObject current=null] : (this_Parameter_0= ruleParameter | this_Assignment_1= ruleAssignment | this_CollectionIterator_2= ruleCollectionIterator ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Parameter_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_CollectionIterator_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:784:6: ( (this_Parameter_0= ruleParameter | this_Assignment_1= ruleAssignment | this_CollectionIterator_2= ruleCollectionIterator ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:785:1: (this_Parameter_0= ruleParameter | this_Assignment_1= ruleAssignment | this_CollectionIterator_2= ruleCollectionIterator )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:785:1: (this_Parameter_0= ruleParameter | this_Assignment_1= ruleAssignment | this_CollectionIterator_2= ruleCollectionIterator )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==21) ) {
                    int LA9_3 = input.LA(3);

                    if ( (LA9_3==RULE_ID) ) {
                        int LA9_4 = input.LA(4);

                        if ( (LA9_4==40) ) {
                            alt9=2;
                        }
                        else if ( (LA9_4==EOF) ) {
                            alt9=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("785:1: (this_Parameter_0= ruleParameter | this_Assignment_1= ruleAssignment | this_CollectionIterator_2= ruleCollectionIterator )", 9, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("785:1: (this_Parameter_0= ruleParameter | this_Assignment_1= ruleAssignment | this_CollectionIterator_2= ruleCollectionIterator )", 9, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA9_1==RULE_ID) ) {
                    int LA9_4 = input.LA(3);

                    if ( (LA9_4==40) ) {
                        alt9=2;
                    }
                    else if ( (LA9_4==EOF) ) {
                        alt9=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("785:1: (this_Parameter_0= ruleParameter | this_Assignment_1= ruleAssignment | this_CollectionIterator_2= ruleCollectionIterator )", 9, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("785:1: (this_Parameter_0= ruleParameter | this_Assignment_1= ruleAssignment | this_CollectionIterator_2= ruleCollectionIterator )", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==32) ) {
                alt9=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("785:1: (this_Parameter_0= ruleParameter | this_Assignment_1= ruleAssignment | this_CollectionIterator_2= ruleCollectionIterator )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:786:5: this_Parameter_0= ruleParameter
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getParameterParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleParameter_in_ruleDeclaration1491);
                    this_Parameter_0=ruleParameter();
                    _fsp--;

                     
                            current = this_Parameter_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:796:5: this_Assignment_1= ruleAssignment
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getAssignmentParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAssignment_in_ruleDeclaration1518);
                    this_Assignment_1=ruleAssignment();
                    _fsp--;

                     
                            current = this_Assignment_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:806:5: this_CollectionIterator_2= ruleCollectionIterator
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getCollectionIteratorParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCollectionIterator_in_ruleDeclaration1545);
                    this_CollectionIterator_2=ruleCollectionIterator();
                    _fsp--;

                     
                            current = this_CollectionIterator_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDeclaration


    // $ANTLR start entryRuleObjectReference
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:824:1: entryRuleObjectReference returns [EObject current=null] : iv_ruleObjectReference= ruleObjectReference EOF ;
    public final EObject entryRuleObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectReference = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:828:2: (iv_ruleObjectReference= ruleObjectReference EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:829:2: iv_ruleObjectReference= ruleObjectReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getObjectReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleObjectReference_in_entryRuleObjectReference1588);
            iv_ruleObjectReference=ruleObjectReference();
            _fsp--;

             current =iv_ruleObjectReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectReference1598); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end entryRuleObjectReference


    // $ANTLR start ruleObjectReference
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:839:1: ruleObjectReference returns [EObject current=null] : ( ( ( RULE_ID ) ) ( (lv_tail_1_0= rulePropertyReference ) )? ) ;
    public final EObject ruleObjectReference() throws RecognitionException {
        EObject current = null;

        EObject lv_tail_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:845:6: ( ( ( ( RULE_ID ) ) ( (lv_tail_1_0= rulePropertyReference ) )? ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:846:1: ( ( ( RULE_ID ) ) ( (lv_tail_1_0= rulePropertyReference ) )? )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:846:1: ( ( ( RULE_ID ) ) ( (lv_tail_1_0= rulePropertyReference ) )? )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:846:2: ( ( RULE_ID ) ) ( (lv_tail_1_0= rulePropertyReference ) )?
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:846:2: ( ( RULE_ID ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:847:1: ( RULE_ID )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:847:1: ( RULE_ID )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:848:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getObjectReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectReference1645); 

            		createLeafNode(grammarAccess.getObjectReferenceAccess().getObjectDeclarationCrossReference_0_0(), "object"); 
            	

            }


            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:860:2: ( (lv_tail_1_0= rulePropertyReference ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:861:1: (lv_tail_1_0= rulePropertyReference )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:861:1: (lv_tail_1_0= rulePropertyReference )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:862:3: lv_tail_1_0= rulePropertyReference
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getObjectReferenceAccess().getTailPropertyReferenceParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePropertyReference_in_ruleObjectReference1666);
                    lv_tail_1_0=rulePropertyReference();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getObjectReferenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"tail",
                    	        		lv_tail_1_0, 
                    	        		"PropertyReference", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end ruleObjectReference


    // $ANTLR start entryRulePropertyReference
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:895:1: entryRulePropertyReference returns [EObject current=null] : iv_rulePropertyReference= rulePropertyReference EOF ;
    public final EObject entryRulePropertyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyReference = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:896:2: (iv_rulePropertyReference= rulePropertyReference EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:897:2: iv_rulePropertyReference= rulePropertyReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropertyReferenceRule(), currentNode); 
            pushFollow(FOLLOW_rulePropertyReference_in_entryRulePropertyReference1707);
            iv_rulePropertyReference=rulePropertyReference();
            _fsp--;

             current =iv_rulePropertyReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyReference1717); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePropertyReference


    // $ANTLR start rulePropertyReference
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:904:1: rulePropertyReference returns [EObject current=null] : ( '.' ( ( RULE_ID ) ) ( (lv_tail_2_0= rulePropertyReference ) )? ) ;
    public final EObject rulePropertyReference() throws RecognitionException {
        EObject current = null;

        EObject lv_tail_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:909:6: ( ( '.' ( ( RULE_ID ) ) ( (lv_tail_2_0= rulePropertyReference ) )? ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:910:1: ( '.' ( ( RULE_ID ) ) ( (lv_tail_2_0= rulePropertyReference ) )? )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:910:1: ( '.' ( ( RULE_ID ) ) ( (lv_tail_2_0= rulePropertyReference ) )? )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:910:3: '.' ( ( RULE_ID ) ) ( (lv_tail_2_0= rulePropertyReference ) )?
            {
            match(input,22,FOLLOW_22_in_rulePropertyReference1752); 

                    createLeafNode(grammarAccess.getPropertyReferenceAccess().getFullStopKeyword_0(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:914:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:915:1: ( RULE_ID )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:915:1: ( RULE_ID )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:916:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getPropertyReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyReference1770); 

            		createLeafNode(grammarAccess.getPropertyReferenceAccess().getObjectPropertyCrossReference_1_0(), "object"); 
            	

            }


            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:928:2: ( (lv_tail_2_0= rulePropertyReference ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:929:1: (lv_tail_2_0= rulePropertyReference )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:929:1: (lv_tail_2_0= rulePropertyReference )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:930:3: lv_tail_2_0= rulePropertyReference
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPropertyReferenceAccess().getTailPropertyReferenceParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePropertyReference_in_rulePropertyReference1791);
                    lv_tail_2_0=rulePropertyReference();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPropertyReferenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"tail",
                    	        		lv_tail_2_0, 
                    	        		"PropertyReference", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePropertyReference


    // $ANTLR start entryRuleExpression
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:960:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:961:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:962:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1828);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1838); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:969:1: ruleExpression returns [EObject current=null] : (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_StringLiteral_2= ruleStringLiteral | this_StringFunction_3= ruleStringFunction | this_ObjectReference_4= ruleObjectReference | this_ContentProviderCall_5= ruleContentProviderCall | this_Binding_6= ruleBinding ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CollectionLiteral_0 = null;

        EObject this_CollectionFunction_1 = null;

        EObject this_StringLiteral_2 = null;

        EObject this_StringFunction_3 = null;

        EObject this_ObjectReference_4 = null;

        EObject this_ContentProviderCall_5 = null;

        EObject this_Binding_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:974:6: ( (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_StringLiteral_2= ruleStringLiteral | this_StringFunction_3= ruleStringFunction | this_ObjectReference_4= ruleObjectReference | this_ContentProviderCall_5= ruleContentProviderCall | this_Binding_6= ruleBinding ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:975:1: (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_StringLiteral_2= ruleStringLiteral | this_StringFunction_3= ruleStringFunction | this_ObjectReference_4= ruleObjectReference | this_ContentProviderCall_5= ruleContentProviderCall | this_Binding_6= ruleBinding )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:975:1: (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_StringLiteral_2= ruleStringLiteral | this_StringFunction_3= ruleStringFunction | this_ObjectReference_4= ruleObjectReference | this_ContentProviderCall_5= ruleContentProviderCall | this_Binding_6= ruleBinding )
            int alt12=7;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt12=1;
                }
                break;
            case 31:
                {
                alt12=2;
                }
                break;
            case RULE_STRING:
                {
                alt12=3;
                }
                break;
            case 23:
            case 25:
            case 27:
                {
                alt12=4;
                }
                break;
            case RULE_ID:
                {
                int LA12_5 = input.LA(2);

                if ( (LA12_5==EOF||LA12_5==22||LA12_5==24||LA12_5==26) ) {
                    alt12=5;
                }
                else if ( (LA12_5==23) ) {
                    alt12=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("975:1: (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_StringLiteral_2= ruleStringLiteral | this_StringFunction_3= ruleStringFunction | this_ObjectReference_4= ruleObjectReference | this_ContentProviderCall_5= ruleContentProviderCall | this_Binding_6= ruleBinding )", 12, 5, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                alt12=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("975:1: (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_StringLiteral_2= ruleStringLiteral | this_StringFunction_3= ruleStringFunction | this_ObjectReference_4= ruleObjectReference | this_ContentProviderCall_5= ruleContentProviderCall | this_Binding_6= ruleBinding )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:976:5: this_CollectionLiteral_0= ruleCollectionLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getCollectionLiteralParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCollectionLiteral_in_ruleExpression1885);
                    this_CollectionLiteral_0=ruleCollectionLiteral();
                    _fsp--;

                     
                            current = this_CollectionLiteral_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:986:5: this_CollectionFunction_1= ruleCollectionFunction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getCollectionFunctionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCollectionFunction_in_ruleExpression1912);
                    this_CollectionFunction_1=ruleCollectionFunction();
                    _fsp--;

                     
                            current = this_CollectionFunction_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:996:5: this_StringLiteral_2= ruleStringLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getStringLiteralParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleExpression1939);
                    this_StringLiteral_2=ruleStringLiteral();
                    _fsp--;

                     
                            current = this_StringLiteral_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1006:5: this_StringFunction_3= ruleStringFunction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getStringFunctionParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringFunction_in_ruleExpression1966);
                    this_StringFunction_3=ruleStringFunction();
                    _fsp--;

                     
                            current = this_StringFunction_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1016:5: this_ObjectReference_4= ruleObjectReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getObjectReferenceParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleObjectReference_in_ruleExpression1993);
                    this_ObjectReference_4=ruleObjectReference();
                    _fsp--;

                     
                            current = this_ObjectReference_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1026:5: this_ContentProviderCall_5= ruleContentProviderCall
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getContentProviderCallParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleContentProviderCall_in_ruleExpression2020);
                    this_ContentProviderCall_5=ruleContentProviderCall();
                    _fsp--;

                     
                            current = this_ContentProviderCall_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1036:5: this_Binding_6= ruleBinding
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getBindingParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBinding_in_ruleExpression2047);
                    this_Binding_6=ruleBinding();
                    _fsp--;

                     
                            current = this_Binding_6; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleScalarExpression
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1052:1: entryRuleScalarExpression returns [EObject current=null] : iv_ruleScalarExpression= ruleScalarExpression EOF ;
    public final EObject entryRuleScalarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarExpression = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1053:2: (iv_ruleScalarExpression= ruleScalarExpression EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1054:2: iv_ruleScalarExpression= ruleScalarExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getScalarExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleScalarExpression_in_entryRuleScalarExpression2082);
            iv_ruleScalarExpression=ruleScalarExpression();
            _fsp--;

             current =iv_ruleScalarExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScalarExpression2092); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleScalarExpression


    // $ANTLR start ruleScalarExpression
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1061:1: ruleScalarExpression returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference | this_Binding_3= ruleBinding ) ;
    public final EObject ruleScalarExpression() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_StringFunction_1 = null;

        EObject this_ObjectReference_2 = null;

        EObject this_Binding_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1066:6: ( (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference | this_Binding_3= ruleBinding ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1067:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference | this_Binding_3= ruleBinding )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1067:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference | this_Binding_3= ruleBinding )
            int alt13=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt13=1;
                }
                break;
            case 23:
            case 25:
            case 27:
                {
                alt13=2;
                }
                break;
            case RULE_ID:
                {
                alt13=3;
                }
                break;
            case 28:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1067:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference | this_Binding_3= ruleBinding )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1068:5: this_StringLiteral_0= ruleStringLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getScalarExpressionAccess().getStringLiteralParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleScalarExpression2139);
                    this_StringLiteral_0=ruleStringLiteral();
                    _fsp--;

                     
                            current = this_StringLiteral_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1078:5: this_StringFunction_1= ruleStringFunction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getScalarExpressionAccess().getStringFunctionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringFunction_in_ruleScalarExpression2166);
                    this_StringFunction_1=ruleStringFunction();
                    _fsp--;

                     
                            current = this_StringFunction_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1088:5: this_ObjectReference_2= ruleObjectReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getScalarExpressionAccess().getObjectReferenceParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleObjectReference_in_ruleScalarExpression2193);
                    this_ObjectReference_2=ruleObjectReference();
                    _fsp--;

                     
                            current = this_ObjectReference_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1098:5: this_Binding_3= ruleBinding
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getScalarExpressionAccess().getBindingParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBinding_in_ruleScalarExpression2220);
                    this_Binding_3=ruleBinding();
                    _fsp--;

                     
                            current = this_Binding_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleScalarExpression


    // $ANTLR start entryRuleStringLiteral
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1114:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1115:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1116:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2255);
            iv_ruleStringLiteral=ruleStringLiteral();
            _fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral2265); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStringLiteral


    // $ANTLR start ruleStringLiteral
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1123:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1128:6: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1129:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1129:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1130:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1130:1: (lv_value_0_0= RULE_STRING )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1131:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral2306); 

            			createLeafNode(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStringLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_0_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStringLiteral


    // $ANTLR start entryRuleStringFunction
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1161:1: entryRuleStringFunction returns [EObject current=null] : iv_ruleStringFunction= ruleStringFunction EOF ;
    public final EObject entryRuleStringFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringFunction = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1162:2: (iv_ruleStringFunction= ruleStringFunction EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1163:2: iv_ruleStringFunction= ruleStringFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringFunction_in_entryRuleStringFunction2346);
            iv_ruleStringFunction=ruleStringFunction();
            _fsp--;

             current =iv_ruleStringFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringFunction2356); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStringFunction


    // $ANTLR start ruleStringFunction
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1170:1: ruleStringFunction returns [EObject current=null] : ( ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' ) | ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' ) | ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' ) ) ;
    public final EObject ruleStringFunction() throws RecognitionException {
        EObject current = null;

        EObject lv_values_2_0 = null;

        EObject lv_value_6_0 = null;

        EObject lv_match_8_0 = null;

        EObject lv_replacement_10_0 = null;

        EObject lv_value_14_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1175:6: ( ( ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' ) | ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' ) | ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1176:1: ( ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' ) | ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' ) | ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1176:1: ( ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' ) | ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' ) | ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt15=1;
                }
                break;
            case 25:
                {
                alt15=2;
                }
                break;
            case 27:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1176:1: ( ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' ) | ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' ) | ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' ) )", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1176:2: ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1176:2: ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1176:3: () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')'
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1176:3: ()
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1177:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getStringFunctionAccess().getStringConcatAction_0_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getStringFunctionAccess().getStringConcatAction_0_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,23,FOLLOW_23_in_ruleStringFunction2401); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getLeftParenthesisKeyword_0_1(), null); 
                        
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1191:1: ( (lv_values_2_0= ruleScalarExpression ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)||LA14_0==23||LA14_0==25||(LA14_0>=27 && LA14_0<=28)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1192:1: (lv_values_2_0= ruleScalarExpression )
                    	    {
                    	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1192:1: (lv_values_2_0= ruleScalarExpression )
                    	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1193:3: lv_values_2_0= ruleScalarExpression
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getStringFunctionAccess().getValuesScalarExpressionParserRuleCall_0_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction2422);
                    	    lv_values_2_0=ruleScalarExpression();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getStringFunctionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"values",
                    	    	        		lv_values_2_0, 
                    	    	        		"ScalarExpression", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    match(input,24,FOLLOW_24_in_ruleStringFunction2433); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_0_3(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1220:6: ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1220:6: ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1220:7: () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')'
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1220:7: ()
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1221:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getStringFunctionAccess().getStringReplaceAction_1_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getStringFunctionAccess().getStringReplaceAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,25,FOLLOW_25_in_ruleStringFunction2460); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getReplaceKeyword_1_1(), null); 
                        
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1235:1: ( (lv_value_6_0= ruleScalarExpression ) )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1236:1: (lv_value_6_0= ruleScalarExpression )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1236:1: (lv_value_6_0= ruleScalarExpression )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1237:3: lv_value_6_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction2481);
                    lv_value_6_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringFunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_6_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,26,FOLLOW_26_in_ruleStringFunction2491); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getCommaKeyword_1_3(), null); 
                        
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1263:1: ( (lv_match_8_0= ruleScalarExpression ) )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1264:1: (lv_match_8_0= ruleScalarExpression )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1264:1: (lv_match_8_0= ruleScalarExpression )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1265:3: lv_match_8_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStringFunctionAccess().getMatchScalarExpressionParserRuleCall_1_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction2512);
                    lv_match_8_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringFunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"match",
                    	        		lv_match_8_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,26,FOLLOW_26_in_ruleStringFunction2522); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getCommaKeyword_1_5(), null); 
                        
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1291:1: ( (lv_replacement_10_0= ruleScalarExpression ) )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1292:1: (lv_replacement_10_0= ruleScalarExpression )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1292:1: (lv_replacement_10_0= ruleScalarExpression )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1293:3: lv_replacement_10_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStringFunctionAccess().getReplacementScalarExpressionParserRuleCall_1_6_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction2543);
                    lv_replacement_10_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringFunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"replacement",
                    	        		lv_replacement_10_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,24,FOLLOW_24_in_ruleStringFunction2553); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_1_7(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1320:6: ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1320:6: ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1320:7: () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')'
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1320:7: ()
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1321:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getStringFunctionAccess().getStringUrlConformAction_2_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getStringFunctionAccess().getStringUrlConformAction_2_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,27,FOLLOW_27_in_ruleStringFunction2580); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getUrlconformKeyword_2_1(), null); 
                        
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1335:1: ( (lv_value_14_0= ruleScalarExpression ) )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1336:1: (lv_value_14_0= ruleScalarExpression )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1336:1: (lv_value_14_0= ruleScalarExpression )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1337:3: lv_value_14_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_2_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction2601);
                    lv_value_14_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringFunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_14_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,24,FOLLOW_24_in_ruleStringFunction2611); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_2_3(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStringFunction


    // $ANTLR start entryRuleBinding
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1371:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1372:2: (iv_ruleBinding= ruleBinding EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1373:2: iv_ruleBinding= ruleBinding EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBindingRule(), currentNode); 
            pushFollow(FOLLOW_ruleBinding_in_entryRuleBinding2648);
            iv_ruleBinding=ruleBinding();
            _fsp--;

             current =iv_ruleBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinding2658); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBinding


    // $ANTLR start ruleBinding
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1380:1: ruleBinding returns [EObject current=null] : ( 'bind(' ( (lv_target_1_0= ruleObjectReference ) ) ')' ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        EObject lv_target_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1385:6: ( ( 'bind(' ( (lv_target_1_0= ruleObjectReference ) ) ')' ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1386:1: ( 'bind(' ( (lv_target_1_0= ruleObjectReference ) ) ')' )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1386:1: ( 'bind(' ( (lv_target_1_0= ruleObjectReference ) ) ')' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1386:3: 'bind(' ( (lv_target_1_0= ruleObjectReference ) ) ')'
            {
            match(input,28,FOLLOW_28_in_ruleBinding2693); 

                    createLeafNode(grammarAccess.getBindingAccess().getBindKeyword_0(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1390:1: ( (lv_target_1_0= ruleObjectReference ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1391:1: (lv_target_1_0= ruleObjectReference )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1391:1: (lv_target_1_0= ruleObjectReference )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1392:3: lv_target_1_0= ruleObjectReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBindingAccess().getTargetObjectReferenceParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleObjectReference_in_ruleBinding2714);
            lv_target_1_0=ruleObjectReference();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBindingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"target",
            	        		lv_target_1_0, 
            	        		"ObjectReference", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,24,FOLLOW_24_in_ruleBinding2724); 

                    createLeafNode(grammarAccess.getBindingAccess().getRightParenthesisKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBinding


    // $ANTLR start entryRuleImageExpression
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1426:1: entryRuleImageExpression returns [EObject current=null] : iv_ruleImageExpression= ruleImageExpression EOF ;
    public final EObject entryRuleImageExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageExpression = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1427:2: (iv_ruleImageExpression= ruleImageExpression EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1428:2: iv_ruleImageExpression= ruleImageExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImageExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleImageExpression_in_entryRuleImageExpression2760);
            iv_ruleImageExpression=ruleImageExpression();
            _fsp--;

             current =iv_ruleImageExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageExpression2770); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleImageExpression


    // $ANTLR start ruleImageExpression
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1435:1: ruleImageExpression returns [EObject current=null] : this_ScalarExpression_0= ruleScalarExpression ;
    public final EObject ruleImageExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ScalarExpression_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1440:6: (this_ScalarExpression_0= ruleScalarExpression )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1442:5: this_ScalarExpression_0= ruleScalarExpression
            {
             
                    currentNode=createCompositeNode(grammarAccess.getImageExpressionAccess().getScalarExpressionParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleImageExpression2816);
            this_ScalarExpression_0=ruleScalarExpression();
            _fsp--;

             
                    current = this_ScalarExpression_0; 
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleImageExpression


    // $ANTLR start entryRuleCollectionExpression
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1458:1: entryRuleCollectionExpression returns [EObject current=null] : iv_ruleCollectionExpression= ruleCollectionExpression EOF ;
    public final EObject entryRuleCollectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionExpression = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1459:2: (iv_ruleCollectionExpression= ruleCollectionExpression EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1460:2: iv_ruleCollectionExpression= ruleCollectionExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCollectionExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression2850);
            iv_ruleCollectionExpression=ruleCollectionExpression();
            _fsp--;

             current =iv_ruleCollectionExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionExpression2860); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCollectionExpression


    // $ANTLR start ruleCollectionExpression
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1467:1: ruleCollectionExpression returns [EObject current=null] : (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference ) ;
    public final EObject ruleCollectionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CollectionLiteral_0 = null;

        EObject this_CollectionFunction_1 = null;

        EObject this_ObjectReference_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1472:6: ( (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1473:1: (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1473:1: (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt16=1;
                }
                break;
            case 31:
                {
                alt16=2;
                }
                break;
            case RULE_ID:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1473:1: (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference )", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1474:5: this_CollectionLiteral_0= ruleCollectionLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCollectionExpressionAccess().getCollectionLiteralParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCollectionLiteral_in_ruleCollectionExpression2907);
                    this_CollectionLiteral_0=ruleCollectionLiteral();
                    _fsp--;

                     
                            current = this_CollectionLiteral_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1484:5: this_CollectionFunction_1= ruleCollectionFunction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCollectionExpressionAccess().getCollectionFunctionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCollectionFunction_in_ruleCollectionExpression2934);
                    this_CollectionFunction_1=ruleCollectionFunction();
                    _fsp--;

                     
                            current = this_CollectionFunction_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1494:5: this_ObjectReference_2= ruleObjectReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCollectionExpressionAccess().getObjectReferenceParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleObjectReference_in_ruleCollectionExpression2961);
                    this_ObjectReference_2=ruleObjectReference();
                    _fsp--;

                     
                            current = this_ObjectReference_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCollectionExpression


    // $ANTLR start entryRuleCollectionLiteral
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1510:1: entryRuleCollectionLiteral returns [EObject current=null] : iv_ruleCollectionLiteral= ruleCollectionLiteral EOF ;
    public final EObject entryRuleCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteral = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1511:2: (iv_ruleCollectionLiteral= ruleCollectionLiteral EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1512:2: iv_ruleCollectionLiteral= ruleCollectionLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCollectionLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleCollectionLiteral_in_entryRuleCollectionLiteral2996);
            iv_ruleCollectionLiteral=ruleCollectionLiteral();
            _fsp--;

             current =iv_ruleCollectionLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionLiteral3006); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCollectionLiteral


    // $ANTLR start ruleCollectionLiteral
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1519:1: ruleCollectionLiteral returns [EObject current=null] : ( '[' ( (lv_items_1_0= ruleScalarExpression ) ) ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* ']' ) ;
    public final EObject ruleCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1524:6: ( ( '[' ( (lv_items_1_0= ruleScalarExpression ) ) ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* ']' ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1525:1: ( '[' ( (lv_items_1_0= ruleScalarExpression ) ) ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* ']' )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1525:1: ( '[' ( (lv_items_1_0= ruleScalarExpression ) ) ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* ']' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1525:3: '[' ( (lv_items_1_0= ruleScalarExpression ) ) ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* ']'
            {
            match(input,29,FOLLOW_29_in_ruleCollectionLiteral3041); 

                    createLeafNode(grammarAccess.getCollectionLiteralAccess().getLeftSquareBracketKeyword_0(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1529:1: ( (lv_items_1_0= ruleScalarExpression ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1530:1: (lv_items_1_0= ruleScalarExpression )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1530:1: (lv_items_1_0= ruleScalarExpression )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1531:3: lv_items_1_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleCollectionLiteral3062);
            lv_items_1_0=ruleScalarExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCollectionLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"items",
            	        		lv_items_1_0, 
            	        		"ScalarExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1553:2: ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1553:4: ',' ( (lv_items_3_0= ruleScalarExpression ) )
            	    {
            	    match(input,26,FOLLOW_26_in_ruleCollectionLiteral3073); 

            	            createLeafNode(grammarAccess.getCollectionLiteralAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1557:1: ( (lv_items_3_0= ruleScalarExpression ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1558:1: (lv_items_3_0= ruleScalarExpression )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1558:1: (lv_items_3_0= ruleScalarExpression )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1559:3: lv_items_3_0= ruleScalarExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleScalarExpression_in_ruleCollectionLiteral3094);
            	    lv_items_3_0=ruleScalarExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCollectionLiteralRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"items",
            	    	        		lv_items_3_0, 
            	    	        		"ScalarExpression", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match(input,30,FOLLOW_30_in_ruleCollectionLiteral3106); 

                    createLeafNode(grammarAccess.getCollectionLiteralAccess().getRightSquareBracketKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCollectionLiteral


    // $ANTLR start entryRuleCollectionFunction
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1593:1: entryRuleCollectionFunction returns [EObject current=null] : iv_ruleCollectionFunction= ruleCollectionFunction EOF ;
    public final EObject entryRuleCollectionFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionFunction = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1594:2: (iv_ruleCollectionFunction= ruleCollectionFunction EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1595:2: iv_ruleCollectionFunction= ruleCollectionFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCollectionFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleCollectionFunction_in_entryRuleCollectionFunction3142);
            iv_ruleCollectionFunction=ruleCollectionFunction();
            _fsp--;

             current =iv_ruleCollectionFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionFunction3152); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCollectionFunction


    // $ANTLR start ruleCollectionFunction
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1602:1: ruleCollectionFunction returns [EObject current=null] : ( () 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) ')' ) ;
    public final EObject ruleCollectionFunction() throws RecognitionException {
        EObject current = null;

        EObject lv_value_2_0 = null;

        EObject lv_delimiter_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1607:6: ( ( () 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) ')' ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1608:1: ( () 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) ')' )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1608:1: ( () 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) ')' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1608:2: () 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) ')'
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1608:2: ()
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1609:5: 
            {
             
                    temp=factory.create(grammarAccess.getCollectionFunctionAccess().getStringSplitAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getCollectionFunctionAccess().getStringSplitAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,31,FOLLOW_31_in_ruleCollectionFunction3196); 

                    createLeafNode(grammarAccess.getCollectionFunctionAccess().getSplitKeyword_1(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1623:1: ( (lv_value_2_0= ruleScalarExpression ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1624:1: (lv_value_2_0= ruleScalarExpression )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1624:1: (lv_value_2_0= ruleScalarExpression )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1625:3: lv_value_2_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCollectionFunctionAccess().getValueScalarExpressionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleCollectionFunction3217);
            lv_value_2_0=ruleScalarExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCollectionFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_2_0, 
            	        		"ScalarExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,26,FOLLOW_26_in_ruleCollectionFunction3227); 

                    createLeafNode(grammarAccess.getCollectionFunctionAccess().getCommaKeyword_3(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1651:1: ( (lv_delimiter_4_0= ruleScalarExpression ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1652:1: (lv_delimiter_4_0= ruleScalarExpression )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1652:1: (lv_delimiter_4_0= ruleScalarExpression )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1653:3: lv_delimiter_4_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCollectionFunctionAccess().getDelimiterScalarExpressionParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleCollectionFunction3248);
            lv_delimiter_4_0=ruleScalarExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCollectionFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"delimiter",
            	        		lv_delimiter_4_0, 
            	        		"ScalarExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,24,FOLLOW_24_in_ruleCollectionFunction3258); 

                    createLeafNode(grammarAccess.getCollectionFunctionAccess().getRightParenthesisKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCollectionFunction


    // $ANTLR start entryRuleCollectionIterator
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1687:1: entryRuleCollectionIterator returns [EObject current=null] : iv_ruleCollectionIterator= ruleCollectionIterator EOF ;
    public final EObject entryRuleCollectionIterator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionIterator = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1688:2: (iv_ruleCollectionIterator= ruleCollectionIterator EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1689:2: iv_ruleCollectionIterator= ruleCollectionIterator EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCollectionIteratorRule(), currentNode); 
            pushFollow(FOLLOW_ruleCollectionIterator_in_entryRuleCollectionIterator3294);
            iv_ruleCollectionIterator=ruleCollectionIterator();
            _fsp--;

             current =iv_ruleCollectionIterator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionIterator3304); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCollectionIterator


    // $ANTLR start ruleCollectionIterator
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1696:1: ruleCollectionIterator returns [EObject current=null] : ( 'for' ( (lv_name_1_0= RULE_ID ) ) 'in' ( (lv_collection_3_0= ruleCollectionExpression ) ) ) ;
    public final EObject ruleCollectionIterator() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_collection_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1701:6: ( ( 'for' ( (lv_name_1_0= RULE_ID ) ) 'in' ( (lv_collection_3_0= ruleCollectionExpression ) ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1702:1: ( 'for' ( (lv_name_1_0= RULE_ID ) ) 'in' ( (lv_collection_3_0= ruleCollectionExpression ) ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1702:1: ( 'for' ( (lv_name_1_0= RULE_ID ) ) 'in' ( (lv_collection_3_0= ruleCollectionExpression ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1702:3: 'for' ( (lv_name_1_0= RULE_ID ) ) 'in' ( (lv_collection_3_0= ruleCollectionExpression ) )
            {
            match(input,32,FOLLOW_32_in_ruleCollectionIterator3339); 

                    createLeafNode(grammarAccess.getCollectionIteratorAccess().getForKeyword_0(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1706:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1707:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1707:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1708:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollectionIterator3356); 

            			createLeafNode(grammarAccess.getCollectionIteratorAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCollectionIteratorRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,33,FOLLOW_33_in_ruleCollectionIterator3371); 

                    createLeafNode(grammarAccess.getCollectionIteratorAccess().getInKeyword_2(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1734:1: ( (lv_collection_3_0= ruleCollectionExpression ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1735:1: (lv_collection_3_0= ruleCollectionExpression )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1735:1: (lv_collection_3_0= ruleCollectionExpression )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1736:3: lv_collection_3_0= ruleCollectionExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCollectionIteratorAccess().getCollectionCollectionExpressionParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCollectionExpression_in_ruleCollectionIterator3392);
            lv_collection_3_0=ruleCollectionExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCollectionIteratorRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"collection",
            	        		lv_collection_3_0, 
            	        		"CollectionExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCollectionIterator


    // $ANTLR start entryRuleParameter
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1766:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1767:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1768:2: iv_ruleParameter= ruleParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter3428);
            iv_ruleParameter=ruleParameter();
            _fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter3438); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParameter


    // $ANTLR start ruleParameter
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1775:1: ruleParameter returns [EObject current=null] : ( ( (lv_typeRef_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_typeRef_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1780:6: ( ( ( (lv_typeRef_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1781:1: ( ( (lv_typeRef_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1781:1: ( ( (lv_typeRef_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1781:2: ( (lv_typeRef_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1781:2: ( (lv_typeRef_0_0= ruleTypeReference ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1782:1: (lv_typeRef_0_0= ruleTypeReference )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1782:1: (lv_typeRef_0_0= ruleTypeReference )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1783:3: lv_typeRef_0_0= ruleTypeReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getTypeRefTypeReferenceParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeReference_in_ruleParameter3484);
            lv_typeRef_0_0=ruleTypeReference();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"typeRef",
            	        		lv_typeRef_0_0, 
            	        		"TypeReference", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1805:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1806:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1806:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1807:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter3501); 

            			createLeafNode(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleParameter


    // $ANTLR start entryRuleParameterizedModelElement
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1837:1: entryRuleParameterizedModelElement returns [EObject current=null] : iv_ruleParameterizedModelElement= ruleParameterizedModelElement EOF ;
    public final EObject entryRuleParameterizedModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterizedModelElement = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1838:2: (iv_ruleParameterizedModelElement= ruleParameterizedModelElement EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1839:2: iv_ruleParameterizedModelElement= ruleParameterizedModelElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterizedModelElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameterizedModelElement_in_entryRuleParameterizedModelElement3542);
            iv_ruleParameterizedModelElement=ruleParameterizedModelElement();
            _fsp--;

             current =iv_ruleParameterizedModelElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterizedModelElement3552); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParameterizedModelElement


    // $ANTLR start ruleParameterizedModelElement
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1846:1: ruleParameterizedModelElement returns [EObject current=null] : (this_View_0= ruleView | this_ContentProvider_1= ruleContentProvider ) ;
    public final EObject ruleParameterizedModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_View_0 = null;

        EObject this_ContentProvider_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1851:6: ( (this_View_0= ruleView | this_ContentProvider_1= ruleContentProvider ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1852:1: (this_View_0= ruleView | this_ContentProvider_1= ruleContentProvider )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1852:1: (this_View_0= ruleView | this_ContentProvider_1= ruleContentProvider )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==41||LA18_0==45||LA18_0==55) ) {
                alt18=1;
            }
            else if ( (LA18_0==34) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1852:1: (this_View_0= ruleView | this_ContentProvider_1= ruleContentProvider )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1853:5: this_View_0= ruleView
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getParameterizedModelElementAccess().getViewParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleView_in_ruleParameterizedModelElement3599);
                    this_View_0=ruleView();
                    _fsp--;

                     
                            current = this_View_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1863:5: this_ContentProvider_1= ruleContentProvider
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getParameterizedModelElementAccess().getContentProviderParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleContentProvider_in_ruleParameterizedModelElement3626);
                    this_ContentProvider_1=ruleContentProvider();
                    _fsp--;

                     
                            current = this_ContentProvider_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleParameterizedModelElement


    // $ANTLR start entryRuleParameterDefinitions
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1881:1: entryRuleParameterDefinitions returns [EObject current=null] : iv_ruleParameterDefinitions= ruleParameterDefinitions EOF ;
    public final EObject entryRuleParameterDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDefinitions = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1882:2: (iv_ruleParameterDefinitions= ruleParameterDefinitions EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1883:2: iv_ruleParameterDefinitions= ruleParameterDefinitions EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterDefinitionsRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameterDefinitions_in_entryRuleParameterDefinitions3663);
            iv_ruleParameterDefinitions=ruleParameterDefinitions();
            _fsp--;

             current =iv_ruleParameterDefinitions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDefinitions3673); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParameterDefinitions


    // $ANTLR start ruleParameterDefinitions
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1890:1: ruleParameterDefinitions returns [EObject current=null] : ( () ( '(' ( (lv_definitions_2_0= ruleParameter ) ) ( ',' ( (lv_definitions_4_0= ruleParameter ) ) )* ')' )? ) ;
    public final EObject ruleParameterDefinitions() throws RecognitionException {
        EObject current = null;

        EObject lv_definitions_2_0 = null;

        EObject lv_definitions_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1895:6: ( ( () ( '(' ( (lv_definitions_2_0= ruleParameter ) ) ( ',' ( (lv_definitions_4_0= ruleParameter ) ) )* ')' )? ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1896:1: ( () ( '(' ( (lv_definitions_2_0= ruleParameter ) ) ( ',' ( (lv_definitions_4_0= ruleParameter ) ) )* ')' )? )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1896:1: ( () ( '(' ( (lv_definitions_2_0= ruleParameter ) ) ( ',' ( (lv_definitions_4_0= ruleParameter ) ) )* ')' )? )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1896:2: () ( '(' ( (lv_definitions_2_0= ruleParameter ) ) ( ',' ( (lv_definitions_4_0= ruleParameter ) ) )* ')' )?
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1896:2: ()
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1897:5: 
            {
             
                    temp=factory.create(grammarAccess.getParameterDefinitionsAccess().getParameterDefinitionsAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getParameterDefinitionsAccess().getParameterDefinitionsAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1907:2: ( '(' ( (lv_definitions_2_0= ruleParameter ) ) ( ',' ( (lv_definitions_4_0= ruleParameter ) ) )* ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1907:4: '(' ( (lv_definitions_2_0= ruleParameter ) ) ( ',' ( (lv_definitions_4_0= ruleParameter ) ) )* ')'
                    {
                    match(input,23,FOLLOW_23_in_ruleParameterDefinitions3718); 

                            createLeafNode(grammarAccess.getParameterDefinitionsAccess().getLeftParenthesisKeyword_1_0(), null); 
                        
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1911:1: ( (lv_definitions_2_0= ruleParameter ) )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1912:1: (lv_definitions_2_0= ruleParameter )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1912:1: (lv_definitions_2_0= ruleParameter )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1913:3: lv_definitions_2_0= ruleParameter
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getParameterDefinitionsAccess().getDefinitionsParameterParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleParameterDefinitions3739);
                    lv_definitions_2_0=ruleParameter();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getParameterDefinitionsRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"definitions",
                    	        		lv_definitions_2_0, 
                    	        		"Parameter", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1935:2: ( ',' ( (lv_definitions_4_0= ruleParameter ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==26) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1935:4: ',' ( (lv_definitions_4_0= ruleParameter ) )
                    	    {
                    	    match(input,26,FOLLOW_26_in_ruleParameterDefinitions3750); 

                    	            createLeafNode(grammarAccess.getParameterDefinitionsAccess().getCommaKeyword_1_2_0(), null); 
                    	        
                    	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1939:1: ( (lv_definitions_4_0= ruleParameter ) )
                    	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1940:1: (lv_definitions_4_0= ruleParameter )
                    	    {
                    	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1940:1: (lv_definitions_4_0= ruleParameter )
                    	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1941:3: lv_definitions_4_0= ruleParameter
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getParameterDefinitionsAccess().getDefinitionsParameterParserRuleCall_1_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleParameterDefinitions3771);
                    	    lv_definitions_4_0=ruleParameter();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getParameterDefinitionsRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"definitions",
                    	    	        		lv_definitions_4_0, 
                    	    	        		"Parameter", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    match(input,24,FOLLOW_24_in_ruleParameterDefinitions3783); 

                            createLeafNode(grammarAccess.getParameterDefinitionsAccess().getRightParenthesisKeyword_1_3(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleParameterDefinitions


    // $ANTLR start entryRuleParameterValues
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1975:1: entryRuleParameterValues returns [EObject current=null] : iv_ruleParameterValues= ruleParameterValues EOF ;
    public final EObject entryRuleParameterValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValues = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1976:2: (iv_ruleParameterValues= ruleParameterValues EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1977:2: iv_ruleParameterValues= ruleParameterValues EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterValuesRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameterValues_in_entryRuleParameterValues3821);
            iv_ruleParameterValues=ruleParameterValues();
            _fsp--;

             current =iv_ruleParameterValues; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterValues3831); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParameterValues


    // $ANTLR start ruleParameterValues
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1984:1: ruleParameterValues returns [EObject current=null] : ( () '(' ( ( (lv_values_2_0= ruleExpression ) ) ( ',' ( (lv_values_4_0= ruleExpression ) ) )* )? ')' ) ;
    public final EObject ruleParameterValues() throws RecognitionException {
        EObject current = null;

        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1989:6: ( ( () '(' ( ( (lv_values_2_0= ruleExpression ) ) ( ',' ( (lv_values_4_0= ruleExpression ) ) )* )? ')' ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1990:1: ( () '(' ( ( (lv_values_2_0= ruleExpression ) ) ( ',' ( (lv_values_4_0= ruleExpression ) ) )* )? ')' )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1990:1: ( () '(' ( ( (lv_values_2_0= ruleExpression ) ) ( ',' ( (lv_values_4_0= ruleExpression ) ) )* )? ')' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1990:2: () '(' ( ( (lv_values_2_0= ruleExpression ) ) ( ',' ( (lv_values_4_0= ruleExpression ) ) )* )? ')'
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1990:2: ()
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1991:5: 
            {
             
                    temp=factory.create(grammarAccess.getParameterValuesAccess().getParameterValuesAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getParameterValuesAccess().getParameterValuesAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,23,FOLLOW_23_in_ruleParameterValues3875); 

                    createLeafNode(grammarAccess.getParameterValuesAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2005:1: ( ( (lv_values_2_0= ruleExpression ) ) ( ',' ( (lv_values_4_0= ruleExpression ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_STRING)||LA22_0==23||LA22_0==25||(LA22_0>=27 && LA22_0<=29)||LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2005:2: ( (lv_values_2_0= ruleExpression ) ) ( ',' ( (lv_values_4_0= ruleExpression ) ) )*
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2005:2: ( (lv_values_2_0= ruleExpression ) )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2006:1: (lv_values_2_0= ruleExpression )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2006:1: (lv_values_2_0= ruleExpression )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2007:3: lv_values_2_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getParameterValuesAccess().getValuesExpressionParserRuleCall_2_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleParameterValues3897);
                    lv_values_2_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getParameterValuesRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"values",
                    	        		lv_values_2_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2029:2: ( ',' ( (lv_values_4_0= ruleExpression ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==26) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2029:4: ',' ( (lv_values_4_0= ruleExpression ) )
                    	    {
                    	    match(input,26,FOLLOW_26_in_ruleParameterValues3908); 

                    	            createLeafNode(grammarAccess.getParameterValuesAccess().getCommaKeyword_2_1_0(), null); 
                    	        
                    	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2033:1: ( (lv_values_4_0= ruleExpression ) )
                    	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2034:1: (lv_values_4_0= ruleExpression )
                    	    {
                    	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2034:1: (lv_values_4_0= ruleExpression )
                    	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2035:3: lv_values_4_0= ruleExpression
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getParameterValuesAccess().getValuesExpressionParserRuleCall_2_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleParameterValues3929);
                    	    lv_values_4_0=ruleExpression();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getParameterValuesRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"values",
                    	    	        		lv_values_4_0, 
                    	    	        		"Expression", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,24,FOLLOW_24_in_ruleParameterValues3943); 

                    createLeafNode(grammarAccess.getParameterValuesAccess().getRightParenthesisKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleParameterValues


    // $ANTLR start entryRuleContentProvider
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2069:1: entryRuleContentProvider returns [EObject current=null] : iv_ruleContentProvider= ruleContentProvider EOF ;
    public final EObject entryRuleContentProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentProvider = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2070:2: (iv_ruleContentProvider= ruleContentProvider EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2071:2: iv_ruleContentProvider= ruleContentProvider EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContentProviderRule(), currentNode); 
            pushFollow(FOLLOW_ruleContentProvider_in_entryRuleContentProvider3979);
            iv_ruleContentProvider=ruleContentProvider();
            _fsp--;

             current =iv_ruleContentProvider; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentProvider3989); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleContentProvider


    // $ANTLR start ruleContentProvider
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2078:1: ruleContentProvider returns [EObject current=null] : ( 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) ( 'returns' | ( (lv_storing_4_0= 'stores' ) ) ) ( ( RULE_ID ) ) ( (lv_many_6_0= '[]' ) )? ( (lv_implementation_7_0= ruleContentProviderImplementation ) )? ) ;
    public final EObject ruleContentProvider() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_storing_4_0=null;
        Token lv_many_6_0=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_implementation_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2083:6: ( ( 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) ( 'returns' | ( (lv_storing_4_0= 'stores' ) ) ) ( ( RULE_ID ) ) ( (lv_many_6_0= '[]' ) )? ( (lv_implementation_7_0= ruleContentProviderImplementation ) )? ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2084:1: ( 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) ( 'returns' | ( (lv_storing_4_0= 'stores' ) ) ) ( ( RULE_ID ) ) ( (lv_many_6_0= '[]' ) )? ( (lv_implementation_7_0= ruleContentProviderImplementation ) )? )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2084:1: ( 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) ( 'returns' | ( (lv_storing_4_0= 'stores' ) ) ) ( ( RULE_ID ) ) ( (lv_many_6_0= '[]' ) )? ( (lv_implementation_7_0= ruleContentProviderImplementation ) )? )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2084:3: 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) ( 'returns' | ( (lv_storing_4_0= 'stores' ) ) ) ( ( RULE_ID ) ) ( (lv_many_6_0= '[]' ) )? ( (lv_implementation_7_0= ruleContentProviderImplementation ) )?
            {
            match(input,34,FOLLOW_34_in_ruleContentProvider4024); 

                    createLeafNode(grammarAccess.getContentProviderAccess().getContentproviderKeyword_0(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2088:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2089:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2089:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2090:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentProvider4041); 

            			createLeafNode(grammarAccess.getContentProviderAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getContentProviderRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2112:2: ( (lv_parameters_2_0= ruleParameterDefinitions ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2113:1: (lv_parameters_2_0= ruleParameterDefinitions )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2113:1: (lv_parameters_2_0= ruleParameterDefinitions )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2114:3: lv_parameters_2_0= ruleParameterDefinitions
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getContentProviderAccess().getParametersParameterDefinitionsParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleParameterDefinitions_in_ruleContentProvider4067);
            lv_parameters_2_0=ruleParameterDefinitions();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getContentProviderRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"parameters",
            	        		lv_parameters_2_0, 
            	        		"ParameterDefinitions", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2136:2: ( 'returns' | ( (lv_storing_4_0= 'stores' ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            else if ( (LA23_0==36) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2136:2: ( 'returns' | ( (lv_storing_4_0= 'stores' ) ) )", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2136:4: 'returns'
                    {
                    match(input,35,FOLLOW_35_in_ruleContentProvider4078); 

                            createLeafNode(grammarAccess.getContentProviderAccess().getReturnsKeyword_3_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2141:6: ( (lv_storing_4_0= 'stores' ) )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2141:6: ( (lv_storing_4_0= 'stores' ) )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2142:1: (lv_storing_4_0= 'stores' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2142:1: (lv_storing_4_0= 'stores' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2143:3: lv_storing_4_0= 'stores'
                    {
                    lv_storing_4_0=(Token)input.LT(1);
                    match(input,36,FOLLOW_36_in_ruleContentProvider4102); 

                            createLeafNode(grammarAccess.getContentProviderAccess().getStoringStoresKeyword_3_1_0(), "storing"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getContentProviderRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "storing", true, "stores", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2162:3: ( ( RULE_ID ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2163:1: ( RULE_ID )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2163:1: ( RULE_ID )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2164:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getContentProviderRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentProvider4134); 

            		createLeafNode(grammarAccess.getContentProviderAccess().getTypeTypeCrossReference_4_0(), "type"); 
            	

            }


            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2176:2: ( (lv_many_6_0= '[]' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==21) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2177:1: (lv_many_6_0= '[]' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2177:1: (lv_many_6_0= '[]' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2178:3: lv_many_6_0= '[]'
                    {
                    lv_many_6_0=(Token)input.LT(1);
                    match(input,21,FOLLOW_21_in_ruleContentProvider4152); 

                            createLeafNode(grammarAccess.getContentProviderAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0(), "many"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getContentProviderRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "many", true, "[]", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2197:3: ( (lv_implementation_7_0= ruleContentProviderImplementation ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==19||LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2198:1: (lv_implementation_7_0= ruleContentProviderImplementation )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2198:1: (lv_implementation_7_0= ruleContentProviderImplementation )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2199:3: lv_implementation_7_0= ruleContentProviderImplementation
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getContentProviderAccess().getImplementationContentProviderImplementationParserRuleCall_6_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleContentProviderImplementation_in_ruleContentProvider4187);
                    lv_implementation_7_0=ruleContentProviderImplementation();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getContentProviderRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"implementation",
                    	        		lv_implementation_7_0, 
                    	        		"ContentProviderImplementation", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleContentProvider


    // $ANTLR start entryRuleContentProviderImplementation
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2229:1: entryRuleContentProviderImplementation returns [EObject current=null] : iv_ruleContentProviderImplementation= ruleContentProviderImplementation EOF ;
    public final EObject entryRuleContentProviderImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentProviderImplementation = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2230:2: (iv_ruleContentProviderImplementation= ruleContentProviderImplementation EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2231:2: iv_ruleContentProviderImplementation= ruleContentProviderImplementation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContentProviderImplementationRule(), currentNode); 
            pushFollow(FOLLOW_ruleContentProviderImplementation_in_entryRuleContentProviderImplementation4224);
            iv_ruleContentProviderImplementation=ruleContentProviderImplementation();
            _fsp--;

             current =iv_ruleContentProviderImplementation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentProviderImplementation4234); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleContentProviderImplementation


    // $ANTLR start ruleContentProviderImplementation
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2238:1: ruleContentProviderImplementation returns [EObject current=null] : (this_UrlContentProviderImplementation_0= ruleUrlContentProviderImplementation | this_CustomContentProviderImplementation_1= ruleCustomContentProviderImplementation ) ;
    public final EObject ruleContentProviderImplementation() throws RecognitionException {
        EObject current = null;

        EObject this_UrlContentProviderImplementation_0 = null;

        EObject this_CustomContentProviderImplementation_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2243:6: ( (this_UrlContentProviderImplementation_0= ruleUrlContentProviderImplementation | this_CustomContentProviderImplementation_1= ruleCustomContentProviderImplementation ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2244:1: (this_UrlContentProviderImplementation_0= ruleUrlContentProviderImplementation | this_CustomContentProviderImplementation_1= ruleCustomContentProviderImplementation )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2244:1: (this_UrlContentProviderImplementation_0= ruleUrlContentProviderImplementation | this_CustomContentProviderImplementation_1= ruleCustomContentProviderImplementation )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            else if ( (LA26_0==19) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2244:1: (this_UrlContentProviderImplementation_0= ruleUrlContentProviderImplementation | this_CustomContentProviderImplementation_1= ruleCustomContentProviderImplementation )", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2245:5: this_UrlContentProviderImplementation_0= ruleUrlContentProviderImplementation
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContentProviderImplementationAccess().getUrlContentProviderImplementationParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUrlContentProviderImplementation_in_ruleContentProviderImplementation4281);
                    this_UrlContentProviderImplementation_0=ruleUrlContentProviderImplementation();
                    _fsp--;

                     
                            current = this_UrlContentProviderImplementation_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2255:5: this_CustomContentProviderImplementation_1= ruleCustomContentProviderImplementation
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContentProviderImplementationAccess().getCustomContentProviderImplementationParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCustomContentProviderImplementation_in_ruleContentProviderImplementation4308);
                    this_CustomContentProviderImplementation_1=ruleCustomContentProviderImplementation();
                    _fsp--;

                     
                            current = this_CustomContentProviderImplementation_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleContentProviderImplementation


    // $ANTLR start entryRuleUrlContentProviderImplementation
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2271:1: entryRuleUrlContentProviderImplementation returns [EObject current=null] : iv_ruleUrlContentProviderImplementation= ruleUrlContentProviderImplementation EOF ;
    public final EObject entryRuleUrlContentProviderImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUrlContentProviderImplementation = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2272:2: (iv_ruleUrlContentProviderImplementation= ruleUrlContentProviderImplementation EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2273:2: iv_ruleUrlContentProviderImplementation= ruleUrlContentProviderImplementation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUrlContentProviderImplementationRule(), currentNode); 
            pushFollow(FOLLOW_ruleUrlContentProviderImplementation_in_entryRuleUrlContentProviderImplementation4343);
            iv_ruleUrlContentProviderImplementation=ruleUrlContentProviderImplementation();
            _fsp--;

             current =iv_ruleUrlContentProviderImplementation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUrlContentProviderImplementation4353); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUrlContentProviderImplementation


    // $ANTLR start ruleUrlContentProviderImplementation
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2280:1: ruleUrlContentProviderImplementation returns [EObject current=null] : ( 'fetches' ( (lv_format_1_0= ruleSerializationFormat ) ) 'from' ( (lv_url_3_0= ruleScalarExpression ) ) ( 'selects' ( (lv_selection_5_0= ruleScalarExpression ) ) )? ) ;
    public final EObject ruleUrlContentProviderImplementation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_format_1_0 = null;

        EObject lv_url_3_0 = null;

        EObject lv_selection_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2285:6: ( ( 'fetches' ( (lv_format_1_0= ruleSerializationFormat ) ) 'from' ( (lv_url_3_0= ruleScalarExpression ) ) ( 'selects' ( (lv_selection_5_0= ruleScalarExpression ) ) )? ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2286:1: ( 'fetches' ( (lv_format_1_0= ruleSerializationFormat ) ) 'from' ( (lv_url_3_0= ruleScalarExpression ) ) ( 'selects' ( (lv_selection_5_0= ruleScalarExpression ) ) )? )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2286:1: ( 'fetches' ( (lv_format_1_0= ruleSerializationFormat ) ) 'from' ( (lv_url_3_0= ruleScalarExpression ) ) ( 'selects' ( (lv_selection_5_0= ruleScalarExpression ) ) )? )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2286:3: 'fetches' ( (lv_format_1_0= ruleSerializationFormat ) ) 'from' ( (lv_url_3_0= ruleScalarExpression ) ) ( 'selects' ( (lv_selection_5_0= ruleScalarExpression ) ) )?
            {
            match(input,37,FOLLOW_37_in_ruleUrlContentProviderImplementation4388); 

                    createLeafNode(grammarAccess.getUrlContentProviderImplementationAccess().getFetchesKeyword_0(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2290:1: ( (lv_format_1_0= ruleSerializationFormat ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2291:1: (lv_format_1_0= ruleSerializationFormat )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2291:1: (lv_format_1_0= ruleSerializationFormat )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2292:3: lv_format_1_0= ruleSerializationFormat
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getUrlContentProviderImplementationAccess().getFormatSerializationFormatEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSerializationFormat_in_ruleUrlContentProviderImplementation4409);
            lv_format_1_0=ruleSerializationFormat();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUrlContentProviderImplementationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"format",
            	        		lv_format_1_0, 
            	        		"SerializationFormat", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,38,FOLLOW_38_in_ruleUrlContentProviderImplementation4419); 

                    createLeafNode(grammarAccess.getUrlContentProviderImplementationAccess().getFromKeyword_2(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2318:1: ( (lv_url_3_0= ruleScalarExpression ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2319:1: (lv_url_3_0= ruleScalarExpression )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2319:1: (lv_url_3_0= ruleScalarExpression )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2320:3: lv_url_3_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getUrlContentProviderImplementationAccess().getUrlScalarExpressionParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleUrlContentProviderImplementation4440);
            lv_url_3_0=ruleScalarExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUrlContentProviderImplementationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"url",
            	        		lv_url_3_0, 
            	        		"ScalarExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2342:2: ( 'selects' ( (lv_selection_5_0= ruleScalarExpression ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2342:4: 'selects' ( (lv_selection_5_0= ruleScalarExpression ) )
                    {
                    match(input,39,FOLLOW_39_in_ruleUrlContentProviderImplementation4451); 

                            createLeafNode(grammarAccess.getUrlContentProviderImplementationAccess().getSelectsKeyword_4_0(), null); 
                        
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2346:1: ( (lv_selection_5_0= ruleScalarExpression ) )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2347:1: (lv_selection_5_0= ruleScalarExpression )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2347:1: (lv_selection_5_0= ruleScalarExpression )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2348:3: lv_selection_5_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUrlContentProviderImplementationAccess().getSelectionScalarExpressionParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleUrlContentProviderImplementation4472);
                    lv_selection_5_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUrlContentProviderImplementationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"selection",
                    	        		lv_selection_5_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUrlContentProviderImplementation


    // $ANTLR start entryRuleCustomContentProviderImplementation
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2378:1: entryRuleCustomContentProviderImplementation returns [EObject current=null] : iv_ruleCustomContentProviderImplementation= ruleCustomContentProviderImplementation EOF ;
    public final EObject entryRuleCustomContentProviderImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomContentProviderImplementation = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2379:2: (iv_ruleCustomContentProviderImplementation= ruleCustomContentProviderImplementation EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2380:2: iv_ruleCustomContentProviderImplementation= ruleCustomContentProviderImplementation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCustomContentProviderImplementationRule(), currentNode); 
            pushFollow(FOLLOW_ruleCustomContentProviderImplementation_in_entryRuleCustomContentProviderImplementation4510);
            iv_ruleCustomContentProviderImplementation=ruleCustomContentProviderImplementation();
            _fsp--;

             current =iv_ruleCustomContentProviderImplementation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomContentProviderImplementation4520); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCustomContentProviderImplementation


    // $ANTLR start ruleCustomContentProviderImplementation
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2387:1: ruleCustomContentProviderImplementation returns [EObject current=null] : ( (lv_providerClass_0_0= ruleProjectClass ) ) ;
    public final EObject ruleCustomContentProviderImplementation() throws RecognitionException {
        EObject current = null;

        EObject lv_providerClass_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2392:6: ( ( (lv_providerClass_0_0= ruleProjectClass ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2393:1: ( (lv_providerClass_0_0= ruleProjectClass ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2393:1: ( (lv_providerClass_0_0= ruleProjectClass ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2394:1: (lv_providerClass_0_0= ruleProjectClass )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2394:1: (lv_providerClass_0_0= ruleProjectClass )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2395:3: lv_providerClass_0_0= ruleProjectClass
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCustomContentProviderImplementationAccess().getProviderClassProjectClassParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleProjectClass_in_ruleCustomContentProviderImplementation4565);
            lv_providerClass_0_0=ruleProjectClass();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCustomContentProviderImplementationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"providerClass",
            	        		lv_providerClass_0_0, 
            	        		"ProjectClass", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCustomContentProviderImplementation


    // $ANTLR start entryRuleContentProviderCall
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2425:1: entryRuleContentProviderCall returns [EObject current=null] : iv_ruleContentProviderCall= ruleContentProviderCall EOF ;
    public final EObject entryRuleContentProviderCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentProviderCall = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2426:2: (iv_ruleContentProviderCall= ruleContentProviderCall EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2427:2: iv_ruleContentProviderCall= ruleContentProviderCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContentProviderCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleContentProviderCall_in_entryRuleContentProviderCall4600);
            iv_ruleContentProviderCall=ruleContentProviderCall();
            _fsp--;

             current =iv_ruleContentProviderCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentProviderCall4610); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleContentProviderCall


    // $ANTLR start ruleContentProviderCall
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2434:1: ruleContentProviderCall returns [EObject current=null] : ( ( ( RULE_ID ) ) ( (lv_parameters_1_0= ruleParameterValues ) ) ) ;
    public final EObject ruleContentProviderCall() throws RecognitionException {
        EObject current = null;

        EObject lv_parameters_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2439:6: ( ( ( ( RULE_ID ) ) ( (lv_parameters_1_0= ruleParameterValues ) ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2440:1: ( ( ( RULE_ID ) ) ( (lv_parameters_1_0= ruleParameterValues ) ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2440:1: ( ( ( RULE_ID ) ) ( (lv_parameters_1_0= ruleParameterValues ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2440:2: ( ( RULE_ID ) ) ( (lv_parameters_1_0= ruleParameterValues ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2440:2: ( ( RULE_ID ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2441:1: ( RULE_ID )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2441:1: ( RULE_ID )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2442:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getContentProviderCallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentProviderCall4653); 

            		createLeafNode(grammarAccess.getContentProviderCallAccess().getTargetContentProviderCrossReference_0_0(), "target"); 
            	

            }


            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2454:2: ( (lv_parameters_1_0= ruleParameterValues ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2455:1: (lv_parameters_1_0= ruleParameterValues )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2455:1: (lv_parameters_1_0= ruleParameterValues )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2456:3: lv_parameters_1_0= ruleParameterValues
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getContentProviderCallAccess().getParametersParameterValuesParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleParameterValues_in_ruleContentProviderCall4674);
            lv_parameters_1_0=ruleParameterValues();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getContentProviderCallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"parameters",
            	        		lv_parameters_1_0, 
            	        		"ParameterValues", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleContentProviderCall


    // $ANTLR start entryRuleAssignment
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2486:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2487:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2488:2: iv_ruleAssignment= ruleAssignment EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssignmentRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment4710);
            iv_ruleAssignment=ruleAssignment();
            _fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment4720); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAssignment


    // $ANTLR start ruleAssignment
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2495:1: ruleAssignment returns [EObject current=null] : ( ( (lv_typeRef_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= ruleContentProviderCall ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_typeRef_0_0 = null;

        EObject lv_value_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2500:6: ( ( ( (lv_typeRef_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= ruleContentProviderCall ) ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2501:1: ( ( (lv_typeRef_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= ruleContentProviderCall ) ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2501:1: ( ( (lv_typeRef_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= ruleContentProviderCall ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2501:2: ( (lv_typeRef_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= ruleContentProviderCall ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2501:2: ( (lv_typeRef_0_0= ruleTypeReference ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2502:1: (lv_typeRef_0_0= ruleTypeReference )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2502:1: (lv_typeRef_0_0= ruleTypeReference )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2503:3: lv_typeRef_0_0= ruleTypeReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getTypeRefTypeReferenceParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeReference_in_ruleAssignment4766);
            lv_typeRef_0_0=ruleTypeReference();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"typeRef",
            	        		lv_typeRef_0_0, 
            	        		"TypeReference", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2525:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2526:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2526:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2527:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment4783); 

            			createLeafNode(grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,40,FOLLOW_40_in_ruleAssignment4798); 

                    createLeafNode(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_2(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2553:1: ( (lv_value_3_0= ruleContentProviderCall ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2554:1: (lv_value_3_0= ruleContentProviderCall )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2554:1: (lv_value_3_0= ruleContentProviderCall )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2555:3: lv_value_3_0= ruleContentProviderCall
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getValueContentProviderCallParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleContentProviderCall_in_ruleAssignment4819);
            lv_value_3_0=ruleContentProviderCall();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_3_0, 
            	        		"ContentProviderCall", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAssignment


    // $ANTLR start entryRuleView
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2585:1: entryRuleView returns [EObject current=null] : iv_ruleView= ruleView EOF ;
    public final EObject entryRuleView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleView = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2586:2: (iv_ruleView= ruleView EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2587:2: iv_ruleView= ruleView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleView_in_entryRuleView4855);
            iv_ruleView=ruleView();
            _fsp--;

             current =iv_ruleView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleView4865); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleView


    // $ANTLR start ruleView
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2594:1: ruleView returns [EObject current=null] : (this_TabView_0= ruleTabView | this_TableView_1= ruleTableView | this_CustomView_2= ruleCustomView ) ;
    public final EObject ruleView() throws RecognitionException {
        EObject current = null;

        EObject this_TabView_0 = null;

        EObject this_TableView_1 = null;

        EObject this_CustomView_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2599:6: ( (this_TabView_0= ruleTabView | this_TableView_1= ruleTableView | this_CustomView_2= ruleCustomView ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2600:1: (this_TabView_0= ruleTabView | this_TableView_1= ruleTableView | this_CustomView_2= ruleCustomView )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2600:1: (this_TabView_0= ruleTabView | this_TableView_1= ruleTableView | this_CustomView_2= ruleCustomView )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt28=1;
                }
                break;
            case 45:
                {
                alt28=2;
                }
                break;
            case 55:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2600:1: (this_TabView_0= ruleTabView | this_TableView_1= ruleTableView | this_CustomView_2= ruleCustomView )", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2601:5: this_TabView_0= ruleTabView
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getViewAccess().getTabViewParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTabView_in_ruleView4912);
                    this_TabView_0=ruleTabView();
                    _fsp--;

                     
                            current = this_TabView_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2611:5: this_TableView_1= ruleTableView
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getViewAccess().getTableViewParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTableView_in_ruleView4939);
                    this_TableView_1=ruleTableView();
                    _fsp--;

                     
                            current = this_TableView_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2621:5: this_CustomView_2= ruleCustomView
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getViewAccess().getCustomViewParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCustomView_in_ruleView4966);
                    this_CustomView_2=ruleCustomView();
                    _fsp--;

                     
                            current = this_CustomView_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleView


    // $ANTLR start entryRuleTabView
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2637:1: entryRuleTabView returns [EObject current=null] : iv_ruleTabView= ruleTabView EOF ;
    public final EObject entryRuleTabView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabView = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2638:2: (iv_ruleTabView= ruleTabView EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2639:2: iv_ruleTabView= ruleTabView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTabViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleTabView_in_entryRuleTabView5001);
            iv_ruleTabView=ruleTabView();
            _fsp--;

             current =iv_ruleTabView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabView5011); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTabView


    // $ANTLR start ruleTabView
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2646:1: ruleTabView returns [EObject current=null] : ( 'tabview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) '{' ( (lv_tabs_4_0= ruleTab ) )* '}' ) ;
    public final EObject ruleTabView() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_tabs_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2651:6: ( ( 'tabview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) '{' ( (lv_tabs_4_0= ruleTab ) )* '}' ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2652:1: ( 'tabview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) '{' ( (lv_tabs_4_0= ruleTab ) )* '}' )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2652:1: ( 'tabview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) '{' ( (lv_tabs_4_0= ruleTab ) )* '}' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2652:3: 'tabview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) '{' ( (lv_tabs_4_0= ruleTab ) )* '}'
            {
            match(input,41,FOLLOW_41_in_ruleTabView5046); 

                    createLeafNode(grammarAccess.getTabViewAccess().getTabviewKeyword_0(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2656:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2657:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2657:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2658:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTabView5063); 

            			createLeafNode(grammarAccess.getTabViewAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTabViewRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2680:2: ( (lv_parameters_2_0= ruleParameterDefinitions ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2681:1: (lv_parameters_2_0= ruleParameterDefinitions )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2681:1: (lv_parameters_2_0= ruleParameterDefinitions )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2682:3: lv_parameters_2_0= ruleParameterDefinitions
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTabViewAccess().getParametersParameterDefinitionsParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleParameterDefinitions_in_ruleTabView5089);
            lv_parameters_2_0=ruleParameterDefinitions();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTabViewRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"parameters",
            	        		lv_parameters_2_0, 
            	        		"ParameterDefinitions", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleTabView5099); 

                    createLeafNode(grammarAccess.getTabViewAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2708:1: ( (lv_tabs_4_0= ruleTab ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==42) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2709:1: (lv_tabs_4_0= ruleTab )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2709:1: (lv_tabs_4_0= ruleTab )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2710:3: lv_tabs_4_0= ruleTab
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTabViewAccess().getTabsTabParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTab_in_ruleTabView5120);
            	    lv_tabs_4_0=ruleTab();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTabViewRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"tabs",
            	    	        		lv_tabs_4_0, 
            	    	        		"Tab", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            match(input,15,FOLLOW_15_in_ruleTabView5131); 

                    createLeafNode(grammarAccess.getTabViewAccess().getRightCurlyBracketKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTabView


    // $ANTLR start entryRuleTab
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2744:1: entryRuleTab returns [EObject current=null] : iv_ruleTab= ruleTab EOF ;
    public final EObject entryRuleTab() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTab = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2745:2: (iv_ruleTab= ruleTab EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2746:2: iv_ruleTab= ruleTab EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTabRule(), currentNode); 
            pushFollow(FOLLOW_ruleTab_in_entryRuleTab5167);
            iv_ruleTab=ruleTab();
            _fsp--;

             current =iv_ruleTab; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTab5177); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTab


    // $ANTLR start ruleTab
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2753:1: ruleTab returns [EObject current=null] : ( 'tab' '{' ( ( ( ( ({...}? => ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) ) ) )+ {...}?) ) ) '}' ) ;
    public final EObject ruleTab() throws RecognitionException {
        EObject current = null;

        EObject lv_title_4_0 = null;

        EObject lv_icon_6_0 = null;

        EObject lv_view_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2758:6: ( ( 'tab' '{' ( ( ( ( ({...}? => ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) ) ) )+ {...}?) ) ) '}' ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2759:1: ( 'tab' '{' ( ( ( ( ({...}? => ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) ) ) )+ {...}?) ) ) '}' )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2759:1: ( 'tab' '{' ( ( ( ( ({...}? => ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) ) ) )+ {...}?) ) ) '}' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2759:3: 'tab' '{' ( ( ( ( ({...}? => ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) ) ) )+ {...}?) ) ) '}'
            {
            match(input,42,FOLLOW_42_in_ruleTab5212); 

                    createLeafNode(grammarAccess.getTabAccess().getTabKeyword_0(), null); 
                
            match(input,12,FOLLOW_12_in_ruleTab5222); 

                    createLeafNode(grammarAccess.getTabAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2767:1: ( ( ( ( ({...}? => ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) ) ) )+ {...}?) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2769:1: ( ( ( ({...}? => ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) ) ) )+ {...}?) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2769:1: ( ( ( ({...}? => ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) ) ) )+ {...}?) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2770:2: ( ( ({...}? => ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTabAccess().getUnorderedGroup_2());
            	
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2773:2: ( ( ({...}? => ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) ) ) )+ {...}?)
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2774:3: ( ({...}? => ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) ) ) )+ {...}?
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2774:3: ( ({...}? => ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) ) ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=4;
                int LA30_0 = input.LA(1);

                if ( LA30_0 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getTabAccess().getUnorderedGroup_2(), 0) ) {
                    alt30=1;
                }
                else if ( LA30_0 ==44 && getUnorderedGroupHelper().canSelect(grammarAccess.getTabAccess().getUnorderedGroup_2(), 1) ) {
                    alt30=2;
                }
                else if ( LA30_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getTabAccess().getUnorderedGroup_2(), 2) ) {
                    alt30=3;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2776:4: ({...}? => ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) ) )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2776:4: ({...}? => ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2777:5: {...}? => ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTabAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTab", "getUnorderedGroupHelper().canSelect(grammarAccess.getTabAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2777:100: ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2778:6: ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTabAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2781:6: ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2781:8: 'title:' ( (lv_title_4_0= ruleScalarExpression ) )
            	    {
            	    match(input,43,FOLLOW_43_in_ruleTab5275); 

            	            createLeafNode(grammarAccess.getTabAccess().getTitleKeyword_2_0_0(), null); 
            	        
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2785:1: ( (lv_title_4_0= ruleScalarExpression ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2786:1: (lv_title_4_0= ruleScalarExpression )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2786:1: (lv_title_4_0= ruleScalarExpression )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2787:3: lv_title_4_0= ruleScalarExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTabAccess().getTitleScalarExpressionParserRuleCall_2_0_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleScalarExpression_in_ruleTab5296);
            	    lv_title_4_0=ruleScalarExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTabRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"title",
            	    	        		lv_title_4_0, 
            	    	        		"ScalarExpression", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTabAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2816:4: ({...}? => ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) ) )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2816:4: ({...}? => ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2817:5: {...}? => ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTabAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTab", "getUnorderedGroupHelper().canSelect(grammarAccess.getTabAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2817:100: ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2818:6: ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTabAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2821:6: ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2821:8: 'icon:' ( (lv_icon_6_0= ruleImageExpression ) )
            	    {
            	    match(input,44,FOLLOW_44_in_ruleTab5358); 

            	            createLeafNode(grammarAccess.getTabAccess().getIconKeyword_2_1_0(), null); 
            	        
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2825:1: ( (lv_icon_6_0= ruleImageExpression ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2826:1: (lv_icon_6_0= ruleImageExpression )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2826:1: (lv_icon_6_0= ruleImageExpression )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2827:3: lv_icon_6_0= ruleImageExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTabAccess().getIconImageExpressionParserRuleCall_2_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleImageExpression_in_ruleTab5379);
            	    lv_icon_6_0=ruleImageExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTabRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"icon",
            	    	        		lv_icon_6_0, 
            	    	        		"ImageExpression", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTabAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2856:4: ({...}? => ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) ) )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2856:4: ({...}? => ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2857:5: {...}? => ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTabAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTab", "getUnorderedGroupHelper().canSelect(grammarAccess.getTabAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2857:100: ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2858:6: ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTabAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2861:6: ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2861:8: 'view:' ( (lv_view_8_0= ruleViewCall ) )
            	    {
            	    match(input,14,FOLLOW_14_in_ruleTab5441); 

            	            createLeafNode(grammarAccess.getTabAccess().getViewKeyword_2_2_0(), null); 
            	        
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2865:1: ( (lv_view_8_0= ruleViewCall ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2866:1: (lv_view_8_0= ruleViewCall )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2866:1: (lv_view_8_0= ruleViewCall )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2867:3: lv_view_8_0= ruleViewCall
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTabAccess().getViewViewCallParserRuleCall_2_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleViewCall_in_ruleTab5462);
            	    lv_view_8_0=ruleViewCall();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTabRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"view",
            	    	        		lv_view_8_0, 
            	    	        		"ViewCall", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTabAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTabAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleTab", "getUnorderedGroupHelper().canLeave(grammarAccess.getTabAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTabAccess().getUnorderedGroup_2());
            	

            }

            match(input,15,FOLLOW_15_in_ruleTab5518); 

                    createLeafNode(grammarAccess.getTabAccess().getRightCurlyBracketKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTab


    // $ANTLR start entryRuleTableView
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2916:1: entryRuleTableView returns [EObject current=null] : iv_ruleTableView= ruleTableView EOF ;
    public final EObject entryRuleTableView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableView = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2917:2: (iv_ruleTableView= ruleTableView EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2918:2: iv_ruleTableView= ruleTableView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTableViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleTableView_in_entryRuleTableView5554);
            iv_ruleTableView=ruleTableView();
            _fsp--;

             current =iv_ruleTableView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableView5564); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTableView


    // $ANTLR start ruleTableView
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2925:1: ruleTableView returns [EObject current=null] : ( 'tableview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) '{' ( (lv_variables_4_0= ruleAssignment ) )* ( ( ( ( ({...}? => ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) ) ) )* ) ) ) ( (lv_sections_12_0= ruleSection ) )* '}' ) ;
    public final EObject ruleTableView() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_variables_4_0 = null;

        EObject lv_title_7_0 = null;

        EObject lv_titleImage_9_0 = null;

        Enumerator lv_style_11_0 = null;

        EObject lv_sections_12_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2930:6: ( ( 'tableview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) '{' ( (lv_variables_4_0= ruleAssignment ) )* ( ( ( ( ({...}? => ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) ) ) )* ) ) ) ( (lv_sections_12_0= ruleSection ) )* '}' ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2931:1: ( 'tableview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) '{' ( (lv_variables_4_0= ruleAssignment ) )* ( ( ( ( ({...}? => ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) ) ) )* ) ) ) ( (lv_sections_12_0= ruleSection ) )* '}' )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2931:1: ( 'tableview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) '{' ( (lv_variables_4_0= ruleAssignment ) )* ( ( ( ( ({...}? => ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) ) ) )* ) ) ) ( (lv_sections_12_0= ruleSection ) )* '}' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2931:3: 'tableview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) '{' ( (lv_variables_4_0= ruleAssignment ) )* ( ( ( ( ({...}? => ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) ) ) )* ) ) ) ( (lv_sections_12_0= ruleSection ) )* '}'
            {
            match(input,45,FOLLOW_45_in_ruleTableView5599); 

                    createLeafNode(grammarAccess.getTableViewAccess().getTableviewKeyword_0(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2935:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2936:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2936:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2937:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTableView5616); 

            			createLeafNode(grammarAccess.getTableViewAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTableViewRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2959:2: ( (lv_parameters_2_0= ruleParameterDefinitions ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2960:1: (lv_parameters_2_0= ruleParameterDefinitions )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2960:1: (lv_parameters_2_0= ruleParameterDefinitions )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2961:3: lv_parameters_2_0= ruleParameterDefinitions
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTableViewAccess().getParametersParameterDefinitionsParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleParameterDefinitions_in_ruleTableView5642);
            lv_parameters_2_0=ruleParameterDefinitions();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTableViewRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"parameters",
            	        		lv_parameters_2_0, 
            	        		"ParameterDefinitions", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleTableView5652); 

                    createLeafNode(grammarAccess.getTableViewAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2987:1: ( (lv_variables_4_0= ruleAssignment ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2988:1: (lv_variables_4_0= ruleAssignment )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2988:1: (lv_variables_4_0= ruleAssignment )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2989:3: lv_variables_4_0= ruleAssignment
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTableViewAccess().getVariablesAssignmentParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleTableView5673);
            	    lv_variables_4_0=ruleAssignment();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTableViewRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"variables",
            	    	        		lv_variables_4_0, 
            	    	        		"Assignment", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3011:3: ( ( ( ( ({...}? => ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) ) ) )* ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3013:1: ( ( ( ({...}? => ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) ) ) )* ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3013:1: ( ( ( ({...}? => ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) ) ) )* ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3014:2: ( ( ({...}? => ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTableViewAccess().getUnorderedGroup_5());
            	
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3017:2: ( ( ({...}? => ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) ) ) )* )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3018:3: ( ({...}? => ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) ) ) )*
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3018:3: ( ({...}? => ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) ) ) )*
            loop32:
            do {
                int alt32=4;
                int LA32_0 = input.LA(1);

                if ( LA32_0 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableViewAccess().getUnorderedGroup_5(), 0) ) {
                    alt32=1;
                }
                else if ( LA32_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableViewAccess().getUnorderedGroup_5(), 1) ) {
                    alt32=2;
                }
                else if ( LA32_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableViewAccess().getUnorderedGroup_5(), 2) ) {
                    alt32=3;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3020:4: ({...}? => ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) ) )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3020:4: ({...}? => ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3021:5: {...}? => ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableViewAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTableView", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableViewAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3021:106: ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3022:6: ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableViewAccess().getUnorderedGroup_5(), 0);
            	    	 				
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3025:6: ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3025:8: 'title:' ( (lv_title_7_0= ruleScalarExpression ) )
            	    {
            	    match(input,43,FOLLOW_43_in_ruleTableView5727); 

            	            createLeafNode(grammarAccess.getTableViewAccess().getTitleKeyword_5_0_0(), null); 
            	        
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3029:1: ( (lv_title_7_0= ruleScalarExpression ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3030:1: (lv_title_7_0= ruleScalarExpression )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3030:1: (lv_title_7_0= ruleScalarExpression )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3031:3: lv_title_7_0= ruleScalarExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTableViewAccess().getTitleScalarExpressionParserRuleCall_5_0_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleScalarExpression_in_ruleTableView5748);
            	    lv_title_7_0=ruleScalarExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTableViewRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"title",
            	    	        		lv_title_7_0, 
            	    	        		"ScalarExpression", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableViewAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3060:4: ({...}? => ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) ) )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3060:4: ({...}? => ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3061:5: {...}? => ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableViewAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTableView", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableViewAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3061:106: ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3062:6: ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableViewAccess().getUnorderedGroup_5(), 1);
            	    	 				
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3065:6: ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3065:8: 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) )
            	    {
            	    match(input,46,FOLLOW_46_in_ruleTableView5810); 

            	            createLeafNode(grammarAccess.getTableViewAccess().getTitleImageKeyword_5_1_0(), null); 
            	        
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3069:1: ( (lv_titleImage_9_0= ruleImageExpression ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3070:1: (lv_titleImage_9_0= ruleImageExpression )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3070:1: (lv_titleImage_9_0= ruleImageExpression )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3071:3: lv_titleImage_9_0= ruleImageExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTableViewAccess().getTitleImageImageExpressionParserRuleCall_5_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleImageExpression_in_ruleTableView5831);
            	    lv_titleImage_9_0=ruleImageExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTableViewRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"titleImage",
            	    	        		lv_titleImage_9_0, 
            	    	        		"ImageExpression", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableViewAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3100:4: ({...}? => ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) ) )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3100:4: ({...}? => ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3101:5: {...}? => ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableViewAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTableView", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableViewAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3101:106: ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3102:6: ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableViewAccess().getUnorderedGroup_5(), 2);
            	    	 				
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3105:6: ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3105:8: 'style:' ( (lv_style_11_0= ruleTableViewStyle ) )
            	    {
            	    match(input,47,FOLLOW_47_in_ruleTableView5893); 

            	            createLeafNode(grammarAccess.getTableViewAccess().getStyleKeyword_5_2_0(), null); 
            	        
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3109:1: ( (lv_style_11_0= ruleTableViewStyle ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3110:1: (lv_style_11_0= ruleTableViewStyle )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3110:1: (lv_style_11_0= ruleTableViewStyle )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3111:3: lv_style_11_0= ruleTableViewStyle
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTableViewAccess().getStyleTableViewStyleEnumRuleCall_5_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTableViewStyle_in_ruleTableView5914);
            	    lv_style_11_0=ruleTableViewStyle();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTableViewRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"style",
            	    	        		lv_style_11_0, 
            	    	        		"TableViewStyle", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableViewAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTableViewAccess().getUnorderedGroup_5());
            	

            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3147:2: ( (lv_sections_12_0= ruleSection ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==48) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3148:1: (lv_sections_12_0= ruleSection )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3148:1: (lv_sections_12_0= ruleSection )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3149:3: lv_sections_12_0= ruleSection
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTableViewAccess().getSectionsSectionParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSection_in_ruleTableView5975);
            	    lv_sections_12_0=ruleSection();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTableViewRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"sections",
            	    	        		lv_sections_12_0, 
            	    	        		"Section", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            match(input,15,FOLLOW_15_in_ruleTableView5986); 

                    createLeafNode(grammarAccess.getTableViewAccess().getRightCurlyBracketKeyword_7(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTableView


    // $ANTLR start entryRuleSection
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3185:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3186:2: (iv_ruleSection= ruleSection EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3187:2: iv_ruleSection= ruleSection EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSectionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSection_in_entryRuleSection6024);
            iv_ruleSection=ruleSection();
            _fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection6034); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSection


    // $ANTLR start ruleSection
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3194:1: ruleSection returns [EObject current=null] : ( () 'section' ( (lv_iterator_2_0= ruleCollectionIterator ) )? '{' ( 'title:' ( (lv_title_5_0= ruleScalarExpression ) ) )? ( (lv_cells_6_0= ruleCell ) )* '}' ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        EObject lv_iterator_2_0 = null;

        EObject lv_title_5_0 = null;

        EObject lv_cells_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3199:6: ( ( () 'section' ( (lv_iterator_2_0= ruleCollectionIterator ) )? '{' ( 'title:' ( (lv_title_5_0= ruleScalarExpression ) ) )? ( (lv_cells_6_0= ruleCell ) )* '}' ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3200:1: ( () 'section' ( (lv_iterator_2_0= ruleCollectionIterator ) )? '{' ( 'title:' ( (lv_title_5_0= ruleScalarExpression ) ) )? ( (lv_cells_6_0= ruleCell ) )* '}' )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3200:1: ( () 'section' ( (lv_iterator_2_0= ruleCollectionIterator ) )? '{' ( 'title:' ( (lv_title_5_0= ruleScalarExpression ) ) )? ( (lv_cells_6_0= ruleCell ) )* '}' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3200:2: () 'section' ( (lv_iterator_2_0= ruleCollectionIterator ) )? '{' ( 'title:' ( (lv_title_5_0= ruleScalarExpression ) ) )? ( (lv_cells_6_0= ruleCell ) )* '}'
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3200:2: ()
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3201:5: 
            {
             
                    temp=factory.create(grammarAccess.getSectionAccess().getSectionAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getSectionAccess().getSectionAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,48,FOLLOW_48_in_ruleSection6078); 

                    createLeafNode(grammarAccess.getSectionAccess().getSectionKeyword_1(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3215:1: ( (lv_iterator_2_0= ruleCollectionIterator ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==32) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3216:1: (lv_iterator_2_0= ruleCollectionIterator )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3216:1: (lv_iterator_2_0= ruleCollectionIterator )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3217:3: lv_iterator_2_0= ruleCollectionIterator
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionAccess().getIteratorCollectionIteratorParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCollectionIterator_in_ruleSection6099);
                    lv_iterator_2_0=ruleCollectionIterator();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSectionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"iterator",
                    	        		lv_iterator_2_0, 
                    	        		"CollectionIterator", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleSection6110); 

                    createLeafNode(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3243:1: ( 'title:' ( (lv_title_5_0= ruleScalarExpression ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==43) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3243:3: 'title:' ( (lv_title_5_0= ruleScalarExpression ) )
                    {
                    match(input,43,FOLLOW_43_in_ruleSection6121); 

                            createLeafNode(grammarAccess.getSectionAccess().getTitleKeyword_4_0(), null); 
                        
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3247:1: ( (lv_title_5_0= ruleScalarExpression ) )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3248:1: (lv_title_5_0= ruleScalarExpression )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3248:1: (lv_title_5_0= ruleScalarExpression )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3249:3: lv_title_5_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionAccess().getTitleScalarExpressionParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleSection6142);
                    lv_title_5_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSectionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"title",
                    	        		lv_title_5_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3271:4: ( (lv_cells_6_0= ruleCell ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==49) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3272:1: (lv_cells_6_0= ruleCell )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3272:1: (lv_cells_6_0= ruleCell )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3273:3: lv_cells_6_0= ruleCell
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSectionAccess().getCellsCellParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleCell_in_ruleSection6165);
            	    lv_cells_6_0=ruleCell();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSectionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"cells",
            	    	        		lv_cells_6_0, 
            	    	        		"Cell", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            match(input,15,FOLLOW_15_in_ruleSection6176); 

                    createLeafNode(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSection


    // $ANTLR start entryRuleCell
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3307:1: entryRuleCell returns [EObject current=null] : iv_ruleCell= ruleCell EOF ;
    public final EObject entryRuleCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCell = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3308:2: (iv_ruleCell= ruleCell EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3309:2: iv_ruleCell= ruleCell EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCellRule(), currentNode); 
            pushFollow(FOLLOW_ruleCell_in_entryRuleCell6212);
            iv_ruleCell=ruleCell();
            _fsp--;

             current =iv_ruleCell; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCell6222); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCell


    // $ANTLR start ruleCell
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3316:1: ruleCell returns [EObject current=null] : ( () 'cell' ( (lv_type_2_0= ruleCellType ) )? ( (lv_iterator_3_0= ruleCollectionIterator ) )? '{' ( ( ( ( ({...}? => ( ( 'text:' ( (lv_text_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'detailText:' ( (lv_detailText_9_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'image:' ( (lv_image_11_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'action:' ( (lv_action_13_0= ruleAction ) ) ) ) ) | ({...}? => ( ( 'accessory:' ( (lv_accessory_15_0= ruleCellAccessory ) ) ) ) ) )* ) ) ) '}' ) ;
    public final EObject ruleCell() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_2_0 = null;

        EObject lv_iterator_3_0 = null;

        EObject lv_text_7_0 = null;

        EObject lv_detailText_9_0 = null;

        EObject lv_image_11_0 = null;

        EObject lv_action_13_0 = null;

        Enumerator lv_accessory_15_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3321:6: ( ( () 'cell' ( (lv_type_2_0= ruleCellType ) )? ( (lv_iterator_3_0= ruleCollectionIterator ) )? '{' ( ( ( ( ({...}? => ( ( 'text:' ( (lv_text_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'detailText:' ( (lv_detailText_9_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'image:' ( (lv_image_11_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'action:' ( (lv_action_13_0= ruleAction ) ) ) ) ) | ({...}? => ( ( 'accessory:' ( (lv_accessory_15_0= ruleCellAccessory ) ) ) ) ) )* ) ) ) '}' ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3322:1: ( () 'cell' ( (lv_type_2_0= ruleCellType ) )? ( (lv_iterator_3_0= ruleCollectionIterator ) )? '{' ( ( ( ( ({...}? => ( ( 'text:' ( (lv_text_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'detailText:' ( (lv_detailText_9_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'image:' ( (lv_image_11_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'action:' ( (lv_action_13_0= ruleAction ) ) ) ) ) | ({...}? => ( ( 'accessory:' ( (lv_accessory_15_0= ruleCellAccessory ) ) ) ) ) )* ) ) ) '}' )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3322:1: ( () 'cell' ( (lv_type_2_0= ruleCellType ) )? ( (lv_iterator_3_0= ruleCollectionIterator ) )? '{' ( ( ( ( ({...}? => ( ( 'text:' ( (lv_text_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'detailText:' ( (lv_detailText_9_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'image:' ( (lv_image_11_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'action:' ( (lv_action_13_0= ruleAction ) ) ) ) ) | ({...}? => ( ( 'accessory:' ( (lv_accessory_15_0= ruleCellAccessory ) ) ) ) ) )* ) ) ) '}' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3322:2: () 'cell' ( (lv_type_2_0= ruleCellType ) )? ( (lv_iterator_3_0= ruleCollectionIterator ) )? '{' ( ( ( ( ({...}? => ( ( 'text:' ( (lv_text_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'detailText:' ( (lv_detailText_9_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'image:' ( (lv_image_11_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'action:' ( (lv_action_13_0= ruleAction ) ) ) ) ) | ({...}? => ( ( 'accessory:' ( (lv_accessory_15_0= ruleCellAccessory ) ) ) ) ) )* ) ) ) '}'
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3322:2: ()
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3323:5: 
            {
             
                    temp=factory.create(grammarAccess.getCellAccess().getCellAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getCellAccess().getCellAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,49,FOLLOW_49_in_ruleCell6266); 

                    createLeafNode(grammarAccess.getCellAccess().getCellKeyword_1(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3337:1: ( (lv_type_2_0= ruleCellType ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=62 && LA37_0<=65)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3338:1: (lv_type_2_0= ruleCellType )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3338:1: (lv_type_2_0= ruleCellType )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3339:3: lv_type_2_0= ruleCellType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCellAccess().getTypeCellTypeEnumRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCellType_in_ruleCell6287);
                    lv_type_2_0=ruleCellType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCellRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"type",
                    	        		lv_type_2_0, 
                    	        		"CellType", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3361:3: ( (lv_iterator_3_0= ruleCollectionIterator ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==32) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3362:1: (lv_iterator_3_0= ruleCollectionIterator )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3362:1: (lv_iterator_3_0= ruleCollectionIterator )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3363:3: lv_iterator_3_0= ruleCollectionIterator
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCellAccess().getIteratorCollectionIteratorParserRuleCall_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCollectionIterator_in_ruleCell6309);
                    lv_iterator_3_0=ruleCollectionIterator();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCellRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"iterator",
                    	        		lv_iterator_3_0, 
                    	        		"CollectionIterator", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleCell6320); 

                    createLeafNode(grammarAccess.getCellAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3389:1: ( ( ( ( ({...}? => ( ( 'text:' ( (lv_text_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'detailText:' ( (lv_detailText_9_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'image:' ( (lv_image_11_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'action:' ( (lv_action_13_0= ruleAction ) ) ) ) ) | ({...}? => ( ( 'accessory:' ( (lv_accessory_15_0= ruleCellAccessory ) ) ) ) ) )* ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3391:1: ( ( ( ({...}? => ( ( 'text:' ( (lv_text_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'detailText:' ( (lv_detailText_9_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'image:' ( (lv_image_11_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'action:' ( (lv_action_13_0= ruleAction ) ) ) ) ) | ({...}? => ( ( 'accessory:' ( (lv_accessory_15_0= ruleCellAccessory ) ) ) ) ) )* ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3391:1: ( ( ( ({...}? => ( ( 'text:' ( (lv_text_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'detailText:' ( (lv_detailText_9_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'image:' ( (lv_image_11_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'action:' ( (lv_action_13_0= ruleAction ) ) ) ) ) | ({...}? => ( ( 'accessory:' ( (lv_accessory_15_0= ruleCellAccessory ) ) ) ) ) )* ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3392:2: ( ( ({...}? => ( ( 'text:' ( (lv_text_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'detailText:' ( (lv_detailText_9_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'image:' ( (lv_image_11_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'action:' ( (lv_action_13_0= ruleAction ) ) ) ) ) | ({...}? => ( ( 'accessory:' ( (lv_accessory_15_0= ruleCellAccessory ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getCellAccess().getUnorderedGroup_5());
            	
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3395:2: ( ( ({...}? => ( ( 'text:' ( (lv_text_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'detailText:' ( (lv_detailText_9_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'image:' ( (lv_image_11_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'action:' ( (lv_action_13_0= ruleAction ) ) ) ) ) | ({...}? => ( ( 'accessory:' ( (lv_accessory_15_0= ruleCellAccessory ) ) ) ) ) )* )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3396:3: ( ({...}? => ( ( 'text:' ( (lv_text_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'detailText:' ( (lv_detailText_9_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'image:' ( (lv_image_11_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'action:' ( (lv_action_13_0= ruleAction ) ) ) ) ) | ({...}? => ( ( 'accessory:' ( (lv_accessory_15_0= ruleCellAccessory ) ) ) ) ) )*
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3396:3: ( ({...}? => ( ( 'text:' ( (lv_text_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'detailText:' ( (lv_detailText_9_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'image:' ( (lv_image_11_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'action:' ( (lv_action_13_0= ruleAction ) ) ) ) ) | ({...}? => ( ( 'accessory:' ( (lv_accessory_15_0= ruleCellAccessory ) ) ) ) ) )*
            loop39:
            do {
                int alt39=6;
                int LA39_0 = input.LA(1);

                if ( LA39_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_5(), 0) ) {
                    alt39=1;
                }
                else if ( LA39_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_5(), 1) ) {
                    alt39=2;
                }
                else if ( LA39_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_5(), 2) ) {
                    alt39=3;
                }
                else if ( LA39_0 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_5(), 3) ) {
                    alt39=4;
                }
                else if ( LA39_0 ==54 && getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_5(), 4) ) {
                    alt39=5;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3398:4: ({...}? => ( ( 'text:' ( (lv_text_7_0= ruleScalarExpression ) ) ) ) )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3398:4: ({...}? => ( ( 'text:' ( (lv_text_7_0= ruleScalarExpression ) ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3399:5: {...}? => ( ( 'text:' ( (lv_text_7_0= ruleScalarExpression ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCell", "getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3399:101: ( ( 'text:' ( (lv_text_7_0= ruleScalarExpression ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3400:6: ( 'text:' ( (lv_text_7_0= ruleScalarExpression ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCellAccess().getUnorderedGroup_5(), 0);
            	    	 				
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3403:6: ( 'text:' ( (lv_text_7_0= ruleScalarExpression ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3403:8: 'text:' ( (lv_text_7_0= ruleScalarExpression ) )
            	    {
            	    match(input,50,FOLLOW_50_in_ruleCell6373); 

            	            createLeafNode(grammarAccess.getCellAccess().getTextKeyword_5_0_0(), null); 
            	        
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3407:1: ( (lv_text_7_0= ruleScalarExpression ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3408:1: (lv_text_7_0= ruleScalarExpression )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3408:1: (lv_text_7_0= ruleScalarExpression )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3409:3: lv_text_7_0= ruleScalarExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCellAccess().getTextScalarExpressionParserRuleCall_5_0_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleScalarExpression_in_ruleCell6394);
            	    lv_text_7_0=ruleScalarExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCellRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"text",
            	    	        		lv_text_7_0, 
            	    	        		"ScalarExpression", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCellAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3438:4: ({...}? => ( ( 'detailText:' ( (lv_detailText_9_0= ruleScalarExpression ) ) ) ) )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3438:4: ({...}? => ( ( 'detailText:' ( (lv_detailText_9_0= ruleScalarExpression ) ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3439:5: {...}? => ( ( 'detailText:' ( (lv_detailText_9_0= ruleScalarExpression ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCell", "getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3439:101: ( ( 'detailText:' ( (lv_detailText_9_0= ruleScalarExpression ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3440:6: ( 'detailText:' ( (lv_detailText_9_0= ruleScalarExpression ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCellAccess().getUnorderedGroup_5(), 1);
            	    	 				
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3443:6: ( 'detailText:' ( (lv_detailText_9_0= ruleScalarExpression ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3443:8: 'detailText:' ( (lv_detailText_9_0= ruleScalarExpression ) )
            	    {
            	    match(input,51,FOLLOW_51_in_ruleCell6456); 

            	            createLeafNode(grammarAccess.getCellAccess().getDetailTextKeyword_5_1_0(), null); 
            	        
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3447:1: ( (lv_detailText_9_0= ruleScalarExpression ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3448:1: (lv_detailText_9_0= ruleScalarExpression )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3448:1: (lv_detailText_9_0= ruleScalarExpression )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3449:3: lv_detailText_9_0= ruleScalarExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCellAccess().getDetailTextScalarExpressionParserRuleCall_5_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleScalarExpression_in_ruleCell6477);
            	    lv_detailText_9_0=ruleScalarExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCellRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"detailText",
            	    	        		lv_detailText_9_0, 
            	    	        		"ScalarExpression", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCellAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3478:4: ({...}? => ( ( 'image:' ( (lv_image_11_0= ruleScalarExpression ) ) ) ) )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3478:4: ({...}? => ( ( 'image:' ( (lv_image_11_0= ruleScalarExpression ) ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3479:5: {...}? => ( ( 'image:' ( (lv_image_11_0= ruleScalarExpression ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleCell", "getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3479:101: ( ( 'image:' ( (lv_image_11_0= ruleScalarExpression ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3480:6: ( 'image:' ( (lv_image_11_0= ruleScalarExpression ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCellAccess().getUnorderedGroup_5(), 2);
            	    	 				
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3483:6: ( 'image:' ( (lv_image_11_0= ruleScalarExpression ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3483:8: 'image:' ( (lv_image_11_0= ruleScalarExpression ) )
            	    {
            	    match(input,52,FOLLOW_52_in_ruleCell6539); 

            	            createLeafNode(grammarAccess.getCellAccess().getImageKeyword_5_2_0(), null); 
            	        
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3487:1: ( (lv_image_11_0= ruleScalarExpression ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3488:1: (lv_image_11_0= ruleScalarExpression )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3488:1: (lv_image_11_0= ruleScalarExpression )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3489:3: lv_image_11_0= ruleScalarExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCellAccess().getImageScalarExpressionParserRuleCall_5_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleScalarExpression_in_ruleCell6560);
            	    lv_image_11_0=ruleScalarExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCellRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"image",
            	    	        		lv_image_11_0, 
            	    	        		"ScalarExpression", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCellAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3518:4: ({...}? => ( ( 'action:' ( (lv_action_13_0= ruleAction ) ) ) ) )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3518:4: ({...}? => ( ( 'action:' ( (lv_action_13_0= ruleAction ) ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3519:5: {...}? => ( ( 'action:' ( (lv_action_13_0= ruleAction ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_5(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleCell", "getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3519:101: ( ( 'action:' ( (lv_action_13_0= ruleAction ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3520:6: ( 'action:' ( (lv_action_13_0= ruleAction ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCellAccess().getUnorderedGroup_5(), 3);
            	    	 				
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3523:6: ( 'action:' ( (lv_action_13_0= ruleAction ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3523:8: 'action:' ( (lv_action_13_0= ruleAction ) )
            	    {
            	    match(input,53,FOLLOW_53_in_ruleCell6622); 

            	            createLeafNode(grammarAccess.getCellAccess().getActionKeyword_5_3_0(), null); 
            	        
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3527:1: ( (lv_action_13_0= ruleAction ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3528:1: (lv_action_13_0= ruleAction )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3528:1: (lv_action_13_0= ruleAction )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3529:3: lv_action_13_0= ruleAction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCellAccess().getActionActionParserRuleCall_5_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleCell6643);
            	    lv_action_13_0=ruleAction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCellRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"action",
            	    	        		lv_action_13_0, 
            	    	        		"Action", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCellAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3558:4: ({...}? => ( ( 'accessory:' ( (lv_accessory_15_0= ruleCellAccessory ) ) ) ) )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3558:4: ({...}? => ( ( 'accessory:' ( (lv_accessory_15_0= ruleCellAccessory ) ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3559:5: {...}? => ( ( 'accessory:' ( (lv_accessory_15_0= ruleCellAccessory ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_5(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleCell", "getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_5(), 4)");
            	    }
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3559:101: ( ( 'accessory:' ( (lv_accessory_15_0= ruleCellAccessory ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3560:6: ( 'accessory:' ( (lv_accessory_15_0= ruleCellAccessory ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCellAccess().getUnorderedGroup_5(), 4);
            	    	 				
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3563:6: ( 'accessory:' ( (lv_accessory_15_0= ruleCellAccessory ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3563:8: 'accessory:' ( (lv_accessory_15_0= ruleCellAccessory ) )
            	    {
            	    match(input,54,FOLLOW_54_in_ruleCell6705); 

            	            createLeafNode(grammarAccess.getCellAccess().getAccessoryKeyword_5_4_0(), null); 
            	        
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3567:1: ( (lv_accessory_15_0= ruleCellAccessory ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3568:1: (lv_accessory_15_0= ruleCellAccessory )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3568:1: (lv_accessory_15_0= ruleCellAccessory )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3569:3: lv_accessory_15_0= ruleCellAccessory
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCellAccess().getAccessoryCellAccessoryEnumRuleCall_5_4_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleCellAccessory_in_ruleCell6726);
            	    lv_accessory_15_0=ruleCellAccessory();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCellRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"accessory",
            	    	        		lv_accessory_15_0, 
            	    	        		"CellAccessory", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCellAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getCellAccess().getUnorderedGroup_5());
            	

            }

            match(input,15,FOLLOW_15_in_ruleCell6776); 

                    createLeafNode(grammarAccess.getCellAccess().getRightCurlyBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCell


    // $ANTLR start entryRuleCustomView
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3617:1: entryRuleCustomView returns [EObject current=null] : iv_ruleCustomView= ruleCustomView EOF ;
    public final EObject entryRuleCustomView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomView = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3618:2: (iv_ruleCustomView= ruleCustomView EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3619:2: iv_ruleCustomView= ruleCustomView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCustomViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleCustomView_in_entryRuleCustomView6812);
            iv_ruleCustomView=ruleCustomView();
            _fsp--;

             current =iv_ruleCustomView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomView6822); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCustomView


    // $ANTLR start ruleCustomView
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3626:1: ruleCustomView returns [EObject current=null] : ( 'customview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) ( (lv_projectClass_3_0= ruleProjectClass ) ) ) ;
    public final EObject ruleCustomView() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_projectClass_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3631:6: ( ( 'customview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) ( (lv_projectClass_3_0= ruleProjectClass ) ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3632:1: ( 'customview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) ( (lv_projectClass_3_0= ruleProjectClass ) ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3632:1: ( 'customview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) ( (lv_projectClass_3_0= ruleProjectClass ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3632:3: 'customview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) ( (lv_projectClass_3_0= ruleProjectClass ) )
            {
            match(input,55,FOLLOW_55_in_ruleCustomView6857); 

                    createLeafNode(grammarAccess.getCustomViewAccess().getCustomviewKeyword_0(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3636:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3637:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3637:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3638:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomView6874); 

            			createLeafNode(grammarAccess.getCustomViewAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCustomViewRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3660:2: ( (lv_parameters_2_0= ruleParameterDefinitions ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3661:1: (lv_parameters_2_0= ruleParameterDefinitions )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3661:1: (lv_parameters_2_0= ruleParameterDefinitions )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3662:3: lv_parameters_2_0= ruleParameterDefinitions
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCustomViewAccess().getParametersParameterDefinitionsParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleParameterDefinitions_in_ruleCustomView6900);
            lv_parameters_2_0=ruleParameterDefinitions();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCustomViewRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"parameters",
            	        		lv_parameters_2_0, 
            	        		"ParameterDefinitions", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3684:2: ( (lv_projectClass_3_0= ruleProjectClass ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3685:1: (lv_projectClass_3_0= ruleProjectClass )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3685:1: (lv_projectClass_3_0= ruleProjectClass )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3686:3: lv_projectClass_3_0= ruleProjectClass
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCustomViewAccess().getProjectClassProjectClassParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleProjectClass_in_ruleCustomView6921);
            lv_projectClass_3_0=ruleProjectClass();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCustomViewRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"projectClass",
            	        		lv_projectClass_3_0, 
            	        		"ProjectClass", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCustomView


    // $ANTLR start entryRuleAction
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3716:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3717:2: (iv_ruleAction= ruleAction EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3718:2: iv_ruleAction= ruleAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction6957);
            iv_ruleAction=ruleAction();
            _fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction6967); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAction


    // $ANTLR start ruleAction
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3725:1: ruleAction returns [EObject current=null] : (this_ViewCall_0= ruleViewCall | this_OpenURL_1= ruleOpenURL | this_Selector_2= ruleSelector ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_ViewCall_0 = null;

        EObject this_OpenURL_1 = null;

        EObject this_Selector_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3730:6: ( (this_ViewCall_0= ruleViewCall | this_OpenURL_1= ruleOpenURL | this_Selector_2= ruleSelector ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3731:1: (this_ViewCall_0= ruleViewCall | this_OpenURL_1= ruleOpenURL | this_Selector_2= ruleSelector )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3731:1: (this_ViewCall_0= ruleViewCall | this_OpenURL_1= ruleOpenURL | this_Selector_2= ruleSelector )
            int alt40=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==23) ) {
                    alt40=1;
                }
                else if ( (LA40_1==EOF||LA40_1==15||LA40_1==22||(LA40_1>=50 && LA40_1<=54)) ) {
                    alt40=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("3731:1: (this_ViewCall_0= ruleViewCall | this_OpenURL_1= ruleOpenURL | this_Selector_2= ruleSelector )", 40, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case 23:
            case 25:
            case 27:
            case 28:
                {
                alt40=2;
                }
                break;
            case 56:
                {
                alt40=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3731:1: (this_ViewCall_0= ruleViewCall | this_OpenURL_1= ruleOpenURL | this_Selector_2= ruleSelector )", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3732:5: this_ViewCall_0= ruleViewCall
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getActionAccess().getViewCallParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleViewCall_in_ruleAction7014);
                    this_ViewCall_0=ruleViewCall();
                    _fsp--;

                     
                            current = this_ViewCall_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3742:5: this_OpenURL_1= ruleOpenURL
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getActionAccess().getOpenURLParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleOpenURL_in_ruleAction7041);
                    this_OpenURL_1=ruleOpenURL();
                    _fsp--;

                     
                            current = this_OpenURL_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3752:5: this_Selector_2= ruleSelector
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getActionAccess().getSelectorParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSelector_in_ruleAction7068);
                    this_Selector_2=ruleSelector();
                    _fsp--;

                     
                            current = this_Selector_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAction


    // $ANTLR start entryRuleViewCall
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3768:1: entryRuleViewCall returns [EObject current=null] : iv_ruleViewCall= ruleViewCall EOF ;
    public final EObject entryRuleViewCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewCall = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3769:2: (iv_ruleViewCall= ruleViewCall EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3770:2: iv_ruleViewCall= ruleViewCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getViewCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleViewCall_in_entryRuleViewCall7103);
            iv_ruleViewCall=ruleViewCall();
            _fsp--;

             current =iv_ruleViewCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewCall7113); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleViewCall


    // $ANTLR start ruleViewCall
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3777:1: ruleViewCall returns [EObject current=null] : ( ( ( RULE_ID ) ) ( (lv_parameters_1_0= ruleParameterValues ) ) ) ;
    public final EObject ruleViewCall() throws RecognitionException {
        EObject current = null;

        EObject lv_parameters_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3782:6: ( ( ( ( RULE_ID ) ) ( (lv_parameters_1_0= ruleParameterValues ) ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3783:1: ( ( ( RULE_ID ) ) ( (lv_parameters_1_0= ruleParameterValues ) ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3783:1: ( ( ( RULE_ID ) ) ( (lv_parameters_1_0= ruleParameterValues ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3783:2: ( ( RULE_ID ) ) ( (lv_parameters_1_0= ruleParameterValues ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3783:2: ( ( RULE_ID ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3784:1: ( RULE_ID )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3784:1: ( RULE_ID )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3785:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getViewCallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleViewCall7156); 

            		createLeafNode(grammarAccess.getViewCallAccess().getTargetViewCrossReference_0_0(), "target"); 
            	

            }


            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3797:2: ( (lv_parameters_1_0= ruleParameterValues ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3798:1: (lv_parameters_1_0= ruleParameterValues )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3798:1: (lv_parameters_1_0= ruleParameterValues )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3799:3: lv_parameters_1_0= ruleParameterValues
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getViewCallAccess().getParametersParameterValuesParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleParameterValues_in_ruleViewCall7177);
            lv_parameters_1_0=ruleParameterValues();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getViewCallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"parameters",
            	        		lv_parameters_1_0, 
            	        		"ParameterValues", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleViewCall


    // $ANTLR start entryRuleSelector
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3829:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3830:2: (iv_ruleSelector= ruleSelector EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3831:2: iv_ruleSelector= ruleSelector EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSelectorRule(), currentNode); 
            pushFollow(FOLLOW_ruleSelector_in_entryRuleSelector7213);
            iv_ruleSelector=ruleSelector();
            _fsp--;

             current =iv_ruleSelector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelector7223); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSelector


    // $ANTLR start ruleSelector
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3838:1: ruleSelector returns [EObject current=null] : ( '@selector' '(' ( (lv_name_2_0= ruleSelectorName ) ) ')' ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3843:6: ( ( '@selector' '(' ( (lv_name_2_0= ruleSelectorName ) ) ')' ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3844:1: ( '@selector' '(' ( (lv_name_2_0= ruleSelectorName ) ) ')' )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3844:1: ( '@selector' '(' ( (lv_name_2_0= ruleSelectorName ) ) ')' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3844:3: '@selector' '(' ( (lv_name_2_0= ruleSelectorName ) ) ')'
            {
            match(input,56,FOLLOW_56_in_ruleSelector7258); 

                    createLeafNode(grammarAccess.getSelectorAccess().getSelectorKeyword_0(), null); 
                
            match(input,23,FOLLOW_23_in_ruleSelector7268); 

                    createLeafNode(grammarAccess.getSelectorAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3852:1: ( (lv_name_2_0= ruleSelectorName ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3853:1: (lv_name_2_0= ruleSelectorName )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3853:1: (lv_name_2_0= ruleSelectorName )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3854:3: lv_name_2_0= ruleSelectorName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSelectorAccess().getNameSelectorNameParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSelectorName_in_ruleSelector7289);
            lv_name_2_0=ruleSelectorName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSelectorRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"SelectorName", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,24,FOLLOW_24_in_ruleSelector7299); 

                    createLeafNode(grammarAccess.getSelectorAccess().getRightParenthesisKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSelector


    // $ANTLR start entryRuleSelectorName
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3888:1: entryRuleSelectorName returns [String current=null] : iv_ruleSelectorName= ruleSelectorName EOF ;
    public final String entryRuleSelectorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSelectorName = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3889:2: (iv_ruleSelectorName= ruleSelectorName EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3890:2: iv_ruleSelectorName= ruleSelectorName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSelectorNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleSelectorName_in_entryRuleSelectorName7336);
            iv_ruleSelectorName=ruleSelectorName();
            _fsp--;

             current =iv_ruleSelectorName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectorName7347); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSelectorName


    // $ANTLR start ruleSelectorName
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3897:1: ruleSelectorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* (kw= ':' )? ) ;
    public final AntlrDatatypeRuleToken ruleSelectorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3902:6: ( (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* (kw= ':' )? ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3903:1: (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* (kw= ':' )? )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3903:1: (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* (kw= ':' )? )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3903:6: this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* (kw= ':' )?
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelectorName7387); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getSelectorNameAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3910:1: (kw= ':' this_ID_2= RULE_ID )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==57) ) {
                    int LA41_1 = input.LA(2);

                    if ( (LA41_1==RULE_ID) ) {
                        alt41=1;
                    }


                }


                switch (alt41) {
            	case 1 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3911:2: kw= ':' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,57,FOLLOW_57_in_ruleSelectorName7406); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getSelectorNameAccess().getColonKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelectorName7421); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getSelectorNameAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3923:3: (kw= ':' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==57) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3924:2: kw= ':'
                    {
                    kw=(Token)input.LT(1);
                    match(input,57,FOLLOW_57_in_ruleSelectorName7442); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getSelectorNameAccess().getColonKeyword_2(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSelectorName


    // $ANTLR start entryRuleOpenURL
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3937:1: entryRuleOpenURL returns [EObject current=null] : iv_ruleOpenURL= ruleOpenURL EOF ;
    public final EObject entryRuleOpenURL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenURL = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3938:2: (iv_ruleOpenURL= ruleOpenURL EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3939:2: iv_ruleOpenURL= ruleOpenURL EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOpenURLRule(), currentNode); 
            pushFollow(FOLLOW_ruleOpenURL_in_entryRuleOpenURL7484);
            iv_ruleOpenURL=ruleOpenURL();
            _fsp--;

             current =iv_ruleOpenURL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpenURL7494); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOpenURL


    // $ANTLR start ruleOpenURL
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3946:1: ruleOpenURL returns [EObject current=null] : ( (lv_url_0_0= ruleScalarExpression ) ) ;
    public final EObject ruleOpenURL() throws RecognitionException {
        EObject current = null;

        EObject lv_url_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3951:6: ( ( (lv_url_0_0= ruleScalarExpression ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3952:1: ( (lv_url_0_0= ruleScalarExpression ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3952:1: ( (lv_url_0_0= ruleScalarExpression ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3953:1: (lv_url_0_0= ruleScalarExpression )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3953:1: (lv_url_0_0= ruleScalarExpression )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3954:3: lv_url_0_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getOpenURLAccess().getUrlScalarExpressionParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleOpenURL7539);
            lv_url_0_0=ruleScalarExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getOpenURLRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"url",
            	        		lv_url_0_0, 
            	        		"ScalarExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleOpenURL


    // $ANTLR start ruleSerializationFormat
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3984:1: ruleSerializationFormat returns [Enumerator current=null] : ( ( 'XML' ) | ( 'JSON' ) ) ;
    public final Enumerator ruleSerializationFormat() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3988:6: ( ( ( 'XML' ) | ( 'JSON' ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3989:1: ( ( 'XML' ) | ( 'JSON' ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3989:1: ( ( 'XML' ) | ( 'JSON' ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==58) ) {
                alt43=1;
            }
            else if ( (LA43_0==59) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3989:1: ( ( 'XML' ) | ( 'JSON' ) )", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3989:2: ( 'XML' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3989:2: ( 'XML' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3989:4: 'XML'
                    {
                    match(input,58,FOLLOW_58_in_ruleSerializationFormat7586); 

                            current = grammarAccess.getSerializationFormatAccess().getXMLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getSerializationFormatAccess().getXMLEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3995:6: ( 'JSON' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3995:6: ( 'JSON' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3995:8: 'JSON'
                    {
                    match(input,59,FOLLOW_59_in_ruleSerializationFormat7601); 

                            current = grammarAccess.getSerializationFormatAccess().getJSONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getSerializationFormatAccess().getJSONEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSerializationFormat


    // $ANTLR start ruleTableViewStyle
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4005:1: ruleTableViewStyle returns [Enumerator current=null] : ( ( 'Plain' ) | ( 'Grouped' ) ) ;
    public final Enumerator ruleTableViewStyle() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4009:6: ( ( ( 'Plain' ) | ( 'Grouped' ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4010:1: ( ( 'Plain' ) | ( 'Grouped' ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4010:1: ( ( 'Plain' ) | ( 'Grouped' ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==60) ) {
                alt44=1;
            }
            else if ( (LA44_0==61) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4010:1: ( ( 'Plain' ) | ( 'Grouped' ) )", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4010:2: ( 'Plain' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4010:2: ( 'Plain' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4010:4: 'Plain'
                    {
                    match(input,60,FOLLOW_60_in_ruleTableViewStyle7644); 

                            current = grammarAccess.getTableViewStyleAccess().getPlainEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTableViewStyleAccess().getPlainEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4016:6: ( 'Grouped' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4016:6: ( 'Grouped' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4016:8: 'Grouped'
                    {
                    match(input,61,FOLLOW_61_in_ruleTableViewStyle7659); 

                            current = grammarAccess.getTableViewStyleAccess().getGroupedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTableViewStyleAccess().getGroupedEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTableViewStyle


    // $ANTLR start ruleCellType
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4026:1: ruleCellType returns [Enumerator current=null] : ( ( 'Default' ) | ( 'Value1' ) | ( 'Value2' ) | ( 'Subtitle' ) ) ;
    public final Enumerator ruleCellType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4030:6: ( ( ( 'Default' ) | ( 'Value1' ) | ( 'Value2' ) | ( 'Subtitle' ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4031:1: ( ( 'Default' ) | ( 'Value1' ) | ( 'Value2' ) | ( 'Subtitle' ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4031:1: ( ( 'Default' ) | ( 'Value1' ) | ( 'Value2' ) | ( 'Subtitle' ) )
            int alt45=4;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt45=1;
                }
                break;
            case 63:
                {
                alt45=2;
                }
                break;
            case 64:
                {
                alt45=3;
                }
                break;
            case 65:
                {
                alt45=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("4031:1: ( ( 'Default' ) | ( 'Value1' ) | ( 'Value2' ) | ( 'Subtitle' ) )", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4031:2: ( 'Default' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4031:2: ( 'Default' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4031:4: 'Default'
                    {
                    match(input,62,FOLLOW_62_in_ruleCellType7702); 

                            current = grammarAccess.getCellTypeAccess().getDefaultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellTypeAccess().getDefaultEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4037:6: ( 'Value1' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4037:6: ( 'Value1' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4037:8: 'Value1'
                    {
                    match(input,63,FOLLOW_63_in_ruleCellType7717); 

                            current = grammarAccess.getCellTypeAccess().getValue1EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellTypeAccess().getValue1EnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4043:6: ( 'Value2' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4043:6: ( 'Value2' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4043:8: 'Value2'
                    {
                    match(input,64,FOLLOW_64_in_ruleCellType7732); 

                            current = grammarAccess.getCellTypeAccess().getValue2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellTypeAccess().getValue2EnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4049:6: ( 'Subtitle' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4049:6: ( 'Subtitle' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4049:8: 'Subtitle'
                    {
                    match(input,65,FOLLOW_65_in_ruleCellType7747); 

                            current = grammarAccess.getCellTypeAccess().getSubtitleEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellTypeAccess().getSubtitleEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCellType


    // $ANTLR start ruleCellAccessory
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4059:1: ruleCellAccessory returns [Enumerator current=null] : ( ( 'None' ) | ( 'Link' ) | ( 'Detail' ) | ( 'Check' ) ) ;
    public final Enumerator ruleCellAccessory() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4063:6: ( ( ( 'None' ) | ( 'Link' ) | ( 'Detail' ) | ( 'Check' ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4064:1: ( ( 'None' ) | ( 'Link' ) | ( 'Detail' ) | ( 'Check' ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4064:1: ( ( 'None' ) | ( 'Link' ) | ( 'Detail' ) | ( 'Check' ) )
            int alt46=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt46=1;
                }
                break;
            case 67:
                {
                alt46=2;
                }
                break;
            case 68:
                {
                alt46=3;
                }
                break;
            case 69:
                {
                alt46=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("4064:1: ( ( 'None' ) | ( 'Link' ) | ( 'Detail' ) | ( 'Check' ) )", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4064:2: ( 'None' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4064:2: ( 'None' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4064:4: 'None'
                    {
                    match(input,66,FOLLOW_66_in_ruleCellAccessory7790); 

                            current = grammarAccess.getCellAccessoryAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellAccessoryAccess().getNoneEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4070:6: ( 'Link' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4070:6: ( 'Link' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4070:8: 'Link'
                    {
                    match(input,67,FOLLOW_67_in_ruleCellAccessory7805); 

                            current = grammarAccess.getCellAccessoryAccess().getLinkEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellAccessoryAccess().getLinkEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4076:6: ( 'Detail' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4076:6: ( 'Detail' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4076:8: 'Detail'
                    {
                    match(input,68,FOLLOW_68_in_ruleCellAccessory7820); 

                            current = grammarAccess.getCellAccessoryAccess().getDetailEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellAccessoryAccess().getDetailEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4082:6: ( 'Check' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4082:6: ( 'Check' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4082:8: 'Check'
                    {
                    match(input,69,FOLLOW_69_in_ruleCellAccessory7835); 

                            current = grammarAccess.getCellAccessoryAccess().getCheckEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellAccessoryAccess().getCheckEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCellAccessory


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_ruleModel131 = new BitSet(new long[]{0x0080220400050002L});
    public static final BitSet FOLLOW_ruleModelElement_in_ruleModel152 = new BitSet(new long[]{0x0080220400050002L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleApplication234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplication251 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleApplication266 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleApplication319 = new BitSet(new long[]{0x000000001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleApplication340 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_14_in_ruleApplication402 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleViewCall_in_ruleApplication423 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_15_in_ruleApplication479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElement_in_entryRuleModelElement515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelElement525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleModelElement572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterizedModelElement_in_ruleModelElement599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_ruleType691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleType718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSimpleType798 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleType815 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSimpleType830 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleType847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleEntity933 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleEntity951 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity982 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_20_in_ruleEntity998 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity1016 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity1028 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleEntity1049 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleEntity1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleProperty1152 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_entryRuleTypeReference1210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeReference1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeReference1263 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleTypeReference1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectClass_in_entryRuleProjectClass1331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjectClass1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleProjectClass1376 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProjectClass1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration1434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDeclaration1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleDeclaration1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionIterator_in_ruleDeclaration1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_entryRuleObjectReference1588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectReference1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectReference1645 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rulePropertyReference_in_ruleObjectReference1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReference_in_entryRulePropertyReference1707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyReference1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePropertyReference1752 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyReference1770 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rulePropertyReference_in_rulePropertyReference1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_ruleExpression1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_ruleExpression1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleExpression1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_ruleExpression1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_ruleExpression1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentProviderCall_in_ruleExpression2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_in_ruleExpression2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_entryRuleScalarExpression2082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScalarExpression2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleScalarExpression2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_ruleScalarExpression2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_ruleScalarExpression2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_in_ruleScalarExpression2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_entryRuleStringFunction2346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringFunction2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleStringFunction2401 = new BitSet(new long[]{0x000000001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction2422 = new BitSet(new long[]{0x000000001B800030L});
    public static final BitSet FOLLOW_24_in_ruleStringFunction2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleStringFunction2460 = new BitSet(new long[]{0x000000001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction2481 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleStringFunction2491 = new BitSet(new long[]{0x000000001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction2512 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleStringFunction2522 = new BitSet(new long[]{0x000000001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction2543 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleStringFunction2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleStringFunction2580 = new BitSet(new long[]{0x000000001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction2601 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleStringFunction2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_in_entryRuleBinding2648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinding2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBinding2693 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleObjectReference_in_ruleBinding2714 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleBinding2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageExpression_in_entryRuleImageExpression2760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageExpression2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleImageExpression2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression2850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionExpression2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_ruleCollectionExpression2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_ruleCollectionExpression2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_ruleCollectionExpression2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_entryRuleCollectionLiteral2996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteral3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCollectionLiteral3041 = new BitSet(new long[]{0x000000001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCollectionLiteral3062 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_26_in_ruleCollectionLiteral3073 = new BitSet(new long[]{0x000000001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCollectionLiteral3094 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_30_in_ruleCollectionLiteral3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_entryRuleCollectionFunction3142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionFunction3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCollectionFunction3196 = new BitSet(new long[]{0x000000001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCollectionFunction3217 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleCollectionFunction3227 = new BitSet(new long[]{0x000000001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCollectionFunction3248 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCollectionFunction3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionIterator_in_entryRuleCollectionIterator3294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionIterator3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCollectionIterator3339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollectionIterator3356 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleCollectionIterator3371 = new BitSet(new long[]{0x00000000A0000010L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_ruleCollectionIterator3392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter3428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleParameter3484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterizedModelElement_in_entryRuleParameterizedModelElement3542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterizedModelElement3552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_ruleParameterizedModelElement3599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentProvider_in_ruleParameterizedModelElement3626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDefinitions_in_entryRuleParameterDefinitions3663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDefinitions3673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleParameterDefinitions3718 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameterDefinitions3739 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_26_in_ruleParameterDefinitions3750 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameterDefinitions3771 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_24_in_ruleParameterDefinitions3783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterValues_in_entryRuleParameterValues3821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterValues3831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleParameterValues3875 = new BitSet(new long[]{0x00000000BB800030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParameterValues3897 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_26_in_ruleParameterValues3908 = new BitSet(new long[]{0x00000000BA800030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParameterValues3929 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_24_in_ruleParameterValues3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentProvider_in_entryRuleContentProvider3979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentProvider3989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleContentProvider4024 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentProvider4041 = new BitSet(new long[]{0x0000001800800000L});
    public static final BitSet FOLLOW_ruleParameterDefinitions_in_ruleContentProvider4067 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_ruleContentProvider4078 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_36_in_ruleContentProvider4102 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentProvider4134 = new BitSet(new long[]{0x0000002000280002L});
    public static final BitSet FOLLOW_21_in_ruleContentProvider4152 = new BitSet(new long[]{0x0000002000080002L});
    public static final BitSet FOLLOW_ruleContentProviderImplementation_in_ruleContentProvider4187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentProviderImplementation_in_entryRuleContentProviderImplementation4224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentProviderImplementation4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlContentProviderImplementation_in_ruleContentProviderImplementation4281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomContentProviderImplementation_in_ruleContentProviderImplementation4308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlContentProviderImplementation_in_entryRuleUrlContentProviderImplementation4343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUrlContentProviderImplementation4353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleUrlContentProviderImplementation4388 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_ruleSerializationFormat_in_ruleUrlContentProviderImplementation4409 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleUrlContentProviderImplementation4419 = new BitSet(new long[]{0x000000001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleUrlContentProviderImplementation4440 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleUrlContentProviderImplementation4451 = new BitSet(new long[]{0x000000001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleUrlContentProviderImplementation4472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomContentProviderImplementation_in_entryRuleCustomContentProviderImplementation4510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomContentProviderImplementation4520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectClass_in_ruleCustomContentProviderImplementation4565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentProviderCall_in_entryRuleContentProviderCall4600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentProviderCall4610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentProviderCall4653 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleParameterValues_in_ruleContentProviderCall4674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment4710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment4720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleAssignment4766 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment4783 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleAssignment4798 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleContentProviderCall_in_ruleAssignment4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_entryRuleView4855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleView4865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabView_in_ruleView4912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableView_in_ruleView4939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomView_in_ruleView4966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabView_in_entryRuleTabView5001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabView5011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleTabView5046 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTabView5063 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_ruleParameterDefinitions_in_ruleTabView5089 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTabView5099 = new BitSet(new long[]{0x0000040000008000L});
    public static final BitSet FOLLOW_ruleTab_in_ruleTabView5120 = new BitSet(new long[]{0x0000040000008000L});
    public static final BitSet FOLLOW_15_in_ruleTabView5131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTab_in_entryRuleTab5167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTab5177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleTab5212 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTab5222 = new BitSet(new long[]{0x0000180000004000L});
    public static final BitSet FOLLOW_43_in_ruleTab5275 = new BitSet(new long[]{0x000000001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleTab5296 = new BitSet(new long[]{0x000018000000C000L});
    public static final BitSet FOLLOW_44_in_ruleTab5358 = new BitSet(new long[]{0x000000001A800030L});
    public static final BitSet FOLLOW_ruleImageExpression_in_ruleTab5379 = new BitSet(new long[]{0x000018000000C000L});
    public static final BitSet FOLLOW_14_in_ruleTab5441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleViewCall_in_ruleTab5462 = new BitSet(new long[]{0x000018000000C000L});
    public static final BitSet FOLLOW_15_in_ruleTab5518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableView_in_entryRuleTableView5554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableView5564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTableView5599 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTableView5616 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_ruleParameterDefinitions_in_ruleTableView5642 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTableView5652 = new BitSet(new long[]{0x0001C80000008010L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleTableView5673 = new BitSet(new long[]{0x0001C80000008010L});
    public static final BitSet FOLLOW_43_in_ruleTableView5727 = new BitSet(new long[]{0x000000001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleTableView5748 = new BitSet(new long[]{0x0001C80000008000L});
    public static final BitSet FOLLOW_46_in_ruleTableView5810 = new BitSet(new long[]{0x000000001A800030L});
    public static final BitSet FOLLOW_ruleImageExpression_in_ruleTableView5831 = new BitSet(new long[]{0x0001C80000008000L});
    public static final BitSet FOLLOW_47_in_ruleTableView5893 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_ruleTableViewStyle_in_ruleTableView5914 = new BitSet(new long[]{0x0001C80000008000L});
    public static final BitSet FOLLOW_ruleSection_in_ruleTableView5975 = new BitSet(new long[]{0x0001000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTableView5986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_entryRuleSection6024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection6034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleSection6078 = new BitSet(new long[]{0x0000000100001000L});
    public static final BitSet FOLLOW_ruleCollectionIterator_in_ruleSection6099 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSection6110 = new BitSet(new long[]{0x0002080000008000L});
    public static final BitSet FOLLOW_43_in_ruleSection6121 = new BitSet(new long[]{0x000000001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleSection6142 = new BitSet(new long[]{0x0002000000008000L});
    public static final BitSet FOLLOW_ruleCell_in_ruleSection6165 = new BitSet(new long[]{0x0002000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSection6176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCell_in_entryRuleCell6212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCell6222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleCell6266 = new BitSet(new long[]{0xC000000100001000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleCellType_in_ruleCell6287 = new BitSet(new long[]{0x0000000100001000L});
    public static final BitSet FOLLOW_ruleCollectionIterator_in_ruleCell6309 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCell6320 = new BitSet(new long[]{0x007C000000008000L});
    public static final BitSet FOLLOW_50_in_ruleCell6373 = new BitSet(new long[]{0x000000001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCell6394 = new BitSet(new long[]{0x007C000000008000L});
    public static final BitSet FOLLOW_51_in_ruleCell6456 = new BitSet(new long[]{0x000000001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCell6477 = new BitSet(new long[]{0x007C000000008000L});
    public static final BitSet FOLLOW_52_in_ruleCell6539 = new BitSet(new long[]{0x000000001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCell6560 = new BitSet(new long[]{0x007C000000008000L});
    public static final BitSet FOLLOW_53_in_ruleCell6622 = new BitSet(new long[]{0x010000001A800030L});
    public static final BitSet FOLLOW_ruleAction_in_ruleCell6643 = new BitSet(new long[]{0x007C000000008000L});
    public static final BitSet FOLLOW_54_in_ruleCell6705 = new BitSet(new long[]{0x0000000000000000L,0x000000000000003CL});
    public static final BitSet FOLLOW_ruleCellAccessory_in_ruleCell6726 = new BitSet(new long[]{0x007C000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCell6776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomView_in_entryRuleCustomView6812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomView6822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleCustomView6857 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomView6874 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_ruleParameterDefinitions_in_ruleCustomView6900 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleProjectClass_in_ruleCustomView6921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction6957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction6967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewCall_in_ruleAction7014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenURL_in_ruleAction7041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_ruleAction7068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewCall_in_entryRuleViewCall7103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewCall7113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleViewCall7156 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleParameterValues_in_ruleViewCall7177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_entryRuleSelector7213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelector7223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleSelector7258 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSelector7268 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSelectorName_in_ruleSelector7289 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSelector7299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectorName_in_entryRuleSelectorName7336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectorName7347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelectorName7387 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_ruleSelectorName7406 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelectorName7421 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_ruleSelectorName7442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenURL_in_entryRuleOpenURL7484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpenURL7494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleOpenURL7539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleSerializationFormat7586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleSerializationFormat7601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleTableViewStyle7644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleTableViewStyle7659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleCellType7702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleCellType7717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleCellType7732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleCellType7747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleCellAccessory7790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleCellAccessory7805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleCellAccessory7820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleCellAccessory7835 = new BitSet(new long[]{0x0000000000000002L});

}
