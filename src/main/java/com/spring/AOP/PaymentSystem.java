package com.spring.AOP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentSystem {

    public void pay(){
        System.out.println("Payment Successful!");
    }



}
