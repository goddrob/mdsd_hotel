/**
 */
package CodePack.Shared;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CodePack.Shared.ContactData#getFull_name <em>Full name</em>}</li>
 *   <li>{@link CodePack.Shared.ContactData#getE_mail <em>Email</em>}</li>
 *   <li>{@link CodePack.Shared.ContactData#getPhone_no <em>Phone no</em>}</li>
 * </ul>
 * </p>
 *
 * @see CodePack.Shared.SharedPackage#getContactData()
 * @model
 * @generated
 */
public interface ContactData extends EObject {
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
	 * @see CodePack.Shared.SharedPackage#getContactData_Full_name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getFull_name();

	/**
	 * Sets the value of the '{@link CodePack.Shared.ContactData#getFull_name <em>Full name</em>}' attribute.
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
	 * @see #setE_mail(String)
	 * @see CodePack.Shared.SharedPackage#getContactData_E_mail()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getE_mail();

	/**
	 * Sets the value of the '{@link CodePack.Shared.ContactData#getE_mail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getE_mail()
	 * @generated
	 */
	void setE_mail(String value);

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
	 * @see CodePack.Shared.SharedPackage#getContactData_Phone_no()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getPhone_no();

	/**
	 * Sets the value of the '{@link CodePack.Shared.ContactData#getPhone_no <em>Phone no</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone no</em>' attribute.
	 * @see #getPhone_no()
	 * @generated
	 */
	void setPhone_no(int value);

} // ContactData
