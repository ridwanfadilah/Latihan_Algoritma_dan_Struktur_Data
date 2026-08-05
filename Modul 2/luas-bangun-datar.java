package Latihan2;
import java.util.Scanner;
public class LuasBangunDatar {
    //------------------------------
    static double Segitiga() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan alas :  ");
        double alas = input.nextDouble();
        System.out.println("Masukkan tinggi :  ");
        double tinggi = input.nextDouble();
        double luas = (alas * tinggi) / 2;
        System.out.println("Luasnya adalah " + luas);
        return luas;
    }
    //------------------------------
    static double PersegiPanjang(){
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan panjang :  ");
        double panjang = input.nextDouble();
        System.out.println("Masukkan lebar : ");
        double lebar = input.nextDouble();
        double luas = panjang*lebar;
        System.out.println("Luasnya adalah " + luas);
        return luas;
    }
    //------------------------------
    static double Lingkaran(){
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan jari-jari :  ");
        double r = input.nextDouble();
        double phi = 3.14;
        double luas = (phi*r)*(phi*r);
        System.out.println("Luasnya adalah " + luas);
        return luas;
    }
    //------------------------------
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("PROGRAM MENGHITUNG LUAS BANGUN DATAR");
        System.out.println("Pilih bangun datar :\n1). Segitiga\n2). Persegi panjang\n3). Lingkaran");
        int pilih = input.nextInt();
        switch (pilih){
            case 1 :
                Segitiga();
            case 2 :
                PersegiPanjang();
            case 3 :
                Lingkaran();
        }
    }
}
