package lv.jg.lesson10.homework2;

import java.util.Objects;

//Ok
public class Book {

    private String id;
    private String name;
    private String author;
    private int pageCount;

    public Book(String id, String name, String author, int pageCount) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author, pageCount);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return this.author.equals(book.author)
                && this.id.equals(((Book) object).id)
                && this.name.equals(((Book) object).name)
                && this.pageCount == ((Book) object).pageCount;
    }

    @Override
    public String toString() {
        return "Book ID : " + id
                + " , book's name : " + name
                + " , book's author : " + author
                + " and it is " + pageCount + " pages long." ;
    }
}
