/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applausedsl.applauseDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.applause.applausedsl.applauseDsl.ApplauseDslFactory
 * @model kind="package"
 * @generated
 */
public interface ApplauseDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "applauseDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.applause.org/applausedsl/ApplauseDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "applauseDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ApplauseDslPackage eINSTANCE = org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ModelImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Application</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__APPLICATION = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ApplicationImpl <em>Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ApplicationImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getApplication()
   * @generated
   */
  int APPLICATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Background</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__BACKGROUND = 1;

  /**
   * The feature id for the '<em><b>Start View</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__START_VIEW = 2;

  /**
   * The number of structural features of the '<em>Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ModelElementImpl <em>Model Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ModelElementImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getModelElement()
   * @generated
   */
  int MODEL_ELEMENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Model Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.TypeImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getType()
   * @generated
   */
  int TYPE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = MODEL_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.SimpleTypeImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getSimpleType()
   * @generated
   */
  int SIMPLE_TYPE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Platform Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE__PLATFORM_TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.EntityImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Runtime Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__RUNTIME_TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Extends</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__EXTENDS = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__PROPERTIES = TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.NamedImpl <em>Named</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.NamedImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getNamed()
   * @generated
   */
  int NAMED = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED__NAME = 0;

  /**
   * The number of structural features of the '<em>Named</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.PropertyImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = NAMED__NAME;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__TYPE_REF = NAMED_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = NAMED_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.TypeReferenceImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getTypeReference()
   * @generated
   */
  int TYPE_REFERENCE = 7;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE__MANY = 1;

  /**
   * The number of structural features of the '<em>Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ProjectClassImpl <em>Project Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ProjectClassImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getProjectClass()
   * @generated
   */
  int PROJECT_CLASS = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_CLASS__NAME = 0;

  /**
   * The number of structural features of the '<em>Project Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_CLASS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.DeclarationImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__NAME = NAMED__NAME;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = NAMED_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ExpressionImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 12;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ScalarExpressionImpl <em>Scalar Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ScalarExpressionImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getScalarExpression()
   * @generated
   */
  int SCALAR_EXPRESSION = 13;

  /**
   * The number of structural features of the '<em>Scalar Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ObjectReferenceImpl <em>Object Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ObjectReferenceImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getObjectReference()
   * @generated
   */
  int OBJECT_REFERENCE = 11;

  /**
   * The feature id for the '<em><b>Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_REFERENCE__OBJECT = SCALAR_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_REFERENCE__TAIL = SCALAR_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Object Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_REFERENCE_FEATURE_COUNT = SCALAR_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.StringLiteralImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 14;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = SCALAR_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = SCALAR_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.StringFunctionImpl <em>String Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.StringFunctionImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getStringFunction()
   * @generated
   */
  int STRING_FUNCTION = 15;

  /**
   * The number of structural features of the '<em>String Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_FUNCTION_FEATURE_COUNT = SCALAR_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.BindingImpl <em>Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.BindingImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getBinding()
   * @generated
   */
  int BINDING = 16;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__TARGET = SCALAR_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_FEATURE_COUNT = SCALAR_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.CollectionExpressionImpl <em>Collection Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.CollectionExpressionImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCollectionExpression()
   * @generated
   */
  int COLLECTION_EXPRESSION = 17;

  /**
   * The number of structural features of the '<em>Collection Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.CollectionLiteralImpl <em>Collection Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.CollectionLiteralImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCollectionLiteral()
   * @generated
   */
  int COLLECTION_LITERAL = 18;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_LITERAL__ITEMS = COLLECTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Collection Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_LITERAL_FEATURE_COUNT = COLLECTION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.CollectionFunctionImpl <em>Collection Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.CollectionFunctionImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCollectionFunction()
   * @generated
   */
  int COLLECTION_FUNCTION = 19;

  /**
   * The number of structural features of the '<em>Collection Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_FUNCTION_FEATURE_COUNT = COLLECTION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.CollectionIteratorImpl <em>Collection Iterator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.CollectionIteratorImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCollectionIterator()
   * @generated
   */
  int COLLECTION_ITERATOR = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_ITERATOR__NAME = DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Collection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_ITERATOR__COLLECTION = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Collection Iterator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_ITERATOR_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ParameterImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE_REF = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ParameterizedModelElementImpl <em>Parameterized Model Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ParameterizedModelElementImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getParameterizedModelElement()
   * @generated
   */
  int PARAMETERIZED_MODEL_ELEMENT = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERIZED_MODEL_ELEMENT__NAME = MODEL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERIZED_MODEL_ELEMENT__PARAMETERS = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameterized Model Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERIZED_MODEL_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ParameterizedCallImpl <em>Parameterized Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ParameterizedCallImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getParameterizedCall()
   * @generated
   */
  int PARAMETERIZED_CALL = 23;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERIZED_CALL__PARAMETERS = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERIZED_CALL__TARGET = 1;

  /**
   * The number of structural features of the '<em>Parameterized Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERIZED_CALL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ParameterDefinitionsImpl <em>Parameter Definitions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ParameterDefinitionsImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getParameterDefinitions()
   * @generated
   */
  int PARAMETER_DEFINITIONS = 24;

  /**
   * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DEFINITIONS__DEFINITIONS = 0;

  /**
   * The number of structural features of the '<em>Parameter Definitions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DEFINITIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ParameterValuesImpl <em>Parameter Values</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ParameterValuesImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getParameterValues()
   * @generated
   */
  int PARAMETER_VALUES = 25;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_VALUES__VALUES = 0;

  /**
   * The number of structural features of the '<em>Parameter Values</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_VALUES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ContentProviderImpl <em>Content Provider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ContentProviderImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getContentProvider()
   * @generated
   */
  int CONTENT_PROVIDER = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER__NAME = PARAMETERIZED_MODEL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER__PARAMETERS = PARAMETERIZED_MODEL_ELEMENT__PARAMETERS;

  /**
   * The feature id for the '<em><b>Storing</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER__STORING = PARAMETERIZED_MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER__TYPE = PARAMETERIZED_MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER__MANY = PARAMETERIZED_MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Implementation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER__IMPLEMENTATION = PARAMETERIZED_MODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Content Provider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER_FEATURE_COUNT = PARAMETERIZED_MODEL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ContentProviderImplementationImpl <em>Content Provider Implementation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ContentProviderImplementationImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getContentProviderImplementation()
   * @generated
   */
  int CONTENT_PROVIDER_IMPLEMENTATION = 27;

  /**
   * The number of structural features of the '<em>Content Provider Implementation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER_IMPLEMENTATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.UrlContentProviderImplementationImpl <em>Url Content Provider Implementation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.UrlContentProviderImplementationImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getUrlContentProviderImplementation()
   * @generated
   */
  int URL_CONTENT_PROVIDER_IMPLEMENTATION = 28;

  /**
   * The feature id for the '<em><b>Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_CONTENT_PROVIDER_IMPLEMENTATION__FORMAT = CONTENT_PROVIDER_IMPLEMENTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_CONTENT_PROVIDER_IMPLEMENTATION__URL = CONTENT_PROVIDER_IMPLEMENTATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Selection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_CONTENT_PROVIDER_IMPLEMENTATION__SELECTION = CONTENT_PROVIDER_IMPLEMENTATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Url Content Provider Implementation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_CONTENT_PROVIDER_IMPLEMENTATION_FEATURE_COUNT = CONTENT_PROVIDER_IMPLEMENTATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.CustomContentProviderImplementationImpl <em>Custom Content Provider Implementation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.CustomContentProviderImplementationImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCustomContentProviderImplementation()
   * @generated
   */
  int CUSTOM_CONTENT_PROVIDER_IMPLEMENTATION = 29;

  /**
   * The feature id for the '<em><b>Provider Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_CONTENT_PROVIDER_IMPLEMENTATION__PROVIDER_CLASS = CONTENT_PROVIDER_IMPLEMENTATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Custom Content Provider Implementation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_CONTENT_PROVIDER_IMPLEMENTATION_FEATURE_COUNT = CONTENT_PROVIDER_IMPLEMENTATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ContentProviderCallImpl <em>Content Provider Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ContentProviderCallImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getContentProviderCall()
   * @generated
   */
  int CONTENT_PROVIDER_CALL = 30;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER_CALL__PARAMETERS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER_CALL__TARGET = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Content Provider Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.AssignmentImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__NAME = DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__TYPE_REF = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__VALUE = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ViewImpl <em>View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ViewImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getView()
   * @generated
   */
  int VIEW = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__NAME = PARAMETERIZED_MODEL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__PARAMETERS = PARAMETERIZED_MODEL_ELEMENT__PARAMETERS;

  /**
   * The number of structural features of the '<em>View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_FEATURE_COUNT = PARAMETERIZED_MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.TabViewImpl <em>Tab View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.TabViewImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getTabView()
   * @generated
   */
  int TAB_VIEW = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_VIEW__NAME = VIEW__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_VIEW__PARAMETERS = VIEW__PARAMETERS;

  /**
   * The feature id for the '<em><b>Tabs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_VIEW__TABS = VIEW_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Tab View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.TabImpl <em>Tab</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.TabImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getTab()
   * @generated
   */
  int TAB = 34;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB__TITLE = 0;

  /**
   * The feature id for the '<em><b>Icon</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB__ICON = 1;

  /**
   * The feature id for the '<em><b>View</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB__VIEW = 2;

  /**
   * The number of structural features of the '<em>Tab</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.TableViewImpl <em>Table View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.TableViewImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getTableView()
   * @generated
   */
  int TABLE_VIEW = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_VIEW__NAME = VIEW__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_VIEW__PARAMETERS = VIEW__PARAMETERS;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_VIEW__VARIABLES = VIEW_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_VIEW__TITLE = VIEW_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Title Image</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_VIEW__TITLE_IMAGE = VIEW_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_VIEW__STYLE = VIEW_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_VIEW__SECTIONS = VIEW_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Table View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ViewContentElementImpl <em>View Content Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ViewContentElementImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getViewContentElement()
   * @generated
   */
  int VIEW_CONTENT_ELEMENT = 36;

  /**
   * The feature id for the '<em><b>Iterator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CONTENT_ELEMENT__ITERATOR = 0;

  /**
   * The number of structural features of the '<em>View Content Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CONTENT_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.SectionImpl <em>Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.SectionImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getSection()
   * @generated
   */
  int SECTION = 37;

  /**
   * The feature id for the '<em><b>Iterator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__ITERATOR = VIEW_CONTENT_ELEMENT__ITERATOR;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__TITLE = VIEW_CONTENT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cells</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__CELLS = VIEW_CONTENT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_FEATURE_COUNT = VIEW_CONTENT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.CellImpl <em>Cell</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.CellImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCell()
   * @generated
   */
  int CELL = 38;

  /**
   * The feature id for the '<em><b>Iterator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL__ITERATOR = VIEW_CONTENT_ELEMENT__ITERATOR;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL__TYPE = VIEW_CONTENT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL__TEXT = VIEW_CONTENT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Detail Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL__DETAIL_TEXT = VIEW_CONTENT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Image</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL__IMAGE = VIEW_CONTENT_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL__ACTION = VIEW_CONTENT_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Accessory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL__ACCESSORY = VIEW_CONTENT_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Cell</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_FEATURE_COUNT = VIEW_CONTENT_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.CustomViewImpl <em>Custom View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.CustomViewImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCustomView()
   * @generated
   */
  int CUSTOM_VIEW = 39;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_VIEW__NAME = VIEW__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_VIEW__PARAMETERS = VIEW__PARAMETERS;

  /**
   * The feature id for the '<em><b>Project Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_VIEW__PROJECT_CLASS = VIEW_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Custom View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ActionImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getAction()
   * @generated
   */
  int ACTION = 40;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ViewCallImpl <em>View Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ViewCallImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getViewCall()
   * @generated
   */
  int VIEW_CALL = 41;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CALL__PARAMETERS = PARAMETERIZED_CALL__PARAMETERS;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CALL__TARGET = PARAMETERIZED_CALL__TARGET;

  /**
   * The number of structural features of the '<em>View Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CALL_FEATURE_COUNT = PARAMETERIZED_CALL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.SelectorImpl <em>Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.SelectorImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getSelector()
   * @generated
   */
  int SELECTOR = 42;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTOR__NAME = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTOR_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.OpenURLImpl <em>Open URL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.OpenURLImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getOpenURL()
   * @generated
   */
  int OPEN_URL = 43;

  /**
   * The feature id for the '<em><b>Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN_URL__URL = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Open URL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN_URL_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.StringConcatImpl <em>String Concat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.StringConcatImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getStringConcat()
   * @generated
   */
  int STRING_CONCAT = 44;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONCAT__VALUES = STRING_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Concat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONCAT_FEATURE_COUNT = STRING_FUNCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.StringReplaceImpl <em>String Replace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.StringReplaceImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getStringReplace()
   * @generated
   */
  int STRING_REPLACE = 45;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_REPLACE__VALUE = STRING_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Match</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_REPLACE__MATCH = STRING_FUNCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Replacement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_REPLACE__REPLACEMENT = STRING_FUNCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>String Replace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_REPLACE_FEATURE_COUNT = STRING_FUNCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.StringUrlConformImpl <em>String Url Conform</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.StringUrlConformImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getStringUrlConform()
   * @generated
   */
  int STRING_URL_CONFORM = 46;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_URL_CONFORM__VALUE = STRING_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Url Conform</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_URL_CONFORM_FEATURE_COUNT = STRING_FUNCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.StringSplitImpl <em>String Split</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.StringSplitImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getStringSplit()
   * @generated
   */
  int STRING_SPLIT = 47;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_SPLIT__VALUE = COLLECTION_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Delimiter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_SPLIT__DELIMITER = COLLECTION_FUNCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>String Split</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_SPLIT_FEATURE_COUNT = COLLECTION_FUNCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.SerializationFormat <em>Serialization Format</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.SerializationFormat
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getSerializationFormat()
   * @generated
   */
  int SERIALIZATION_FORMAT = 48;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.TableViewStyle <em>Table View Style</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.TableViewStyle
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getTableViewStyle()
   * @generated
   */
  int TABLE_VIEW_STYLE = 49;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.CellType <em>Cell Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.CellType
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCellType()
   * @generated
   */
  int CELL_TYPE = 50;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.CellAccessory <em>Cell Accessory</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.CellAccessory
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCellAccessory()
   * @generated
   */
  int CELL_ACCESSORY = 51;


  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.applause.applausedsl.applauseDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.Model#getApplication <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Application</em>'.
   * @see org.applause.applausedsl.applauseDsl.Model#getApplication()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Application();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.applausedsl.applauseDsl.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.applause.applausedsl.applauseDsl.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application</em>'.
   * @see org.applause.applausedsl.applauseDsl.Application
   * @generated
   */
  EClass getApplication();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.Application#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.applause.applausedsl.applauseDsl.Application#getName()
   * @see #getApplication()
   * @generated
   */
  EAttribute getApplication_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.Application#getBackground <em>Background</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Background</em>'.
   * @see org.applause.applausedsl.applauseDsl.Application#getBackground()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Background();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.Application#getStartView <em>Start View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start View</em>'.
   * @see org.applause.applausedsl.applauseDsl.Application#getStartView()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_StartView();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.ModelElement <em>Model Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Element</em>'.
   * @see org.applause.applausedsl.applauseDsl.ModelElement
   * @generated
   */
  EClass getModelElement();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.ModelElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.applause.applausedsl.applauseDsl.ModelElement#getName()
   * @see #getModelElement()
   * @generated
   */
  EAttribute getModelElement_Name();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.applause.applausedsl.applauseDsl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.SimpleType <em>Simple Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Type</em>'.
   * @see org.applause.applausedsl.applauseDsl.SimpleType
   * @generated
   */
  EClass getSimpleType();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.SimpleType#getPlatformType <em>Platform Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Platform Type</em>'.
   * @see org.applause.applausedsl.applauseDsl.SimpleType#getPlatformType()
   * @see #getSimpleType()
   * @generated
   */
  EAttribute getSimpleType_PlatformType();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.applause.applausedsl.applauseDsl.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.Entity#isRuntimeType <em>Runtime Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Runtime Type</em>'.
   * @see org.applause.applausedsl.applauseDsl.Entity#isRuntimeType()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_RuntimeType();

  /**
   * Returns the meta object for the reference '{@link org.applause.applausedsl.applauseDsl.Entity#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Extends</em>'.
   * @see org.applause.applausedsl.applauseDsl.Entity#getExtends()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Extends();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.applausedsl.applauseDsl.Entity#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.applause.applausedsl.applauseDsl.Entity#getProperties()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Properties();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see org.applause.applausedsl.applauseDsl.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.Property#getTypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Ref</em>'.
   * @see org.applause.applausedsl.applauseDsl.Property#getTypeRef()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_TypeRef();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.TypeReference <em>Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Reference</em>'.
   * @see org.applause.applausedsl.applauseDsl.TypeReference
   * @generated
   */
  EClass getTypeReference();

  /**
   * Returns the meta object for the reference '{@link org.applause.applausedsl.applauseDsl.TypeReference#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.applause.applausedsl.applauseDsl.TypeReference#getType()
   * @see #getTypeReference()
   * @generated
   */
  EReference getTypeReference_Type();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.TypeReference#isMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.applause.applausedsl.applauseDsl.TypeReference#isMany()
   * @see #getTypeReference()
   * @generated
   */
  EAttribute getTypeReference_Many();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.ProjectClass <em>Project Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project Class</em>'.
   * @see org.applause.applausedsl.applauseDsl.ProjectClass
   * @generated
   */
  EClass getProjectClass();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.ProjectClass#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.applause.applausedsl.applauseDsl.ProjectClass#getName()
   * @see #getProjectClass()
   * @generated
   */
  EAttribute getProjectClass_Name();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see org.applause.applausedsl.applauseDsl.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.Named <em>Named</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named</em>'.
   * @see org.applause.applausedsl.applauseDsl.Named
   * @generated
   */
  EClass getNamed();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.Named#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.applause.applausedsl.applauseDsl.Named#getName()
   * @see #getNamed()
   * @generated
   */
  EAttribute getNamed_Name();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.ObjectReference <em>Object Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Reference</em>'.
   * @see org.applause.applausedsl.applauseDsl.ObjectReference
   * @generated
   */
  EClass getObjectReference();

  /**
   * Returns the meta object for the reference '{@link org.applause.applausedsl.applauseDsl.ObjectReference#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Object</em>'.
   * @see org.applause.applausedsl.applauseDsl.ObjectReference#getObject()
   * @see #getObjectReference()
   * @generated
   */
  EReference getObjectReference_Object();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.ObjectReference#getTail <em>Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tail</em>'.
   * @see org.applause.applausedsl.applauseDsl.ObjectReference#getTail()
   * @see #getObjectReference()
   * @generated
   */
  EReference getObjectReference_Tail();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.applause.applausedsl.applauseDsl.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.ScalarExpression <em>Scalar Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scalar Expression</em>'.
   * @see org.applause.applausedsl.applauseDsl.ScalarExpression
   * @generated
   */
  EClass getScalarExpression();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see org.applause.applausedsl.applauseDsl.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.applause.applausedsl.applauseDsl.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.StringFunction <em>String Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Function</em>'.
   * @see org.applause.applausedsl.applauseDsl.StringFunction
   * @generated
   */
  EClass getStringFunction();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.Binding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding</em>'.
   * @see org.applause.applausedsl.applauseDsl.Binding
   * @generated
   */
  EClass getBinding();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.Binding#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see org.applause.applausedsl.applauseDsl.Binding#getTarget()
   * @see #getBinding()
   * @generated
   */
  EReference getBinding_Target();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.CollectionExpression <em>Collection Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Expression</em>'.
   * @see org.applause.applausedsl.applauseDsl.CollectionExpression
   * @generated
   */
  EClass getCollectionExpression();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.CollectionLiteral <em>Collection Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Literal</em>'.
   * @see org.applause.applausedsl.applauseDsl.CollectionLiteral
   * @generated
   */
  EClass getCollectionLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.applausedsl.applauseDsl.CollectionLiteral#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see org.applause.applausedsl.applauseDsl.CollectionLiteral#getItems()
   * @see #getCollectionLiteral()
   * @generated
   */
  EReference getCollectionLiteral_Items();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.CollectionFunction <em>Collection Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Function</em>'.
   * @see org.applause.applausedsl.applauseDsl.CollectionFunction
   * @generated
   */
  EClass getCollectionFunction();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.CollectionIterator <em>Collection Iterator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Iterator</em>'.
   * @see org.applause.applausedsl.applauseDsl.CollectionIterator
   * @generated
   */
  EClass getCollectionIterator();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.CollectionIterator#getCollection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Collection</em>'.
   * @see org.applause.applausedsl.applauseDsl.CollectionIterator#getCollection()
   * @see #getCollectionIterator()
   * @generated
   */
  EReference getCollectionIterator_Collection();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.applause.applausedsl.applauseDsl.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.Parameter#getTypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Ref</em>'.
   * @see org.applause.applausedsl.applauseDsl.Parameter#getTypeRef()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_TypeRef();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.ParameterizedModelElement <em>Parameterized Model Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameterized Model Element</em>'.
   * @see org.applause.applausedsl.applauseDsl.ParameterizedModelElement
   * @generated
   */
  EClass getParameterizedModelElement();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.ParameterizedModelElement#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters</em>'.
   * @see org.applause.applausedsl.applauseDsl.ParameterizedModelElement#getParameters()
   * @see #getParameterizedModelElement()
   * @generated
   */
  EReference getParameterizedModelElement_Parameters();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.ParameterizedCall <em>Parameterized Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameterized Call</em>'.
   * @see org.applause.applausedsl.applauseDsl.ParameterizedCall
   * @generated
   */
  EClass getParameterizedCall();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.ParameterizedCall#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters</em>'.
   * @see org.applause.applausedsl.applauseDsl.ParameterizedCall#getParameters()
   * @see #getParameterizedCall()
   * @generated
   */
  EReference getParameterizedCall_Parameters();

  /**
   * Returns the meta object for the reference '{@link org.applause.applausedsl.applauseDsl.ParameterizedCall#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.applause.applausedsl.applauseDsl.ParameterizedCall#getTarget()
   * @see #getParameterizedCall()
   * @generated
   */
  EReference getParameterizedCall_Target();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.ParameterDefinitions <em>Parameter Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Definitions</em>'.
   * @see org.applause.applausedsl.applauseDsl.ParameterDefinitions
   * @generated
   */
  EClass getParameterDefinitions();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.applausedsl.applauseDsl.ParameterDefinitions#getDefinitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Definitions</em>'.
   * @see org.applause.applausedsl.applauseDsl.ParameterDefinitions#getDefinitions()
   * @see #getParameterDefinitions()
   * @generated
   */
  EReference getParameterDefinitions_Definitions();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.ParameterValues <em>Parameter Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Values</em>'.
   * @see org.applause.applausedsl.applauseDsl.ParameterValues
   * @generated
   */
  EClass getParameterValues();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.applausedsl.applauseDsl.ParameterValues#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see org.applause.applausedsl.applauseDsl.ParameterValues#getValues()
   * @see #getParameterValues()
   * @generated
   */
  EReference getParameterValues_Values();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.ContentProvider <em>Content Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Content Provider</em>'.
   * @see org.applause.applausedsl.applauseDsl.ContentProvider
   * @generated
   */
  EClass getContentProvider();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.ContentProvider#isStoring <em>Storing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Storing</em>'.
   * @see org.applause.applausedsl.applauseDsl.ContentProvider#isStoring()
   * @see #getContentProvider()
   * @generated
   */
  EAttribute getContentProvider_Storing();

  /**
   * Returns the meta object for the reference '{@link org.applause.applausedsl.applauseDsl.ContentProvider#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.applause.applausedsl.applauseDsl.ContentProvider#getType()
   * @see #getContentProvider()
   * @generated
   */
  EReference getContentProvider_Type();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.ContentProvider#isMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.applause.applausedsl.applauseDsl.ContentProvider#isMany()
   * @see #getContentProvider()
   * @generated
   */
  EAttribute getContentProvider_Many();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.ContentProvider#getImplementation <em>Implementation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Implementation</em>'.
   * @see org.applause.applausedsl.applauseDsl.ContentProvider#getImplementation()
   * @see #getContentProvider()
   * @generated
   */
  EReference getContentProvider_Implementation();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.ContentProviderImplementation <em>Content Provider Implementation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Content Provider Implementation</em>'.
   * @see org.applause.applausedsl.applauseDsl.ContentProviderImplementation
   * @generated
   */
  EClass getContentProviderImplementation();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.UrlContentProviderImplementation <em>Url Content Provider Implementation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Url Content Provider Implementation</em>'.
   * @see org.applause.applausedsl.applauseDsl.UrlContentProviderImplementation
   * @generated
   */
  EClass getUrlContentProviderImplementation();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.UrlContentProviderImplementation#getFormat <em>Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Format</em>'.
   * @see org.applause.applausedsl.applauseDsl.UrlContentProviderImplementation#getFormat()
   * @see #getUrlContentProviderImplementation()
   * @generated
   */
  EAttribute getUrlContentProviderImplementation_Format();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.UrlContentProviderImplementation#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Url</em>'.
   * @see org.applause.applausedsl.applauseDsl.UrlContentProviderImplementation#getUrl()
   * @see #getUrlContentProviderImplementation()
   * @generated
   */
  EReference getUrlContentProviderImplementation_Url();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.UrlContentProviderImplementation#getSelection <em>Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Selection</em>'.
   * @see org.applause.applausedsl.applauseDsl.UrlContentProviderImplementation#getSelection()
   * @see #getUrlContentProviderImplementation()
   * @generated
   */
  EReference getUrlContentProviderImplementation_Selection();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.CustomContentProviderImplementation <em>Custom Content Provider Implementation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Content Provider Implementation</em>'.
   * @see org.applause.applausedsl.applauseDsl.CustomContentProviderImplementation
   * @generated
   */
  EClass getCustomContentProviderImplementation();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.CustomContentProviderImplementation#getProviderClass <em>Provider Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Provider Class</em>'.
   * @see org.applause.applausedsl.applauseDsl.CustomContentProviderImplementation#getProviderClass()
   * @see #getCustomContentProviderImplementation()
   * @generated
   */
  EReference getCustomContentProviderImplementation_ProviderClass();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.ContentProviderCall <em>Content Provider Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Content Provider Call</em>'.
   * @see org.applause.applausedsl.applauseDsl.ContentProviderCall
   * @generated
   */
  EClass getContentProviderCall();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see org.applause.applausedsl.applauseDsl.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.Assignment#getTypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Ref</em>'.
   * @see org.applause.applausedsl.applauseDsl.Assignment#getTypeRef()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_TypeRef();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.Assignment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.applause.applausedsl.applauseDsl.Assignment#getValue()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Value();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.View <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View</em>'.
   * @see org.applause.applausedsl.applauseDsl.View
   * @generated
   */
  EClass getView();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.TabView <em>Tab View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tab View</em>'.
   * @see org.applause.applausedsl.applauseDsl.TabView
   * @generated
   */
  EClass getTabView();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.applausedsl.applauseDsl.TabView#getTabs <em>Tabs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tabs</em>'.
   * @see org.applause.applausedsl.applauseDsl.TabView#getTabs()
   * @see #getTabView()
   * @generated
   */
  EReference getTabView_Tabs();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.Tab <em>Tab</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tab</em>'.
   * @see org.applause.applausedsl.applauseDsl.Tab
   * @generated
   */
  EClass getTab();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.Tab#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see org.applause.applausedsl.applauseDsl.Tab#getTitle()
   * @see #getTab()
   * @generated
   */
  EReference getTab_Title();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.Tab#getIcon <em>Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Icon</em>'.
   * @see org.applause.applausedsl.applauseDsl.Tab#getIcon()
   * @see #getTab()
   * @generated
   */
  EReference getTab_Icon();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.Tab#getView <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>View</em>'.
   * @see org.applause.applausedsl.applauseDsl.Tab#getView()
   * @see #getTab()
   * @generated
   */
  EReference getTab_View();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.TableView <em>Table View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table View</em>'.
   * @see org.applause.applausedsl.applauseDsl.TableView
   * @generated
   */
  EClass getTableView();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.applausedsl.applauseDsl.TableView#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see org.applause.applausedsl.applauseDsl.TableView#getVariables()
   * @see #getTableView()
   * @generated
   */
  EReference getTableView_Variables();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.TableView#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see org.applause.applausedsl.applauseDsl.TableView#getTitle()
   * @see #getTableView()
   * @generated
   */
  EReference getTableView_Title();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.TableView#getTitleImage <em>Title Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title Image</em>'.
   * @see org.applause.applausedsl.applauseDsl.TableView#getTitleImage()
   * @see #getTableView()
   * @generated
   */
  EReference getTableView_TitleImage();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.TableView#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Style</em>'.
   * @see org.applause.applausedsl.applauseDsl.TableView#getStyle()
   * @see #getTableView()
   * @generated
   */
  EAttribute getTableView_Style();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.applausedsl.applauseDsl.TableView#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sections</em>'.
   * @see org.applause.applausedsl.applauseDsl.TableView#getSections()
   * @see #getTableView()
   * @generated
   */
  EReference getTableView_Sections();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.ViewContentElement <em>View Content Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Content Element</em>'.
   * @see org.applause.applausedsl.applauseDsl.ViewContentElement
   * @generated
   */
  EClass getViewContentElement();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.ViewContentElement#getIterator <em>Iterator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Iterator</em>'.
   * @see org.applause.applausedsl.applauseDsl.ViewContentElement#getIterator()
   * @see #getViewContentElement()
   * @generated
   */
  EReference getViewContentElement_Iterator();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Section</em>'.
   * @see org.applause.applausedsl.applauseDsl.Section
   * @generated
   */
  EClass getSection();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.Section#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see org.applause.applausedsl.applauseDsl.Section#getTitle()
   * @see #getSection()
   * @generated
   */
  EReference getSection_Title();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.applausedsl.applauseDsl.Section#getCells <em>Cells</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cells</em>'.
   * @see org.applause.applausedsl.applauseDsl.Section#getCells()
   * @see #getSection()
   * @generated
   */
  EReference getSection_Cells();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.Cell <em>Cell</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cell</em>'.
   * @see org.applause.applausedsl.applauseDsl.Cell
   * @generated
   */
  EClass getCell();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.Cell#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.applause.applausedsl.applauseDsl.Cell#getType()
   * @see #getCell()
   * @generated
   */
  EAttribute getCell_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.Cell#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text</em>'.
   * @see org.applause.applausedsl.applauseDsl.Cell#getText()
   * @see #getCell()
   * @generated
   */
  EReference getCell_Text();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.Cell#getDetailText <em>Detail Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Detail Text</em>'.
   * @see org.applause.applausedsl.applauseDsl.Cell#getDetailText()
   * @see #getCell()
   * @generated
   */
  EReference getCell_DetailText();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.Cell#getImage <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Image</em>'.
   * @see org.applause.applausedsl.applauseDsl.Cell#getImage()
   * @see #getCell()
   * @generated
   */
  EReference getCell_Image();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.Cell#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see org.applause.applausedsl.applauseDsl.Cell#getAction()
   * @see #getCell()
   * @generated
   */
  EReference getCell_Action();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.Cell#getAccessory <em>Accessory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Accessory</em>'.
   * @see org.applause.applausedsl.applauseDsl.Cell#getAccessory()
   * @see #getCell()
   * @generated
   */
  EAttribute getCell_Accessory();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.CustomView <em>Custom View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom View</em>'.
   * @see org.applause.applausedsl.applauseDsl.CustomView
   * @generated
   */
  EClass getCustomView();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.CustomView#getProjectClass <em>Project Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Project Class</em>'.
   * @see org.applause.applausedsl.applauseDsl.CustomView#getProjectClass()
   * @see #getCustomView()
   * @generated
   */
  EReference getCustomView_ProjectClass();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see org.applause.applausedsl.applauseDsl.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.ViewCall <em>View Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Call</em>'.
   * @see org.applause.applausedsl.applauseDsl.ViewCall
   * @generated
   */
  EClass getViewCall();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.Selector <em>Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selector</em>'.
   * @see org.applause.applausedsl.applauseDsl.Selector
   * @generated
   */
  EClass getSelector();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.Selector#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.applause.applausedsl.applauseDsl.Selector#getName()
   * @see #getSelector()
   * @generated
   */
  EAttribute getSelector_Name();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.OpenURL <em>Open URL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Open URL</em>'.
   * @see org.applause.applausedsl.applauseDsl.OpenURL
   * @generated
   */
  EClass getOpenURL();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.OpenURL#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Url</em>'.
   * @see org.applause.applausedsl.applauseDsl.OpenURL#getUrl()
   * @see #getOpenURL()
   * @generated
   */
  EReference getOpenURL_Url();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.StringConcat <em>String Concat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Concat</em>'.
   * @see org.applause.applausedsl.applauseDsl.StringConcat
   * @generated
   */
  EClass getStringConcat();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.applausedsl.applauseDsl.StringConcat#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see org.applause.applausedsl.applauseDsl.StringConcat#getValues()
   * @see #getStringConcat()
   * @generated
   */
  EReference getStringConcat_Values();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.StringReplace <em>String Replace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Replace</em>'.
   * @see org.applause.applausedsl.applauseDsl.StringReplace
   * @generated
   */
  EClass getStringReplace();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.StringReplace#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.applause.applausedsl.applauseDsl.StringReplace#getValue()
   * @see #getStringReplace()
   * @generated
   */
  EReference getStringReplace_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.StringReplace#getMatch <em>Match</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Match</em>'.
   * @see org.applause.applausedsl.applauseDsl.StringReplace#getMatch()
   * @see #getStringReplace()
   * @generated
   */
  EReference getStringReplace_Match();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.StringReplace#getReplacement <em>Replacement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Replacement</em>'.
   * @see org.applause.applausedsl.applauseDsl.StringReplace#getReplacement()
   * @see #getStringReplace()
   * @generated
   */
  EReference getStringReplace_Replacement();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.StringUrlConform <em>String Url Conform</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Url Conform</em>'.
   * @see org.applause.applausedsl.applauseDsl.StringUrlConform
   * @generated
   */
  EClass getStringUrlConform();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.StringUrlConform#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.applause.applausedsl.applauseDsl.StringUrlConform#getValue()
   * @see #getStringUrlConform()
   * @generated
   */
  EReference getStringUrlConform_Value();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.StringSplit <em>String Split</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Split</em>'.
   * @see org.applause.applausedsl.applauseDsl.StringSplit
   * @generated
   */
  EClass getStringSplit();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.StringSplit#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.applause.applausedsl.applauseDsl.StringSplit#getValue()
   * @see #getStringSplit()
   * @generated
   */
  EReference getStringSplit_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.StringSplit#getDelimiter <em>Delimiter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delimiter</em>'.
   * @see org.applause.applausedsl.applauseDsl.StringSplit#getDelimiter()
   * @see #getStringSplit()
   * @generated
   */
  EReference getStringSplit_Delimiter();

  /**
   * Returns the meta object for enum '{@link org.applause.applausedsl.applauseDsl.SerializationFormat <em>Serialization Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Serialization Format</em>'.
   * @see org.applause.applausedsl.applauseDsl.SerializationFormat
   * @generated
   */
  EEnum getSerializationFormat();

  /**
   * Returns the meta object for enum '{@link org.applause.applausedsl.applauseDsl.TableViewStyle <em>Table View Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Table View Style</em>'.
   * @see org.applause.applausedsl.applauseDsl.TableViewStyle
   * @generated
   */
  EEnum getTableViewStyle();

  /**
   * Returns the meta object for enum '{@link org.applause.applausedsl.applauseDsl.CellType <em>Cell Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Cell Type</em>'.
   * @see org.applause.applausedsl.applauseDsl.CellType
   * @generated
   */
  EEnum getCellType();

  /**
   * Returns the meta object for enum '{@link org.applause.applausedsl.applauseDsl.CellAccessory <em>Cell Accessory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Cell Accessory</em>'.
   * @see org.applause.applausedsl.applauseDsl.CellAccessory
   * @generated
   */
  EEnum getCellAccessory();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ApplauseDslFactory getApplauseDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ModelImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Application</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__APPLICATION = eINSTANCE.getModel_Application();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ApplicationImpl <em>Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ApplicationImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getApplication()
     * @generated
     */
    EClass APPLICATION = eINSTANCE.getApplication();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

    /**
     * The meta object literal for the '<em><b>Background</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__BACKGROUND = eINSTANCE.getApplication_Background();

    /**
     * The meta object literal for the '<em><b>Start View</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__START_VIEW = eINSTANCE.getApplication_StartView();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ModelElementImpl <em>Model Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ModelElementImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getModelElement()
     * @generated
     */
    EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.TypeImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.SimpleTypeImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getSimpleType()
     * @generated
     */
    EClass SIMPLE_TYPE = eINSTANCE.getSimpleType();

    /**
     * The meta object literal for the '<em><b>Platform Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_TYPE__PLATFORM_TYPE = eINSTANCE.getSimpleType_PlatformType();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.EntityImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Runtime Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__RUNTIME_TYPE = eINSTANCE.getEntity_RuntimeType();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__EXTENDS = eINSTANCE.getEntity_Extends();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__PROPERTIES = eINSTANCE.getEntity_Properties();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.PropertyImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Type Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__TYPE_REF = eINSTANCE.getProperty_TypeRef();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.TypeReferenceImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getTypeReference()
     * @generated
     */
    EClass TYPE_REFERENCE = eINSTANCE.getTypeReference();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_REFERENCE__TYPE = eINSTANCE.getTypeReference_Type();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_REFERENCE__MANY = eINSTANCE.getTypeReference_Many();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ProjectClassImpl <em>Project Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ProjectClassImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getProjectClass()
     * @generated
     */
    EClass PROJECT_CLASS = eINSTANCE.getProjectClass();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT_CLASS__NAME = eINSTANCE.getProjectClass_Name();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.DeclarationImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.NamedImpl <em>Named</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.NamedImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getNamed()
     * @generated
     */
    EClass NAMED = eINSTANCE.getNamed();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED__NAME = eINSTANCE.getNamed_Name();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ObjectReferenceImpl <em>Object Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ObjectReferenceImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getObjectReference()
     * @generated
     */
    EClass OBJECT_REFERENCE = eINSTANCE.getObjectReference();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_REFERENCE__OBJECT = eINSTANCE.getObjectReference_Object();

    /**
     * The meta object literal for the '<em><b>Tail</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_REFERENCE__TAIL = eINSTANCE.getObjectReference_Tail();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ExpressionImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ScalarExpressionImpl <em>Scalar Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ScalarExpressionImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getScalarExpression()
     * @generated
     */
    EClass SCALAR_EXPRESSION = eINSTANCE.getScalarExpression();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.StringLiteralImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.StringFunctionImpl <em>String Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.StringFunctionImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getStringFunction()
     * @generated
     */
    EClass STRING_FUNCTION = eINSTANCE.getStringFunction();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.BindingImpl <em>Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.BindingImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getBinding()
     * @generated
     */
    EClass BINDING = eINSTANCE.getBinding();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING__TARGET = eINSTANCE.getBinding_Target();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.CollectionExpressionImpl <em>Collection Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.CollectionExpressionImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCollectionExpression()
     * @generated
     */
    EClass COLLECTION_EXPRESSION = eINSTANCE.getCollectionExpression();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.CollectionLiteralImpl <em>Collection Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.CollectionLiteralImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCollectionLiteral()
     * @generated
     */
    EClass COLLECTION_LITERAL = eINSTANCE.getCollectionLiteral();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION_LITERAL__ITEMS = eINSTANCE.getCollectionLiteral_Items();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.CollectionFunctionImpl <em>Collection Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.CollectionFunctionImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCollectionFunction()
     * @generated
     */
    EClass COLLECTION_FUNCTION = eINSTANCE.getCollectionFunction();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.CollectionIteratorImpl <em>Collection Iterator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.CollectionIteratorImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCollectionIterator()
     * @generated
     */
    EClass COLLECTION_ITERATOR = eINSTANCE.getCollectionIterator();

    /**
     * The meta object literal for the '<em><b>Collection</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION_ITERATOR__COLLECTION = eINSTANCE.getCollectionIterator_Collection();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ParameterImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Type Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPE_REF = eINSTANCE.getParameter_TypeRef();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ParameterizedModelElementImpl <em>Parameterized Model Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ParameterizedModelElementImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getParameterizedModelElement()
     * @generated
     */
    EClass PARAMETERIZED_MODEL_ELEMENT = eINSTANCE.getParameterizedModelElement();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETERIZED_MODEL_ELEMENT__PARAMETERS = eINSTANCE.getParameterizedModelElement_Parameters();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ParameterizedCallImpl <em>Parameterized Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ParameterizedCallImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getParameterizedCall()
     * @generated
     */
    EClass PARAMETERIZED_CALL = eINSTANCE.getParameterizedCall();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETERIZED_CALL__PARAMETERS = eINSTANCE.getParameterizedCall_Parameters();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETERIZED_CALL__TARGET = eINSTANCE.getParameterizedCall_Target();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ParameterDefinitionsImpl <em>Parameter Definitions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ParameterDefinitionsImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getParameterDefinitions()
     * @generated
     */
    EClass PARAMETER_DEFINITIONS = eINSTANCE.getParameterDefinitions();

    /**
     * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_DEFINITIONS__DEFINITIONS = eINSTANCE.getParameterDefinitions_Definitions();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ParameterValuesImpl <em>Parameter Values</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ParameterValuesImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getParameterValues()
     * @generated
     */
    EClass PARAMETER_VALUES = eINSTANCE.getParameterValues();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_VALUES__VALUES = eINSTANCE.getParameterValues_Values();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ContentProviderImpl <em>Content Provider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ContentProviderImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getContentProvider()
     * @generated
     */
    EClass CONTENT_PROVIDER = eINSTANCE.getContentProvider();

    /**
     * The meta object literal for the '<em><b>Storing</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTENT_PROVIDER__STORING = eINSTANCE.getContentProvider_Storing();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENT_PROVIDER__TYPE = eINSTANCE.getContentProvider_Type();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTENT_PROVIDER__MANY = eINSTANCE.getContentProvider_Many();

    /**
     * The meta object literal for the '<em><b>Implementation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENT_PROVIDER__IMPLEMENTATION = eINSTANCE.getContentProvider_Implementation();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ContentProviderImplementationImpl <em>Content Provider Implementation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ContentProviderImplementationImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getContentProviderImplementation()
     * @generated
     */
    EClass CONTENT_PROVIDER_IMPLEMENTATION = eINSTANCE.getContentProviderImplementation();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.UrlContentProviderImplementationImpl <em>Url Content Provider Implementation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.UrlContentProviderImplementationImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getUrlContentProviderImplementation()
     * @generated
     */
    EClass URL_CONTENT_PROVIDER_IMPLEMENTATION = eINSTANCE.getUrlContentProviderImplementation();

    /**
     * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URL_CONTENT_PROVIDER_IMPLEMENTATION__FORMAT = eINSTANCE.getUrlContentProviderImplementation_Format();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference URL_CONTENT_PROVIDER_IMPLEMENTATION__URL = eINSTANCE.getUrlContentProviderImplementation_Url();

    /**
     * The meta object literal for the '<em><b>Selection</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference URL_CONTENT_PROVIDER_IMPLEMENTATION__SELECTION = eINSTANCE.getUrlContentProviderImplementation_Selection();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.CustomContentProviderImplementationImpl <em>Custom Content Provider Implementation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.CustomContentProviderImplementationImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCustomContentProviderImplementation()
     * @generated
     */
    EClass CUSTOM_CONTENT_PROVIDER_IMPLEMENTATION = eINSTANCE.getCustomContentProviderImplementation();

    /**
     * The meta object literal for the '<em><b>Provider Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_CONTENT_PROVIDER_IMPLEMENTATION__PROVIDER_CLASS = eINSTANCE.getCustomContentProviderImplementation_ProviderClass();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ContentProviderCallImpl <em>Content Provider Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ContentProviderCallImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getContentProviderCall()
     * @generated
     */
    EClass CONTENT_PROVIDER_CALL = eINSTANCE.getContentProviderCall();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.AssignmentImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getAssignment()
     * @generated
     */
    EClass ASSIGNMENT = eINSTANCE.getAssignment();

    /**
     * The meta object literal for the '<em><b>Type Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__TYPE_REF = eINSTANCE.getAssignment_TypeRef();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__VALUE = eINSTANCE.getAssignment_Value();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ViewImpl <em>View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ViewImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getView()
     * @generated
     */
    EClass VIEW = eINSTANCE.getView();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.TabViewImpl <em>Tab View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.TabViewImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getTabView()
     * @generated
     */
    EClass TAB_VIEW = eINSTANCE.getTabView();

    /**
     * The meta object literal for the '<em><b>Tabs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAB_VIEW__TABS = eINSTANCE.getTabView_Tabs();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.TabImpl <em>Tab</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.TabImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getTab()
     * @generated
     */
    EClass TAB = eINSTANCE.getTab();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAB__TITLE = eINSTANCE.getTab_Title();

    /**
     * The meta object literal for the '<em><b>Icon</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAB__ICON = eINSTANCE.getTab_Icon();

    /**
     * The meta object literal for the '<em><b>View</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAB__VIEW = eINSTANCE.getTab_View();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.TableViewImpl <em>Table View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.TableViewImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getTableView()
     * @generated
     */
    EClass TABLE_VIEW = eINSTANCE.getTableView();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_VIEW__VARIABLES = eINSTANCE.getTableView_Variables();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_VIEW__TITLE = eINSTANCE.getTableView_Title();

    /**
     * The meta object literal for the '<em><b>Title Image</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_VIEW__TITLE_IMAGE = eINSTANCE.getTableView_TitleImage();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_VIEW__STYLE = eINSTANCE.getTableView_Style();

    /**
     * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_VIEW__SECTIONS = eINSTANCE.getTableView_Sections();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ViewContentElementImpl <em>View Content Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ViewContentElementImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getViewContentElement()
     * @generated
     */
    EClass VIEW_CONTENT_ELEMENT = eINSTANCE.getViewContentElement();

    /**
     * The meta object literal for the '<em><b>Iterator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_CONTENT_ELEMENT__ITERATOR = eINSTANCE.getViewContentElement_Iterator();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.SectionImpl <em>Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.SectionImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getSection()
     * @generated
     */
    EClass SECTION = eINSTANCE.getSection();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION__TITLE = eINSTANCE.getSection_Title();

    /**
     * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION__CELLS = eINSTANCE.getSection_Cells();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.CellImpl <em>Cell</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.CellImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCell()
     * @generated
     */
    EClass CELL = eINSTANCE.getCell();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CELL__TYPE = eINSTANCE.getCell_Type();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CELL__TEXT = eINSTANCE.getCell_Text();

    /**
     * The meta object literal for the '<em><b>Detail Text</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CELL__DETAIL_TEXT = eINSTANCE.getCell_DetailText();

    /**
     * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CELL__IMAGE = eINSTANCE.getCell_Image();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CELL__ACTION = eINSTANCE.getCell_Action();

    /**
     * The meta object literal for the '<em><b>Accessory</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CELL__ACCESSORY = eINSTANCE.getCell_Accessory();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.CustomViewImpl <em>Custom View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.CustomViewImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCustomView()
     * @generated
     */
    EClass CUSTOM_VIEW = eINSTANCE.getCustomView();

    /**
     * The meta object literal for the '<em><b>Project Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_VIEW__PROJECT_CLASS = eINSTANCE.getCustomView_ProjectClass();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ActionImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ViewCallImpl <em>View Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ViewCallImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getViewCall()
     * @generated
     */
    EClass VIEW_CALL = eINSTANCE.getViewCall();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.SelectorImpl <em>Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.SelectorImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getSelector()
     * @generated
     */
    EClass SELECTOR = eINSTANCE.getSelector();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECTOR__NAME = eINSTANCE.getSelector_Name();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.OpenURLImpl <em>Open URL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.OpenURLImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getOpenURL()
     * @generated
     */
    EClass OPEN_URL = eINSTANCE.getOpenURL();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPEN_URL__URL = eINSTANCE.getOpenURL_Url();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.StringConcatImpl <em>String Concat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.StringConcatImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getStringConcat()
     * @generated
     */
    EClass STRING_CONCAT = eINSTANCE.getStringConcat();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_CONCAT__VALUES = eINSTANCE.getStringConcat_Values();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.StringReplaceImpl <em>String Replace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.StringReplaceImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getStringReplace()
     * @generated
     */
    EClass STRING_REPLACE = eINSTANCE.getStringReplace();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_REPLACE__VALUE = eINSTANCE.getStringReplace_Value();

    /**
     * The meta object literal for the '<em><b>Match</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_REPLACE__MATCH = eINSTANCE.getStringReplace_Match();

    /**
     * The meta object literal for the '<em><b>Replacement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_REPLACE__REPLACEMENT = eINSTANCE.getStringReplace_Replacement();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.StringUrlConformImpl <em>String Url Conform</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.StringUrlConformImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getStringUrlConform()
     * @generated
     */
    EClass STRING_URL_CONFORM = eINSTANCE.getStringUrlConform();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_URL_CONFORM__VALUE = eINSTANCE.getStringUrlConform_Value();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.StringSplitImpl <em>String Split</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.StringSplitImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getStringSplit()
     * @generated
     */
    EClass STRING_SPLIT = eINSTANCE.getStringSplit();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_SPLIT__VALUE = eINSTANCE.getStringSplit_Value();

    /**
     * The meta object literal for the '<em><b>Delimiter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_SPLIT__DELIMITER = eINSTANCE.getStringSplit_Delimiter();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.SerializationFormat <em>Serialization Format</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.SerializationFormat
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getSerializationFormat()
     * @generated
     */
    EEnum SERIALIZATION_FORMAT = eINSTANCE.getSerializationFormat();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.TableViewStyle <em>Table View Style</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.TableViewStyle
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getTableViewStyle()
     * @generated
     */
    EEnum TABLE_VIEW_STYLE = eINSTANCE.getTableViewStyle();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.CellType <em>Cell Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.CellType
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCellType()
     * @generated
     */
    EEnum CELL_TYPE = eINSTANCE.getCellType();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.CellAccessory <em>Cell Accessory</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.CellAccessory
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCellAccessory()
     * @generated
     */
    EEnum CELL_ACCESSORY = eINSTANCE.getCellAccessory();

  }

} //ApplauseDslPackage
