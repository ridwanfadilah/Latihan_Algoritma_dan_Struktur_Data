package Modul5ASD_SLL;

public class LinkList {
    private Node head, tail; //properti
    //------------------------------------------------------
    public LinkList(){
        head = null; //inisialisasi calon list
    }
    //methode-methode
    //------------------------------------------------------
    public void tambahDepan(int id){
        Node baru = new Node(id);
        if (head == null){
            head = baru;
            tail = baru;
        }
        else{
            baru.next = head;
            head = baru;
        }
    }
    //------------------------------------------------------
    public void tambahBelakang(int id){
        Node baru = new Node(id);
        Node bantu;
        if (head == null){
            head = baru;
            tail = baru;
        }
        else{
            tail.next = baru;
            tail = baru;
        }
    }
    //------------------------------------------------------
    //public void tambahTengah(int id){
        //Node bantu, temp;
        //temp = Node(id);
        //bantu = id;
        //while (bantu.next != tail){
            //bantu = bantu.next;
    //}
    //------------------------------------------------------
    public Node hapusDepan(){
        if (head != null){
            Node temp = head;
            head = head.next;
            temp.next = null;
            return temp;
        }
        else{
            System.out.println("List kosong");
            return null;
        }
    }
    //------------------------------------------------------
    public Node hapusBelakang(){
        if (head != null){
            Node bantu, temp;
            if (head.next == null){
                temp = head;
                head = tail = null;
            }
            else{
                bantu = head;
                while (bantu.next != tail){
                    bantu = bantu.next;
                }
                temp = tail;
                tail = bantu;
                tail.next = null;
            }
            return temp;
        }
        else{
            System.out.println("List kosong");
            return null;
        }
    }
    //------------------------------------------------------
    public void displayList(){
        if (head != null){
            Node bantu = head;
            System.out.println("Data dalam List: ");
            while (bantu != null){
                bantu.displayNode();
                bantu = bantu.next;
            }
            System.out.println(" ");
        }
        else{
            System.out.println("List kosong");
        }
    }
}
