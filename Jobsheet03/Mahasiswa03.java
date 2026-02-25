package Jobsheet03;

public class Mahasiswa03 {
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;

    public Mahasiswa03(){
    }
    
    public Mahasiswa03(String nm, String nim, float ipk, String kls) {
        this.nim = nim;
        this.nama = nm;
        this.kelas = kls;
        this.ipk = ipk;
    }

    void cetakInfo () {
        System.out.println("NIM: "+ nim);
        System.out.println("Nama: "+ nama);
        System.out.println("Kelas: "+ kelas);
        System.out.println("IPK: "+ ipk);
    }
}