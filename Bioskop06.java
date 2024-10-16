import java.util.Scanner;

public class Bioskop06 {
    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);
        int jmlTiket;
        double hargaTiket = 50000, diskon, totalTiket = 0, totalHarga = 0, hargaPenjualan = 0;
        boolean isLanjut = true;

        while (isLanjut) {
            System.out.print("Input jumlah tiket: ");
            jmlTiket = input6.nextInt();

            if (jmlTiket < 0) {
                System.out.println("Jumlah tiket invalid");
                continue;
            }
            else {
                if (jmlTiket > 4 && jmlTiket <= 10) {
                    diskon = 0.1;
                }
                else if (jmlTiket > 10) {
                    diskon = 0.15;
                }
                else {
                    diskon = 0;
                }
            }
            totalHarga = jmlTiket * hargaTiket - (jmlTiket * hargaTiket * diskon);
            
            System.out.println("Jumlah tiket yang dibeli: " + jmlTiket);
            System.out.println("Harga tiket yang dibeli Rp." + totalHarga);

            totalTiket += jmlTiket;
            hargaPenjualan += totalHarga;
            System.out.print("Apakah ingin lanjut? (true/false): ");
            isLanjut = input6.nextBoolean();
        } 

        System.out.println("Total keseluruhan tiket yang telah terjual: " + totalTiket);
        System.out.println("Total harga penjualan tiket senilai Rp." + hargaPenjualan);
    }
}