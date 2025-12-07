import java.util.*;
import java.util.stream.Collectors;

public class SocialNetwork {
    private Set<User> users;
    private Map<String, List<Post>> postsByUser;

    public SocialNetwork() {
        this.users = new HashSet<>();
        this.postsByUser = new HashMap<>();
    }

    public void registerUser(User user) {
        if (users.add(user)) {
            postsByUser.put(user.getUsername(), new ArrayList<>());
            System.out.println("User registered: " + user.getUsername());
        } else {
            System.out.println("Registration failed: User already exists.");
        }
    }

    public void publishPost(String username, Post post) {
        List<Post> userPosts = postsByUser.get(username);
        if (userPosts != null) {
            userPosts.add(post);
            System.out.println("Post published by " + username);
        } else {
            System.out.println("User not found: " + username);
        }
    }

    public List<Post> getAllPostsByUser(String username) {
        return postsByUser.getOrDefault(username, new ArrayList<>());
    }

    public List<Post> getMostLikedPosts(int limit) {
        return postsByUser.values().stream()
                .flatMap(List::stream)
                .sorted((p1, p2) -> Integer.compare(p2.likesCount, p1.likesCount))
                .limit(limit)
                .collect(Collectors.toList());
    }

    public long countTotalTextCharacters() {
        return postsByUser.values().stream()
                .flatMap(List::stream)
                .filter(p -> p instanceof TextPost)
                .mapToInt(p -> ((TextPost) p).getContentLength())
                .sum();
    }

    public Map<String, Integer> getUserPostCounts() {
        return postsByUser.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().size()
                ));
    }
}