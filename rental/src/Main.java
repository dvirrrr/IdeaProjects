public class Main {
    public static void main(String[] args) {
        FleetManager operationController = new FleetManager();
        String storageFile = "fleet_data.ser";

        operationController.loadFleetState(storageFile);

        Customer newClient = new Customer(202, "Dana");
        operationController.registerCustomer(newClient);

        try {
            operationController.addVehicle(new Sedan("55-555-55", "Toyota", "Corolla", 120, 5));
            operationController.addVehicle(new Truck("66-666-66", "Isuzu", "Sumo", 250, 1500));
            operationController.addVehicle(new Sedan("77-777-77", "Honda", "Civic", 110, 5));
        } catch (DuplicateItemException dupEx) {
            System.out.println("Error adding vehicle: " + dupEx.getMessage());
        }

        try {
            double cost1 = operationController.processRental("55-555-55", 202, 3);
            System.out.println("Rental cost for Sedan (3 days): " + cost1);

            double cost2 = operationController.processRental("66-666-66", 202, 3);
            System.out.println("Rental cost for Truck (3 days): " + cost2);

        } catch (InvalidRentalException rentEx) {
            System.out.println("Rental failed: " + rentEx.getMessage());
        }


        try {
            operationController.addVehicle(new Sedan("55-555-55", "Toyota", "Clone", 100, 4));
        } catch (DuplicateItemException expectedEx) {
            System.out.println("Caught expected duplicate error: " + expectedEx.getMessage());
        }

        try {
            operationController.processRental("55-555-55", 202, 1);
        } catch (InvalidRentalException expectedEx) {
            System.out.println("Caught expected rental error: " + expectedEx.getMessage());
        }

        System.out.println("\n--- Available Vehicles ---");
        for (Vehicle unit : operationController) {
            System.out.println(unit);
        }
        System.out.println("--------------------------\n");

        operationController.saveFleetState(storageFile);
    }
}