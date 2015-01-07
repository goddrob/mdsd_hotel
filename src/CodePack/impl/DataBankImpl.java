/**
 */
package CodePack.impl;

import CodePack.CodePackPackage;
import CodePack.DataBank;
import CodePack.DataModels.Booking;
import CodePack.DataModels.Customer;
import CodePack.DataModels.ExtraService;
import CodePack.DataModels.Guest;
import CodePack.DataModels.PaymentData;
import CodePack.DataModels.Room;
import CodePack.DataModels.RoomBooked;
import CodePack.DataModels.RoomType;
import CodePack.DataModels.ServiceType;
import CodePack.DataModels.StaffMember;
import CodePack.DataModels.StaffRole;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Bank</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CodePack.impl.DataBankImpl#getRoomList <em>Room List</em>}</li>
 *   <li>{@link CodePack.impl.DataBankImpl#getBookingList <em>Booking List</em>}</li>
 *   <li>{@link CodePack.impl.DataBankImpl#getCustomerList <em>Customer List</em>}</li>
 *   <li>{@link CodePack.impl.DataBankImpl#getRoomTypeList <em>Room Type List</em>}</li>
 *   <li>{@link CodePack.impl.DataBankImpl#getPaymentDataList <em>Payment Data List</em>}</li>
 *   <li>{@link CodePack.impl.DataBankImpl#getRoomBookedList <em>Room Booked List</em>}</li>
 *   <li>{@link CodePack.impl.DataBankImpl#getExtraServiceList <em>Extra Service List</em>}</li>
 *   <li>{@link CodePack.impl.DataBankImpl#getServiceTypeList <em>Service Type List</em>}</li>
 *   <li>{@link CodePack.impl.DataBankImpl#getGuestList <em>Guest List</em>}</li>
 *   <li>{@link CodePack.impl.DataBankImpl#getStaffRoleList <em>Staff Role List</em>}</li>
 *   <li>{@link CodePack.impl.DataBankImpl#getStaffMemberList <em>Staff Member List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataBankImpl extends MinimalEObjectImpl.Container implements DataBank {
	/**
	 * The cached value of the '{@link #getRoomList() <em>Room List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomList()
	 * @generated NOT
	 * @ordered
	 */
	protected static EList<Room> roomList;
	/**
	 * The cached value of the '{@link #getBookingList() <em>Booking List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingList()
	 * @generated NOT
	 * @ordered
	 */
	protected static EList<Booking> bookingList;
	/**
	 * The cached value of the '{@link #getCustomerList() <em>Customer List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerList()
	 * @generated NOT
	 * @ordered
	 */
	protected static EList<Customer> customerList;
	/**
	 * The cached value of the '{@link #getRoomTypeList() <em>Room Type List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypeList()
	 * @generated NOT
	 * @ordered
	 */
	protected static EList<RoomType> roomTypeList;
	/**
	 * The cached value of the '{@link #getPaymentDataList() <em>Payment Data List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentDataList()
	 * @generated NOT
	 * @ordered
	 */
	protected static EList<PaymentData> paymentDataList;
	/**
	 * The cached value of the '{@link #getRoomBookedList() <em>Room Booked List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomBookedList()
	 * @generated NOT
	 * @ordered
	 */
	protected static EList<RoomBooked> roomBookedList;
	/**
	 * The cached value of the '{@link #getExtraServiceList() <em>Extra Service List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraServiceList()
	 * @generated NOT
	 * @ordered
	 */
	protected static EList<ExtraService> extraServiceList;
	/**
	 * The cached value of the '{@link #getServiceTypeList() <em>Service Type List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTypeList()
	 * @generated NOT
	 * @ordered
	 */
	protected static EList<ServiceType> serviceTypeList;
	/**
	 * The cached value of the '{@link #getGuestList() <em>Guest List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestList()
	 * @generated NOT
	 * @ordered
	 */
	protected static EList<Guest> guestList;
	/**
	 * The cached value of the '{@link #getStaffRoleList() <em>Staff Role List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffRoleList()
	 * @generated NOT
	 * @ordered
	 */
	protected static EList<StaffRole> staffRoleList;
	/**
	 * The cached value of the '{@link #getStaffMemberList() <em>Staff Member List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffMemberList()
	 * @generated NOT
	 * @ordered
	 */
	protected static EList<StaffMember> staffMemberList;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataBankImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodePackPackage.Literals.DATA_BANK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRoomList() {
		if (roomList == null) {
			roomList = new EObjectResolvingEList<Room>(Room.class, this, CodePackPackage.DATA_BANK__ROOM_LIST);
		}
		return roomList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> getBookingList() {
		if (bookingList == null) {
			bookingList = new EObjectResolvingEList<Booking>(Booking.class, this, CodePackPackage.DATA_BANK__BOOKING_LIST);
		}
		return bookingList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Customer> getCustomerList() {
		if (customerList == null) {
			customerList = new EObjectResolvingEList<Customer>(Customer.class, this, CodePackPackage.DATA_BANK__CUSTOMER_LIST);
		}
		return customerList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomType> getRoomTypeList() {
		if (roomTypeList == null) {
			roomTypeList = new EObjectResolvingEList<RoomType>(RoomType.class, this, CodePackPackage.DATA_BANK__ROOM_TYPE_LIST);
		}
		return roomTypeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PaymentData> getPaymentDataList() {
		if (paymentDataList == null) {
			paymentDataList = new EObjectResolvingEList<PaymentData>(PaymentData.class, this, CodePackPackage.DATA_BANK__PAYMENT_DATA_LIST);
		}
		return paymentDataList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomBooked> getRoomBookedList() {
		if (roomBookedList == null) {
			roomBookedList = new EObjectResolvingEList<RoomBooked>(RoomBooked.class, this, CodePackPackage.DATA_BANK__ROOM_BOOKED_LIST);
		}
		return roomBookedList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtraService> getExtraServiceList() {
		if (extraServiceList == null) {
			extraServiceList = new EObjectResolvingEList<ExtraService>(ExtraService.class, this, CodePackPackage.DATA_BANK__EXTRA_SERVICE_LIST);
		}
		return extraServiceList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceType> getServiceTypeList() {
		if (serviceTypeList == null) {
			serviceTypeList = new EObjectResolvingEList<ServiceType>(ServiceType.class, this, CodePackPackage.DATA_BANK__SERVICE_TYPE_LIST);
		}
		return serviceTypeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Guest> getGuestList() {
		if (guestList == null) {
			guestList = new EObjectResolvingEList<Guest>(Guest.class, this, CodePackPackage.DATA_BANK__GUEST_LIST);
		}
		return guestList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StaffRole> getStaffRoleList() {
		if (staffRoleList == null) {
			staffRoleList = new EObjectResolvingEList<StaffRole>(StaffRole.class, this, CodePackPackage.DATA_BANK__STAFF_ROLE_LIST);
		}
		return staffRoleList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StaffMember> getStaffMemberList() {
		if (staffMemberList == null) {
			staffMemberList = new EObjectResolvingEList<StaffMember>(StaffMember.class, this, CodePackPackage.DATA_BANK__STAFF_MEMBER_LIST);
		}
		return staffMemberList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackPackage.DATA_BANK__ROOM_LIST:
				return getRoomList();
			case CodePackPackage.DATA_BANK__BOOKING_LIST:
				return getBookingList();
			case CodePackPackage.DATA_BANK__CUSTOMER_LIST:
				return getCustomerList();
			case CodePackPackage.DATA_BANK__ROOM_TYPE_LIST:
				return getRoomTypeList();
			case CodePackPackage.DATA_BANK__PAYMENT_DATA_LIST:
				return getPaymentDataList();
			case CodePackPackage.DATA_BANK__ROOM_BOOKED_LIST:
				return getRoomBookedList();
			case CodePackPackage.DATA_BANK__EXTRA_SERVICE_LIST:
				return getExtraServiceList();
			case CodePackPackage.DATA_BANK__SERVICE_TYPE_LIST:
				return getServiceTypeList();
			case CodePackPackage.DATA_BANK__GUEST_LIST:
				return getGuestList();
			case CodePackPackage.DATA_BANK__STAFF_ROLE_LIST:
				return getStaffRoleList();
			case CodePackPackage.DATA_BANK__STAFF_MEMBER_LIST:
				return getStaffMemberList();
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
			case CodePackPackage.DATA_BANK__ROOM_LIST:
				getRoomList().clear();
				getRoomList().addAll((Collection<? extends Room>)newValue);
				return;
			case CodePackPackage.DATA_BANK__BOOKING_LIST:
				getBookingList().clear();
				getBookingList().addAll((Collection<? extends Booking>)newValue);
				return;
			case CodePackPackage.DATA_BANK__CUSTOMER_LIST:
				getCustomerList().clear();
				getCustomerList().addAll((Collection<? extends Customer>)newValue);
				return;
			case CodePackPackage.DATA_BANK__ROOM_TYPE_LIST:
				getRoomTypeList().clear();
				getRoomTypeList().addAll((Collection<? extends RoomType>)newValue);
				return;
			case CodePackPackage.DATA_BANK__PAYMENT_DATA_LIST:
				getPaymentDataList().clear();
				getPaymentDataList().addAll((Collection<? extends PaymentData>)newValue);
				return;
			case CodePackPackage.DATA_BANK__ROOM_BOOKED_LIST:
				getRoomBookedList().clear();
				getRoomBookedList().addAll((Collection<? extends RoomBooked>)newValue);
				return;
			case CodePackPackage.DATA_BANK__EXTRA_SERVICE_LIST:
				getExtraServiceList().clear();
				getExtraServiceList().addAll((Collection<? extends ExtraService>)newValue);
				return;
			case CodePackPackage.DATA_BANK__SERVICE_TYPE_LIST:
				getServiceTypeList().clear();
				getServiceTypeList().addAll((Collection<? extends ServiceType>)newValue);
				return;
			case CodePackPackage.DATA_BANK__GUEST_LIST:
				getGuestList().clear();
				getGuestList().addAll((Collection<? extends Guest>)newValue);
				return;
			case CodePackPackage.DATA_BANK__STAFF_ROLE_LIST:
				getStaffRoleList().clear();
				getStaffRoleList().addAll((Collection<? extends StaffRole>)newValue);
				return;
			case CodePackPackage.DATA_BANK__STAFF_MEMBER_LIST:
				getStaffMemberList().clear();
				getStaffMemberList().addAll((Collection<? extends StaffMember>)newValue);
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
			case CodePackPackage.DATA_BANK__ROOM_LIST:
				getRoomList().clear();
				return;
			case CodePackPackage.DATA_BANK__BOOKING_LIST:
				getBookingList().clear();
				return;
			case CodePackPackage.DATA_BANK__CUSTOMER_LIST:
				getCustomerList().clear();
				return;
			case CodePackPackage.DATA_BANK__ROOM_TYPE_LIST:
				getRoomTypeList().clear();
				return;
			case CodePackPackage.DATA_BANK__PAYMENT_DATA_LIST:
				getPaymentDataList().clear();
				return;
			case CodePackPackage.DATA_BANK__ROOM_BOOKED_LIST:
				getRoomBookedList().clear();
				return;
			case CodePackPackage.DATA_BANK__EXTRA_SERVICE_LIST:
				getExtraServiceList().clear();
				return;
			case CodePackPackage.DATA_BANK__SERVICE_TYPE_LIST:
				getServiceTypeList().clear();
				return;
			case CodePackPackage.DATA_BANK__GUEST_LIST:
				getGuestList().clear();
				return;
			case CodePackPackage.DATA_BANK__STAFF_ROLE_LIST:
				getStaffRoleList().clear();
				return;
			case CodePackPackage.DATA_BANK__STAFF_MEMBER_LIST:
				getStaffMemberList().clear();
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
			case CodePackPackage.DATA_BANK__ROOM_LIST:
				return roomList != null && !roomList.isEmpty();
			case CodePackPackage.DATA_BANK__BOOKING_LIST:
				return bookingList != null && !bookingList.isEmpty();
			case CodePackPackage.DATA_BANK__CUSTOMER_LIST:
				return customerList != null && !customerList.isEmpty();
			case CodePackPackage.DATA_BANK__ROOM_TYPE_LIST:
				return roomTypeList != null && !roomTypeList.isEmpty();
			case CodePackPackage.DATA_BANK__PAYMENT_DATA_LIST:
				return paymentDataList != null && !paymentDataList.isEmpty();
			case CodePackPackage.DATA_BANK__ROOM_BOOKED_LIST:
				return roomBookedList != null && !roomBookedList.isEmpty();
			case CodePackPackage.DATA_BANK__EXTRA_SERVICE_LIST:
				return extraServiceList != null && !extraServiceList.isEmpty();
			case CodePackPackage.DATA_BANK__SERVICE_TYPE_LIST:
				return serviceTypeList != null && !serviceTypeList.isEmpty();
			case CodePackPackage.DATA_BANK__GUEST_LIST:
				return guestList != null && !guestList.isEmpty();
			case CodePackPackage.DATA_BANK__STAFF_ROLE_LIST:
				return staffRoleList != null && !staffRoleList.isEmpty();
			case CodePackPackage.DATA_BANK__STAFF_MEMBER_LIST:
				return staffMemberList != null && !staffMemberList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataBankImpl
