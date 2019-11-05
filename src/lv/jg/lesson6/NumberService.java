package lv.jg.lesson6;

public class NumberService {

    private int sum;
    private int expendableNumber;
    private int evenNumberCount;

    public int sumInRange(int numberOne, int numberTwo) {
sum=0;
        if (numberOne>numberTwo){
            expendableNumber = numberOne;
            numberOne = numberTwo;
            numberTwo = expendableNumber;
        }
            for (int i = numberOne; i <= numberTwo; i++) {
                sum = sum + i;
            }
            return sum;

    }

    public int getEvenNumberCount(int numberOne, int numberTwo) {
        evenNumberCount =0;
        if (numberOne>numberTwo){
            expendableNumber = numberOne;
            numberOne = numberTwo;
            numberTwo = expendableNumber;
        }

        for (int i = numberOne; i <= numberTwo; i++) {
            if (i%2==0){
                evenNumberCount++;
            }
        }
        return evenNumberCount;

    }
}


/*

 expendableNumber = numberOne;
            numberOne = numberTwo;
            numberTwo = expendableNumber;
 */