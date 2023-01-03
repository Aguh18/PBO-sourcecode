package sesi9;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Makanan {

    public static void main(String[] args) {
        ArrayList<String> makanan = new ArrayList<>();
        ArrayList<Integer> harga = new ArrayList<>();

        makanan.add("Seblak");
        harga.add(5000);
        makanan.add("Mie Ayam");
        harga.add(10000);
        makanan.add("baso");
        harga.add(10000);
        makanan.add("Batagor");
        harga.add(5000);
        
        System.out.println("MENU MAKANAN");
        for (int i = 0; i < makanan.size(); i++) {
            System.out.println(makanan.get(i) + " : Rp. " + harga.get(i));
        }

    }
}
