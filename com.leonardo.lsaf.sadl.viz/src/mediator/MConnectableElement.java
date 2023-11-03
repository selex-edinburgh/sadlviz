/**
 */
package mediator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MConnectable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mediator.MConnectableElement#getX <em>X</em>}</li>
 *   <li>{@link mediator.MConnectableElement#getY <em>Y</em>}</li>
 *   <li>{@link mediator.MConnectableElement#getWidth <em>Width</em>}</li>
 *   <li>{@link mediator.MConnectableElement#getHeight <em>Height</em>}</li>
 *   <li>{@link mediator.MConnectableElement#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see mediator.MediatorPackage#getMConnectableElement()
 * @model
 * @generated
 */
public interface MConnectableElement extends MElement {
  /**
   * Returns the value of the '<em><b>X</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>X</em>' attribute.
   * @see #setX(int)
   * @see mediator.MediatorPackage#getMConnectableElement_X()
   * @model default="0"
   * @generated
   */
  int getX();

  /**
   * Sets the value of the '{@link mediator.MConnectableElement#getX <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>X</em>' attribute.
   * @see #getX()
   * @generated
   */
  void setX(int value);

  /**
   * Returns the value of the '<em><b>Y</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Y</em>' attribute.
   * @see #setY(int)
   * @see mediator.MediatorPackage#getMConnectableElement_Y()
   * @model default="0"
   * @generated
   */
  int getY();

  /**
   * Sets the value of the '{@link mediator.MConnectableElement#getY <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Y</em>' attribute.
   * @see #getY()
   * @generated
   */
  void setY(int value);

  /**
   * Returns the value of the '<em><b>Width</b></em>' attribute.
   * The default value is <code>"5"</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Width</em>' attribute.
   * @see #setWidth(int)
   * @see mediator.MediatorPackage#getMConnectableElement_Width()
   * @model default="5"
   * @generated
   */
  int getWidth();

  /**
   * Sets the value of the '{@link mediator.MConnectableElement#getWidth <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Width</em>' attribute.
   * @see #getWidth()
   * @generated
   */
  void setWidth(int value);

  /**
   * Returns the value of the '<em><b>Height</b></em>' attribute.
   * The default value is <code>"5"</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Height</em>' attribute.
   * @see #setHeight(int)
   * @see mediator.MediatorPackage#getMConnectableElement_Height()
   * @model default="5"
   * @generated
   */
  int getHeight();

  /**
   * Sets the value of the '{@link mediator.MConnectableElement#getHeight <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Height</em>' attribute.
   * @see #getHeight()
   * @generated
   */
  void setHeight(int value);

  /**
   * Returns the value of the '<em><b>Level</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level</em>' attribute.
   * @see #setLevel(int)
   * @see mediator.MediatorPackage#getMConnectableElement_Level()
   * @model default="0"
   * @generated
   */
  int getLevel();

  /**
   * Sets the value of the '{@link mediator.MConnectableElement#getLevel <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level</em>' attribute.
   * @see #getLevel()
   * @generated
   */
  void setLevel(int value);

} // MConnectableElement
