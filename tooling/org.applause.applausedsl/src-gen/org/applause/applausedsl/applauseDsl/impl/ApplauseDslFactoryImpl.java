/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applausedsl.applauseDsl.impl;

import org.applause.applausedsl.applauseDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplauseDslFactoryImpl extends EFactoryImpl implements ApplauseDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ApplauseDslFactory init()
  {
    try
    {
      ApplauseDslFactory theApplauseDslFactory = (ApplauseDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.applause.org/applausedsl/ApplauseDsl"); 
      if (theApplauseDslFactory != null)
      {
        return theApplauseDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ApplauseDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplauseDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ApplauseDslPackage.MODEL: return createModel();
      case ApplauseDslPackage.APPLICATION: return createApplication();
      case ApplauseDslPackage.MODEL_ELEMENT: return createModelElement();
      case ApplauseDslPackage.TYPE: return createType();
      case ApplauseDslPackage.SIMPLE_TYPE: return createSimpleType();
      case ApplauseDslPackage.ENTITY: return createEntity();
      case ApplauseDslPackage.PROPERTY: return createProperty();
      case ApplauseDslPackage.TYPE_REFERENCE: return createTypeReference();
      case ApplauseDslPackage.PROJECT_CLASS: return createProjectClass();
      case ApplauseDslPackage.DECLARATION: return createDeclaration();
      case ApplauseDslPackage.NAMED: return createNamed();
      case ApplauseDslPackage.OBJECT_REFERENCE: return createObjectReference();
      case ApplauseDslPackage.EXPRESSION: return createExpression();
      case ApplauseDslPackage.SCALAR_EXPRESSION: return createScalarExpression();
      case ApplauseDslPackage.STRING_LITERAL: return createStringLiteral();
      case ApplauseDslPackage.STRING_FUNCTION: return createStringFunction();
      case ApplauseDslPackage.BINDING: return createBinding();
      case ApplauseDslPackage.COLLECTION_EXPRESSION: return createCollectionExpression();
      case ApplauseDslPackage.COLLECTION_LITERAL: return createCollectionLiteral();
      case ApplauseDslPackage.COLLECTION_FUNCTION: return createCollectionFunction();
      case ApplauseDslPackage.COLLECTION_ITERATOR: return createCollectionIterator();
      case ApplauseDslPackage.PARAMETER: return createParameter();
      case ApplauseDslPackage.PARAMETERIZED_MODEL_ELEMENT: return createParameterizedModelElement();
      case ApplauseDslPackage.PARAMETERIZED_CALL: return createParameterizedCall();
      case ApplauseDslPackage.PARAMETER_DEFINITIONS: return createParameterDefinitions();
      case ApplauseDslPackage.PARAMETER_VALUES: return createParameterValues();
      case ApplauseDslPackage.CONTENT_PROVIDER: return createContentProvider();
      case ApplauseDslPackage.CONTENT_PROVIDER_IMPLEMENTATION: return createContentProviderImplementation();
      case ApplauseDslPackage.URL_CONTENT_PROVIDER_IMPLEMENTATION: return createUrlContentProviderImplementation();
      case ApplauseDslPackage.CUSTOM_CONTENT_PROVIDER_IMPLEMENTATION: return createCustomContentProviderImplementation();
      case ApplauseDslPackage.CONTENT_PROVIDER_CALL: return createContentProviderCall();
      case ApplauseDslPackage.ASSIGNMENT: return createAssignment();
      case ApplauseDslPackage.VIEW: return createView();
      case ApplauseDslPackage.TAB_VIEW: return createTabView();
      case ApplauseDslPackage.TAB: return createTab();
      case ApplauseDslPackage.TABLE_VIEW: return createTableView();
      case ApplauseDslPackage.VIEW_CONTENT_ELEMENT: return createViewContentElement();
      case ApplauseDslPackage.SECTION: return createSection();
      case ApplauseDslPackage.CELL: return createCell();
      case ApplauseDslPackage.CUSTOM_VIEW: return createCustomView();
      case ApplauseDslPackage.ACTION: return createAction();
      case ApplauseDslPackage.VIEW_CALL: return createViewCall();
      case ApplauseDslPackage.SELECTOR: return createSelector();
      case ApplauseDslPackage.OPEN_URL: return createOpenURL();
      case ApplauseDslPackage.STRING_CONCAT: return createStringConcat();
      case ApplauseDslPackage.STRING_REPLACE: return createStringReplace();
      case ApplauseDslPackage.STRING_URL_CONFORM: return createStringUrlConform();
      case ApplauseDslPackage.STRING_SPLIT: return createStringSplit();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ApplauseDslPackage.SERIALIZATION_FORMAT:
        return createSerializationFormatFromString(eDataType, initialValue);
      case ApplauseDslPackage.TABLE_VIEW_STYLE:
        return createTableViewStyleFromString(eDataType, initialValue);
      case ApplauseDslPackage.CELL_TYPE:
        return createCellTypeFromString(eDataType, initialValue);
      case ApplauseDslPackage.CELL_ACCESSORY:
        return createCellAccessoryFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ApplauseDslPackage.SERIALIZATION_FORMAT:
        return convertSerializationFormatToString(eDataType, instanceValue);
      case ApplauseDslPackage.TABLE_VIEW_STYLE:
        return convertTableViewStyleToString(eDataType, instanceValue);
      case ApplauseDslPackage.CELL_TYPE:
        return convertCellTypeToString(eDataType, instanceValue);
      case ApplauseDslPackage.CELL_ACCESSORY:
        return convertCellAccessoryToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Application createApplication()
  {
    ApplicationImpl application = new ApplicationImpl();
    return application;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelElement createModelElement()
  {
    ModelElementImpl modelElement = new ModelElementImpl();
    return modelElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleType createSimpleType()
  {
    SimpleTypeImpl simpleType = new SimpleTypeImpl();
    return simpleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReference createTypeReference()
  {
    TypeReferenceImpl typeReference = new TypeReferenceImpl();
    return typeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectClass createProjectClass()
  {
    ProjectClassImpl projectClass = new ProjectClassImpl();
    return projectClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Named createNamed()
  {
    NamedImpl named = new NamedImpl();
    return named;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectReference createObjectReference()
  {
    ObjectReferenceImpl objectReference = new ObjectReferenceImpl();
    return objectReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScalarExpression createScalarExpression()
  {
    ScalarExpressionImpl scalarExpression = new ScalarExpressionImpl();
    return scalarExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringFunction createStringFunction()
  {
    StringFunctionImpl stringFunction = new StringFunctionImpl();
    return stringFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding createBinding()
  {
    BindingImpl binding = new BindingImpl();
    return binding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollectionExpression createCollectionExpression()
  {
    CollectionExpressionImpl collectionExpression = new CollectionExpressionImpl();
    return collectionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollectionLiteral createCollectionLiteral()
  {
    CollectionLiteralImpl collectionLiteral = new CollectionLiteralImpl();
    return collectionLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollectionFunction createCollectionFunction()
  {
    CollectionFunctionImpl collectionFunction = new CollectionFunctionImpl();
    return collectionFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollectionIterator createCollectionIterator()
  {
    CollectionIteratorImpl collectionIterator = new CollectionIteratorImpl();
    return collectionIterator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterizedModelElement createParameterizedModelElement()
  {
    ParameterizedModelElementImpl parameterizedModelElement = new ParameterizedModelElementImpl();
    return parameterizedModelElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterizedCall createParameterizedCall()
  {
    ParameterizedCallImpl parameterizedCall = new ParameterizedCallImpl();
    return parameterizedCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterDefinitions createParameterDefinitions()
  {
    ParameterDefinitionsImpl parameterDefinitions = new ParameterDefinitionsImpl();
    return parameterDefinitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterValues createParameterValues()
  {
    ParameterValuesImpl parameterValues = new ParameterValuesImpl();
    return parameterValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentProvider createContentProvider()
  {
    ContentProviderImpl contentProvider = new ContentProviderImpl();
    return contentProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentProviderImplementation createContentProviderImplementation()
  {
    ContentProviderImplementationImpl contentProviderImplementation = new ContentProviderImplementationImpl();
    return contentProviderImplementation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UrlContentProviderImplementation createUrlContentProviderImplementation()
  {
    UrlContentProviderImplementationImpl urlContentProviderImplementation = new UrlContentProviderImplementationImpl();
    return urlContentProviderImplementation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomContentProviderImplementation createCustomContentProviderImplementation()
  {
    CustomContentProviderImplementationImpl customContentProviderImplementation = new CustomContentProviderImplementationImpl();
    return customContentProviderImplementation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentProviderCall createContentProviderCall()
  {
    ContentProviderCallImpl contentProviderCall = new ContentProviderCallImpl();
    return contentProviderCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View createView()
  {
    ViewImpl view = new ViewImpl();
    return view;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TabView createTabView()
  {
    TabViewImpl tabView = new TabViewImpl();
    return tabView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tab createTab()
  {
    TabImpl tab = new TabImpl();
    return tab;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableView createTableView()
  {
    TableViewImpl tableView = new TableViewImpl();
    return tableView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewContentElement createViewContentElement()
  {
    ViewContentElementImpl viewContentElement = new ViewContentElementImpl();
    return viewContentElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Section createSection()
  {
    SectionImpl section = new SectionImpl();
    return section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cell createCell()
  {
    CellImpl cell = new CellImpl();
    return cell;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomView createCustomView()
  {
    CustomViewImpl customView = new CustomViewImpl();
    return customView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewCall createViewCall()
  {
    ViewCallImpl viewCall = new ViewCallImpl();
    return viewCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Selector createSelector()
  {
    SelectorImpl selector = new SelectorImpl();
    return selector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpenURL createOpenURL()
  {
    OpenURLImpl openURL = new OpenURLImpl();
    return openURL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringConcat createStringConcat()
  {
    StringConcatImpl stringConcat = new StringConcatImpl();
    return stringConcat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringReplace createStringReplace()
  {
    StringReplaceImpl stringReplace = new StringReplaceImpl();
    return stringReplace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringUrlConform createStringUrlConform()
  {
    StringUrlConformImpl stringUrlConform = new StringUrlConformImpl();
    return stringUrlConform;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringSplit createStringSplit()
  {
    StringSplitImpl stringSplit = new StringSplitImpl();
    return stringSplit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SerializationFormat createSerializationFormatFromString(EDataType eDataType, String initialValue)
  {
    SerializationFormat result = SerializationFormat.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSerializationFormatToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableViewStyle createTableViewStyleFromString(EDataType eDataType, String initialValue)
  {
    TableViewStyle result = TableViewStyle.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTableViewStyleToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CellType createCellTypeFromString(EDataType eDataType, String initialValue)
  {
    CellType result = CellType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCellTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CellAccessory createCellAccessoryFromString(EDataType eDataType, String initialValue)
  {
    CellAccessory result = CellAccessory.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCellAccessoryToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplauseDslPackage getApplauseDslPackage()
  {
    return (ApplauseDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ApplauseDslPackage getPackage()
  {
    return ApplauseDslPackage.eINSTANCE;
  }

} //ApplauseDslFactoryImpl
