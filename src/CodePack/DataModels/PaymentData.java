/**
 */
package CodePack.DataModels;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CodePack.DataModels.PaymentData#getCc_number <em>Cc number</em>}</li>
 *   <li>{@link CodePack.DataModels.PaymentData#getCc_ccv <em>Cc ccv</em>}</li>
 *   <li>{@link CodePack.DataModels.PaymentData#getCc_month <em>Cc month</em>}</li>
 *   <li>{@link CodePack.DataModels.PaymentData#getCc_year <em>Cc year</em>}</li>
 *   <li>{@link CodePack.DataModels.PaymentData#getCc_first_name <em>Cc first name</em>}</li>
 *   <li>{@link CodePack.DataModels.PaymentData#getCc_last_name <em>Cc last name</em>}</li>
 *   <li>{@link CodePack.DataModels.PaymentData#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see CodePack.DataModels.DataModelsPackage#getPaymentData()
 * @model
 * @generated
 */
public interface PaymentData extends EObject {
	/**
	 * Returns the value of the '<em><b>Cc number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc number</em>' attribute.
	 * @see #setCc_number(String)
	 * @see CodePack.DataModels.DataModelsPackage#getPaymentData_Cc_number()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCc_number();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.PaymentData#getCc_number <em>Cc number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc number</em>' attribute.
	 * @see #getCc_number()
	 * @generated
	 */
	void setCc_number(String value);

	/**
	 * Returns the value of the '<em><b>Cc ccv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc ccv</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc ccv</em>' attribute.
	 * @see #setCc_ccv(String)
	 * @see CodePack.DataModels.DataModelsPackage#getPaymentData_Cc_ccv()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCc_ccv();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.PaymentData#getCc_ccv <em>Cc ccv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc ccv</em>' attribute.
	 * @see #getCc_ccv()
	 * @generated
	 */
	void setCc_ccv(String value);

	/**
	 * Returns the value of the '<em><b>Cc month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc month</em>' attribute.
	 * @see #setCc_month(int)
	 * @see CodePack.DataModels.DataModelsPackage#getPaymentData_Cc_month()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCc_month();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.PaymentData#getCc_month <em>Cc month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc month</em>' attribute.
	 * @see #getCc_month()
	 * @generated
	 */
	void setCc_month(int value);

	/**
	 * Returns the value of the '<em><b>Cc year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc year</em>' attribute.
	 * @see #setCc_year(int)
	 * @see CodePack.DataModels.DataModelsPackage#getPaymentData_Cc_year()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCc_year();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.PaymentData#getCc_year <em>Cc year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc year</em>' attribute.
	 * @see #getCc_year()
	 * @generated
	 */
	void setCc_year(int value);

	/**
	 * Returns the value of the '<em><b>Cc first name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc first name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc first name</em>' attribute.
	 * @see #setCc_first_name(String)
	 * @see CodePack.DataModels.DataModelsPackage#getPaymentData_Cc_first_name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCc_first_name();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.PaymentData#getCc_first_name <em>Cc first name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc first name</em>' attribute.
	 * @see #getCc_first_name()
	 * @generated
	 */
	void setCc_first_name(String value);

	/**
	 * Returns the value of the '<em><b>Cc last name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc last name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc last name</em>' attribute.
	 * @see #setCc_last_name(String)
	 * @see CodePack.DataModels.DataModelsPackage#getPaymentData_Cc_last_name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCc_last_name();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.PaymentData#getCc_last_name <em>Cc last name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc last name</em>' attribute.
	 * @see #getCc_last_name()
	 * @generated
	 */
	void setCc_last_name(String value);

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
	 * @see CodePack.DataModels.DataModelsPackage#getPaymentData_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.PaymentData#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // PaymentData
