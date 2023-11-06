/**
 */
package mediator.impl;

import mediator.MConnectableElement;
import mediator.MEdge;
import mediator.MElement;
import mediator.MGraph;
import mediator.MNode;
import mediator.MPort;
import mediator.MediatorFactory;
import mediator.MediatorPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sadl.SadlPackage;

import sadl.impl.SadlPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MediatorPackageImpl extends EPackageImpl implements MediatorPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mGraphEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mEdgeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mConnectableElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mPortEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see mediator.MediatorPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MediatorPackageImpl() {
    super(eNS_URI, MediatorFactory.eINSTANCE);
  }
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link MediatorPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MediatorPackage init() {
    if (isInited) return (MediatorPackage)EPackage.Registry.INSTANCE.getEPackage(MediatorPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredMediatorPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    MediatorPackageImpl theMediatorPackage = registeredMediatorPackage instanceof MediatorPackageImpl ? (MediatorPackageImpl)registeredMediatorPackage : new MediatorPackageImpl();

    isInited = true;

    // Obtain or create and register interdependencies
    Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SadlPackage.eNS_URI);
    SadlPackageImpl theSadlPackage = (SadlPackageImpl)(registeredPackage instanceof SadlPackageImpl ? registeredPackage : SadlPackage.eINSTANCE);

    // Create package meta-data objects
    theMediatorPackage.createPackageContents();
    theSadlPackage.createPackageContents();

    // Initialize created meta-data
    theMediatorPackage.initializePackageContents();
    theSadlPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMediatorPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MediatorPackage.eNS_URI, theMediatorPackage);
    return theMediatorPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMGraph() {
    return mGraphEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMGraph_Algorithm() {
    return (EAttribute)mGraphEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMGraph_Nodes() {
    return (EReference)mGraphEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMGraph_Edges() {
    return (EReference)mGraphEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMElement() {
    return mElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMElement_Id() {
    return (EAttribute)mElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMElement_Label() {
    return (EAttribute)mElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMElement_Class() {
    return (EAttribute)mElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMEdge() {
    return mEdgeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMEdge_Source() {
    return (EReference)mEdgeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMEdge_Target() {
    return (EReference)mEdgeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMConnectableElement() {
    return mConnectableElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMConnectableElement_X() {
    return (EAttribute)mConnectableElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMConnectableElement_Y() {
    return (EAttribute)mConnectableElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMConnectableElement_Width() {
    return (EAttribute)mConnectableElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMConnectableElement_Height() {
    return (EAttribute)mConnectableElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMConnectableElement_Level() {
    return (EAttribute)mConnectableElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMNode() {
    return mNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMNode_Algorithm() {
    return (EAttribute)mNodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMNode_Children() {
    return (EReference)mNodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMNode_Parent() {
    return (EReference)mNodeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMNode_Edges() {
    return (EReference)mNodeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMNode_EastPorts() {
    return (EReference)mNodeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMNode_WestPorts() {
    return (EReference)mNodeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMNode_SadlContainer() {
    return (EReference)mNodeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMPort() {
    return mPortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMPort_Offset() {
    return (EAttribute)mPortEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMPort_NumberOfIncomingOutgoingPorts() {
    return (EAttribute)mPortEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMPort_Side() {
    return (EAttribute)mPortEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMPort_SubPorts() {
    return (EReference)mPortEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMPort_Node() {
    return (EReference)mPortEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMPort_RootPort() {
    return (EReference)mPortEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMPort_ParentPort() {
    return (EReference)mPortEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMPort_SadlPort() {
    return (EReference)mPortEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MediatorFactory getMediatorFactory() {
    return (MediatorFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents() {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    mGraphEClass = createEClass(MGRAPH);
    createEAttribute(mGraphEClass, MGRAPH__ALGORITHM);
    createEReference(mGraphEClass, MGRAPH__NODES);
    createEReference(mGraphEClass, MGRAPH__EDGES);

    mElementEClass = createEClass(MELEMENT);
    createEAttribute(mElementEClass, MELEMENT__ID);
    createEAttribute(mElementEClass, MELEMENT__LABEL);
    createEAttribute(mElementEClass, MELEMENT__CLASS);

    mEdgeEClass = createEClass(MEDGE);
    createEReference(mEdgeEClass, MEDGE__SOURCE);
    createEReference(mEdgeEClass, MEDGE__TARGET);

    mConnectableElementEClass = createEClass(MCONNECTABLE_ELEMENT);
    createEAttribute(mConnectableElementEClass, MCONNECTABLE_ELEMENT__X);
    createEAttribute(mConnectableElementEClass, MCONNECTABLE_ELEMENT__Y);
    createEAttribute(mConnectableElementEClass, MCONNECTABLE_ELEMENT__WIDTH);
    createEAttribute(mConnectableElementEClass, MCONNECTABLE_ELEMENT__HEIGHT);
    createEAttribute(mConnectableElementEClass, MCONNECTABLE_ELEMENT__LEVEL);

    mNodeEClass = createEClass(MNODE);
    createEAttribute(mNodeEClass, MNODE__ALGORITHM);
    createEReference(mNodeEClass, MNODE__CHILDREN);
    createEReference(mNodeEClass, MNODE__PARENT);
    createEReference(mNodeEClass, MNODE__EDGES);
    createEReference(mNodeEClass, MNODE__EAST_PORTS);
    createEReference(mNodeEClass, MNODE__WEST_PORTS);
    createEReference(mNodeEClass, MNODE__SADL_CONTAINER);

    mPortEClass = createEClass(MPORT);
    createEAttribute(mPortEClass, MPORT__OFFSET);
    createEAttribute(mPortEClass, MPORT__NUMBER_OF_INCOMING_OUTGOING_PORTS);
    createEAttribute(mPortEClass, MPORT__SIDE);
    createEReference(mPortEClass, MPORT__SUB_PORTS);
    createEReference(mPortEClass, MPORT__NODE);
    createEReference(mPortEClass, MPORT__ROOT_PORT);
    createEReference(mPortEClass, MPORT__PARENT_PORT);
    createEReference(mPortEClass, MPORT__SADL_PORT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents() {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    SadlPackage theSadlPackage = (SadlPackage)EPackage.Registry.INSTANCE.getEPackage(SadlPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    mGraphEClass.getESuperTypes().add(this.getMElement());
    mEdgeEClass.getESuperTypes().add(this.getMElement());
    mConnectableElementEClass.getESuperTypes().add(this.getMElement());
    mNodeEClass.getESuperTypes().add(this.getMConnectableElement());
    mPortEClass.getESuperTypes().add(this.getMConnectableElement());

    // Initialize classes and features; add operations and parameters
    initEClass(mGraphEClass, MGraph.class, "MGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMGraph_Algorithm(), ecorePackage.getEString(), "algorithm", null, 0, 1, MGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMGraph_Nodes(), this.getMNode(), null, "nodes", null, 0, -1, MGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMGraph_Edges(), this.getMEdge(), null, "edges", null, 0, -1, MGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mElementEClass, MElement.class, "MElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, MElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMElement_Label(), ecorePackage.getEString(), "label", null, 0, 1, MElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, MElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mEdgeEClass, MEdge.class, "MEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMEdge_Source(), this.getMConnectableElement(), null, "source", null, 0, 1, MEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMEdge_Target(), this.getMConnectableElement(), null, "target", null, 0, 1, MEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mConnectableElementEClass, MConnectableElement.class, "MConnectableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMConnectableElement_X(), ecorePackage.getEInt(), "x", "0", 0, 1, MConnectableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMConnectableElement_Y(), ecorePackage.getEInt(), "y", "0", 0, 1, MConnectableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMConnectableElement_Width(), ecorePackage.getEInt(), "width", "5", 0, 1, MConnectableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMConnectableElement_Height(), ecorePackage.getEInt(), "height", "5", 0, 1, MConnectableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMConnectableElement_Level(), ecorePackage.getEInt(), "level", "0", 0, 1, MConnectableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mNodeEClass, MNode.class, "MNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMNode_Algorithm(), ecorePackage.getEString(), "algorithm", null, 0, 1, MNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMNode_Children(), this.getMNode(), null, "children", null, 0, -1, MNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMNode_Parent(), this.getMNode(), null, "parent", null, 0, 1, MNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMNode_Edges(), this.getMEdge(), null, "edges", null, 0, -1, MNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMNode_EastPorts(), this.getMPort(), null, "eastPorts", null, 0, -1, MNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMNode_WestPorts(), this.getMPort(), null, "westPorts", null, 0, -1, MNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMNode_SadlContainer(), ecorePackage.getEObject(), null, "sadlContainer", null, 0, 1, MNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mPortEClass, MPort.class, "MPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMPort_Offset(), ecorePackage.getEInt(), "offset", "0", 0, 1, MPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMPort_NumberOfIncomingOutgoingPorts(), ecorePackage.getEInt(), "numberOfIncomingOutgoingPorts", "0", 0, 1, MPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMPort_Side(), ecorePackage.getEString(), "side", "EAST", 0, 1, MPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMPort_SubPorts(), this.getMPort(), null, "subPorts", null, 0, -1, MPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMPort_Node(), this.getMNode(), null, "node", null, 0, 1, MPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMPort_RootPort(), this.getMPort(), null, "rootPort", null, 0, 1, MPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMPort_ParentPort(), this.getMPort(), null, "parentPort", null, 0, 1, MPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMPort_SadlPort(), theSadlPackage.getPort(), null, "sadlPort", null, 0, 1, MPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MediatorPackageImpl
