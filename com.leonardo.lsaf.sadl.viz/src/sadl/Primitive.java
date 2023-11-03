/**
 */
package sadl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sadl.Primitive#getMin <em>Min</em>}</li>
 *   <li>{@link sadl.Primitive#getMax <em>Max</em>}</li>
 *   <li>{@link sadl.Primitive#getRes <em>Res</em>}</li>
 * </ul>
 *
 * @see sadl.SadlPackage#getPrimitive()
 * @model
 * @generated
 */
public interface Primitive extends Type {
  /**
   * Returns the value of the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min</em>' attribute.
   * @see #setMin(double)
   * @see sadl.SadlPackage#getPrimitive_Min()
   * @model
   * @generated
   */
  double getMin();

  /**
   * Sets the value of the '{@link sadl.Primitive#getMin <em>Min</em>}' attribute.
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
   * @see sadl.SadlPackage#getPrimitive_Max()
   * @model
   * @generated
   */
  double getMax();

  /**
   * Sets the value of the '{@link sadl.Primitive#getMax <em>Max</em>}' attribute.
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
   * @see sadl.SadlPackage#getPrimitive_Res()
   * @model
   * @generated
   */
  double getRes();

  /**
   * Sets the value of the '{@link sadl.Primitive#getRes <em>Res</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Res</em>' attribute.
   * @see #getRes()
   * @generated
   */
  void setRes(double value);

} // Primitive
