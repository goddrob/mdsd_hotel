/**
 */
package CodePack.DataModels.impl;

import CodePack.DataModels.Booking;
import CodePack.DataModels.DataModelsPackage;
import CodePack.DataModels.Room;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CodePack.DataModels.impl.BookingImpl#getId <em>Id</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.BookingImpl#getDate_check_in <em>Date check in</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.BookingImpl#getDate_check_out <em>Date check out</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.BookingImpl#isCheckedIn <em>Is Checked In</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.BookingImpl#getTotal_price <em>Total price</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.BookingImpl#getContact_name <em>Contact name</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.BookingImpl#getContact_phone <em>Contact phone</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.BookingImpl#getContact_email <em>Contact email</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.BookingImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.BookingImpl#getCustomer_id <em>Customer id</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.BookingImpl#getPayment_id <em>Payment id</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.BookingImpl#getBonus_points_used <em>Bonus points used</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingImpl extends MinimalEObjectImpl.Container implements Booking {
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
	 * The default value of the '{@link #getDate_check_in() <em>Date check in</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_check_in()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_CHECK_IN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate_check_in() <em>Date check in</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_check_in()
	 * @generated
	 * @ordered
	 */
	protected Date date_check_in = DATE_CHECK_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate_check_out() <em>Date check out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_check_out()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_CHECK_OUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate_check_out() <em>Date check out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_check_out()
	 * @generated
	 * @ordered
	 */
	protected Date date_check_out = DATE_CHECK_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckedIn() <em>Is Checked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckedIn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CHECKED_IN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckedIn() <em>Is Checked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckedIn()
	 * @generated
	 * @ordered
	 */
	protected boolean isCheckedIn = IS_CHECKED_IN_EDEFAULT;

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
	 * The default value of the '{@link #getContact_name() <em>Contact name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact_name()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContact_name() <em>Contact name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact_name()
	 * @generated
	 * @ordered
	 */
	protected String contact_name = CONTACT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getContact_phone() <em>Contact phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact_phone()
	 * @generated
	 * @ordered
	 */
	protected static final int CONTACT_PHONE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getContact_phone() <em>Contact phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact_phone()
	 * @generated
	 * @ordered
	 */
	protected int contact_phone = CONTACT_PHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContact_email() <em>Contact email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact_email()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContact_email() <em>Contact email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact_email()
	 * @generated
	 * @ordered
	 */
	protected String contact_email = CONTACT_EMAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected Room room;

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
	 * The default value of the '{@link #getBonus_points_used() <em>Bonus points used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBonus_points_used()
	 * @generated
	 * @ordered
	 */
	protected static final int BONUS_POINTS_USED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBonus_points_used() <em>Bonus points used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBonus_points_used()
	 * @generated
	 * @ordered
	 */
	protected int bonus_points_used = BONUS_POINTS_USED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataModelsPackage.Literals.BOOKING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.BOOKING__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate_check_in() {
		return date_check_in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate_check_in(Date newDate_check_in) {
		Date oldDate_check_in = date_check_in;
		date_check_in = newDate_check_in;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.BOOKING__DATE_CHECK_IN, oldDate_check_in, date_check_in));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate_check_out() {
		return date_check_out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate_check_out(Date newDate_check_out) {
		Date oldDate_check_out = date_check_out;
		date_check_out = newDate_check_out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.BOOKING__DATE_CHECK_OUT, oldDate_check_out, date_check_out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckedIn() {
		return isCheckedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCheckedIn(boolean newIsCheckedIn) {
		boolean oldIsCheckedIn = isCheckedIn;
		isCheckedIn = newIsCheckedIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.BOOKING__IS_CHECKED_IN, oldIsCheckedIn, isCheckedIn));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.BOOKING__TOTAL_PRICE, oldTotal_price, total_price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContact_name() {
		return contact_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContact_name(String newContact_name) {
		String oldContact_name = contact_name;
		contact_name = newContact_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.BOOKING__CONTACT_NAME, oldContact_name, contact_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getContact_phone() {
		return contact_phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContact_phone(int newContact_phone) {
		int oldContact_phone = contact_phone;
		contact_phone = newContact_phone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.BOOKING__CONTACT_PHONE, oldContact_phone, contact_phone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContact_email() {
		return contact_email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContact_email(String newContact_email) {
		String oldContact_email = contact_email;
		contact_email = newContact_email;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.BOOKING__CONTACT_EMAIL, oldContact_email, contact_email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getRoom() {
		if (room != null && room.eIsProxy()) {
			InternalEObject oldRoom = (InternalEObject)room;
			room = (Room)eResolveProxy(oldRoom);
			if (room != oldRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataModelsPackage.BOOKING__ROOM, oldRoom, room));
			}
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(Room newRoom) {
		Room oldRoom = room;
		room = newRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.BOOKING__ROOM, oldRoom, room));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.BOOKING__CUSTOMER_ID, oldCustomer_id, customer_id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.BOOKING__PAYMENT_ID, oldPayment_id, payment_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBonus_points_used() {
		return bonus_points_used;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBonus_points_used(int newBonus_points_used) {
		int oldBonus_points_used = bonus_points_used;
		bonus_points_used = newBonus_points_used;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.BOOKING__BONUS_POINTS_USED, oldBonus_points_used, bonus_points_used));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataModelsPackage.BOOKING__ID:
				return getId();
			case DataModelsPackage.BOOKING__DATE_CHECK_IN:
				return getDate_check_in();
			case DataModelsPackage.BOOKING__DATE_CHECK_OUT:
				return getDate_check_out();
			case DataModelsPackage.BOOKING__IS_CHECKED_IN:
				return isCheckedIn();
			case DataModelsPackage.BOOKING__TOTAL_PRICE:
				return getTotal_price();
			case DataModelsPackage.BOOKING__CONTACT_NAME:
				return getContact_name();
			case DataModelsPackage.BOOKING__CONTACT_PHONE:
				return getContact_phone();
			case DataModelsPackage.BOOKING__CONTACT_EMAIL:
				return getContact_email();
			case DataModelsPackage.BOOKING__ROOM:
				if (resolve) return getRoom();
				return basicGetRoom();
			case DataModelsPackage.BOOKING__CUSTOMER_ID:
				return getCustomer_id();
			case DataModelsPackage.BOOKING__PAYMENT_ID:
				return getPayment_id();
			case DataModelsPackage.BOOKING__BONUS_POINTS_USED:
				return getBonus_points_used();
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
			case DataModelsPackage.BOOKING__ID:
				setId((Integer)newValue);
				return;
			case DataModelsPackage.BOOKING__DATE_CHECK_IN:
				setDate_check_in((Date)newValue);
				return;
			case DataModelsPackage.BOOKING__DATE_CHECK_OUT:
				setDate_check_out((Date)newValue);
				return;
			case DataModelsPackage.BOOKING__IS_CHECKED_IN:
				setIsCheckedIn((Boolean)newValue);
				return;
			case DataModelsPackage.BOOKING__TOTAL_PRICE:
				setTotal_price((Double)newValue);
				return;
			case DataModelsPackage.BOOKING__CONTACT_NAME:
				setContact_name((String)newValue);
				return;
			case DataModelsPackage.BOOKING__CONTACT_PHONE:
				setContact_phone((Integer)newValue);
				return;
			case DataModelsPackage.BOOKING__CONTACT_EMAIL:
				setContact_email((String)newValue);
				return;
			case DataModelsPackage.BOOKING__ROOM:
				setRoom((Room)newValue);
				return;
			case DataModelsPackage.BOOKING__CUSTOMER_ID:
				setCustomer_id((Integer)newValue);
				return;
			case DataModelsPackage.BOOKING__PAYMENT_ID:
				setPayment_id((Integer)newValue);
				return;
			case DataModelsPackage.BOOKING__BONUS_POINTS_USED:
				setBonus_points_used((Integer)newValue);
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
			case DataModelsPackage.BOOKING__ID:
				setId(ID_EDEFAULT);
				return;
			case DataModelsPackage.BOOKING__DATE_CHECK_IN:
				setDate_check_in(DATE_CHECK_IN_EDEFAULT);
				return;
			case DataModelsPackage.BOOKING__DATE_CHECK_OUT:
				setDate_check_out(DATE_CHECK_OUT_EDEFAULT);
				return;
			case DataModelsPackage.BOOKING__IS_CHECKED_IN:
				setIsCheckedIn(IS_CHECKED_IN_EDEFAULT);
				return;
			case DataModelsPackage.BOOKING__TOTAL_PRICE:
				setTotal_price(TOTAL_PRICE_EDEFAULT);
				return;
			case DataModelsPackage.BOOKING__CONTACT_NAME:
				setContact_name(CONTACT_NAME_EDEFAULT);
				return;
			case DataModelsPackage.BOOKING__CONTACT_PHONE:
				setContact_phone(CONTACT_PHONE_EDEFAULT);
				return;
			case DataModelsPackage.BOOKING__CONTACT_EMAIL:
				setContact_email(CONTACT_EMAIL_EDEFAULT);
				return;
			case DataModelsPackage.BOOKING__ROOM:
				setRoom((Room)null);
				return;
			case DataModelsPackage.BOOKING__CUSTOMER_ID:
				setCustomer_id(CUSTOMER_ID_EDEFAULT);
				return;
			case DataModelsPackage.BOOKING__PAYMENT_ID:
				setPayment_id(PAYMENT_ID_EDEFAULT);
				return;
			case DataModelsPackage.BOOKING__BONUS_POINTS_USED:
				setBonus_points_used(BONUS_POINTS_USED_EDEFAULT);
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
			case DataModelsPackage.BOOKING__ID:
				return id != ID_EDEFAULT;
			case DataModelsPackage.BOOKING__DATE_CHECK_IN:
				return DATE_CHECK_IN_EDEFAULT == null ? date_check_in != null : !DATE_CHECK_IN_EDEFAULT.equals(date_check_in);
			case DataModelsPackage.BOOKING__DATE_CHECK_OUT:
				return DATE_CHECK_OUT_EDEFAULT == null ? date_check_out != null : !DATE_CHECK_OUT_EDEFAULT.equals(date_check_out);
			case DataModelsPackage.BOOKING__IS_CHECKED_IN:
				return isCheckedIn != IS_CHECKED_IN_EDEFAULT;
			case DataModelsPackage.BOOKING__TOTAL_PRICE:
				return total_price != TOTAL_PRICE_EDEFAULT;
			case DataModelsPackage.BOOKING__CONTACT_NAME:
				return CONTACT_NAME_EDEFAULT == null ? contact_name != null : !CONTACT_NAME_EDEFAULT.equals(contact_name);
			case DataModelsPackage.BOOKING__CONTACT_PHONE:
				return contact_phone != CONTACT_PHONE_EDEFAULT;
			case DataModelsPackage.BOOKING__CONTACT_EMAIL:
				return CONTACT_EMAIL_EDEFAULT == null ? contact_email != null : !CONTACT_EMAIL_EDEFAULT.equals(contact_email);
			case DataModelsPackage.BOOKING__ROOM:
				return room != null;
			case DataModelsPackage.BOOKING__CUSTOMER_ID:
				return customer_id != CUSTOMER_ID_EDEFAULT;
			case DataModelsPackage.BOOKING__PAYMENT_ID:
				return payment_id != PAYMENT_ID_EDEFAULT;
			case DataModelsPackage.BOOKING__BONUS_POINTS_USED:
				return bonus_points_used != BONUS_POINTS_USED_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", date_check_in: ");
		result.append(date_check_in);
		result.append(", date_check_out: ");
		result.append(date_check_out);
		result.append(", isCheckedIn: ");
		result.append(isCheckedIn);
		result.append(", total_price: ");
		result.append(total_price);
		result.append(", contact_name: ");
		result.append(contact_name);
		result.append(", contact_phone: ");
		result.append(contact_phone);
		result.append(", contact_email: ");
		result.append(contact_email);
		result.append(", customer_id: ");
		result.append(customer_id);
		result.append(", payment_id: ");
		result.append(payment_id);
		result.append(", bonus_points_used: ");
		result.append(bonus_points_used);
		result.append(')');
		return result.toString();
	}

} //BookingImpl
