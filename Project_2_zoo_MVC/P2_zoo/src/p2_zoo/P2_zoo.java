/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_zoo;
import java.sql.*;
import java.util.logging.*;
import java.io.Serializable;

/**
 *
 * @author Tomng
 */
public class P2_zoo {

    /**
     * @param args the command line arguments
     */
    
    
       
    
    
       public static void main(String[] args) throws SQLException {

        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

        String user = "root";
        String pass = "root";

        try {
            // 1. Get a connection to database
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zoo_db", user, pass);

            // 2. Create a statement
            myStmt = myConn.createStatement();

            // 3. Execute SQL query
            myRs = myStmt.executeQuery("select * from main_tb");

            // 4. Process the result set
            while (myRs.next()) {
                System.out.println(myRs.getString("id") + ", " + myRs.getString("name") 
                      + ", " + myRs.getString("location")+ ", " + myRs.getString("sex")
                      + ", " + myRs.getString("last_feeding")
                                                );
            //Method: latestFeed()    
                
                
            
            
            }

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            if (myRs != null) {
                myRs.close();
            }

            if (myStmt != null) {
                myStmt.close();
            }

            if (myConn != null) {
                myConn.close();
            }
        }
    
    
    }
       
       
}