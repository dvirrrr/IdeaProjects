import java.io.Serializable;
import java.util.Objects;

public abstract class Vehicle implements Serializable {
    private static final long serialVersionUID = 1L;
    protected String licensePlate;
    protected String make;
    protected String model;
    protected double dailyRate;
    protected boolean isAvailable;

    public Vehicle(String licensePlate, String make, String model, double dailyRate) {
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.dailyRate = dailyRate;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void rent() {
        this.isAvailable = false;
    }

    public void returnVehicle() {
        this.isAvailable = true;
    }

    public abstract double calculateRentalFee(int days);

    public boolean equals(Object comparisonTarget) {
        if (this == comparisonTarget) return true;
        if (comparisonTarget == null || getClass() != comparisonTarget.getClass()) return false;
        Vehicle other = (Vehicle) comparisonTarget;
        return Objects.equals(licensePlate, other.licensePlate);
    }

    public int hashCode() {
        return Objects.hash(licensePlate);
    }

    public String toString() {
        return "Vehicle " + licensePlate + " " + make + " " + model;
    }
}