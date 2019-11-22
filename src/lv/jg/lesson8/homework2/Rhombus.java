package lv.jg.lesson8.homework2;

//ctrl + alt + l
public class Rhombus extends AbstractShape {

    private double sideLength;
    private double narrowAngle;
    private String name;

    //"name" bija jābūt konstantei klasē, nav nepieciešams pievienot to ar konstruktoru
    public Rhombus(String name, double sideLength, double narrowAngle) {
        this.sideLength = sideLength;
        this.narrowAngle = narrowAngle;
        this.name = name;
    }


    @Override
    protected double getPerimeter() {
        return sideLength * 4;
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
        return sideLength*sideLength*Math.sin(narrowAngle*Math.PI/180);
    }
}
