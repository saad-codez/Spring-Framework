package com.spring.config;

import org.springframework.context.annotation.Configuration;


public class Student {
    private String name;

    // constructor
    public Student(String studentName){
       name = studentName;
        System.out.println("Constructor Injection Called!");
        System.out.println("Student Objected Created");

    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("Student name: "+name);
    }



}
