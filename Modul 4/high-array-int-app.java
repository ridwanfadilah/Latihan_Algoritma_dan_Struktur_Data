package Modul4ASD_ADT;

import java.util.Scanner;
public class HighArrayIntApp {
    public static void main(String[] args){
        int max = 100;
        HighArrayInt arr = new HighArrayInt(max);
        Scanner in = new Scanner(System.in);
        //------------------------------------------------------
        //Input Data (cara 1)
        //System.out.println("Maukkan nilai array: ");
        //int nilai = in.nextInt();
        //arr.insert(nilai);

        //Input Data (cara 2)
        int r;
        for (r=0; r<7; r++){
            System.out.println("Maukkan nilai array: ");
            int nilai = in.nextInt();
            arr.insert(nilai);
        }

        //Input Data (cara 3)
        //arr.insert(44);
        //arr.insert(55);
        //arr.insert(22);
        //arr.insert(33);
        //arr.insert(88);
        //arr.insert(11);
        //arr.insert(77);
        //System.out.println("Data Awal: ");

        arr.display();
        //------------------------------------------------------
        //Hapus Data
        System.out.println("Hapus Data: ");
        System.out.print("Data yang dihapus --> ");
        int key = in.nextInt();
        if (arr.delete(key)){
            System.out.println("Data yang terbaru: ");
            arr.display();
        }
        else{
            System.out.println(key + "tidak ditemukan");
        }
        //------------------------------------------------------
        //Update Data
        System.out.println("Update Data: ");
        System.out.print("Data yang diganti --> ");
        int x = in.nextInt();
        System.out.print("Data pengganti -->");
        int y = in.nextInt();
        if (arr.update(x,y)){
            System.out.println("Data Terbaru: ");
            arr.display();
        }
        else{
            System.out.println(x + "tidak ditemukan");
        }
        //------------------------------------------------------
        //Pengurutan Data
        System.out.println("Update Data: ");
        System.out.println("Array sebelum di sorting: ");
        arr.display();
        System.out.println("Array sesudah di sorting: ");
        arr.sort();
        arr.display();
        //------------------------------------------------------
        //Pencarian Data
        System.out.println("Masukkan nilai yang ingin dicari: ");
        int element = in.nextInt();
        arr.search(element);
    }
}
