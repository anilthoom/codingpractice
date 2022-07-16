package com.anilt.k8s.crud.service.impl;

import com.anilt.k8s.crud.entity.Order;
import com.anilt.k8s.crud.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public Order getOrderById(int id) {
        return null;
    }

    @Override
    public List<Order> getAllOrders() {
        return null;
    }

    @Override
    public void saveOrUpdate(Order order) {

    }

    @Override
    public void deleteOrderById(int id) {

    }
}
