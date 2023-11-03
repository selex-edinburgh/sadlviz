/**
 */
package sadl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import sadl.Attribute;
import sadl.SadlPackage;
import sadl.Type;
import sadl.Unit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sadl.impl.AttributeImpl#isDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link sadl.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link sadl.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link sadl.impl.AttributeImpl#isUnbounded <em>Unbounded</em>}</li>
 *   <li>{@link sadl.impl.AttributeImpl#getLowerbound <em>Lowerbound</em>}</li>
 *   <li>{@link sadl.impl.AttributeImpl#getUpperbound <em>Upperbound</em>}</li>
 *   <li>{@link sadl.impl.AttributeImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link sadl.impl.AttributeImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends EObjectImpl implements Attribute {
  /**
   * The default value of the '{@link #isDeprecated() <em>Deprecated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDeprecated()
   * @generated
   * @ordered
   */
  protected static final boolean DEPRECATED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDeprecated() <em>Deprecated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDeprecated()
   * @generated
   * @ordered
   */
  protected boolean deprecated = DEPRECATED_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

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
   * The default value of the '{@link #isUnbounded() <em>Unbounded</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnbounded()
   * @generated
   * @ordered
   */
  protected static final boolean UNBOUNDED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUnbounded() <em>Unbounded</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnbounded()
   * @generated
   * @ordered
   */
  protected boolean unbounded = UNBOUNDED_EDEFAULT;

  /**
   * The default value of the '{@link #getLowerbound() <em>Lowerbound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerbound()
   * @generated
   * @ordered
   */
  protected static final int LOWERBOUND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLowerbound() <em>Lowerbound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerbound()
   * @generated
   * @ordered
   */
  protected int lowerbound = LOWERBOUND_EDEFAULT;

  /**
   * The default value of the '{@link #getUpperbound() <em>Upperbound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperbound()
   * @generated
   * @ordered
   */
  protected static final int UPPERBOUND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getUpperbound() <em>Upperbound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperbound()
   * @generated
   * @ordered
   */
  protected int upperbound = UPPERBOUND_EDEFAULT;

  /**
   * The cached value of the '{@link #getUnit() <em>Unit</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
  protected Unit unit;

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
  protected AttributeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SadlPackage.Literals.ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isDeprecated() {
    return deprecated;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDeprecated(boolean newDeprecated) {
    boolean oldDeprecated = deprecated;
    deprecated = newDeprecated;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.ATTRIBUTE__DEPRECATED, oldDeprecated, deprecated));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type getType() {
    if (type != null && type.eIsProxy()) {
      InternalEObject oldType = (InternalEObject)type;
      type = (Type)eResolveProxy(oldType);
      if (type != oldType) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SadlPackage.ATTRIBUTE__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetType() {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(Type newType) {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.ATTRIBUTE__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.ATTRIBUTE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isUnbounded() {
    return unbounded;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUnbounded(boolean newUnbounded) {
    boolean oldUnbounded = unbounded;
    unbounded = newUnbounded;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.ATTRIBUTE__UNBOUNDED, oldUnbounded, unbounded));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getLowerbound() {
    return lowerbound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLowerbound(int newLowerbound) {
    int oldLowerbound = lowerbound;
    lowerbound = newLowerbound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.ATTRIBUTE__LOWERBOUND, oldLowerbound, lowerbound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getUpperbound() {
    return upperbound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUpperbound(int newUpperbound) {
    int oldUpperbound = upperbound;
    upperbound = newUpperbound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.ATTRIBUTE__UPPERBOUND, oldUpperbound, upperbound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Unit getUnit() {
    if (unit != null && unit.eIsProxy()) {
      InternalEObject oldUnit = (InternalEObject)unit;
      unit = (Unit)eResolveProxy(oldUnit);
      if (unit != oldUnit) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SadlPackage.ATTRIBUTE__UNIT, oldUnit, unit));
      }
    }
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unit basicGetUnit() {
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUnit(Unit newUnit) {
    Unit oldUnit = unit;
    unit = newUnit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.ATTRIBUTE__UNIT, oldUnit, unit));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.ATTRIBUTE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SadlPackage.ATTRIBUTE__DEPRECATED:
        return isDeprecated();
      case SadlPackage.ATTRIBUTE__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case SadlPackage.ATTRIBUTE__NAME:
        return getName();
      case SadlPackage.ATTRIBUTE__UNBOUNDED:
        return isUnbounded();
      case SadlPackage.ATTRIBUTE__LOWERBOUND:
        return getLowerbound();
      case SadlPackage.ATTRIBUTE__UPPERBOUND:
        return getUpperbound();
      case SadlPackage.ATTRIBUTE__UNIT:
        if (resolve) return getUnit();
        return basicGetUnit();
      case SadlPackage.ATTRIBUTE__DESCRIPTION:
        return getDescription();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case SadlPackage.ATTRIBUTE__DEPRECATED:
        setDeprecated((Boolean)newValue);
        return;
      case SadlPackage.ATTRIBUTE__TYPE:
        setType((Type)newValue);
        return;
      case SadlPackage.ATTRIBUTE__NAME:
        setName((String)newValue);
        return;
      case SadlPackage.ATTRIBUTE__UNBOUNDED:
        setUnbounded((Boolean)newValue);
        return;
      case SadlPackage.ATTRIBUTE__LOWERBOUND:
        setLowerbound((Integer)newValue);
        return;
      case SadlPackage.ATTRIBUTE__UPPERBOUND:
        setUpperbound((Integer)newValue);
        return;
      case SadlPackage.ATTRIBUTE__UNIT:
        setUnit((Unit)newValue);
        return;
      case SadlPackage.ATTRIBUTE__DESCRIPTION:
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
      case SadlPackage.ATTRIBUTE__DEPRECATED:
        setDeprecated(DEPRECATED_EDEFAULT);
        return;
      case SadlPackage.ATTRIBUTE__TYPE:
        setType((Type)null);
        return;
      case SadlPackage.ATTRIBUTE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SadlPackage.ATTRIBUTE__UNBOUNDED:
        setUnbounded(UNBOUNDED_EDEFAULT);
        return;
      case SadlPackage.ATTRIBUTE__LOWERBOUND:
        setLowerbound(LOWERBOUND_EDEFAULT);
        return;
      case SadlPackage.ATTRIBUTE__UPPERBOUND:
        setUpperbound(UPPERBOUND_EDEFAULT);
        return;
      case SadlPackage.ATTRIBUTE__UNIT:
        setUnit((Unit)null);
        return;
      case SadlPackage.ATTRIBUTE__DESCRIPTION:
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
      case SadlPackage.ATTRIBUTE__DEPRECATED:
        return deprecated != DEPRECATED_EDEFAULT;
      case SadlPackage.ATTRIBUTE__TYPE:
        return type != null;
      case SadlPackage.ATTRIBUTE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SadlPackage.ATTRIBUTE__UNBOUNDED:
        return unbounded != UNBOUNDED_EDEFAULT;
      case SadlPackage.ATTRIBUTE__LOWERBOUND:
        return lowerbound != LOWERBOUND_EDEFAULT;
      case SadlPackage.ATTRIBUTE__UPPERBOUND:
        return upperbound != UPPERBOUND_EDEFAULT;
      case SadlPackage.ATTRIBUTE__UNIT:
        return unit != null;
      case SadlPackage.ATTRIBUTE__DESCRIPTION:
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
    result.append(" (deprecated: ");
    result.append(deprecated);
    result.append(", name: ");
    result.append(name);
    result.append(", unbounded: ");
    result.append(unbounded);
    result.append(", lowerbound: ");
    result.append(lowerbound);
    result.append(", upperbound: ");
    result.append(upperbound);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //AttributeImpl
