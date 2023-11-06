/**
 */
package sadl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import sadl.Container;
import sadl.ContainerMapping;
import sadl.Processor;
import sadl.SadlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sadl.impl.ContainerMappingImpl#getProcessor <em>Processor</em>}</li>
 *   <li>{@link sadl.impl.ContainerMappingImpl#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerMappingImpl extends EObjectImpl implements com.leonardo.lsaf.sadl.sadl.ContainerMapping {
  /**
   * The cached value of the '{@link #getProcessor() <em>Processor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessor()
   * @generated
   * @ordered
   */
  protected com.leonardo.lsaf.sadl.sadl.Processor processor;

  /**
   * The cached value of the '{@link #getContainer() <em>Container</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainer()
   * @generated
   * @ordered
   */
  protected com.leonardo.lsaf.sadl.sadl.Container container;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContainerMappingImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SadlPackage.Literals.CONTAINER_MAPPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.Processor getProcessor() {
    if (processor != null && processor.eIsProxy()) {
      InternalEObject oldProcessor = (InternalEObject)processor;
      processor = (com.leonardo.lsaf.sadl.sadl.Processor)eResolveProxy(oldProcessor);
      if (processor != oldProcessor) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SadlPackage.CONTAINER_MAPPING__PROCESSOR, oldProcessor, processor));
      }
    }
    return processor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.leonardo.lsaf.sadl.sadl.Processor basicGetProcessor() {
    return processor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProcessor(com.leonardo.lsaf.sadl.sadl.Processor newProcessor) {
    com.leonardo.lsaf.sadl.sadl.Processor oldProcessor = processor;
    processor = newProcessor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.CONTAINER_MAPPING__PROCESSOR, oldProcessor, processor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.Container getContainer() {
    if (container != null && container.eIsProxy()) {
      InternalEObject oldContainer = (InternalEObject)container;
      container = (com.leonardo.lsaf.sadl.sadl.Container)eResolveProxy(oldContainer);
      if (container != oldContainer) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SadlPackage.CONTAINER_MAPPING__CONTAINER, oldContainer, container));
      }
    }
    return container;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.leonardo.lsaf.sadl.sadl.Container basicGetContainer() {
    return container;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setContainer(com.leonardo.lsaf.sadl.sadl.Container newContainer) {
    com.leonardo.lsaf.sadl.sadl.Container oldContainer = container;
    container = newContainer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SadlPackage.CONTAINER_MAPPING__CONTAINER, oldContainer, container));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SadlPackage.CONTAINER_MAPPING__PROCESSOR:
        if (resolve) return getProcessor();
        return basicGetProcessor();
      case SadlPackage.CONTAINER_MAPPING__CONTAINER:
        if (resolve) return getContainer();
        return basicGetContainer();
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
      case SadlPackage.CONTAINER_MAPPING__PROCESSOR:
        setProcessor((com.leonardo.lsaf.sadl.sadl.Processor)newValue);
        return;
      case SadlPackage.CONTAINER_MAPPING__CONTAINER:
        setContainer((com.leonardo.lsaf.sadl.sadl.Container)newValue);
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
      case SadlPackage.CONTAINER_MAPPING__PROCESSOR:
        setProcessor((com.leonardo.lsaf.sadl.sadl.Processor)null);
        return;
      case SadlPackage.CONTAINER_MAPPING__CONTAINER:
        setContainer((com.leonardo.lsaf.sadl.sadl.Container)null);
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
      case SadlPackage.CONTAINER_MAPPING__PROCESSOR:
        return processor != null;
      case SadlPackage.CONTAINER_MAPPING__CONTAINER:
        return container != null;
    }
    return super.eIsSet(featureID);
  }

} //ContainerMappingImpl
