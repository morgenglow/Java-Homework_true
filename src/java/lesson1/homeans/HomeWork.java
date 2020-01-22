package lesson1.homeans;

import java.util.GregorianCalendar;

public class HomeWork {

    /*
     * Реализуйте методы данного класса
     * */

    public int task3(int a, int b, int c, int d) {
        return a * (b + c / d);
    }

    //inline

    public boolean task4(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    //a + b
    //f(a, b)
    public void task5(int number) {
        System.out.println(number >= 0 ? "Positive" : "Negative");
    }

    public boolean task6(int val) {
        return val < 0;
    }

    public void task7(String name) {
        System.out.println("Hello, " + name);
    }

    //ctrl + k
    public boolean isLeapYear(int year) {
        if ((year & 3) != 0) {
            return false;
        }
        return (year % 100 != 0) || (year % 400 == 0);
    }

}
