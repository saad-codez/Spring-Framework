package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // java will add XML configuration on this class
public class AppConfig {

    @Bean // the result of this method will be stored as a bean
    public Student student(){
        Student student = new Student();
        student.setName("Alamgir");
        return student;
    }
}
