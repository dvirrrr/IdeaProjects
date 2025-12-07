import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SocialNetwork sn = new SocialNetwork();

        User u1 = new User("Noa", "noa.cohen95@gmail.com");
        User u2 = new User("Lavi", "lavi.levy88@gmail.com");
        User u3 = new User("Maya", "maya.s.music@outlook.com");
        User u4 = new User("Ori", "ori.dev.tech@gmail.com");

        sn.registerUser(u1);
        sn.registerUser(u2);
        sn.registerUser(u3);
        sn.registerUser(u4);

        TextPost tp1 = new TextPost("Noa", "Just found the best hummus spot in Florentin!");
        tp1.addLike(); tp1.addLike();

        TextPost tp2 = new TextPost("Lavi", "Hiking down south this weekend. The crater looks unreal.");
        tp2.addLike();

        MediaPost mp1 = new MediaPost("Noa");
        mp1.addFile("sunset_beach.jpg");
        mp1.addLike(); mp1.addLike(); mp1.addLike();

        MediaPost mp2 = new MediaPost("Maya");
        mp2.addFile("guitar_cover.mp4");

        TextPost tp3 = new TextPost("Ori", "New algorithm optimization is finally working. Coffee time.");
        tp3.addLike(); tp3.addLike(); tp3.addLike(); tp3.addLike();

        TextPost tp4 = new TextPost("Noa", "Traffic on Ayalon is crazy today.");

        sn.publishPost("Noa", tp1);
        sn.publishPost("Lavi", tp2);
        sn.publishPost("Noa", mp1);
        sn.publishPost("Maya", mp2);
        sn.publishPost("Ori", tp3);
        sn.publishPost("Noa", tp4);

        List<Post> noaPosts = sn.getAllPostsByUser("Noa");
        for (Post p : noaPosts) {
            p.display();
        }

        List<Post> topPosts = sn.getMostLikedPosts(3);
        topPosts.forEach(p -> System.out.println(p.postID + " " + p.likesCount));

        long totalChars = sn.countTotalTextCharacters();
        System.out.println(totalChars);

        Map<String, Integer> stats = sn.getUserPostCounts();
        System.out.println(stats);

        User duplicateUser = new User("Noa", "different.email@gmail.com");
        sn.registerUser(duplicateUser);

        User duplicateEmail = new User("Ron", "maya.s.music@outlook.com");
        sn.registerUser(duplicateEmail);
    }
}