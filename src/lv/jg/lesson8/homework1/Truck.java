package lv.jg.lesson8.homework1;

import java.util.Objects;

public class Truck extends Car {

    private String name;
    private int cargoWeight;

    public Truck(String name, int cargoWeight) {
        this.name = name;
        this.cargoWeight = cargoWeight;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        Truck truck = (Truck) object;
        return this.name.equals(truck.name)&&this.cargoWeight==truck.cargoWeight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cargoWeight);
    }

    @Override
    public String toString() {
        return "Truck name is " + name
                + " and it's cargo capacity is : " + cargoWeight + " t";
    }
}
