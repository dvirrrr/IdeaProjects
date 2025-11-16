public class EBook extends LibraryItem {
    private double fileSize;
    public String getType() {
        return "EBook";
    }

    public String toFileString() {
        return  "year=" + this.getYear() +
                ", id=" + this.getId() +
                ", author='" + this.getAuthor() + '\'' +
                ", title='" + this.getTitle() + '\'' +
                ", fileSize='" + this.fileSize + '\'';
    }


}
