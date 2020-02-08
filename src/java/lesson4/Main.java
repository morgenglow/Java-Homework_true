package lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static void showTable(char [][] t) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|" + t[i][j]);
            }
            System.out.println("|");
        }
    }

    static void checkVictory(int [][] X, boolean user) {
        for (int i = 0; i < 3; i++) {
            int sX = 0, sY = 0, dS1 = 0, dS2 = 0;
            for (int j = 0; j < 3; j++) {
                sX += X[i][j];
                sY += X[j][i];
                dS1 += X[j][j];
                dS2 += X[j][2 - j];
                if (sX == 3 || sY == 3 || dS1 == 3 || dS2 == 3) {
                    System.out.println(user ? "Вы победили!" : "Вы проиграли");
                    //System.out.println(sX + " " + sY + " " + dS1 + " " + dS2);
                    System.exit(0);
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        char def = '_';
        char [][] t = new char[3][3];
        int [][] X = new int[3][3];
        int [][] o = new int[3][3];
        for (int i = 0; i < 3; i++) {
            Arrays.fill(t[i], def);
        }
        showTable(t);
        System.out.println("Вы играете крестиками!" +
                " Выберете номер строки и столбца");
        char user = 'X';
        int limit = 9;
        while (true) {
            System.out.println("Ваш ход:");
            int x = in.nextInt(), y = in.nextInt();
            x--; y--;
            while (t[x][y] != def) {
                System.out.println("Выберите пустую клетку! Ваш ход:");
                x = in.nextInt(); x--;
                y = in.nextInt(); y--;
            }
            t[x][y] = user;
            X[x][y] = 1;
            showTable(t);
            checkVictory(X, true);
            System.out.println("Компьютер думает как походить");
            for (int i = 0; i < 7; i++) {
                System.out.print("*");
                Thread.sleep(250);
            }
            System.out.println();
            moveAI(t, o);
            showTable(t);
            checkVictory(o, false);
            System.out.println("******");
            limit--;
            if (limit == 0) {
                System.out.println("Ничья");
                System.exit(0);
            }
        }
    }

    private static void moveAI(char[][] t, int [][] X) {
        ArrayList<int []> pairs = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (t[i][j] == '_') {
                    pairs.add(new int[]{i, j});
                }
            }
        }
        if (pairs.size() == 0) {
            return;
        }
        int [] rnd = pairs.get(new Random().nextInt(pairs.size()));
        t[rnd[0]][rnd[1]] = 'O';
        X[rnd[0]][rnd[1]] = 1;
    }

}
