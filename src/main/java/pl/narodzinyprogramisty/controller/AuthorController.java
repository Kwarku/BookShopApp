package pl.narodzinyprogramisty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.narodzinyprogramisty.entity.author.Author;
import pl.narodzinyprogramisty.service.author.AuthorServiceAPI;

import java.util.List;
import java.util.Optional;

@RestController
public class AuthorController {

    @Autowired
    AuthorServiceAPI service;

    @PostMapping(value = "/add/author")
    public ResponseEntity<List<Author>> addAuthor(@RequestBody Author author) {
        service.add(author);
        return ResponseEntity.status(201).build();
    }

    @GetMapping(value = "/show/authors")
    public List<Author> showAuthors() {
        return service.findAll();
    }

    @GetMapping(value = "/show/authors/id/{id}")
    public Optional<Author> showAuthorById(@PathVariable long id) {
        return service.findById(id);
    }


}
