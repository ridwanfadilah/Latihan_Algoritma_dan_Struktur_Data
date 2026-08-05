public class Segitiga {
    private int alas;
    private int tinggi;
    public void setAlas (int a){
        alas = a;
    }
    public void setTinggi (int t){
        tinggi = t;
    }
    public int getAlas(){
        return alas;
    }
    public int getTinggi(){
        return tinggi;
    }
    public double luas(){
        double l = 0.5*alas*tinggi;
        return l;
    }
}
