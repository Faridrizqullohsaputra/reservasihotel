// ManajerReservasi.java
import java.util.ArrayList;
import java.util.List;

public class ManajerReservasi {
    private List<Reservasi> daftarReservasi;

    public ManajerReservasi() {
        daftarReservasi = new ArrayList<>();
    }

    public void tambahReservasi(Reservasi reservasi) {
        daftarReservasi.add(reservasi);
    }

    public void tampilkanReservasi() {
        for (Reservasi reservasi : daftarReservasi) {
            System.out.println(reservasi.getStatus());
            System.out.println("Total biaya: " + reservasi.hitungTotalBiaya());
        }
    }
}

