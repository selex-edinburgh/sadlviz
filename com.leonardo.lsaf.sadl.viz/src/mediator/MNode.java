/**
 */
package mediator;

import org.eclipse.emf.common.util.EList;

import sadl.PackageableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MNode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mediator.MNode#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link mediator.MNode#getChildren <em>Children</em>}</li>
 *   <li>{@link mediator.MNode#getParent <em>Parent</em>}</li>
 *   <li>{@link mediator.MNode#getEdges <em>Edges</em>}</li>
 *   <li>{@link mediator.MNode#getEastPorts <em>East Ports</em>}</li>
 *   <li>{@link mediator.MNode#getWestPorts <em>West Ports</em>}</li>
 *   <li>{@link mediator.MNode#getPackageableElement <em>Packageable Element</em>}</li>
 * </ul>
 *
 * @see mediator.MediatorPackage#getMNode()
 * @model
 * @generated
 */
public interface MNode extends MConnectableElement {
  /**
   * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Algorithm</em>' attribute.
   * @see #setAlgorithm(String)
   * @see mediator.MediatorPackage#getMNode_Algorithm()
   * @model
   * @generated
   */
  String getAlgorithm();

  /**
   * Sets the value of the '{@link mediator.MNode#getAlgorithm <em>Algorithm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Algorithm</em>' attribute.
   * @see #getAlgorithm()
   * @generated
   */
  void setAlgorithm(String value);

  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link mediator.MNode}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see mediator.MediatorPackage#getMNode_Children()
   * @model containment="true"
   * @generated
   */
  EList<MNode> getChildren();

  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(MNode)
   * @see mediator.MediatorPackage#getMNode_Parent()
   * @model
   * @generated
   */
  MNode getParent();

  /**
   * Sets the value of the '{@link mediator.MNode#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(MNode value);

  /**
   * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
   * The list contents are of type {@link mediator.MEdge}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Edges</em>' containment reference list.
   * @see mediator.MediatorPackage#getMNode_Edges()
   * @model containment="true"
   * @generated
   */
  EList<MEdge> getEdges();

  /**
   * Returns the value of the '<em><b>East Ports</b></em>' containment reference list.
   * The list contents are of type {@link mediator.MPort}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>East Ports</em>' containment reference list.
   * @see mediator.MediatorPackage#getMNode_EastPorts()
   * @model containment="true"
   * @generated
   */
  EList<MPort> getEastPorts();

  /**
   * Returns the value of the '<em><b>West Ports</b></em>' containment reference list.
   * The list contents are of type {@link mediator.MPort}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>West Ports</em>' containment reference list.
   * @see mediator.MediatorPackage#getMNode_WestPorts()
   * @model containment="true"
   * @generated
   */
  EList<MPort> getWestPorts();

  /**
   * Returns the value of the '<em><b>Packageable Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Packageable Element</em>' reference.
   * @see #setPackageableElement(PackageableElement)
   * @see mediator.MediatorPackage#getMNode_PackageableElement()
   * @model
   * @generated
   */
  PackageableElement getPackageableElement();

  /**
   * Sets the value of the '{@link mediator.MNode#getPackageableElement <em>Packageable Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Packageable Element</em>' reference.
   * @see #getPackageableElement()
   * @generated
   */
  void setPackageableElement(PackageableElement value);

} // MNode
