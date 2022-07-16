package com.anilt.k8s.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order {
    @Id
    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "order_title")
    private String orderTitle;

    @Column(name = "order_totoal")
    private Integer orderTotal;
}
