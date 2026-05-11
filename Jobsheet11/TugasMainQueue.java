package Jobsheet11;

import java.util.Scanner;

public class TugasMainQueue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TugasQueueLinkedList tugasQueue = new TugasQueueLinkedList();

        int pilih;

        do {

            System.out.println("\n== MENU ANTRIAN ==");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Kosong");
            System.out.println("4. Cek Penuh");
            System.out.println("5. Kosongkan Antrian");
            System.out.println("6. Lihat Antrian Terdepan");
            System.out.println("7. Lihat Antrian Terakhir");
            System.out.println("8. Jumlah Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:

                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();

                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();

                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();

                    TugasMahasiswa mhs =
                            new TugasMahasiswa(nim, nama, prodi);

                    tugasQueue.enqueue(mhs);
                    break;

                case 2:
                    tugasQueue.dequeue();
                    break;

                case 3:
                    System.out.println(
                            tugasQueue.isEmpty()
                            ? "Antrian kosong"
                            : "Antrian tidak kosong");
                    break;

                case 4:
                    System.out.println(
                            tugasQueue.isFull()
                            ? "Antrian penuh"
                            : "Antrian belum penuh");
                    break;

                case 5:
                    tugasQueue.clear();
                    break;

                case 6:
                    tugasQueue.peek();
                    break;

                case 7:
                    tugasQueue.peekRear();
                    break;

                case 8:
                    tugasQueue.jumlahAntrian();
                    break;

                case 0:
                    System.out.println("Keluar dari program");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }

        } while (pilih != 0);
    }
}