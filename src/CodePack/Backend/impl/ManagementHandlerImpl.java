/**
 */
package CodePack.Backend.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import CodePack.CodePackFactory;
import CodePack.DataBank;
import CodePack.Backend.BackendPackage;
import CodePack.Backend.ManagementHandler;
import CodePack.DataModels.DataModelsFactory;
import CodePack.DataModels.Room;
import CodePack.DataModels.RoomType;
import CodePack.DataModels.StaffMember;
import CodePack.DataModels.StaffRole;

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
	public StaffMember login(String e_mail, String password) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
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
		for (Room r : db.getRoomList())
			if (r.getNumber()==number) return false;
		boolean isType = false;
		for (RoomType rt : db.getRoomTypeList())
			if (rt.getTypename().equals(type)) isType = true;
		if (!isType) return false;
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
		for (Room r : db.getRoomList())
			if (r.getNumber()==room.getNumber()) isDataValid = true;
		for (RoomType rt : db.getRoomTypeList())
			if (rt.getTypename().equals(room.getRoom_type())) isDataValid = true;
		if (!isDataValid) return false;
		else {
			db.getRoomList().add(room);
			return true;
		}
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
	 * @generated
	 */
	public boolean addRoomType(String name, String description, int max_guests, double rate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean updateRoomType(RoomType roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeRoomType(String type_name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getRoom(int number) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getAllRooms() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomType> getRoomTypes() {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
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
		}
		return super.eInvoke(operationID, arguments);
	}

} //ManagementHandlerImpl
