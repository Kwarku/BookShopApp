package pl.narodzinyprogramisty.dao;

import org.springframework.data.repository.CrudRepository;
import pl.narodzinyprogramisty.entity.order.ShopOrder;

import java.util.List;

public interface OrderRepository extends CrudRepository<ShopOrder, Long> {
    List<ShopOrder> findAll();
}
