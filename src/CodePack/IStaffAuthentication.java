/**
 */
package CodePack;

import CodePack.DataModels.StaffMember;
import CodePack.DataModels.StaffRole;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IStaff Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see CodePack.CodePackPackage#getIStaffAuthentication()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IStaffAuthentication extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" e_mailRequired="true" e_mailOrdered="false" passwordRequired="true" passwordOrdered="false"
	 * @generated
	 */
	StaffMember login(String e_mail, String password);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" pers_noRequired="true" pers_noOrdered="false"
	 * @generated
	 */
	StaffRole getRoleForStaff(int pers_no);

} // IStaffAuthentication
