/**
 */
package mediator.impl;

import mediator.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MediatorFactoryImpl extends EFactoryImpl implements MediatorFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MediatorFactory init() {
    try {
      MediatorFactory theMediatorFactory = (MediatorFactory)EPackage.Registry.INSTANCE.getEFactory(MediatorPackage.eNS_URI);
      if (theMediatorFactory != null) {
        return theMediatorFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MediatorFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MediatorFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case MediatorPackage.MGRAPH: return createMGraph();
      case MediatorPackage.MEDGE: return createMEdge();
      case MediatorPackage.MCONNECTABLE_ELEMENT: return createMConnectableElement();
      case MediatorPackage.MNODE: return createMNode();
      case MediatorPackage.MPORT: return createMPort();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MGraph createMGraph() {
    MGraphImpl mGraph = new MGraphImpl();
    return mGraph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MEdge createMEdge() {
    MEdgeImpl mEdge = new MEdgeImpl();
    return mEdge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MConnectableElement createMConnectableElement() {
    MConnectableElementImpl mConnectableElement = new MConnectableElementImpl();
    return mConnectableElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MNode createMNode() {
    MNodeImpl mNode = new MNodeImpl();
    return mNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MPort createMPort() {
    MPortImpl mPort = new MPortImpl();
    return mPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MediatorPackage getMediatorPackage() {
    return (MediatorPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MediatorPackage getPackage() {
    return MediatorPackage.eINSTANCE;
  }

} //MediatorFactoryImpl
