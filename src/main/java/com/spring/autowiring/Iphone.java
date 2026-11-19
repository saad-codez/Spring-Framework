package com.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // makes this bean the default bean; if multiple exists
public class Iphone implements SmartPhoneType{

    @Override
    public void switchOn(){
        System.out.println("Switching on Your Iphone");
    }

}
