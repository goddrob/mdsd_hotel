/**
 */
package CodePack.Backend.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import CodePack.CodePackFactory;
import CodePack.DataBank;
import CodePack.Backend.BackendPackage;
import CodePack.Backend.CheckInHandler;
import CodePack.DataModels.Booking;

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
	 * @generated NOT
	 */
	public int assignRoomToBooking(int booking_id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataBank static_db = CodePackFactory.eINSTANCE.createDataBank();
		  Booking booking = null;
		  for(Booking b : static_db.getBookingList()) {
		   if (b.getId() == booking_id) {
		    booking = b;
		    break;
		   }
		  }
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
			case BackendPackage.CHECK_IN_HANDLER___ASSIGN_ROOM_TO_BOOKING__INT:
				return assignRoomToBooking((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CheckInHandlerImpl
