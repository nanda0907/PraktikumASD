package Jobsheet03;

import java.util.Scanner;
public class DosenDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah mata kuliah yang ingin diinput: ");
        int jumlahDosen = Integer.parseInt(sc.nextLine());
        Dosen03[] arrayofDosen03 = new Dosen03[jumlahDosen];
        for(int i = 0; i < jumlahDosen; i++){
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode: ");
            String kode = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (true: Wanita/false: Pria): ");
            Boolean jenisKelamin = Boolean.parseBoolean(sc.nextLine());
            System.out.print("Usia: ");
            int usia = Integer.parseInt(sc.nextLine());

            arrayofDosen03[i] = new Dosen03(kode, nama, jenisKelamin, usia);
            System.out.println("--------------------------------------");
        }

        DataDosen03 dataDosen = new DataDosen03();
        System.out.println("=== Semua Data Dosen ===");
        dataDosen.dataSemuaDosen(arrayofDosen03);

        System.out.println("=== Jumlah Dosen Per Jenis Kelamin ===");
        dataDosen.jumlahDosenPerjenisKelamin(arrayofDosen03);

        System.out.println("=== Rata-rata Usia Dosen Per Jenis Kelamin ===");
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayofDosen03);

        System.out.println("=== Dosen Tertua ===");
        dataDosen.infoDosenPalingTua(arrayofDosen03);

        System.out.println("=== Dosen Termuda ===");
        dataDosen.infoDosenPalingMuda(arrayofDosen03);
    }
}
