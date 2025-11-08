import java.util.*;

public class Main {
    public static void main(String [] args) {
        Product p1 = new Product("A101", 1, true);
        Product p2 = new Product("A101", 1, true);
        Product p3 = new Product("A101", 2, true);
        System.out.println("p1 equals p2? ->"+p1.equals(p2));
        System.out.println("p1 equals p3? ->"+p1.equals(p3));

        Map<Product, Integer> inventory = new HashMap<>();
        InventoryManager iManager = new InventoryManager(inventory);
        iManager.addStock(p1, 81);
        iManager.addStock(p3, 35);
        iManager.displayInventory();
        iManager.updateStockPrice(p1, 10.90, new BulkDiscountPricing());
        iManager.updateStockPrice(p3, 49.90, new StandardPricing());
        


    }
}