/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applausedsl.applauseDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage
 * @generated
 */
public interface ApplauseDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ApplauseDslFactory eINSTANCE = org.applause.applausedsl.applauseDsl.impl.ApplauseDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Application</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application</em>'.
   * @generated
   */
  Application createApplication();

  /**
   * Returns a new object of class '<em>Model Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Element</em>'.
   * @generated
   */
  ModelElement createModelElement();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Simple Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Type</em>'.
   * @generated
   */
  SimpleType createSimpleType();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Reference</em>'.
   * @generated
   */
  TypeReference createTypeReference();

  /**
   * Returns a new object of class '<em>Project Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Project Class</em>'.
   * @generated
   */
  ProjectClass createProjectClass();

  /**
   * Returns a new object of class '<em>Scope Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scope Name</em>'.
   * @generated
   */
  ScopeName createScopeName();

  /**
   * Returns a new object of class '<em>Typed Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Typed Name</em>'.
   * @generated
   */
  TypedName createTypedName();

  /**
   * Returns a new object of class '<em>Object Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Reference</em>'.
   * @generated
   */
  ObjectReference createObjectReference();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Scalar Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scalar Expression</em>'.
   * @generated
   */
  ScalarExpression createScalarExpression();

  /**
   * Returns a new object of class '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Literal</em>'.
   * @generated
   */
  StringLiteral createStringLiteral();

  /**
   * Returns a new object of class '<em>String Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Function</em>'.
   * @generated
   */
  StringFunction createStringFunction();

  /**
   * Returns a new object of class '<em>Collection Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Collection Expression</em>'.
   * @generated
   */
  CollectionExpression createCollectionExpression();

  /**
   * Returns a new object of class '<em>Collection Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Collection Literal</em>'.
   * @generated
   */
  CollectionLiteral createCollectionLiteral();

  /**
   * Returns a new object of class '<em>Collection Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Collection Function</em>'.
   * @generated
   */
  CollectionFunction createCollectionFunction();

  /**
   * Returns a new object of class '<em>Collection Iterator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Collection Iterator</em>'.
   * @generated
   */
  CollectionIterator createCollectionIterator();

  /**
   * Returns a new object of class '<em>Content Provider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Content Provider</em>'.
   * @generated
   */
  ContentProvider createContentProvider();

  /**
   * Returns a new object of class '<em>Content Provider Implementation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Content Provider Implementation</em>'.
   * @generated
   */
  ContentProviderImplementation createContentProviderImplementation();

  /**
   * Returns a new object of class '<em>Url Content Provider Implementation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Url Content Provider Implementation</em>'.
   * @generated
   */
  UrlContentProviderImplementation createUrlContentProviderImplementation();

  /**
   * Returns a new object of class '<em>Custom Content Provider Implementation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Custom Content Provider Implementation</em>'.
   * @generated
   */
  CustomContentProviderImplementation createCustomContentProviderImplementation();

  /**
   * Returns a new object of class '<em>Provider Construction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Provider Construction</em>'.
   * @generated
   */
  ProviderConstruction createProviderConstruction();

  /**
   * Returns a new object of class '<em>View</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>View</em>'.
   * @generated
   */
  View createView();

  /**
   * Returns a new object of class '<em>Tab View</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tab View</em>'.
   * @generated
   */
  TabView createTabView();

  /**
   * Returns a new object of class '<em>Tab</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tab</em>'.
   * @generated
   */
  Tab createTab();

  /**
   * Returns a new object of class '<em>Table View</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table View</em>'.
   * @generated
   */
  TableView createTableView();

  /**
   * Returns a new object of class '<em>View Content Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>View Content Element</em>'.
   * @generated
   */
  ViewContentElement createViewContentElement();

  /**
   * Returns a new object of class '<em>Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Section</em>'.
   * @generated
   */
  Section createSection();

  /**
   * Returns a new object of class '<em>Cell</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cell</em>'.
   * @generated
   */
  Cell createCell();

  /**
   * Returns a new object of class '<em>Custom View</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Custom View</em>'.
   * @generated
   */
  CustomView createCustomView();

  /**
   * Returns a new object of class '<em>View Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>View Action</em>'.
   * @generated
   */
  ViewAction createViewAction();

  /**
   * Returns a new object of class '<em>View Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>View Call</em>'.
   * @generated
   */
  ViewCall createViewCall();

  /**
   * Returns a new object of class '<em>Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selector</em>'.
   * @generated
   */
  Selector createSelector();

  /**
   * Returns a new object of class '<em>External Open</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External Open</em>'.
   * @generated
   */
  ExternalOpen createExternalOpen();

  /**
   * Returns a new object of class '<em>String Concat</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Concat</em>'.
   * @generated
   */
  StringConcat createStringConcat();

  /**
   * Returns a new object of class '<em>String Replace</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Replace</em>'.
   * @generated
   */
  StringReplace createStringReplace();

  /**
   * Returns a new object of class '<em>String Url Conform</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Url Conform</em>'.
   * @generated
   */
  StringUrlConform createStringUrlConform();

  /**
   * Returns a new object of class '<em>String Split</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Split</em>'.
   * @generated
   */
  StringSplit createStringSplit();

  /**
   * Returns a new object of class '<em>Complex Provider Construction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Complex Provider Construction</em>'.
   * @generated
   */
  ComplexProviderConstruction createComplexProviderConstruction();

  /**
   * Returns a new object of class '<em>Simple Provider Construction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Provider Construction</em>'.
   * @generated
   */
  SimpleProviderConstruction createSimpleProviderConstruction();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ApplauseDslPackage getApplauseDslPackage();

} //ApplauseDslFactory
