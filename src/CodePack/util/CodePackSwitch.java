/**
 */
package CodePack.util;

import CodePack.*;
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
 * @see CodePack.CodePackPackage
 * @generated
 */
public class CodePackSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CodePackPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodePackSwitch() {
		if (modelPackage == null) {
			modelPackage = CodePackPackage.eINSTANCE;
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
			case CodePackPackage.IUSER_ACCOUNT: {
				IUserAccount iUserAccount = (IUserAccount)theEObject;
				T result = caseIUserAccount(iUserAccount);
				if (result == null) result = caseIBookings(iUserAccount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackPackage.IBOOKINGS: {
				IBookings iBookings = (IBookings)theEObject;
				T result = caseIBookings(iBookings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackPackage.ISTAFF_ADMIN: {
				IStaffAdmin iStaffAdmin = (IStaffAdmin)theEObject;
				T result = caseIStaffAdmin(iStaffAdmin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackPackage.ISTAFF_AUTHENTICATION: {
				IStaffAuthentication iStaffAuthentication = (IStaffAuthentication)theEObject;
				T result = caseIStaffAuthentication(iStaffAuthentication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackPackage.IMANAGEMENT: {
				IManagement iManagement = (IManagement)theEObject;
				T result = caseIManagement(iManagement);
				if (result == null) result = caseIStaffAdmin(iManagement);
				if (result == null) result = caseIStaffAuthentication(iManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackPackage.ICHECK_IN: {
				ICheckIn iCheckIn = (ICheckIn)theEObject;
				T result = caseICheckIn(iCheckIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackPackage.IRECEPTION_OPERATIONS_RENAME_REQUIRED: {
				IReceptionOperations_rename_required iReceptionOperations_rename_required = (IReceptionOperations_rename_required)theEObject;
				T result = caseIReceptionOperations_rename_required(iReceptionOperations_rename_required);
				if (result == null) result = caseIBookings(iReceptionOperations_rename_required);
				if (result == null) result = caseICheckIn(iReceptionOperations_rename_required);
				if (result == null) result = caseIStaffAuthentication(iReceptionOperations_rename_required);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackPackage.STAFF_GUI: {
				StaffGUI staffGUI = (StaffGUI)theEObject;
				T result = caseStaffGUI(staffGUI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackPackage.USER_GUI: {
				UserGUI userGUI = (UserGUI)theEObject;
				T result = caseUserGUI(userGUI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackPackage.CHECK_IN_MACHINE: {
				CheckInMachine checkInMachine = (CheckInMachine)theEObject;
				T result = caseCheckInMachine(checkInMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackPackage.DATA_BANK: {
				DataBank dataBank = (DataBank)theEObject;
				T result = caseDataBank(dataBank);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Staff GUI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staff GUI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaffGUI(StaffGUI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User GUI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User GUI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserGUI(UserGUI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check In Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check In Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckInMachine(CheckInMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Bank</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Bank</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataBank(DataBank object) {
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

} //CodePackSwitch
