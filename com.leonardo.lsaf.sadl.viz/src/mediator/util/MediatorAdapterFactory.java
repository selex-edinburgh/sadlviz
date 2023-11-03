/**
 */
package mediator.util;

import mediator.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mediator.MediatorPackage
 * @generated
 */
public class MediatorAdapterFactory extends AdapterFactoryImpl {
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MediatorPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MediatorAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = MediatorPackage.eINSTANCE;
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
  protected MediatorSwitch<Adapter> modelSwitch =
    new MediatorSwitch<Adapter>() {
      @Override
      public Adapter caseMGraph(MGraph object) {
        return createMGraphAdapter();
      }
      @Override
      public Adapter caseMElement(MElement object) {
        return createMElementAdapter();
      }
      @Override
      public Adapter caseMEdge(MEdge object) {
        return createMEdgeAdapter();
      }
      @Override
      public Adapter caseMConnectableElement(MConnectableElement object) {
        return createMConnectableElementAdapter();
      }
      @Override
      public Adapter caseMNode(MNode object) {
        return createMNodeAdapter();
      }
      @Override
      public Adapter caseMPort(MPort object) {
        return createMPortAdapter();
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
   * Creates a new adapter for an object of class '{@link mediator.MGraph <em>MGraph</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mediator.MGraph
   * @generated
   */
  public Adapter createMGraphAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mediator.MElement <em>MElement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mediator.MElement
   * @generated
   */
  public Adapter createMElementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mediator.MEdge <em>MEdge</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mediator.MEdge
   * @generated
   */
  public Adapter createMEdgeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mediator.MConnectableElement <em>MConnectable Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mediator.MConnectableElement
   * @generated
   */
  public Adapter createMConnectableElementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mediator.MNode <em>MNode</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mediator.MNode
   * @generated
   */
  public Adapter createMNodeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mediator.MPort <em>MPort</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mediator.MPort
   * @generated
   */
  public Adapter createMPortAdapter() {
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

} //MediatorAdapterFactory
