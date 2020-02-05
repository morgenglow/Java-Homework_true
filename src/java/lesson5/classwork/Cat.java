package lesson5.classwork;

import java.util.ArrayList;

public class Cat {

    String name;
    int age;

    public Cat(){}

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Vaska",12);
        cat.setName("asfasf");
        System.out.println(cat);
        //cat = null;
        Cat ca1 = cat;
        String s = "aaa" + "bbb", s1 = "cccc";
        s = s + 5;
        //System.out.println(ca1.age);
        Triangle t = new Triangle(3, 4);
        //t.setA(4);
        t.printInfo();
        System.out.println(t.angleAC());
        System.out.println(t.angleBC());
        System.out.println(t.angleAB());
//        Array ar = new Array();
//        for (int i = 0; i < 15; i++) {
//            ar.addToEnd(i+1);
//        }
//        ar.printArray();
//        ar.removeFromEnd();
//        ar.set(3, 700);
//        ar.printArray();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(i+1);
        }
    }
}
