public class Calculator {
    private int num;
    private double result;

    public Calculator(int num) {
        this.num = num;
    }
    public Calculator() {
        this.num = 0;
    }

    public void add(int n) {
        this.result += n;
    }
    public void sub(int n) {
        this.result -= n;
    }
    public void mul(int n) {
        this.result *= n;
    }
    public void div(int n) {
        this.result /= n;
    }
}
