/**
 */
package CodePack.DataModels;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Booked</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CodePack.DataModels.RoomBooked#getRoom_number <em>Room number</em>}</li>
 *   <li>{@link CodePack.DataModels.RoomBooked#getBooking_id <em>Booking id</em>}</li>
 *   <li>{@link CodePack.DataModels.RoomBooked#getDate_start <em>Date start</em>}</li>
 *   <li>{@link CodePack.DataModels.RoomBooked#getDate_end <em>Date end</em>}</li>
 *   <li>{@link CodePack.DataModels.RoomBooked#getBooking <em>Booking</em>}</li>
 * </ul>
 * </p>
 *
 * @see CodePack.DataModels.DataModelsPackage#getRoomBooked()
 * @model
 * @generated
 */
public interface RoomBooked extends EObject {
	/**
	 * Returns the value of the '<em><b>Room number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room number</em>' attribute.
	 * @see #setRoom_number(int)
	 * @see CodePack.DataModels.DataModelsPackage#getRoomBooked_Room_number()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getRoom_number();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.RoomBooked#getRoom_number <em>Room number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room number</em>' attribute.
	 * @see #getRoom_number()
	 * @generated
	 */
	void setRoom_number(int value);

	/**
	 * Returns the value of the '<em><b>Booking id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking id</em>' attribute.
	 * @see #setBooking_id(int)
	 * @see CodePack.DataModels.DataModelsPackage#getRoomBooked_Booking_id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getBooking_id();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.RoomBooked#getBooking_id <em>Booking id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking id</em>' attribute.
	 * @see #getBooking_id()
	 * @generated
	 */
	void setBooking_id(int value);

	/**
	 * Returns the value of the '<em><b>Date start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date start</em>' attribute.
	 * @see #setDate_start(Date)
	 * @see CodePack.DataModels.DataModelsPackage#getRoomBooked_Date_start()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDate_start();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.RoomBooked#getDate_start <em>Date start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date start</em>' attribute.
	 * @see #getDate_start()
	 * @generated
	 */
	void setDate_start(Date value);

	/**
	 * Returns the value of the '<em><b>Date end</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date end</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date end</em>' attribute.
	 * @see #setDate_end(Date)
	 * @see CodePack.DataModels.DataModelsPackage#getRoomBooked_Date_end()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDate_end();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.RoomBooked#getDate_end <em>Date end</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date end</em>' attribute.
	 * @see #getDate_end()
	 * @generated
	 */
	void setDate_end(Date value);

	/**
	 * Returns the value of the '<em><b>Booking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking</em>' reference.
	 * @see #setBooking(Booking)
	 * @see CodePack.DataModels.DataModelsPackage#getRoomBooked_Booking()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Booking getBooking();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.RoomBooked#getBooking <em>Booking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking</em>' reference.
	 * @see #getBooking()
	 * @generated
	 */
	void setBooking(Booking value);

} // RoomBooked
