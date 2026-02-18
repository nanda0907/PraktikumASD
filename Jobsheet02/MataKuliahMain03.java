package Jobsheet02;
public class MataKuliahMain03 {
   public MataKuliahMain03() {
   }

   public static void main(String[] args) {
      MataKuliah03 mataKuliah1 = new MataKuliah03();
      mataKuliah1.cetak();

      MataKuliah03 mataKuliah2 = new MataKuliah03("CS102", "Struktur Data", 4, 60);
      mataKuliah2.cetak();
      mataKuliah2.ubahSks(5);
      mataKuliah2.tambahJam(5);
      mataKuliah2.kurangiJam(10);
   }
}