/**
 */
package CodePack;

import CodePack.Backend.CheckInHandler;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check In Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CodePack.CheckInMachine#getCheckInHandler <em>Check In Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see CodePack.CodePackPackage#getCheckInMachine()
 * @model
 * @generated
 */
public interface CheckInMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>Check In Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check In Handler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check In Handler</em>' reference.
	 * @see #setCheckInHandler(CheckInHandler)
	 * @see CodePack.CodePackPackage#getCheckInMachine_CheckInHandler()
	 * @model ordered="false"
	 * @generated
	 */
	CheckInHandler getCheckInHandler();

	/**
	 * Sets the value of the '{@link CodePack.CheckInMachine#getCheckInHandler <em>Check In Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check In Handler</em>' reference.
	 * @see #getCheckInHandler()
	 * @generated
	 */
	void setCheckInHandler(CheckInHandler value);

} // CheckInMachine
