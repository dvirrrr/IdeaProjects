public class OperatorDivide extends BinaryOperator {
    public OperatorDivide (ExpressionElement left, ExpressionElement right) {
        super("/", left, right);
    }

    @Override
    protected double operate() {
        return left.evaluate() / right.evaluate();
    }
}
