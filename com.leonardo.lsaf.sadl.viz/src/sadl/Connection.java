/**
 */
package sadl;

import com.leonardo.lsaf.sadl.sadl.ComponentInstance;
import com.leonardo.lsaf.sadl.sadl.Port;
import com.leonardo.lsaf.sadl.sadl.PropertyValue;
import com.leonardo.lsaf.sadl.sadl.Strategy;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.leonardo.lsaf.sadl.sadl.Connection#getName <em>Name</em>}</li>
 *   <li>{@link com.leonardo.lsaf.sadl.sadl.Connection#getFrom <em>From</em>}</li>
 *   <li>{@link com.leonardo.lsaf.sadl.sadl.Connection#getSource <em>Source</em>}</li>
 *   <li>{@link com.leonardo.lsaf.sadl.sadl.Connection#getTo <em>To</em>}</li>
 *   <li>{@link com.leonardo.lsaf.sadl.sadl.Connection#getDestination <em>Destination</em>}</li>
 *   <li>{@link com.leonardo.lsaf.sadl.sadl.Connection#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link com.leonardo.lsaf.sadl.sadl.Connection#getValue <em>Value</em>}</li>
 *   <li>{@link com.leonardo.lsaf.sadl.sadl.Connection#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see sadl.SadlPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see sadl.SadlPackage#getConnection_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.leonardo.lsaf.sadl.sadl.Connection#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' reference.
   * @see #setFrom(ComponentInstance)
   * @see sadl.SadlPackage#getConnection_From()
   * @model
   * @generated
   */
  ComponentInstance getFrom();

  /**
   * Sets the value of the '{@link com.leonardo.lsaf.sadl.sadl.Connection#getFrom <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(ComponentInstance value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' reference list.
   * The list contents are of type {@link com.leonardo.lsaf.sadl.sadl.Port}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference list.
   * @see sadl.SadlPackage#getConnection_Source()
   * @model
   * @generated
   */
  EList<Port> getSource();

  /**
   * Returns the value of the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' reference.
   * @see #setTo(ComponentInstance)
   * @see sadl.SadlPackage#getConnection_To()
   * @model
   * @generated
   */
  ComponentInstance getTo();

  /**
   * Sets the value of the '{@link com.leonardo.lsaf.sadl.sadl.Connection#getTo <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' reference.
   * @see #getTo()
   * @generated
   */
  void setTo(ComponentInstance value);

  /**
   * Returns the value of the '<em><b>Destination</b></em>' reference list.
   * The list contents are of type {@link com.leonardo.lsaf.sadl.sadl.Port}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination</em>' reference list.
   * @see sadl.SadlPackage#getConnection_Destination()
   * @model
   * @generated
   */
  EList<Port> getDestination();

  /**
   * Returns the value of the '<em><b>Strategy</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strategy</em>' reference.
   * @see #setStrategy(Strategy)
   * @see sadl.SadlPackage#getConnection_Strategy()
   * @model
   * @generated
   */
  Strategy getStrategy();

  /**
   * Sets the value of the '{@link com.leonardo.lsaf.sadl.sadl.Connection#getStrategy <em>Strategy</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Strategy</em>' reference.
   * @see #getStrategy()
   * @generated
   */
  void setStrategy(Strategy value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference list.
   * The list contents are of type {@link com.leonardo.lsaf.sadl.sadl.PropertyValue}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference list.
   * @see sadl.SadlPackage#getConnection_Value()
   * @model containment="true"
   * @generated
   */
  EList<PropertyValue> getValue();

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see sadl.SadlPackage#getConnection_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link com.leonardo.lsaf.sadl.sadl.Connection#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // Connection
