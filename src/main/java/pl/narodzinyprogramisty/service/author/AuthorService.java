package pl.narodzinyprogramisty.service.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.narodzinyprogramisty.entity.author.Author;
import pl.narodzinyprogramisty.dao.AuthorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService implements AuthorServiceAPI {

    @Autowired
    private AuthorRepository repository;


    @Override
    public List<Author> findAll() {
        return repository.findAll();
    }

    @Override
    public Long add(Author author) {
        repository.save(author);
        return author.getId();
    }

    @Override
    public Optional<Author> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }


}
