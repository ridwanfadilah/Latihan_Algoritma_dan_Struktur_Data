package Modul5ASD_SLL;

public class LinkListApp {
    public static void main(String[] args){
        LinkList List = new LinkList();
        List.tambahDepan(22);
        List.tambahDepan(44);
        List.tambahBelakang(66);
        List.tambahBelakang(88);
        List.displayList();
        Node hapus;
        hapus = List.hapusDepan();
        if (hapus != null){
            System.out.print("Menghapus ");
            hapus.displayNode();
            System.out.println(" ");
        }
        List.displayList();
        hapus = List.hapusBelakang();
        if (hapus != null) {
            System.out.print("Menghapus ");
            hapus.displayNode();
            System.out.println(" ");
        }

        List.displayList();
    }
}
