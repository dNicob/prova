
package turtleCenter;

import Connessione.Connessione;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JPanel;



public class LoginModel {
	
	    private Connessione connessione;
	    private Statement statement;
	    private ResultSet resultSet;

	    //costruttore per ottenere la connessione al db
	    public LoginModel() {
	        connessione = Connessione.getConnessione();
	        statement = connessione.getStatement();

	    }
	    
	    public void stampaNome(String testo){
	    	System.out.println(testo);
	    }
	    
	   
	    
	    public boolean checkLogin(String qualifica, String username, String email, String password) throws SQLException{
	    	
	    	try {
				
				ResultSet rs = statement.executeQuery("SELECT * FROM "+ qualifica + " WHERE " +qualifica + ".username = '"+ username.toUpperCase()  + "' AND " + qualifica + ".email = '" + email.toLowerCase() + "' AND " + qualifica + ".pass = '" + password + "';");
				return rs.next();
				
			}catch(SQLException e) {
				
				e.printStackTrace();
				throw e;
			}
	    	
	    }
}
