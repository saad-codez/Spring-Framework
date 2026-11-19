package com.spring.AOP;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    static void main() {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        PaymentSystem payment = context.getBean(PaymentSystem.class);
        payment.pay();
    }
}
