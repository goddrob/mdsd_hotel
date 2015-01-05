/**
 */
package CodePack.DataModels;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CodePack.DataModels.StaffRole#getName <em>Name</em>}</li>
 *   <li>{@link CodePack.DataModels.StaffRole#isCanManageBookings <em>Can Manage Bookings</em>}</li>
 *   <li>{@link CodePack.DataModels.StaffRole#isCanManageRooms <em>Can Manage Rooms</em>}</li>
 *   <li>{@link CodePack.DataModels.StaffRole#isCanManageServices <em>Can Manage Services</em>}</li>
 *   <li>{@link CodePack.DataModels.StaffRole#isCanManageAccounts <em>Can Manage Accounts</em>}</li>
 * </ul>
 * </p>
 *
 * @see CodePack.DataModels.DataModelsPackage#getStaffRole()
 * @model
 * @generated
 */
public interface StaffRole extends EObject {

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
	 * @see CodePack.DataModels.DataModelsPackage#getStaffRole_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.StaffRole#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Can Manage Bookings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Manage Bookings</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Manage Bookings</em>' attribute.
	 * @see #setCanManageBookings(boolean)
	 * @see CodePack.DataModels.DataModelsPackage#getStaffRole_CanManageBookings()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isCanManageBookings();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.StaffRole#isCanManageBookings <em>Can Manage Bookings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Manage Bookings</em>' attribute.
	 * @see #isCanManageBookings()
	 * @generated
	 */
	void setCanManageBookings(boolean value);

	/**
	 * Returns the value of the '<em><b>Can Manage Rooms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Manage Rooms</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Manage Rooms</em>' attribute.
	 * @see #setCanManageRooms(boolean)
	 * @see CodePack.DataModels.DataModelsPackage#getStaffRole_CanManageRooms()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isCanManageRooms();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.StaffRole#isCanManageRooms <em>Can Manage Rooms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Manage Rooms</em>' attribute.
	 * @see #isCanManageRooms()
	 * @generated
	 */
	void setCanManageRooms(boolean value);

	/**
	 * Returns the value of the '<em><b>Can Manage Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Manage Services</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Manage Services</em>' attribute.
	 * @see #setCanManageServices(boolean)
	 * @see CodePack.DataModels.DataModelsPackage#getStaffRole_CanManageServices()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isCanManageServices();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.StaffRole#isCanManageServices <em>Can Manage Services</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Manage Services</em>' attribute.
	 * @see #isCanManageServices()
	 * @generated
	 */
	void setCanManageServices(boolean value);

	/**
	 * Returns the value of the '<em><b>Can Manage Accounts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Manage Accounts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Manage Accounts</em>' attribute.
	 * @see #setCanManageAccounts(boolean)
	 * @see CodePack.DataModels.DataModelsPackage#getStaffRole_CanManageAccounts()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isCanManageAccounts();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.StaffRole#isCanManageAccounts <em>Can Manage Accounts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Manage Accounts</em>' attribute.
	 * @see #isCanManageAccounts()
	 * @generated
	 */
	void setCanManageAccounts(boolean value);
} // StaffRole
