/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applausedsl.applauseDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.applausedsl.applauseDsl.TypedName#getTypeRef <em>Type Ref</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.TypedName#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getTypedName()
 * @model
 * @generated
 */
public interface TypedName extends ScopeName
{
  /**
   * Returns the value of the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Ref</em>' containment reference.
   * @see #setTypeRef(TypeReference)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getTypedName_TypeRef()
   * @model containment="true"
   * @generated
   */
  TypeReference getTypeRef();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.TypedName#getTypeRef <em>Type Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Ref</em>' containment reference.
   * @see #getTypeRef()
   * @generated
   */
  void setTypeRef(TypeReference value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(ProviderConstruction)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getTypedName_Value()
   * @model containment="true"
   * @generated
   */
  ProviderConstruction getValue();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.TypedName#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ProviderConstruction value);

} // TypedName
