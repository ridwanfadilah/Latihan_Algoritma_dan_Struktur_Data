package UTS_2_ASD;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
public class Nilai_Mahasiswa{
    //==================================================
    static void Kalkulus_I(){
        Scanner scn = new Scanner (System.in);
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukkan Jumlah Mahasiswa : ");
        int jumlah_data = scn.nextInt();
        String[] nama = new String[jumlah_data];
        int[] nilai = new int[jumlah_data];
        for (int i = 0;i < jumlah_data; i++){
            System.out.println("Nama Mahasiswa : ");
            try{nama[i] = dataIn.readLine();}
            catch(IOException e){System.out.print("ERROR");}
            System.out.println("Nilai Kalkulus I : ");
            nilai[i] = scn.nextInt();
        }
        System.out.println("==============================");
        System.out.println("Daftar Nilai Kalkulus I");
        System.out.println("==============================");
        for (int j = 0; j < jumlah_data; j++){
            System.out.print(nama[j]);
            System.out.println("\tNilai Kalkulus I : " + nilai[j]);
        }
    }
    //==================================================
    static void Kalkulus_II(){
        Scanner scn = new Scanner (System.in);
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukkan Jumlah Mahasiswa : ");
        int jumlah_orang = scn.nextInt();
        String[] name = new String[jumlah_orang];
        int[] score = new int[jumlah_orang];
        for (int i = 0;i < jumlah_orang; i++){
            System.out.println("Nama Mahasiswa : ");
            try{name[i] = dataIn.readLine();}
            catch(IOException e){System.out.print("ERROR");}
            System.out.println("Nilai Kalkulus II : ");
            score[i] = scn.nextInt();
        }
        System.out.println("==============================");
        System.out.println("Daftar Nilai Kalkulus II");
        System.out.println("==============================");
        for (int j = 0; j < jumlah_orang; j++){
            System.out.print(name[j]);
            System.out.println("\tNilai Kalkulus II : " + score[j]);
        }
    }
    //==================================================
    static void Dosen(){
        Scanner scn = new Scanner (System.in);
        System.out.println("Masukkan Nama Anda : ");
        String nama = scn.next();
        System.out.println("Input Nilai Mata Kuliah :\n1). Kalkulus I \n2). Kalkulus II \nCatatan : Pilih salah satu");
        int no = scn.nextInt();
        switch (no){
            case 1 :
                Kalkulus_I();
                break;
            case 2 :
                Kalkulus_II();
                break;
        }
    }
    //==================================================
    static void Mahasiswa(){
        Scanner scn = new Scanner (System.in);
        System.out.println("Masukkan Nama Anda : ");
        String nama = scn.next();
        System.out.println("Pilih Mata Kuliah :\n1). Kalkulus I \n2). Kalkulus II \n Pilih salah satu");
        int pilih = scn.nextInt();
        if (pilih == 1)
            System.out.println("Masukkan nilai kalkulus I yang diperoleh : ");
            float nilai = scn.nextFloat();
            if (nilai >= 0.00 && nilai < 45.00)
                System.out.println("Nilai Kalkulus I anda : E\nCatatan : Anda harus mengulang mata kuliah Kalkulus I");
            if (nilai >= 45.00 && nilai < 55.00)
                System.out.println("Nilai Kalkulus I anda : D\nCatatan : Anda harus mengulang mata kuliah Kalkulus I");
            if (nilai >= 55.00 && nilai < 70.00)
                System.out.println("Nilai Kalkulus I anda : C\nCatatan : Tidak diwajibkan mengulang mata kuliah Kalkulus I");
            if (nilai >= 70.00 && nilai < 85.00)
                System.out.println("Nilai Kalkulus I anda : B\nCatatan : Tidak diwajibkan mengulang mata kuliah Kalkulus I");
            if (nilai >= 85.00 && nilai <= 100.00)
                System.out.println("Nilai Kalkulus I anda : A\nCatatan : Tidak diwajibkan mengulang mata kuliah Kalkulus I");
        else
            System.out.println("Masukkan nilai kalkulus II yang diperoleh : ");
            float n = scn.nextFloat();
            if (n >= 0.00 && n < 45.00)
                System.out.println("Nilai Kalkulus II anda : E\nCatatan : Anda harus mengulang mata kuliah Kalkulus II");
            if (n >= 45.00 && n < 55.00)
                System.out.println("Nilai Kalkulus II anda : D\nCatatan : Anda harus mengulang mata kuliah Kalkulus II");
            if (n >= 55.00 && n < 70.00)
                System.out.println("Nilai Kalkulus II anda : C\nCatatan : Tidak diwajibkan mengulang mata kuliah Kalkulus II");
            if (n >= 70.00 && n < 85.00)
                System.out.println("Nilai Kalkulus II anda : B\nCatatan : Tidak diwajibkan mengulang mata kuliah Kalkulus II");
            if (n >= 85.00 && n <= 100.00)
                System.out.println("Nilai Kalkulus II anda : A\nCatatan : Tidak diwajibkan mengulang mata kuliah Kalkulus II");
    }
    //==================================================
    public static void main(String[] args){
        Scanner poin = new Scanner (System.in);
        System.out.println("PROGRAM NILAI MAHASISWA");
        System.out.println("------------------------------");
        System.out.println("Pilih Akses :\n1). Dosen \n2). Mahasiswa \nCatatan : Akses disesuaikan dengan status diri anda");
        int p = poin.nextInt();
        switch(p){
            case 1 :
                Dosen();
                break;
            case 2 :
                Mahasiswa();
                break;
        }
    }
}
