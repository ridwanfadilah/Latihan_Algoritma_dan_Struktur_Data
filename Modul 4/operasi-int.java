package Modul4ASD_ADT;

public class OperasiInt {
    //properti
    private int a;
    //---------------------------------------
    //operasi penjumlahan
    public int sum(int x, int y){
        a = x+y;
        return a;
    }
    //---------------------------------------
    //operasi pengurangan
    public int diff(int x, int y){
        a = x-y;
        return a;
    }
    //---------------------------------------
    //operasi perkalian
    public int multi(int x, int y){
        a = x*y;
        return a;
    }
    //---------------------------------------
    //operasi pembagian
    public boolean div(int x, int y){
        if (y!=0) {
            a = x / y;
            return true;
        }
        else{
            return false;
        }
    }
    //---------------------------------------
    //operasi pangkat
    public int pangkat(int x, int y){
        if (y==0)
            return 1;
        else
            a = pangkat(x, y-1) * x;
            return a;
    }
    //---------------------------------------
    public void display(){
        System.out.println("Hasilnya adalah " + a);
    }
}
