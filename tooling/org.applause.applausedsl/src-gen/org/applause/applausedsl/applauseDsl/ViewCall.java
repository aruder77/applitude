/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applausedsl.applauseDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.applausedsl.applauseDsl.ViewCall#getView <em>View</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.ViewCall#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getViewCall()
 * @model
 * @generated
 */
public interface ViewCall extends ViewAction
{
  /**
   * Returns the value of the '<em><b>View</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>View</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>View</em>' reference.
   * @see #setView(View)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getViewCall_View()
   * @model
   * @generated
   */
  View getView();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.ViewCall#getView <em>View</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>View</em>' reference.
   * @see #getView()
   * @generated
   */
  void setView(View value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference.
   * @see #setParameter(ProviderConstruction)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getViewCall_Parameter()
   * @model containment="true"
   * @generated
   */
  ProviderConstruction getParameter();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.ViewCall#getParameter <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' containment reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(ProviderConstruction value);

} // ViewCall
