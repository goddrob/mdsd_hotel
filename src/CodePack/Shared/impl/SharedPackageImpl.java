/**
 */
package CodePack.Shared.impl;

import BankingModel.BankingModelPackage;
import BankingModel.impl.BankingModelPackageImpl;
import CodePack.Backend.BackendPackage;
import CodePack.Backend.impl.BackendPackageImpl;
import CodePack.CodePackPackage;
import CodePack.DataModels.DataModelsPackage;
import CodePack.DataModels.impl.DataModelsPackageImpl;
import CodePack.Shared.ContactData;
import CodePack.Shared.SharedFactory;
import CodePack.Shared.SharedPackage;
import CodePack.impl.CodePackPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SharedPackageImpl extends EPackageImpl implements SharedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactDataEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see CodePack.Shared.SharedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SharedPackageImpl() {
		super(eNS_URI, SharedFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SharedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SharedPackage init() {
		if (isInited) return (SharedPackage)EPackage.Registry.INSTANCE.getEPackage(SharedPackage.eNS_URI);

		// Obtain or create and register package
		SharedPackageImpl theSharedPackage = (SharedPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SharedPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SharedPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CodePackPackageImpl theCodePackPackage = (CodePackPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CodePackPackage.eNS_URI) instanceof CodePackPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CodePackPackage.eNS_URI) : CodePackPackage.eINSTANCE);
		DataModelsPackageImpl theDataModelsPackage = (DataModelsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataModelsPackage.eNS_URI) instanceof DataModelsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataModelsPackage.eNS_URI) : DataModelsPackage.eINSTANCE);
		BackendPackageImpl theBackendPackage = (BackendPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BackendPackage.eNS_URI) instanceof BackendPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BackendPackage.eNS_URI) : BackendPackage.eINSTANCE);
		BankingModelPackageImpl theBankingModelPackage = (BankingModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BankingModelPackage.eNS_URI) instanceof BankingModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BankingModelPackage.eNS_URI) : BankingModelPackage.eINSTANCE);

		// Create package meta-data objects
		theSharedPackage.createPackageContents();
		theCodePackPackage.createPackageContents();
		theDataModelsPackage.createPackageContents();
		theBackendPackage.createPackageContents();
		theBankingModelPackage.createPackageContents();

		// Initialize created meta-data
		theSharedPackage.initializePackageContents();
		theCodePackPackage.initializePackageContents();
		theDataModelsPackage.initializePackageContents();
		theBackendPackage.initializePackageContents();
		theBankingModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSharedPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SharedPackage.eNS_URI, theSharedPackage);
		return theSharedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContactData() {
		return contactDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactData_Full_name() {
		return (EAttribute)contactDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactData_E_mail() {
		return (EAttribute)contactDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactData_Phone_no() {
		return (EAttribute)contactDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedFactory getSharedFactory() {
		return (SharedFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		contactDataEClass = createEClass(CONTACT_DATA);
		createEAttribute(contactDataEClass, CONTACT_DATA__FULL_NAME);
		createEAttribute(contactDataEClass, CONTACT_DATA__EMAIL);
		createEAttribute(contactDataEClass, CONTACT_DATA__PHONE_NO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(contactDataEClass, ContactData.class, "ContactData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContactData_Full_name(), ecorePackage.getEString(), "full_name", null, 1, 1, ContactData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getContactData_E_mail(), ecorePackage.getEString(), "e_mail", null, 1, 1, ContactData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getContactData_Phone_no(), ecorePackage.getEInt(), "phone_no", null, 1, 1, ContactData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //SharedPackageImpl
