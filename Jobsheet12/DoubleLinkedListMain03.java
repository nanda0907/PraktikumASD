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
            System.out.println("8. Tambah data berdasarkan index");
            System.out.println("9. Hapus data setelah NIM");
            System.out.println("10. Hapus data berdasarkan index");
            System.out.println("11. Tampilkan data pertama");
            System.out.println("12. Tampilkan data terakhir");
            System.out.println("13. Tampilkan data berdasarkan index");
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

                case 8:
                    System.out.print("Masukkan index: ");
                    int tambahIndex = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Masukkan NIM   : ");
                    String nimTambah = scan.nextLine();
                    System.out.println("Masukkan Nama  : ");
                    String namaTambah = scan.nextLine();
                    System.out.println("Masukkan Kelas : ");
                    String kelasTambah = scan.nextLine();
                    System.out.println("Masukkan IPK   : ");
                    double ipkTambah = scan.nextDouble();
                    scan.nextLine();

                    Mahasiswa03 dataTambah = new Mahasiswa03(nimTambah, namaTambah, kelasTambah, ipkTambah);
                    list.add(tambahIndex, dataTambah);
                    break;

                case 9:
                    System.out.print("Masukkan NIM : ");
                    String nimHapus = scan.nextLine();
                    list.removeAfter(nimHapus);
                    break;

                case 10:
                    System.out.print("Masukkan index yang dihapus : ");
                    int hapusIndex = scan.nextInt();
                    scan.nextLine();
                    list.remove(hapusIndex);
                    break;
                
                case 11:
                    list.getFirst();
                    break;

                case 12:
                    list.getLast();
                    break;

                case 13:
                    System.out.print("Masukkan index yang ditampilkan : ");
                    int tampilIndex = scan.nextInt();
                    scan.nextLine();
                    list.getIndex(tampilIndex);
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