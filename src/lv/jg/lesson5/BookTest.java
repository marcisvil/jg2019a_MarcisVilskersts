package lv.jg.lesson5;

public class BookTest {

    public void test() {
        Book victim = new Book("George RR Martin", "Winds of winter", 1000);
        Book anotherVictim = new Book("George RR Martin", "Winds of winter", 1000);

        boolean expectedResult = true;
        boolean actualResult = victim.equals(anotherVictim);

        check(expectedResult, actualResult);


    }

    public void check(boolean expectedResult, boolean actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("Test successful");
        } else {
            System.out.println("Test NOT successful");
        }
    }

    public static void main(String[] args) {

        BookTest bookTest = new BookTest();
        bookTest.test();

        Book book = new Book("John", "life", 1);
        System.out.println(book);
    }
}
