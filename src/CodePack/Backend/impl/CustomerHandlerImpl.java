/**
 */
package CodePack.Backend.impl;


import BankingModel.BankComponent;
import CodePack.CodePackFactory;
import CodePack.DataBank;
import CodePack.Backend.BackendPackage;
import CodePack.Backend.CustomerHandler;
import CodePack.DataModels.Booking;
import CodePack.DataModels.Customer;
import CodePack.DataModels.ExtraService;
import CodePack.DataModels.PaymentData;
import CodePack.DataModels.Room;
import CodePack.DataModels.RoomBooked;
import CodePack.DataModels.ServiceType;
import CodePack.Shared.ContactData;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CodePack.Backend.impl.CustomerHandlerImpl#getBankComponent <em>Bank Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomerHandlerImpl extends MinimalEObjectImpl.Container implements CustomerHandler {
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
	protected CustomerHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BackendPackage.Literals.CUSTOMER_HANDLER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BackendPackage.CUSTOMER_HANDLER__BANK_COMPONENT, oldBankComponent, bankComponent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BackendPackage.CUSTOMER_HANDLER__BANK_COMPONENT, oldBankComponent, bankComponent));
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
	 * @generated
	 */
	public EList<Room> getAvailableRooms(Date date_start, Date date_end) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	 * @generated NOT
	 */
	public void sendComfimationMail(Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		String to = booking.getContact_email();
		String from = "Hotel@Habibi.com";
		String subject = "Hotel Habibi Confirmation Email";
		String name = booking.getContact_name();
		Date checkin = booking.getDate_check_in();
		Date checkout = booking.getDate_check_out();
		Double price = booking.getTotal_price();
		
		System.out.println("to: "+to+", From: "+from);
		System.out.println("Subject: "+subject);
		System.out.println("Dear "+name+", You have selected to stay with us from "+checkin+"until "+checkout+"."
				+ " The total Price will be: "+price+". If you have any questions regarding the booking,"
						+ "please contact us at Hotel@Habibi.com. Have a great day.");
		
		
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEmailAvailable(String e_mail) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int login(String e_mail, String password) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		
		for(Customer c : db.getCustomerList()){
			if(e_mail == c.getE_mail() && password == c.getPassword()){
				return c.getCustomer_id();
			}else{
				return 00;
			}
		}
		
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean updateCustomerCC(int customer_id, String cc_number, String cc_ccv, int cc_month, int cc_year, String name_first, String name_last) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean updateCustomerPwd(int customer_id, String pwd_old, String pwd_new) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean updateCustomerInfo(String e_mail, String phone_no) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean registerCustomer(String e_mail, String password, Date date_of_birth, int phone_no) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomerInfo(int customer_id) {
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
			case BackendPackage.CUSTOMER_HANDLER__BANK_COMPONENT:
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
			case BackendPackage.CUSTOMER_HANDLER__BANK_COMPONENT:
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
			case BackendPackage.CUSTOMER_HANDLER__BANK_COMPONENT:
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
			case BackendPackage.CUSTOMER_HANDLER__BANK_COMPONENT:
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BackendPackage.CUSTOMER_HANDLER___CREATE_BOOKING__CONTACTDATA_PAYMENTDATA_ELIST_ELIST_INT_DATE_DATE:
				return createBooking((ContactData)arguments.get(0), (PaymentData)arguments.get(1), (EList<Room>)arguments.get(2), (EList<ExtraService>)arguments.get(3), (Integer)arguments.get(4), (Date)arguments.get(5), (Date)arguments.get(6));
			case BackendPackage.CUSTOMER_HANDLER___CREATE_BOOKING_FOR_CUSTOMER__INT_ELIST_ELIST_INT_DATE_DATE:
				return createBookingForCustomer((Integer)arguments.get(0), (EList<Room>)arguments.get(1), (EList<ExtraService>)arguments.get(2), (Integer)arguments.get(3), (Date)arguments.get(4), (Date)arguments.get(5));
			case BackendPackage.CUSTOMER_HANDLER___UPDATE_ROOM_FOR_BOOKING__INT_INT_INT:
				return updateRoomForBooking((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case BackendPackage.CUSTOMER_HANDLER___UPDATE_SERVICE_FOR_BOOKING__INT_EXTRASERVICE:
				return updateServiceForBooking((Integer)arguments.get(0), (ExtraService)arguments.get(1));
			case BackendPackage.CUSTOMER_HANDLER___GET_AVAILABLE_ROOMS__DATE_DATE:
				return getAvailableRooms((Date)arguments.get(0), (Date)arguments.get(1));
			case BackendPackage.CUSTOMER_HANDLER___GET_AVAILABLE_SERVICES:
				return getAvailableServices();
			case BackendPackage.CUSTOMER_HANDLER___IS_ROOM_AVAILABLE__INT_DATE_DATE:
				return isRoomAvailable((Integer)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2));
			case BackendPackage.CUSTOMER_HANDLER___GET_BOOKINGS_FOR_CUSTOMER__INT:
				return getBookingsForCustomer((Integer)arguments.get(0));
			case BackendPackage.CUSTOMER_HANDLER___GET_BOOKING_FOR_ID__INT:
				return getBookingForId((Integer)arguments.get(0));
			case BackendPackage.CUSTOMER_HANDLER___UPDATE_TIME_FOR_BOOKING__INT_DATE_DATE:
				return updateTimeForBooking((Integer)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2));
			case BackendPackage.CUSTOMER_HANDLER___CANCEL_BOOKING__INT:
				return cancelBooking((Integer)arguments.get(0));
			case BackendPackage.CUSTOMER_HANDLER___GET_PAYMENT_FOR_BOOKING__INT:
				return getPaymentForBooking((Integer)arguments.get(0));
			case BackendPackage.CUSTOMER_HANDLER___SEND_COMFIMATION_MAIL__BOOKING:
				sendComfimationMail((Booking)arguments.get(0));
				return null;
			case BackendPackage.CUSTOMER_HANDLER___IS_EMAIL_AVAILABLE__STRING:
				return isEmailAvailable((String)arguments.get(0));
			case BackendPackage.CUSTOMER_HANDLER___LOGIN__STRING_STRING:
				return login((String)arguments.get(0), (String)arguments.get(1));
			case BackendPackage.CUSTOMER_HANDLER___UPDATE_CUSTOMER_CC__INT_STRING_STRING_INT_INT_STRING_STRING:
				return updateCustomerCC((Integer)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (String)arguments.get(5), (String)arguments.get(6));
			case BackendPackage.CUSTOMER_HANDLER___UPDATE_CUSTOMER_PWD__INT_STRING_STRING:
				return updateCustomerPwd((Integer)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case BackendPackage.CUSTOMER_HANDLER___UPDATE_CUSTOMER_INFO__STRING_STRING:
				return updateCustomerInfo((String)arguments.get(0), (String)arguments.get(1));
			case BackendPackage.CUSTOMER_HANDLER___REGISTER_CUSTOMER__STRING_STRING_DATE_INT:
				return registerCustomer((String)arguments.get(0), (String)arguments.get(1), (Date)arguments.get(2), (Integer)arguments.get(3));
			case BackendPackage.CUSTOMER_HANDLER___GET_CUSTOMER_INFO__INT:
				return getCustomerInfo((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CustomerHandlerImpl
