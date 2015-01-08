/**
 */
package CodePack.Backend.impl;


import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import BankingModel.BankComponent;
import CodePack.CodePackFactory;
import CodePack.DataBank;
import CodePack.Backend.BackendPackage;
import CodePack.Backend.CustomerHandler;
import CodePack.DataModels.Booking;
import CodePack.DataModels.Customer;
import CodePack.DataModels.DataModelsFactory;
import CodePack.DataModels.ExtraService;
import CodePack.DataModels.PaymentData;
import CodePack.DataModels.Room;
import CodePack.DataModels.RoomBooked;
import CodePack.DataModels.RoomType;
import CodePack.DataModels.ServiceType;
import CodePack.Shared.ContactData;

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
	 * @generated NOT
	 */
	public Booking createBooking(ContactData contact_data, PaymentData payment_data, EList<Room> rooms, EList<ExtraService> services, int number_of_guests, Date date_check_in, Date date_check_out) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		Booking b = DataModelsFactory.eINSTANCE.createBooking();
		RoomBooked rb = DataModelsFactory.eINSTANCE.createRoomBooked();
		EList<RoomType> rt = new BasicEList<RoomType>();
		
		if(date_check_in.before(date_check_out)){
	// Find out the time difference in days		
			long diff = date_check_out.getTime() - date_check_in.getTime();
			long diffdays = diff/(24*60*60*1000);
	// Calculate the total price		
			for(Room r: rooms) {
				RoomType room1 = DataModelsFactory.eINSTANCE.createRoomType();
				room1.setTypename(r.getRoom_type());
			}for(RoomType rt1 : rt){
				for(RoomType dbrt : db.getRoomTypeList()){
					if(dbrt.getTypename().equals(rt1.getTypename())){
						b.setTotal_price(rt1.getRate()*diffdays);
						
					}
				}
			}
			
			b.setDate_check_in(date_check_in);
			b.setDate_check_out(date_check_out);
			b.setIsCheckedIn(false);
			b.setContact_name(contact_data.getFull_name());
			b.setContact_email(contact_data.getE_mail());
			b.setContact_phone(contact_data.getPhone_no());
			b.setPayment_id(payment_data.getId());
		// Find the biggest ID and set new booking id +1
			int max = 0;
			for (Booking book : db.getBookingList()) {
				if(book.getId() > max){
					max = book.getId();
				}
			}
			b.setId(max+1);
			//Needs to be checked!

			for(Room rtb : rooms){
				b.setRoom(rtb);
			}
			
			rb.setBooking(b);
			rb.setBooking_id(max+1);
			rb.setDate_start(date_check_in);
			rb.setDate_end(date_check_out);
			for(Room rta : rooms){
				rb.setRoom_number(rta.getNumber());
				db.getRoomBookedList().add(rb);
			}
			
			db.getBookingList().add(b);
			
		}
		return b;
		
		
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Booking createBookingForCustomer(int customer_id, EList<Room> rooms, EList<ExtraService> services, int number_of_guests, Date date_check_in, Date date_check_out, int bonus_points_used) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		Booking b = DataModelsFactory.eINSTANCE.createBooking();
		RoomBooked rb = DataModelsFactory.eINSTANCE.createRoomBooked();
		EList<RoomType> rt = new BasicEList<RoomType>();
		
		
		if(date_check_in.before(date_check_out)){
	// Find out the time difference in days		
			long diff = date_check_out.getTime() - date_check_in.getTime();
			long diffdays = diff/(24*60*60*1000);
	// Calculate the total price
			double tprice = 0;
			for(Room r : rooms){
				for(RoomType rt1 : db.getRoomTypeList()){
					if(r.getRoom_type() == rt1.getTypename()){
						tprice += rt1.getRate()*diffdays;
					}
				}
			}
			
			
			b.setTotal_price(tprice);
			
			b.setCustomer_id(customer_id);
			b.setDate_check_in(date_check_in);
			b.setDate_check_out(date_check_out);
			b.setIsCheckedIn(false);
			
			
		//Find the correct customer by id and add all info
			for (Customer c : db.getCustomerList()){
				if(c.getCustomer_id() == customer_id){
					b.setContact_name(c.getFirst_name() + c.getLast_name());
					b.setContact_email(c.getE_mail());
					b.setContact_phone(c.getPhone_no());
					b.setPayment_id(c.getPayment_id());
					b.setBonus_points_used(c.getBonus_points()-bonus_points_used);
				}
				
			}
		// Find the biggest ID and set new booking id +1
			int max = 0;
			for (Booking book : db.getBookingList()) {
				if(book.getId() > max){
					max = book.getId();
				}
			}
			b.setId(max+1);
			//setroom/setroom_number needs to be checked
			
			for(Room rtb : rooms){
				b.setRoom(rtb);
			}
			
			rb.setBooking(b);
			rb.setBooking_id(max+1);
			rb.setDate_start(date_check_in);
			rb.setDate_end(date_check_out);
			for(Room rta : rooms){
				rb.setRoom_number(rta.getNumber());
			}
			System.out.println(b);
			db.getRoomBookedList().add(rb);
			db.getBookingList().add(b);
			
		}
		return b;
		
		
		
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean updateRoomForBooking(int booking_id, int old_room, int new_room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
        DataBank db = CodePackFactory.eINSTANCE.createDataBank();
        for(RoomBooked rb : db.getRoomBookedList()){
        	Date today = new Date();
        	long diff = rb.getDate_start().getTime() - today.getTime();
			long hour = diff/(3600*1000);
			if(booking_id == rb.getBooking_id() && hour > 24 && old_room == rb.getRoom_number() && new_room != rb.getRoom_number()){
				rb.setRoom_number(old_room);
				db.getRoomList().remove(old_room);
				for(Room r: db.getRoomList()) {
					if (new_room == r.getNumber()) {
						r.setNumber(new_room);
						db.getRoomList().add(r);
					}				
				}
				return true;
			}				
		}return false;	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean updateServiceForBooking(int old_service_id, ExtraService new_service) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
				for(ExtraService es:db.getExtraServiceList()){
					Date today = new Date();
					long diff = es.getDate_start().getTime() - today.getTime();
					long hour = diff/(3600*1000);
					if(old_service_id == es.getBooking_id() && hour > 24) {
						db.getExtraServiceList().add(new_service);
					}return true;
			}
				return false;
		//throw new UnsupportedOperationException();
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
					if (!((date_start.before(rb.getDate_start()) && date_end.before(rb.getDate_start()))
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
	 * @generated NOT
	 */
	public EList<Booking> getBookingsForCustomer(int customer_id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		EList<Booking> list = new BasicEList<Booking>();
		for (Booking b : db.getBookingList()){
			if (b.getCustomer_id() == customer_id) list.add(b);
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Booking getBookingForId(int booking_id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		for(Booking b:db.getBookingList()){
			if(b.getId() == booking_id){
				return b;
			}
		}
		
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean updateTimeForBooking(int booking_id, Date new_check_in, Date new_check_out) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		for(Booking b : db.getBookingList()) {
			// check if 24 hours before check-in time
			Date today = new Date();
			long diff = b.getDate_check_in().getTime() - today.getTime();
			long hour = diff/(3600*1000);
			if(booking_id == b.getId() && hour > 24 && !(new_check_in.equals(b.getDate_check_in()) && new_check_out.equals(b.getDate_check_out()))) { 
				b.setDate_check_in(new_check_in);
				b.setDate_check_out(new_check_out);
				db.getBookingList().add(b);
				return true;
			}
		} return false;
		
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean cancelBooking(int booking_id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		for(Booking b:db.getBookingList()) {
			Date today = new Date();
			long diff = b.getDate_check_in().getTime() - today.getTime();
			long hour = diff/(3600*1000);
			if(booking_id == b.getId() && hour > 24) {
				db.getBookingList().remove(b);
				return true;
			} else
				return false;
		}
			
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PaymentData getPaymentForBooking(int booking_id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		for(Booking b : db.getBookingList()){
			if(b.getId() == booking_id){
				for(PaymentData p : db.getPaymentDataList()){
					if(p.getId() == b.getPayment_id()){
						return p;
					}
				}
			}
		}		
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
	 * @generated NOT
	 */
	public boolean isEmailAvailable(String e_mail) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		
		for(Customer c : db.getCustomerList()){
			if(!(e_mail == c.getE_mail())){
				return true;
			}else { return false;
				
			}
		}
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
	 * @generated NOT
	 */
	public boolean updateCustomerPwd(int customer_id, String pwd_old, String pwd_new) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		for (Customer c : db.getCustomerList()){
			if ((c.getCustomer_id() == customer_id) && (c.getPassword().equals(pwd_old)))
			{
				db.getCustomerList().get(db.getCustomerList().indexOf(c)).setPassword(pwd_new);
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean updateCustomerInfo(String e_mail, String phone_no, int customer_id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean registerCustomer(String e_mail, String password, Date date_of_birth, int phone_no, String first_name, String last_name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		Customer c = DataModelsFactory.eINSTANCE.createCustomer();
		int max = 0;
		for (Customer c1 : db.getCustomerList()) {
			if(c1.getCustomer_id() > max){
				max = c1.getCustomer_id();
			}
		}
		c.setCustomer_id(max+1);
		c.setFirst_name(first_name);
		c.setLast_name(last_name);
		c.setPhone_no(phone_no);
		c.setDate_of_birth(date_of_birth);
		c.setE_mail(e_mail);
		c.setPassword(password);
		c.setBonus_points(0);
		
		db.getCustomerList().add(c);
		
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
			case BackendPackage.CUSTOMER_HANDLER___CREATE_BOOKING_FOR_CUSTOMER__INT_ELIST_ELIST_INT_DATE_DATE_INT:
				return createBookingForCustomer((Integer)arguments.get(0), (EList<Room>)arguments.get(1), (EList<ExtraService>)arguments.get(2), (Integer)arguments.get(3), (Date)arguments.get(4), (Date)arguments.get(5), (Integer)arguments.get(6));
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
			case BackendPackage.CUSTOMER_HANDLER___UPDATE_CUSTOMER_INFO__STRING_STRING_INT:
				return updateCustomerInfo((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
			case BackendPackage.CUSTOMER_HANDLER___REGISTER_CUSTOMER__STRING_STRING_DATE_INT_STRING_STRING:
				return registerCustomer((String)arguments.get(0), (String)arguments.get(1), (Date)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
			case BackendPackage.CUSTOMER_HANDLER___GET_CUSTOMER_INFO__INT:
				return getCustomerInfo((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CustomerHandlerImpl
