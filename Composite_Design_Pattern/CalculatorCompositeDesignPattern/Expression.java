package CalculatorCompositeDesignPattern;

public class Expression implements ArithmeticExpression{
    
    private ArithmeticExpression left;
    private ArithmeticExpression right;
    private Operation operation;

    public Expression(ArithmeticExpression left, ArithmeticExpression right, Operation operation) {
        this.left = left;
        this.right = right;
        this.operation = operation;
    }

    @Override
    public float evaluate() {
        switch (operation) {
            case ADDITION:
                return left.evaluate() + right.evaluate();
            case SUBTRACTION:
                return left.evaluate() - right.evaluate();
            case MULTIPLICATION:
                return left.evaluate() * right.evaluate();
            case DIVISION:
                return left.evaluate() / right.evaluate();
            default:
                return 0;
        }
    }
}
