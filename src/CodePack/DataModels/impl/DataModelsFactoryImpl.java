/**
 */
package CodePack.DataModels.impl;

import CodePack.DataModels.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataModelsFactoryImpl extends EFactoryImpl implements DataModelsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataModelsFactory init() {
		try {
			DataModelsFactory theDataModelsFactory = (DataModelsFactory)EPackage.Registry.INSTANCE.getEFactory(DataModelsPackage.eNS_URI);
			if (theDataModelsFactory != null) {
				return theDataModelsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataModelsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModelsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DataModelsPackage.ROOM: return createRoom();
			case DataModelsPackage.ROOM_TYPE: return createRoomType();
			case DataModelsPackage.CUSTOMER: return createCustomer();
			case DataModelsPackage.PAYMENT_DATA: return createPaymentData();
			case DataModelsPackage.ROOM_BOOKED: return createRoomBooked();
			case DataModelsPackage.SERVICE_TYPE: return createServiceType();
			case DataModelsPackage.EXTRA_SERVICE: return createExtraService();
			case DataModelsPackage.STAFF_ROLE: return createStaffRole();
			case DataModelsPackage.STAFF_MEMBER: return createStaffMember();
			case DataModelsPackage.GUEST: return createGuest();
			case DataModelsPackage.BILL: return createBill();
			case DataModelsPackage.BOOKING: return createBooking();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType createRoomType() {
		RoomTypeImpl roomType = new RoomTypeImpl();
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentData createPaymentData() {
		PaymentDataImpl paymentData = new PaymentDataImpl();
		return paymentData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomBooked createRoomBooked() {
		RoomBookedImpl roomBooked = new RoomBookedImpl();
		return roomBooked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType createServiceType() {
		ServiceTypeImpl serviceType = new ServiceTypeImpl();
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtraService createExtraService() {
		ExtraServiceImpl extraService = new ExtraServiceImpl();
		return extraService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffRole createStaffRole() {
		StaffRoleImpl staffRole = new StaffRoleImpl();
		return staffRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffMember createStaffMember() {
		StaffMemberImpl staffMember = new StaffMemberImpl();
		return staffMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guest createGuest() {
		GuestImpl guest = new GuestImpl();
		return guest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bill createBill() {
		BillImpl bill = new BillImpl();
		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking createBooking() {
		BookingImpl booking = new BookingImpl();
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModelsPackage getDataModelsPackage() {
		return (DataModelsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataModelsPackage getPackage() {
		return DataModelsPackage.eINSTANCE;
	}

} //DataModelsFactoryImpl
