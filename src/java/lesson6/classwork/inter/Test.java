package lesson6.classwork.inter;

public class Test {

    static void print(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        //Animal an = new Cat("cat");
        //an.say();
        //new Dog("dog").say();
        Writer writer = new ConsoleWriter();
        writer.println("OK");
        Writer fw = new FileWriter("C:\\Users\\Mikhail\\IdeaProjects\\java1\\src\\java\\lesson6\\classwork\\inter\\output.txt");
        fw.println("OK");
    }
}
