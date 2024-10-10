import java.util.Scanner;

public class SiakadWhile06 {
    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);
        int nilai, jml, i = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jml = input6.nextInt();

        while (i < jml) {
            i++;
            System.out.print("Masukkan nilai mhahasiswa ke-" + (i + 1) + ": ");
            nilai = input6.nextInt();

            if (nilai <0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan nilai lagi yang valid!");
                continue;
            }

            if (nilai > 80 && nilai <=100) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A");
                System.out.println("Bagus pertahankan nilainya");
            }
            else if (nilai > 73 && nilai <= 80) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B+");
            }
            else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B");
            }
            else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C+");
            }
            else if (nilai > 50 && nilai <= 60) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C");
            }
            else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah D");
            }
            else {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah E");
            }
        }
    }
}