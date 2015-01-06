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
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		for (Booking b : db.getBookingList()){
			if (b.getId() == booking_id){
				// check date
			}
		}
		return false;
		
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
