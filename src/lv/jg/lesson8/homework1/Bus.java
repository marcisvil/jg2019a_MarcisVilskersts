package lv.jg.lesson8.homework1;

import java.util.Objects;

//OK
//ctrl + alt + l
public class Bus extends Car {

    private String name;
    private int passengerCount;

    public Bus(String name, int passengerCount) {
        this.name = name;
        this.passengerCount = passengerCount;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        Bus bus = (Bus) object;
        return this.name.equals(bus.name)&&this.passengerCount==bus.passengerCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, passengerCount);
    }

    @Override
    public String toString() {
        return "Bus name is " + name
                + " and it's passenger count is : " + passengerCount;
    }
}
