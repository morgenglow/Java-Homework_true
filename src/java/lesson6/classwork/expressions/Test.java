package lesson6.classwork.expressions;

public class Test {
    public static void main(String[] args) {
        Expression expression = new Sum(new Sum(new Const(1),
                new Const(2)), new Multiply(new Const(3),
                new Sum(new Const(5),
                        new Const(6))));
        System.out.println(expression + " = " + expression.evalute());
        Expression div = new BinaryExpression(new Const(6), new Const(2)) {
            @Override
            public int evalute() {
                return left.evalute() / right.evalute();
            }
        };
        System.out.println(div + " = " + div.evalute());
    }
}
