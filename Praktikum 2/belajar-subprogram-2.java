package Praktikum2;
import java.util.Scanner;
public class BelajarSubProgram2 {
    public static void main (String[] args){
        Scanner scn = new Scanner (System.in);
        System.out.println("Masukkan nama Anda : " );
        String n = scn.next();
        BelajarSubProgram ct = new BelajarSubProgram();
        ct.tampil(n);

        System.out.println("Masukkan panjang sisi persegi Anda : ");
        double s = scn.nextDouble();
        double l = ct.luaspersegi(s);
        System.out.println("Luas persegi Anda adalah " + l);
    }
}
