package turtleCenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JPanel;

import Connessione.Connessione;

public class InserisciCentroModel {
	
	private Connessione connessione;
    private Statement statement;
    private ResultSet resultSet;
    private Controller controller;
    

    public InserisciCentroModel(Controller contr) {
        connessione = Connessione.getConnessione();
        statement = connessione.getStatement();
        controller = contr;
        controller.inserisciCentroView.addListenerForInserisci(new ListenerForInserisci());

    }
    
    public void insertCenter(String idCentro, String partitaIva, String nome, String codiceAteco, String ragioneSociale, String numeroAtto, String email, String emailPec, String numTelefono, String indirizzo, String iban) throws SQLException{
    	
    	try {
			
			statement.executeUpdate("INSERT INTO CENTRO (id_centro, partita_iva, nome, codice_ateco, ragione_sociale, numero_atto_costituitivo, e_mail, e_mail_pec, numero_telefono, indirizzo_sede_legale, iban) "
					+ "VALUES ('"+idCentro+"', '"+partitaIva+"', '"+nome+"', '"+codiceAteco+"', '"+ragioneSociale+"', '"+numeroAtto+"', '"+email+"', '"+emailPec+"', '"+numTelefono+"', '"+indirizzo+"', '"+iban+"');"  );
			
			System.out.println("INSERT 0 1");
			
			
		}catch(SQLException e) {
			
			e.printStackTrace();
			throw e;
		}
    	
    }
    
    class ListenerForInserisci implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String idCentro = controller.inserisciCentroView.getIdCentro();
			String partitaIva = controller.inserisciCentroView.getPartitaIva();
			String nome = controller.inserisciCentroView.getNome();
			String codiceAteco = controller.inserisciCentroView.getCodiceAteco();
			String ragioneSociale = controller.inserisciCentroView.getRagioneSociale();
			String numeroAtto = controller.inserisciCentroView.getNumeroAtto();
			String email = controller.inserisciCentroView.getEmail();
			String pec = controller.inserisciCentroView.getPec();
			String telefono = controller.inserisciCentroView.getNumeroTelefono();
			String indirizzo = controller.inserisciCentroView.getIndirizzo();
			String iban = controller.inserisciCentroView.getIban();
			try {
		
				
				//prova a fare l'inserimento nel db
				controller.inserisciCentroModel.insertCenter(idCentro, partitaIva, nome, codiceAteco, ragioneSociale, numeroAtto, email, pec, telefono, indirizzo, iban);
				
				
				
				
				
				//se l'inserimento va a buon fine creo il pannello centri con la nuova tabella
				JPanel pannelloCentriAggiornato = new PannelloCentri(controller);
				pannelloCentriAggiornato.setVisible(true);
				
				
				//aggiorna il pannello contenente la tabella con tutti i centri per mostrare anche quello appena inseritoù
				controller.dashboardView.getPannelloDash().removeAll();
				controller.dashboardView.add(pannelloCentriAggiornato);
				controller.dashboardView.getPannelloDash().updateUI();
				
				//rimuove il testo dai textField
				controller.inserisciCentroView.setIdCentro(null);
				controller.inserisciCentroView.setPartitaIva(null);
				controller.inserisciCentroView.setNome(null);
				controller.inserisciCentroView.setCodiceAteco(null);
				controller.inserisciCentroView.setRagioneSociale(null);
				controller.inserisciCentroView.setNumeroAtto(null);
				controller.inserisciCentroView.setEmail(null);
				controller.inserisciCentroView.setPec(null);
				controller.inserisciCentroView.setNumeroTelefono(null);
				controller.inserisciCentroView.setIndirizzo(null);
				controller.inserisciCentroView.setIban(null);
				
				
				//controller.inserisciCentroView.showSuccessMessage();
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
    	
    }

}
