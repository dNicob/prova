package turtleCenter;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import Connessione.Connessione;

public class EsecutoreFunzioniDBMS {
	
	private static Connection conn = null;
    private static CallableStatement cstmt;
    private static Statement statement;
    private static ResultSet rs;

  
    
    public static int eseguiFunzioneTartarugheAccolte(int Anno) throws ClassNotFoundException {
    	int result = 0;
    	 try {
             Class.forName("org.postgresql.Driver");

             // Step 2: Establish a connection
             conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres", "1234");

             // Step 3: Create a callable statement
             cstmt = conn.prepareCall("{ ? = call number_turtle_accolte_all_year(?) }");

             // Step 4: Register the OUT parameter
             cstmt.registerOutParameter(1, Types.INTEGER);

             // Step 5: Set the input parameter
             cstmt.setInt(2, Anno);

             // Step 6: Execute the statement
             cstmt.execute();

             // Step 7: Get the result
             result = cstmt.getInt(1);
             System.out.println("Result: " + result);
     
         } catch (SQLException e) {
             e.printStackTrace();
    }
		return result;
   }

	
    
    public static int eseguiFunzioneTartarugheRilasciate(int Anno) throws ClassNotFoundException {
    	int result = 0;
    	 try {
             Class.forName("org.postgresql.Driver");

             // Step 2: Establish a connection
             conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres", "1234");

             // Step 3: Create a callable statement
             cstmt = conn.prepareCall("{ ? = call numero_tartarughe_rilasciate_all_year(?) }");

             // Step 4: Register the OUT parameter
             cstmt.registerOutParameter(1, Types.INTEGER);

             // Step 5: Set the input parameter
             cstmt.setInt(2, Anno);

             // Step 6: Execute the statement
             cstmt.execute();

             // Step 7: Get the result
             result = cstmt.getInt(1);
             System.out.println("Result: " + result);
     
         } catch (SQLException e) {
             e.printStackTrace();
    }
		return result;
   } 
    
    
    public static int eseguiFunzioneTartarugheMorte(int Anno) throws ClassNotFoundException {
    	int result = 0;
    	 try {
             Class.forName("org.postgresql.Driver");

             // Step 2: Establish a connection
             conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres", "1234");

             // Step 3: Create a callable statement
             cstmt = conn.prepareCall("{ ? = call numero_tartarughe_morte_all_year(?) }");

             // Step 4: Register the OUT parameter
             cstmt.registerOutParameter(1, Types.INTEGER);

             // Step 5: Set the input parameter
             cstmt.setInt(2, Anno);

             // Step 6: Execute the statement
             cstmt.execute();

             // Step 7: Get the result
             result = cstmt.getInt(1);
             System.out.println("Result: " + result);
     
         } catch (SQLException e) {
             e.printStackTrace();
    }
		return result;
   } 
    
}
