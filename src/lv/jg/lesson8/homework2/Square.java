package lv.jg.lesson8.homework2;

//ctrl + alt + l
public class Square extends AbstractShape{

    private String name;
    private double sideLength;

    //"name" bija jābūt konstantei klasē, nav nepieciešams pievienot to ar konstruktoru
    public Square(String name, double sideLength) {
        this.name = name;
        this.sideLength = sideLength;
    }

    @Override
    protected double getPerimeter() {
        return 4*sideLength;
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
        return sideLength*sideLength;
    }
}
