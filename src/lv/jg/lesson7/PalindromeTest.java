package lv.jg.lesson7;

//Ok
//Labs tests
public class PalindromeTest {

    public void test(){
        checkPalindrome();
        checkNotPalindrome();
    }

    private void checkNotPalindrome() {
        Palindrome palindrome = new Palindrome();

        String[] array = {"D", "A", "C", "C", "A", "A"};

        boolean actualResult = palindrome.isPalindrome(array);
        boolean expectedResult = false;

        if (actualResult == expectedResult) {
            System.out.println("Test successful");
        } else {
            System.out.println("Test NOT successful");
        }
    }

    private void checkPalindrome() {

        Palindrome palindrome = new Palindrome();

        String[] array = {"A", "A", "C", "C", "A", "A"};

        boolean actualResult = palindrome.isPalindrome(array);
        boolean expectedResult = true;

        if (actualResult == expectedResult) {
            System.out.println("Test successful");
        } else {
            System.out.println("Test NOT successful");
        }
    }

    public static void main(String[] args) {
        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.test();
    }
}
