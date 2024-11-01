// Kamar.java
public abstract class Kamar {
    protected String nomorKamar;
    protected double hargaDasar;

    public Kamar(String nomorKamar, double hargaDasar) {
        this.nomorKamar = nomorKamar;
        this.hargaDasar = hargaDasar;
    }

    public abstract double hitungHarga();

    public String getNomorKamar() {
        return nomorKamar;
    }

    public double getHargaDasar() {
        return hargaDasar;
    }
}

