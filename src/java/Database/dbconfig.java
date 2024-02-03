
package Database;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException;


public class dbconfig {

   
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        
        String url = "jdbc:mysql:// localhost:3306/userinfo";
        String username = "ServletJDBC";
        String password = "ServletJDBC";
        
        // class loader
           Class.forName("com.mysql.jdbc.Driver");
          Connection conn = DriverManager.getConnection(url,username,password);
           
        // create connection
        
        
        return conn;
    }
        
}
