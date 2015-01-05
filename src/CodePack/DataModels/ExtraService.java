/**
 */
package CodePack.DataModels;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extra Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CodePack.DataModels.ExtraService#getDate_start <em>Date start</em>}</li>
 *   <li>{@link CodePack.DataModels.ExtraService#getDate_end <em>Date end</em>}</li>
 *   <li>{@link CodePack.DataModels.ExtraService#getBooking_id <em>Booking id</em>}</li>
 *   <li>{@link CodePack.DataModels.ExtraService#getTotal_price <em>Total price</em>}</li>
 *   <li>{@link CodePack.DataModels.ExtraService#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see CodePack.DataModels.DataModelsPackage#getExtraService()
 * @model
 * @generated
 */
public interface ExtraService extends EObject {
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
	 * @see CodePack.DataModels.DataModelsPackage#getExtraService_Date_start()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDate_start();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.ExtraService#getDate_start <em>Date start</em>}' attribute.
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
	 * @see CodePack.DataModels.DataModelsPackage#getExtraService_Date_end()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDate_end();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.ExtraService#getDate_end <em>Date end</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date end</em>' attribute.
	 * @see #getDate_end()
	 * @generated
	 */
	void setDate_end(Date value);

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
	 * @see CodePack.DataModels.DataModelsPackage#getExtraService_Booking_id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getBooking_id();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.ExtraService#getBooking_id <em>Booking id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking id</em>' attribute.
	 * @see #getBooking_id()
	 * @generated
	 */
	void setBooking_id(int value);

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
	 * @see CodePack.DataModels.DataModelsPackage#getExtraService_Total_price()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getTotal_price();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.ExtraService#getTotal_price <em>Total price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total price</em>' attribute.
	 * @see #getTotal_price()
	 * @generated
	 */
	void setTotal_price(double value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see CodePack.DataModels.DataModelsPackage#getExtraService_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.ExtraService#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // ExtraService
