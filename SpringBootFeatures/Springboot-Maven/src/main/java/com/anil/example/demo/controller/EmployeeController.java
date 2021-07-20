package com.anil.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @RequestMapping(value = "/emp-name")
    public String getEmpName(){
        return "My name is anil";
    }

}
