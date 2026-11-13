import java.util.Scanner;

public class KuisLaundry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah pelanggan hari ini: ");
        int n = sc.nextInt();
        int totalBerat = 0;
        int totalBiaya = 0;
        int berat;
        for (int i = 1; i <= n; i++) {
            System.out.print("Berat cucian pelanggan ke-" + i + " (kg): ");
            berat = sc.nextInt();
            while (berat < 1 || berat > 20) {
                System.out.println(" Input tidak valid, ulangi.");
                break;
            }
            // Tarif: sampai 3 kg Rp 15000 (flat), lebih dari 3 kg ditambah Rp 4000 per kg kelebihannya
            int biaya;
            if (berat <= 3) {
                biaya = 15000;
            } else {
                biaya = 15000 + (berat - 3) * 4000;
            }
            System.out.println("  Biaya: Rp " + biaya);
            totalBiaya += biaya;
            totalBerat += berat;
        }
        double rataBerat = totalBerat / n;
        System.out.println("=== REKAP HARIAN ===");
        System.out.println("Total pemasukan : Rp " + totalBiaya);
        System.out.println("Rata-rata berat : " + rataBerat + " kg");
        System.out.println("Biaya tertinggi: ");
    }
}