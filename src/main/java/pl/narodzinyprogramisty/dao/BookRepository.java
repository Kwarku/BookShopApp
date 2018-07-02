package pl.narodzinyprogramisty.dao;

import org.springframework.data.repository.CrudRepository;
import pl.narodzinyprogramisty.entity.book.Book;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findAll();
}
