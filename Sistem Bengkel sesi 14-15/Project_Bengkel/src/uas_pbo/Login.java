package uas_pbo;
import java.util.Scanner;




public  class Login {
    
    
    public static void play() throws Exception{
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("masukan id \t \t:");
        String id = sc.nextLine();
        System.out.print("masukan password \t:");
        String password = sc.nextLine();
        try {
            if (password.equals(Tools.Getpass(id))) {
                MenuMekanik.setuser(id);
                MenuMekanik.Play();
            
        }
        else{
            System.out.println("Id dan Password tidak sesuai");}
            MenuAwal.Play();
        } catch (Exception e) {
            System.out.println("ID anda tidak terdaftar");
            
        }
        
            
        }
        
        
        
    }
    

  
    

    


