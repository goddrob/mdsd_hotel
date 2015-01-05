/**
 */
package CodePack.Backend;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CodePack.Backend.BackendPackage
 * @generated
 */
public interface BackendFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BackendFactory eINSTANCE = CodePack.Backend.impl.BackendFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Customer Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Handler</em>'.
	 * @generated
	 */
	CustomerHandler createCustomerHandler();

	/**
	 * Returns a new object of class '<em>Reception Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reception Handler</em>'.
	 * @generated
	 */
	ReceptionHandler createReceptionHandler();

	/**
	 * Returns a new object of class '<em>Check In Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check In Handler</em>'.
	 * @generated
	 */
	CheckInHandler createCheckInHandler();

	/**
	 * Returns a new object of class '<em>Management Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Management Handler</em>'.
	 * @generated
	 */
	ManagementHandler createManagementHandler();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BackendPackage getBackendPackage();

} //BackendFactory
