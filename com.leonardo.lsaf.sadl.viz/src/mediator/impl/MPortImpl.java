/**
 */
package mediator.impl;

import java.util.Collection;

import mediator.MNode;
import mediator.MPort;
import mediator.MediatorPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sadl.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MPort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mediator.impl.MPortImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link mediator.impl.MPortImpl#getNumberOfIncomingOutgoingPorts <em>Number Of Incoming Outgoing Ports</em>}</li>
 *   <li>{@link mediator.impl.MPortImpl#getSide <em>Side</em>}</li>
 *   <li>{@link mediator.impl.MPortImpl#getSubPorts <em>Sub Ports</em>}</li>
 *   <li>{@link mediator.impl.MPortImpl#getNode <em>Node</em>}</li>
 *   <li>{@link mediator.impl.MPortImpl#getRootPort <em>Root Port</em>}</li>
 *   <li>{@link mediator.impl.MPortImpl#getParentPort <em>Parent Port</em>}</li>
 *   <li>{@link mediator.impl.MPortImpl#getSadlPort <em>Sadl Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MPortImpl extends MConnectableElementImpl implements MPort {
  /**
   * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOffset()
   * @generated
   * @ordered
   */
  protected static final int OFFSET_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOffset()
   * @generated
   * @ordered
   */
  protected int offset = OFFSET_EDEFAULT;

  /**
   * The default value of the '{@link #getNumberOfIncomingOutgoingPorts() <em>Number Of Incoming Outgoing Ports</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberOfIncomingOutgoingPorts()
   * @generated
   * @ordered
   */
  protected static final int NUMBER_OF_INCOMING_OUTGOING_PORTS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumberOfIncomingOutgoingPorts() <em>Number Of Incoming Outgoing Ports</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberOfIncomingOutgoingPorts()
   * @generated
   * @ordered
   */
  protected int numberOfIncomingOutgoingPorts = NUMBER_OF_INCOMING_OUTGOING_PORTS_EDEFAULT;

  /**
   * The default value of the '{@link #getSide() <em>Side</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSide()
   * @generated
   * @ordered
   */
  protected static final String SIDE_EDEFAULT = "EAST";

  /**
   * The cached value of the '{@link #getSide() <em>Side</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSide()
   * @generated
   * @ordered
   */
  protected String side = SIDE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSubPorts() <em>Sub Ports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubPorts()
   * @generated
   * @ordered
   */
  protected EList<MPort> subPorts;

  /**
   * The cached value of the '{@link #getNode() <em>Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNode()
   * @generated
   * @ordered
   */
  protected MNode node;

  /**
   * The cached value of the '{@link #getRootPort() <em>Root Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRootPort()
   * @generated
   * @ordered
   */
  protected MPort rootPort;

  /**
   * The cached value of the '{@link #getParentPort() <em>Parent Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParentPort()
   * @generated
   * @ordered
   */
  protected MPort parentPort;

  /**
   * The cached value of the '{@link #getSadlPort() <em>Sadl Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSadlPort()
   * @generated
   * @ordered
   */
  protected com.leonardo.lsaf.sadl.sadl.Port sadlPort;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MPortImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return MediatorPackage.Literals.MPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getOffset() {
    return offset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOffset(int newOffset) {
    int oldOffset = offset;
    offset = newOffset;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.MPORT__OFFSET, oldOffset, offset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getNumberOfIncomingOutgoingPorts() {
    return numberOfIncomingOutgoingPorts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNumberOfIncomingOutgoingPorts(int newNumberOfIncomingOutgoingPorts) {
    int oldNumberOfIncomingOutgoingPorts = numberOfIncomingOutgoingPorts;
    numberOfIncomingOutgoingPorts = newNumberOfIncomingOutgoingPorts;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.MPORT__NUMBER_OF_INCOMING_OUTGOING_PORTS, oldNumberOfIncomingOutgoingPorts, numberOfIncomingOutgoingPorts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSide() {
    return side;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSide(String newSide) {
    String oldSide = side;
    side = newSide;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.MPORT__SIDE, oldSide, side));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<MPort> getSubPorts() {
    if (subPorts == null) {
      subPorts = new EObjectContainmentEList<MPort>(MPort.class, this, MediatorPackage.MPORT__SUB_PORTS);
    }
    return subPorts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MNode getNode() {
    if (node != null && node.eIsProxy()) {
      InternalEObject oldNode = (InternalEObject)node;
      node = (MNode)eResolveProxy(oldNode);
      if (node != oldNode) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MediatorPackage.MPORT__NODE, oldNode, node));
      }
    }
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MNode basicGetNode() {
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNode(MNode newNode) {
    MNode oldNode = node;
    node = newNode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.MPORT__NODE, oldNode, node));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MPort getRootPort() {
    if (rootPort != null && rootPort.eIsProxy()) {
      InternalEObject oldRootPort = (InternalEObject)rootPort;
      rootPort = (MPort)eResolveProxy(oldRootPort);
      if (rootPort != oldRootPort) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MediatorPackage.MPORT__ROOT_PORT, oldRootPort, rootPort));
      }
    }
    return rootPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MPort basicGetRootPort() {
    return rootPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRootPort(MPort newRootPort) {
    MPort oldRootPort = rootPort;
    rootPort = newRootPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.MPORT__ROOT_PORT, oldRootPort, rootPort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MPort getParentPort() {
    if (parentPort != null && parentPort.eIsProxy()) {
      InternalEObject oldParentPort = (InternalEObject)parentPort;
      parentPort = (MPort)eResolveProxy(oldParentPort);
      if (parentPort != oldParentPort) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MediatorPackage.MPORT__PARENT_PORT, oldParentPort, parentPort));
      }
    }
    return parentPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MPort basicGetParentPort() {
    return parentPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setParentPort(MPort newParentPort) {
    MPort oldParentPort = parentPort;
    parentPort = newParentPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.MPORT__PARENT_PORT, oldParentPort, parentPort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.Port getSadlPort() {
    if (sadlPort != null && sadlPort.eIsProxy()) {
      InternalEObject oldSadlPort = (InternalEObject)sadlPort;
      sadlPort = (com.leonardo.lsaf.sadl.sadl.Port)eResolveProxy(oldSadlPort);
      if (sadlPort != oldSadlPort) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MediatorPackage.MPORT__SADL_PORT, oldSadlPort, sadlPort));
      }
    }
    return sadlPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.leonardo.lsaf.sadl.sadl.Port basicGetSadlPort() {
    return sadlPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSadlPort(com.leonardo.lsaf.sadl.sadl.Port newSadlPort) {
    com.leonardo.lsaf.sadl.sadl.Port oldSadlPort = sadlPort;
    sadlPort = newSadlPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.MPORT__SADL_PORT, oldSadlPort, sadlPort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case MediatorPackage.MPORT__SUB_PORTS:
        return ((InternalEList<?>)getSubPorts()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case MediatorPackage.MPORT__OFFSET:
        return getOffset();
      case MediatorPackage.MPORT__NUMBER_OF_INCOMING_OUTGOING_PORTS:
        return getNumberOfIncomingOutgoingPorts();
      case MediatorPackage.MPORT__SIDE:
        return getSide();
      case MediatorPackage.MPORT__SUB_PORTS:
        return getSubPorts();
      case MediatorPackage.MPORT__NODE:
        if (resolve) return getNode();
        return basicGetNode();
      case MediatorPackage.MPORT__ROOT_PORT:
        if (resolve) return getRootPort();
        return basicGetRootPort();
      case MediatorPackage.MPORT__PARENT_PORT:
        if (resolve) return getParentPort();
        return basicGetParentPort();
      case MediatorPackage.MPORT__SADL_PORT:
        if (resolve) return getSadlPort();
        return basicGetSadlPort();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case MediatorPackage.MPORT__OFFSET:
        setOffset((Integer)newValue);
        return;
      case MediatorPackage.MPORT__NUMBER_OF_INCOMING_OUTGOING_PORTS:
        setNumberOfIncomingOutgoingPorts((Integer)newValue);
        return;
      case MediatorPackage.MPORT__SIDE:
        setSide((String)newValue);
        return;
      case MediatorPackage.MPORT__SUB_PORTS:
        getSubPorts().clear();
        getSubPorts().addAll((Collection<? extends MPort>)newValue);
        return;
      case MediatorPackage.MPORT__NODE:
        setNode((MNode)newValue);
        return;
      case MediatorPackage.MPORT__ROOT_PORT:
        setRootPort((MPort)newValue);
        return;
      case MediatorPackage.MPORT__PARENT_PORT:
        setParentPort((MPort)newValue);
        return;
      case MediatorPackage.MPORT__SADL_PORT:
        setSadlPort((com.leonardo.lsaf.sadl.sadl.Port)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case MediatorPackage.MPORT__OFFSET:
        setOffset(OFFSET_EDEFAULT);
        return;
      case MediatorPackage.MPORT__NUMBER_OF_INCOMING_OUTGOING_PORTS:
        setNumberOfIncomingOutgoingPorts(NUMBER_OF_INCOMING_OUTGOING_PORTS_EDEFAULT);
        return;
      case MediatorPackage.MPORT__SIDE:
        setSide(SIDE_EDEFAULT);
        return;
      case MediatorPackage.MPORT__SUB_PORTS:
        getSubPorts().clear();
        return;
      case MediatorPackage.MPORT__NODE:
        setNode((MNode)null);
        return;
      case MediatorPackage.MPORT__ROOT_PORT:
        setRootPort((MPort)null);
        return;
      case MediatorPackage.MPORT__PARENT_PORT:
        setParentPort((MPort)null);
        return;
      case MediatorPackage.MPORT__SADL_PORT:
        setSadlPort((com.leonardo.lsaf.sadl.sadl.Port)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case MediatorPackage.MPORT__OFFSET:
        return offset != OFFSET_EDEFAULT;
      case MediatorPackage.MPORT__NUMBER_OF_INCOMING_OUTGOING_PORTS:
        return numberOfIncomingOutgoingPorts != NUMBER_OF_INCOMING_OUTGOING_PORTS_EDEFAULT;
      case MediatorPackage.MPORT__SIDE:
        return SIDE_EDEFAULT == null ? side != null : !SIDE_EDEFAULT.equals(side);
      case MediatorPackage.MPORT__SUB_PORTS:
        return subPorts != null && !subPorts.isEmpty();
      case MediatorPackage.MPORT__NODE:
        return node != null;
      case MediatorPackage.MPORT__ROOT_PORT:
        return rootPort != null;
      case MediatorPackage.MPORT__PARENT_PORT:
        return parentPort != null;
      case MediatorPackage.MPORT__SADL_PORT:
        return sadlPort != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (offset: ");
    result.append(offset);
    result.append(", numberOfIncomingOutgoingPorts: ");
    result.append(numberOfIncomingOutgoingPorts);
    result.append(", side: ");
    result.append(side);
    result.append(')');
    return result.toString();
  }

} //MPortImpl
