public class Book extends LibraryItem {
    private String genre;

    public String getType() {
        return "Book";
    }


    public String toFileString() {
        return "year=" + this.getYear() +
                ", id=" + this.getId() +
                ", author='" + this.getAuthor() + '\'' +
                ", title='" + this.getTitle() + '\'' +
                ", genre='" + this.genre + '\'';
    }


}
