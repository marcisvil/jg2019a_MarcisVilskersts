package lv.jg.lesson7;

public class Palindrome {

    public boolean isPalindrome(String[] array) {

        int testNumber = 0;

        for (int i = 0; i < array.length / 2; i++) {
            if (array[i].equals(array[array.length - 1 - i])) {
                testNumber++;
            }
        }

        if (testNumber == array.length / 2) {
            System.out.println("Text is palindrome");
            return true;
        } else {
            System.out.println("Text is not palindrome");
            return false;
        }
    }
}

