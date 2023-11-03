/**
 */
package sadl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sadl.Container#getDescription <em>Description</em>}</li>
 *   <li>{@link sadl.Container#getComponentInstances <em>Component Instances</em>}</li>
 *   <li>{@link sadl.Container#getConnections <em>Connections</em>}</li>
 *   <li>{@link sadl.Container#getContainerInstances <em>Container Instances</em>}</li>
 * </ul>
 *
 * @see sadl.SadlPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends PackageableElement {
  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see sadl.SadlPackage#getContainer_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link sadl.Container#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Component Instances</b></em>' containment reference list.
   * The list contents are of type {@link sadl.ComponentInstance}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component Instances</em>' containment reference list.
   * @see sadl.SadlPackage#getContainer_ComponentInstances()
   * @model containment="true"
   * @generated
   */
  EList<ComponentInstance> getComponentInstances();

  /**
   * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
   * The list contents are of type {@link sadl.Connection}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connections</em>' containment reference list.
   * @see sadl.SadlPackage#getContainer_Connections()
   * @model containment="true"
   * @generated
   */
  EList<Connection> getConnections();

  /**
   * Returns the value of the '<em><b>Container Instances</b></em>' containment reference list.
   * The list contents are of type {@link sadl.ContainerInstance}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Container Instances</em>' containment reference list.
   * @see sadl.SadlPackage#getContainer_ContainerInstances()
   * @model containment="true"
   * @generated
   */
  EList<ContainerInstance> getContainerInstances();

} // Container
