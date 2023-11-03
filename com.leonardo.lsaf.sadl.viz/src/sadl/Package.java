/**
 */
package sadl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sadl.Package#getName <em>Name</em>}</li>
 *   <li>{@link sadl.Package#getDescription <em>Description</em>}</li>
 *   <li>{@link sadl.Package#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see sadl.SadlPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject {
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see sadl.SadlPackage#getPackage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link sadl.Package#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see sadl.SadlPackage#getPackage_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link sadl.Package#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
   * The list contents are of type {@link sadl.PackageableElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contents</em>' containment reference list.
   * @see sadl.SadlPackage#getPackage_Contents()
   * @model containment="true"
   * @generated
   */
  EList<PackageableElement> getContents();

} // Package
