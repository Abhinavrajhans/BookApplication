package com.example.BookApplication.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(* com.example.BookApplication.services.BookService.createBook(..))")
    public void log()
    {
        System.out.println("Logging Aspect");
    }
}
