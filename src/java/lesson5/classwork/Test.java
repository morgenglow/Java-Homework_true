package lesson5.classwork;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        ArrayList<A> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(new A());
        }
        for (int i = 0; i < 5; i++) {
            list.remove(new Random().nextInt(list.size()));
        }
        for (A a : list) {
            a.printNumber();
        }
        new A().printNumber();
    }
}
