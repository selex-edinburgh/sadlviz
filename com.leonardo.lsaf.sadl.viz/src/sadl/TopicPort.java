/**
 */
package sadl;

import com.leonardo.lsaf.sadl.sadl.Port;
import com.leonardo.lsaf.sadl.sadl.Topic;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topic Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.leonardo.lsaf.sadl.sadl.TopicPort#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see sadl.SadlPackage#getTopicPort()
 * @model
 * @generated
 */
public interface TopicPort extends EObject, Port {
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Topic)
   * @see sadl.SadlPackage#getTopicPort_Type()
   * @model
   * @generated
   */
  Topic getType();

  /**
   * Sets the value of the '{@link com.leonardo.lsaf.sadl.sadl.TopicPort#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Topic value);

} // TopicPort
