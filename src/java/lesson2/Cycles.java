package lesson2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Cycles {

    static void printN(char c, int n) {
        while (n-- > 0) System.out.print(c);
    }

    static void whileCycle() {
        //пока выполняется условие { делать это }
        int n = 5;
        while (n > 0) {
            System.out.println("n = " + n);
            n--;
        }
        n = 5;
        //[][][][][]
        while (n-- > 0) System.out.print("[]");
        System.out.println();
        n = 0;
        //[][[]][[[]]][[[[]]]][[[[[]]]]]
        while (n < 5) {
            printN('[', n + 1);
            printN(']', n + 1);
            n++;
        }
        System.out.println();
        //multiply table 9 * 9
        int i = 1, j = 1;
        while (i < 10) {
            j = 1;
            while (j < 10) {
                System.out.printf("%3d |", i * j);
                j++;
            }
            System.out.println();
            i++;
        }
    }

    static void forCycle() {
        for (int i = 1; i < 6; i++) {
            System.out.println("n = " + i);
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('[');
            }
            for (int j = 0; j < i; j++) {
                System.out.print(']');
            }
        }
        System.out.println();
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%3d ", i * j);
            }
            System.out.println();
        }
        int a = 3, b = 7, c = 12;
        //1 2 4 8 16 ....
//        for (int i = 1, cnt = 0; cnt < 50; i <<= 1, cnt++) {
//            System.out.print(i + " ");
//            if (cnt % 10 == 0) System.out.println();
//        }
        for (int i = 1; i < 10000; i <<= 1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1, cnt = 1; i < 100; i += cnt, cnt++) {
            System.out.println(i);
        }
    }

    static void arrays() {
        int[] a = new int[]{3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i : a) {
            System.out.print(i + " ");
        }
        //0,1,2,3,4,2,1,0
        //out: max array value,
        //and index of this value
        //impl1 O(N) depend by array length
        int[] mou = new int[]{0, 12, 3, 2, 0};
        //int n = new Scanner(System.in).nextInt();
        //int [] ar = new int[n];
        //System.out.println(ar.length);
        int peek = -1, index = -1;
        int timeDifficult = 0;
        for (int i = 0; i < mou.length; i++) {
            timeDifficult++;
            if (mou[i] > peek) {
                peek = mou[i];
                index = i;
            }
        }
        System.out.println();
        System.out.println("Processed by " + timeDifficult + " iteration");
        System.out.println("Peek height - " + peek + " at index = " + index);
        //impl2 O(logN)
        int l = 0, r = mou.length - 1;
        timeDifficult = 0;
        while (r - l != 3) {
            timeDifficult++;
            int m = (l + r) / 2;
            if (mou[m] > mou[m - 1]) {
                l = m - 1;
            } else r = m + 1;
        }
        System.out.println("Processed by " + timeDifficult + " iteration");
        System.out.println("Peek height - " + mou[l + 1] + " at index = " + (l + 1));

    }

    static void deepArrays() {
        int [][] a = new int[3][4];
        System.out.println(a);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = i * j;
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%3d", a[j][i]);
            }
            System.out.println();
        }
        int [][] ar = new int[3][];
        for (int i = 0; i < 3; i++) {
            ar[i] = new int[new Random().nextInt(10)];
        }
        System.out.println(Arrays.deepToString(ar));
    }

    public static void main(String[] args) {
        deepArrays();
    }
}
