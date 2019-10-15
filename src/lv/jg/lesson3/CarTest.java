package lv.jg.lesson3;

public class CarTest {
    public static void main(String[] args) {

        Car car = new Car();

        car.setColor("Black");
        car.setManufacturer("Audi");
        car.setYear(2009);

        System.out.println("My car is " +car.getColor());
        System.out.println("My car is manufactured by "+ car.getManufacturer() + " in year " + car.getYear() );

    }
}
