package turtleCenter;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

import Connessione.Connessione;

import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class PannelloCentri extends JPanel {
	
	private JPanel panel;
	private JLabel lblNewLabel;
	private JPanel pannelloTabella;
	private JScrollPane scrollPane;
	private JTable table;
	private Connessione connessione;
    private Statement statement;
    private DefaultTableModel tblModel;
    private ResultSet rs;
    private JButton resetButton;
    private Controller controller;
	/**
	 * Create the panel.
	 * @throws SQLException 
	 */
	public PannelloCentri(Controller contr){
		

		controller = contr;
        connessione = Connessione.getConnessione();
        statement = connessione.getStatement();

		setBackground(new Color(255, 128, 128));
		setBounds(342, 117, 830, 445);
		setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 830, 60);
		add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("Lista dei Centri Attivi\r\n");
		lblNewLabel.setBounds(28, 20, 180, 30);
		panel.add(lblNewLabel);
		
		pannelloTabella = new JPanel();
		pannelloTabella.setBackground(new Color(255, 128, 64));
		pannelloTabella.setBounds(10, 70, 797, 361);
		add(pannelloTabella);
		pannelloTabella.setLayout(new BoxLayout(pannelloTabella, BoxLayout.X_AXIS));
		
		scrollPane = new JScrollPane();
		pannelloTabella.add(scrollPane);
		
		tblModel = new DefaultTableModel(
				new Object[][] {},
				new String[] {
					"id_centro", "partita_iva", "nome", "codice_ateco", "ragione_sociale", "numero_atto_costituitivo", "e_mail", "e_mail_pec", "numero_telefono", "indirizzo_sede_legale", "iban"				});
		
		table = new JTable();
		
		try {
    		rs = statement.executeQuery("SELECT * FROM CENTRO");
    		while(rs.next()) {
    			String idCentro = rs.getString("id_centro");
    			String partitaIva = rs.getString("partita_iva");
    			String nome = rs.getString("nome");
    			String codiceAteco = rs.getString("codice_ateco");
    			String ragioneSociale = rs.getString("ragione_sociale");
    			String numeroAttoCostitutivo = rs.getString("numero_atto_costituitivo");
    			String eMail = rs.getString("e_mail");
    			String eMailPec = rs.getString("e_mail_pec");
    			String numeroTelefono = rs.getString("numero_telefono");
    			String indirizzoSedeLegale = rs.getString("indirizzo_sede_legale");
    			String iban = rs.getString("iban");
    			String tbData[] = {idCentro, partitaIva, nome, codiceAteco, ragioneSociale, numeroAttoCostitutivo, eMail, eMailPec, numeroTelefono, indirizzoSedeLegale, iban};
    			tblModel.addRow(tbData);
    		}
    		
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		
	
		table.setModel(tblModel);
		scrollPane.setViewportView(table);
		
			
	}
	
	
	
	public void addRowTableModel(String tblData[]) {
		this.tblModel.addRow(tblData);
	}
	
}

