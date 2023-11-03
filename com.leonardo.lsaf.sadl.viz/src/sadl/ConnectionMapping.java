/**
 */
package sadl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sadl.ConnectionMapping#getLink <em>Link</em>}</li>
 *   <li>{@link sadl.ConnectionMapping#getConnection <em>Connection</em>}</li>
 * </ul>
 *
 * @see sadl.SadlPackage#getConnectionMapping()
 * @model
 * @generated
 */
public interface ConnectionMapping extends EObject {
  /**
   * Returns the value of the '<em><b>Link</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link</em>' reference.
   * @see #setLink(Link)
   * @see sadl.SadlPackage#getConnectionMapping_Link()
   * @model
   * @generated
   */
  Link getLink();

  /**
   * Sets the value of the '{@link sadl.ConnectionMapping#getLink <em>Link</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Link</em>' reference.
   * @see #getLink()
   * @generated
   */
  void setLink(Link value);

  /**
   * Returns the value of the '<em><b>Connection</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connection</em>' reference.
   * @see #setConnection(Connection)
   * @see sadl.SadlPackage#getConnectionMapping_Connection()
   * @model
   * @generated
   */
  Connection getConnection();

  /**
   * Sets the value of the '{@link sadl.ConnectionMapping#getConnection <em>Connection</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Connection</em>' reference.
   * @see #getConnection()
   * @generated
   */
  void setConnection(Connection value);

} // ConnectionMapping
