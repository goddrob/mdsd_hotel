/**
 */
package CodePack.Backend.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import CodePack.CodePackFactory;
import CodePack.CodePackPackage;
import CodePack.DataBank;
import CodePack.Backend.BackendPackage;
import CodePack.Backend.ManagementHandler;
import CodePack.DataModels.DataModelsFactory;
import CodePack.DataModels.Room;
import CodePack.DataModels.RoomType;
import CodePack.DataModels.ServiceType;
import CodePack.DataModels.StaffMember;
import CodePack.DataModels.StaffRole;
import CodePack.IStaffAuthentication;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Management Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ManagementHandlerImpl extends MinimalEObjectImpl.Container implements ManagementHandler {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagementHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BackendPackage.Literals.MANAGEMENT_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffMember registerStaffAccount(String name, String email, String pers_no, int phone_no, String role_name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean updateStaffAccount(StaffMember account) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffMember getStaffAccount(String pers_no) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffMember getAllStaffAccounts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeStaffAccount(StaffMember account) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StaffRole> getStaffRoles() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffRole addStaffRole(String name, boolean canManageBookings, boolean canManageRooms, boolean canManageServices, boolean canManageAccounts) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean updateStaffRole(StaffRole role) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeStaffRole(StaffRole role) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public StaffMember login(String e_mail, String password) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		
		for(StaffMember sm : db.getStaffMemberList()){
			if(e_mail == sm.getEmail() && password == sm.getPassword()){
				return sm;
			}
		}
		
		throw new UnsupportedOperationException();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public StaffRole getRoleForStaff(String pers_no) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		for (StaffMember sm : db.getStaffMemberList()) {
			if (sm.getPers_no().equals(pers_no)) 
				for (StaffRole sr : db.getStaffRoleList())
					if (sr.getName().equals(sm.getRole_name())) return sr;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean addRoom(int number, String description, boolean isAvailable, String type) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		
		boolean isType = false;
		for (RoomType rt : db.getRoomTypeList())
			if (rt.getTypename().equals(type)) isType = true;
		if (!isType) return false;
		
		for (Room r : db.getRoomList())
			if (r.getNumber()==number) return false;
		
		Room room = DataModelsFactory.eINSTANCE.createRoom();
		room.setNumber(number);
		room.setDescription(description);
		room.setIsAvailable(isAvailable);
		room.setRoom_type(type);
		db.getRoomList().add(room);
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean updateRoom(Room room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		
		boolean isDataValid = false;
		
		for (RoomType rt : db.getRoomTypeList())
			if (rt.getTypename().equals(room.getRoom_type())) isDataValid = true;
		if (!isDataValid) return false;
		
		for (Room r : db.getRoomList())
			if (r.getNumber()==room.getNumber()) {
				int index = db.getRoomList().indexOf(r);
				db.getRoomList().remove(r);
				db.getRoomList().add(index, room);
				return true;
			}
		
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeRoom(int number) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		int size = db.getRoomList().size();
		for (int i=0; i<size; i++)
			if(db.getRoomList().get(i).getNumber()==number){
				db.getRoomList().remove(i);
				return true;
			}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean addRoomType(String name, String description, int max_guests, double rate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		for(RoomType rt : db.getRoomTypeList())
			if (rt.getTypename().equals(name)) return false;
		RoomType rt = DataModelsFactory.eINSTANCE.createRoomType();
		rt.setDescription(description);
		rt.setMax_guests(max_guests);
		rt.setRate(rate);
		rt.setTypename(name);
		db.getRoomTypeList().add(rt);
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean updateRoomType(RoomType roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		for (RoomType rt : db.getRoomTypeList()){
			if (rt.getTypename().equals(roomType.getTypename())){
				int index = db.getRoomTypeList().indexOf(rt);
				db.getRoomTypeList().remove(rt);
				db.getRoomTypeList().add(index,roomType);
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeRoomType(String type_name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		for (RoomType rt : db.getRoomTypeList())
			if (rt.getTypename().equals(type_name)){
				db.getRoomTypeList().remove(rt);
				return true;
			}
		return false;	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Room getRoom(int number) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		for(Room r:db.getRoomList()){
			if(r.getNumber() == number){
				return r;
			}
		}
		
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Room> getAllRooms() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		EList<Room> r = db.getRoomList();
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<RoomType> getRoomTypes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DataBank db = CodePackFactory.eINSTANCE.createDataBank();
		EList<RoomType> rt = db.getRoomTypeList();
		return rt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceType> getServiceTypes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean updateServiceType(ServiceType serviceType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeServiceType(ServiceType serviceType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == IStaffAuthentication.class) {
			switch (baseOperationID) {
				case CodePackPackage.ISTAFF_AUTHENTICATION___LOGIN__STRING_STRING: return BackendPackage.MANAGEMENT_HANDLER___LOGIN__STRING_STRING;
				case CodePackPackage.ISTAFF_AUTHENTICATION___GET_ROLE_FOR_STAFF__STRING: return BackendPackage.MANAGEMENT_HANDLER___GET_ROLE_FOR_STAFF__STRING;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BackendPackage.MANAGEMENT_HANDLER___REGISTER_STAFF_ACCOUNT__STRING_STRING_STRING_INT_STRING:
				return registerStaffAccount((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4));
			case BackendPackage.MANAGEMENT_HANDLER___UPDATE_STAFF_ACCOUNT__STAFFMEMBER:
				return updateStaffAccount((StaffMember)arguments.get(0));
			case BackendPackage.MANAGEMENT_HANDLER___GET_STAFF_ACCOUNT__STRING:
				return getStaffAccount((String)arguments.get(0));
			case BackendPackage.MANAGEMENT_HANDLER___GET_ALL_STAFF_ACCOUNTS:
				return getAllStaffAccounts();
			case BackendPackage.MANAGEMENT_HANDLER___REMOVE_STAFF_ACCOUNT__STAFFMEMBER:
				return removeStaffAccount((StaffMember)arguments.get(0));
			case BackendPackage.MANAGEMENT_HANDLER___GET_STAFF_ROLES:
				return getStaffRoles();
			case BackendPackage.MANAGEMENT_HANDLER___ADD_STAFF_ROLE__STRING_BOOLEAN_BOOLEAN_BOOLEAN_BOOLEAN:
				return addStaffRole((String)arguments.get(0), (Boolean)arguments.get(1), (Boolean)arguments.get(2), (Boolean)arguments.get(3), (Boolean)arguments.get(4));
			case BackendPackage.MANAGEMENT_HANDLER___UPDATE_STAFF_ROLE__STAFFROLE:
				return updateStaffRole((StaffRole)arguments.get(0));
			case BackendPackage.MANAGEMENT_HANDLER___REMOVE_STAFF_ROLE__STAFFROLE:
				return removeStaffRole((StaffRole)arguments.get(0));
			case BackendPackage.MANAGEMENT_HANDLER___LOGIN__STRING_STRING:
				return login((String)arguments.get(0), (String)arguments.get(1));
			case BackendPackage.MANAGEMENT_HANDLER___GET_ROLE_FOR_STAFF__STRING:
				return getRoleForStaff((String)arguments.get(0));
			case BackendPackage.MANAGEMENT_HANDLER___ADD_ROOM__INT_STRING_BOOLEAN_STRING:
				return addRoom((Integer)arguments.get(0), (String)arguments.get(1), (Boolean)arguments.get(2), (String)arguments.get(3));
			case BackendPackage.MANAGEMENT_HANDLER___UPDATE_ROOM__ROOM:
				return updateRoom((Room)arguments.get(0));
			case BackendPackage.MANAGEMENT_HANDLER___REMOVE_ROOM__INT:
				return removeRoom((Integer)arguments.get(0));
			case BackendPackage.MANAGEMENT_HANDLER___ADD_ROOM_TYPE__STRING_STRING_INT_DOUBLE:
				return addRoomType((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Double)arguments.get(3));
			case BackendPackage.MANAGEMENT_HANDLER___UPDATE_ROOM_TYPE__ROOMTYPE:
				return updateRoomType((RoomType)arguments.get(0));
			case BackendPackage.MANAGEMENT_HANDLER___REMOVE_ROOM_TYPE__STRING:
				return removeRoomType((String)arguments.get(0));
			case BackendPackage.MANAGEMENT_HANDLER___GET_ROOM__INT:
				return getRoom((Integer)arguments.get(0));
			case BackendPackage.MANAGEMENT_HANDLER___GET_ALL_ROOMS:
				return getAllRooms();
			case BackendPackage.MANAGEMENT_HANDLER___GET_ROOM_TYPES:
				return getRoomTypes();
			case BackendPackage.MANAGEMENT_HANDLER___GET_SERVICE_TYPES:
				return getServiceTypes();
			case BackendPackage.MANAGEMENT_HANDLER___UPDATE_SERVICE_TYPE__SERVICETYPE:
				return updateServiceType((ServiceType)arguments.get(0));
			case BackendPackage.MANAGEMENT_HANDLER___REMOVE_SERVICE_TYPE__SERVICETYPE:
				return removeServiceType((ServiceType)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ManagementHandlerImpl
