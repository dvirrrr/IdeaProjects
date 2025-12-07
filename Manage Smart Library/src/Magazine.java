public class Magazine extends LibraryItem implements ISearchable {

    private int issueNumber;

    public Magazine(String id, String title, String author, int year, int issueNumber) {
        super(id, title, author, year);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getType() {
        return "Magazine";
    }

    public String toFileString() {
        return String.join(",", getType(), getId(), getTitle(), getAuthor(), String.valueOf(getYear()), String.valueOf(issueNumber));
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Issue Number: " + issueNumber);
    }

    public boolean matches(String keyword) {
        String details = getBaseSearchableDetails() + " " + issueNumber;
        return details.toLowerCase().contains(keyword.toLowerCase());
    }
}