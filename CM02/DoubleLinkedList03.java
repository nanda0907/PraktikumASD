package CM02;

public class DoubleLinkedList03 {
    Pembeli03 headPembeli, tailPembeli;
    Pesanan03 headPesanan, tailPesanan;

    int noAntrian = 0;

    // Method untuk menambahkan pembeli ke dalam antrian
    public void tambahAntrian(String namaPembeli, String noHP) {
        noAntrian++;
        Pembeli03 newPembeli = new Pembeli03(noAntrian, namaPembeli, noHP);
        if (headPembeli == null) {
            headPembeli = tailPembeli = newPembeli;
        } else {
            tailPembeli.next = newPembeli;
            newPembeli.prev = tailPembeli;
            tailPembeli = newPembeli;
        }
        System.err.println("Antrian berhasil ditambahkan dengan nomor : " + noAntrian);
    }

    public void sortingNamaPembeli() {
        for (Pembeli03 current = headPembeli; current != null; current = current.next) {
        for (Pembeli03 next = current.next; next != null; next = next.next) {
            if (current.namaPembeli.compareToIgnoreCase(next.namaPembeli) > 0) {

                String nama = current.namaPembeli;
                current.namaPembeli = next.namaPembeli;
                next.namaPembeli = nama;
                }
            }
        }

        System.out.println("Nama berhasil diurutkan");
    }

    //cetak antrian
    public void cetakAntrian(){
        Pembeli03 current = headPembeli;

        System.out.println("===============================");
        System.out.println("Daftar Antrian Pembeli Royal Delish");
        System.out.println("===============================");

        System.out.printf("%-12s %-15s %-15s%n", "No Antrian", "Nama Pembeli", "Nomor HP");

        while (current != null) {
            current.tampil();
            current = current.next;
        }
    }

    //hapus antrian dan pesanan
    public void hapusAntrianDanPesanan(int kodePesanan, String namaPesanan, int harga) {
        if (headPembeli == null) {
            System.out.println("Antrian kosong.");
            return;
        }

        Pembeli03 hapus = headPembeli;

        //hapus antrian pembeli
        if (headPembeli == tailPembeli) {
            headPembeli = tailPembeli = null;
        } else {
            headPembeli = headPembeli.next;
            headPembeli.prev = null;
        }

        //simpan data pesanan
        Pesanan03 newPesanan = new Pesanan03(kodePesanan, namaPesanan, harga, hapus.namaPembeli);
        if (headPesanan == null) {
            headPesanan = tailPesanan = newPesanan;
        } else {
            tailPesanan.next = newPesanan;
            newPesanan.prev = tailPesanan;
            tailPesanan = newPesanan;
        }   
        System.out.println(hapus.namaPembeli + " telah memesan " + namaPesanan + " dengan harga " + harga);
    }

    // laporan pesanan
    public void laporanPesanan() {
        if (headPesanan == null) {
            System.out.println("Tidak ada pesanan.");
            return;
        }

    // sorting berdasarkan nama pesanan
    for (Pesanan03 current = headPesanan; current != null; current = current.next) {

        for (Pesanan03 next = current.next; next != null; next = next.next) {

            if (current.namaPesanan.compareToIgnoreCase(next.namaPesanan) > 0) {

                // Menyimpan data current sementara agar tidak hilang saat proses swap
                int tempKode = current.kodePesanan;
                String tempNama = current.namaPesanan;
                int tempHarga = current.harga;

                //mengswap data current dengan next
                current.kodePesanan = next.kodePesanan;
                current.namaPesanan = next.namaPesanan;
                current.harga = next.harga;

                //mengisi data next dengan data current yang sudah disimpan sementara
                next.kodePesanan = tempKode;
                next.namaPesanan = tempNama;
                next.harga = tempHarga;
            }
        }
    }

    System.out.println("======================================");
    System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
    System.out.println("======================================");

    System.out.printf("%-15s %-20s %-10s%n",
            "Kode Pesanan", "Nama Pesanan", "Harga");

    Pesanan03 current = headPesanan;

    while (current != null) {

        System.out.printf("%-15d %-20s %-10d%n",
                current.kodePesanan,
                current.namaPesanan,
                current.harga);
            current = current.next;
        }
    }



    // //laporan pesanan
    // public void laporanPesanan() {
    //     if (headPesanan == null) {
    //         System.out.println("Tidak ada pesanan untuk dilaporkan.");
    //         return;
    //     }        

    //     Pesanan03 current = headPesanan;
    //     while (current != null) {
    //         System.out.println("Nama Pembeli: " + current.namaPembeli);
    //         System.out.println("Nama Pesanan: " + current.namaPesanan);
    //         System.out.println("Harga: " + current.harga);
    //         System.out.println("-------------------");
    //         current = current.next;
    //     }
    // }
}