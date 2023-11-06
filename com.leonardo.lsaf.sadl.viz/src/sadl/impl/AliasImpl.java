/**
 */
package sadl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sadl.Alias;
import sadl.SadlPackage;
import sadl.Type;
import sadl.Unit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alias</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sadl.impl.AliasImpl#getType <em>Type</em>}</li>
 *   <li>{@link sadl.impl.AliasImpl#getMin <em>Min</em>}</li>
 *   <li>{@link sadl.impl.AliasImpl#getMax <em>Max</em>}</li>
 *   <li>{@link sadl.impl.AliasImpl#getRes <em>Res</em>}</li>
 *   <li>{@link sadl.impl.AliasImpl#getUnbounded <em>Unbounded</em>}</li>
 *   <li>{@link sadl.impl.AliasImpl#getUpperbound <em>Upperbound</em>}</li>
 *   <li>{@link sadl.impl.AliasImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link sadl.impl.AliasImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AliasImpl extends TypeImpl implements com.leonardo.lsaf.sadl.sadl.Alias {
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected com.leonardo.lsaf.sadl.sadl.Type type;

  /**
   * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected static final double MIN_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected double min = MIN_EDEFAULT;

  /**
   * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected static final double MAX_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected double max = MAX_EDEFAULT;

  /**
   * The default value of the '{@link #getRes() <em>Res</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRes()
   * @generated
   * @ordered
   */
  protected static final double RES_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getRes() <em>Res</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRes()
   * @generated
   * @ordered
   */
  protected double res = RES_EDEFAULT;

  /**
   * The default value of the '{@link #getUnbounded() <em>Unbounded</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnbounded()
   * @generated
   * @ordered
   */
  protected static final String UNBOUNDED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUnbounded() <em>Unbounded</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnbounded()
   * @generated
   * @ordered
   */
  protected String unbounded = UNBOUNDED_EDEFAULT;

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
  protected com.leonardo.lsaf.sadl.sadl.Unit unit;

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
  protected AliasImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SadlPackage.Literals.ALIAS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.Type getType() {
    if (type != null && type.eIsProxy()) {
      InternalEObject oldType = (InternalEObject)type;
      type = (com.leonardo.lsaf.sadl.sadl.Type)eResolveProxy(oldType);
      if (type != oldType) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SadlPackage.ALIAS__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.leonardo.lsaf.sadl.sadl.Type basicGetType() {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(com.leonardo.lsaf.sadl.sadl.Type newType) {
    com.leonardo.lsaf.sadl.sadl.Type oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.ALIAS__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public double getMin() {
    return min;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMin(double newMin) {
    double oldMin = min;
    min = newMin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.ALIAS__MIN, oldMin, min));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public double getMax() {
    return max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMax(double newMax) {
    double oldMax = max;
    max = newMax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.ALIAS__MAX, oldMax, max));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public double getRes() {
    return res;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRes(double newRes) {
    double oldRes = res;
    res = newRes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.ALIAS__RES, oldRes, res));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getUnbounded() {
    return unbounded;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUnbounded(String newUnbounded) {
    String oldUnbounded = unbounded;
    unbounded = newUnbounded;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.ALIAS__UNBOUNDED, oldUnbounded, unbounded));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.ALIAS__UPPERBOUND, oldUpperbound, upperbound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.Unit getUnit() {
    if (unit != null && unit.eIsProxy()) {
      InternalEObject oldUnit = (InternalEObject)unit;
      unit = (com.leonardo.lsaf.sadl.sadl.Unit)eResolveProxy(oldUnit);
      if (unit != oldUnit) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SadlPackage.ALIAS__UNIT, oldUnit, unit));
      }
    }
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.leonardo.lsaf.sadl.sadl.Unit basicGetUnit() {
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUnit(com.leonardo.lsaf.sadl.sadl.Unit newUnit) {
    com.leonardo.lsaf.sadl.sadl.Unit oldUnit = unit;
    unit = newUnit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.ALIAS__UNIT, oldUnit, unit));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.ALIAS__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SadlPackage.ALIAS__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case SadlPackage.ALIAS__MIN:
        return getMin();
      case SadlPackage.ALIAS__MAX:
        return getMax();
      case SadlPackage.ALIAS__RES:
        return getRes();
      case SadlPackage.ALIAS__UNBOUNDED:
        return getUnbounded();
      case SadlPackage.ALIAS__UPPERBOUND:
        return getUpperbound();
      case SadlPackage.ALIAS__UNIT:
        if (resolve) return getUnit();
        return basicGetUnit();
      case SadlPackage.ALIAS__DESCRIPTION:
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
      case SadlPackage.ALIAS__TYPE:
        setType((com.leonardo.lsaf.sadl.sadl.Type)newValue);
        return;
      case SadlPackage.ALIAS__MIN:
        setMin((Double)newValue);
        return;
      case SadlPackage.ALIAS__MAX:
        setMax((Double)newValue);
        return;
      case SadlPackage.ALIAS__RES:
        setRes((Double)newValue);
        return;
      case SadlPackage.ALIAS__UNBOUNDED:
        setUnbounded((String)newValue);
        return;
      case SadlPackage.ALIAS__UPPERBOUND:
        setUpperbound((Integer)newValue);
        return;
      case SadlPackage.ALIAS__UNIT:
        setUnit((com.leonardo.lsaf.sadl.sadl.Unit)newValue);
        return;
      case SadlPackage.ALIAS__DESCRIPTION:
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
      case SadlPackage.ALIAS__TYPE:
        setType((com.leonardo.lsaf.sadl.sadl.Type)null);
        return;
      case SadlPackage.ALIAS__MIN:
        setMin(MIN_EDEFAULT);
        return;
      case SadlPackage.ALIAS__MAX:
        setMax(MAX_EDEFAULT);
        return;
      case SadlPackage.ALIAS__RES:
        setRes(RES_EDEFAULT);
        return;
      case SadlPackage.ALIAS__UNBOUNDED:
        setUnbounded(UNBOUNDED_EDEFAULT);
        return;
      case SadlPackage.ALIAS__UPPERBOUND:
        setUpperbound(UPPERBOUND_EDEFAULT);
        return;
      case SadlPackage.ALIAS__UNIT:
        setUnit((com.leonardo.lsaf.sadl.sadl.Unit)null);
        return;
      case SadlPackage.ALIAS__DESCRIPTION:
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
      case SadlPackage.ALIAS__TYPE:
        return type != null;
      case SadlPackage.ALIAS__MIN:
        return min != MIN_EDEFAULT;
      case SadlPackage.ALIAS__MAX:
        return max != MAX_EDEFAULT;
      case SadlPackage.ALIAS__RES:
        return res != RES_EDEFAULT;
      case SadlPackage.ALIAS__UNBOUNDED:
        return UNBOUNDED_EDEFAULT == null ? unbounded != null : !UNBOUNDED_EDEFAULT.equals(unbounded);
      case SadlPackage.ALIAS__UPPERBOUND:
        return upperbound != UPPERBOUND_EDEFAULT;
      case SadlPackage.ALIAS__UNIT:
        return unit != null;
      case SadlPackage.ALIAS__DESCRIPTION:
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
    result.append(" (min: ");
    result.append(min);
    result.append(", max: ");
    result.append(max);
    result.append(", res: ");
    result.append(res);
    result.append(", unbounded: ");
    result.append(unbounded);
    result.append(", upperbound: ");
    result.append(upperbound);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //AliasImpl
