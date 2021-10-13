package com.anilt.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {

    @Before(value = "execution(* com.anilt.aop.service.EmployeeService.*(..)) and args(empId, fName, lName)")
    public void beforeAdvice(JoinPoint joinPoint, String empId, String fName, String lName){
        System.out.println("Before Method:" + joinPoint.getSignature());
        System.out.println("Creating employee with : first name: "+fName+" and last name: "+lName);
    }

    @After(value = "execution(* com.anilt.aop.service.EmployeeService.*(..)) and args(empId, fName, lName)")
    public void afterAdvice(JoinPoint joinPoint, String empId, String fName, String lName) {
        System.out.println("After method:" + joinPoint.getSignature());
        System.out.println("Creating Employee with first name - " + fName + ", second name - " + lName + " and id - " + empId);
    }

    @After(value = "execution(* com.anilt.aop.service.EmployeeService.*(..)) and args(empId)")
    public void afterAdvice(JoinPoint joinPoint, String empId) {
        System.out.println("After method:" + joinPoint.getSignature());
        System.out.println("Deleted Employee with id - " + empId);
    }
}
