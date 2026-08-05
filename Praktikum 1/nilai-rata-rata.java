package Praktikum1;
import java.util.Scanner;
public class NilaiRataRata {
    public static void main (String[] args){
        Scanner scn = new Scanner (System.in);
        System.out.println("Program Menghitung Nilai Rata-Rata");
        System.out.println("------------------------------");
        System.out.println("Masukkan banyaknya nilai yang ingin di input :  ");
        int n = scn.nextInt();
        double y = 0;
        for (int i = 1; i <= n; i++){
            System.out.println("Masukkan nilai ke-" + i + ":  ");
            double x = scn.nextDouble();
            y = x + y;
        }
        double hasil = y / n;
        System.out.println("Rata-rata =  " + hasil);
        System.out.println("Program Selesai");
    }
}
