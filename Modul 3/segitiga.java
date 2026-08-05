package Modul3ASD_PBO;

public class Segitiga {
    //Atribut:
    int Alas;
    int Tinggi;
    //float Garis_Miring;

    //Method:
    int setAlas(int alas){
        Alas = alas;
        return Alas;
    }

    int setTinggi(int tinggi){
        Tinggi = tinggi;
        return Tinggi;
    }

    int luas(){
        int luas_segitiga = (Alas*Tinggi)/2;
        return luas_segitiga;
    }
}
