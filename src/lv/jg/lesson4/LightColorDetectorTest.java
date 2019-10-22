package lv.jg.lesson4;

public class LightColorDetectorTest {

    public void test() {
        LightColorDetector victim = new LightColorDetector();

        String expectedResult = "This wavelength defines purple color";
        String actualResult = victim.detect(390);

        check(expectedResult, actualResult, "purple");

        expectedResult = "This wavelength defines blue color";
        actualResult = victim.detect(480);

        check(expectedResult, actualResult, "blue");

        expectedResult = "This wavelength defines green color";
        actualResult = victim.detect(500);

        check(expectedResult, actualResult, "green");

        expectedResult = "This wavelength defines yellow color";
        actualResult = victim.detect(580);

        check(expectedResult, actualResult, "yellow");

        expectedResult = "This wavelength defines orange color";
        actualResult = victim.detect(600);

        check(expectedResult, actualResult, "orange");

        expectedResult = "This wavelength defines red color";
        actualResult = victim.detect(700);

        check(expectedResult, actualResult, "red");


    }


    public void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " test successful");
        } else {
            System.out.println(testName + " test NOT successful");
        }
    }

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();

        lightColorDetectorTest.test();
    }
}
