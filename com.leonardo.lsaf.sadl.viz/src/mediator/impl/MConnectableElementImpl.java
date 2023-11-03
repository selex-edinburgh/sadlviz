/**
 */
package mediator.impl;

import mediator.MConnectableElement;
import mediator.MediatorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MConnectable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mediator.impl.MConnectableElementImpl#getX <em>X</em>}</li>
 *   <li>{@link mediator.impl.MConnectableElementImpl#getY <em>Y</em>}</li>
 *   <li>{@link mediator.impl.MConnectableElementImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link mediator.impl.MConnectableElementImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link mediator.impl.MConnectableElementImpl#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MConnectableElementImpl extends MElementImpl implements MConnectableElement {
  /**
   * The default value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected static final int X_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected int x = X_EDEFAULT;

  /**
   * The default value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected static final int Y_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected int y = Y_EDEFAULT;

  /**
   * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected static final int WIDTH_EDEFAULT = 5;

  /**
   * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected int width = WIDTH_EDEFAULT;

  /**
   * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected static final int HEIGHT_EDEFAULT = 5;

  /**
   * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected int height = HEIGHT_EDEFAULT;

  /**
   * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected static final int LEVEL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected int level = LEVEL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MConnectableElementImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return MediatorPackage.Literals.MCONNECTABLE_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getX() {
    return x;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setX(int newX) {
    int oldX = x;
    x = newX;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.MCONNECTABLE_ELEMENT__X, oldX, x));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getY() {
    return y;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setY(int newY) {
    int oldY = y;
    y = newY;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.MCONNECTABLE_ELEMENT__Y, oldY, y));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getWidth() {
    return width;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWidth(int newWidth) {
    int oldWidth = width;
    width = newWidth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.MCONNECTABLE_ELEMENT__WIDTH, oldWidth, width));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getHeight() {
    return height;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHeight(int newHeight) {
    int oldHeight = height;
    height = newHeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.MCONNECTABLE_ELEMENT__HEIGHT, oldHeight, height));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getLevel() {
    return level;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLevel(int newLevel) {
    int oldLevel = level;
    level = newLevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.MCONNECTABLE_ELEMENT__LEVEL, oldLevel, level));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case MediatorPackage.MCONNECTABLE_ELEMENT__X:
        return getX();
      case MediatorPackage.MCONNECTABLE_ELEMENT__Y:
        return getY();
      case MediatorPackage.MCONNECTABLE_ELEMENT__WIDTH:
        return getWidth();
      case MediatorPackage.MCONNECTABLE_ELEMENT__HEIGHT:
        return getHeight();
      case MediatorPackage.MCONNECTABLE_ELEMENT__LEVEL:
        return getLevel();
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
      case MediatorPackage.MCONNECTABLE_ELEMENT__X:
        setX((Integer)newValue);
        return;
      case MediatorPackage.MCONNECTABLE_ELEMENT__Y:
        setY((Integer)newValue);
        return;
      case MediatorPackage.MCONNECTABLE_ELEMENT__WIDTH:
        setWidth((Integer)newValue);
        return;
      case MediatorPackage.MCONNECTABLE_ELEMENT__HEIGHT:
        setHeight((Integer)newValue);
        return;
      case MediatorPackage.MCONNECTABLE_ELEMENT__LEVEL:
        setLevel((Integer)newValue);
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
      case MediatorPackage.MCONNECTABLE_ELEMENT__X:
        setX(X_EDEFAULT);
        return;
      case MediatorPackage.MCONNECTABLE_ELEMENT__Y:
        setY(Y_EDEFAULT);
        return;
      case MediatorPackage.MCONNECTABLE_ELEMENT__WIDTH:
        setWidth(WIDTH_EDEFAULT);
        return;
      case MediatorPackage.MCONNECTABLE_ELEMENT__HEIGHT:
        setHeight(HEIGHT_EDEFAULT);
        return;
      case MediatorPackage.MCONNECTABLE_ELEMENT__LEVEL:
        setLevel(LEVEL_EDEFAULT);
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
      case MediatorPackage.MCONNECTABLE_ELEMENT__X:
        return x != X_EDEFAULT;
      case MediatorPackage.MCONNECTABLE_ELEMENT__Y:
        return y != Y_EDEFAULT;
      case MediatorPackage.MCONNECTABLE_ELEMENT__WIDTH:
        return width != WIDTH_EDEFAULT;
      case MediatorPackage.MCONNECTABLE_ELEMENT__HEIGHT:
        return height != HEIGHT_EDEFAULT;
      case MediatorPackage.MCONNECTABLE_ELEMENT__LEVEL:
        return level != LEVEL_EDEFAULT;
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
    result.append(" (x: ");
    result.append(x);
    result.append(", y: ");
    result.append(y);
    result.append(", width: ");
    result.append(width);
    result.append(", height: ");
    result.append(height);
    result.append(", level: ");
    result.append(level);
    result.append(')');
    return result.toString();
  }

} //MConnectableElementImpl
