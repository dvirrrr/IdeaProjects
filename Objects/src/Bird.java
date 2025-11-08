public class Bird extends Animal {
    private int nest;

    public Bird(String name, String gender, int energy, int nest) {
        super(name, gender, energy);
        this.nest = nest;
    }

    public int getNest() {
        return nest;
    }

    public void setNest(int nest) {
        this.nest = nest;
    }
}
