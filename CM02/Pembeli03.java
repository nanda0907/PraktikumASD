package CM02;

public class Pembeli03 {
    int noAntrian;
    String namaPembeli, noHP;

    public Pembeli03(int noAntrian, String namaPembeli, String noHP) {
        this.noAntrian = noAntrian;
        this.namaPembeli = namaPembeli;
        this.noHP = noHP;
    }

    Pembeli03 prev, next;

    public void tampil() {
        System.out.printf("%-12d %-15s %-15s%n", noAntrian, namaPembeli, noHP);
    }
}
