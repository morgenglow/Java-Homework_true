package lesson6.classwork.expressions;

public abstract class BinaryExpression implements Expression {

    Expression left, right;

    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
