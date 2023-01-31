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
import java.util.UUID;




public class Tools {
    static final String jdbc = "com.mysql.cj.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost/ars";
    static final String username ="root";
    static final String password ="";
    
    static Connection con;
    static ResultSet rs;
    static PreparedStatement ps;
    static Statement state;
    
    public static int getIndex( String prime) throws Exception{
        int no = 0;
      Class.forName(jdbc);
          con = DriverManager.getConnection(url, username, password);
          //state = con.createStatement();
          
          String query = "select * from ?";
          ps = con.prepareStatement(query);
          ps.setString(1, prime );
          rs = ps.executeQuery();
          
          
          
          while(rs.next()){
              no++;
              
    }
          return no;
    
    }
    public static void Showhistori() throws Exception {
        int no = 0;
        
      try{
          Class.forName(jdbc);
          con = DriverManager.getConnection(url, username, password);
          state = con.createStatement();
          String query = "select * from tbl_transaksi";
          rs = state.executeQuery(query);
          
          
          while(rs.next()){
              no++;
              System.out.println("no :" + no);
              System.out.println("kode faktur \t :" + rs.getString(1));
              System.out.println("id Admin \t :" + rs.getString(2));
              System.out.println("tanggal \t :" + rs.getDate(3));
              System.out.println("Kode part \t :" + rs.getString(4));
               System.out.println("Kode part \t :" + rs.getInt(5));
              System.out.println("----------------------------------------------");
          }
          
        }
        catch(Exception ex){
            ex.printStackTrace();
            
            
        }
      MenuMekanik.Play();
        
    }
    public static void deleteSparepart() throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Kode Barang Yang Akan Dihapus");
        String kode_barang = sc.next();
        
      try{
          Class.forName(jdbc);
          con = DriverManager.getConnection(url, username, password);
          String query = "delete from tbl_sparepart where Kode_part = ?";
          
          ps = con.prepareStatement(query);
          ps.setString(1,kode_barang);
          
          
          if(ps.executeUpdate()>0){
              System.out.println("Proses Hapus Data Berhasil");
          }
          else{
              System.out.println("Proses Gagal");
          }
          
          
          
          
        }
        catch(Exception ex){
            
          System.out.println("Masih dalam pengembangan");
            
            
            MenuMekanik.Play();
            
        }
      MenuMekanik.Play();
    }

    
    
    //untuk insert data ke tabel part
    public static void insertPart() throws Exception{
        Scanner sc = new Scanner(System.in);    
        System.out.print(" kode Barang \t:");
        String kode_barang = sc.next();
        System.out.print(" Nama Barang \t:");
        String nama_barang = sc.next();
        System.out.print(" Harga Barang \t:");
        int harga_barang = sc.nextInt();
        System.out.print(" Stok Barang \t:");
        int stok = sc.nextInt();
        
      try{
          Class.forName(jdbc);
          con = DriverManager.getConnection(url, username, password);
          //state = con.createStatement();
          String query = "insert into tbl_sparepart values(?,?,?,?)";
          ps = con.prepareStatement(query);
          ps.setString(1, kode_barang);
          ps.setString(2, nama_barang);
          ps.setInt(3, harga_barang);
          ps.setInt(4, stok);
          
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
            System.out.println("proses insert tidak berhasil");
            MenuMekanik.Play();
            
            
        }}
    public static void ShowSparepart() throws Exception {
        int no = 0;
        
      try{
          Class.forName(jdbc);
          con = DriverManager.getConnection(url, username, password);
          state = con.createStatement();
          String query = "select * from tbl_sparepart";
          rs = state.executeQuery(query);
          
          
          while(rs.next()){
              no++;
              System.out.println("no :" + no);
              System.out.println("Kode Barang :" + rs.getString(1));
              System.out.println("Nama Barang :" + rs.getString(2));
              System.out.println("Harga Barang :" + rs.getInt(3));
              System.out.println("Stok Barang :" + rs.getInt(4));
              System.out.println("----------------------------------------------");
          }
          
        }
        catch(Exception ex){
            ex.printStackTrace();
            
            
        }
      MenuMekanik.Play();
        
    }
    
    public static void update() throws Exception{
   
        Scanner sc = new Scanner(System.in);    
        System.out.print(" kode Barang \t:");
        String kode_barang = sc.next();
        System.out.print(" Nama Barang \t:");
        String nama_barang = sc.next();
        System.out.print(" Harga Barang \t:");
        int harga_barang = sc.nextInt();
        System.out.print(" stok Barang \t:");
        int stok = sc.nextInt();
        
      try{
          Class.forName(jdbc);
          con = DriverManager.getConnection(url, username, password);
          //state = con.createStatement();
          String query = "update tbl_sparepart set Kode_part=?, Nama_part=?, Harga=?, stok=? where Kode_part=?";
          ps = con.prepareStatement(query);
          ps.setString(1, kode_barang);
          ps.setString(2, nama_barang);
          ps.setInt(3, harga_barang);
          ps.setInt(4, stok);
          ps.setString(5, kode_barang);
          
          if(ps.executeUpdate()>0){
              System.out.println("Proses Update Berhasil");
          }
          else{
              System.out.println("Proses Gagal");
          }          
        }
        catch(Exception ex){
  
            ex.printStackTrace();
            
            
            
        }
      MenuMekanik.Play();
    }
    public static String Getpass(String id) throws Exception{
        Class.forName(jdbc);
        con = DriverManager.getConnection(url, username, password);
        
        String query = "SELECT password FROM tbl_akun_mekanik WHERE id = ?";
        ps = con.prepareStatement(query);
        ps.setString(1, id);
        rs = ps.executeQuery();

        if(!rs.next()){
            return null;
            
        }
        else{
            return rs.getString(1).toString();
        }    
    }
    public static void pencatatan(String user) {
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
          ps.setString(1, Tools.GenerateID());
          ps.setString(2, user);
          ps.setString(3, Tools.getKodebarang(namaBArang));
          ps.setInt(4, qty);
          
          if(ps.executeUpdate()>0){
              System.out.println("Proses Insert Berhasil");
          }
          else{
              System.out.println("Proses Gagal");
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

        public static int getangka() throws Exception {
            int no = 0;
            
          try{
              Class.forName(jdbc);
              con = DriverManager.getConnection(url, username, password);
              state = con.createStatement();
              String query = "select * from tbl_sparepart";
              rs = state.executeQuery(query);
              
              
              while(rs.next()){
                  no++;
              }
              
            }
            catch(Exception ex){
                
                
                
            }
          return no;
            
        }
         
    public static void cariSparepart() {
        int no = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cari Nama Barang");
        String nama_barang = sc.next();
        
        
      try{
          Class.forName(jdbc);
          con = DriverManager.getConnection(url, username, password);
          //state = con.createStatement();
          String query = "select * from tbl_sparepart where Nama_part like ?";
          ps = con.prepareStatement(query);
          ps.setString(1,"%" + nama_barang + "%");
          
          rs = ps.executeQuery();
          
          
          while(rs.next()){
              no++;
              System.out.println("no :" + no);
              System.out.println("Kode Barang :" + rs.getString(1));
              System.out.println("Nama Barang :" + rs.getString(2));
              System.out.println("Kode Barang :" + rs.getInt(4));
              System.out.println("Stok Barang :" + rs.getInt(4));
              System.out.println("----------------------------------------------");
              
          }
          System.out.println("jumlah barang yang muncul adalah"+ no);
          MenuMekanik.Play();

          
        }
        catch(Exception ex){
            ex.printStackTrace();
           
            
        }
       
        
    }
    public static String getKodebarang(String namabarang)  {
        Scanner sc = new Scanner(System.in);
    
        String kode = "";
        
      try{
          Class.forName(jdbc);
          con = DriverManager.getConnection(url, username, password);
          String query = "select Kode_part from tbl_sparepart where Nama_part like ?";
          ps = con.prepareStatement(query);
          ps.setString(1, namabarang  );
          
          rs = ps.executeQuery();
          
          
          while(rs.next()){
              kode = rs.getString(1).toString();
       
              
          }

          

          
        }
        catch(Exception ex){
            ex.printStackTrace();
           
            
        }
        return kode;
    }


}