/**
 */
package CodePack.Backend;

import CodePack.CodePackPackage;

import org.eclipse.emf.ecore.EClass;
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
 * @see CodePack.Backend.BackendFactory
 * @model kind="package"
 * @generated
 */
public interface BackendPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Backend";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///CodePack/Backend.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CodePack.Backend";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BackendPackage eINSTANCE = CodePack.Backend.impl.BackendPackageImpl.init();

	/**
	 * The meta object id for the '{@link CodePack.Backend.impl.CustomerHandlerImpl <em>Customer Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodePack.Backend.impl.CustomerHandlerImpl
	 * @see CodePack.Backend.impl.BackendPackageImpl#getCustomerHandler()
	 * @generated
	 */
	int CUSTOMER_HANDLER = 0;

	/**
	 * The feature id for the '<em><b>Bank Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_HANDLER__BANK_COMPONENT = CodePackPackage.IUSER_ACCOUNT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Customer Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_HANDLER_FEATURE_COUNT = CodePackPackage.IUSER_ACCOUNT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_HANDLER___CREATE_BOOKING__CONTACTDATA_PAYMENTDATA_ELIST_ELIST_INT_DATE_DATE = CodePackPackage.IUSER_ACCOUNT___CREATE_BOOKING__CONTACTDATA_PAYMENTDATA_ELIST_ELIST_INT_DATE_DATE;

	/**
	 * The operation id for the '<em>Create Booking For Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_HANDLER___CREATE_BOOKING_FOR_CUSTOMER__INT_ELIST_ELIST_INT_DATE_DATE = CodePackPackage.IUSER_ACCOUNT___CREATE_BOOKING_FOR_CUSTOMER__INT_ELIST_ELIST_INT_DATE_DATE;

	/**
	 * The operation id for the '<em>Update Room For Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_HANDLER___UPDATE_ROOM_FOR_BOOKING__INT_INT_INT = CodePackPackage.IUSER_ACCOUNT___UPDATE_ROOM_FOR_BOOKING__INT_INT_INT;

	/**
	 * The operation id for the '<em>Update Service For Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_HANDLER___UPDATE_SERVICE_FOR_BOOKING__INT_EXTRASERVICE = CodePackPackage.IUSER_ACCOUNT___UPDATE_SERVICE_FOR_BOOKING__INT_EXTRASERVICE;

	/**
	 * The operation id for the '<em>Get Available Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_HANDLER___GET_AVAILABLE_ROOMS__DATE_DATE = CodePackPackage.IUSER_ACCOUNT___GET_AVAILABLE_ROOMS__DATE_DATE;

	/**
	 * The operation id for the '<em>Get Available Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_HANDLER___GET_AVAILABLE_SERVICES = CodePackPackage.IUSER_ACCOUNT___GET_AVAILABLE_SERVICES;

	/**
	 * The operation id for the '<em>Is Room Available</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_HANDLER___IS_ROOM_AVAILABLE__INT_DATE_DATE = CodePackPackage.IUSER_ACCOUNT___IS_ROOM_AVAILABLE__INT_DATE_DATE;

	/**
	 * The operation id for the '<em>Get Bookings For Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_HANDLER___GET_BOOKINGS_FOR_CUSTOMER__INT = CodePackPackage.IUSER_ACCOUNT___GET_BOOKINGS_FOR_CUSTOMER__INT;

	/**
	 * The operation id for the '<em>Get Booking For Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_HANDLER___GET_BOOKING_FOR_ID__INT = CodePackPackage.IUSER_ACCOUNT___GET_BOOKING_FOR_ID__INT;

	/**
	 * The operation id for the '<em>Update Time For Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_HANDLER___UPDATE_TIME_FOR_BOOKING__INT_DATE_DATE = CodePackPackage.IUSER_ACCOUNT___UPDATE_TIME_FOR_BOOKING__INT_DATE_DATE;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_HANDLER___CANCEL_BOOKING__INT = CodePackPackage.IUSER_ACCOUNT___CANCEL_BOOKING__INT;

	/**
	 * The operation id for the '<em>Get Payment For Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_HANDLER___GET_PAYMENT_FOR_BOOKING__INT = CodePackPackage.IUSER_ACCOUNT___GET_PAYMENT_FOR_BOOKING__INT;

	/**
	 * The operation id for the '<em>Send Comfimation Mail</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_HANDLER___SEND_COMFIMATION_MAIL__BOOKING = CodePackPackage.IUSER_ACCOUNT___SEND_COMFIMATION_MAIL__BOOKING;

	/**
	 * The operation id for the '<em>Is Email Available</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_HANDLER___IS_EMAIL_AVAILABLE__STRING = CodePackPackage.IUSER_ACCOUNT___IS_EMAIL_AVAILABLE__STRING;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_HANDLER___LOGIN__STRING_STRING = CodePackPackage.IUSER_ACCOUNT___LOGIN__STRING_STRING;

	/**
	 * The operation id for the '<em>Update Customer CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_HANDLER___UPDATE_CUSTOMER_CC__INT_STRING_STRING_INT_INT_STRING_STRING = CodePackPackage.IUSER_ACCOUNT___UPDATE_CUSTOMER_CC__INT_STRING_STRING_INT_INT_STRING_STRING;

	/**
	 * The operation id for the '<em>Update Customer Pwd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_HANDLER___UPDATE_CUSTOMER_PWD__INT_STRING_STRING = CodePackPackage.IUSER_ACCOUNT___UPDATE_CUSTOMER_PWD__INT_STRING_STRING;

	/**
	 * The operation id for the '<em>Update Customer Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_HANDLER___UPDATE_CUSTOMER_INFO__STRING_STRING_INT = CodePackPackage.IUSER_ACCOUNT___UPDATE_CUSTOMER_INFO__STRING_STRING_INT;

	/**
	 * The operation id for the '<em>Register Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_HANDLER___REGISTER_CUSTOMER__STRING_STRING_DATE_INT_STRING_STRING = CodePackPackage.IUSER_ACCOUNT___REGISTER_CUSTOMER__STRING_STRING_DATE_INT_STRING_STRING;

	/**
	 * The operation id for the '<em>Get Customer Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_HANDLER___GET_CUSTOMER_INFO__INT = CodePackPackage.IUSER_ACCOUNT___GET_CUSTOMER_INFO__INT;

	/**
	 * The number of operations of the '<em>Customer Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_HANDLER_OPERATION_COUNT = CodePackPackage.IUSER_ACCOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CodePack.Backend.impl.ReceptionHandlerImpl <em>Reception Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodePack.Backend.impl.ReceptionHandlerImpl
	 * @see CodePack.Backend.impl.BackendPackageImpl#getReceptionHandler()
	 * @generated
	 */
	int RECEPTION_HANDLER = 1;

	/**
	 * The feature id for the '<em><b>Bank Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION_HANDLER__BANK_COMPONENT = CodePackPackage.IRECEPTION_OPERATIONS_RENAME_REQUIRED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reception Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION_HANDLER_FEATURE_COUNT = CodePackPackage.IRECEPTION_OPERATIONS_RENAME_REQUIRED_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION_HANDLER___CREATE_BOOKING__CONTACTDATA_PAYMENTDATA_ELIST_ELIST_INT_DATE_DATE = CodePackPackage.IRECEPTION_OPERATIONS_RENAME_REQUIRED___CREATE_BOOKING__CONTACTDATA_PAYMENTDATA_ELIST_ELIST_INT_DATE_DATE;

	/**
	 * The operation id for the '<em>Create Booking For Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION_HANDLER___CREATE_BOOKING_FOR_CUSTOMER__INT_ELIST_ELIST_INT_DATE_DATE = CodePackPackage.IRECEPTION_OPERATIONS_RENAME_REQUIRED___CREATE_BOOKING_FOR_CUSTOMER__INT_ELIST_ELIST_INT_DATE_DATE;

	/**
	 * The operation id for the '<em>Update Room For Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION_HANDLER___UPDATE_ROOM_FOR_BOOKING__INT_INT_INT = CodePackPackage.IRECEPTION_OPERATIONS_RENAME_REQUIRED___UPDATE_ROOM_FOR_BOOKING__INT_INT_INT;

	/**
	 * The operation id for the '<em>Update Service For Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION_HANDLER___UPDATE_SERVICE_FOR_BOOKING__INT_EXTRASERVICE = CodePackPackage.IRECEPTION_OPERATIONS_RENAME_REQUIRED___UPDATE_SERVICE_FOR_BOOKING__INT_EXTRASERVICE;

	/**
	 * The operation id for the '<em>Get Available Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION_HANDLER___GET_AVAILABLE_ROOMS__DATE_DATE = CodePackPackage.IRECEPTION_OPERATIONS_RENAME_REQUIRED___GET_AVAILABLE_ROOMS__DATE_DATE;

	/**
	 * The operation id for the '<em>Get Available Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION_HANDLER___GET_AVAILABLE_SERVICES = CodePackPackage.IRECEPTION_OPERATIONS_RENAME_REQUIRED___GET_AVAILABLE_SERVICES;

	/**
	 * The operation id for the '<em>Is Room Available</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION_HANDLER___IS_ROOM_AVAILABLE__INT_DATE_DATE = CodePackPackage.IRECEPTION_OPERATIONS_RENAME_REQUIRED___IS_ROOM_AVAILABLE__INT_DATE_DATE;

	/**
	 * The operation id for the '<em>Get Bookings For Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION_HANDLER___GET_BOOKINGS_FOR_CUSTOMER__INT = CodePackPackage.IRECEPTION_OPERATIONS_RENAME_REQUIRED___GET_BOOKINGS_FOR_CUSTOMER__INT;

	/**
	 * The operation id for the '<em>Get Booking For Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION_HANDLER___GET_BOOKING_FOR_ID__INT = CodePackPackage.IRECEPTION_OPERATIONS_RENAME_REQUIRED___GET_BOOKING_FOR_ID__INT;

	/**
	 * The operation id for the '<em>Update Time For Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION_HANDLER___UPDATE_TIME_FOR_BOOKING__INT_DATE_DATE = CodePackPackage.IRECEPTION_OPERATIONS_RENAME_REQUIRED___UPDATE_TIME_FOR_BOOKING__INT_DATE_DATE;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION_HANDLER___CANCEL_BOOKING__INT = CodePackPackage.IRECEPTION_OPERATIONS_RENAME_REQUIRED___CANCEL_BOOKING__INT;

	/**
	 * The operation id for the '<em>Get Payment For Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION_HANDLER___GET_PAYMENT_FOR_BOOKING__INT = CodePackPackage.IRECEPTION_OPERATIONS_RENAME_REQUIRED___GET_PAYMENT_FOR_BOOKING__INT;

	/**
	 * The operation id for the '<em>Send Comfimation Mail</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION_HANDLER___SEND_COMFIMATION_MAIL__BOOKING = CodePackPackage.IRECEPTION_OPERATIONS_RENAME_REQUIRED___SEND_COMFIMATION_MAIL__BOOKING;

	/**
	 * The operation id for the '<em>Validate Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION_HANDLER___VALIDATE_BOOKING__INT = CodePackPackage.IRECEPTION_OPERATIONS_RENAME_REQUIRED___VALIDATE_BOOKING__INT;

	/**
	 * The operation id for the '<em>Assign Guest To Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION_HANDLER___ASSIGN_GUEST_TO_BOOKING__INT_STRING = CodePackPackage.IRECEPTION_OPERATIONS_RENAME_REQUIRED___ASSIGN_GUEST_TO_BOOKING__INT_STRING;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION_HANDLER___LOGIN__STRING_STRING = CodePackPackage.IRECEPTION_OPERATIONS_RENAME_REQUIRED___LOGIN__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Role For Staff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION_HANDLER___GET_ROLE_FOR_STAFF__STRING = CodePackPackage.IRECEPTION_OPERATIONS_RENAME_REQUIRED___GET_ROLE_FOR_STAFF__STRING;

	/**
	 * The operation id for the '<em>Generate Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION_HANDLER___GENERATE_BILL__INT = CodePackPackage.IRECEPTION_OPERATIONS_RENAME_REQUIRED___GENERATE_BILL__INT;

	/**
	 * The operation id for the '<em>Is Checked In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION_HANDLER___IS_CHECKED_IN__INT = CodePackPackage.IRECEPTION_OPERATIONS_RENAME_REQUIRED___IS_CHECKED_IN__INT;

	/**
	 * The operation id for the '<em>Generate Receipt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION_HANDLER___GENERATE_RECEIPT__BILL_PAYMENTDATA = CodePackPackage.IRECEPTION_OPERATIONS_RENAME_REQUIRED___GENERATE_RECEIPT__BILL_PAYMENTDATA;

	/**
	 * The number of operations of the '<em>Reception Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION_HANDLER_OPERATION_COUNT = CodePackPackage.IRECEPTION_OPERATIONS_RENAME_REQUIRED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CodePack.Backend.impl.CheckInHandlerImpl <em>Check In Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodePack.Backend.impl.CheckInHandlerImpl
	 * @see CodePack.Backend.impl.BackendPackageImpl#getCheckInHandler()
	 * @generated
	 */
	int CHECK_IN_HANDLER = 2;

	/**
	 * The number of structural features of the '<em>Check In Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IN_HANDLER_FEATURE_COUNT = CodePackPackage.ICHECK_IN_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IN_HANDLER___VALIDATE_BOOKING__INT = CodePackPackage.ICHECK_IN___VALIDATE_BOOKING__INT;

	/**
	 * The operation id for the '<em>Assign Guest To Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IN_HANDLER___ASSIGN_GUEST_TO_BOOKING__INT_STRING = CodePackPackage.ICHECK_IN___ASSIGN_GUEST_TO_BOOKING__INT_STRING;

	/**
	 * The number of operations of the '<em>Check In Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IN_HANDLER_OPERATION_COUNT = CodePackPackage.ICHECK_IN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CodePack.Backend.impl.ManagementHandlerImpl <em>Management Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodePack.Backend.impl.ManagementHandlerImpl
	 * @see CodePack.Backend.impl.BackendPackageImpl#getManagementHandler()
	 * @generated
	 */
	int MANAGEMENT_HANDLER = 3;

	/**
	 * The number of structural features of the '<em>Management Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_HANDLER_FEATURE_COUNT = CodePackPackage.IMANAGEMENT_FEATURE_COUNT + 0;


	/**
	 * The operation id for the '<em>Register Staff Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_HANDLER___REGISTER_STAFF_ACCOUNT__STRING_STRING_STRING_INT_STRING = CodePackPackage.IMANAGEMENT___REGISTER_STAFF_ACCOUNT__STRING_STRING_STRING_INT_STRING;

	/**
	 * The operation id for the '<em>Update Staff Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_HANDLER___UPDATE_STAFF_ACCOUNT__STAFFMEMBER = CodePackPackage.IMANAGEMENT___UPDATE_STAFF_ACCOUNT__STAFFMEMBER;

	/**
	 * The operation id for the '<em>Get Staff Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_HANDLER___GET_STAFF_ACCOUNT__STRING = CodePackPackage.IMANAGEMENT___GET_STAFF_ACCOUNT__STRING;

	/**
	 * The operation id for the '<em>Get All Staff Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_HANDLER___GET_ALL_STAFF_ACCOUNTS = CodePackPackage.IMANAGEMENT___GET_ALL_STAFF_ACCOUNTS;

	/**
	 * The operation id for the '<em>Remove Staff Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_HANDLER___REMOVE_STAFF_ACCOUNT__STAFFMEMBER = CodePackPackage.IMANAGEMENT___REMOVE_STAFF_ACCOUNT__STAFFMEMBER;

	/**
	 * The operation id for the '<em>Get Staff Roles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_HANDLER___GET_STAFF_ROLES = CodePackPackage.IMANAGEMENT___GET_STAFF_ROLES;

	/**
	 * The operation id for the '<em>Add Staff Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_HANDLER___ADD_STAFF_ROLE__STRING_BOOLEAN_BOOLEAN_BOOLEAN_BOOLEAN = CodePackPackage.IMANAGEMENT___ADD_STAFF_ROLE__STRING_BOOLEAN_BOOLEAN_BOOLEAN_BOOLEAN;

	/**
	 * The operation id for the '<em>Update Staff Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_HANDLER___UPDATE_STAFF_ROLE__STAFFROLE = CodePackPackage.IMANAGEMENT___UPDATE_STAFF_ROLE__STAFFROLE;

	/**
	 * The operation id for the '<em>Remove Staff Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_HANDLER___REMOVE_STAFF_ROLE__STAFFROLE = CodePackPackage.IMANAGEMENT___REMOVE_STAFF_ROLE__STAFFROLE;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_HANDLER___LOGIN__STRING_STRING = CodePackPackage.IMANAGEMENT___LOGIN__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Role For Staff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_HANDLER___GET_ROLE_FOR_STAFF__STRING = CodePackPackage.IMANAGEMENT___GET_ROLE_FOR_STAFF__STRING;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_HANDLER___ADD_ROOM__INT_STRING_BOOLEAN_STRING = CodePackPackage.IMANAGEMENT___ADD_ROOM__INT_STRING_BOOLEAN_STRING;

	/**
	 * The operation id for the '<em>Update Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_HANDLER___UPDATE_ROOM__ROOM = CodePackPackage.IMANAGEMENT___UPDATE_ROOM__ROOM;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_HANDLER___REMOVE_ROOM__INT = CodePackPackage.IMANAGEMENT___REMOVE_ROOM__INT;

	/**
	 * The operation id for the '<em>Add Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_HANDLER___ADD_ROOM_TYPE__STRING_STRING_INT_DOUBLE = CodePackPackage.IMANAGEMENT___ADD_ROOM_TYPE__STRING_STRING_INT_DOUBLE;

	/**
	 * The operation id for the '<em>Update Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_HANDLER___UPDATE_ROOM_TYPE__ROOMTYPE = CodePackPackage.IMANAGEMENT___UPDATE_ROOM_TYPE__ROOMTYPE;

	/**
	 * The operation id for the '<em>Remove Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_HANDLER___REMOVE_ROOM_TYPE__STRING = CodePackPackage.IMANAGEMENT___REMOVE_ROOM_TYPE__STRING;

	/**
	 * The operation id for the '<em>Get Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_HANDLER___GET_ROOM__INT = CodePackPackage.IMANAGEMENT___GET_ROOM__INT;

	/**
	 * The operation id for the '<em>Get All Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_HANDLER___GET_ALL_ROOMS = CodePackPackage.IMANAGEMENT___GET_ALL_ROOMS;

	/**
	 * The operation id for the '<em>Get Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_HANDLER___GET_ROOM_TYPES = CodePackPackage.IMANAGEMENT___GET_ROOM_TYPES;

	/**
	 * The operation id for the '<em>Get Service Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_HANDLER___GET_SERVICE_TYPES = CodePackPackage.IMANAGEMENT___GET_SERVICE_TYPES;

	/**
	 * The operation id for the '<em>Update Service Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_HANDLER___UPDATE_SERVICE_TYPE__SERVICETYPE = CodePackPackage.IMANAGEMENT___UPDATE_SERVICE_TYPE__SERVICETYPE;

	/**
	 * The operation id for the '<em>Remove Service Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_HANDLER___REMOVE_SERVICE_TYPE__SERVICETYPE = CodePackPackage.IMANAGEMENT___REMOVE_SERVICE_TYPE__SERVICETYPE;

	/**
	 * The number of operations of the '<em>Management Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_HANDLER_OPERATION_COUNT = CodePackPackage.IMANAGEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link CodePack.Backend.CustomerHandler <em>Customer Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Handler</em>'.
	 * @see CodePack.Backend.CustomerHandler
	 * @generated
	 */
	EClass getCustomerHandler();

	/**
	 * Returns the meta object for the reference '{@link CodePack.Backend.CustomerHandler#getBankComponent <em>Bank Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bank Component</em>'.
	 * @see CodePack.Backend.CustomerHandler#getBankComponent()
	 * @see #getCustomerHandler()
	 * @generated
	 */
	EReference getCustomerHandler_BankComponent();

	/**
	 * Returns the meta object for class '{@link CodePack.Backend.ReceptionHandler <em>Reception Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reception Handler</em>'.
	 * @see CodePack.Backend.ReceptionHandler
	 * @generated
	 */
	EClass getReceptionHandler();

	/**
	 * Returns the meta object for the reference '{@link CodePack.Backend.ReceptionHandler#getBankComponent <em>Bank Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bank Component</em>'.
	 * @see CodePack.Backend.ReceptionHandler#getBankComponent()
	 * @see #getReceptionHandler()
	 * @generated
	 */
	EReference getReceptionHandler_BankComponent();

	/**
	 * Returns the meta object for class '{@link CodePack.Backend.CheckInHandler <em>Check In Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check In Handler</em>'.
	 * @see CodePack.Backend.CheckInHandler
	 * @generated
	 */
	EClass getCheckInHandler();

	/**
	 * Returns the meta object for class '{@link CodePack.Backend.ManagementHandler <em>Management Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Management Handler</em>'.
	 * @see CodePack.Backend.ManagementHandler
	 * @generated
	 */
	EClass getManagementHandler();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BackendFactory getBackendFactory();

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
		 * The meta object literal for the '{@link CodePack.Backend.impl.CustomerHandlerImpl <em>Customer Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodePack.Backend.impl.CustomerHandlerImpl
		 * @see CodePack.Backend.impl.BackendPackageImpl#getCustomerHandler()
		 * @generated
		 */
		EClass CUSTOMER_HANDLER = eINSTANCE.getCustomerHandler();

		/**
		 * The meta object literal for the '<em><b>Bank Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_HANDLER__BANK_COMPONENT = eINSTANCE.getCustomerHandler_BankComponent();

		/**
		 * The meta object literal for the '{@link CodePack.Backend.impl.ReceptionHandlerImpl <em>Reception Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodePack.Backend.impl.ReceptionHandlerImpl
		 * @see CodePack.Backend.impl.BackendPackageImpl#getReceptionHandler()
		 * @generated
		 */
		EClass RECEPTION_HANDLER = eINSTANCE.getReceptionHandler();

		/**
		 * The meta object literal for the '<em><b>Bank Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEPTION_HANDLER__BANK_COMPONENT = eINSTANCE.getReceptionHandler_BankComponent();

		/**
		 * The meta object literal for the '{@link CodePack.Backend.impl.CheckInHandlerImpl <em>Check In Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodePack.Backend.impl.CheckInHandlerImpl
		 * @see CodePack.Backend.impl.BackendPackageImpl#getCheckInHandler()
		 * @generated
		 */
		EClass CHECK_IN_HANDLER = eINSTANCE.getCheckInHandler();

		/**
		 * The meta object literal for the '{@link CodePack.Backend.impl.ManagementHandlerImpl <em>Management Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodePack.Backend.impl.ManagementHandlerImpl
		 * @see CodePack.Backend.impl.BackendPackageImpl#getManagementHandler()
		 * @generated
		 */
		EClass MANAGEMENT_HANDLER = eINSTANCE.getManagementHandler();

	}

} //BackendPackage
