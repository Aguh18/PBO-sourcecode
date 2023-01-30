package uas_pbo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.util.UUID;


public class ToolsMekanik {
   
    static final String jdbc = "com.mysql.cj.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost/ars";
    static final String username ="root";
    static final String password ="";
    
    static Connection con;
    static ResultSet rs;
    static PreparedStatement ps;

    public static void pencatatan( String user) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nama barang \t:");
        String namaBArang = sc.nextLine();
        System.out.println("MAsukan Quantitas\t:");
        int qty = sc.nextInt();
        

       
      try{
          Class.forName(jdbc);
          con = DriverManager.getConnection(url, username, password);
          String query = "insert into tbl_transaksi values(?,?,current_timestamp(),?,?)";
          ps = con.prepareStatement(query);
          ps.setString(1, ToolsMekanik.GenerateID());
          ps.setString(2, user);
          ps.setString(3, Tools.getKodebarang(namaBArang));
          ps.setInt(4, qty);
          
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
        
    }

    public static String GenerateID(){
        String id = "";
        for (int i = 0; i < 7; i++) {
            UUID gfh = UUID.randomUUID();
            id += gfh.toString().charAt(i);
            
        }
        return id;
    }

}