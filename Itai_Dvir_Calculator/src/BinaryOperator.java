public abstract class BinaryOperator extends Operator {
    protected ExpressionElement left;
    protected ExpressionElement right;

    public BinaryOperator(String symbol, ExpressionElement left, ExpressionElement right) {
        super(symbol);
        this.left = left;
        this.right = right;
    }

    @Override
    protected abstract double operate();

    @Override
    public String toString() {
        return "(" + this.left.toString() + this.symbol + this.right.toString() + ")";
    }
}
