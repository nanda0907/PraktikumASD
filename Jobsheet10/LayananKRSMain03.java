package Jobsheet10;

import java.util.Scanner;

public class LayananKRSMain03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TugasAntrianKRS03 antrian = new TugasAntrianKRS03(10);
        int pilih;

        do {
            System.out.println("\n=== MENU ANTRIAN KRS ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Proses KRS (2 Mahasiswa)");
            System.out.println("3. Tampilkan Semua");
            System.out.println("4. Tampilkan 2 Terdepan");
            System.out.println("5. Lihat Antrian Terakhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Jumlah Sudah Proses");
            System.out.println("8. Sisa Belum Proses");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    antrian.enqueue(new TugasMahasiswa03(nim, nama, prodi, kelas));
                    break;

                case 2:
                    antrian.prosesKRS();
                    break;

                case 3:
                    antrian.tampilSemua();
                    break;

                case 4:
                    antrian.lihatAkhir();
                    break;

                case 5:
                    System.out.println("Jumlah antrian: " + antrian.getJumlahAntrian());
                    break;

                case 6:
                    System.out.println("Sudah proses: " + antrian.getSudahProses());
                    break;

                case 7:
                    System.out.println("Belum proses: " + antrian.getBelumProses());
                    break;

                case 0:
                    System.out.println("Terima kasih");
                    break;

                default:
                    System.out.println("Pilihan salah!");
            }

        } while (pilih != 0);
    }
}