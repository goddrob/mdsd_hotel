/**
 */
package CodePack;

import CodePack.DataModels.Booking;
import CodePack.DataModels.ExtraService;
import CodePack.DataModels.PaymentData;

import CodePack.DataModels.Room;
import CodePack.DataModels.ServiceType;
import CodePack.Shared.ContactData;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IBookings</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see CodePack.CodePackPackage#getIBookings()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IBookings extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" contact_dataRequired="true" contact_dataOrdered="false" payment_dataRequired="true" payment_dataOrdered="false" roomsRequired="true" roomsMany="true" roomsOrdered="false" servicesMany="true" servicesOrdered="false" number_of_guestsRequired="true" number_of_guestsOrdered="false" date_check_inRequired="true" date_check_inOrdered="false" date_check_outRequired="true" date_check_outOrdered="false"
	 * @generated
	 */
	Booking createBooking(ContactData contact_data, PaymentData payment_data, EList<Room> rooms, EList<ExtraService> services, int number_of_guests, Date date_check_in, Date date_check_out);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" customer_idRequired="true" customer_idOrdered="false" roomsRequired="true" roomsMany="true" roomsOrdered="false" servicesMany="true" servicesOrdered="false" number_of_guestsRequired="true" number_of_guestsOrdered="false" date_check_inRequired="true" date_check_inOrdered="false" date_check_outRequired="true" date_check_outOrdered="false" bonus_points_usedRequired="true" bonus_points_usedOrdered="false"
	 * @generated
	 */
	Booking createBookingForCustomer(int customer_id, EList<Room> rooms, EList<ExtraService> services, int number_of_guests, Date date_check_in, Date date_check_out, int bonus_points_used);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" booking_idRequired="true" booking_idOrdered="false" old_roomRequired="true" old_roomOrdered="false" new_roomRequired="true" new_roomOrdered="false"
	 * @generated
	 */
	boolean updateRoomForBooking(int booking_id, int old_room, int new_room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" old_service_idRequired="true" old_service_idOrdered="false" new_serviceRequired="true" new_serviceOrdered="false"
	 * @generated
	 */
	boolean updateServiceForBooking(int old_service_id, ExtraService new_service);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" date_startRequired="true" date_startOrdered="false" date_endRequired="true" date_endOrdered="false"
	 * @generated
	 */
	EList<Room> getAvailableRooms(Date date_start, Date date_end);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<ServiceType> getAvailableServices();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" room_numberRequired="true" room_numberOrdered="false" date_startRequired="true" date_startOrdered="false" date_endRequired="true" date_endOrdered="false"
	 * @generated
	 */
	boolean isRoomAvailable(int room_number, Date date_start, Date date_end);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" customer_idRequired="true" customer_idOrdered="false"
	 * @generated
	 */
	EList<Booking> getBookingsForCustomer(int customer_id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" booking_idRequired="true" booking_idOrdered="false"
	 * @generated
	 */
	Booking getBookingForId(int booking_id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" booking_idRequired="true" booking_idOrdered="false" new_check_inRequired="true" new_check_inOrdered="false" new_check_outRequired="true" new_check_outOrdered="false"
	 * @generated
	 */
	boolean updateTimeForBooking(int booking_id, Date new_check_in, Date new_check_out);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" booking_idRequired="true" booking_idOrdered="false"
	 * @generated
	 */
	boolean cancelBooking(int booking_id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" booking_idRequired="true" booking_idOrdered="false"
	 * @generated
	 */
	PaymentData getPaymentForBooking(int booking_id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void sendComfimationMail(Booking booking);

} // IBookings
