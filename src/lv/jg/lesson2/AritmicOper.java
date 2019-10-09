package lv.jg.lesson2;

public class AritmicOper {
    public static void main(String[] args) {
        int firstNumber = 16;
        int secondNumber = 7;

        int sum = firstNumber + secondNumber;
        int diference = firstNumber - secondNumber;
        int timed = firstNumber * secondNumber;
        double division = (double) firstNumber / secondNumber;

        System.out.println("Both number sum is " + sum);
        System.out.println("Both number difference is " + diference);
        System.out.println("Both number multiplication is " + timed);
        System.out.println("Number division is " + division);
    }
}
