/**
 */
package mediator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MGraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mediator.MGraph#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link mediator.MGraph#getNodes <em>Nodes</em>}</li>
 *   <li>{@link mediator.MGraph#getEdges <em>Edges</em>}</li>
 * </ul>
 *
 * @see mediator.MediatorPackage#getMGraph()
 * @model
 * @generated
 */
public interface MGraph extends MElement {
  /**
   * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Algorithm</em>' attribute.
   * @see #setAlgorithm(String)
   * @see mediator.MediatorPackage#getMGraph_Algorithm()
   * @model
   * @generated
   */
  String getAlgorithm();

  /**
   * Sets the value of the '{@link mediator.MGraph#getAlgorithm <em>Algorithm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Algorithm</em>' attribute.
   * @see #getAlgorithm()
   * @generated
   */
  void setAlgorithm(String value);

  /**
   * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
   * The list contents are of type {@link mediator.MNode}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nodes</em>' containment reference list.
   * @see mediator.MediatorPackage#getMGraph_Nodes()
   * @model containment="true"
   * @generated
   */
  EList<MNode> getNodes();

  /**
   * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
   * The list contents are of type {@link mediator.MEdge}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Edges</em>' containment reference list.
   * @see mediator.MediatorPackage#getMGraph_Edges()
   * @model containment="true"
   * @generated
   */
  EList<MEdge> getEdges();

} // MGraph
