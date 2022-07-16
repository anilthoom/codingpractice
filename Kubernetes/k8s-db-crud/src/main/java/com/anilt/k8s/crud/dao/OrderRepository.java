package com.anilt.k8s.crud.dao;

import com.anilt.k8s.crud.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {
}
