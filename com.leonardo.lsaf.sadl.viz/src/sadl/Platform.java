/**
 */
package sadl;

import com.leonardo.lsaf.sadl.sadl.Link;
import com.leonardo.lsaf.sadl.sadl.PackageableElement;
import com.leonardo.lsaf.sadl.sadl.Processor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.leonardo.lsaf.sadl.sadl.Platform#getDescription <em>Description</em>}</li>
 *   <li>{@link com.leonardo.lsaf.sadl.sadl.Platform#getProcessors <em>Processors</em>}</li>
 *   <li>{@link com.leonardo.lsaf.sadl.sadl.Platform#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see sadl.SadlPackage#getPlatform()
 * @model
 * @generated
 */
public interface Platform extends EObject, PackageableElement {
  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see sadl.SadlPackage#getPlatform_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link com.leonardo.lsaf.sadl.sadl.Platform#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Processors</b></em>' containment reference list.
   * The list contents are of type {@link com.leonardo.lsaf.sadl.sadl.Processor}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Processors</em>' containment reference list.
   * @see sadl.SadlPackage#getPlatform_Processors()
   * @model containment="true"
   * @generated
   */
  EList<Processor> getProcessors();

  /**
   * Returns the value of the '<em><b>Links</b></em>' containment reference list.
   * The list contents are of type {@link com.leonardo.lsaf.sadl.sadl.Link}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Links</em>' containment reference list.
   * @see sadl.SadlPackage#getPlatform_Links()
   * @model containment="true"
   * @generated
   */
  EList<Link> getLinks();

} // Platform
