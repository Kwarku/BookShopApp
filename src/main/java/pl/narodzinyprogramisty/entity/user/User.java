package pl.narodzinyprogramisty.entity.user;

import pl.narodzinyprogramisty.entity.order.ShopOrder;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String lastName;
    private String email;
    @OneToMany
    private List<ShopOrder> shopOrderList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<ShopOrder> getShopOrderList() {
        return shopOrderList;
    }

    public void setShopOrderList(List<ShopOrder> shopOrderList) {
        this.shopOrderList = shopOrderList;
    }
}
