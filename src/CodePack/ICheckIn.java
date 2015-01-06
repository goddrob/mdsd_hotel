/**
 */
package CodePack;

import CodePack.DataModels.Booking;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ICheck In</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see CodePack.CodePackPackage#getICheckIn()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ICheckIn extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" booking_idRequired="true" booking_idOrdered="false"
	 * @generated
	 */
	boolean validateBooking(int booking_id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" booking_idRequired="true" booking_idOrdered="false" guest_nameRequired="true" guest_nameOrdered="false"
	 * @generated
	 */
	Booking assignGuestToBooking(int booking_id, String guest_name);

} // ICheckIn
