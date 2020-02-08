package java_lesson7_homework;

import java.util.Random;

interface deFood {
    void decreaseFood(int n);
}

interface inFood {
    void increaseFood(int n);
}

interface eatCat {
    void eat(Plate plate);
}

abstract class PLateAction implements deFood,inFood {
    protected int food;
    public abstract void info();
}

class Plate extends PLateAction  {
    private static String defaultName = "Plate";
    private static int increment = 0;
    Random rn = new Random();

    public Plate ( ) {
        increment++;
        defaultName+= increment;
        this.food = rn.nextInt(100) ;
    }

    @Override
    public void decreaseFood(int n) {
        if (food>=n) {
            food -= n ;
            Cat.satiety = true;
        }
        else {
            System.out.println("В этой миске только "+food + " единиц еды. Столько съесть не получится!");
            Cat.satiety = false;
        }
    }

    // увеличиваем кол-во еды в миске
    @Override
    public void increaseFood ( int n ) {
        food+=n;
    }

    //статус миски
    @Override
    public void info () {
        System . out . println ( "В миске " + defaultName+ " еды: " + food );
    }

}

class Cat implements eatCat {
    protected String defaultName = "Cat";
    private static int increment = 0;
    private Random rn = new Random();
    protected int appetite;
    static boolean satiety;

    public Cat () {
        increment++;
        defaultName+= increment;
        this.appetite = rn.nextInt(50) ;
    }

    @Override
    public void eat (Plate p) {
        p.decreaseFood(appetite);
        System.out.println("Кот: " + defaultName + " Аппетит: " + appetite + " Сытость: " + satiety);
    }

}

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate();
        Cat[] cats = {new Cat(), new Cat(), new Cat()};
        for (int i = 0; i <= cats.length; i++) {
            plate.info();
            System.out.println("Кот " + cats[i].defaultName + " хочет съесть " + cats[i].appetite + " еды!");
            cats[i].eat(plate);
        }
        plate.increaseFood(200);
    }
}