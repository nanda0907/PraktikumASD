package CM02;

public class Pesanan03 {
    int kodePesanan, harga;
    String namaPesanan, namaPembeli;

    Pesanan03 prev, next;

    public Pesanan03(int kodePesanan, String namaPesanan, int harga, String namaPembeli) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
        this.namaPembeli = namaPembeli;
    }

}
