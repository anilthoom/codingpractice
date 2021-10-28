package com.anil.rest.aop;

import com.anil.rest.model.Product;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProductServiceAspect {
    @AfterReturning(value = "execution(* com.anil.rest.controller.ProductServiceController.*(..))", returning = "product")
    public void afterReturningAdviceProduct(JoinPoint joinPoint, Product product){
        System.out.println(product.getName());
    }
}
