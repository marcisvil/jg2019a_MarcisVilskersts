package lv.jg.lesson6;

public class CarTest {

    public void test() {
        accelerateTest();
        slowDownTest();
        isDrivingTest();
        canAccelerateTest();
        speedUpTest();
    }

    private void accelerateTest() {
        Car victim = new Car("Audi", "yellow", 15, 10);

        victim.accelerate();

        String testName = "Accelerate";
        int expectedCarSpeed = 11;
        int actualCarSpeed = victim.getCurrentSpeed();

        outputResult(testName, expectedCarSpeed, actualCarSpeed);
    }

    private void slowDownTest() {
        Car victim = new Car("Audi", "yellow", 15, 10);

        victim.slowDown();

        String testName = "Slow down";
        int expectedCarSpeed = 9;
        int actualCarSpeed = victim.getCurrentSpeed();

        outputResult(testName, expectedCarSpeed, actualCarSpeed);
    }

    private void isDrivingTest() {
        Car victim = new Car("Audi", "yellow", 15, 10);

        String testName = "Is driving";
        boolean expectedResult = true;
        boolean actualResult = victim.isDriving();

        outputResultBoolean(testName, expectedResult == actualResult);
    }

    private void canAccelerateTest() {
        Car victim = new Car("Audi", "yellow", 15, 15);

        String testName = "Can accelerate";
        boolean expectedResult = false;
        boolean actualResult = victim.canAccelerate();

        outputResultBoolean(testName, expectedResult == actualResult);
    }

    private void speedUpTest() {
        Car victim = new Car("Audi", "yellow", 15, 10);

        victim.speedUp();

        String testName = "Speedup";
        int expectedCarSpeed = 15;
        int actualCarSpeed = victim.getCurrentSpeed();

        outputResult(testName, expectedCarSpeed, actualCarSpeed);
    }

    private void outputResultBoolean(String testName, boolean b) { //"b" slikts parametra nosaukums
        if (b) {
            System.out.println(testName + " test successful");
        } else {
            System.out.println(testName + " test NOT successful");
        }
    }

    private void outputResult(String testName, int expectedCarSpeed, int actualCarSpeed) {
        outputResultBoolean(testName, expectedCarSpeed == actualCarSpeed);
    }

    public static void main(String[] args) {
        CarTest carTest = new CarTest();

        carTest.test();
    }
}
