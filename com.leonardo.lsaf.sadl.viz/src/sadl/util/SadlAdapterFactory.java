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
      public Adapter caseModel(com.leonardo.lsaf.sadl.sadl.Model object) {
        return createModelAdapter();
      }
      @Override
      public Adapter casePackage(com.leonardo.lsaf.sadl.sadl.Package object) {
        return createPackageAdapter();
      }
      @Override
      public Adapter casePackageableElement(com.leonardo.lsaf.sadl.sadl.PackageableElement object) {
        return createPackageableElementAdapter();
      }
      @Override
      public Adapter caseUnit(com.leonardo.lsaf.sadl.sadl.Unit object) {
        return createUnitAdapter();
      }
      @Override
      public Adapter caseType(com.leonardo.lsaf.sadl.sadl.Type object) {
        return createTypeAdapter();
      }
      @Override
      public Adapter casePrimitive(com.leonardo.lsaf.sadl.sadl.Primitive object) {
        return createPrimitiveAdapter();
      }
      @Override
      public Adapter caseInterface(com.leonardo.lsaf.sadl.sadl.Interface object) {
        return createInterfaceAdapter();
      }
      @Override
      public Adapter caseEnumeration(com.leonardo.lsaf.sadl.sadl.Enumeration object) {
        return createEnumerationAdapter();
      }
      @Override
      public Adapter caseTopic(com.leonardo.lsaf.sadl.sadl.Topic object) {
        return createTopicAdapter();
      }
      @Override
      public Adapter caseAlias(com.leonardo.lsaf.sadl.sadl.Alias object) {
        return createAliasAdapter();
      }
      @Override
      public Adapter casePort(com.leonardo.lsaf.sadl.sadl.Port object) {
        return createPortAdapter();
      }
      @Override
      public Adapter caseEnumerator(com.leonardo.lsaf.sadl.sadl.Enumerator object) {
        return createEnumeratorAdapter();
      }
      @Override
      public Adapter caseAttribute(com.leonardo.lsaf.sadl.sadl.Attribute object) {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseTopicPort(com.leonardo.lsaf.sadl.sadl.TopicPort object) {
        return createTopicPortAdapter();
      }
      @Override
      public Adapter caseInterfacePort(com.leonardo.lsaf.sadl.sadl.InterfacePort object) {
        return createInterfacePortAdapter();
      }
      @Override
      public Adapter casePlatform(com.leonardo.lsaf.sadl.sadl.Platform object) {
        return createPlatformAdapter();
      }
      @Override
      public Adapter caseProcessor(com.leonardo.lsaf.sadl.sadl.Processor object) {
        return createProcessorAdapter();
      }
      @Override
      public Adapter caseLink(com.leonardo.lsaf.sadl.sadl.Link object) {
        return createLinkAdapter();
      }
      @Override
      public Adapter caseProperty(com.leonardo.lsaf.sadl.sadl.Property object) {
        return createPropertyAdapter();
      }
      @Override
      public Adapter casePropertyValue(com.leonardo.lsaf.sadl.sadl.PropertyValue object) {
        return createPropertyValueAdapter();
      }
      @Override
      public Adapter caseTransport(com.leonardo.lsaf.sadl.sadl.Transport object) {
        return createTransportAdapter();
      }
      @Override
      public Adapter caseApplication(com.leonardo.lsaf.sadl.sadl.Application object) {
        return createApplicationAdapter();
      }
      @Override
      public Adapter caseContainer(com.leonardo.lsaf.sadl.sadl.Container object) {
        return createContainerAdapter();
      }
      @Override
      public Adapter caseContainerInstance(com.leonardo.lsaf.sadl.sadl.ContainerInstance object) {
        return createContainerInstanceAdapter();
      }
      @Override
      public Adapter caseComponent(com.leonardo.lsaf.sadl.sadl.Component object) {
        return createComponentAdapter();
      }
      @Override
      public Adapter caseComponentInstance(com.leonardo.lsaf.sadl.sadl.ComponentInstance object) {
        return createComponentInstanceAdapter();
      }
      @Override
      public Adapter caseConnection(com.leonardo.lsaf.sadl.sadl.Connection object) {
        return createConnectionAdapter();
      }
      @Override
      public Adapter caseDeployment(com.leonardo.lsaf.sadl.sadl.Deployment object) {
        return createDeploymentAdapter();
      }
      @Override
      public Adapter caseContainerMapping(com.leonardo.lsaf.sadl.sadl.ContainerMapping object) {
        return createContainerMappingAdapter();
      }
      @Override
      public Adapter caseConnectionMapping(com.leonardo.lsaf.sadl.sadl.ConnectionMapping object) {
        return createConnectionMappingAdapter();
      }
      @Override
      public Adapter caseStrategy(com.leonardo.lsaf.sadl.sadl.Strategy object) {
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
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.Model
   * @generated
   */
  public Adapter createModelAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.Package
   * @generated
   */
  public Adapter createPackageAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.PackageableElement <em>Packageable Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.PackageableElement
   * @generated
   */
  public Adapter createPackageableElementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.Unit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.Unit
   * @generated
   */
  public Adapter createUnitAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.Type
   * @generated
   */
  public Adapter createTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.Primitive <em>Primitive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.Primitive
   * @generated
   */
  public Adapter createPrimitiveAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.Interface
   * @generated
   */
  public Adapter createInterfaceAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.Enumeration
   * @generated
   */
  public Adapter createEnumerationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.Topic <em>Topic</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.Topic
   * @generated
   */
  public Adapter createTopicAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.Alias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.Alias
   * @generated
   */
  public Adapter createAliasAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.Port
   * @generated
   */
  public Adapter createPortAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.Enumerator <em>Enumerator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.Enumerator
   * @generated
   */
  public Adapter createEnumeratorAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.TopicPort <em>Topic Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.TopicPort
   * @generated
   */
  public Adapter createTopicPortAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.InterfacePort <em>Interface Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.InterfacePort
   * @generated
   */
  public Adapter createInterfacePortAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.Platform <em>Platform</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.Platform
   * @generated
   */
  public Adapter createPlatformAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.Processor <em>Processor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.Processor
   * @generated
   */
  public Adapter createProcessorAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.Link
   * @generated
   */
  public Adapter createLinkAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.Property
   * @generated
   */
  public Adapter createPropertyAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.PropertyValue <em>Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.PropertyValue
   * @generated
   */
  public Adapter createPropertyValueAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.Transport <em>Transport</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.Transport
   * @generated
   */
  public Adapter createTransportAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.Application
   * @generated
   */
  public Adapter createApplicationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.Container <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.Container
   * @generated
   */
  public Adapter createContainerAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.ContainerInstance <em>Container Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.ContainerInstance
   * @generated
   */
  public Adapter createContainerInstanceAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.Component
   * @generated
   */
  public Adapter createComponentAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.ComponentInstance <em>Component Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.ComponentInstance
   * @generated
   */
  public Adapter createComponentInstanceAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.Connection <em>Connection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.Connection
   * @generated
   */
  public Adapter createConnectionAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.Deployment <em>Deployment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.Deployment
   * @generated
   */
  public Adapter createDeploymentAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.ContainerMapping <em>Container Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.ContainerMapping
   * @generated
   */
  public Adapter createContainerMappingAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.ConnectionMapping <em>Connection Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.ConnectionMapping
   * @generated
   */
  public Adapter createConnectionMappingAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.leonardo.lsaf.sadl.sadl.Strategy <em>Strategy</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.leonardo.lsaf.sadl.sadl.Strategy
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
