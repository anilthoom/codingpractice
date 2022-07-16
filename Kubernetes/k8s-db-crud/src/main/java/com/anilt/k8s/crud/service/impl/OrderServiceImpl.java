package com.anilt.k8s.crud.service.impl;

import com.anilt.k8s.crud.dao.OrderRepository;
import com.anilt.k8s.crud.entity.Order;
import com.anilt.k8s.crud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order getOrderById(int id) {
        return orderRepository.findById(id).get();
    }

    @Override
    public List<Order> getAllOrders() {
        List<Order> orders = new ArrayList<Order>();
        orderRepository.findAll().forEach(order -> orders.add(order));
        return orders;
    }

    @Override
    public void saveOrUpdate(Order order) {
        orderRepository.save(order);
    }

    @Override
    public void deleteOrderById(int id) {
        orderRepository.deleteById(id);
    }
}
