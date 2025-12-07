import java.io.*;
import java.util.*;

public class FleetManager implements Iterable<Vehicle> {
    private Set<Vehicle> transportCollection;
    private TreeMap<Integer, Customer> clientRegistry;

    public FleetManager() {
        transportCollection = new HashSet<>();
        clientRegistry = new TreeMap<>();
    }

    public void addVehicle(Vehicle vehicle) throws DuplicateItemException {
        if (transportCollection.contains(vehicle)) {
            throw new DuplicateItemException("Duplicate vehicle: " + vehicle.getLicensePlate());
        }
        transportCollection.add(vehicle);
    }

    public void registerCustomer(Customer customer) {
        clientRegistry.put(customer.getCustomerID(), customer);
    }

    public double processRental(String plate, int customerId, int rentalDays) throws InvalidRentalException {
        Vehicle target = findVehicleByPlate(plate);
        Customer renter = clientRegistry.get(customerId);

        if (target == null) throw new InvalidRentalException("Vehicle missing");
        if (!target.isAvailable()) throw new InvalidRentalException("Vehicle unavailable");
        if (renter == null) throw new InvalidRentalException("Customer missing");

        target.rent();
        renter.addRental(plate);
        return target.calculateRentalFee(rentalDays);
    }

    public Vehicle findVehicleByPlate(String plate) {
        for (Vehicle unit : transportCollection) {
            if (unit.getLicensePlate().equals(plate)) {
                return unit;
            }
        }
        return null;
    }

    public void saveFleetState(String filename) {
        try (ObjectOutputStream statePersister = new ObjectOutputStream(new FileOutputStream(filename))) {
            statePersister.writeObject(transportCollection);
        } catch (IOException err) {
            err.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public void loadFleetState(String filename) {
        try (ObjectInputStream stateRestorer = new ObjectInputStream(new FileInputStream(filename))) {
            Object recoveredObject = stateRestorer.readObject();
            if (recoveredObject instanceof Set) {
                this.transportCollection = (Set<Vehicle>) recoveredObject;
            }
        } catch (IOException | ClassNotFoundException err) {

        }
    }

    public Iterator<Vehicle> iterator() {
        return new AvailableVehiclesIterator();
    }

    private class AvailableVehiclesIterator implements Iterator<Vehicle> {
        private Iterator<Vehicle> cursor;
        private Vehicle nextItem;

        public AvailableVehiclesIterator() {
            this.cursor = transportCollection.iterator();
            seekNext();
        }

        private void seekNext() {
            nextItem = null;
            while (cursor.hasNext()) {
                Vehicle potentialMatch = cursor.next();
                if (potentialMatch.isAvailable()) {
                    nextItem = potentialMatch;
                    break;
                }
            }
        }

        public boolean hasNext() {
            return nextItem != null;
        }

        public Vehicle next() {
            if (nextItem == null) throw new NoSuchElementException();
            Vehicle result = nextItem;
            seekNext();
            return result;
        }
    }
}