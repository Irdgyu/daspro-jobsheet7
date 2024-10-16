import java.util.Scanner;

public class Parkir06 {
    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);
        int jenis, durasi, total = 0, tarifTotal = 0;

        do {
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Keluar");
            System.out.print("Masukkan jenis kendaraan (angka): ");
            jenis = input6.nextInt();
            if (jenis == 0) {
                System.out.println("Transaksi selesai");
                break;
            }
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = input6.nextInt();
                if (durasi > 5) {
                    total = 12500;
                }
                else if (jenis == 1) {
                    total = durasi * 3000;
                }
                else if (jenis == 2) {
                    total = durasi * 2000;
                }
                System.out.println("Biaya parkir kendaraan " + jenis + " sebesar Rp." + total);
                tarifTotal += total;
                System.out.println("Total pembayaran sementara sebesar Rp." + tarifTotal);
            }
            else {
                System.out.println("Jenis kendaraan tidak sesuai, ulangi!");
            }
        }while (true);
        System.out.println("Total keseluruhan bayar parkir sebesar Rp." + tarifTotal);
    }
}