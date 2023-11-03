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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sadl.Link;
import sadl.Processor;
import sadl.PropertyValue;
import sadl.SadlPackage;
import sadl.Transport;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sadl.impl.LinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link sadl.impl.LinkImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link sadl.impl.LinkImpl#getProcessors <em>Processors</em>}</li>
 *   <li>{@link sadl.impl.LinkImpl#getTransport <em>Transport</em>}</li>
 *   <li>{@link sadl.impl.LinkImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends EObjectImpl implements Link {
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
   * The cached value of the '{@link #getProcessors() <em>Processors</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessors()
   * @generated
   * @ordered
   */
  protected EList<Processor> processors;

  /**
   * The cached value of the '{@link #getTransport() <em>Transport</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransport()
   * @generated
   * @ordered
   */
  protected Transport transport;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected EList<PropertyValue> value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LinkImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SadlPackage.Literals.LINK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.LINK__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.LINK__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Processor> getProcessors() {
    if (processors == null) {
      processors = new EObjectResolvingEList<Processor>(Processor.class, this, SadlPackage.LINK__PROCESSORS);
    }
    return processors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Transport getTransport() {
    if (transport != null && transport.eIsProxy()) {
      InternalEObject oldTransport = (InternalEObject)transport;
      transport = (Transport)eResolveProxy(oldTransport);
      if (transport != oldTransport) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SadlPackage.LINK__TRANSPORT, oldTransport, transport));
      }
    }
    return transport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transport basicGetTransport() {
    return transport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTransport(Transport newTransport) {
    Transport oldTransport = transport;
    transport = newTransport;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.LINK__TRANSPORT, oldTransport, transport));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PropertyValue> getValue() {
    if (value == null) {
      value = new EObjectContainmentEList<PropertyValue>(PropertyValue.class, this, SadlPackage.LINK__VALUE);
    }
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case SadlPackage.LINK__VALUE:
        return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
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
      case SadlPackage.LINK__NAME:
        return getName();
      case SadlPackage.LINK__DESCRIPTION:
        return getDescription();
      case SadlPackage.LINK__PROCESSORS:
        return getProcessors();
      case SadlPackage.LINK__TRANSPORT:
        if (resolve) return getTransport();
        return basicGetTransport();
      case SadlPackage.LINK__VALUE:
        return getValue();
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
      case SadlPackage.LINK__NAME:
        setName((String)newValue);
        return;
      case SadlPackage.LINK__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case SadlPackage.LINK__PROCESSORS:
        getProcessors().clear();
        getProcessors().addAll((Collection<? extends Processor>)newValue);
        return;
      case SadlPackage.LINK__TRANSPORT:
        setTransport((Transport)newValue);
        return;
      case SadlPackage.LINK__VALUE:
        getValue().clear();
        getValue().addAll((Collection<? extends PropertyValue>)newValue);
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
      case SadlPackage.LINK__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SadlPackage.LINK__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case SadlPackage.LINK__PROCESSORS:
        getProcessors().clear();
        return;
      case SadlPackage.LINK__TRANSPORT:
        setTransport((Transport)null);
        return;
      case SadlPackage.LINK__VALUE:
        getValue().clear();
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
      case SadlPackage.LINK__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SadlPackage.LINK__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case SadlPackage.LINK__PROCESSORS:
        return processors != null && !processors.isEmpty();
      case SadlPackage.LINK__TRANSPORT:
        return transport != null;
      case SadlPackage.LINK__VALUE:
        return value != null && !value.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //LinkImpl
