/**
 */
package CodePack.Backend.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import CodePack.CodePackFactory;
import CodePack.DataBank;
import CodePack.Backend.BackendPackage;
import CodePack.Backend.CheckInHandler;
import CodePack.DataModels.Booking;
import CodePack.DataModels.DataModelsFactory;
import CodePack.DataModels.Guest;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check In Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CheckInHandlerImpl extends MinimalEObjectImpl.Container implements CheckInHandler {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckInHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BackendPackage.Literals.CHECK_IN_HANDLER;
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
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BackendPackage.CHECK_IN_HANDLER___VALIDATE_BOOKING__INT:
				return validateBooking((Integer)arguments.get(0));
			case BackendPackage.CHECK_IN_HANDLER___ASSIGN_GUEST_TO_BOOKING__INT_STRING:
				return assignGuestToBooking((Integer)arguments.get(0), (String)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CheckInHandlerImpl
