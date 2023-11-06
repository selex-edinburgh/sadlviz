/**
 */
package sadl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import sadl.Connection;
import sadl.ConnectionMapping;
import sadl.Link;
import sadl.SadlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sadl.impl.ConnectionMappingImpl#getLink <em>Link</em>}</li>
 *   <li>{@link sadl.impl.ConnectionMappingImpl#getConnection <em>Connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionMappingImpl extends EObjectImpl implements com.leonardo.lsaf.sadl.sadl.ConnectionMapping {
  /**
   * The cached value of the '{@link #getLink() <em>Link</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLink()
   * @generated
   * @ordered
   */
  protected com.leonardo.lsaf.sadl.sadl.Link link;

  /**
   * The cached value of the '{@link #getConnection() <em>Connection</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnection()
   * @generated
   * @ordered
   */
  protected com.leonardo.lsaf.sadl.sadl.Connection connection;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConnectionMappingImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SadlPackage.Literals.CONNECTION_MAPPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.Link getLink() {
    if (link != null && link.eIsProxy()) {
      InternalEObject oldLink = (InternalEObject)link;
      link = (com.leonardo.lsaf.sadl.sadl.Link)eResolveProxy(oldLink);
      if (link != oldLink) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SadlPackage.CONNECTION_MAPPING__LINK, oldLink, link));
      }
    }
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.leonardo.lsaf.sadl.sadl.Link basicGetLink() {
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLink(com.leonardo.lsaf.sadl.sadl.Link newLink) {
    com.leonardo.lsaf.sadl.sadl.Link oldLink = link;
    link = newLink;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.CONNECTION_MAPPING__LINK, oldLink, link));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.Connection getConnection() {
    if (connection != null && connection.eIsProxy()) {
      InternalEObject oldConnection = (InternalEObject)connection;
      connection = (com.leonardo.lsaf.sadl.sadl.Connection)eResolveProxy(oldConnection);
      if (connection != oldConnection) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SadlPackage.CONNECTION_MAPPING__CONNECTION, oldConnection, connection));
      }
    }
    return connection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.leonardo.lsaf.sadl.sadl.Connection basicGetConnection() {
    return connection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConnection(com.leonardo.lsaf.sadl.sadl.Connection newConnection) {
    com.leonardo.lsaf.sadl.sadl.Connection oldConnection = connection;
    connection = newConnection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.CONNECTION_MAPPING__CONNECTION, oldConnection, connection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SadlPackage.CONNECTION_MAPPING__LINK:
        if (resolve) return getLink();
        return basicGetLink();
      case SadlPackage.CONNECTION_MAPPING__CONNECTION:
        if (resolve) return getConnection();
        return basicGetConnection();
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
      case SadlPackage.CONNECTION_MAPPING__LINK:
        setLink((com.leonardo.lsaf.sadl.sadl.Link)newValue);
        return;
      case SadlPackage.CONNECTION_MAPPING__CONNECTION:
        setConnection((com.leonardo.lsaf.sadl.sadl.Connection)newValue);
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
      case SadlPackage.CONNECTION_MAPPING__LINK:
        setLink((com.leonardo.lsaf.sadl.sadl.Link)null);
        return;
      case SadlPackage.CONNECTION_MAPPING__CONNECTION:
        setConnection((com.leonardo.lsaf.sadl.sadl.Connection)null);
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
      case SadlPackage.CONNECTION_MAPPING__LINK:
        return link != null;
      case SadlPackage.CONNECTION_MAPPING__CONNECTION:
        return connection != null;
    }
    return super.eIsSet(featureID);
  }

} //ConnectionMappingImpl
