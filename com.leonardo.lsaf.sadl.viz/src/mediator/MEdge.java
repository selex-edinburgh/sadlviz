/**
 */
package mediator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MEdge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mediator.MEdge#getSource <em>Source</em>}</li>
 *   <li>{@link mediator.MEdge#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see mediator.MediatorPackage#getMEdge()
 * @model
 * @generated
 */
public interface MEdge extends MElement {
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(MConnectableElement)
   * @see mediator.MediatorPackage#getMEdge_Source()
   * @model
   * @generated
   */
  MConnectableElement getSource();

  /**
   * Sets the value of the '{@link mediator.MEdge#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(MConnectableElement value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(MConnectableElement)
   * @see mediator.MediatorPackage#getMEdge_Target()
   * @model
   * @generated
   */
  MConnectableElement getTarget();

  /**
   * Sets the value of the '{@link mediator.MEdge#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(MConnectableElement value);

} // MEdge
