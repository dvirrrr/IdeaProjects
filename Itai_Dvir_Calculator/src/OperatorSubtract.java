public class OperatorSubtract extends BinaryOperator {

    public OperatorSubtract(ExpressionElement left, ExpressionElement right) {
        super("-", left, right);
    }

    @Override
    protected double operate() {
        return left.evaluate() - right.evaluate();
    }
}
