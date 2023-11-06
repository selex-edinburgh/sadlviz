/**
 */
package sadl;

import com.leonardo.lsaf.sadl.sadl.PackageableElement;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.leonardo.lsaf.sadl.sadl.Unit#getGroup <em>Group</em>}</li>
 *   <li>{@link com.leonardo.lsaf.sadl.sadl.Unit#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see sadl.SadlPackage#getUnit()
 * @model
 * @generated
 */
public interface Unit extends EObject, PackageableElement {
  /**
   * Returns the value of the '<em><b>Group</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group</em>' reference.
   * @see #setGroup(com.leonardo.lsaf.sadl.sadl.Unit)
   * @see sadl.SadlPackage#getUnit_Group()
   * @model
   * @generated
   */
  com.leonardo.lsaf.sadl.sadl.Unit getGroup();

  /**
   * Sets the value of the '{@link com.leonardo.lsaf.sadl.sadl.Unit#getGroup <em>Group</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Group</em>' reference.
   * @see #getGroup()
   * @generated
   */
  void setGroup(com.leonardo.lsaf.sadl.sadl.Unit value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see sadl.SadlPackage#getUnit_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link com.leonardo.lsaf.sadl.sadl.Unit#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // Unit
