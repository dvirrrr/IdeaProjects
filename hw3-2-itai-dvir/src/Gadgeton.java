public class Gadgeton {
    private static Store [] stores = new Store[50];
    public static int store_counter=0;
    public Gadgeton() {
    }
    public void addStore(Store s) {
        if (store_counter > 49) {
            System.out.println("Max stores");
        }
        else {
            this.stores[store_counter] = s;
            store_counter++;
        }
    }
    public int allStock() {
        int sum=0;
        for (int i = 0; i < store_counter; i++) {
            sum += this.stores[i].storeStock();
        }
        return sum;
    }
    public void allEnoughEdition(String s) {
        for (int i = 0; i < store_counter; i++) {
            System.out.println("Store {"+i+"}: ");
            this.stores[i].enoughEdition(s);
        }
    }
}
