package turtleCenter;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;

public class RegisterView extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNome;
	private JTextField name_in;
	private JPanel panel_2;
	private JPanel panel_3;
	private JLabel lblCognome;
	private JTextField cognome_in;
	private JPanel panel_4;
	private JLabel lblResidenza;
	private JTextField residenza_in;
	private JPanel panel_5;
	private JLabel lblCodiceFiscale;
	private JTextField codiceFiscale_in;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JPanel panel_6;
	private JLabel lblRegistrati;
	private JSeparator separator;
	private JLabel lblNewLabel;
	private JButton BottoneConfermaRegistrazione;
	private Controller controller;
	private JPanel panel_8;
	private JPanel panel_10;
	private JLabel label_confermaPassword_1;
	private JPasswordField passConferma_in;
	private JPanel panel_11;
	private JLabel label_userName_1;
	private JTextField username_in;
	private JPanel panel_12;
	private JLabel label_email_1;
	private JTextField email_in;
	private JPanel panel_13;
	private JLabel label_password_1;
	private JPasswordField pass_in;
	private JPanel panel_7;
	private JLabel lblNewLabel_1;
	private JComboBox comboBoxPersonale;
	private JButton tornaIndietro;

	
	public RegisterView(Controller contr) {
		this.controller = contr;
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 939, 571);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(223, 223, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 0, 255));
		panel.setBounds(160, 98, 218, 344);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel_5 = new JLabel("Turtle Center");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Verdana", Font.BOLD, 20));
		lblNewLabel_5.setBounds(0, 272, 239, 51);
		panel.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(LoginView.class.getResource("/media/maxim-berg-3E2xgrlNXq4-unsplash (1).jpg")));
		lblNewLabel_6.setBounds(-87, -21, 356, 424);
		panel.add(lblNewLabel_6);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(388, 98, 414, 344);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		panel_8 = new JPanel();
		panel_8.setBackground(SystemColor.textHighlight);
		panel_8.setBounds(42, 55, 171, 193);
		panel_1.add(panel_8);
		panel_8.setLayout(null);
		
		panel_6 = new JPanel();
		panel_6.setBounds(0, 0, 171, 196);
		panel_8.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.Y_AXIS));
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_6.add(panel_2);
		panel_2.setLayout(null);
		
		lblNome = new JLabel("Nome");
		lblNome.setBounds(0, 0, 96, 13);
		panel_2.add(lblNome);
		
		name_in = new JTextField();
		name_in.setBounds(0, 23, 116, 19);
		panel_2.add(name_in);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_6.add(panel_3);
		panel_3.setLayout(null);
		
		lblCognome = new JLabel("Cognome");
		lblCognome.setBounds(0, 0, 134, 13);
		panel_3.add(lblCognome);
		
		cognome_in = new JTextField();
		cognome_in.setColumns(20);
		cognome_in.setBounds(0, 23, 118, 19);
		panel_3.add(cognome_in);
		
		panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel_6.add(panel_5);
		panel_5.setLayout(null);
		
		lblCodiceFiscale = new JLabel("Codice Fiscale");
		lblCodiceFiscale.setBounds(0, 0, 96, 13);
		panel_5.add(lblCodiceFiscale);
		
		codiceFiscale_in = new JTextField();
		codiceFiscale_in.setColumns(20);
		codiceFiscale_in.setBounds(0, 23, 119, 19);
		panel_5.add(codiceFiscale_in);
		
		panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_6.add(panel_4);
		panel_4.setLayout(null);
		
		lblResidenza = new JLabel("Residenza");
		lblResidenza.setBounds(0, 0, 96, 13);
		panel_4.add(lblResidenza);
		
		residenza_in = new JTextField();
		residenza_in.setColumns(20);
		residenza_in.setBounds(0, 23, 119, 19);
		panel_4.add(residenza_in);
		
		lblRegistrati = new JLabel("Registrati");
		lblRegistrati.setBounds(42, 32, 98, 13);
		panel_1.add(lblRegistrati);
		
		separator = new JSeparator();
		separator.setBackground(new Color(255, 255, 255));
		separator.setBounds(42, 46, 171, 12);
		panel_1.add(separator);
		
		BottoneConfermaRegistrazione = new JButton("Registrati");
		BottoneConfermaRegistrazione.setBounds(292, 306, 85, 21);
		panel_1.add(BottoneConfermaRegistrazione);
		
		panel_10 = new JPanel();
		panel_10.setBackground(new Color(255, 255, 255));
		panel_10.setLayout(null);
		panel_10.setBounds(223, 199, 171, 47);
		panel_1.add(panel_10);
		
		label_confermaPassword_1 = new JLabel("Conferma Password");
		label_confermaPassword_1.setBounds(0, 0, 96, 13);
		panel_10.add(label_confermaPassword_1);
		
		passConferma_in = new JPasswordField();
		passConferma_in.setColumns(20);
		passConferma_in.setBounds(0, 23, 118, 19);
		panel_10.add(passConferma_in);
		
		panel_11 = new JPanel();
		panel_11.setBackground(new Color(255, 255, 255));
		panel_11.setLayout(null);
		panel_11.setBounds(223, 55, 171, 49);
		panel_1.add(panel_11);
		
		label_userName_1 = new JLabel("User name");
		label_userName_1.setBounds(0, 0, 134, 13);
		panel_11.add(label_userName_1);
		
		username_in = new JTextField();
		username_in.setColumns(20);
		username_in.setBounds(0, 23, 118, 19);
		panel_11.add(username_in);
		
		panel_12 = new JPanel();
		panel_12.setBackground(new Color(255, 255, 255));
		panel_12.setLayout(null);
		panel_12.setBounds(223, 104, 171, 49);
		panel_1.add(panel_12);
		
		label_email_1 = new JLabel("E-mail");
		label_email_1.setBounds(0, 0, 96, 13);
		panel_12.add(label_email_1);
		
		email_in = new JTextField();
		email_in.setColumns(20);
		email_in.setBounds(0, 23, 119, 19);
		panel_12.add(email_in);
		
		panel_13 = new JPanel();
		panel_13.setBackground(new Color(255, 255, 255));
		panel_13.setLayout(null);
		panel_13.setBounds(223, 153, 171, 49);
		panel_1.add(panel_13);
		
		label_password_1 = new JLabel("Password");
		label_password_1.setBounds(0, 0, 96, 13);
		panel_13.add(label_password_1);
		
		pass_in = new JPasswordField();
		pass_in.setColumns(20);
		pass_in.setBounds(0, 23, 119, 19);
		panel_13.add(pass_in);
		
		panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 255));
		panel_7.setBounds(42, 249, 352, 47);
		panel_1.add(panel_7);
		panel_7.setLayout(null);
		
		lblNewLabel_1 = new JLabel("Qualifica");
		lblNewLabel_1.setBounds(0, 0, 112, 13);
		panel_7.add(lblNewLabel_1);
		
		comboBoxPersonale = new JComboBox();
		comboBoxPersonale.setBounds(0, 23, 127, 19);
		comboBoxPersonale.setModel(new DefaultComboBoxModel(new String[] {"Operatore", "Ricercatore", "Medico Veterinario", "Tecnico di Laboratorio"}));
		panel_7.add(comboBoxPersonale);
		
		tornaIndietro = new JButton("Torna alla pagina di Log in");
		
		tornaIndietro.setFont(new Font("Tahoma", Font.BOLD, 10));
		tornaIndietro.setHorizontalAlignment(SwingConstants.LEFT);
		tornaIndietro.setBounds(42, 313, 199, 21);
		tornaIndietro.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
		tornaIndietro.setContentAreaFilled(false);
		panel_1.add(tornaIndietro);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(SystemColor.textHighlight);
		lblNewLabel.setForeground(new Color(0, 255, 255));
		lblNewLabel.setIcon(new ImageIcon(LoginView.class.getResource("/media/337377865845905.jpg")));
		lblNewLabel.setBounds(-411, -1048, 1420, 1623);
		contentPane.add(lblNewLabel);
		
		
		
		
		tornaIndietro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controller.loginView.setVisible(true);
				controller.registerView.setVisible(false);
			}
		});
		
		
		BottoneConfermaRegistrazione.addMouseListener(new MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent e) {

				BottoneConfermaRegistrazione.setBackground(Color.GREEN);
			}

			public void mouseExited(java.awt.event.MouseEvent e) {

				BottoneConfermaRegistrazione.setBackground(Color.WHITE);
			}
			public void mouseClicked(java.awt.event.MouseEvent e){
				
				String qualifica = controller.registerView.getQualifica();
				String nome = controller.registerView.getName();
				String cognome = controller.registerView.getCognome();
				String codiceFiscale = controller.registerView.getCodiceFiscale();
				String residenza = controller.registerView.getResidenza();
				String username = controller.registerView.getUserName();
				String email = controller.registerView.getEmail();
				String password = controller.registerView.getPassword();
				
				try {
					controller.registerModel.Register(qualifica, nome, cognome, codiceFiscale, residenza, username, email, password);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
	}
	
	public String getQualifica() {
		return comboBoxPersonale.getSelectedItem().toString();
	}
	
	public String getName() {
		return name_in.getText();
	}
	
	public String getCognome() {
		return cognome_in.getText();
	}
	
	
	public String getCodiceFiscale() {
		return codiceFiscale_in.getText();
	}
	
	public String getResidenza() {
		return residenza_in.getText();
	}
	
	public String getUserName() {
		return username_in.getText();
	}
	
	public String getEmail() {
		return email_in.getText();
	}
	
	public String getPassword() {
		return pass_in.getText();
	}
	
	
	public void setName(String testo){
		name_in.setText(testo);
	}
}
