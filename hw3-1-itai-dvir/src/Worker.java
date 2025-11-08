public class Worker extends Employee{
    private static int baseSalary=11500;
    private double workingHours;
    public double Salary() {
        return baseSalary*this.workingHours;
    }

}
