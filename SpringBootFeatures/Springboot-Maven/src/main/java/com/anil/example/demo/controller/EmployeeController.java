package com.anil.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @RequestMapping(value = "/emp-name/{id}")
    public String getEmpName(@PathVariable("id") String id){
        String prefix = "Employee name is ";
        if(id == "1")
            return prefix+"Anil";
        else if(id == "2")
            return prefix+"Shrihan";
        else
            return prefix+"Thoom";
    }

}
