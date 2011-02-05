/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applausedsl.applauseDsl.impl;

import org.applause.applausedsl.applauseDsl.ApplauseDslPackage;
import org.applause.applausedsl.applauseDsl.CustomView;
import org.applause.applausedsl.applauseDsl.ProjectClass;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.applause.applausedsl.applauseDsl.impl.CustomViewImpl#getProjectClass <em>Project Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomViewImpl extends ViewImpl implements CustomView
{
  /**
   * The cached value of the '{@link #getProjectClass() <em>Project Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjectClass()
   * @generated
   * @ordered
   */
  protected ProjectClass projectClass;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CustomViewImpl()
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
    return ApplauseDslPackage.Literals.CUSTOM_VIEW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectClass getProjectClass()
  {
    return projectClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProjectClass(ProjectClass newProjectClass, NotificationChain msgs)
  {
    ProjectClass oldProjectClass = projectClass;
    projectClass = newProjectClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.CUSTOM_VIEW__PROJECT_CLASS, oldProjectClass, newProjectClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProjectClass(ProjectClass newProjectClass)
  {
    if (newProjectClass != projectClass)
    {
      NotificationChain msgs = null;
      if (projectClass != null)
        msgs = ((InternalEObject)projectClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.CUSTOM_VIEW__PROJECT_CLASS, null, msgs);
      if (newProjectClass != null)
        msgs = ((InternalEObject)newProjectClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.CUSTOM_VIEW__PROJECT_CLASS, null, msgs);
      msgs = basicSetProjectClass(newProjectClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.CUSTOM_VIEW__PROJECT_CLASS, newProjectClass, newProjectClass));
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
      case ApplauseDslPackage.CUSTOM_VIEW__PROJECT_CLASS:
        return basicSetProjectClass(null, msgs);
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
      case ApplauseDslPackage.CUSTOM_VIEW__PROJECT_CLASS:
        return getProjectClass();
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
      case ApplauseDslPackage.CUSTOM_VIEW__PROJECT_CLASS:
        setProjectClass((ProjectClass)newValue);
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
      case ApplauseDslPackage.CUSTOM_VIEW__PROJECT_CLASS:
        setProjectClass((ProjectClass)null);
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
      case ApplauseDslPackage.CUSTOM_VIEW__PROJECT_CLASS:
        return projectClass != null;
    }
    return super.eIsSet(featureID);
  }

} //CustomViewImpl
