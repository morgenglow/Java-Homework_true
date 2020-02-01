package lesson6.classwork;

public class A {

    private int a, b;
    private float c;
    int d;
    public int e;

    public A() {
        System.out.println("1");
    }

    public A(int a, int b) {
        //this();
        System.out.println("2");
        this.a = a;
        this.b = b;
    }

    public A(float a) {
        System.out.println("3");
        this.c = a;
    }

    public A(int a, int b, float c) {
        this(a,b);
        this.c = c;
        System.out.println("4");
    }

    //1. overloading static in class
    //fooii
    int foo(int a, int b){
        return 1;
    }
    //fooif
    int foo(int a, float c) {
        return 2;
    }

    int foo(int i) {
        return 3;
    }

    int foo(long l) {
        return 4;
    }

    int foo(double d) {
        return 6;
    }

    int foo(float f) {
        return 5;
    }


    public static void main(String[] args) {
        A a = new A();
        //System.out.println(a.foo(12));
    }
}
