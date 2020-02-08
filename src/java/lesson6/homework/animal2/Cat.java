package lesson6.homework.animal2;

public class Cat extends Animal {
    public static void main(String[] args) {
        Cat cat = new Cat();

        abstract class Printer {
            abstract void print();
        }
        Printer p = new Printer() {
            @Override
            void print() {

            }
        };
        cat.doing(limit -> System.out.println("Cat run " + limit + " m."), 100);
        Run run = limit -> System.out.println("Cat run " + limit + " m.");
        Swim swim = limit -> System.out.println("Cat swim " + limit + " m.");
        Jump jump = limit -> System.out.println("Cat jump to " + limit + " m.");
        cat.doing(swim, 15);
        cat.doing(run, 37);
        cat.doing(jump, 10);
        new Dog().doing(arg-> {
            System.out.println("Dog run " + arg + " m.");
        }, 12);
    }
}
