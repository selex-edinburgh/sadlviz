/**
 */
package sadl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sadl.Transport#getDescription <em>Description</em>}</li>
 *   <li>{@link sadl.Transport#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see sadl.SadlPackage#getTransport()
 * @model
 * @generated
 */
public interface Transport extends PackageableElement {
  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see sadl.SadlPackage#getTransport_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link sadl.Transport#getDescription <em>Description</em>}' attribute.
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
   * @see sadl.SadlPackage#getTransport_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

} // Transport
