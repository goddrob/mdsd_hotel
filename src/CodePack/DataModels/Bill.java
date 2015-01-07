/**
 */
package CodePack.DataModels;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CodePack.DataModels.Bill#getBooking_id <em>Booking id</em>}</li>
 *   <li>{@link CodePack.DataModels.Bill#getRooms_booked <em>Rooms booked</em>}</li>
 *   <li>{@link CodePack.DataModels.Bill#getServices_ordered <em>Services ordered</em>}</li>
 *   <li>{@link CodePack.DataModels.Bill#getTotal_price <em>Total price</em>}</li>
 * </ul>
 * </p>
 *
 * @see CodePack.DataModels.DataModelsPackage#getBill()
 * @model
 * @generated
 */
public interface Bill extends EObject {
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
	 * @see CodePack.DataModels.DataModelsPackage#getBill_Booking_id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getBooking_id();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.Bill#getBooking_id <em>Booking id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking id</em>' attribute.
	 * @see #getBooking_id()
	 * @generated
	 */
	void setBooking_id(int value);

	/**
	 * Returns the value of the '<em><b>Rooms booked</b></em>' reference list.
	 * The list contents are of type {@link CodePack.DataModels.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rooms booked</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms booked</em>' reference list.
	 * @see CodePack.DataModels.DataModelsPackage#getBill_Rooms_booked()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Room> getRooms_booked();

	/**
	 * Returns the value of the '<em><b>Services ordered</b></em>' reference list.
	 * The list contents are of type {@link CodePack.DataModels.ExtraService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services ordered</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services ordered</em>' reference list.
	 * @see CodePack.DataModels.DataModelsPackage#getBill_Services_ordered()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<ExtraService> getServices_ordered();

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
	 * @see CodePack.DataModels.DataModelsPackage#getBill_Total_price()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getTotal_price();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.Bill#getTotal_price <em>Total price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total price</em>' attribute.
	 * @see #getTotal_price()
	 * @generated
	 */
	void setTotal_price(double value);

} // Bill
