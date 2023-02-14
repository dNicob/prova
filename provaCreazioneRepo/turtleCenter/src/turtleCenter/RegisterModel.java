package turtleCenter;

import Connessione.Connessione;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class RegisterModel {

		private Connessione connessione;
	    private Statement statement;

	    public RegisterModel() {
	        connessione = Connessione.getConnessione();
	        statement = connessione.getStatement();

	    }
	    
	    public void Register(String qualifica, String nome, String cognome, String codiceFiscale, String residenza,
	    		String username, String email, String password) throws SQLException{
	    	
	    	try {
	    		statement.executeUpdate("INSERT INTO " + qualifica + " (nome, cognome, codice_fiscale, residenza, username, email, pass) VALUES ('" + nome.toUpperCase() + "', '" + cognome.toUpperCase() + "','" +  codiceFiscale.toUpperCase() + "','"+residenza+"', '" +username+ "', '" + email.toLowerCase() +"', '" + password + "');");
	    		System.out.println("INSERT");
			}catch(SQLException e) {
				
				e.printStackTrace();
				throw e;
			}
	    	
	    }
}
