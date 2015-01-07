/**
 */
package CodePack.impl;

import CodePack.Backend.CustomerHandler;

import CodePack.CodePackPackage;
import CodePack.UserGUI;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User GUI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CodePack.impl.UserGUIImpl#getCustomerHandler <em>Customer Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserGUIImpl extends MinimalEObjectImpl.Container implements UserGUI {
	/**
	 * The cached value of the '{@link #getCustomerHandler() <em>Customer Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerHandler()
	 * @generated
	 * @ordered
	 */
	protected CustomerHandler customerHandler;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserGUIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodePackPackage.Literals.USER_GUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerHandler getCustomerHandler() {
		if (customerHandler != null && customerHandler.eIsProxy()) {
			InternalEObject oldCustomerHandler = (InternalEObject)customerHandler;
			customerHandler = (CustomerHandler)eResolveProxy(oldCustomerHandler);
			if (customerHandler != oldCustomerHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackPackage.USER_GUI__CUSTOMER_HANDLER, oldCustomerHandler, customerHandler));
			}
		}
		return customerHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerHandler basicGetCustomerHandler() {
		return customerHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerHandler(CustomerHandler newCustomerHandler) {
		CustomerHandler oldCustomerHandler = customerHandler;
		customerHandler = newCustomerHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackPackage.USER_GUI__CUSTOMER_HANDLER, oldCustomerHandler, customerHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void startUI() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackPackage.USER_GUI__CUSTOMER_HANDLER:
				if (resolve) return getCustomerHandler();
				return basicGetCustomerHandler();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CodePackPackage.USER_GUI__CUSTOMER_HANDLER:
				setCustomerHandler((CustomerHandler)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CodePackPackage.USER_GUI__CUSTOMER_HANDLER:
				setCustomerHandler((CustomerHandler)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CodePackPackage.USER_GUI__CUSTOMER_HANDLER:
				return customerHandler != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CodePackPackage.USER_GUI___START_UI:
				startUI();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //UserGUIImpl
