/**
 */
package sadl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sadl.InterfacePort#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see sadl.SadlPackage#getInterfacePort()
 * @model
 * @generated
 */
public interface InterfacePort extends Port {
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Interface)
   * @see sadl.SadlPackage#getInterfacePort_Type()
   * @model
   * @generated
   */
  Interface getType();

  /**
   * Sets the value of the '{@link sadl.InterfacePort#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Interface value);

} // InterfacePort
