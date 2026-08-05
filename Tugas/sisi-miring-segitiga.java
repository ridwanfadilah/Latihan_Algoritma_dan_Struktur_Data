package Tugas1;
import java.util.Scanner;
public class SisiMiringSegitiga {
    public static void main (String[] args){
        Scanner scn = new Scanner (System.in);
        System.out.println("Program Menghitung Sisi Miring Segitiga");
        System.out.println("------------------------------");
        System.out.println("Masukkan panjang sisi a =  ");
        float a = scn.nextFloat();
        System.out.println("Masukkan panjang sisi b =  ");
        float b = scn.nextFloat();
        double c = Math.sqrt ( Math.pow(a,2) + Math.pow(b,2) );
        System.out.println("Nilai sisi miring c adalah =  " + c );
    }
}
