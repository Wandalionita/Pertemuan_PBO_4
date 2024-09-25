package tugas_pertemuan_4;

public class Balok extends HitungBangunRuang{
    private double panjang;
    private double lebar;
    private double tinggi;
    
    public Balok(double panjang,double lebar,double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }
    public double hitungLuasPermukaan() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
}
