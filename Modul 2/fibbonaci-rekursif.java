package Latihan2;
import java.util.Scanner;
public class FibbonaciRekursif {
    static int fibo(int u){ //bagian fungsi rekursif
        if(u==0 || u==1){
            return u;
        }
        else{
            return(fibo(u-1) + fibo(u-2));
        }
    }
    public static void main(String[] args){
        System.out.println("PROGRAM MENAMPILKAN DERET FIBBONACI MENGGUNAKAN FUNGSI REKURSIF");
        System.out.println("----------------------------------------");
        int i, j = 0;
        Scanner jml = new Scanner(System.in);
        System.out.println("Masukkan banyaknya suku yang ingin ditampilkan = ");
        int u = jml.nextInt();
        for(i=0; i<=u; i++){
            System.out.println(fibo(j) + " + ");
            j++;
        }
        System.out.println("Program Selesai");
    }

    public static class Kalkulus_1 {
        public Kalkulus_1 (int j){
            Scanner scn = new Scanner (System.in);
            String[] nama = new String[j];
            int[] nilai = new int[j];
            for (int i = 0; i < j; i++){
                System.out.println("Nama Mahasiswa : ");
                nama[i] = scn.next();
                System.out.println("Nilai Kalkulus 1 : ");
                nilai[i] = scn.nextInt();
            }
        }

    }
