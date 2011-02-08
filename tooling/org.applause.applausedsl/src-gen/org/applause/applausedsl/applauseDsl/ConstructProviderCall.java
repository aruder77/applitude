/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applausedsl.applauseDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Construct Provider Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.applausedsl.applauseDsl.ConstructProviderCall#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.ConstructProviderCall#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getConstructProviderCall()
 * @model
 * @generated
 */
public interface ConstructProviderCall extends ScalarExpression, CollectionExpression
{
  /**
   * Returns the value of the '<em><b>Provider</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provider</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provider</em>' reference.
   * @see #setProvider(ContentProvider)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getConstructProviderCall_Provider()
   * @model
   * @generated
   */
  ContentProvider getProvider();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.ConstructProviderCall#getProvider <em>Provider</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Provider</em>' reference.
   * @see #getProvider()
   * @generated
   */
  void setProvider(ContentProvider value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference.
   * @see #setParameters(ParameterValues)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getConstructProviderCall_Parameters()
   * @model containment="true"
   * @generated
   */
  ParameterValues getParameters();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.ConstructProviderCall#getParameters <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameters</em>' containment reference.
   * @see #getParameters()
   * @generated
   */
  void setParameters(ParameterValues value);

} // ConstructProviderCall
