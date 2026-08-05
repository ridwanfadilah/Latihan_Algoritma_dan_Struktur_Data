package Tanya_Jawab_Praktikum;

public class HighArrayInt2 {
    private int[] A;
    private int n;
    //-------------------------------
    public HighArrayInt2(int max){ //constructor untuk HighArrayInt
        A = new int[max];
        n=0;
    }
    //----------------------------------
    public void insert(int value){
        A[n] = value;
        n++; // n=n+1
    }
    //-----------------------------------
    public boolean delete(int value){
        int j;
        for (j=0; j<n;j++){
            if (value == A[j])
                break;
        }
        if (j==n)
            return false;
        else{
            for (int k=j; k<n;k++)
                A[k]=A[k+1];
            n--;
            return true;
        }
    }
    //-------------------------------------
    public boolean update(int x, int y){
        int j;
        for (j=0; j<n; j++)
            if (x==A[j])
                break;
        if (j==n)
            return false;
        else{
            A[j]=y;
            return true;
        }
    }
    //--------------------------------

    //--------------------------------
    public boolean sort_2(){
        int x, y;
        int banyak_nilai = 6;

        for (x=0; x<banyak_nilai; x++){
            int min = A[x];
            int pos = x;
            for (y=x; y<banyak_nilai; y++){
                if (A[y]<min){
                    min = A[y];
                    pos = y;
                }
            }
            if (x!=pos){
                int temp = A[x];
                A[x] = A[pos];
                A[pos] = temp;
            }
        }
        return true;
    }

    //-------------------------------
    public void search(int cari){
        int x=0;
        boolean ditemukan = false;

        for (x=0; x<A.length; x++) {
            if (A[x] == cari) {
                ditemukan = true;
                break;
            }
        }
        if (ditemukan){
            System.out.println("data " + cari + " ditemukan pada indeks ke-" + x);
        }
        else{
            System.out.println("Data tidak ditemukan");
        }
    }
    //--------------------------------
    public void display(){
        for (int j=0; j<n; j++)
            System.out.print(" " + A[j] );
        System.out.println(" ");
    }
}
