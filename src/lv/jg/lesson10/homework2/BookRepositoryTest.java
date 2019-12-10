package lv.jg.lesson10.homework2;

import java.util.List;

//Ok
public class BookRepositoryTest {

    public static void main(String[] args) {
        shouldFailWhenBookNotFoundById();
        shouldFailDeleteBookByIdIfIncorrectId();
        shouldFindAll();
    }

    private static void shouldFailWhenBookNotFoundById() {
        Repository<Book> repository = new BookRepository();
        Book book = new Book("V3", "A Clash Of Kings", "GEorge R.R. Marthin", 600);
        repository.save(book);

        boolean result =false;
        try {
            repository.findById("V4");
        } catch (ItemNotFoundException itEx) {
            result = true;
        }
        System.out.println("Test shouldFailWhenBookNotFoundById: "
                + (result ? "SUCCESS" : "FAIL"));
    }

    private static void shouldFailDeleteBookByIdIfIncorrectId() {
        Repository<Book> repository = new BookRepository();
        Book book = new Book("V3", "A Clash Of Kings", "GEorge R.R. Marthin", 600);
        repository.save(book);

        boolean result = false;
        try {
            repository.delete("V4");
        } catch (ItemNotFoundException itEx) {
            result = true;
        }
        System.out.println("Test shouldFailDeleteBookByIdIfIncorrectId: "
                + (result ? "SUCCESS" : "FAIL"));
    }

    private static void shouldFindAll() {

        Repository<Book> repository = new BookRepository();
        Book book = new Book("V3", "A Clash Of Kings", "GEorge R.R. Marthin", 600);
        repository.save(book);

        List<Book> allBooks = repository.findAll();
        boolean result = allBooks.size() == 1;
        System.out.println("Test shouldFindAll: "
                + (result ? "SUCCESS" : "FAIL"));
    }
}
