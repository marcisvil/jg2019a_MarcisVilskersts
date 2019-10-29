package lv.jg.lesson4;

//Ok
public class Stock {

    //klases laukiem ir jābūt "private"
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

//lieka metode - nav izmantota
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

    //šai main metodei nav jābūt šeit
    public static void main(String[] args) {
        Stock stock = new Stock("Latvenergo", 150.1);

        stock.updatePrice(140.5);
        stock.updatePrice(160.5);
        stock.updatePrice(155.5);

        stock.printInformation();
    }
}
