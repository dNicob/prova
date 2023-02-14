package turtleCenter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.event.MouseEvent;
import javax.swing.border.BevelBorder;

public class DashboardView extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel LeftPanel;
	private JButton bottoneDashBoard;
	private JPanel PannelloSuperioreDashBoard;
	private JPanel panel_5;
	private JLabel lblnumeroDiCentri_1;
	private JButton bottoneVisualizaNumeroTartarugheAccolte;
	private JPanel panel_6;
	private JLabel lblnumeroDiCentri_2;
	private JButton bottoneVisualizzaTartarugheRilasciate;
	private JPanel panel_7;
	private JLabel lblnumeroDiCentri_3;
	private JButton bottonoVisualizzaTartarugheMorte;
	private JPanel BoxPanelForGrafico;
	private Controller controller;
	private JButton bottoneCentri;
	private JButton btnCentro;
	private JPanel PannelloDash;
	private JPanel pannelloCentri;
	private JPanel pannelloSuperioreCentri;
	private JPanel panel_2;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;
	private JPanel panel_3;
	private JPanel panel_4;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;

	
	public DashboardView(Controller contr) {
		controller = contr;
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1196, 628);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 100, 100));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		LeftPanel = new JPanel();
		LeftPanel.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		LeftPanel.setBackground(new Color(51, 51, 51));
		LeftPanel.setBounds(0, 0, 316, 591);
		contentPane.add(LeftPanel);
		LeftPanel.setLayout(null);
		
		bottoneDashBoard = new JButton("DASHBOARD");
		bottoneDashBoard.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		bottoneDashBoard.setBounds(10, 120, 296, 31);
		LeftPanel.add(bottoneDashBoard);
		
		bottoneCentri = new JButton("CENTRI");
		bottoneCentri.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		bottoneCentri.setBounds(10, 161, 296, 31);
		LeftPanel.add(bottoneCentri);
		
		btnCentro = new JButton("CENTRO");
		btnCentro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnCentro.setBounds(10, 202, 296, 31);
		LeftPanel.add(btnCentro);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(68, 68, 68));
		panel_3.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		panel_3.setBounds(0, 0, 316, 91);
		LeftPanel.add(panel_3);
		
		PannelloDash = new JPanel();
		PannelloDash.setBackground(new Color(205, 205, 205));
		PannelloDash.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(100, 100, 100), new Color(128, 128, 128), new Color(53, 53, 53), new Color(68, 68, 68)));
		PannelloDash.setBounds(342, 117, 830, 445);
		contentPane.add(PannelloDash);
		PannelloDash.setLayout(null);
				
				pannelloCentri = new PannelloCentri(controller);
				pannelloCentri.setBounds(0, 0, 830, 445);
				PannelloDash.add(pannelloCentri);
				pannelloCentri.setBackground(new Color(229, 229, 229));
				pannelloCentri.setVisible(false);
			
				
				BoxPanelForGrafico = new JPanel();
				BoxPanelForGrafico.setBounds(50, 0, 731, 445);
				PannelloDash.add(BoxPanelForGrafico);
				BoxPanelForGrafico.setLayout(new BoxLayout(BoxPanelForGrafico, BoxLayout.X_AXIS));
				BoxPanelForGrafico.setVisible(false);
		
		pannelloSuperioreCentri = new JPanel();
		pannelloSuperioreCentri.setBackground(new Color(100, 100, 100));
		pannelloSuperioreCentri.setBounds(318, 0, 864, 90);
		contentPane.add(pannelloSuperioreCentri);
		pannelloSuperioreCentri.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_2.setBackground(Color.gray);
			}
			public void mouseExited(MouseEvent e) {
				panel_2.setBackground(new Color(68,68,68));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				controller.inserisciCentroView.setVisible(true);
			}
		});
		panel_2.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		panel_2.setBackground(new Color(68, 68, 68));
		panel_2.setBounds(0, 0, 247, 90);
		pannelloSuperioreCentri.add(panel_2);
		panel_2.setLayout(null);
		
		lblNewLabel_1 = new JLabel("Aggiungi Centro");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(81, 20, 128, 49);
		panel_2.add(lblNewLabel_1);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(DashboardView.class.getResource("/media/plus (1).png")));
		lblNewLabel.setBounds(20, 10, 45, 69);
		panel_2.add(lblNewLabel);
		
		panel_4 = new JPanel();
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_4.setBackground(Color.gray);
			}
			
			public void mouseExited(MouseEvent e) {
				panel_4.setBackground(new Color(68,68,68));
			}
		});
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		panel_4.setBackground(new Color(68, 68, 68));
		panel_4.setBounds(247, 0, 247, 90);
		pannelloSuperioreCentri.add(panel_4);
		
		lblNewLabel_2 = new JLabel("Rimuvoi Centro");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(81, 20, 128, 49);
		panel_4.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(DashboardView.class.getResource("/media/remove (1).png")));
		lblNewLabel_3.setBounds(20, 10, 45, 69);
		panel_4.add(lblNewLabel_3);
		
		PannelloSuperioreDashBoard = new JPanel();
		PannelloSuperioreDashBoard.setBorder(new LineBorder(SystemColor.text, 2));
		PannelloSuperioreDashBoard.setBackground(new Color(100, 100, 100));
		PannelloSuperioreDashBoard.setBounds(317, 0, 865, 90);
		contentPane.add(PannelloSuperioreDashBoard);
		PannelloSuperioreDashBoard.setLayout(null);
		
		panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		panel_5.setBackground(new Color(68, 68, 68));
		panel_5.setBounds(0, 0, 210, 90);
		PannelloSuperioreDashBoard.add(panel_5);
		
		lblnumeroDiCentri_1 = new JLabel("<html>Numero di tartarughe accolte<br/> quest anno da tutti i centri\r\n<html>");
		lblnumeroDiCentri_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblnumeroDiCentri_1.setForeground(Color.WHITE);
		lblnumeroDiCentri_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblnumeroDiCentri_1.setBounds(0, 10, 211, 34);
		panel_5.add(lblnumeroDiCentri_1);
		
		bottoneVisualizaNumeroTartarugheAccolte = new JButton("Visualizza");
		bottoneVisualizaNumeroTartarugheAccolte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				bottoneVisualizaNumeroTartarugheAccolte.setBackground(Color.white);
			}
			
			public void mouseExited(MouseEvent e) {
				bottoneVisualizaNumeroTartarugheAccolte.setBackground(new JButton().getBackground());
			}
		});
		bottoneVisualizaNumeroTartarugheAccolte.setBorderPainted(false);
		bottoneVisualizaNumeroTartarugheAccolte.setBounds(37, 54, 146, 21);
		panel_5.add(bottoneVisualizaNumeroTartarugheAccolte);
		
		panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		panel_6.setBackground(new Color(68, 68, 68));
		panel_6.setBounds(208, 0, 210, 90);
		PannelloSuperioreDashBoard.add(panel_6);
		
		lblnumeroDiCentri_2 = new JLabel("<html>Numero di tartarughe rilasciate<br/> quest anno da tutti i centri\r\n<html>");
		lblnumeroDiCentri_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblnumeroDiCentri_2.setForeground(Color.WHITE);
		lblnumeroDiCentri_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblnumeroDiCentri_2.setBounds(0, 10, 211, 34);
		panel_6.add(lblnumeroDiCentri_2);
		
		bottoneVisualizzaTartarugheRilasciate = new JButton("Visualizza");
		bottoneVisualizzaTartarugheRilasciate.setBounds(37, 54, 146, 21);
		panel_6.add(bottoneVisualizzaTartarugheRilasciate);
		
		panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		panel_7.setBackground(new Color(68, 68, 68));
		panel_7.setBounds(415, 0, 210, 90);
		PannelloSuperioreDashBoard.add(panel_7);
		
		lblnumeroDiCentri_3 = new JLabel("<html>Numero di tartarughe morte<br/> quest anno in tutti i centri\r\n<html>");
		lblnumeroDiCentri_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblnumeroDiCentri_3.setForeground(Color.WHITE);
		lblnumeroDiCentri_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblnumeroDiCentri_3.setBounds(0, 10, 211, 34);
		panel_7.add(lblnumeroDiCentri_3);
		
		bottonoVisualizzaTartarugheMorte = new JButton("Visualizza");
		bottonoVisualizzaTartarugheMorte.setBounds(37, 54, 146, 21);
		panel_7.add(bottonoVisualizzaTartarugheMorte);
		pannelloSuperioreCentri.setVisible(false);
		
		
		
		setVisible(true);
		}
		
		
	
	public void addListenerForBottoneVisualizaNumeroTartarugheAccolte(ActionListener Listener) {
		bottoneVisualizaNumeroTartarugheAccolte.addActionListener(Listener);
	}
	
	public void addListenerForBottoneVisualizaNumeroTartarugheRilasciate(ActionListener Listener){
		bottoneVisualizzaTartarugheRilasciate.addActionListener(Listener);
	}
	
	public void addListenerForBottoneVisualizaNumeroTartarugheMorte(ActionListener Listener){
		bottonoVisualizzaTartarugheMorte.addActionListener(Listener);
	}
	
	public void addListenerForBottoneCentri(ActionListener Listener){
		bottoneCentri.addActionListener(Listener);
	}
	
	public void addListenrForBottoneDashBoard(ActionListener Listener){
		bottoneDashBoard.addActionListener(Listener);
	}

	
	public JPanel getPannelloDash() {
		return PannelloDash;
	}
	
	public JPanel getPannelloSuperioreDash() {
		return PannelloSuperioreDashBoard;
	}
	
	public JPanel getBoxPanelForGrafico() {
		return BoxPanelForGrafico;
	}
	
	public JPanel getPannelloCentri() {
		return pannelloCentri;
	}
	
	public JPanel getPannelloSuperioreCentri() {
		return pannelloSuperioreCentri;
	}
	
	public void setPanelloCentri(JPanel pnlCentri2) {
		this.pannelloCentri = pnlCentri2;
	}
	
	
}
