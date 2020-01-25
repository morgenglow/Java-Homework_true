package lesson2.homework;

import java.util.Arrays;

public class HomeWork {
    // TODO: 17.01.2020
    public static int[] inverse(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] + 1) % 2;
        }
        return array;
    }

    public static int[] fillArray(int len) {
        int[] arr = new int[len];
        for (int i = 1; i < len; i++) {
            arr[i] = arr[i - 1] + 3;
        }
        return arr;
    }

    //O(len) -> O(len * len)
    public static int[][] fillMatrix(int len) {
        int[][] matrix = new int[len][len];
        for (int i = 0; i < len; i++) {
            matrix[i][i] = 1;
            matrix[i][len - i - 1] = 1;
        }
        return matrix;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i : array) {
            min = Math.min(min, i);
        }
        return min;
    }

    //{1 2 3 4 5}, 2 -> 4 5 1 2 3
    //1 2 3 4 5 -2 -> 3 4 5 1 2
    public static void shiftRight(int[] array, int shift) {
        if (shift < 0) {
            shift = -shift;
            shift %= array.length;
            shift = array.length - shift;
        } else {
            shift = shift % array.length;
        }
        while (shift > 0) {
            int tmp = array[array.length - 1];
            for (int i = array.length - 1; i >= 1; i--) {
                array[i] = array[i - 1];
            }
            array[0] = tmp;
            shift--;
        }
    }

    public static boolean checkBalance(int [] array) {
        int sum = 0, leftSum = 0;
        for (int i : array) {
            sum += i;
        }
        for (int i : array) {
            leftSum += i; //rightSum = sum - leftSum
            if (2 * leftSum == sum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(inverse(new int[]{0, 0, 1, 1, 0, 1})));
        System.out.println(Integer.toBinaryString(121));
        System.out.println(inverse(121));
        System.out.println(Arrays.toString(fillArray(8)));
        int[][] m = fillMatrix(5);
//        for (int i = 0; i < m.length; i++) {
//            for (int j = 0; j < m[i].length; j++) {
//                System.out.print(m[i][j] + " ");
//            }
//            System.out.println();
//        }
        for (int[] row : m) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println(min(new int[]{5, 7, -1, 4, 3, -2, 1}));
        int[] array = new int[]{1, 2, 3, 4, 5};
        shiftRight(array, -1);
        System.out.println(Arrays.toString(array));
    }

    private static String inverse(int value) {
        return Integer.toBinaryString(~value);
    }
}
