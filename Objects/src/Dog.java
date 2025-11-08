public class Dog extends Mamm {
    private int bonesToEat;

    public Dog(String name, String gender, int energy, int milk, int bonesToEat) {
        super(name, gender, energy, milk);
        this.bonesToEat = bonesToEat;
    }

    public int getBonesToEat() {
        return bonesToEat;
    }

    public void setBonesToEat(int bonesToEat) {
        this.bonesToEat = bonesToEat;
    }

    public String toString() {
        return "Dog{" +
                "bonesToEat=" + bonesToEat +
                ", milk=" + milk +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", energy=" + energy +
                '}';
    }
    public boolean dogTerms() {
        return (this.bonesToEat > 5 && this.gender == "female");
    }
}
