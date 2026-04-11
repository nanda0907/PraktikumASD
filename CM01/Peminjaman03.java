package CM01;

public class Peminjaman03 {
    Mahasiswa03 mhs;
    Buku03 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    Peminjaman03(){

    }

    Peminjaman03(Mahasiswa03 m, Buku03 b, int lama){
        mhs = m;
        buku = b;
        lamaPinjam = lama;
    }

    void hitungDenda(){
        if(lamaPinjam > batasPinjam){
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    void tampilPeminjaman(){
        mhs.tampilMahasiswa();
        buku.tampilBuku();
        System.out.println("Lama Pinjam: " + lamaPinjam + " hari");
        System.out.println("Terlambat: " + terlambat + " hari");
        System.out.println("Denda: Rp " + denda);
    }
}
