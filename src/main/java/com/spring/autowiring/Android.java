package com.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Android implements SmartPhoneType {

    @Override
    public void switchOn(){
        System.out.println("Switching On Your Android");
    }
}
