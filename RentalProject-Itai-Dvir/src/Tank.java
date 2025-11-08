public class Tank extends MilitaryVehicle {
    private Enums.TankType style;
    public String toString() {
        return super.toString() +
                "Style: "+this.style+ '\'';
    }
}
