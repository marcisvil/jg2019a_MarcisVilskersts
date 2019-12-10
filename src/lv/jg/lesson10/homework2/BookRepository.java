package lv.jg.lesson10.homework2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Ok
public class BookRepository implements Repository<Book> {

    private Map<String, Book> bookRepository = new HashMap<>();

    @Override
    public Book findById(String id) {
        if (!bookRepository.containsKey(id)) {
            throw new ItemNotFoundException("Book not found by id: " + id);
        }
        return bookRepository.get(id);
    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(bookRepository.values());
    }

    @Override
    public void save(Book entity) {
        bookRepository.put(entity.getId(),entity);

    }

    @Override
    public void delete(String id) {
        if (!bookRepository.containsKey(id)) {
            throw new ItemNotFoundException("Book by the ID : " + id + " not found. No action done!");
        }
        bookRepository.remove(id);
    }
}
