package turtleCenter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.ImageIcon;

public class InserisciCentroView extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JLabel label_idCentro;
	private JTextField idCentro_in;
	private JPanel panel_6;
	private JLabel label_partitaIva;
	private JTextField partitaIva_in;
	private JPanel panel_7;
	private JLabel label_Nome;
	private JTextField nome_in;
	private JPanel panel_8;
	private JLabel label_codiceAteco;
	private JTextField codiceAteco_in;
	private JPanel panel_9;
	private JLabel label_ragioneSociale;
	private JTextField ragioneSociale_in;
	private JPanel panel_10;
	private JLabel label_numeroAtto;
	private JTextField numeroAtto_in;
	private JPanel panel_11;
	private JLabel label_Email;
	private JTextField email_in;
	private JPanel panel_12;
	private JLabel label_pec;
	private JTextField pec_in;
	private JPanel panel_13;
	private JLabel label_telefono;
	private JTextField telefono_in;
	private JPanel panel_14;
	private JLabel label_indirizzo;
	private JTextField indirizzo_in;
	private JPanel panel_15;
	private JLabel label_iban;
	private JTextField iban_in;
	private JPanel panel_16;
	private JPanel panel_17;
	private JPanel panel_18;
	private JPanel panel_19;
	private JPanel panel_20;
	private JPanel panel_21;
	private JPanel panel_22;
	private JPanel panel_23;
	private JPanel panel_24;
	private JPanel panel_25;
	private JPanel panel_26;
	private JPanel panel_27;
	private JPanel panel_28;
	private JPanel panel_29;
	private JPanel panel_31;
	private JButton bottoneIndietro;
	private JButton bottoneInserisci;
	private Controller controller;
	private JPanel panel_30;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	
	public InserisciCentroView(Controller contr) {
		controller = contr;
		setBounds(100, 100, 1209, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		panel_1.setBackground(new Color(69, 69, 69));
		panel.add(panel_1, BorderLayout.NORTH);
		
		lblNewLabel = new JLabel("Inserisci un nuovo centro di recupero tartarughe marine");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setPreferredSize(new Dimension(450, 60));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(lblNewLabel);
		
		panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		panel_30 = new JPanel();
		panel_30.setBackground(new Color(255, 255, 255));
		panel_30.setPreferredSize(new Dimension(200, 10));
		panel_2.add(panel_30);
		panel_30.setLayout(null);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(InserisciCentroView.class.getResource("/media/home (1).png")));
		lblNewLabel_1.setBounds(29, 84, 180, 180);
		panel_30.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Nuovo Centro");
		lblNewLabel_2.setBounds(89, 274, 72, 13);
		panel_30.add(lblNewLabel_2);
		
		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		panel_2.add(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.Y_AXIS));
		
		panel_18 = new JPanel();
		panel_18.setBackground(new Color(96, 96, 96));
		panel_3.add(panel_18);
		
		panel_5 = new JPanel();
		panel_5.setBorder(new EmptyBorder(0, 0, 0, 20));
		panel_5.setBackground(new Color(96, 96, 96));
		FlowLayout flowLayout = (FlowLayout) panel_5.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		panel_3.add(panel_5);
		
		panel_19 = new JPanel();
		panel_19.setBackground(new Color(165, 165, 165));
		panel_5.add(panel_19);
		
		label_idCentro = new JLabel("ID Centro");
		label_idCentro.setPreferredSize(new Dimension(110, 40));
		label_idCentro.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_idCentro.setForeground(new Color(255, 255, 255));
		panel_19.add(label_idCentro);
		
		idCentro_in = new JTextField();
		idCentro_in.setPreferredSize(new Dimension(7, 30));
		panel_19.add(idCentro_in);
		idCentro_in.setColumns(30);
		
		panel_6 = new JPanel();
		panel_6.setBorder(new EmptyBorder(0, 0, 0, 20));
		panel_6.setBackground(new Color(96, 96, 96));
		FlowLayout flowLayout_2 = (FlowLayout) panel_6.getLayout();
		flowLayout_2.setAlignment(FlowLayout.RIGHT);
		panel_3.add(panel_6);
		
		panel_20 = new JPanel();
		panel_20.setBackground(new Color(165, 165, 165));
		panel_6.add(panel_20);
		
		label_partitaIva = new JLabel("Partita Iva");
		label_partitaIva.setPreferredSize(new Dimension(110, 40));
		label_partitaIva.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_partitaIva.setForeground(new Color(255, 255, 255));
		panel_20.add(label_partitaIva);
		
		partitaIva_in = new JTextField();
		partitaIva_in.setPreferredSize(new Dimension(7, 30));
		panel_20.add(partitaIva_in);
		partitaIva_in.setColumns(30);
		
		panel_7 = new JPanel();
		panel_7.setBorder(new EmptyBorder(0, 0, 0, 20));
		panel_7.setBackground(new Color(96, 96, 96));
		FlowLayout flowLayout_8 = (FlowLayout) panel_7.getLayout();
		flowLayout_8.setAlignment(FlowLayout.RIGHT);
		panel_3.add(panel_7);
		
		panel_21 = new JPanel();
		panel_21.setBackground(new Color(165, 165, 165));
		panel_7.add(panel_21);
		
		label_Nome = new JLabel("Nome");
		label_Nome.setPreferredSize(new Dimension(110, 40));
		label_Nome.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_Nome.setForeground(new Color(255, 255, 255));
		panel_21.add(label_Nome);
		
		nome_in = new JTextField();
		nome_in.setPreferredSize(new Dimension(7, 30));
		panel_21.add(nome_in);
		nome_in.setColumns(30);
		
		panel_8 = new JPanel();
		panel_8.setBorder(new EmptyBorder(0, 0, 0, 20));
		panel_8.setBackground(new Color(96, 96, 96));
		FlowLayout flowLayout_9 = (FlowLayout) panel_8.getLayout();
		flowLayout_9.setAlignment(FlowLayout.RIGHT);
		panel_3.add(panel_8);
		
		panel_22 = new JPanel();
		panel_22.setBackground(new Color(165, 165, 165));
		panel_8.add(panel_22);
		
		label_codiceAteco = new JLabel("Codice Ateco");
		label_codiceAteco.setPreferredSize(new Dimension(110, 40));
		label_codiceAteco.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_codiceAteco.setForeground(new Color(255, 255, 255));
		panel_22.add(label_codiceAteco);
		
		codiceAteco_in = new JTextField();
		codiceAteco_in.setPreferredSize(new Dimension(7, 30));
		panel_22.add(codiceAteco_in);
		codiceAteco_in.setColumns(30);
		
		panel_9 = new JPanel();
		panel_9.setBorder(new EmptyBorder(0, 0, 0, 20));
		panel_9.setBackground(new Color(96, 96, 96));
		FlowLayout flowLayout_10 = (FlowLayout) panel_9.getLayout();
		flowLayout_10.setAlignment(FlowLayout.RIGHT);
		panel_3.add(panel_9);
		
		panel_23 = new JPanel();
		panel_23.setBackground(new Color(165, 165, 165));
		panel_9.add(panel_23);
		
		label_ragioneSociale = new JLabel("Ragione Sociale");
		label_ragioneSociale.setPreferredSize(new Dimension(110, 40));
		label_ragioneSociale.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_ragioneSociale.setForeground(new Color(255, 255, 255));
		panel_23.add(label_ragioneSociale);
		
		ragioneSociale_in = new JTextField();
		ragioneSociale_in.setPreferredSize(new Dimension(7, 30));
		panel_23.add(ragioneSociale_in);
		ragioneSociale_in.setColumns(30);
		
		panel_10 = new JPanel();
		panel_10.setBorder(new EmptyBorder(0, 0, 0, 20));
		panel_10.setBackground(new Color(96, 96, 96));
		FlowLayout flowLayout_11 = (FlowLayout) panel_10.getLayout();
		flowLayout_11.setAlignment(FlowLayout.RIGHT);
		panel_3.add(panel_10);
		
		panel_24 = new JPanel();
		panel_24.setBackground(new Color(165, 165, 165));
		panel_10.add(panel_24);
		
		label_numeroAtto = new JLabel("Numero Atto Costitutivo");
		label_numeroAtto.setPreferredSize(new Dimension(110, 40));
		label_numeroAtto.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_numeroAtto.setForeground(new Color(255, 255, 255));
		panel_24.add(label_numeroAtto);
		
		numeroAtto_in = new JTextField();
		numeroAtto_in.setPreferredSize(new Dimension(7, 30));
		panel_24.add(numeroAtto_in);
		numeroAtto_in.setColumns(30);
		
		panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		panel_2.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
		
		panel_17 = new JPanel();
		panel_17.setBackground(new Color(96, 96, 96));
		panel_4.add(panel_17);
		
		panel_11 = new JPanel();
		panel_11.setBorder(new EmptyBorder(0, 20, 0, 0));
		panel_11.setBackground(new Color(96, 96, 96));
		FlowLayout flowLayout_1 = (FlowLayout) panel_11.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_4.add(panel_11);
		
		panel_25 = new JPanel();
		panel_25.setBackground(new Color(165, 165, 165));
		panel_11.add(panel_25);
		
		label_Email = new JLabel("e-mail");
		label_Email.setPreferredSize(new Dimension(130, 40));
		label_Email.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_Email.setForeground(new Color(255, 255, 255));
		panel_25.add(label_Email);
		
		email_in = new JTextField();
		email_in.setPreferredSize(new Dimension(7, 30));
		panel_25.add(email_in);
		email_in.setColumns(30);
		
		panel_12 = new JPanel();
		panel_12.setBorder(new EmptyBorder(0, 20, 0, 0));
		panel_12.setBackground(new Color(96, 96, 96));
		FlowLayout flowLayout_3 = (FlowLayout) panel_12.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel_4.add(panel_12);
		
		panel_26 = new JPanel();
		panel_26.setBackground(new Color(165, 165, 165));
		panel_12.add(panel_26);
		
		label_pec = new JLabel("e-mail PEC");
		label_pec.setPreferredSize(new Dimension(130, 40));
		label_pec.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_pec.setForeground(new Color(255, 255, 255));
		panel_26.add(label_pec);
		
		pec_in = new JTextField();
		pec_in.setPreferredSize(new Dimension(7, 30));
		panel_26.add(pec_in);
		pec_in.setColumns(30);
		
		panel_13 = new JPanel();
		panel_13.setBorder(new EmptyBorder(0, 20, 0, 0));
		panel_13.setBackground(new Color(96, 96, 96));
		FlowLayout flowLayout_4 = (FlowLayout) panel_13.getLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		panel_4.add(panel_13);
		
		panel_27 = new JPanel();
		panel_27.setBackground(new Color(165, 165, 165));
		panel_13.add(panel_27);
		
		label_telefono = new JLabel("Telefono");
		label_telefono.setPreferredSize(new Dimension(130, 40));
		label_telefono.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_telefono.setForeground(new Color(255, 255, 255));
		panel_27.add(label_telefono);
		
		telefono_in = new JTextField();
		telefono_in.setPreferredSize(new Dimension(7, 30));
		panel_27.add(telefono_in);
		telefono_in.setColumns(30);
		
		panel_14 = new JPanel();
		panel_14.setBorder(new EmptyBorder(0, 20, 0, 0));
		panel_14.setBackground(new Color(96, 96, 96));
		FlowLayout flowLayout_5 = (FlowLayout) panel_14.getLayout();
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_4.add(panel_14);
		
		panel_28 = new JPanel();
		panel_28.setBackground(new Color(165, 165, 165));
		panel_14.add(panel_28);
		
		label_indirizzo = new JLabel("Indirizzo Sede Legale");
		label_indirizzo.setPreferredSize(new Dimension(130, 40));
		label_indirizzo.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_indirizzo.setForeground(new Color(255, 255, 255));
		panel_28.add(label_indirizzo);
		
		indirizzo_in = new JTextField();
		indirizzo_in.setPreferredSize(new Dimension(7, 30));
		panel_28.add(indirizzo_in);
		indirizzo_in.setColumns(30);
		
		panel_15 = new JPanel();
		panel_15.setBorder(new EmptyBorder(0, 20, 0, 0));
		panel_15.setBackground(new Color(96, 96, 96));
		FlowLayout flowLayout_6 = (FlowLayout) panel_15.getLayout();
		flowLayout_6.setAlignment(FlowLayout.LEFT);
		panel_4.add(panel_15);
		
		panel_29 = new JPanel();
		panel_29.setBackground(new Color(165, 165, 165));
		panel_15.add(panel_29);
		
		label_iban = new JLabel("IBAN");
		label_iban.setPreferredSize(new Dimension(130, 40));
		label_iban.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_iban.setForeground(new Color(255, 255, 255));
		panel_29.add(label_iban);
		
		iban_in = new JTextField();
		iban_in.setPreferredSize(new Dimension(7, 30));
		panel_29.add(iban_in);
		iban_in.setColumns(30);
		
		panel_16 = new JPanel();
		panel_16.setBorder(new EmptyBorder(0, 20, 0, 0));
		panel_16.setBackground(new Color(96, 96, 96));
		panel_4.add(panel_16);
		panel_16.setLayout(new BoxLayout(panel_16, BoxLayout.X_AXIS));
		
		panel_31 = new JPanel();
		panel_31.setBackground(new Color(96, 96, 96));
		panel_16.add(panel_31);
		panel_31.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 5));
		
		bottoneInserisci = new JButton("Inserisci");
		bottoneInserisci.setPreferredSize(new Dimension(100, 30));
		panel_31.add(bottoneInserisci);
		
		bottoneIndietro = new JButton("Indietro");
		panel_31.add(bottoneIndietro);
		bottoneIndietro.setPreferredSize(new Dimension(100, 30));
		setVisible(false);
	}
	
	public void setIdCentro(String idCentro) {
		idCentro_in.setText(idCentro);
	}
	
	public void setPartitaIva(String pIva) {
		partitaIva_in.setText(pIva);
	}
	
	public void setNome(String nome) {
		nome_in.setText(nome);
	}
	
	public void setCodiceAteco(String codAteco) {
	    codiceAteco_in.setText(codAteco);
	}
	
	public void setRagioneSociale(String rSociale) {
		ragioneSociale_in.setText(rSociale);
	}
	
	public void setNumeroAtto(String numAtto) {
		numeroAtto_in.setText(numAtto);
	}
	
	public void setEmail(String email) {
		email_in.setText(email);
	}
	
	public void setPec(String pec) {
		pec_in.setText(pec);
	}
	
	public void setNumeroTelefono(String num) {
		telefono_in.setText(num);
	}
	
	public void setIndirizzo(String indirizzo) {
		indirizzo_in.setText(indirizzo);
	}
	
	public void setIban(String iban) {
		iban_in.setText(iban);
	}
	
	public String getIdCentro() {
		return idCentro_in.getText();
	}
	
	public String getPartitaIva() {
		return partitaIva_in.getText();
	}
	
	public String getNome() {
		return nome_in.getText();
	}
	
	public String getCodiceAteco() {
		return codiceAteco_in.getText();
	}
	
	public String getRagioneSociale() {
		return ragioneSociale_in.getText();
	}
	
	public String getNumeroAtto() {
		return numeroAtto_in.getText();
	}
	
	public String getEmail() {
		return email_in.getText();
	}
	
	public String getPec() {
		return pec_in.getText();
	}
	
	public String getNumeroTelefono() {
		return telefono_in.getText();
	}
	
	public String getIndirizzo() {
		return indirizzo_in.getText();
	}
	
	public String getIban() {
		return iban_in.getText();
	}
	
	public void addListenerForInserisci(ActionListener listener) {
		bottoneInserisci.addActionListener(listener);
	}
	
	public void addListenerForIndietro(ActionListener listener) {
		bottoneIndietro.addActionListener(listener);
	}
	
	public void showSuccessMessage() {
		JOptionPane.showMessageDialog(this, "Il centro è stato inserito con successo!");
	}
}
