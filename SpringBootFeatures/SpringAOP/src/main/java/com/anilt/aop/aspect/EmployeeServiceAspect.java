package com.anilt.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import com.anilt.aop.service.EmployeeService;

@Aspect
@Component
public class EmployeeServiceAspect {

    @Before(value = "execution(* EmployeeService.*(..)) and args(empId, fName, lName)")
    public void beforeAdvice(JoinPoint joinPoint, String empId, String fName, String lName){
        System.out.println("Before Method:" + joinPoint.getSignature());
        System.out.println("Creating employee with : first name: "+fName+" and last name: "+lName);
    }
}
