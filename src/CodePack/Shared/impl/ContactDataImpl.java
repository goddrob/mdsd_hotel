/**
 */
package CodePack.Shared.impl;

import CodePack.Shared.ContactData;
import CodePack.Shared.SharedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CodePack.Shared.impl.ContactDataImpl#getFull_name <em>Full name</em>}</li>
 *   <li>{@link CodePack.Shared.impl.ContactDataImpl#getE_mail <em>Email</em>}</li>
 *   <li>{@link CodePack.Shared.impl.ContactDataImpl#getPhone_no <em>Phone no</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContactDataImpl extends MinimalEObjectImpl.Container implements ContactData {
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
	 * The default value of the '{@link #getE_mail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE_mail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getE_mail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE_mail()
	 * @generated
	 * @ordered
	 */
	protected String e_mail = EMAIL_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SharedPackage.Literals.CONTACT_DATA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SharedPackage.CONTACT_DATA__FULL_NAME, oldFull_name, full_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getE_mail() {
		return e_mail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setE_mail(String newE_mail) {
		String oldE_mail = e_mail;
		e_mail = newE_mail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SharedPackage.CONTACT_DATA__EMAIL, oldE_mail, e_mail));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SharedPackage.CONTACT_DATA__PHONE_NO, oldPhone_no, phone_no));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SharedPackage.CONTACT_DATA__FULL_NAME:
				return getFull_name();
			case SharedPackage.CONTACT_DATA__EMAIL:
				return getE_mail();
			case SharedPackage.CONTACT_DATA__PHONE_NO:
				return getPhone_no();
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
			case SharedPackage.CONTACT_DATA__FULL_NAME:
				setFull_name((String)newValue);
				return;
			case SharedPackage.CONTACT_DATA__EMAIL:
				setE_mail((String)newValue);
				return;
			case SharedPackage.CONTACT_DATA__PHONE_NO:
				setPhone_no((Integer)newValue);
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
			case SharedPackage.CONTACT_DATA__FULL_NAME:
				setFull_name(FULL_NAME_EDEFAULT);
				return;
			case SharedPackage.CONTACT_DATA__EMAIL:
				setE_mail(EMAIL_EDEFAULT);
				return;
			case SharedPackage.CONTACT_DATA__PHONE_NO:
				setPhone_no(PHONE_NO_EDEFAULT);
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
			case SharedPackage.CONTACT_DATA__FULL_NAME:
				return FULL_NAME_EDEFAULT == null ? full_name != null : !FULL_NAME_EDEFAULT.equals(full_name);
			case SharedPackage.CONTACT_DATA__EMAIL:
				return EMAIL_EDEFAULT == null ? e_mail != null : !EMAIL_EDEFAULT.equals(e_mail);
			case SharedPackage.CONTACT_DATA__PHONE_NO:
				return phone_no != PHONE_NO_EDEFAULT;
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
		result.append(", e_mail: ");
		result.append(e_mail);
		result.append(", phone_no: ");
		result.append(phone_no);
		result.append(')');
		return result.toString();
	}

} //ContactDataImpl
