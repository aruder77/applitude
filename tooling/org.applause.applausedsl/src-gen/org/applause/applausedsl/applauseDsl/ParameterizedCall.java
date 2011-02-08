/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applausedsl.applauseDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterized Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.applausedsl.applauseDsl.ParameterizedCall#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.ParameterizedCall#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getParameterizedCall()
 * @model
 * @generated
 */
public interface ParameterizedCall extends EObject
{
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
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getParameterizedCall_Parameters()
   * @model containment="true"
   * @generated
   */
  ParameterValues getParameters();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.ParameterizedCall#getParameters <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameters</em>' containment reference.
   * @see #getParameters()
   * @generated
   */
  void setParameters(ParameterValues value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(ParameterizedModelElement)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getParameterizedCall_Target()
   * @model
   * @generated
   */
  ParameterizedModelElement getTarget();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.ParameterizedCall#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(ParameterizedModelElement value);

} // ParameterizedCall
