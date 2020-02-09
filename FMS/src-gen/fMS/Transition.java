/**
 */
package fMS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fMS.Transition#getStateStart <em>State Start</em>}</li>
 *   <li>{@link fMS.Transition#getStateEnd <em>State End</em>}</li>
 *   <li>{@link fMS.Transition#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see fMS.FMSPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>State Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Start</em>' reference.
	 * @see #setStateStart(State)
	 * @see fMS.FMSPackage#getTransition_StateStart()
	 * @model
	 * @generated
	 */
	State getStateStart();

	/**
	 * Sets the value of the '{@link fMS.Transition#getStateStart <em>State Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Start</em>' reference.
	 * @see #getStateStart()
	 * @generated
	 */
	void setStateStart(State value);

	/**
	 * Returns the value of the '<em><b>State End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State End</em>' reference.
	 * @see #setStateEnd(State)
	 * @see fMS.FMSPackage#getTransition_StateEnd()
	 * @model
	 * @generated
	 */
	State getStateEnd();

	/**
	 * Sets the value of the '{@link fMS.Transition#getStateEnd <em>State End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State End</em>' reference.
	 * @see #getStateEnd()
	 * @generated
	 */
	void setStateEnd(State value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fMS.FMSPackage#getTransition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fMS.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Transition
