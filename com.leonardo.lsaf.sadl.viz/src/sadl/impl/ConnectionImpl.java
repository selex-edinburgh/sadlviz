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

import sadl.ComponentInstance;
import sadl.Connection;
import sadl.Port;
import sadl.PropertyValue;
import sadl.SadlPackage;
import sadl.Strategy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sadl.impl.ConnectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link sadl.impl.ConnectionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link sadl.impl.ConnectionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link sadl.impl.ConnectionImpl#getTo <em>To</em>}</li>
 *   <li>{@link sadl.impl.ConnectionImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link sadl.impl.ConnectionImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link sadl.impl.ConnectionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link sadl.impl.ConnectionImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends EObjectImpl implements Connection {
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
   * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected ComponentInstance from;

  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected EList<Port> source;

  /**
   * The cached value of the '{@link #getTo() <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected ComponentInstance to;

  /**
   * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestination()
   * @generated
   * @ordered
   */
  protected EList<Port> destination;

  /**
   * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrategy()
   * @generated
   * @ordered
   */
  protected Strategy strategy;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConnectionImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SadlPackage.Literals.CONNECTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.CONNECTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ComponentInstance getFrom() {
    if (from != null && from.eIsProxy()) {
      InternalEObject oldFrom = (InternalEObject)from;
      from = (ComponentInstance)eResolveProxy(oldFrom);
      if (from != oldFrom) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SadlPackage.CONNECTION__FROM, oldFrom, from));
      }
    }
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentInstance basicGetFrom() {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFrom(ComponentInstance newFrom) {
    ComponentInstance oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.CONNECTION__FROM, oldFrom, from));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Port> getSource() {
    if (source == null) {
      source = new EObjectResolvingEList<Port>(Port.class, this, SadlPackage.CONNECTION__SOURCE);
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ComponentInstance getTo() {
    if (to != null && to.eIsProxy()) {
      InternalEObject oldTo = (InternalEObject)to;
      to = (ComponentInstance)eResolveProxy(oldTo);
      if (to != oldTo) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SadlPackage.CONNECTION__TO, oldTo, to));
      }
    }
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentInstance basicGetTo() {
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTo(ComponentInstance newTo) {
    ComponentInstance oldTo = to;
    to = newTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.CONNECTION__TO, oldTo, to));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Port> getDestination() {
    if (destination == null) {
      destination = new EObjectResolvingEList<Port>(Port.class, this, SadlPackage.CONNECTION__DESTINATION);
    }
    return destination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Strategy getStrategy() {
    if (strategy != null && strategy.eIsProxy()) {
      InternalEObject oldStrategy = (InternalEObject)strategy;
      strategy = (Strategy)eResolveProxy(oldStrategy);
      if (strategy != oldStrategy) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SadlPackage.CONNECTION__STRATEGY, oldStrategy, strategy));
      }
    }
    return strategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Strategy basicGetStrategy() {
    return strategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStrategy(Strategy newStrategy) {
    Strategy oldStrategy = strategy;
    strategy = newStrategy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.CONNECTION__STRATEGY, oldStrategy, strategy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PropertyValue> getValue() {
    if (value == null) {
      value = new EObjectContainmentEList<PropertyValue>(PropertyValue.class, this, SadlPackage.CONNECTION__VALUE);
    }
    return value;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.CONNECTION__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case SadlPackage.CONNECTION__VALUE:
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
      case SadlPackage.CONNECTION__NAME:
        return getName();
      case SadlPackage.CONNECTION__FROM:
        if (resolve) return getFrom();
        return basicGetFrom();
      case SadlPackage.CONNECTION__SOURCE:
        return getSource();
      case SadlPackage.CONNECTION__TO:
        if (resolve) return getTo();
        return basicGetTo();
      case SadlPackage.CONNECTION__DESTINATION:
        return getDestination();
      case SadlPackage.CONNECTION__STRATEGY:
        if (resolve) return getStrategy();
        return basicGetStrategy();
      case SadlPackage.CONNECTION__VALUE:
        return getValue();
      case SadlPackage.CONNECTION__DESCRIPTION:
        return getDescription();
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
      case SadlPackage.CONNECTION__NAME:
        setName((String)newValue);
        return;
      case SadlPackage.CONNECTION__FROM:
        setFrom((ComponentInstance)newValue);
        return;
      case SadlPackage.CONNECTION__SOURCE:
        getSource().clear();
        getSource().addAll((Collection<? extends Port>)newValue);
        return;
      case SadlPackage.CONNECTION__TO:
        setTo((ComponentInstance)newValue);
        return;
      case SadlPackage.CONNECTION__DESTINATION:
        getDestination().clear();
        getDestination().addAll((Collection<? extends Port>)newValue);
        return;
      case SadlPackage.CONNECTION__STRATEGY:
        setStrategy((Strategy)newValue);
        return;
      case SadlPackage.CONNECTION__VALUE:
        getValue().clear();
        getValue().addAll((Collection<? extends PropertyValue>)newValue);
        return;
      case SadlPackage.CONNECTION__DESCRIPTION:
        setDescription((String)newValue);
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
      case SadlPackage.CONNECTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SadlPackage.CONNECTION__FROM:
        setFrom((ComponentInstance)null);
        return;
      case SadlPackage.CONNECTION__SOURCE:
        getSource().clear();
        return;
      case SadlPackage.CONNECTION__TO:
        setTo((ComponentInstance)null);
        return;
      case SadlPackage.CONNECTION__DESTINATION:
        getDestination().clear();
        return;
      case SadlPackage.CONNECTION__STRATEGY:
        setStrategy((Strategy)null);
        return;
      case SadlPackage.CONNECTION__VALUE:
        getValue().clear();
        return;
      case SadlPackage.CONNECTION__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
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
      case SadlPackage.CONNECTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SadlPackage.CONNECTION__FROM:
        return from != null;
      case SadlPackage.CONNECTION__SOURCE:
        return source != null && !source.isEmpty();
      case SadlPackage.CONNECTION__TO:
        return to != null;
      case SadlPackage.CONNECTION__DESTINATION:
        return destination != null && !destination.isEmpty();
      case SadlPackage.CONNECTION__STRATEGY:
        return strategy != null;
      case SadlPackage.CONNECTION__VALUE:
        return value != null && !value.isEmpty();
      case SadlPackage.CONNECTION__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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

} //ConnectionImpl
