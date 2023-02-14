package turtleCenter;
import Connessione.Connessione;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.sql.Array;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;

public class LoginView extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel label_qualifica;
	private JComboBox comboBoxPersonale;
	private JPanel panel_2;
	private JPanel panel_3;
	private JLabel label_userName;
	private JTextField name_in;
	private JPanel panel_4;
	private JLabel label_password;
	private JPasswordField password_in;
	private JPanel panel_5;
	private JLabel label_email;
	private JTextField email_in;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JPanel panel_6;
	private JLabel label_accedi;
	private JSeparator separator;
	private JLabel lblNewLabel;
	private JPanel panel_7;
	private JLabel label_confermaPassword;
	private JPasswordField confermaPassword_in;
	private JButton loginButton;
	private Controller controller;
	private JPanel panel_8;
	private JLabel lblNewLabel_1;
	private JButton RegisterButton;

	
	public LoginView(Controller contr) {
		controller = contr;
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 939, 571);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(223, 223, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 0, 255));
		panel.setBounds(160, 98, 301, 387);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel_5 = new JLabel("Turtle Center");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Verdana", Font.BOLD, 20));
		lblNewLabel_5.setBounds(30, 265, 239, 51);
		panel.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(LoginView.class.getResource("/media/maxim-berg-3E2xgrlNXq4-unsplash (1).jpg")));
		lblNewLabel_6.setBounds(-87, -22, 398, 425);
		panel.add(lblNewLabel_6);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(464, 98, 356, 387);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		panel_8 = new JPanel();
		panel_8.setBackground(SystemColor.textHighlight);
		panel_8.setBounds(101, 55, 171, 240);
		panel_1.add(panel_8);
		panel_8.setLayout(null);
		
		panel_6 = new JPanel();
		panel_6.setBounds(0, 0, 171, 196);
		panel_8.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.Y_AXIS));
		
		panel_2 = new JPanel();
		panel_6.add(panel_2);
		panel_2.setLayout(null);
		
		label_qualifica = new JLabel("Qualifica");
		label_qualifica.setBounds(0, 10, 96, 13);
		panel_2.add(label_qualifica);
		
		comboBoxPersonale = new JComboBox();
		comboBoxPersonale.setModel(new DefaultComboBoxModel(new String[] {"Operatore", "Ricercatore", "Tecnico di Laboratorio ", "Medico Veterinario"}));
		comboBoxPersonale.setBounds(0, 23, 121, 19);
		panel_2.add(comboBoxPersonale);
		
		panel_3 = new JPanel();
		panel_6.add(panel_3);
		panel_3.setLayout(null);
		
		label_userName = new JLabel("User name");
		label_userName.setBounds(0, 10, 134, 13);
		panel_3.add(label_userName);
		
		name_in = new JTextField();
		name_in.setColumns(20);
		name_in.setBounds(0, 23, 118, 19);
		panel_3.add(name_in);
		
		panel_5 = new JPanel();
		panel_6.add(panel_5);
		panel_5.setLayout(null);
		
		label_email = new JLabel("E-mail");
		label_email.setBounds(0, 10, 96, 13);
		panel_5.add(label_email);
		
		email_in = new JTextField();
		email_in.setColumns(20);
		email_in.setBounds(0, 23, 119, 19);
		panel_5.add(email_in);
		
		panel_4 = new JPanel();
		panel_6.add(panel_4);
		panel_4.setLayout(null);
		
		label_password = new JLabel("Password");
		label_password.setBounds(0, 10, 96, 13);
		panel_4.add(label_password);
		
		password_in = new JPasswordField();
		password_in.setColumns(20);
		password_in.setBounds(0, 23, 119, 19);
		panel_4.add(password_in);
		
		panel_7 = new JPanel();
		panel_7.setBounds(0, 193, 171, 47);
		panel_8.add(panel_7);
		panel_7.setLayout(null);
		
		label_confermaPassword = new JLabel("Conferma Password");
		label_confermaPassword.setBounds(0, 10, 161, 13);
		panel_7.add(label_confermaPassword);
		
		confermaPassword_in = new JPasswordField();
		confermaPassword_in.setColumns(20);
		confermaPassword_in.setBounds(0, 23, 118, 19);
		panel_7.add(confermaPassword_in);
		
		label_accedi = new JLabel("Accedi");
		label_accedi.setBounds(101, 26, 45, 13);
		panel_1.add(label_accedi);
		
		separator = new JSeparator();
		separator.setBackground(new Color(255, 255, 255));
		separator.setBounds(101, 42, 171, 12);
		panel_1.add(separator);
		
		loginButton = new JButton("Log In");
		loginButton.setBounds(101, 305, 171, 21);
		panel_1.add(loginButton);
		
		lblNewLabel_1 = new JLabel("Non hai ancora un account?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_1.setBounds(101, 336, 117, 16);
		panel_1.add(lblNewLabel_1);
		
		RegisterButton = new JButton("Registrati");
		RegisterButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		RegisterButton.setBackground(new Color(255, 255, 255));
		RegisterButton.setToolTipText("");
		RegisterButton.setBounds(199, 333, 83, 21);
		panel_1.add(RegisterButton);
		RegisterButton.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
		RegisterButton.setContentAreaFilled(false);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(SystemColor.textHighlight);
		lblNewLabel.setForeground(new Color(0, 255, 255));
		lblNewLabel.setIcon(new ImageIcon(LoginView.class.getResource("/media/337377865845905.jpg")));
		lblNewLabel.setBounds(-411, -1048, 1420, 1623);
		contentPane.add(lblNewLabel);
		
				
				
		loginButton.addMouseListener(new MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent e) {
				loginButton.setBackground(Color.GREEN);
			}

			public void mouseExited(java.awt.event.MouseEvent e) {
				loginButton.setBackground(Color.WHITE);
			}
			public void mouseClicked(java.awt.event.MouseEvent e){
				
				String qualifica = comboBoxPersonale.getSelectedItem().toString();
				String username = name_in.getText();
				String email = email_in.getText();
				String password = password_in.getText();
				String confermaPassword = confermaPassword_in.getText();
				
				if(password.equals(confermaPassword)) {
				
				try {
					if(controller.loginModel.checkLogin(qualifica, username, email, password)) {
						System.out.println("riuscito!");
					}else{
						System.out.println("NON riuscito");
					};
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
	
				}else {
					System.out.println("Le due password non corrispondono");
				}
			}
		});
		
		RegisterButton.addMouseListener(new MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent e) {
				RegisterButton.setBackground(Color.GREEN);
			}

			public void mouseExited(java.awt.event.MouseEvent e) {
				RegisterButton.setBackground(Color.WHITE);
			}
			public void mouseClicked(java.awt.event.MouseEvent e){
				controller.registerView();
				controller.loginView.setVisible(false);
				
			}
		});


		setVisible(true);
		
		
	}
	
	public void stampa() {
		controller.loginModel.stampaNome("ciao");
	}
	
	
	public String getNome() {
		return name_in.getText();
	}
	
	public String getEmail() {
		return email_in.getText();
	}
	
	public String getPassword() {
		return password_in.toString();
	}
	
	public String getPasswordConferma() {
		return confermaPassword_in.toString();
	}
	
	public String getQualifica() {
		return comboBoxPersonale.getSelectedItem().toString();
	}
	
	public void addListenerToLoginButton(ActionListener ListnerForLoginButton) {
		loginButton.addActionListener(ListnerForLoginButton);
	}
	
	public void setNome(String testo){
		name_in.setText(testo);
	}
}
