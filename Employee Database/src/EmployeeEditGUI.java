import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;

public class EmployeeEditGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	

	/**
	 * Launch the application.
	 */
	public static void main(Employee x, CompanyData y) {
		  System.out.println("");
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeEditGUI frame = new EmployeeEditGUI(x,y);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EmployeeEditGUI(Employee x, CompanyData y) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 456, 546);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployee = new JLabel("Employee:");
		lblEmployee.setBounds(20, 11, 61, 32);
		contentPane.add(lblEmployee);
		
		JLabel lblEmployeeName = new JLabel(x.getName());
		lblEmployeeName.setBounds(92, 14, 343, 26);
		contentPane.add(lblEmployeeName);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(20, 40, 61, 26);
		contentPane.add(lblId);
		
		JLabel lblEmployeeId = new JLabel(x.returnID()+"");
		lblEmployeeId.setBounds(81, 43, 128, 20);
		contentPane.add(lblEmployeeId);
		
		JLabel lblScheduleFor = new JLabel("Schedule for:");
		lblScheduleFor.setBounds(20, 103, 77, 40);
		contentPane.add(lblScheduleFor);
		
		JLabel lblEmployeeName1 = new JLabel(x.getName());
		lblEmployeeName1.setBounds(101, 110, 128, 27);
		contentPane.add(lblEmployeeName1);
		
		JLabel lblMonday = new JLabel("Monday:");
		lblMonday.setBounds(20, 191, 116, 32);
		contentPane.add(lblMonday);
		
		JLabel lblTuesday = new JLabel("Tuesday:");
		lblTuesday.setBounds(20, 223, 171, 50);
		contentPane.add(lblTuesday);
		
		JLabel lblWendesday = new JLabel("Wendesday:");
		lblWendesday.setBounds(20, 271, 99, 32);
		contentPane.add(lblWendesday);
		
		JLabel lblThursday = new JLabel("Thursday:");
		lblThursday.setBounds(20, 314, 116, 40);
		contentPane.add(lblThursday);
		
		JLabel lblFriday = new JLabel("Friday:");
		lblFriday.setBounds(20, 365, 99, 26);
		contentPane.add(lblFriday);
		
		JLabel lblSunday = new JLabel("Sunday:");
		lblSunday.setBounds(20, 154, 116, 26);
		contentPane.add(lblSunday);
		
		JLabel lblSaturday = new JLabel("Saturday:");
		lblSaturday.setBounds(20, 402, 126, 40);
		contentPane.add(lblSaturday);
		
		//Schedule
			JLabel lblSundaySchedule = new JLabel(x.returnSchedule(0));
			lblSundaySchedule.setBounds(92, 154, 223, 26);
			contentPane.add(lblSundaySchedule);
			
			JLabel lblMondaySchedule = new JLabel(x.returnSchedule(1));
			lblMondaySchedule.setBounds(95, 194, 223, 26);
			contentPane.add(lblMondaySchedule);
			
			JLabel lblTuesdaySchedule = new JLabel(x.returnSchedule(2));
			lblTuesdaySchedule.setBounds(95, 235, 223, 26);
			contentPane.add(lblTuesdaySchedule);
			
			JLabel lblWednesdaySchedule = new JLabel(x.returnSchedule(3));
			lblWednesdaySchedule.setBounds(95, 274, 223, 26);
			contentPane.add(lblWednesdaySchedule);
			
			JLabel lblThursdaySchedule = new JLabel(x.returnSchedule(4));
			lblThursdaySchedule.setBounds(92, 321, 223, 26);
			contentPane.add(lblThursdaySchedule);
			
			JLabel lblFridaySchedule = new JLabel(x.returnSchedule(5));
			lblFridaySchedule.setBounds(95, 365, 223, 26);
			contentPane.add(lblFridaySchedule);
			
			JLabel lblSaturdaySchedule = new JLabel(x.returnSchedule(6));
			lblSaturdaySchedule.setBounds(95, 409, 223, 26);
			contentPane.add(lblSaturdaySchedule);
		
		JLabel lblOccupation = new JLabel("Occupation:");
		lblOccupation.setBounds(20, 66, 109, 26);
		contentPane.add(lblOccupation);
		
		JLabel lblEmployeeoccupation = new JLabel(x.returnOccupation());
		lblEmployeeoccupation.setBounds(91, 69, 158, 20);
		contentPane.add(lblEmployeeoccupation);
		
		//edit text field
		
		textField = new JTextField();
		textField.setBounds(225, 274, 205, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		//day buttons
		
		JRadioButton rdbtnSunday = new JRadioButton("Sunday");
		rdbtnSunday.setBounds(286, 80, 109, 23);
		contentPane.add(rdbtnSunday);
		
		JRadioButton rdbtnMonday = new JRadioButton("Monday");
		rdbtnMonday.setBounds(286, 106, 109, 23);
		contentPane.add(rdbtnMonday);
		
		JRadioButton rdbtnTuesday = new JRadioButton("Tuesday");
		rdbtnTuesday.setBounds(286, 132, 109, 23);
		contentPane.add(rdbtnTuesday);
		
		JRadioButton rdbtnWednesday = new JRadioButton("Wednesday");
		rdbtnWednesday.setBounds(286, 159, 109, 23);
		contentPane.add(rdbtnWednesday);
		
		JRadioButton rdbtnThursday = new JRadioButton("Thursday");
		rdbtnThursday.setBounds(286, 185, 109, 23);
		contentPane.add(rdbtnThursday);
		
		JRadioButton rdbtnFriday = new JRadioButton("Friday");
		rdbtnFriday.setBounds(286, 211, 109, 23);
		contentPane.add(rdbtnFriday);
		
		JRadioButton rdbtnSaturday = new JRadioButton("Saturday");
		rdbtnSaturday.setBounds(286, 237, 109, 23);
		contentPane.add(rdbtnSaturday);
		
		JLabel lblScheduleEditor = new JLabel("Schedule Editor:");
		lblScheduleEditor.setBounds(225, 66, 128, 14);
		contentPane.add(lblScheduleEditor);
		
	//schedule change button
		JButton btnChange = new JButton("Change");
		btnChange.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent arg0) {
				
				if(rdbtnSunday.isSelected()) {
					x.editSchedule(0, textField.getText());
				}
				
				if(rdbtnMonday.isSelected()) {
					x.editSchedule(1, textField.getText());
					x.editSchedule(0, textField.getText());
				}

				if(rdbtnTuesday.isSelected()) {
					x.editSchedule(2, textField.getText());
					x.editSchedule(0, textField.getText());
				}

				if(rdbtnWednesday.isSelected()) {
					x.editSchedule(3, textField.getText());
					x.editSchedule(0, textField.getText());
				}

				if(rdbtnThursday.isSelected()) {
					x.editSchedule(4, textField.getText());
					x.editSchedule(0, textField.getText());
				}

				if(rdbtnFriday.isSelected()) {
					x.editSchedule(5, textField.getText());
					x.editSchedule(0, textField.getText());
				}
				
				if(rdbtnSaturday.isSelected()) {
					x.editSchedule(6, textField.getText());
					x.editSchedule(0, textField.getText());
				}
				
				EmployeeEditGUI better = new EmployeeEditGUI(x,y);
				better.revalidate();
				better.setVisible(true);
				dispose();
				y.serialize();
				
			}
		});
		btnChange.setBounds(287, 314, 89, 23);
		contentPane.add(btnChange);
		
	}
}
