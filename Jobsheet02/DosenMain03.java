package Jobsheet02;

public class DosenMain03 {
   public DosenMain03() {
   }
   public static void main(String[] args) {
      Dosen03 dosen1 = new Dosen03();
      dosen1.cetak();

      Dosen03 dosen2 = new Dosen03("L002", "Prof. Johnson", false, "2015", "Rekayasa Perangkat Lunak");
      dosen2.cetak();
      dosen2.ubahStatusAktif(true);
   }
}