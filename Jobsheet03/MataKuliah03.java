package Jobsheet03;

import java.util.Scanner;

public class MataKuliah03 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah03() {
    }

    public void tambahData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Kode: ");
        kode = sc.nextLine();
        System.out.print("Nama: ");
        nama = sc.nextLine();
        System.out.print("SKS: ");
        sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah Jam: ");
        jumlahJam = Integer.parseInt(sc.nextLine());
        System.out.println("--------------------------------------");
    }

    public void cetakInfo(){
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }
}
