package Modul3ASD_PBO;

public class Lingkaran{
    //Atribut:
    double jari_jari;
    final double pi = 3.14;

    //Method:
    double Luas(double jari){
        jari_jari = jari;
        double luas_lingkaran = pi*Math.pow(jari_jari,2);
        return luas_lingkaran;
    }

}
