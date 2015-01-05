/**
 */
package CodePack;

import CodePack.Backend.CustomerHandler;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User GUI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CodePack.UserGUI#getCustomerHandler <em>Customer Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see CodePack.CodePackPackage#getUserGUI()
 * @model
 * @generated
 */
public interface UserGUI extends EObject {
	/**
	 * Returns the value of the '<em><b>Customer Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Handler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Handler</em>' reference.
	 * @see #setCustomerHandler(CustomerHandler)
	 * @see CodePack.CodePackPackage#getUserGUI_CustomerHandler()
	 * @model ordered="false"
	 * @generated
	 */
	CustomerHandler getCustomerHandler();

	/**
	 * Sets the value of the '{@link CodePack.UserGUI#getCustomerHandler <em>Customer Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Handler</em>' reference.
	 * @see #getCustomerHandler()
	 * @generated
	 */
	void setCustomerHandler(CustomerHandler value);

} // UserGUI
