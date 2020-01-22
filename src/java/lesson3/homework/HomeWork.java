package lesson3.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork {
    public static Scanner sc = new Scanner(System.in);
    
    //угадай число
    public static void guessThenumber() {
        do {
            System.out.println("\nУгадай число от 0 до 9. У тебя 3 попытки!\n");
            int number = new Random().nextInt(10);
            int i;
            for (i = 1; i < 4; i++) {
                System.out.printf("\n Введи число, попытка: " + i + ":");
                int idea = sc.nextInt();
                if (number > idea) {
                    System.out.println("Загаданное число больше!\n");
                } else if (idea < number) {
                    System.out.println("Загаданное число меньше!\n");
                } else {
                    System.out.println("\nУгадал!\n");
                    break;
                }
            }
            if (i == 4) {
                System.out.println("Попытки закончились!\n");
            }

            System.out.print("Поиграем еще? 1 - Да/ 0 - Нет: ");

        } while (sc.nextInt() == 1);

    }

    /* example:
     * input: [1,0,3,17,2,7,14,1,1,7], K = 6
     * output: 3
     * use sort
     * */
    public static int korderValue(int[] array, int k) {
       Arrays.sort(array);
       return array[k-1];
    }

    //реализовала абсолютно неинтересную игру, где попытки записываются в массив, потому что не поняла условия - ночь и т.д.
    //но в качестве опыта интересно, а аналог с тремя попытками в методе guessThenumber()
    public static void binarySearchGame() {
        do {
            int number = new Random().nextInt(100);
            System.out.println("\nУгадай число от 0 до 100. У тебя 7 попыток!\n");
            int size = sc.nextInt();
            if (size>7) {
                size=7;
            }
            int [] answers = new int[size];
            for (int i = 0; i < size; i++) {
                answers[i] = sc.nextInt();
                if (number > answers[i]) {
                    System.out.println(answers[i]+": Загаданное число больше!\n");
                } else if (answers[i] > number) {
                    System.out.println(answers[i]+": Загаданное число меньше!\n");
                } else {
                    System.out.println(answers[i]+ ": Угадал!\n");
                    break;
                }
            }
            System.out.print("Поиграем еще? 1 - Да/ 0 - Нет: ");

        } while (sc.nextInt() == 1);
    }

    //угадай слово
    public static void guessWord() {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        do {
            System.out.println("\n Угадай, какое слово из списка загадано!");
            System.out.println(Arrays.toString(words));
            String answer = words[new Random().nextInt(words.length)];
            char[] attempt = new char[answer.length()];
            Arrays.fill(attempt, '*');

            while (true) {
                System.out.print("\n Введи слово: ");
                String proposal = sc.next().toLowerCase();
                if (answer.equals(proposal)) {
                    System.out.println("\nУгадал!\n");
                    break;
                }
                for (int i = 0; i < answer.length(); i++)
                    if (answer.charAt(i) == proposal.charAt(i)) attempt[i] = answer.charAt(i);
                System.out.println(attempt);
            }

            System.out.print("Поиграем еще? 1 - Да/ 0 - Нет: ");

        } while (sc.nextInt() == 1);

    }

public static void main(String[] args) {
    int [] array = new int[]{1,0,3,17,2,7,14,1,1,7};
    int k =6;
    System.out.println(korderValue(array,k));
    guessThenumber();
    binarySearchGame();
    guessWord();
}
}
