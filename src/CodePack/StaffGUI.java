/**
 */
package CodePack;

import CodePack.Backend.ManagementHandler;
import CodePack.Backend.ReceptionHandler;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff GUI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CodePack.StaffGUI#getManagementHandler <em>Management Handler</em>}</li>
 *   <li>{@link CodePack.StaffGUI#getReceptionHandler <em>Reception Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see CodePack.CodePackPackage#getStaffGUI()
 * @model
 * @generated
 */
public interface StaffGUI extends EObject {
	/**
	 * Returns the value of the '<em><b>Management Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Management Handler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Management Handler</em>' reference.
	 * @see #setManagementHandler(ManagementHandler)
	 * @see CodePack.CodePackPackage#getStaffGUI_ManagementHandler()
	 * @model ordered="false"
	 * @generated
	 */
	ManagementHandler getManagementHandler();

	/**
	 * Sets the value of the '{@link CodePack.StaffGUI#getManagementHandler <em>Management Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Management Handler</em>' reference.
	 * @see #getManagementHandler()
	 * @generated
	 */
	void setManagementHandler(ManagementHandler value);

	/**
	 * Returns the value of the '<em><b>Reception Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reception Handler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reception Handler</em>' reference.
	 * @see #setReceptionHandler(ReceptionHandler)
	 * @see CodePack.CodePackPackage#getStaffGUI_ReceptionHandler()
	 * @model ordered="false"
	 * @generated
	 */
	ReceptionHandler getReceptionHandler();

	/**
	 * Sets the value of the '{@link CodePack.StaffGUI#getReceptionHandler <em>Reception Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reception Handler</em>' reference.
	 * @see #getReceptionHandler()
	 * @generated
	 */
	void setReceptionHandler(ReceptionHandler value);

} // StaffGUI
