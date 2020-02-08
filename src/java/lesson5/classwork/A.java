package lesson5.classwork;

public class A {

    public static int counter;
    private int number;

    static {
        counter = 0;
    }

    public A() {
        counter++;
        number = counter;
    }

    public void printNumber() {
        System.out.println(number);
    }
}
