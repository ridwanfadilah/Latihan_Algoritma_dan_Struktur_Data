package Praktikum5;
import java.util.Scanner;
public class OperasiIntApp {
    public static void main (String[] args){
        Scanner scn = new Scanner (System.in);
        OperasiInt_2 opi = new OperasiInt_2();
        //membuat objek OperasiInt_2 bernama opi

        System.out.println("Masukkan bilangan yang ingin anda tambahkan :");
        System.out.println("bil_1 :  ");
        int x1 = scn.nextInt();
        System.out.println("bil_2 :  ");
        int y1 = scn.nextInt();
        opi.sum (x1,y1);
        opi.display();

        System.out.println("Masukkan nilai yang ingin anda kurangkan :");
        System.out.println("bil_1 :  ");
        int x2 = scn.nextInt();
        System.out.println("bil_2 :  ");
        int y2 = scn.nextInt();
        opi.diff (x2,y2);
        opi.display();

        System.out.println("Masukkan nilai yang ingin anda kalikan :");
        System.out.println("bil_1 :  ");
        int x3 = scn.nextInt();
        System.out.println("bil_2 :  ");
        int y3 = scn.nextInt();
        opi.multi (x3,y3);
        opi.display();

        System.out.println("Masukkan nilai yang ingin anda bagikan :");
        System.out.println("bil_1 :  ");
        int x4 = scn.nextInt();
        System.out.println("bil_2 :  ");
        int y4 = scn.nextInt();
        boolean l = opi.div(x4,y4);
        if (l==true)
            opi.display();
        else
            System.out.println("Pembagian dengan nol, tidak diizinkan");
    }
}
