import java.util.Scanner;
public class Mahasiswa {
    String NIM, Nama;
    double UTS, UAS, Nilai_Akhir;
    Scanner scn = new Scanner(System.in);
    public void setdata(){
        System.out.print("Masukkan Nama      : ");
        this.Nama = scn.nextLine();
        System.out.print("Masukkan NIM       : ");
        this.NIM = scn.nextLine();
        System.out.print("Masukkan Nilai UTS : ");
        this.UTS = scn.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        this.UAS = scn.nextDouble();
        this.Nilai_Akhir = (this.UTS+this.UAS)/2;
    }
    public String getNIM(){
        return this.NIM;
    }
    public void tampil(){
        System.out.println("Nama        : "+this.Nama);
        System.out.println("NIM         : "+this.NIM);
        System.out.println("Nilai UTS   : "+this.UTS);
        System.out.println("Nilai UAS   : "+this.UAS);
        System.out.println("Nilai Akhir : "+this.Nilai_Akhir);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, n = 0, menu = 0, ketemu;
        String NIM;
        Mahasiswa[] mhs = new Mahasiswa[40];
        Scanner getdata = new Scanner(System.in);
        while(menu!=4){
            System.out.print("Menu :\n1.Input Data\n2.Lihat Data\n3.Cari Data (NIM)\n4.Keluar\nPilih Salah Satu : ");
            menu = input.nextInt();
            if(menu == 1){
                n++;
                mhs[n] = new Mahasiswa();
                mhs[n].setdata();
            }
            else if(menu == 2){
                if(n<1){
                    System.out.println("Data Masih Kosong");
                }
                else{
                    a = 0;
                    while(a<n){
                        a++;
                        System.out.println("---" + a + "---");
                        mhs[a].tampil();
                    }
                }
            }
            else if(menu == 3){
                if(n<1){
                    System.out.println("Data Masih Kosong");
                }
                else{
                    System.out.print("Masukkan NIM yang dicari : ");
                    NIM = getdata.nextLine();
                    a = 0;
                    ketemu = 0;
                    while(a<n){
                        a++;
                        if(NIM.equals(mhs[a].getNIM())){
                            mhs[a].tampil();
                            ketemu++;
                        }
                    }
                    if(ketemu<1)
                        System.out.println("Data Yang Anda Cari Mungkin Tidak Ada");
                }
            }
            else if(menu == 4){
                System.out.println("Keluar...");
            }
            else{
                System.out.println("Masukkan Menu Yang Tersedia");
            }
        }
    }
}
