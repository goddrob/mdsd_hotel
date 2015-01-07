import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import CodePack.CodePackFactory;
import CodePack.DataBank;
import CodePack.Backend.BackendFactory;
import CodePack.Backend.ManagementHandler;
import CodePack.DataModels.Booking;
import CodePack.DataModels.Customer;
import CodePack.DataModels.DataModelsFactory;
import CodePack.DataModels.ExtraService;
import CodePack.DataModels.PaymentData;
import CodePack.DataModels.Room;
import CodePack.DataModels.RoomBooked;
import CodePack.DataModels.RoomType;
import CodePack.DataModels.ServiceType;
import CodePack.DataModels.StaffMember;

import com.almworks.sqlite4java.SQLiteConnection;
import com.almworks.sqlite4java.SQLiteException;
import com.almworks.sqlite4java.SQLiteStatement;


public class mainClass {

	public static void main(String[] args) throws IOException, SQLiteException, ParseException {
		// TODO Auto-generated method stub
		DataBank db1 = CodePackFactory.eINSTANCE.createDataBank();
		DataBank db2 = CodePackFactory.eINSTANCE.createDataBank();
		
	    loadDatabase();
	    
	    
	    ManagementHandler mh = BackendFactory.eINSTANCE.createManagementHandler();
	    
	    System.out.println(mh.registerStaffAccount("Robert", "rob@g.com", "123134TN", 123, "BOSSMAN"));
	    for (StaffMember sm : db2.getStaffMemberList()) System.out.println(sm);
	    
	    System.out.println("DONE");
	    
		System.out.println("######### TEST  ########");
		System.out.println(db2.getRoomList().get(0));
		Room r = db2.getRoomList().get(0);
		db2.getRoomList().indexOf(r);
		db2.getRoomList().get(db2.getRoomList().indexOf(r)).setDescription("null and void");
		System.out.println(db2.getRoomList().get(0));
		//db2.getRoomList().remove(r);
	    
	    for (RoomType rx : db2.getRoomTypeList()){
	    	System.out.println(rx);
	    }
	    for (Room rx : db2.getRoomList()) {
	    	System.out.println(rx);
	    }
	    for (Booking b : db2.getBookingList()){
	    	System.out.println(b);
	    }
	    for (RoomBooked rx : db2.getRoomBookedList()){
	    	System.out.println(rx);
	    }
	    for (Customer c : db2.getCustomerList()){
	    	System.out.println(c);
	    }
	    for (PaymentData pd : db2.getPaymentDataList()){
	    	System.out.println(pd);
	    }
	    DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	    Date d1 = df.parse("2015-05-16 12:00");
	    Date d2 = df.parse("2015-05-19 11:00");
	  
	    sampleAvailableRooms(d1,d2);
	}
	
	public static void sampleAvailableRooms(Date start, Date end){
		System.out.println("Searching between "+start+" and "+end);
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		EList<Room> rs = new BasicEList<Room>();
 		for (Room r : db.getRoomList()) {
			boolean available = true;
			for (RoomBooked rb : db.getRoomBookedList()){
				if (r.getNumber() == rb.getRoom_number()){
					System.out.println("Found room booked: "+ r.getNumber()+ " between " + rb.getDate_start() + " and "+ rb.getDate_end());
					if (!((start.before(rb.getDate_start()) && end.before(rb.getDate_start()))
						|| (start.after(rb.getDate_end()) && end.after(rb.getDate_end()))))
						available = false;	
				}
			}
			if (available) rs.add(r);
		}
	
	
		for (Room r : rs) {
			System.out.println(r);
		}
	}
	
	public static void loadDatabase() throws SQLiteException, ParseException{
		DataBank static_db = CodePackFactory.eINSTANCE.createDataBank();
		SQLiteConnection db = new SQLiteConnection(new File("hoteldb.db3"));
		db.open(true);
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		//Room Types
		SQLiteStatement st = db.prepare("SELECT * FROM RoomType");
		while (st.step()){
			RoomType rt = DataModelsFactory.eINSTANCE.createRoomType();
			rt.setDescription(st.columnString(0));
			rt.setTypename(st.columnString(1));
			rt.setRate(st.columnDouble(2));
			rt.setMax_guests(st.columnInt(3));
			static_db.getRoomTypeList().add(rt);
		}
		st.dispose();
		//Rooms
		st = db.prepare("SELECT * FROM Room");
		while(st.step()){
			Room r = DataModelsFactory.eINSTANCE.createRoom();
			r.setNumber(st.columnInt(0));
			r.setDescription(st.columnString(1));
			r.setIsAvailable(Boolean.valueOf(st.columnString(2)));
			r.setRoom_type(st.columnString(3));
			static_db.getRoomList().add(r);
		}
		st.dispose();
		//Bookings
		st = db.prepare("SELECT * FROM Booking");
		while(st.step()){
			Booking b = DataModelsFactory.eINSTANCE.createBooking();
			b.setId(st.columnInt(0));
			b.setDate_check_in(df.parse(st.columnString(1)));
			b.setDate_check_out(df.parse(st.columnString(2)));
			b.setIsCheckedIn(Boolean.valueOf(st.columnString(3)));
			b.setTotal_price(st.columnDouble(4));
			b.setContact_name(st.columnString(5));
			b.setContact_phone(st.columnInt(6));
			b.setContact_email(st.columnString(7));
			if (!st.columnNull(8)) b.setCustomer_id(st.columnInt(8));
			b.setPayment_id(st.columnInt(9));
			static_db.getBookingList().add(b);
		}
		st.dispose();	
		//Rooms Booked
		st = db.prepare("SELECT * FROM RoomBooked");
		while(st.step()){
			RoomBooked rb = DataModelsFactory.eINSTANCE.createRoomBooked();
			rb.setRoom_number(st.columnInt(0));
			rb.setBooking_id(st.columnInt(1));
			rb.setDate_start(df.parse(st.columnString(2)));
			rb.setDate_end(df.parse(st.columnString(3)));
			static_db.getRoomBookedList().add(rb);
		}
		st.dispose();
		//Payment Data
		st = db.prepare("SELECT * FROM PaymentData");
		while(st.step()){
			PaymentData pd = DataModelsFactory.eINSTANCE.createPaymentData();
			pd.setId(st.columnInt(0));
			pd.setCc_number(st.columnString(1));
			pd.setCc_ccv(st.columnString(2));
			pd.setCc_month(st.columnInt(3));
			pd.setCc_year(st.columnInt(4));
			pd.setCc_first_name(st.columnString(5));
			pd.setCc_last_name(st.columnString(6));
			static_db.getPaymentDataList().add(pd);
		}
		st.dispose();
		
		//Customer
		st = db.prepare("SELECT * FROM Customer");
		while(st.step()){
			Customer c = DataModelsFactory.eINSTANCE.createCustomer();
			c.setFirst_name(st.columnString(0));
			c.setLast_name(st.columnString(1));
			c.setE_mail(st.columnString(2));
			c.setPassword(st.columnString(3));
			c.setDate_of_birth(df.parse(st.columnString(4)));
			c.setPhone_no(st.columnInt(5));
			c.setBonus_points(st.columnInt(6));
			c.setCustomer_id(st.columnInt(7));
			if (!st.columnNull(8)) c.setPayment_id(st.columnInt(8));
			static_db.getCustomerList().add(c);
		}
		st.dispose();
		//Service Type
		st = db.prepare("SELECT * FROM ServiceType");
		while(st.step()){
			ServiceType s = DataModelsFactory.eINSTANCE.createServiceType();
			s.setType_name(st.columnString(0));
			s.setDescription(st.columnString(1));
			s.setPrice(st.columnDouble(2));
			static_db.getServiceTypeList().add(s);
		}
		st.dispose();
		//Extra Service
		st = db.prepare("SELECT * FROM ExtraService");
		while(st.step()){
			ExtraService es = DataModelsFactory.eINSTANCE.createExtraService();
			es.setBooking_id(st.columnInt(0));
			es.setTotal_price(st.columnDouble(1));
			es.setType(st.columnString(2));
			es.setDate_start(df.parse(st.columnString(3)));
			es.setDate_end(df.parse(st.columnString(4)));
			static_db.getExtraServiceList().add(es);
		}
		st.dispose();
		
		
		db.dispose();
	}

}
