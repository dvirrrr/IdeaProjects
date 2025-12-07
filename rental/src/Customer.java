import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    private int customerID;
    private String name;
    private Set<String> activeRentals;

    public Customer(int customerID, String name) {
        this.customerID = customerID;
        this.name = name;
        this.activeRentals = new HashSet<>();
    }

    public int getCustomerID() {
        return customerID;
    }

    public void addRental(String plate) {
        activeRentals.add(plate);
    }

    public void removeRental(String plate) {
        activeRentals.remove(plate);
    }

    public boolean equals(Object comparisonTarget) {
        if (this == comparisonTarget) return true;
        if (comparisonTarget == null || getClass() != comparisonTarget.getClass()) return false;
        Customer other = (Customer) comparisonTarget;
        return customerID == other.customerID;
    }

    public int hashCode() {
        return Objects.hash(customerID);
    }
}