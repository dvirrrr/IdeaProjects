public class MilitaryVehicle extends Vehicle {
    private int numOfOperators;
    public String toString() {
        return super.toString() +
                "Number of operators: "+this.numOfOperators+ '\'';
    }

}
