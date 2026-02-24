import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Driver1 {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Map<String, Integer> menu = new HashMap<>();
        menu.put("NGS", 15000);
        menu.put("AP", 20000);
        menu.put("SA", 25000);
        menu.put("BU", 18000);
        menu.put("MAP", 15000);
        menu.put("GG", 15000);
        menu.put("SAM", 17000);
        menu.put("RD", 25000);
        menu.put("IB", 35000);
        menu.put("NUK", 20000);

        int totalBelanja = 0;

        while (true) {

            String kode = input.nextLine();

            if (kode.equals("END")) {
                break;
            }

            int porsiButet = Integer.parseInt(input.nextLine());

            if (!menu.containsKey(kode)) {
                System.out.println("Kode tidak valid!");
                continue;
            }

            int harga = menu.get(kode);

            int porsiUcok = 2 * porsiButet;
            int totalPorsi = porsiButet + porsiUcok;

            totalBelanja += totalPorsi * harga;
        }
        double diskonPersen = 0;
        String kupon = "Tidak Ada";

        if (totalBelanja >= 500000) {
            diskonPersen = 0.25;
            kupon = "Hitam (25%)";
        } else if (totalBelanja >= 400000) {
            diskonPersen = 0.20;
            kupon = "Hijau (20%)";
        } else if (totalBelanja >= 300000) {
            diskonPersen = 0.15;
            kupon = "Merah (15%)";
        } else if (totalBelanja >= 200000) {
            diskonPersen = 0.10;
            kupon = "Kuning (10%)";
        } else if (totalBelanja >= 100000) {
            diskonPersen = 0.05;
            kupon = "Biru (5%)";
        }

        double potongan = totalBelanja * diskonPersen;
        double totalBayar = totalBelanja - potongan;

        System.out.println("\n===== STRUK PEMBAYARAN =====");
        System.out.println("Total Belanja : Rp " + totalBelanja);
        System.out.println("Kupon         : " + kupon);
        System.out.println("Diskon        : Rp " + (int) potongan);
        System.out.println("Total Bayar   : Rp " + (int) totalBayar);

        input.close();
    }
}
