package com.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class MyPhone {
 //   @Autowired
 //   @Qualifier("android") // this gives priority to android if multiple beans exists
    private SmartPhoneType myPhone;

  //  @Autowired
    // @Qualifier("android") // this gives priority to android if multiple beans exists
    public MyPhone(@Qualifier("iphone") SmartPhoneType myPhone){
        System.out.println("Using Construction Injection");
        this.myPhone = myPhone;
        System.out.println("I use an Iphone");
    }


    @Autowired
    public void setMyPhone(SmartPhoneType myPhone) {
        System.out.println("Using Setter method, creating this object");
        this.myPhone = myPhone;
    }

    public void switchOn(){
        myPhone.switchOn();
    }
}
