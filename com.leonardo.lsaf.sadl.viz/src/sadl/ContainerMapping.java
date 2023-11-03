/**
 */
package sadl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sadl.ContainerMapping#getProcessor <em>Processor</em>}</li>
 *   <li>{@link sadl.ContainerMapping#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see sadl.SadlPackage#getContainerMapping()
 * @model
 * @generated
 */
public interface ContainerMapping extends EObject {
  /**
   * Returns the value of the '<em><b>Processor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Processor</em>' reference.
   * @see #setProcessor(Processor)
   * @see sadl.SadlPackage#getContainerMapping_Processor()
   * @model
   * @generated
   */
  Processor getProcessor();

  /**
   * Sets the value of the '{@link sadl.ContainerMapping#getProcessor <em>Processor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Processor</em>' reference.
   * @see #getProcessor()
   * @generated
   */
  void setProcessor(Processor value);

  /**
   * Returns the value of the '<em><b>Container</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Container</em>' reference.
   * @see #setContainer(Container)
   * @see sadl.SadlPackage#getContainerMapping_Container()
   * @model
   * @generated
   */
  Container getContainer();

  /**
   * Sets the value of the '{@link sadl.ContainerMapping#getContainer <em>Container</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Container</em>' reference.
   * @see #getContainer()
   * @generated
   */
  void setContainer(Container value);

} // ContainerMapping
