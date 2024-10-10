import java.util.Scanner;

public class KafeDoWhile06 {
    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);
        int kopi, teh, roti, hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000, totalHarga;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = input6.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transakasi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = input6.nextInt();
            System.out.print("Jumlah teh: ");
            teh = input6.nextInt();
            System.out.print("Jumlah roti: ");
            roti = input6.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar : Rp." + totalHarga);
            input6.nextLine();
        } 
        while (true);

        System.out.println("Semua transaksi selesai.");

    }
}
