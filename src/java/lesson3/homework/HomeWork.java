package lesson3.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork {

    /* example:
     * input: Mama mila ramu, Ramu mila mama!!!, [mama, ramu]
     * output: 4
     * use regex, split, lowerCase, replace methods
     * */
    public int countOfWordsFromDictionaryInString(String input, String[] dictionary) {
        String [] words = input.split(" ");
        int cnt = 0;
        for (String word : words) {
            word = word.toLowerCase().replaceAll("[^a-z]+", "");
            System.out.println(word);
            for (String dic : dictionary) {
                if (word.equals(dic.toLowerCase())) cnt++;
            }
        }
        return cnt;
    }

    /* example:
     * input: [1,0,3,17,2,7,14,1,1,7], K = 6
     * output: 3
     * use sort
     * */
    public int kOrderValue(int[] array, int k) {
        Arrays.sort(array);
        return array[k-1];
    }

    /*
    *  Это реальная задача, которую я сегодня делал на работе
    *  Кому интересно, можете проверить свои силы))))
    *  Если слово из values есть в словаре from, его необходимо заменить
    *  с from[i] на to[i] [a, b, c], [a, b], [x, y] -> [x, y, c]
    *  Если словарь to длиннее from, то строка to[from.length] - дефолтное
    *  значение для всех values, которых нет в словаре from
    *  [a, b, c, d], [a, b], [x, y, lol] -> [x, y, lol, lol]
    *  Если словарь from длиннее to, то необходимо удалить из values все значения
    *  имющиеся в куске from на индексах от to.length до rom.length
    *  [a, b, c, d], [a, b, e, d], [x, y] -> [x, y, c] d удалем, так как он есть во
    *  from
     */
    public String[] translate(String[] values, String[] from, String[] to) {
        // TODO: 1/22/2020
        return null;
    }

    /* example:
     * input: m.levin.main@mailg.spb.com
     * output: true
     *
     * use matches
     * */
    public boolean isEmail(String input) {
        return input.matches("[a-zA-Z0-9.]+@[a-zA-Z0-9.]+");
    }

    public void binarySearchGame() {
        int secretValue = new Random().nextInt(100); // компьютер загадывает число
        Scanner in = new Scanner(System.in);
        int cnt = 7;
        while (cnt > 0) {
            System.out.println("У вас " + cnt + " попыток, чтобы угадать мое число!" +
                    " Введите ваше предположение");
            int userPredict = in.nextInt();
            if (userPredict > secretValue) {
                System.out.println("Ваше значение больше моего");
            } else if (userPredict < secretValue) {
                System.out.println("Ваше значение меньше моего");
            } else {
                System.out.println("Поздравляю, Вы победили! Было загадано число " + secretValue);
                System.out.println("1. Продолжить\n2. Выйти\nВведите число:");
                int state = in.nextInt();
                if (state == 1) {
                    binarySearchGame();
                } else if (state == 2) {
                    return;
                } else {
                    System.out.println("Input ERROR");
                    return;
                }
            }
            cnt--;
        }
        System.out.println("Ваши попытки кончились! Вы проиграли!");
    }

    public void wordsGame() throws FileNotFoundException {
        String [] words = new Scanner(new File("input.txt"))
                .nextLine().replaceAll("\\{|\\}|\"|;", "").split(", ");
        //System.out.println(Arrays.toString(words));
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        String secretWord = words[rnd.nextInt(words.length)];
        System.out.println("Я загадал слово, попробуй его отгадать");
        while (true) {
            System.out.println("Введи слово");
            String word = in.next();
            if (word.equals(secretWord)) {
                System.out.println("Ура, ты угадал мое слово, это было: " + secretWord);
                break;
            } else {
                    String s = "";
                    int minLength = Math.min(word.length(), secretWord.length());

                    for (int i = 0; i < minLength; i++) {
                        if (word.charAt(i) != secretWord.charAt(i)) {
                            i = 10000000;
                            break;
                        } else {
                            s += word.charAt(i);
                        }
                    }
                    while (s.length() < 15) s += "#";
                    System.out.println(s);
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        new HomeWork().wordsGame();
    }
}
