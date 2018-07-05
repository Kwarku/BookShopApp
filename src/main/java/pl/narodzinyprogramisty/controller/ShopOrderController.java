package pl.narodzinyprogramisty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.narodzinyprogramisty.entity.order.ShopOrder;
import pl.narodzinyprogramisty.service.order.ShopOrderServiceAPI;

import java.util.List;
import java.util.Optional;

@RestController
public class ShopOrderController {

    @Autowired
    private ShopOrderServiceAPI service;

    @GetMapping("/show/orders")
    public List<ShopOrder> showAllOrders() {
        return service.findAll();
    }

    @GetMapping("/show/orders/id/{id}")
    public Optional<ShopOrder> showOrderById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping("/add/order")
    public ResponseEntity<List<ShopOrder>> addOrder(@RequestBody ShopOrder order) {
        service.add(order);
        return ResponseEntity.status(201).build();
    }
}
