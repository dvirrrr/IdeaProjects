import java.util.List;

public class ShapeUtils {
    private double area;
    private double permieter;


    public static void printShapeDetails(List<? extends Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println("Area = "+shape.cal_area());
            System.out.println("Permieter = "+shape.cal_permieter());
        }

    }

    public static void printListDetails(List<?> list) {
        for (Object shape : list) {
            System.out.println("Class = "+shape.getClass());
        }
    }

    public static void addShapeToList(List<Shape> shapes, Shape newShape) {
        shapes.add(newShape);
    }
}
