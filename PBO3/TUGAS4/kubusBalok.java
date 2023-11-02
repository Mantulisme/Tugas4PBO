package PBO3.TUGAS4;

public class kubusBalok {
    public double luasPermukaan(){
        return 0;
    }
    public double volume(){
        return 0;
    }   
}

class Balok extends kubusBalok{
    private double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public double luasPermukaan(){
        return 2*(panjang*lebar+tinggi*panjang+lebar*tinggi);
    }
    public double volume(){
        return panjang*lebar*tinggi;
    }
}
class Kubus extends kubusBalok{
    private double sisi;
    public Kubus(double sisi){
        this.sisi = sisi;
    }
    public double luasPermukaan(){
        return 6*(2*sisi);
    }
    public double volume(){
        return sisi*3;
    }
}