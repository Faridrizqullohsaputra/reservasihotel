// Reservasi.java
import java.util.ArrayList;
import java.util.List;

public class Reservasi {
    private Tamu tamu;
    private Kamar kamar;
    private int jumlahHari;
    private List<LayananTambahan> layananTambahan;

    public Reservasi(Tamu tamu, Kamar kamar, int jumlahHari) {
        this.tamu = tamu;
        this.kamar = kamar;
        this.jumlahHari = jumlahHari;
        this.layananTambahan = new ArrayList<>();
    }

    public void tambahLayanan(LayananTambahan layanan) {
        layananTambahan.add(layanan);
    }

    public double hitungTotalBiaya() {
        double totalBiaya = kamar.hitungHarga() * jumlahHari;
        for (LayananTambahan layanan : layananTambahan) {
            totalBiaya += layanan.getBiayaLayanan(); // Menambahkan biaya layanan tambahan
        }
        return totalBiaya;
    }

    public String getStatus() {
        StringBuilder status = new StringBuilder("Reservasi untuk " + tamu.getNama() + " di kamar " + kamar.getNomorKamar() + " selama " + jumlahHari + " hari.");
        if (!layananTambahan.isEmpty()) {
            status.append("\nLayanan tambahan: ");
            for (LayananTambahan layanan : layananTambahan) {
                status.append(layanan.getNamaLayanan()).append(" (Biaya: ").append(layanan.getBiayaLayanan()).append("), ");
            }
        }
        return status.toString();
    }
}
