package lv.jg.lesson8.homework1;

public class PlayWithCars {

    public static void main(String[] args) {

        Bus bus = new Bus("Mercedes", 45);
        System.out.println(bus.toString());

        CasualVehicle casualVehicle = new CasualVehicle("VW", 220);
        System.out.println(casualVehicle.toString());

        Truck truck = new Truck("Volvo", 10);
        System.out.println(truck.toString());

        bus.accelerate();
        casualVehicle.accelerate();
        truck.accelerate();
    }
}
