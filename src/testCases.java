import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import com.almworks.sqlite4java.SQLiteException;

import CodePack.CodePackFactory;
import CodePack.DataBank;
import CodePack.Backend.BackendFactory;
import CodePack.Backend.CheckInHandler;
import CodePack.Backend.CustomerHandler;
import CodePack.Backend.ReceptionHandler;
import CodePack.DataModels.Booking;
import CodePack.DataModels.DataModelsFactory;
import CodePack.DataModels.ExtraService;
import CodePack.DataModels.Guest;
import CodePack.DataModels.Room;
import CodePack.DataModels.ServiceType;


public class testCases {

	public static void main(String[] args) throws SQLiteException, ParseException {
		// TODO Auto-generated method stub
		mainClass.loadDatabase();
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		ReceptionHandler rh = BackendFactory.eINSTANCE.createReceptionHandler();
		CheckInHandler checkInHandler = BackendFactory.eINSTANCE.createCheckInHandler();
		CustomerHandler ch = BackendFactory.eINSTANCE.createCustomerHandler();
		//Booking Test cases start.
		
		//GetAvailableRooms start
		EList<Room> right = new BasicEList<Room>();
		EList<Room> wrong = new BasicEList<Room>();
		
		String date1 = "2015/05/13 12:00";
		String date2 = "2015/05/14 12:00";
		String date3 = "2015/05/17 12:00";
		Date date_start = null;
		Date date_end = null;
		Date date_end_wrong = null;
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		date_start = format.parse(date1);
		date_end = format.parse(date2);
		date_end_wrong = format.parse(date3);
		System.out.println(date_end_wrong);
		right = rh.getAvailableRooms(date_start, date_end);
		System.out.println("This is right date"+right);
		wrong = rh.getAvailableRooms(date_start, date_end_wrong);
		System.out.println("This is wrong date"+wrong);
		//GetAvailableRooms end
		
		//Login start
		String email = "musse@ieee.org";
		String correctPass = "ponnies";
		String wrongPass = "blabla";
		int returntrue = 0;
		int returnfalse = 00;
		
		//Correct Login
		if (ch.login(email, correctPass) == returntrue){
			System.out.println("Login True");
		}
		//Wrong Login
		if(ch.login(email, wrongPass) == returnfalse){
			System.out.println("Login False");
		}
		//Login end
		
		//CreateBookingForCostumer Start
		Date date_check_in = new Date();
		String checkout = "2015/01/20 12:00";
		Date date_check_out = null;
		date_check_out = format.parse(checkout);
		EList<Room> room = new BasicEList<Room>();
		EList<ServiceType> services = new BasicEList<ServiceType>();
		for(Room r : db.getRoomList() ){
			if(r.getNumber() == 101){
				room.add(r);
			}
		}
		
		for(ServiceType st : db.getServiceTypeList() ){
			if(st.getType_name() == "spa"){
				services.add(st);
			}
		}
		
		ExtraService es = DataModelsFactory.eINSTANCE.createExtraService();
		es.setTotal_price(200);
		es.setDate_end(date_check_out);
		es.setDate_start(date_check_in);
		es.setType("Spa");
		db.getExtraServiceList().add(es);
		
		EList<ExtraService> correct = new BasicEList<ExtraService>();
		
		for(ExtraService est : db.getExtraServiceList()){
			if(est.getType() == "Spa"){
				correct.add(est);
			}
		}
		
		
		
		Booking bookingreturn = null;
		bookingreturn = ch.createBookingForCustomer(1, room, correct, 1, date_check_in, date_check_out, 0);
		System.out.println("The returned booking:"+bookingreturn);
		//Fail here we switch checkout date first then checkin.
		
		Booking bookingreturnfalse = null;
		bookingreturnfalse = ch.createBookingForCustomer(1, room, correct, 1, date_check_out, date_check_in, 0);
		//This should return an empty booking with no values.
		System.out.println("Cannot Create Booking:"+bookingreturnfalse);
		//CreateBookingCostumer End
		
		//Booking test cases end
		
		//Test for assign guest
		Booking b = db.getBookingList().iterator().next();
		System.out.println(b.getId());
		checkInHandler.assignGuestToBooking(b.getId(), "Ylva");
		for(Guest g : db.getGuestList()) {
			System.out.println(g.getName());
		}
		
		ReceptionHandler ReceptionHandler = BackendFactory.eINSTANCE.createReceptionHandler();
		
		//checking if booking id exists, true case 
				boolean t;
				t = checkInHandler.validateBooking(1);
				System.out.println(t);
				
				//checking if booking id exists, false case 
				boolean f;
				f = checkInHandler.validateBooking(578);
				System.out.println(f);
				
				//checking if booking id exists, true case 
				boolean s;
				s = ReceptionHandler.validateBooking(1);
				System.out.println(s);
						
				//checking if booking id exists, false case 
				boolean w;
				w = ReceptionHandler.validateBooking(578);
				System.out.println(w);
				
				//is checked in, true
				boolean k;
				k = ReceptionHandler.isCheckedIn(1);
				System.out.println(k);
					
				//is checked in, false
				boolean c;
				c = ReceptionHandler.isCheckedIn(578);
				System.out.println(c);
						
				// assign guest, found booking id
				checkInHandler.assignGuestToBooking(1, "Ylva");
				for(Guest a : db.getGuestList()) {
					System.out.println(a.getName());
				}
				//assign guest, with not found booking id, showing no assigned name in the list 
				checkInHandler.assignGuestToBooking(578, "Erik");
					for(Guest e : db.getGuestList()) {
					System.out.println(e.getName());
					}
		
	}

}
