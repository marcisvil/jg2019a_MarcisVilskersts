package lv.jg.lesson8.homework1;

import java.util.Objects;

public class CasualVehicle extends Car{

    private String name;
    private int maxSpeed;

    public CasualVehicle(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        CasualVehicle casualVehicle = (CasualVehicle) object;
        return this.name.equals(casualVehicle.name)&&this.maxSpeed ==casualVehicle.maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, maxSpeed);
    }

    @Override
    public String toString() {
        return "Car name is " + name
                + " and it's MAX SPEED is : " + maxSpeed + " km/h";
    }
}
