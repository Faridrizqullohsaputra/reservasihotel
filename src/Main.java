// HotelReservationSystem.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManajerReservasi manajerReservasi = new ManajerReservasi();

        boolean continueReservation = true;

        while (continueReservation) {
            System.out.println("=== Sistem Manajemen Reservasi Hotel ===");
            System.out.print("Masukkan nama tamu: ");
            String namaTamu = scanner.nextLine();
            System.out.print("Masukkan nomor kontak tamu: ");
            String nomorKontak = scanner.nextLine();

            Tamu tamu = new Tamu(namaTamu, nomorKontak);

            System.out.print("Pilih tipe kamar (1: Standar, 2: Suite): ");
            int pilihanKamar = scanner.nextInt();
            Kamar kamar = null;

            if (pilihanKamar == 1) {
                kamar = new KamarStandar("101"); // Nomor kamar standar
            } else if (pilihanKamar == 2) {
                kamar = new KamarSuite("202"); // Nomor kamar suite
            } else {
                System.out.println("Pilihan kamar tidak valid.");
                continue;
            }

            System.out.print("Masukkan jumlah hari menginap: ");
            int jumlahHari = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline dari input

            Reservasi reservasi = new Reservasi(tamu, kamar, jumlahHari);
            manajerReservasi.tambahReservasi(reservasi);

            System.out.print("Apakah Anda ingin menambah reservasi lagi? (y/n): ");
            String lagi = scanner.nextLine();
            continueReservation = lagi.equalsIgnoreCase("y");
        }

        System.out.println("\n=== Daftar Reservasi ===");
        manajerReservasi.tampilkanReservasi();

        scanner.close();
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
