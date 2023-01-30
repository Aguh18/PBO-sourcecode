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
import java.util.Scanner;



/**
 *
 * @author HP
 */
public class insertke {
    static final String jdbc = "com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost/ars";
    static final String username ="root";
    static final String password ="";
    
    static Connection con;
    static ResultSet rs;
    static PreparedStatement ps;
    static Statement state;
    
    
    public static void pencatatan(String user){
        Scanner sc = new Scanner(System.in);
          System.out.println("pembelian pelanggan");
            System.out.println("------------------------------------");
            System.out.println("Masukan nama kodefaktur \t:");
            String kodefaktur = sc.nextLine();
            System.out.println("Masukan nama barang \t:");
            String barang = sc.nextLine();
            System.out.println("masukan quantitas");
            int qty = sc.nextInt();
        
      try{
          Class.forName(jdbc);
          con = DriverManager.getConnection(url, username, password);
          //state = con.createStatement();
          String query = "INSERT INTO tbl_transaksi (no_faktur,Kode_part,kuantitas,id) VALUES (?,?,?,?)";
;
          ps = con.prepareStatement(query);
          ps.setString(1,kodefaktur );
          ps.setString(2, barang);
          ps.setInt(3, qty);
          ps.setString(4,user );
          
          
          if(ps.executeUpdate()>0){
              System.out.println("Proses Insert Berhasil");
              MenuMekanik.Play();
          }
          else{
              System.out.println("Proses Gagal");
              MenuMekanik.Play();
          }          
        }
        catch(Exception ex){
            ex.printStackTrace();
            
            
        }
    sc.close();}
}
