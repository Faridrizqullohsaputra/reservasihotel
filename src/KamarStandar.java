// KamarStandar.java
public class KamarStandar extends Kamar {
    public KamarStandar(String nomorKamar) {
        super(nomorKamar, 100.000); // Harga dasar untuk kamar standar
    }

    @Override
    public double hitungHarga() {
    return hargaDasar; // Harga dasar tidak berubah
    }
}