/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesi6.com.belajarabstrak;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        BangunDatar segitiga = new Segitiga(5,5);
        BangunDatar lingkaran = new Lingkaran(60);
        
        System.out.println("Luuas dari bangun datar segitiga: " + segitiga.getLuas());
        System.out.println("Luas dari bangun datar lingkaran: " + lingkaran.getLuas());
    }
}
