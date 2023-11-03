/**
 */
package sadl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sadl.SadlPackage
 * @generated
 */
public class SadlAdapterFactory extends AdapterFactoryImpl {
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SadlPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SadlAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = SadlPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object) {
    if (object == modelPackage) {
      return true;
    }
    if (object instanceof EObject) {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SadlSwitch<Adapter> modelSwitch =
    new SadlSwitch<Adapter>() {
      @Override
      public Adapter caseModel(Model object) {
        return createModelAdapter();
      }
      @Override
      public Adapter casePackage(sadl.Package object) {
        return createPackageAdapter();
      }
      @Override
      public Adapter casePackageableElement(PackageableElement object) {
        return createPackageableElementAdapter();
      }
      @Override
      public Adapter caseUnit(Unit object) {
        return createUnitAdapter();
      }
      @Override
      public Adapter caseType(Type object) {
        return createTypeAdapter();
      }
      @Override
      public Adapter casePrimitive(Primitive object) {
        return createPrimitiveAdapter();
      }
      @Override
      public Adapter caseInterface(Interface object) {
        return createInterfaceAdapter();
      }
      @Override
      public Adapter caseEnumeration(Enumeration object) {
        return createEnumerationAdapter();
      }
      @Override
      public Adapter caseTopic(Topic object) {
        return createTopicAdapter();
      }
      @Override
      public Adapter caseAlias(Alias object) {
        return createAliasAdapter();
      }
      @Override
      public Adapter casePort(Port object) {
        return createPortAdapter();
      }
      @Override
      public Adapter caseEnumerator(Enumerator object) {
        return createEnumeratorAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object) {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseTopicPort(TopicPort object) {
        return createTopicPortAdapter();
      }
      @Override
      public Adapter caseInterfacePort(InterfacePort object) {
        return createInterfacePortAdapter();
      }
      @Override
      public Adapter casePlatform(Platform object) {
        return createPlatformAdapter();
      }
      @Override
      public Adapter caseProcessor(Processor object) {
        return createProcessorAdapter();
      }
      @Override
      public Adapter caseLink(Link object) {
        return createLinkAdapter();
      }
      @Override
      public Adapter caseProperty(Property object) {
        return createPropertyAdapter();
      }
      @Override
      public Adapter casePropertyValue(PropertyValue object) {
        return createPropertyValueAdapter();
      }
      @Override
      public Adapter caseTransport(Transport object) {
        return createTransportAdapter();
      }
      @Override
      public Adapter caseApplication(Application object) {
        return createApplicationAdapter();
      }
      @Override
      public Adapter caseContainer(Container object) {
        return createContainerAdapter();
      }
      @Override
      public Adapter caseContainerInstance(ContainerInstance object) {
        return createContainerInstanceAdapter();
      }
      @Override
      public Adapter caseComponent(Component object) {
        return createComponentAdapter();
      }
      @Override
      public Adapter caseComponentInstance(ComponentInstance object) {
        return createComponentInstanceAdapter();
      }
      @Override
      public Adapter caseConnection(Connection object) {
        return createConnectionAdapter();
      }
      @Override
      public Adapter caseDeployment(Deployment object) {
        return createDeploymentAdapter();
      }
      @Override
      public Adapter caseContainerMapping(ContainerMapping object) {
        return createContainerMappingAdapter();
      }
      @Override
      public Adapter caseConnectionMapping(ConnectionMapping object) {
        return createConnectionMappingAdapter();
      }
      @Override
      public Adapter caseStrategy(Strategy object) {
        return createStrategyAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object) {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link sadl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.Model
   * @generated
   */
  public Adapter createModelAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sadl.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.Package
   * @generated
   */
  public Adapter createPackageAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sadl.PackageableElement <em>Packageable Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.PackageableElement
   * @generated
   */
  public Adapter createPackageableElementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sadl.Unit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.Unit
   * @generated
   */
  public Adapter createUnitAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sadl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.Type
   * @generated
   */
  public Adapter createTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sadl.Primitive <em>Primitive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.Primitive
   * @generated
   */
  public Adapter createPrimitiveAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sadl.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.Interface
   * @generated
   */
  public Adapter createInterfaceAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sadl.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.Enumeration
   * @generated
   */
  public Adapter createEnumerationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sadl.Topic <em>Topic</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.Topic
   * @generated
   */
  public Adapter createTopicAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sadl.Alias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.Alias
   * @generated
   */
  public Adapter createAliasAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sadl.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.Port
   * @generated
   */
  public Adapter createPortAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sadl.Enumerator <em>Enumerator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.Enumerator
   * @generated
   */
  public Adapter createEnumeratorAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sadl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sadl.TopicPort <em>Topic Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.TopicPort
   * @generated
   */
  public Adapter createTopicPortAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sadl.InterfacePort <em>Interface Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.InterfacePort
   * @generated
   */
  public Adapter createInterfacePortAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sadl.Platform <em>Platform</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.Platform
   * @generated
   */
  public Adapter createPlatformAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sadl.Processor <em>Processor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.Processor
   * @generated
   */
  public Adapter createProcessorAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sadl.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.Link
   * @generated
   */
  public Adapter createLinkAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sadl.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.Property
   * @generated
   */
  public Adapter createPropertyAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sadl.PropertyValue <em>Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.PropertyValue
   * @generated
   */
  public Adapter createPropertyValueAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sadl.Transport <em>Transport</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.Transport
   * @generated
   */
  public Adapter createTransportAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sadl.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.Application
   * @generated
   */
  public Adapter createApplicationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sadl.Container <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.Container
   * @generated
   */
  public Adapter createContainerAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sadl.ContainerInstance <em>Container Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.ContainerInstance
   * @generated
   */
  public Adapter createContainerInstanceAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sadl.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.Component
   * @generated
   */
  public Adapter createComponentAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sadl.ComponentInstance <em>Component Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.ComponentInstance
   * @generated
   */
  public Adapter createComponentInstanceAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sadl.Connection <em>Connection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.Connection
   * @generated
   */
  public Adapter createConnectionAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sadl.Deployment <em>Deployment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.Deployment
   * @generated
   */
  public Adapter createDeploymentAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sadl.ContainerMapping <em>Container Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.ContainerMapping
   * @generated
   */
  public Adapter createContainerMappingAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sadl.ConnectionMapping <em>Connection Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.ConnectionMapping
   * @generated
   */
  public Adapter createConnectionMappingAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sadl.Strategy <em>Strategy</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sadl.Strategy
   * @generated
   */
  public Adapter createStrategyAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter() {
    return null;
  }

} //SadlAdapterFactory
