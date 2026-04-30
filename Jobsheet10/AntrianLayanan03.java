package Jobsheet10;

public class AntrianLayanan03 {
    Mahasiswa03[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan03(int max) {
        this.max = max;
        this.data = new Mahasiswa03[max];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void tambahAntrian(Mahasiswa03 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk ke antrian.");
        }
    }

    public Mahasiswa03 layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        } else {
            Mahasiswa03 mhs = data[front];
            front = (front + 1) % max;
            size--;
            return mhs;
        }
    }

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan:");
            data[front].tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Mahasiswa dalam Antrian:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            int i = front;
            for (int j = 0; j < size; j++) {
                System.out.print((j + 1) + ". ");
                data[i].tampilkanData();
                i = (i + 1) % max;
            }
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public void lihatAkhir() {
    if (isEmpty()) {
        System.out.println("Antrian kosong.");
    } else {
        System.out.println("Mahasiswa paling belakang:");
        data[rear].tampilkanData();
    }
}
}