package Praktikum5;

public class OperasiInt_2 {
    private int a;
    public int sum (int x, int y){
        a = x + y;
        return a;
    }
    public int diff (int x, int y){
        a = x - y;
        return a;
    }
    public int multi (int x, int y){
        a = x * y;
        return a;
    }
    public boolean div (int x, int y){
        //boolean temp = true;
        if (y!=0){
            a = x / y;
            return true;
        }else{
            return false;
        }
    }
    public void display() {
        System.out.println("Hasilnya adalah   " + a);
    }
}
