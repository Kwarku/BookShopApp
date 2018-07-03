package pl.narodzinyprogramisty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.narodzinyprogramisty.entity.book.Book;
import pl.narodzinyprogramisty.service.book.BookServiceAPI;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookServiceAPI service;

    @GetMapping(value = "/show/books")
    public List<Book> showAll() {
        return service.findAll();
    }

    @GetMapping(value = "/show/books/id/{id}")
    public Optional<Book> showBookById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping(value = "/add/book")
    public ResponseEntity<List<Book>> addBook(@RequestBody Book book) {
        service.add(book);
        return ResponseEntity.status(201).build();
    }

}
