package Jobsheet01;
import java.util.Scanner;

public class platMobil {
    public static void main(String[] args) {
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        String[] KOTA = {
            "BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR",
            "PEKALONGAN", "SEMARANG", "SURABAYA", "MALANG", "TEGAL"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat mobil: ");
        char input = scanner.next().toUpperCase().charAt(0);

        boolean temukan = false;
        for (int i = 0; i < KODE.length; i++) {
            if (input == KODE[i]) {
                System.out.println("Kota: " + KOTA[i]);
                temukan = true;
                break;
            }
        }

        if (!temukan) {
            System.out.println("Kode plat mobil tidak valid!");
        }

        scanner.close();
    }
}