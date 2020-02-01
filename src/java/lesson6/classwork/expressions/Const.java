package lesson6.classwork.expressions;

public class Const extends UnaryExpression {

    int value;

    public Const(int value) {
        this.value = value;
    }

    @Override
    public String toString() {

        return String.valueOf(value);
    }

    @Override
    public int evalute() {
        System.out.println("val");
        return value;
    }
}
