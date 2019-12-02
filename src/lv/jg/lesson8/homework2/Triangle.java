package lv.jg.lesson8.homework2;

//ctrl + alt + l
public class Triangle extends AbstractShape {

    private String name;
    private double sideA;
    private double sideB;
    private double sideC;
    private double halfPerimeter = (sideA+sideB+sideC)/2;

    //"name" bija jābūt konstantei klasē, nav nepieciešams pievienot to ar konstruktoru
    public Triangle(String name, double sideA, double sideB, double sideC) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    protected double getPerimeter() {
        return sideA+sideB+sideC;
    }

    @Override
    protected double getRadius() {
        System.out.println("No radius for this shape");
        return 0;
    }

    @Override
    protected double getEdgeCount() {
        return 3;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return Math.sqrt(halfPerimeter
                * (halfPerimeter - sideA)
                * (halfPerimeter - sideB)
                * (halfPerimeter - sideC));
    }
}
