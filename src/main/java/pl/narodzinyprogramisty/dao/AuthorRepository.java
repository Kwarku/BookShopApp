package pl.narodzinyprogramisty.dao;

import org.springframework.data.repository.CrudRepository;
import pl.narodzinyprogramisty.entity.author.Author;

import java.util.List;

public interface AuthorRepository extends CrudRepository<Author, Long> {
    List<Author> findAll();
}
