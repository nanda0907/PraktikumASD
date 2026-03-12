package JobsheetP5;

import java.util.Scanner;

public class MainNilaiMahasiswa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = input.nextInt();
        input.nextLine();

        NilaiMahasiswa mhs[] = new NilaiMahasiswa[n];

        for(int i = 0; i < n; i++){

            System.out.println("Data mahasiswa ke-" + (i+1));

            System.out.print("Nama: ");
            String nama = input.nextLine();

            System.out.print("NIM: ");
            String nim = input.nextLine();

            System.out.print("Tahun masuk: ");
            int tahun = input.nextInt();

            System.out.print("Nilai UTS: ");
            int uts = input.nextInt();

            System.out.print("Nilai UAS: ");
            int uas = input.nextInt();
            input.nextLine();

            mhs[i] = new NilaiMahasiswa(nama, nim, tahun, uts, uas);
        }

        NilaiMahasiswa nm = new NilaiMahasiswa("", "", 0, 0, 0);

        int maxUTS = nm.utsTertinggi(mhs, 0, n-1);
        int minUTS = nm.utsTerendah(mhs, 0, n-1);
        double rataUAS = nm.rataUAS(mhs);

        System.out.println("\nUTS Tertinggi : " + maxUTS);
        System.out.println("UTS Terendah  : " + minUTS);
        System.out.println("Rata-rata UAS : " + rataUAS);
    }
}