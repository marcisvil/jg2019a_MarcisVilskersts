package lv.jg.lesson4;

//Ok
public class StockTest {

    public void test() {

        Stock victim = new Stock("Latvenergo", 150.1);

        victim.updatePrice(165.3);
        victim.updatePrice(145.3);
        victim.updatePrice(155.3);

        double expectedResultCurrentPrice = 155.3;
        double actualResultCurrentPrice = victim.getCurrentValue();

        double expectedResultMaxValue = 165.3;
        double actualResultMaxPrice = victim.maxValue;

        double expectedResultMinPrice = 145.3;
        double actualResultMinPrice = victim.minValue;

        checkCurrentPrice(expectedResultCurrentPrice, actualResultCurrentPrice);
        checkMaxPrice(expectedResultMaxValue, actualResultMaxPrice);
        checkMinValue(actualResultMinPrice, expectedResultMinPrice);
    }

    public void checkCurrentPrice(double expectedResultCurrentPrice, double actualResultCurrentPrice) {

        if (expectedResultCurrentPrice == actualResultCurrentPrice) {
            System.out.println("Current value test successful");
        } else
            System.out.println("Current value test NOT successful");
    }

    public void checkMaxPrice(double expectedResultMaxValue, double actualResultMaxPrice) {
        if (expectedResultMaxValue == actualResultMaxPrice) {
            System.out.println("max test successful");
        } else {
            System.out.println("max test NOT successful");
        }
    }

    public void checkMinValue(double expectedResultMinPrice, double actualResultMinPrice) {
        if (expectedResultMinPrice == actualResultMinPrice) {
            System.out.println("min test successful");
        } else {
            System.out.println("min test NOT successful");
        }
    }

    public static void main(String[] args) {
        StockTest stockTest = new StockTest();

        stockTest.test();
    }
}
