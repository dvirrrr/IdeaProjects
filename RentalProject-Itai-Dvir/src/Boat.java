public class Boat extends LandVehicle {
    public Enums.BoatType style;
    public String toString() {
        return super.toString() +
                "Style: "+this.style+'\'';
    }
}
