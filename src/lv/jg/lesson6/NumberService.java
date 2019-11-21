package lv.jg.lesson6;

//lietojam ctrl + alt + l
public class NumberService {

    private int sum; //šis mainīgais nav nepieciešams klasē, bet gan tikai metodē
    private int expendableNumber;
    private int evenNumberCount;//šis mainīgais nav nepieciešams klasē, bet gan tikai metodē

    public int sumInRange(int numberOne, int numberTwo) {
        sum = 0;

        //pie šāda risinājuma notiek sākotnējā parametra vērtības pārrakstīšana - slikts stils
        if (numberOne > numberTwo) {
            expendableNumber = numberOne;
            numberOne = numberTwo;
            numberTwo = expendableNumber;
        }
        // ja šo daļu iznes atsevišķā metodē, tad mēs varam padot tai parametrus jebkurā secībā
        for (int i = numberOne; i <= numberTwo; i++) {
            sum = sum + i;// rakstām īsāk: sum =+ i;
        }
        return sum;

    }

    //skatī iepriekšējos komentārus
    public int getEvenNumberCount(int numberOne, int numberTwo) {
        evenNumberCount = 0;
        if (numberOne > numberTwo) {
            expendableNumber = numberOne;
            numberOne = numberTwo;
            numberTwo = expendableNumber;
        }

        for (int i = numberOne; i <= numberTwo; i++) {
            if (i % 2 == 0) {
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