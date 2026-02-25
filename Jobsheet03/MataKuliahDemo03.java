package Jobsheet03;

import java.util.Scanner;
public class MataKuliahDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah mata kuliah yang ingin diinput: ");
        int jumlahMatkul = Integer.parseInt(sc.nextLine());

        MataKuliah03[] arrayofMataKuliah03 = new MataKuliah03[jumlahMatkul];

        for(int i = 0; i < jumlahMatkul; i++){
            System.out.println("Masukkan data mata kuliah ke-" + (i + 1));

           arrayofMataKuliah03[i] = new MataKuliah03();
           arrayofMataKuliah03[i].tambahData();
        }

        for(int i = 0; i < 3; i++){
            System.out.println("Data mata kuliah ke-" + (i + 1));
            arrayofMataKuliah03[i].cetakInfo();
            System.out.println("--------------------------------------");
        }
    }
}
