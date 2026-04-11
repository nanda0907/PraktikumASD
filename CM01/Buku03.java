package CM01;

public class Buku03 {
    String kodeBuku;
    String judul;
    int tahunTerbit;

    Buku03(){

    }

    Buku03(String kode, String jdl, int tahun){
        kodeBuku = kode;
        judul = jdl;
        tahunTerbit = tahun;
    }

    void tampilBuku(){
        System.out.println("Kode Buku: " + kodeBuku);
        System.out.println("Judul: " + judul);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }
}
