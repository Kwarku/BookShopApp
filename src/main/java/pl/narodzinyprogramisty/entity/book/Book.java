package pl.narodzinyprogramisty.entity.book;

import pl.narodzinyprogramisty.entity.author.Author;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String title;
    private Date releaseDate;

    @ManyToMany
    private List<Author> authors;

    @Enumerated(EnumType.STRING)
    private BookType bookType;

    public Book() {
    }

    public Book(String title, Date releaseDate, List<Author> authors, BookType bookType) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.authors = authors;
        this.bookType = bookType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
