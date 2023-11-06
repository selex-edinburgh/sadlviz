/**
 */
package sadl;

import com.leonardo.lsaf.sadl.sadl.Type;
import com.leonardo.lsaf.sadl.sadl.Unit;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.leonardo.lsaf.sadl.sadl.Attribute#isDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link com.leonardo.lsaf.sadl.sadl.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link com.leonardo.lsaf.sadl.sadl.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link com.leonardo.lsaf.sadl.sadl.Attribute#isUnbounded <em>Unbounded</em>}</li>
 *   <li>{@link com.leonardo.lsaf.sadl.sadl.Attribute#getLowerbound <em>Lowerbound</em>}</li>
 *   <li>{@link com.leonardo.lsaf.sadl.sadl.Attribute#getUpperbound <em>Upperbound</em>}</li>
 *   <li>{@link com.leonardo.lsaf.sadl.sadl.Attribute#getUnit <em>Unit</em>}</li>
 *   <li>{@link com.leonardo.lsaf.sadl.sadl.Attribute#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see sadl.SadlPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
  /**
   * Returns the value of the '<em><b>Deprecated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deprecated</em>' attribute.
   * @see #setDeprecated(boolean)
   * @see sadl.SadlPackage#getAttribute_Deprecated()
   * @model
   * @generated
   */
  boolean isDeprecated();

  /**
   * Sets the value of the '{@link com.leonardo.lsaf.sadl.sadl.Attribute#isDeprecated <em>Deprecated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deprecated</em>' attribute.
   * @see #isDeprecated()
   * @generated
   */
  void setDeprecated(boolean value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Type)
   * @see sadl.SadlPackage#getAttribute_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link com.leonardo.lsaf.sadl.sadl.Attribute#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see sadl.SadlPackage#getAttribute_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.leonardo.lsaf.sadl.sadl.Attribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Unbounded</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unbounded</em>' attribute.
   * @see #setUnbounded(boolean)
   * @see sadl.SadlPackage#getAttribute_Unbounded()
   * @model
   * @generated
   */
  boolean isUnbounded();

  /**
   * Sets the value of the '{@link com.leonardo.lsaf.sadl.sadl.Attribute#isUnbounded <em>Unbounded</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unbounded</em>' attribute.
   * @see #isUnbounded()
   * @generated
   */
  void setUnbounded(boolean value);

  /**
   * Returns the value of the '<em><b>Lowerbound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lowerbound</em>' attribute.
   * @see #setLowerbound(int)
   * @see sadl.SadlPackage#getAttribute_Lowerbound()
   * @model
   * @generated
   */
  int getLowerbound();

  /**
   * Sets the value of the '{@link com.leonardo.lsaf.sadl.sadl.Attribute#getLowerbound <em>Lowerbound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lowerbound</em>' attribute.
   * @see #getLowerbound()
   * @generated
   */
  void setLowerbound(int value);

  /**
   * Returns the value of the '<em><b>Upperbound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upperbound</em>' attribute.
   * @see #setUpperbound(int)
   * @see sadl.SadlPackage#getAttribute_Upperbound()
   * @model
   * @generated
   */
  int getUpperbound();

  /**
   * Sets the value of the '{@link com.leonardo.lsaf.sadl.sadl.Attribute#getUpperbound <em>Upperbound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upperbound</em>' attribute.
   * @see #getUpperbound()
   * @generated
   */
  void setUpperbound(int value);

  /**
   * Returns the value of the '<em><b>Unit</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' reference.
   * @see #setUnit(Unit)
   * @see sadl.SadlPackage#getAttribute_Unit()
   * @model
   * @generated
   */
  Unit getUnit();

  /**
   * Sets the value of the '{@link com.leonardo.lsaf.sadl.sadl.Attribute#getUnit <em>Unit</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' reference.
   * @see #getUnit()
   * @generated
   */
  void setUnit(Unit value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see sadl.SadlPackage#getAttribute_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link com.leonardo.lsaf.sadl.sadl.Attribute#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // Attribute
