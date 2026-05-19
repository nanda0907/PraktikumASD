package CM02;

import java.util.Scanner;
public class Main03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList03 antrian = new DoubleLinkedList03();

        antrian.tambahAntrian("Ainra", "08224500000");
        antrian.tambahAntrian("Danra", "08224511111");
        antrian.tambahAntrian("Sanri", "08224522222");

        int pilihan;
        do {
            System.out.println("==================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("==================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesanan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pembeli: ");
                    String namaPembeli = sc.nextLine();
                    System.out.print("Masukkan nomor HP: ");
                    String noHP = sc.nextLine();
                    antrian.tambahAntrian(namaPembeli, noHP);
                    break;
                case 2:
                    antrian.cetakAntrian();
                    break;
                case 3:
                    System.out.print("Masukkan kode pesanan: ");
                    int kodePesanan = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Masukkan nama pesanan: ");
                    String namaPesanan = sc.nextLine();
                    System.out.print("Masukkan harga: ");
                    int harga = sc.nextInt();
                    antrian.hapusAntrianDanPesanan(kodePesanan, namaPesanan, harga);
                    break;
                case 4:
                    antrian.laporanPesanan();
                    break;
                case 0:
                    System.out.println("Keluar dari sistem antrian Royal Delish.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}
