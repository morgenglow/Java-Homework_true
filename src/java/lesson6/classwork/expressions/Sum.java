package lesson6.classwork.expressions;

public class Sum extends BinaryExpression {

    public Sum(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }

    @Override
    public int evalute() {
        System.out.println("sum");
        return left.evalute() + right.evalute();
    }
}
