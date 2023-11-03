/**
 */
package mediator;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mediator.MediatorPackage
 * @generated
 */
public interface MediatorFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MediatorFactory eINSTANCE = mediator.impl.MediatorFactoryImpl.init();

  /**
   * Returns a new object of class '<em>MGraph</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MGraph</em>'.
   * @generated
   */
  MGraph createMGraph();

  /**
   * Returns a new object of class '<em>MEdge</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MEdge</em>'.
   * @generated
   */
  MEdge createMEdge();

  /**
   * Returns a new object of class '<em>MConnectable Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MConnectable Element</em>'.
   * @generated
   */
  MConnectableElement createMConnectableElement();

  /**
   * Returns a new object of class '<em>MNode</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MNode</em>'.
   * @generated
   */
  MNode createMNode();

  /**
   * Returns a new object of class '<em>MPort</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MPort</em>'.
   * @generated
   */
  MPort createMPort();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MediatorPackage getMediatorPackage();

} //MediatorFactory
