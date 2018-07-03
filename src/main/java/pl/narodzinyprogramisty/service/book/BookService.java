package pl.narodzinyprogramisty.service.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.narodzinyprogramisty.dao.BookRepository;
import pl.narodzinyprogramisty.entity.book.Book;

import java.util.List;
import java.util.Optional;

@Service
public class BookService implements BookServiceAPI {

    @Autowired
    private BookRepository repository;

    @Override
    public Long add(Book book) {
        repository.save(book);
        return book.getId();
    }

    @Override
    public List<Book> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Book> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
