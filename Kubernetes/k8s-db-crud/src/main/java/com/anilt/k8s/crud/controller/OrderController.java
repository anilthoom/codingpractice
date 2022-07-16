package com.anilt.k8s.crud.controller;

import com.anilt.k8s.crud.entity.Order;
import com.anilt.k8s.crud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/orders")
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }

    @GetMapping("/order/{id}")
    public Order getOrderById(@PathVariable("order_id") int id){
        return orderService.getOrderById(id);
    }

    @PostMapping("/order")
    public void createOrder(@RequestBody Order order){
        orderService.saveOrUpdate(order);
    }

    @PutMapping("/order")
    public void updateOrder(@RequestBody Order order){
        orderService.saveOrUpdate(order);
    }
}
