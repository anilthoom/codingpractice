package com.anilt.aop.controller;

import com.anilt.aop.model.Employee;
import com.anilt.aop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    public Employee addEmployee(@RequestParam("empId") String empId, @RequestParam("firstName") String fName, @RequestParam("lastName") String lName){
        return employeeService.createEmployee(empId, fName, lName);
    }
}
