/*
* generated by Xtext
*/
package org.applause.applausedsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.applause.applausedsl.services.ApplauseDslGrammarAccess;

public class ApplauseDslParser extends AbstractContentAssistParser {
	
	@Inject
	private ApplauseDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.applause.applausedsl.ui.contentassist.antlr.internal.InternalApplauseDslParser createParser() {
		org.applause.applausedsl.ui.contentassist.antlr.internal.InternalApplauseDslParser result = new org.applause.applausedsl.ui.contentassist.antlr.internal.InternalApplauseDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModelElementAccess().getAlternatives(), "rule__ModelElement__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getScopeNameAccess().getAlternatives(), "rule__ScopeName__Alternatives");
					put(grammarAccess.getTypedNameAccess().getAlternatives(), "rule__TypedName__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getScalarExpressionAccess().getAlternatives(), "rule__ScalarExpression__Alternatives");
					put(grammarAccess.getStringFunctionAccess().getAlternatives(), "rule__StringFunction__Alternatives");
					put(grammarAccess.getCollectionExpressionAccess().getAlternatives(), "rule__CollectionExpression__Alternatives");
					put(grammarAccess.getContentProviderAccess().getAlternatives_3(), "rule__ContentProvider__Alternatives_3");
					put(grammarAccess.getContentProviderImplementationAccess().getAlternatives(), "rule__ContentProviderImplementation__Alternatives");
					put(grammarAccess.getProviderConstructionAccess().getAlternatives(), "rule__ProviderConstruction__Alternatives");
					put(grammarAccess.getViewAccess().getAlternatives(), "rule__View__Alternatives");
					put(grammarAccess.getViewContentElementAccess().getAlternatives(), "rule__ViewContentElement__Alternatives");
					put(grammarAccess.getViewActionAccess().getAlternatives(), "rule__ViewAction__Alternatives");
					put(grammarAccess.getSerializationFormatAccess().getAlternatives(), "rule__SerializationFormat__Alternatives");
					put(grammarAccess.getTableViewStyleAccess().getAlternatives(), "rule__TableViewStyle__Alternatives");
					put(grammarAccess.getCellTypeAccess().getAlternatives(), "rule__CellType__Alternatives");
					put(grammarAccess.getCellAccessoryAccess().getAlternatives(), "rule__CellAccessory__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getApplicationAccess().getGroup(), "rule__Application__Group__0");
					put(grammarAccess.getApplicationAccess().getGroup_3_0(), "rule__Application__Group_3_0__0");
					put(grammarAccess.getApplicationAccess().getGroup_3_1(), "rule__Application__Group_3_1__0");
					put(grammarAccess.getSimpleTypeAccess().getGroup(), "rule__SimpleType__Group__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getEntityAccess().getGroup_3(), "rule__Entity__Group_3__0");
					put(grammarAccess.getTypeReferenceAccess().getGroup(), "rule__TypeReference__Group__0");
					put(grammarAccess.getProjectClassAccess().getGroup(), "rule__ProjectClass__Group__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
					put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
					put(grammarAccess.getObjectReferenceAccess().getGroup(), "rule__ObjectReference__Group__0");
					put(grammarAccess.getNestedObjectReferenceAccess().getGroup(), "rule__NestedObjectReference__Group__0");
					put(grammarAccess.getStringFunctionAccess().getGroup_0(), "rule__StringFunction__Group_0__0");
					put(grammarAccess.getStringFunctionAccess().getGroup_1(), "rule__StringFunction__Group_1__0");
					put(grammarAccess.getStringFunctionAccess().getGroup_2(), "rule__StringFunction__Group_2__0");
					put(grammarAccess.getCollectionLiteralAccess().getGroup(), "rule__CollectionLiteral__Group__0");
					put(grammarAccess.getCollectionLiteralAccess().getGroup_2(), "rule__CollectionLiteral__Group_2__0");
					put(grammarAccess.getCollectionFunctionAccess().getGroup(), "rule__CollectionFunction__Group__0");
					put(grammarAccess.getCollectionIteratorAccess().getGroup(), "rule__CollectionIterator__Group__0");
					put(grammarAccess.getContentProviderAccess().getGroup(), "rule__ContentProvider__Group__0");
					put(grammarAccess.getContentProviderAccess().getGroup_2(), "rule__ContentProvider__Group_2__0");
					put(grammarAccess.getUrlContentProviderImplementationAccess().getGroup(), "rule__UrlContentProviderImplementation__Group__0");
					put(grammarAccess.getUrlContentProviderImplementationAccess().getGroup_4(), "rule__UrlContentProviderImplementation__Group_4__0");
					put(grammarAccess.getProviderConstructionAccess().getGroup_0(), "rule__ProviderConstruction__Group_0__0");
					put(grammarAccess.getProviderConstructionAccess().getGroup_1(), "rule__ProviderConstruction__Group_1__0");
					put(grammarAccess.getTabViewAccess().getGroup(), "rule__TabView__Group__0");
					put(grammarAccess.getTabViewAccess().getGroup_2(), "rule__TabView__Group_2__0");
					put(grammarAccess.getTabAccess().getGroup(), "rule__Tab__Group__0");
					put(grammarAccess.getTabAccess().getGroup_2_0(), "rule__Tab__Group_2_0__0");
					put(grammarAccess.getTabAccess().getGroup_2_1(), "rule__Tab__Group_2_1__0");
					put(grammarAccess.getTabAccess().getGroup_2_2(), "rule__Tab__Group_2_2__0");
					put(grammarAccess.getTableViewAccess().getGroup(), "rule__TableView__Group__0");
					put(grammarAccess.getTableViewAccess().getGroup_2(), "rule__TableView__Group_2__0");
					put(grammarAccess.getTableViewAccess().getGroup_5_0(), "rule__TableView__Group_5_0__0");
					put(grammarAccess.getTableViewAccess().getGroup_5_1(), "rule__TableView__Group_5_1__0");
					put(grammarAccess.getTableViewAccess().getGroup_5_2(), "rule__TableView__Group_5_2__0");
					put(grammarAccess.getSectionAccess().getGroup(), "rule__Section__Group__0");
					put(grammarAccess.getSectionAccess().getGroup_4(), "rule__Section__Group_4__0");
					put(grammarAccess.getCellAccess().getGroup(), "rule__Cell__Group__0");
					put(grammarAccess.getCellAccess().getGroup_4_0(), "rule__Cell__Group_4_0__0");
					put(grammarAccess.getCellAccess().getGroup_4_1(), "rule__Cell__Group_4_1__0");
					put(grammarAccess.getCellAccess().getGroup_4_2(), "rule__Cell__Group_4_2__0");
					put(grammarAccess.getCellAccess().getGroup_4_3(), "rule__Cell__Group_4_3__0");
					put(grammarAccess.getCellAccess().getGroup_4_4(), "rule__Cell__Group_4_4__0");
					put(grammarAccess.getCustomViewAccess().getGroup(), "rule__CustomView__Group__0");
					put(grammarAccess.getCustomViewAccess().getGroup_2(), "rule__CustomView__Group_2__0");
					put(grammarAccess.getViewCallAccess().getGroup(), "rule__ViewCall__Group__0");
					put(grammarAccess.getSelectorAccess().getGroup(), "rule__Selector__Group__0");
					put(grammarAccess.getSelectorNameAccess().getGroup(), "rule__SelectorName__Group__0");
					put(grammarAccess.getSelectorNameAccess().getGroup_1(), "rule__SelectorName__Group_1__0");
					put(grammarAccess.getModelAccess().getApplicationAssignment_0(), "rule__Model__ApplicationAssignment_0");
					put(grammarAccess.getModelAccess().getElementsAssignment_1(), "rule__Model__ElementsAssignment_1");
					put(grammarAccess.getApplicationAccess().getNameAssignment_1(), "rule__Application__NameAssignment_1");
					put(grammarAccess.getApplicationAccess().getBackgroundAssignment_3_0_1(), "rule__Application__BackgroundAssignment_3_0_1");
					put(grammarAccess.getApplicationAccess().getStartViewAssignment_3_1_1(), "rule__Application__StartViewAssignment_3_1_1");
					put(grammarAccess.getSimpleTypeAccess().getNameAssignment_1(), "rule__SimpleType__NameAssignment_1");
					put(grammarAccess.getSimpleTypeAccess().getPlatformTypeAssignment_3(), "rule__SimpleType__PlatformTypeAssignment_3");
					put(grammarAccess.getEntityAccess().getRuntimeTypeAssignment_1(), "rule__Entity__RuntimeTypeAssignment_1");
					put(grammarAccess.getEntityAccess().getNameAssignment_2(), "rule__Entity__NameAssignment_2");
					put(grammarAccess.getEntityAccess().getExtendsAssignment_3_1(), "rule__Entity__ExtendsAssignment_3_1");
					put(grammarAccess.getEntityAccess().getPropertiesAssignment_5(), "rule__Entity__PropertiesAssignment_5");
					put(grammarAccess.getTypeReferenceAccess().getTypeAssignment_0(), "rule__TypeReference__TypeAssignment_0");
					put(grammarAccess.getTypeReferenceAccess().getManyAssignment_1(), "rule__TypeReference__ManyAssignment_1");
					put(grammarAccess.getProjectClassAccess().getNameAssignment_1(), "rule__ProjectClass__NameAssignment_1");
					put(grammarAccess.getParameterAccess().getTypeRefAssignment_0(), "rule__Parameter__TypeRefAssignment_0");
					put(grammarAccess.getParameterAccess().getNameAssignment_1(), "rule__Parameter__NameAssignment_1");
					put(grammarAccess.getPropertyAccess().getTypeRefAssignment_0(), "rule__Property__TypeRefAssignment_0");
					put(grammarAccess.getPropertyAccess().getNameAssignment_1(), "rule__Property__NameAssignment_1");
					put(grammarAccess.getAssignmentAccess().getTypeRefAssignment_0(), "rule__Assignment__TypeRefAssignment_0");
					put(grammarAccess.getAssignmentAccess().getNameAssignment_1(), "rule__Assignment__NameAssignment_1");
					put(grammarAccess.getAssignmentAccess().getValueAssignment_3(), "rule__Assignment__ValueAssignment_3");
					put(grammarAccess.getObjectReferenceAccess().getObjectAssignment_0(), "rule__ObjectReference__ObjectAssignment_0");
					put(grammarAccess.getObjectReferenceAccess().getTailAssignment_1(), "rule__ObjectReference__TailAssignment_1");
					put(grammarAccess.getNestedObjectReferenceAccess().getObjectAssignment_1(), "rule__NestedObjectReference__ObjectAssignment_1");
					put(grammarAccess.getNestedObjectReferenceAccess().getTailAssignment_2(), "rule__NestedObjectReference__TailAssignment_2");
					put(grammarAccess.getStringLiteralAccess().getValueAssignment(), "rule__StringLiteral__ValueAssignment");
					put(grammarAccess.getStringFunctionAccess().getValuesAssignment_0_2(), "rule__StringFunction__ValuesAssignment_0_2");
					put(grammarAccess.getStringFunctionAccess().getValueAssignment_1_2(), "rule__StringFunction__ValueAssignment_1_2");
					put(grammarAccess.getStringFunctionAccess().getMatchAssignment_1_4(), "rule__StringFunction__MatchAssignment_1_4");
					put(grammarAccess.getStringFunctionAccess().getReplacementAssignment_1_6(), "rule__StringFunction__ReplacementAssignment_1_6");
					put(grammarAccess.getStringFunctionAccess().getValueAssignment_2_2(), "rule__StringFunction__ValueAssignment_2_2");
					put(grammarAccess.getCollectionLiteralAccess().getItemsAssignment_1(), "rule__CollectionLiteral__ItemsAssignment_1");
					put(grammarAccess.getCollectionLiteralAccess().getItemsAssignment_2_1(), "rule__CollectionLiteral__ItemsAssignment_2_1");
					put(grammarAccess.getCollectionFunctionAccess().getValueAssignment_2(), "rule__CollectionFunction__ValueAssignment_2");
					put(grammarAccess.getCollectionFunctionAccess().getDelimiterAssignment_4(), "rule__CollectionFunction__DelimiterAssignment_4");
					put(grammarAccess.getCollectionIteratorAccess().getNameAssignment_1(), "rule__CollectionIterator__NameAssignment_1");
					put(grammarAccess.getCollectionIteratorAccess().getCollectionAssignment_3(), "rule__CollectionIterator__CollectionAssignment_3");
					put(grammarAccess.getContentProviderAccess().getNameAssignment_1(), "rule__ContentProvider__NameAssignment_1");
					put(grammarAccess.getContentProviderAccess().getParameterAssignment_2_1(), "rule__ContentProvider__ParameterAssignment_2_1");
					put(grammarAccess.getContentProviderAccess().getStoringAssignment_3_1(), "rule__ContentProvider__StoringAssignment_3_1");
					put(grammarAccess.getContentProviderAccess().getTypeAssignment_4(), "rule__ContentProvider__TypeAssignment_4");
					put(grammarAccess.getContentProviderAccess().getManyAssignment_5(), "rule__ContentProvider__ManyAssignment_5");
					put(grammarAccess.getContentProviderAccess().getImplementationAssignment_6(), "rule__ContentProvider__ImplementationAssignment_6");
					put(grammarAccess.getUrlContentProviderImplementationAccess().getFormatAssignment_1(), "rule__UrlContentProviderImplementation__FormatAssignment_1");
					put(grammarAccess.getUrlContentProviderImplementationAccess().getUrlAssignment_3(), "rule__UrlContentProviderImplementation__UrlAssignment_3");
					put(grammarAccess.getUrlContentProviderImplementationAccess().getSelectionAssignment_4_1(), "rule__UrlContentProviderImplementation__SelectionAssignment_4_1");
					put(grammarAccess.getCustomContentProviderImplementationAccess().getProviderClassAssignment(), "rule__CustomContentProviderImplementation__ProviderClassAssignment");
					put(grammarAccess.getProviderConstructionAccess().getProviderAssignment_0_1(), "rule__ProviderConstruction__ProviderAssignment_0_1");
					put(grammarAccess.getProviderConstructionAccess().getArgumentAssignment_0_3(), "rule__ProviderConstruction__ArgumentAssignment_0_3");
					put(grammarAccess.getProviderConstructionAccess().getExpressionAssignment_1_1(), "rule__ProviderConstruction__ExpressionAssignment_1_1");
					put(grammarAccess.getTabViewAccess().getNameAssignment_1(), "rule__TabView__NameAssignment_1");
					put(grammarAccess.getTabViewAccess().getContentAssignment_2_1(), "rule__TabView__ContentAssignment_2_1");
					put(grammarAccess.getTabViewAccess().getTabsAssignment_4(), "rule__TabView__TabsAssignment_4");
					put(grammarAccess.getTabAccess().getTitleAssignment_2_0_1(), "rule__Tab__TitleAssignment_2_0_1");
					put(grammarAccess.getTabAccess().getIconAssignment_2_1_1(), "rule__Tab__IconAssignment_2_1_1");
					put(grammarAccess.getTabAccess().getViewAssignment_2_2_1(), "rule__Tab__ViewAssignment_2_2_1");
					put(grammarAccess.getTableViewAccess().getNameAssignment_1(), "rule__TableView__NameAssignment_1");
					put(grammarAccess.getTableViewAccess().getContentAssignment_2_1(), "rule__TableView__ContentAssignment_2_1");
					put(grammarAccess.getTableViewAccess().getVariablesAssignment_4(), "rule__TableView__VariablesAssignment_4");
					put(grammarAccess.getTableViewAccess().getTitleAssignment_5_0_1(), "rule__TableView__TitleAssignment_5_0_1");
					put(grammarAccess.getTableViewAccess().getTitleImageAssignment_5_1_1(), "rule__TableView__TitleImageAssignment_5_1_1");
					put(grammarAccess.getTableViewAccess().getStyleAssignment_5_2_1(), "rule__TableView__StyleAssignment_5_2_1");
					put(grammarAccess.getTableViewAccess().getSectionsAssignment_6(), "rule__TableView__SectionsAssignment_6");
					put(grammarAccess.getSectionAccess().getIteratorAssignment_2(), "rule__Section__IteratorAssignment_2");
					put(grammarAccess.getSectionAccess().getTitleAssignment_4_1(), "rule__Section__TitleAssignment_4_1");
					put(grammarAccess.getSectionAccess().getCellsAssignment_5(), "rule__Section__CellsAssignment_5");
					put(grammarAccess.getCellAccess().getTypeAssignment_1(), "rule__Cell__TypeAssignment_1");
					put(grammarAccess.getCellAccess().getIteratorAssignment_2(), "rule__Cell__IteratorAssignment_2");
					put(grammarAccess.getCellAccess().getTextAssignment_4_0_1(), "rule__Cell__TextAssignment_4_0_1");
					put(grammarAccess.getCellAccess().getDetailTextAssignment_4_1_1(), "rule__Cell__DetailTextAssignment_4_1_1");
					put(grammarAccess.getCellAccess().getImageAssignment_4_2_1(), "rule__Cell__ImageAssignment_4_2_1");
					put(grammarAccess.getCellAccess().getActionAssignment_4_3_1(), "rule__Cell__ActionAssignment_4_3_1");
					put(grammarAccess.getCellAccess().getAccessoryAssignment_4_4_1(), "rule__Cell__AccessoryAssignment_4_4_1");
					put(grammarAccess.getCustomViewAccess().getNameAssignment_1(), "rule__CustomView__NameAssignment_1");
					put(grammarAccess.getCustomViewAccess().getContentAssignment_2_1(), "rule__CustomView__ContentAssignment_2_1");
					put(grammarAccess.getCustomViewAccess().getProjectClassAssignment_3(), "rule__CustomView__ProjectClassAssignment_3");
					put(grammarAccess.getViewCallAccess().getViewAssignment_0(), "rule__ViewCall__ViewAssignment_0");
					put(grammarAccess.getViewCallAccess().getProviderAssignment_2(), "rule__ViewCall__ProviderAssignment_2");
					put(grammarAccess.getSelectorAccess().getNameAssignment_2(), "rule__Selector__NameAssignment_2");
					put(grammarAccess.getExternalOpenAccess().getUrlAssignment(), "rule__ExternalOpen__UrlAssignment");
					put(grammarAccess.getApplicationAccess().getUnorderedGroup_3(), "rule__Application__UnorderedGroup_3");
					put(grammarAccess.getTabAccess().getUnorderedGroup_2(), "rule__Tab__UnorderedGroup_2");
					put(grammarAccess.getTableViewAccess().getUnorderedGroup_5(), "rule__TableView__UnorderedGroup_5");
					put(grammarAccess.getCellAccess().getUnorderedGroup_4(), "rule__Cell__UnorderedGroup_4");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.applause.applausedsl.ui.contentassist.antlr.internal.InternalApplauseDslParser typedParser = (org.applause.applausedsl.ui.contentassist.antlr.internal.InternalApplauseDslParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ApplauseDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ApplauseDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
