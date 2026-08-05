package Tugas1;

public class Gambar1 {
    public static void main (String[] args){
        for (int i =1; i <=5; i++){
            for (int j = 5; j>=i; j--){
                System.out.print(" ");
            }
            for (int k =1; k<=i; k++){
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
