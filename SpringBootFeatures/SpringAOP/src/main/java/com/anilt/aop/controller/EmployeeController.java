package com.anilt.aop.controller;

import com.anilt.aop.model.Employee;
import com.anilt.aop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/add/employee", method = RequestMethod.GET)
    public Employee addEmployee(@RequestParam("empId") String empId, @RequestParam("firstName") String fName, @RequestParam("lastName") String lName){
        return employeeService.createEmployee(empId, fName, lName);
    }
}
