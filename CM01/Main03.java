package CM01;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // data mahasiswa
        Mahasiswa03[] mhs = {
            new Mahasiswa03("12345", "Andi", "Teknik Informatika", "0812345678"),
            new Mahasiswa03("67890", "Budi", "Teknik Informatika", "0837847482"),
            new Mahasiswa03("54321", "Citra", "Sistem Informasi Bisnis", "0837476372")
        };

        // data buku
        Buku03[] buku = {
            new Buku03("B001", "Algoritma", 2020, "Friska"),
            new Buku03("B002", "Basis Data", 2019, "Aris"),
            new Buku03("B003", "Pemrograman Java", 2021, "Rio"),
            new Buku03("B004", "Fisika", 2024, "Awin")
        };

        // data peminjaman
        Peminjaman03[] peminjaman = {
            new Peminjaman03(mhs[0], buku[0], 7),
            new Peminjaman03(mhs[1], buku[1], 3),
            new Peminjaman03(mhs[2], buku[2], 10),
            new Peminjaman03(mhs[2], buku[3], 6),
            new Peminjaman03(mhs[0], buku[1], 4)
        };

        // hitung denda
        for(Peminjaman03 p : peminjaman){
            p.hitungDenda();
        }

        int pilihan;
        do{
            System.out.println("\n== SISTEM PEMINJAMAN RUANG BACA JTI ==");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("6. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n== DAFTAR MAHASISWA ==");
                    for (Mahasiswa03 m : mhs) {
                        System.out.println("NIM: " + m.nim + 
                                           " | Nama: " + m.nama + 
                                           " | Prodi: " + m.prodi +
                                           " | No HP: " + m.noHP);
                    }
                    break;

                case 2:
                    System.out.println("\n== DAFTAR BUKU ==");
                    for (Buku03 b : buku) {
                        System.out.println("Kode: " + b.kodeBuku + 
                                           " | Judul: " + b.judul + 
                                           " | Tahun: " + b.tahunTerbit +
                                           " | Penerbit: " + b.penerbit);
                    }
                    break;

                case 3:
                    System.out.println("\n== DAFTAR PEMINJAMAN ==");
                    for (Peminjaman03 p : peminjaman) {
                        System.out.println(p.mhs.nama + " | " + p.buku.judul + 
                                           " | Lama: " + p.lamaPinjam + 
                                           " | Terlambat: " + p.terlambat + 
                                           " | Denda: Rp " + p.denda);
                    }
                    break;

                case 4:
                    // menghitung berdasarkan denda
                    for (int i = 0; i < peminjaman.length - 1; i++) {
                        for (int j = 0; j < peminjaman.length - i - 1; j++) {
                            if (peminjaman[j].denda < peminjaman[j + 1].denda) {
                                Peminjaman03 temp = peminjaman[j];
                                peminjaman[j] = peminjaman[j + 1];
                                peminjaman[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("\n== PEMINJAMAN BERDASARKAN DENDA (DESCENDING) ==");

                    int jumlahDenda = 0;
                    for (Peminjaman03 p : peminjaman) {
                        System.out.println(p.mhs.nama + " | " + p.buku.judul + 
                                           " | Lama: " + p.lamaPinjam + 
                                           " | Terlambat: " + p.terlambat + 
                                           " | Denda: Rp " + p.denda);
                    // hitung jumlah mahasiswa yang memiliki denda
                        if (p.denda > 0) {
                            jumlahDenda++;
                        }
                    }

                    System.out.println("\nJumlah mahasiswa yang memiliki denda: " + jumlahDenda);
                    break;

                case 5:
                    System.out.print("Masukkan NIM: ");
                    String cari = sc.next();

                    boolean ketemu = false;
                    for (Peminjaman03 p : peminjaman) {
                        if (p.mhs.nim.equals(cari)) {
                            System.out.println(p.mhs.nama + " | " + p.buku.judul + 
                                               " | Lama: " + p.lamaPinjam + 
                                               " | Terlambat: " + p.terlambat + 
                                               " | Denda: Rp " + p.denda);
                            ketemu = true;
                        }
                    }

                    if (!ketemu) {
                        System.out.println("NIM tidak ditemukan.");
                    }
                    break;

                case 6:
                    System.out.println("Keluar dari program.");
                    break;
            }

        } while (pilihan != 6);
    }
}