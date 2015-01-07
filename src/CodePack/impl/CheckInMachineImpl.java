/**
 */
package CodePack.impl;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import CodePack.CheckInMachine;
import CodePack.CodePackPackage;
import CodePack.Backend.BackendFactory;
import CodePack.Backend.CheckInHandler;
import CodePack.DataModels.Booking;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check In Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CodePack.impl.CheckInMachineImpl#getCheckInHandler <em>Check In Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CheckInMachineImpl extends MinimalEObjectImpl.Container implements CheckInMachine {
	/**
	 * The cached value of the '{@link #getCheckInHandler() <em>Check In Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckInHandler()
	 * @generated
	 * @ordered
	 */
	protected CheckInHandler checkInHandler;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckInMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodePackPackage.Literals.CHECK_IN_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckInHandler getCheckInHandler() {
		if (checkInHandler != null && checkInHandler.eIsProxy()) {
			InternalEObject oldCheckInHandler = (InternalEObject)checkInHandler;
			checkInHandler = (CheckInHandler)eResolveProxy(oldCheckInHandler);
			if (checkInHandler != oldCheckInHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackPackage.CHECK_IN_MACHINE__CHECK_IN_HANDLER, oldCheckInHandler, checkInHandler));
			}
		}
		return checkInHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckInHandler basicGetCheckInHandler() {
		return checkInHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckInHandler(CheckInHandler newCheckInHandler) {
		CheckInHandler oldCheckInHandler = checkInHandler;
		checkInHandler = newCheckInHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackPackage.CHECK_IN_MACHINE__CHECK_IN_HANDLER, oldCheckInHandler, checkInHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void startUI() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		CheckInHandler handler = BackendFactory.eINSTANCE.createCheckInHandler();
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		JTextField text = new JTextField();	
		JTextField name = new JTextField();	
		JButton checkin = new JButton("Check in");
		JTextArea results = new JTextArea();
		
		name.setColumns(10);
		text.setColumns(10);
		results.setEditable(false);
		results.setLineWrap(true);
		results.setWrapStyleWord(true);
		results.setSize(200, 200);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setTitle("Checkin Machine");
		
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		checkin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int booking_id = 0;
				try {
				booking_id = Integer.parseInt(text.getText());
				}
				catch (Exception ex){
					results.setText("Booking id is not valid");
				}
				if (!handler.validateBooking(booking_id)) results.setText("Booking id is not valid");
				else {
					Booking b = handler.assignGuestToBooking(booking_id, name.getText());
					results.setText("Booking succesfully checked in: \n" + b.toString());
				}
					
			}
		});
		
		
		
		//c.weightx = 0.5;
		c.weighty = 0.5;
		
		c.gridx = 0;
	    c.gridy = 0;	    
	    panel.add(new JLabel("Booking id"),c);
	    c.gridx = 1;
		panel.add(text,c);
		
		c.gridx = 0;
		c.gridy = 1;
		panel.add(new JLabel("Guest name"),c);
		c.gridx = 1;
		panel.add(name,c);
		
		c.gridx = 0;
		c.gridy = 2;
		
		c.gridwidth = 2;
		panel.add(checkin,c);
		c.gridy = 3;
		c.anchor = GridBagConstraints.PAGE_END;
		panel.add(results,c);
		
		frame.add(panel);
		frame.setVisible(true);
		
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackPackage.CHECK_IN_MACHINE__CHECK_IN_HANDLER:
				if (resolve) return getCheckInHandler();
				return basicGetCheckInHandler();
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
			case CodePackPackage.CHECK_IN_MACHINE__CHECK_IN_HANDLER:
				setCheckInHandler((CheckInHandler)newValue);
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
			case CodePackPackage.CHECK_IN_MACHINE__CHECK_IN_HANDLER:
				setCheckInHandler((CheckInHandler)null);
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
			case CodePackPackage.CHECK_IN_MACHINE__CHECK_IN_HANDLER:
				return checkInHandler != null;
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
			case CodePackPackage.CHECK_IN_MACHINE___START_UI:
				startUI();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //CheckInMachineImpl
