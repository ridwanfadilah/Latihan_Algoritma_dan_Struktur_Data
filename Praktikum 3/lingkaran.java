package Praktikum3;

public class Lingkaran {
    private double jari2, luas, kel;
    final double pi = 3.14;

    public Lingkaran (double r){          //contructor 1
        jari2 = r;
    }

    public Lingkaran (){                  //contructor 2
        jari2 = 7;
        luas = pi*Math.pow(jari2,2);
        kel = pi*(jari2*2);
    }

    public double Luas (double rr){   //method Luas
        luas = pi*Math.pow(rr,2);
        return luas;
    }

    public double Keliling (double rr){
        kel = pi*2*rr;
        return kel;
    }

    public double getLuas(){ //method get untuk mengembalikkan nilai Luas
        return luas;
    }

    public double getKel(){
        return kel;
    }
}
