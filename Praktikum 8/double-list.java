package Praktikum8;
public class DoubleList {
    private Node2 head, tail;           //inisialisasi node awal & akhir
    //------------------------------
    //constructor
    public DoubleList() {
        head = tail = null;             //isi DLL masih kosong
    }
    //------------------------------
    //method
    //------------------------------
    public void TambahDepan (long d){
        Node2 NodeBaru = new Node2(d);  //membuat node baru
        if (head == null)               //jika DLL kosong
            tail = NodeBaru;            //NodeBaru menjadi tail
        else
            head.prev = NodeBaru;       //NodeBaru diisi pada prev head
        NodeBaru.next = head;           //head berada setelah NodeBaru
        head = NodeBaru;                //NodeBaru menjadi head
    }
    //------------------------------
    public void TambahBelakang (long d){
        Node2 NodeBaru = new Node2(d);  //membuat node baru
        tail.next = NodeBaru;           //menambah node baru dibelakang tail
        NodeBaru.prev = tail;           //NodeBaru setelah tail
        tail = NodeBaru;                //NodeBaru menjadi tail
    }
    //------------------------------
    public boolean TambahTengah (long key, long d){
        Node2 NodeBaru = new Node2(d);
        Node2 bantu = head;
        while (bantu.data != key) {
            bantu = bantu.next;
            if (bantu == null)
                return false;
        }
        if (bantu == tail) {
            NodeBaru.next = null;
            tail = NodeBaru;
        }
        else{
            NodeBaru.next = bantu.next;
            bantu.next.prev = NodeBaru;
        }
        NodeBaru.prev = bantu;
        bantu.next = NodeBaru;
        return true;
    }
    //------------------------------

    //------------------------------
}
