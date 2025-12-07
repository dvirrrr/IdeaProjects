import java.util.ArrayList;
import java.util.List;

public class MediaPost extends Post {
    private List<String> filePaths;

    public MediaPost(String authorUsername) {
        super(authorUsername);
        this.filePaths = new ArrayList<>();
    }

    public void addFile(String path) {
        this.filePaths.add(path);
    }

    public int getContentLength() {
        return filePaths.size();
    }

    public void display() {
        System.out.println("Media Post (ID: " + postID + ") Files count: " + filePaths.size());
        if (!filePaths.isEmpty()) {
            System.out.println("First file: " + filePaths.get(0));
        }
    }
}