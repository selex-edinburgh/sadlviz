/**
 */
package sadl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sadl.Application#getDescription <em>Description</em>}</li>
 *   <li>{@link sadl.Application#getContainerInstances <em>Container Instances</em>}</li>
 * </ul>
 *
 * @see sadl.SadlPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends PackageableElement {
  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see sadl.SadlPackage#getApplication_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link sadl.Application#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Container Instances</b></em>' containment reference list.
   * The list contents are of type {@link sadl.ContainerInstance}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Container Instances</em>' containment reference list.
   * @see sadl.SadlPackage#getApplication_ContainerInstances()
   * @model containment="true"
   * @generated
   */
  EList<ContainerInstance> getContainerInstances();

} // Application
