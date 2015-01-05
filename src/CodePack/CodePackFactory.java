/**
 */
package CodePack;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CodePack.CodePackPackage
 * @generated
 */
public interface CodePackFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodePackFactory eINSTANCE = CodePack.impl.CodePackFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Staff GUI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Staff GUI</em>'.
	 * @generated
	 */
	StaffGUI createStaffGUI();

	/**
	 * Returns a new object of class '<em>User GUI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User GUI</em>'.
	 * @generated
	 */
	UserGUI createUserGUI();

	/**
	 * Returns a new object of class '<em>Check In Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check In Machine</em>'.
	 * @generated
	 */
	CheckInMachine createCheckInMachine();

	/**
	 * Returns a new object of class '<em>Data Bank</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Bank</em>'.
	 * @generated
	 */
	DataBank createDataBank();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CodePackPackage getCodePackPackage();

} //CodePackFactory
