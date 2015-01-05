/**
 */
package CodePack.DataModels.impl;

import CodePack.DataModels.DataModelsPackage;
import CodePack.DataModels.ExtraService;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extra Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CodePack.DataModels.impl.ExtraServiceImpl#getDate_start <em>Date start</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.ExtraServiceImpl#getDate_end <em>Date end</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.ExtraServiceImpl#getBooking_id <em>Booking id</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.ExtraServiceImpl#getTotal_price <em>Total price</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.ExtraServiceImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtraServiceImpl extends MinimalEObjectImpl.Container implements ExtraService {
	/**
	 * The default value of the '{@link #getDate_start() <em>Date start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_start()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate_start() <em>Date start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_start()
	 * @generated
	 * @ordered
	 */
	protected Date date_start = DATE_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate_end() <em>Date end</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_end()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate_end() <em>Date end</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_end()
	 * @generated
	 * @ordered
	 */
	protected Date date_end = DATE_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getBooking_id() <em>Booking id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooking_id()
	 * @generated
	 * @ordered
	 */
	protected static final int BOOKING_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBooking_id() <em>Booking id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooking_id()
	 * @generated
	 * @ordered
	 */
	protected int booking_id = BOOKING_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_price() <em>Total price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_price()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotal_price() <em>Total price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_price()
	 * @generated
	 * @ordered
	 */
	protected double total_price = TOTAL_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtraServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataModelsPackage.Literals.EXTRA_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate_start() {
		return date_start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate_start(Date newDate_start) {
		Date oldDate_start = date_start;
		date_start = newDate_start;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.EXTRA_SERVICE__DATE_START, oldDate_start, date_start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate_end() {
		return date_end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate_end(Date newDate_end) {
		Date oldDate_end = date_end;
		date_end = newDate_end;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.EXTRA_SERVICE__DATE_END, oldDate_end, date_end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBooking_id() {
		return booking_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooking_id(int newBooking_id) {
		int oldBooking_id = booking_id;
		booking_id = newBooking_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.EXTRA_SERVICE__BOOKING_ID, oldBooking_id, booking_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotal_price() {
		return total_price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_price(double newTotal_price) {
		double oldTotal_price = total_price;
		total_price = newTotal_price;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.EXTRA_SERVICE__TOTAL_PRICE, oldTotal_price, total_price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.EXTRA_SERVICE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataModelsPackage.EXTRA_SERVICE__DATE_START:
				return getDate_start();
			case DataModelsPackage.EXTRA_SERVICE__DATE_END:
				return getDate_end();
			case DataModelsPackage.EXTRA_SERVICE__BOOKING_ID:
				return getBooking_id();
			case DataModelsPackage.EXTRA_SERVICE__TOTAL_PRICE:
				return getTotal_price();
			case DataModelsPackage.EXTRA_SERVICE__TYPE:
				return getType();
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
			case DataModelsPackage.EXTRA_SERVICE__DATE_START:
				setDate_start((Date)newValue);
				return;
			case DataModelsPackage.EXTRA_SERVICE__DATE_END:
				setDate_end((Date)newValue);
				return;
			case DataModelsPackage.EXTRA_SERVICE__BOOKING_ID:
				setBooking_id((Integer)newValue);
				return;
			case DataModelsPackage.EXTRA_SERVICE__TOTAL_PRICE:
				setTotal_price((Double)newValue);
				return;
			case DataModelsPackage.EXTRA_SERVICE__TYPE:
				setType((String)newValue);
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
			case DataModelsPackage.EXTRA_SERVICE__DATE_START:
				setDate_start(DATE_START_EDEFAULT);
				return;
			case DataModelsPackage.EXTRA_SERVICE__DATE_END:
				setDate_end(DATE_END_EDEFAULT);
				return;
			case DataModelsPackage.EXTRA_SERVICE__BOOKING_ID:
				setBooking_id(BOOKING_ID_EDEFAULT);
				return;
			case DataModelsPackage.EXTRA_SERVICE__TOTAL_PRICE:
				setTotal_price(TOTAL_PRICE_EDEFAULT);
				return;
			case DataModelsPackage.EXTRA_SERVICE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case DataModelsPackage.EXTRA_SERVICE__DATE_START:
				return DATE_START_EDEFAULT == null ? date_start != null : !DATE_START_EDEFAULT.equals(date_start);
			case DataModelsPackage.EXTRA_SERVICE__DATE_END:
				return DATE_END_EDEFAULT == null ? date_end != null : !DATE_END_EDEFAULT.equals(date_end);
			case DataModelsPackage.EXTRA_SERVICE__BOOKING_ID:
				return booking_id != BOOKING_ID_EDEFAULT;
			case DataModelsPackage.EXTRA_SERVICE__TOTAL_PRICE:
				return total_price != TOTAL_PRICE_EDEFAULT;
			case DataModelsPackage.EXTRA_SERVICE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (date_start: ");
		result.append(date_start);
		result.append(", date_end: ");
		result.append(date_end);
		result.append(", booking_id: ");
		result.append(booking_id);
		result.append(", total_price: ");
		result.append(total_price);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ExtraServiceImpl
