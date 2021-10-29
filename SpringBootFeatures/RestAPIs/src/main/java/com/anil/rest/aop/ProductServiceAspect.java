package com.anil.rest.aop;

import com.anil.rest.model.Product;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProductServiceAspect {

    @Before(value = "execution(* com.anil.rest.controller.ProductServiceController.*(..)) and args(product)")
    public void beforeAdvice(JoinPoint joinPoint, Product product){
        System.out.println("Before Method:" + joinPoint.getSignature());
    }

    @AfterReturning(value = "execution(* com.anil.rest.controller.ProductServiceController.*(..)) and args(product)")
    public void afterReturningAdviceProduct(JoinPoint joinPoint, Product product){
        System.out.println("AOP : "+ product.getName());
    }

    @After(value = "execution(* com.anil.rest.controller.ProductServiceController.*(..)) and args(product)")
    public void afterAdvice(JoinPoint joinPoint, Product product){
        System.out.println("After Method:" + joinPoint.getSignature());
    }
}
