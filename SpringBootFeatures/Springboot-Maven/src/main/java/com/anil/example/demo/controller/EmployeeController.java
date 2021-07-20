package com.anil.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @RequestMapping(value = "/emp-name/{id}")
    public String getEmpName(@PathVariable("id") String id){
        logger.info("Employee request with id : "+id);
        String prefix = "Employee name is ";
        if(id == "1")
            return prefix+"Anil";
        else if(id == "2")
            return prefix+"Shrihan";
        else
            return prefix+"Thoom";
    }

}
