package Jobsheet11;

public class Mahasiswa03 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa03() {

    }

    Mahasiswa03(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi() {
    System.out.printf("%-10s %-10s %-5s %-3.1f\n",
            nama, nim, kelas, ipk);
}
}
