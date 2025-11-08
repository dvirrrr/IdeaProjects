public class Fish extends Animal {

    private int depth;
    private static int max_depth=800;

    public Fish(String name, String gender, int energy, int depth) {
        super(name, gender, energy);
        this.depth = depth;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public static int getMax_depth() {
        return max_depth;
    }

    public static void setMax_depth(int max_depth) {
        Fish.max_depth = max_depth;
    }
    public String toString() {
        return "Fish{" +
                "depth=" + depth +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", energy=" + energy +
                '}';
    }
    public int fishDepthRange()
    {
        return max_depth - this.depth;
    }
}
