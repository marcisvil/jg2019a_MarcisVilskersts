package lv.jg.lesson6;

public class PowerCalculatorTest {

    public void test(){
        PowerCalculator victim = new PowerCalculator();

        int expectedResult = 8;
        int actualResult = victim.pow(2,3);

        check(expectedResult, actualResult);
    }

    private void check(int expectedResult, int actualResult) {

        if (expectedResult == actualResult){
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    public static void main(String[] args) {

        PowerCalculator powerCalculator = new PowerCalculator();
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();

        powerCalculatorTest.test();

        System.out.println(powerCalculator.pow(2, 2));
    }
}
