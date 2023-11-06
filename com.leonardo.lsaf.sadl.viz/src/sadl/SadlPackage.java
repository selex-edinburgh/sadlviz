/**
 */
package sadl;

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
 * @see sadl.SadlFactory
 * @model kind="package"
 * @generated
 */
public interface SadlPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sadl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.leonardo.com/lsaf/sadl/SADL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sadl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SadlPackage eINSTANCE = sadl.impl.SadlPackageImpl.init();

  /**
   * The meta object id for the '{@link sadl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.ModelImpl
   * @see sadl.impl.SadlPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Package</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PACKAGE = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sadl.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.PackageImpl
   * @see sadl.impl.SadlPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__CONTENTS = 2;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link sadl.impl.PackageableElementImpl <em>Packageable Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.PackageableElementImpl
   * @see sadl.impl.SadlPackageImpl#getPackageableElement()
   * @generated
   */
  int PACKAGEABLE_ELEMENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGEABLE_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Packageable Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGEABLE_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sadl.impl.UnitImpl <em>Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.UnitImpl
   * @see sadl.impl.SadlPackageImpl#getUnit()
   * @generated
   */
  int UNIT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT__NAME = PACKAGEABLE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Group</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT__GROUP = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT__DESCRIPTION = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link sadl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.TypeImpl
   * @see sadl.impl.SadlPackageImpl#getType()
   * @generated
   */
  int TYPE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = PACKAGEABLE_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link sadl.impl.PrimitiveImpl <em>Primitive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.PrimitiveImpl
   * @see sadl.impl.SadlPackageImpl#getPrimitive()
   * @generated
   */
  int PRIMITIVE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE__MIN = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE__MAX = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Res</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE__RES = TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Primitive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link sadl.impl.InterfaceImpl <em>Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.InterfaceImpl
   * @see sadl.impl.SadlPackageImpl#getInterface()
   * @generated
   */
  int INTERFACE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__NAME = PACKAGEABLE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__DESCRIPTION = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__PORTS = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link sadl.impl.EnumerationImpl <em>Enumeration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.EnumerationImpl
   * @see sadl.impl.SadlPackageImpl#getEnumeration()
   * @generated
   */
  int ENUMERATION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__DESCRIPTION = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Enumerators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__ENUMERATORS = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enumeration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link sadl.impl.TopicImpl <em>Topic</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.TopicImpl
   * @see sadl.impl.SadlPackageImpl#getTopic()
   * @generated
   */
  int TOPIC = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPIC__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPIC__DESCRIPTION = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPIC__ATTRIBUTES = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Topic</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPIC_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link sadl.impl.AliasImpl <em>Alias</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.AliasImpl
   * @see sadl.impl.SadlPackageImpl#getAlias()
   * @generated
   */
  int ALIAS = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS__TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS__MIN = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS__MAX = TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Res</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS__RES = TYPE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Unbounded</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS__UNBOUNDED = TYPE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Upperbound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS__UPPERBOUND = TYPE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Unit</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS__UNIT = TYPE_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS__DESCRIPTION = TYPE_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Alias</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link sadl.impl.PortImpl <em>Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.PortImpl
   * @see sadl.impl.SadlPackageImpl#getPort()
   * @generated
   */
  int PORT = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__NAME = 0;

  /**
   * The feature id for the '<em><b>Conjugated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__CONJUGATED = 1;

  /**
   * The number of structural features of the '<em>Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sadl.impl.EnumeratorImpl <em>Enumerator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.EnumeratorImpl
   * @see sadl.impl.SadlPackageImpl#getEnumerator()
   * @generated
   */
  int ENUMERATOR = 11;

  /**
   * The feature id for the '<em><b>Deprecated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATOR__DEPRECATED = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATOR__NAME = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATOR__VALUE = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATOR__DESCRIPTION = 3;

  /**
   * The number of structural features of the '<em>Enumerator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATOR_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link sadl.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.AttributeImpl
   * @see sadl.impl.SadlPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 12;

  /**
   * The feature id for the '<em><b>Deprecated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__DEPRECATED = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 2;

  /**
   * The feature id for the '<em><b>Unbounded</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__UNBOUNDED = 3;

  /**
   * The feature id for the '<em><b>Lowerbound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__LOWERBOUND = 4;

  /**
   * The feature id for the '<em><b>Upperbound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__UPPERBOUND = 5;

  /**
   * The feature id for the '<em><b>Unit</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__UNIT = 6;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__DESCRIPTION = 7;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link sadl.impl.TopicPortImpl <em>Topic Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.TopicPortImpl
   * @see sadl.impl.SadlPackageImpl#getTopicPort()
   * @generated
   */
  int TOPIC_PORT = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPIC_PORT__NAME = PORT__NAME;

  /**
   * The feature id for the '<em><b>Conjugated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPIC_PORT__CONJUGATED = PORT__CONJUGATED;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPIC_PORT__TYPE = PORT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Topic Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPIC_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link sadl.impl.InterfacePortImpl <em>Interface Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.InterfacePortImpl
   * @see sadl.impl.SadlPackageImpl#getInterfacePort()
   * @generated
   */
  int INTERFACE_PORT = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_PORT__NAME = PORT__NAME;

  /**
   * The feature id for the '<em><b>Conjugated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_PORT__CONJUGATED = PORT__CONJUGATED;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_PORT__TYPE = PORT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Interface Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link sadl.impl.PlatformImpl <em>Platform</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.PlatformImpl
   * @see sadl.impl.SadlPackageImpl#getPlatform()
   * @generated
   */
  int PLATFORM = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLATFORM__NAME = PACKAGEABLE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLATFORM__DESCRIPTION = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Processors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLATFORM__PROCESSORS = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLATFORM__LINKS = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Platform</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLATFORM_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link sadl.impl.ProcessorImpl <em>Processor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.ProcessorImpl
   * @see sadl.impl.SadlPackageImpl#getProcessor()
   * @generated
   */
  int PROCESSOR = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSOR__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Processor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sadl.impl.LinkImpl <em>Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.LinkImpl
   * @see sadl.impl.SadlPackageImpl#getLink()
   * @generated
   */
  int LINK = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Processors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__PROCESSORS = 2;

  /**
   * The feature id for the '<em><b>Transport</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__TRANSPORT = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__VALUE = 4;

  /**
   * The number of structural features of the '<em>Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link sadl.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.PropertyImpl
   * @see sadl.impl.SadlPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__OPTIONAL = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DESCRIPTION = 2;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link sadl.impl.PropertyValueImpl <em>Property Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.PropertyValueImpl
   * @see sadl.impl.SadlPackageImpl#getPropertyValue()
   * @generated
   */
  int PROPERTY_VALUE = 19;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_VALUE__PROPERTY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_VALUE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Property Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sadl.impl.TransportImpl <em>Transport</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.TransportImpl
   * @see sadl.impl.SadlPackageImpl#getTransport()
   * @generated
   */
  int TRANSPORT = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSPORT__NAME = PACKAGEABLE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSPORT__DESCRIPTION = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSPORT__PROPERTIES = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Transport</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSPORT_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link sadl.impl.ApplicationImpl <em>Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.ApplicationImpl
   * @see sadl.impl.SadlPackageImpl#getApplication()
   * @generated
   */
  int APPLICATION = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__NAME = PACKAGEABLE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__DESCRIPTION = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Container Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__CONTAINER_INSTANCES = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link sadl.impl.ContainerImpl <em>Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.ContainerImpl
   * @see sadl.impl.SadlPackageImpl#getContainer()
   * @generated
   */
  int CONTAINER = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__NAME = PACKAGEABLE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__DESCRIPTION = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Component Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__COMPONENT_INSTANCES = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Connections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__CONNECTIONS = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Container Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__CONTAINER_INSTANCES = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link sadl.impl.ContainerInstanceImpl <em>Container Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.ContainerInstanceImpl
   * @see sadl.impl.SadlPackageImpl#getContainerInstance()
   * @generated
   */
  int CONTAINER_INSTANCE = 23;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_INSTANCE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_INSTANCE__NAME = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_INSTANCE__DESCRIPTION = 2;

  /**
   * The number of structural features of the '<em>Container Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_INSTANCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link sadl.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.ComponentImpl
   * @see sadl.impl.SadlPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = PACKAGEABLE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__DESCRIPTION = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__PARTS = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__PORTS = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link sadl.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.ComponentInstanceImpl
   * @see sadl.impl.SadlPackageImpl#getComponentInstance()
   * @generated
   */
  int COMPONENT_INSTANCE = 25;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_INSTANCE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_INSTANCE__NAME = 1;

  /**
   * The feature id for the '<em><b>Unbounded</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_INSTANCE__UNBOUNDED = 2;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_INSTANCE__LOWER_BOUND = 3;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_INSTANCE__UPPER_BOUND = 4;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_INSTANCE__DESCRIPTION = 5;

  /**
   * The number of structural features of the '<em>Component Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_INSTANCE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link sadl.impl.ConnectionImpl <em>Connection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.ConnectionImpl
   * @see sadl.impl.SadlPackageImpl#getConnection()
   * @generated
   */
  int CONNECTION = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION__NAME = 0;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION__FROM = 1;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION__SOURCE = 2;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION__TO = 3;

  /**
   * The feature id for the '<em><b>Destination</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION__DESTINATION = 4;

  /**
   * The feature id for the '<em><b>Strategy</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION__STRATEGY = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION__VALUE = 6;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION__DESCRIPTION = 7;

  /**
   * The number of structural features of the '<em>Connection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link sadl.impl.DeploymentImpl <em>Deployment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.DeploymentImpl
   * @see sadl.impl.SadlPackageImpl#getDeployment()
   * @generated
   */
  int DEPLOYMENT = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT__NAME = PACKAGEABLE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT__DESCRIPTION = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Containermapping</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT__CONTAINERMAPPING = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Connectionmapping</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT__CONNECTIONMAPPING = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Deployment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link sadl.impl.ContainerMappingImpl <em>Container Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.ContainerMappingImpl
   * @see sadl.impl.SadlPackageImpl#getContainerMapping()
   * @generated
   */
  int CONTAINER_MAPPING = 28;

  /**
   * The feature id for the '<em><b>Processor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_MAPPING__PROCESSOR = 0;

  /**
   * The feature id for the '<em><b>Container</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_MAPPING__CONTAINER = 1;

  /**
   * The number of structural features of the '<em>Container Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_MAPPING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sadl.impl.ConnectionMappingImpl <em>Connection Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.ConnectionMappingImpl
   * @see sadl.impl.SadlPackageImpl#getConnectionMapping()
   * @generated
   */
  int CONNECTION_MAPPING = 29;

  /**
   * The feature id for the '<em><b>Link</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_MAPPING__LINK = 0;

  /**
   * The feature id for the '<em><b>Connection</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_MAPPING__CONNECTION = 1;

  /**
   * The number of structural features of the '<em>Connection Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_MAPPING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sadl.impl.StrategyImpl <em>Strategy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sadl.impl.StrategyImpl
   * @see sadl.impl.SadlPackageImpl#getStrategy()
   * @generated
   */
  int STRATEGY = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY__NAME = PACKAGEABLE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY__DESCRIPTION = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY__PROPERTIES = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Strategy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.leonardo.lsaf.sadl.sadl.Model#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Package</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Model#getPackage()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Package();

  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Package#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Package#getName()
   * @see #getPackage()
   * @generated
   */
  EAttribute getPackage_Name();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Package#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Package#getDescription()
   * @see #getPackage()
   * @generated
   */
  EAttribute getPackage_Description();

  /**
   * Returns the meta object for the containment reference list '{@link com.leonardo.lsaf.sadl.sadl.Package#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Package#getContents()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Contents();

  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.PackageableElement <em>Packageable Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Packageable Element</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.PackageableElement
   * @generated
   */
  EClass getPackageableElement();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.PackageableElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.PackageableElement#getName()
   * @see #getPackageableElement()
   * @generated
   */
  EAttribute getPackageableElement_Name();

  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.Unit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unit</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Unit
   * @generated
   */
  EClass getUnit();

  /**
   * Returns the meta object for the reference '{@link com.leonardo.lsaf.sadl.sadl.Unit#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Group</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Unit#getGroup()
   * @see #getUnit()
   * @generated
   */
  EReference getUnit_Group();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Unit#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Unit#getDescription()
   * @see #getUnit()
   * @generated
   */
  EAttribute getUnit_Description();

  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.Primitive <em>Primitive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Primitive
   * @generated
   */
  EClass getPrimitive();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Primitive#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Primitive#getMin()
   * @see #getPrimitive()
   * @generated
   */
  EAttribute getPrimitive_Min();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Primitive#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Primitive#getMax()
   * @see #getPrimitive()
   * @generated
   */
  EAttribute getPrimitive_Max();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Primitive#getRes <em>Res</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Res</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Primitive#getRes()
   * @see #getPrimitive()
   * @generated
   */
  EAttribute getPrimitive_Res();

  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Interface
   * @generated
   */
  EClass getInterface();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Interface#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Interface#getDescription()
   * @see #getInterface()
   * @generated
   */
  EAttribute getInterface_Description();

  /**
   * Returns the meta object for the containment reference list '{@link com.leonardo.lsaf.sadl.sadl.Interface#getPorts <em>Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ports</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Interface#getPorts()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_Ports();

  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Enumeration
   * @generated
   */
  EClass getEnumeration();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Enumeration#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Enumeration#getDescription()
   * @see #getEnumeration()
   * @generated
   */
  EAttribute getEnumeration_Description();

  /**
   * Returns the meta object for the containment reference list '{@link com.leonardo.lsaf.sadl.sadl.Enumeration#getEnumerators <em>Enumerators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enumerators</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Enumeration#getEnumerators()
   * @see #getEnumeration()
   * @generated
   */
  EReference getEnumeration_Enumerators();

  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.Topic <em>Topic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Topic</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Topic
   * @generated
   */
  EClass getTopic();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Topic#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Topic#getDescription()
   * @see #getTopic()
   * @generated
   */
  EAttribute getTopic_Description();

  /**
   * Returns the meta object for the containment reference list '{@link com.leonardo.lsaf.sadl.sadl.Topic#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Topic#getAttributes()
   * @see #getTopic()
   * @generated
   */
  EReference getTopic_Attributes();

  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.Alias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alias</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Alias
   * @generated
   */
  EClass getAlias();

  /**
   * Returns the meta object for the reference '{@link com.leonardo.lsaf.sadl.sadl.Alias#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Alias#getType()
   * @see #getAlias()
   * @generated
   */
  EReference getAlias_Type();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Alias#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Alias#getMin()
   * @see #getAlias()
   * @generated
   */
  EAttribute getAlias_Min();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Alias#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Alias#getMax()
   * @see #getAlias()
   * @generated
   */
  EAttribute getAlias_Max();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Alias#getRes <em>Res</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Res</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Alias#getRes()
   * @see #getAlias()
   * @generated
   */
  EAttribute getAlias_Res();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Alias#getUnbounded <em>Unbounded</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unbounded</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Alias#getUnbounded()
   * @see #getAlias()
   * @generated
   */
  EAttribute getAlias_Unbounded();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Alias#getUpperbound <em>Upperbound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upperbound</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Alias#getUpperbound()
   * @see #getAlias()
   * @generated
   */
  EAttribute getAlias_Upperbound();

  /**
   * Returns the meta object for the reference '{@link com.leonardo.lsaf.sadl.sadl.Alias#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Unit</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Alias#getUnit()
   * @see #getAlias()
   * @generated
   */
  EReference getAlias_Unit();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Alias#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Alias#getDescription()
   * @see #getAlias()
   * @generated
   */
  EAttribute getAlias_Description();

  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Port</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Port
   * @generated
   */
  EClass getPort();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Port#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Port#getName()
   * @see #getPort()
   * @generated
   */
  EAttribute getPort_Name();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Port#isConjugated <em>Conjugated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Conjugated</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Port#isConjugated()
   * @see #getPort()
   * @generated
   */
  EAttribute getPort_Conjugated();

  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.Enumerator <em>Enumerator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumerator</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Enumerator
   * @generated
   */
  EClass getEnumerator();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Enumerator#isDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Enumerator#isDeprecated()
   * @see #getEnumerator()
   * @generated
   */
  EAttribute getEnumerator_Deprecated();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Enumerator#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Enumerator#getName()
   * @see #getEnumerator()
   * @generated
   */
  EAttribute getEnumerator_Name();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Enumerator#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Enumerator#getValue()
   * @see #getEnumerator()
   * @generated
   */
  EAttribute getEnumerator_Value();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Enumerator#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Enumerator#getDescription()
   * @see #getEnumerator()
   * @generated
   */
  EAttribute getEnumerator_Description();

  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Attribute#isDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Attribute#isDeprecated()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Deprecated();

  /**
   * Returns the meta object for the reference '{@link com.leonardo.lsaf.sadl.sadl.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Type();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Attribute#isUnbounded <em>Unbounded</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unbounded</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Attribute#isUnbounded()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Unbounded();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Attribute#getLowerbound <em>Lowerbound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lowerbound</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Attribute#getLowerbound()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Lowerbound();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Attribute#getUpperbound <em>Upperbound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upperbound</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Attribute#getUpperbound()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Upperbound();

  /**
   * Returns the meta object for the reference '{@link com.leonardo.lsaf.sadl.sadl.Attribute#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Unit</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Attribute#getUnit()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Unit();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Attribute#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Attribute#getDescription()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Description();

  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.TopicPort <em>Topic Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Topic Port</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.TopicPort
   * @generated
   */
  EClass getTopicPort();

  /**
   * Returns the meta object for the reference '{@link com.leonardo.lsaf.sadl.sadl.TopicPort#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.TopicPort#getType()
   * @see #getTopicPort()
   * @generated
   */
  EReference getTopicPort_Type();

  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.InterfacePort <em>Interface Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Port</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.InterfacePort
   * @generated
   */
  EClass getInterfacePort();

  /**
   * Returns the meta object for the reference '{@link com.leonardo.lsaf.sadl.sadl.InterfacePort#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.InterfacePort#getType()
   * @see #getInterfacePort()
   * @generated
   */
  EReference getInterfacePort_Type();

  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.Platform <em>Platform</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Platform</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Platform
   * @generated
   */
  EClass getPlatform();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Platform#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Platform#getDescription()
   * @see #getPlatform()
   * @generated
   */
  EAttribute getPlatform_Description();

  /**
   * Returns the meta object for the containment reference list '{@link com.leonardo.lsaf.sadl.sadl.Platform#getProcessors <em>Processors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Processors</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Platform#getProcessors()
   * @see #getPlatform()
   * @generated
   */
  EReference getPlatform_Processors();

  /**
   * Returns the meta object for the containment reference list '{@link com.leonardo.lsaf.sadl.sadl.Platform#getLinks <em>Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Links</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Platform#getLinks()
   * @see #getPlatform()
   * @generated
   */
  EReference getPlatform_Links();

  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.Processor <em>Processor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Processor</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Processor
   * @generated
   */
  EClass getProcessor();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Processor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Processor#getName()
   * @see #getProcessor()
   * @generated
   */
  EAttribute getProcessor_Name();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Processor#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Processor#getDescription()
   * @see #getProcessor()
   * @generated
   */
  EAttribute getProcessor_Description();

  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Link
   * @generated
   */
  EClass getLink();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Link#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Link#getName()
   * @see #getLink()
   * @generated
   */
  EAttribute getLink_Name();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Link#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Link#getDescription()
   * @see #getLink()
   * @generated
   */
  EAttribute getLink_Description();

  /**
   * Returns the meta object for the reference list '{@link com.leonardo.lsaf.sadl.sadl.Link#getProcessors <em>Processors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Processors</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Link#getProcessors()
   * @see #getLink()
   * @generated
   */
  EReference getLink_Processors();

  /**
   * Returns the meta object for the reference '{@link com.leonardo.lsaf.sadl.sadl.Link#getTransport <em>Transport</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Transport</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Link#getTransport()
   * @see #getLink()
   * @generated
   */
  EReference getLink_Transport();

  /**
   * Returns the meta object for the containment reference list '{@link com.leonardo.lsaf.sadl.sadl.Link#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Link#getValue()
   * @see #getLink()
   * @generated
   */
  EReference getLink_Value();

  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Property#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Property#isOptional()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Optional();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Property#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Property#getDescription()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Description();

  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.PropertyValue <em>Property Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Value</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.PropertyValue
   * @generated
   */
  EClass getPropertyValue();

  /**
   * Returns the meta object for the reference '{@link com.leonardo.lsaf.sadl.sadl.PropertyValue#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.PropertyValue#getProperty()
   * @see #getPropertyValue()
   * @generated
   */
  EReference getPropertyValue_Property();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.PropertyValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.PropertyValue#getValue()
   * @see #getPropertyValue()
   * @generated
   */
  EAttribute getPropertyValue_Value();

  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.Transport <em>Transport</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transport</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Transport
   * @generated
   */
  EClass getTransport();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Transport#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Transport#getDescription()
   * @see #getTransport()
   * @generated
   */
  EAttribute getTransport_Description();

  /**
   * Returns the meta object for the containment reference list '{@link com.leonardo.lsaf.sadl.sadl.Transport#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Transport#getProperties()
   * @see #getTransport()
   * @generated
   */
  EReference getTransport_Properties();

  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Application
   * @generated
   */
  EClass getApplication();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Application#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Application#getDescription()
   * @see #getApplication()
   * @generated
   */
  EAttribute getApplication_Description();

  /**
   * Returns the meta object for the containment reference list '{@link com.leonardo.lsaf.sadl.sadl.Application#getContainerInstances <em>Container Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Container Instances</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Application#getContainerInstances()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_ContainerInstances();

  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.Container <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Container
   * @generated
   */
  EClass getContainer();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Container#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Container#getDescription()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_Description();

  /**
   * Returns the meta object for the containment reference list '{@link com.leonardo.lsaf.sadl.sadl.Container#getComponentInstances <em>Component Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Component Instances</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Container#getComponentInstances()
   * @see #getContainer()
   * @generated
   */
  EReference getContainer_ComponentInstances();

  /**
   * Returns the meta object for the containment reference list '{@link com.leonardo.lsaf.sadl.sadl.Container#getConnections <em>Connections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Connections</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Container#getConnections()
   * @see #getContainer()
   * @generated
   */
  EReference getContainer_Connections();

  /**
   * Returns the meta object for the containment reference list '{@link com.leonardo.lsaf.sadl.sadl.Container#getContainerInstances <em>Container Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Container Instances</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Container#getContainerInstances()
   * @see #getContainer()
   * @generated
   */
  EReference getContainer_ContainerInstances();

  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.ContainerInstance <em>Container Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container Instance</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.ContainerInstance
   * @generated
   */
  EClass getContainerInstance();

  /**
   * Returns the meta object for the reference '{@link com.leonardo.lsaf.sadl.sadl.ContainerInstance#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.ContainerInstance#getType()
   * @see #getContainerInstance()
   * @generated
   */
  EReference getContainerInstance_Type();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.ContainerInstance#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.ContainerInstance#getName()
   * @see #getContainerInstance()
   * @generated
   */
  EAttribute getContainerInstance_Name();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.ContainerInstance#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.ContainerInstance#getDescription()
   * @see #getContainerInstance()
   * @generated
   */
  EAttribute getContainerInstance_Description();

  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Component#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Component#getDescription()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Description();

  /**
   * Returns the meta object for the containment reference list '{@link com.leonardo.lsaf.sadl.sadl.Component#getParts <em>Parts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parts</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Component#getParts()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Parts();

  /**
   * Returns the meta object for the containment reference list '{@link com.leonardo.lsaf.sadl.sadl.Component#getPorts <em>Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ports</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Component#getPorts()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Ports();

  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.ComponentInstance <em>Component Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Instance</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.ComponentInstance
   * @generated
   */
  EClass getComponentInstance();

  /**
   * Returns the meta object for the reference '{@link com.leonardo.lsaf.sadl.sadl.ComponentInstance#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.ComponentInstance#getType()
   * @see #getComponentInstance()
   * @generated
   */
  EReference getComponentInstance_Type();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.ComponentInstance#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.ComponentInstance#getName()
   * @see #getComponentInstance()
   * @generated
   */
  EAttribute getComponentInstance_Name();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.ComponentInstance#isUnbounded <em>Unbounded</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unbounded</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.ComponentInstance#isUnbounded()
   * @see #getComponentInstance()
   * @generated
   */
  EAttribute getComponentInstance_Unbounded();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.ComponentInstance#getLowerBound <em>Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower Bound</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.ComponentInstance#getLowerBound()
   * @see #getComponentInstance()
   * @generated
   */
  EAttribute getComponentInstance_LowerBound();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.ComponentInstance#getUpperBound <em>Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper Bound</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.ComponentInstance#getUpperBound()
   * @see #getComponentInstance()
   * @generated
   */
  EAttribute getComponentInstance_UpperBound();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.ComponentInstance#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.ComponentInstance#getDescription()
   * @see #getComponentInstance()
   * @generated
   */
  EAttribute getComponentInstance_Description();

  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.Connection <em>Connection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connection</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Connection
   * @generated
   */
  EClass getConnection();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Connection#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Connection#getName()
   * @see #getConnection()
   * @generated
   */
  EAttribute getConnection_Name();

  /**
   * Returns the meta object for the reference '{@link com.leonardo.lsaf.sadl.sadl.Connection#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Connection#getFrom()
   * @see #getConnection()
   * @generated
   */
  EReference getConnection_From();

  /**
   * Returns the meta object for the reference list '{@link com.leonardo.lsaf.sadl.sadl.Connection#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Source</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Connection#getSource()
   * @see #getConnection()
   * @generated
   */
  EReference getConnection_Source();

  /**
   * Returns the meta object for the reference '{@link com.leonardo.lsaf.sadl.sadl.Connection#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Connection#getTo()
   * @see #getConnection()
   * @generated
   */
  EReference getConnection_To();

  /**
   * Returns the meta object for the reference list '{@link com.leonardo.lsaf.sadl.sadl.Connection#getDestination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Destination</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Connection#getDestination()
   * @see #getConnection()
   * @generated
   */
  EReference getConnection_Destination();

  /**
   * Returns the meta object for the reference '{@link com.leonardo.lsaf.sadl.sadl.Connection#getStrategy <em>Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Strategy</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Connection#getStrategy()
   * @see #getConnection()
   * @generated
   */
  EReference getConnection_Strategy();

  /**
   * Returns the meta object for the containment reference list '{@link com.leonardo.lsaf.sadl.sadl.Connection#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Connection#getValue()
   * @see #getConnection()
   * @generated
   */
  EReference getConnection_Value();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Connection#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Connection#getDescription()
   * @see #getConnection()
   * @generated
   */
  EAttribute getConnection_Description();

  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.Deployment <em>Deployment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deployment</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Deployment
   * @generated
   */
  EClass getDeployment();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Deployment#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Deployment#getDescription()
   * @see #getDeployment()
   * @generated
   */
  EAttribute getDeployment_Description();

  /**
   * Returns the meta object for the containment reference list '{@link com.leonardo.lsaf.sadl.sadl.Deployment#getContainermapping <em>Containermapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Containermapping</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Deployment#getContainermapping()
   * @see #getDeployment()
   * @generated
   */
  EReference getDeployment_Containermapping();

  /**
   * Returns the meta object for the containment reference list '{@link com.leonardo.lsaf.sadl.sadl.Deployment#getConnectionmapping <em>Connectionmapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Connectionmapping</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Deployment#getConnectionmapping()
   * @see #getDeployment()
   * @generated
   */
  EReference getDeployment_Connectionmapping();

  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.ContainerMapping <em>Container Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container Mapping</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.ContainerMapping
   * @generated
   */
  EClass getContainerMapping();

  /**
   * Returns the meta object for the reference '{@link com.leonardo.lsaf.sadl.sadl.ContainerMapping#getProcessor <em>Processor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Processor</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.ContainerMapping#getProcessor()
   * @see #getContainerMapping()
   * @generated
   */
  EReference getContainerMapping_Processor();

  /**
   * Returns the meta object for the reference '{@link com.leonardo.lsaf.sadl.sadl.ContainerMapping#getContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Container</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.ContainerMapping#getContainer()
   * @see #getContainerMapping()
   * @generated
   */
  EReference getContainerMapping_Container();

  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.ConnectionMapping <em>Connection Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connection Mapping</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.ConnectionMapping
   * @generated
   */
  EClass getConnectionMapping();

  /**
   * Returns the meta object for the reference '{@link com.leonardo.lsaf.sadl.sadl.ConnectionMapping#getLink <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Link</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.ConnectionMapping#getLink()
   * @see #getConnectionMapping()
   * @generated
   */
  EReference getConnectionMapping_Link();

  /**
   * Returns the meta object for the reference '{@link com.leonardo.lsaf.sadl.sadl.ConnectionMapping#getConnection <em>Connection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Connection</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.ConnectionMapping#getConnection()
   * @see #getConnectionMapping()
   * @generated
   */
  EReference getConnectionMapping_Connection();

  /**
   * Returns the meta object for class '{@link com.leonardo.lsaf.sadl.sadl.Strategy <em>Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Strategy</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Strategy
   * @generated
   */
  EClass getStrategy();

  /**
   * Returns the meta object for the attribute '{@link com.leonardo.lsaf.sadl.sadl.Strategy#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Strategy#getDescription()
   * @see #getStrategy()
   * @generated
   */
  EAttribute getStrategy_Description();

  /**
   * Returns the meta object for the containment reference list '{@link com.leonardo.lsaf.sadl.sadl.Strategy#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see com.leonardo.lsaf.sadl.sadl.Strategy#getProperties()
   * @see #getStrategy()
   * @generated
   */
  EReference getStrategy_Properties();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SadlFactory getSadlFactory();

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
     * The meta object literal for the '{@link sadl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.ModelImpl
     * @see sadl.impl.SadlPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PACKAGE = eINSTANCE.getModel_Package();

    /**
     * The meta object literal for the '{@link sadl.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.PackageImpl
     * @see sadl.impl.SadlPackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE__DESCRIPTION = eINSTANCE.getPackage_Description();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__CONTENTS = eINSTANCE.getPackage_Contents();

    /**
     * The meta object literal for the '{@link sadl.impl.PackageableElementImpl <em>Packageable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.PackageableElementImpl
     * @see sadl.impl.SadlPackageImpl#getPackageableElement()
     * @generated
     */
    EClass PACKAGEABLE_ELEMENT = eINSTANCE.getPackageableElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGEABLE_ELEMENT__NAME = eINSTANCE.getPackageableElement_Name();

    /**
     * The meta object literal for the '{@link sadl.impl.UnitImpl <em>Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.UnitImpl
     * @see sadl.impl.SadlPackageImpl#getUnit()
     * @generated
     */
    EClass UNIT = eINSTANCE.getUnit();

    /**
     * The meta object literal for the '<em><b>Group</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIT__GROUP = eINSTANCE.getUnit_Group();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNIT__DESCRIPTION = eINSTANCE.getUnit_Description();

    /**
     * The meta object literal for the '{@link sadl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.TypeImpl
     * @see sadl.impl.SadlPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link sadl.impl.PrimitiveImpl <em>Primitive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.PrimitiveImpl
     * @see sadl.impl.SadlPackageImpl#getPrimitive()
     * @generated
     */
    EClass PRIMITIVE = eINSTANCE.getPrimitive();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE__MIN = eINSTANCE.getPrimitive_Min();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE__MAX = eINSTANCE.getPrimitive_Max();

    /**
     * The meta object literal for the '<em><b>Res</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE__RES = eINSTANCE.getPrimitive_Res();

    /**
     * The meta object literal for the '{@link sadl.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.InterfaceImpl
     * @see sadl.impl.SadlPackageImpl#getInterface()
     * @generated
     */
    EClass INTERFACE = eINSTANCE.getInterface();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE__DESCRIPTION = eINSTANCE.getInterface_Description();

    /**
     * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__PORTS = eINSTANCE.getInterface_Ports();

    /**
     * The meta object literal for the '{@link sadl.impl.EnumerationImpl <em>Enumeration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.EnumerationImpl
     * @see sadl.impl.SadlPackageImpl#getEnumeration()
     * @generated
     */
    EClass ENUMERATION = eINSTANCE.getEnumeration();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUMERATION__DESCRIPTION = eINSTANCE.getEnumeration_Description();

    /**
     * The meta object literal for the '<em><b>Enumerators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUMERATION__ENUMERATORS = eINSTANCE.getEnumeration_Enumerators();

    /**
     * The meta object literal for the '{@link sadl.impl.TopicImpl <em>Topic</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.TopicImpl
     * @see sadl.impl.SadlPackageImpl#getTopic()
     * @generated
     */
    EClass TOPIC = eINSTANCE.getTopic();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOPIC__DESCRIPTION = eINSTANCE.getTopic_Description();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOPIC__ATTRIBUTES = eINSTANCE.getTopic_Attributes();

    /**
     * The meta object literal for the '{@link sadl.impl.AliasImpl <em>Alias</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.AliasImpl
     * @see sadl.impl.SadlPackageImpl#getAlias()
     * @generated
     */
    EClass ALIAS = eINSTANCE.getAlias();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALIAS__TYPE = eINSTANCE.getAlias_Type();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALIAS__MIN = eINSTANCE.getAlias_Min();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALIAS__MAX = eINSTANCE.getAlias_Max();

    /**
     * The meta object literal for the '<em><b>Res</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALIAS__RES = eINSTANCE.getAlias_Res();

    /**
     * The meta object literal for the '<em><b>Unbounded</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALIAS__UNBOUNDED = eINSTANCE.getAlias_Unbounded();

    /**
     * The meta object literal for the '<em><b>Upperbound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALIAS__UPPERBOUND = eINSTANCE.getAlias_Upperbound();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALIAS__UNIT = eINSTANCE.getAlias_Unit();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALIAS__DESCRIPTION = eINSTANCE.getAlias_Description();

    /**
     * The meta object literal for the '{@link sadl.impl.PortImpl <em>Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.PortImpl
     * @see sadl.impl.SadlPackageImpl#getPort()
     * @generated
     */
    EClass PORT = eINSTANCE.getPort();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PORT__NAME = eINSTANCE.getPort_Name();

    /**
     * The meta object literal for the '<em><b>Conjugated</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PORT__CONJUGATED = eINSTANCE.getPort_Conjugated();

    /**
     * The meta object literal for the '{@link sadl.impl.EnumeratorImpl <em>Enumerator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.EnumeratorImpl
     * @see sadl.impl.SadlPackageImpl#getEnumerator()
     * @generated
     */
    EClass ENUMERATOR = eINSTANCE.getEnumerator();

    /**
     * The meta object literal for the '<em><b>Deprecated</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUMERATOR__DEPRECATED = eINSTANCE.getEnumerator_Deprecated();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUMERATOR__NAME = eINSTANCE.getEnumerator_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUMERATOR__VALUE = eINSTANCE.getEnumerator_Value();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUMERATOR__DESCRIPTION = eINSTANCE.getEnumerator_Description();

    /**
     * The meta object literal for the '{@link sadl.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.AttributeImpl
     * @see sadl.impl.SadlPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Deprecated</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__DEPRECATED = eINSTANCE.getAttribute_Deprecated();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Unbounded</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__UNBOUNDED = eINSTANCE.getAttribute_Unbounded();

    /**
     * The meta object literal for the '<em><b>Lowerbound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__LOWERBOUND = eINSTANCE.getAttribute_Lowerbound();

    /**
     * The meta object literal for the '<em><b>Upperbound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__UPPERBOUND = eINSTANCE.getAttribute_Upperbound();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__UNIT = eINSTANCE.getAttribute_Unit();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__DESCRIPTION = eINSTANCE.getAttribute_Description();

    /**
     * The meta object literal for the '{@link sadl.impl.TopicPortImpl <em>Topic Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.TopicPortImpl
     * @see sadl.impl.SadlPackageImpl#getTopicPort()
     * @generated
     */
    EClass TOPIC_PORT = eINSTANCE.getTopicPort();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOPIC_PORT__TYPE = eINSTANCE.getTopicPort_Type();

    /**
     * The meta object literal for the '{@link sadl.impl.InterfacePortImpl <em>Interface Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.InterfacePortImpl
     * @see sadl.impl.SadlPackageImpl#getInterfacePort()
     * @generated
     */
    EClass INTERFACE_PORT = eINSTANCE.getInterfacePort();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_PORT__TYPE = eINSTANCE.getInterfacePort_Type();

    /**
     * The meta object literal for the '{@link sadl.impl.PlatformImpl <em>Platform</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.PlatformImpl
     * @see sadl.impl.SadlPackageImpl#getPlatform()
     * @generated
     */
    EClass PLATFORM = eINSTANCE.getPlatform();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLATFORM__DESCRIPTION = eINSTANCE.getPlatform_Description();

    /**
     * The meta object literal for the '<em><b>Processors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLATFORM__PROCESSORS = eINSTANCE.getPlatform_Processors();

    /**
     * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLATFORM__LINKS = eINSTANCE.getPlatform_Links();

    /**
     * The meta object literal for the '{@link sadl.impl.ProcessorImpl <em>Processor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.ProcessorImpl
     * @see sadl.impl.SadlPackageImpl#getProcessor()
     * @generated
     */
    EClass PROCESSOR = eINSTANCE.getProcessor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESSOR__NAME = eINSTANCE.getProcessor_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESSOR__DESCRIPTION = eINSTANCE.getProcessor_Description();

    /**
     * The meta object literal for the '{@link sadl.impl.LinkImpl <em>Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.LinkImpl
     * @see sadl.impl.SadlPackageImpl#getLink()
     * @generated
     */
    EClass LINK = eINSTANCE.getLink();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK__NAME = eINSTANCE.getLink_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK__DESCRIPTION = eINSTANCE.getLink_Description();

    /**
     * The meta object literal for the '<em><b>Processors</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__PROCESSORS = eINSTANCE.getLink_Processors();

    /**
     * The meta object literal for the '<em><b>Transport</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__TRANSPORT = eINSTANCE.getLink_Transport();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__VALUE = eINSTANCE.getLink_Value();

    /**
     * The meta object literal for the '{@link sadl.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.PropertyImpl
     * @see sadl.impl.SadlPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__OPTIONAL = eINSTANCE.getProperty_Optional();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__DESCRIPTION = eINSTANCE.getProperty_Description();

    /**
     * The meta object literal for the '{@link sadl.impl.PropertyValueImpl <em>Property Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.PropertyValueImpl
     * @see sadl.impl.SadlPackageImpl#getPropertyValue()
     * @generated
     */
    EClass PROPERTY_VALUE = eINSTANCE.getPropertyValue();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_VALUE__PROPERTY = eINSTANCE.getPropertyValue_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_VALUE__VALUE = eINSTANCE.getPropertyValue_Value();

    /**
     * The meta object literal for the '{@link sadl.impl.TransportImpl <em>Transport</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.TransportImpl
     * @see sadl.impl.SadlPackageImpl#getTransport()
     * @generated
     */
    EClass TRANSPORT = eINSTANCE.getTransport();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSPORT__DESCRIPTION = eINSTANCE.getTransport_Description();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSPORT__PROPERTIES = eINSTANCE.getTransport_Properties();

    /**
     * The meta object literal for the '{@link sadl.impl.ApplicationImpl <em>Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.ApplicationImpl
     * @see sadl.impl.SadlPackageImpl#getApplication()
     * @generated
     */
    EClass APPLICATION = eINSTANCE.getApplication();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION__DESCRIPTION = eINSTANCE.getApplication_Description();

    /**
     * The meta object literal for the '<em><b>Container Instances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__CONTAINER_INSTANCES = eINSTANCE.getApplication_ContainerInstances();

    /**
     * The meta object literal for the '{@link sadl.impl.ContainerImpl <em>Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.ContainerImpl
     * @see sadl.impl.SadlPackageImpl#getContainer()
     * @generated
     */
    EClass CONTAINER = eINSTANCE.getContainer();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__DESCRIPTION = eINSTANCE.getContainer_Description();

    /**
     * The meta object literal for the '<em><b>Component Instances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER__COMPONENT_INSTANCES = eINSTANCE.getContainer_ComponentInstances();

    /**
     * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER__CONNECTIONS = eINSTANCE.getContainer_Connections();

    /**
     * The meta object literal for the '<em><b>Container Instances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER__CONTAINER_INSTANCES = eINSTANCE.getContainer_ContainerInstances();

    /**
     * The meta object literal for the '{@link sadl.impl.ContainerInstanceImpl <em>Container Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.ContainerInstanceImpl
     * @see sadl.impl.SadlPackageImpl#getContainerInstance()
     * @generated
     */
    EClass CONTAINER_INSTANCE = eINSTANCE.getContainerInstance();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER_INSTANCE__TYPE = eINSTANCE.getContainerInstance_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER_INSTANCE__NAME = eINSTANCE.getContainerInstance_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER_INSTANCE__DESCRIPTION = eINSTANCE.getContainerInstance_Description();

    /**
     * The meta object literal for the '{@link sadl.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.ComponentImpl
     * @see sadl.impl.SadlPackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__DESCRIPTION = eINSTANCE.getComponent_Description();

    /**
     * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__PARTS = eINSTANCE.getComponent_Parts();

    /**
     * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__PORTS = eINSTANCE.getComponent_Ports();

    /**
     * The meta object literal for the '{@link sadl.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.ComponentInstanceImpl
     * @see sadl.impl.SadlPackageImpl#getComponentInstance()
     * @generated
     */
    EClass COMPONENT_INSTANCE = eINSTANCE.getComponentInstance();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_INSTANCE__TYPE = eINSTANCE.getComponentInstance_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_INSTANCE__NAME = eINSTANCE.getComponentInstance_Name();

    /**
     * The meta object literal for the '<em><b>Unbounded</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_INSTANCE__UNBOUNDED = eINSTANCE.getComponentInstance_Unbounded();

    /**
     * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_INSTANCE__LOWER_BOUND = eINSTANCE.getComponentInstance_LowerBound();

    /**
     * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_INSTANCE__UPPER_BOUND = eINSTANCE.getComponentInstance_UpperBound();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_INSTANCE__DESCRIPTION = eINSTANCE.getComponentInstance_Description();

    /**
     * The meta object literal for the '{@link sadl.impl.ConnectionImpl <em>Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.ConnectionImpl
     * @see sadl.impl.SadlPackageImpl#getConnection()
     * @generated
     */
    EClass CONNECTION = eINSTANCE.getConnection();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONNECTION__NAME = eINSTANCE.getConnection_Name();

    /**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION__FROM = eINSTANCE.getConnection_From();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION__SOURCE = eINSTANCE.getConnection_Source();

    /**
     * The meta object literal for the '<em><b>To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION__TO = eINSTANCE.getConnection_To();

    /**
     * The meta object literal for the '<em><b>Destination</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION__DESTINATION = eINSTANCE.getConnection_Destination();

    /**
     * The meta object literal for the '<em><b>Strategy</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION__STRATEGY = eINSTANCE.getConnection_Strategy();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION__VALUE = eINSTANCE.getConnection_Value();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONNECTION__DESCRIPTION = eINSTANCE.getConnection_Description();

    /**
     * The meta object literal for the '{@link sadl.impl.DeploymentImpl <em>Deployment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.DeploymentImpl
     * @see sadl.impl.SadlPackageImpl#getDeployment()
     * @generated
     */
    EClass DEPLOYMENT = eINSTANCE.getDeployment();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOYMENT__DESCRIPTION = eINSTANCE.getDeployment_Description();

    /**
     * The meta object literal for the '<em><b>Containermapping</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT__CONTAINERMAPPING = eINSTANCE.getDeployment_Containermapping();

    /**
     * The meta object literal for the '<em><b>Connectionmapping</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT__CONNECTIONMAPPING = eINSTANCE.getDeployment_Connectionmapping();

    /**
     * The meta object literal for the '{@link sadl.impl.ContainerMappingImpl <em>Container Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.ContainerMappingImpl
     * @see sadl.impl.SadlPackageImpl#getContainerMapping()
     * @generated
     */
    EClass CONTAINER_MAPPING = eINSTANCE.getContainerMapping();

    /**
     * The meta object literal for the '<em><b>Processor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER_MAPPING__PROCESSOR = eINSTANCE.getContainerMapping_Processor();

    /**
     * The meta object literal for the '<em><b>Container</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER_MAPPING__CONTAINER = eINSTANCE.getContainerMapping_Container();

    /**
     * The meta object literal for the '{@link sadl.impl.ConnectionMappingImpl <em>Connection Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.ConnectionMappingImpl
     * @see sadl.impl.SadlPackageImpl#getConnectionMapping()
     * @generated
     */
    EClass CONNECTION_MAPPING = eINSTANCE.getConnectionMapping();

    /**
     * The meta object literal for the '<em><b>Link</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION_MAPPING__LINK = eINSTANCE.getConnectionMapping_Link();

    /**
     * The meta object literal for the '<em><b>Connection</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION_MAPPING__CONNECTION = eINSTANCE.getConnectionMapping_Connection();

    /**
     * The meta object literal for the '{@link sadl.impl.StrategyImpl <em>Strategy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sadl.impl.StrategyImpl
     * @see sadl.impl.SadlPackageImpl#getStrategy()
     * @generated
     */
    EClass STRATEGY = eINSTANCE.getStrategy();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRATEGY__DESCRIPTION = eINSTANCE.getStrategy_Description();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRATEGY__PROPERTIES = eINSTANCE.getStrategy_Properties();

  }

} //SadlPackage
