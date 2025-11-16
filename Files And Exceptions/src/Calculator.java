public class Calculator {
    private int num;
    private double result;

    public Calculator(int num) {
        this.num = num;
        this.result = 0;
    }
    public Calculator() {
        this.num = 0;
        this.result = 0;
    }

    public double getResult() {
        return result;
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
    public void div(int n) throws ArithmeticException {
            if (n == 0)
                throw new ArithmeticException("Cannot divide by zero.");
            this.result /= n;
    }
    public void mod(int n) throws ArithmeticException {
        if (n == 0)
            throw new ArithmeticException("Cannot divide by zero.");
        int temp = (int)(this.result % n);
        this.result = temp % n;

    }
    public void sqrt() throws IllegalArgumentException {
        if (this.num < 0)
            throw new IllegalArgumentException("Cannot square root below zero.");
        this.result = Math.sqrt(this.num);
    }
    public void factorial() throws IllegalArgumentException {
        if (this.num < 0) {
            throw new IllegalArgumentException("cannot factorial below zero.");
        }
        if (this.num > 16) {
            throw new IllegalArgumentException("Factorial of numbers greater than 16 causes long overflow.");
        }

        long fact = 1;
        for (int i = 2; i <= this.num; i++) {
            fact = fact * i;
        }
        this.result = (double) fact;
    }
}
