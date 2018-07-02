package pl.narodzinyprogramisty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.narodzinyprogramisty.entity.author.Author;
import pl.narodzinyprogramisty.service.AuthorService;

import java.util.List;

@RestController
public class AuthorController {

    @Autowired
    AuthorService service;

    @PostMapping(value = "/author")
    public ResponseEntity<List<Author>> register(@RequestBody Author author) {
        service.add(author);
        return ResponseEntity.status(201).build();
    }

    @GetMapping(value = "/authors")
    public List<Author> showAuthors() {
        return service.getAll();
    }
}
