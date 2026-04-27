package Jobsheet09;

import java.util.Scanner;

public class MahasiswaDemo03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackTugasMahasiswa03 stack = new StackTugasMahasiswa03(5);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Pertama");
            System.out.println("6. Melihat Jumlah Tugas");
            System.out.println("7. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();

                    Mahasiswa03 mhs = new Mahasiswa03(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.println("Tugas berhasil dikumpulkan.");
                    break;

                case 2:
                    Mahasiswa03 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.print("Masukkan nilai: ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);

                        System.out.println("Nilai: " + nilai);
                        System.out.println("Biner: " + stack.konversiDesimalKeBiner(nilai));
                    }
                    break;

                case 3:
                    Mahasiswa03 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Terakhir: " + lihat.nama);
                    } else {
                        System.out.println("Kosong.");
                    }
                    break;

                case 4:
                    stack.print();
                    break;

                case 5:
                    Mahasiswa03 bawah = stack.peekBottom();
                    if (bawah != null) {
                        System.out.println("Pertama: " + bawah.nama);
                    } else {
                        System.out.println("Kosong.");
                    }
                    break;

                case 6:
                    System.out.println("Jumlah: " + stack.count());
                    break;

                case 7:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih >= 1 && pilih <= 7);
    }
}