import java.util.ArrayList;

public class Calculator {
    public static void main(String[] args) {
        // define literals
        Literal l1 = new Literal(1);
        Literal l2 = new Literal(2);
        Literal l3 = new Literal(3);
        Literal l4 = new Literal(4);
        Literal l5 = new Literal(5);
        Literal l15 = new Literal(15.4);
        // build the expression
        OperatorAdd a1 = new OperatorAdd(l1, l5); // 1+5
        OperatorMultiply m1 = new OperatorMultiply(l4, a1); // 4*(1+5)
        OperatorSubtract s1 = new OperatorSubtract(l15, l3); // 15.4-3
        OperatorMultiply m2 = new OperatorMultiply(s1, l2); // (15.4-3)*2
        OperatorAdd a2 = new OperatorAdd(m2, m1); // ((15.4-3)*2)+(4*(1+5))
        // calculate and print
        System.out.println(a2 + " = " + a2.evaluate());
    }
}
