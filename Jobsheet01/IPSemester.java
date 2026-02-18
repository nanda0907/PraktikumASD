package Jobsheet01;

import java.util.Scanner;

public class IPSemester {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] mk = {
                "Pancasila",
                "Konsep Teknologi Informasi",
                "Critical Thinking and Problem Solving",
                "Matematika Dasar",
                "Bahasa Inggris",
                "Dasar Pemrograman",
                "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja"
        };

        double[] nilaiAngka = new double[mk.length];
        int[] sks = new int[mk.length];
        String[] nilaiHuruf = new String[mk.length];
        double[] nilaiSetara = new double[mk.length];

        double totalBobot = 0;
        int totalSKS = 0;

        System.out.println("=================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=================================");

        for (int i = 0; i < mk.length; i++) {
            System.out.println("\nMata Kuliah : " + mk[i]);

            System.out.print("Nilai angka : ");
            nilaiAngka[i] = sc.nextDouble();

            System.out.print("SKS         : ");
            sks[i] = sc.nextInt();
        }

        for (int i = 0; i < mk.length; i++) {

            double n = nilaiAngka[i];

            if (n > 80) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4;
            } else if (n > 73) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (n > 65) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3;
            } else if (n > 60) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (n > 50) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2;
            } else if (n > 39) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0;
            }

            totalBobot += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }

        double ip = totalBobot / totalSKS;

        System.out.println("\n=================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=================================");

        System.out.printf("%-40s %-12s %-12s %-10s %-5s\n",
                "MK", "Nilai", "Huruf", "Setara", "SKS");

        for (int i = 0; i < mk.length; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-10.2f %-5d\n",
                    mk[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i], sks[i]);
        }

        System.out.println("=================================");
        System.out.printf("IP Semester : %.2f\n", ip);

        sc.close();
    }
}
