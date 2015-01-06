/**
 */
package CodePack;

import CodePack.DataModels.Customer;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IUser Account</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see CodePack.CodePackPackage#getIUserAccount()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IUserAccount extends IBookings {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" e_mailRequired="true" e_mailOrdered="false"
	 * @generated
	 */
	boolean isEmailAvailable(String e_mail);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" e_mailRequired="true" e_mailOrdered="false" passwordRequired="true" passwordOrdered="false"
	 * @generated
	 */
	int login(String e_mail, String password);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" customer_idRequired="true" customer_idOrdered="false" cc_numberRequired="true" cc_numberOrdered="false" cc_ccvRequired="true" cc_ccvOrdered="false" cc_monthRequired="true" cc_monthOrdered="false" cc_yearRequired="true" cc_yearOrdered="false" name_firstRequired="true" name_firstOrdered="false" name_lastRequired="true" name_lastOrdered="false"
	 * @generated
	 */
	boolean updateCustomerCC(int customer_id, String cc_number, String cc_ccv, int cc_month, int cc_year, String name_first, String name_last);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" customer_idRequired="true" customer_idOrdered="false" pwd_oldRequired="true" pwd_oldOrdered="false" pwd_newRequired="true" pwd_newOrdered="false"
	 * @generated
	 */
	boolean updateCustomerPwd(int customer_id, String pwd_old, String pwd_new);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" e_mailRequired="true" e_mailOrdered="false" phone_noRequired="true" phone_noOrdered="false" customer_idRequired="true" customer_idOrdered="false"
	 * @generated
	 */
	boolean updateCustomerInfo(String e_mail, String phone_no, int customer_id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" e_mailRequired="true" e_mailOrdered="false" passwordRequired="true" passwordOrdered="false" date_of_birthRequired="true" date_of_birthOrdered="false" phone_noRequired="true" phone_noOrdered="false" first_nameRequired="true" first_nameOrdered="false" last_nameRequired="true" last_nameOrdered="false"
	 * @generated
	 */
	boolean registerCustomer(String e_mail, String password, Date date_of_birth, int phone_no, String first_name, String last_name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" customer_idRequired="true" customer_idOrdered="false"
	 * @generated
	 */
	Customer getCustomerInfo(int customer_id);

} // IUserAccount
