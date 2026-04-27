package Jobsheet09;

public class StackKonversi03 {
    int[] tumpukanBiner;
    int size;
    int top;

    public StackKonversi03() {
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int data) {
        if (!isFull()) {
            tumpukanBiner[++top] = data;
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return tumpukanBiner[top--];
        }
        return -1;
    }
}