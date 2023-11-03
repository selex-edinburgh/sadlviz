/**
 */
package sadl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sadl.Deployment#getDescription <em>Description</em>}</li>
 *   <li>{@link sadl.Deployment#getContainermapping <em>Containermapping</em>}</li>
 *   <li>{@link sadl.Deployment#getConnectionmapping <em>Connectionmapping</em>}</li>
 * </ul>
 *
 * @see sadl.SadlPackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends PackageableElement {
  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see sadl.SadlPackage#getDeployment_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link sadl.Deployment#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Containermapping</b></em>' containment reference list.
   * The list contents are of type {@link sadl.ContainerMapping}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Containermapping</em>' containment reference list.
   * @see sadl.SadlPackage#getDeployment_Containermapping()
   * @model containment="true"
   * @generated
   */
  EList<ContainerMapping> getContainermapping();

  /**
   * Returns the value of the '<em><b>Connectionmapping</b></em>' containment reference list.
   * The list contents are of type {@link sadl.ConnectionMapping}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connectionmapping</em>' containment reference list.
   * @see sadl.SadlPackage#getDeployment_Connectionmapping()
   * @model containment="true"
   * @generated
   */
  EList<ConnectionMapping> getConnectionmapping();

} // Deployment
