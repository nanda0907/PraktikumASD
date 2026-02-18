package Jobsheet01;
import java.util.Scanner;

public class kolom {
    public static double volume(double sisi) {
        return Math.pow(sisi, 3);
    }
    public static double luasPermukaan(double sisi) {
        return 6 * Math.pow(sisi, 2);
    }
    public static double keliling(double sisi) {
        return 12 * sisi;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = input.nextDouble();

        System.out.println("Pilih Jenis Perhitungan:");
        System.out.println("1. Volume");
        System.out.println("2. Luas Permukaan");
        System.out.println("3. Keliling");
        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Volume: " + volume(sisi));
                break;
            case 2:
                System.out.println("Luas Permukaan: " + luasPermukaan(sisi));
                break;
            case 3:
                System.out.println("Keliling: " + keliling(sisi));
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
        input.close();
    }
}