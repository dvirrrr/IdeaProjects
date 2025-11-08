public abstract class Vehicle extends IRental {
    private int weight;
    public String toString() {
        return "Rental-ID: "+ this.getRentalID() + '\'' +
                "Current-Rental: "+ this.isCurrentRental() + '\'';
    }
}
