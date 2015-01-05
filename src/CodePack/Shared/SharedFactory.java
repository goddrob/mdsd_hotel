/**
 */
package CodePack.Shared;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CodePack.Shared.SharedPackage
 * @generated
 */
public interface SharedFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SharedFactory eINSTANCE = CodePack.Shared.impl.SharedFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Contact Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Data</em>'.
	 * @generated
	 */
	ContactData createContactData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SharedPackage getSharedPackage();

} //SharedFactory
