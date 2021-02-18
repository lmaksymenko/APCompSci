import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class ManagerGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(Manager x, CompanyData y) {
		System.out.println("ManagerGUI main started running.");
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerGUI frame = new ManagerGUI(x,y);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		System.out.println("ManagerGUI main finished running.");
	}

	/**
	 * Create the frame.
	 */
	public ManagerGUI(Manager x, CompanyData y) {
		System.out.println("ManagerGUI started running.");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblManager = new JLabel("Manager:");
		lblManager.setBounds(20, 11, 77, 32);
		contentPane.add(lblManager);
		
		JLabel lblManagerName = new JLabel(x.getName());
		lblManagerName.setBounds(107, 14, 343, 26);
		contentPane.add(lblManagerName);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(20, 40, 61, 26);
		contentPane.add(lblId);
		
		JLabel lblManagerId = new JLabel(x.returnID()+"");
		lblManagerId.setBounds(107, 43, 128, 20);
		contentPane.add(lblManagerId);
		
		JLabel lblScheduleFor = new JLabel("Schedule for:");
		lblScheduleFor.setBounds(20, 77, 83, 40);
		contentPane.add(lblScheduleFor);
		
		JLabel lblMangerName = new JLabel(x.getName());
		lblMangerName.setBounds(107, 84, 206, 27);
		contentPane.add(lblMangerName);
		
		JLabel lblMonday = new JLabel("Monday:");
		lblMonday.setBounds(20, 162, 116, 32);
		contentPane.add(lblMonday);
		
		JLabel lblTuesday = new JLabel("Tuesday:");
		lblTuesday.setBounds(20, 194, 171, 50);
		contentPane.add(lblTuesday);
		
		JLabel lblWendesday = new JLabel("Wendesday:");
		lblWendesday.setBounds(20, 242, 99, 32);
		contentPane.add(lblWendesday);
		
		JLabel lblThursday = new JLabel("Thursday:");
		lblThursday.setBounds(20, 285, 116, 40);
		contentPane.add(lblThursday);
		
		JLabel lblFriday = new JLabel("Friday:");
		lblFriday.setBounds(20, 336, 99, 26);
		contentPane.add(lblFriday);
		
		JLabel lblSunday = new JLabel("Sunday:");
		lblSunday.setBounds(20, 125, 116, 26);
		contentPane.add(lblSunday);
		
		JLabel lblSaturday = new JLabel("Saturday:");
		lblSaturday.setBounds(20, 373, 126, 40);
		contentPane.add(lblSaturday);
		
		//schedule
		
				JLabel lblSundaySchedule = new JLabel(x.returnSchedule(0));
				lblSundaySchedule.setBounds(107, 125, 223, 26);
				contentPane.add(lblSundaySchedule);
				
				JLabel lblMondaySchedule = new JLabel(x.returnSchedule(1));
				lblMondaySchedule.setBounds(107, 165, 223, 26);
				contentPane.add(lblMondaySchedule);
				
				JLabel lblTuesdaySchedule = new JLabel(x.returnSchedule(2));
				lblTuesdaySchedule.setBounds(107, 206, 223, 26);
				contentPane.add(lblTuesdaySchedule);
				
				JLabel lblWednesdaySchedule = new JLabel(x.returnSchedule(3));
				lblWednesdaySchedule.setBounds(107, 245, 223, 26);
				contentPane.add(lblWednesdaySchedule);
				
				JLabel lblThursdaySchedule = new JLabel(x.returnSchedule(4));
				lblThursdaySchedule.setBounds(107, 292, 223, 26);
				contentPane.add(lblThursdaySchedule);
				
				JLabel lblFridaySchedule = new JLabel(x.returnSchedule(5));
				lblFridaySchedule.setBounds(107, 336, 223, 26);
				contentPane.add(lblFridaySchedule);
				
				JLabel lblSaturdaySchedule = new JLabel(x.returnSchedule(6));
				lblSaturdaySchedule.setBounds(107, 380, 223, 26);
				contentPane.add(lblSaturdaySchedule);
		
				
		//Buttons
		
			JButton btnEmployee_0 = new JButton(y.getEmpLog().get(0).getName());
			btnEmployee_0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					EmployeeEditGUI.main(y.getEmpLog().get(0),y);
				}
			});
			btnEmployee_0.setBounds(348, 81, 169, 23);
			contentPane.add(btnEmployee_0);
			
			JButton btnEmployee_1 = new JButton(y.getEmpLog().get(1).getName());
			btnEmployee_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					EmployeeEditGUI.main(y.getEmpLog().get(1),y);
				}
			});
			
			btnEmployee_1.setBounds(348, 115, 169, 23);
			contentPane.add(btnEmployee_1);
			
			JButton btnEmployee_2 = new JButton(y.getEmpLog().get(2).getName());
			btnEmployee_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					EmployeeEditGUI.main(y.getEmpLog().get(2),y);
				}
			});
			
			btnEmployee_2.setBounds(348, 150, 169, 23);
			contentPane.add(btnEmployee_2);
			
//			JButton btnEmployee_3 = new JButton(CompanyData.getEmpLog().get(3).getName());
//			btnEmployee_3.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent e) {
//				}
//			});
//			
//			btnEmployee_3.setBounds(348, 184, 169, 23);
//			contentPane.add(btnEmployee_3);
//			
//			JButton btnEmployee_4 = new JButton(CompanyData.getEmpLog().get(4).getName());
//			btnEmployee_4.setBounds(348, 218, 169, 23);
//			contentPane.add(btnEmployee_4);
//			
//			JButton btnEmployee_5 = new JButton(CompanyData.getEmpLog().get(5).getName());
//			btnEmployee_5.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent e) {
//				}
//			});
//			
//			btnEmployee_5.setBounds(348, 251, 169, 23);
//			contentPane.add(btnEmployee_5);
//			
//			JButton btnEmployee_6 = new JButton(CompanyData.getEmpLog().get(6).getName());
//			btnEmployee_6.setBounds(348, 285, 169, 23);
//			contentPane.add(btnEmployee_6);
//			
//			
//			JButton btnEmployee_7 = new JButton(CompanyData.getEmpLog().get(7).getName());
//			btnEmployee_7.setBounds(348, 319, 169, 23);
//			contentPane.add(btnEmployee_7);
//			
//			
//			JButton btnEmployee_8 = new JButton(CompanyData.getEmpLog().get(8).getName());
//			btnEmployee_8.setBounds(348, 353, 169, 23);
//			contentPane.add(btnEmployee_8);
//			
//			
//			JButton btnEmployee_9 = new JButton(CompanyData.getEmpLog().get(9).getName());
//			btnEmployee_9.setBounds(348, 387, 169, 23);
//			contentPane.add(btnEmployee_9);
		
		
	}
}
