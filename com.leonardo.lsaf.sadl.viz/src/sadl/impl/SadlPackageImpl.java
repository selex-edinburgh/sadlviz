/**
 */
package sadl.impl;

import mediator.MediatorPackage;

import mediator.impl.MediatorPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SadlPackageImpl extends EPackageImpl implements SadlPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageableElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primitiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumerationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass topicEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aliasEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass portEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumeratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass topicPortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfacePortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass platformEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass containerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass containerInstanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentInstanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass connectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deploymentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass containerMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass connectionMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass strategyEClass = null;

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
   * @see sadl.SadlPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SadlPackageImpl() {
    super(eNS_URI, SadlFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SadlPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SadlPackage init() {
    if (isInited) return (SadlPackage)EPackage.Registry.INSTANCE.getEPackage(SadlPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredSadlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    SadlPackageImpl theSadlPackage = registeredSadlPackage instanceof SadlPackageImpl ? (SadlPackageImpl)registeredSadlPackage : new SadlPackageImpl();

    isInited = true;

    // Obtain or create and register interdependencies
    Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MediatorPackage.eNS_URI);
    MediatorPackageImpl theMediatorPackage = (MediatorPackageImpl)(registeredPackage instanceof MediatorPackageImpl ? registeredPackage : MediatorPackage.eINSTANCE);

    // Create package meta-data objects
    theSadlPackage.createPackageContents();
    theMediatorPackage.createPackageContents();

    // Initialize created meta-data
    theSadlPackage.initializePackageContents();
    theMediatorPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSadlPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SadlPackage.eNS_URI, theSadlPackage);
    return theSadlPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getModel() {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_Package() {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPackage() {
    return packageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPackage_Name() {
    return (EAttribute)packageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPackage_Description() {
    return (EAttribute)packageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPackage_Contents() {
    return (EReference)packageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPackageableElement() {
    return packageableElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPackageableElement_Name() {
    return (EAttribute)packageableElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUnit() {
    return unitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getUnit_Group() {
    return (EReference)unitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUnit_Description() {
    return (EAttribute)unitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getType() {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPrimitive() {
    return primitiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPrimitive_Min() {
    return (EAttribute)primitiveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPrimitive_Max() {
    return (EAttribute)primitiveEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPrimitive_Res() {
    return (EAttribute)primitiveEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInterface() {
    return interfaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getInterface_Description() {
    return (EAttribute)interfaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInterface_Ports() {
    return (EReference)interfaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEnumeration() {
    return enumerationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEnumeration_Description() {
    return (EAttribute)enumerationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getEnumeration_Enumerators() {
    return (EReference)enumerationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTopic() {
    return topicEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTopic_Description() {
    return (EAttribute)topicEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTopic_Attributes() {
    return (EReference)topicEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAlias() {
    return aliasEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAlias_Type() {
    return (EReference)aliasEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAlias_Min() {
    return (EAttribute)aliasEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAlias_Max() {
    return (EAttribute)aliasEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAlias_Res() {
    return (EAttribute)aliasEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAlias_Unbounded() {
    return (EAttribute)aliasEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAlias_Upperbound() {
    return (EAttribute)aliasEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAlias_Unit() {
    return (EReference)aliasEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAlias_Description() {
    return (EAttribute)aliasEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPort() {
    return portEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPort_Name() {
    return (EAttribute)portEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPort_Conjugated() {
    return (EAttribute)portEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEnumerator() {
    return enumeratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEnumerator_Deprecated() {
    return (EAttribute)enumeratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEnumerator_Name() {
    return (EAttribute)enumeratorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEnumerator_Value() {
    return (EAttribute)enumeratorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEnumerator_Description() {
    return (EAttribute)enumeratorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAttribute() {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAttribute_Deprecated() {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAttribute_Type() {
    return (EReference)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAttribute_Name() {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAttribute_Unbounded() {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAttribute_Lowerbound() {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAttribute_Upperbound() {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAttribute_Unit() {
    return (EReference)attributeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAttribute_Description() {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTopicPort() {
    return topicPortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTopicPort_Type() {
    return (EReference)topicPortEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInterfacePort() {
    return interfacePortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInterfacePort_Type() {
    return (EReference)interfacePortEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPlatform() {
    return platformEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPlatform_Description() {
    return (EAttribute)platformEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPlatform_Processors() {
    return (EReference)platformEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPlatform_Links() {
    return (EReference)platformEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getProcessor() {
    return processorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getProcessor_Name() {
    return (EAttribute)processorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getProcessor_Description() {
    return (EAttribute)processorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLink() {
    return linkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLink_Name() {
    return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLink_Description() {
    return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLink_Processors() {
    return (EReference)linkEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLink_Transport() {
    return (EReference)linkEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLink_Value() {
    return (EReference)linkEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getProperty() {
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getProperty_Name() {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getProperty_Optional() {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getProperty_Description() {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPropertyValue() {
    return propertyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPropertyValue_Property() {
    return (EReference)propertyValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPropertyValue_Value() {
    return (EAttribute)propertyValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTransport() {
    return transportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTransport_Description() {
    return (EAttribute)transportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTransport_Properties() {
    return (EReference)transportEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getApplication() {
    return applicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getApplication_Description() {
    return (EAttribute)applicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getApplication_ContainerInstances() {
    return (EReference)applicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getContainer() {
    return containerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getContainer_Description() {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getContainer_ComponentInstances() {
    return (EReference)containerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getContainer_Connections() {
    return (EReference)containerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getContainer_ContainerInstances() {
    return (EReference)containerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getContainerInstance() {
    return containerInstanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getContainerInstance_Type() {
    return (EReference)containerInstanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getContainerInstance_Name() {
    return (EAttribute)containerInstanceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getContainerInstance_Description() {
    return (EAttribute)containerInstanceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getComponent() {
    return componentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getComponent_Description() {
    return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getComponent_Parts() {
    return (EReference)componentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getComponent_Ports() {
    return (EReference)componentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getComponentInstance() {
    return componentInstanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getComponentInstance_Type() {
    return (EReference)componentInstanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getComponentInstance_Name() {
    return (EAttribute)componentInstanceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getComponentInstance_Unbounded() {
    return (EAttribute)componentInstanceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getComponentInstance_LowerBound() {
    return (EAttribute)componentInstanceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getComponentInstance_UpperBound() {
    return (EAttribute)componentInstanceEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getComponentInstance_Description() {
    return (EAttribute)componentInstanceEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getConnection() {
    return connectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getConnection_Name() {
    return (EAttribute)connectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getConnection_From() {
    return (EReference)connectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getConnection_Source() {
    return (EReference)connectionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getConnection_To() {
    return (EReference)connectionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getConnection_Destination() {
    return (EReference)connectionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getConnection_Strategy() {
    return (EReference)connectionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getConnection_Value() {
    return (EReference)connectionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getConnection_Description() {
    return (EAttribute)connectionEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDeployment() {
    return deploymentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDeployment_Description() {
    return (EAttribute)deploymentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDeployment_Containermapping() {
    return (EReference)deploymentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDeployment_Connectionmapping() {
    return (EReference)deploymentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getContainerMapping() {
    return containerMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getContainerMapping_Processor() {
    return (EReference)containerMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getContainerMapping_Container() {
    return (EReference)containerMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getConnectionMapping() {
    return connectionMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getConnectionMapping_Link() {
    return (EReference)connectionMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getConnectionMapping_Connection() {
    return (EReference)connectionMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStrategy() {
    return strategyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getStrategy_Description() {
    return (EAttribute)strategyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStrategy_Properties() {
    return (EReference)strategyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SadlFactory getSadlFactory() {
    return (SadlFactory)getEFactoryInstance();
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
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__PACKAGE);

    packageEClass = createEClass(PACKAGE);
    createEAttribute(packageEClass, PACKAGE__NAME);
    createEAttribute(packageEClass, PACKAGE__DESCRIPTION);
    createEReference(packageEClass, PACKAGE__CONTENTS);

    packageableElementEClass = createEClass(PACKAGEABLE_ELEMENT);
    createEAttribute(packageableElementEClass, PACKAGEABLE_ELEMENT__NAME);

    unitEClass = createEClass(UNIT);
    createEReference(unitEClass, UNIT__GROUP);
    createEAttribute(unitEClass, UNIT__DESCRIPTION);

    typeEClass = createEClass(TYPE);

    primitiveEClass = createEClass(PRIMITIVE);
    createEAttribute(primitiveEClass, PRIMITIVE__MIN);
    createEAttribute(primitiveEClass, PRIMITIVE__MAX);
    createEAttribute(primitiveEClass, PRIMITIVE__RES);

    interfaceEClass = createEClass(INTERFACE);
    createEAttribute(interfaceEClass, INTERFACE__DESCRIPTION);
    createEReference(interfaceEClass, INTERFACE__PORTS);

    enumerationEClass = createEClass(ENUMERATION);
    createEAttribute(enumerationEClass, ENUMERATION__DESCRIPTION);
    createEReference(enumerationEClass, ENUMERATION__ENUMERATORS);

    topicEClass = createEClass(TOPIC);
    createEAttribute(topicEClass, TOPIC__DESCRIPTION);
    createEReference(topicEClass, TOPIC__ATTRIBUTES);

    aliasEClass = createEClass(ALIAS);
    createEReference(aliasEClass, ALIAS__TYPE);
    createEAttribute(aliasEClass, ALIAS__MIN);
    createEAttribute(aliasEClass, ALIAS__MAX);
    createEAttribute(aliasEClass, ALIAS__RES);
    createEAttribute(aliasEClass, ALIAS__UNBOUNDED);
    createEAttribute(aliasEClass, ALIAS__UPPERBOUND);
    createEReference(aliasEClass, ALIAS__UNIT);
    createEAttribute(aliasEClass, ALIAS__DESCRIPTION);

    portEClass = createEClass(PORT);
    createEAttribute(portEClass, PORT__NAME);
    createEAttribute(portEClass, PORT__CONJUGATED);

    enumeratorEClass = createEClass(ENUMERATOR);
    createEAttribute(enumeratorEClass, ENUMERATOR__DEPRECATED);
    createEAttribute(enumeratorEClass, ENUMERATOR__NAME);
    createEAttribute(enumeratorEClass, ENUMERATOR__VALUE);
    createEAttribute(enumeratorEClass, ENUMERATOR__DESCRIPTION);

    attributeEClass = createEClass(ATTRIBUTE);
    createEAttribute(attributeEClass, ATTRIBUTE__DEPRECATED);
    createEReference(attributeEClass, ATTRIBUTE__TYPE);
    createEAttribute(attributeEClass, ATTRIBUTE__NAME);
    createEAttribute(attributeEClass, ATTRIBUTE__UNBOUNDED);
    createEAttribute(attributeEClass, ATTRIBUTE__LOWERBOUND);
    createEAttribute(attributeEClass, ATTRIBUTE__UPPERBOUND);
    createEReference(attributeEClass, ATTRIBUTE__UNIT);
    createEAttribute(attributeEClass, ATTRIBUTE__DESCRIPTION);

    topicPortEClass = createEClass(TOPIC_PORT);
    createEReference(topicPortEClass, TOPIC_PORT__TYPE);

    interfacePortEClass = createEClass(INTERFACE_PORT);
    createEReference(interfacePortEClass, INTERFACE_PORT__TYPE);

    platformEClass = createEClass(PLATFORM);
    createEAttribute(platformEClass, PLATFORM__DESCRIPTION);
    createEReference(platformEClass, PLATFORM__PROCESSORS);
    createEReference(platformEClass, PLATFORM__LINKS);

    processorEClass = createEClass(PROCESSOR);
    createEAttribute(processorEClass, PROCESSOR__NAME);
    createEAttribute(processorEClass, PROCESSOR__DESCRIPTION);

    linkEClass = createEClass(LINK);
    createEAttribute(linkEClass, LINK__NAME);
    createEAttribute(linkEClass, LINK__DESCRIPTION);
    createEReference(linkEClass, LINK__PROCESSORS);
    createEReference(linkEClass, LINK__TRANSPORT);
    createEReference(linkEClass, LINK__VALUE);

    propertyEClass = createEClass(PROPERTY);
    createEAttribute(propertyEClass, PROPERTY__NAME);
    createEAttribute(propertyEClass, PROPERTY__OPTIONAL);
    createEAttribute(propertyEClass, PROPERTY__DESCRIPTION);

    propertyValueEClass = createEClass(PROPERTY_VALUE);
    createEReference(propertyValueEClass, PROPERTY_VALUE__PROPERTY);
    createEAttribute(propertyValueEClass, PROPERTY_VALUE__VALUE);

    transportEClass = createEClass(TRANSPORT);
    createEAttribute(transportEClass, TRANSPORT__DESCRIPTION);
    createEReference(transportEClass, TRANSPORT__PROPERTIES);

    applicationEClass = createEClass(APPLICATION);
    createEAttribute(applicationEClass, APPLICATION__DESCRIPTION);
    createEReference(applicationEClass, APPLICATION__CONTAINER_INSTANCES);

    containerEClass = createEClass(CONTAINER);
    createEAttribute(containerEClass, CONTAINER__DESCRIPTION);
    createEReference(containerEClass, CONTAINER__COMPONENT_INSTANCES);
    createEReference(containerEClass, CONTAINER__CONNECTIONS);
    createEReference(containerEClass, CONTAINER__CONTAINER_INSTANCES);

    containerInstanceEClass = createEClass(CONTAINER_INSTANCE);
    createEReference(containerInstanceEClass, CONTAINER_INSTANCE__TYPE);
    createEAttribute(containerInstanceEClass, CONTAINER_INSTANCE__NAME);
    createEAttribute(containerInstanceEClass, CONTAINER_INSTANCE__DESCRIPTION);

    componentEClass = createEClass(COMPONENT);
    createEAttribute(componentEClass, COMPONENT__DESCRIPTION);
    createEReference(componentEClass, COMPONENT__PARTS);
    createEReference(componentEClass, COMPONENT__PORTS);

    componentInstanceEClass = createEClass(COMPONENT_INSTANCE);
    createEReference(componentInstanceEClass, COMPONENT_INSTANCE__TYPE);
    createEAttribute(componentInstanceEClass, COMPONENT_INSTANCE__NAME);
    createEAttribute(componentInstanceEClass, COMPONENT_INSTANCE__UNBOUNDED);
    createEAttribute(componentInstanceEClass, COMPONENT_INSTANCE__LOWER_BOUND);
    createEAttribute(componentInstanceEClass, COMPONENT_INSTANCE__UPPER_BOUND);
    createEAttribute(componentInstanceEClass, COMPONENT_INSTANCE__DESCRIPTION);

    connectionEClass = createEClass(CONNECTION);
    createEAttribute(connectionEClass, CONNECTION__NAME);
    createEReference(connectionEClass, CONNECTION__FROM);
    createEReference(connectionEClass, CONNECTION__SOURCE);
    createEReference(connectionEClass, CONNECTION__TO);
    createEReference(connectionEClass, CONNECTION__DESTINATION);
    createEReference(connectionEClass, CONNECTION__STRATEGY);
    createEReference(connectionEClass, CONNECTION__VALUE);
    createEAttribute(connectionEClass, CONNECTION__DESCRIPTION);

    deploymentEClass = createEClass(DEPLOYMENT);
    createEAttribute(deploymentEClass, DEPLOYMENT__DESCRIPTION);
    createEReference(deploymentEClass, DEPLOYMENT__CONTAINERMAPPING);
    createEReference(deploymentEClass, DEPLOYMENT__CONNECTIONMAPPING);

    containerMappingEClass = createEClass(CONTAINER_MAPPING);
    createEReference(containerMappingEClass, CONTAINER_MAPPING__PROCESSOR);
    createEReference(containerMappingEClass, CONTAINER_MAPPING__CONTAINER);

    connectionMappingEClass = createEClass(CONNECTION_MAPPING);
    createEReference(connectionMappingEClass, CONNECTION_MAPPING__LINK);
    createEReference(connectionMappingEClass, CONNECTION_MAPPING__CONNECTION);

    strategyEClass = createEClass(STRATEGY);
    createEAttribute(strategyEClass, STRATEGY__DESCRIPTION);
    createEReference(strategyEClass, STRATEGY__PROPERTIES);
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

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    unitEClass.getESuperTypes().add(this.getPackageableElement());
    typeEClass.getESuperTypes().add(this.getPackageableElement());
    primitiveEClass.getESuperTypes().add(this.getType());
    interfaceEClass.getESuperTypes().add(this.getPackageableElement());
    enumerationEClass.getESuperTypes().add(this.getType());
    topicEClass.getESuperTypes().add(this.getType());
    aliasEClass.getESuperTypes().add(this.getType());
    topicPortEClass.getESuperTypes().add(this.getPort());
    interfacePortEClass.getESuperTypes().add(this.getPort());
    platformEClass.getESuperTypes().add(this.getPackageableElement());
    transportEClass.getESuperTypes().add(this.getPackageableElement());
    applicationEClass.getESuperTypes().add(this.getPackageableElement());
    containerEClass.getESuperTypes().add(this.getPackageableElement());
    componentEClass.getESuperTypes().add(this.getPackageableElement());
    deploymentEClass.getESuperTypes().add(this.getPackageableElement());
    strategyEClass.getESuperTypes().add(this.getPackageableElement());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, com.leonardo.lsaf.sadl.sadl.Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Package(), this.getPackage(), null, "package", null, 0, -1, com.leonardo.lsaf.sadl.sadl.Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageEClass, com.leonardo.lsaf.sadl.sadl.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPackage_Description(), ecorePackage.getEString(), "description", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackage_Contents(), this.getPackageableElement(), null, "contents", null, 0, -1, com.leonardo.lsaf.sadl.sadl.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageableElementEClass, com.leonardo.lsaf.sadl.sadl.PackageableElement.class, "PackageableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackageableElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, com.leonardo.lsaf.sadl.sadl.PackageableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unitEClass, com.leonardo.lsaf.sadl.sadl.Unit.class, "Unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnit_Group(), this.getUnit(), null, "group", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUnit_Description(), ecorePackage.getEString(), "description", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, com.leonardo.lsaf.sadl.sadl.Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(primitiveEClass, com.leonardo.lsaf.sadl.sadl.Primitive.class, "Primitive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrimitive_Min(), ecorePackage.getEDouble(), "min", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Primitive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrimitive_Max(), ecorePackage.getEDouble(), "max", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Primitive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrimitive_Res(), ecorePackage.getEDouble(), "res", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Primitive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceEClass, com.leonardo.lsaf.sadl.sadl.Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInterface_Description(), ecorePackage.getEString(), "description", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterface_Ports(), this.getPort(), null, "ports", null, 0, -1, com.leonardo.lsaf.sadl.sadl.Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumerationEClass, com.leonardo.lsaf.sadl.sadl.Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumeration_Description(), ecorePackage.getEString(), "description", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumeration_Enumerators(), this.getEnumerator(), null, "enumerators", null, 0, -1, com.leonardo.lsaf.sadl.sadl.Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(topicEClass, com.leonardo.lsaf.sadl.sadl.Topic.class, "Topic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTopic_Description(), ecorePackage.getEString(), "description", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTopic_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, com.leonardo.lsaf.sadl.sadl.Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aliasEClass, com.leonardo.lsaf.sadl.sadl.Alias.class, "Alias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAlias_Type(), this.getType(), null, "type", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Alias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAlias_Min(), ecorePackage.getEDouble(), "min", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Alias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAlias_Max(), ecorePackage.getEDouble(), "max", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Alias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAlias_Res(), ecorePackage.getEDouble(), "res", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Alias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAlias_Unbounded(), ecorePackage.getEString(), "unbounded", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Alias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAlias_Upperbound(), ecorePackage.getEInt(), "upperbound", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Alias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlias_Unit(), this.getUnit(), null, "unit", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Alias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAlias_Description(), ecorePackage.getEString(), "description", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Alias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(portEClass, com.leonardo.lsaf.sadl.sadl.Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPort_Name(), ecorePackage.getEString(), "name", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPort_Conjugated(), ecorePackage.getEBoolean(), "conjugated", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumeratorEClass, com.leonardo.lsaf.sadl.sadl.Enumerator.class, "Enumerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumerator_Deprecated(), ecorePackage.getEBoolean(), "deprecated", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Enumerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumerator_Name(), ecorePackage.getEString(), "name", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Enumerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumerator_Value(), ecorePackage.getEInt(), "value", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Enumerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumerator_Description(), ecorePackage.getEString(), "description", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Enumerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, com.leonardo.lsaf.sadl.sadl.Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribute_Deprecated(), ecorePackage.getEBoolean(), "deprecated", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttribute_Type(), this.getType(), null, "type", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Unbounded(), ecorePackage.getEBoolean(), "unbounded", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Lowerbound(), ecorePackage.getEInt(), "lowerbound", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Upperbound(), ecorePackage.getEInt(), "upperbound", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttribute_Unit(), this.getUnit(), null, "unit", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Description(), ecorePackage.getEString(), "description", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(topicPortEClass, com.leonardo.lsaf.sadl.sadl.TopicPort.class, "TopicPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTopicPort_Type(), this.getTopic(), null, "type", null, 0, 1, com.leonardo.lsaf.sadl.sadl.TopicPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfacePortEClass, com.leonardo.lsaf.sadl.sadl.InterfacePort.class, "InterfacePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterfacePort_Type(), this.getInterface(), null, "type", null, 0, 1, com.leonardo.lsaf.sadl.sadl.InterfacePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(platformEClass, com.leonardo.lsaf.sadl.sadl.Platform.class, "Platform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPlatform_Description(), ecorePackage.getEString(), "description", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlatform_Processors(), this.getProcessor(), null, "processors", null, 0, -1, com.leonardo.lsaf.sadl.sadl.Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlatform_Links(), this.getLink(), null, "links", null, 0, -1, com.leonardo.lsaf.sadl.sadl.Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(processorEClass, com.leonardo.lsaf.sadl.sadl.Processor.class, "Processor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProcessor_Name(), ecorePackage.getEString(), "name", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProcessor_Description(), ecorePackage.getEString(), "description", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linkEClass, com.leonardo.lsaf.sadl.sadl.Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLink_Name(), ecorePackage.getEString(), "name", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLink_Description(), ecorePackage.getEString(), "description", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_Processors(), this.getProcessor(), null, "processors", null, 0, -1, com.leonardo.lsaf.sadl.sadl.Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_Transport(), this.getTransport(), null, "transport", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_Value(), this.getPropertyValue(), null, "value", null, 0, -1, com.leonardo.lsaf.sadl.sadl.Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyEClass, com.leonardo.lsaf.sadl.sadl.Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProperty_Optional(), ecorePackage.getEBoolean(), "optional", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProperty_Description(), ecorePackage.getEString(), "description", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyValueEClass, com.leonardo.lsaf.sadl.sadl.PropertyValue.class, "PropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropertyValue_Property(), this.getProperty(), null, "property", null, 0, 1, com.leonardo.lsaf.sadl.sadl.PropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, com.leonardo.lsaf.sadl.sadl.PropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transportEClass, com.leonardo.lsaf.sadl.sadl.Transport.class, "Transport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransport_Description(), ecorePackage.getEString(), "description", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Transport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransport_Properties(), this.getProperty(), null, "properties", null, 0, -1, com.leonardo.lsaf.sadl.sadl.Transport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationEClass, com.leonardo.lsaf.sadl.sadl.Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplication_Description(), ecorePackage.getEString(), "description", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplication_ContainerInstances(), this.getContainerInstance(), null, "containerInstances", null, 0, -1, com.leonardo.lsaf.sadl.sadl.Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(containerEClass, com.leonardo.lsaf.sadl.sadl.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContainer_Description(), ecorePackage.getEString(), "description", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainer_ComponentInstances(), this.getComponentInstance(), null, "componentInstances", null, 0, -1, com.leonardo.lsaf.sadl.sadl.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainer_Connections(), this.getConnection(), null, "connections", null, 0, -1, com.leonardo.lsaf.sadl.sadl.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainer_ContainerInstances(), this.getContainerInstance(), null, "containerInstances", null, 0, -1, com.leonardo.lsaf.sadl.sadl.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(containerInstanceEClass, com.leonardo.lsaf.sadl.sadl.ContainerInstance.class, "ContainerInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContainerInstance_Type(), this.getContainer(), null, "type", null, 0, 1, com.leonardo.lsaf.sadl.sadl.ContainerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainerInstance_Name(), ecorePackage.getEString(), "name", null, 0, 1, com.leonardo.lsaf.sadl.sadl.ContainerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainerInstance_Description(), ecorePackage.getEString(), "description", null, 0, 1, com.leonardo.lsaf.sadl.sadl.ContainerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentEClass, com.leonardo.lsaf.sadl.sadl.Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComponent_Description(), ecorePackage.getEString(), "description", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_Parts(), this.getComponentInstance(), null, "parts", null, 0, -1, com.leonardo.lsaf.sadl.sadl.Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_Ports(), this.getPort(), null, "ports", null, 0, -1, com.leonardo.lsaf.sadl.sadl.Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentInstanceEClass, com.leonardo.lsaf.sadl.sadl.ComponentInstance.class, "ComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComponentInstance_Type(), this.getComponent(), null, "type", null, 0, 1, com.leonardo.lsaf.sadl.sadl.ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComponentInstance_Name(), ecorePackage.getEString(), "name", null, 0, 1, com.leonardo.lsaf.sadl.sadl.ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComponentInstance_Unbounded(), ecorePackage.getEBoolean(), "unbounded", null, 0, 1, com.leonardo.lsaf.sadl.sadl.ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComponentInstance_LowerBound(), ecorePackage.getEInt(), "lowerBound", null, 0, 1, com.leonardo.lsaf.sadl.sadl.ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComponentInstance_UpperBound(), ecorePackage.getEInt(), "upperBound", null, 0, 1, com.leonardo.lsaf.sadl.sadl.ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComponentInstance_Description(), ecorePackage.getEString(), "description", null, 0, 1, com.leonardo.lsaf.sadl.sadl.ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(connectionEClass, com.leonardo.lsaf.sadl.sadl.Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConnection_Name(), ecorePackage.getEString(), "name", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConnection_From(), this.getComponentInstance(), null, "from", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConnection_Source(), this.getPort(), null, "source", null, 0, -1, com.leonardo.lsaf.sadl.sadl.Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConnection_To(), this.getComponentInstance(), null, "to", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConnection_Destination(), this.getPort(), null, "destination", null, 0, -1, com.leonardo.lsaf.sadl.sadl.Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConnection_Strategy(), this.getStrategy(), null, "strategy", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConnection_Value(), this.getPropertyValue(), null, "value", null, 0, -1, com.leonardo.lsaf.sadl.sadl.Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConnection_Description(), ecorePackage.getEString(), "description", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deploymentEClass, com.leonardo.lsaf.sadl.sadl.Deployment.class, "Deployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeployment_Description(), ecorePackage.getEString(), "description", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeployment_Containermapping(), this.getContainerMapping(), null, "containermapping", null, 0, -1, com.leonardo.lsaf.sadl.sadl.Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeployment_Connectionmapping(), this.getConnectionMapping(), null, "connectionmapping", null, 0, -1, com.leonardo.lsaf.sadl.sadl.Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(containerMappingEClass, com.leonardo.lsaf.sadl.sadl.ContainerMapping.class, "ContainerMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContainerMapping_Processor(), this.getProcessor(), null, "processor", null, 0, 1, com.leonardo.lsaf.sadl.sadl.ContainerMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainerMapping_Container(), this.getContainer(), null, "container", null, 0, 1, com.leonardo.lsaf.sadl.sadl.ContainerMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(connectionMappingEClass, com.leonardo.lsaf.sadl.sadl.ConnectionMapping.class, "ConnectionMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConnectionMapping_Link(), this.getLink(), null, "link", null, 0, 1, com.leonardo.lsaf.sadl.sadl.ConnectionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConnectionMapping_Connection(), this.getConnection(), null, "connection", null, 0, 1, com.leonardo.lsaf.sadl.sadl.ConnectionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(strategyEClass, com.leonardo.lsaf.sadl.sadl.Strategy.class, "Strategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStrategy_Description(), ecorePackage.getEString(), "description", null, 0, 1, com.leonardo.lsaf.sadl.sadl.Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStrategy_Properties(), this.getProperty(), null, "properties", null, 0, -1, com.leonardo.lsaf.sadl.sadl.Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SadlPackageImpl
