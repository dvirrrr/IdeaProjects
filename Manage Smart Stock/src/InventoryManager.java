import java.util.Map;
import java.util.HashMap;

public class InventoryManager {
    private Map<Product, Integer> inventory;
    private static double totalStock;

    public InventoryManager(Map<Product, Integer> inventory) {
        this.inventory = inventory;
    }


    public static double getTotalStock() {
        return totalStock;
    }

    public void addStock(Product product, int quantity) {
        if (inventory.containsKey(product)) {
            int currentQuantity = inventory.get(product);
            inventory.put(product, currentQuantity + quantity);
        } else {
            inventory.put(product, quantity);
        }
    }

    public void updateStockPrice(Product product, double basePrice, PricingStrategy strategy) {
        int quantity = inventory.get(product);
        double value = strategy.calculatePrice(basePrice, quantity);
        totalStock = value;

    }

    public void displayInventory() {
        for (Map.Entry<Product, Integer> entry : this.inventory.entrySet()) {
            System.out.println("Product -> "+entry.getKey()+", Quantity: "+entry.getValue());
        }

    }


}

