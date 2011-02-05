/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applausedsl.applauseDsl.impl;

import org.applause.applausedsl.applauseDsl.ApplauseDslPackage;
import org.applause.applausedsl.applauseDsl.ProviderConstruction;
import org.applause.applausedsl.applauseDsl.TypeReference;
import org.applause.applausedsl.applauseDsl.TypedName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.applause.applausedsl.applauseDsl.impl.TypedNameImpl#getTypeRef <em>Type Ref</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.impl.TypedNameImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypedNameImpl extends ScopeNameImpl implements TypedName
{
  /**
   * The cached value of the '{@link #getTypeRef() <em>Type Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeRef()
   * @generated
   * @ordered
   */
  protected TypeReference typeRef;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected ProviderConstruction value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypedNameImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ApplauseDslPackage.Literals.TYPED_NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReference getTypeRef()
  {
    return typeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeRef(TypeReference newTypeRef, NotificationChain msgs)
  {
    TypeReference oldTypeRef = typeRef;
    typeRef = newTypeRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.TYPED_NAME__TYPE_REF, oldTypeRef, newTypeRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeRef(TypeReference newTypeRef)
  {
    if (newTypeRef != typeRef)
    {
      NotificationChain msgs = null;
      if (typeRef != null)
        msgs = ((InternalEObject)typeRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.TYPED_NAME__TYPE_REF, null, msgs);
      if (newTypeRef != null)
        msgs = ((InternalEObject)newTypeRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.TYPED_NAME__TYPE_REF, null, msgs);
      msgs = basicSetTypeRef(newTypeRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.TYPED_NAME__TYPE_REF, newTypeRef, newTypeRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProviderConstruction getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(ProviderConstruction newValue, NotificationChain msgs)
  {
    ProviderConstruction oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.TYPED_NAME__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(ProviderConstruction newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.TYPED_NAME__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.TYPED_NAME__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.TYPED_NAME__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ApplauseDslPackage.TYPED_NAME__TYPE_REF:
        return basicSetTypeRef(null, msgs);
      case ApplauseDslPackage.TYPED_NAME__VALUE:
        return basicSetValue(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ApplauseDslPackage.TYPED_NAME__TYPE_REF:
        return getTypeRef();
      case ApplauseDslPackage.TYPED_NAME__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ApplauseDslPackage.TYPED_NAME__TYPE_REF:
        setTypeRef((TypeReference)newValue);
        return;
      case ApplauseDslPackage.TYPED_NAME__VALUE:
        setValue((ProviderConstruction)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ApplauseDslPackage.TYPED_NAME__TYPE_REF:
        setTypeRef((TypeReference)null);
        return;
      case ApplauseDslPackage.TYPED_NAME__VALUE:
        setValue((ProviderConstruction)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ApplauseDslPackage.TYPED_NAME__TYPE_REF:
        return typeRef != null;
      case ApplauseDslPackage.TYPED_NAME__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

} //TypedNameImpl
