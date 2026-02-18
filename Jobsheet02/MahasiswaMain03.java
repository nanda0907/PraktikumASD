package Jobsheet02;

public class MahasiswaMain03 {
    public static void main(String[] args) {
        Mahasiswa03 mhs1 = new Mahasiswa03();
        mhs1.nama = "Ananda Friska";
        mhs1.nim = "254107060030";
        mhs1.kelas = "SI 1C";
        mhs1.ipk = 4.0;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("1C");
        mhs1.updateIpk(3.80);
        mhs1.tampilkanInformasi();

        Mahasiswa03 mhs2 = new Mahasiswa03("Annisa Nabila", "21476590", 3.50, "TI 2D");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa03 mhsFriska = new Mahasiswa03("Afriska","23456790", 3.80, "SIB");
        mhsFriska.tampilkanInformasi();
    }
}
