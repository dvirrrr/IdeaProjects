public class Truck extends Vehicle {
    private double cargoCapacityKG;

    public Truck(String licensePlate, String make, String model, double dailyRate, double cargoCapacityKG) {
        super(licensePlate, make, model, dailyRate);
        this.cargoCapacityKG = cargoCapacityKG;
    }

    @Override
    public double calculateRentalFee(int days) {
        double charge = dailyRate * days;
        if (cargoCapacityKG > 1000) {
            charge += 10 * days;
        }
        return charge;
    }
}