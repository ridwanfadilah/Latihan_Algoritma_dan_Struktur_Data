package Modul3ASD_PBO;

import java.util.Scanner;
public class BangunDatar2 {
    public static void garis() {
        for (int i=1; i<=30; i++)
            System.out.print("-");
        System.out.println();
    }
    //----------------------------------------------
    public static void menu(){
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga siku-siku");
        System.out.println("3. Lingkaran");
    }
    //----------------------------------------------
    public static double lingkaran(double jari){
        final double pi = 3.14;
        double luas = pi*Math.pow(jari,2);
        return luas;
    }
    //----------------------------------------------
    public static void tampil(double lu){
        System.out.println("Luasnya adalah " + lu);
    }
    //----------------------------------------------
    public static double persegi(double sisi){
        double luas = sisi*sisi;
        return luas;
    }
    //----------------------------------------------
    public static double segitiga(double alas, double tinggi){
        double luas = (alas*tinggi)/2;
        return luas;
    }
    //----------------------------------------------
    private static double SisiMiring(double alas, double tinggi){
        double simir = Math.sqrt(alas*alas+tinggi*tinggi);
        return simir;
    }
    //==============================================
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        menu();
        System.out.print("Pilihan anda : ");
        int p = scn.nextInt();
        if (p==1){
            garis();
            System.out.println("Menghitung Luas Persegi");
            garis();
            System.out.println("Masukkan panjang sisi persegi anda :");
            double s = scn.nextDouble();
            double l = persegi(s);
            tampil(l);
        }
        else if (p==2){
            garis();
            System.out.println("Menghitung Luas Segitiga Siku-Siku");
            garis();
            System.out.println("Masukkan alas :");
            double a = scn.nextDouble();
            System.out.println("Masukkan tinggi :");
            double t = scn.nextDouble();
            double l = segitiga(a,t);
            tampil(l);
        }
        else{
            garis();
            System.out.println("Menghitung Luas Lingkaran");
            garis();
            System.out.println("Masukkan jari-jari :");
            double r = scn.nextDouble();
            double l = lingkaran(r);
            tampil(l);
        }
        garis();
        System.out.println("Terimakasih....");
    }
}
