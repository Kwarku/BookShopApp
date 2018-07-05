package pl.narodzinyprogramisty.service.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.narodzinyprogramisty.dao.OrderRepository;
import pl.narodzinyprogramisty.entity.order.OrderStatus;
import pl.narodzinyprogramisty.entity.order.ShopOrder;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ShopOrderService implements ShopOrderServiceAPI {

    @Autowired
    private OrderRepository repository;

    @Override
    public Long add(ShopOrder shopOrder) {
        shopOrder.setOrderStatus(OrderStatus.NEW);
        shopOrder.setCreteTime(Timestamp.valueOf(LocalDateTime.now()));

        repository.save(shopOrder);
        return shopOrder.getId();
    }

    @Override
    public List<ShopOrder> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<ShopOrder> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
