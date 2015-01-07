/**
 */
package CodePack;

import CodePack.DataModels.StaffMember;
import CodePack.DataModels.StaffRole;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IStaff Admin</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see CodePack.CodePackPackage#getIStaffAdmin()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IStaffAdmin extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameRequired="true" nameOrdered="false" emailRequired="true" emailOrdered="false" pers_noRequired="true" pers_noOrdered="false" phone_noRequired="true" phone_noOrdered="false" role_nameRequired="true" role_nameOrdered="false"
	 * @generated
	 */
	StaffMember registerStaffAccount(String name, String email, String pers_no, int phone_no, String role_name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" accountRequired="true" accountOrdered="false"
	 * @generated
	 */
	boolean updateStaffAccount(StaffMember account);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" pers_noRequired="true" pers_noOrdered="false"
	 * @generated
	 */
	StaffMember getStaffAccount(String pers_no);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<StaffMember> getAllStaffAccounts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" accountRequired="true" accountOrdered="false"
	 * @generated
	 */
	boolean removeStaffAccount(StaffMember account);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	EList<StaffRole> getStaffRoles();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameRequired="true" nameOrdered="false" canManageBookingsRequired="true" canManageBookingsOrdered="false" canManageRoomsRequired="true" canManageRoomsOrdered="false" canManageServicesRequired="true" canManageServicesOrdered="false" canManageAccountsRequired="true" canManageAccountsOrdered="false"
	 * @generated
	 */
	StaffRole addStaffRole(String name, boolean canManageBookings, boolean canManageRooms, boolean canManageServices, boolean canManageAccounts);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roleRequired="true" roleOrdered="false"
	 * @generated
	 */
	boolean updateStaffRole(StaffRole role);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roleRequired="true" roleOrdered="false"
	 * @generated
	 */
	boolean removeStaffRole(StaffRole role);

} // IStaffAdmin
