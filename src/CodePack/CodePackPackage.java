/**
 */
package CodePack;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CodePack.CodePackFactory
 * @model kind="package"
 * @generated
 */
public interface CodePackPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CodePack";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///CodePack.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CodePack";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodePackPackage eINSTANCE = CodePack.impl.CodePackPackageImpl.init();

	/**
	 * The meta object id for the '{@link CodePack.IBookings <em>IBookings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodePack.IBookings
	 * @see CodePack.impl.CodePackPackageImpl#getIBookings()
	 * @generated
	 */
	int IBOOKINGS = 1;

	/**
	 * The number of structural features of the '<em>IBookings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___CREATE_BOOKING__CONTACTDATA_PAYMENTDATA_ELIST_ELIST_INT_DATE_DATE = 0;

	/**
	 * The operation id for the '<em>Create Booking For Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___CREATE_BOOKING_FOR_CUSTOMER__INT_ELIST_ELIST_INT_DATE_DATE = 1;

	/**
	 * The operation id for the '<em>Update Room For Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___UPDATE_ROOM_FOR_BOOKING__INT_INT_INT = 2;

	/**
	 * The operation id for the '<em>Update Service For Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___UPDATE_SERVICE_FOR_BOOKING__INT_EXTRASERVICE = 3;

	/**
	 * The operation id for the '<em>Get Available Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___GET_AVAILABLE_ROOMS__DATE_DATE = 4;

	/**
	 * The operation id for the '<em>Get Available Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___GET_AVAILABLE_SERVICES = 5;

	/**
	 * The operation id for the '<em>Is Room Available</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___IS_ROOM_AVAILABLE__INT_DATE_DATE = 6;

	/**
	 * The operation id for the '<em>Get Bookings For Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___GET_BOOKINGS_FOR_CUSTOMER__INT = 7;

	/**
	 * The operation id for the '<em>Get Booking For Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___GET_BOOKING_FOR_ID__INT = 8;

	/**
	 * The operation id for the '<em>Update Time For Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___UPDATE_TIME_FOR_BOOKING__INT_DATE_DATE = 9;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___CANCEL_BOOKING__INT = 10;

	/**
	 * The operation id for the '<em>Get Payment For Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___GET_PAYMENT_FOR_BOOKING__INT = 11;

	/**
	 * The operation id for the '<em>Send Comfimation Mail</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___SEND_COMFIMATION_MAIL__BOOKING = 12;

	/**
	 * The number of operations of the '<em>IBookings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS_OPERATION_COUNT = 13;

	/**
	 * The meta object id for the '{@link CodePack.IUserAccount <em>IUser Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodePack.IUserAccount
	 * @see CodePack.impl.CodePackPackageImpl#getIUserAccount()
	 * @generated
	 */
	int IUSER_ACCOUNT = 0;

	/**
	 * The number of structural features of the '<em>IUser Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IUSER_ACCOUNT_FEATURE_COUNT = IBOOKINGS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IUSER_ACCOUNT___CREATE_BOOKING__CONTACTDATA_PAYMENTDATA_ELIST_ELIST_INT_DATE_DATE = IBOOKINGS___CREATE_BOOKING__CONTACTDATA_PAYMENTDATA_ELIST_ELIST_INT_DATE_DATE;

	/**
	 * The operation id for the '<em>Create Booking For Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IUSER_ACCOUNT___CREATE_BOOKING_FOR_CUSTOMER__INT_ELIST_ELIST_INT_DATE_DATE = IBOOKINGS___CREATE_BOOKING_FOR_CUSTOMER__INT_ELIST_ELIST_INT_DATE_DATE;

	/**
	 * The operation id for the '<em>Update Room For Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IUSER_ACCOUNT___UPDATE_ROOM_FOR_BOOKING__INT_INT_INT = IBOOKINGS___UPDATE_ROOM_FOR_BOOKING__INT_INT_INT;

	/**
	 * The operation id for the '<em>Update Service For Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IUSER_ACCOUNT___UPDATE_SERVICE_FOR_BOOKING__INT_EXTRASERVICE = IBOOKINGS___UPDATE_SERVICE_FOR_BOOKING__INT_EXTRASERVICE;

	/**
	 * The operation id for the '<em>Get Available Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IUSER_ACCOUNT___GET_AVAILABLE_ROOMS__DATE_DATE = IBOOKINGS___GET_AVAILABLE_ROOMS__DATE_DATE;

	/**
	 * The operation id for the '<em>Get Available Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IUSER_ACCOUNT___GET_AVAILABLE_SERVICES = IBOOKINGS___GET_AVAILABLE_SERVICES;

	/**
	 * The operation id for the '<em>Is Room Available</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IUSER_ACCOUNT___IS_ROOM_AVAILABLE__INT_DATE_DATE = IBOOKINGS___IS_ROOM_AVAILABLE__INT_DATE_DATE;

	/**
	 * The operation id for the '<em>Get Bookings For Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IUSER_ACCOUNT___GET_BOOKINGS_FOR_CUSTOMER__INT = IBOOKINGS___GET_BOOKINGS_FOR_CUSTOMER__INT;

	/**
	 * The operation id for the '<em>Get Booking For Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IUSER_ACCOUNT___GET_BOOKING_FOR_ID__INT = IBOOKINGS___GET_BOOKING_FOR_ID__INT;

	/**
	 * The operation id for the '<em>Update Time For Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IUSER_ACCOUNT___UPDATE_TIME_FOR_BOOKING__INT_DATE_DATE = IBOOKINGS___UPDATE_TIME_FOR_BOOKING__INT_DATE_DATE;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IUSER_ACCOUNT___CANCEL_BOOKING__INT = IBOOKINGS___CANCEL_BOOKING__INT;

	/**
	 * The operation id for the '<em>Get Payment For Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IUSER_ACCOUNT___GET_PAYMENT_FOR_BOOKING__INT = IBOOKINGS___GET_PAYMENT_FOR_BOOKING__INT;

	/**
	 * The operation id for the '<em>Send Comfimation Mail</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IUSER_ACCOUNT___SEND_COMFIMATION_MAIL__BOOKING = IBOOKINGS___SEND_COMFIMATION_MAIL__BOOKING;

	/**
	 * The operation id for the '<em>Is Email Available</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IUSER_ACCOUNT___IS_EMAIL_AVAILABLE__STRING = IBOOKINGS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IUSER_ACCOUNT___LOGIN__STRING_STRING = IBOOKINGS_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Update Customer CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IUSER_ACCOUNT___UPDATE_CUSTOMER_CC__INT_STRING_STRING_INT_INT_STRING_STRING = IBOOKINGS_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Update Customer Pwd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IUSER_ACCOUNT___UPDATE_CUSTOMER_PWD__INT_STRING_STRING = IBOOKINGS_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Update Customer Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IUSER_ACCOUNT___UPDATE_CUSTOMER_INFO__STRING_STRING = IBOOKINGS_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Register Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IUSER_ACCOUNT___REGISTER_CUSTOMER__STRING_STRING_DATE_INT = IBOOKINGS_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Customer Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IUSER_ACCOUNT___GET_CUSTOMER_INFO__INT = IBOOKINGS_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>IUser Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IUSER_ACCOUNT_OPERATION_COUNT = IBOOKINGS_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link CodePack.IStaffAdmin <em>IStaff Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodePack.IStaffAdmin
	 * @see CodePack.impl.CodePackPackageImpl#getIStaffAdmin()
	 * @generated
	 */
	int ISTAFF_ADMIN = 2;

	/**
	 * The number of structural features of the '<em>IStaff Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF_ADMIN_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Register Staff Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF_ADMIN___REGISTER_STAFF_ACCOUNT = 0;

	/**
	 * The operation id for the '<em>Update Staff Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF_ADMIN___UPDATE_STAFF_ACCOUNT = 1;

	/**
	 * The operation id for the '<em>Get Staff Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF_ADMIN___GET_STAFF_ACCOUNT = 2;

	/**
	 * The operation id for the '<em>Get All Staff Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF_ADMIN___GET_ALL_STAFF_ACCOUNTS = 3;

	/**
	 * The operation id for the '<em>Remove Staff Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF_ADMIN___REMOVE_STAFF_ACCOUNT = 4;

	/**
	 * The operation id for the '<em>Get Staff Roles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF_ADMIN___GET_STAFF_ROLES = 5;

	/**
	 * The operation id for the '<em>Add Staff Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF_ADMIN___ADD_STAFF_ROLE = 6;

	/**
	 * The operation id for the '<em>Update Staff Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF_ADMIN___UPDATE_STAFF_ROLE = 7;

	/**
	 * The operation id for the '<em>Remove Staff Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF_ADMIN___REMOVE_STAFF_ROLE = 8;

	/**
	 * The number of operations of the '<em>IStaff Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF_ADMIN_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link CodePack.IStaffAuthentication <em>IStaff Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodePack.IStaffAuthentication
	 * @see CodePack.impl.CodePackPackageImpl#getIStaffAuthentication()
	 * @generated
	 */
	int ISTAFF_AUTHENTICATION = 3;

	/**
	 * The number of structural features of the '<em>IStaff Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF_AUTHENTICATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF_AUTHENTICATION___LOGIN__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Get Role For Staff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF_AUTHENTICATION___GET_ROLE_FOR_STAFF__STRING = 1;

	/**
	 * The number of operations of the '<em>IStaff Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF_AUTHENTICATION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link CodePack.IManagement <em>IManagement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodePack.IManagement
	 * @see CodePack.impl.CodePackPackageImpl#getIManagement()
	 * @generated
	 */
	int IMANAGEMENT = 4;

	/**
	 * The number of structural features of the '<em>IManagement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGEMENT_FEATURE_COUNT = ISTAFF_AUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGEMENT___LOGIN__STRING_STRING = ISTAFF_AUTHENTICATION___LOGIN__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Role For Staff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGEMENT___GET_ROLE_FOR_STAFF__STRING = ISTAFF_AUTHENTICATION___GET_ROLE_FOR_STAFF__STRING;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGEMENT___ADD_ROOM__INT_STRING_BOOLEAN_STRING = ISTAFF_AUTHENTICATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Update Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGEMENT___UPDATE_ROOM__ROOM = ISTAFF_AUTHENTICATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGEMENT___REMOVE_ROOM__INT = ISTAFF_AUTHENTICATION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGEMENT___ADD_ROOM_TYPE__STRING_STRING_INT_DOUBLE = ISTAFF_AUTHENTICATION_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Update Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGEMENT___UPDATE_ROOM_TYPE__ROOMTYPE = ISTAFF_AUTHENTICATION_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Remove Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGEMENT___REMOVE_ROOM_TYPE__STRING = ISTAFF_AUTHENTICATION_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGEMENT___GET_ROOM__INT = ISTAFF_AUTHENTICATION_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get All Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGEMENT___GET_ALL_ROOMS = ISTAFF_AUTHENTICATION_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGEMENT___GET_ROOM_TYPES = ISTAFF_AUTHENTICATION_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>IManagement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGEMENT_OPERATION_COUNT = ISTAFF_AUTHENTICATION_OPERATION_COUNT + 9;

	/**
	 * The meta object id for the '{@link CodePack.ICheckIn <em>ICheck In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodePack.ICheckIn
	 * @see CodePack.impl.CodePackPackageImpl#getICheckIn()
	 * @generated
	 */
	int ICHECK_IN = 5;

	/**
	 * The number of structural features of the '<em>ICheck In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICHECK_IN_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Validate Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICHECK_IN___VALIDATE_BOOKING__INT = 0;

	/**
	 * The operation id for the '<em>Assign Guest To Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICHECK_IN___ASSIGN_GUEST_TO_BOOKING__INT_STRING = 1;

	/**
	 * The number of operations of the '<em>ICheck In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICHECK_IN_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link CodePack.IReceptionOperations_rename_required <em>IReception Operations rename required</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodePack.IReceptionOperations_rename_required
	 * @see CodePack.impl.CodePackPackageImpl#getIReceptionOperations_rename_required()
	 * @generated
	 */
	int IRECEPTION_OPERATIONS_RENAME_REQUIRED = 6;

	/**
	 * The number of structural features of the '<em>IReception Operations rename required</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTION_OPERATIONS_RENAME_REQUIRED_FEATURE_COUNT = IBOOKINGS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTION_OPERATIONS_RENAME_REQUIRED___CREATE_BOOKING__CONTACTDATA_PAYMENTDATA_ELIST_ELIST_INT_DATE_DATE = IBOOKINGS___CREATE_BOOKING__CONTACTDATA_PAYMENTDATA_ELIST_ELIST_INT_DATE_DATE;

	/**
	 * The operation id for the '<em>Create Booking For Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTION_OPERATIONS_RENAME_REQUIRED___CREATE_BOOKING_FOR_CUSTOMER__INT_ELIST_ELIST_INT_DATE_DATE = IBOOKINGS___CREATE_BOOKING_FOR_CUSTOMER__INT_ELIST_ELIST_INT_DATE_DATE;

	/**
	 * The operation id for the '<em>Update Room For Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTION_OPERATIONS_RENAME_REQUIRED___UPDATE_ROOM_FOR_BOOKING__INT_INT_INT = IBOOKINGS___UPDATE_ROOM_FOR_BOOKING__INT_INT_INT;

	/**
	 * The operation id for the '<em>Update Service For Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTION_OPERATIONS_RENAME_REQUIRED___UPDATE_SERVICE_FOR_BOOKING__INT_EXTRASERVICE = IBOOKINGS___UPDATE_SERVICE_FOR_BOOKING__INT_EXTRASERVICE;

	/**
	 * The operation id for the '<em>Get Available Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTION_OPERATIONS_RENAME_REQUIRED___GET_AVAILABLE_ROOMS__DATE_DATE = IBOOKINGS___GET_AVAILABLE_ROOMS__DATE_DATE;

	/**
	 * The operation id for the '<em>Get Available Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTION_OPERATIONS_RENAME_REQUIRED___GET_AVAILABLE_SERVICES = IBOOKINGS___GET_AVAILABLE_SERVICES;

	/**
	 * The operation id for the '<em>Is Room Available</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTION_OPERATIONS_RENAME_REQUIRED___IS_ROOM_AVAILABLE__INT_DATE_DATE = IBOOKINGS___IS_ROOM_AVAILABLE__INT_DATE_DATE;

	/**
	 * The operation id for the '<em>Get Bookings For Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTION_OPERATIONS_RENAME_REQUIRED___GET_BOOKINGS_FOR_CUSTOMER__INT = IBOOKINGS___GET_BOOKINGS_FOR_CUSTOMER__INT;

	/**
	 * The operation id for the '<em>Get Booking For Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTION_OPERATIONS_RENAME_REQUIRED___GET_BOOKING_FOR_ID__INT = IBOOKINGS___GET_BOOKING_FOR_ID__INT;

	/**
	 * The operation id for the '<em>Update Time For Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTION_OPERATIONS_RENAME_REQUIRED___UPDATE_TIME_FOR_BOOKING__INT_DATE_DATE = IBOOKINGS___UPDATE_TIME_FOR_BOOKING__INT_DATE_DATE;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTION_OPERATIONS_RENAME_REQUIRED___CANCEL_BOOKING__INT = IBOOKINGS___CANCEL_BOOKING__INT;

	/**
	 * The operation id for the '<em>Get Payment For Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTION_OPERATIONS_RENAME_REQUIRED___GET_PAYMENT_FOR_BOOKING__INT = IBOOKINGS___GET_PAYMENT_FOR_BOOKING__INT;

	/**
	 * The operation id for the '<em>Send Comfimation Mail</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTION_OPERATIONS_RENAME_REQUIRED___SEND_COMFIMATION_MAIL__BOOKING = IBOOKINGS___SEND_COMFIMATION_MAIL__BOOKING;

	/**
	 * The operation id for the '<em>Validate Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTION_OPERATIONS_RENAME_REQUIRED___VALIDATE_BOOKING__INT = IBOOKINGS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Assign Guest To Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTION_OPERATIONS_RENAME_REQUIRED___ASSIGN_GUEST_TO_BOOKING__INT_STRING = IBOOKINGS_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTION_OPERATIONS_RENAME_REQUIRED___LOGIN__STRING_STRING = IBOOKINGS_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Role For Staff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTION_OPERATIONS_RENAME_REQUIRED___GET_ROLE_FOR_STAFF__STRING = IBOOKINGS_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Generate Receipt For Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTION_OPERATIONS_RENAME_REQUIRED___GENERATE_RECEIPT_FOR_BOOKING__INT = IBOOKINGS_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Generate Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTION_OPERATIONS_RENAME_REQUIRED___GENERATE_BILL__INT = IBOOKINGS_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Checked In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTION_OPERATIONS_RENAME_REQUIRED___IS_CHECKED_IN__INT = IBOOKINGS_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>IReception Operations rename required</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTION_OPERATIONS_RENAME_REQUIRED_OPERATION_COUNT = IBOOKINGS_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link CodePack.impl.StaffGUIImpl <em>Staff GUI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodePack.impl.StaffGUIImpl
	 * @see CodePack.impl.CodePackPackageImpl#getStaffGUI()
	 * @generated
	 */
	int STAFF_GUI = 7;

	/**
	 * The feature id for the '<em><b>Management Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_GUI__MANAGEMENT_HANDLER = 0;

	/**
	 * The feature id for the '<em><b>Reception Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_GUI__RECEPTION_HANDLER = 1;

	/**
	 * The number of structural features of the '<em>Staff GUI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_GUI_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Staff GUI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_GUI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CodePack.impl.UserGUIImpl <em>User GUI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodePack.impl.UserGUIImpl
	 * @see CodePack.impl.CodePackPackageImpl#getUserGUI()
	 * @generated
	 */
	int USER_GUI = 8;

	/**
	 * The feature id for the '<em><b>Customer Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GUI__CUSTOMER_HANDLER = 0;

	/**
	 * The number of structural features of the '<em>User GUI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GUI_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>User GUI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GUI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CodePack.impl.CheckInMachineImpl <em>Check In Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodePack.impl.CheckInMachineImpl
	 * @see CodePack.impl.CodePackPackageImpl#getCheckInMachine()
	 * @generated
	 */
	int CHECK_IN_MACHINE = 9;

	/**
	 * The feature id for the '<em><b>Check In Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IN_MACHINE__CHECK_IN_HANDLER = 0;

	/**
	 * The number of structural features of the '<em>Check In Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IN_MACHINE_FEATURE_COUNT = 1;


	/**
	 * The number of operations of the '<em>Check In Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IN_MACHINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CodePack.impl.DataBankImpl <em>Data Bank</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodePack.impl.DataBankImpl
	 * @see CodePack.impl.CodePackPackageImpl#getDataBank()
	 * @generated
	 */
	int DATA_BANK = 10;

	/**
	 * The feature id for the '<em><b>Room List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BANK__ROOM_LIST = 0;

	/**
	 * The feature id for the '<em><b>Booking List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BANK__BOOKING_LIST = 1;

	/**
	 * The feature id for the '<em><b>Customer List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BANK__CUSTOMER_LIST = 2;

	/**
	 * The feature id for the '<em><b>Room Type List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BANK__ROOM_TYPE_LIST = 3;

	/**
	 * The feature id for the '<em><b>Payment Data List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BANK__PAYMENT_DATA_LIST = 4;

	/**
	 * The feature id for the '<em><b>Room Booked List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BANK__ROOM_BOOKED_LIST = 5;

	/**
	 * The feature id for the '<em><b>Extra Service List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BANK__EXTRA_SERVICE_LIST = 6;

	/**
	 * The feature id for the '<em><b>Service Type List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BANK__SERVICE_TYPE_LIST = 7;

	/**
	 * The feature id for the '<em><b>Guest List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BANK__GUEST_LIST = 8;

	/**
	 * The feature id for the '<em><b>Staff Role List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BANK__STAFF_ROLE_LIST = 9;

	/**
	 * The feature id for the '<em><b>Staff Member List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BANK__STAFF_MEMBER_LIST = 10;

	/**
	 * The number of structural features of the '<em>Data Bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BANK_FEATURE_COUNT = 11;


	/**
	 * The number of operations of the '<em>Data Bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BANK_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link CodePack.IUserAccount <em>IUser Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IUser Account</em>'.
	 * @see CodePack.IUserAccount
	 * @generated
	 */
	EClass getIUserAccount();

	/**
	 * Returns the meta object for the '{@link CodePack.IUserAccount#isEmailAvailable(java.lang.String) <em>Is Email Available</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Email Available</em>' operation.
	 * @see CodePack.IUserAccount#isEmailAvailable(java.lang.String)
	 * @generated
	 */
	EOperation getIUserAccount__IsEmailAvailable__String();

	/**
	 * Returns the meta object for the '{@link CodePack.IUserAccount#login(java.lang.String, java.lang.String) <em>Login</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Login</em>' operation.
	 * @see CodePack.IUserAccount#login(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIUserAccount__Login__String_String();

	/**
	 * Returns the meta object for the '{@link CodePack.IUserAccount#updateCustomerCC(int, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Update Customer CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Customer CC</em>' operation.
	 * @see CodePack.IUserAccount#updateCustomerCC(int, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIUserAccount__UpdateCustomerCC__int_String_String_int_int_String_String();

	/**
	 * Returns the meta object for the '{@link CodePack.IUserAccount#updateCustomerPwd(int, java.lang.String, java.lang.String) <em>Update Customer Pwd</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Customer Pwd</em>' operation.
	 * @see CodePack.IUserAccount#updateCustomerPwd(int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIUserAccount__UpdateCustomerPwd__int_String_String();

	/**
	 * Returns the meta object for the '{@link CodePack.IUserAccount#updateCustomerInfo(java.lang.String, java.lang.String) <em>Update Customer Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Customer Info</em>' operation.
	 * @see CodePack.IUserAccount#updateCustomerInfo(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIUserAccount__UpdateCustomerInfo__String_String();

	/**
	 * Returns the meta object for the '{@link CodePack.IUserAccount#registerCustomer(java.lang.String, java.lang.String, java.util.Date, int) <em>Register Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Customer</em>' operation.
	 * @see CodePack.IUserAccount#registerCustomer(java.lang.String, java.lang.String, java.util.Date, int)
	 * @generated
	 */
	EOperation getIUserAccount__RegisterCustomer__String_String_Date_int();

	/**
	 * Returns the meta object for the '{@link CodePack.IUserAccount#getCustomerInfo(int) <em>Get Customer Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Customer Info</em>' operation.
	 * @see CodePack.IUserAccount#getCustomerInfo(int)
	 * @generated
	 */
	EOperation getIUserAccount__GetCustomerInfo__int();

	/**
	 * Returns the meta object for class '{@link CodePack.IBookings <em>IBookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBookings</em>'.
	 * @see CodePack.IBookings
	 * @generated
	 */
	EClass getIBookings();

	/**
	 * Returns the meta object for the '{@link CodePack.IBookings#createBooking(CodePack.Shared.ContactData, CodePack.DataModels.PaymentData, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, int, java.util.Date, java.util.Date) <em>Create Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Booking</em>' operation.
	 * @see CodePack.IBookings#createBooking(CodePack.Shared.ContactData, CodePack.DataModels.PaymentData, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, int, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getIBookings__CreateBooking__ContactData_PaymentData_EList_EList_int_Date_Date();

	/**
	 * Returns the meta object for the '{@link CodePack.IBookings#createBookingForCustomer(int, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, int, java.util.Date, java.util.Date) <em>Create Booking For Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Booking For Customer</em>' operation.
	 * @see CodePack.IBookings#createBookingForCustomer(int, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, int, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getIBookings__CreateBookingForCustomer__int_EList_EList_int_Date_Date();

	/**
	 * Returns the meta object for the '{@link CodePack.IBookings#updateRoomForBooking(int, int, int) <em>Update Room For Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Room For Booking</em>' operation.
	 * @see CodePack.IBookings#updateRoomForBooking(int, int, int)
	 * @generated
	 */
	EOperation getIBookings__UpdateRoomForBooking__int_int_int();

	/**
	 * Returns the meta object for the '{@link CodePack.IBookings#updateServiceForBooking(int, CodePack.DataModels.ExtraService) <em>Update Service For Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Service For Booking</em>' operation.
	 * @see CodePack.IBookings#updateServiceForBooking(int, CodePack.DataModels.ExtraService)
	 * @generated
	 */
	EOperation getIBookings__UpdateServiceForBooking__int_ExtraService();

	/**
	 * Returns the meta object for the '{@link CodePack.IBookings#getAvailableRooms(java.util.Date, java.util.Date) <em>Get Available Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Available Rooms</em>' operation.
	 * @see CodePack.IBookings#getAvailableRooms(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getIBookings__GetAvailableRooms__Date_Date();

	/**
	 * Returns the meta object for the '{@link CodePack.IBookings#getAvailableServices() <em>Get Available Services</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Available Services</em>' operation.
	 * @see CodePack.IBookings#getAvailableServices()
	 * @generated
	 */
	EOperation getIBookings__GetAvailableServices();

	/**
	 * Returns the meta object for the '{@link CodePack.IBookings#isRoomAvailable(int, java.util.Date, java.util.Date) <em>Is Room Available</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Room Available</em>' operation.
	 * @see CodePack.IBookings#isRoomAvailable(int, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getIBookings__IsRoomAvailable__int_Date_Date();

	/**
	 * Returns the meta object for the '{@link CodePack.IBookings#getBookingsForCustomer(int) <em>Get Bookings For Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bookings For Customer</em>' operation.
	 * @see CodePack.IBookings#getBookingsForCustomer(int)
	 * @generated
	 */
	EOperation getIBookings__GetBookingsForCustomer__int();

	/**
	 * Returns the meta object for the '{@link CodePack.IBookings#getBookingForId(int) <em>Get Booking For Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking For Id</em>' operation.
	 * @see CodePack.IBookings#getBookingForId(int)
	 * @generated
	 */
	EOperation getIBookings__GetBookingForId__int();

	/**
	 * Returns the meta object for the '{@link CodePack.IBookings#updateTimeForBooking(int, java.util.Date, java.util.Date) <em>Update Time For Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Time For Booking</em>' operation.
	 * @see CodePack.IBookings#updateTimeForBooking(int, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getIBookings__UpdateTimeForBooking__int_Date_Date();

	/**
	 * Returns the meta object for the '{@link CodePack.IBookings#cancelBooking(int) <em>Cancel Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Booking</em>' operation.
	 * @see CodePack.IBookings#cancelBooking(int)
	 * @generated
	 */
	EOperation getIBookings__CancelBooking__int();

	/**
	 * Returns the meta object for the '{@link CodePack.IBookings#getPaymentForBooking(int) <em>Get Payment For Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Payment For Booking</em>' operation.
	 * @see CodePack.IBookings#getPaymentForBooking(int)
	 * @generated
	 */
	EOperation getIBookings__GetPaymentForBooking__int();

	/**
	 * Returns the meta object for the '{@link CodePack.IBookings#sendComfimationMail(CodePack.DataModels.Booking) <em>Send Comfimation Mail</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Comfimation Mail</em>' operation.
	 * @see CodePack.IBookings#sendComfimationMail(CodePack.DataModels.Booking)
	 * @generated
	 */
	EOperation getIBookings__SendComfimationMail__Booking();

	/**
	 * Returns the meta object for class '{@link CodePack.IStaffAdmin <em>IStaff Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IStaff Admin</em>'.
	 * @see CodePack.IStaffAdmin
	 * @generated
	 */
	EClass getIStaffAdmin();

	/**
	 * Returns the meta object for the '{@link CodePack.IStaffAdmin#registerStaffAccount() <em>Register Staff Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Staff Account</em>' operation.
	 * @see CodePack.IStaffAdmin#registerStaffAccount()
	 * @generated
	 */
	EOperation getIStaffAdmin__RegisterStaffAccount();

	/**
	 * Returns the meta object for the '{@link CodePack.IStaffAdmin#updateStaffAccount() <em>Update Staff Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Staff Account</em>' operation.
	 * @see CodePack.IStaffAdmin#updateStaffAccount()
	 * @generated
	 */
	EOperation getIStaffAdmin__UpdateStaffAccount();

	/**
	 * Returns the meta object for the '{@link CodePack.IStaffAdmin#getStaffAccount() <em>Get Staff Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Staff Account</em>' operation.
	 * @see CodePack.IStaffAdmin#getStaffAccount()
	 * @generated
	 */
	EOperation getIStaffAdmin__GetStaffAccount();

	/**
	 * Returns the meta object for the '{@link CodePack.IStaffAdmin#getAllStaffAccounts() <em>Get All Staff Accounts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Staff Accounts</em>' operation.
	 * @see CodePack.IStaffAdmin#getAllStaffAccounts()
	 * @generated
	 */
	EOperation getIStaffAdmin__GetAllStaffAccounts();

	/**
	 * Returns the meta object for the '{@link CodePack.IStaffAdmin#removeStaffAccount() <em>Remove Staff Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Staff Account</em>' operation.
	 * @see CodePack.IStaffAdmin#removeStaffAccount()
	 * @generated
	 */
	EOperation getIStaffAdmin__RemoveStaffAccount();

	/**
	 * Returns the meta object for the '{@link CodePack.IStaffAdmin#getStaffRoles() <em>Get Staff Roles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Staff Roles</em>' operation.
	 * @see CodePack.IStaffAdmin#getStaffRoles()
	 * @generated
	 */
	EOperation getIStaffAdmin__GetStaffRoles();

	/**
	 * Returns the meta object for the '{@link CodePack.IStaffAdmin#addStaffRole() <em>Add Staff Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Staff Role</em>' operation.
	 * @see CodePack.IStaffAdmin#addStaffRole()
	 * @generated
	 */
	EOperation getIStaffAdmin__AddStaffRole();

	/**
	 * Returns the meta object for the '{@link CodePack.IStaffAdmin#updateStaffRole() <em>Update Staff Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Staff Role</em>' operation.
	 * @see CodePack.IStaffAdmin#updateStaffRole()
	 * @generated
	 */
	EOperation getIStaffAdmin__UpdateStaffRole();

	/**
	 * Returns the meta object for the '{@link CodePack.IStaffAdmin#removeStaffRole() <em>Remove Staff Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Staff Role</em>' operation.
	 * @see CodePack.IStaffAdmin#removeStaffRole()
	 * @generated
	 */
	EOperation getIStaffAdmin__RemoveStaffRole();

	/**
	 * Returns the meta object for class '{@link CodePack.IStaffAuthentication <em>IStaff Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IStaff Authentication</em>'.
	 * @see CodePack.IStaffAuthentication
	 * @generated
	 */
	EClass getIStaffAuthentication();

	/**
	 * Returns the meta object for the '{@link CodePack.IStaffAuthentication#login(java.lang.String, java.lang.String) <em>Login</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Login</em>' operation.
	 * @see CodePack.IStaffAuthentication#login(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIStaffAuthentication__Login__String_String();

	/**
	 * Returns the meta object for the '{@link CodePack.IStaffAuthentication#getRoleForStaff(java.lang.String) <em>Get Role For Staff</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Role For Staff</em>' operation.
	 * @see CodePack.IStaffAuthentication#getRoleForStaff(java.lang.String)
	 * @generated
	 */
	EOperation getIStaffAuthentication__GetRoleForStaff__String();

	/**
	 * Returns the meta object for class '{@link CodePack.IManagement <em>IManagement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IManagement</em>'.
	 * @see CodePack.IManagement
	 * @generated
	 */
	EClass getIManagement();

	/**
	 * Returns the meta object for the '{@link CodePack.IManagement#addRoom(int, java.lang.String, boolean, java.lang.String) <em>Add Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room</em>' operation.
	 * @see CodePack.IManagement#addRoom(int, java.lang.String, boolean, java.lang.String)
	 * @generated
	 */
	EOperation getIManagement__AddRoom__int_String_boolean_String();

	/**
	 * Returns the meta object for the '{@link CodePack.IManagement#updateRoom(CodePack.DataModels.Room) <em>Update Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Room</em>' operation.
	 * @see CodePack.IManagement#updateRoom(CodePack.DataModels.Room)
	 * @generated
	 */
	EOperation getIManagement__UpdateRoom__Room();

	/**
	 * Returns the meta object for the '{@link CodePack.IManagement#removeRoom(int) <em>Remove Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room</em>' operation.
	 * @see CodePack.IManagement#removeRoom(int)
	 * @generated
	 */
	EOperation getIManagement__RemoveRoom__int();

	/**
	 * Returns the meta object for the '{@link CodePack.IManagement#addRoomType(java.lang.String, java.lang.String, int, double) <em>Add Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room Type</em>' operation.
	 * @see CodePack.IManagement#addRoomType(java.lang.String, java.lang.String, int, double)
	 * @generated
	 */
	EOperation getIManagement__AddRoomType__String_String_int_double();

	/**
	 * Returns the meta object for the '{@link CodePack.IManagement#updateRoomType(CodePack.DataModels.RoomType) <em>Update Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Room Type</em>' operation.
	 * @see CodePack.IManagement#updateRoomType(CodePack.DataModels.RoomType)
	 * @generated
	 */
	EOperation getIManagement__UpdateRoomType__RoomType();

	/**
	 * Returns the meta object for the '{@link CodePack.IManagement#removeRoomType(java.lang.String) <em>Remove Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room Type</em>' operation.
	 * @see CodePack.IManagement#removeRoomType(java.lang.String)
	 * @generated
	 */
	EOperation getIManagement__RemoveRoomType__String();

	/**
	 * Returns the meta object for the '{@link CodePack.IManagement#getRoom(int) <em>Get Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room</em>' operation.
	 * @see CodePack.IManagement#getRoom(int)
	 * @generated
	 */
	EOperation getIManagement__GetRoom__int();

	/**
	 * Returns the meta object for the '{@link CodePack.IManagement#getAllRooms() <em>Get All Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Rooms</em>' operation.
	 * @see CodePack.IManagement#getAllRooms()
	 * @generated
	 */
	EOperation getIManagement__GetAllRooms();

	/**
	 * Returns the meta object for the '{@link CodePack.IManagement#getRoomTypes() <em>Get Room Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Types</em>' operation.
	 * @see CodePack.IManagement#getRoomTypes()
	 * @generated
	 */
	EOperation getIManagement__GetRoomTypes();

	/**
	 * Returns the meta object for class '{@link CodePack.ICheckIn <em>ICheck In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ICheck In</em>'.
	 * @see CodePack.ICheckIn
	 * @generated
	 */
	EClass getICheckIn();

	/**
	 * Returns the meta object for the '{@link CodePack.ICheckIn#validateBooking(int) <em>Validate Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Booking</em>' operation.
	 * @see CodePack.ICheckIn#validateBooking(int)
	 * @generated
	 */
	EOperation getICheckIn__ValidateBooking__int();

	/**
	 * Returns the meta object for the '{@link CodePack.ICheckIn#assignGuestToBooking(int, java.lang.String) <em>Assign Guest To Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Assign Guest To Booking</em>' operation.
	 * @see CodePack.ICheckIn#assignGuestToBooking(int, java.lang.String)
	 * @generated
	 */
	EOperation getICheckIn__AssignGuestToBooking__int_String();

	/**
	 * Returns the meta object for class '{@link CodePack.IReceptionOperations_rename_required <em>IReception Operations rename required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IReception Operations rename required</em>'.
	 * @see CodePack.IReceptionOperations_rename_required
	 * @generated
	 */
	EClass getIReceptionOperations_rename_required();

	/**
	 * Returns the meta object for the '{@link CodePack.IReceptionOperations_rename_required#isCheckedIn(int) <em>Is Checked In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Checked In</em>' operation.
	 * @see CodePack.IReceptionOperations_rename_required#isCheckedIn(int)
	 * @generated
	 */
	EOperation getIReceptionOperations_rename_required__IsCheckedIn__int();

	/**
	 * Returns the meta object for the '{@link CodePack.IReceptionOperations_rename_required#generateReceiptForBooking(int) <em>Generate Receipt For Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Receipt For Booking</em>' operation.
	 * @see CodePack.IReceptionOperations_rename_required#generateReceiptForBooking(int)
	 * @generated
	 */
	EOperation getIReceptionOperations_rename_required__GenerateReceiptForBooking__int();

	/**
	 * Returns the meta object for the '{@link CodePack.IReceptionOperations_rename_required#generateBill(int) <em>Generate Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Bill</em>' operation.
	 * @see CodePack.IReceptionOperations_rename_required#generateBill(int)
	 * @generated
	 */
	EOperation getIReceptionOperations_rename_required__GenerateBill__int();

	/**
	 * Returns the meta object for class '{@link CodePack.StaffGUI <em>Staff GUI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff GUI</em>'.
	 * @see CodePack.StaffGUI
	 * @generated
	 */
	EClass getStaffGUI();

	/**
	 * Returns the meta object for the reference '{@link CodePack.StaffGUI#getManagementHandler <em>Management Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Management Handler</em>'.
	 * @see CodePack.StaffGUI#getManagementHandler()
	 * @see #getStaffGUI()
	 * @generated
	 */
	EReference getStaffGUI_ManagementHandler();

	/**
	 * Returns the meta object for the reference '{@link CodePack.StaffGUI#getReceptionHandler <em>Reception Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reception Handler</em>'.
	 * @see CodePack.StaffGUI#getReceptionHandler()
	 * @see #getStaffGUI()
	 * @generated
	 */
	EReference getStaffGUI_ReceptionHandler();

	/**
	 * Returns the meta object for class '{@link CodePack.UserGUI <em>User GUI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User GUI</em>'.
	 * @see CodePack.UserGUI
	 * @generated
	 */
	EClass getUserGUI();

	/**
	 * Returns the meta object for the reference '{@link CodePack.UserGUI#getCustomerHandler <em>Customer Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer Handler</em>'.
	 * @see CodePack.UserGUI#getCustomerHandler()
	 * @see #getUserGUI()
	 * @generated
	 */
	EReference getUserGUI_CustomerHandler();

	/**
	 * Returns the meta object for class '{@link CodePack.CheckInMachine <em>Check In Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check In Machine</em>'.
	 * @see CodePack.CheckInMachine
	 * @generated
	 */
	EClass getCheckInMachine();

	/**
	 * Returns the meta object for the reference '{@link CodePack.CheckInMachine#getCheckInHandler <em>Check In Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Check In Handler</em>'.
	 * @see CodePack.CheckInMachine#getCheckInHandler()
	 * @see #getCheckInMachine()
	 * @generated
	 */
	EReference getCheckInMachine_CheckInHandler();

	/**
	 * Returns the meta object for class '{@link CodePack.DataBank <em>Data Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Bank</em>'.
	 * @see CodePack.DataBank
	 * @generated
	 */
	EClass getDataBank();

	/**
	 * Returns the meta object for the reference list '{@link CodePack.DataBank#getRoomList <em>Room List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room List</em>'.
	 * @see CodePack.DataBank#getRoomList()
	 * @see #getDataBank()
	 * @generated
	 */
	EReference getDataBank_RoomList();

	/**
	 * Returns the meta object for the reference list '{@link CodePack.DataBank#getBookingList <em>Booking List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Booking List</em>'.
	 * @see CodePack.DataBank#getBookingList()
	 * @see #getDataBank()
	 * @generated
	 */
	EReference getDataBank_BookingList();

	/**
	 * Returns the meta object for the reference list '{@link CodePack.DataBank#getCustomerList <em>Customer List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customer List</em>'.
	 * @see CodePack.DataBank#getCustomerList()
	 * @see #getDataBank()
	 * @generated
	 */
	EReference getDataBank_CustomerList();

	/**
	 * Returns the meta object for the reference list '{@link CodePack.DataBank#getRoomTypeList <em>Room Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room Type List</em>'.
	 * @see CodePack.DataBank#getRoomTypeList()
	 * @see #getDataBank()
	 * @generated
	 */
	EReference getDataBank_RoomTypeList();

	/**
	 * Returns the meta object for the reference list '{@link CodePack.DataBank#getPaymentDataList <em>Payment Data List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Payment Data List</em>'.
	 * @see CodePack.DataBank#getPaymentDataList()
	 * @see #getDataBank()
	 * @generated
	 */
	EReference getDataBank_PaymentDataList();

	/**
	 * Returns the meta object for the reference list '{@link CodePack.DataBank#getRoomBookedList <em>Room Booked List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room Booked List</em>'.
	 * @see CodePack.DataBank#getRoomBookedList()
	 * @see #getDataBank()
	 * @generated
	 */
	EReference getDataBank_RoomBookedList();

	/**
	 * Returns the meta object for the reference list '{@link CodePack.DataBank#getExtraServiceList <em>Extra Service List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extra Service List</em>'.
	 * @see CodePack.DataBank#getExtraServiceList()
	 * @see #getDataBank()
	 * @generated
	 */
	EReference getDataBank_ExtraServiceList();

	/**
	 * Returns the meta object for the reference list '{@link CodePack.DataBank#getServiceTypeList <em>Service Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Type List</em>'.
	 * @see CodePack.DataBank#getServiceTypeList()
	 * @see #getDataBank()
	 * @generated
	 */
	EReference getDataBank_ServiceTypeList();

	/**
	 * Returns the meta object for the reference list '{@link CodePack.DataBank#getGuestList <em>Guest List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Guest List</em>'.
	 * @see CodePack.DataBank#getGuestList()
	 * @see #getDataBank()
	 * @generated
	 */
	EReference getDataBank_GuestList();

	/**
	 * Returns the meta object for the reference list '{@link CodePack.DataBank#getStaffRoleList <em>Staff Role List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Staff Role List</em>'.
	 * @see CodePack.DataBank#getStaffRoleList()
	 * @see #getDataBank()
	 * @generated
	 */
	EReference getDataBank_StaffRoleList();

	/**
	 * Returns the meta object for the reference list '{@link CodePack.DataBank#getStaffMemberList <em>Staff Member List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Staff Member List</em>'.
	 * @see CodePack.DataBank#getStaffMemberList()
	 * @see #getDataBank()
	 * @generated
	 */
	EReference getDataBank_StaffMemberList();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CodePackFactory getCodePackFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CodePack.IUserAccount <em>IUser Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodePack.IUserAccount
		 * @see CodePack.impl.CodePackPackageImpl#getIUserAccount()
		 * @generated
		 */
		EClass IUSER_ACCOUNT = eINSTANCE.getIUserAccount();

		/**
		 * The meta object literal for the '<em><b>Is Email Available</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IUSER_ACCOUNT___IS_EMAIL_AVAILABLE__STRING = eINSTANCE.getIUserAccount__IsEmailAvailable__String();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IUSER_ACCOUNT___LOGIN__STRING_STRING = eINSTANCE.getIUserAccount__Login__String_String();

		/**
		 * The meta object literal for the '<em><b>Update Customer CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IUSER_ACCOUNT___UPDATE_CUSTOMER_CC__INT_STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getIUserAccount__UpdateCustomerCC__int_String_String_int_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Update Customer Pwd</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IUSER_ACCOUNT___UPDATE_CUSTOMER_PWD__INT_STRING_STRING = eINSTANCE.getIUserAccount__UpdateCustomerPwd__int_String_String();

		/**
		 * The meta object literal for the '<em><b>Update Customer Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IUSER_ACCOUNT___UPDATE_CUSTOMER_INFO__STRING_STRING = eINSTANCE.getIUserAccount__UpdateCustomerInfo__String_String();

		/**
		 * The meta object literal for the '<em><b>Register Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IUSER_ACCOUNT___REGISTER_CUSTOMER__STRING_STRING_DATE_INT = eINSTANCE.getIUserAccount__RegisterCustomer__String_String_Date_int();

		/**
		 * The meta object literal for the '<em><b>Get Customer Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IUSER_ACCOUNT___GET_CUSTOMER_INFO__INT = eINSTANCE.getIUserAccount__GetCustomerInfo__int();

		/**
		 * The meta object literal for the '{@link CodePack.IBookings <em>IBookings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodePack.IBookings
		 * @see CodePack.impl.CodePackPackageImpl#getIBookings()
		 * @generated
		 */
		EClass IBOOKINGS = eINSTANCE.getIBookings();

		/**
		 * The meta object literal for the '<em><b>Create Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___CREATE_BOOKING__CONTACTDATA_PAYMENTDATA_ELIST_ELIST_INT_DATE_DATE = eINSTANCE.getIBookings__CreateBooking__ContactData_PaymentData_EList_EList_int_Date_Date();

		/**
		 * The meta object literal for the '<em><b>Create Booking For Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___CREATE_BOOKING_FOR_CUSTOMER__INT_ELIST_ELIST_INT_DATE_DATE = eINSTANCE.getIBookings__CreateBookingForCustomer__int_EList_EList_int_Date_Date();

		/**
		 * The meta object literal for the '<em><b>Update Room For Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___UPDATE_ROOM_FOR_BOOKING__INT_INT_INT = eINSTANCE.getIBookings__UpdateRoomForBooking__int_int_int();

		/**
		 * The meta object literal for the '<em><b>Update Service For Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___UPDATE_SERVICE_FOR_BOOKING__INT_EXTRASERVICE = eINSTANCE.getIBookings__UpdateServiceForBooking__int_ExtraService();

		/**
		 * The meta object literal for the '<em><b>Get Available Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___GET_AVAILABLE_ROOMS__DATE_DATE = eINSTANCE.getIBookings__GetAvailableRooms__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Get Available Services</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___GET_AVAILABLE_SERVICES = eINSTANCE.getIBookings__GetAvailableServices();

		/**
		 * The meta object literal for the '<em><b>Is Room Available</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___IS_ROOM_AVAILABLE__INT_DATE_DATE = eINSTANCE.getIBookings__IsRoomAvailable__int_Date_Date();

		/**
		 * The meta object literal for the '<em><b>Get Bookings For Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___GET_BOOKINGS_FOR_CUSTOMER__INT = eINSTANCE.getIBookings__GetBookingsForCustomer__int();

		/**
		 * The meta object literal for the '<em><b>Get Booking For Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___GET_BOOKING_FOR_ID__INT = eINSTANCE.getIBookings__GetBookingForId__int();

		/**
		 * The meta object literal for the '<em><b>Update Time For Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___UPDATE_TIME_FOR_BOOKING__INT_DATE_DATE = eINSTANCE.getIBookings__UpdateTimeForBooking__int_Date_Date();

		/**
		 * The meta object literal for the '<em><b>Cancel Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___CANCEL_BOOKING__INT = eINSTANCE.getIBookings__CancelBooking__int();

		/**
		 * The meta object literal for the '<em><b>Get Payment For Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___GET_PAYMENT_FOR_BOOKING__INT = eINSTANCE.getIBookings__GetPaymentForBooking__int();

		/**
		 * The meta object literal for the '<em><b>Send Comfimation Mail</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___SEND_COMFIMATION_MAIL__BOOKING = eINSTANCE.getIBookings__SendComfimationMail__Booking();

		/**
		 * The meta object literal for the '{@link CodePack.IStaffAdmin <em>IStaff Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodePack.IStaffAdmin
		 * @see CodePack.impl.CodePackPackageImpl#getIStaffAdmin()
		 * @generated
		 */
		EClass ISTAFF_ADMIN = eINSTANCE.getIStaffAdmin();

		/**
		 * The meta object literal for the '<em><b>Register Staff Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF_ADMIN___REGISTER_STAFF_ACCOUNT = eINSTANCE.getIStaffAdmin__RegisterStaffAccount();

		/**
		 * The meta object literal for the '<em><b>Update Staff Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF_ADMIN___UPDATE_STAFF_ACCOUNT = eINSTANCE.getIStaffAdmin__UpdateStaffAccount();

		/**
		 * The meta object literal for the '<em><b>Get Staff Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF_ADMIN___GET_STAFF_ACCOUNT = eINSTANCE.getIStaffAdmin__GetStaffAccount();

		/**
		 * The meta object literal for the '<em><b>Get All Staff Accounts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF_ADMIN___GET_ALL_STAFF_ACCOUNTS = eINSTANCE.getIStaffAdmin__GetAllStaffAccounts();

		/**
		 * The meta object literal for the '<em><b>Remove Staff Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF_ADMIN___REMOVE_STAFF_ACCOUNT = eINSTANCE.getIStaffAdmin__RemoveStaffAccount();

		/**
		 * The meta object literal for the '<em><b>Get Staff Roles</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF_ADMIN___GET_STAFF_ROLES = eINSTANCE.getIStaffAdmin__GetStaffRoles();

		/**
		 * The meta object literal for the '<em><b>Add Staff Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF_ADMIN___ADD_STAFF_ROLE = eINSTANCE.getIStaffAdmin__AddStaffRole();

		/**
		 * The meta object literal for the '<em><b>Update Staff Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF_ADMIN___UPDATE_STAFF_ROLE = eINSTANCE.getIStaffAdmin__UpdateStaffRole();

		/**
		 * The meta object literal for the '<em><b>Remove Staff Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF_ADMIN___REMOVE_STAFF_ROLE = eINSTANCE.getIStaffAdmin__RemoveStaffRole();

		/**
		 * The meta object literal for the '{@link CodePack.IStaffAuthentication <em>IStaff Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodePack.IStaffAuthentication
		 * @see CodePack.impl.CodePackPackageImpl#getIStaffAuthentication()
		 * @generated
		 */
		EClass ISTAFF_AUTHENTICATION = eINSTANCE.getIStaffAuthentication();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF_AUTHENTICATION___LOGIN__STRING_STRING = eINSTANCE.getIStaffAuthentication__Login__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Role For Staff</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF_AUTHENTICATION___GET_ROLE_FOR_STAFF__STRING = eINSTANCE.getIStaffAuthentication__GetRoleForStaff__String();

		/**
		 * The meta object literal for the '{@link CodePack.IManagement <em>IManagement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodePack.IManagement
		 * @see CodePack.impl.CodePackPackageImpl#getIManagement()
		 * @generated
		 */
		EClass IMANAGEMENT = eINSTANCE.getIManagement();

		/**
		 * The meta object literal for the '<em><b>Add Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMANAGEMENT___ADD_ROOM__INT_STRING_BOOLEAN_STRING = eINSTANCE.getIManagement__AddRoom__int_String_boolean_String();

		/**
		 * The meta object literal for the '<em><b>Update Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMANAGEMENT___UPDATE_ROOM__ROOM = eINSTANCE.getIManagement__UpdateRoom__Room();

		/**
		 * The meta object literal for the '<em><b>Remove Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMANAGEMENT___REMOVE_ROOM__INT = eINSTANCE.getIManagement__RemoveRoom__int();

		/**
		 * The meta object literal for the '<em><b>Add Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMANAGEMENT___ADD_ROOM_TYPE__STRING_STRING_INT_DOUBLE = eINSTANCE.getIManagement__AddRoomType__String_String_int_double();

		/**
		 * The meta object literal for the '<em><b>Update Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMANAGEMENT___UPDATE_ROOM_TYPE__ROOMTYPE = eINSTANCE.getIManagement__UpdateRoomType__RoomType();

		/**
		 * The meta object literal for the '<em><b>Remove Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMANAGEMENT___REMOVE_ROOM_TYPE__STRING = eINSTANCE.getIManagement__RemoveRoomType__String();

		/**
		 * The meta object literal for the '<em><b>Get Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMANAGEMENT___GET_ROOM__INT = eINSTANCE.getIManagement__GetRoom__int();

		/**
		 * The meta object literal for the '<em><b>Get All Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMANAGEMENT___GET_ALL_ROOMS = eINSTANCE.getIManagement__GetAllRooms();

		/**
		 * The meta object literal for the '<em><b>Get Room Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMANAGEMENT___GET_ROOM_TYPES = eINSTANCE.getIManagement__GetRoomTypes();

		/**
		 * The meta object literal for the '{@link CodePack.ICheckIn <em>ICheck In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodePack.ICheckIn
		 * @see CodePack.impl.CodePackPackageImpl#getICheckIn()
		 * @generated
		 */
		EClass ICHECK_IN = eINSTANCE.getICheckIn();

		/**
		 * The meta object literal for the '<em><b>Validate Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICHECK_IN___VALIDATE_BOOKING__INT = eINSTANCE.getICheckIn__ValidateBooking__int();

		/**
		 * The meta object literal for the '<em><b>Assign Guest To Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICHECK_IN___ASSIGN_GUEST_TO_BOOKING__INT_STRING = eINSTANCE.getICheckIn__AssignGuestToBooking__int_String();

		/**
		 * The meta object literal for the '{@link CodePack.IReceptionOperations_rename_required <em>IReception Operations rename required</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodePack.IReceptionOperations_rename_required
		 * @see CodePack.impl.CodePackPackageImpl#getIReceptionOperations_rename_required()
		 * @generated
		 */
		EClass IRECEPTION_OPERATIONS_RENAME_REQUIRED = eINSTANCE.getIReceptionOperations_rename_required();

		/**
		 * The meta object literal for the '<em><b>Is Checked In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRECEPTION_OPERATIONS_RENAME_REQUIRED___IS_CHECKED_IN__INT = eINSTANCE.getIReceptionOperations_rename_required__IsCheckedIn__int();

		/**
		 * The meta object literal for the '<em><b>Generate Receipt For Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRECEPTION_OPERATIONS_RENAME_REQUIRED___GENERATE_RECEIPT_FOR_BOOKING__INT = eINSTANCE.getIReceptionOperations_rename_required__GenerateReceiptForBooking__int();

		/**
		 * The meta object literal for the '<em><b>Generate Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRECEPTION_OPERATIONS_RENAME_REQUIRED___GENERATE_BILL__INT = eINSTANCE.getIReceptionOperations_rename_required__GenerateBill__int();

		/**
		 * The meta object literal for the '{@link CodePack.impl.StaffGUIImpl <em>Staff GUI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodePack.impl.StaffGUIImpl
		 * @see CodePack.impl.CodePackPackageImpl#getStaffGUI()
		 * @generated
		 */
		EClass STAFF_GUI = eINSTANCE.getStaffGUI();

		/**
		 * The meta object literal for the '<em><b>Management Handler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF_GUI__MANAGEMENT_HANDLER = eINSTANCE.getStaffGUI_ManagementHandler();

		/**
		 * The meta object literal for the '<em><b>Reception Handler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF_GUI__RECEPTION_HANDLER = eINSTANCE.getStaffGUI_ReceptionHandler();

		/**
		 * The meta object literal for the '{@link CodePack.impl.UserGUIImpl <em>User GUI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodePack.impl.UserGUIImpl
		 * @see CodePack.impl.CodePackPackageImpl#getUserGUI()
		 * @generated
		 */
		EClass USER_GUI = eINSTANCE.getUserGUI();

		/**
		 * The meta object literal for the '<em><b>Customer Handler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_GUI__CUSTOMER_HANDLER = eINSTANCE.getUserGUI_CustomerHandler();

		/**
		 * The meta object literal for the '{@link CodePack.impl.CheckInMachineImpl <em>Check In Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodePack.impl.CheckInMachineImpl
		 * @see CodePack.impl.CodePackPackageImpl#getCheckInMachine()
		 * @generated
		 */
		EClass CHECK_IN_MACHINE = eINSTANCE.getCheckInMachine();

		/**
		 * The meta object literal for the '<em><b>Check In Handler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_IN_MACHINE__CHECK_IN_HANDLER = eINSTANCE.getCheckInMachine_CheckInHandler();

		/**
		 * The meta object literal for the '{@link CodePack.impl.DataBankImpl <em>Data Bank</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodePack.impl.DataBankImpl
		 * @see CodePack.impl.CodePackPackageImpl#getDataBank()
		 * @generated
		 */
		EClass DATA_BANK = eINSTANCE.getDataBank();

		/**
		 * The meta object literal for the '<em><b>Room List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BANK__ROOM_LIST = eINSTANCE.getDataBank_RoomList();

		/**
		 * The meta object literal for the '<em><b>Booking List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BANK__BOOKING_LIST = eINSTANCE.getDataBank_BookingList();

		/**
		 * The meta object literal for the '<em><b>Customer List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BANK__CUSTOMER_LIST = eINSTANCE.getDataBank_CustomerList();

		/**
		 * The meta object literal for the '<em><b>Room Type List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BANK__ROOM_TYPE_LIST = eINSTANCE.getDataBank_RoomTypeList();

		/**
		 * The meta object literal for the '<em><b>Payment Data List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BANK__PAYMENT_DATA_LIST = eINSTANCE.getDataBank_PaymentDataList();

		/**
		 * The meta object literal for the '<em><b>Room Booked List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BANK__ROOM_BOOKED_LIST = eINSTANCE.getDataBank_RoomBookedList();

		/**
		 * The meta object literal for the '<em><b>Extra Service List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BANK__EXTRA_SERVICE_LIST = eINSTANCE.getDataBank_ExtraServiceList();

		/**
		 * The meta object literal for the '<em><b>Service Type List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BANK__SERVICE_TYPE_LIST = eINSTANCE.getDataBank_ServiceTypeList();

		/**
		 * The meta object literal for the '<em><b>Guest List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BANK__GUEST_LIST = eINSTANCE.getDataBank_GuestList();

		/**
		 * The meta object literal for the '<em><b>Staff Role List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BANK__STAFF_ROLE_LIST = eINSTANCE.getDataBank_StaffRoleList();

		/**
		 * The meta object literal for the '<em><b>Staff Member List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BANK__STAFF_MEMBER_LIST = eINSTANCE.getDataBank_StaffMemberList();

	}

} //CodePackPackage
