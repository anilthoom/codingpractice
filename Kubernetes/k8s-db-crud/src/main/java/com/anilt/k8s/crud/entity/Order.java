package com.anilt.k8s.crud.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order {
    @Id
    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "order_title")
    private String orderTitle;

    @Column(name = "order_total")
    private Integer orderTotal;
}
