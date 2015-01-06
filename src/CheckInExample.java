import java.text.ParseException;

import com.almworks.sqlite4java.SQLiteException;

import CodePack.CodePackFactory;
import CodePack.DataBank;
import CodePack.Backend.BackendFactory;
import CodePack.Backend.CheckInHandler;
import CodePack.DataModels.Booking;
import CodePack.DataModels.Guest;


public class CheckInExample {
	public static void main(String[] args) throws SQLiteException, ParseException {
		mainClass.loadDatabase();
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		CheckInHandler checkInHandler = BackendFactory.eINSTANCE.createCheckInHandler();
		
		Booking b = db.getBookingList().iterator().next();
		System.out.println(b.getId());
		checkInHandler.assignGuestToBooking(b.getId(), "Ylva");
		for(Guest g : db.getGuestList()) {
			System.out.println(g.getName());
		}
	}

}
