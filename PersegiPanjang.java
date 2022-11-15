package uts;
public class PersegiPanjang {
    // atribut
    private int panjang;
    private int lebar;
    private double luas;
     
    // setter method untuk panjang
    public void setPanjang(int p){
        if (p > 0){
            this.panjang = p;
        } else {
            this.panjang = 0;
        }
    }
     
    // setter method untuk lebar
    public void setLebar(int l){
        if (l > 0){
            this.lebar = l;
        } else {
            this.lebar = 0;
        }
    }
     
    // getter method untuk luas
    public double getLuas(){
        // hitung luasnya
        this.luas = this.panjang * this.lebar;
        return this.luas;
    }
}