package com.example.springcoreconcepts.prototypeintosingletonbean.basic;

import org.springframework.beans.factory.annotation.Autowired;

public class SingletonBean {
    public SingletonBean() {
        System.out.println("Created SingletonBean");
    }

    @Autowired
    private PrototypeBean prototypeBean;

    public PrototypeBean getPrototypeBean() {
        return prototypeBean;
    }
}
