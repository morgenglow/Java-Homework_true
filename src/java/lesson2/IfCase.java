package lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class IfCase {
    public static void main(String[] args) throws IOException {
        int a = 4, b = 4;
        if (a > 3 || ++b < 10) {}
        //System.out.println(a + " " + b);
        //input data case 0
        //a = System.in.read();
        //System.out.println((char) a);
        //input data case 1
//        Scanner in = new Scanner(System.in);
//        String s1 = in.nextLine();
//        String [] words = s1.split(" ");
//        System.out.println(Arrays.toString(words));
//        while (in.hasNext()) {
//            System.out.println(in.next());
//        }
        //input case 2
//        BufferedReader br = new BufferedReader(
//                new InputStreamReader(System.in)
//        );
//        int val = Integer.parseInt(br.readLine());
//        System.out.println(val);
        String name = "Иван";
        int age = 30;
        //%s - str, %d - int, long, %f - double, %c - char
        System.out.printf("%sу %d лет\n", name, age);
        int value = 0;
        switch (value) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            default:
                System.out.println("other");
        }
    }
}
