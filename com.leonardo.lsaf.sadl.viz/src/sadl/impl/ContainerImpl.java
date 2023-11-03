/**
 */
package sadl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sadl.ComponentInstance;
import sadl.Connection;
import sadl.Container;
import sadl.ContainerInstance;
import sadl.SadlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sadl.impl.ContainerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link sadl.impl.ContainerImpl#getComponentInstances <em>Component Instances</em>}</li>
 *   <li>{@link sadl.impl.ContainerImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link sadl.impl.ContainerImpl#getContainerInstances <em>Container Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends PackageableElementImpl implements Container {
  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getComponentInstances() <em>Component Instances</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentInstances()
   * @generated
   * @ordered
   */
  protected EList<ComponentInstance> componentInstances;

  /**
   * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnections()
   * @generated
   * @ordered
   */
  protected EList<Connection> connections;

  /**
   * The cached value of the '{@link #getContainerInstances() <em>Container Instances</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainerInstances()
   * @generated
   * @ordered
   */
  protected EList<ContainerInstance> containerInstances;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContainerImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SadlPackage.Literals.CONTAINER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDescription() {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDescription(String newDescription) {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.CONTAINER__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ComponentInstance> getComponentInstances() {
    if (componentInstances == null) {
      componentInstances = new EObjectContainmentEList<ComponentInstance>(ComponentInstance.class, this, SadlPackage.CONTAINER__COMPONENT_INSTANCES);
    }
    return componentInstances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Connection> getConnections() {
    if (connections == null) {
      connections = new EObjectContainmentEList<Connection>(Connection.class, this, SadlPackage.CONTAINER__CONNECTIONS);
    }
    return connections;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ContainerInstance> getContainerInstances() {
    if (containerInstances == null) {
      containerInstances = new EObjectContainmentEList<ContainerInstance>(ContainerInstance.class, this, SadlPackage.CONTAINER__CONTAINER_INSTANCES);
    }
    return containerInstances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case SadlPackage.CONTAINER__COMPONENT_INSTANCES:
        return ((InternalEList<?>)getComponentInstances()).basicRemove(otherEnd, msgs);
      case SadlPackage.CONTAINER__CONNECTIONS:
        return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
      case SadlPackage.CONTAINER__CONTAINER_INSTANCES:
        return ((InternalEList<?>)getContainerInstances()).basicRemove(otherEnd, msgs);
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
      case SadlPackage.CONTAINER__DESCRIPTION:
        return getDescription();
      case SadlPackage.CONTAINER__COMPONENT_INSTANCES:
        return getComponentInstances();
      case SadlPackage.CONTAINER__CONNECTIONS:
        return getConnections();
      case SadlPackage.CONTAINER__CONTAINER_INSTANCES:
        return getContainerInstances();
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
      case SadlPackage.CONTAINER__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case SadlPackage.CONTAINER__COMPONENT_INSTANCES:
        getComponentInstances().clear();
        getComponentInstances().addAll((Collection<? extends ComponentInstance>)newValue);
        return;
      case SadlPackage.CONTAINER__CONNECTIONS:
        getConnections().clear();
        getConnections().addAll((Collection<? extends Connection>)newValue);
        return;
      case SadlPackage.CONTAINER__CONTAINER_INSTANCES:
        getContainerInstances().clear();
        getContainerInstances().addAll((Collection<? extends ContainerInstance>)newValue);
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
      case SadlPackage.CONTAINER__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case SadlPackage.CONTAINER__COMPONENT_INSTANCES:
        getComponentInstances().clear();
        return;
      case SadlPackage.CONTAINER__CONNECTIONS:
        getConnections().clear();
        return;
      case SadlPackage.CONTAINER__CONTAINER_INSTANCES:
        getContainerInstances().clear();
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
      case SadlPackage.CONTAINER__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case SadlPackage.CONTAINER__COMPONENT_INSTANCES:
        return componentInstances != null && !componentInstances.isEmpty();
      case SadlPackage.CONTAINER__CONNECTIONS:
        return connections != null && !connections.isEmpty();
      case SadlPackage.CONTAINER__CONTAINER_INSTANCES:
        return containerInstances != null && !containerInstances.isEmpty();
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
    result.append(" (description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //ContainerImpl
