public class Magazine extends LibraryItem {
    private int editionID;

    @Override
    public String getType() {
        return "Magazine";
    }

    @Override
    public String toFileString() {
        return "year=" + this.getYear() +
                ", id=" + this.getId() +
                ", author='" + this.getAuthor() + '\'' +
                ", title='" + this.getTitle() + '\'' +
                ", editionID='" + this.editionID + '\'';
    }


}
