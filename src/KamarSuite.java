// KamarSuite.java
public class KamarSuite extends Kamar {
    public KamarSuite(String nomorKamar) {
        super(nomorKamar, 200.000); // Harga dasar untuk suite
    }

    @Override
    public double hitungHarga() {
        return hargaDasar; // Harga dasar tidak berubah
    }
}

