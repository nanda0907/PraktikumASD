package Jobsheet03;

import java.util.Scanner;
public class MahasiswaDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa03[] arrayofMahasiswa03 = new Mahasiswa03[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayofMahasiswa03[i] = new Mahasiswa03();

            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            arrayofMahasiswa03[i].nim = sc.nextLine();
            System.out.print("Nama: ");
            arrayofMahasiswa03[i].nama = sc.nextLine();
            System.out.print("Kelas: ");
            arrayofMahasiswa03[i].kelas = sc.nextLine();
            System.out.print("IPK: ");
            dummy = sc.nextLine();
            arrayofMahasiswa03[i].ipk = Float.parseFloat(dummy);
            System.out.println("--------------------------------------");
        }

            for (int i = 0; i < 3; i++) {
                System.out.println("Data mahasiswa ke-" + (i + 1));
                arrayofMahasiswa03[i].cetakInfo();
                System.out.println("--------------------------------------");
                // System.out.println("NIM: " + arrayofMahasiswa03[i].nim);
                // System.out.println("Nama: " + arrayofMahasiswa03[i].nama);
                // System.out.println("Kelas: " + arrayofMahasiswa03[i].kelas);
                // System.out.println("IPK: " + arrayofMahasiswa03[i].ipk);
            }
        // arrayofMahasiswa03[0] = new Mahasiswa03();
        // arrayofMahasiswa03[0].nim = "254107060030";
        // arrayofMahasiswa03[0].nama = "Friska";
        // arrayofMahasiswa03[0].kelas = "SIB-1C";
        // arrayofMahasiswa03[0].ipk = (float)3.88;

        // arrayofMahasiswa03[1] = new Mahasiswa03();
        // arrayofMahasiswa03[1].nim = "254107060031";
        // arrayofMahasiswa03[1].nama = "Alya";
        // arrayofMahasiswa03[1].kelas = "SIB-1C";
        // arrayofMahasiswa03[1].ipk = (float)3.7;

        // arrayofMahasiswa03[2] = new Mahasiswa03();
        // arrayofMahasiswa03[2].nim = "254107060032";
        // arrayofMahasiswa03[2].nama = "Vio";
        // arrayofMahasiswa03[2].kelas = "SIB-1C";
        // arrayofMahasiswa03[2].ipk = (float)3.78;

        // System.out.println("NIM : " + arrayofMahasiswa03[0].nim);
        // System.out.println("Nama : " + arrayofMahasiswa03[0].nama);
        // System.out.println("Kelas : " + arrayofMahasiswa03[0].kelas);
        // System.out.println("IPK : " + arrayofMahasiswa03[0].ipk);
        // System.out.println("================================");

        // System.out.println("NIM : " + arrayofMahasiswa03[1].nim);
        // System.out.println("Nama : " + arrayofMahasiswa03[1].nama);
        // System.out.println("Kelas : " + arrayofMahasiswa03[1].kelas);
        // System.out.println("IPK : " + arrayofMahasiswa03[1].ipk);
        // System.out.println("================================");

        // System.out.println("NIM : " + arrayofMahasiswa03[2].nim);
        // System.out.println("Nama : " + arrayofMahasiswa03[2].nama);
        // System.out.println("Kelas : " + arrayofMahasiswa03[2].kelas);
        // System.out.println("IPK : " + arrayofMahasiswa03[2].ipk);
        // System.out.println("================================");
    }
}
