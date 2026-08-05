package Modul4ASD_ADT;

import java.util.Scanner;
public class OperasiIntApp {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        OperasiInt opi = new OperasiInt();

        System.out.println("Masukkan bilangan yang ingin anda tambahkan: ");
        System.out.println("bil_1: ");
        int x = scn.nextInt();
        System.out.println("bil_2: ");
        int y = scn.nextInt();
        opi.sum(x,y);
        opi.display();

        System.out.println("Masukkan bilangan yang ingin anda kurangkan: ");
        System.out.println("bil_1: ");
        int x1 = scn.nextInt();
        System.out.println("bil_2: ");
        int y1 = scn.nextInt();
        opi.diff(x1,y1);
        opi.display();

        System.out.println("Masukkan bilangan yang ingin anda kalikan: ");
        System.out.println("bil_1: ");
        int x2 = scn.nextInt();
        System.out.println("bil_2: ");
        int y2 = scn.nextInt();
        opi.multi(x2,y2);
        opi.display();

        System.out.println("Masukkan bilangan yang ingin anda bagi: ");
        System.out.println("bil_1: ");
        int x3 = scn.nextInt();
        System.out.println("bil_2: ");
        int y3 = scn.nextInt();
        boolean l = opi.div(x3,y3);
        if (l==true)
            opi.display();
        else
            System.out.println("Pembagian dengan nol, tidak diizinkan");

        System.out.println("Masukkan bilangan yang ingin anda pangkatkan: ");
        System.out.println("Masukkan nilai yang ingin dipangkatkan: ");
        int x4 = scn.nextInt();
        System.out.println("Masukkan nilai pangkat: ");
        int y4 = scn.nextInt();
        opi.pangkat(x4,y4);
        opi.display();
    }
}
