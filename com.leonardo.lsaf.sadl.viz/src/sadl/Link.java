/**
 */
package sadl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sadl.Link#getName <em>Name</em>}</li>
 *   <li>{@link sadl.Link#getDescription <em>Description</em>}</li>
 *   <li>{@link sadl.Link#getProcessors <em>Processors</em>}</li>
 *   <li>{@link sadl.Link#getTransport <em>Transport</em>}</li>
 *   <li>{@link sadl.Link#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see sadl.SadlPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject {
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see sadl.SadlPackage#getLink_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link sadl.Link#getName <em>Name</em>}' attribute.
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
   * @see sadl.SadlPackage#getLink_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link sadl.Link#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Processors</b></em>' reference list.
   * The list contents are of type {@link sadl.Processor}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Processors</em>' reference list.
   * @see sadl.SadlPackage#getLink_Processors()
   * @model
   * @generated
   */
  EList<Processor> getProcessors();

  /**
   * Returns the value of the '<em><b>Transport</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transport</em>' reference.
   * @see #setTransport(Transport)
   * @see sadl.SadlPackage#getLink_Transport()
   * @model
   * @generated
   */
  Transport getTransport();

  /**
   * Sets the value of the '{@link sadl.Link#getTransport <em>Transport</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transport</em>' reference.
   * @see #getTransport()
   * @generated
   */
  void setTransport(Transport value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference list.
   * The list contents are of type {@link sadl.PropertyValue}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference list.
   * @see sadl.SadlPackage#getLink_Value()
   * @model containment="true"
   * @generated
   */
  EList<PropertyValue> getValue();

} // Link
