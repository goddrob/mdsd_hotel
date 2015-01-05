/**
 */
package CodePack.DataModels;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CodePack.DataModels.RoomType#getDescription <em>Description</em>}</li>
 *   <li>{@link CodePack.DataModels.RoomType#getMax_guests <em>Max guests</em>}</li>
 *   <li>{@link CodePack.DataModels.RoomType#getRate <em>Rate</em>}</li>
 *   <li>{@link CodePack.DataModels.RoomType#getTypename <em>Typename</em>}</li>
 * </ul>
 * </p>
 *
 * @see CodePack.DataModels.DataModelsPackage#getRoomType()
 * @model
 * @generated
 */
public interface RoomType extends EObject {
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
	 * @see CodePack.DataModels.DataModelsPackage#getRoomType_Description()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.RoomType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Max guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max guests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max guests</em>' attribute.
	 * @see #setMax_guests(int)
	 * @see CodePack.DataModels.DataModelsPackage#getRoomType_Max_guests()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getMax_guests();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.RoomType#getMax_guests <em>Max guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max guests</em>' attribute.
	 * @see #getMax_guests()
	 * @generated
	 */
	void setMax_guests(int value);

	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate</em>' attribute.
	 * @see #setRate(double)
	 * @see CodePack.DataModels.DataModelsPackage#getRoomType_Rate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getRate();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.RoomType#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(double value);

	/**
	 * Returns the value of the '<em><b>Typename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typename</em>' attribute.
	 * @see #setTypename(String)
	 * @see CodePack.DataModels.DataModelsPackage#getRoomType_Typename()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTypename();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.RoomType#getTypename <em>Typename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typename</em>' attribute.
	 * @see #getTypename()
	 * @generated
	 */
	void setTypename(String value);

} // RoomType
