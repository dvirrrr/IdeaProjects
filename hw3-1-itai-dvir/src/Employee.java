public abstract class Employee extends Person {
    private int empID;
    private String department;
    private Date startDate;
    private static double tax = 0.35;
    private static int counter = 0;

    public Employee(int ID, String firstName, String lastName, String address, Date birthdate) {
        super(ID, firstName, lastName, address, birthdate);
        counter++;
    }

    public abstract double Salary();
    public double finalSalary(Date today) {
        double salary = Salary();
        if(this.birthdate.isMonth(today)) {
            salary += 300;
        }
        if(this.startDate.seniority(today) == 1) {
            salary += 1000;
        }
        if(this.startDate.seniority(today) == 2) {
            salary += 2000;
        }
        salary = salary - salary * tax;
        return salary;
    }
    public double income_tax(Date today) {
        return this.Salary() - this.finalSalary(today);
    }
    public String tax_report(Date today) {
        return this.toString() +
                "Worker type: "+this.getClass()+'\''+
                "Gross Salary: "+this.Salary()+'\''+
                "Net Salary: "+this.finalSalary(today)+'\''+
                "Income Tax: "+this.income_tax(today)+'\''
                ;
    }
}
