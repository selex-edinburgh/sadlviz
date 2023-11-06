/**
 */
package sadl;

import com.leonardo.lsaf.sadl.sadl.Alias;
import com.leonardo.lsaf.sadl.sadl.Application;
import com.leonardo.lsaf.sadl.sadl.Attribute;
import com.leonardo.lsaf.sadl.sadl.Component;
import com.leonardo.lsaf.sadl.sadl.ComponentInstance;
import com.leonardo.lsaf.sadl.sadl.Connection;
import com.leonardo.lsaf.sadl.sadl.ConnectionMapping;
import com.leonardo.lsaf.sadl.sadl.Container;
import com.leonardo.lsaf.sadl.sadl.ContainerInstance;
import com.leonardo.lsaf.sadl.sadl.ContainerMapping;
import com.leonardo.lsaf.sadl.sadl.Deployment;
import com.leonardo.lsaf.sadl.sadl.Enumeration;
import com.leonardo.lsaf.sadl.sadl.Enumerator;
import com.leonardo.lsaf.sadl.sadl.Interface;
import com.leonardo.lsaf.sadl.sadl.InterfacePort;
import com.leonardo.lsaf.sadl.sadl.Link;
import com.leonardo.lsaf.sadl.sadl.Model;
import com.leonardo.lsaf.sadl.sadl.PackageableElement;
import com.leonardo.lsaf.sadl.sadl.Platform;
import com.leonardo.lsaf.sadl.sadl.Port;
import com.leonardo.lsaf.sadl.sadl.Primitive;
import com.leonardo.lsaf.sadl.sadl.Processor;
import com.leonardo.lsaf.sadl.sadl.Property;
import com.leonardo.lsaf.sadl.sadl.PropertyValue;
import com.leonardo.lsaf.sadl.sadl.Strategy;
import com.leonardo.lsaf.sadl.sadl.Topic;
import com.leonardo.lsaf.sadl.sadl.TopicPort;
import com.leonardo.lsaf.sadl.sadl.Transport;
import com.leonardo.lsaf.sadl.sadl.Type;
import com.leonardo.lsaf.sadl.sadl.Unit;
import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sadl.SadlPackage
 * @generated
 */
public interface SadlFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SadlFactory eINSTANCE = sadl.impl.SadlFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package</em>'.
   * @generated
   */
  com.leonardo.lsaf.sadl.sadl.Package createPackage();

  /**
   * Returns a new object of class '<em>Packageable Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Packageable Element</em>'.
   * @generated
   */
  PackageableElement createPackageableElement();

  /**
   * Returns a new object of class '<em>Unit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unit</em>'.
   * @generated
   */
  Unit createUnit();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Primitive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primitive</em>'.
   * @generated
   */
  Primitive createPrimitive();

  /**
   * Returns a new object of class '<em>Interface</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface</em>'.
   * @generated
   */
  Interface createInterface();

  /**
   * Returns a new object of class '<em>Enumeration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enumeration</em>'.
   * @generated
   */
  Enumeration createEnumeration();

  /**
   * Returns a new object of class '<em>Topic</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Topic</em>'.
   * @generated
   */
  Topic createTopic();

  /**
   * Returns a new object of class '<em>Alias</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alias</em>'.
   * @generated
   */
  Alias createAlias();

  /**
   * Returns a new object of class '<em>Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Port</em>'.
   * @generated
   */
  Port createPort();

  /**
   * Returns a new object of class '<em>Enumerator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enumerator</em>'.
   * @generated
   */
  Enumerator createEnumerator();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Topic Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Topic Port</em>'.
   * @generated
   */
  TopicPort createTopicPort();

  /**
   * Returns a new object of class '<em>Interface Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Port</em>'.
   * @generated
   */
  InterfacePort createInterfacePort();

  /**
   * Returns a new object of class '<em>Platform</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Platform</em>'.
   * @generated
   */
  Platform createPlatform();

  /**
   * Returns a new object of class '<em>Processor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Processor</em>'.
   * @generated
   */
  Processor createProcessor();

  /**
   * Returns a new object of class '<em>Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Link</em>'.
   * @generated
   */
  Link createLink();

  /**
   * Returns a new object of class '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property</em>'.
   * @generated
   */
  Property createProperty();

  /**
   * Returns a new object of class '<em>Property Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Value</em>'.
   * @generated
   */
  PropertyValue createPropertyValue();

  /**
   * Returns a new object of class '<em>Transport</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transport</em>'.
   * @generated
   */
  Transport createTransport();

  /**
   * Returns a new object of class '<em>Application</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application</em>'.
   * @generated
   */
  Application createApplication();

  /**
   * Returns a new object of class '<em>Container</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Container</em>'.
   * @generated
   */
  Container createContainer();

  /**
   * Returns a new object of class '<em>Container Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Container Instance</em>'.
   * @generated
   */
  ContainerInstance createContainerInstance();

  /**
   * Returns a new object of class '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component</em>'.
   * @generated
   */
  Component createComponent();

  /**
   * Returns a new object of class '<em>Component Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component Instance</em>'.
   * @generated
   */
  ComponentInstance createComponentInstance();

  /**
   * Returns a new object of class '<em>Connection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connection</em>'.
   * @generated
   */
  Connection createConnection();

  /**
   * Returns a new object of class '<em>Deployment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deployment</em>'.
   * @generated
   */
  Deployment createDeployment();

  /**
   * Returns a new object of class '<em>Container Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Container Mapping</em>'.
   * @generated
   */
  ContainerMapping createContainerMapping();

  /**
   * Returns a new object of class '<em>Connection Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connection Mapping</em>'.
   * @generated
   */
  ConnectionMapping createConnectionMapping();

  /**
   * Returns a new object of class '<em>Strategy</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Strategy</em>'.
   * @generated
   */
  Strategy createStrategy();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SadlPackage getSadlPackage();

} //SadlFactory
