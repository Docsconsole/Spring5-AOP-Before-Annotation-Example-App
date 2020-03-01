package com.docsconsole.tutorials.spring5aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ProductLoggingAspect {
     
    @Before("execution(* com.docsconsole.tutorials.spring5aop.service.ProductManagerServiceImpl.*(..))")
    public void logBeforeAllMethods(JoinPoint joinPoint) 
    {
        System.out.println(":::::::--> ProductLoggingAspect.logBeforeAllMethods() : " + joinPoint.getSignature().getName());
    }
     
    @Before("execution(* com.docsconsole.tutorials.spring5aop.service.ProductManagerServiceImpl.getProductById(..))")
    public void logBeforeGetProduct(JoinPoint joinPoint) 
    {
        System.out.println(":::::::--> ProductLoggingAspect.logBeforeGetProduct() : " + joinPoint.getSignature().getName());
    }
     
    @Before("execution(* com.docsconsole.tutorials.spring5aop.service.ProductManagerServiceImpl.createProduct(..))")
    public void logBeforeCreateProduct(JoinPoint joinPoint) 
    {
        System.out.println(":::::::--> ProductLoggingAspect.logBeforeCreateProduct() : " + joinPoint.getSignature().getName());
    }
}	