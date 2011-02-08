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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'application'", "'{'", "'background:'", "'view:'", "'}'", "'type'", "'mapsTo'", "'entity'", "'class'", "'extends'", "'[]'", "'.'", "'('", "')'", "'replace('", "','", "'urlconform('", "'bind('", "'['", "']'", "'split('", "'for'", "'in'", "'contentprovider'", "'returns'", "'stores'", "'fetches'", "'from'", "'selects'", "'new'", "'='", "'tabview'", "'tab'", "'title:'", "'icon:'", "'tableview'", "'titleImage:'", "'style:'", "'section'", "'cell'", "'text:'", "'detailText:'", "'image:'", "'action:'", "'accessory:'", "'customview'", "'@selector'", "':'", "'XML'", "'JSON'", "'Plain'", "'Grouped'", "'Default'", "'Value1'", "'Value2'", "'Subtitle'", "'None'", "'Link'", "'Detail'", "'Check'"
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

                if ( (LA1_0==16||LA1_0==18||LA1_0==34||LA1_0==42||LA1_0==46||LA1_0==56) ) {
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
            else if ( (LA3_0==34||LA3_0==42||LA3_0==46||LA3_0==56) ) {
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

                        if ( (LA9_4==41) ) {
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

                    if ( (LA9_4==41) ) {
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
                alt12=5;
                }
                break;
            case 40:
                {
                alt12=6;
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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1061:1: ruleScalarExpression returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference | this_ContentProviderCall_3= ruleContentProviderCall | this_Binding_4= ruleBinding ) ;
    public final EObject ruleScalarExpression() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_StringFunction_1 = null;

        EObject this_ObjectReference_2 = null;

        EObject this_ContentProviderCall_3 = null;

        EObject this_Binding_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1066:6: ( (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference | this_ContentProviderCall_3= ruleContentProviderCall | this_Binding_4= ruleBinding ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1067:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference | this_ContentProviderCall_3= ruleContentProviderCall | this_Binding_4= ruleBinding )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1067:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference | this_ContentProviderCall_3= ruleContentProviderCall | this_Binding_4= ruleBinding )
            int alt13=5;
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
            case 40:
                {
                alt13=4;
                }
                break;
            case 28:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1067:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference | this_ContentProviderCall_3= ruleContentProviderCall | this_Binding_4= ruleBinding )", 13, 0, input);

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
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1098:5: this_ContentProviderCall_3= ruleContentProviderCall
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getScalarExpressionAccess().getContentProviderCallParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleContentProviderCall_in_ruleScalarExpression2220);
                    this_ContentProviderCall_3=ruleContentProviderCall();
                    _fsp--;

                     
                            current = this_ContentProviderCall_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1108:5: this_Binding_4= ruleBinding
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getScalarExpressionAccess().getBindingParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBinding_in_ruleScalarExpression2247);
                    this_Binding_4=ruleBinding();
                    _fsp--;

                     
                            current = this_Binding_4; 
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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1124:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1125:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1126:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2282);
            iv_ruleStringLiteral=ruleStringLiteral();
            _fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral2292); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1133:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1138:6: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1139:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1139:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1140:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1140:1: (lv_value_0_0= RULE_STRING )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1141:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral2333); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1171:1: entryRuleStringFunction returns [EObject current=null] : iv_ruleStringFunction= ruleStringFunction EOF ;
    public final EObject entryRuleStringFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringFunction = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1172:2: (iv_ruleStringFunction= ruleStringFunction EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1173:2: iv_ruleStringFunction= ruleStringFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringFunction_in_entryRuleStringFunction2373);
            iv_ruleStringFunction=ruleStringFunction();
            _fsp--;

             current =iv_ruleStringFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringFunction2383); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1180:1: ruleStringFunction returns [EObject current=null] : ( ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' ) | ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' ) | ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' ) ) ;
    public final EObject ruleStringFunction() throws RecognitionException {
        EObject current = null;

        EObject lv_values_2_0 = null;

        EObject lv_value_6_0 = null;

        EObject lv_match_8_0 = null;

        EObject lv_replacement_10_0 = null;

        EObject lv_value_14_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1185:6: ( ( ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' ) | ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' ) | ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1186:1: ( ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' ) | ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' ) | ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1186:1: ( ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' ) | ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' ) | ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' ) )
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
                    new NoViableAltException("1186:1: ( ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' ) | ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' ) | ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' ) )", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1186:2: ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1186:2: ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1186:3: () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')'
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1186:3: ()
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1187:5: 
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

                    match(input,23,FOLLOW_23_in_ruleStringFunction2428); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getLeftParenthesisKeyword_0_1(), null); 
                        
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1201:1: ( (lv_values_2_0= ruleScalarExpression ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)||LA14_0==23||LA14_0==25||(LA14_0>=27 && LA14_0<=28)||LA14_0==40) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1202:1: (lv_values_2_0= ruleScalarExpression )
                    	    {
                    	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1202:1: (lv_values_2_0= ruleScalarExpression )
                    	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1203:3: lv_values_2_0= ruleScalarExpression
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getStringFunctionAccess().getValuesScalarExpressionParserRuleCall_0_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction2449);
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

                    match(input,24,FOLLOW_24_in_ruleStringFunction2460); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_0_3(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1230:6: ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1230:6: ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1230:7: () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')'
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1230:7: ()
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1231:5: 
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

                    match(input,25,FOLLOW_25_in_ruleStringFunction2487); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getReplaceKeyword_1_1(), null); 
                        
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1245:1: ( (lv_value_6_0= ruleScalarExpression ) )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1246:1: (lv_value_6_0= ruleScalarExpression )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1246:1: (lv_value_6_0= ruleScalarExpression )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1247:3: lv_value_6_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction2508);
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

                    match(input,26,FOLLOW_26_in_ruleStringFunction2518); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getCommaKeyword_1_3(), null); 
                        
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1273:1: ( (lv_match_8_0= ruleScalarExpression ) )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1274:1: (lv_match_8_0= ruleScalarExpression )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1274:1: (lv_match_8_0= ruleScalarExpression )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1275:3: lv_match_8_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStringFunctionAccess().getMatchScalarExpressionParserRuleCall_1_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction2539);
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

                    match(input,26,FOLLOW_26_in_ruleStringFunction2549); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getCommaKeyword_1_5(), null); 
                        
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1301:1: ( (lv_replacement_10_0= ruleScalarExpression ) )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1302:1: (lv_replacement_10_0= ruleScalarExpression )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1302:1: (lv_replacement_10_0= ruleScalarExpression )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1303:3: lv_replacement_10_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStringFunctionAccess().getReplacementScalarExpressionParserRuleCall_1_6_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction2570);
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

                    match(input,24,FOLLOW_24_in_ruleStringFunction2580); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_1_7(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1330:6: ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1330:6: ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1330:7: () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')'
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1330:7: ()
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1331:5: 
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

                    match(input,27,FOLLOW_27_in_ruleStringFunction2607); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getUrlconformKeyword_2_1(), null); 
                        
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1345:1: ( (lv_value_14_0= ruleScalarExpression ) )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1346:1: (lv_value_14_0= ruleScalarExpression )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1346:1: (lv_value_14_0= ruleScalarExpression )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1347:3: lv_value_14_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_2_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction2628);
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

                    match(input,24,FOLLOW_24_in_ruleStringFunction2638); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1381:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1382:2: (iv_ruleBinding= ruleBinding EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1383:2: iv_ruleBinding= ruleBinding EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBindingRule(), currentNode); 
            pushFollow(FOLLOW_ruleBinding_in_entryRuleBinding2675);
            iv_ruleBinding=ruleBinding();
            _fsp--;

             current =iv_ruleBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinding2685); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1390:1: ruleBinding returns [EObject current=null] : ( 'bind(' ( (lv_target_1_0= ruleObjectReference ) ) ')' ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        EObject lv_target_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1395:6: ( ( 'bind(' ( (lv_target_1_0= ruleObjectReference ) ) ')' ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1396:1: ( 'bind(' ( (lv_target_1_0= ruleObjectReference ) ) ')' )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1396:1: ( 'bind(' ( (lv_target_1_0= ruleObjectReference ) ) ')' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1396:3: 'bind(' ( (lv_target_1_0= ruleObjectReference ) ) ')'
            {
            match(input,28,FOLLOW_28_in_ruleBinding2720); 

                    createLeafNode(grammarAccess.getBindingAccess().getBindKeyword_0(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1400:1: ( (lv_target_1_0= ruleObjectReference ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1401:1: (lv_target_1_0= ruleObjectReference )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1401:1: (lv_target_1_0= ruleObjectReference )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1402:3: lv_target_1_0= ruleObjectReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBindingAccess().getTargetObjectReferenceParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleObjectReference_in_ruleBinding2741);
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

            match(input,24,FOLLOW_24_in_ruleBinding2751); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1436:1: entryRuleImageExpression returns [EObject current=null] : iv_ruleImageExpression= ruleImageExpression EOF ;
    public final EObject entryRuleImageExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageExpression = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1437:2: (iv_ruleImageExpression= ruleImageExpression EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1438:2: iv_ruleImageExpression= ruleImageExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImageExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleImageExpression_in_entryRuleImageExpression2787);
            iv_ruleImageExpression=ruleImageExpression();
            _fsp--;

             current =iv_ruleImageExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageExpression2797); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1445:1: ruleImageExpression returns [EObject current=null] : this_ScalarExpression_0= ruleScalarExpression ;
    public final EObject ruleImageExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ScalarExpression_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1450:6: (this_ScalarExpression_0= ruleScalarExpression )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1452:5: this_ScalarExpression_0= ruleScalarExpression
            {
             
                    currentNode=createCompositeNode(grammarAccess.getImageExpressionAccess().getScalarExpressionParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleImageExpression2843);
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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1468:1: entryRuleCollectionExpression returns [EObject current=null] : iv_ruleCollectionExpression= ruleCollectionExpression EOF ;
    public final EObject entryRuleCollectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionExpression = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1469:2: (iv_ruleCollectionExpression= ruleCollectionExpression EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1470:2: iv_ruleCollectionExpression= ruleCollectionExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCollectionExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression2877);
            iv_ruleCollectionExpression=ruleCollectionExpression();
            _fsp--;

             current =iv_ruleCollectionExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionExpression2887); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1477:1: ruleCollectionExpression returns [EObject current=null] : (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference | this_ContentProviderCall_3= ruleContentProviderCall ) ;
    public final EObject ruleCollectionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CollectionLiteral_0 = null;

        EObject this_CollectionFunction_1 = null;

        EObject this_ObjectReference_2 = null;

        EObject this_ContentProviderCall_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1482:6: ( (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference | this_ContentProviderCall_3= ruleContentProviderCall ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1483:1: (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference | this_ContentProviderCall_3= ruleContentProviderCall )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1483:1: (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference | this_ContentProviderCall_3= ruleContentProviderCall )
            int alt16=4;
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
            case 40:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1483:1: (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference | this_ContentProviderCall_3= ruleContentProviderCall )", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1484:5: this_CollectionLiteral_0= ruleCollectionLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCollectionExpressionAccess().getCollectionLiteralParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCollectionLiteral_in_ruleCollectionExpression2934);
                    this_CollectionLiteral_0=ruleCollectionLiteral();
                    _fsp--;

                     
                            current = this_CollectionLiteral_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1494:5: this_CollectionFunction_1= ruleCollectionFunction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCollectionExpressionAccess().getCollectionFunctionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCollectionFunction_in_ruleCollectionExpression2961);
                    this_CollectionFunction_1=ruleCollectionFunction();
                    _fsp--;

                     
                            current = this_CollectionFunction_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1504:5: this_ObjectReference_2= ruleObjectReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCollectionExpressionAccess().getObjectReferenceParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleObjectReference_in_ruleCollectionExpression2988);
                    this_ObjectReference_2=ruleObjectReference();
                    _fsp--;

                     
                            current = this_ObjectReference_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1514:5: this_ContentProviderCall_3= ruleContentProviderCall
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCollectionExpressionAccess().getContentProviderCallParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleContentProviderCall_in_ruleCollectionExpression3015);
                    this_ContentProviderCall_3=ruleContentProviderCall();
                    _fsp--;

                     
                            current = this_ContentProviderCall_3; 
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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1530:1: entryRuleCollectionLiteral returns [EObject current=null] : iv_ruleCollectionLiteral= ruleCollectionLiteral EOF ;
    public final EObject entryRuleCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteral = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1531:2: (iv_ruleCollectionLiteral= ruleCollectionLiteral EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1532:2: iv_ruleCollectionLiteral= ruleCollectionLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCollectionLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleCollectionLiteral_in_entryRuleCollectionLiteral3050);
            iv_ruleCollectionLiteral=ruleCollectionLiteral();
            _fsp--;

             current =iv_ruleCollectionLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionLiteral3060); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1539:1: ruleCollectionLiteral returns [EObject current=null] : ( '[' ( (lv_items_1_0= ruleScalarExpression ) ) ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* ']' ) ;
    public final EObject ruleCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1544:6: ( ( '[' ( (lv_items_1_0= ruleScalarExpression ) ) ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* ']' ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1545:1: ( '[' ( (lv_items_1_0= ruleScalarExpression ) ) ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* ']' )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1545:1: ( '[' ( (lv_items_1_0= ruleScalarExpression ) ) ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* ']' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1545:3: '[' ( (lv_items_1_0= ruleScalarExpression ) ) ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* ']'
            {
            match(input,29,FOLLOW_29_in_ruleCollectionLiteral3095); 

                    createLeafNode(grammarAccess.getCollectionLiteralAccess().getLeftSquareBracketKeyword_0(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1549:1: ( (lv_items_1_0= ruleScalarExpression ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1550:1: (lv_items_1_0= ruleScalarExpression )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1550:1: (lv_items_1_0= ruleScalarExpression )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1551:3: lv_items_1_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleCollectionLiteral3116);
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

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1573:2: ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1573:4: ',' ( (lv_items_3_0= ruleScalarExpression ) )
            	    {
            	    match(input,26,FOLLOW_26_in_ruleCollectionLiteral3127); 

            	            createLeafNode(grammarAccess.getCollectionLiteralAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1577:1: ( (lv_items_3_0= ruleScalarExpression ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1578:1: (lv_items_3_0= ruleScalarExpression )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1578:1: (lv_items_3_0= ruleScalarExpression )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1579:3: lv_items_3_0= ruleScalarExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleScalarExpression_in_ruleCollectionLiteral3148);
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

            match(input,30,FOLLOW_30_in_ruleCollectionLiteral3160); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1613:1: entryRuleCollectionFunction returns [EObject current=null] : iv_ruleCollectionFunction= ruleCollectionFunction EOF ;
    public final EObject entryRuleCollectionFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionFunction = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1614:2: (iv_ruleCollectionFunction= ruleCollectionFunction EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1615:2: iv_ruleCollectionFunction= ruleCollectionFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCollectionFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleCollectionFunction_in_entryRuleCollectionFunction3196);
            iv_ruleCollectionFunction=ruleCollectionFunction();
            _fsp--;

             current =iv_ruleCollectionFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionFunction3206); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1622:1: ruleCollectionFunction returns [EObject current=null] : ( () 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) ')' ) ;
    public final EObject ruleCollectionFunction() throws RecognitionException {
        EObject current = null;

        EObject lv_value_2_0 = null;

        EObject lv_delimiter_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1627:6: ( ( () 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) ')' ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1628:1: ( () 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) ')' )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1628:1: ( () 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) ')' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1628:2: () 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) ')'
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1628:2: ()
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1629:5: 
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

            match(input,31,FOLLOW_31_in_ruleCollectionFunction3250); 

                    createLeafNode(grammarAccess.getCollectionFunctionAccess().getSplitKeyword_1(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1643:1: ( (lv_value_2_0= ruleScalarExpression ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1644:1: (lv_value_2_0= ruleScalarExpression )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1644:1: (lv_value_2_0= ruleScalarExpression )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1645:3: lv_value_2_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCollectionFunctionAccess().getValueScalarExpressionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleCollectionFunction3271);
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

            match(input,26,FOLLOW_26_in_ruleCollectionFunction3281); 

                    createLeafNode(grammarAccess.getCollectionFunctionAccess().getCommaKeyword_3(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1671:1: ( (lv_delimiter_4_0= ruleScalarExpression ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1672:1: (lv_delimiter_4_0= ruleScalarExpression )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1672:1: (lv_delimiter_4_0= ruleScalarExpression )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1673:3: lv_delimiter_4_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCollectionFunctionAccess().getDelimiterScalarExpressionParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleCollectionFunction3302);
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

            match(input,24,FOLLOW_24_in_ruleCollectionFunction3312); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1707:1: entryRuleCollectionIterator returns [EObject current=null] : iv_ruleCollectionIterator= ruleCollectionIterator EOF ;
    public final EObject entryRuleCollectionIterator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionIterator = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1708:2: (iv_ruleCollectionIterator= ruleCollectionIterator EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1709:2: iv_ruleCollectionIterator= ruleCollectionIterator EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCollectionIteratorRule(), currentNode); 
            pushFollow(FOLLOW_ruleCollectionIterator_in_entryRuleCollectionIterator3348);
            iv_ruleCollectionIterator=ruleCollectionIterator();
            _fsp--;

             current =iv_ruleCollectionIterator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionIterator3358); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1716:1: ruleCollectionIterator returns [EObject current=null] : ( 'for' ( (lv_name_1_0= RULE_ID ) ) 'in' ( (lv_collection_3_0= ruleCollectionExpression ) ) ) ;
    public final EObject ruleCollectionIterator() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_collection_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1721:6: ( ( 'for' ( (lv_name_1_0= RULE_ID ) ) 'in' ( (lv_collection_3_0= ruleCollectionExpression ) ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1722:1: ( 'for' ( (lv_name_1_0= RULE_ID ) ) 'in' ( (lv_collection_3_0= ruleCollectionExpression ) ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1722:1: ( 'for' ( (lv_name_1_0= RULE_ID ) ) 'in' ( (lv_collection_3_0= ruleCollectionExpression ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1722:3: 'for' ( (lv_name_1_0= RULE_ID ) ) 'in' ( (lv_collection_3_0= ruleCollectionExpression ) )
            {
            match(input,32,FOLLOW_32_in_ruleCollectionIterator3393); 

                    createLeafNode(grammarAccess.getCollectionIteratorAccess().getForKeyword_0(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1726:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1727:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1727:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1728:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollectionIterator3410); 

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

            match(input,33,FOLLOW_33_in_ruleCollectionIterator3425); 

                    createLeafNode(grammarAccess.getCollectionIteratorAccess().getInKeyword_2(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1754:1: ( (lv_collection_3_0= ruleCollectionExpression ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1755:1: (lv_collection_3_0= ruleCollectionExpression )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1755:1: (lv_collection_3_0= ruleCollectionExpression )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1756:3: lv_collection_3_0= ruleCollectionExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCollectionIteratorAccess().getCollectionCollectionExpressionParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCollectionExpression_in_ruleCollectionIterator3446);
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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1786:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1787:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1788:2: iv_ruleParameter= ruleParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter3482);
            iv_ruleParameter=ruleParameter();
            _fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter3492); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1795:1: ruleParameter returns [EObject current=null] : ( ( (lv_typeRef_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_typeRef_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1800:6: ( ( ( (lv_typeRef_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1801:1: ( ( (lv_typeRef_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1801:1: ( ( (lv_typeRef_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1801:2: ( (lv_typeRef_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1801:2: ( (lv_typeRef_0_0= ruleTypeReference ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1802:1: (lv_typeRef_0_0= ruleTypeReference )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1802:1: (lv_typeRef_0_0= ruleTypeReference )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1803:3: lv_typeRef_0_0= ruleTypeReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getTypeRefTypeReferenceParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeReference_in_ruleParameter3538);
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

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1825:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1826:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1826:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1827:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter3555); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1857:1: entryRuleParameterizedModelElement returns [EObject current=null] : iv_ruleParameterizedModelElement= ruleParameterizedModelElement EOF ;
    public final EObject entryRuleParameterizedModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterizedModelElement = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1858:2: (iv_ruleParameterizedModelElement= ruleParameterizedModelElement EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1859:2: iv_ruleParameterizedModelElement= ruleParameterizedModelElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterizedModelElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameterizedModelElement_in_entryRuleParameterizedModelElement3596);
            iv_ruleParameterizedModelElement=ruleParameterizedModelElement();
            _fsp--;

             current =iv_ruleParameterizedModelElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterizedModelElement3606); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1866:1: ruleParameterizedModelElement returns [EObject current=null] : (this_View_0= ruleView | this_ContentProvider_1= ruleContentProvider ) ;
    public final EObject ruleParameterizedModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_View_0 = null;

        EObject this_ContentProvider_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1871:6: ( (this_View_0= ruleView | this_ContentProvider_1= ruleContentProvider ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1872:1: (this_View_0= ruleView | this_ContentProvider_1= ruleContentProvider )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1872:1: (this_View_0= ruleView | this_ContentProvider_1= ruleContentProvider )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==42||LA18_0==46||LA18_0==56) ) {
                alt18=1;
            }
            else if ( (LA18_0==34) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1872:1: (this_View_0= ruleView | this_ContentProvider_1= ruleContentProvider )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1873:5: this_View_0= ruleView
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getParameterizedModelElementAccess().getViewParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleView_in_ruleParameterizedModelElement3653);
                    this_View_0=ruleView();
                    _fsp--;

                     
                            current = this_View_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1883:5: this_ContentProvider_1= ruleContentProvider
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getParameterizedModelElementAccess().getContentProviderParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleContentProvider_in_ruleParameterizedModelElement3680);
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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1901:1: entryRuleParameterDefinitions returns [EObject current=null] : iv_ruleParameterDefinitions= ruleParameterDefinitions EOF ;
    public final EObject entryRuleParameterDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDefinitions = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1902:2: (iv_ruleParameterDefinitions= ruleParameterDefinitions EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1903:2: iv_ruleParameterDefinitions= ruleParameterDefinitions EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterDefinitionsRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameterDefinitions_in_entryRuleParameterDefinitions3717);
            iv_ruleParameterDefinitions=ruleParameterDefinitions();
            _fsp--;

             current =iv_ruleParameterDefinitions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDefinitions3727); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1910:1: ruleParameterDefinitions returns [EObject current=null] : ( () ( '(' ( (lv_definitions_2_0= ruleParameter ) ) ( ',' ( (lv_definitions_4_0= ruleParameter ) ) )* ')' )? ) ;
    public final EObject ruleParameterDefinitions() throws RecognitionException {
        EObject current = null;

        EObject lv_definitions_2_0 = null;

        EObject lv_definitions_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1915:6: ( ( () ( '(' ( (lv_definitions_2_0= ruleParameter ) ) ( ',' ( (lv_definitions_4_0= ruleParameter ) ) )* ')' )? ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1916:1: ( () ( '(' ( (lv_definitions_2_0= ruleParameter ) ) ( ',' ( (lv_definitions_4_0= ruleParameter ) ) )* ')' )? )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1916:1: ( () ( '(' ( (lv_definitions_2_0= ruleParameter ) ) ( ',' ( (lv_definitions_4_0= ruleParameter ) ) )* ')' )? )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1916:2: () ( '(' ( (lv_definitions_2_0= ruleParameter ) ) ( ',' ( (lv_definitions_4_0= ruleParameter ) ) )* ')' )?
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1916:2: ()
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1917:5: 
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

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1927:2: ( '(' ( (lv_definitions_2_0= ruleParameter ) ) ( ',' ( (lv_definitions_4_0= ruleParameter ) ) )* ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1927:4: '(' ( (lv_definitions_2_0= ruleParameter ) ) ( ',' ( (lv_definitions_4_0= ruleParameter ) ) )* ')'
                    {
                    match(input,23,FOLLOW_23_in_ruleParameterDefinitions3772); 

                            createLeafNode(grammarAccess.getParameterDefinitionsAccess().getLeftParenthesisKeyword_1_0(), null); 
                        
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1931:1: ( (lv_definitions_2_0= ruleParameter ) )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1932:1: (lv_definitions_2_0= ruleParameter )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1932:1: (lv_definitions_2_0= ruleParameter )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1933:3: lv_definitions_2_0= ruleParameter
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getParameterDefinitionsAccess().getDefinitionsParameterParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleParameterDefinitions3793);
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

                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1955:2: ( ',' ( (lv_definitions_4_0= ruleParameter ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==26) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1955:4: ',' ( (lv_definitions_4_0= ruleParameter ) )
                    	    {
                    	    match(input,26,FOLLOW_26_in_ruleParameterDefinitions3804); 

                    	            createLeafNode(grammarAccess.getParameterDefinitionsAccess().getCommaKeyword_1_2_0(), null); 
                    	        
                    	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1959:1: ( (lv_definitions_4_0= ruleParameter ) )
                    	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1960:1: (lv_definitions_4_0= ruleParameter )
                    	    {
                    	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1960:1: (lv_definitions_4_0= ruleParameter )
                    	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1961:3: lv_definitions_4_0= ruleParameter
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getParameterDefinitionsAccess().getDefinitionsParameterParserRuleCall_1_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleParameterDefinitions3825);
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

                    match(input,24,FOLLOW_24_in_ruleParameterDefinitions3837); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1995:1: entryRuleParameterValues returns [EObject current=null] : iv_ruleParameterValues= ruleParameterValues EOF ;
    public final EObject entryRuleParameterValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValues = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1996:2: (iv_ruleParameterValues= ruleParameterValues EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:1997:2: iv_ruleParameterValues= ruleParameterValues EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterValuesRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameterValues_in_entryRuleParameterValues3875);
            iv_ruleParameterValues=ruleParameterValues();
            _fsp--;

             current =iv_ruleParameterValues; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterValues3885); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2004:1: ruleParameterValues returns [EObject current=null] : ( () '(' ( ( (lv_values_2_0= ruleExpression ) ) ( ',' ( (lv_values_4_0= ruleExpression ) ) )* )? ')' ) ;
    public final EObject ruleParameterValues() throws RecognitionException {
        EObject current = null;

        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2009:6: ( ( () '(' ( ( (lv_values_2_0= ruleExpression ) ) ( ',' ( (lv_values_4_0= ruleExpression ) ) )* )? ')' ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2010:1: ( () '(' ( ( (lv_values_2_0= ruleExpression ) ) ( ',' ( (lv_values_4_0= ruleExpression ) ) )* )? ')' )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2010:1: ( () '(' ( ( (lv_values_2_0= ruleExpression ) ) ( ',' ( (lv_values_4_0= ruleExpression ) ) )* )? ')' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2010:2: () '(' ( ( (lv_values_2_0= ruleExpression ) ) ( ',' ( (lv_values_4_0= ruleExpression ) ) )* )? ')'
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2010:2: ()
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2011:5: 
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

            match(input,23,FOLLOW_23_in_ruleParameterValues3929); 

                    createLeafNode(grammarAccess.getParameterValuesAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2025:1: ( ( (lv_values_2_0= ruleExpression ) ) ( ',' ( (lv_values_4_0= ruleExpression ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_STRING)||LA22_0==23||LA22_0==25||(LA22_0>=27 && LA22_0<=29)||LA22_0==31||LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2025:2: ( (lv_values_2_0= ruleExpression ) ) ( ',' ( (lv_values_4_0= ruleExpression ) ) )*
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2025:2: ( (lv_values_2_0= ruleExpression ) )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2026:1: (lv_values_2_0= ruleExpression )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2026:1: (lv_values_2_0= ruleExpression )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2027:3: lv_values_2_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getParameterValuesAccess().getValuesExpressionParserRuleCall_2_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleParameterValues3951);
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

                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2049:2: ( ',' ( (lv_values_4_0= ruleExpression ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==26) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2049:4: ',' ( (lv_values_4_0= ruleExpression ) )
                    	    {
                    	    match(input,26,FOLLOW_26_in_ruleParameterValues3962); 

                    	            createLeafNode(grammarAccess.getParameterValuesAccess().getCommaKeyword_2_1_0(), null); 
                    	        
                    	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2053:1: ( (lv_values_4_0= ruleExpression ) )
                    	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2054:1: (lv_values_4_0= ruleExpression )
                    	    {
                    	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2054:1: (lv_values_4_0= ruleExpression )
                    	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2055:3: lv_values_4_0= ruleExpression
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getParameterValuesAccess().getValuesExpressionParserRuleCall_2_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleParameterValues3983);
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

            match(input,24,FOLLOW_24_in_ruleParameterValues3997); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2089:1: entryRuleContentProvider returns [EObject current=null] : iv_ruleContentProvider= ruleContentProvider EOF ;
    public final EObject entryRuleContentProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentProvider = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2090:2: (iv_ruleContentProvider= ruleContentProvider EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2091:2: iv_ruleContentProvider= ruleContentProvider EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContentProviderRule(), currentNode); 
            pushFollow(FOLLOW_ruleContentProvider_in_entryRuleContentProvider4033);
            iv_ruleContentProvider=ruleContentProvider();
            _fsp--;

             current =iv_ruleContentProvider; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentProvider4043); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2098:1: ruleContentProvider returns [EObject current=null] : ( 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) ( 'returns' | ( (lv_storing_4_0= 'stores' ) ) ) ( ( RULE_ID ) ) ( (lv_many_6_0= '[]' ) )? ( (lv_implementation_7_0= ruleContentProviderImplementation ) )? ) ;
    public final EObject ruleContentProvider() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_storing_4_0=null;
        Token lv_many_6_0=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_implementation_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2103:6: ( ( 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) ( 'returns' | ( (lv_storing_4_0= 'stores' ) ) ) ( ( RULE_ID ) ) ( (lv_many_6_0= '[]' ) )? ( (lv_implementation_7_0= ruleContentProviderImplementation ) )? ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2104:1: ( 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) ( 'returns' | ( (lv_storing_4_0= 'stores' ) ) ) ( ( RULE_ID ) ) ( (lv_many_6_0= '[]' ) )? ( (lv_implementation_7_0= ruleContentProviderImplementation ) )? )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2104:1: ( 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) ( 'returns' | ( (lv_storing_4_0= 'stores' ) ) ) ( ( RULE_ID ) ) ( (lv_many_6_0= '[]' ) )? ( (lv_implementation_7_0= ruleContentProviderImplementation ) )? )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2104:3: 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) ( 'returns' | ( (lv_storing_4_0= 'stores' ) ) ) ( ( RULE_ID ) ) ( (lv_many_6_0= '[]' ) )? ( (lv_implementation_7_0= ruleContentProviderImplementation ) )?
            {
            match(input,34,FOLLOW_34_in_ruleContentProvider4078); 

                    createLeafNode(grammarAccess.getContentProviderAccess().getContentproviderKeyword_0(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2108:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2109:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2109:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2110:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentProvider4095); 

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

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2132:2: ( (lv_parameters_2_0= ruleParameterDefinitions ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2133:1: (lv_parameters_2_0= ruleParameterDefinitions )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2133:1: (lv_parameters_2_0= ruleParameterDefinitions )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2134:3: lv_parameters_2_0= ruleParameterDefinitions
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getContentProviderAccess().getParametersParameterDefinitionsParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleParameterDefinitions_in_ruleContentProvider4121);
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

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2156:2: ( 'returns' | ( (lv_storing_4_0= 'stores' ) ) )
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
                    new NoViableAltException("2156:2: ( 'returns' | ( (lv_storing_4_0= 'stores' ) ) )", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2156:4: 'returns'
                    {
                    match(input,35,FOLLOW_35_in_ruleContentProvider4132); 

                            createLeafNode(grammarAccess.getContentProviderAccess().getReturnsKeyword_3_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2161:6: ( (lv_storing_4_0= 'stores' ) )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2161:6: ( (lv_storing_4_0= 'stores' ) )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2162:1: (lv_storing_4_0= 'stores' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2162:1: (lv_storing_4_0= 'stores' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2163:3: lv_storing_4_0= 'stores'
                    {
                    lv_storing_4_0=(Token)input.LT(1);
                    match(input,36,FOLLOW_36_in_ruleContentProvider4156); 

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

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2182:3: ( ( RULE_ID ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2183:1: ( RULE_ID )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2183:1: ( RULE_ID )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2184:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getContentProviderRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentProvider4188); 

            		createLeafNode(grammarAccess.getContentProviderAccess().getTypeTypeCrossReference_4_0(), "type"); 
            	

            }


            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2196:2: ( (lv_many_6_0= '[]' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==21) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2197:1: (lv_many_6_0= '[]' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2197:1: (lv_many_6_0= '[]' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2198:3: lv_many_6_0= '[]'
                    {
                    lv_many_6_0=(Token)input.LT(1);
                    match(input,21,FOLLOW_21_in_ruleContentProvider4206); 

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

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2217:3: ( (lv_implementation_7_0= ruleContentProviderImplementation ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==19||LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2218:1: (lv_implementation_7_0= ruleContentProviderImplementation )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2218:1: (lv_implementation_7_0= ruleContentProviderImplementation )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2219:3: lv_implementation_7_0= ruleContentProviderImplementation
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getContentProviderAccess().getImplementationContentProviderImplementationParserRuleCall_6_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleContentProviderImplementation_in_ruleContentProvider4241);
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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2249:1: entryRuleContentProviderImplementation returns [EObject current=null] : iv_ruleContentProviderImplementation= ruleContentProviderImplementation EOF ;
    public final EObject entryRuleContentProviderImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentProviderImplementation = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2250:2: (iv_ruleContentProviderImplementation= ruleContentProviderImplementation EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2251:2: iv_ruleContentProviderImplementation= ruleContentProviderImplementation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContentProviderImplementationRule(), currentNode); 
            pushFollow(FOLLOW_ruleContentProviderImplementation_in_entryRuleContentProviderImplementation4278);
            iv_ruleContentProviderImplementation=ruleContentProviderImplementation();
            _fsp--;

             current =iv_ruleContentProviderImplementation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentProviderImplementation4288); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2258:1: ruleContentProviderImplementation returns [EObject current=null] : (this_UrlContentProviderImplementation_0= ruleUrlContentProviderImplementation | this_CustomContentProviderImplementation_1= ruleCustomContentProviderImplementation ) ;
    public final EObject ruleContentProviderImplementation() throws RecognitionException {
        EObject current = null;

        EObject this_UrlContentProviderImplementation_0 = null;

        EObject this_CustomContentProviderImplementation_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2263:6: ( (this_UrlContentProviderImplementation_0= ruleUrlContentProviderImplementation | this_CustomContentProviderImplementation_1= ruleCustomContentProviderImplementation ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2264:1: (this_UrlContentProviderImplementation_0= ruleUrlContentProviderImplementation | this_CustomContentProviderImplementation_1= ruleCustomContentProviderImplementation )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2264:1: (this_UrlContentProviderImplementation_0= ruleUrlContentProviderImplementation | this_CustomContentProviderImplementation_1= ruleCustomContentProviderImplementation )
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
                    new NoViableAltException("2264:1: (this_UrlContentProviderImplementation_0= ruleUrlContentProviderImplementation | this_CustomContentProviderImplementation_1= ruleCustomContentProviderImplementation )", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2265:5: this_UrlContentProviderImplementation_0= ruleUrlContentProviderImplementation
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContentProviderImplementationAccess().getUrlContentProviderImplementationParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUrlContentProviderImplementation_in_ruleContentProviderImplementation4335);
                    this_UrlContentProviderImplementation_0=ruleUrlContentProviderImplementation();
                    _fsp--;

                     
                            current = this_UrlContentProviderImplementation_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2275:5: this_CustomContentProviderImplementation_1= ruleCustomContentProviderImplementation
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContentProviderImplementationAccess().getCustomContentProviderImplementationParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCustomContentProviderImplementation_in_ruleContentProviderImplementation4362);
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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2291:1: entryRuleUrlContentProviderImplementation returns [EObject current=null] : iv_ruleUrlContentProviderImplementation= ruleUrlContentProviderImplementation EOF ;
    public final EObject entryRuleUrlContentProviderImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUrlContentProviderImplementation = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2292:2: (iv_ruleUrlContentProviderImplementation= ruleUrlContentProviderImplementation EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2293:2: iv_ruleUrlContentProviderImplementation= ruleUrlContentProviderImplementation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUrlContentProviderImplementationRule(), currentNode); 
            pushFollow(FOLLOW_ruleUrlContentProviderImplementation_in_entryRuleUrlContentProviderImplementation4397);
            iv_ruleUrlContentProviderImplementation=ruleUrlContentProviderImplementation();
            _fsp--;

             current =iv_ruleUrlContentProviderImplementation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUrlContentProviderImplementation4407); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2300:1: ruleUrlContentProviderImplementation returns [EObject current=null] : ( 'fetches' ( (lv_format_1_0= ruleSerializationFormat ) ) 'from' ( (lv_url_3_0= ruleScalarExpression ) ) ( 'selects' ( (lv_selection_5_0= ruleScalarExpression ) ) )? ) ;
    public final EObject ruleUrlContentProviderImplementation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_format_1_0 = null;

        EObject lv_url_3_0 = null;

        EObject lv_selection_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2305:6: ( ( 'fetches' ( (lv_format_1_0= ruleSerializationFormat ) ) 'from' ( (lv_url_3_0= ruleScalarExpression ) ) ( 'selects' ( (lv_selection_5_0= ruleScalarExpression ) ) )? ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2306:1: ( 'fetches' ( (lv_format_1_0= ruleSerializationFormat ) ) 'from' ( (lv_url_3_0= ruleScalarExpression ) ) ( 'selects' ( (lv_selection_5_0= ruleScalarExpression ) ) )? )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2306:1: ( 'fetches' ( (lv_format_1_0= ruleSerializationFormat ) ) 'from' ( (lv_url_3_0= ruleScalarExpression ) ) ( 'selects' ( (lv_selection_5_0= ruleScalarExpression ) ) )? )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2306:3: 'fetches' ( (lv_format_1_0= ruleSerializationFormat ) ) 'from' ( (lv_url_3_0= ruleScalarExpression ) ) ( 'selects' ( (lv_selection_5_0= ruleScalarExpression ) ) )?
            {
            match(input,37,FOLLOW_37_in_ruleUrlContentProviderImplementation4442); 

                    createLeafNode(grammarAccess.getUrlContentProviderImplementationAccess().getFetchesKeyword_0(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2310:1: ( (lv_format_1_0= ruleSerializationFormat ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2311:1: (lv_format_1_0= ruleSerializationFormat )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2311:1: (lv_format_1_0= ruleSerializationFormat )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2312:3: lv_format_1_0= ruleSerializationFormat
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getUrlContentProviderImplementationAccess().getFormatSerializationFormatEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSerializationFormat_in_ruleUrlContentProviderImplementation4463);
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

            match(input,38,FOLLOW_38_in_ruleUrlContentProviderImplementation4473); 

                    createLeafNode(grammarAccess.getUrlContentProviderImplementationAccess().getFromKeyword_2(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2338:1: ( (lv_url_3_0= ruleScalarExpression ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2339:1: (lv_url_3_0= ruleScalarExpression )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2339:1: (lv_url_3_0= ruleScalarExpression )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2340:3: lv_url_3_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getUrlContentProviderImplementationAccess().getUrlScalarExpressionParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleUrlContentProviderImplementation4494);
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

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2362:2: ( 'selects' ( (lv_selection_5_0= ruleScalarExpression ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2362:4: 'selects' ( (lv_selection_5_0= ruleScalarExpression ) )
                    {
                    match(input,39,FOLLOW_39_in_ruleUrlContentProviderImplementation4505); 

                            createLeafNode(grammarAccess.getUrlContentProviderImplementationAccess().getSelectsKeyword_4_0(), null); 
                        
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2366:1: ( (lv_selection_5_0= ruleScalarExpression ) )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2367:1: (lv_selection_5_0= ruleScalarExpression )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2367:1: (lv_selection_5_0= ruleScalarExpression )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2368:3: lv_selection_5_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUrlContentProviderImplementationAccess().getSelectionScalarExpressionParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleUrlContentProviderImplementation4526);
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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2398:1: entryRuleCustomContentProviderImplementation returns [EObject current=null] : iv_ruleCustomContentProviderImplementation= ruleCustomContentProviderImplementation EOF ;
    public final EObject entryRuleCustomContentProviderImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomContentProviderImplementation = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2399:2: (iv_ruleCustomContentProviderImplementation= ruleCustomContentProviderImplementation EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2400:2: iv_ruleCustomContentProviderImplementation= ruleCustomContentProviderImplementation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCustomContentProviderImplementationRule(), currentNode); 
            pushFollow(FOLLOW_ruleCustomContentProviderImplementation_in_entryRuleCustomContentProviderImplementation4564);
            iv_ruleCustomContentProviderImplementation=ruleCustomContentProviderImplementation();
            _fsp--;

             current =iv_ruleCustomContentProviderImplementation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomContentProviderImplementation4574); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2407:1: ruleCustomContentProviderImplementation returns [EObject current=null] : ( (lv_providerClass_0_0= ruleProjectClass ) ) ;
    public final EObject ruleCustomContentProviderImplementation() throws RecognitionException {
        EObject current = null;

        EObject lv_providerClass_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2412:6: ( ( (lv_providerClass_0_0= ruleProjectClass ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2413:1: ( (lv_providerClass_0_0= ruleProjectClass ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2413:1: ( (lv_providerClass_0_0= ruleProjectClass ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2414:1: (lv_providerClass_0_0= ruleProjectClass )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2414:1: (lv_providerClass_0_0= ruleProjectClass )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2415:3: lv_providerClass_0_0= ruleProjectClass
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCustomContentProviderImplementationAccess().getProviderClassProjectClassParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleProjectClass_in_ruleCustomContentProviderImplementation4619);
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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2445:1: entryRuleContentProviderCall returns [EObject current=null] : iv_ruleContentProviderCall= ruleContentProviderCall EOF ;
    public final EObject entryRuleContentProviderCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentProviderCall = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2446:2: (iv_ruleContentProviderCall= ruleContentProviderCall EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2447:2: iv_ruleContentProviderCall= ruleContentProviderCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContentProviderCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleContentProviderCall_in_entryRuleContentProviderCall4654);
            iv_ruleContentProviderCall=ruleContentProviderCall();
            _fsp--;

             current =iv_ruleContentProviderCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentProviderCall4664); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2454:1: ruleContentProviderCall returns [EObject current=null] : ( 'new' ( ( RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterValues ) ) ) ;
    public final EObject ruleContentProviderCall() throws RecognitionException {
        EObject current = null;

        EObject lv_parameters_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2459:6: ( ( 'new' ( ( RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterValues ) ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2460:1: ( 'new' ( ( RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterValues ) ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2460:1: ( 'new' ( ( RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterValues ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2460:3: 'new' ( ( RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterValues ) )
            {
            match(input,40,FOLLOW_40_in_ruleContentProviderCall4699); 

                    createLeafNode(grammarAccess.getContentProviderCallAccess().getNewKeyword_0(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2464:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2465:1: ( RULE_ID )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2465:1: ( RULE_ID )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2466:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getContentProviderCallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentProviderCall4717); 

            		createLeafNode(grammarAccess.getContentProviderCallAccess().getTargetContentProviderCrossReference_1_0(), "target"); 
            	

            }


            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2478:2: ( (lv_parameters_2_0= ruleParameterValues ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2479:1: (lv_parameters_2_0= ruleParameterValues )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2479:1: (lv_parameters_2_0= ruleParameterValues )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2480:3: lv_parameters_2_0= ruleParameterValues
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getContentProviderCallAccess().getParametersParameterValuesParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleParameterValues_in_ruleContentProviderCall4738);
            lv_parameters_2_0=ruleParameterValues();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getContentProviderCallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"parameters",
            	        		lv_parameters_2_0, 
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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2510:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2511:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2512:2: iv_ruleAssignment= ruleAssignment EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssignmentRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment4774);
            iv_ruleAssignment=ruleAssignment();
            _fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment4784); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2519:1: ruleAssignment returns [EObject current=null] : ( ( (lv_typeRef_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= ruleContentProviderCall ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_typeRef_0_0 = null;

        EObject lv_value_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2524:6: ( ( ( (lv_typeRef_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= ruleContentProviderCall ) ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2525:1: ( ( (lv_typeRef_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= ruleContentProviderCall ) ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2525:1: ( ( (lv_typeRef_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= ruleContentProviderCall ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2525:2: ( (lv_typeRef_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_value_3_0= ruleContentProviderCall ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2525:2: ( (lv_typeRef_0_0= ruleTypeReference ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2526:1: (lv_typeRef_0_0= ruleTypeReference )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2526:1: (lv_typeRef_0_0= ruleTypeReference )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2527:3: lv_typeRef_0_0= ruleTypeReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getTypeRefTypeReferenceParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeReference_in_ruleAssignment4830);
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

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2549:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2550:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2550:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2551:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment4847); 

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

            match(input,41,FOLLOW_41_in_ruleAssignment4862); 

                    createLeafNode(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_2(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2577:1: ( (lv_value_3_0= ruleContentProviderCall ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2578:1: (lv_value_3_0= ruleContentProviderCall )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2578:1: (lv_value_3_0= ruleContentProviderCall )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2579:3: lv_value_3_0= ruleContentProviderCall
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getValueContentProviderCallParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleContentProviderCall_in_ruleAssignment4883);
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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2609:1: entryRuleView returns [EObject current=null] : iv_ruleView= ruleView EOF ;
    public final EObject entryRuleView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleView = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2610:2: (iv_ruleView= ruleView EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2611:2: iv_ruleView= ruleView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleView_in_entryRuleView4919);
            iv_ruleView=ruleView();
            _fsp--;

             current =iv_ruleView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleView4929); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2618:1: ruleView returns [EObject current=null] : (this_TabView_0= ruleTabView | this_TableView_1= ruleTableView | this_CustomView_2= ruleCustomView ) ;
    public final EObject ruleView() throws RecognitionException {
        EObject current = null;

        EObject this_TabView_0 = null;

        EObject this_TableView_1 = null;

        EObject this_CustomView_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2623:6: ( (this_TabView_0= ruleTabView | this_TableView_1= ruleTableView | this_CustomView_2= ruleCustomView ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2624:1: (this_TabView_0= ruleTabView | this_TableView_1= ruleTableView | this_CustomView_2= ruleCustomView )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2624:1: (this_TabView_0= ruleTabView | this_TableView_1= ruleTableView | this_CustomView_2= ruleCustomView )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt28=1;
                }
                break;
            case 46:
                {
                alt28=2;
                }
                break;
            case 56:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2624:1: (this_TabView_0= ruleTabView | this_TableView_1= ruleTableView | this_CustomView_2= ruleCustomView )", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2625:5: this_TabView_0= ruleTabView
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getViewAccess().getTabViewParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTabView_in_ruleView4976);
                    this_TabView_0=ruleTabView();
                    _fsp--;

                     
                            current = this_TabView_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2635:5: this_TableView_1= ruleTableView
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getViewAccess().getTableViewParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTableView_in_ruleView5003);
                    this_TableView_1=ruleTableView();
                    _fsp--;

                     
                            current = this_TableView_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2645:5: this_CustomView_2= ruleCustomView
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getViewAccess().getCustomViewParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCustomView_in_ruleView5030);
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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2661:1: entryRuleTabView returns [EObject current=null] : iv_ruleTabView= ruleTabView EOF ;
    public final EObject entryRuleTabView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabView = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2662:2: (iv_ruleTabView= ruleTabView EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2663:2: iv_ruleTabView= ruleTabView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTabViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleTabView_in_entryRuleTabView5065);
            iv_ruleTabView=ruleTabView();
            _fsp--;

             current =iv_ruleTabView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabView5075); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2670:1: ruleTabView returns [EObject current=null] : ( 'tabview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) '{' ( (lv_tabs_4_0= ruleTab ) )* '}' ) ;
    public final EObject ruleTabView() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_tabs_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2675:6: ( ( 'tabview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) '{' ( (lv_tabs_4_0= ruleTab ) )* '}' ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2676:1: ( 'tabview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) '{' ( (lv_tabs_4_0= ruleTab ) )* '}' )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2676:1: ( 'tabview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) '{' ( (lv_tabs_4_0= ruleTab ) )* '}' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2676:3: 'tabview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) '{' ( (lv_tabs_4_0= ruleTab ) )* '}'
            {
            match(input,42,FOLLOW_42_in_ruleTabView5110); 

                    createLeafNode(grammarAccess.getTabViewAccess().getTabviewKeyword_0(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2680:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2681:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2681:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2682:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTabView5127); 

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

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2704:2: ( (lv_parameters_2_0= ruleParameterDefinitions ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2705:1: (lv_parameters_2_0= ruleParameterDefinitions )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2705:1: (lv_parameters_2_0= ruleParameterDefinitions )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2706:3: lv_parameters_2_0= ruleParameterDefinitions
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTabViewAccess().getParametersParameterDefinitionsParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleParameterDefinitions_in_ruleTabView5153);
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

            match(input,12,FOLLOW_12_in_ruleTabView5163); 

                    createLeafNode(grammarAccess.getTabViewAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2732:1: ( (lv_tabs_4_0= ruleTab ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==43) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2733:1: (lv_tabs_4_0= ruleTab )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2733:1: (lv_tabs_4_0= ruleTab )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2734:3: lv_tabs_4_0= ruleTab
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTabViewAccess().getTabsTabParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTab_in_ruleTabView5184);
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

            match(input,15,FOLLOW_15_in_ruleTabView5195); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2768:1: entryRuleTab returns [EObject current=null] : iv_ruleTab= ruleTab EOF ;
    public final EObject entryRuleTab() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTab = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2769:2: (iv_ruleTab= ruleTab EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2770:2: iv_ruleTab= ruleTab EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTabRule(), currentNode); 
            pushFollow(FOLLOW_ruleTab_in_entryRuleTab5231);
            iv_ruleTab=ruleTab();
            _fsp--;

             current =iv_ruleTab; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTab5241); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2777:1: ruleTab returns [EObject current=null] : ( 'tab' '{' ( ( ( ( ({...}? => ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) ) ) )+ {...}?) ) ) '}' ) ;
    public final EObject ruleTab() throws RecognitionException {
        EObject current = null;

        EObject lv_title_4_0 = null;

        EObject lv_icon_6_0 = null;

        EObject lv_view_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2782:6: ( ( 'tab' '{' ( ( ( ( ({...}? => ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) ) ) )+ {...}?) ) ) '}' ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2783:1: ( 'tab' '{' ( ( ( ( ({...}? => ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) ) ) )+ {...}?) ) ) '}' )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2783:1: ( 'tab' '{' ( ( ( ( ({...}? => ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) ) ) )+ {...}?) ) ) '}' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2783:3: 'tab' '{' ( ( ( ( ({...}? => ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) ) ) )+ {...}?) ) ) '}'
            {
            match(input,43,FOLLOW_43_in_ruleTab5276); 

                    createLeafNode(grammarAccess.getTabAccess().getTabKeyword_0(), null); 
                
            match(input,12,FOLLOW_12_in_ruleTab5286); 

                    createLeafNode(grammarAccess.getTabAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2791:1: ( ( ( ( ({...}? => ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) ) ) )+ {...}?) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2793:1: ( ( ( ({...}? => ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) ) ) )+ {...}?) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2793:1: ( ( ( ({...}? => ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) ) ) )+ {...}?) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2794:2: ( ( ({...}? => ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTabAccess().getUnorderedGroup_2());
            	
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2797:2: ( ( ({...}? => ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) ) ) )+ {...}?)
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2798:3: ( ({...}? => ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) ) ) )+ {...}?
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2798:3: ( ({...}? => ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) ) ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=4;
                int LA30_0 = input.LA(1);

                if ( LA30_0 ==44 && getUnorderedGroupHelper().canSelect(grammarAccess.getTabAccess().getUnorderedGroup_2(), 0) ) {
                    alt30=1;
                }
                else if ( LA30_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getTabAccess().getUnorderedGroup_2(), 1) ) {
                    alt30=2;
                }
                else if ( LA30_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getTabAccess().getUnorderedGroup_2(), 2) ) {
                    alt30=3;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2800:4: ({...}? => ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) ) )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2800:4: ({...}? => ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2801:5: {...}? => ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTabAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTab", "getUnorderedGroupHelper().canSelect(grammarAccess.getTabAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2801:100: ( ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2802:6: ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTabAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2805:6: ( 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2805:8: 'title:' ( (lv_title_4_0= ruleScalarExpression ) )
            	    {
            	    match(input,44,FOLLOW_44_in_ruleTab5339); 

            	            createLeafNode(grammarAccess.getTabAccess().getTitleKeyword_2_0_0(), null); 
            	        
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2809:1: ( (lv_title_4_0= ruleScalarExpression ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2810:1: (lv_title_4_0= ruleScalarExpression )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2810:1: (lv_title_4_0= ruleScalarExpression )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2811:3: lv_title_4_0= ruleScalarExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTabAccess().getTitleScalarExpressionParserRuleCall_2_0_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleScalarExpression_in_ruleTab5360);
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
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2840:4: ({...}? => ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) ) )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2840:4: ({...}? => ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2841:5: {...}? => ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTabAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTab", "getUnorderedGroupHelper().canSelect(grammarAccess.getTabAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2841:100: ( ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2842:6: ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTabAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2845:6: ( 'icon:' ( (lv_icon_6_0= ruleImageExpression ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2845:8: 'icon:' ( (lv_icon_6_0= ruleImageExpression ) )
            	    {
            	    match(input,45,FOLLOW_45_in_ruleTab5422); 

            	            createLeafNode(grammarAccess.getTabAccess().getIconKeyword_2_1_0(), null); 
            	        
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2849:1: ( (lv_icon_6_0= ruleImageExpression ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2850:1: (lv_icon_6_0= ruleImageExpression )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2850:1: (lv_icon_6_0= ruleImageExpression )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2851:3: lv_icon_6_0= ruleImageExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTabAccess().getIconImageExpressionParserRuleCall_2_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleImageExpression_in_ruleTab5443);
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
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2880:4: ({...}? => ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) ) )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2880:4: ({...}? => ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2881:5: {...}? => ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTabAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTab", "getUnorderedGroupHelper().canSelect(grammarAccess.getTabAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2881:100: ( ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2882:6: ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTabAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2885:6: ( 'view:' ( (lv_view_8_0= ruleViewCall ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2885:8: 'view:' ( (lv_view_8_0= ruleViewCall ) )
            	    {
            	    match(input,14,FOLLOW_14_in_ruleTab5505); 

            	            createLeafNode(grammarAccess.getTabAccess().getViewKeyword_2_2_0(), null); 
            	        
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2889:1: ( (lv_view_8_0= ruleViewCall ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2890:1: (lv_view_8_0= ruleViewCall )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2890:1: (lv_view_8_0= ruleViewCall )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2891:3: lv_view_8_0= ruleViewCall
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTabAccess().getViewViewCallParserRuleCall_2_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleViewCall_in_ruleTab5526);
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

            match(input,15,FOLLOW_15_in_ruleTab5582); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2940:1: entryRuleTableView returns [EObject current=null] : iv_ruleTableView= ruleTableView EOF ;
    public final EObject entryRuleTableView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableView = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2941:2: (iv_ruleTableView= ruleTableView EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2942:2: iv_ruleTableView= ruleTableView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTableViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleTableView_in_entryRuleTableView5618);
            iv_ruleTableView=ruleTableView();
            _fsp--;

             current =iv_ruleTableView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableView5628); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2949:1: ruleTableView returns [EObject current=null] : ( 'tableview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) '{' ( (lv_variables_4_0= ruleAssignment ) )* ( ( ( ( ({...}? => ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) ) ) )* ) ) ) ( (lv_sections_12_0= ruleSection ) )* '}' ) ;
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
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2954:6: ( ( 'tableview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) '{' ( (lv_variables_4_0= ruleAssignment ) )* ( ( ( ( ({...}? => ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) ) ) )* ) ) ) ( (lv_sections_12_0= ruleSection ) )* '}' ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2955:1: ( 'tableview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) '{' ( (lv_variables_4_0= ruleAssignment ) )* ( ( ( ( ({...}? => ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) ) ) )* ) ) ) ( (lv_sections_12_0= ruleSection ) )* '}' )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2955:1: ( 'tableview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) '{' ( (lv_variables_4_0= ruleAssignment ) )* ( ( ( ( ({...}? => ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) ) ) )* ) ) ) ( (lv_sections_12_0= ruleSection ) )* '}' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2955:3: 'tableview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) '{' ( (lv_variables_4_0= ruleAssignment ) )* ( ( ( ( ({...}? => ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) ) ) )* ) ) ) ( (lv_sections_12_0= ruleSection ) )* '}'
            {
            match(input,46,FOLLOW_46_in_ruleTableView5663); 

                    createLeafNode(grammarAccess.getTableViewAccess().getTableviewKeyword_0(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2959:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2960:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2960:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2961:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTableView5680); 

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

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2983:2: ( (lv_parameters_2_0= ruleParameterDefinitions ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2984:1: (lv_parameters_2_0= ruleParameterDefinitions )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2984:1: (lv_parameters_2_0= ruleParameterDefinitions )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:2985:3: lv_parameters_2_0= ruleParameterDefinitions
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTableViewAccess().getParametersParameterDefinitionsParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleParameterDefinitions_in_ruleTableView5706);
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

            match(input,12,FOLLOW_12_in_ruleTableView5716); 

                    createLeafNode(grammarAccess.getTableViewAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3011:1: ( (lv_variables_4_0= ruleAssignment ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3012:1: (lv_variables_4_0= ruleAssignment )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3012:1: (lv_variables_4_0= ruleAssignment )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3013:3: lv_variables_4_0= ruleAssignment
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTableViewAccess().getVariablesAssignmentParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleTableView5737);
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

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3035:3: ( ( ( ( ({...}? => ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) ) ) )* ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3037:1: ( ( ( ({...}? => ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) ) ) )* ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3037:1: ( ( ( ({...}? => ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) ) ) )* ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3038:2: ( ( ({...}? => ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTableViewAccess().getUnorderedGroup_5());
            	
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3041:2: ( ( ({...}? => ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) ) ) )* )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3042:3: ( ({...}? => ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) ) ) )*
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3042:3: ( ({...}? => ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) ) ) | ({...}? => ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) ) ) )*
            loop32:
            do {
                int alt32=4;
                int LA32_0 = input.LA(1);

                if ( LA32_0 ==44 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableViewAccess().getUnorderedGroup_5(), 0) ) {
                    alt32=1;
                }
                else if ( LA32_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableViewAccess().getUnorderedGroup_5(), 1) ) {
                    alt32=2;
                }
                else if ( LA32_0 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableViewAccess().getUnorderedGroup_5(), 2) ) {
                    alt32=3;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3044:4: ({...}? => ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) ) )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3044:4: ({...}? => ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3045:5: {...}? => ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableViewAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTableView", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableViewAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3045:106: ( ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3046:6: ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableViewAccess().getUnorderedGroup_5(), 0);
            	    	 				
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3049:6: ( 'title:' ( (lv_title_7_0= ruleScalarExpression ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3049:8: 'title:' ( (lv_title_7_0= ruleScalarExpression ) )
            	    {
            	    match(input,44,FOLLOW_44_in_ruleTableView5791); 

            	            createLeafNode(grammarAccess.getTableViewAccess().getTitleKeyword_5_0_0(), null); 
            	        
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3053:1: ( (lv_title_7_0= ruleScalarExpression ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3054:1: (lv_title_7_0= ruleScalarExpression )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3054:1: (lv_title_7_0= ruleScalarExpression )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3055:3: lv_title_7_0= ruleScalarExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTableViewAccess().getTitleScalarExpressionParserRuleCall_5_0_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleScalarExpression_in_ruleTableView5812);
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
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3084:4: ({...}? => ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) ) )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3084:4: ({...}? => ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3085:5: {...}? => ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableViewAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTableView", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableViewAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3085:106: ( ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3086:6: ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableViewAccess().getUnorderedGroup_5(), 1);
            	    	 				
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3089:6: ( 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3089:8: 'titleImage:' ( (lv_titleImage_9_0= ruleImageExpression ) )
            	    {
            	    match(input,47,FOLLOW_47_in_ruleTableView5874); 

            	            createLeafNode(grammarAccess.getTableViewAccess().getTitleImageKeyword_5_1_0(), null); 
            	        
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3093:1: ( (lv_titleImage_9_0= ruleImageExpression ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3094:1: (lv_titleImage_9_0= ruleImageExpression )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3094:1: (lv_titleImage_9_0= ruleImageExpression )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3095:3: lv_titleImage_9_0= ruleImageExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTableViewAccess().getTitleImageImageExpressionParserRuleCall_5_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleImageExpression_in_ruleTableView5895);
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
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3124:4: ({...}? => ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) ) )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3124:4: ({...}? => ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3125:5: {...}? => ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableViewAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTableView", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableViewAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3125:106: ( ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3126:6: ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableViewAccess().getUnorderedGroup_5(), 2);
            	    	 				
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3129:6: ( 'style:' ( (lv_style_11_0= ruleTableViewStyle ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3129:8: 'style:' ( (lv_style_11_0= ruleTableViewStyle ) )
            	    {
            	    match(input,48,FOLLOW_48_in_ruleTableView5957); 

            	            createLeafNode(grammarAccess.getTableViewAccess().getStyleKeyword_5_2_0(), null); 
            	        
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3133:1: ( (lv_style_11_0= ruleTableViewStyle ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3134:1: (lv_style_11_0= ruleTableViewStyle )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3134:1: (lv_style_11_0= ruleTableViewStyle )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3135:3: lv_style_11_0= ruleTableViewStyle
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTableViewAccess().getStyleTableViewStyleEnumRuleCall_5_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTableViewStyle_in_ruleTableView5978);
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

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3171:2: ( (lv_sections_12_0= ruleSection ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==49) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3172:1: (lv_sections_12_0= ruleSection )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3172:1: (lv_sections_12_0= ruleSection )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3173:3: lv_sections_12_0= ruleSection
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTableViewAccess().getSectionsSectionParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSection_in_ruleTableView6039);
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

            match(input,15,FOLLOW_15_in_ruleTableView6050); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3209:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3210:2: (iv_ruleSection= ruleSection EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3211:2: iv_ruleSection= ruleSection EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSectionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSection_in_entryRuleSection6088);
            iv_ruleSection=ruleSection();
            _fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection6098); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3218:1: ruleSection returns [EObject current=null] : ( () 'section' ( (lv_iterator_2_0= ruleCollectionIterator ) )? '{' ( 'title:' ( (lv_title_5_0= ruleScalarExpression ) ) )? ( (lv_cells_6_0= ruleCell ) )* '}' ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        EObject lv_iterator_2_0 = null;

        EObject lv_title_5_0 = null;

        EObject lv_cells_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3223:6: ( ( () 'section' ( (lv_iterator_2_0= ruleCollectionIterator ) )? '{' ( 'title:' ( (lv_title_5_0= ruleScalarExpression ) ) )? ( (lv_cells_6_0= ruleCell ) )* '}' ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3224:1: ( () 'section' ( (lv_iterator_2_0= ruleCollectionIterator ) )? '{' ( 'title:' ( (lv_title_5_0= ruleScalarExpression ) ) )? ( (lv_cells_6_0= ruleCell ) )* '}' )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3224:1: ( () 'section' ( (lv_iterator_2_0= ruleCollectionIterator ) )? '{' ( 'title:' ( (lv_title_5_0= ruleScalarExpression ) ) )? ( (lv_cells_6_0= ruleCell ) )* '}' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3224:2: () 'section' ( (lv_iterator_2_0= ruleCollectionIterator ) )? '{' ( 'title:' ( (lv_title_5_0= ruleScalarExpression ) ) )? ( (lv_cells_6_0= ruleCell ) )* '}'
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3224:2: ()
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3225:5: 
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

            match(input,49,FOLLOW_49_in_ruleSection6142); 

                    createLeafNode(grammarAccess.getSectionAccess().getSectionKeyword_1(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3239:1: ( (lv_iterator_2_0= ruleCollectionIterator ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==32) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3240:1: (lv_iterator_2_0= ruleCollectionIterator )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3240:1: (lv_iterator_2_0= ruleCollectionIterator )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3241:3: lv_iterator_2_0= ruleCollectionIterator
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionAccess().getIteratorCollectionIteratorParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCollectionIterator_in_ruleSection6163);
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

            match(input,12,FOLLOW_12_in_ruleSection6174); 

                    createLeafNode(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3267:1: ( 'title:' ( (lv_title_5_0= ruleScalarExpression ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==44) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3267:3: 'title:' ( (lv_title_5_0= ruleScalarExpression ) )
                    {
                    match(input,44,FOLLOW_44_in_ruleSection6185); 

                            createLeafNode(grammarAccess.getSectionAccess().getTitleKeyword_4_0(), null); 
                        
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3271:1: ( (lv_title_5_0= ruleScalarExpression ) )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3272:1: (lv_title_5_0= ruleScalarExpression )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3272:1: (lv_title_5_0= ruleScalarExpression )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3273:3: lv_title_5_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionAccess().getTitleScalarExpressionParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleSection6206);
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

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3295:4: ( (lv_cells_6_0= ruleCell ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==50) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3296:1: (lv_cells_6_0= ruleCell )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3296:1: (lv_cells_6_0= ruleCell )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3297:3: lv_cells_6_0= ruleCell
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSectionAccess().getCellsCellParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleCell_in_ruleSection6229);
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

            match(input,15,FOLLOW_15_in_ruleSection6240); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3331:1: entryRuleCell returns [EObject current=null] : iv_ruleCell= ruleCell EOF ;
    public final EObject entryRuleCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCell = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3332:2: (iv_ruleCell= ruleCell EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3333:2: iv_ruleCell= ruleCell EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCellRule(), currentNode); 
            pushFollow(FOLLOW_ruleCell_in_entryRuleCell6276);
            iv_ruleCell=ruleCell();
            _fsp--;

             current =iv_ruleCell; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCell6286); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3340:1: ruleCell returns [EObject current=null] : ( 'cell' ( (lv_type_1_0= ruleCellType ) ) ( (lv_iterator_2_0= ruleCollectionIterator ) )? '{' ( ( ( ( ({...}? => ( ( 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'detailText:' ( (lv_detailText_8_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) ) ) | ({...}? => ( ( 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) ) ) )* ) ) ) '}' ) ;
    public final EObject ruleCell() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_1_0 = null;

        EObject lv_iterator_2_0 = null;

        EObject lv_text_6_0 = null;

        EObject lv_detailText_8_0 = null;

        EObject lv_image_10_0 = null;

        EObject lv_action_12_0 = null;

        Enumerator lv_accessory_14_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3345:6: ( ( 'cell' ( (lv_type_1_0= ruleCellType ) ) ( (lv_iterator_2_0= ruleCollectionIterator ) )? '{' ( ( ( ( ({...}? => ( ( 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'detailText:' ( (lv_detailText_8_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) ) ) | ({...}? => ( ( 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) ) ) )* ) ) ) '}' ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3346:1: ( 'cell' ( (lv_type_1_0= ruleCellType ) ) ( (lv_iterator_2_0= ruleCollectionIterator ) )? '{' ( ( ( ( ({...}? => ( ( 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'detailText:' ( (lv_detailText_8_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) ) ) | ({...}? => ( ( 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) ) ) )* ) ) ) '}' )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3346:1: ( 'cell' ( (lv_type_1_0= ruleCellType ) ) ( (lv_iterator_2_0= ruleCollectionIterator ) )? '{' ( ( ( ( ({...}? => ( ( 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'detailText:' ( (lv_detailText_8_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) ) ) | ({...}? => ( ( 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) ) ) )* ) ) ) '}' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3346:3: 'cell' ( (lv_type_1_0= ruleCellType ) ) ( (lv_iterator_2_0= ruleCollectionIterator ) )? '{' ( ( ( ( ({...}? => ( ( 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'detailText:' ( (lv_detailText_8_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) ) ) | ({...}? => ( ( 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) ) ) )* ) ) ) '}'
            {
            match(input,50,FOLLOW_50_in_ruleCell6321); 

                    createLeafNode(grammarAccess.getCellAccess().getCellKeyword_0(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3350:1: ( (lv_type_1_0= ruleCellType ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3351:1: (lv_type_1_0= ruleCellType )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3351:1: (lv_type_1_0= ruleCellType )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3352:3: lv_type_1_0= ruleCellType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCellAccess().getTypeCellTypeEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCellType_in_ruleCell6342);
            lv_type_1_0=ruleCellType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCellRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_1_0, 
            	        		"CellType", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3374:2: ( (lv_iterator_2_0= ruleCollectionIterator ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==32) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3375:1: (lv_iterator_2_0= ruleCollectionIterator )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3375:1: (lv_iterator_2_0= ruleCollectionIterator )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3376:3: lv_iterator_2_0= ruleCollectionIterator
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCellAccess().getIteratorCollectionIteratorParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCollectionIterator_in_ruleCell6363);
                    lv_iterator_2_0=ruleCollectionIterator();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCellRule().getType().getClassifier());
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

            match(input,12,FOLLOW_12_in_ruleCell6374); 

                    createLeafNode(grammarAccess.getCellAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3402:1: ( ( ( ( ({...}? => ( ( 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'detailText:' ( (lv_detailText_8_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) ) ) | ({...}? => ( ( 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) ) ) )* ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3404:1: ( ( ( ({...}? => ( ( 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'detailText:' ( (lv_detailText_8_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) ) ) | ({...}? => ( ( 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) ) ) )* ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3404:1: ( ( ( ({...}? => ( ( 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'detailText:' ( (lv_detailText_8_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) ) ) | ({...}? => ( ( 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) ) ) )* ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3405:2: ( ( ({...}? => ( ( 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'detailText:' ( (lv_detailText_8_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) ) ) | ({...}? => ( ( 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getCellAccess().getUnorderedGroup_4());
            	
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3408:2: ( ( ({...}? => ( ( 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'detailText:' ( (lv_detailText_8_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) ) ) | ({...}? => ( ( 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) ) ) )* )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3409:3: ( ({...}? => ( ( 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'detailText:' ( (lv_detailText_8_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) ) ) | ({...}? => ( ( 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) ) ) )*
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3409:3: ( ({...}? => ( ( 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'detailText:' ( (lv_detailText_8_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) ) ) | ({...}? => ( ( 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) ) ) )*
            loop38:
            do {
                int alt38=6;
                int LA38_0 = input.LA(1);

                if ( LA38_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 0) ) {
                    alt38=1;
                }
                else if ( LA38_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 1) ) {
                    alt38=2;
                }
                else if ( LA38_0 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 2) ) {
                    alt38=3;
                }
                else if ( LA38_0 ==54 && getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 3) ) {
                    alt38=4;
                }
                else if ( LA38_0 ==55 && getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 4) ) {
                    alt38=5;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3411:4: ({...}? => ( ( 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) ) )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3411:4: ({...}? => ( ( 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3412:5: {...}? => ( ( 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCell", "getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3412:101: ( ( 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3413:6: ( 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCellAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3416:6: ( 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3416:8: 'text:' ( (lv_text_6_0= ruleScalarExpression ) )
            	    {
            	    match(input,51,FOLLOW_51_in_ruleCell6427); 

            	            createLeafNode(grammarAccess.getCellAccess().getTextKeyword_4_0_0(), null); 
            	        
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3420:1: ( (lv_text_6_0= ruleScalarExpression ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3421:1: (lv_text_6_0= ruleScalarExpression )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3421:1: (lv_text_6_0= ruleScalarExpression )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3422:3: lv_text_6_0= ruleScalarExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCellAccess().getTextScalarExpressionParserRuleCall_4_0_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleScalarExpression_in_ruleCell6448);
            	    lv_text_6_0=ruleScalarExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCellRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"text",
            	    	        		lv_text_6_0, 
            	    	        		"ScalarExpression", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCellAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3451:4: ({...}? => ( ( 'detailText:' ( (lv_detailText_8_0= ruleScalarExpression ) ) ) ) )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3451:4: ({...}? => ( ( 'detailText:' ( (lv_detailText_8_0= ruleScalarExpression ) ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3452:5: {...}? => ( ( 'detailText:' ( (lv_detailText_8_0= ruleScalarExpression ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCell", "getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3452:101: ( ( 'detailText:' ( (lv_detailText_8_0= ruleScalarExpression ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3453:6: ( 'detailText:' ( (lv_detailText_8_0= ruleScalarExpression ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCellAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3456:6: ( 'detailText:' ( (lv_detailText_8_0= ruleScalarExpression ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3456:8: 'detailText:' ( (lv_detailText_8_0= ruleScalarExpression ) )
            	    {
            	    match(input,52,FOLLOW_52_in_ruleCell6510); 

            	            createLeafNode(grammarAccess.getCellAccess().getDetailTextKeyword_4_1_0(), null); 
            	        
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3460:1: ( (lv_detailText_8_0= ruleScalarExpression ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3461:1: (lv_detailText_8_0= ruleScalarExpression )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3461:1: (lv_detailText_8_0= ruleScalarExpression )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3462:3: lv_detailText_8_0= ruleScalarExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCellAccess().getDetailTextScalarExpressionParserRuleCall_4_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleScalarExpression_in_ruleCell6531);
            	    lv_detailText_8_0=ruleScalarExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCellRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"detailText",
            	    	        		lv_detailText_8_0, 
            	    	        		"ScalarExpression", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCellAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3491:4: ({...}? => ( ( 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) ) )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3491:4: ({...}? => ( ( 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3492:5: {...}? => ( ( 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleCell", "getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3492:101: ( ( 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3493:6: ( 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCellAccess().getUnorderedGroup_4(), 2);
            	    	 				
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3496:6: ( 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3496:8: 'image:' ( (lv_image_10_0= ruleScalarExpression ) )
            	    {
            	    match(input,53,FOLLOW_53_in_ruleCell6593); 

            	            createLeafNode(grammarAccess.getCellAccess().getImageKeyword_4_2_0(), null); 
            	        
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3500:1: ( (lv_image_10_0= ruleScalarExpression ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3501:1: (lv_image_10_0= ruleScalarExpression )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3501:1: (lv_image_10_0= ruleScalarExpression )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3502:3: lv_image_10_0= ruleScalarExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCellAccess().getImageScalarExpressionParserRuleCall_4_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleScalarExpression_in_ruleCell6614);
            	    lv_image_10_0=ruleScalarExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCellRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"image",
            	    	        		lv_image_10_0, 
            	    	        		"ScalarExpression", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCellAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3531:4: ({...}? => ( ( 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) ) )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3531:4: ({...}? => ( ( 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3532:5: {...}? => ( ( 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleCell", "getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3532:101: ( ( 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3533:6: ( 'action:' ( (lv_action_12_0= ruleViewAction ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCellAccess().getUnorderedGroup_4(), 3);
            	    	 				
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3536:6: ( 'action:' ( (lv_action_12_0= ruleViewAction ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3536:8: 'action:' ( (lv_action_12_0= ruleViewAction ) )
            	    {
            	    match(input,54,FOLLOW_54_in_ruleCell6676); 

            	            createLeafNode(grammarAccess.getCellAccess().getActionKeyword_4_3_0(), null); 
            	        
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3540:1: ( (lv_action_12_0= ruleViewAction ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3541:1: (lv_action_12_0= ruleViewAction )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3541:1: (lv_action_12_0= ruleViewAction )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3542:3: lv_action_12_0= ruleViewAction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCellAccess().getActionViewActionParserRuleCall_4_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleViewAction_in_ruleCell6697);
            	    lv_action_12_0=ruleViewAction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCellRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"action",
            	    	        		lv_action_12_0, 
            	    	        		"ViewAction", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCellAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3571:4: ({...}? => ( ( 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) ) )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3571:4: ({...}? => ( ( 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3572:5: {...}? => ( ( 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleCell", "getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3572:101: ( ( 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3573:6: ( 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCellAccess().getUnorderedGroup_4(), 4);
            	    	 				
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3576:6: ( 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3576:8: 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) )
            	    {
            	    match(input,55,FOLLOW_55_in_ruleCell6759); 

            	            createLeafNode(grammarAccess.getCellAccess().getAccessoryKeyword_4_4_0(), null); 
            	        
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3580:1: ( (lv_accessory_14_0= ruleCellAccessory ) )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3581:1: (lv_accessory_14_0= ruleCellAccessory )
            	    {
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3581:1: (lv_accessory_14_0= ruleCellAccessory )
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3582:3: lv_accessory_14_0= ruleCellAccessory
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCellAccess().getAccessoryCellAccessoryEnumRuleCall_4_4_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleCellAccessory_in_ruleCell6780);
            	    lv_accessory_14_0=ruleCellAccessory();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCellRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"accessory",
            	    	        		lv_accessory_14_0, 
            	    	        		"CellAccessory", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCellAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getCellAccess().getUnorderedGroup_4());
            	

            }

            match(input,15,FOLLOW_15_in_ruleCell6830); 

                    createLeafNode(grammarAccess.getCellAccess().getRightCurlyBracketKeyword_5(), null); 
                

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3630:1: entryRuleCustomView returns [EObject current=null] : iv_ruleCustomView= ruleCustomView EOF ;
    public final EObject entryRuleCustomView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomView = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3631:2: (iv_ruleCustomView= ruleCustomView EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3632:2: iv_ruleCustomView= ruleCustomView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCustomViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleCustomView_in_entryRuleCustomView6866);
            iv_ruleCustomView=ruleCustomView();
            _fsp--;

             current =iv_ruleCustomView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomView6876); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3639:1: ruleCustomView returns [EObject current=null] : ( 'customview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) ( (lv_projectClass_3_0= ruleProjectClass ) ) ) ;
    public final EObject ruleCustomView() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_projectClass_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3644:6: ( ( 'customview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) ( (lv_projectClass_3_0= ruleProjectClass ) ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3645:1: ( 'customview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) ( (lv_projectClass_3_0= ruleProjectClass ) ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3645:1: ( 'customview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) ( (lv_projectClass_3_0= ruleProjectClass ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3645:3: 'customview' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterDefinitions ) ) ( (lv_projectClass_3_0= ruleProjectClass ) )
            {
            match(input,56,FOLLOW_56_in_ruleCustomView6911); 

                    createLeafNode(grammarAccess.getCustomViewAccess().getCustomviewKeyword_0(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3649:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3650:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3650:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3651:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomView6928); 

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

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3673:2: ( (lv_parameters_2_0= ruleParameterDefinitions ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3674:1: (lv_parameters_2_0= ruleParameterDefinitions )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3674:1: (lv_parameters_2_0= ruleParameterDefinitions )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3675:3: lv_parameters_2_0= ruleParameterDefinitions
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCustomViewAccess().getParametersParameterDefinitionsParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleParameterDefinitions_in_ruleCustomView6954);
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

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3697:2: ( (lv_projectClass_3_0= ruleProjectClass ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3698:1: (lv_projectClass_3_0= ruleProjectClass )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3698:1: (lv_projectClass_3_0= ruleProjectClass )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3699:3: lv_projectClass_3_0= ruleProjectClass
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCustomViewAccess().getProjectClassProjectClassParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleProjectClass_in_ruleCustomView6975);
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


    // $ANTLR start entryRuleViewAction
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3729:1: entryRuleViewAction returns [EObject current=null] : iv_ruleViewAction= ruleViewAction EOF ;
    public final EObject entryRuleViewAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewAction = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3730:2: (iv_ruleViewAction= ruleViewAction EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3731:2: iv_ruleViewAction= ruleViewAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getViewActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleViewAction_in_entryRuleViewAction7011);
            iv_ruleViewAction=ruleViewAction();
            _fsp--;

             current =iv_ruleViewAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewAction7021); 

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
    // $ANTLR end entryRuleViewAction


    // $ANTLR start ruleViewAction
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3738:1: ruleViewAction returns [EObject current=null] : (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen | this_Selector_2= ruleSelector ) ;
    public final EObject ruleViewAction() throws RecognitionException {
        EObject current = null;

        EObject this_ViewCall_0 = null;

        EObject this_ExternalOpen_1 = null;

        EObject this_Selector_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3743:6: ( (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen | this_Selector_2= ruleSelector ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3744:1: (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen | this_Selector_2= ruleSelector )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3744:1: (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen | this_Selector_2= ruleSelector )
            int alt39=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==EOF||LA39_1==15||LA39_1==22||(LA39_1>=51 && LA39_1<=55)) ) {
                    alt39=2;
                }
                else if ( (LA39_1==23) ) {
                    alt39=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("3744:1: (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen | this_Selector_2= ruleSelector )", 39, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case 23:
            case 25:
            case 27:
            case 28:
            case 40:
                {
                alt39=2;
                }
                break;
            case 57:
                {
                alt39=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3744:1: (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen | this_Selector_2= ruleSelector )", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3745:5: this_ViewCall_0= ruleViewCall
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getViewActionAccess().getViewCallParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleViewCall_in_ruleViewAction7068);
                    this_ViewCall_0=ruleViewCall();
                    _fsp--;

                     
                            current = this_ViewCall_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3755:5: this_ExternalOpen_1= ruleExternalOpen
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getViewActionAccess().getExternalOpenParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExternalOpen_in_ruleViewAction7095);
                    this_ExternalOpen_1=ruleExternalOpen();
                    _fsp--;

                     
                            current = this_ExternalOpen_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3765:5: this_Selector_2= ruleSelector
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getViewActionAccess().getSelectorParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSelector_in_ruleViewAction7122);
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
    // $ANTLR end ruleViewAction


    // $ANTLR start entryRuleViewCall
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3781:1: entryRuleViewCall returns [EObject current=null] : iv_ruleViewCall= ruleViewCall EOF ;
    public final EObject entryRuleViewCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewCall = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3782:2: (iv_ruleViewCall= ruleViewCall EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3783:2: iv_ruleViewCall= ruleViewCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getViewCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleViewCall_in_entryRuleViewCall7157);
            iv_ruleViewCall=ruleViewCall();
            _fsp--;

             current =iv_ruleViewCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewCall7167); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3790:1: ruleViewCall returns [EObject current=null] : ( ( ( RULE_ID ) ) ( (lv_parameters_1_0= ruleParameterValues ) ) ) ;
    public final EObject ruleViewCall() throws RecognitionException {
        EObject current = null;

        EObject lv_parameters_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3795:6: ( ( ( ( RULE_ID ) ) ( (lv_parameters_1_0= ruleParameterValues ) ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3796:1: ( ( ( RULE_ID ) ) ( (lv_parameters_1_0= ruleParameterValues ) ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3796:1: ( ( ( RULE_ID ) ) ( (lv_parameters_1_0= ruleParameterValues ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3796:2: ( ( RULE_ID ) ) ( (lv_parameters_1_0= ruleParameterValues ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3796:2: ( ( RULE_ID ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3797:1: ( RULE_ID )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3797:1: ( RULE_ID )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3798:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getViewCallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleViewCall7210); 

            		createLeafNode(grammarAccess.getViewCallAccess().getTargetViewCrossReference_0_0(), "target"); 
            	

            }


            }

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3810:2: ( (lv_parameters_1_0= ruleParameterValues ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3811:1: (lv_parameters_1_0= ruleParameterValues )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3811:1: (lv_parameters_1_0= ruleParameterValues )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3812:3: lv_parameters_1_0= ruleParameterValues
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getViewCallAccess().getParametersParameterValuesParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleParameterValues_in_ruleViewCall7231);
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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3842:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3843:2: (iv_ruleSelector= ruleSelector EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3844:2: iv_ruleSelector= ruleSelector EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSelectorRule(), currentNode); 
            pushFollow(FOLLOW_ruleSelector_in_entryRuleSelector7267);
            iv_ruleSelector=ruleSelector();
            _fsp--;

             current =iv_ruleSelector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelector7277); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3851:1: ruleSelector returns [EObject current=null] : ( '@selector' '(' ( (lv_name_2_0= ruleSelectorName ) ) ')' ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3856:6: ( ( '@selector' '(' ( (lv_name_2_0= ruleSelectorName ) ) ')' ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3857:1: ( '@selector' '(' ( (lv_name_2_0= ruleSelectorName ) ) ')' )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3857:1: ( '@selector' '(' ( (lv_name_2_0= ruleSelectorName ) ) ')' )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3857:3: '@selector' '(' ( (lv_name_2_0= ruleSelectorName ) ) ')'
            {
            match(input,57,FOLLOW_57_in_ruleSelector7312); 

                    createLeafNode(grammarAccess.getSelectorAccess().getSelectorKeyword_0(), null); 
                
            match(input,23,FOLLOW_23_in_ruleSelector7322); 

                    createLeafNode(grammarAccess.getSelectorAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3865:1: ( (lv_name_2_0= ruleSelectorName ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3866:1: (lv_name_2_0= ruleSelectorName )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3866:1: (lv_name_2_0= ruleSelectorName )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3867:3: lv_name_2_0= ruleSelectorName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSelectorAccess().getNameSelectorNameParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSelectorName_in_ruleSelector7343);
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

            match(input,24,FOLLOW_24_in_ruleSelector7353); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3901:1: entryRuleSelectorName returns [String current=null] : iv_ruleSelectorName= ruleSelectorName EOF ;
    public final String entryRuleSelectorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSelectorName = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3902:2: (iv_ruleSelectorName= ruleSelectorName EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3903:2: iv_ruleSelectorName= ruleSelectorName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSelectorNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleSelectorName_in_entryRuleSelectorName7390);
            iv_ruleSelectorName=ruleSelectorName();
            _fsp--;

             current =iv_ruleSelectorName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectorName7401); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3910:1: ruleSelectorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* (kw= ':' )? ) ;
    public final AntlrDatatypeRuleToken ruleSelectorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3915:6: ( (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* (kw= ':' )? ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3916:1: (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* (kw= ':' )? )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3916:1: (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* (kw= ':' )? )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3916:6: this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* (kw= ':' )?
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelectorName7441); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getSelectorNameAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3923:1: (kw= ':' this_ID_2= RULE_ID )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==58) ) {
                    int LA40_1 = input.LA(2);

                    if ( (LA40_1==RULE_ID) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3924:2: kw= ':' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,58,FOLLOW_58_in_ruleSelectorName7460); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getSelectorNameAccess().getColonKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelectorName7475); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getSelectorNameAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3936:3: (kw= ':' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==58) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3937:2: kw= ':'
                    {
                    kw=(Token)input.LT(1);
                    match(input,58,FOLLOW_58_in_ruleSelectorName7496); 

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


    // $ANTLR start entryRuleExternalOpen
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3950:1: entryRuleExternalOpen returns [EObject current=null] : iv_ruleExternalOpen= ruleExternalOpen EOF ;
    public final EObject entryRuleExternalOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalOpen = null;


        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3951:2: (iv_ruleExternalOpen= ruleExternalOpen EOF )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3952:2: iv_ruleExternalOpen= ruleExternalOpen EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExternalOpenRule(), currentNode); 
            pushFollow(FOLLOW_ruleExternalOpen_in_entryRuleExternalOpen7538);
            iv_ruleExternalOpen=ruleExternalOpen();
            _fsp--;

             current =iv_ruleExternalOpen; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalOpen7548); 

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
    // $ANTLR end entryRuleExternalOpen


    // $ANTLR start ruleExternalOpen
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3959:1: ruleExternalOpen returns [EObject current=null] : ( (lv_url_0_0= ruleScalarExpression ) ) ;
    public final EObject ruleExternalOpen() throws RecognitionException {
        EObject current = null;

        EObject lv_url_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3964:6: ( ( (lv_url_0_0= ruleScalarExpression ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3965:1: ( (lv_url_0_0= ruleScalarExpression ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3965:1: ( (lv_url_0_0= ruleScalarExpression ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3966:1: (lv_url_0_0= ruleScalarExpression )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3966:1: (lv_url_0_0= ruleScalarExpression )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3967:3: lv_url_0_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getExternalOpenAccess().getUrlScalarExpressionParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleExternalOpen7593);
            lv_url_0_0=ruleScalarExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getExternalOpenRule().getType().getClassifier());
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
    // $ANTLR end ruleExternalOpen


    // $ANTLR start ruleSerializationFormat
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:3997:1: ruleSerializationFormat returns [Enumerator current=null] : ( ( 'XML' ) | ( 'JSON' ) ) ;
    public final Enumerator ruleSerializationFormat() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4001:6: ( ( ( 'XML' ) | ( 'JSON' ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4002:1: ( ( 'XML' ) | ( 'JSON' ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4002:1: ( ( 'XML' ) | ( 'JSON' ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==59) ) {
                alt42=1;
            }
            else if ( (LA42_0==60) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4002:1: ( ( 'XML' ) | ( 'JSON' ) )", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4002:2: ( 'XML' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4002:2: ( 'XML' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4002:4: 'XML'
                    {
                    match(input,59,FOLLOW_59_in_ruleSerializationFormat7640); 

                            current = grammarAccess.getSerializationFormatAccess().getXMLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getSerializationFormatAccess().getXMLEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4008:6: ( 'JSON' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4008:6: ( 'JSON' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4008:8: 'JSON'
                    {
                    match(input,60,FOLLOW_60_in_ruleSerializationFormat7655); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4018:1: ruleTableViewStyle returns [Enumerator current=null] : ( ( 'Plain' ) | ( 'Grouped' ) ) ;
    public final Enumerator ruleTableViewStyle() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4022:6: ( ( ( 'Plain' ) | ( 'Grouped' ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4023:1: ( ( 'Plain' ) | ( 'Grouped' ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4023:1: ( ( 'Plain' ) | ( 'Grouped' ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==61) ) {
                alt43=1;
            }
            else if ( (LA43_0==62) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4023:1: ( ( 'Plain' ) | ( 'Grouped' ) )", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4023:2: ( 'Plain' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4023:2: ( 'Plain' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4023:4: 'Plain'
                    {
                    match(input,61,FOLLOW_61_in_ruleTableViewStyle7698); 

                            current = grammarAccess.getTableViewStyleAccess().getPlainEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTableViewStyleAccess().getPlainEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4029:6: ( 'Grouped' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4029:6: ( 'Grouped' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4029:8: 'Grouped'
                    {
                    match(input,62,FOLLOW_62_in_ruleTableViewStyle7713); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4039:1: ruleCellType returns [Enumerator current=null] : ( ( 'Default' ) | ( 'Value1' ) | ( 'Value2' ) | ( 'Subtitle' ) ) ;
    public final Enumerator ruleCellType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4043:6: ( ( ( 'Default' ) | ( 'Value1' ) | ( 'Value2' ) | ( 'Subtitle' ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4044:1: ( ( 'Default' ) | ( 'Value1' ) | ( 'Value2' ) | ( 'Subtitle' ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4044:1: ( ( 'Default' ) | ( 'Value1' ) | ( 'Value2' ) | ( 'Subtitle' ) )
            int alt44=4;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt44=1;
                }
                break;
            case 64:
                {
                alt44=2;
                }
                break;
            case 65:
                {
                alt44=3;
                }
                break;
            case 66:
                {
                alt44=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("4044:1: ( ( 'Default' ) | ( 'Value1' ) | ( 'Value2' ) | ( 'Subtitle' ) )", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4044:2: ( 'Default' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4044:2: ( 'Default' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4044:4: 'Default'
                    {
                    match(input,63,FOLLOW_63_in_ruleCellType7756); 

                            current = grammarAccess.getCellTypeAccess().getDefaultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellTypeAccess().getDefaultEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4050:6: ( 'Value1' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4050:6: ( 'Value1' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4050:8: 'Value1'
                    {
                    match(input,64,FOLLOW_64_in_ruleCellType7771); 

                            current = grammarAccess.getCellTypeAccess().getValue1EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellTypeAccess().getValue1EnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4056:6: ( 'Value2' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4056:6: ( 'Value2' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4056:8: 'Value2'
                    {
                    match(input,65,FOLLOW_65_in_ruleCellType7786); 

                            current = grammarAccess.getCellTypeAccess().getValue2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellTypeAccess().getValue2EnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4062:6: ( 'Subtitle' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4062:6: ( 'Subtitle' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4062:8: 'Subtitle'
                    {
                    match(input,66,FOLLOW_66_in_ruleCellType7801); 

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
    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4072:1: ruleCellAccessory returns [Enumerator current=null] : ( ( 'None' ) | ( 'Link' ) | ( 'Detail' ) | ( 'Check' ) ) ;
    public final Enumerator ruleCellAccessory() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4076:6: ( ( ( 'None' ) | ( 'Link' ) | ( 'Detail' ) | ( 'Check' ) ) )
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4077:1: ( ( 'None' ) | ( 'Link' ) | ( 'Detail' ) | ( 'Check' ) )
            {
            // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4077:1: ( ( 'None' ) | ( 'Link' ) | ( 'Detail' ) | ( 'Check' ) )
            int alt45=4;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt45=1;
                }
                break;
            case 68:
                {
                alt45=2;
                }
                break;
            case 69:
                {
                alt45=3;
                }
                break;
            case 70:
                {
                alt45=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("4077:1: ( ( 'None' ) | ( 'Link' ) | ( 'Detail' ) | ( 'Check' ) )", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4077:2: ( 'None' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4077:2: ( 'None' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4077:4: 'None'
                    {
                    match(input,67,FOLLOW_67_in_ruleCellAccessory7844); 

                            current = grammarAccess.getCellAccessoryAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellAccessoryAccess().getNoneEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4083:6: ( 'Link' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4083:6: ( 'Link' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4083:8: 'Link'
                    {
                    match(input,68,FOLLOW_68_in_ruleCellAccessory7859); 

                            current = grammarAccess.getCellAccessoryAccess().getLinkEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellAccessoryAccess().getLinkEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4089:6: ( 'Detail' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4089:6: ( 'Detail' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4089:8: 'Detail'
                    {
                    match(input,69,FOLLOW_69_in_ruleCellAccessory7874); 

                            current = grammarAccess.getCellAccessoryAccess().getDetailEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellAccessoryAccess().getDetailEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4095:6: ( 'Check' )
                    {
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4095:6: ( 'Check' )
                    // ../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g:4095:8: 'Check'
                    {
                    match(input,70,FOLLOW_70_in_ruleCellAccessory7889); 

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
    public static final BitSet FOLLOW_ruleApplication_in_ruleModel131 = new BitSet(new long[]{0x0100440400050002L});
    public static final BitSet FOLLOW_ruleModelElement_in_ruleModel152 = new BitSet(new long[]{0x0100440400050002L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleApplication234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplication251 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleApplication266 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleApplication319 = new BitSet(new long[]{0x000001001A800030L});
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
    public static final BitSet FOLLOW_ruleContentProviderCall_in_ruleScalarExpression2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_in_ruleScalarExpression2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_entryRuleStringFunction2373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringFunction2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleStringFunction2428 = new BitSet(new long[]{0x000001001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction2449 = new BitSet(new long[]{0x000001001B800030L});
    public static final BitSet FOLLOW_24_in_ruleStringFunction2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleStringFunction2487 = new BitSet(new long[]{0x000001001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction2508 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleStringFunction2518 = new BitSet(new long[]{0x000001001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction2539 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleStringFunction2549 = new BitSet(new long[]{0x000001001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction2570 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleStringFunction2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleStringFunction2607 = new BitSet(new long[]{0x000001001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction2628 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleStringFunction2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_in_entryRuleBinding2675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinding2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBinding2720 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleObjectReference_in_ruleBinding2741 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleBinding2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageExpression_in_entryRuleImageExpression2787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageExpression2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleImageExpression2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression2877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionExpression2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_ruleCollectionExpression2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_ruleCollectionExpression2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_ruleCollectionExpression2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentProviderCall_in_ruleCollectionExpression3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_entryRuleCollectionLiteral3050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteral3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCollectionLiteral3095 = new BitSet(new long[]{0x000001001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCollectionLiteral3116 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_26_in_ruleCollectionLiteral3127 = new BitSet(new long[]{0x000001001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCollectionLiteral3148 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_30_in_ruleCollectionLiteral3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_entryRuleCollectionFunction3196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionFunction3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCollectionFunction3250 = new BitSet(new long[]{0x000001001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCollectionFunction3271 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleCollectionFunction3281 = new BitSet(new long[]{0x000001001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCollectionFunction3302 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCollectionFunction3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionIterator_in_entryRuleCollectionIterator3348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionIterator3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCollectionIterator3393 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollectionIterator3410 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleCollectionIterator3425 = new BitSet(new long[]{0x00000100A0000010L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_ruleCollectionIterator3446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter3482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleParameter3538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterizedModelElement_in_entryRuleParameterizedModelElement3596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterizedModelElement3606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_ruleParameterizedModelElement3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentProvider_in_ruleParameterizedModelElement3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDefinitions_in_entryRuleParameterDefinitions3717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDefinitions3727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleParameterDefinitions3772 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameterDefinitions3793 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_26_in_ruleParameterDefinitions3804 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameterDefinitions3825 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_24_in_ruleParameterDefinitions3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterValues_in_entryRuleParameterValues3875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterValues3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleParameterValues3929 = new BitSet(new long[]{0x00000100BB800030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParameterValues3951 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_26_in_ruleParameterValues3962 = new BitSet(new long[]{0x00000100BA800030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParameterValues3983 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_24_in_ruleParameterValues3997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentProvider_in_entryRuleContentProvider4033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentProvider4043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleContentProvider4078 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentProvider4095 = new BitSet(new long[]{0x0000001800800000L});
    public static final BitSet FOLLOW_ruleParameterDefinitions_in_ruleContentProvider4121 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_ruleContentProvider4132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_36_in_ruleContentProvider4156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentProvider4188 = new BitSet(new long[]{0x0000002000280002L});
    public static final BitSet FOLLOW_21_in_ruleContentProvider4206 = new BitSet(new long[]{0x0000002000080002L});
    public static final BitSet FOLLOW_ruleContentProviderImplementation_in_ruleContentProvider4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentProviderImplementation_in_entryRuleContentProviderImplementation4278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentProviderImplementation4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlContentProviderImplementation_in_ruleContentProviderImplementation4335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomContentProviderImplementation_in_ruleContentProviderImplementation4362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlContentProviderImplementation_in_entryRuleUrlContentProviderImplementation4397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUrlContentProviderImplementation4407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleUrlContentProviderImplementation4442 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_ruleSerializationFormat_in_ruleUrlContentProviderImplementation4463 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleUrlContentProviderImplementation4473 = new BitSet(new long[]{0x000001001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleUrlContentProviderImplementation4494 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleUrlContentProviderImplementation4505 = new BitSet(new long[]{0x000001001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleUrlContentProviderImplementation4526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomContentProviderImplementation_in_entryRuleCustomContentProviderImplementation4564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomContentProviderImplementation4574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectClass_in_ruleCustomContentProviderImplementation4619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentProviderCall_in_entryRuleContentProviderCall4654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentProviderCall4664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleContentProviderCall4699 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentProviderCall4717 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleParameterValues_in_ruleContentProviderCall4738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment4774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment4784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleAssignment4830 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment4847 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleAssignment4862 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ruleContentProviderCall_in_ruleAssignment4883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_entryRuleView4919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleView4929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabView_in_ruleView4976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableView_in_ruleView5003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomView_in_ruleView5030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabView_in_entryRuleTabView5065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabView5075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleTabView5110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTabView5127 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_ruleParameterDefinitions_in_ruleTabView5153 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTabView5163 = new BitSet(new long[]{0x0000080000008000L});
    public static final BitSet FOLLOW_ruleTab_in_ruleTabView5184 = new BitSet(new long[]{0x0000080000008000L});
    public static final BitSet FOLLOW_15_in_ruleTabView5195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTab_in_entryRuleTab5231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTab5241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleTab5276 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTab5286 = new BitSet(new long[]{0x0000300000004000L});
    public static final BitSet FOLLOW_44_in_ruleTab5339 = new BitSet(new long[]{0x000001001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleTab5360 = new BitSet(new long[]{0x000030000000C000L});
    public static final BitSet FOLLOW_45_in_ruleTab5422 = new BitSet(new long[]{0x000001001A800030L});
    public static final BitSet FOLLOW_ruleImageExpression_in_ruleTab5443 = new BitSet(new long[]{0x000030000000C000L});
    public static final BitSet FOLLOW_14_in_ruleTab5505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleViewCall_in_ruleTab5526 = new BitSet(new long[]{0x000030000000C000L});
    public static final BitSet FOLLOW_15_in_ruleTab5582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableView_in_entryRuleTableView5618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableView5628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleTableView5663 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTableView5680 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_ruleParameterDefinitions_in_ruleTableView5706 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTableView5716 = new BitSet(new long[]{0x0003900000008010L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleTableView5737 = new BitSet(new long[]{0x0003900000008010L});
    public static final BitSet FOLLOW_44_in_ruleTableView5791 = new BitSet(new long[]{0x000001001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleTableView5812 = new BitSet(new long[]{0x0003900000008000L});
    public static final BitSet FOLLOW_47_in_ruleTableView5874 = new BitSet(new long[]{0x000001001A800030L});
    public static final BitSet FOLLOW_ruleImageExpression_in_ruleTableView5895 = new BitSet(new long[]{0x0003900000008000L});
    public static final BitSet FOLLOW_48_in_ruleTableView5957 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_ruleTableViewStyle_in_ruleTableView5978 = new BitSet(new long[]{0x0003900000008000L});
    public static final BitSet FOLLOW_ruleSection_in_ruleTableView6039 = new BitSet(new long[]{0x0002000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTableView6050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_entryRuleSection6088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection6098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleSection6142 = new BitSet(new long[]{0x0000000100001000L});
    public static final BitSet FOLLOW_ruleCollectionIterator_in_ruleSection6163 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSection6174 = new BitSet(new long[]{0x0004100000008000L});
    public static final BitSet FOLLOW_44_in_ruleSection6185 = new BitSet(new long[]{0x000001001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleSection6206 = new BitSet(new long[]{0x0004000000008000L});
    public static final BitSet FOLLOW_ruleCell_in_ruleSection6229 = new BitSet(new long[]{0x0004000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSection6240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCell_in_entryRuleCell6276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCell6286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleCell6321 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleCellType_in_ruleCell6342 = new BitSet(new long[]{0x0000000100001000L});
    public static final BitSet FOLLOW_ruleCollectionIterator_in_ruleCell6363 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCell6374 = new BitSet(new long[]{0x00F8000000008000L});
    public static final BitSet FOLLOW_51_in_ruleCell6427 = new BitSet(new long[]{0x000001001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCell6448 = new BitSet(new long[]{0x00F8000000008000L});
    public static final BitSet FOLLOW_52_in_ruleCell6510 = new BitSet(new long[]{0x000001001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCell6531 = new BitSet(new long[]{0x00F8000000008000L});
    public static final BitSet FOLLOW_53_in_ruleCell6593 = new BitSet(new long[]{0x000001001A800030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCell6614 = new BitSet(new long[]{0x00F8000000008000L});
    public static final BitSet FOLLOW_54_in_ruleCell6676 = new BitSet(new long[]{0x020001001A800030L});
    public static final BitSet FOLLOW_ruleViewAction_in_ruleCell6697 = new BitSet(new long[]{0x00F8000000008000L});
    public static final BitSet FOLLOW_55_in_ruleCell6759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000078L});
    public static final BitSet FOLLOW_ruleCellAccessory_in_ruleCell6780 = new BitSet(new long[]{0x00F8000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCell6830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomView_in_entryRuleCustomView6866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomView6876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleCustomView6911 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomView6928 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_ruleParameterDefinitions_in_ruleCustomView6954 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleProjectClass_in_ruleCustomView6975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewAction_in_entryRuleViewAction7011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewAction7021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewCall_in_ruleViewAction7068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalOpen_in_ruleViewAction7095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_ruleViewAction7122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewCall_in_entryRuleViewCall7157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewCall7167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleViewCall7210 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleParameterValues_in_ruleViewCall7231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_entryRuleSelector7267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelector7277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleSelector7312 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSelector7322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSelectorName_in_ruleSelector7343 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSelector7353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectorName_in_entryRuleSelectorName7390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectorName7401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelectorName7441 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleSelectorName7460 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelectorName7475 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleSelectorName7496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalOpen_in_entryRuleExternalOpen7538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalOpen7548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleExternalOpen7593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleSerializationFormat7640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleSerializationFormat7655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleTableViewStyle7698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleTableViewStyle7713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleCellType7756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleCellType7771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleCellType7786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleCellType7801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleCellAccessory7844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleCellAccessory7859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleCellAccessory7874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleCellAccessory7889 = new BitSet(new long[]{0x0000000000000002L});

}
