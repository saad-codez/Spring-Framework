package com.spring.AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PaymentAspect {

    @Before("execution(* com.spring.AOP.PaymentSystem.pay(..))") // this is printed before the pay method
    public void beforePayment(){
        System.out.println("Payment Loading...");
    }

    @After("execution(* com.spring.AOP.PaymentSystem.pay(..))") //this is printed after the pay method
    public void afterPayment(){
        System.out.println("Payment Gate Closed");
    }
}
