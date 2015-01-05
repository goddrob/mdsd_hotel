/**
 */
package CodePack.DataModels.impl;

import CodePack.DataModels.Customer;
import CodePack.DataModels.DataModelsPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CodePack.DataModels.impl.CustomerImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.CustomerImpl#getDate_of_birth <em>Date of birth</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.CustomerImpl#getBonus_points <em>Bonus points</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.CustomerImpl#getE_mail <em>Email</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.CustomerImpl#getFirst_name <em>First name</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.CustomerImpl#getPhone_no <em>Phone no</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.CustomerImpl#getCustomer_id <em>Customer id</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.CustomerImpl#getPayment_id <em>Payment id</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.CustomerImpl#getLast_name <em>Last name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomerImpl extends MinimalEObjectImpl.Container implements Customer {
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
	 * The default value of the '{@link #getDate_of_birth() <em>Date of birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_of_birth()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_OF_BIRTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate_of_birth() <em>Date of birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_of_birth()
	 * @generated
	 * @ordered
	 */
	protected Date date_of_birth = DATE_OF_BIRTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getBonus_points() <em>Bonus points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBonus_points()
	 * @generated
	 * @ordered
	 */
	protected static final int BONUS_POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBonus_points() <em>Bonus points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBonus_points()
	 * @generated
	 * @ordered
	 */
	protected int bonus_points = BONUS_POINTS_EDEFAULT;

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
	 * The default value of the '{@link #getFirst_name() <em>First name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst_name()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirst_name() <em>First name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst_name()
	 * @generated
	 * @ordered
	 */
	protected String first_name = FIRST_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getCustomer_id() <em>Customer id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer_id()
	 * @generated
	 * @ordered
	 */
	protected static final int CUSTOMER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCustomer_id() <em>Customer id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer_id()
	 * @generated
	 * @ordered
	 */
	protected int customer_id = CUSTOMER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPayment_id() <em>Payment id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment_id()
	 * @generated
	 * @ordered
	 */
	protected static final int PAYMENT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPayment_id() <em>Payment id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment_id()
	 * @generated
	 * @ordered
	 */
	protected int payment_id = PAYMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLast_name() <em>Last name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLast_name()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLast_name() <em>Last name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLast_name()
	 * @generated
	 * @ordered
	 */
	protected String last_name = LAST_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataModelsPackage.Literals.CUSTOMER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.CUSTOMER__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate_of_birth() {
		return date_of_birth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate_of_birth(Date newDate_of_birth) {
		Date oldDate_of_birth = date_of_birth;
		date_of_birth = newDate_of_birth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.CUSTOMER__DATE_OF_BIRTH, oldDate_of_birth, date_of_birth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBonus_points() {
		return bonus_points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBonus_points(int newBonus_points) {
		int oldBonus_points = bonus_points;
		bonus_points = newBonus_points;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.CUSTOMER__BONUS_POINTS, oldBonus_points, bonus_points));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.CUSTOMER__EMAIL, oldE_mail, e_mail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirst_name() {
		return first_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirst_name(String newFirst_name) {
		String oldFirst_name = first_name;
		first_name = newFirst_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.CUSTOMER__FIRST_NAME, oldFirst_name, first_name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.CUSTOMER__PHONE_NO, oldPhone_no, phone_no));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCustomer_id() {
		return customer_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer_id(int newCustomer_id) {
		int oldCustomer_id = customer_id;
		customer_id = newCustomer_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.CUSTOMER__CUSTOMER_ID, oldCustomer_id, customer_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPayment_id() {
		return payment_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayment_id(int newPayment_id) {
		int oldPayment_id = payment_id;
		payment_id = newPayment_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.CUSTOMER__PAYMENT_ID, oldPayment_id, payment_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLast_name() {
		return last_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLast_name(String newLast_name) {
		String oldLast_name = last_name;
		last_name = newLast_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.CUSTOMER__LAST_NAME, oldLast_name, last_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataModelsPackage.CUSTOMER__PASSWORD:
				return getPassword();
			case DataModelsPackage.CUSTOMER__DATE_OF_BIRTH:
				return getDate_of_birth();
			case DataModelsPackage.CUSTOMER__BONUS_POINTS:
				return getBonus_points();
			case DataModelsPackage.CUSTOMER__EMAIL:
				return getE_mail();
			case DataModelsPackage.CUSTOMER__FIRST_NAME:
				return getFirst_name();
			case DataModelsPackage.CUSTOMER__PHONE_NO:
				return getPhone_no();
			case DataModelsPackage.CUSTOMER__CUSTOMER_ID:
				return getCustomer_id();
			case DataModelsPackage.CUSTOMER__PAYMENT_ID:
				return getPayment_id();
			case DataModelsPackage.CUSTOMER__LAST_NAME:
				return getLast_name();
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
			case DataModelsPackage.CUSTOMER__PASSWORD:
				setPassword((String)newValue);
				return;
			case DataModelsPackage.CUSTOMER__DATE_OF_BIRTH:
				setDate_of_birth((Date)newValue);
				return;
			case DataModelsPackage.CUSTOMER__BONUS_POINTS:
				setBonus_points((Integer)newValue);
				return;
			case DataModelsPackage.CUSTOMER__EMAIL:
				setE_mail((String)newValue);
				return;
			case DataModelsPackage.CUSTOMER__FIRST_NAME:
				setFirst_name((String)newValue);
				return;
			case DataModelsPackage.CUSTOMER__PHONE_NO:
				setPhone_no((Integer)newValue);
				return;
			case DataModelsPackage.CUSTOMER__CUSTOMER_ID:
				setCustomer_id((Integer)newValue);
				return;
			case DataModelsPackage.CUSTOMER__PAYMENT_ID:
				setPayment_id((Integer)newValue);
				return;
			case DataModelsPackage.CUSTOMER__LAST_NAME:
				setLast_name((String)newValue);
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
			case DataModelsPackage.CUSTOMER__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case DataModelsPackage.CUSTOMER__DATE_OF_BIRTH:
				setDate_of_birth(DATE_OF_BIRTH_EDEFAULT);
				return;
			case DataModelsPackage.CUSTOMER__BONUS_POINTS:
				setBonus_points(BONUS_POINTS_EDEFAULT);
				return;
			case DataModelsPackage.CUSTOMER__EMAIL:
				setE_mail(EMAIL_EDEFAULT);
				return;
			case DataModelsPackage.CUSTOMER__FIRST_NAME:
				setFirst_name(FIRST_NAME_EDEFAULT);
				return;
			case DataModelsPackage.CUSTOMER__PHONE_NO:
				setPhone_no(PHONE_NO_EDEFAULT);
				return;
			case DataModelsPackage.CUSTOMER__CUSTOMER_ID:
				setCustomer_id(CUSTOMER_ID_EDEFAULT);
				return;
			case DataModelsPackage.CUSTOMER__PAYMENT_ID:
				setPayment_id(PAYMENT_ID_EDEFAULT);
				return;
			case DataModelsPackage.CUSTOMER__LAST_NAME:
				setLast_name(LAST_NAME_EDEFAULT);
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
			case DataModelsPackage.CUSTOMER__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case DataModelsPackage.CUSTOMER__DATE_OF_BIRTH:
				return DATE_OF_BIRTH_EDEFAULT == null ? date_of_birth != null : !DATE_OF_BIRTH_EDEFAULT.equals(date_of_birth);
			case DataModelsPackage.CUSTOMER__BONUS_POINTS:
				return bonus_points != BONUS_POINTS_EDEFAULT;
			case DataModelsPackage.CUSTOMER__EMAIL:
				return EMAIL_EDEFAULT == null ? e_mail != null : !EMAIL_EDEFAULT.equals(e_mail);
			case DataModelsPackage.CUSTOMER__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? first_name != null : !FIRST_NAME_EDEFAULT.equals(first_name);
			case DataModelsPackage.CUSTOMER__PHONE_NO:
				return phone_no != PHONE_NO_EDEFAULT;
			case DataModelsPackage.CUSTOMER__CUSTOMER_ID:
				return customer_id != CUSTOMER_ID_EDEFAULT;
			case DataModelsPackage.CUSTOMER__PAYMENT_ID:
				return payment_id != PAYMENT_ID_EDEFAULT;
			case DataModelsPackage.CUSTOMER__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? last_name != null : !LAST_NAME_EDEFAULT.equals(last_name);
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
		result.append(" (password: ");
		result.append(password);
		result.append(", date_of_birth: ");
		result.append(date_of_birth);
		result.append(", bonus_points: ");
		result.append(bonus_points);
		result.append(", e_mail: ");
		result.append(e_mail);
		result.append(", first_name: ");
		result.append(first_name);
		result.append(", phone_no: ");
		result.append(phone_no);
		result.append(", customer_id: ");
		result.append(customer_id);
		result.append(", payment_id: ");
		result.append(payment_id);
		result.append(", last_name: ");
		result.append(last_name);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
