package com.anilt.redis.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Invoice implements Serializable {
    private static final long serialVersionUID = -4439114469726984311L;

    @Id
    @GeneratedValue
    private Integer invId;

    private String invName;
    private Double invAmount;
}
