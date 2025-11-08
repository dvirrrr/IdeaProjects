public class Literal implements ExpressionElement {
    private double num;

    public Literal(double num) {
        this.num = num;
    }

    @Override
    public double evaluate() {
        return num;
    }

    @Override
    public String toString() {
        if (num == (long) num && num < 0) {
            return "("+(long)num+ ")";
        }
        else if (num == (long) num && num >= 0) {
            return String.valueOf((long) num);
        }
        else if (num < 0) {
            return "("+num+")";

        } else {
            return String.valueOf(num);
        }
    }
}
