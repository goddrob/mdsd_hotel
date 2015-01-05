/**
 */
package CodePack.DataModels.impl;

import CodePack.DataModels.DataModelsPackage;
import CodePack.DataModels.PaymentData;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CodePack.DataModels.impl.PaymentDataImpl#getCc_number <em>Cc number</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.PaymentDataImpl#getCc_ccv <em>Cc ccv</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.PaymentDataImpl#getCc_month <em>Cc month</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.PaymentDataImpl#getCc_year <em>Cc year</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.PaymentDataImpl#getCc_first_name <em>Cc first name</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.PaymentDataImpl#getCc_last_name <em>Cc last name</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.PaymentDataImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PaymentDataImpl extends MinimalEObjectImpl.Container implements PaymentData {
	/**
	 * The default value of the '{@link #getCc_number() <em>Cc number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCc_number()
	 * @generated
	 * @ordered
	 */
	protected static final String CC_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCc_number() <em>Cc number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCc_number()
	 * @generated
	 * @ordered
	 */
	protected String cc_number = CC_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCc_ccv() <em>Cc ccv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCc_ccv()
	 * @generated
	 * @ordered
	 */
	protected static final String CC_CCV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCc_ccv() <em>Cc ccv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCc_ccv()
	 * @generated
	 * @ordered
	 */
	protected String cc_ccv = CC_CCV_EDEFAULT;

	/**
	 * The default value of the '{@link #getCc_month() <em>Cc month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCc_month()
	 * @generated
	 * @ordered
	 */
	protected static final int CC_MONTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCc_month() <em>Cc month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCc_month()
	 * @generated
	 * @ordered
	 */
	protected int cc_month = CC_MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getCc_year() <em>Cc year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCc_year()
	 * @generated
	 * @ordered
	 */
	protected static final int CC_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCc_year() <em>Cc year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCc_year()
	 * @generated
	 * @ordered
	 */
	protected int cc_year = CC_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCc_first_name() <em>Cc first name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCc_first_name()
	 * @generated
	 * @ordered
	 */
	protected static final String CC_FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCc_first_name() <em>Cc first name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCc_first_name()
	 * @generated
	 * @ordered
	 */
	protected String cc_first_name = CC_FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCc_last_name() <em>Cc last name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCc_last_name()
	 * @generated
	 * @ordered
	 */
	protected static final String CC_LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCc_last_name() <em>Cc last name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCc_last_name()
	 * @generated
	 * @ordered
	 */
	protected String cc_last_name = CC_LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataModelsPackage.Literals.PAYMENT_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCc_number() {
		return cc_number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCc_number(String newCc_number) {
		String oldCc_number = cc_number;
		cc_number = newCc_number;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.PAYMENT_DATA__CC_NUMBER, oldCc_number, cc_number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCc_ccv() {
		return cc_ccv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCc_ccv(String newCc_ccv) {
		String oldCc_ccv = cc_ccv;
		cc_ccv = newCc_ccv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.PAYMENT_DATA__CC_CCV, oldCc_ccv, cc_ccv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCc_month() {
		return cc_month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCc_month(int newCc_month) {
		int oldCc_month = cc_month;
		cc_month = newCc_month;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.PAYMENT_DATA__CC_MONTH, oldCc_month, cc_month));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCc_year() {
		return cc_year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCc_year(int newCc_year) {
		int oldCc_year = cc_year;
		cc_year = newCc_year;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.PAYMENT_DATA__CC_YEAR, oldCc_year, cc_year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCc_first_name() {
		return cc_first_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCc_first_name(String newCc_first_name) {
		String oldCc_first_name = cc_first_name;
		cc_first_name = newCc_first_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.PAYMENT_DATA__CC_FIRST_NAME, oldCc_first_name, cc_first_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCc_last_name() {
		return cc_last_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCc_last_name(String newCc_last_name) {
		String oldCc_last_name = cc_last_name;
		cc_last_name = newCc_last_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.PAYMENT_DATA__CC_LAST_NAME, oldCc_last_name, cc_last_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.PAYMENT_DATA__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataModelsPackage.PAYMENT_DATA__CC_NUMBER:
				return getCc_number();
			case DataModelsPackage.PAYMENT_DATA__CC_CCV:
				return getCc_ccv();
			case DataModelsPackage.PAYMENT_DATA__CC_MONTH:
				return getCc_month();
			case DataModelsPackage.PAYMENT_DATA__CC_YEAR:
				return getCc_year();
			case DataModelsPackage.PAYMENT_DATA__CC_FIRST_NAME:
				return getCc_first_name();
			case DataModelsPackage.PAYMENT_DATA__CC_LAST_NAME:
				return getCc_last_name();
			case DataModelsPackage.PAYMENT_DATA__ID:
				return getId();
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
			case DataModelsPackage.PAYMENT_DATA__CC_NUMBER:
				setCc_number((String)newValue);
				return;
			case DataModelsPackage.PAYMENT_DATA__CC_CCV:
				setCc_ccv((String)newValue);
				return;
			case DataModelsPackage.PAYMENT_DATA__CC_MONTH:
				setCc_month((Integer)newValue);
				return;
			case DataModelsPackage.PAYMENT_DATA__CC_YEAR:
				setCc_year((Integer)newValue);
				return;
			case DataModelsPackage.PAYMENT_DATA__CC_FIRST_NAME:
				setCc_first_name((String)newValue);
				return;
			case DataModelsPackage.PAYMENT_DATA__CC_LAST_NAME:
				setCc_last_name((String)newValue);
				return;
			case DataModelsPackage.PAYMENT_DATA__ID:
				setId((Integer)newValue);
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
			case DataModelsPackage.PAYMENT_DATA__CC_NUMBER:
				setCc_number(CC_NUMBER_EDEFAULT);
				return;
			case DataModelsPackage.PAYMENT_DATA__CC_CCV:
				setCc_ccv(CC_CCV_EDEFAULT);
				return;
			case DataModelsPackage.PAYMENT_DATA__CC_MONTH:
				setCc_month(CC_MONTH_EDEFAULT);
				return;
			case DataModelsPackage.PAYMENT_DATA__CC_YEAR:
				setCc_year(CC_YEAR_EDEFAULT);
				return;
			case DataModelsPackage.PAYMENT_DATA__CC_FIRST_NAME:
				setCc_first_name(CC_FIRST_NAME_EDEFAULT);
				return;
			case DataModelsPackage.PAYMENT_DATA__CC_LAST_NAME:
				setCc_last_name(CC_LAST_NAME_EDEFAULT);
				return;
			case DataModelsPackage.PAYMENT_DATA__ID:
				setId(ID_EDEFAULT);
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
			case DataModelsPackage.PAYMENT_DATA__CC_NUMBER:
				return CC_NUMBER_EDEFAULT == null ? cc_number != null : !CC_NUMBER_EDEFAULT.equals(cc_number);
			case DataModelsPackage.PAYMENT_DATA__CC_CCV:
				return CC_CCV_EDEFAULT == null ? cc_ccv != null : !CC_CCV_EDEFAULT.equals(cc_ccv);
			case DataModelsPackage.PAYMENT_DATA__CC_MONTH:
				return cc_month != CC_MONTH_EDEFAULT;
			case DataModelsPackage.PAYMENT_DATA__CC_YEAR:
				return cc_year != CC_YEAR_EDEFAULT;
			case DataModelsPackage.PAYMENT_DATA__CC_FIRST_NAME:
				return CC_FIRST_NAME_EDEFAULT == null ? cc_first_name != null : !CC_FIRST_NAME_EDEFAULT.equals(cc_first_name);
			case DataModelsPackage.PAYMENT_DATA__CC_LAST_NAME:
				return CC_LAST_NAME_EDEFAULT == null ? cc_last_name != null : !CC_LAST_NAME_EDEFAULT.equals(cc_last_name);
			case DataModelsPackage.PAYMENT_DATA__ID:
				return id != ID_EDEFAULT;
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
		result.append(" (cc_number: ");
		result.append(cc_number);
		result.append(", cc_ccv: ");
		result.append(cc_ccv);
		result.append(", cc_month: ");
		result.append(cc_month);
		result.append(", cc_year: ");
		result.append(cc_year);
		result.append(", cc_first_name: ");
		result.append(cc_first_name);
		result.append(", cc_last_name: ");
		result.append(cc_last_name);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //PaymentDataImpl
