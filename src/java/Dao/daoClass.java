
package Dao;

import java.sql.*;
import java.sql.Connection;
import Database.dbconfig;
import java.sql.PreparedStatement;

public class daoClass implements daoInterface{

    @Override
    public int isValid(String email, String password) {
        String query = "select * from profile where email = ? and password = ?";
        try(Connection conn =dbconfig.getConnection()){
           PreparedStatement pstm = conn.prepareStatement(query);
           pstm.setString(1, email);
           pstm.setString(2, password);
           
           ResultSet res = pstm.executeQuery();          
           return (res.next())?1:0;            
        }
        catch(Exception e){
           e.printStackTrace();
            return 0;
        }       
    }

    @Override
    public int addUser(pojoUser user) {
        
        String username = user.getUsername();
        String email= user.getEail();
        String password = user.getPassword();
      String query = "insert into profile values(?,?,?)";
      
      try(Connection conn=dbconfig.getConnection()){
          PreparedStatement pstm = conn.prepareStatement(query);
          pstm.setString(1, username);
          pstm.setString(2, email);
          pstm.setString(3,password);
          
          pstm.executeUpdate();
          return 1;
      }
      catch(Exception e){
          e.printStackTrace();
          return 0;
    }
    
}
}