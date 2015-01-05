/**
 */
package CodePack.DataModels;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CodePack.DataModels.Customer#getPassword <em>Password</em>}</li>
 *   <li>{@link CodePack.DataModels.Customer#getDate_of_birth <em>Date of birth</em>}</li>
 *   <li>{@link CodePack.DataModels.Customer#getBonus_points <em>Bonus points</em>}</li>
 *   <li>{@link CodePack.DataModels.Customer#getE_mail <em>Email</em>}</li>
 *   <li>{@link CodePack.DataModels.Customer#getFirst_name <em>First name</em>}</li>
 *   <li>{@link CodePack.DataModels.Customer#getPhone_no <em>Phone no</em>}</li>
 *   <li>{@link CodePack.DataModels.Customer#getCustomer_id <em>Customer id</em>}</li>
 *   <li>{@link CodePack.DataModels.Customer#getPayment_id <em>Payment id</em>}</li>
 *   <li>{@link CodePack.DataModels.Customer#getLast_name <em>Last name</em>}</li>
 * </ul>
 * </p>
 *
 * @see CodePack.DataModels.DataModelsPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends EObject {
	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see CodePack.DataModels.DataModelsPackage#getCustomer_Password()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.Customer#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Date of birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date of birth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date of birth</em>' attribute.
	 * @see #setDate_of_birth(Date)
	 * @see CodePack.DataModels.DataModelsPackage#getCustomer_Date_of_birth()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDate_of_birth();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.Customer#getDate_of_birth <em>Date of birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date of birth</em>' attribute.
	 * @see #getDate_of_birth()
	 * @generated
	 */
	void setDate_of_birth(Date value);

	/**
	 * Returns the value of the '<em><b>Bonus points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bonus points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bonus points</em>' attribute.
	 * @see #setBonus_points(int)
	 * @see CodePack.DataModels.DataModelsPackage#getCustomer_Bonus_points()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getBonus_points();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.Customer#getBonus_points <em>Bonus points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bonus points</em>' attribute.
	 * @see #getBonus_points()
	 * @generated
	 */
	void setBonus_points(int value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setE_mail(String)
	 * @see CodePack.DataModels.DataModelsPackage#getCustomer_E_mail()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getE_mail();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.Customer#getE_mail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getE_mail()
	 * @generated
	 */
	void setE_mail(String value);

	/**
	 * Returns the value of the '<em><b>First name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First name</em>' attribute.
	 * @see #setFirst_name(String)
	 * @see CodePack.DataModels.DataModelsPackage#getCustomer_First_name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getFirst_name();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.Customer#getFirst_name <em>First name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First name</em>' attribute.
	 * @see #getFirst_name()
	 * @generated
	 */
	void setFirst_name(String value);

	/**
	 * Returns the value of the '<em><b>Phone no</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone no</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone no</em>' attribute.
	 * @see #setPhone_no(int)
	 * @see CodePack.DataModels.DataModelsPackage#getCustomer_Phone_no()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getPhone_no();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.Customer#getPhone_no <em>Phone no</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone no</em>' attribute.
	 * @see #getPhone_no()
	 * @generated
	 */
	void setPhone_no(int value);

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
	 * @see CodePack.DataModels.DataModelsPackage#getCustomer_Customer_id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCustomer_id();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.Customer#getCustomer_id <em>Customer id</em>}' attribute.
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
	 * @see CodePack.DataModels.DataModelsPackage#getCustomer_Payment_id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getPayment_id();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.Customer#getPayment_id <em>Payment id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment id</em>' attribute.
	 * @see #getPayment_id()
	 * @generated
	 */
	void setPayment_id(int value);

	/**
	 * Returns the value of the '<em><b>Last name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last name</em>' attribute.
	 * @see #setLast_name(String)
	 * @see CodePack.DataModels.DataModelsPackage#getCustomer_Last_name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getLast_name();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.Customer#getLast_name <em>Last name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last name</em>' attribute.
	 * @see #getLast_name()
	 * @generated
	 */
	void setLast_name(String value);

} // Customer
