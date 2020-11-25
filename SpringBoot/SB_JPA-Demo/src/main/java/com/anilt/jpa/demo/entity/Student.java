package com.anilt.jpa.demo.entity;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Student {
    private Integer student_id;
    private String student_name;
    private Date student_dob;
    private String student_address;
    private Integer student_status;
}
