/**
 */
package CodePack.DataModels;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see CodePack.DataModels.DataModelsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Data Models'"
 * @generated
 */
public interface DataModelsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DataModels";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///CodePack/DataModels.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CodePack.DataModels";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataModelsPackage eINSTANCE = CodePack.DataModels.impl.DataModelsPackageImpl.init();

	/**
	 * The meta object id for the '{@link CodePack.DataModels.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodePack.DataModels.impl.RoomImpl
	 * @see CodePack.DataModels.impl.DataModelsPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Is Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__IS_AVAILABLE = 2;

	/**
	 * The feature id for the '<em><b>Room type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOM_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CodePack.DataModels.impl.RoomTypeImpl <em>Room Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodePack.DataModels.impl.RoomTypeImpl
	 * @see CodePack.DataModels.impl.DataModelsPackageImpl#getRoomType()
	 * @generated
	 */
	int ROOM_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Max guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__MAX_GUESTS = 1;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__RATE = 2;

	/**
	 * The feature id for the '<em><b>Typename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__TYPENAME = 3;

	/**
	 * The number of structural features of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CodePack.DataModels.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodePack.DataModels.impl.CustomerImpl
	 * @see CodePack.DataModels.impl.DataModelsPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 2;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PASSWORD = 0;

	/**
	 * The feature id for the '<em><b>Date of birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__DATE_OF_BIRTH = 1;

	/**
	 * The feature id for the '<em><b>Bonus points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__BONUS_POINTS = 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__EMAIL = 3;

	/**
	 * The feature id for the '<em><b>First name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__FIRST_NAME = 4;

	/**
	 * The feature id for the '<em><b>Phone no</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PHONE_NO = 5;

	/**
	 * The feature id for the '<em><b>Customer id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CUSTOMER_ID = 6;

	/**
	 * The feature id for the '<em><b>Payment id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PAYMENT_ID = 7;

	/**
	 * The feature id for the '<em><b>Last name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__LAST_NAME = 8;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CodePack.DataModels.impl.PaymentDataImpl <em>Payment Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodePack.DataModels.impl.PaymentDataImpl
	 * @see CodePack.DataModels.impl.DataModelsPackageImpl#getPaymentData()
	 * @generated
	 */
	int PAYMENT_DATA = 3;

	/**
	 * The feature id for the '<em><b>Cc number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DATA__CC_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Cc ccv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DATA__CC_CCV = 1;

	/**
	 * The feature id for the '<em><b>Cc month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DATA__CC_MONTH = 2;

	/**
	 * The feature id for the '<em><b>Cc year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DATA__CC_YEAR = 3;

	/**
	 * The feature id for the '<em><b>Cc first name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DATA__CC_FIRST_NAME = 4;

	/**
	 * The feature id for the '<em><b>Cc last name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DATA__CC_LAST_NAME = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DATA__ID = 6;

	/**
	 * The number of structural features of the '<em>Payment Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DATA_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Payment Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CodePack.DataModels.impl.RoomBookedImpl <em>Room Booked</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodePack.DataModels.impl.RoomBookedImpl
	 * @see CodePack.DataModels.impl.DataModelsPackageImpl#getRoomBooked()
	 * @generated
	 */
	int ROOM_BOOKED = 4;

	/**
	 * The feature id for the '<em><b>Room number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKED__ROOM_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Booking id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKED__BOOKING_ID = 1;

	/**
	 * The feature id for the '<em><b>Date start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKED__DATE_START = 2;

	/**
	 * The feature id for the '<em><b>Date end</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKED__DATE_END = 3;

	/**
	 * The feature id for the '<em><b>Booking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKED__BOOKING = 4;

	/**
	 * The number of structural features of the '<em>Room Booked</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKED_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Room Booked</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CodePack.DataModels.impl.ServiceTypeImpl <em>Service Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodePack.DataModels.impl.ServiceTypeImpl
	 * @see CodePack.DataModels.impl.DataModelsPackageImpl#getServiceType()
	 * @generated
	 */
	int SERVICE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Type name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__TYPE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__PRICE = 2;

	/**
	 * The number of structural features of the '<em>Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CodePack.DataModels.impl.ExtraServiceImpl <em>Extra Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodePack.DataModels.impl.ExtraServiceImpl
	 * @see CodePack.DataModels.impl.DataModelsPackageImpl#getExtraService()
	 * @generated
	 */
	int EXTRA_SERVICE = 6;

	/**
	 * The feature id for the '<em><b>Date start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_SERVICE__DATE_START = 0;

	/**
	 * The feature id for the '<em><b>Date end</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_SERVICE__DATE_END = 1;

	/**
	 * The feature id for the '<em><b>Booking id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_SERVICE__BOOKING_ID = 2;

	/**
	 * The feature id for the '<em><b>Total price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_SERVICE__TOTAL_PRICE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_SERVICE__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Extra Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_SERVICE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Extra Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CodePack.DataModels.impl.StaffRoleImpl <em>Staff Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodePack.DataModels.impl.StaffRoleImpl
	 * @see CodePack.DataModels.impl.DataModelsPackageImpl#getStaffRole()
	 * @generated
	 */
	int STAFF_ROLE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ROLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Can Manage Bookings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ROLE__CAN_MANAGE_BOOKINGS = 1;

	/**
	 * The feature id for the '<em><b>Can Manage Rooms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ROLE__CAN_MANAGE_ROOMS = 2;

	/**
	 * The feature id for the '<em><b>Can Manage Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ROLE__CAN_MANAGE_SERVICES = 3;

	/**
	 * The feature id for the '<em><b>Can Manage Accounts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ROLE__CAN_MANAGE_ACCOUNTS = 4;

	/**
	 * The number of structural features of the '<em>Staff Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ROLE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Staff Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CodePack.DataModels.impl.StaffMemberImpl <em>Staff Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodePack.DataModels.impl.StaffMemberImpl
	 * @see CodePack.DataModels.impl.DataModelsPackageImpl#getStaffMember()
	 * @generated
	 */
	int STAFF_MEMBER = 8;

	/**
	 * The feature id for the '<em><b>Full name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MEMBER__FULL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MEMBER__EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MEMBER__PASSWORD = 2;

	/**
	 * The feature id for the '<em><b>Pers no</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MEMBER__PERS_NO = 3;

	/**
	 * The feature id for the '<em><b>Phone no</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MEMBER__PHONE_NO = 4;

	/**
	 * The feature id for the '<em><b>Role name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MEMBER__ROLE_NAME = 5;

	/**
	 * The number of structural features of the '<em>Staff Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MEMBER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Staff Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MEMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CodePack.DataModels.impl.GuestImpl <em>Guest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodePack.DataModels.impl.GuestImpl
	 * @see CodePack.DataModels.impl.DataModelsPackageImpl#getGuest()
	 * @generated
	 */
	int GUEST = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Booking id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__BOOKING_ID = 1;

	/**
	 * The number of structural features of the '<em>Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CodePack.DataModels.impl.BillImpl <em>Bill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodePack.DataModels.impl.BillImpl
	 * @see CodePack.DataModels.impl.DataModelsPackageImpl#getBill()
	 * @generated
	 */
	int BILL = 10;

	/**
	 * The feature id for the '<em><b>Booking id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__BOOKING_ID = 0;

	/**
	 * The feature id for the '<em><b>Rooms booked</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__ROOMS_BOOKED = 1;

	/**
	 * The feature id for the '<em><b>Services ordered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__SERVICES_ORDERED = 2;

	/**
	 * The feature id for the '<em><b>Total price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__TOTAL_PRICE = 3;

	/**
	 * The number of structural features of the '<em>Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CodePack.DataModels.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodePack.DataModels.impl.BookingImpl
	 * @see CodePack.DataModels.impl.DataModelsPackageImpl#getBooking()
	 * @generated
	 */
	int BOOKING = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ID = 0;

	/**
	 * The feature id for the '<em><b>Date check in</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__DATE_CHECK_IN = 1;

	/**
	 * The feature id for the '<em><b>Date check out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__DATE_CHECK_OUT = 2;

	/**
	 * The feature id for the '<em><b>Is Checked In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__IS_CHECKED_IN = 3;

	/**
	 * The feature id for the '<em><b>Total price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__TOTAL_PRICE = 4;

	/**
	 * The feature id for the '<em><b>Contact name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CONTACT_NAME = 5;

	/**
	 * The feature id for the '<em><b>Contact phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CONTACT_PHONE = 6;

	/**
	 * The feature id for the '<em><b>Contact email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CONTACT_EMAIL = 7;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ROOM = 8;

	/**
	 * The feature id for the '<em><b>Customer id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CUSTOMER_ID = 9;

	/**
	 * The feature id for the '<em><b>Payment id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__PAYMENT_ID = 10;

	/**
	 * The feature id for the '<em><b>Bonus points used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BONUS_POINTS_USED = 11;

	/**
	 * The number of structural features of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_FEATURE_COUNT = 12;


	/**
	 * The number of operations of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link CodePack.DataModels.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see CodePack.DataModels.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.Room#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see CodePack.DataModels.Room#getNumber()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Number();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.Room#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see CodePack.DataModels.Room#getDescription()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Description();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.Room#isAvailable <em>Is Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Available</em>'.
	 * @see CodePack.DataModels.Room#isAvailable()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_IsAvailable();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.Room#getRoom_type <em>Room type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room type</em>'.
	 * @see CodePack.DataModels.Room#getRoom_type()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Room_type();

	/**
	 * Returns the meta object for class '{@link CodePack.DataModels.RoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Type</em>'.
	 * @see CodePack.DataModels.RoomType
	 * @generated
	 */
	EClass getRoomType();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.RoomType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see CodePack.DataModels.RoomType#getDescription()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Description();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.RoomType#getMax_guests <em>Max guests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max guests</em>'.
	 * @see CodePack.DataModels.RoomType#getMax_guests()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Max_guests();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.RoomType#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see CodePack.DataModels.RoomType#getRate()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Rate();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.RoomType#getTypename <em>Typename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typename</em>'.
	 * @see CodePack.DataModels.RoomType#getTypename()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Typename();

	/**
	 * Returns the meta object for class '{@link CodePack.DataModels.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see CodePack.DataModels.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.Customer#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see CodePack.DataModels.Customer#getPassword()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Password();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.Customer#getDate_of_birth <em>Date of birth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date of birth</em>'.
	 * @see CodePack.DataModels.Customer#getDate_of_birth()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Date_of_birth();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.Customer#getBonus_points <em>Bonus points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bonus points</em>'.
	 * @see CodePack.DataModels.Customer#getBonus_points()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Bonus_points();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.Customer#getE_mail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see CodePack.DataModels.Customer#getE_mail()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_E_mail();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.Customer#getFirst_name <em>First name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First name</em>'.
	 * @see CodePack.DataModels.Customer#getFirst_name()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_First_name();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.Customer#getPhone_no <em>Phone no</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone no</em>'.
	 * @see CodePack.DataModels.Customer#getPhone_no()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Phone_no();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.Customer#getCustomer_id <em>Customer id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer id</em>'.
	 * @see CodePack.DataModels.Customer#getCustomer_id()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Customer_id();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.Customer#getPayment_id <em>Payment id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment id</em>'.
	 * @see CodePack.DataModels.Customer#getPayment_id()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Payment_id();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.Customer#getLast_name <em>Last name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last name</em>'.
	 * @see CodePack.DataModels.Customer#getLast_name()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Last_name();

	/**
	 * Returns the meta object for class '{@link CodePack.DataModels.PaymentData <em>Payment Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Data</em>'.
	 * @see CodePack.DataModels.PaymentData
	 * @generated
	 */
	EClass getPaymentData();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.PaymentData#getCc_number <em>Cc number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc number</em>'.
	 * @see CodePack.DataModels.PaymentData#getCc_number()
	 * @see #getPaymentData()
	 * @generated
	 */
	EAttribute getPaymentData_Cc_number();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.PaymentData#getCc_ccv <em>Cc ccv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc ccv</em>'.
	 * @see CodePack.DataModels.PaymentData#getCc_ccv()
	 * @see #getPaymentData()
	 * @generated
	 */
	EAttribute getPaymentData_Cc_ccv();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.PaymentData#getCc_month <em>Cc month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc month</em>'.
	 * @see CodePack.DataModels.PaymentData#getCc_month()
	 * @see #getPaymentData()
	 * @generated
	 */
	EAttribute getPaymentData_Cc_month();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.PaymentData#getCc_year <em>Cc year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc year</em>'.
	 * @see CodePack.DataModels.PaymentData#getCc_year()
	 * @see #getPaymentData()
	 * @generated
	 */
	EAttribute getPaymentData_Cc_year();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.PaymentData#getCc_first_name <em>Cc first name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc first name</em>'.
	 * @see CodePack.DataModels.PaymentData#getCc_first_name()
	 * @see #getPaymentData()
	 * @generated
	 */
	EAttribute getPaymentData_Cc_first_name();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.PaymentData#getCc_last_name <em>Cc last name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc last name</em>'.
	 * @see CodePack.DataModels.PaymentData#getCc_last_name()
	 * @see #getPaymentData()
	 * @generated
	 */
	EAttribute getPaymentData_Cc_last_name();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.PaymentData#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see CodePack.DataModels.PaymentData#getId()
	 * @see #getPaymentData()
	 * @generated
	 */
	EAttribute getPaymentData_Id();

	/**
	 * Returns the meta object for class '{@link CodePack.DataModels.RoomBooked <em>Room Booked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Booked</em>'.
	 * @see CodePack.DataModels.RoomBooked
	 * @generated
	 */
	EClass getRoomBooked();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.RoomBooked#getRoom_number <em>Room number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room number</em>'.
	 * @see CodePack.DataModels.RoomBooked#getRoom_number()
	 * @see #getRoomBooked()
	 * @generated
	 */
	EAttribute getRoomBooked_Room_number();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.RoomBooked#getBooking_id <em>Booking id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking id</em>'.
	 * @see CodePack.DataModels.RoomBooked#getBooking_id()
	 * @see #getRoomBooked()
	 * @generated
	 */
	EAttribute getRoomBooked_Booking_id();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.RoomBooked#getDate_start <em>Date start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date start</em>'.
	 * @see CodePack.DataModels.RoomBooked#getDate_start()
	 * @see #getRoomBooked()
	 * @generated
	 */
	EAttribute getRoomBooked_Date_start();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.RoomBooked#getDate_end <em>Date end</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date end</em>'.
	 * @see CodePack.DataModels.RoomBooked#getDate_end()
	 * @see #getRoomBooked()
	 * @generated
	 */
	EAttribute getRoomBooked_Date_end();

	/**
	 * Returns the meta object for the reference '{@link CodePack.DataModels.RoomBooked#getBooking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Booking</em>'.
	 * @see CodePack.DataModels.RoomBooked#getBooking()
	 * @see #getRoomBooked()
	 * @generated
	 */
	EReference getRoomBooked_Booking();

	/**
	 * Returns the meta object for class '{@link CodePack.DataModels.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Type</em>'.
	 * @see CodePack.DataModels.ServiceType
	 * @generated
	 */
	EClass getServiceType();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.ServiceType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see CodePack.DataModels.ServiceType#getDescription()
	 * @see #getServiceType()
	 * @generated
	 */
	EAttribute getServiceType_Description();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.ServiceType#getType_name <em>Type name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type name</em>'.
	 * @see CodePack.DataModels.ServiceType#getType_name()
	 * @see #getServiceType()
	 * @generated
	 */
	EAttribute getServiceType_Type_name();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.ServiceType#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see CodePack.DataModels.ServiceType#getPrice()
	 * @see #getServiceType()
	 * @generated
	 */
	EAttribute getServiceType_Price();

	/**
	 * Returns the meta object for class '{@link CodePack.DataModels.ExtraService <em>Extra Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extra Service</em>'.
	 * @see CodePack.DataModels.ExtraService
	 * @generated
	 */
	EClass getExtraService();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.ExtraService#getDate_start <em>Date start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date start</em>'.
	 * @see CodePack.DataModels.ExtraService#getDate_start()
	 * @see #getExtraService()
	 * @generated
	 */
	EAttribute getExtraService_Date_start();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.ExtraService#getDate_end <em>Date end</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date end</em>'.
	 * @see CodePack.DataModels.ExtraService#getDate_end()
	 * @see #getExtraService()
	 * @generated
	 */
	EAttribute getExtraService_Date_end();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.ExtraService#getBooking_id <em>Booking id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking id</em>'.
	 * @see CodePack.DataModels.ExtraService#getBooking_id()
	 * @see #getExtraService()
	 * @generated
	 */
	EAttribute getExtraService_Booking_id();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.ExtraService#getTotal_price <em>Total price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total price</em>'.
	 * @see CodePack.DataModels.ExtraService#getTotal_price()
	 * @see #getExtraService()
	 * @generated
	 */
	EAttribute getExtraService_Total_price();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.ExtraService#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CodePack.DataModels.ExtraService#getType()
	 * @see #getExtraService()
	 * @generated
	 */
	EAttribute getExtraService_Type();

	/**
	 * Returns the meta object for class '{@link CodePack.DataModels.StaffRole <em>Staff Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff Role</em>'.
	 * @see CodePack.DataModels.StaffRole
	 * @generated
	 */
	EClass getStaffRole();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.StaffRole#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CodePack.DataModels.StaffRole#getName()
	 * @see #getStaffRole()
	 * @generated
	 */
	EAttribute getStaffRole_Name();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.StaffRole#isCanManageBookings <em>Can Manage Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Manage Bookings</em>'.
	 * @see CodePack.DataModels.StaffRole#isCanManageBookings()
	 * @see #getStaffRole()
	 * @generated
	 */
	EAttribute getStaffRole_CanManageBookings();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.StaffRole#isCanManageRooms <em>Can Manage Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Manage Rooms</em>'.
	 * @see CodePack.DataModels.StaffRole#isCanManageRooms()
	 * @see #getStaffRole()
	 * @generated
	 */
	EAttribute getStaffRole_CanManageRooms();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.StaffRole#isCanManageServices <em>Can Manage Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Manage Services</em>'.
	 * @see CodePack.DataModels.StaffRole#isCanManageServices()
	 * @see #getStaffRole()
	 * @generated
	 */
	EAttribute getStaffRole_CanManageServices();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.StaffRole#isCanManageAccounts <em>Can Manage Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Manage Accounts</em>'.
	 * @see CodePack.DataModels.StaffRole#isCanManageAccounts()
	 * @see #getStaffRole()
	 * @generated
	 */
	EAttribute getStaffRole_CanManageAccounts();

	/**
	 * Returns the meta object for class '{@link CodePack.DataModels.StaffMember <em>Staff Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff Member</em>'.
	 * @see CodePack.DataModels.StaffMember
	 * @generated
	 */
	EClass getStaffMember();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.StaffMember#getFull_name <em>Full name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full name</em>'.
	 * @see CodePack.DataModels.StaffMember#getFull_name()
	 * @see #getStaffMember()
	 * @generated
	 */
	EAttribute getStaffMember_Full_name();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.StaffMember#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see CodePack.DataModels.StaffMember#getEmail()
	 * @see #getStaffMember()
	 * @generated
	 */
	EAttribute getStaffMember_Email();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.StaffMember#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see CodePack.DataModels.StaffMember#getPassword()
	 * @see #getStaffMember()
	 * @generated
	 */
	EAttribute getStaffMember_Password();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.StaffMember#getPers_no <em>Pers no</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pers no</em>'.
	 * @see CodePack.DataModels.StaffMember#getPers_no()
	 * @see #getStaffMember()
	 * @generated
	 */
	EAttribute getStaffMember_Pers_no();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.StaffMember#getPhone_no <em>Phone no</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone no</em>'.
	 * @see CodePack.DataModels.StaffMember#getPhone_no()
	 * @see #getStaffMember()
	 * @generated
	 */
	EAttribute getStaffMember_Phone_no();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.StaffMember#getRole_name <em>Role name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role name</em>'.
	 * @see CodePack.DataModels.StaffMember#getRole_name()
	 * @see #getStaffMember()
	 * @generated
	 */
	EAttribute getStaffMember_Role_name();

	/**
	 * Returns the meta object for class '{@link CodePack.DataModels.Guest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guest</em>'.
	 * @see CodePack.DataModels.Guest
	 * @generated
	 */
	EClass getGuest();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.Guest#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CodePack.DataModels.Guest#getName()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_Name();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.Guest#getBooking_id <em>Booking id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking id</em>'.
	 * @see CodePack.DataModels.Guest#getBooking_id()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_Booking_id();

	/**
	 * Returns the meta object for class '{@link CodePack.DataModels.Bill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bill</em>'.
	 * @see CodePack.DataModels.Bill
	 * @generated
	 */
	EClass getBill();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.Bill#getBooking_id <em>Booking id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking id</em>'.
	 * @see CodePack.DataModels.Bill#getBooking_id()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_Booking_id();

	/**
	 * Returns the meta object for the reference list '{@link CodePack.DataModels.Bill#getRooms_booked <em>Rooms booked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rooms booked</em>'.
	 * @see CodePack.DataModels.Bill#getRooms_booked()
	 * @see #getBill()
	 * @generated
	 */
	EReference getBill_Rooms_booked();

	/**
	 * Returns the meta object for the reference list '{@link CodePack.DataModels.Bill#getServices_ordered <em>Services ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services ordered</em>'.
	 * @see CodePack.DataModels.Bill#getServices_ordered()
	 * @see #getBill()
	 * @generated
	 */
	EReference getBill_Services_ordered();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.Bill#getTotal_price <em>Total price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total price</em>'.
	 * @see CodePack.DataModels.Bill#getTotal_price()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_Total_price();

	/**
	 * Returns the meta object for class '{@link CodePack.DataModels.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking</em>'.
	 * @see CodePack.DataModels.Booking
	 * @generated
	 */
	EClass getBooking();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.Booking#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see CodePack.DataModels.Booking#getId()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Id();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.Booking#getDate_check_in <em>Date check in</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date check in</em>'.
	 * @see CodePack.DataModels.Booking#getDate_check_in()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Date_check_in();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.Booking#getDate_check_out <em>Date check out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date check out</em>'.
	 * @see CodePack.DataModels.Booking#getDate_check_out()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Date_check_out();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.Booking#isCheckedIn <em>Is Checked In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Checked In</em>'.
	 * @see CodePack.DataModels.Booking#isCheckedIn()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_IsCheckedIn();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.Booking#getTotal_price <em>Total price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total price</em>'.
	 * @see CodePack.DataModels.Booking#getTotal_price()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Total_price();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.Booking#getContact_name <em>Contact name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact name</em>'.
	 * @see CodePack.DataModels.Booking#getContact_name()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Contact_name();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.Booking#getContact_phone <em>Contact phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact phone</em>'.
	 * @see CodePack.DataModels.Booking#getContact_phone()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Contact_phone();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.Booking#getContact_email <em>Contact email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact email</em>'.
	 * @see CodePack.DataModels.Booking#getContact_email()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Contact_email();

	/**
	 * Returns the meta object for the reference '{@link CodePack.DataModels.Booking#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see CodePack.DataModels.Booking#getRoom()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Room();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.Booking#getCustomer_id <em>Customer id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer id</em>'.
	 * @see CodePack.DataModels.Booking#getCustomer_id()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Customer_id();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.Booking#getPayment_id <em>Payment id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment id</em>'.
	 * @see CodePack.DataModels.Booking#getPayment_id()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Payment_id();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.DataModels.Booking#getBonus_points_used <em>Bonus points used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bonus points used</em>'.
	 * @see CodePack.DataModels.Booking#getBonus_points_used()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Bonus_points_used();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataModelsFactory getDataModelsFactory();

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
		 * The meta object literal for the '{@link CodePack.DataModels.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodePack.DataModels.impl.RoomImpl
		 * @see CodePack.DataModels.impl.DataModelsPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NUMBER = eINSTANCE.getRoom_Number();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__DESCRIPTION = eINSTANCE.getRoom_Description();

		/**
		 * The meta object literal for the '<em><b>Is Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__IS_AVAILABLE = eINSTANCE.getRoom_IsAvailable();

		/**
		 * The meta object literal for the '<em><b>Room type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__ROOM_TYPE = eINSTANCE.getRoom_Room_type();

		/**
		 * The meta object literal for the '{@link CodePack.DataModels.impl.RoomTypeImpl <em>Room Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodePack.DataModels.impl.RoomTypeImpl
		 * @see CodePack.DataModels.impl.DataModelsPackageImpl#getRoomType()
		 * @generated
		 */
		EClass ROOM_TYPE = eINSTANCE.getRoomType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__DESCRIPTION = eINSTANCE.getRoomType_Description();

		/**
		 * The meta object literal for the '<em><b>Max guests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__MAX_GUESTS = eINSTANCE.getRoomType_Max_guests();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__RATE = eINSTANCE.getRoomType_Rate();

		/**
		 * The meta object literal for the '<em><b>Typename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__TYPENAME = eINSTANCE.getRoomType_Typename();

		/**
		 * The meta object literal for the '{@link CodePack.DataModels.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodePack.DataModels.impl.CustomerImpl
		 * @see CodePack.DataModels.impl.DataModelsPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__PASSWORD = eINSTANCE.getCustomer_Password();

		/**
		 * The meta object literal for the '<em><b>Date of birth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__DATE_OF_BIRTH = eINSTANCE.getCustomer_Date_of_birth();

		/**
		 * The meta object literal for the '<em><b>Bonus points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__BONUS_POINTS = eINSTANCE.getCustomer_Bonus_points();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__EMAIL = eINSTANCE.getCustomer_E_mail();

		/**
		 * The meta object literal for the '<em><b>First name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__FIRST_NAME = eINSTANCE.getCustomer_First_name();

		/**
		 * The meta object literal for the '<em><b>Phone no</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__PHONE_NO = eINSTANCE.getCustomer_Phone_no();

		/**
		 * The meta object literal for the '<em><b>Customer id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CUSTOMER_ID = eINSTANCE.getCustomer_Customer_id();

		/**
		 * The meta object literal for the '<em><b>Payment id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__PAYMENT_ID = eINSTANCE.getCustomer_Payment_id();

		/**
		 * The meta object literal for the '<em><b>Last name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__LAST_NAME = eINSTANCE.getCustomer_Last_name();

		/**
		 * The meta object literal for the '{@link CodePack.DataModels.impl.PaymentDataImpl <em>Payment Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodePack.DataModels.impl.PaymentDataImpl
		 * @see CodePack.DataModels.impl.DataModelsPackageImpl#getPaymentData()
		 * @generated
		 */
		EClass PAYMENT_DATA = eINSTANCE.getPaymentData();

		/**
		 * The meta object literal for the '<em><b>Cc number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DATA__CC_NUMBER = eINSTANCE.getPaymentData_Cc_number();

		/**
		 * The meta object literal for the '<em><b>Cc ccv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DATA__CC_CCV = eINSTANCE.getPaymentData_Cc_ccv();

		/**
		 * The meta object literal for the '<em><b>Cc month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DATA__CC_MONTH = eINSTANCE.getPaymentData_Cc_month();

		/**
		 * The meta object literal for the '<em><b>Cc year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DATA__CC_YEAR = eINSTANCE.getPaymentData_Cc_year();

		/**
		 * The meta object literal for the '<em><b>Cc first name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DATA__CC_FIRST_NAME = eINSTANCE.getPaymentData_Cc_first_name();

		/**
		 * The meta object literal for the '<em><b>Cc last name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DATA__CC_LAST_NAME = eINSTANCE.getPaymentData_Cc_last_name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DATA__ID = eINSTANCE.getPaymentData_Id();

		/**
		 * The meta object literal for the '{@link CodePack.DataModels.impl.RoomBookedImpl <em>Room Booked</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodePack.DataModels.impl.RoomBookedImpl
		 * @see CodePack.DataModels.impl.DataModelsPackageImpl#getRoomBooked()
		 * @generated
		 */
		EClass ROOM_BOOKED = eINSTANCE.getRoomBooked();

		/**
		 * The meta object literal for the '<em><b>Room number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_BOOKED__ROOM_NUMBER = eINSTANCE.getRoomBooked_Room_number();

		/**
		 * The meta object literal for the '<em><b>Booking id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_BOOKED__BOOKING_ID = eINSTANCE.getRoomBooked_Booking_id();

		/**
		 * The meta object literal for the '<em><b>Date start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_BOOKED__DATE_START = eINSTANCE.getRoomBooked_Date_start();

		/**
		 * The meta object literal for the '<em><b>Date end</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_BOOKED__DATE_END = eINSTANCE.getRoomBooked_Date_end();

		/**
		 * The meta object literal for the '<em><b>Booking</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_BOOKED__BOOKING = eINSTANCE.getRoomBooked_Booking();

		/**
		 * The meta object literal for the '{@link CodePack.DataModels.impl.ServiceTypeImpl <em>Service Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodePack.DataModels.impl.ServiceTypeImpl
		 * @see CodePack.DataModels.impl.DataModelsPackageImpl#getServiceType()
		 * @generated
		 */
		EClass SERVICE_TYPE = eINSTANCE.getServiceType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TYPE__DESCRIPTION = eINSTANCE.getServiceType_Description();

		/**
		 * The meta object literal for the '<em><b>Type name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TYPE__TYPE_NAME = eINSTANCE.getServiceType_Type_name();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TYPE__PRICE = eINSTANCE.getServiceType_Price();

		/**
		 * The meta object literal for the '{@link CodePack.DataModels.impl.ExtraServiceImpl <em>Extra Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodePack.DataModels.impl.ExtraServiceImpl
		 * @see CodePack.DataModels.impl.DataModelsPackageImpl#getExtraService()
		 * @generated
		 */
		EClass EXTRA_SERVICE = eINSTANCE.getExtraService();

		/**
		 * The meta object literal for the '<em><b>Date start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRA_SERVICE__DATE_START = eINSTANCE.getExtraService_Date_start();

		/**
		 * The meta object literal for the '<em><b>Date end</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRA_SERVICE__DATE_END = eINSTANCE.getExtraService_Date_end();

		/**
		 * The meta object literal for the '<em><b>Booking id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRA_SERVICE__BOOKING_ID = eINSTANCE.getExtraService_Booking_id();

		/**
		 * The meta object literal for the '<em><b>Total price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRA_SERVICE__TOTAL_PRICE = eINSTANCE.getExtraService_Total_price();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRA_SERVICE__TYPE = eINSTANCE.getExtraService_Type();

		/**
		 * The meta object literal for the '{@link CodePack.DataModels.impl.StaffRoleImpl <em>Staff Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodePack.DataModels.impl.StaffRoleImpl
		 * @see CodePack.DataModels.impl.DataModelsPackageImpl#getStaffRole()
		 * @generated
		 */
		EClass STAFF_ROLE = eINSTANCE.getStaffRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_ROLE__NAME = eINSTANCE.getStaffRole_Name();

		/**
		 * The meta object literal for the '<em><b>Can Manage Bookings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_ROLE__CAN_MANAGE_BOOKINGS = eINSTANCE.getStaffRole_CanManageBookings();

		/**
		 * The meta object literal for the '<em><b>Can Manage Rooms</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_ROLE__CAN_MANAGE_ROOMS = eINSTANCE.getStaffRole_CanManageRooms();

		/**
		 * The meta object literal for the '<em><b>Can Manage Services</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_ROLE__CAN_MANAGE_SERVICES = eINSTANCE.getStaffRole_CanManageServices();

		/**
		 * The meta object literal for the '<em><b>Can Manage Accounts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_ROLE__CAN_MANAGE_ACCOUNTS = eINSTANCE.getStaffRole_CanManageAccounts();

		/**
		 * The meta object literal for the '{@link CodePack.DataModels.impl.StaffMemberImpl <em>Staff Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodePack.DataModels.impl.StaffMemberImpl
		 * @see CodePack.DataModels.impl.DataModelsPackageImpl#getStaffMember()
		 * @generated
		 */
		EClass STAFF_MEMBER = eINSTANCE.getStaffMember();

		/**
		 * The meta object literal for the '<em><b>Full name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_MEMBER__FULL_NAME = eINSTANCE.getStaffMember_Full_name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_MEMBER__EMAIL = eINSTANCE.getStaffMember_Email();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_MEMBER__PASSWORD = eINSTANCE.getStaffMember_Password();

		/**
		 * The meta object literal for the '<em><b>Pers no</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_MEMBER__PERS_NO = eINSTANCE.getStaffMember_Pers_no();

		/**
		 * The meta object literal for the '<em><b>Phone no</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_MEMBER__PHONE_NO = eINSTANCE.getStaffMember_Phone_no();

		/**
		 * The meta object literal for the '<em><b>Role name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_MEMBER__ROLE_NAME = eINSTANCE.getStaffMember_Role_name();

		/**
		 * The meta object literal for the '{@link CodePack.DataModels.impl.GuestImpl <em>Guest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodePack.DataModels.impl.GuestImpl
		 * @see CodePack.DataModels.impl.DataModelsPackageImpl#getGuest()
		 * @generated
		 */
		EClass GUEST = eINSTANCE.getGuest();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__NAME = eINSTANCE.getGuest_Name();

		/**
		 * The meta object literal for the '<em><b>Booking id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__BOOKING_ID = eINSTANCE.getGuest_Booking_id();

		/**
		 * The meta object literal for the '{@link CodePack.DataModels.impl.BillImpl <em>Bill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodePack.DataModels.impl.BillImpl
		 * @see CodePack.DataModels.impl.DataModelsPackageImpl#getBill()
		 * @generated
		 */
		EClass BILL = eINSTANCE.getBill();

		/**
		 * The meta object literal for the '<em><b>Booking id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__BOOKING_ID = eINSTANCE.getBill_Booking_id();

		/**
		 * The meta object literal for the '<em><b>Rooms booked</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL__ROOMS_BOOKED = eINSTANCE.getBill_Rooms_booked();

		/**
		 * The meta object literal for the '<em><b>Services ordered</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL__SERVICES_ORDERED = eINSTANCE.getBill_Services_ordered();

		/**
		 * The meta object literal for the '<em><b>Total price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__TOTAL_PRICE = eINSTANCE.getBill_Total_price();

		/**
		 * The meta object literal for the '{@link CodePack.DataModels.impl.BookingImpl <em>Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodePack.DataModels.impl.BookingImpl
		 * @see CodePack.DataModels.impl.DataModelsPackageImpl#getBooking()
		 * @generated
		 */
		EClass BOOKING = eINSTANCE.getBooking();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__ID = eINSTANCE.getBooking_Id();

		/**
		 * The meta object literal for the '<em><b>Date check in</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__DATE_CHECK_IN = eINSTANCE.getBooking_Date_check_in();

		/**
		 * The meta object literal for the '<em><b>Date check out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__DATE_CHECK_OUT = eINSTANCE.getBooking_Date_check_out();

		/**
		 * The meta object literal for the '<em><b>Is Checked In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__IS_CHECKED_IN = eINSTANCE.getBooking_IsCheckedIn();

		/**
		 * The meta object literal for the '<em><b>Total price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__TOTAL_PRICE = eINSTANCE.getBooking_Total_price();

		/**
		 * The meta object literal for the '<em><b>Contact name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__CONTACT_NAME = eINSTANCE.getBooking_Contact_name();

		/**
		 * The meta object literal for the '<em><b>Contact phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__CONTACT_PHONE = eINSTANCE.getBooking_Contact_phone();

		/**
		 * The meta object literal for the '<em><b>Contact email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__CONTACT_EMAIL = eINSTANCE.getBooking_Contact_email();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__ROOM = eINSTANCE.getBooking_Room();

		/**
		 * The meta object literal for the '<em><b>Customer id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__CUSTOMER_ID = eINSTANCE.getBooking_Customer_id();

		/**
		 * The meta object literal for the '<em><b>Payment id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__PAYMENT_ID = eINSTANCE.getBooking_Payment_id();

		/**
		 * The meta object literal for the '<em><b>Bonus points used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__BONUS_POINTS_USED = eINSTANCE.getBooking_Bonus_points_used();

	}

} //DataModelsPackage
