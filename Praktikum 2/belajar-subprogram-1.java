package Praktikum2;
import java.util.Scanner;
public class BelajarSubProgram {
    public static void tampil (String nama){
        System.out.println("Selamat datang, " + nama);
    }
    //--------------------------------------------------
    public static double luaspersegi (double sisi){
        double luas = sisi*sisi;
        return luas;
    }
    //--------------------------------------------------
    private double luassegitiga (double alas, double tinggi){
        double luas = (alas*tinggi)/2;
        return luas;
    }
    //--------------------------------------------------
    public static void main (String[] args){
        Scanner scn = new Scanner (System.in);
        System.out.println("Masukkan nama Anda : " );
        String n = scn.next();
        tampil (n);

        System.out.println("Masukkan panjang sisi persegi Anda : ");
        double s = scn.nextDouble();
        double l = luaspersegi(s);
        System.out.println("Luas persegi Anda adalah " + l);

        System.out.println("Selanjutnya, akan menghitung segitiga");
        System.out.println("Masukkan alas : ");
        double a = scn.nextDouble();
        System.out.println("Masukkan tinggi : ");
        double t = scn.nextDouble();
        BelajarSubProgram bs = new BelajarSubProgram();
        System.out.println("Luas segitiga Anda adalah " + bs.luassegitiga(a,t));
    }
}
