/**
 */
package CodePack.Backend.impl;

import BankingModel.BankingModelPackage;
import BankingModel.impl.BankingModelPackageImpl;
import CodePack.Backend.BackendFactory;
import CodePack.Backend.BackendPackage;
import CodePack.Backend.CheckInHandler;
import CodePack.Backend.CustomerHandler;
import CodePack.Backend.ManagementHandler;
import CodePack.Backend.ReceptionHandler;
import CodePack.CodePackPackage;
import CodePack.DataModels.DataModelsPackage;
import CodePack.DataModels.impl.DataModelsPackageImpl;
import CodePack.Shared.SharedPackage;
import CodePack.Shared.impl.SharedPackageImpl;
import CodePack.impl.CodePackPackageImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BackendPackageImpl extends EPackageImpl implements BackendPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receptionHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkInHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managementHandlerEClass = null;

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
	 * @see CodePack.Backend.BackendPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BackendPackageImpl() {
		super(eNS_URI, BackendFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BackendPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BackendPackage init() {
		if (isInited) return (BackendPackage)EPackage.Registry.INSTANCE.getEPackage(BackendPackage.eNS_URI);

		// Obtain or create and register package
		BackendPackageImpl theBackendPackage = (BackendPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BackendPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BackendPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CodePackPackageImpl theCodePackPackage = (CodePackPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CodePackPackage.eNS_URI) instanceof CodePackPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CodePackPackage.eNS_URI) : CodePackPackage.eINSTANCE);
		DataModelsPackageImpl theDataModelsPackage = (DataModelsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataModelsPackage.eNS_URI) instanceof DataModelsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataModelsPackage.eNS_URI) : DataModelsPackage.eINSTANCE);
		SharedPackageImpl theSharedPackage = (SharedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SharedPackage.eNS_URI) instanceof SharedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SharedPackage.eNS_URI) : SharedPackage.eINSTANCE);
		BankingModelPackageImpl theBankingModelPackage = (BankingModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BankingModelPackage.eNS_URI) instanceof BankingModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BankingModelPackage.eNS_URI) : BankingModelPackage.eINSTANCE);

		// Create package meta-data objects
		theBackendPackage.createPackageContents();
		theCodePackPackage.createPackageContents();
		theDataModelsPackage.createPackageContents();
		theSharedPackage.createPackageContents();
		theBankingModelPackage.createPackageContents();

		// Initialize created meta-data
		theBackendPackage.initializePackageContents();
		theCodePackPackage.initializePackageContents();
		theDataModelsPackage.initializePackageContents();
		theSharedPackage.initializePackageContents();
		theBankingModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBackendPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BackendPackage.eNS_URI, theBackendPackage);
		return theBackendPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomerHandler() {
		return customerHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerHandler_BankComponent() {
		return (EReference)customerHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceptionHandler() {
		return receptionHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceptionHandler_BankComponent() {
		return (EReference)receptionHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckInHandler() {
		return checkInHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManagementHandler() {
		return managementHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackendFactory getBackendFactory() {
		return (BackendFactory)getEFactoryInstance();
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
		customerHandlerEClass = createEClass(CUSTOMER_HANDLER);
		createEReference(customerHandlerEClass, CUSTOMER_HANDLER__BANK_COMPONENT);

		receptionHandlerEClass = createEClass(RECEPTION_HANDLER);
		createEReference(receptionHandlerEClass, RECEPTION_HANDLER__BANK_COMPONENT);

		checkInHandlerEClass = createEClass(CHECK_IN_HANDLER);

		managementHandlerEClass = createEClass(MANAGEMENT_HANDLER);
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

		// Obtain other dependent packages
		CodePackPackage theCodePackPackage = (CodePackPackage)EPackage.Registry.INSTANCE.getEPackage(CodePackPackage.eNS_URI);
		BankingModelPackage theBankingModelPackage = (BankingModelPackage)EPackage.Registry.INSTANCE.getEPackage(BankingModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		customerHandlerEClass.getESuperTypes().add(theCodePackPackage.getIUserAccount());
		receptionHandlerEClass.getESuperTypes().add(theCodePackPackage.getIReceptionOperations_rename_required());
		checkInHandlerEClass.getESuperTypes().add(theCodePackPackage.getICheckIn());
		managementHandlerEClass.getESuperTypes().add(theCodePackPackage.getIManagement());

		// Initialize classes, features, and operations; add parameters
		initEClass(customerHandlerEClass, CustomerHandler.class, "CustomerHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomerHandler_BankComponent(), theBankingModelPackage.getBankComponent(), null, "bankComponent", null, 1, 1, CustomerHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(receptionHandlerEClass, ReceptionHandler.class, "ReceptionHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReceptionHandler_BankComponent(), theBankingModelPackage.getBankComponent(), null, "bankComponent", null, 1, 1, ReceptionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(checkInHandlerEClass, CheckInHandler.class, "CheckInHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(managementHandlerEClass, ManagementHandler.class, "ManagementHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //BackendPackageImpl
