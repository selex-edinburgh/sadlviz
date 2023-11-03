/**
 */
package sadl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sadl.Topic#getDescription <em>Description</em>}</li>
 *   <li>{@link sadl.Topic#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see sadl.SadlPackage#getTopic()
 * @model
 * @generated
 */
public interface Topic extends Type {
  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see sadl.SadlPackage#getTopic_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link sadl.Topic#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link sadl.Attribute}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see sadl.SadlPackage#getTopic_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

} // Topic
