public class Mamm extends Animal {
    protected int milk;
    protected static int cal_in_milk = 500;

    public Mamm(String name, String gender, int energy, int milk) {
        super(name, gender, energy);
        this.milk = milk;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public static int getCal_in_milk() {
        return cal_in_milk;
    }

    public static void setCal_in_milk(int cal_in_milk) {
        Mamm.cal_in_milk = cal_in_milk;
    }

    public String toString() {
        return "Mamm{" +
                "milk=" + milk +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", energy=" + energy +
                '}';
    }
    public int calorieCalc()
    {
        return this.milk*cal_in_milk;
    }
}
