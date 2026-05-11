package Jobsheet11;

import java.util.Scanner;
public class SLLMain03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList03 sll = new SingleLinkedList03();

        System.out.print("Masukkan data mahasiswa:");
        int jumah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumah; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));

            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa03 mhs = new Mahasiswa03(nim, nama, kelas, ipk);
            sll.addLast(mhs);
        }
        
        System.out.println("data index ke-1: ");
        sll.getData(1);

        System.out.println("\ndata mahasiswa an Bimon berada pada index: " + sll.indexOf("Bimon"));
        System.out.println();

        System.out.println("Isi Linked List :");
        sll.print();

        sll.removeFirst();
        sll.removeLast();
        System.out.println("Isi Linked List setelah menghapus elemen pertama dan terakhir:");
        sll.print();
        sll.removeAt(1);
        System.out.println("\nIsi Linked List setelah menghapus elemen index ke-1:");
        sll.print();
    }

}
