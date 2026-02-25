package Jobsheet03;

import java.util.Scanner;
public class DosenDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dosen03[] arrayofDosen03 = new Dosen03[3];

        for(int i = 0; i < 3; i++){
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode: ");
            String kode = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (true: Wanita/false: Laki-laki): ");
            Boolean jenisKelamin = Boolean.parseBoolean(sc.nextLine());
            System.out.print("Usia: ");
            int usia = Integer.parseInt(sc.nextLine());

            arrayofDosen03[i] = new Dosen03(kode, nama, jenisKelamin, usia);
            System.out.println("--------------------------------------");
        }

        int no = 1;
        for (Dosen03 dosen : arrayofDosen03){
            System.out.println("Data dosen ke-" + no++);
            System.out.println("Kode: " + dosen.kode);
            System.out.println("Nama: " + dosen.nama);
            System.out.println("Jenis Kelamin: " + dosen.tampilJenisKelamin());
            System.out.println("Usia: " + dosen.usia);
            System.out.println("--------------------------------------");
        }
    }
}
