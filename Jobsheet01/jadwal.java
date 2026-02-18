package Jobsheet01;
import java.util.Scanner;

public class jadwal {

    // INPUT DATA
    // =========================
    public static void inputData(String[][] jadwal, Scanner input) {

        for (int i = 0; i < jadwal.length; i++) {

            System.out.println("\nData jadwal ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = input.nextLine();

            System.out.print("Ruang            : ");
            jadwal[i][1] = input.nextLine();

            System.out.print("Hari             : ");
            jadwal[i][2] = input.nextLine();

            System.out.print("Jam              : ");
            jadwal[i][3] = input.nextLine();
        }
    }

    // TAMPIL SEMUA (TABEL)
    // =========================
    public static void tampilSemua(String[][] jadwal) {

        System.out.println("\n===== SEMUA JADWAL KULIAH =====");

        System.out.printf("%-25s %-20s %-10s %-15s\n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");

        for (int i = 0; i < jadwal.length; i++) {
            System.out.printf("%-25s %-20s %-10s %-15s\n",
                    jadwal[i][0],
                    jadwal[i][1],
                    jadwal[i][2],
                    jadwal[i][3]);
        }
    }

    // BERDASARKAN HARI
    // =========================
    public static void tampilBerdasarkanHari(String[][] jadwal, Scanner input) {

        System.out.print("Masukkan hari: ");
        String hari = input.nextLine();

        boolean ada = false;

        System.out.println("\nJadwal hari " + hari + ":");

        for (int i = 0; i < jadwal.length; i++) {

            if (jadwal[i][2].equalsIgnoreCase(hari)) {

                System.out.println(
                        jadwal[i][0] + " | " +
                        jadwal[i][1] + " | " +
                        jadwal[i][3]);

                ada = true;
            }
        }

        if (!ada) {
            System.out.println("Tidak ada jadwal di hari tersebut.");
        }
    }

    // BERDASARKAN NAMA MATKUL
    // =========================
    public static void cariMatkul(String[][] jadwal, Scanner input) {

        System.out.print("Masukkan nama mata kuliah: ");
        String cari = input.nextLine();

        boolean ada = false;

        for (int i = 0; i < jadwal.length; i++) {

            if (jadwal[i][0].equalsIgnoreCase(cari)) {

                System.out.println("\nData ditemukan:");
                System.out.println(
                        "Matkul : " + jadwal[i][0] +
                        "\nRuang  : " + jadwal[i][1] +
                        "\nHari   : " + jadwal[i][2] +
                        "\nJam    : " + jadwal[i][3]);

                ada = true;
                break;
            }
        }

        if (!ada) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }

    // MAIN PROGRAM
    // =========================
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah jadwal: ");
        int n = input.nextInt();
        input.nextLine();

        String[][] jadwal = new String[n][4];

        inputData(jadwal, input);

        int pilih;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tampilkan semua jadwal");
            System.out.println("2. Berdasarkan hari");
            System.out.println("3. Cari mata kuliah");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");

            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {

                case 1:
                    tampilSemua(jadwal);
                    break;

                case 2:
                    tampilBerdasarkanHari(jadwal, input);
                    break;

                case 3:
                    cariMatkul(jadwal, input);
                    break;
            }

        } while (pilih != 4);

        input.close();
    }
}