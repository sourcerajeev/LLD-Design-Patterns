package CalculatorCompositeDesignPattern;

public class Number implements ArithmeticExpression {
    private float number;

    public Number(float number) {
        this.number = number;
    }

    @Override
    public float evaluate() {
        return number;
    }
    
}
