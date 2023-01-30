/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_pbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



/**
 *
 * @author HP
 */
public class getmekanik  {
    
    static final String jdbc = "com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost/ars";
    static final String username ="root";
    static final String password ="";
    
    static Connection con;
    static ResultSet rs;
    static PreparedStatement ps;
    static Statement state;
    
    public static void getIndex( String prime) throws Exception {
        int no = 0;
        
        
      try{
          Class.forName(jdbc);
          con = DriverManager.getConnection(url, username, password);
          //state = con.createStatement();
          
          String query = "select * from ?";
          ps = con.prepareStatement(query);
          rs = state.executeQuery(query);
          ps.setString(1, prime );
          
          
          
          while(rs.next()){
              no++;
          }
          
        }
        catch(Exception ex){
            ex.printStackTrace();
            
            
        }
      MenuMekanik.Play();
        
    }
    
    
    
}
