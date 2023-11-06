/**
 */
package mediator;

import org.eclipse.emf.common.util.EList;

import sadl.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MPort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mediator.MPort#getOffset <em>Offset</em>}</li>
 *   <li>{@link mediator.MPort#getNumberOfIncomingOutgoingPorts <em>Number Of Incoming Outgoing Ports</em>}</li>
 *   <li>{@link mediator.MPort#getSide <em>Side</em>}</li>
 *   <li>{@link mediator.MPort#getSubPorts <em>Sub Ports</em>}</li>
 *   <li>{@link mediator.MPort#getNode <em>Node</em>}</li>
 *   <li>{@link mediator.MPort#getRootPort <em>Root Port</em>}</li>
 *   <li>{@link mediator.MPort#getParentPort <em>Parent Port</em>}</li>
 *   <li>{@link mediator.MPort#getSadlPort <em>Sadl Port</em>}</li>
 * </ul>
 *
 * @see mediator.MediatorPackage#getMPort()
 * @model
 * @generated
 */
public interface MPort extends MConnectableElement {
  /**
   * Returns the value of the '<em><b>Offset</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Offset</em>' attribute.
   * @see #setOffset(int)
   * @see mediator.MediatorPackage#getMPort_Offset()
   * @model default="0"
   * @generated
   */
  int getOffset();

  /**
   * Sets the value of the '{@link mediator.MPort#getOffset <em>Offset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Offset</em>' attribute.
   * @see #getOffset()
   * @generated
   */
  void setOffset(int value);

  /**
   * Returns the value of the '<em><b>Number Of Incoming Outgoing Ports</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number Of Incoming Outgoing Ports</em>' attribute.
   * @see #setNumberOfIncomingOutgoingPorts(int)
   * @see mediator.MediatorPackage#getMPort_NumberOfIncomingOutgoingPorts()
   * @model default="0"
   * @generated
   */
  int getNumberOfIncomingOutgoingPorts();

  /**
   * Sets the value of the '{@link mediator.MPort#getNumberOfIncomingOutgoingPorts <em>Number Of Incoming Outgoing Ports</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number Of Incoming Outgoing Ports</em>' attribute.
   * @see #getNumberOfIncomingOutgoingPorts()
   * @generated
   */
  void setNumberOfIncomingOutgoingPorts(int value);

  /**
   * Returns the value of the '<em><b>Side</b></em>' attribute.
   * The default value is <code>"EAST"</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Side</em>' attribute.
   * @see #setSide(String)
   * @see mediator.MediatorPackage#getMPort_Side()
   * @model default="EAST"
   * @generated
   */
  String getSide();

  /**
   * Sets the value of the '{@link mediator.MPort#getSide <em>Side</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Side</em>' attribute.
   * @see #getSide()
   * @generated
   */
  void setSide(String value);

  /**
   * Returns the value of the '<em><b>Sub Ports</b></em>' containment reference list.
   * The list contents are of type {@link mediator.MPort}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Ports</em>' containment reference list.
   * @see mediator.MediatorPackage#getMPort_SubPorts()
   * @model containment="true"
   * @generated
   */
  EList<MPort> getSubPorts();

  /**
   * Returns the value of the '<em><b>Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node</em>' reference.
   * @see #setNode(MNode)
   * @see mediator.MediatorPackage#getMPort_Node()
   * @model
   * @generated
   */
  MNode getNode();

  /**
   * Sets the value of the '{@link mediator.MPort#getNode <em>Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node</em>' reference.
   * @see #getNode()
   * @generated
   */
  void setNode(MNode value);

  /**
   * Returns the value of the '<em><b>Root Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root Port</em>' reference.
   * @see #setRootPort(MPort)
   * @see mediator.MediatorPackage#getMPort_RootPort()
   * @model
   * @generated
   */
  MPort getRootPort();

  /**
   * Sets the value of the '{@link mediator.MPort#getRootPort <em>Root Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root Port</em>' reference.
   * @see #getRootPort()
   * @generated
   */
  void setRootPort(MPort value);

  /**
   * Returns the value of the '<em><b>Parent Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent Port</em>' reference.
   * @see #setParentPort(MPort)
   * @see mediator.MediatorPackage#getMPort_ParentPort()
   * @model
   * @generated
   */
  MPort getParentPort();

  /**
   * Sets the value of the '{@link mediator.MPort#getParentPort <em>Parent Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent Port</em>' reference.
   * @see #getParentPort()
   * @generated
   */
  void setParentPort(MPort value);

  /**
   * Returns the value of the '<em><b>Sadl Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sadl Port</em>' reference.
   * @see #setSadlPort(com.leonardo.lsaf.sadl.sadl.Port)
   * @see mediator.MediatorPackage#getMPort_SadlPort()
   * @model
   * @generated
   */
  com.leonardo.lsaf.sadl.sadl.Port getSadlPort();

  /**
   * Sets the value of the '{@link mediator.MPort#getSadlPort <em>Sadl Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sadl Port</em>' reference.
   * @see #getSadlPort()
   * @generated
   */
  void setSadlPort(com.leonardo.lsaf.sadl.sadl.Port value);

} // MPort
