/**
 */
package CodePack;

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
	 * @model required="true" ordered="false" booking_idRequired="true" booking_idOrdered="false"
	 * @generated
	 */
	int assignRoomToBooking(int booking_id);

} // ICheckIn
