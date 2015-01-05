/**
 */
package CodePack.Backend.impl;

import CodePack.Backend.*;

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
public class BackendFactoryImpl extends EFactoryImpl implements BackendFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BackendFactory init() {
		try {
			BackendFactory theBackendFactory = (BackendFactory)EPackage.Registry.INSTANCE.getEFactory(BackendPackage.eNS_URI);
			if (theBackendFactory != null) {
				return theBackendFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BackendFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackendFactoryImpl() {
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
			case BackendPackage.CUSTOMER_HANDLER: return createCustomerHandler();
			case BackendPackage.RECEPTION_HANDLER: return createReceptionHandler();
			case BackendPackage.CHECK_IN_HANDLER: return createCheckInHandler();
			case BackendPackage.MANAGEMENT_HANDLER: return createManagementHandler();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerHandler createCustomerHandler() {
		CustomerHandlerImpl customerHandler = new CustomerHandlerImpl();
		return customerHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceptionHandler createReceptionHandler() {
		ReceptionHandlerImpl receptionHandler = new ReceptionHandlerImpl();
		return receptionHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckInHandler createCheckInHandler() {
		CheckInHandlerImpl checkInHandler = new CheckInHandlerImpl();
		return checkInHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementHandler createManagementHandler() {
		ManagementHandlerImpl managementHandler = new ManagementHandlerImpl();
		return managementHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackendPackage getBackendPackage() {
		return (BackendPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BackendPackage getPackage() {
		return BackendPackage.eINSTANCE;
	}

} //BackendFactoryImpl
