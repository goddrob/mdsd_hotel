/**
 */
package CodePack;

import CodePack.DataModels.Booking;
import CodePack.DataModels.Customer;
import CodePack.DataModels.ExtraService;
import CodePack.DataModels.Guest;
import CodePack.DataModels.PaymentData;
import CodePack.DataModels.Room;
import CodePack.DataModels.RoomBooked;
import CodePack.DataModels.RoomType;
import CodePack.DataModels.ServiceType;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Bank</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CodePack.DataBank#getRoomList <em>Room List</em>}</li>
 *   <li>{@link CodePack.DataBank#getBookingList <em>Booking List</em>}</li>
 *   <li>{@link CodePack.DataBank#getCustomerList <em>Customer List</em>}</li>
 *   <li>{@link CodePack.DataBank#getRoomTypeList <em>Room Type List</em>}</li>
 *   <li>{@link CodePack.DataBank#getPaymentDataList <em>Payment Data List</em>}</li>
 *   <li>{@link CodePack.DataBank#getRoomBookedList <em>Room Booked List</em>}</li>
 *   <li>{@link CodePack.DataBank#getExtraServiceList <em>Extra Service List</em>}</li>
 *   <li>{@link CodePack.DataBank#getServiceTypeList <em>Service Type List</em>}</li>
 *   <li>{@link CodePack.DataBank#getGuestList <em>Guest List</em>}</li>
 * </ul>
 * </p>
 *
 * @see CodePack.CodePackPackage#getDataBank()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Data Bank'"
 * @generated
 */
public interface DataBank extends EObject {
	/**
	 * Returns the value of the '<em><b>Room List</b></em>' reference list.
	 * The list contents are of type {@link CodePack.DataModels.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room List</em>' reference list.
	 * @see CodePack.CodePackPackage#getDataBank_RoomList()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Room> getRoomList();

	/**
	 * Returns the value of the '<em><b>Booking List</b></em>' reference list.
	 * The list contents are of type {@link CodePack.DataModels.Booking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking List</em>' reference list.
	 * @see CodePack.CodePackPackage#getDataBank_BookingList()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Booking> getBookingList();

	/**
	 * Returns the value of the '<em><b>Customer List</b></em>' reference list.
	 * The list contents are of type {@link CodePack.DataModels.Customer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer List</em>' reference list.
	 * @see CodePack.CodePackPackage#getDataBank_CustomerList()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Customer> getCustomerList();

	/**
	 * Returns the value of the '<em><b>Room Type List</b></em>' reference list.
	 * The list contents are of type {@link CodePack.DataModels.RoomType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type List</em>' reference list.
	 * @see CodePack.CodePackPackage#getDataBank_RoomTypeList()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<RoomType> getRoomTypeList();

	/**
	 * Returns the value of the '<em><b>Payment Data List</b></em>' reference list.
	 * The list contents are of type {@link CodePack.DataModels.PaymentData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Data List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Data List</em>' reference list.
	 * @see CodePack.CodePackPackage#getDataBank_PaymentDataList()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<PaymentData> getPaymentDataList();

	/**
	 * Returns the value of the '<em><b>Room Booked List</b></em>' reference list.
	 * The list contents are of type {@link CodePack.DataModels.RoomBooked}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Booked List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Booked List</em>' reference list.
	 * @see CodePack.CodePackPackage#getDataBank_RoomBookedList()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<RoomBooked> getRoomBookedList();

	/**
	 * Returns the value of the '<em><b>Extra Service List</b></em>' reference list.
	 * The list contents are of type {@link CodePack.DataModels.ExtraService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extra Service List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Service List</em>' reference list.
	 * @see CodePack.CodePackPackage#getDataBank_ExtraServiceList()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<ExtraService> getExtraServiceList();

	/**
	 * Returns the value of the '<em><b>Service Type List</b></em>' reference list.
	 * The list contents are of type {@link CodePack.DataModels.ServiceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Type List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Type List</em>' reference list.
	 * @see CodePack.CodePackPackage#getDataBank_ServiceTypeList()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<ServiceType> getServiceTypeList();

	/**
	 * Returns the value of the '<em><b>Guest List</b></em>' reference list.
	 * The list contents are of type {@link CodePack.DataModels.Guest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guest List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guest List</em>' reference list.
	 * @see CodePack.CodePackPackage#getDataBank_GuestList()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Guest> getGuestList();

} // DataBank
