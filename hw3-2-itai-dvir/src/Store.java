public class Store {
    private Product [] p = new Product[5];
    private int product_counter;
    private static int minLimit = 5;
    public Store() {
        this.product_counter = 0;
    }
    public void addProduct(Product pr) {
        if (this.product_counter == this.p.length) {
            Product[] temp = new Product[this.p.length + 5];

            for (int i = 0; i < this.p.length; i++) {
                temp[i] = this.p[i];
            }

            this.p = temp;
        }

        this.p[this.product_counter] = pr;
        this.product_counter++;
    }
    public int storeStock() {
        return this.product_counter;
    }
    public void enoughEdition(String s) {
        int counter = 0;
        for (int i = 0; i < product_counter; i++) {
            if(this.p[i].isEdition(s)) {
                counter++;
            }
        }
        if (counter < minLimit) {
            System.out.println("Not enough");
        }
        else {
            System.out.println("There's enough");
        }
    }


}
