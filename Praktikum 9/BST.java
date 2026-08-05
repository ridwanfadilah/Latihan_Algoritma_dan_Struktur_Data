package Praktikum9;
import java.util.*;
public class BST {
    public Node3 root;
    //------------------------------
    public BST() {
        root = null;
    }
    //------------------------------
    public void insert (int id){
        Node3 nodeBaru = new Node3();
        nodeBaru.iData = id;

        if (root == null)
            root = nodeBaru;
        else{
            Node3 baru = root;
            Node3 parent;
            while (true){
                parent = baru;
                if (id < baru.iData){
                    baru = baru.leftChild;
                    if (baru == null){
                        parent.leftChild = nodeBaru;
                        return;
                    }
                }
                else {
                    baru = baru.rightChild;
                    if (baru == null){
                        parent.rightChild = nodeBaru;
                        return;
                    }
                }
            }
        }
    }
    //------------------------------
    public boolean delete (int key){
        Node3 baru = root;
        Node3 parent = root;
        boolean cekLeftChild = true;

        while (baru.iData != key){
            parent = baru;
            if (key<baru.iData){
                cekLeftChild = true;
                baru = baru.leftChild;
            }
            else {
                cekLeftChild = false;
                baru = baru.rightChild;
            }
            if (baru == null)
                return false;
        }//end while, ditemukan node untuk dihapus

        //jika node yang akandihapus tidak memiliki children
        if (baru.leftChild == null && baru.rightChild == null) {
            if (baru==root)
                root = null;
            else if (cekLeftChild)
                parent.leftChild = null;        //hapus leftChild
            else
                parent.rightChild = null;       //hapus rightChild
        }

        //jika tidak memiliki rightChild, ganti dengan subtree kiri
        else if (baru.rightChild == null){
            if (baru == root)
                root = baru.leftChild;
            else if (cekLeftChild)
                parent.leftChild = baru.leftChild;
            else
                parent.rightChild = baru.leftChild;
        }

        //jika tidak memiliki leftChild, ganti dengan subtree kiri
        else if (baru.leftChild == null) {
            if (baru == root)
                root = baru.rightChild;
            else if (cekLeftChild)
                parent.leftChild = baru.rightChild;
            else
                parent.rightChild = baru.rightChild;
        }

        //jika memiliki 2 children, ganti dengan successor
        else{
            //ambil successor untuk node yang akan dihapus
            Node3 succ = getSuccessor(baru);

            //sambung parent baru ke successor
            if (baru == root)
                root = succ;
            else if (cekLeftChild)
                parent.leftChild = succ;
            else
                parent.rightChild = succ;

            //sambung successor ke node leftChild nya node baru
            succ.leftChild = baru.leftChild;
        }//end else 2 children
        return true;
    }//end delete

    //------------------------------
    private Node3 getSuccessor (Node3 hapusNode){
        Node3 succParent = hapusNode;
        Node3 succ = hapusNode;
        Node3 baru = hapusNode.rightChild; //ke rightChild
        while (baru != null) {
            succParent = succ;
            succ = baru;
            baru = baru.leftChild; //ke leftChild
        }
        if (succ != hapusNode.rightChild){
            //jika succ bukan rightChild, maka hubungkan
            succParent.leftChild = succ.rightChild;
            succ.rightChild = hapusNode.rightChild;
        }
        return succ;
    }

    //------------------------------
    public Node3 find (int key){
        Node3 cari = root;
        while (cari.iData != key){
            if (key < cari.iData)
                cari = cari.leftChild;
            else
                cari = cari.rightChild;
            if (cari == null) //tidak ada child
                return null; //tidak ditemukan
        }
        return cari; //ditemukan
    }

    //------------------------------
    public void displayTree() {
        Stack globalStack = new Stack();
        globalStack.push(root);
        int n = 32;
        boolean cekBarisKosong = false;
        System.out.println (" . . . . . . . . . ." + " . . . . . . . . . ." + " . . . . . . . . . .");
        while (cekBarisKosong == false) {
            Stack localStack = new Stack();
            cekBarisKosong = true;

            for (int j=0; j<+n; j++)
                System.out.print("   ");

            while (globalStack.isEmpty() == false){
                Node3 temp = (Node3)globalStack.pop();
                if (temp != null){
                    System.out.print(temp.iData);
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);

                    if (temp.leftChild != null || temp.rightChild != null)
                        cekBarisKosong = false;
                }
                else {
                    System.out.print(" . . ");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j=0; j<=n*2-2; j++)
                    System.out.print("  ");
            }//end while globalStack tidak kosong
            System.out.println();
            n /=2;
            while (localStack.isEmpty() == false)
                globalStack.push(localStack.pop());
        }//end whilw cekBarisKosong bernilai salah
        System.out.println (" . . . . . . . . . ." + " . . . . . . . . . ." + " . . . . . . . . . .");
    }//end displayTree

    public void inorder (Node3 n){
        if (n != null){
            inorder(n.leftChild);
            System.out.print(n.iData + "  ");
            inorder(n.rightChild);
        }
    }

    //------------------------------
    public void postorder (Node3 n){
        if (n != null){
            postorder(n.leftChild);
            postorder(n.rightChild);
            System.out.print(n.iData + "  ");
        }
    }

    //------------------------------
    public void preorder(Node3 n){
        if (n != null) {
            System.out.print(n.iData + "  ");
            preorder(n.leftChild);
            preorder(n.rightChild);
        }
    }
}//end class BST
