package lv.jg.lesson5;

import java.util.Objects;

public class Book {

    //klases laukiem ir jābūt iekapsulētiem - private
    String author;
    String title;
    int pageCount;

    Book(String author, String title, int pageCount) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return this.author.equals(book.author) && this.title.equals(book.title) && this.pageCount == book.pageCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, pageCount);
    }

    @Override
    public String toString() {
        return "Book's title : " + title
                + ". Book's author : " + author
                + ". Page count : " + pageCount;
    }
}
