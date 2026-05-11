package Jobsheet12;

import java.util.Scanner;

public class DoubleLinkedListMain03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DoubleLinkedList03 list = new DoubleLinkedList03();
        int pilih;

        do {

            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("7. Tampilkan data secara terbalik");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");

            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {

                case 1:

                    System.out.print("Masukkan NIM   : ");
                    String nimAwal = scan.nextLine();

                    System.out.print("Masukkan Nama  : ");
                    String namaAwal = scan.nextLine();

                    System.out.print("Masukkan Kelas : ");
                    String kelasAwal = scan.nextLine();

                    System.out.print("Masukkan IPK   : ");
                    double ipkAwal = scan.nextDouble();
                    scan.nextLine();

                    Mahasiswa03 mhsAwal = new Mahasiswa03(nimAwal, namaAwal, kelasAwal, ipkAwal);
                    list.addFirst(mhsAwal);

                    break;

                case 2:

                    System.out.print("Masukkan NIM   : ");
                    String nimAkhir = scan.nextLine();

                    System.out.print("Masukkan Nama  : ");
                    String namaAkhir = scan.nextLine();

                    System.out.print("Masukkan Kelas : ");
                    String kelasAkhir = scan.nextLine();

                    System.out.print("Masukkan IPK   : ");
                    double ipkAkhir = scan.nextDouble();
                    scan.nextLine();

                    Mahasiswa03 mhsAkhir = new Mahasiswa03(nimAkhir, namaAkhir, kelasAkhir, ipkAkhir);
                    list.addLast(mhsAkhir);

                    break;

                case 3:

                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = scan.nextLine();

                    System.out.println("Masukkan data baru:");

                    System.out.print("Masukkan NIM   : ");
                    String nimBaru = scan.nextLine();

                    System.out.print("Masukkan Nama  : ");
                    String namaBaru = scan.nextLine();

                    System.out.print("Masukkan Kelas : ");
                    String kelasBaru = scan.nextLine();

                    System.out.print("Masukkan IPK   : ");
                    double ipkBaru = scan.nextDouble();
                    scan.nextLine();

                    Mahasiswa03 dataBaru = new Mahasiswa03(nimBaru, namaBaru, kelasBaru, ipkBaru);

                    list.insertAfter(keyNim, dataBaru);

                    break;

                case 4:
                    list.removeFirst();
                    break;

                case 5:
                    list.removeLast();
                    break;

                case 6:
                    list.print();
                    break;

                case 7:
                    list.printReverse();
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }

        } while (pilih != 0);

        scan.close();
    }
}