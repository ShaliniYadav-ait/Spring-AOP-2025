package com.tw.SpringAOP.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect {

    @Before("execution(public void com.tw.SpringAOP.dao.AppDAO.addAccount())")
    public void beforeAddAccountAdvice() {
        System.out.println("Advise running...");
    }
}
