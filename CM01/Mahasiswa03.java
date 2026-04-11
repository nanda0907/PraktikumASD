package CM01;

public class Mahasiswa03 {
    String nim;
    String nama;
    String prodi;

    Mahasiswa03(){

    }

    Mahasiswa03(String nm, String name, String prd){
        nim = nm;
        nama = name;
        prodi = prd;
    }

    void tampilMahasiswa(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }
}
