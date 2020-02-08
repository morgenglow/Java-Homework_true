package lesson6.classwork.inter;

public class Dog extends Animal {

    public Dog(String type) {
        super(type);
    }

    @Override
    public void say() {
        System.out.println("WOW");
    }
}
