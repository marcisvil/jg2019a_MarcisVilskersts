package lv.jg.lesson5;

public class TVTest {

    public void testIfTurnedOffTvCantBeSwitched() {

        TV victim = new TV("LG", 5, 12);

        String testName = "Turned off tv";
        int expectedResult = 5;
        victim.turnOff();
        victim.nextChannel();
        int actualResult = victim.getCurrentChannel();

        check(expectedResult, actualResult, testName);

    }

    public void testNextChannel() {

        TV victim = new TV("LG", 5, 12);

        String testName = "Channel increase";
        int expectedResult = 6;
        victim.nextChannel();
        int actualResult = victim.getCurrentChannel();

        check(expectedResult, actualResult, testName);
    }

    public void testVolumeIncrease() {

        TV victim = new TV("LG", 5, 12);

        String testName = "Volume increase";
        int expectedResult = 13;
        victim.increaseVolume();
        int actualResult = victim.getCurrentVolumeLevel();

        check(expectedResult, actualResult, testName);
    }


    public void check(int expectedResult, int actualResult, String testname) {
        if (expectedResult == actualResult) {
            System.out.println(testname + " test successful");
        } else {
            System.out.println(testname + " test NOT successful");
        }
    }

    public static void main(String[] args) {
        TVTest tvTest = new TVTest();

        tvTest.testNextChannel();
        tvTest.testVolumeIncrease();
        tvTest.testIfTurnedOffTvCantBeSwitched();

        TV tv = new TV("SONY", 12, 25);
        TV tv1 = new TV("SONY", 12, 25);

        System.out.println("Is the soString method overwritten? Answer : " + tv.equals(tv1));
        System.out.println(tv);

    }
}
