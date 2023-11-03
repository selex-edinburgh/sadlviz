/**
 */
package sadl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sadl.Component#getDescription <em>Description</em>}</li>
 *   <li>{@link sadl.Component#getParts <em>Parts</em>}</li>
 *   <li>{@link sadl.Component#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see sadl.SadlPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends PackageableElement {
  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see sadl.SadlPackage#getComponent_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link sadl.Component#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
   * The list contents are of type {@link sadl.ComponentInstance}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parts</em>' containment reference list.
   * @see sadl.SadlPackage#getComponent_Parts()
   * @model containment="true"
   * @generated
   */
  EList<ComponentInstance> getParts();

  /**
   * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
   * The list contents are of type {@link sadl.Port}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ports</em>' containment reference list.
   * @see sadl.SadlPackage#getComponent_Ports()
   * @model containment="true"
   * @generated
   */
  EList<Port> getPorts();

} // Component
