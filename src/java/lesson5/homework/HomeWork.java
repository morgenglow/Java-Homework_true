package lesson5.homework;

import java.util.ArrayList;

class employee {
    private String name;
    private String position;
    private int age;
    private String email;
    private String phone;
    private int salary;


    public employee (String name, String position, int age, String email, String phone, int salary) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("name: " + this.name
                + " position: " + this.position + " age: "
                + this.age + " email: " + this.email + " phone: " + this.phone + " salary: " + this.salary);
    }

    public int getAge() {
        return age;

    }

}

public class Main {

    public static void main(String[] args) {
        employee[] Employee = new employee[5];
        Employee[0] = new employee("Петров Петр Петрович", "менеджер", 50,
                "1@mail.ru ", "9225101270", 10000);
        Employee[1] = new employee("Васильев Василий Васильевич", "менеджер", 20,
                "2@mail.ru", "9802221415", 30000);
        Employee[2] = new employee("Егоров Егор Егорович", "уборщик", 15,
                "3@mail.ru", "9401521415", 15000);
        Employee[3] = new employee("Егорова Клавдия Петровна", "директор", 45,
                "4@mail.ru", "9401521515", 150000);
        Employee[4] = new employee("Васильев Василий Петрович", "продавец", 25,
                "5@mail.ru", "9701521410", 25000);

        ArrayList<employee> filterBiggerThan40 = new ArrayList<>();
        for (employee a : Employee) {
            if (a.getAge() > 40) {
                filterBiggerThan40.add(a);
                a.printInfo();
            }
        }
    }
}
