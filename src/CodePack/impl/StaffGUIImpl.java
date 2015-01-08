/**
 */
package CodePack.impl;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import javax.swing.DefaultListCellRenderer;
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
import javax.swing.ListCellRenderer;
import javax.swing.plaf.basic.BasicComboBoxRenderer;

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
import CodePack.DataModels.ServiceType;
import CodePack.DataModels.StaffMember;
import CodePack.DataModels.StaffRole;

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
		selected.add(new JLabel("E-mail:"));
		selected.add(username);
		selected.add(new JLabel("Password:"));
		selected.add(password);
		selected.add(login);
		
		//account = managementHandler.login(username.getText(), password.getText());
		login.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					account = managementHandler.login(username.getText(), password.getText());
					System.err.println("passed login");
					StaffRole sr = managementHandler.getRoleForStaff(account.getPers_no());
					if (sr.isCanManageBookings()) menu.addItem("Manage Bookings");
					if (sr.isCanManageRooms()) menu.addItem("Manage Rooms");
					if (sr.isCanManageServices()) menu.addItem("Manage Services");
					if (sr.isCanManageAccounts()) menu.addItem("Manage Accounts");
//					if (true) {
//						menu.addItem("Manage Bookings");
//						menu.addItem("Manage Rooms");
//						menu.addItem("Manage Services");
//						menu.addItem("Manage Accounts");
//					}
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
		frame.setSize(800,600);
		frame.add(container);
		frame.setVisible(true);
		//throw new UnsupportedOperationException();
	}
	
	private class RoomsPanel extends JPanel  {
		JButton addButton = new JButton("Add room");
		JButton updateButton = new JButton("Modify room");
		JButton removeButton = new JButton("Remove room");
		JButton addTypeButton = new JButton("Add room type");
		JButton updateTypeButton = new JButton("Modify room type");
		JButton removeTypeButton = new JButton("Remove room type");
		DefaultListModel<Room> listModel;
		DefaultListModel<RoomType> typeListModel;
		JList<RoomType> roomTypeList;
		JList<Room> roomList;
		public RoomsPanel() {			
			listModel = new DefaultListModel<>();
			typeListModel = new DefaultListModel<>();
			JScrollPane scrollPane,typeScrollPane;
			//buttons
			ActionListener listener = new buttonListener();
			removeButton.addActionListener(listener);
			addButton.addActionListener(listener);
			updateButton.addActionListener(listener);
			addTypeButton.addActionListener(listener);
			updateTypeButton.addActionListener(listener);
			removeTypeButton.addActionListener(listener);	
			JPanel room_buttons = new JPanel();
			room_buttons.add(addButton);
			room_buttons.add(updateButton);
			room_buttons.add(removeButton);			
			JPanel type_buttons = new JPanel();
			type_buttons.add(addTypeButton);
			type_buttons.add(updateTypeButton);
			type_buttons.add(removeTypeButton);	
			//Lists
			roomList = new JList<Room>(listModel);
			scrollPane = new JScrollPane(roomList);			
			roomTypeList = new JList<RoomType>(typeListModel);
			typeScrollPane = new JScrollPane(roomTypeList);
			//Layout
			this.setLayout(new GridBagLayout());
			GridBagConstraints c = new GridBagConstraints();
			c.weightx = 0;
			c.ipady = 4;
			c.gridx = 0;
			c.gridy = 0;
			this.add(room_buttons);
			c.gridy = 1;	
			this.add(scrollPane,c);
			c.gridy = 2;
			this.add(type_buttons,c);
			c.gridy = 3;
			c.anchor = GridBagConstraints.PAGE_END;
			this.add(typeScrollPane,c);
			//Layout end
			//Load lists
			loadRoomList();
			
		}
		private void loadRoomList(){
			listModel.removeAllElements();
			EList<Room>  rooms = managementHandler.getAllRooms();
			for (Room r : rooms) listModel.addElement(r);
			typeListModel.removeAllElements();
			EList<RoomType> room_types = managementHandler.getRoomTypes();
			for (RoomType rt : room_types) typeListModel.addElement(rt);
		}
		private class buttonListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(addButton)) showRoomDialog(false);
				if (e.getSource().equals(updateButton) && !roomList.isSelectionEmpty()) 
						showRoomDialog(true);
				if (e.getSource().equals(removeButton)) {
					managementHandler.removeRoom(roomList.getSelectedValue().getNumber());
				}
				if (e.getSource().equals(removeTypeButton)){
					managementHandler.removeRoomType(roomTypeList.getSelectedValue().getTypename());
				}
				if (e.getSource().equals(addTypeButton)) showTypeDialog(false);
				if (e.getSource().equals(updateTypeButton) && !roomTypeList.isSelectionEmpty())
					showTypeDialog(true);
				
				loadRoomList();
				
			}
			
		}
		private int showTypeDialog(boolean isUpdate){
			JTextField name = new JTextField();
			JTextArea description = new JTextArea();
			JTextField rate = new JTextField();
			JTextField max_guests = new JTextField();
			
			String title = "";
			if (isUpdate) {
				title = "Update room type";
				name.setText(roomTypeList.getSelectedValue().getTypename());
				description.setText(roomTypeList.getSelectedValue().getDescription());
				rate.setText(Double.toString(roomTypeList.getSelectedValue().getRate()));
				max_guests.setText(Integer.toString(roomTypeList.getSelectedValue().getMax_guests()));
				name.setEditable(false);
			}
			else title = "Add room type";
			Object[] dialog = {
					"Type name:", name,
					"Description:", description,
					"Rate:", rate,
					"Max guests:", max_guests
			};
			int option = JOptionPane.showConfirmDialog(null, dialog, title, JOptionPane.OK_CANCEL_OPTION);
			
			if (option != JOptionPane.OK_OPTION) return -1;
			
			if (name.getText().length()<1 || description.getText().length()<1 || rate.getText().length()<1 || max_guests.getText().length() <1) {
				displayMessage(this,true,"All fields need to be filled.");
				return -1;
			}
			
			RoomType roomType = DataModelsFactory.eINSTANCE.createRoomType();
			try {
				roomType.setTypename(name.getText());
				roomType.setDescription(description.getText());
				roomType.setRate(Double.parseDouble(rate.getText()));
				roomType.setMax_guests(Integer.parseInt(max_guests.getText()));
			}
			catch (Exception e){
				displayMessage(this,true,"Illegal characters in Rate or Max guests fields.");
			}
			
			if (isUpdate) {
				if (managementHandler.updateRoomType(roomType)) displayMessage(this,false,"Room type successfully updated");
				else displayMessage(this,true,"Room type update failed. Type may no longer exist.");
			}
			else {
				if (managementHandler.addRoomType(roomType.getTypename(), roomType.getDescription(), roomType.getMax_guests(), roomType.getRate()))
					displayMessage(this,false,"Room type succesfully added");
				else displayMessage(this,true,"Adding room type failed. Room type may already exist.");
			}
			
			
			return 0;
			
		}
		private int showRoomDialog(boolean isUpdate){
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
			
			if (number.getText().length()<1 || description.getText().length()<1) {
				displayMessage(this,true,"All fields need to be filled.");
				return -1;
			}
			
			if (option == JOptionPane.OK_OPTION) {
				Room room = DataModelsFactory.eINSTANCE.createRoom();
				try {				
					room.setNumber(Integer.parseInt(number.getText()));
					room.setDescription(description.getText());
					room.setIsAvailable(isAvailable.isSelected());
					room.setRoom_type(type.getSelectedItem().toString());
				}
				catch (Exception e){
					displayMessage(this, true, "Your data was invalid.\nRoom numbers can only be integers.");
					return 0;
				}
				if (isUpdate){
					if (managementHandler.updateRoom(room)) displayMessage(this,false, "Room "+room.getNumber()+" succesfully updated.");
					else displayMessage(this, true, "The requested room could not be updated. \nRoom type or room number does not exist.");
					return 0;
				}
				if (managementHandler.addRoom(room.getNumber(), room.getDescription(), room.isAvailable(), room.getRoom_type())) {
					displayMessage(this, false, "Room "+room.getNumber()+" succesfully added.");
				}
				else
				{
					displayMessage(this, true, "The requested room could not be added. \nEither the room number is already assigned or the room type does not exist.");
				}
				
			}
			return 0;
		}
	}
	private class BookingsPanel extends JPanel {
		
	}
	private class ServicesPanel extends JPanel {
		JButton addButton = new JButton("Add service type");
		JButton updateButton = new JButton("Modify service type");
		JButton removeButton = new JButton("Remove service type");
		DefaultListModel<ServiceType> listModel;
		JList<ServiceType> serviceTypeList;
		public ServicesPanel(){
			listModel = new DefaultListModel<>();
			serviceTypeList = new JList<ServiceType>(listModel);
			JScrollPane scrollPane = new JScrollPane(serviceTypeList);
			ActionListener listener = new buttonListener();
			//Buttons
			addButton.addActionListener(listener);
			updateButton.addActionListener(listener);
			removeButton.addActionListener(listener);
			JPanel buttonPanel = new JPanel();
			buttonPanel.add(addButton);
			buttonPanel.add(updateButton);
			buttonPanel.add(removeButton);
			//Layout
			this.setLayout(new GridBagLayout());
			GridBagConstraints c = new GridBagConstraints();
			c.gridx = 0;
			c.gridy = 0;
			this.add(buttonPanel,c);
			c.gridy = 1;
			this.add(scrollPane,c);
			c.gridy = 2;
			c.anchor = GridBagConstraints.PAGE_END;
			this.add(new JLabel("Warning! Trying to add an already existing service type will result in removal of the old one."),c);
			
			loadList();
			
		}
		private class buttonListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(removeButton)) managementHandler.removeServiceType(serviceTypeList.getSelectedValue());
				if (e.getSource().equals(updateButton)) showDialog(true);
				if (e.getSource().equals(addButton)) showDialog(false);				
				loadList();
			}
			
		}
		private void loadList(){
			listModel.removeAllElements();
			for (ServiceType st : managementHandler.getServiceTypes()){
				listModel.addElement(st);
			}
		}
		private int showDialog(boolean isUpdate){
			JTextField name = new JTextField();
			JTextArea description = new JTextArea();
			JTextField price = new JTextField();
			Object[] dialog = {
					"Name", name,
					"Description", description,
					"Price", price
			};
			String title = "";
			if (isUpdate) {
				title = "Modify service type";
				name.setText(serviceTypeList.getSelectedValue().getType_name());
				description.setText(serviceTypeList.getSelectedValue().getDescription());
				price.setText(Double.toString(serviceTypeList.getSelectedValue().getPrice()));
				name.setEditable(false);
			}
			else title = "Add service type";
			int option = JOptionPane.showConfirmDialog(null, dialog, title, JOptionPane.OK_CANCEL_OPTION);
			
			if (option != JOptionPane.OK_OPTION) return 0;
			if (name.getText().length() < 1 || description.getText().length()<1 || price.getText().length() < 1) {
				displayMessage(this,true,"All fields need to be filled.");
				return -1;
			}
			ServiceType service = DataModelsFactory.eINSTANCE.createServiceType();
			service.setDescription(description.getText());
			service.setType_name(name.getText());
			try {
				service.setPrice(Double.parseDouble(price.getText()));
			}catch (Exception e){
				displayMessage(this,true,"Invalid price. Input double.");
				return -1;
			}
			
			if (managementHandler.updateServiceType(service)) displayMessage(this,false,"Your update has succeeded.");
			else displayMessage(this,true,"Update has failed");
			return 0;
		}
		
	}
	private class AccountsPanel extends JPanel {
		JComboBox<StaffMember> accountsBox = new JComboBox<StaffMember>();
		JTextArea selectedText = new JTextArea();
		JComboBox<StaffRole> rolesBox = new JComboBox<StaffRole>();
		JButton addAccount = new JButton("Add");
		JButton editAccount = new JButton("Edit");
		JButton removeAccount = new JButton("Remove");
		JButton addRole = new JButton("Add");
		JButton editRole = new JButton("Edit");
		JButton removeRole = new JButton("Remove");
		public AccountsPanel(){
			loadAccounts();
			accountsBox.setRenderer(new ComboBoxRenderer());
			rolesBox.setRenderer(new ComboBoxRenderer());
			ActionListener listener = new buttonListener();
			//Listeners
			addAccount.addActionListener(listener);
			editAccount.addActionListener(listener);
			removeAccount.addActionListener(listener);
			addRole.addActionListener(listener);
			editRole.addActionListener(listener);
			removeRole.addActionListener(listener);
			//Components
			JPanel accountPanel = new JPanel();
			JPanel rolePanel = new JPanel();
			accountPanel.add(new JLabel("Account:"));
			accountPanel.add(accountsBox);
			accountPanel.add(addAccount);
			accountPanel.add(editAccount);
			accountPanel.add(removeAccount);
			rolePanel.add(new JLabel("Role:"));
			rolePanel.add(rolesBox);
			rolePanel.add(addRole);
			rolePanel.add(editRole);
			rolePanel.add(removeRole);
			//layout
			this.setLayout(new GridBagLayout());
			GridBagConstraints c = new GridBagConstraints();
			c.gridx = 0;
			c.gridy = 0;
			this.add(accountPanel,c);
			c.gridy = 1;			
			this.add(rolePanel,c);
			c.gridy = 2;
			c.anchor = GridBagConstraints.PAGE_END;
			this.add(selectedText,c);
		}
		private void loadAccounts(){
			accountsBox.removeAllItems();
			for (StaffMember sm : managementHandler.getAllStaffAccounts()) accountsBox.addItem(sm);
			rolesBox.removeAllItems();
			for (StaffRole sr : managementHandler.getStaffRoles()) rolesBox.addItem(sr);
		}
		private int showDialog(boolean isRole, boolean isUpdate){
			if (!isRole){
				JTextField name = new JTextField();
				JTextField email = new JTextField();
				JTextField password = new JTextField();
				JTextField pers_no = new JTextField();
				JTextField phone_no = new JTextField();
				JTextField role = new JTextField();
				Object[] dialog = {
						"Name", name,
						"E-mail", email,
						"Password", password,
						"Pers. No.", pers_no,
						"Phone", phone_no,
						"Role", role
				};
				String title = "";
				StaffMember sm = (StaffMember) accountsBox.getSelectedItem();
				StaffMember sm_new = DataModelsFactory.eINSTANCE.createStaffMember();
				if (isUpdate) {
						title = "Update account";
						name.setText(sm.getFull_name());
						email.setText(sm.getEmail());
						password.setText(sm.getPassword());
						pers_no.setText(sm.getPers_no());
						phone_no.setText(Integer.toString(sm.getPhone_no()));
						role.setText(sm.getRole_name());					
				}
				else {
					password.setEditable(false);
					title = "Add account";
				}
				int option = JOptionPane.showConfirmDialog(null, dialog, title, JOptionPane.OK_CANCEL_OPTION);
				if (name.getText().length()<1 || email.getText().length()<1 || pers_no.getText().length()<1 || phone_no.getText().length()<1 || role.getText().length()<1) return -1;
				if (isUpdate && password.getText().length()<1) return -1;
				if (option != JOptionPane.OK_OPTION) return -1;
				if (!isUpdate){
					System.err.println("got here");
					StaffMember result = managementHandler.registerStaffAccount(name.getText(), email.getText(), pers_no.getText(), Integer.parseInt(phone_no.getText()), role.getText());
					displayMessage(this,false,"Staff account registered.\nGenerated password is: "+result.getPassword());
					System.err.println(result);
				}
				else {
					sm_new.setFull_name(name.getText());
					sm_new.setEmail(email.getText());
					sm_new.setPassword(password.getText());
					sm_new.setPers_no(pers_no.getText());
					sm_new.setPhone_no(Integer.parseInt(phone_no.getText()));
					sm_new.setRole_name(role.getText());
					managementHandler.updateStaffAccount(sm_new);
				}
			}
			else {
				
			}
			return 0;
		}
		private class buttonListener implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(addAccount)) showDialog(false,false);
				if (e.getSource().equals(editAccount)) showDialog(false,true);
				if (e.getSource().equals(removeAccount)) managementHandler.removeStaffAccount((StaffMember)accountsBox.getSelectedItem());
				if (e.getSource().equals(addRole)) showDialog(true,false);
				if (e.getSource().equals(editRole)) showDialog(true,true);
				if (e.getSource().equals(removeRole)) managementHandler.removeStaffRole((StaffRole)rolesBox.getSelectedItem());
				loadAccounts();
			}
		}
		private class ComboBoxRenderer extends JLabel implements ListCellRenderer<Object> {
			public ComboBoxRenderer(){
				setOpaque(true);
			}
			@Override
			public Component getListCellRendererComponent(
					JList<? extends Object> list, Object value,
					int index, boolean isSelected, boolean cellHasFocus) {
				// TODO Auto-generated method stub
				if (isSelected) {
		    	    setBackground(list.getSelectionBackground());
		    	    setForeground(list.getSelectionForeground());
		    	} else {
		    	    setBackground(list.getBackground());
		    	    setForeground(list.getForeground());
		    	}
				if (value instanceof StaffMember)
					setText(((StaffMember)value).getFull_name()+"["+((StaffMember)value).getRole_name()+"]");
				else if (value instanceof StaffRole)
					setText(((StaffRole)value).getName());
				return this;				
			}
			
			
		}
		
	}
	private void displayMessage(Component c, boolean isError, String message){
		if (isError) {
			JOptionPane.showMessageDialog(c, message, "Error!", JOptionPane.ERROR_MESSAGE);
		}
		else{
			JOptionPane.showMessageDialog(c, message, "Success!", JOptionPane.INFORMATION_MESSAGE);
		}
		
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
