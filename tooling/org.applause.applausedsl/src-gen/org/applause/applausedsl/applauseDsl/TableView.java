/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applausedsl.applauseDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.applausedsl.applauseDsl.TableView#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.TableView#getTitle <em>Title</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.TableView#getTitleImage <em>Title Image</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.TableView#getStyle <em>Style</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.TableView#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getTableView()
 * @model
 * @generated
 */
public interface TableView extends View
{
  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link org.applause.applausedsl.applauseDsl.Assignment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getTableView_Variables()
   * @model containment="true"
   * @generated
   */
  EList<Assignment> getVariables();

  /**
   * Returns the value of the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' containment reference.
   * @see #setTitle(ScalarExpression)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getTableView_Title()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getTitle();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.TableView#getTitle <em>Title</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' containment reference.
   * @see #getTitle()
   * @generated
   */
  void setTitle(ScalarExpression value);

  /**
   * Returns the value of the '<em><b>Title Image</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title Image</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title Image</em>' containment reference.
   * @see #setTitleImage(ScalarExpression)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getTableView_TitleImage()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getTitleImage();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.TableView#getTitleImage <em>Title Image</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title Image</em>' containment reference.
   * @see #getTitleImage()
   * @generated
   */
  void setTitleImage(ScalarExpression value);

  /**
   * Returns the value of the '<em><b>Style</b></em>' attribute.
   * The literals are from the enumeration {@link org.applause.applausedsl.applauseDsl.TableViewStyle}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style</em>' attribute.
   * @see org.applause.applausedsl.applauseDsl.TableViewStyle
   * @see #setStyle(TableViewStyle)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getTableView_Style()
   * @model
   * @generated
   */
  TableViewStyle getStyle();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.TableView#getStyle <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' attribute.
   * @see org.applause.applausedsl.applauseDsl.TableViewStyle
   * @see #getStyle()
   * @generated
   */
  void setStyle(TableViewStyle value);

  /**
   * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
   * The list contents are of type {@link org.applause.applausedsl.applauseDsl.Section}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sections</em>' containment reference list.
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getTableView_Sections()
   * @model containment="true"
   * @generated
   */
  EList<Section> getSections();

} // TableView
