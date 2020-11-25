package com.anilt.jpa.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "student")
public class Student {
    private Integer student_id;
    private String student_name;
    private Date student_dob;
    private String student_address;
    private Integer student_status;
}
