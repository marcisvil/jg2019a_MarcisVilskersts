package lv.jg.lesson8.homework2;

public class ShapeTest {

    public static void main(String[] args) {

        Rhombus rhombus = new Rhombus("Rhombus", 15.5, 30);
        Triangle triangle = new Triangle("Triangle", 15, 16, 18);
        Square square = new Square("Square", 4);
        Circle circle = new Circle("Circle", 18.4);
        Rectangle rectangle = new Rectangle(12, 45, "Rectangle");

        AbstractShape[] myShapes = {rhombus, triangle, square, circle, rectangle};

        for (AbstractShape shape: myShapes){
            System.out.println(shape);
        }

    }
}
