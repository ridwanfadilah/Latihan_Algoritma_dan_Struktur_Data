package Modul4ASD_ADT;

public class HighArrayInt {
    private int[] A;
    private int n;
    //------------------------------------------------------
    public HighArrayInt(int max){
        A = new int[max];
        n = 0;
    }
    //------------------------------------------------------
    public void insert(int value){
        A[n] = value;
        n++;
    }
    //------------------------------------------------------
    public boolean delete(int value){
        int j;
        for (j=0; j<n; j++){
            if (value == A[j])
                break;
        }
        if (j==n)
            return false;
        else{
            for (int k=j; k<n; k++)
                A[k] = A[k+1];
            n--;
            return true;
        }
    }
    //------------------------------------------------------
    public boolean update(int x, int y){
        int j;
        for (j=0; j<n; j++)
            if (x == A[j])
                break;
        if (j==n)
            return false;
        else{
            A[j] = y;
            return true;
        }
    }
    //------------------------------------------------------
    public void display(){
        for (int j=0; j<n; j++)
            System.out.print(" " + A[j]);
        System.out.println(" ");
    }
    //------------------------------------------------------
    public boolean sort(){ //metode bubble sort
        int temp;
        int max = 6; //harusnya A.length();
        int x;
        int y;
        for(x = max-1; x>0; x--){
            for(y = 0; y<x; y++){
                if (A[y] > A[y+1]) {
                    temp = A[y];
                    A[y] = A[y + 1];
                    A[y + 1] = temp;
                }
            }
        }
        return true;
    }
    public void search(int nilai){
        int a;
        int pos = 0;
        int max = 6;
        for (a=0; a<max; a++){
            if (nilai == A[a]){
                pos = a+1;
                break;
            }
        }
        if (pos == 0){
            System.out.println("Elemen tidak ditemukan");
        }
        else{
            System.out.println("Elemen ditemukan di posisi ke- " + pos);
        }
    }
}
