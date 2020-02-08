package lesson6.classwork.constructors;

public class B extends A {

    public int c;

    public B(int a, int aI, int c) {
        super(a, aI);
        this.c = c;
        System.out.println("B was invoked");
    }

    @Override
    public void printParam() {
        super.printParam();
        System.out.print(" " + c);
    }
}
