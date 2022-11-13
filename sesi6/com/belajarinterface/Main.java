/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesi6.com.belajarinterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Laptop thinkpad = new Lenovo();
        LaptopUser andri = new LaptopUser(thinkpad);
        
        Scanner in = new Scanner(System.in);
        System.out.println("Gunakan laptop");
        
        while(true){
            System.out.print("ngapain? ON/OFF/UP/DOWN/OUT: ");
            String input = in.nextLine();
            if(input.equals("OUT")){
                System.out.println("laptop tidak digunakan");
                break;
            }
            gunakanLaptop(andri, input);
        }
        
    }
    
    public static void gunakanLaptop(LaptopUser laptop, String input){
        if(input.equals("ON")){
            laptop.turnOnLaptop();
        }
        else if(input.equals("OFF")){
            laptop.turnOffLaptop();
        }
        else if(input.equals("UP")){
            laptop.makeLaptopLouder();
        }
        else if(input.equals("DOWN")){
            laptop.makeLaptopSilence();
        }
    }
}
