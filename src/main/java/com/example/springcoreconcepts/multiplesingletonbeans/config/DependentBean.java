package com.example.springcoreconcepts.multiplesingletonbeans.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DependentBean {
    public DependentBean(){
        System.out.println("Created DependentBean");
    }

    @Autowired
    @Qualifier("SingletonBeanMultiple2")
    private SingletonBeanMultiple singletonBeanMultiple;

    public SingletonBeanMultiple getSingletonBeanMultiple(){
        return singletonBeanMultiple;
    }
}
