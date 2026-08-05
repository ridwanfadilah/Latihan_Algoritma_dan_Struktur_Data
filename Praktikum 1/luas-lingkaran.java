package Praktikum1;
import java.util.Scanner;
public class LLingkaran {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Program Luas Lingkaran");
        System.out.println("------------------------------");
        System.out.println("Masukkan nilai jari-jari :  ");
        double r = scn.nextDouble();
        double phi = 3.14;
        double L = phi * (r*r);
        System.out.println("Nilai lingkaran = " + L);
        System.out.println("Program Selesai");
    }
}
