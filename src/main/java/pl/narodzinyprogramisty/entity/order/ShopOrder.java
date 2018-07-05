package pl.narodzinyprogramisty.entity.order;


import pl.narodzinyprogramisty.entity.book.Book;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class ShopOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
    private String comment;
    @ManyToMany
    private List<Book> books;
    private Timestamp creteTime;

    public ShopOrder() {
    }

    public ShopOrder(OrderStatus orderStatus, String comment, List<Book> books, Timestamp creteTime) {
        this.orderStatus = orderStatus;
        this.comment = comment;
        this.books = books;
        this.creteTime = creteTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Timestamp getCreteTime() {
        return creteTime;
    }

    public void setCreteTime(Timestamp creteTime) {
        this.creteTime = creteTime;
    }
}
