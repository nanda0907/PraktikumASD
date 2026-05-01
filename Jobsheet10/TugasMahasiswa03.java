package Jobsheet10;

public class TugasMahasiswa03 {
    String nim, nama, prodi, kelas;

    public TugasMahasiswa03(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampil() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Kelas: " + kelas);
    }
}
