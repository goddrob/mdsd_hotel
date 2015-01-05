/**
 */
package CodePack.DataModels;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CodePack.DataModels.ServiceType#getDescription <em>Description</em>}</li>
 *   <li>{@link CodePack.DataModels.ServiceType#getType_name <em>Type name</em>}</li>
 *   <li>{@link CodePack.DataModels.ServiceType#getPrice <em>Price</em>}</li>
 * </ul>
 * </p>
 *
 * @see CodePack.DataModels.DataModelsPackage#getServiceType()
 * @model
 * @generated
 */
public interface ServiceType extends EObject {
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
	 * @see CodePack.DataModels.DataModelsPackage#getServiceType_Description()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.ServiceType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Type name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type name</em>' attribute.
	 * @see #setType_name(String)
	 * @see CodePack.DataModels.DataModelsPackage#getServiceType_Type_name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getType_name();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.ServiceType#getType_name <em>Type name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type name</em>' attribute.
	 * @see #getType_name()
	 * @generated
	 */
	void setType_name(String value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(double)
	 * @see CodePack.DataModels.DataModelsPackage#getServiceType_Price()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getPrice();

	/**
	 * Sets the value of the '{@link CodePack.DataModels.ServiceType#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(double value);

} // ServiceType
