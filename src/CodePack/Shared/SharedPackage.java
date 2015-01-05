/**
 */
package CodePack.Shared;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CodePack.Shared.SharedFactory
 * @model kind="package"
 * @generated
 */
public interface SharedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Shared";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///CodePack/Shared.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CodePack.Shared";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SharedPackage eINSTANCE = CodePack.Shared.impl.SharedPackageImpl.init();

	/**
	 * The meta object id for the '{@link CodePack.Shared.impl.ContactDataImpl <em>Contact Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodePack.Shared.impl.ContactDataImpl
	 * @see CodePack.Shared.impl.SharedPackageImpl#getContactData()
	 * @generated
	 */
	int CONTACT_DATA = 0;

	/**
	 * The feature id for the '<em><b>Full name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_DATA__FULL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_DATA__EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Phone no</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_DATA__PHONE_NO = 2;

	/**
	 * The number of structural features of the '<em>Contact Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_DATA_FEATURE_COUNT = 3;


	/**
	 * The number of operations of the '<em>Contact Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_DATA_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link CodePack.Shared.ContactData <em>Contact Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Data</em>'.
	 * @see CodePack.Shared.ContactData
	 * @generated
	 */
	EClass getContactData();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.Shared.ContactData#getFull_name <em>Full name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full name</em>'.
	 * @see CodePack.Shared.ContactData#getFull_name()
	 * @see #getContactData()
	 * @generated
	 */
	EAttribute getContactData_Full_name();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.Shared.ContactData#getE_mail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see CodePack.Shared.ContactData#getE_mail()
	 * @see #getContactData()
	 * @generated
	 */
	EAttribute getContactData_E_mail();

	/**
	 * Returns the meta object for the attribute '{@link CodePack.Shared.ContactData#getPhone_no <em>Phone no</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone no</em>'.
	 * @see CodePack.Shared.ContactData#getPhone_no()
	 * @see #getContactData()
	 * @generated
	 */
	EAttribute getContactData_Phone_no();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SharedFactory getSharedFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CodePack.Shared.impl.ContactDataImpl <em>Contact Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodePack.Shared.impl.ContactDataImpl
		 * @see CodePack.Shared.impl.SharedPackageImpl#getContactData()
		 * @generated
		 */
		EClass CONTACT_DATA = eINSTANCE.getContactData();

		/**
		 * The meta object literal for the '<em><b>Full name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_DATA__FULL_NAME = eINSTANCE.getContactData_Full_name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_DATA__EMAIL = eINSTANCE.getContactData_E_mail();

		/**
		 * The meta object literal for the '<em><b>Phone no</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_DATA__PHONE_NO = eINSTANCE.getContactData_Phone_no();

	}

} //SharedPackage
