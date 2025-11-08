import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(4);
        Circle c3 = new Circle(5);
        List<Shape> shapes = new ArrayList<>(List.of(c1, c2, c3)); // ✅ Mutable list

        Rectangle r1 = new Rectangle(4, 8);
        Rectangle r2 = new Rectangle(4, 4);
        Rectangle r3 = new Rectangle(9, 6);
        ShapeUtils.addShapeToList(shapes, r1);
        ShapeUtils.addShapeToList(shapes, r2);
        ShapeUtils.addShapeToList(shapes, r3);

        ShapeUtils.printShapeDetails(shapes);
        System.out.println("---------------");
        ShapeUtils.printListDetails(shapes);
    }
}
