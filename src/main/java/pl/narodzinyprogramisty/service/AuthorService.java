package pl.narodzinyprogramisty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.narodzinyprogramisty.entity.author.Author;
import pl.narodzinyprogramisty.dao.AuthorRepository;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository repository;

    public List<Author> getAll() {
        return repository.findAll();
    }

    public Long add(Author author) {
        repository.save(author);
        return author.getId();
    }
}
