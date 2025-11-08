public class Volunteer extends Employee{

    public Volunteer(int ID, String firstName, String lastName, String address, Date birthdate) {
        super(ID, firstName, lastName, address, birthdate);
    }

    public double Salary() {
        return 0;
    }
}
