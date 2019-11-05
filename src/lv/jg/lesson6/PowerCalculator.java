package lv.jg.lesson6;

public class PowerCalculator {
    public int pow(int base, int power) {

        int number = 1;

        for (int i = 0; i < power; i++) {
            number = number * base;
        }
        return number;

    }
}
