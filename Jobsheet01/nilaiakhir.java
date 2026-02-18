package Jobsheet01;

import java.util.Scanner;

public class nilaiakhir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilaiTugas, nilaiKuis, nilaiUts, nilaiUas, nilaiAkhir;
        String nilaiHuruf;

        System.out.println("PROGRAM MENGHITUNG NILAI AKHIR");
        System.out.println("===============================");
        System.out.println("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.println("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.println("Masukkan nilai uts: ");
        nilaiUts = sc.nextDouble();
        System.out.println("Masukkan nilai uas: ");
        nilaiUas = sc.nextDouble();
        System.out.println("===============================");

        if (nilaiTugas < 0 || nilaiTugas > 100 || 
            nilaiKuis < 0 || nilaiKuis > 100 || 
            nilaiUts < 0 || nilaiUts > 100 || 
            nilaiUas < 0 || nilaiUas > 100) {
            System.out.println("Nilai tidak valid, masukkan lagi nilai yang valid!!.");
        }else{
            nilaiAkhir = (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUts * 0.3) + (nilaiUas * 0.4);

            if (nilaiAkhir >= 80) {
                nilaiHuruf = "A";
            }else if (nilaiAkhir >= 70) {
                nilaiHuruf = "B";
            }else if (nilaiAkhir >= 60) {
                nilaiHuruf = "C";
            }else if (nilaiAkhir >= 50) {
                nilaiHuruf = "D";
            }else{
                nilaiHuruf = "E";
            }

            System.out.println("================================");
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("===============================");


            if (nilaiHuruf.equalsIgnoreCase("A") || 
                nilaiHuruf.equalsIgnoreCase("B+") || 
                nilaiHuruf.equalsIgnoreCase("B") || 
                nilaiHuruf.equalsIgnoreCase("C+") || 
                nilaiHuruf.equalsIgnoreCase("C")) {
                System.out.println("SELAMAT ANDA LULUS");
            }else{
                System.out.println("ANDA TIDAK LULUS");
            }
        }
    }
}
