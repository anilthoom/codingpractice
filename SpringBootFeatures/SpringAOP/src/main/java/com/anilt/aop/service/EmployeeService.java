package com.anilt.aop.service;

import com.anilt.aop.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    public Employee createEmployee(String empId, String fName, String lName){
        Employee employee = new Employee();
        employee.setEmpId(empId);
        employee.setFirstName(fName);
        employee.setLastName(lName);
        return employee;
    }
}
