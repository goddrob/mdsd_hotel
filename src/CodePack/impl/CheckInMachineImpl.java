/**
 */
package CodePack.impl;

import CodePack.Backend.CheckInHandler;

import CodePack.CheckInMachine;
import CodePack.CodePackPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check In Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CodePack.impl.CheckInMachineImpl#getCheckInHandler <em>Check In Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CheckInMachineImpl extends MinimalEObjectImpl.Container implements CheckInMachine {
	/**
	 * The cached value of the '{@link #getCheckInHandler() <em>Check In Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckInHandler()
	 * @generated
	 * @ordered
	 */
	protected CheckInHandler checkInHandler;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckInMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodePackPackage.Literals.CHECK_IN_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckInHandler getCheckInHandler() {
		if (checkInHandler != null && checkInHandler.eIsProxy()) {
			InternalEObject oldCheckInHandler = (InternalEObject)checkInHandler;
			checkInHandler = (CheckInHandler)eResolveProxy(oldCheckInHandler);
			if (checkInHandler != oldCheckInHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackPackage.CHECK_IN_MACHINE__CHECK_IN_HANDLER, oldCheckInHandler, checkInHandler));
			}
		}
		return checkInHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckInHandler basicGetCheckInHandler() {
		return checkInHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckInHandler(CheckInHandler newCheckInHandler) {
		CheckInHandler oldCheckInHandler = checkInHandler;
		checkInHandler = newCheckInHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackPackage.CHECK_IN_MACHINE__CHECK_IN_HANDLER, oldCheckInHandler, checkInHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackPackage.CHECK_IN_MACHINE__CHECK_IN_HANDLER:
				if (resolve) return getCheckInHandler();
				return basicGetCheckInHandler();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CodePackPackage.CHECK_IN_MACHINE__CHECK_IN_HANDLER:
				setCheckInHandler((CheckInHandler)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CodePackPackage.CHECK_IN_MACHINE__CHECK_IN_HANDLER:
				setCheckInHandler((CheckInHandler)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CodePackPackage.CHECK_IN_MACHINE__CHECK_IN_HANDLER:
				return checkInHandler != null;
		}
		return super.eIsSet(featureID);
	}

} //CheckInMachineImpl
