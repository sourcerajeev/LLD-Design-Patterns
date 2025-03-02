package CalculatorCompositeDesignPattern;

public class CalculatorMain {

    public static void main(String[] args) {

        ArithmeticExpression leftExpression = new Number(5);
        ArithmeticExpression rightExpression = new Number(3);
        ArithmeticExpression expressionAdd = new Expression(
                leftExpression,
                rightExpression,
                Operation.ADDITION
        );
        System.out.println(expressionAdd.evaluate());

        ArithmeticExpression expression = new Expression(
                new Number(5),
                new Expression(
                        new Number(3),
                        new Number(2),
                        Operation.MULTIPLICATION
                ),
                Operation.ADDITION
        );
        System.out.println(expression.evaluate());
    }
}
