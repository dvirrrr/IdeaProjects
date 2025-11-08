public class Truck extends LandVehicle {
    private Enums.TruckType style;
    public String toString() {
        return super.toString() +
                "Style: "+ this.style + '\'';
    }
}
