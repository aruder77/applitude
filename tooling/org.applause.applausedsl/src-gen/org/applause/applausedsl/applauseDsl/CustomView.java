/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applausedsl.applauseDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.applausedsl.applauseDsl.CustomView#getProjectClass <em>Project Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getCustomView()
 * @model
 * @generated
 */
public interface CustomView extends View
{
  /**
   * Returns the value of the '<em><b>Project Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Project Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Project Class</em>' containment reference.
   * @see #setProjectClass(ProjectClass)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getCustomView_ProjectClass()
   * @model containment="true"
   * @generated
   */
  ProjectClass getProjectClass();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.CustomView#getProjectClass <em>Project Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Project Class</em>' containment reference.
   * @see #getProjectClass()
   * @generated
   */
  void setProjectClass(ProjectClass value);

} // CustomView
