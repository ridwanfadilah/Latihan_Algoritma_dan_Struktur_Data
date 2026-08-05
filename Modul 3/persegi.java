package Modul3ASD_PBO;

public class Persegi {
    //Atribut:
    int Panjang_Sisi;

    //Method:
    int setSisi(int sisi){
        Panjang_Sisi = sisi;
        return sisi;
    }

    int luas(){
        int luas_persegi = Panjang_Sisi*Panjang_Sisi;
        return luas_persegi;
    }
}
