public class TextPost extends Post {
    private String textContent;

    public TextPost(String authorUsername, String textContent) {
        super(authorUsername);
        if (textContent.length() > 280) {
            throw new IllegalArgumentException();
        }
        this.textContent = textContent;
    }

    public int getContentLength() {
        return textContent.length();
    }

    public void display() {
        System.out.println("Text Post (ID: " + postID + "): " + textContent);
    }
}