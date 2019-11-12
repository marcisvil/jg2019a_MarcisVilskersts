package lv.jg.lesson7;

import java.util.Arrays;
import java.util.Random;

public class ArrayService {

    private Random randomGenerator = new Random();
    private int length;
    private int[] array;
    private int sum = 0;

    public void create(int length) {
        this.length = length;
        this.array = new int[length];
    }

    public void fillArrayWithRandomNumbers() {

        for (int i = 0; i < length; i++) {
            array[i] = randomGenerator
                    .ints(0, 100)
                    .findFirst()
                    .getAsInt();
        }
    }

    public void printArrayToConsule() {
        System.out.println(Arrays.toString(array));
    }

    public int SumInArray() {

        sum = 0;

        for (int sumPart : array) {
            sum += sumPart;
        }
        System.out.println(sum);
        return sum;
    }

    public void sortArray() {

        int expendableNumber;
        for (int i = 0; i < array.length; i++) {


            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    expendableNumber = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = expendableNumber;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public void swap() {
        int expendableNumber;
        for (int i = 0; i < array.length / 2; i++) {
            expendableNumber = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = expendableNumber;
        }
        System.out.println(Arrays.toString(array));
    }
}