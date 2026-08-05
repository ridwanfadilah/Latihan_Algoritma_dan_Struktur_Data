package Modul4ASD_ADT;

import java.util.Scanner;
public class OperasiInt_Subprogram {
    private static void tampil(int m){
        System.out.println("Hasilnya adalah " + m);
    }
    //------------------------------------------------
    private static void tampilkan(double n) {
        System.out.println("Hasilnya adalah " + n);
    }
    //------------------------------------------------
    public static void penjumlahan(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan nilai bil_1: ");
        int x1 = scan.nextInt();
        System.out.println("Masukkan nilai bil_2: ");
        int y1 = scan.nextInt();
        int hasil_penjumlahan = x1+y1;
        tampil(hasil_penjumlahan);
    }
    //------------------------------------------------
    public static void pengurangan(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan nilai bil_1: ");
        int x2 = scan.nextInt();
        System.out.println("Masukkan nilai bil_2: ");
        int y2 = scan.nextInt();
        int hasil_pengurangan = x2-y2;
        tampil(hasil_pengurangan);
    }
    //------------------------------------------------
    public static void perkalian(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan nilai bil_1: ");
        int x3 = scan.nextInt();
        System.out.println("Masukkan nilai bil_2: ");
        int y3 = scan.nextInt();
        int hasil_perkalian = x3*y3;
        tampil(hasil_perkalian);
    }
    //------------------------------------------------
    public static void pembagian(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan nilai bil_1: ");
        double x4 = scan.nextDouble();
        System.out.println("Masukkan nilai bil_2: ");
        double y4 = scan.nextDouble();
        double hasil_pembagian = x4/y4;
        tampilkan(hasil_pembagian);
    }
    //------------------------------------------------
    public static void pangkat_1(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan nilai yang ingin dipangkatkan: ");
        int x5 = scan.nextInt();
        System.out.println("Masukkan nilai pangkat: ");
        int y5 = scan.nextInt();
        int hasil_pangkat_1 = pangkat_2(x5,y5);
        tampil(hasil_pangkat_1);
    }

    static int pangkat_2(int a, int b){
        int hasil_pangkat_2 = 0;
        if (b==0)
            return 1;
        else
            hasil_pangkat_2 = pangkat_2(a, b-1) * a;
            return hasil_pangkat_2;
    }
    //------------------------------------------------
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("pilih menu: ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Pangkat");
        int menu = scan.nextInt();
        if (menu==1)
            penjumlahan();
        if (menu==2)
            pengurangan();
        if (menu==3)
            perkalian();
        if (menu == 4)
            pembagian();
        if (menu == 5)
            pangkat_1();
        else {
            System.out.println("Program Selesai");
        }
    }
}
