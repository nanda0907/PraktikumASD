package Jobsheet01;

public class royalGarden {
    static int[] harga = {75000, 50000, 60000, 10000};
    static int[][] stock = {
        {10, 5, 15, 7},   
        {6, 11, 9, 12},   
        {2, 10, 10, 5},   
        {5, 7, 12, 9}     
    };

    static int hitungPendapatan(int cabang) {
        int total = 0;
        for (int i = 0; i < harga.length; i++) {
            total += stock[cabang][i] * harga[i];
        }
        return total;
    }

    static String statusCabang(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < stock.length; i++) {
            int pendapatan = hitungPendapatan(i);
            String status = statusCabang(pendapatan);
            System.out.println("RoyalGarden " + (i+1) + 
                               " Pendapatan: Rp" + pendapatan + 
                               " -> Status: " + status);
        }
    }
}