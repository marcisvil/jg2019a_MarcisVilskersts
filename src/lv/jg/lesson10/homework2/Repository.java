package lv.jg.lesson10.homework2;

import java.util.List;

public interface Repository<T> {

    T findById(String id);

    List<T> findAll();

    void save(T entity);

    void delete(String id);

}
