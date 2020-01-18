package lesson2.homework;

import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr1 = new int [ ]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int [] arr2 = new int[8];
        int [] arr3 = new int [] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9};
        int [][] arr4 = new int[9][9];
        int [] arr5 = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 0, 8, 9};
        int [] arr6 = new int []  {1, 1, 1, 2, 1, 7};
        int [] arr62 = new int []  {1, 1, 1, 2, 1 };
        int [] arr7 = new int [] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int n = 2;
        arrChange(arr1);
        insert3(arr2);
        change6(arr3);
        arrSquare(arr4);
        findMinmax(arr5);
        System.out.println("\nМассив удовлетворяет условиям?  " + checkBal(arr6));;
        System.out.println("\nМассив удовлетворяет условиям?  " + checkBal(arr62));;
    }

    //Task1: целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void arrChange(int arr[]) {
        //печатаем изначальный массив
        System.out.println("Изначальный массив: ");
        System.out.println(Arrays.toString(arr));
        //меняем данные в массиве и выводим измененный массив
        System.out.println ("Новый массив: ");
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 0:
                    arr[i] = 1;
                    break;
                case 1:
                    arr[i] = 0;
                    break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Task 2: Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его
    //значениями 0 3 6 9 12 15 18 21;
    public static void insert3(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            switch (i) {
                case 0:
                    arr[i] = 0;
                    break;
                default:
                    arr[i] = arr[i - 1] + 3;
                    break;
            }
        }
        //печатаем заполненный массив
        System.out.println("\n");
        System.out.println(Arrays.toString(arr));

    }

    //Task 3: Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2
    public static void change6(int arr[]) {
        //печатаем изначальный массив
        System.out.println("\nИзначальный массив: ");
        System.out.println(Arrays.toString(arr));
        //меняем данные в массиве и выводим измененный массив
        System.out.println("Новый массив: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] = arr[i] * 2;
        }
        System.out.println(Arrays.toString(arr));
    }

    //Task 4: Создать квадратный двумерный целочисленный массив (количество строк и столбцов
    //одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static void arrSquare(int arr[][]) {
        //печатаем изначальный массив
        System.out.println("Изначальный массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\n");
            for (int j = 0; j <= arr[i].length-1; j++) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        //меняем данные в массиве и выводим измененный массив
        System.out.println("\n Новый массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\n");
            for (int j = 0; j <= arr[i].length-1; j++) {
                if (i==j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j]+" ");
            }
        }
    }

    //Task 5: Задать одномерный массив и найти в нем минимальный и максимальный элементы
    public static void findMinmax(int arr[]) {
        int min =  arr[0], max = arr[0]; // переменные для сохранения значений минимума и максимума
        //печатаем изначальный массив
        System.out.print("\nМассив: ");
        System.out.println(Arrays.toString(arr));
        //меняем данные в массиве и выводим измененный массив
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> max) {
                max = arr[i];
            }
            else if (arr[i]< min) {
                min = arr[i];
            }
        }
        System.out.println("\nMin = " + min + " Max= " + max);
    }

//    Task6: Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
//    если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, ||
//    10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
    public static boolean checkBal(int[] arr) {
         int rightSum, leftSum ;
    for (int i = 0; i < arr.length + 1; i++) {
        rightSum = 0;
        leftSum = 0;

        for (int k = 0; k < i; k++) {
            rightSum += arr[k];
        }
        for (int j = i; j < arr.length; j++) {
            leftSum += arr[j];
        }
        if (rightSum == leftSum) return true;
    }
    return false;
}
}
