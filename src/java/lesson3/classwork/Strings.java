package lesson3.classwork;

import java.util.ArrayList;
import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        // str -> value final
        String str = "abbabbaba";
        System.out.println((int)str.charAt(1));
//        for (int i = 49; i < 59; i++) {
//            System.out.println(i  + " : " + (char) i);
//        }
        System.out.println();
        System.out.println((char)('A' + 3));
        System.out.println(str.contains("abbc"));
        System.out.println(str.indexOf("abb"));
        System.out.println(str.lastIndexOf("abb"));
        //String line = "  word1\nword   2   word3";
        //String [] words = line.trim().split("( +|\\n)");
        String line = "word1 word2 word3";
        System.out.println(Arrays.toString(line.split(" ")));
        //Integer i = 5; // boxing
        //int value = new Integer(12); // unboxing
        String a = "aaa", b = "aac", c = new String("aaa");
        System.out.println(a == b);
        System.out.println(a.equals(c));
        //a > b -> > 0, a < b -> < 0, a == b -> 0
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));
        //aabbccc
        //aabbccca
        //aaa
        //Aaa
        //matches replace
        String s = "111222";
        System.out.println(s.matches("[0-9]+.[0-9]+"));
        s = s.replaceAll("1", "5");
        System.out.println(s);
        //boxing unboxing
        //boxed types Type {int val}
    }
}
