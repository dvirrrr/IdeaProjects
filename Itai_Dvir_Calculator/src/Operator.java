public abstract class Operator implements ExpressionElement {
    protected String symbol;

    public Operator(String symbol) {
        this.symbol = symbol;
    }

    protected abstract double operate();

    @Override
    public double evaluate() {
        return operate();
    }

    @Override
    public String toString() {
        return "(" + symbol + ")";
    }
}
