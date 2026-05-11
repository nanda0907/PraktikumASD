package Jobsheet11;

public class TugasQueueLinkedList {
    
    TugasNode head;
    TugasNode tail;

    int size = 0;
    int max = 5;
    
    boolean isEmpty() {
        return head == null;
    }

    boolean isFull() {
        return size >= max;
    }

    void enqueue(TugasMahasiswa data) {

    if (isFull()) {
        System.out.println("Antrian penuh");
        return;
    }

    TugasNode ndInput = new TugasNode(data, null);

    if (isEmpty()) {
        head = ndInput;
        tail = ndInput;
    } else {
        tail.next = ndInput;
        tail = ndInput;
    }

    size++;

    System.out.println("Antrian berhasil ditambahkan");
}

    TugasMahasiswa dequeue(){
        if (!isEmpty()) {
            TugasMahasiswa data = head.data;
            System.out.println("Memanggil Antrian: ");
            System.out.println("NIM   : " + data.nim);
            System.out.println("Nama  : " + data.nama);
            System.out.println("Prodi : " + data.prodi);

            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
            size--;
            return data;
        } else {
            return null;
        }
    }

    void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + head.data.nama);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen terakhir: " + tail.data.nama);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    void clear() {
        head = tail = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }

    void jumlahAntrian() {
        if (!isEmpty()) {
            System.out.println("Jumlah antrian: " + size);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }
}
