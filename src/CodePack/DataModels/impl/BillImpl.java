/**
 */
package CodePack.DataModels.impl;

import CodePack.DataModels.Bill;
import CodePack.DataModels.DataModelsPackage;
import CodePack.DataModels.ExtraService;
import CodePack.DataModels.Room;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CodePack.DataModels.impl.BillImpl#getBooking_id <em>Booking id</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.BillImpl#getRooms_booked <em>Rooms booked</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.BillImpl#getServices_ordered <em>Services ordered</em>}</li>
 *   <li>{@link CodePack.DataModels.impl.BillImpl#getTotal_price <em>Total price</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BillImpl extends MinimalEObjectImpl.Container implements Bill {
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
	 * The cached value of the '{@link #getRooms_booked() <em>Rooms booked</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms_booked()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> rooms_booked;

	/**
	 * The cached value of the '{@link #getServices_ordered() <em>Services ordered</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices_ordered()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtraService> services_ordered;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BillImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataModelsPackage.Literals.BILL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.BILL__BOOKING_ID, oldBooking_id, booking_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRooms_booked() {
		if (rooms_booked == null) {
			rooms_booked = new EObjectResolvingEList<Room>(Room.class, this, DataModelsPackage.BILL__ROOMS_BOOKED);
		}
		return rooms_booked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtraService> getServices_ordered() {
		if (services_ordered == null) {
			services_ordered = new EObjectResolvingEList<ExtraService>(ExtraService.class, this, DataModelsPackage.BILL__SERVICES_ORDERED);
		}
		return services_ordered;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataModelsPackage.BILL__TOTAL_PRICE, oldTotal_price, total_price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataModelsPackage.BILL__BOOKING_ID:
				return getBooking_id();
			case DataModelsPackage.BILL__ROOMS_BOOKED:
				return getRooms_booked();
			case DataModelsPackage.BILL__SERVICES_ORDERED:
				return getServices_ordered();
			case DataModelsPackage.BILL__TOTAL_PRICE:
				return getTotal_price();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataModelsPackage.BILL__BOOKING_ID:
				setBooking_id((Integer)newValue);
				return;
			case DataModelsPackage.BILL__ROOMS_BOOKED:
				getRooms_booked().clear();
				getRooms_booked().addAll((Collection<? extends Room>)newValue);
				return;
			case DataModelsPackage.BILL__SERVICES_ORDERED:
				getServices_ordered().clear();
				getServices_ordered().addAll((Collection<? extends ExtraService>)newValue);
				return;
			case DataModelsPackage.BILL__TOTAL_PRICE:
				setTotal_price((Double)newValue);
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
			case DataModelsPackage.BILL__BOOKING_ID:
				setBooking_id(BOOKING_ID_EDEFAULT);
				return;
			case DataModelsPackage.BILL__ROOMS_BOOKED:
				getRooms_booked().clear();
				return;
			case DataModelsPackage.BILL__SERVICES_ORDERED:
				getServices_ordered().clear();
				return;
			case DataModelsPackage.BILL__TOTAL_PRICE:
				setTotal_price(TOTAL_PRICE_EDEFAULT);
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
			case DataModelsPackage.BILL__BOOKING_ID:
				return booking_id != BOOKING_ID_EDEFAULT;
			case DataModelsPackage.BILL__ROOMS_BOOKED:
				return rooms_booked != null && !rooms_booked.isEmpty();
			case DataModelsPackage.BILL__SERVICES_ORDERED:
				return services_ordered != null && !services_ordered.isEmpty();
			case DataModelsPackage.BILL__TOTAL_PRICE:
				return total_price != TOTAL_PRICE_EDEFAULT;
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
		result.append(" (booking_id: ");
		result.append(booking_id);
		result.append(", total_price: ");
		result.append(total_price);
		result.append(')');
		return result.toString();
	}

} //BillImpl
