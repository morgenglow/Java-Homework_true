package lesson6.classwork.inter;

public class Cat extends Animal {

    public Cat(String type) {
        super(type);
    }

    @Override
    public void say() {
        System.out.println("MEOW");
    }
}
