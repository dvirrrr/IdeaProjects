public class Rectangle extends Shape {
    private static final double PI = 3.14;
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public double cal_area() {
        return this.width*this.length;
    }

    public double cal_permieter() {
        return 2*(this.width+this.length);
    }
}