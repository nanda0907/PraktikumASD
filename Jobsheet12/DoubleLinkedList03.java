package Jobsheet12;

public class DoubleLinkedList03 {

    Node03 head;
    Node03 tail;

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
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node03 newNode = new Node03(data);

        // jika current adalah tail
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
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

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data berhasil dihapus:");
        dataHapus.tampil();
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        Node03 current = head;

        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }
}