/**
 */
package CodePack.Backend;

import BankingModel.BankComponent;

import CodePack.IReceptionOperations_rename_required;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reception Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CodePack.Backend.ReceptionHandler#getBankComponent <em>Bank Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see CodePack.Backend.BackendPackage#getReceptionHandler()
 * @model
 * @generated
 */
public interface ReceptionHandler extends IReceptionOperations_rename_required {
	/**
	 * Returns the value of the '<em><b>Bank Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bank Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank Component</em>' reference.
	 * @see #setBankComponent(BankComponent)
	 * @see CodePack.Backend.BackendPackage#getReceptionHandler_BankComponent()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BankComponent getBankComponent();

	/**
	 * Sets the value of the '{@link CodePack.Backend.ReceptionHandler#getBankComponent <em>Bank Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bank Component</em>' reference.
	 * @see #getBankComponent()
	 * @generated
	 */
	void setBankComponent(BankComponent value);

} // ReceptionHandler
