/**
 */
package CodePack.DataModels.impl;

import CodePack.DataModels.DataModelsPackage;
import CodePack.DataModels.StaffMember;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staff Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CodePack.DataModels.impl.StaffMemberImpl#getFull_name <em>Full name</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.StaffMemberImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.StaffMemberImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.StaffMemberImpl#getPers_no <em>Pers no</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.StaffMemberImpl#getPhone_no <em>Phone no</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.StaffMemberImpl#getRole_name <em>Role name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StaffMemberImpl extends MinimalEObjectImpl.Container implements StaffMember {
	/**
	 * The default value of the '{@link #getFull_name() <em>Full name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFull_name()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFull_name() <em>Full name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFull_name()
	 * @generated
	 * @ordered
	 */
	protected String full_name = FULL_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;
	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;
	/**
	 * The default value of the '{@link #getPers_no() <em>Pers no</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPers_no()
	 * @generated
	 * @ordered
	 */
	protected static final String PERS_NO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPers_no() <em>Pers no</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPers_no()
	 * @generated
	 * @ordered
	 */
	protected String pers_no = PERS_NO_EDEFAULT;
	/**
	 * The default value of the '{@link #getPhone_no() <em>Phone no</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone_no()
	 * @generated
	 * @ordered
	 */
	protected static final int PHONE_NO_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getPhone_no() <em>Phone no</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone_no()
	 * @generated
	 * @ordered
	 */
	protected int phone_no = PHONE_NO_EDEFAULT;
	/**
	 * The default value of the '{@link #getRole_name() <em>Role name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_name()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRole_name() <em>Role name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_name()
	 * @generated
	 * @ordered
	 */
	protected String role_name = ROLE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataModelsPackage.Literals.STAFF_MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFull_name() {
		return full_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFull_name(String newFull_name) {
		String oldFull_name = full_name;
		full_name = newFull_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.STAFF_MEMBER__FULL_NAME, oldFull_name, full_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.STAFF_MEMBER__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.STAFF_MEMBER__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPers_no() {
		return pers_no;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPers_no(String newPers_no) {
		String oldPers_no = pers_no;
		pers_no = newPers_no;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.STAFF_MEMBER__PERS_NO, oldPers_no, pers_no));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPhone_no() {
		return phone_no;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone_no(int newPhone_no) {
		int oldPhone_no = phone_no;
		phone_no = newPhone_no;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.STAFF_MEMBER__PHONE_NO, oldPhone_no, phone_no));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole_name() {
		return role_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole_name(String newRole_name) {
		String oldRole_name = role_name;
		role_name = newRole_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.STAFF_MEMBER__ROLE_NAME, oldRole_name, role_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataModelsPackage.STAFF_MEMBER__FULL_NAME:
				return getFull_name();
			case DataModelsPackage.STAFF_MEMBER__EMAIL:
				return getEmail();
			case DataModelsPackage.STAFF_MEMBER__PASSWORD:
				return getPassword();
			case DataModelsPackage.STAFF_MEMBER__PERS_NO:
				return getPers_no();
			case DataModelsPackage.STAFF_MEMBER__PHONE_NO:
				return getPhone_no();
			case DataModelsPackage.STAFF_MEMBER__ROLE_NAME:
				return getRole_name();
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
			case DataModelsPackage.STAFF_MEMBER__FULL_NAME:
				setFull_name((String)newValue);
				return;
			case DataModelsPackage.STAFF_MEMBER__EMAIL:
				setEmail((String)newValue);
				return;
			case DataModelsPackage.STAFF_MEMBER__PASSWORD:
				setPassword((String)newValue);
				return;
			case DataModelsPackage.STAFF_MEMBER__PERS_NO:
				setPers_no((String)newValue);
				return;
			case DataModelsPackage.STAFF_MEMBER__PHONE_NO:
				setPhone_no((Integer)newValue);
				return;
			case DataModelsPackage.STAFF_MEMBER__ROLE_NAME:
				setRole_name((String)newValue);
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
			case DataModelsPackage.STAFF_MEMBER__FULL_NAME:
				setFull_name(FULL_NAME_EDEFAULT);
				return;
			case DataModelsPackage.STAFF_MEMBER__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case DataModelsPackage.STAFF_MEMBER__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case DataModelsPackage.STAFF_MEMBER__PERS_NO:
				setPers_no(PERS_NO_EDEFAULT);
				return;
			case DataModelsPackage.STAFF_MEMBER__PHONE_NO:
				setPhone_no(PHONE_NO_EDEFAULT);
				return;
			case DataModelsPackage.STAFF_MEMBER__ROLE_NAME:
				setRole_name(ROLE_NAME_EDEFAULT);
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
			case DataModelsPackage.STAFF_MEMBER__FULL_NAME:
				return FULL_NAME_EDEFAULT == null ? full_name != null : !FULL_NAME_EDEFAULT.equals(full_name);
			case DataModelsPackage.STAFF_MEMBER__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case DataModelsPackage.STAFF_MEMBER__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case DataModelsPackage.STAFF_MEMBER__PERS_NO:
				return PERS_NO_EDEFAULT == null ? pers_no != null : !PERS_NO_EDEFAULT.equals(pers_no);
			case DataModelsPackage.STAFF_MEMBER__PHONE_NO:
				return phone_no != PHONE_NO_EDEFAULT;
			case DataModelsPackage.STAFF_MEMBER__ROLE_NAME:
				return ROLE_NAME_EDEFAULT == null ? role_name != null : !ROLE_NAME_EDEFAULT.equals(role_name);
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
		result.append(" (full_name: ");
		result.append(full_name);
		result.append(", email: ");
		result.append(email);
		result.append(", password: ");
		result.append(password);
		result.append(", pers_no: ");
		result.append(pers_no);
		result.append(", phone_no: ");
		result.append(phone_no);
		result.append(", role_name: ");
		result.append(role_name);
		result.append(')');
		return result.toString();
	}

} //StaffMemberImpl
