package lv.jg.lesson2;

import java.util.Random;

public class RandomNumberServiceTest {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int randomNumberOne = randomGenerator.nextInt(100);
        int randomNumberTwo = randomGenerator.nextInt(100);
        int randomNumberThree = randomGenerator.nextInt(100);
        int sum = randomNumberOne + randomNumberTwo + randomNumberThree;
        System.out.println("Random numbers : " + randomNumberOne + " ; " + randomNumberTwo + " ; " + randomNumberThree);
        System.out.println("Their sum : " + sum);

    }
}
