package lesson6.classwork.inter;

public abstract class Animal {

    String type;

    public Animal(String type) {
        this.type = type;
    }

    public abstract void say();

    public void getType() {
        System.out.println(type);
    }

}
