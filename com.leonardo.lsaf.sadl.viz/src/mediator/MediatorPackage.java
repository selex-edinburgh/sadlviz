/**
 */
package mediator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * The mediator model to calculate the automatic layout
 * of nested ports.
 * 
 * Year: 2023
 * Author: Alfa Yohannis
 * 
 * <!-- end-model-doc -->
 * @see mediator.MediatorFactory
 * @model kind="package"
 * @generated
 */
public interface MediatorPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mediator";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.leonardo.com/lsaf/sadl/mediator";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mediator";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MediatorPackage eINSTANCE = mediator.impl.MediatorPackageImpl.init();

  /**
   * The meta object id for the '{@link mediator.impl.MElementImpl <em>MElement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mediator.impl.MElementImpl
   * @see mediator.impl.MediatorPackageImpl#getMElement()
   * @generated
   */
  int MELEMENT = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MELEMENT__ID = 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MELEMENT__LABEL = 1;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MELEMENT__CLASS = 2;

  /**
   * The number of structural features of the '<em>MElement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MELEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link mediator.impl.MGraphImpl <em>MGraph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mediator.impl.MGraphImpl
   * @see mediator.impl.MediatorPackageImpl#getMGraph()
   * @generated
   */
  int MGRAPH = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MGRAPH__ID = MELEMENT__ID;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MGRAPH__LABEL = MELEMENT__LABEL;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MGRAPH__CLASS = MELEMENT__CLASS;

  /**
   * The feature id for the '<em><b>Algorithm</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MGRAPH__ALGORITHM = MELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MGRAPH__NODES = MELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Edges</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MGRAPH__EDGES = MELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>MGraph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MGRAPH_FEATURE_COUNT = MELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link mediator.impl.MEdgeImpl <em>MEdge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mediator.impl.MEdgeImpl
   * @see mediator.impl.MediatorPackageImpl#getMEdge()
   * @generated
   */
  int MEDGE = 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDGE__ID = MELEMENT__ID;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDGE__LABEL = MELEMENT__LABEL;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDGE__CLASS = MELEMENT__CLASS;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDGE__SOURCE = MELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDGE__TARGET = MELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>MEdge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDGE_FEATURE_COUNT = MELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link mediator.impl.MConnectableElementImpl <em>MConnectable Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mediator.impl.MConnectableElementImpl
   * @see mediator.impl.MediatorPackageImpl#getMConnectableElement()
   * @generated
   */
  int MCONNECTABLE_ELEMENT = 3;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCONNECTABLE_ELEMENT__ID = MELEMENT__ID;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCONNECTABLE_ELEMENT__LABEL = MELEMENT__LABEL;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCONNECTABLE_ELEMENT__CLASS = MELEMENT__CLASS;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCONNECTABLE_ELEMENT__X = MELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCONNECTABLE_ELEMENT__Y = MELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCONNECTABLE_ELEMENT__WIDTH = MELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCONNECTABLE_ELEMENT__HEIGHT = MELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCONNECTABLE_ELEMENT__LEVEL = MELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>MConnectable Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCONNECTABLE_ELEMENT_FEATURE_COUNT = MELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link mediator.impl.MNodeImpl <em>MNode</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mediator.impl.MNodeImpl
   * @see mediator.impl.MediatorPackageImpl#getMNode()
   * @generated
   */
  int MNODE = 4;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MNODE__ID = MCONNECTABLE_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MNODE__LABEL = MCONNECTABLE_ELEMENT__LABEL;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MNODE__CLASS = MCONNECTABLE_ELEMENT__CLASS;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MNODE__X = MCONNECTABLE_ELEMENT__X;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MNODE__Y = MCONNECTABLE_ELEMENT__Y;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MNODE__WIDTH = MCONNECTABLE_ELEMENT__WIDTH;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MNODE__HEIGHT = MCONNECTABLE_ELEMENT__HEIGHT;

  /**
   * The feature id for the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MNODE__LEVEL = MCONNECTABLE_ELEMENT__LEVEL;

  /**
   * The feature id for the '<em><b>Algorithm</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MNODE__ALGORITHM = MCONNECTABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MNODE__CHILDREN = MCONNECTABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MNODE__PARENT = MCONNECTABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Edges</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MNODE__EDGES = MCONNECTABLE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>East Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MNODE__EAST_PORTS = MCONNECTABLE_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>West Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MNODE__WEST_PORTS = MCONNECTABLE_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Packageable Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MNODE__PACKAGEABLE_ELEMENT = MCONNECTABLE_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>MNode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MNODE_FEATURE_COUNT = MCONNECTABLE_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link mediator.impl.MPortImpl <em>MPort</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mediator.impl.MPortImpl
   * @see mediator.impl.MediatorPackageImpl#getMPort()
   * @generated
   */
  int MPORT = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MPORT__ID = MCONNECTABLE_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MPORT__LABEL = MCONNECTABLE_ELEMENT__LABEL;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MPORT__CLASS = MCONNECTABLE_ELEMENT__CLASS;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MPORT__X = MCONNECTABLE_ELEMENT__X;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MPORT__Y = MCONNECTABLE_ELEMENT__Y;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MPORT__WIDTH = MCONNECTABLE_ELEMENT__WIDTH;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MPORT__HEIGHT = MCONNECTABLE_ELEMENT__HEIGHT;

  /**
   * The feature id for the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MPORT__LEVEL = MCONNECTABLE_ELEMENT__LEVEL;

  /**
   * The feature id for the '<em><b>Offset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MPORT__OFFSET = MCONNECTABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Number Of Incoming Outgoing Ports</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MPORT__NUMBER_OF_INCOMING_OUTGOING_PORTS = MCONNECTABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Side</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MPORT__SIDE = MCONNECTABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Sub Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MPORT__SUB_PORTS = MCONNECTABLE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MPORT__NODE = MCONNECTABLE_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Root Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MPORT__ROOT_PORT = MCONNECTABLE_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Parent Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MPORT__PARENT_PORT = MCONNECTABLE_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Sadl Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MPORT__SADL_PORT = MCONNECTABLE_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>MPort</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MPORT_FEATURE_COUNT = MCONNECTABLE_ELEMENT_FEATURE_COUNT + 8;


  /**
   * Returns the meta object for class '{@link mediator.MGraph <em>MGraph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MGraph</em>'.
   * @see mediator.MGraph
   * @generated
   */
  EClass getMGraph();

  /**
   * Returns the meta object for the attribute '{@link mediator.MGraph#getAlgorithm <em>Algorithm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Algorithm</em>'.
   * @see mediator.MGraph#getAlgorithm()
   * @see #getMGraph()
   * @generated
   */
  EAttribute getMGraph_Algorithm();

  /**
   * Returns the meta object for the containment reference list '{@link mediator.MGraph#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nodes</em>'.
   * @see mediator.MGraph#getNodes()
   * @see #getMGraph()
   * @generated
   */
  EReference getMGraph_Nodes();

  /**
   * Returns the meta object for the containment reference list '{@link mediator.MGraph#getEdges <em>Edges</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Edges</em>'.
   * @see mediator.MGraph#getEdges()
   * @see #getMGraph()
   * @generated
   */
  EReference getMGraph_Edges();

  /**
   * Returns the meta object for class '{@link mediator.MElement <em>MElement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MElement</em>'.
   * @see mediator.MElement
   * @generated
   */
  EClass getMElement();

  /**
   * Returns the meta object for the attribute '{@link mediator.MElement#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see mediator.MElement#getId()
   * @see #getMElement()
   * @generated
   */
  EAttribute getMElement_Id();

  /**
   * Returns the meta object for the attribute '{@link mediator.MElement#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see mediator.MElement#getLabel()
   * @see #getMElement()
   * @generated
   */
  EAttribute getMElement_Label();

  /**
   * Returns the meta object for the attribute '{@link mediator.MElement#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see mediator.MElement#getClass_()
   * @see #getMElement()
   * @generated
   */
  EAttribute getMElement_Class();

  /**
   * Returns the meta object for class '{@link mediator.MEdge <em>MEdge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MEdge</em>'.
   * @see mediator.MEdge
   * @generated
   */
  EClass getMEdge();

  /**
   * Returns the meta object for the reference '{@link mediator.MEdge#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see mediator.MEdge#getSource()
   * @see #getMEdge()
   * @generated
   */
  EReference getMEdge_Source();

  /**
   * Returns the meta object for the reference '{@link mediator.MEdge#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see mediator.MEdge#getTarget()
   * @see #getMEdge()
   * @generated
   */
  EReference getMEdge_Target();

  /**
   * Returns the meta object for class '{@link mediator.MConnectableElement <em>MConnectable Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MConnectable Element</em>'.
   * @see mediator.MConnectableElement
   * @generated
   */
  EClass getMConnectableElement();

  /**
   * Returns the meta object for the attribute '{@link mediator.MConnectableElement#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see mediator.MConnectableElement#getX()
   * @see #getMConnectableElement()
   * @generated
   */
  EAttribute getMConnectableElement_X();

  /**
   * Returns the meta object for the attribute '{@link mediator.MConnectableElement#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see mediator.MConnectableElement#getY()
   * @see #getMConnectableElement()
   * @generated
   */
  EAttribute getMConnectableElement_Y();

  /**
   * Returns the meta object for the attribute '{@link mediator.MConnectableElement#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see mediator.MConnectableElement#getWidth()
   * @see #getMConnectableElement()
   * @generated
   */
  EAttribute getMConnectableElement_Width();

  /**
   * Returns the meta object for the attribute '{@link mediator.MConnectableElement#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height</em>'.
   * @see mediator.MConnectableElement#getHeight()
   * @see #getMConnectableElement()
   * @generated
   */
  EAttribute getMConnectableElement_Height();

  /**
   * Returns the meta object for the attribute '{@link mediator.MConnectableElement#getLevel <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Level</em>'.
   * @see mediator.MConnectableElement#getLevel()
   * @see #getMConnectableElement()
   * @generated
   */
  EAttribute getMConnectableElement_Level();

  /**
   * Returns the meta object for class '{@link mediator.MNode <em>MNode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MNode</em>'.
   * @see mediator.MNode
   * @generated
   */
  EClass getMNode();

  /**
   * Returns the meta object for the attribute '{@link mediator.MNode#getAlgorithm <em>Algorithm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Algorithm</em>'.
   * @see mediator.MNode#getAlgorithm()
   * @see #getMNode()
   * @generated
   */
  EAttribute getMNode_Algorithm();

  /**
   * Returns the meta object for the containment reference list '{@link mediator.MNode#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see mediator.MNode#getChildren()
   * @see #getMNode()
   * @generated
   */
  EReference getMNode_Children();

  /**
   * Returns the meta object for the reference '{@link mediator.MNode#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see mediator.MNode#getParent()
   * @see #getMNode()
   * @generated
   */
  EReference getMNode_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link mediator.MNode#getEdges <em>Edges</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Edges</em>'.
   * @see mediator.MNode#getEdges()
   * @see #getMNode()
   * @generated
   */
  EReference getMNode_Edges();

  /**
   * Returns the meta object for the containment reference list '{@link mediator.MNode#getEastPorts <em>East Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>East Ports</em>'.
   * @see mediator.MNode#getEastPorts()
   * @see #getMNode()
   * @generated
   */
  EReference getMNode_EastPorts();

  /**
   * Returns the meta object for the containment reference list '{@link mediator.MNode#getWestPorts <em>West Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>West Ports</em>'.
   * @see mediator.MNode#getWestPorts()
   * @see #getMNode()
   * @generated
   */
  EReference getMNode_WestPorts();

  /**
   * Returns the meta object for the reference '{@link mediator.MNode#getPackageableElement <em>Packageable Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Packageable Element</em>'.
   * @see mediator.MNode#getPackageableElement()
   * @see #getMNode()
   * @generated
   */
  EReference getMNode_PackageableElement();

  /**
   * Returns the meta object for class '{@link mediator.MPort <em>MPort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MPort</em>'.
   * @see mediator.MPort
   * @generated
   */
  EClass getMPort();

  /**
   * Returns the meta object for the attribute '{@link mediator.MPort#getOffset <em>Offset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Offset</em>'.
   * @see mediator.MPort#getOffset()
   * @see #getMPort()
   * @generated
   */
  EAttribute getMPort_Offset();

  /**
   * Returns the meta object for the attribute '{@link mediator.MPort#getNumberOfIncomingOutgoingPorts <em>Number Of Incoming Outgoing Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number Of Incoming Outgoing Ports</em>'.
   * @see mediator.MPort#getNumberOfIncomingOutgoingPorts()
   * @see #getMPort()
   * @generated
   */
  EAttribute getMPort_NumberOfIncomingOutgoingPorts();

  /**
   * Returns the meta object for the attribute '{@link mediator.MPort#getSide <em>Side</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Side</em>'.
   * @see mediator.MPort#getSide()
   * @see #getMPort()
   * @generated
   */
  EAttribute getMPort_Side();

  /**
   * Returns the meta object for the containment reference list '{@link mediator.MPort#getSubPorts <em>Sub Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Ports</em>'.
   * @see mediator.MPort#getSubPorts()
   * @see #getMPort()
   * @generated
   */
  EReference getMPort_SubPorts();

  /**
   * Returns the meta object for the reference '{@link mediator.MPort#getNode <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Node</em>'.
   * @see mediator.MPort#getNode()
   * @see #getMPort()
   * @generated
   */
  EReference getMPort_Node();

  /**
   * Returns the meta object for the reference '{@link mediator.MPort#getRootPort <em>Root Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Root Port</em>'.
   * @see mediator.MPort#getRootPort()
   * @see #getMPort()
   * @generated
   */
  EReference getMPort_RootPort();

  /**
   * Returns the meta object for the reference '{@link mediator.MPort#getParentPort <em>Parent Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent Port</em>'.
   * @see mediator.MPort#getParentPort()
   * @see #getMPort()
   * @generated
   */
  EReference getMPort_ParentPort();

  /**
   * Returns the meta object for the reference '{@link mediator.MPort#getSadlPort <em>Sadl Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Sadl Port</em>'.
   * @see mediator.MPort#getSadlPort()
   * @see #getMPort()
   * @generated
   */
  EReference getMPort_SadlPort();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MediatorFactory getMediatorFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals {
    /**
     * The meta object literal for the '{@link mediator.impl.MGraphImpl <em>MGraph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mediator.impl.MGraphImpl
     * @see mediator.impl.MediatorPackageImpl#getMGraph()
     * @generated
     */
    EClass MGRAPH = eINSTANCE.getMGraph();

    /**
     * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MGRAPH__ALGORITHM = eINSTANCE.getMGraph_Algorithm();

    /**
     * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MGRAPH__NODES = eINSTANCE.getMGraph_Nodes();

    /**
     * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MGRAPH__EDGES = eINSTANCE.getMGraph_Edges();

    /**
     * The meta object literal for the '{@link mediator.impl.MElementImpl <em>MElement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mediator.impl.MElementImpl
     * @see mediator.impl.MediatorPackageImpl#getMElement()
     * @generated
     */
    EClass MELEMENT = eINSTANCE.getMElement();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MELEMENT__ID = eINSTANCE.getMElement_Id();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MELEMENT__LABEL = eINSTANCE.getMElement_Label();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MELEMENT__CLASS = eINSTANCE.getMElement_Class();

    /**
     * The meta object literal for the '{@link mediator.impl.MEdgeImpl <em>MEdge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mediator.impl.MEdgeImpl
     * @see mediator.impl.MediatorPackageImpl#getMEdge()
     * @generated
     */
    EClass MEDGE = eINSTANCE.getMEdge();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEDGE__SOURCE = eINSTANCE.getMEdge_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEDGE__TARGET = eINSTANCE.getMEdge_Target();

    /**
     * The meta object literal for the '{@link mediator.impl.MConnectableElementImpl <em>MConnectable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mediator.impl.MConnectableElementImpl
     * @see mediator.impl.MediatorPackageImpl#getMConnectableElement()
     * @generated
     */
    EClass MCONNECTABLE_ELEMENT = eINSTANCE.getMConnectableElement();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MCONNECTABLE_ELEMENT__X = eINSTANCE.getMConnectableElement_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MCONNECTABLE_ELEMENT__Y = eINSTANCE.getMConnectableElement_Y();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MCONNECTABLE_ELEMENT__WIDTH = eINSTANCE.getMConnectableElement_Width();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MCONNECTABLE_ELEMENT__HEIGHT = eINSTANCE.getMConnectableElement_Height();

    /**
     * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MCONNECTABLE_ELEMENT__LEVEL = eINSTANCE.getMConnectableElement_Level();

    /**
     * The meta object literal for the '{@link mediator.impl.MNodeImpl <em>MNode</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mediator.impl.MNodeImpl
     * @see mediator.impl.MediatorPackageImpl#getMNode()
     * @generated
     */
    EClass MNODE = eINSTANCE.getMNode();

    /**
     * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MNODE__ALGORITHM = eINSTANCE.getMNode_Algorithm();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MNODE__CHILDREN = eINSTANCE.getMNode_Children();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MNODE__PARENT = eINSTANCE.getMNode_Parent();

    /**
     * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MNODE__EDGES = eINSTANCE.getMNode_Edges();

    /**
     * The meta object literal for the '<em><b>East Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MNODE__EAST_PORTS = eINSTANCE.getMNode_EastPorts();

    /**
     * The meta object literal for the '<em><b>West Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MNODE__WEST_PORTS = eINSTANCE.getMNode_WestPorts();

    /**
     * The meta object literal for the '<em><b>Packageable Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MNODE__PACKAGEABLE_ELEMENT = eINSTANCE.getMNode_PackageableElement();

    /**
     * The meta object literal for the '{@link mediator.impl.MPortImpl <em>MPort</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mediator.impl.MPortImpl
     * @see mediator.impl.MediatorPackageImpl#getMPort()
     * @generated
     */
    EClass MPORT = eINSTANCE.getMPort();

    /**
     * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MPORT__OFFSET = eINSTANCE.getMPort_Offset();

    /**
     * The meta object literal for the '<em><b>Number Of Incoming Outgoing Ports</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MPORT__NUMBER_OF_INCOMING_OUTGOING_PORTS = eINSTANCE.getMPort_NumberOfIncomingOutgoingPorts();

    /**
     * The meta object literal for the '<em><b>Side</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MPORT__SIDE = eINSTANCE.getMPort_Side();

    /**
     * The meta object literal for the '<em><b>Sub Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MPORT__SUB_PORTS = eINSTANCE.getMPort_SubPorts();

    /**
     * The meta object literal for the '<em><b>Node</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MPORT__NODE = eINSTANCE.getMPort_Node();

    /**
     * The meta object literal for the '<em><b>Root Port</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MPORT__ROOT_PORT = eINSTANCE.getMPort_RootPort();

    /**
     * The meta object literal for the '<em><b>Parent Port</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MPORT__PARENT_PORT = eINSTANCE.getMPort_ParentPort();

    /**
     * The meta object literal for the '<em><b>Sadl Port</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MPORT__SADL_PORT = eINSTANCE.getMPort_SadlPort();

  }

} //MediatorPackage
