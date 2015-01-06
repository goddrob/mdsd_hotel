/**
 */
package CodePack.Backend.impl;

import BankingModel.BankComponent;
import CodePack.Backend.BackendPackage;
import CodePack.Backend.ReceptionHandler;
import CodePack.CodePackPackage;
import CodePack.DataModels.Booking;
import CodePack.DataModels.ExtraService;
import CodePack.DataModels.PaymentData;
import CodePack.DataModels.Room;
import CodePack.DataModels.RoomBooked;
import CodePack.DataModels.ServiceType;
import CodePack.DataModels.StaffMember;
import CodePack.DataModels.StaffRole;
import CodePack.CodePackFactory;
import CodePack.DataBank;
import CodePack.ICheckIn;
import CodePack.IStaffAuthentication;
import CodePack.Shared.ContactData;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reception Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CodePack.Backend.impl.ReceptionHandlerImpl#getBankComponent <em>Bank Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReceptionHandlerImpl extends MinimalEObjectImpl.Container implements ReceptionHandler {
	/**
	 * The cached value of the '{@link #getBankComponent() <em>Bank Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankComponent()
	 * @generated
	 * @ordered
	 */
	protected BankComponent bankComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceptionHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BackendPackage.Literals.RECEPTION_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankComponent getBankComponent() {
		if (bankComponent != null && bankComponent.eIsProxy()) {
			InternalEObject oldBankComponent = (InternalEObject)bankComponent;
			bankComponent = (BankComponent)eResolveProxy(oldBankComponent);
			if (bankComponent != oldBankComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BackendPackage.RECEPTION_HANDLER__BANK_COMPONENT, oldBankComponent, bankComponent));
			}
		}
		return bankComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankComponent basicGetBankComponent() {
		return bankComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBankComponent(BankComponent newBankComponent) {
		BankComponent oldBankComponent = bankComponent;
		bankComponent = newBankComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BackendPackage.RECEPTION_HANDLER__BANK_COMPONENT, oldBankComponent, bankComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking createBooking(ContactData contact_data, PaymentData payment_data, EList<Room> rooms, EList<ExtraService> services, int number_of_guests, Date date_check_in, Date date_check_out) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking createBookingForCustomer(int customer_id, EList<Room> rooms, EList<ExtraService> services, int number_of_guests, Date date_check_in, Date date_check_out) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean updateRoomForBooking(int booking_id, int old_room, int new_room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean updateServiceForBooking(int old_service_id, ExtraService new_service) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Room> getAvailableRooms(Date date_start, Date date_end) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EList<Room> rooms = new BasicEList<Room>();
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		for(Room r : db.getRoomList()){
			boolean available = true;
			for(RoomBooked rb : db.getRoomBookedList()){
				if (r.getNumber() == rb.getRoom_number()) {
					if (!((date_start.after(rb.getDate_start()) && date_end.before(rb.getDate_start())) 
							|| (date_start.after(rb.getDate_end()) && date_end.after(rb.getDate_end()))))
					available = false;
					
				}
			}
			if (available) rooms.add(r);
			
		}
		
			return rooms;

		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ServiceType> getAvailableServices() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		EList<ServiceType> s = db.getServiceTypeList();
		return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isRoomAvailable(int room_number, Date date_start, Date date_end) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		for(RoomBooked r : db.getRoomBookedList()) {
			if((room_number == r.getRoom_number() && date_start.before(r.getDate_start()) && date_end.before(r.getDate_start())) ||
			(room_number == r.getRoom_number() && date_start.after(r.getDate_end()) && date_end.after(r.getDate_end()))){
			return true;
			
		}else{ return false;
		
		
		}
	}
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> getBookingsForCustomer(int customer_id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking getBookingForId(int booking_id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean updateTimeForBooking(int booking_id, Date new_check_in, Date new_check_out) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean cancelBooking(int booking_id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentData getPaymentForBooking(int booking_id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendComfimationMail(Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooking(int booking_id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking assignGuestToBooking(int booking_id, String guest_name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffMember login(String e_mail, String password) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffRole getRoleForStaff(String pers_no) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckedIn(int booking_id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String generateReceiptForBooking(int booking_id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double generateBill(int booking_id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BackendPackage.RECEPTION_HANDLER__BANK_COMPONENT:
				if (resolve) return getBankComponent();
				return basicGetBankComponent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BackendPackage.RECEPTION_HANDLER__BANK_COMPONENT:
				setBankComponent((BankComponent)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BackendPackage.RECEPTION_HANDLER__BANK_COMPONENT:
				setBankComponent((BankComponent)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BackendPackage.RECEPTION_HANDLER__BANK_COMPONENT:
				return bankComponent != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ICheckIn.class) {
			switch (baseOperationID) {
				case CodePackPackage.ICHECK_IN___VALIDATE_BOOKING__INT: return BackendPackage.RECEPTION_HANDLER___VALIDATE_BOOKING__INT;
				case CodePackPackage.ICHECK_IN___ASSIGN_GUEST_TO_BOOKING__INT_STRING: return BackendPackage.RECEPTION_HANDLER___ASSIGN_GUEST_TO_BOOKING__INT_STRING;
				default: return -1;
			}
		}
		if (baseClass == IStaffAuthentication.class) {
			switch (baseOperationID) {
				case CodePackPackage.ISTAFF_AUTHENTICATION___LOGIN__STRING_STRING: return BackendPackage.RECEPTION_HANDLER___LOGIN__STRING_STRING;
				case CodePackPackage.ISTAFF_AUTHENTICATION___GET_ROLE_FOR_STAFF__STRING: return BackendPackage.RECEPTION_HANDLER___GET_ROLE_FOR_STAFF__STRING;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BackendPackage.RECEPTION_HANDLER___CREATE_BOOKING__CONTACTDATA_PAYMENTDATA_ELIST_ELIST_INT_DATE_DATE:
				return createBooking((ContactData)arguments.get(0), (PaymentData)arguments.get(1), (EList<Room>)arguments.get(2), (EList<ExtraService>)arguments.get(3), (Integer)arguments.get(4), (Date)arguments.get(5), (Date)arguments.get(6));
			case BackendPackage.RECEPTION_HANDLER___CREATE_BOOKING_FOR_CUSTOMER__INT_ELIST_ELIST_INT_DATE_DATE:
				return createBookingForCustomer((Integer)arguments.get(0), (EList<Room>)arguments.get(1), (EList<ExtraService>)arguments.get(2), (Integer)arguments.get(3), (Date)arguments.get(4), (Date)arguments.get(5));
			case BackendPackage.RECEPTION_HANDLER___UPDATE_ROOM_FOR_BOOKING__INT_INT_INT:
				return updateRoomForBooking((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case BackendPackage.RECEPTION_HANDLER___UPDATE_SERVICE_FOR_BOOKING__INT_EXTRASERVICE:
				return updateServiceForBooking((Integer)arguments.get(0), (ExtraService)arguments.get(1));
			case BackendPackage.RECEPTION_HANDLER___GET_AVAILABLE_ROOMS__DATE_DATE:
				return getAvailableRooms((Date)arguments.get(0), (Date)arguments.get(1));
			case BackendPackage.RECEPTION_HANDLER___GET_AVAILABLE_SERVICES:
				return getAvailableServices();
			case BackendPackage.RECEPTION_HANDLER___IS_ROOM_AVAILABLE__INT_DATE_DATE:
				return isRoomAvailable((Integer)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2));
			case BackendPackage.RECEPTION_HANDLER___GET_BOOKINGS_FOR_CUSTOMER__INT:
				return getBookingsForCustomer((Integer)arguments.get(0));
			case BackendPackage.RECEPTION_HANDLER___GET_BOOKING_FOR_ID__INT:
				return getBookingForId((Integer)arguments.get(0));
			case BackendPackage.RECEPTION_HANDLER___UPDATE_TIME_FOR_BOOKING__INT_DATE_DATE:
				return updateTimeForBooking((Integer)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2));
			case BackendPackage.RECEPTION_HANDLER___CANCEL_BOOKING__INT:
				return cancelBooking((Integer)arguments.get(0));
			case BackendPackage.RECEPTION_HANDLER___GET_PAYMENT_FOR_BOOKING__INT:
				return getPaymentForBooking((Integer)arguments.get(0));
			case BackendPackage.RECEPTION_HANDLER___SEND_COMFIMATION_MAIL__BOOKING:
				sendComfimationMail((Booking)arguments.get(0));
				return null;
			case BackendPackage.RECEPTION_HANDLER___VALIDATE_BOOKING__INT:
				return validateBooking((Integer)arguments.get(0));
			case BackendPackage.RECEPTION_HANDLER___ASSIGN_GUEST_TO_BOOKING__INT_STRING:
				return assignGuestToBooking((Integer)arguments.get(0), (String)arguments.get(1));
			case BackendPackage.RECEPTION_HANDLER___LOGIN__STRING_STRING:
				return login((String)arguments.get(0), (String)arguments.get(1));
			case BackendPackage.RECEPTION_HANDLER___GET_ROLE_FOR_STAFF__STRING:
				return getRoleForStaff((String)arguments.get(0));
			case BackendPackage.RECEPTION_HANDLER___GENERATE_RECEIPT_FOR_BOOKING__INT:
				return generateReceiptForBooking((Integer)arguments.get(0));
			case BackendPackage.RECEPTION_HANDLER___GENERATE_BILL__INT:
				return generateBill((Integer)arguments.get(0));
			case BackendPackage.RECEPTION_HANDLER___IS_CHECKED_IN__INT:
				return isCheckedIn((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReceptionHandlerImpl
