package Latihan1;
import java.util.Scanner;
public class AnalisisAngka {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Program Analisis Angka");
        System.out.println("------------------------------");
        System.out.println("Masukkan angka :  ");
        float angka = scn.nextInt();
        if (angka %2 == 0)
            if (angka < 0)
                System.out.println("Angka " + angka + " adalah bilangan genap negatif");
            else if (angka == 0)
                System.out.println("Angka " + angka + " adalah bilangan nol");
            else if (angka > 0)
                System.out.println("Angka " + angka + " adalah bilangan genap positif");
        if (angka %2 == 1)
            System.out.println("Angka " + angka + " adalah bilangan ganjil positif");
        if (angka %2 == -1)
            System.out.println("Angka " + angka + " adalah bilangan ganjil negatif");
        System.out.println("Program Selesai");
    }
}
