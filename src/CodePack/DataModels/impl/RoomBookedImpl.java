/**
 */
package CodePack.DataModels.impl;

import CodePack.DataModels.Booking;
import CodePack.DataModels.DataModelsPackage;
import CodePack.DataModels.RoomBooked;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Booked</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CodePack.DataModels.impl.RoomBookedImpl#getRoom_number <em>Room number</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.RoomBookedImpl#getBooking_id <em>Booking id</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.RoomBookedImpl#getDate_start <em>Date start</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.RoomBookedImpl#getDate_end <em>Date end</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.RoomBookedImpl#getBooking <em>Booking</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomBookedImpl extends MinimalEObjectImpl.Container implements RoomBooked {
	/**
	 * The default value of the '{@link #getRoom_number() <em>Room number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom_number()
	 * @generated
	 * @ordered
	 */
	protected static final int ROOM_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRoom_number() <em>Room number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom_number()
	 * @generated
	 * @ordered
	 */
	protected int room_number = ROOM_NUMBER_EDEFAULT;

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
	 * The cached value of the '{@link #getBooking() <em>Booking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooking()
	 * @generated
	 * @ordered
	 */
	protected Booking booking;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomBookedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataModelsPackage.Literals.ROOM_BOOKED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoom_number() {
		return room_number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom_number(int newRoom_number) {
		int oldRoom_number = room_number;
		room_number = newRoom_number;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.ROOM_BOOKED__ROOM_NUMBER, oldRoom_number, room_number));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.ROOM_BOOKED__BOOKING_ID, oldBooking_id, booking_id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.ROOM_BOOKED__DATE_START, oldDate_start, date_start));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.ROOM_BOOKED__DATE_END, oldDate_end, date_end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking getBooking() {
		if (booking != null && booking.eIsProxy()) {
			InternalEObject oldBooking = (InternalEObject)booking;
			booking = (Booking)eResolveProxy(oldBooking);
			if (booking != oldBooking) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataModelsPackage.ROOM_BOOKED__BOOKING, oldBooking, booking));
			}
		}
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking basicGetBooking() {
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooking(Booking newBooking) {
		Booking oldBooking = booking;
		booking = newBooking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.ROOM_BOOKED__BOOKING, oldBooking, booking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataModelsPackage.ROOM_BOOKED__ROOM_NUMBER:
				return getRoom_number();
			case DataModelsPackage.ROOM_BOOKED__BOOKING_ID:
				return getBooking_id();
			case DataModelsPackage.ROOM_BOOKED__DATE_START:
				return getDate_start();
			case DataModelsPackage.ROOM_BOOKED__DATE_END:
				return getDate_end();
			case DataModelsPackage.ROOM_BOOKED__BOOKING:
				if (resolve) return getBooking();
				return basicGetBooking();
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
			case DataModelsPackage.ROOM_BOOKED__ROOM_NUMBER:
				setRoom_number((Integer)newValue);
				return;
			case DataModelsPackage.ROOM_BOOKED__BOOKING_ID:
				setBooking_id((Integer)newValue);
				return;
			case DataModelsPackage.ROOM_BOOKED__DATE_START:
				setDate_start((Date)newValue);
				return;
			case DataModelsPackage.ROOM_BOOKED__DATE_END:
				setDate_end((Date)newValue);
				return;
			case DataModelsPackage.ROOM_BOOKED__BOOKING:
				setBooking((Booking)newValue);
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
			case DataModelsPackage.ROOM_BOOKED__ROOM_NUMBER:
				setRoom_number(ROOM_NUMBER_EDEFAULT);
				return;
			case DataModelsPackage.ROOM_BOOKED__BOOKING_ID:
				setBooking_id(BOOKING_ID_EDEFAULT);
				return;
			case DataModelsPackage.ROOM_BOOKED__DATE_START:
				setDate_start(DATE_START_EDEFAULT);
				return;
			case DataModelsPackage.ROOM_BOOKED__DATE_END:
				setDate_end(DATE_END_EDEFAULT);
				return;
			case DataModelsPackage.ROOM_BOOKED__BOOKING:
				setBooking((Booking)null);
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
			case DataModelsPackage.ROOM_BOOKED__ROOM_NUMBER:
				return room_number != ROOM_NUMBER_EDEFAULT;
			case DataModelsPackage.ROOM_BOOKED__BOOKING_ID:
				return booking_id != BOOKING_ID_EDEFAULT;
			case DataModelsPackage.ROOM_BOOKED__DATE_START:
				return DATE_START_EDEFAULT == null ? date_start != null : !DATE_START_EDEFAULT.equals(date_start);
			case DataModelsPackage.ROOM_BOOKED__DATE_END:
				return DATE_END_EDEFAULT == null ? date_end != null : !DATE_END_EDEFAULT.equals(date_end);
			case DataModelsPackage.ROOM_BOOKED__BOOKING:
				return booking != null;
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
		result.append(" (room_number: ");
		result.append(room_number);
		result.append(", booking_id: ");
		result.append(booking_id);
		result.append(", date_start: ");
		result.append(date_start);
		result.append(", date_end: ");
		result.append(date_end);
		result.append(')');
		return result.toString();
	}

} //RoomBookedImpl
