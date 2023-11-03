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

import sadl.ConnectionMapping;
import sadl.ContainerMapping;
import sadl.Deployment;
import sadl.SadlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sadl.impl.DeploymentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link sadl.impl.DeploymentImpl#getContainermapping <em>Containermapping</em>}</li>
 *   <li>{@link sadl.impl.DeploymentImpl#getConnectionmapping <em>Connectionmapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentImpl extends PackageableElementImpl implements Deployment {
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
   * The cached value of the '{@link #getContainermapping() <em>Containermapping</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainermapping()
   * @generated
   * @ordered
   */
  protected EList<ContainerMapping> containermapping;

  /**
   * The cached value of the '{@link #getConnectionmapping() <em>Connectionmapping</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnectionmapping()
   * @generated
   * @ordered
   */
  protected EList<ConnectionMapping> connectionmapping;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeploymentImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SadlPackage.Literals.DEPLOYMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.DEPLOYMENT__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ContainerMapping> getContainermapping() {
    if (containermapping == null) {
      containermapping = new EObjectContainmentEList<ContainerMapping>(ContainerMapping.class, this, SadlPackage.DEPLOYMENT__CONTAINERMAPPING);
    }
    return containermapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ConnectionMapping> getConnectionmapping() {
    if (connectionmapping == null) {
      connectionmapping = new EObjectContainmentEList<ConnectionMapping>(ConnectionMapping.class, this, SadlPackage.DEPLOYMENT__CONNECTIONMAPPING);
    }
    return connectionmapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case SadlPackage.DEPLOYMENT__CONTAINERMAPPING:
        return ((InternalEList<?>)getContainermapping()).basicRemove(otherEnd, msgs);
      case SadlPackage.DEPLOYMENT__CONNECTIONMAPPING:
        return ((InternalEList<?>)getConnectionmapping()).basicRemove(otherEnd, msgs);
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
      case SadlPackage.DEPLOYMENT__DESCRIPTION:
        return getDescription();
      case SadlPackage.DEPLOYMENT__CONTAINERMAPPING:
        return getContainermapping();
      case SadlPackage.DEPLOYMENT__CONNECTIONMAPPING:
        return getConnectionmapping();
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
      case SadlPackage.DEPLOYMENT__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case SadlPackage.DEPLOYMENT__CONTAINERMAPPING:
        getContainermapping().clear();
        getContainermapping().addAll((Collection<? extends ContainerMapping>)newValue);
        return;
      case SadlPackage.DEPLOYMENT__CONNECTIONMAPPING:
        getConnectionmapping().clear();
        getConnectionmapping().addAll((Collection<? extends ConnectionMapping>)newValue);
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
      case SadlPackage.DEPLOYMENT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case SadlPackage.DEPLOYMENT__CONTAINERMAPPING:
        getContainermapping().clear();
        return;
      case SadlPackage.DEPLOYMENT__CONNECTIONMAPPING:
        getConnectionmapping().clear();
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
      case SadlPackage.DEPLOYMENT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case SadlPackage.DEPLOYMENT__CONTAINERMAPPING:
        return containermapping != null && !containermapping.isEmpty();
      case SadlPackage.DEPLOYMENT__CONNECTIONMAPPING:
        return connectionmapping != null && !connectionmapping.isEmpty();
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

} //DeploymentImpl
