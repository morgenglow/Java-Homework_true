package lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int size = 5;
    public static char def = '_';
    public static int [][] goodTry = new int[size][size];

//печатаем поле
    static void showTable(char [][] t) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("|" + t[i][j]);
            }
            System.out.println("|");
        }
    }
//проверка на победу
static void checkVictory(int [][] X, boolean user) {
    for (int i = 0; i < size; i++) {
        int sX = 0, sY = 0, dS1 = 0, dS2 = 0;
        for (int j = 0; j < size; j++) {
            sX += X[i][j];
            sY += X[j][i];
            dS1 += X[j][j];
            dS2 += X[j][(size-1) - j];
            if (sX == 4 || sY == 4 || dS1 == 4 || dS2 == 4) {
                System.out.println(user ? "Вы победили!" : "Вы проиграли");
                System.exit(0);
            }
        }
    }
}

    //Эволюция иск.интеллекта
    public static int[][] monster (int [][] X) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                goodTry[i][j]=0;
            }
        }
        for (int i = 0; i < size; i++) {
            int sX = 0, sY = 0, dS1 = 0, dS2 = 0;
            for (int j = 0; j < size; j++) {
                sX += X[i][j];
                sY += X[j][i];
                dS1 += X[j][j];
                dS2 += X[j][(size-1) - j];
                if(sX == 3){
                    goodTry[i][j+1]=1;
                }
                else if (sY==3) {
                    goodTry[i+1][j]=1;
                }
                else if (dS1==3) {
                    goodTry[i+1][j+1]=1;
                }
                else if (dS2==3) {
                    goodTry[i+1][size-1]=1;
                }
                else {
                    break;
                }
            }
        }
        return goodTry;
    }

//искусственный интеллект
    private static void moveAI(char[][] t, int [][] X) throws InterruptedException {
        System.out.println("Компьютер думает как походить");
        for (int i = 0; i < 7; i++) {
            System.out.print("*");
            Thread.sleep(250);
        }
        System.out.println();
        ArrayList<int []> pairs = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (t[i][j] == '_') {
                    pairs.add(new int[]{i, j});
                }
            }
        }
        if (pairs.size() == 0) {
            return;
        }
        monster(X);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (goodTry[i][j]==1) {
                    t[i][j] = 'O';
                    X[i][j] = 1;
                }
                else {
                    int [] rnd = pairs.get(new Random().nextInt(pairs.size()));
                    t[rnd[0]][rnd[1]] = 'O';
                    X[rnd[0]][rnd[1]] = 1;
                }
                break;
            }
            break;
    }
}

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        char [][] t = new char[size][size];
        int [][] X = new int[size][size];
        int [][] o = new int[size][size];
        for (int i = 0; i < size; i++) {
            Arrays.fill(t[i], def);
        }
        showTable(t);
        System.out.println("Вы играете крестиками!" +
                " Выберите номер строки и столбца");
        char user = 'X';
        int limit = (int)Math.pow(size,2);
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

}
