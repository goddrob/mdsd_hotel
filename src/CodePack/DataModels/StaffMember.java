/**
 */
package CodePack.DataModels;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CodePack.DataModels.StaffMember#getFull_name <em>Full name</em>}</li>
 *   <li>{@link CodePack.DataModels.StaffMember#getEmail <em>Email</em>}</li>
 *   <li>{@link CodePack.DataModels.StaffMember#getPassword <em>Password</em>}</li>
 *   <li>{@link CodePack.DataModels.StaffMember#getPers_no <em>Pers no</em>}</li>
 *   <li>{@link CodePack.DataModels.StaffMember#getPhone_no <em>Phone no</em>}</li>
 *   <li>{@link CodePack.DataModels.StaffMember#getRole_name <em>Role name</em>}</li>
 * </ul>
 * </p>
 *
 * @see CodePack.DataModels.DataModelsPackage#getStaffMember()
 * @model
 * @generated
 */
public interface StaffMember extends EObject {

	/**
	 * Returns the value of the '<em><b>Full name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full name</em>' attribute.
	 * @see #setFull_name(String)
	 * @see CodePack.DataModels.DataModelsPackage#getStaffMember_Full_name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getFull_name();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.StaffMember#getFull_name <em>Full name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full name</em>' attribute.
	 * @see #getFull_name()
	 * @generated
	 */
	void setFull_name(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see CodePack.DataModels.DataModelsPackage#getStaffMember_Email()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.StaffMember#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

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
	 * @see CodePack.DataModels.DataModelsPackage#getStaffMember_Password()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.StaffMember#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Pers no</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pers no</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pers no</em>' attribute.
	 * @see #setPers_no(String)
	 * @see CodePack.DataModels.DataModelsPackage#getStaffMember_Pers_no()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPers_no();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.StaffMember#getPers_no <em>Pers no</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pers no</em>' attribute.
	 * @see #getPers_no()
	 * @generated
	 */
	void setPers_no(String value);

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
	 * @see CodePack.DataModels.DataModelsPackage#getStaffMember_Phone_no()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getPhone_no();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.StaffMember#getPhone_no <em>Phone no</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone no</em>' attribute.
	 * @see #getPhone_no()
	 * @generated
	 */
	void setPhone_no(int value);

	/**
	 * Returns the value of the '<em><b>Role name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role name</em>' attribute.
	 * @see #setRole_name(String)
	 * @see CodePack.DataModels.DataModelsPackage#getStaffMember_Role_name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getRole_name();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.StaffMember#getRole_name <em>Role name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role name</em>' attribute.
	 * @see #getRole_name()
	 * @generated
	 */
	void setRole_name(String value);
} // StaffMember
