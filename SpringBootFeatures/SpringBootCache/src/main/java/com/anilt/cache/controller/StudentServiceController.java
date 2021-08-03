package com.anilt.cache.controller;

import com.anilt.cache.model.Student;
import com.anilt.cache.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentServiceController {
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/student/{id}")
    public Student findStudentById(@PathVariable String id){
        System.out.println("Search by Id: "+ id);
        return studentService.getStudentByID(id);
    }
}
