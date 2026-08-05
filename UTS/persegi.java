public class Persegi {
    //Atribut
    private int sisi;
    //Method
    public void setSisi(int s){
        sisi = s;
    }
    public int getSisi(){
        return sisi;
    }
    public int luas(){
        int l = sisi*sisi;
        return l;
    }
}
