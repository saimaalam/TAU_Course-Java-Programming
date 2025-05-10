import chapter11.Rectangle;
import chapter11.Shape;

public class ShapeTester {
    public static void main(String[] args) {
        Shape rectangle= new Rectangle(5,7);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}
