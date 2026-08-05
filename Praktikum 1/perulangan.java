package Praktikum1;
import java.util.Scanner;
public class Perulangan {
    public static void main (String[] args){
        Scanner scn = new Scanner (System.in);
        System.out.println("Program Pengulangan");
        System.out.println("------------------------------");
        System.out.println("Masukkan jumlah angka pengulangan :  ");
        int ulang = scn.nextInt();
        for (int i = 1; i <= ulang; i++){
            System.out.println(i + ". lompat");
        }
        System.out.println("Program Selesai");
    }
}
