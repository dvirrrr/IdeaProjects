public class EBook extends LibraryItem implements ISearchable {

    private double fileSizeMB;

    public EBook(String id, String title, String author, int year, double fileSizeMB) {
        super(id, title, author, year);
        this.fileSizeMB = fileSizeMB;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

    public String getType() {
        return "EBook";
    }

    public String toFileString() {
        return String.join(",", getType(), getId(), getTitle(), getAuthor(), String.valueOf(getYear()), String.valueOf(fileSizeMB));
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("File Size (MB): " + fileSizeMB);
    }

    public boolean matches(String keyword) {
        String details = getBaseSearchableDetails() + " " + fileSizeMB;
        return details.toLowerCase().contains(keyword.toLowerCase());
    }
}