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
        com.leonardo.lsaf.sadl.sadl.Model model = (com.leonardo.lsaf.sadl.sadl.Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.PACKAGE: {
        com.leonardo.lsaf.sadl.sadl.Package package_ = (com.leonardo.lsaf.sadl.sadl.Package)theEObject;
        T result = casePackage(package_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.PACKAGEABLE_ELEMENT: {
        com.leonardo.lsaf.sadl.sadl.PackageableElement packageableElement = (com.leonardo.lsaf.sadl.sadl.PackageableElement)theEObject;
        T result = casePackageableElement(packageableElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.UNIT: {
        com.leonardo.lsaf.sadl.sadl.Unit unit = (com.leonardo.lsaf.sadl.sadl.Unit)theEObject;
        T result = caseUnit(unit);
        if (result == null) result = casePackageableElement(unit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.TYPE: {
        com.leonardo.lsaf.sadl.sadl.Type type = (com.leonardo.lsaf.sadl.sadl.Type)theEObject;
        T result = caseType(type);
        if (result == null) result = casePackageableElement(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.PRIMITIVE: {
        com.leonardo.lsaf.sadl.sadl.Primitive primitive = (com.leonardo.lsaf.sadl.sadl.Primitive)theEObject;
        T result = casePrimitive(primitive);
        if (result == null) result = caseType(primitive);
        if (result == null) result = casePackageableElement(primitive);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.INTERFACE: {
        com.leonardo.lsaf.sadl.sadl.Interface interface_ = (com.leonardo.lsaf.sadl.sadl.Interface)theEObject;
        T result = caseInterface(interface_);
        if (result == null) result = casePackageableElement(interface_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.ENUMERATION: {
        com.leonardo.lsaf.sadl.sadl.Enumeration enumeration = (com.leonardo.lsaf.sadl.sadl.Enumeration)theEObject;
        T result = caseEnumeration(enumeration);
        if (result == null) result = caseType(enumeration);
        if (result == null) result = casePackageableElement(enumeration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.TOPIC: {
        com.leonardo.lsaf.sadl.sadl.Topic topic = (com.leonardo.lsaf.sadl.sadl.Topic)theEObject;
        T result = caseTopic(topic);
        if (result == null) result = caseType(topic);
        if (result == null) result = casePackageableElement(topic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.ALIAS: {
        com.leonardo.lsaf.sadl.sadl.Alias alias = (com.leonardo.lsaf.sadl.sadl.Alias)theEObject;
        T result = caseAlias(alias);
        if (result == null) result = caseType(alias);
        if (result == null) result = casePackageableElement(alias);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.PORT: {
        com.leonardo.lsaf.sadl.sadl.Port port = (com.leonardo.lsaf.sadl.sadl.Port)theEObject;
        T result = casePort(port);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.ENUMERATOR: {
        com.leonardo.lsaf.sadl.sadl.Enumerator enumerator = (com.leonardo.lsaf.sadl.sadl.Enumerator)theEObject;
        T result = caseEnumerator(enumerator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.ATTRIBUTE: {
        com.leonardo.lsaf.sadl.sadl.Attribute attribute = (com.leonardo.lsaf.sadl.sadl.Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.TOPIC_PORT: {
        com.leonardo.lsaf.sadl.sadl.TopicPort topicPort = (com.leonardo.lsaf.sadl.sadl.TopicPort)theEObject;
        T result = caseTopicPort(topicPort);
        if (result == null) result = casePort(topicPort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.INTERFACE_PORT: {
        com.leonardo.lsaf.sadl.sadl.InterfacePort interfacePort = (com.leonardo.lsaf.sadl.sadl.InterfacePort)theEObject;
        T result = caseInterfacePort(interfacePort);
        if (result == null) result = casePort(interfacePort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.PLATFORM: {
        com.leonardo.lsaf.sadl.sadl.Platform platform = (com.leonardo.lsaf.sadl.sadl.Platform)theEObject;
        T result = casePlatform(platform);
        if (result == null) result = casePackageableElement(platform);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.PROCESSOR: {
        com.leonardo.lsaf.sadl.sadl.Processor processor = (com.leonardo.lsaf.sadl.sadl.Processor)theEObject;
        T result = caseProcessor(processor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.LINK: {
        com.leonardo.lsaf.sadl.sadl.Link link = (com.leonardo.lsaf.sadl.sadl.Link)theEObject;
        T result = caseLink(link);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.PROPERTY: {
        com.leonardo.lsaf.sadl.sadl.Property property = (com.leonardo.lsaf.sadl.sadl.Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.PROPERTY_VALUE: {
        com.leonardo.lsaf.sadl.sadl.PropertyValue propertyValue = (com.leonardo.lsaf.sadl.sadl.PropertyValue)theEObject;
        T result = casePropertyValue(propertyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.TRANSPORT: {
        com.leonardo.lsaf.sadl.sadl.Transport transport = (com.leonardo.lsaf.sadl.sadl.Transport)theEObject;
        T result = caseTransport(transport);
        if (result == null) result = casePackageableElement(transport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.APPLICATION: {
        com.leonardo.lsaf.sadl.sadl.Application application = (com.leonardo.lsaf.sadl.sadl.Application)theEObject;
        T result = caseApplication(application);
        if (result == null) result = casePackageableElement(application);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.CONTAINER: {
        com.leonardo.lsaf.sadl.sadl.Container container = (com.leonardo.lsaf.sadl.sadl.Container)theEObject;
        T result = caseContainer(container);
        if (result == null) result = casePackageableElement(container);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.CONTAINER_INSTANCE: {
        com.leonardo.lsaf.sadl.sadl.ContainerInstance containerInstance = (com.leonardo.lsaf.sadl.sadl.ContainerInstance)theEObject;
        T result = caseContainerInstance(containerInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.COMPONENT: {
        com.leonardo.lsaf.sadl.sadl.Component component = (com.leonardo.lsaf.sadl.sadl.Component)theEObject;
        T result = caseComponent(component);
        if (result == null) result = casePackageableElement(component);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.COMPONENT_INSTANCE: {
        com.leonardo.lsaf.sadl.sadl.ComponentInstance componentInstance = (com.leonardo.lsaf.sadl.sadl.ComponentInstance)theEObject;
        T result = caseComponentInstance(componentInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.CONNECTION: {
        com.leonardo.lsaf.sadl.sadl.Connection connection = (com.leonardo.lsaf.sadl.sadl.Connection)theEObject;
        T result = caseConnection(connection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.DEPLOYMENT: {
        com.leonardo.lsaf.sadl.sadl.Deployment deployment = (com.leonardo.lsaf.sadl.sadl.Deployment)theEObject;
        T result = caseDeployment(deployment);
        if (result == null) result = casePackageableElement(deployment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.CONTAINER_MAPPING: {
        com.leonardo.lsaf.sadl.sadl.ContainerMapping containerMapping = (com.leonardo.lsaf.sadl.sadl.ContainerMapping)theEObject;
        T result = caseContainerMapping(containerMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.CONNECTION_MAPPING: {
        com.leonardo.lsaf.sadl.sadl.ConnectionMapping connectionMapping = (com.leonardo.lsaf.sadl.sadl.ConnectionMapping)theEObject;
        T result = caseConnectionMapping(connectionMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SadlPackage.STRATEGY: {
        com.leonardo.lsaf.sadl.sadl.Strategy strategy = (com.leonardo.lsaf.sadl.sadl.Strategy)theEObject;
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
  public T caseModel(com.leonardo.lsaf.sadl.sadl.Model object) {
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
  public T casePackage(com.leonardo.lsaf.sadl.sadl.Package object) {
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
  public T casePackageableElement(com.leonardo.lsaf.sadl.sadl.PackageableElement object) {
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
  public T caseUnit(com.leonardo.lsaf.sadl.sadl.Unit object) {
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
  public T caseType(com.leonardo.lsaf.sadl.sadl.Type object) {
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
  public T casePrimitive(com.leonardo.lsaf.sadl.sadl.Primitive object) {
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
  public T caseInterface(com.leonardo.lsaf.sadl.sadl.Interface object) {
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
  public T caseEnumeration(com.leonardo.lsaf.sadl.sadl.Enumeration object) {
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
  public T caseTopic(com.leonardo.lsaf.sadl.sadl.Topic object) {
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
  public T caseAlias(com.leonardo.lsaf.sadl.sadl.Alias object) {
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
  public T casePort(com.leonardo.lsaf.sadl.sadl.Port object) {
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
  public T caseEnumerator(com.leonardo.lsaf.sadl.sadl.Enumerator object) {
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
  public T caseAttribute(com.leonardo.lsaf.sadl.sadl.Attribute object) {
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
  public T caseTopicPort(com.leonardo.lsaf.sadl.sadl.TopicPort object) {
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
  public T caseInterfacePort(com.leonardo.lsaf.sadl.sadl.InterfacePort object) {
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
  public T casePlatform(com.leonardo.lsaf.sadl.sadl.Platform object) {
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
  public T caseProcessor(com.leonardo.lsaf.sadl.sadl.Processor object) {
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
  public T caseLink(com.leonardo.lsaf.sadl.sadl.Link object) {
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
  public T caseProperty(com.leonardo.lsaf.sadl.sadl.Property object) {
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
  public T casePropertyValue(com.leonardo.lsaf.sadl.sadl.PropertyValue object) {
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
  public T caseTransport(com.leonardo.lsaf.sadl.sadl.Transport object) {
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
  public T caseApplication(com.leonardo.lsaf.sadl.sadl.Application object) {
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
  public T caseContainer(com.leonardo.lsaf.sadl.sadl.Container object) {
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
  public T caseContainerInstance(com.leonardo.lsaf.sadl.sadl.ContainerInstance object) {
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
  public T caseComponent(com.leonardo.lsaf.sadl.sadl.Component object) {
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
  public T caseComponentInstance(com.leonardo.lsaf.sadl.sadl.ComponentInstance object) {
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
  public T caseConnection(com.leonardo.lsaf.sadl.sadl.Connection object) {
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
  public T caseDeployment(com.leonardo.lsaf.sadl.sadl.Deployment object) {
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
  public T caseContainerMapping(com.leonardo.lsaf.sadl.sadl.ContainerMapping object) {
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
  public T caseConnectionMapping(com.leonardo.lsaf.sadl.sadl.ConnectionMapping object) {
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
  public T caseStrategy(com.leonardo.lsaf.sadl.sadl.Strategy object) {
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
