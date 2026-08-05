package Praktikum3;
import java.util.Scanner;
public class BangunDatar_2 {
    public static void main (String[] args){
        Scanner msk = new Scanner (System.in);
        System.out.println("Menghitung Luas dan Keliling Lingkaran");
        Lingkaran baru = new Lingkaran();
        System.out.println("Luas Lingkaran berjari-jari 7 : "+ baru.getLuas());
        System.out.println("Keliling Lingkaran berjari-jari 7 : " + baru.getKel());
        System.out.println(" ");
        System.out.println("Kali ini, masukkan nilai jari-jari anda sendiri : ");
        System.out.println("Masukkan nilai jari-jari : ");
        double jari = msk.nextDouble();
        Lingkaran baru2 = new Lingkaran (jari);
        System.out.println("Luas lingkaran berjari-jari " + jari + "adalah " + baru2.Luas(jari));
        System.out.println("Keliling Lingkaran berjari-jari " + jari + "adalah " + baru2.Keliling(jari));
    }
}
