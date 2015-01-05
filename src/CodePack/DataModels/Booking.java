/**
 */
package CodePack.DataModels;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CodePack.DataModels.Booking#getId <em>Id</em>}</li>
 *   <li>{@link CodePack.DataModels.Booking#getDate_check_in <em>Date check in</em>}</li>
 *   <li>{@link CodePack.DataModels.Booking#getDate_check_out <em>Date check out</em>}</li>
 *   <li>{@link CodePack.DataModels.Booking#isCheckedIn <em>Is Checked In</em>}</li>
 *   <li>{@link CodePack.DataModels.Booking#getTotal_price <em>Total price</em>}</li>
 *   <li>{@link CodePack.DataModels.Booking#getContact_name <em>Contact name</em>}</li>
 *   <li>{@link CodePack.DataModels.Booking#getContact_phone <em>Contact phone</em>}</li>
 *   <li>{@link CodePack.DataModels.Booking#getContact_email <em>Contact email</em>}</li>
 *   <li>{@link CodePack.DataModels.Booking#getRoom <em>Room</em>}</li>
 *   <li>{@link CodePack.DataModels.Booking#getCustomer_id <em>Customer id</em>}</li>
 *   <li>{@link CodePack.DataModels.Booking#getPayment_id <em>Payment id</em>}</li>
 * </ul>
 * </p>
 *
 * @see CodePack.DataModels.DataModelsPackage#getBooking()
 * @model
 * @generated
 */
public interface Booking extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see CodePack.DataModels.DataModelsPackage#getBooking_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.Booking#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Date check in</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date check in</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date check in</em>' attribute.
	 * @see #setDate_check_in(Date)
	 * @see CodePack.DataModels.DataModelsPackage#getBooking_Date_check_in()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDate_check_in();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.Booking#getDate_check_in <em>Date check in</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date check in</em>' attribute.
	 * @see #getDate_check_in()
	 * @generated
	 */
	void setDate_check_in(Date value);

	/**
	 * Returns the value of the '<em><b>Date check out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date check out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date check out</em>' attribute.
	 * @see #setDate_check_out(Date)
	 * @see CodePack.DataModels.DataModelsPackage#getBooking_Date_check_out()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDate_check_out();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.Booking#getDate_check_out <em>Date check out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date check out</em>' attribute.
	 * @see #getDate_check_out()
	 * @generated
	 */
	void setDate_check_out(Date value);

	/**
	 * Returns the value of the '<em><b>Is Checked In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Checked In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Checked In</em>' attribute.
	 * @see #setIsCheckedIn(boolean)
	 * @see CodePack.DataModels.DataModelsPackage#getBooking_IsCheckedIn()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isCheckedIn();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.Booking#isCheckedIn <em>Is Checked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Checked In</em>' attribute.
	 * @see #isCheckedIn()
	 * @generated
	 */
	void setIsCheckedIn(boolean value);

	/**
	 * Returns the value of the '<em><b>Total price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total price</em>' attribute.
	 * @see #setTotal_price(double)
	 * @see CodePack.DataModels.DataModelsPackage#getBooking_Total_price()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getTotal_price();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.Booking#getTotal_price <em>Total price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total price</em>' attribute.
	 * @see #getTotal_price()
	 * @generated
	 */
	void setTotal_price(double value);

	/**
	 * Returns the value of the '<em><b>Contact name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact name</em>' attribute.
	 * @see #setContact_name(String)
	 * @see CodePack.DataModels.DataModelsPackage#getBooking_Contact_name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getContact_name();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.Booking#getContact_name <em>Contact name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact name</em>' attribute.
	 * @see #getContact_name()
	 * @generated
	 */
	void setContact_name(String value);

	/**
	 * Returns the value of the '<em><b>Contact phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact phone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact phone</em>' attribute.
	 * @see #setContact_phone(int)
	 * @see CodePack.DataModels.DataModelsPackage#getBooking_Contact_phone()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getContact_phone();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.Booking#getContact_phone <em>Contact phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact phone</em>' attribute.
	 * @see #getContact_phone()
	 * @generated
	 */
	void setContact_phone(int value);

	/**
	 * Returns the value of the '<em><b>Contact email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact email</em>' attribute.
	 * @see #setContact_email(String)
	 * @see CodePack.DataModels.DataModelsPackage#getBooking_Contact_email()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getContact_email();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.Booking#getContact_email <em>Contact email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact email</em>' attribute.
	 * @see #getContact_email()
	 * @generated
	 */
	void setContact_email(String value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see CodePack.DataModels.DataModelsPackage#getBooking_Room()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.Booking#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Customer id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer id</em>' attribute.
	 * @see #setCustomer_id(int)
	 * @see CodePack.DataModels.DataModelsPackage#getBooking_Customer_id()
	 * @model ordered="false"
	 * @generated
	 */
	int getCustomer_id();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.Booking#getCustomer_id <em>Customer id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer id</em>' attribute.
	 * @see #getCustomer_id()
	 * @generated
	 */
	void setCustomer_id(int value);

	/**
	 * Returns the value of the '<em><b>Payment id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment id</em>' attribute.
	 * @see #setPayment_id(int)
	 * @see CodePack.DataModels.DataModelsPackage#getBooking_Payment_id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getPayment_id();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.Booking#getPayment_id <em>Payment id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment id</em>' attribute.
	 * @see #getPayment_id()
	 * @generated
	 */
	void setPayment_id(int value);

} // Booking
