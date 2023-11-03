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

import sadl.Link;
import sadl.Platform;
import sadl.Processor;
import sadl.SadlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sadl.impl.PlatformImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link sadl.impl.PlatformImpl#getProcessors <em>Processors</em>}</li>
 *   <li>{@link sadl.impl.PlatformImpl#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformImpl extends PackageableElementImpl implements Platform {
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
   * The cached value of the '{@link #getProcessors() <em>Processors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessors()
   * @generated
   * @ordered
   */
  protected EList<Processor> processors;

  /**
   * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinks()
   * @generated
   * @ordered
   */
  protected EList<Link> links;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PlatformImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SadlPackage.Literals.PLATFORM;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.PLATFORM__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Processor> getProcessors() {
    if (processors == null) {
      processors = new EObjectContainmentEList<Processor>(Processor.class, this, SadlPackage.PLATFORM__PROCESSORS);
    }
    return processors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Link> getLinks() {
    if (links == null) {
      links = new EObjectContainmentEList<Link>(Link.class, this, SadlPackage.PLATFORM__LINKS);
    }
    return links;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case SadlPackage.PLATFORM__PROCESSORS:
        return ((InternalEList<?>)getProcessors()).basicRemove(otherEnd, msgs);
      case SadlPackage.PLATFORM__LINKS:
        return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
      case SadlPackage.PLATFORM__DESCRIPTION:
        return getDescription();
      case SadlPackage.PLATFORM__PROCESSORS:
        return getProcessors();
      case SadlPackage.PLATFORM__LINKS:
        return getLinks();
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
      case SadlPackage.PLATFORM__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case SadlPackage.PLATFORM__PROCESSORS:
        getProcessors().clear();
        getProcessors().addAll((Collection<? extends Processor>)newValue);
        return;
      case SadlPackage.PLATFORM__LINKS:
        getLinks().clear();
        getLinks().addAll((Collection<? extends Link>)newValue);
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
      case SadlPackage.PLATFORM__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case SadlPackage.PLATFORM__PROCESSORS:
        getProcessors().clear();
        return;
      case SadlPackage.PLATFORM__LINKS:
        getLinks().clear();
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
      case SadlPackage.PLATFORM__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case SadlPackage.PLATFORM__PROCESSORS:
        return processors != null && !processors.isEmpty();
      case SadlPackage.PLATFORM__LINKS:
        return links != null && !links.isEmpty();
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

} //PlatformImpl
