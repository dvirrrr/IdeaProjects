public class Circle extends Shape {
    private static final double PI = 3.14;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double cal_area() {
        return this.radius*this.radius*PI;
    }

    public double cal_permieter() {
        return 2*PI*this.radius;
    }
}
