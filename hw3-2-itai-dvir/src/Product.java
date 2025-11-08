public class Product {
    private String manufacturer;
    private String edition;
    private static int stock = 0;

    public Product(String manufacturer, String edition) {
        this.manufacturer = manufacturer;
        this.edition = edition;
        stock++;
    }

    public Product() {

    }

    public boolean isEdition(String s) {
        return s.equals(this.edition);
    }
}
