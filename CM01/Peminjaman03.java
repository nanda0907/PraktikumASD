package CM01;

public class Peminjaman03 {
    Mahasiswa03 mhs;
    Buku03 buku;
    int lamaPinjam;
    int terlambat;
    int denda;

    Peminjaman03(Mahasiswa03 m, Buku03 b, int lama){
        mhs = m;
        buku = b;
        lamaPinjam = lama;
    }

    void hitungDenda(){
        int batas = 5;
        int dendaPerHari = 0;

        if(lamaPinjam > batas){
            terlambat = lamaPinjam - batas;
            denda = terlambat * dendaPerHari;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }
}