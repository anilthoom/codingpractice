package com.anilt.k8s.crud.service;

import com.anilt.k8s.crud.entity.Order;

import java.util.List;

public interface OrderService {
    public abstract Order getOrderById(int id);
    public abstract List<Order> getAllOrders();
    public void saveOrUpdate(Order order);
    public void deleteOrderById(int id);
}
