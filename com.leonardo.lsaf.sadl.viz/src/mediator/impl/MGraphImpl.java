/**
 */
package mediator.impl;

import java.util.Collection;

import mediator.MEdge;
import mediator.MGraph;
import mediator.MNode;
import mediator.MediatorPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MGraph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mediator.impl.MGraphImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link mediator.impl.MGraphImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link mediator.impl.MGraphImpl#getEdges <em>Edges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MGraphImpl extends MElementImpl implements MGraph {
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
   * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodes()
   * @generated
   * @ordered
   */
  protected EList<MNode> nodes;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MGraphImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return MediatorPackage.Literals.MGRAPH;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.MGRAPH__ALGORITHM, oldAlgorithm, algorithm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<MNode> getNodes() {
    if (nodes == null) {
      nodes = new EObjectContainmentEList<MNode>(MNode.class, this, MediatorPackage.MGRAPH__NODES);
    }
    return nodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<MEdge> getEdges() {
    if (edges == null) {
      edges = new EObjectContainmentEList<MEdge>(MEdge.class, this, MediatorPackage.MGRAPH__EDGES);
    }
    return edges;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case MediatorPackage.MGRAPH__NODES:
        return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
      case MediatorPackage.MGRAPH__EDGES:
        return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
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
      case MediatorPackage.MGRAPH__ALGORITHM:
        return getAlgorithm();
      case MediatorPackage.MGRAPH__NODES:
        return getNodes();
      case MediatorPackage.MGRAPH__EDGES:
        return getEdges();
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
      case MediatorPackage.MGRAPH__ALGORITHM:
        setAlgorithm((String)newValue);
        return;
      case MediatorPackage.MGRAPH__NODES:
        getNodes().clear();
        getNodes().addAll((Collection<? extends MNode>)newValue);
        return;
      case MediatorPackage.MGRAPH__EDGES:
        getEdges().clear();
        getEdges().addAll((Collection<? extends MEdge>)newValue);
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
      case MediatorPackage.MGRAPH__ALGORITHM:
        setAlgorithm(ALGORITHM_EDEFAULT);
        return;
      case MediatorPackage.MGRAPH__NODES:
        getNodes().clear();
        return;
      case MediatorPackage.MGRAPH__EDGES:
        getEdges().clear();
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
      case MediatorPackage.MGRAPH__ALGORITHM:
        return ALGORITHM_EDEFAULT == null ? algorithm != null : !ALGORITHM_EDEFAULT.equals(algorithm);
      case MediatorPackage.MGRAPH__NODES:
        return nodes != null && !nodes.isEmpty();
      case MediatorPackage.MGRAPH__EDGES:
        return edges != null && !edges.isEmpty();
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

} //MGraphImpl
