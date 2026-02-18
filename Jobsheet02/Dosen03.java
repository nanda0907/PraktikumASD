package Jobsheet02;
public class Dosen03 {
   String idDosen;
   String nama;
   boolean statusAktif;
   String tahunMulai;
   String bidangKeahlian;

   public Dosen03(String idDosen, String nama, boolean statusAktif, String tahunMulai, String bidangKeahlian) {
      this.idDosen = idDosen;
      this.nama = nama;
      this.statusAktif = statusAktif;
      this.tahunMulai = tahunMulai;
      this.bidangKeahlian = bidangKeahlian;
   }

   public Dosen03() {
      this("L001", "Dr. Smith", true, "2010", "Ilmu Komputer");
   }

   public void cetak() {
      String var10001 = this.idDosen;
      System.out.println("ID Dosen: " + var10001);
      var10001 = this.nama;
      System.out.println("Nama: " + var10001);
      System.out.println("Aktif: " + (this.statusAktif ? "Ya" : "Tidak"));
      System.out.println("Tahun Mulai: " + this.tahunMulai);
      System.out.println("Bidang Keahlian: " + this.bidangKeahlian);
   }

   public void ubahStatusAktif(boolean status) {
      this.statusAktif = status;
      System.out.println("Status aktivitas diubah menjadi: " + (status ? "Aktif" : "Tidak Aktif"));
   }
}