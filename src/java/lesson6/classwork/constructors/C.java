package lesson6.classwork.constructors;

import java.util.ArrayList;
import java.util.List;

public class C extends B {

    public int d;

    public C(int a, int aI, int c, int  d) {
        super(a, aI, c);
        this.d = d;
    }

    @Override
    public void printParam() {
        super.printParam();
        System.out.println(" " + d);
    }

    public void foo(A a) {
        a.printParam();
    }

    public static void main(String[] args) {
        C c = new C(1,2,3,4);
        c.foo(new A(1,2));
        c.foo(new B(1,2,3));
        c.foo(new C(1,2,3,4));
        List<Integer> list = new ArrayList<>();
        //System.out.println(c.getClass());
    }
}
