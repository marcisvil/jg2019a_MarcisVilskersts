package lv.jg.lesson8.homework2;

//ctrl + alt + l
public class Rectangle extends AbstractShape {

    private double firstSideLength;
    private double secondSideLength;
    private String name;

    //"name" bija jābūt konstantei klasē, nav nepieciešams pievienot to ar konstruktoru
    public Rectangle(double firstSideLength, double secondSideLength, String name) {
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;
        this.name = name;
    }

    @Override
    protected double getPerimeter() {
        return firstSideLength*2+secondSideLength*2;
    }

    @Override
    protected double getRadius() {
        System.out.println("No radius for this shape");
        return 0;
    }

    @Override
    protected double getEdgeCount() {
        return 4;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return firstSideLength*secondSideLength;
    }
}
