public class Car extends LandVehicle {
    private Enums.CarType style;

    public String toString() {
        return super.toString() +
                "Style: "+ this.style + '\'';
    }
}
