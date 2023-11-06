/**
 */
package sadl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sadl.Alias;
import sadl.Application;
import sadl.Attribute;
import sadl.Component;
import sadl.ComponentInstance;
import sadl.Connection;
import sadl.ConnectionMapping;
import sadl.ContainerInstance;
import sadl.ContainerMapping;
import sadl.Deployment;
import sadl.Enumeration;
import sadl.Enumerator;
import sadl.Interface;
import sadl.InterfacePort;
import sadl.Link;
import sadl.Model;
import sadl.PackageableElement;
import sadl.Platform;
import sadl.Port;
import sadl.Primitive;
import sadl.Processor;
import sadl.Property;
import sadl.PropertyValue;
import sadl.SadlFactory;
import sadl.SadlPackage;
import sadl.Strategy;
import sadl.Topic;
import sadl.TopicPort;
import sadl.Transport;
import sadl.Type;
import sadl.Unit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SadlFactoryImpl extends EFactoryImpl implements SadlFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SadlFactory init() {
    try {
      SadlFactory theSadlFactory = (SadlFactory)EPackage.Registry.INSTANCE.getEFactory(SadlPackage.eNS_URI);
      if (theSadlFactory != null) {
        return theSadlFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SadlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SadlFactoryImpl() {
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
      case SadlPackage.MODEL: return createModel();
      case SadlPackage.PACKAGE: return createPackage();
      case SadlPackage.PACKAGEABLE_ELEMENT: return createPackageableElement();
      case SadlPackage.UNIT: return createUnit();
      case SadlPackage.TYPE: return createType();
      case SadlPackage.PRIMITIVE: return createPrimitive();
      case SadlPackage.INTERFACE: return createInterface();
      case SadlPackage.ENUMERATION: return createEnumeration();
      case SadlPackage.TOPIC: return createTopic();
      case SadlPackage.ALIAS: return createAlias();
      case SadlPackage.PORT: return createPort();
      case SadlPackage.ENUMERATOR: return createEnumerator();
      case SadlPackage.ATTRIBUTE: return createAttribute();
      case SadlPackage.TOPIC_PORT: return createTopicPort();
      case SadlPackage.INTERFACE_PORT: return createInterfacePort();
      case SadlPackage.PLATFORM: return createPlatform();
      case SadlPackage.PROCESSOR: return createProcessor();
      case SadlPackage.LINK: return createLink();
      case SadlPackage.PROPERTY: return createProperty();
      case SadlPackage.PROPERTY_VALUE: return createPropertyValue();
      case SadlPackage.TRANSPORT: return createTransport();
      case SadlPackage.APPLICATION: return createApplication();
      case SadlPackage.CONTAINER: return createContainer();
      case SadlPackage.CONTAINER_INSTANCE: return createContainerInstance();
      case SadlPackage.COMPONENT: return createComponent();
      case SadlPackage.COMPONENT_INSTANCE: return createComponentInstance();
      case SadlPackage.CONNECTION: return createConnection();
      case SadlPackage.DEPLOYMENT: return createDeployment();
      case SadlPackage.CONTAINER_MAPPING: return createContainerMapping();
      case SadlPackage.CONNECTION_MAPPING: return createConnectionMapping();
      case SadlPackage.STRATEGY: return createStrategy();
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
  public com.leonardo.lsaf.sadl.sadl.Model createModel() {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.Package createPackage() {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.PackageableElement createPackageableElement() {
    PackageableElementImpl packageableElement = new PackageableElementImpl();
    return packageableElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.Unit createUnit() {
    UnitImpl unit = new UnitImpl();
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.Type createType() {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.Primitive createPrimitive() {
    PrimitiveImpl primitive = new PrimitiveImpl();
    return primitive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.Interface createInterface() {
    InterfaceImpl interface_ = new InterfaceImpl();
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.Enumeration createEnumeration() {
    EnumerationImpl enumeration = new EnumerationImpl();
    return enumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.Topic createTopic() {
    TopicImpl topic = new TopicImpl();
    return topic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.Alias createAlias() {
    AliasImpl alias = new AliasImpl();
    return alias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.Port createPort() {
    PortImpl port = new PortImpl();
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.Enumerator createEnumerator() {
    EnumeratorImpl enumerator = new EnumeratorImpl();
    return enumerator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.Attribute createAttribute() {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.TopicPort createTopicPort() {
    TopicPortImpl topicPort = new TopicPortImpl();
    return topicPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.InterfacePort createInterfacePort() {
    InterfacePortImpl interfacePort = new InterfacePortImpl();
    return interfacePort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.Platform createPlatform() {
    PlatformImpl platform = new PlatformImpl();
    return platform;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.Processor createProcessor() {
    ProcessorImpl processor = new ProcessorImpl();
    return processor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.Link createLink() {
    LinkImpl link = new LinkImpl();
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.Property createProperty() {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.PropertyValue createPropertyValue() {
    PropertyValueImpl propertyValue = new PropertyValueImpl();
    return propertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.Transport createTransport() {
    TransportImpl transport = new TransportImpl();
    return transport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.Application createApplication() {
    ApplicationImpl application = new ApplicationImpl();
    return application;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.Container createContainer() {
    ContainerImpl container = new ContainerImpl();
    return container;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.ContainerInstance createContainerInstance() {
    ContainerInstanceImpl containerInstance = new ContainerInstanceImpl();
    return containerInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.Component createComponent() {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.ComponentInstance createComponentInstance() {
    ComponentInstanceImpl componentInstance = new ComponentInstanceImpl();
    return componentInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.Connection createConnection() {
    ConnectionImpl connection = new ConnectionImpl();
    return connection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.Deployment createDeployment() {
    DeploymentImpl deployment = new DeploymentImpl();
    return deployment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.ContainerMapping createContainerMapping() {
    ContainerMappingImpl containerMapping = new ContainerMappingImpl();
    return containerMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.ConnectionMapping createConnectionMapping() {
    ConnectionMappingImpl connectionMapping = new ConnectionMappingImpl();
    return connectionMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public com.leonardo.lsaf.sadl.sadl.Strategy createStrategy() {
    StrategyImpl strategy = new StrategyImpl();
    return strategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SadlPackage getSadlPackage() {
    return (SadlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SadlPackage getPackage() {
    return SadlPackage.eINSTANCE;
  }

} //SadlFactoryImpl
