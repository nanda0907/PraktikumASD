package Jobsheet09;

public class Mahasiswa03 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    Mahasiswa03() {
    }

    Mahasiswa03(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}