/**
 */
package sadl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumerator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sadl.Enumerator#isDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link sadl.Enumerator#getName <em>Name</em>}</li>
 *   <li>{@link sadl.Enumerator#getValue <em>Value</em>}</li>
 *   <li>{@link sadl.Enumerator#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see sadl.SadlPackage#getEnumerator()
 * @model
 * @generated
 */
public interface Enumerator extends EObject {
  /**
   * Returns the value of the '<em><b>Deprecated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deprecated</em>' attribute.
   * @see #setDeprecated(boolean)
   * @see sadl.SadlPackage#getEnumerator_Deprecated()
   * @model
   * @generated
   */
  boolean isDeprecated();

  /**
   * Sets the value of the '{@link sadl.Enumerator#isDeprecated <em>Deprecated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deprecated</em>' attribute.
   * @see #isDeprecated()
   * @generated
   */
  void setDeprecated(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see sadl.SadlPackage#getEnumerator_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link sadl.Enumerator#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see sadl.SadlPackage#getEnumerator_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link sadl.Enumerator#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see sadl.SadlPackage#getEnumerator_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link sadl.Enumerator#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // Enumerator
