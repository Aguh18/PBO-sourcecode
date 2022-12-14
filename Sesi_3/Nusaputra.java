package Sesi_3;
import java.util.ArrayList;
import java.util.Scanner;

public class Nusaputra extends Mahasiswa {

    Nusaputra(String nama, String nim, int nilai){
        super(nama, nim, nilai);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList <Mahasiswa> mhs = new ArrayList<>();
        ArrayList <Mahasiswa> lulus = new ArrayList<>();
        ArrayList <Mahasiswa> tidaklulus = new ArrayList<>();
        

        for (int i = 0; i < 4; i++) {
            System.out.print("isikan NIM: ");
            String nim = sc.nextLine();
            
            System.out.print("isikan Nama: ");
            String nama = sc.nextLine();

            System.out.print("isikan nilai: ");
            int nilai = Integer.parseInt(sc.nextLine());
            
            mhs.add(new Mahasiswa(nama, nim, nilai));
            if((mhs.get(i).getGrade().compareTo("A") == 0) || (mhs.get(i).getGrade().compareTo("B") == 0) || (mhs.get(i).getGrade().compareTo("C") == 0)){
                lulus.add(new Mahasiswa(nama, nim, nilai));
            }
            else{
                tidaklulus.add(new Mahasiswa(nama, nim, nilai));
            }
            System.out.println("===================================");
        }

        //print tiap mahasiswa 
        for(int i = 0; i < 4; i++){
            mhs.get(i).infoMahasiswa();
        }
        System.out.println("jumlah mahasiswa : " + mhs.size());
        System.out.print("jumlah mahasiswa yang lulus : ");
        printMhs(lulus);
        System.out.print("jumlah mahasiswa yang tidak lulus: ");
        printMhs(tidaklulus);
        printNilai(mhs, "A");
        printNilai(mhs, "B");
        printNilai(mhs, "C");
        printNilai(mhs, "D");
        printNilai(mhs, "E");
        System.out.println();
        System.out.println("rata rata nilai: ");
        rataRata(mhs);
        
        sc.close();
    }

    public static void printMhs(ArrayList<Mahasiswa> mhs){
        System.out.print(mhs.size() + " yaitu ");
        for (int i = 0; i < mhs.size(); i++) {
            System.out.print(mhs.get(i).getNama() + ", ");
        }
        System.out.println();

    }

    public static void printNilai(ArrayList<Mahasiswa> mhs, String nilai){
        if(jumlahGrade(mhs, nilai) > 0){
            System.out.println();
            System.out.print("Jumlah mahasiswa dengan nilai " + nilai +  " : " + jumlahGrade(mhs, nilai) + " yaitu ");
        }
        
        for(int i = 0; i < mhs.size(); i++){
            if(mhs.get(i).getGrade().equals(nilai)){
                System.out.print(mhs.get(i).getNama() + ", ");
            }
        }
    }

    public static int jumlahGrade(ArrayList<Mahasiswa> mhs, String nilai){
        int jumlah = 0;
        for(int i = 0; i < mhs.size(); i++){
            if(mhs.get(i).getGrade().equals(nilai)){
                jumlah++;       
            }
        }
        return jumlah;
    }

    public static float rataRata(ArrayList<Mahasiswa> mhs){
        System.out.println();
        int jumlah = 0;
        for(int i = 0; i < mhs.size(); i++){
            if(mhs.get(i).getNilai() <= 100 && mhs.get(i).getNilai() >= 0){
                jumlah += mhs.get(i).getNilai();
                System.out.print(mhs.get(i).getNilai() + " + ");
            }
            else{
                System.out.println("0 + ");
            }
        }

        System.out.print(" = " + (float)jumlah/mhs.size());

        return jumlah / mhs.size();
    }


    
}
