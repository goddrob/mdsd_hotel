/**
 */
package CodePack.impl;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import CodePack.CodePackPackage;
import CodePack.StaffGUI;
import CodePack.Backend.BackendFactory;
import CodePack.Backend.ManagementHandler;
import CodePack.Backend.ReceptionHandler;
import CodePack.DataModels.DataModelsFactory;
import CodePack.DataModels.Room;
import CodePack.DataModels.RoomType;
import CodePack.DataModels.StaffMember;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staff GUI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CodePack.impl.StaffGUIImpl#getManagementHandler <em>Management Handler</em>}</li>
 *   <li>{@link CodePack.impl.StaffGUIImpl#getReceptionHandler <em>Reception Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StaffGUIImpl extends MinimalEObjectImpl.Container implements StaffGUI {
	/**
	 * Custom Globals
	 */
	JPanel panel_rooms, panel_services, panel_bookings, panel_accounts;
	StaffMember account;
	
	/**
	 * The cached value of the '{@link #getManagementHandler() <em>Management Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagementHandler()
	 * @generated
	 * @ordered
	 */
	protected ManagementHandler managementHandler;

	/**
	 * The cached value of the '{@link #getReceptionHandler() <em>Reception Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceptionHandler()
	 * @generated
	 * @ordered
	 */
	protected ReceptionHandler receptionHandler;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffGUIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodePackPackage.Literals.STAFF_GUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementHandler getManagementHandler() {
		if (managementHandler != null && managementHandler.eIsProxy()) {
			InternalEObject oldManagementHandler = (InternalEObject)managementHandler;
			managementHandler = (ManagementHandler)eResolveProxy(oldManagementHandler);
			if (managementHandler != oldManagementHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackPackage.STAFF_GUI__MANAGEMENT_HANDLER, oldManagementHandler, managementHandler));
			}
		}
		return managementHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementHandler basicGetManagementHandler() {
		return managementHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagementHandler(ManagementHandler newManagementHandler) {
		ManagementHandler oldManagementHandler = managementHandler;
		managementHandler = newManagementHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackPackage.STAFF_GUI__MANAGEMENT_HANDLER, oldManagementHandler, managementHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceptionHandler getReceptionHandler() {
		if (receptionHandler != null && receptionHandler.eIsProxy()) {
			InternalEObject oldReceptionHandler = (InternalEObject)receptionHandler;
			receptionHandler = (ReceptionHandler)eResolveProxy(oldReceptionHandler);
			if (receptionHandler != oldReceptionHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackPackage.STAFF_GUI__RECEPTION_HANDLER, oldReceptionHandler, receptionHandler));
			}
		}
		return receptionHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceptionHandler basicGetReceptionHandler() {
		return receptionHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceptionHandler(ReceptionHandler newReceptionHandler) {
		ReceptionHandler oldReceptionHandler = receptionHandler;
		receptionHandler = newReceptionHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackPackage.STAFF_GUI__RECEPTION_HANDLER, oldReceptionHandler, receptionHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void startUI() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//StaffMember account = DataModelsFactory.eINSTANCE.createStaffMember();
		boolean isLoggedIn = false;
		this.managementHandler = BackendFactory.eINSTANCE.createManagementHandler();
		this.receptionHandler = BackendFactory.eINSTANCE.createReceptionHandler();
//		this.panel_accounts = createAccountsPanel();
//		this.panel_bookings = createBookingsPanel();
//		this.panel_rooms  = createRoomsPanel();
//		this.panel_services = createServicesPanel();
		JFrame frame = new JFrame("Staff UI");
		JPanel container = new JPanel();
		JPanel sidebar = new JPanel();
		JPanel selected = new JPanel();
		JComboBox<String> menu = new JComboBox<String>();
		sidebar.add(menu);
		

		container.add(sidebar);
		container.add(selected);
		
		
		
		
		
		JTextField username = new JTextField();
		JTextField password = new JPasswordField();
		
		username.setColumns(10);
		password.setColumns(10);
		
		JButton login = new JButton("Login");
		selected.add(new JLabel("Personal number:"));
		selected.add(username);
		selected.add(new JLabel("Password"));
		selected.add(password);
		selected.add(login);
		
		//account = managementHandler.login(username.getText(), password.getText());
		login.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
//					account = managementHandler.login(username.getText(), password.getText());
//					StaffRole sr = managementHandler.getRoleForStaff(account.getPers_no());
//					if (sr.isCanManageBookings()) menu.addItem("Manage Bookings");
//					if (sr.isCanManageRooms()) menu.addItem("Manage Rooms");
//					if (sr.isCanManageServices()) menu.addItem("Manage Services");
//					if (sr.isCanManageAccounts()) menu.addItem("Manage Accounts");
					if (true) {
						menu.addItem("Manage Bookings");
						menu.addItem("Manage Rooms");
						menu.addItem("Manage Services");
						menu.addItem("Manage Accounts");
					}
					selected.removeAll();
					selected.revalidate();
				}catch(Exception e){
					JOptionPane.showMessageDialog(frame, "Login failed","Error",JOptionPane.ERROR_MESSAGE);
				}
				
			}
		} );
		
		menu.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(menu.getSelectedItem());
				String option = menu.getSelectedItem().toString();
				selected.removeAll();
				selected.revalidate();
				if (option.equals("Manage Bookings")) selected.add(new BookingsPanel());
				if (option.equals("Manage Rooms")) selected.add(new RoomsPanel());
				if (option.equals("Manage Services")) selected.add(new ServicesPanel());
				if (option.equals("Manage Accounts")) selected.add(new AccountsPanel());
				
			}
			
		} );
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(500,500);
		frame.add(container);
		frame.setVisible(true);
		//throw new UnsupportedOperationException();
	}
	
	private class RoomsPanel extends JPanel  {
		JButton addButton = new JButton("Add room");
		JButton updateButton = new JButton("Modify room");
		JButton removeButton = new JButton("Remove room");
		DefaultListModel<Room> listModel;
		JList<Room> roomList;
		public RoomsPanel() {			
			listModel = new DefaultListModel<>();			
			JScrollPane scrollPane;
			ActionListener listener = new buttonListener();
			removeButton.addActionListener(listener);
			addButton.addActionListener(listener);
			updateButton.addActionListener(listener);
			
			this.setLayout(new GridBagLayout());
			GridBagConstraints c = new GridBagConstraints();
			
			JPanel buttons = new JPanel();
			buttons.add(addButton);
			buttons.add(updateButton);
			buttons.add(removeButton);
			c.weightx = 0;
			c.ipady = 4;
			c.gridx = 0;
			c.gridy = 0;
			this.add(buttons);
			c.gridx = 0;
			c.gridy = 1;
			c.anchor = GridBagConstraints.PAGE_END;
			
			roomList = new JList<Room>(listModel);
			scrollPane = new JScrollPane(roomList);
			
			this.add(scrollPane,c);
			
			loadRoomList();
			
		}
		private void loadRoomList(){
			listModel.removeAllElements();
			EList<Room>  rooms = managementHandler.getAllRooms();
			for (Room r : rooms) listModel.addElement(r);
		}
		private class buttonListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(addButton)) showDialog(false);
				if (e.getSource().equals(updateButton)) showDialog(true);
				if (e.getSource().equals(removeButton)) {
					managementHandler.removeRoom(roomList.getSelectedValue().getNumber());
				}
				loadRoomList();
				
			}
			
		}
		private int showDialog(boolean isUpdate){
			JTextField number = new JTextField();
			JTextArea description = new JTextArea();
			JCheckBox isAvailable = new JCheckBox();
			JComboBox<String> type = new JComboBox<String>();
			
			for (RoomType rt : managementHandler.getRoomTypes()) type.addItem(rt.getTypename());
			String title = "";
			if (isUpdate) {
				title = "Update room";
				number.setText(Integer.toString(roomList.getSelectedValue().getNumber()));
				number.setEditable(false);
				description.setText(roomList.getSelectedValue().getDescription());
				isAvailable.setSelected(roomList.getSelectedValue().isAvailable());
				type.setSelectedItem(roomList.getSelectedValue().getRoom_type());
			}
			else title = "Add room";
			
			Object[] dialog = {
					"Room number", number,
					"Description", description,
					"Available", isAvailable,
					"Room Type", type
			};
			
			int option = JOptionPane.showConfirmDialog(null, dialog, title, JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				Room room = DataModelsFactory.eINSTANCE.createRoom();
				try {				
					room.setNumber(Integer.parseInt(number.getText()));
					room.setDescription(description.getText());
					room.setIsAvailable(isAvailable.isSelected());
					room.setRoom_type(type.getSelectedItem().toString());
				}
				catch (Exception e){
					JOptionPane.showMessageDialog(this, "Your data was invalid.\nRoom numbers can only be integers.", "Error", JOptionPane.ERROR_MESSAGE);
					return 0;
				}
				if (isUpdate){
					if (managementHandler.updateRoom(room)) JOptionPane.showMessageDialog(this, "Room "+room.getNumber()+" succesfully updated.", "Success!", JOptionPane.INFORMATION_MESSAGE);
					else JOptionPane.showMessageDialog(this, "The requested room could not be updated. \nRoom type or room number does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
					return 0;
				}
				if (managementHandler.addRoom(room.getNumber(), room.getDescription(), room.isAvailable(), room.getRoom_type())) {
					JOptionPane.showMessageDialog(this, "Room "+room.getNumber()+" succesfully added.", "Success!", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(this, "The requested room could not be added. \nEither the room number is already assigned or the room type does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
			}
			return 0;
		}
	}
	private class BookingsPanel extends JPanel {
		
	}
	private class ServicesPanel extends JPanel {
		
	}
	private class AccountsPanel extends JPanel {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackPackage.STAFF_GUI__MANAGEMENT_HANDLER:
				if (resolve) return getManagementHandler();
				return basicGetManagementHandler();
			case CodePackPackage.STAFF_GUI__RECEPTION_HANDLER:
				if (resolve) return getReceptionHandler();
				return basicGetReceptionHandler();
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
			case CodePackPackage.STAFF_GUI__MANAGEMENT_HANDLER:
				setManagementHandler((ManagementHandler)newValue);
				return;
			case CodePackPackage.STAFF_GUI__RECEPTION_HANDLER:
				setReceptionHandler((ReceptionHandler)newValue);
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
			case CodePackPackage.STAFF_GUI__MANAGEMENT_HANDLER:
				setManagementHandler((ManagementHandler)null);
				return;
			case CodePackPackage.STAFF_GUI__RECEPTION_HANDLER:
				setReceptionHandler((ReceptionHandler)null);
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
			case CodePackPackage.STAFF_GUI__MANAGEMENT_HANDLER:
				return managementHandler != null;
			case CodePackPackage.STAFF_GUI__RECEPTION_HANDLER:
				return receptionHandler != null;
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
			case CodePackPackage.STAFF_GUI___START_UI:
				startUI();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //StaffGUIImpl
