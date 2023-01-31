/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_pbo;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class MenuMekanik {
    
    
    
    static String user;
    public static void setuser(String id){
        user = id;
        
    
    }
    
    
    public static void Play() throws Exception{
        Scanner sc = new Scanner(System.in);
         System.out.println("Menu Mekanik");
         System.out.println("[-----------------------------------");
         System.out.println("ID mekanik "+ user);
        System.out.println("[-----------------------------------");
        System.out.println("1.Edit data sparepart");
        System.out.println("2.transaksi ");
        System.out.println("3 logout");
        System.out.println("[-----------------------------------");
        System.out.print("Masukan pilihan \t");
        int pil = sc.nextInt();
        
        if (pil == 1) {
            
        System.out.println("Menu Mekanik");
        System.out.println("ID mekanik"+ user);
        System.out.println("------------------------------------");
        System.out.println("1.show data sparepart");
        System.out.println("2.insert data sparepart");
        System.out.println("3.delete data sparepart");
        System.out.println("4.update data sparepart ");
        System.out.println("5.cari barang");
        System.out.println("6.Kembali");
        System.out.println("------------------------------------");
        System.out.print("Masukan pilihan \t");
         pil = sc.nextInt();
        
        
        if (pil == 1) {
            Tools.ShowSparepart();
        }
        else if (pil == 2) {
            Tools.insertPart();
            
        }
        else if (pil == 3) {
            Tools.deleteSparepart();
            
        }
        else if (pil == 4) {
            Tools.update();
            
        }
        else if (pil == 5) {
                Tools.cariSparepart();
            }
        else if (pil == 6) {
            MenuMekanik.Play();
            
        }
        else{ System.out.println("pilihan yang anda masukan salah");  }
        }
        
        else if (pil == 2){
            
            System.out.println("------------------------------------");
            System.out.println("1.Masukan Transaksi");
            System.out.println("2.lihat histori transaksi");
            System.out.println("3.Back");
            System.out.println("------------------------------------");
            System.out.print("Masukan pilihan \t:");
            pil = sc.nextInt();
            
            if (pil == 1) {
                ToolsMekanik.pencatatan(user);
            }
            else if (pil == 2) {
                Tools.Showhistori();
                
            }
            else if (pil == 3){
                MenuMekanik.Play();
            }
            else{System.out.println("masukan tidak valid");
            MenuMekanik.Play();
            
            }
            
            
            
            
        }
        else if (pil == 3) {
            System.out.println("logout berhasil");
            MenuAwal.Play();
            
        }
        else  {
            System.out.println("input salah ");
            MenuMekanik.Play();
        }
        
        
        
       
    }
    
}
