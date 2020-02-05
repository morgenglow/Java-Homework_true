package lesson6.classwork.expressions;

public class Multiply extends BinaryExpression {

    public Multiply(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " * " + right.toString() + ")";
    }

    @Override
    public int evalute() {
        System.out.println("mult");
        return left.evalute() * right.evalute();
    }
}
