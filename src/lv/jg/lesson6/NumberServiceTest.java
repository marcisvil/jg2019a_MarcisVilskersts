package lv.jg.lesson6;

public class NumberServiceTest {

    public void test() {

        NumberService victim = new NumberService();

        int expectedResultRange = 21;
        int expectedEvenNumberCount = 4;

        int actualResultRange = victim.sumInRange(6, 8);
        int actualResultEvenNumberCount = victim.getEvenNumberCount(14, 7);

        int actualResultRangeExchanged = victim.sumInRange(6, 8);

        checkRangeResult(actualResultRange, expectedResultRange);
        checkEvenNumberResult(actualResultEvenNumberCount,expectedEvenNumberCount);
        checkRangeResultExchanged(actualResultRangeExchanged,expectedResultRange);
    }
    public void checkRangeResultExchanged(int expectedResultRange, int actualResultRangeExchanged) {

        if (expectedResultRange == actualResultRangeExchanged) {
            System.out.println("Exchanged range result test successful");
        } else {
            System.out.println("Exchanged range result test failed");
        }
    }

    public void checkEvenNumberResult(int expectedEvenNumberCount, int actualResultEvenNumberCount) {

        if (expectedEvenNumberCount== actualResultEvenNumberCount) {
            System.out.println("Even number test successful");
        } else {
            System.out.println("Even number test failed");
        }
    }

    public void checkRangeResult(int expectedResultRange, int actualResultRange) {

        if (expectedResultRange == actualResultRange) {
            System.out.println("Range result test successful");
        } else {
            System.out.println("Range result test failed");
        }
    }

    public static void main(String[] args) {
        NumberServiceTest numberServiceTest = new NumberServiceTest();

        numberServiceTest.test();
    }
}
