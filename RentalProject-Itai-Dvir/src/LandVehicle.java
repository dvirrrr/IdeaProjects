public class LandVehicle extends Vehicle {
    private int numOfPassengers;
    @Override
    public String toString() {
        return super.toString() +
            "Number of passengers: "+ this.numOfPassengers + '\'';
    }
}
