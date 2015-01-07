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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see CodePack.Backend.BackendPackage
 * @generated
 */
public class BackendSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BackendPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackendSwitch() {
		if (modelPackage == null) {
			modelPackage = BackendPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BackendPackage.CUSTOMER_HANDLER: {
				CustomerHandler customerHandler = (CustomerHandler)theEObject;
				T result = caseCustomerHandler(customerHandler);
				if (result == null) result = caseIUserAccount(customerHandler);
				if (result == null) result = caseIBookings(customerHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BackendPackage.RECEPTION_HANDLER: {
				ReceptionHandler receptionHandler = (ReceptionHandler)theEObject;
				T result = caseReceptionHandler(receptionHandler);
				if (result == null) result = caseIReceptionOperations_rename_required(receptionHandler);
				if (result == null) result = caseIBookings(receptionHandler);
				if (result == null) result = caseICheckIn(receptionHandler);
				if (result == null) result = caseIStaffAuthentication(receptionHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BackendPackage.CHECK_IN_HANDLER: {
				CheckInHandler checkInHandler = (CheckInHandler)theEObject;
				T result = caseCheckInHandler(checkInHandler);
				if (result == null) result = caseICheckIn(checkInHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BackendPackage.MANAGEMENT_HANDLER: {
				ManagementHandler managementHandler = (ManagementHandler)theEObject;
				T result = caseManagementHandler(managementHandler);
				if (result == null) result = caseIManagement(managementHandler);
				if (result == null) result = caseIStaffAdmin(managementHandler);
				if (result == null) result = caseIStaffAuthentication(managementHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerHandler(CustomerHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reception Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reception Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceptionHandler(ReceptionHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check In Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check In Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckInHandler(CheckInHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Management Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Management Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManagementHandler(ManagementHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBookings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBookings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBookings(IBookings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IUser Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IUser Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIUserAccount(IUserAccount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ICheck In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ICheck In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseICheckIn(ICheckIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IStaff Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IStaff Authentication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIStaffAuthentication(IStaffAuthentication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IReception Operations rename required</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IReception Operations rename required</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIReceptionOperations_rename_required(IReceptionOperations_rename_required object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IStaff Admin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IStaff Admin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIStaffAdmin(IStaffAdmin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IManagement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IManagement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIManagement(IManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BackendSwitch
