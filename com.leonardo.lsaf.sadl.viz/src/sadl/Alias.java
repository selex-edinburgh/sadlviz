/**
 */
package sadl;

import com.leonardo.lsaf.sadl.sadl.Type;
import com.leonardo.lsaf.sadl.sadl.Unit;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alias</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.leonardo.lsaf.sadl.sadl.Alias#getType <em>Type</em>}</li>
 *   <li>{@link com.leonardo.lsaf.sadl.sadl.Alias#getMin <em>Min</em>}</li>
 *   <li>{@link com.leonardo.lsaf.sadl.sadl.Alias#getMax <em>Max</em>}</li>
 *   <li>{@link com.leonardo.lsaf.sadl.sadl.Alias#getRes <em>Res</em>}</li>
 *   <li>{@link com.leonardo.lsaf.sadl.sadl.Alias#getUnbounded <em>Unbounded</em>}</li>
 *   <li>{@link com.leonardo.lsaf.sadl.sadl.Alias#getUpperbound <em>Upperbound</em>}</li>
 *   <li>{@link com.leonardo.lsaf.sadl.sadl.Alias#getUnit <em>Unit</em>}</li>
 *   <li>{@link com.leonardo.lsaf.sadl.sadl.Alias#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see sadl.SadlPackage#getAlias()
 * @model
 * @generated
 */
public interface Alias extends EObject, Type {
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Type)
   * @see sadl.SadlPackage#getAlias_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link com.leonardo.lsaf.sadl.sadl.Alias#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min</em>' attribute.
   * @see #setMin(double)
   * @see sadl.SadlPackage#getAlias_Min()
   * @model
   * @generated
   */
  double getMin();

  /**
   * Sets the value of the '{@link com.leonardo.lsaf.sadl.sadl.Alias#getMin <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min</em>' attribute.
   * @see #getMin()
   * @generated
   */
  void setMin(double value);

  /**
   * Returns the value of the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max</em>' attribute.
   * @see #setMax(double)
   * @see sadl.SadlPackage#getAlias_Max()
   * @model
   * @generated
   */
  double getMax();

  /**
   * Sets the value of the '{@link com.leonardo.lsaf.sadl.sadl.Alias#getMax <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' attribute.
   * @see #getMax()
   * @generated
   */
  void setMax(double value);

  /**
   * Returns the value of the '<em><b>Res</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Res</em>' attribute.
   * @see #setRes(double)
   * @see sadl.SadlPackage#getAlias_Res()
   * @model
   * @generated
   */
  double getRes();

  /**
   * Sets the value of the '{@link com.leonardo.lsaf.sadl.sadl.Alias#getRes <em>Res</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Res</em>' attribute.
   * @see #getRes()
   * @generated
   */
  void setRes(double value);

  /**
   * Returns the value of the '<em><b>Unbounded</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unbounded</em>' attribute.
   * @see #setUnbounded(String)
   * @see sadl.SadlPackage#getAlias_Unbounded()
   * @model
   * @generated
   */
  String getUnbounded();

  /**
   * Sets the value of the '{@link com.leonardo.lsaf.sadl.sadl.Alias#getUnbounded <em>Unbounded</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unbounded</em>' attribute.
   * @see #getUnbounded()
   * @generated
   */
  void setUnbounded(String value);

  /**
   * Returns the value of the '<em><b>Upperbound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upperbound</em>' attribute.
   * @see #setUpperbound(int)
   * @see sadl.SadlPackage#getAlias_Upperbound()
   * @model
   * @generated
   */
  int getUpperbound();

  /**
   * Sets the value of the '{@link com.leonardo.lsaf.sadl.sadl.Alias#getUpperbound <em>Upperbound</em>}' attribute.
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
   * @see sadl.SadlPackage#getAlias_Unit()
   * @model
   * @generated
   */
  Unit getUnit();

  /**
   * Sets the value of the '{@link com.leonardo.lsaf.sadl.sadl.Alias#getUnit <em>Unit</em>}' reference.
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
   * @see sadl.SadlPackage#getAlias_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link com.leonardo.lsaf.sadl.sadl.Alias#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // Alias
