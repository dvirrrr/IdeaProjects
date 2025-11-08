public class SailBoat extends Vehicle {
    private Enums.SailBoatType style;
    private int numOfPassangers;
    public String toString() {
        return super.toString() +
                "Number of Passengers: "+ this.numOfPassangers+'\''+ 
                "Style: "+this.style+ '\'';
    }
}
