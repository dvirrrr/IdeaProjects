public abstract class Person {
    private int ID;
    private String firstName;
    private String lastName;
    private String address;
    protected Date birthdate;
    public abstract double Salary();

    public Person(int ID, String firstName, String lastName, String address, Date birthdate) {

    }

    @Override
    public String toString() {
        return  "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", birthdate=" + this.birthdate.printDate() +
                '.';
    }
}
