/**
 */
package CodePack.impl;

import CodePack.Backend.ManagementHandler;
import CodePack.Backend.ReceptionHandler;

import CodePack.CodePackPackage;
import CodePack.StaffGUI;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staff GUI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CodePack.impl.StaffGUIImpl#getManagementHandler <em>Management Handler</em>}</li>
 *   <li>{@link CodePack.impl.StaffGUIImpl#getReceptionHandler <em>Reception Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StaffGUIImpl extends MinimalEObjectImpl.Container implements StaffGUI {
	/**
	 * The cached value of the '{@link #getManagementHandler() <em>Management Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagementHandler()
	 * @generated
	 * @ordered
	 */
	protected ManagementHandler managementHandler;

	/**
	 * The cached value of the '{@link #getReceptionHandler() <em>Reception Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceptionHandler()
	 * @generated
	 * @ordered
	 */
	protected ReceptionHandler receptionHandler;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffGUIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodePackPackage.Literals.STAFF_GUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementHandler getManagementHandler() {
		if (managementHandler != null && managementHandler.eIsProxy()) {
			InternalEObject oldManagementHandler = (InternalEObject)managementHandler;
			managementHandler = (ManagementHandler)eResolveProxy(oldManagementHandler);
			if (managementHandler != oldManagementHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackPackage.STAFF_GUI__MANAGEMENT_HANDLER, oldManagementHandler, managementHandler));
			}
		}
		return managementHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementHandler basicGetManagementHandler() {
		return managementHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagementHandler(ManagementHandler newManagementHandler) {
		ManagementHandler oldManagementHandler = managementHandler;
		managementHandler = newManagementHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackPackage.STAFF_GUI__MANAGEMENT_HANDLER, oldManagementHandler, managementHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceptionHandler getReceptionHandler() {
		if (receptionHandler != null && receptionHandler.eIsProxy()) {
			InternalEObject oldReceptionHandler = (InternalEObject)receptionHandler;
			receptionHandler = (ReceptionHandler)eResolveProxy(oldReceptionHandler);
			if (receptionHandler != oldReceptionHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackPackage.STAFF_GUI__RECEPTION_HANDLER, oldReceptionHandler, receptionHandler));
			}
		}
		return receptionHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceptionHandler basicGetReceptionHandler() {
		return receptionHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceptionHandler(ReceptionHandler newReceptionHandler) {
		ReceptionHandler oldReceptionHandler = receptionHandler;
		receptionHandler = newReceptionHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackPackage.STAFF_GUI__RECEPTION_HANDLER, oldReceptionHandler, receptionHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackPackage.STAFF_GUI__MANAGEMENT_HANDLER:
				if (resolve) return getManagementHandler();
				return basicGetManagementHandler();
			case CodePackPackage.STAFF_GUI__RECEPTION_HANDLER:
				if (resolve) return getReceptionHandler();
				return basicGetReceptionHandler();
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
			case CodePackPackage.STAFF_GUI__MANAGEMENT_HANDLER:
				setManagementHandler((ManagementHandler)newValue);
				return;
			case CodePackPackage.STAFF_GUI__RECEPTION_HANDLER:
				setReceptionHandler((ReceptionHandler)newValue);
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
			case CodePackPackage.STAFF_GUI__MANAGEMENT_HANDLER:
				setManagementHandler((ManagementHandler)null);
				return;
			case CodePackPackage.STAFF_GUI__RECEPTION_HANDLER:
				setReceptionHandler((ReceptionHandler)null);
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
			case CodePackPackage.STAFF_GUI__MANAGEMENT_HANDLER:
				return managementHandler != null;
			case CodePackPackage.STAFF_GUI__RECEPTION_HANDLER:
				return receptionHandler != null;
		}
		return super.eIsSet(featureID);
	}

} //StaffGUIImpl
