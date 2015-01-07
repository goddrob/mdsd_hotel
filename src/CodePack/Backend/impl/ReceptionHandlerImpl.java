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
import CodePack.CodePackPackage;
import CodePack.DataBank;
import CodePack.ICheckIn;
import CodePack.IStaffAuthentication;
import CodePack.Backend.BackendPackage;
import CodePack.Backend.ReceptionHandler;
import CodePack.DataModels.Bill;
import CodePack.DataModels.Booking;
import CodePack.DataModels.Customer;
import CodePack.DataModels.DataModelsFactory;
import CodePack.DataModels.ExtraService;
import CodePack.DataModels.Guest;
import CodePack.DataModels.PaymentData;
import CodePack.DataModels.Room;
import CodePack.DataModels.RoomBooked;
import CodePack.DataModels.RoomType;
import CodePack.DataModels.ServiceType;
import CodePack.DataModels.StaffMember;
import CodePack.DataModels.StaffRole;
import CodePack.Shared.ContactData;

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
	 * @generated NOT
	 */
	public Booking createBooking(ContactData contact_data, PaymentData payment_data, EList<Room> rooms, EList<ExtraService> services, int number_of_guests, Date date_check_in, Date date_check_out) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//IMPORTANT: Is there any use of number_of_guests?
		
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
			if(booking_id == rb.getBooking_id() && old_room == rb.getRoom_number() && new_room != rb.getRoom_number()){
				for(Room r: db.getRoomList()) {
					if (new_room == r.getNumber());
				}
				return true;
			}
				return false;
			
		}
		
		throw new UnsupportedOperationException();
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
					if(old_service_id == es.getBooking_id()) {
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
	 * @generated NOT
	 */
	public EList<Booking> getBookingsForCustomer(int customer_id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		EList<Booking> bookings = new BasicEList<Booking>();

		for(Booking b : db.getBookingList()){
			if(b.getCustomer_id() == customer_id){
				bookings.add(b);
			}
		}return bookings;

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
			if(booking_id == b.getId() && !(new_check_in.equals(b.getDate_check_in()) && new_check_out.equals(b.getDate_check_out()))) { 
				b.setDate_check_in(new_check_in);
				b.setDate_check_out(new_check_out);
				db.getBookingList().add(b);
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
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateBooking(int booking_id) {
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		for(Booking b : db.getBookingList()) {
			Date today = new Date();
			if (b.getId() == booking_id && b.getDate_check_in().before(today)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Booking assignGuestToBooking(int booking_id, String guest_name) {
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		Booking bo = null;
		for(Booking b : db.getBookingList()){
			if (b.getId() == booking_id) {
				bo = b;
				Guest g = DataModelsFactory.eINSTANCE.createGuest();
				g.setName(guest_name);
				g.setBooking_id(booking_id);
				db.getGuestList().add(g);
			}
			
		} 
		return bo;
		// Ensure that you remove @generated or mark it @generated NOT	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public StaffMember login(String e_mail, String password) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		
		for(StaffMember sm : db.getStaffMemberList()){
			if(e_mail == sm.getEmail() && password == sm.getPassword()){
				return sm;
			}
		}
		
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public StaffRole getRoleForStaff(String pers_no) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		for (StaffMember sm : db.getStaffMemberList()) {
			if (sm.getPers_no().equals(pers_no)) 
				for (StaffRole sr : db.getStaffRoleList())
					if (sr.getName().equals(sm.getRole_name())) return sr;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isCheckedIn(int booking_id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		
		for(Booking b : db.getBookingList()){
			if(b.getId() == booking_id && b.isCheckedIn() == true){
				return true;
			}
			return false;	
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String generateReceipt(Bill bill) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		
		//ADD BONUS POINTS
		int c_id = 0;
		for (Booking b: db.getBookingList()){
			if (bill.getBooking_id() == b.getId())
				c_id = b.getCustomer_id();
		}
		if (c_id > 0) {
			for (Customer c : db.getCustomerList())
				if (c.getCustomer_id() == c_id){
					int points = c.getBonus_points();
					db.getCustomerList().get(db.getCustomerList().indexOf(c)).setBonus_points(points+(int)(bill.getTotal_price()));
					}
		}
		// END BONUS POINTS
		
		
		String receipt = "========= HOTEL =========\n";
		int[] count = new int[db.getRoomTypeList().size()];
		for (int n : count) n = 0;
		for (Room r : bill.getRooms_booked()){
			for (RoomType type : db.getRoomTypeList()){
				if(r.getRoom_type().equals(type.getTypename())){
					count[db.getRoomTypeList().indexOf(type)]++;
				}
			}
		}
		for (int i = 0;i<count.length;i++){
			if (count[i]>0)
				receipt+= "Room:" + count[i] + " X " +  db.getRoomTypeList().get(i).getTypename() + "\n";
		}
		for (ExtraService es : db.getExtraServiceList()){
			receipt += es.getType() + "\n"; 
		}
		receipt += "Total:" + bill.getTotal_price();
		return receipt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Bill generateBill(int booking_id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		Bill bill = DataModelsFactory.eINSTANCE.createBill();
		bill.setBooking_id(booking_id);
		double total_price = 0;
		Booking booking = DataModelsFactory.eINSTANCE.createBooking();
		for (Booking b : db.getBookingList())
			if(b.getId() == booking_id) booking = b;
		
		int days = (int)(booking.getDate_check_out().getTime() - booking.getDate_check_in().getTime())/(1000 * 60 * 60 * 24);
		//Calendar c = booking.getDate_check_out();
		//rooms
		for (RoomBooked rb : db.getRoomBookedList()){
			if (rb.getBooking_id() == booking_id){
				for (Room r : db.getRoomList()) {
					if (r.getNumber() == rb.getRoom_number()){
						bill.getRooms_booked().add(r);
						for (RoomType rt : db.getRoomTypeList()){
							if (r.getRoom_type().equals(rt.getTypename())){
								total_price += days * rt.getRate();
							}
						}
					}
				}
			}
		}
		//services
		for (ExtraService es : db.getExtraServiceList()){
			if (es.getBooking_id() == booking_id) {
				bill.getServices_ordered().add(es);
				total_price += es.getTotal_price();
			}
		}
		total_price -= (booking.getBonus_points_used()/10);
		
		bill.setTotal_price(total_price);
		return bill;
		
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
			case BackendPackage.RECEPTION_HANDLER___CREATE_BOOKING_FOR_CUSTOMER__INT_ELIST_ELIST_INT_DATE_DATE_INT:
				return createBookingForCustomer((Integer)arguments.get(0), (EList<Room>)arguments.get(1), (EList<ExtraService>)arguments.get(2), (Integer)arguments.get(3), (Date)arguments.get(4), (Date)arguments.get(5), (Integer)arguments.get(6));
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
			case BackendPackage.RECEPTION_HANDLER___GENERATE_BILL__INT:
				return generateBill((Integer)arguments.get(0));
			case BackendPackage.RECEPTION_HANDLER___IS_CHECKED_IN__INT:
				return isCheckedIn((Integer)arguments.get(0));
			case BackendPackage.RECEPTION_HANDLER___GENERATE_RECEIPT__BILL:
				return generateReceipt((Bill)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReceptionHandlerImpl
