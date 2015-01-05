/**
 */
package CodePack.DataModels.impl;

import CodePack.DataModels.DataModelsPackage;
import CodePack.DataModels.StaffRole;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staff Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CodePack.DataModels.impl.StaffRoleImpl#getName <em>Name</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.StaffRoleImpl#isCanManageBookings <em>Can Manage Bookings</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.StaffRoleImpl#isCanManageRooms <em>Can Manage Rooms</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.StaffRoleImpl#isCanManageServices <em>Can Manage Services</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.StaffRoleImpl#isCanManageAccounts <em>Can Manage Accounts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StaffRoleImpl extends MinimalEObjectImpl.Container implements StaffRole {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #isCanManageBookings() <em>Can Manage Bookings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanManageBookings()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_MANAGE_BOOKINGS_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isCanManageBookings() <em>Can Manage Bookings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanManageBookings()
	 * @generated
	 * @ordered
	 */
	protected boolean canManageBookings = CAN_MANAGE_BOOKINGS_EDEFAULT;
	/**
	 * The default value of the '{@link #isCanManageRooms() <em>Can Manage Rooms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanManageRooms()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_MANAGE_ROOMS_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isCanManageRooms() <em>Can Manage Rooms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanManageRooms()
	 * @generated
	 * @ordered
	 */
	protected boolean canManageRooms = CAN_MANAGE_ROOMS_EDEFAULT;
	/**
	 * The default value of the '{@link #isCanManageServices() <em>Can Manage Services</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanManageServices()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_MANAGE_SERVICES_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isCanManageServices() <em>Can Manage Services</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanManageServices()
	 * @generated
	 * @ordered
	 */
	protected boolean canManageServices = CAN_MANAGE_SERVICES_EDEFAULT;
	/**
	 * The default value of the '{@link #isCanManageAccounts() <em>Can Manage Accounts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanManageAccounts()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_MANAGE_ACCOUNTS_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isCanManageAccounts() <em>Can Manage Accounts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanManageAccounts()
	 * @generated
	 * @ordered
	 */
	protected boolean canManageAccounts = CAN_MANAGE_ACCOUNTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataModelsPackage.Literals.STAFF_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.STAFF_ROLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanManageBookings() {
		return canManageBookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanManageBookings(boolean newCanManageBookings) {
		boolean oldCanManageBookings = canManageBookings;
		canManageBookings = newCanManageBookings;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.STAFF_ROLE__CAN_MANAGE_BOOKINGS, oldCanManageBookings, canManageBookings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanManageRooms() {
		return canManageRooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanManageRooms(boolean newCanManageRooms) {
		boolean oldCanManageRooms = canManageRooms;
		canManageRooms = newCanManageRooms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.STAFF_ROLE__CAN_MANAGE_ROOMS, oldCanManageRooms, canManageRooms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanManageServices() {
		return canManageServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanManageServices(boolean newCanManageServices) {
		boolean oldCanManageServices = canManageServices;
		canManageServices = newCanManageServices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.STAFF_ROLE__CAN_MANAGE_SERVICES, oldCanManageServices, canManageServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanManageAccounts() {
		return canManageAccounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanManageAccounts(boolean newCanManageAccounts) {
		boolean oldCanManageAccounts = canManageAccounts;
		canManageAccounts = newCanManageAccounts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.STAFF_ROLE__CAN_MANAGE_ACCOUNTS, oldCanManageAccounts, canManageAccounts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataModelsPackage.STAFF_ROLE__NAME:
				return getName();
			case DataModelsPackage.STAFF_ROLE__CAN_MANAGE_BOOKINGS:
				return isCanManageBookings();
			case DataModelsPackage.STAFF_ROLE__CAN_MANAGE_ROOMS:
				return isCanManageRooms();
			case DataModelsPackage.STAFF_ROLE__CAN_MANAGE_SERVICES:
				return isCanManageServices();
			case DataModelsPackage.STAFF_ROLE__CAN_MANAGE_ACCOUNTS:
				return isCanManageAccounts();
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
			case DataModelsPackage.STAFF_ROLE__NAME:
				setName((String)newValue);
				return;
			case DataModelsPackage.STAFF_ROLE__CAN_MANAGE_BOOKINGS:
				setCanManageBookings((Boolean)newValue);
				return;
			case DataModelsPackage.STAFF_ROLE__CAN_MANAGE_ROOMS:
				setCanManageRooms((Boolean)newValue);
				return;
			case DataModelsPackage.STAFF_ROLE__CAN_MANAGE_SERVICES:
				setCanManageServices((Boolean)newValue);
				return;
			case DataModelsPackage.STAFF_ROLE__CAN_MANAGE_ACCOUNTS:
				setCanManageAccounts((Boolean)newValue);
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
			case DataModelsPackage.STAFF_ROLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DataModelsPackage.STAFF_ROLE__CAN_MANAGE_BOOKINGS:
				setCanManageBookings(CAN_MANAGE_BOOKINGS_EDEFAULT);
				return;
			case DataModelsPackage.STAFF_ROLE__CAN_MANAGE_ROOMS:
				setCanManageRooms(CAN_MANAGE_ROOMS_EDEFAULT);
				return;
			case DataModelsPackage.STAFF_ROLE__CAN_MANAGE_SERVICES:
				setCanManageServices(CAN_MANAGE_SERVICES_EDEFAULT);
				return;
			case DataModelsPackage.STAFF_ROLE__CAN_MANAGE_ACCOUNTS:
				setCanManageAccounts(CAN_MANAGE_ACCOUNTS_EDEFAULT);
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
			case DataModelsPackage.STAFF_ROLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DataModelsPackage.STAFF_ROLE__CAN_MANAGE_BOOKINGS:
				return canManageBookings != CAN_MANAGE_BOOKINGS_EDEFAULT;
			case DataModelsPackage.STAFF_ROLE__CAN_MANAGE_ROOMS:
				return canManageRooms != CAN_MANAGE_ROOMS_EDEFAULT;
			case DataModelsPackage.STAFF_ROLE__CAN_MANAGE_SERVICES:
				return canManageServices != CAN_MANAGE_SERVICES_EDEFAULT;
			case DataModelsPackage.STAFF_ROLE__CAN_MANAGE_ACCOUNTS:
				return canManageAccounts != CAN_MANAGE_ACCOUNTS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", canManageBookings: ");
		result.append(canManageBookings);
		result.append(", canManageRooms: ");
		result.append(canManageRooms);
		result.append(", canManageServices: ");
		result.append(canManageServices);
		result.append(", canManageAccounts: ");
		result.append(canManageAccounts);
		result.append(')');
		return result.toString();
	}

} //StaffRoleImpl
