package CM01;

import java.util.Scanner;
public class Main03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // data mahasiswa
        Mahasiswa03[] mhs = {
            new Mahasiswa03("12345", "Andi", "TeknikInformatika"),
            new Mahasiswa03("67890", "Budi", "Teknik Informmatika"),
            new Mahasiswa03("54321", "Citra", "Sistem Informasi Bisnis")
        };

        // data buku
        Buku03[] buku = {
            new Buku03("B001", "Algoritma", 2020),
            new Buku03("B002", "Basis Data", 2019),
            new Buku03("B003", "Pemrograman Java", 2021),
            new Buku03("B004", "Fisika", 2024)
        };

        //data peminjaman
        Peminjaman03[] peminjaman = {
            new Peminjaman03(mhs[0], buku[0], 7),
            new Peminjaman03(mhs[1], buku[1], 3),
            new Peminjaman03(mhs[2], buku[2], 10),
            new Peminjaman03(mhs[2], buku[3], 6),
            new Peminjaman03(mhs[0], buku[1], 4)
        };

        // hitung denda semua
        for(Peminjaman03 p : peminjaman){
            p.hitungDenda();
        }

        // menu
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
                        System.out.println("NIM: " + m.nim + " | Nama: " + m.nama + " | Prodi: " + m.prodi);
                    }
                    break;
                case 2:
                    System.out.println("\n== DAFTAR BUKU ==");
                    for (Buku03 b : buku) {
                        System.out.println("Kode: " + b.kodeBuku + " | Judul: " + b.judul + " | Tahun: " + b.tahunTerbit);
                    }
                    break;
                case 3:
                    System.out.println("\n== DAFTAR PEMINJAMAN ==");
                    for (Peminjaman03 p : peminjaman) {
                        System.out.println(p.mhs.nama + " | " + p.buku.judul + " | lama: " + p.lamaPinjam + " | Terlamat: " + p.terlambat + " | Denda: Rp " + p.denda);
                    }
                    break;
                case 4:
                    // urutkan berdasarkan denda (descending)
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
                    for (Peminjaman03 p : peminjaman) {
                        System.out.println(p.mhs.nama + " | " + p.buku.judul + " | lama: " + p.lamaPinjam + " | Terlamat: " + p.terlambat + " | Denda: Rp " + p.denda);
                    }
                    break;
                case 5:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String cari = sc.next();

                    boolean ketemu = false;
                    for (Peminjaman03 p : peminjaman) {
                        if (p.mhs.nim.equals(cari)) {
                            System.out.println(p.mhs.nama + " | " + p.buku.judul + " | lama: " + p.lamaPinjam + " | Terlamat: " + p.terlambat + " | Denda: Rp " + p.denda);
                            ketemu = true;
                        }                    }
                    if (!ketemu) {
                        System.out.println("NIM tidak ditemukan.");
                    }
                    break;
            }
        } while (pilihan != 0);
    }
}