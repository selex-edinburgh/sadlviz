/**
 */
package mediator.impl;

import java.util.Collection;

import mediator.MEdge;
import mediator.MNode;
import mediator.MPort;
import mediator.MediatorPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sadl.PackageableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MNode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mediator.impl.MNodeImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link mediator.impl.MNodeImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link mediator.impl.MNodeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link mediator.impl.MNodeImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link mediator.impl.MNodeImpl#getEastPorts <em>East Ports</em>}</li>
 *   <li>{@link mediator.impl.MNodeImpl#getWestPorts <em>West Ports</em>}</li>
 *   <li>{@link mediator.impl.MNodeImpl#getSadlContainer <em>Sadl Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MNodeImpl extends MConnectableElementImpl implements MNode {
  /**
   * The default value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlgorithm()
   * @generated
   * @ordered
   */
  protected static final String ALGORITHM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlgorithm()
   * @generated
   * @ordered
   */
  protected String algorithm = ALGORITHM_EDEFAULT;

  /**
   * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
  protected EList<MNode> children;

  /**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected MNode parent;

  /**
   * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEdges()
   * @generated
   * @ordered
   */
  protected EList<MEdge> edges;

  /**
   * The cached value of the '{@link #getEastPorts() <em>East Ports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEastPorts()
   * @generated
   * @ordered
   */
  protected EList<MPort> eastPorts;

  /**
   * The cached value of the '{@link #getWestPorts() <em>West Ports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWestPorts()
   * @generated
   * @ordered
   */
  protected EList<MPort> westPorts;

  /**
   * The cached value of the '{@link #getSadlContainer() <em>Sadl Container</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSadlContainer()
   * @generated
   * @ordered
   */
  protected EObject sadlContainer;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MNodeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return MediatorPackage.Literals.MNODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAlgorithm() {
    return algorithm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAlgorithm(String newAlgorithm) {
    String oldAlgorithm = algorithm;
    algorithm = newAlgorithm;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.MNODE__ALGORITHM, oldAlgorithm, algorithm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<MNode> getChildren() {
    if (children == null) {
      children = new EObjectContainmentEList<MNode>(MNode.class, this, MediatorPackage.MNODE__CHILDREN);
    }
    return children;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MNode getParent() {
    if (parent != null && parent.eIsProxy()) {
      InternalEObject oldParent = (InternalEObject)parent;
      parent = (MNode)eResolveProxy(oldParent);
      if (parent != oldParent) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MediatorPackage.MNODE__PARENT, oldParent, parent));
      }
    }
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MNode basicGetParent() {
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setParent(MNode newParent) {
    MNode oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.MNODE__PARENT, oldParent, parent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<MEdge> getEdges() {
    if (edges == null) {
      edges = new EObjectContainmentEList<MEdge>(MEdge.class, this, MediatorPackage.MNODE__EDGES);
    }
    return edges;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<MPort> getEastPorts() {
    if (eastPorts == null) {
      eastPorts = new EObjectContainmentEList<MPort>(MPort.class, this, MediatorPackage.MNODE__EAST_PORTS);
    }
    return eastPorts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<MPort> getWestPorts() {
    if (westPorts == null) {
      westPorts = new EObjectContainmentEList<MPort>(MPort.class, this, MediatorPackage.MNODE__WEST_PORTS);
    }
    return westPorts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject getSadlContainer() {
    if (sadlContainer != null && sadlContainer.eIsProxy()) {
      InternalEObject oldSadlContainer = (InternalEObject)sadlContainer;
      sadlContainer = eResolveProxy(oldSadlContainer);
      if (sadlContainer != oldSadlContainer) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MediatorPackage.MNODE__SADL_CONTAINER, oldSadlContainer, sadlContainer));
      }
    }
    return sadlContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject basicGetSadlContainer() {
    return sadlContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSadlContainer(EObject newSadlContainer) {
    EObject oldSadlContainer = sadlContainer;
    sadlContainer = newSadlContainer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.MNODE__SADL_CONTAINER, oldSadlContainer, sadlContainer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case MediatorPackage.MNODE__CHILDREN:
        return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
      case MediatorPackage.MNODE__EDGES:
        return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
      case MediatorPackage.MNODE__EAST_PORTS:
        return ((InternalEList<?>)getEastPorts()).basicRemove(otherEnd, msgs);
      case MediatorPackage.MNODE__WEST_PORTS:
        return ((InternalEList<?>)getWestPorts()).basicRemove(otherEnd, msgs);
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
      case MediatorPackage.MNODE__ALGORITHM:
        return getAlgorithm();
      case MediatorPackage.MNODE__CHILDREN:
        return getChildren();
      case MediatorPackage.MNODE__PARENT:
        if (resolve) return getParent();
        return basicGetParent();
      case MediatorPackage.MNODE__EDGES:
        return getEdges();
      case MediatorPackage.MNODE__EAST_PORTS:
        return getEastPorts();
      case MediatorPackage.MNODE__WEST_PORTS:
        return getWestPorts();
      case MediatorPackage.MNODE__SADL_CONTAINER:
        if (resolve) return getSadlContainer();
        return basicGetSadlContainer();
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
      case MediatorPackage.MNODE__ALGORITHM:
        setAlgorithm((String)newValue);
        return;
      case MediatorPackage.MNODE__CHILDREN:
        getChildren().clear();
        getChildren().addAll((Collection<? extends MNode>)newValue);
        return;
      case MediatorPackage.MNODE__PARENT:
        setParent((MNode)newValue);
        return;
      case MediatorPackage.MNODE__EDGES:
        getEdges().clear();
        getEdges().addAll((Collection<? extends MEdge>)newValue);
        return;
      case MediatorPackage.MNODE__EAST_PORTS:
        getEastPorts().clear();
        getEastPorts().addAll((Collection<? extends MPort>)newValue);
        return;
      case MediatorPackage.MNODE__WEST_PORTS:
        getWestPorts().clear();
        getWestPorts().addAll((Collection<? extends MPort>)newValue);
        return;
      case MediatorPackage.MNODE__SADL_CONTAINER:
        setSadlContainer((EObject)newValue);
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
      case MediatorPackage.MNODE__ALGORITHM:
        setAlgorithm(ALGORITHM_EDEFAULT);
        return;
      case MediatorPackage.MNODE__CHILDREN:
        getChildren().clear();
        return;
      case MediatorPackage.MNODE__PARENT:
        setParent((MNode)null);
        return;
      case MediatorPackage.MNODE__EDGES:
        getEdges().clear();
        return;
      case MediatorPackage.MNODE__EAST_PORTS:
        getEastPorts().clear();
        return;
      case MediatorPackage.MNODE__WEST_PORTS:
        getWestPorts().clear();
        return;
      case MediatorPackage.MNODE__SADL_CONTAINER:
        setSadlContainer((EObject)null);
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
      case MediatorPackage.MNODE__ALGORITHM:
        return ALGORITHM_EDEFAULT == null ? algorithm != null : !ALGORITHM_EDEFAULT.equals(algorithm);
      case MediatorPackage.MNODE__CHILDREN:
        return children != null && !children.isEmpty();
      case MediatorPackage.MNODE__PARENT:
        return parent != null;
      case MediatorPackage.MNODE__EDGES:
        return edges != null && !edges.isEmpty();
      case MediatorPackage.MNODE__EAST_PORTS:
        return eastPorts != null && !eastPorts.isEmpty();
      case MediatorPackage.MNODE__WEST_PORTS:
        return westPorts != null && !westPorts.isEmpty();
      case MediatorPackage.MNODE__SADL_CONTAINER:
        return sadlContainer != null;
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
    result.append(" (algorithm: ");
    result.append(algorithm);
    result.append(')');
    return result.toString();
  }

} //MNodeImpl
