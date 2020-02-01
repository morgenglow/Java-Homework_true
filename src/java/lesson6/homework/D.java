package lesson6.homework;

class Dog extends Animal {
    static int count;

    public Dog(String name, int max_RUN_LENGTH, int max_SWIM_LENGTH, int max_JUMP_LENGTH) {
        super(name, max_RUN_LENGTH, max_SWIM_LENGTH, max_JUMP_LENGTH);
        count++;
        System.out.println("Создано собак: " + count);
    }
    void jump(int s){
        super.jump(s);
    }
    void run(int s) {
        super.run(s);
    }

    void swim(int s) {
        super.swim(s);
    }
}

class Cat extends Animal {
    static int count;

    public Cat(String name, int max_RUN_LENGTH, int max_SWIM_LENGTH, int max_JUMP_LENGTH) {
        super(name, max_RUN_LENGTH, max_SWIM_LENGTH, max_JUMP_LENGTH);
        count++;
        System.out.println("Создано котов: " + count);
    }
    void jump(int s){
        super.jump(s);
    }
    void run(int s) {
        super.run(s);
    }

    void swim(int s) {
        super.swim(s);
    }
}

   public class Animal {
    public String name; //имя животного
    public int s; //сколько пробежал, проплыл или подпрыгнул
    public int count=0; // счетчик животных
    int max_RUN_LENGTH ;
    int max_SWIM_LENGTH;
    int max_JUMP_LENGTH;

    public Animal() {
    }

    void run(int s) {
        if (s<=max_RUN_LENGTH) System.out.println(name + " пробежал  " + s + "м.");
        else System.out.println(name+ "столько не бегает");
    }

    void swim(int s) {
        if (s<=max_SWIM_LENGTH) System.out.println(name + " проплыл " + s + "м.");
        else System.out.println(name+ " столько не плавает");
    }

    void jump(int s) {
        if (s<=max_JUMP_LENGTH) System.out.println(name + " прыгнул на " + s + "м.");
        else System.out.println(name+ " столько не прыгает");
    }

    public Animal(String name, int max_RUN_LENGTH, int max_SWIM_LENGTH, int max_JUMP_LENGTH){
        this.name = name;
        this.max_RUN_LENGTH=max_RUN_LENGTH;
        this.max_JUMP_LENGTH=max_JUMP_LENGTH;
        this.max_SWIM_LENGTH=max_SWIM_LENGTH;
    }


    public static void main(String[] args) {
        Dog Bobik = new Dog("Бобик", 150, 200, 500);
        Cat Barsik = new Cat("Барсик", 100, 0, 10);
        Bobik.run(100);
        Barsik.swim(100);
        Bobik.swim(300);

    }
}
