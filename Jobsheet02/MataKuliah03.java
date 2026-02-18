package Jobsheet02;

public class MataKuliah03 {
   String idMataKuliah;
   String nama;
   int sks;
   int totalJam;

   public MataKuliah03(String idMataKuliah, String nama, int sks, int totalJam) {
      this.idMataKuliah = idMataKuliah;
      this.nama = nama;
      this.sks = sks;
      this.totalJam = totalJam;
   }

   public MataKuliah03() {
      this("CS101", "Pengantar Ilmu Komputer", 3, 45);
   }

   public void cetak() {
      System.out.println("ID Mata Kuliah: " + this.idMataKuliah);
      System.out.println("Nama: " + this.nama);
      System.out.println("SKS: " + this.sks);
      System.out.println("Total Jam per Minggu: " + this.totalJam);
   }

   public void ubahSks(int sksBaru) {
      this.sks = sksBaru;
      System.out.println("SKS diubah menjadi: " + sksBaru);
   }

   public void tambahJam(int jam) {
      this.totalJam += jam;
      System.out.println("Total jam bertambah " + jam + " menjadi " + this.totalJam);
   }

   public void kurangiJam(int jam) {
      if (this.totalJam - jam >= 0) {
         this.totalJam -= jam;
         System.out.println("Total jam berkurang " + jam + " menjadi " + this.totalJam);
      } else {
         System.out.println("Pengurangan tidak dapat dilakukan. Jam tidak mencukupi.");
      }
   }
} 
