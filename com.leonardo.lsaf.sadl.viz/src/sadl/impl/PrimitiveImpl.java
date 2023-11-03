/**
 */
package sadl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sadl.Primitive;
import sadl.SadlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sadl.impl.PrimitiveImpl#getMin <em>Min</em>}</li>
 *   <li>{@link sadl.impl.PrimitiveImpl#getMax <em>Max</em>}</li>
 *   <li>{@link sadl.impl.PrimitiveImpl#getRes <em>Res</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimitiveImpl extends TypeImpl implements Primitive {
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimitiveImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SadlPackage.Literals.PRIMITIVE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.PRIMITIVE__MIN, oldMin, min));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.PRIMITIVE__MAX, oldMax, max));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.PRIMITIVE__RES, oldRes, res));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SadlPackage.PRIMITIVE__MIN:
        return getMin();
      case SadlPackage.PRIMITIVE__MAX:
        return getMax();
      case SadlPackage.PRIMITIVE__RES:
        return getRes();
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
      case SadlPackage.PRIMITIVE__MIN:
        setMin((Double)newValue);
        return;
      case SadlPackage.PRIMITIVE__MAX:
        setMax((Double)newValue);
        return;
      case SadlPackage.PRIMITIVE__RES:
        setRes((Double)newValue);
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
      case SadlPackage.PRIMITIVE__MIN:
        setMin(MIN_EDEFAULT);
        return;
      case SadlPackage.PRIMITIVE__MAX:
        setMax(MAX_EDEFAULT);
        return;
      case SadlPackage.PRIMITIVE__RES:
        setRes(RES_EDEFAULT);
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
      case SadlPackage.PRIMITIVE__MIN:
        return min != MIN_EDEFAULT;
      case SadlPackage.PRIMITIVE__MAX:
        return max != MAX_EDEFAULT;
      case SadlPackage.PRIMITIVE__RES:
        return res != RES_EDEFAULT;
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
    result.append(')');
    return result.toString();
  }

} //PrimitiveImpl
