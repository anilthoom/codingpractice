package com.anilt.jpa.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "student")
@Getter
@Setter
public class Student {
    @Column(name = "student_id")
    private Integer student_id;

    @Column(name = "student_name")
    private String student_name;
    private Date student_dob;
    private String student_address;
    private Integer student_status;
}
