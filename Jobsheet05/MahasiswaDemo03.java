package Jobsheet05;
import java.util.Scanner;
public class MahasiswaDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumMhs = sc.nextInt();
        sc.nextLine(); 
        MahasiswaBerprestasi03 list = new MahasiswaBerprestasi03(jumMhs);

        for(int i = 0; i < jumMhs; i++){
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));

            System.out.print("NIM: ");
            String nim = sc.nextLine();

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("Kelas: ");
            String kelas = sc.nextLine();

            System.out.print("IPK: ");
            double ipk = Double.parseDouble(sc.nextLine());
            list.tambah(new Mahasiswa03(nim, nama, kelas, ipk));
        }
        list.tampil();
        System.out.println("-------------------");
        System.out.println("Pencarian Data :");
        System.out.print("----------------------------------");
        System.out.print("Masukkan IPK yang dicari : ");
        System.out.print("IPK : ");
        double cari = Double.parseDouble(sc.nextLine());

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
        if(posisi != -1){
            return;
        }

        System.out.print("--------------------");
        System.out.print("Pencarian data");
        System.out.print("------------------------");
        System.out.print("");
        System.out.print("Masukkan IPK yang dicari : ");
        System.out.print("IPK : ");
        cari = Double.parseDouble(sc.nextLine());
        list.bubbleSort();
        System.out.println("----------------------------");
        System.out.println("menggunakan binary searching");
        System.out.println("-------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs- 1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}