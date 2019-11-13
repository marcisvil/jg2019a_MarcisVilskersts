package lv.jg.lesson6;

public class Car {

    private String model;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public Car(String model, String color, int maxSpeed, int currentSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
    }

    public void accelerate() {
        if (currentSpeed < maxSpeed) {
            currentSpeed++;
        }
    }

    public void slowDown() {
        if (currentSpeed > 0) {
            currentSpeed--;
        }
    }

    public boolean isDriving() {
        //izmantojam vienkāršāku pierakstu
        //return currentSpeed > 0
        if (currentSpeed == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean canAccelerate(){
        //izmantojam vienkāršāku pierakstu
        //return currentSpeed == maxSpeed
        if (currentSpeed == maxSpeed){
            return false;
        }else {
            return true;
        }
    }

    public void speedUp(){
        for (int i = currentSpeed; i < maxSpeed; i++) {
            accelerate();
        }
    }
}


