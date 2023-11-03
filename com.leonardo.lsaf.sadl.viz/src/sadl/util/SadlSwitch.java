/**
 */
package sadl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sadl.Alias;
import sadl.Application;
import sadl.Attribute;
import sadl.Component;
import sadl.ComponentInstance;
import sadl.Connection;
import sadl.ConnectionMapping;
import sadl.Container;
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
import sadl.SadlPackage;
import sadl.Strategy;
import sadl.Topic;
import sadl.TopicPort;
import sadl.Transport;
import sadl.Type;
import sadl.Unit;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see sadl.SadlPackage
 * @generated
 */
public class SadlSwitch<T> extends Switch<T> {
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SadlPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SadlSwitch() {
    if (modelPackage == null) {
      modelPackage = SadlPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage) {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID) {
      case SadlPackage.MODEL: {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.PACKAGE: {
        sadl.Package package_ = (sadl.Package)theEObject;
        T result = casePackage(package_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.PACKAGEABLE_ELEMENT: {
        PackageableElement packageableElement = (PackageableElement)theEObject;
        T result = casePackageableElement(packageableElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.UNIT: {
        Unit unit = (Unit)theEObject;
        T result = caseUnit(unit);
        if (result == null) result = casePackageableElement(unit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.TYPE: {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = casePackageableElement(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.PRIMITIVE: {
        Primitive primitive = (Primitive)theEObject;
        T result = casePrimitive(primitive);
        if (result == null) result = caseType(primitive);
        if (result == null) result = casePackageableElement(primitive);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.INTERFACE: {
        Interface interface_ = (Interface)theEObject;
        T result = caseInterface(interface_);
        if (result == null) result = casePackageableElement(interface_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.ENUMERATION: {
        Enumeration enumeration = (Enumeration)theEObject;
        T result = caseEnumeration(enumeration);
        if (result == null) result = caseType(enumeration);
        if (result == null) result = casePackageableElement(enumeration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.TOPIC: {
        Topic topic = (Topic)theEObject;
        T result = caseTopic(topic);
        if (result == null) result = caseType(topic);
        if (result == null) result = casePackageableElement(topic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.ALIAS: {
        Alias alias = (Alias)theEObject;
        T result = caseAlias(alias);
        if (result == null) result = caseType(alias);
        if (result == null) result = casePackageableElement(alias);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.PORT: {
        Port port = (Port)theEObject;
        T result = casePort(port);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.ENUMERATOR: {
        Enumerator enumerator = (Enumerator)theEObject;
        T result = caseEnumerator(enumerator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.ATTRIBUTE: {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.TOPIC_PORT: {
        TopicPort topicPort = (TopicPort)theEObject;
        T result = caseTopicPort(topicPort);
        if (result == null) result = casePort(topicPort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.INTERFACE_PORT: {
        InterfacePort interfacePort = (InterfacePort)theEObject;
        T result = caseInterfacePort(interfacePort);
        if (result == null) result = casePort(interfacePort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.PLATFORM: {
        Platform platform = (Platform)theEObject;
        T result = casePlatform(platform);
        if (result == null) result = casePackageableElement(platform);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.PROCESSOR: {
        Processor processor = (Processor)theEObject;
        T result = caseProcessor(processor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.LINK: {
        Link link = (Link)theEObject;
        T result = caseLink(link);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.PROPERTY: {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.PROPERTY_VALUE: {
        PropertyValue propertyValue = (PropertyValue)theEObject;
        T result = casePropertyValue(propertyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.TRANSPORT: {
        Transport transport = (Transport)theEObject;
        T result = caseTransport(transport);
        if (result == null) result = casePackageableElement(transport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.APPLICATION: {
        Application application = (Application)theEObject;
        T result = caseApplication(application);
        if (result == null) result = casePackageableElement(application);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.CONTAINER: {
        Container container = (Container)theEObject;
        T result = caseContainer(container);
        if (result == null) result = casePackageableElement(container);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.CONTAINER_INSTANCE: {
        ContainerInstance containerInstance = (ContainerInstance)theEObject;
        T result = caseContainerInstance(containerInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.COMPONENT: {
        Component component = (Component)theEObject;
        T result = caseComponent(component);
        if (result == null) result = casePackageableElement(component);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.COMPONENT_INSTANCE: {
        ComponentInstance componentInstance = (ComponentInstance)theEObject;
        T result = caseComponentInstance(componentInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.CONNECTION: {
        Connection connection = (Connection)theEObject;
        T result = caseConnection(connection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.DEPLOYMENT: {
        Deployment deployment = (Deployment)theEObject;
        T result = caseDeployment(deployment);
        if (result == null) result = casePackageableElement(deployment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.CONTAINER_MAPPING: {
        ContainerMapping containerMapping = (ContainerMapping)theEObject;
        T result = caseContainerMapping(containerMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.CONNECTION_MAPPING: {
        ConnectionMapping connectionMapping = (ConnectionMapping)theEObject;
        T result = caseConnectionMapping(connectionMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.STRATEGY: {
        Strategy strategy = (Strategy)theEObject;
        T result = caseStrategy(strategy);
        if (result == null) result = casePackageableElement(strategy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackage(sadl.Package object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageableElement(PackageableElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnit(Unit object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primitive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitive(Primitive object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterface(Interface object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumeration(Enumeration object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Topic</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Topic</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTopic(Topic object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alias</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alias</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlias(Alias object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePort(Port object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enumerator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enumerator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumerator(Enumerator object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Topic Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Topic Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTopicPort(TopicPort object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfacePort(InterfacePort object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Platform</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Platform</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlatform(Platform object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Processor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Processor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessor(Processor object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLink(Link object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyValue(PropertyValue object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transport</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transport</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransport(Transport object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplication(Application object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContainer(Container object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Container Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Container Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContainerInstance(ContainerInstance object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponent(Component object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentInstance(ComponentInstance object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConnection(Connection object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deployment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deployment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeployment(Deployment object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Container Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Container Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContainerMapping(ContainerMapping object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Connection Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Connection Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConnectionMapping(ConnectionMapping object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Strategy</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Strategy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStrategy(Strategy object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object) {
    return null;
  }

} //SadlSwitch
