import java.util.Scanner;

public class SiakadFor06 {
    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int tidakLulus = 0, lulus = 0;

        for (int i = 1; i <= 10; i++ ) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = input6.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai < 60) {
                tidakLulus +=1;
            }
            else{
                lulus +=1;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);
        System.out.println("Jumlah mahasiswa lulus: " + lulus);
    }
}