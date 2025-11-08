public class OperatorMultiply extends BinaryOperator {
    public OperatorMultiply(ExpressionElement left, ExpressionElement right) {
        super("*", left, right);
    }

    @Override
    protected double operate() {
        return left.evaluate() * right.evaluate();
    }
}
