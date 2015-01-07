/**
 */
package CodePack.Backend.util;

import CodePack.Backend.*;

import CodePack.IBookings;
import CodePack.ICheckIn;
import CodePack.IManagement;
import CodePack.IReceptionOperations_rename_required;
import CodePack.IStaffAdmin;
import CodePack.IStaffAuthentication;
import CodePack.IUserAccount;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CodePack.Backend.BackendPackage
 * @generated
 */
public class BackendAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BackendPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackendAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BackendPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BackendSwitch<Adapter> modelSwitch =
		new BackendSwitch<Adapter>() {
			@Override
			public Adapter caseCustomerHandler(CustomerHandler object) {
				return createCustomerHandlerAdapter();
			}
			@Override
			public Adapter caseReceptionHandler(ReceptionHandler object) {
				return createReceptionHandlerAdapter();
			}
			@Override
			public Adapter caseCheckInHandler(CheckInHandler object) {
				return createCheckInHandlerAdapter();
			}
			@Override
			public Adapter caseManagementHandler(ManagementHandler object) {
				return createManagementHandlerAdapter();
			}
			@Override
			public Adapter caseIBookings(IBookings object) {
				return createIBookingsAdapter();
			}
			@Override
			public Adapter caseIUserAccount(IUserAccount object) {
				return createIUserAccountAdapter();
			}
			@Override
			public Adapter caseICheckIn(ICheckIn object) {
				return createICheckInAdapter();
			}
			@Override
			public Adapter caseIStaffAuthentication(IStaffAuthentication object) {
				return createIStaffAuthenticationAdapter();
			}
			@Override
			public Adapter caseIReceptionOperations_rename_required(IReceptionOperations_rename_required object) {
				return createIReceptionOperations_rename_requiredAdapter();
			}
			@Override
			public Adapter caseIStaffAdmin(IStaffAdmin object) {
				return createIStaffAdminAdapter();
			}
			@Override
			public Adapter caseIManagement(IManagement object) {
				return createIManagementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link CodePack.Backend.CustomerHandler <em>Customer Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CodePack.Backend.CustomerHandler
	 * @generated
	 */
	public Adapter createCustomerHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CodePack.Backend.ReceptionHandler <em>Reception Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CodePack.Backend.ReceptionHandler
	 * @generated
	 */
	public Adapter createReceptionHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CodePack.Backend.CheckInHandler <em>Check In Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CodePack.Backend.CheckInHandler
	 * @generated
	 */
	public Adapter createCheckInHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CodePack.Backend.ManagementHandler <em>Management Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CodePack.Backend.ManagementHandler
	 * @generated
	 */
	public Adapter createManagementHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CodePack.IBookings <em>IBookings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CodePack.IBookings
	 * @generated
	 */
	public Adapter createIBookingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CodePack.IUserAccount <em>IUser Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CodePack.IUserAccount
	 * @generated
	 */
	public Adapter createIUserAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CodePack.ICheckIn <em>ICheck In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CodePack.ICheckIn
	 * @generated
	 */
	public Adapter createICheckInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CodePack.IStaffAuthentication <em>IStaff Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CodePack.IStaffAuthentication
	 * @generated
	 */
	public Adapter createIStaffAuthenticationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CodePack.IReceptionOperations_rename_required <em>IReception Operations rename required</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CodePack.IReceptionOperations_rename_required
	 * @generated
	 */
	public Adapter createIReceptionOperations_rename_requiredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CodePack.IStaffAdmin <em>IStaff Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CodePack.IStaffAdmin
	 * @generated
	 */
	public Adapter createIStaffAdminAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CodePack.IManagement <em>IManagement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CodePack.IManagement
	 * @generated
	 */
	public Adapter createIManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BackendAdapterFactory
