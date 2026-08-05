package Modul5ASD_SLL;

public class Node {
    public int iData; //data untuk objek Node
    public Node next; //link penunjuk ke alamat selanjutnya
    //------------------------------------------------------
    public Node(int id){
        iData = id; //mengisi data node
    }
    //------------------------------------------------------
    public void displayNode(){
        System.out.println(" {" + iData + "} ");
    }
}
