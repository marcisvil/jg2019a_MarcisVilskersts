package lv.jg.lesson8.homework2;

public class Circle extends AbstractShape {

    private String name;
    private double radius;

    //"name" bija jābūt konstantei klasē, nav nepieciešams pievienot to ar konstruktoru
    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    protected double getPerimeter() {
        return radius*2*Math.PI;
    }

    @Override
    protected double getRadius() {
        return radius;
    }

    @Override
    protected double getEdgeCount() {
        System.out.println("No edges for this shape");
        return 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
