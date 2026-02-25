package Jobsheet03;


public class DataDosen03 {
    public void dataSemuaDosen(Dosen03[] dataDosen){
        int no = 1;
        for (Dosen03 dosen : dataDosen) {
            System.out.println("Data dosen ke-" + no++);
            System.out.println("Kode Dosen    : " + dosen.kode);
            System.out.println("Nama Dosen    : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + dosen.tampilJenisKelamin());
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("----------------------------------");
        }
    }

    //jumlah dosen per jenis kelamin
    public void jumlahDosenPerjenisKelamin(Dosen03[] arrayofDataDosen) {
        int pria = 0;
        int wanita = 0;
        for (Dosen03 dsn : arrayofDataDosen) {
            if (dsn.jenisKelamin) {
                wanita++;
            } else {
                pria++;
            }
        }
        System.out.println("Jumlah Dosen Pria  : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    //Rata rata usia per jenis kelasmin
    public void rerataUsiaDosenPerJenisKelamin(Dosen03[] arrayofDataDosen){
        int totalPria = 0, totalWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen03 dsn : arrayofDataDosen) {
            if (dsn.jenisKelamin) {
                totalWanita += dsn.usia;
                countWanita++;
            } else {
                totalPria += dsn.usia;
                countPria++;
            }
        }
        System.out.println("Rata-rata usia dosen pria   : " + (countPria == 0 ? 0 : totalPria / countPria));
        System.out.println("Rata-rata usia dosen wanita : " + (countWanita == 0 ? 0 : totalWanita / countWanita));
    } 

    //Dosen dengan usia tertua
    public void infoDosenPalingTua(Dosen03[] arrayofDataDosen){
        Dosen03 tertua = arrayofDataDosen[0];

        for (Dosen03 dsn : arrayofDataDosen) {
            if (dsn.usia > tertua.usia) {
                tertua = dsn;
            }
        }
        System.out.println("Dosen tertua:");
        System.out.println("Kode Dosen    : " + tertua.kode);
        System.out.println("Nama Dosen    : " + tertua.nama);
        System.out.println("Jenis Kelamin : " + tertua.tampilJenisKelamin());
        System.out.println("Usia Dosen : " + tertua.usia);
    }

    // dosen dengan usia termuda
    public void infoDosenPalingMuda(Dosen03[] arrayofDataDosen){
        Dosen03 termuda = arrayofDataDosen[0];

        for (Dosen03 dsn : arrayofDataDosen) {
            if (dsn.usia < termuda.usia) {
                termuda = dsn;
            }
        }
        System.out.println("Dosen termuda:");
        System.out.println("Kode Dosen    : " + termuda.kode);
        System.out.println("Nama Dosen    : " + termuda.nama);
        System.out.println("Jenis Kelamin : " + termuda.tampilJenisKelamin());
        System.out.println("Usia Dosen    : " + termuda.usia);
    }
}
