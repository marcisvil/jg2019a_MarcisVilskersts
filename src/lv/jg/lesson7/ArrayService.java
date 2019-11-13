package lv.jg.lesson7;

import java.util.Arrays;
import java.util.Random;

//šai klasei nav nepieciešams glabāt stāvokli
//jo aprēķiniem visi parametri ir jāpadod metodēs un atbilstoši jāatgriež rezultāts
public class ArrayService {

    private Random randomGenerator = new Random(); //šis ir vienīgais lauks, kam jāpaliek
    private int length;
    private int[] array;
    private int sum = 0;

    public void create(int length) {
        this.length = length;
        this.array = new int[length];
    }

    //jāpadod aizpildāmais masīvs
    public void fillArrayWithRandomNumbers() {

        for (int i = 0; i < length; i++) {
            array[i] = randomGenerator
                    .ints(0, 100)
                    .findFirst()
                    .getAsInt();
        }
    }

    //jāpadod masīvs kurš ir jāizdrukā
    public void printArrayToConsule() { //typo
        System.out.println(Arrays.toString(array));
    }

    //metode rakstam tik ar mazajiem burtiem
    //metodei jāpadod masīvs
    public int SumInArray() {

        //jābūt lokālajam mainīgajam, nevis klases laukam
        sum = 0;

        for (int sumPart : array) {
            sum += sumPart;
        }
        System.out.println(sum); //šim ir jābūt testa klasē
        return sum;
    }

    //jāpadod masīvs kāparametrs
    public void sortArray() {

        int expendableNumber;
        for (int i = 0; i < array.length; i++) {
//liekas tukšas rindas

            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    expendableNumber = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = expendableNumber;
                }
            }
        }
        //izvadai teksta formātā jābūt testa klasē
        System.out.println(Arrays.toString(array));
    }

    //jāpadod masīvs kāparametrs
    public void swap() {
        int expendableNumber;
        for (int i = 0; i < array.length / 2; i++) {
            expendableNumber = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = expendableNumber;
        }
        //izvadai teksta formātā jābūt testa klasē
        System.out.println(Arrays.toString(array));
    }
}