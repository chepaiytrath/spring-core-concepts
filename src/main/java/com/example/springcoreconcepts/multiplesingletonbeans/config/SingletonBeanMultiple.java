package com.example.springcoreconcepts.multiplesingletonbeans.config;

import org.springframework.beans.factory.annotation.Autowired;

public class SingletonBeanMultiple {
    private String name;

    public SingletonBeanMultiple(String name) {
        System.out.println("Created SingletonBeanMultiple with name : " + name);
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
