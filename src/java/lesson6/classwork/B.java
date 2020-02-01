package lesson6.classwork;

public class B extends A {
    public B() {
    }

    public B(int a, int b, int c) {
        super(a, b);
        c = 0;
    }

    public B(float a) {
        super(a);
    }

    public B(int a, int b, float c) {
        super(a, b, c);
    }

    public static void main(String[] args) {
        B b = new B();

    }
}
