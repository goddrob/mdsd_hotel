/**
 */
package CodePack.impl;

import CodePack.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodePackFactoryImpl extends EFactoryImpl implements CodePackFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CodePackFactory init() {
		try {
			CodePackFactory theCodePackFactory = (CodePackFactory)EPackage.Registry.INSTANCE.getEFactory(CodePackPackage.eNS_URI);
			if (theCodePackFactory != null) {
				return theCodePackFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CodePackFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodePackFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CodePackPackage.STAFF_GUI: return createStaffGUI();
			case CodePackPackage.USER_GUI: return createUserGUI();
			case CodePackPackage.CHECK_IN_MACHINE: return createCheckInMachine();
			case CodePackPackage.DATA_BANK: return createDataBank();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffGUI createStaffGUI() {
		StaffGUIImpl staffGUI = new StaffGUIImpl();
		return staffGUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserGUI createUserGUI() {
		UserGUIImpl userGUI = new UserGUIImpl();
		return userGUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckInMachine createCheckInMachine() {
		CheckInMachineImpl checkInMachine = new CheckInMachineImpl();
		return checkInMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBank createDataBank() {
		DataBankImpl dataBank = new DataBankImpl();
		return dataBank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodePackPackage getCodePackPackage() {
		return (CodePackPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CodePackPackage getPackage() {
		return CodePackPackage.eINSTANCE;
	}

} //CodePackFactoryImpl
