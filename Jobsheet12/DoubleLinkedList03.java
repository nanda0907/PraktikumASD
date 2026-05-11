package Jobsheet12;

public class DoubleLinkedList03 {
    
    Node03 head, tail;

    public DoubleLinkedList03() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa03 data) {
        Node03 newNode = new Node03(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa03 data) {
        Node03 newNode = new Node03(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa03 data) {
        Node03 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM" + keyNim + " tidak ditemukan.");
            return;
        }
        Node03 newNode = new Node03(data);

        //jika current adalah tail
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong, tidak ada yang dihapus.");
            return;
        }
        Mahasiswa03 dataHapus = head.data;

        if (head == tail) { // hanya satu node
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data berhasil dihapus:");
        dataHapus.tampil();
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong, tidak ada yang dihapus.");
            return;
        }

        Mahasiswa03 dataHapus = tail.data;

        if (head == tail) { // hanya satu node
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data berhasil dihapus:");
        dataHapus.tampil();
    }

    public void print(){
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }

        Node03 current = head;

        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void printReverse() {

    if (isEmpty()) {
        System.out.println("Linked List masih kosong");
        return;
    }

        Node03 current = tail;

        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }

    public void clear() {
        head = tail = null;
    }

    public void add(int index, Mahasiswa03 data) {
        if (index < 0) {
            System.out.println("Index tidak valid.");
            return;
        }
        Node03 newNode = new Node03(data);
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node03 current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
        if (current == null) {
            addLast(data);
        } else {
            newNode.next = current;
            newNode.prev = current.prev;
            if (current.prev != null) {
                current.prev.next = newNode;
            }
            current.prev = newNode;
            if (current == head) {
                head = newNode;
            }
        }
    }

    public void removeAfter(String keyNim){
        Node03 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        if (current.next == null) {
            System.out.println("Tidak ada data setelah NIM " + keyNim + " untuk dihapus.");
            return;
        }
        Node03 hapus = current.next;

        if (hapus == tail) {
            tail = current;
            current.next = null;
        } else {
            current.next = hapus.next;
            hapus.next.prev = current;
        }
        System.out.println("Data berhasil dihapus:");
        hapus.data.tampil();
    }

    public void remove(int index) {
        if (index < 0 || isEmpty()) {
            System.out.println("Index tidak valid atau Linked List kosong.");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        Node03 current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
        if (current == null) {
            System.out.println("Index melebihi jumlah data.");
            return;
        }
        if (current == tail) {
            removeLast();
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
            System.out.println("Data berhasil dihapus:");
            current.data.tampil();
        }
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        System.out.println("Data pertama:");
        head.data.tampil();
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        System.out.println("Data terakhir:");
        tail.data.tampil();
    }

    public void getIndex(int index) {
        if (index < 0 || isEmpty()) {
            System.out.println("Index tidak valid atau Linked List kosong.");
            return;
        }
        Node03 current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
        if (current == null) {
            System.out.println("Index melebihi jumlah data.");
            return;
        }
        System.out.println("Data pada index " + index + ":");
        current.data.tampil();
    }
}
