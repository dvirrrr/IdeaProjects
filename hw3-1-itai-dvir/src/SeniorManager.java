public class SeniorManager extends Manager{
    private double bonus;
    public double Salary() {
        return this.bonus*super.monthlySalary;
    }
}
