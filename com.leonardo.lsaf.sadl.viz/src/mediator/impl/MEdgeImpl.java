/**
 */
package mediator.impl;

import mediator.MConnectableElement;
import mediator.MEdge;
import mediator.MediatorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MEdge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mediator.impl.MEdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link mediator.impl.MEdgeImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MEdgeImpl extends MElementImpl implements MEdge {
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected MConnectableElement source;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected MConnectableElement target;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MEdgeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return MediatorPackage.Literals.MEDGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MConnectableElement getSource() {
    if (source != null && source.eIsProxy()) {
      InternalEObject oldSource = (InternalEObject)source;
      source = (MConnectableElement)eResolveProxy(oldSource);
      if (source != oldSource) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MediatorPackage.MEDGE__SOURCE, oldSource, source));
      }
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MConnectableElement basicGetSource() {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSource(MConnectableElement newSource) {
    MConnectableElement oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.MEDGE__SOURCE, oldSource, source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MConnectableElement getTarget() {
    if (target != null && target.eIsProxy()) {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (MConnectableElement)eResolveProxy(oldTarget);
      if (target != oldTarget) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MediatorPackage.MEDGE__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MConnectableElement basicGetTarget() {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTarget(MConnectableElement newTarget) {
    MConnectableElement oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MediatorPackage.MEDGE__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case MediatorPackage.MEDGE__SOURCE:
        if (resolve) return getSource();
        return basicGetSource();
      case MediatorPackage.MEDGE__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
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
      case MediatorPackage.MEDGE__SOURCE:
        setSource((MConnectableElement)newValue);
        return;
      case MediatorPackage.MEDGE__TARGET:
        setTarget((MConnectableElement)newValue);
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
      case MediatorPackage.MEDGE__SOURCE:
        setSource((MConnectableElement)null);
        return;
      case MediatorPackage.MEDGE__TARGET:
        setTarget((MConnectableElement)null);
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
      case MediatorPackage.MEDGE__SOURCE:
        return source != null;
      case MediatorPackage.MEDGE__TARGET:
        return target != null;
    }
    return super.eIsSet(featureID);
  }

} //MEdgeImpl
