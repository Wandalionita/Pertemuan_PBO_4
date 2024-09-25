package tugas_pertemuan_4;

public class MainBangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HitungBangunRuang Balok = new Balok(6.0,4.0,2.0);
        HitungBangunRuang Kubus = new Kubus(3.0);

        // Menghitung volume dan luas permukaan balok
        System.out.println("- BALOK -");
        System.out.println("Volume : " + Balok.hitungVolume());
        System.out.println("Luas Permukaan : " + Balok.hitungLuasPermukaan());

        // Menghitung volume dan luas permukaan kubus
        System.out.println("- KUBUS -");
        System.out.println("Volume : " + Kubus.hitungVolume());
        System.out.println("Luas Permukaan : " + Kubus.hitungLuasPermukaan());
    }
}
