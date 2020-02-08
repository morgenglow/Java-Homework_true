package lesson1;

import java.util.Scanner;

public class Example1 {

    long func(float arg) {
        return (long) arg;
    }

    String func(int value) {
        return "hello world!";
    }

    static void printSumAB(int a, int b) {
        System.out.println(a + b);
    }

    static int sumABC(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        printSumAB(32, 12);
        System.out.println(sumABC(1,2,3));
        //primitives
        byte byteValue; //-128; 127 1b
        short shortValue; // -2^15; 2^15-1 2b 10^5
        int a = 5;//-2^31; 2^31-1 4b 10^9
        long longValue = 9; //-2^63; 2^62 8b 10^19
        int b = 2; // 2 (1/2)
//        System.out.println(1 / 0);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println(a / b);
//        System.out.println(a % b);
//        //8 4 2 1
//        //1 0 0 1 = 9 << 2 = 1 0 0 1 0 0 = 32 + 4 = 36
//        //a << n = a * (2 ^ n)
//        //10011 >> 1 = 1001; 19 -> 9  a >> n = a / (2 ^ n)
//        System.out.println(a << 1);
//        System.out.println(a >> 1);
        a = (int) longValue;
        longValue = a;

        float floatValue = 0f;
        double doubleValue = 0;

        //System.out.println(floatValue / doubleValue);

        boolean flag = 1 != 2 && 1 < 2;

        System.out.println(1 != 2 && 1 < 2);

        char symbol = 'd';
        a = 1;
        b = 2;
        int c = 3, x = 8;
//        if (x >= c) {
//            System.out.println("4");
//        } else if (x >= b) {
//            System.out.println("3");
//        } else if (x >= a){
//            System.out.println("2");
//        } else {
//            System.out.println("1");
//        }
        if (x >= c || x < a) System.out.println("4");
        if(x >= b && x < c) System.out.println("3");
        if(x >= a && x < b) System.out.println("2");
    }
}
