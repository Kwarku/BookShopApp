package pl.narodzinyprogramisty.entity.user;

import pl.narodzinyprogramisty.entity.order.ShopOrder;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private Date dateOfBirth;
    @Enumerated(EnumType.STRING)
    private UserType userType;
    @OneToMany
    private List<ShopOrder> shopOrderList;

    public User() {
    }

    public User(String name, String lastName, String email, Date dateOfBirth, UserType userType, List<ShopOrder> shopOrderList) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.userType = userType;
        this.shopOrderList = shopOrderList;
    }

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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
