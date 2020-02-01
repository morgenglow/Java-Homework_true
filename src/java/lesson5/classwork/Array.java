package lesson5.classwork;

public class Array {

    private int [] data;
    private int len;

    public Array() {
        data = new int[100];
        len = 0;
    }

    public void addToEnd(int value) {
        data[len] = value;
        len++;
    }
    public void removeFromEnd() {
        len--;
    }

    public int get(int index) {
        return data[index];
    }
    public void set(int index, int value) {
        data[index] = value;
    }

    public void printArray() {
        for (int i = 0; i < len; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
