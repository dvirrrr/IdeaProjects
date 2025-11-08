public class Main {
    public static void main(String[] args) {
        Gadgeton gadgeton = new Gadgeton();

        Store store1 = new Store();
        Store store2 = new Store();

        gadgeton.addStore(store1);
        gadgeton.addStore(store2);

        store1.addProduct(new MP3("Apple", "Standard"));
        store1.addProduct(new MP4("Samsung", "Pro"));
        store1.addProduct(new Headphones("Sony", "Pro"));
        store1.addProduct(new MP3("Apple", "Standard"));
        store1.addProduct(new Headphones("Bose", "Standard"));
        System.out.println("Store 1 stock: " + store1.storeStock() + "\n");

        store2.addProduct(new Headphones("Beats", "Limited"));
        store2.addProduct(new Headphones("Beats", "Limited"));
        store2.addProduct(new Headphones("Beats", "Limited"));
        store2.addProduct(new Headphones("Beats", "Limited"));
        store2.addProduct(new Headphones("Beats", "Limited"));
        store2.addProduct(new MP3("LG", "Standard"));
        System.out.println("Store 2 stock: " + store2.storeStock() + "\n");

        System.out.println("Total stock across all stores: " + gadgeton.allStock());

        System.out.println("\nChecking for 'Limited' edition products:");
        gadgeton.allEnoughEdition("Limited");

        gadgeton.allEnoughEdition("Standard");
    }

}