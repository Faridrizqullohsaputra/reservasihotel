// LayananTambahan.java
import java.util.ArrayList;
import java.util.List;

public class LayananTambahan {
    private String namaLayanan;
    private double biayaLayanan;

    public LayananTambahan(String namaLayanan, double biayaLayanan) {
        this.namaLayanan = namaLayanan;
        this.biayaLayanan = biayaLayanan;
    }

    public String getNamaLayanan() {
        return namaLayanan;
    }

    public double getBiayaLayanan() {
        return biayaLayanan;
    }

    public static List<LayananTambahan> getDaftarLayanan() {
        List<LayananTambahan> layanan = new ArrayList<>();
        layanan.add(new LayananTambahan("Sarapan", 50.0));
        layanan.add(new LayananTambahan("Transportasi Bandara", 150.0));
        layanan.add(new LayananTambahan("Pijat", 100.0));
        return layanan;
    }
}
