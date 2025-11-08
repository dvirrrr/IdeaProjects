public class Salesman extends Employee {
    private double totalSales;
    private static double takePrecent = 0.15;
    public double Salary() {
        return totalSales*takePrecent;
    }
}
