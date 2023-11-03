/**
 */
package sadl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sadl.Strategy#getDescription <em>Description</em>}</li>
 *   <li>{@link sadl.Strategy#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see sadl.SadlPackage#getStrategy()
 * @model
 * @generated
 */
public interface Strategy extends PackageableElement {
  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see sadl.SadlPackage#getStrategy_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link sadl.Strategy#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link sadl.Property}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see sadl.SadlPackage#getStrategy_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

} // Strategy
