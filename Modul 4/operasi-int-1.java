package Modul4ASD_ADT;

import java.util.Scanner;
public class OperasiInt_1 {
    private static void tampil(int m){
        System.out.println("Hasilnya adalah " + m);
    }
    //------------------------------------------------
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Masukkan bilangan yang ingin anda tambahkan: ");
        System.out.println("bil_1: ");
        int x1 = scn.nextInt();
        System.out.println("bil_2: ");
        int y1 = scn.nextInt();
        int hasil_1 = x1+y1;
        tampil(hasil_1);

        System.out.println("Masukkan bilangan yang ingin anda kurangkan: ");
        System.out.println("bil_1: ");
        int x2 = scn.nextInt();
        System.out.println("bil_2: ");
        int y2 = scn.nextInt();
        int hasil_2 = x2-y2;
        tampil(hasil_2);

        System.out.println("Masukkan bilangan yang ingin anda kalikan: ");
        System.out.println("bil_1: ");
        int x3 = scn.nextInt();
        System.out.println("bil_2: ");
        int y3 = scn.nextInt();
        int hasil_3 = x3*y3;
        tampil(hasil_3);

        System.out.println("Masukkan bilangan yang ingin anda bagikan: ");
        System.out.println("bil_1: ");
        int x4 = scn.nextInt();
        System.out.println("bil_2: ");
        int y4 = scn.nextInt();
        if (y4==0)
            System.out.println("Pembaginya nol, tidak diizinkan");
        else{
            int hasil_4 = x4/y4;
            tampil(hasil_4);
        }
    }
}
