package com.anilt.spring.batch.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private Integer id;
	private String name;
	private String dept;
	private Integer salary;
}
