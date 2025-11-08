public class OperatorAdd extends BinaryOperator{
    public OperatorAdd(ExpressionElement left, ExpressionElement right) {
        super("+", left, right);
    }

    @Override
    protected double operate() {
        return left.evaluate() + right.evaluate();
    }
}
