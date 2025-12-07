public class Book extends LibraryItem implements ISearchable {

    private String genre;

    public Book(String id, String title, String author, int year, String genre) {
        super(id, title, author, year);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getType() {
        return "Book";
    }

    public String toFileString() {
        return String.join(",", getType(), getId(), getTitle(), getAuthor(), String.valueOf(getYear()), genre);
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Genre: " + genre);
    }

    public boolean matches(String keyword) {
        String details = getBaseSearchableDetails() + " " + genre;
        return details.toLowerCase().contains(keyword.toLowerCase());
    }
}