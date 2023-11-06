/**
 */
package sadl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import sadl.Component;
import sadl.ComponentInstance;
import sadl.SadlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sadl.impl.ComponentInstanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link sadl.impl.ComponentInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link sadl.impl.ComponentInstanceImpl#isUnbounded <em>Unbounded</em>}</li>
 *   <li>{@link sadl.impl.ComponentInstanceImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link sadl.impl.ComponentInstanceImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link sadl.impl.ComponentInstanceImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentInstanceImpl extends EObjectImpl implements com.leonardo.lsaf.sadl.sadl.ComponentInstance {
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected com.leonardo.lsaf.sadl.sadl.Component type;

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
   * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
  protected static final int LOWER_BOUND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
  protected int lowerBound = LOWER_BOUND_EDEFAULT;

  /**
   * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperBound()
   * @generated
   * @ordered
   */
  protected static final int UPPER_BOUND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperBound()
   * @generated
   * @ordered
   */
  protected int upperBound = UPPER_BOUND_EDEFAULT;

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
  protected ComponentInstanceImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SadlPackage.Literals.COMPONENT_INSTANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.Component getType() {
    if (type != null && type.eIsProxy()) {
      InternalEObject oldType = (InternalEObject)type;
      type = (com.leonardo.lsaf.sadl.sadl.Component)eResolveProxy(oldType);
      if (type != oldType) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SadlPackage.COMPONENT_INSTANCE__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.leonardo.lsaf.sadl.sadl.Component basicGetType() {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(com.leonardo.lsaf.sadl.sadl.Component newType) {
    com.leonardo.lsaf.sadl.sadl.Component oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.COMPONENT_INSTANCE__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.COMPONENT_INSTANCE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.COMPONENT_INSTANCE__UNBOUNDED, oldUnbounded, unbounded));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getLowerBound() {
    return lowerBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLowerBound(int newLowerBound) {
    int oldLowerBound = lowerBound;
    lowerBound = newLowerBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.COMPONENT_INSTANCE__LOWER_BOUND, oldLowerBound, lowerBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getUpperBound() {
    return upperBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUpperBound(int newUpperBound) {
    int oldUpperBound = upperBound;
    upperBound = newUpperBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.COMPONENT_INSTANCE__UPPER_BOUND, oldUpperBound, upperBound));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.COMPONENT_INSTANCE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SadlPackage.COMPONENT_INSTANCE__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case SadlPackage.COMPONENT_INSTANCE__NAME:
        return getName();
      case SadlPackage.COMPONENT_INSTANCE__UNBOUNDED:
        return isUnbounded();
      case SadlPackage.COMPONENT_INSTANCE__LOWER_BOUND:
        return getLowerBound();
      case SadlPackage.COMPONENT_INSTANCE__UPPER_BOUND:
        return getUpperBound();
      case SadlPackage.COMPONENT_INSTANCE__DESCRIPTION:
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
      case SadlPackage.COMPONENT_INSTANCE__TYPE:
        setType((com.leonardo.lsaf.sadl.sadl.Component)newValue);
        return;
      case SadlPackage.COMPONENT_INSTANCE__NAME:
        setName((String)newValue);
        return;
      case SadlPackage.COMPONENT_INSTANCE__UNBOUNDED:
        setUnbounded((Boolean)newValue);
        return;
      case SadlPackage.COMPONENT_INSTANCE__LOWER_BOUND:
        setLowerBound((Integer)newValue);
        return;
      case SadlPackage.COMPONENT_INSTANCE__UPPER_BOUND:
        setUpperBound((Integer)newValue);
        return;
      case SadlPackage.COMPONENT_INSTANCE__DESCRIPTION:
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
      case SadlPackage.COMPONENT_INSTANCE__TYPE:
        setType((com.leonardo.lsaf.sadl.sadl.Component)null);
        return;
      case SadlPackage.COMPONENT_INSTANCE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SadlPackage.COMPONENT_INSTANCE__UNBOUNDED:
        setUnbounded(UNBOUNDED_EDEFAULT);
        return;
      case SadlPackage.COMPONENT_INSTANCE__LOWER_BOUND:
        setLowerBound(LOWER_BOUND_EDEFAULT);
        return;
      case SadlPackage.COMPONENT_INSTANCE__UPPER_BOUND:
        setUpperBound(UPPER_BOUND_EDEFAULT);
        return;
      case SadlPackage.COMPONENT_INSTANCE__DESCRIPTION:
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
      case SadlPackage.COMPONENT_INSTANCE__TYPE:
        return type != null;
      case SadlPackage.COMPONENT_INSTANCE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SadlPackage.COMPONENT_INSTANCE__UNBOUNDED:
        return unbounded != UNBOUNDED_EDEFAULT;
      case SadlPackage.COMPONENT_INSTANCE__LOWER_BOUND:
        return lowerBound != LOWER_BOUND_EDEFAULT;
      case SadlPackage.COMPONENT_INSTANCE__UPPER_BOUND:
        return upperBound != UPPER_BOUND_EDEFAULT;
      case SadlPackage.COMPONENT_INSTANCE__DESCRIPTION:
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
    result.append(", unbounded: ");
    result.append(unbounded);
    result.append(", lowerBound: ");
    result.append(lowerBound);
    result.append(", upperBound: ");
    result.append(upperBound);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //ComponentInstanceImpl
