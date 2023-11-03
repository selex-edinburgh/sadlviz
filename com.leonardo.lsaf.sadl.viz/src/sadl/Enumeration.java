/**
 */
package sadl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sadl.Enumeration#getDescription <em>Description</em>}</li>
 *   <li>{@link sadl.Enumeration#getEnumerators <em>Enumerators</em>}</li>
 * </ul>
 *
 * @see sadl.SadlPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends Type {
  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see sadl.SadlPackage#getEnumeration_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link sadl.Enumeration#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Enumerators</b></em>' containment reference list.
   * The list contents are of type {@link sadl.Enumerator}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumerators</em>' containment reference list.
   * @see sadl.SadlPackage#getEnumeration_Enumerators()
   * @model containment="true"
   * @generated
   */
  EList<Enumerator> getEnumerators();

} // Enumeration
