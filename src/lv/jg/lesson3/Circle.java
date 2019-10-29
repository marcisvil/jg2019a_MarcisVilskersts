package lv.jg.lesson3;

public class Circle {

    //klases laukiem jābūt "private"
    double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return radius * radius * 3.14;
    }


}
