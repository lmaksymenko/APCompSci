import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class LoginGUI extends JFrame {

	
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		System.out.println("LoginGUI main started running./n");
		
		//sum demo stuff
		CompanyData comp1 = new CompanyData();
		comp1.addManager("Bob", 4444, "user", "pass");
		comp1.addManager("Fill", 4434, "user1", "pass1");
		comp1.addManager("Leo", 4446, "user2", "pass2");
		
		comp1.addEmployee("Mike", 2222, "janitor", "user3", "pass3");
		comp1.addEmployee("Noah", 2222, "Chashier", "user4", "pass4");
		comp1.addEmployee("Bren", 2222, "Guard", "user5", "pass5");
	
		comp1.serialize();
		comp1.deserialize();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI frame = new LoginGUI(comp1);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		System.out.println("LoginGUI main finished running./n");
	}

	
		
	/**
	 * Create the frame.
	 */
	public LoginGUI(CompanyData comp) {
		System.out.println("LoginGUI started running./n");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 
		JButton btnEnter = new JButton("Enter");
		btnEnter.setBounds(10, 227, 89, 23);
		contentPane.add(btnEnter);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(335, 227, 89, 23);
		contentPane.add(btnClear);
		
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(139, 140, 245, 33);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(139, 76, 245, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(21, 76, 78, 33);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(24, 140, 75, 33);
		contentPane.add(lblPassword);
		
		JLabel lblEmployeeManagment = new JLabel("Employee Manager 5000");
		lblEmployeeManagment.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblEmployeeManagment.setBounds(95, 11, 259, 33);
		contentPane.add(lblEmployeeManagment);
		
		JLabel error = new JLabel("");
		error.setBounds(139, 184, 245, 14);
		contentPane.add(error);
		
		//check box
		JCheckBox chckbxmanagerLoginCheck = new JCheckBox("Check for manager login.");
		chckbxmanagerLoginCheck.setBackground(Color.LIGHT_GRAY);
		chckbxmanagerLoginCheck.setBounds(149, 227, 145, 23);
		contentPane.add(chckbxmanagerLoginCheck);
		
		//loggin system
		btnEnter.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent arg0) {
			
				if(chckbxmanagerLoginCheck.isSelected()) {//chooses login list
					System.out.println("Manager box selected. Running login for manager.");
					
					for(Manager i : comp.getManLog()) {
						if(textField.getText().compareTo(i.getUsername()) == 0     &&        passwordField.getText().compareTo(i.getPassword()) == 0) {
							
							JOptionPane.showMessageDialog(null, "Login Sucessfull");
							
							ManagerGUI.main(i,comp);
							System.out.println("Logged in as manager.");
							dispose();
					}
				}
					error.setText("Invalid Username or Password.");
					
				}else {
					System.out.println("Running login for employee.");
					for(Employee g : comp.getEmpLog()) {
						if(textField.getText().compareTo(g.getUsername()) == 0     &&        passwordField.getText().compareTo(g.getPassword()) == 0) {
							
							JOptionPane.showMessageDialog(null, "Login Sucessfull");
							
							EmployeeGUI.main(g);
							System.out.println("Logged in as employee.");
							dispose();
						}
						
					}
					error.setText("Invalid Username or Password./n");
					
				}
				
			}
		});
		
		btnClear.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent arg0) {
				textField.setText(null);
				passwordField.setText(null);
				System.out.println("Text fields cleared.");
				
			}
		});
		
	}
}
