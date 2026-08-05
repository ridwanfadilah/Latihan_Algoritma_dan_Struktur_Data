package Tugas1;
import java.util.Scanner;
public class DiskonBelanja {
    public static void main (String[] args){
        Scanner scn = new Scanner (System.in);
        System.out.println("Program Menghitung Diskon");
        System.out.println("------------------------------");
        System.out.println("Masukan total belanjaan (Rp) :  ");
        long harga = scn.nextLong();
        if (harga >= 500000 )
            System.out.println("Anda mendapatkan diskon sebesar 10%");
            long x = harga * 10/100;
            long diskon = harga - x;
            System.out.println("Total harga belanja anda menjadi (Rp) : " + diskon);
        if (harga >= 250000 && harga < 500000)
            System.out.println("Anda mendapatkan diskon sebesar 5%");
            long y = harga * 5/100;
            long diskon2 = harga - y;
            System.out.println("Total harga belanja anda menjadi (Rp) : " + diskon2);
        if (harga < 250000)
            System.out.println("Anda tidak mendapatkan diskon");
        System.out.println("Program Selesai");
    }
}
