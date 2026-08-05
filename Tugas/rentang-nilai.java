package Tugas1;
import java.util.Scanner;
public class RentangNilai {
    public static void main (String[] args){
        Scanner scn = new Scanner (System.in);
        System.out.println("Program Rentang Nilai");
        System.out.println("------------------------------");
        System.out.println("Masukkan nilai anda =  ");
        float nilai = scn.nextFloat();
        if (nilai >= 0.00 && nilai < 45.00)
            System.out.println("Anda mendapatkan nilai E");
        if (nilai >= 45.00 && nilai < 55.00)
            System.out.println("Anda mendapatkan nilai D");
        if (nilai >= 55.00 && nilai < 70.00)
            System.out.println("Anda mendapatkan nilai C");
        if (nilai >= 70.00 && nilai < 85.00)
            System.out.println("Anda mendapatkan nilai B");
        if (nilai >= 85.00 && nilai <= 100.00)
            System.out.println("Anda mendapatkan nilai A");
    }
}
