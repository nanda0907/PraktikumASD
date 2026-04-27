package Jobsheet09;

public class StackTugasMahasiswa03 {

    Mahasiswa03[] stack;
    int top;
    int size;

    public StackTugasMahasiswa03(int size) {
        this.size = size;
        stack = new Mahasiswa03[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Mahasiswa03 mhs) {
        if (!isFull()) {
            stack[++top] = mhs;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public Mahasiswa03 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Mahasiswa03 peek() {
        if (!isEmpty()) {
            return stack[top];
        }
        return null;
    }

    public Mahasiswa03 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        }
        return null;
    }

    public int count() {
        return top + 1;
    }

    public void print() {
        if (!isEmpty()) {
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
            }
        } else {
            System.out.println("Stack kosong.");
        }
    }

    public String konversiDesimalKeBiner(int nilai) {
        if (nilai == 0) return "0";

        StackKonversi03 stack = new StackKonversi03();

        while (nilai > 0) {
            stack.push(nilai % 2);
            nilai /= 2;
        }

        String biner = "";
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }

        return biner;
    }
}