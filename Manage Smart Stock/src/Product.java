public class Product {
    private String name;
    private int version;
    private boolean isFragile;

    public Product(String name, int version, boolean isFragile) {
        this.name = name;
        this.version = version;
        this.isFragile = isFragile;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Product other = (Product) obj;

        // בדיקה של name
        if (name == null) {
            if (other.name != null) return false;
        } else if (!name.equals(other.name)) {
            return false;
        }

        // בדיקה של version
        if (version != other.version) return false;

        // בדיקה של isFragile
        if (isFragile != other.isFragile) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (name == null ? 0 : name.hashCode());
        result = 31 * result + version;
        result = 31 * result + (isFragile ? 1 : 0);
        return result;
    }


}
