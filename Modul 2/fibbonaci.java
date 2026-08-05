package Latihan2;
import java.util.Scanner;
public class Fibbonaci {
    public static void main (String[] args){
        Scanner scn = new Scanner (System.in);
        System.out.println("PROGRAM MENAMPILKAN DERET FIBBONACI");
        System.out.println("Masukkan banyaknya suku yang ingin ditampilkan :  ");
        int suku = scn.nextInt();
        int i = 1, a = 0, b = 1;
        for (i = 1; i <= suku; i++){
            System.out.print(a + " , ");
            int hasil = a + b;
            a = b;
            b = hasil;
        }
        System.out.println("Program Selesai");
    }
}
