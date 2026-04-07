package Jobsheet05;
import java.util.Scanner;

public class MahasiswaDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi03 list = new MahasiswaBerprestasi03();

        System.out.print("Masukkan jumlah data: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < jumlah; i++){
            System.out.println("Data mahasiswa ke-" + (i+1));

            System.out.print("NIM: ");
            String nim = sc.nextLine();

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("Kelas: ");
            String kelas = sc.nextLine();

            System.out.print("IPK: ");
            double ipk = Double.parseDouble(sc.nextLine());

            Mahasiswa03 m = new Mahasiswa03(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("\nData sebelum sorting:");
        list.tampil();

        list.bubbleSort();

        System.out.println("\nData setelah sorting (ASC):");
        list.tampil();

        System.out.println("\nData sudah terurut menggunakna selection sort (ASC):");
        list.selectionSort();
        list.tampil();

        System.out.println("\nData sudah terurut menggunakan insertion sort (DESC):");
        list.insertionSort();
        list.tampil();
    }
}