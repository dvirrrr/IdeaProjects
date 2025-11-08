public class Main {
    public static void main(String [] args) {
        RentalCar rc1 = new RentalCar(100, "Ran", 5);
        RentalCar rc2 = new RentalCar(101, "Ben-Zion", 2);
        RentalTruck rt1 = new RentalTruck(102, "Shimshon", 2);
        RentalTruck rt2 = new RentalTruck(103, "Hilary", 1);
        RentalBoat rb1 = new RentalBoat(104, "Ali", 1);
        RentalSailBoat rsb1 = new RentalSailBoat(105, "Malciel", 2);
        RentalVehicle [] r = new RentalVehicle[8];
        r[0] = rc1;
        r[1] = rc2;
        r[2] = rt1;
        r[3] = rt2;
        r[4] = rb1;
        r[5] = rsb1;
        System.out.println("Print all rentals:");
        System.out.println("------------------");
        RentalVehicle.printRentals(r);
        System.out.println("Print all land rentals:");
        System.out.println("------------------");
        RentalVehicle.printLandRentals(r);


    }




}