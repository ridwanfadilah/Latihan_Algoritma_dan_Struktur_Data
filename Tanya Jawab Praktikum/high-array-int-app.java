package Tanya_Jawab_Praktikum;

import java.util.Scanner;

public class HighArrayIntApp {
    public static void main(String[] arg){
        int max = 100;
        HighArrayInt2 arr = new HighArrayInt2(max);
        Scanner in = new Scanner(System.in);

        //--------------------------------------
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(33);
        arr.insert(88);
        arr.insert(11);
        arr.insert(77);
        System.out.println("Data Awal : ");
        arr.display();
        //---------------------------------------
        System.out.println(" Hapus Data : ");
        System.out.print(" Data yg dihapus -->  ");
        int key = in.nextInt();
        if (arr.delete(key)){
            System.out.println(" Data Terbaru : ");
            arr.display();
        }
        else
            System.out.println(key + " tidak ditemukan.");

        //------------------------------------
        System.out.println(" Update Data : ");
        System.out.print(" Data yang diganti -> ");
        int x = in.nextInt();
        System.out.print(" Data pengganti -> ");
        int y = in.nextInt();
        if (arr.update(x,y)){
            System.out.println(" Data Terbaru : ");
            arr.display();
        }
        else
            System.out.println(x + " tidak ditemukan.");

        System.out.println("Data terbaru : ");
        System.out.println("Urutkan Data : ");
        System.out.print("Nilai terkecil --> ");
        int min = in.nextInt();
        System.out.print("Index ke berapa --> ");
        int pos = in.nextInt();
        arr.sort_2();
        System.out.println("Data terbaru : ");
        arr.display();

        System.out.println("Cari Data : ");
        System.out.println("Masukan nilai yang dicari : ");
        int cari = in.nextInt();
        arr.search(cari);

    } //akhir method main()


}
