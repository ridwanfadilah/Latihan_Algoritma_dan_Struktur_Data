package Latihan1;
import java.util.Scanner;
public class LSegitiga {
    public static void main (String[] args){
        Scanner scn = new Scanner (System.in);
        System.out.println("Program Luas Segitiga");
        System.out.println("------------------------------");
        System.out.println("Masukkan nilai alas :  ");
        float alas = scn.nextFloat();
        System.out.println("Masukkan nilai tinggi :  ");
        float tinggi = scn.nextFloat();
        float hasil = (alas*tinggi)/2;
        System.out.println("Luas segitiga =  " + hasil);
    }
}
