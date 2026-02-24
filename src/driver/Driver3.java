import java.util.ArrayList;
import java.util.Scanner;

class Pelanggan {
    String id;
    String nama;
    String alamat;
    String noHP;

    Pelanggan(String id, String nama, String alamat, String noHP) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.noHP = noHP;
    }
}

class Transaksi {
    String idTransaksi;
    Pelanggan pelanggan;
    String layanan;
    double berat;
    double hargaPerKg;
    double total;

    Transaksi(String idTransaksi, Pelanggan pelanggan,
              String layanan, double berat, double hargaPerKg) {

        this.idTransaksi = idTransaksi;
        this.pelanggan = pelanggan;
        this.layanan = layanan;
        this.berat = berat;
        this.hargaPerKg = hargaPerKg;
        this.total = berat * hargaPerKg;
    }
}

public class Driver3 {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Transaksi> daftarTransaksi = new ArrayList<>();

    public static void main(String[] args) {

        int pilihan;

        do {
            tampilkanMenu();
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambahTransaksi();
                    break;
                case 2:
                    lihatTransaksi();
                    break;
                case 3:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 3);
    }

    static void tampilkanMenu() {
        System.out.println("\n=== SISTEM LAUNDRY ===");
        System.out.println("1. Tambah Transaksi");
        System.out.println("2. Lihat Semua Transaksi");
        System.out.println("3. Keluar");
        System.out.print("Pilih: ");
    }

    static void tambahTransaksi() {

        System.out.print("ID Pelanggan: ");
        String id = input.nextLine();

        System.out.print("Nama Pelanggan: ");
        String nama = input.nextLine();

        System.out.print("Alamat: ");
        String alamat = input.nextLine();

        System.out.print("No HP: ");
        String noHP = input.nextLine();

        Pelanggan p = new Pelanggan(id, nama, alamat, noHP);

        System.out.print("ID Transaksi: ");
        String idTransaksi = input.nextLine();

        System.out.print("Jenis Layanan: ");
        String layanan = input.nextLine();

        System.out.print("Berat (kg): ");
        double berat = input.nextDouble();
        input.nextLine();

        double hargaPerKg = 10000;

        Transaksi trx = new Transaksi(
                idTransaksi,
                p,
                layanan,
                berat,
                hargaPerKg
        );

        daftarTransaksi.add(trx);

        cetakStruk(trx);
    }

    static void lihatTransaksi() {

        if (daftarTransaksi.isEmpty()) {
            System.out.println("Belum ada transaksi.");
            return;
        }

        for (Transaksi t : daftarTransaksi) {
            System.out.println("ID Transaksi : " + t.idTransaksi);
            System.out.println("Nama         : " + t.pelanggan.nama);
            System.out.println("Layanan      : " + t.layanan);
            System.out.println("Total        : Rp " + t.total);
            System.out.println("----------------------------");
        }
    }

    static void cetakStruk(Transaksi t) {
        System.out.println("\n===== STRUK =====");
        System.out.println("ID Transaksi : " + t.idTransaksi);
        System.out.println("Nama         : " + t.pelanggan.nama);
        System.out.println("Layanan      : " + t.layanan);
        System.out.println("Berat        : " + t.berat + " kg");
        System.out.println("Harga/kg     : Rp " + t.hargaPerKg);
        System.out.println("Total        : Rp " + t.total);
        System.out.println("=================\n");
    }
}