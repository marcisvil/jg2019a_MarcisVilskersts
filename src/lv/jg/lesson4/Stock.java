package lv.jg.lesson4;


public class Stock {

    String companyName;
    double currentValue;
    double minValue;
    double maxValue;

    public Stock(String companyName, double currentValue) {
        this.companyName = companyName;
        this.currentValue = currentValue;
        this.minValue = currentValue;
        this.maxValue = currentValue;
    }


    public String getCompanyName() {
        return this.companyName;
    }

    public double getMinValue() {
        return this.minValue;
    }

    public double getCurrentValue() {
        return this.currentValue;
    }

    public double getMaxValue() {
        return this.maxValue;
    }

    public void updatePrice(double newPrice) {
        this.currentValue = newPrice;
        if (currentValue > maxValue) {
            maxValue = currentValue;
        }
        if (currentValue < minValue) {
            minValue = currentValue;
        }
    }

    public void printInformation() {
        System.out.println("Company name        : " + companyName);
        System.out.println("Current stock value : " + getCurrentValue());
        System.out.println("Today's min value   : " + getMinValue());
        System.out.println("Today's max value   : " + getMaxValue());
    }

    public static void main(String[] args) {
        Stock stock = new Stock("Latvenergo", 150.1);

        stock.updatePrice(140.5);
        stock.updatePrice(160.5);
        stock.updatePrice(155.5);

        stock.printInformation();
    }
}
