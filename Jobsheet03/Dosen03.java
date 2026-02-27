package Jobsheet03;

public class Dosen03 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    public Dosen03() {
    }

    public Dosen03(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public String tampilJenisKelamin(){
        return jenisKelamin ? "Wanita" : "Pria";
    }
        
}
