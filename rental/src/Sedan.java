public class Sedan extends Vehicle {
    private int numberOfPassengers;

    public Sedan(String licensePlate, String make, String model, double dailyRate, int numberOfPassengers) {
        super(licensePlate, make, model, dailyRate);
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public double calculateRentalFee(int days) {
        double standardCost = dailyRate * days;
        return standardCost + 50;
    }
}