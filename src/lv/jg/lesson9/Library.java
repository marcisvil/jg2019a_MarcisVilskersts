package lv.jg.lesson9;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public boolean findBook(Book book){
        return books.contains(book);
    }

    public void findAllBooksByAuthor(String author){
        System.out.println("Books by the author '" + author + "' :");
        for (Book book : books){
            if (book.getAuthor().equals(author)){
                System.out.println(book.getTitle());
            }
        }
    }

    public void printToConsole(){
        books.stream().forEach(book -> System.out.println(book.getAuthor() + " - " + book.getTitle()));
    }

    public static void main(String[] args) {

        Library library = new Library();
        Book book = new Book("john", "good book title");
        Book book1 = new Book("frank", "better book title");
        Book book2 = new Book("frank", "best book title");
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);

        library.printToConsole();
        System.out.println();
        library.findAllBooksByAuthor("frank");

        System.out.println();
        library.removeBook(book1);
        System.out.println(library.findBook(book));
        library.printToConsole();

    }
}
