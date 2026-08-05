package Praktikum1;
import java.util.Scanner;
public class Percabangan {
    public static void main (String[] args){
        Scanner scn = new Scanner (System.in);
        System.out.println("Program Tes Jenis Bilangan");
        System.out.println("------------------------------");
        System.out.println("Masukkan angka :  ");
        int angka = scn.nextInt();
        if (angka %2 == 0)
            System.out.println("Angka Genap");
        else
            System.out.println("Angka Ganjil");
        System.out.println("Program Selesai");
    }

}
