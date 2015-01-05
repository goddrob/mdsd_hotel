/**
 */
package CodePack.DataModels;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CodePack.DataModels.Room#getNumber <em>Number</em>}</li>
 *   <li>{@link CodePack.DataModels.Room#getDescription <em>Description</em>}</li>
 *   <li>{@link CodePack.DataModels.Room#isAvailable <em>Is Available</em>}</li>
 *   <li>{@link CodePack.DataModels.Room#getRoom_type <em>Room type</em>}</li>
 * </ul>
 * </p>
 *
 * @see CodePack.DataModels.DataModelsPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see CodePack.DataModels.DataModelsPackage#getRoom_Number()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.Room#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see CodePack.DataModels.DataModelsPackage#getRoom_Description()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.Room#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Is Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Available</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Available</em>' attribute.
	 * @see #setIsAvailable(boolean)
	 * @see CodePack.DataModels.DataModelsPackage#getRoom_IsAvailable()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isAvailable();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.Room#isAvailable <em>Is Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Available</em>' attribute.
	 * @see #isAvailable()
	 * @generated
	 */
	void setIsAvailable(boolean value);

	/**
	 * Returns the value of the '<em><b>Room type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room type</em>' attribute.
	 * @see #setRoom_type(String)
	 * @see CodePack.DataModels.DataModelsPackage#getRoom_Room_type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getRoom_type();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.Room#getRoom_type <em>Room type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room type</em>' attribute.
	 * @see #getRoom_type()
	 * @generated
	 */
	void setRoom_type(String value);

} // Room
