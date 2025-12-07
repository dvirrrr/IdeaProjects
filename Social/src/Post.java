import java.util.Objects;

public abstract class Post implements Content {
    private static int idCounter = 0;
    protected int postID;
    protected String authorUsername;
    protected long timestamp;
    protected int likesCount;

    public Post(String authorUsername) {
        this.postID = ++idCounter;
        this.authorUsername = authorUsername;
        this.timestamp = System.currentTimeMillis();
        this.likesCount = 0;
    }

    public void addLike() {
        this.likesCount++;
    }

    public String getAuthorUsername() {
        return authorUsername;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return postID == post.postID;
    }

    public int hashCode() {
        return Objects.hash(postID);
    }
}