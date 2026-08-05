import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
public class NilaiSiswa {
    public static void main (String[] args) throws Exception{
        Scanner input = new Scanner (System.in);
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int p;
        int jumlah_data;
        System.out.println("Jumlah siswa : ");
        jumlah_data = input.nextInt();
        String[] nama = new String[jumlah_data];
        int[] nilai = new int[jumlah_data];
        for (p = 0; p <= jumlah_data; p++){
            System.out.println("Nama siswa : ");
            try{nama[p] = dataIn.readLine();}
            catch(IOException e){System.out.print("Error");}
            System.out.print("Nilai PBO : ");
            nilai[p] = input.nextInt();
        }
        System.out.println("==============================================");
        System.out.println("Daftar Nilai Mahasiswa");
        System.out.println("==============================================");
        System.out.println();
        for(int j = 0; j <= jumlah_data; j++){
            System.out.print(nama[j]);
            System.out.print("\tNilai PBO : " + nilai[j]);
            System.out.println();
        }
    }
}
