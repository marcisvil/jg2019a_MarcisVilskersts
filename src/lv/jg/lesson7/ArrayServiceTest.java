package lv.jg.lesson7;

public class ArrayServiceTest {

    private void test() {
        checkSum();
    }

    private void checkSum() {

// If the position is changed, sum should not change

        ArrayService victim = new ArrayService();

        victim.create(7);
        victim.fillArrayWithRandomNumbers();
        victim.printArrayToConsule();
        int expectedResult = victim.SumInArray();
        victim.swap();
        int otherResult = victim.SumInArray();

        if (expectedResult == otherResult) {
            System.out.println("Test successful");
        } else {
            System.out.println("Test NOT successful");
        }
    }

    public static void main(String[] args) {

        ArrayService arrayService = new ArrayService();

        arrayService.create(6);
        arrayService.fillArrayWithRandomNumbers();
        arrayService.printArrayToConsule();
        arrayService.SumInArray();
        arrayService.sortArray();
        arrayService.swap();

        System.out.println();

        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();

        arrayServiceTest.test();
        System.out.println();


    }
}
