/**
 */
package CodePack.impl;

import BankingModel.BankingModelPackage;
import BankingModel.impl.BankingModelPackageImpl;
import CodePack.Backend.BackendPackage;
import CodePack.Backend.impl.BackendPackageImpl;
import CodePack.CheckInMachine;
import CodePack.CodePackFactory;
import CodePack.CodePackPackage;
import CodePack.DataBank;
import CodePack.DataModels.DataModelsPackage;
import CodePack.DataModels.impl.DataModelsPackageImpl;
import CodePack.IBookings;
import CodePack.ICheckIn;
import CodePack.IManagement;
import CodePack.IReceptionOperations_rename_required;
import CodePack.IStaffAdmin;
import CodePack.IStaffAuthentication;
import CodePack.IUserAccount;
import CodePack.Shared.SharedPackage;
import CodePack.Shared.impl.SharedPackageImpl;
import CodePack.StaffGUI;
import CodePack.UserGUI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
public class CodePackPackageImpl extends EPackageImpl implements CodePackPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iUserAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBookingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iStaffAdminEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iStaffAuthenticationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iCheckInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iReceptionOperations_rename_requiredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffGUIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userGUIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkInMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataBankEClass = null;

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
	 * @see CodePack.CodePackPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CodePackPackageImpl() {
		super(eNS_URI, CodePackFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CodePackPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CodePackPackage init() {
		if (isInited) return (CodePackPackage)EPackage.Registry.INSTANCE.getEPackage(CodePackPackage.eNS_URI);

		// Obtain or create and register package
		CodePackPackageImpl theCodePackPackage = (CodePackPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CodePackPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CodePackPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DataModelsPackageImpl theDataModelsPackage = (DataModelsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataModelsPackage.eNS_URI) instanceof DataModelsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataModelsPackage.eNS_URI) : DataModelsPackage.eINSTANCE);
		SharedPackageImpl theSharedPackage = (SharedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SharedPackage.eNS_URI) instanceof SharedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SharedPackage.eNS_URI) : SharedPackage.eINSTANCE);
		BackendPackageImpl theBackendPackage = (BackendPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BackendPackage.eNS_URI) instanceof BackendPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BackendPackage.eNS_URI) : BackendPackage.eINSTANCE);
		BankingModelPackageImpl theBankingModelPackage = (BankingModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BankingModelPackage.eNS_URI) instanceof BankingModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BankingModelPackage.eNS_URI) : BankingModelPackage.eINSTANCE);

		// Create package meta-data objects
		theCodePackPackage.createPackageContents();
		theDataModelsPackage.createPackageContents();
		theSharedPackage.createPackageContents();
		theBackendPackage.createPackageContents();
		theBankingModelPackage.createPackageContents();

		// Initialize created meta-data
		theCodePackPackage.initializePackageContents();
		theDataModelsPackage.initializePackageContents();
		theSharedPackage.initializePackageContents();
		theBackendPackage.initializePackageContents();
		theBankingModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCodePackPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CodePackPackage.eNS_URI, theCodePackPackage);
		return theCodePackPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIUserAccount() {
		return iUserAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIUserAccount__IsEmailAvailable__String() {
		return iUserAccountEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIUserAccount__Login__String_String() {
		return iUserAccountEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIUserAccount__UpdateCustomerCC__int_String_String_int_int_String_String() {
		return iUserAccountEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIUserAccount__UpdateCustomerPwd__int_String_String() {
		return iUserAccountEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIUserAccount__UpdateCustomerInfo__String_String_int() {
		return iUserAccountEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIUserAccount__RegisterCustomer__String_String_Date_int_String_String() {
		return iUserAccountEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIUserAccount__GetCustomerInfo__int() {
		return iUserAccountEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBookings() {
		return iBookingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__CreateBooking__ContactData_PaymentData_EList_EList_int_Date_Date() {
		return iBookingsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__CreateBookingForCustomer__int_EList_EList_int_Date_Date() {
		return iBookingsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__UpdateRoomForBooking__int_int_int() {
		return iBookingsEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__UpdateServiceForBooking__int_ExtraService() {
		return iBookingsEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__GetAvailableRooms__Date_Date() {
		return iBookingsEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__GetAvailableServices() {
		return iBookingsEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__IsRoomAvailable__int_Date_Date() {
		return iBookingsEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__GetBookingsForCustomer__int() {
		return iBookingsEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__GetBookingForId__int() {
		return iBookingsEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__UpdateTimeForBooking__int_Date_Date() {
		return iBookingsEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__CancelBooking__int() {
		return iBookingsEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__GetPaymentForBooking__int() {
		return iBookingsEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__SendComfimationMail__Booking() {
		return iBookingsEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIStaffAdmin() {
		return iStaffAdminEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaffAdmin__RegisterStaffAccount__String_String_String_int_String() {
		return iStaffAdminEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaffAdmin__UpdateStaffAccount__StaffMember() {
		return iStaffAdminEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaffAdmin__GetStaffAccount__String() {
		return iStaffAdminEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaffAdmin__GetAllStaffAccounts() {
		return iStaffAdminEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaffAdmin__RemoveStaffAccount__StaffMember() {
		return iStaffAdminEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaffAdmin__GetStaffRoles() {
		return iStaffAdminEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaffAdmin__AddStaffRole__String_boolean_boolean_boolean_boolean() {
		return iStaffAdminEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaffAdmin__UpdateStaffRole__StaffRole() {
		return iStaffAdminEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaffAdmin__RemoveStaffRole__StaffRole() {
		return iStaffAdminEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIStaffAuthentication() {
		return iStaffAuthenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaffAuthentication__Login__String_String() {
		return iStaffAuthenticationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaffAuthentication__GetRoleForStaff__String() {
		return iStaffAuthenticationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIManagement() {
		return iManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIManagement__AddRoom__int_String_boolean_String() {
		return iManagementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIManagement__UpdateRoom__Room() {
		return iManagementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIManagement__RemoveRoom__int() {
		return iManagementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIManagement__AddRoomType__String_String_int_double() {
		return iManagementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIManagement__UpdateRoomType__RoomType() {
		return iManagementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIManagement__RemoveRoomType__String() {
		return iManagementEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIManagement__GetRoom__int() {
		return iManagementEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIManagement__GetAllRooms() {
		return iManagementEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIManagement__GetRoomTypes() {
		return iManagementEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIManagement__GetServiceTypes() {
		return iManagementEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIManagement__UpdateServiceType__ServiceType() {
		return iManagementEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIManagement__RemoveServiceType__ServiceType() {
		return iManagementEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getICheckIn() {
		return iCheckInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICheckIn__ValidateBooking__int() {
		return iCheckInEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICheckIn__AssignGuestToBooking__int_String() {
		return iCheckInEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIReceptionOperations_rename_required() {
		return iReceptionOperations_rename_requiredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIReceptionOperations_rename_required__IsCheckedIn__int() {
		return iReceptionOperations_rename_requiredEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIReceptionOperations_rename_required__GenerateReceipt__Bill() {
		return iReceptionOperations_rename_requiredEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIReceptionOperations_rename_required__GenerateBill__int() {
		return iReceptionOperations_rename_requiredEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaffGUI() {
		return staffGUIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaffGUI_ManagementHandler() {
		return (EReference)staffGUIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaffGUI_ReceptionHandler() {
		return (EReference)staffGUIEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserGUI() {
		return userGUIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserGUI_CustomerHandler() {
		return (EReference)userGUIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckInMachine() {
		return checkInMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckInMachine_CheckInHandler() {
		return (EReference)checkInMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataBank() {
		return dataBankEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBank_RoomList() {
		return (EReference)dataBankEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBank_BookingList() {
		return (EReference)dataBankEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBank_CustomerList() {
		return (EReference)dataBankEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBank_RoomTypeList() {
		return (EReference)dataBankEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBank_PaymentDataList() {
		return (EReference)dataBankEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBank_RoomBookedList() {
		return (EReference)dataBankEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBank_ExtraServiceList() {
		return (EReference)dataBankEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBank_ServiceTypeList() {
		return (EReference)dataBankEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBank_GuestList() {
		return (EReference)dataBankEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBank_StaffRoleList() {
		return (EReference)dataBankEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBank_StaffMemberList() {
		return (EReference)dataBankEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodePackFactory getCodePackFactory() {
		return (CodePackFactory)getEFactoryInstance();
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
		iUserAccountEClass = createEClass(IUSER_ACCOUNT);
		createEOperation(iUserAccountEClass, IUSER_ACCOUNT___IS_EMAIL_AVAILABLE__STRING);
		createEOperation(iUserAccountEClass, IUSER_ACCOUNT___LOGIN__STRING_STRING);
		createEOperation(iUserAccountEClass, IUSER_ACCOUNT___UPDATE_CUSTOMER_CC__INT_STRING_STRING_INT_INT_STRING_STRING);
		createEOperation(iUserAccountEClass, IUSER_ACCOUNT___UPDATE_CUSTOMER_PWD__INT_STRING_STRING);
		createEOperation(iUserAccountEClass, IUSER_ACCOUNT___UPDATE_CUSTOMER_INFO__STRING_STRING_INT);
		createEOperation(iUserAccountEClass, IUSER_ACCOUNT___REGISTER_CUSTOMER__STRING_STRING_DATE_INT_STRING_STRING);
		createEOperation(iUserAccountEClass, IUSER_ACCOUNT___GET_CUSTOMER_INFO__INT);

		iBookingsEClass = createEClass(IBOOKINGS);
		createEOperation(iBookingsEClass, IBOOKINGS___CREATE_BOOKING__CONTACTDATA_PAYMENTDATA_ELIST_ELIST_INT_DATE_DATE);
		createEOperation(iBookingsEClass, IBOOKINGS___CREATE_BOOKING_FOR_CUSTOMER__INT_ELIST_ELIST_INT_DATE_DATE);
		createEOperation(iBookingsEClass, IBOOKINGS___UPDATE_ROOM_FOR_BOOKING__INT_INT_INT);
		createEOperation(iBookingsEClass, IBOOKINGS___UPDATE_SERVICE_FOR_BOOKING__INT_EXTRASERVICE);
		createEOperation(iBookingsEClass, IBOOKINGS___GET_AVAILABLE_ROOMS__DATE_DATE);
		createEOperation(iBookingsEClass, IBOOKINGS___GET_AVAILABLE_SERVICES);
		createEOperation(iBookingsEClass, IBOOKINGS___IS_ROOM_AVAILABLE__INT_DATE_DATE);
		createEOperation(iBookingsEClass, IBOOKINGS___GET_BOOKINGS_FOR_CUSTOMER__INT);
		createEOperation(iBookingsEClass, IBOOKINGS___GET_BOOKING_FOR_ID__INT);
		createEOperation(iBookingsEClass, IBOOKINGS___UPDATE_TIME_FOR_BOOKING__INT_DATE_DATE);
		createEOperation(iBookingsEClass, IBOOKINGS___CANCEL_BOOKING__INT);
		createEOperation(iBookingsEClass, IBOOKINGS___GET_PAYMENT_FOR_BOOKING__INT);
		createEOperation(iBookingsEClass, IBOOKINGS___SEND_COMFIMATION_MAIL__BOOKING);

		iStaffAdminEClass = createEClass(ISTAFF_ADMIN);
		createEOperation(iStaffAdminEClass, ISTAFF_ADMIN___REGISTER_STAFF_ACCOUNT__STRING_STRING_STRING_INT_STRING);
		createEOperation(iStaffAdminEClass, ISTAFF_ADMIN___UPDATE_STAFF_ACCOUNT__STAFFMEMBER);
		createEOperation(iStaffAdminEClass, ISTAFF_ADMIN___GET_STAFF_ACCOUNT__STRING);
		createEOperation(iStaffAdminEClass, ISTAFF_ADMIN___GET_ALL_STAFF_ACCOUNTS);
		createEOperation(iStaffAdminEClass, ISTAFF_ADMIN___REMOVE_STAFF_ACCOUNT__STAFFMEMBER);
		createEOperation(iStaffAdminEClass, ISTAFF_ADMIN___GET_STAFF_ROLES);
		createEOperation(iStaffAdminEClass, ISTAFF_ADMIN___ADD_STAFF_ROLE__STRING_BOOLEAN_BOOLEAN_BOOLEAN_BOOLEAN);
		createEOperation(iStaffAdminEClass, ISTAFF_ADMIN___UPDATE_STAFF_ROLE__STAFFROLE);
		createEOperation(iStaffAdminEClass, ISTAFF_ADMIN___REMOVE_STAFF_ROLE__STAFFROLE);

		iStaffAuthenticationEClass = createEClass(ISTAFF_AUTHENTICATION);
		createEOperation(iStaffAuthenticationEClass, ISTAFF_AUTHENTICATION___LOGIN__STRING_STRING);
		createEOperation(iStaffAuthenticationEClass, ISTAFF_AUTHENTICATION___GET_ROLE_FOR_STAFF__STRING);

		iManagementEClass = createEClass(IMANAGEMENT);
		createEOperation(iManagementEClass, IMANAGEMENT___ADD_ROOM__INT_STRING_BOOLEAN_STRING);
		createEOperation(iManagementEClass, IMANAGEMENT___UPDATE_ROOM__ROOM);
		createEOperation(iManagementEClass, IMANAGEMENT___REMOVE_ROOM__INT);
		createEOperation(iManagementEClass, IMANAGEMENT___ADD_ROOM_TYPE__STRING_STRING_INT_DOUBLE);
		createEOperation(iManagementEClass, IMANAGEMENT___UPDATE_ROOM_TYPE__ROOMTYPE);
		createEOperation(iManagementEClass, IMANAGEMENT___REMOVE_ROOM_TYPE__STRING);
		createEOperation(iManagementEClass, IMANAGEMENT___GET_ROOM__INT);
		createEOperation(iManagementEClass, IMANAGEMENT___GET_ALL_ROOMS);
		createEOperation(iManagementEClass, IMANAGEMENT___GET_ROOM_TYPES);
		createEOperation(iManagementEClass, IMANAGEMENT___GET_SERVICE_TYPES);
		createEOperation(iManagementEClass, IMANAGEMENT___UPDATE_SERVICE_TYPE__SERVICETYPE);
		createEOperation(iManagementEClass, IMANAGEMENT___REMOVE_SERVICE_TYPE__SERVICETYPE);

		iCheckInEClass = createEClass(ICHECK_IN);
		createEOperation(iCheckInEClass, ICHECK_IN___VALIDATE_BOOKING__INT);
		createEOperation(iCheckInEClass, ICHECK_IN___ASSIGN_GUEST_TO_BOOKING__INT_STRING);

		iReceptionOperations_rename_requiredEClass = createEClass(IRECEPTION_OPERATIONS_RENAME_REQUIRED);
		createEOperation(iReceptionOperations_rename_requiredEClass, IRECEPTION_OPERATIONS_RENAME_REQUIRED___GENERATE_BILL__INT);
		createEOperation(iReceptionOperations_rename_requiredEClass, IRECEPTION_OPERATIONS_RENAME_REQUIRED___IS_CHECKED_IN__INT);
		createEOperation(iReceptionOperations_rename_requiredEClass, IRECEPTION_OPERATIONS_RENAME_REQUIRED___GENERATE_RECEIPT__BILL);

		staffGUIEClass = createEClass(STAFF_GUI);
		createEReference(staffGUIEClass, STAFF_GUI__MANAGEMENT_HANDLER);
		createEReference(staffGUIEClass, STAFF_GUI__RECEPTION_HANDLER);

		userGUIEClass = createEClass(USER_GUI);
		createEReference(userGUIEClass, USER_GUI__CUSTOMER_HANDLER);

		checkInMachineEClass = createEClass(CHECK_IN_MACHINE);
		createEReference(checkInMachineEClass, CHECK_IN_MACHINE__CHECK_IN_HANDLER);

		dataBankEClass = createEClass(DATA_BANK);
		createEReference(dataBankEClass, DATA_BANK__ROOM_LIST);
		createEReference(dataBankEClass, DATA_BANK__BOOKING_LIST);
		createEReference(dataBankEClass, DATA_BANK__CUSTOMER_LIST);
		createEReference(dataBankEClass, DATA_BANK__ROOM_TYPE_LIST);
		createEReference(dataBankEClass, DATA_BANK__PAYMENT_DATA_LIST);
		createEReference(dataBankEClass, DATA_BANK__ROOM_BOOKED_LIST);
		createEReference(dataBankEClass, DATA_BANK__EXTRA_SERVICE_LIST);
		createEReference(dataBankEClass, DATA_BANK__SERVICE_TYPE_LIST);
		createEReference(dataBankEClass, DATA_BANK__GUEST_LIST);
		createEReference(dataBankEClass, DATA_BANK__STAFF_ROLE_LIST);
		createEReference(dataBankEClass, DATA_BANK__STAFF_MEMBER_LIST);
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
		DataModelsPackage theDataModelsPackage = (DataModelsPackage)EPackage.Registry.INSTANCE.getEPackage(DataModelsPackage.eNS_URI);
		SharedPackage theSharedPackage = (SharedPackage)EPackage.Registry.INSTANCE.getEPackage(SharedPackage.eNS_URI);
		BackendPackage theBackendPackage = (BackendPackage)EPackage.Registry.INSTANCE.getEPackage(BackendPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDataModelsPackage);
		getESubpackages().add(theSharedPackage);
		getESubpackages().add(theBackendPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		iUserAccountEClass.getESuperTypes().add(this.getIBookings());
		iManagementEClass.getESuperTypes().add(this.getIStaffAdmin());
		iManagementEClass.getESuperTypes().add(this.getIStaffAuthentication());
		iReceptionOperations_rename_requiredEClass.getESuperTypes().add(this.getIBookings());
		iReceptionOperations_rename_requiredEClass.getESuperTypes().add(this.getICheckIn());
		iReceptionOperations_rename_requiredEClass.getESuperTypes().add(this.getIStaffAuthentication());

		// Initialize classes, features, and operations; add parameters
		initEClass(iUserAccountEClass, IUserAccount.class, "IUserAccount", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getIUserAccount__IsEmailAvailable__String(), ecorePackage.getEBoolean(), "isEmailAvailable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "e_mail", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIUserAccount__Login__String_String(), ecorePackage.getEInt(), "login", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "e_mail", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIUserAccount__UpdateCustomerCC__int_String_String_int_int_String_String(), ecorePackage.getEBoolean(), "updateCustomerCC", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "customer_id", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "cc_number", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "cc_ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "cc_month", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "cc_year", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name_first", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name_last", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIUserAccount__UpdateCustomerPwd__int_String_String(), ecorePackage.getEBoolean(), "updateCustomerPwd", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "customer_id", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "pwd_old", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "pwd_new", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIUserAccount__UpdateCustomerInfo__String_String_int(), ecorePackage.getEBoolean(), "updateCustomerInfo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "e_mail", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "phone_no", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "customer_id", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIUserAccount__RegisterCustomer__String_String_Date_int_String_String(), ecorePackage.getEBoolean(), "registerCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "e_mail", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date_of_birth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "phone_no", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "first_name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "last_name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIUserAccount__GetCustomerInfo__int(), theDataModelsPackage.getCustomer(), "getCustomerInfo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "customer_id", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iBookingsEClass, IBookings.class, "IBookings", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIBookings__CreateBooking__ContactData_PaymentData_EList_EList_int_Date_Date(), theDataModelsPackage.getBooking(), "createBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theSharedPackage.getContactData(), "contact_data", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDataModelsPackage.getPaymentData(), "payment_data", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDataModelsPackage.getRoom(), "rooms", 1, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDataModelsPackage.getExtraService(), "services", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "number_of_guests", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date_check_in", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date_check_out", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookings__CreateBookingForCustomer__int_EList_EList_int_Date_Date(), theDataModelsPackage.getBooking(), "createBookingForCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "customer_id", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDataModelsPackage.getRoom(), "rooms", 1, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDataModelsPackage.getExtraService(), "services", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "number_of_guests", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date_check_in", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date_check_out", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookings__UpdateRoomForBooking__int_int_int(), ecorePackage.getEBoolean(), "updateRoomForBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "booking_id", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "old_room", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "new_room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookings__UpdateServiceForBooking__int_ExtraService(), ecorePackage.getEBoolean(), "updateServiceForBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "old_service_id", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDataModelsPackage.getExtraService(), "new_service", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookings__GetAvailableRooms__Date_Date(), theDataModelsPackage.getRoom(), "getAvailableRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date_start", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date_end", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBookings__GetAvailableServices(), theDataModelsPackage.getServiceType(), "getAvailableServices", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookings__IsRoomAvailable__int_Date_Date(), ecorePackage.getEBoolean(), "isRoomAvailable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "room_number", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date_start", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date_end", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookings__GetBookingsForCustomer__int(), theDataModelsPackage.getBooking(), "getBookingsForCustomer", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "customer_id", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookings__GetBookingForId__int(), theDataModelsPackage.getBooking(), "getBookingForId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "booking_id", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookings__UpdateTimeForBooking__int_Date_Date(), ecorePackage.getEBoolean(), "updateTimeForBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "booking_id", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "new_check_in", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "new_check_out", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookings__CancelBooking__int(), ecorePackage.getEBoolean(), "cancelBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "booking_id", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookings__GetPaymentForBooking__int(), theDataModelsPackage.getPaymentData(), "getPaymentForBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "booking_id", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookings__SendComfimationMail__Booking(), null, "sendComfimationMail", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDataModelsPackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iStaffAdminEClass, IStaffAdmin.class, "IStaffAdmin", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIStaffAdmin__RegisterStaffAccount__String_String_String_int_String(), theDataModelsPackage.getStaffMember(), "registerStaffAccount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "pers_no", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "phone_no", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "role_name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIStaffAdmin__UpdateStaffAccount__StaffMember(), ecorePackage.getEBoolean(), "updateStaffAccount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDataModelsPackage.getStaffMember(), "account", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIStaffAdmin__GetStaffAccount__String(), theDataModelsPackage.getStaffMember(), "getStaffAccount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "pers_no", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIStaffAdmin__GetAllStaffAccounts(), theDataModelsPackage.getStaffMember(), "getAllStaffAccounts", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIStaffAdmin__RemoveStaffAccount__StaffMember(), ecorePackage.getEBoolean(), "removeStaffAccount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDataModelsPackage.getStaffMember(), "account", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIStaffAdmin__GetStaffRoles(), theDataModelsPackage.getStaffRole(), "getStaffRoles", 1, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIStaffAdmin__AddStaffRole__String_boolean_boolean_boolean_boolean(), theDataModelsPackage.getStaffRole(), "addStaffRole", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "canManageBookings", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "canManageRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "canManageServices", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "canManageAccounts", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIStaffAdmin__UpdateStaffRole__StaffRole(), ecorePackage.getEBoolean(), "updateStaffRole", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDataModelsPackage.getStaffRole(), "role", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIStaffAdmin__RemoveStaffRole__StaffRole(), ecorePackage.getEBoolean(), "removeStaffRole", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDataModelsPackage.getStaffRole(), "role", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iStaffAuthenticationEClass, IStaffAuthentication.class, "IStaffAuthentication", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIStaffAuthentication__Login__String_String(), theDataModelsPackage.getStaffMember(), "login", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "e_mail", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIStaffAuthentication__GetRoleForStaff__String(), theDataModelsPackage.getStaffRole(), "getRoleForStaff", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "pers_no", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iManagementEClass, IManagement.class, "IManagement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIManagement__AddRoom__int_String_boolean_String(), ecorePackage.getEBoolean(), "addRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "number", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isAvailable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "type", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIManagement__UpdateRoom__Room(), ecorePackage.getEBoolean(), "updateRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDataModelsPackage.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIManagement__RemoveRoom__int(), ecorePackage.getEBoolean(), "removeRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "number", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIManagement__AddRoomType__String_String_int_double(), ecorePackage.getEBoolean(), "addRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "max_guests", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "rate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIManagement__UpdateRoomType__RoomType(), ecorePackage.getEBoolean(), "updateRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDataModelsPackage.getRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIManagement__RemoveRoomType__String(), ecorePackage.getEBoolean(), "removeRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "type_name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIManagement__GetRoom__int(), theDataModelsPackage.getRoom(), "getRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "number", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIManagement__GetAllRooms(), theDataModelsPackage.getRoom(), "getAllRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIManagement__GetRoomTypes(), theDataModelsPackage.getRoomType(), "getRoomTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIManagement__GetServiceTypes(), theDataModelsPackage.getServiceType(), "getServiceTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIManagement__UpdateServiceType__ServiceType(), ecorePackage.getEBoolean(), "updateServiceType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDataModelsPackage.getServiceType(), "serviceType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIManagement__RemoveServiceType__ServiceType(), ecorePackage.getEBoolean(), "removeServiceType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDataModelsPackage.getServiceType(), "serviceType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iCheckInEClass, ICheckIn.class, "ICheckIn", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getICheckIn__ValidateBooking__int(), ecorePackage.getEBoolean(), "validateBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "booking_id", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getICheckIn__AssignGuestToBooking__int_String(), theDataModelsPackage.getBooking(), "assignGuestToBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "booking_id", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "guest_name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iReceptionOperations_rename_requiredEClass, IReceptionOperations_rename_required.class, "IReceptionOperations_rename_required", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIReceptionOperations_rename_required__GenerateBill__int(), theDataModelsPackage.getBill(), "generateBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "booking_id", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIReceptionOperations_rename_required__IsCheckedIn__int(), ecorePackage.getEBoolean(), "isCheckedIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "booking_id", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIReceptionOperations_rename_required__GenerateReceipt__Bill(), ecorePackage.getEString(), "generateReceipt", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDataModelsPackage.getBill(), "bill", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(staffGUIEClass, StaffGUI.class, "StaffGUI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaffGUI_ManagementHandler(), theBackendPackage.getManagementHandler(), null, "managementHandler", null, 0, 1, StaffGUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStaffGUI_ReceptionHandler(), theBackendPackage.getReceptionHandler(), null, "receptionHandler", null, 0, 1, StaffGUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(userGUIEClass, UserGUI.class, "UserGUI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserGUI_CustomerHandler(), theBackendPackage.getCustomerHandler(), null, "customerHandler", null, 0, 1, UserGUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(checkInMachineEClass, CheckInMachine.class, "CheckInMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCheckInMachine_CheckInHandler(), theBackendPackage.getCheckInHandler(), null, "checkInHandler", null, 0, 1, CheckInMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataBankEClass, DataBank.class, "DataBank", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataBank_RoomList(), theDataModelsPackage.getRoom(), null, "roomList", null, 1, -1, DataBank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataBank_BookingList(), theDataModelsPackage.getBooking(), null, "bookingList", null, 1, -1, DataBank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataBank_CustomerList(), theDataModelsPackage.getCustomer(), null, "customerList", null, 1, -1, DataBank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataBank_RoomTypeList(), theDataModelsPackage.getRoomType(), null, "roomTypeList", null, 1, -1, DataBank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataBank_PaymentDataList(), theDataModelsPackage.getPaymentData(), null, "paymentDataList", null, 1, -1, DataBank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataBank_RoomBookedList(), theDataModelsPackage.getRoomBooked(), null, "roomBookedList", null, 1, -1, DataBank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataBank_ExtraServiceList(), theDataModelsPackage.getExtraService(), null, "extraServiceList", null, 1, -1, DataBank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataBank_ServiceTypeList(), theDataModelsPackage.getServiceType(), null, "serviceTypeList", null, 1, -1, DataBank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataBank_GuestList(), theDataModelsPackage.getGuest(), null, "GuestList", null, 1, -1, DataBank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataBank_StaffRoleList(), theDataModelsPackage.getStaffRole(), null, "staffRoleList", null, 1, -1, DataBank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataBank_StaffMemberList(), theDataModelsPackage.getStaffMember(), null, "staffMemberList", null, 1, -1, DataBank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  (dataBankEClass, 
		   source, 
		   new String[] {
			 "originalName", "Data Bank"
		   });
	}
	
} //CodePackPackageImpl
