// HotelReservationSystem.java
public class HotelReservationSystem {
    public static void main(String[] args) {
        ManajerReservasi manajerReservasi = new ManajerReservasi();

        Tamu tamu1 = new Tamu("John Doe", "123456789");
        Kamar kamar1 = new KamarStandar("101");
        Reservasi reservasi1 = new Reservasi(tamu1, kamar1, 3);
        manajerReservasi.tambahReservasi(reservasi1);

        Tamu tamu2 = new Tamu("Jane Smith", "987654321");
        Kamar kamar2 = new KamarSuite("202");
        Reservasi reservasi2 = new Reservasi(tamu2, kamar2, 2);
        manajerReservasi.tambahReservasi(reservasi2);

        manajerReservasi.tampilkanReservasi();
    }
}

