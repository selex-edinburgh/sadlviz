/**
 */
package sadl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sadl.Port#getName <em>Name</em>}</li>
 *   <li>{@link sadl.Port#isConjugated <em>Conjugated</em>}</li>
 * </ul>
 *
 * @see sadl.SadlPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject {
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see sadl.SadlPackage#getPort_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link sadl.Port#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Conjugated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conjugated</em>' attribute.
   * @see #setConjugated(boolean)
   * @see sadl.SadlPackage#getPort_Conjugated()
   * @model
   * @generated
   */
  boolean isConjugated();

  /**
   * Sets the value of the '{@link sadl.Port#isConjugated <em>Conjugated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conjugated</em>' attribute.
   * @see #isConjugated()
   * @generated
   */
  void setConjugated(boolean value);

} // Port
