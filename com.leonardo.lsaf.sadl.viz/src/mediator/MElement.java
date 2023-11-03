/**
 */
package mediator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MElement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mediator.MElement#getId <em>Id</em>}</li>
 *   <li>{@link mediator.MElement#getLabel <em>Label</em>}</li>
 *   <li>{@link mediator.MElement#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @see mediator.MediatorPackage#getMElement()
 * @model abstract="true"
 * @generated
 */
public interface MElement extends EObject {
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see mediator.MediatorPackage#getMElement_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link mediator.MElement#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see mediator.MediatorPackage#getMElement_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link mediator.MElement#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' attribute.
   * @see #setClass(String)
   * @see mediator.MediatorPackage#getMElement_Class()
   * @model
   * @generated
   */
  String getClass_();

  /**
   * Sets the value of the '{@link mediator.MElement#getClass_ <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' attribute.
   * @see #getClass_()
   * @generated
   */
  void setClass(String value);

} // MElement
