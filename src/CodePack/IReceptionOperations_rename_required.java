/**
 */
package CodePack;

import CodePack.DataModels.Bill;
import CodePack.DataModels.PaymentData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IReception Operations rename required</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see CodePack.CodePackPackage#getIReceptionOperations_rename_required()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IReceptionOperations_rename_required extends IBookings, ICheckIn, IStaffAuthentication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" booking_idRequired="true" booking_idOrdered="false"
	 * @generated
	 */
	boolean isCheckedIn(int booking_id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" billRequired="true" billOrdered="false" payment_dataRequired="true" payment_dataOrdered="false"
	 * @generated
	 */
	String processPayment(Bill bill, PaymentData payment_data);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" booking_idRequired="true" booking_idOrdered="false"
	 * @generated
	 */
	Bill generateBill(int booking_id);

} // IReceptionOperations_rename_required
