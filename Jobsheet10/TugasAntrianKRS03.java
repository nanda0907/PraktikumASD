package Jobsheet10;

public class TugasAntrianKRS03 {
    TugasMahasiswa03[] data;
    int front;
    int rear;
    int size;
    int max;
    int sudahDiproses;

    public TugasAntrianKRS03(int max) {
        this.max = max;
        data = new TugasMahasiswa03 [max];
        front = rear = -1;
        size = 0;
        sudahDiproses = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(TugasMahasiswa03 mhs) {
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
            System.out.println(mhs.nama + " berhasil masuk ke antrian KRS.");
        }
    }

    public void prosesKRS(){
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa, tidak dapat memproses KRS.");
            return;
        }

        System.out.println("Memproses KRS untuk mahasiswa:");
        for (int i = 0; i < 2; i++) {
            TugasMahasiswa03 mhs = data[front];
            mhs.tampil();
            front = (front + 1) % max;
            size--;
            sudahDiproses++;
        }
    }

    public void tampilSemua(){
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            int i = front;
            for (int j = 0; j < size; j++) {
                data[i].tampil();
                i = (i + 1) % max;
            }
        }
    }

    public void lihatAkhir(){
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa terakhir dalam antrian:");
            data[rear].tampil();
        }
    }
     
    public int getJumlahAntrian() {
        return size;
    }

    public int getSudahProses() {
        return sudahDiproses;
    }

    public int getBelumProses() {
        return (30 - sudahDiproses);
    }

}
