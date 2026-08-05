package Modul3ASD_PBO;

import java.util.Scanner;
public class BangunDatar1 {
    public static void menu(){
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga Siku-Siku");
        System.out.println("3. Lingkaran");
    }
    public static void garis(){
        for (int i=1; i<=30; i++)
            System.out.print("-");
        System.out.println();
    }
    //-----------------------------------------
    public static void tampil(double lu){
        System.out.println("Luasnya adalah " +lu);
    }
    //-----------------------------------------
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        menu();
        System.out.println("Pilihan anda : ");
        int p = scn.nextInt();
        if (p==1){
            garis();
            System.out.println("Menghitung Luas Persegi");
            garis();
            Persegi pi = new Persegi();
            System.out.print("Masukkan panjang sisi persegi anda: ");
            int s = scn.nextInt();
            pi.setSisi(s);
            tampil(pi.luas());
        }
        else if (p==2){
            garis();
            System.out.println("Menghitung Luas Segitiga Siku-Siku");
            garis();
            Segitiga si = new Segitiga();
            System.out.println("Masukkan alas : ");
            int a = scn.nextInt();
            si.setAlas(a);
            System.out.println("Masukkan tinggi : ");
            int t = scn.nextInt();
            si.setTinggi(t);
            tampil(si.luas());
        }
        else{
            garis();
            System.out.println("Menghitung Luas Lingkaran");
            garis();
            System.out.println("Masukkan jari-jari : ");
            double r = scn.nextDouble();
            Lingkaran li = new Lingkaran();
            tampil(li.Luas(r));
        }
        garis();
        System.out.println("Terimakasih....");
    }
}
