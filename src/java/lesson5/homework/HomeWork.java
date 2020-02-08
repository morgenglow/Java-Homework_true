package lesson5.homework;

import lesson5.classwork.Array;

import java.util.ArrayList;

public class HomeWork {

    class Person {

        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public Person [] createFivePerson() {
        Person [] people = new Person[50];
        for (int i = 0; i < 50; i++) {
            people[i] = new Person("Ivan", i + 20);
        }
        return people;
    }
    
    public ArrayList<Person> filterBiggerThan40(Person [] people) {
        ArrayList<Person> list = new ArrayList<>();
        for(Person person : people) {
            if (person.age >= 40) {
                list.add(person);
            }
        }
        return list;
    }

}
