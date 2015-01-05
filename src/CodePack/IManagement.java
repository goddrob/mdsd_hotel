/**
 */
package CodePack;

import CodePack.DataModels.Room;
import CodePack.DataModels.RoomType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IManagement</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see CodePack.CodePackPackage#getIManagement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IManagement extends IStaffAuthentication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" numberRequired="true" numberOrdered="false" descriptionRequired="true" descriptionOrdered="false" isAvailableRequired="true" isAvailableOrdered="false" typeRequired="true" typeOrdered="false"
	 * @generated
	 */
	boolean addRoom(int number, String description, boolean isAvailable, String type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	boolean updateRoom(Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" numberRequired="true" numberOrdered="false"
	 * @generated
	 */
	boolean removeRoom(int number);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameRequired="true" nameOrdered="false" descriptionRequired="true" descriptionOrdered="false" max_guestsRequired="true" max_guestsOrdered="false" rateRequired="true" rateOrdered="false"
	 * @generated
	 */
	boolean addRoomType(String name, String description, int max_guests, double rate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	boolean updateRoomType(RoomType roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" type_nameRequired="true" type_nameOrdered="false"
	 * @generated
	 */
	boolean removeRoomType(String type_name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" numberRequired="true" numberOrdered="false"
	 * @generated
	 */
	Room getRoom(int number);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Room> getAllRooms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<RoomType> getRoomTypes();

} // IManagement
